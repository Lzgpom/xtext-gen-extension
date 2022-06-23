package org.bamol.dsl.gen.vscode

import org.apache.velocity.VelocityContext
import org.apache.velocity.app.VelocityEngine
import org.apache.velocity.runtime.RuntimeConstants
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader
import org.bamol.dsl.gen.textmate.TextMateCreator
import org.bamol.dsl.gen.textmate.util.Utils
import org.eclipse.xtext.Grammar
import java.io.File
import java.io.FileWriter
import java.io.StringWriter
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.Path

class ExtensionProjectGenerator(
    private val grammar: Grammar,
    private val fileExtensions: Iterable<String>,
    private val path: String,
    private val languageServerFile: File
) {

    /**
     * Generates the Visual Studio Code extension project.
     */
    fun generate() {
        // Creates the folders to the vscode extension project.
        Files.createDirectories(Path(path))
        Files.createDirectories(Path(path, SYNTAXES_FOLDER_PATH))
        Files.createDirectories(Path(path, SRC_FOLDER_PATH))
        Files.createDirectories(Path(path, BIN_FOLDER_PATH))
        Files.createDirectories(Path(path, DOT_VSCODE_FOLDER_PATH))

        // Variables used through multiple generator methods.
        val languageName = getLanguageName()
        val languageId = languageName.lowercase()

        // Copy the language server binary to bin folder
        languageServerFile.copyTo(
            Path(path, BIN_FOLDER_PATH, languageServerFile.name).toFile(),
            overwrite = true
        )

        // Run all the file generators
        generateIgnoreFiles()
        generatorPackageJson(languageName, languageId)
        generatorConfigurationJson()
        generateTextMateLanguage(languageId)
        generateExtensionJs(languageName, languageId)
        generateLaunchJson()
    }

    /**
     * Generates the ".vscodeignore" file.
     */
    private fun generateIgnoreFiles() {
        val context = VelocityContext()
        writeFileWithTemplate(VSCODE_IGNORE_TEMPLATE, context, Path(path, VSCODE_IGNORE_PATH))
    }

    /**
     * Generates the "package.json" file.
     * @param languageName The name of the language.
     * @param languageId The id of the language.
     */
    private fun generatorPackageJson(languageName: String, languageId: String) {
        val context = VelocityContext()
        context.put("name", languageName)
        context.put("id", languageId)
        context.put("extensions", fileExtensions)

        writeJsonFile(PACKAGE_JSON_TEMPLATE, context, Path(path, PACKAGE_JSON_PATH))
    }

    /**
     * Generates the "tmLanguage.json" file using the [TextMateCreator].
     * @param languageId The id of the language.
     */
    private fun generateTextMateLanguage(languageId: String) {
        val content = TextMateCreator.create(grammar, fileExtensions)
        File(Path(path, SYNTAXES_FOLDER_PATH, SYNTAX_FILE_PATH.format(languageId)).toUri())
            .writeText(content)
    }

    /**
     * Generates the "language-configuration.json" file.
     */
    private fun generatorConfigurationJson() {
        val context = VelocityContext()
        writeJsonFile(
            LANGUAGE_CONFIGURATION_TEMPLATE,
            context,
            Path(path, LANGUAGE_CONFIGURATION_PATH)
        )
    }

    /**
     * Generates the "extension.js" file.
     * @param languageName The name of the language.
     * @param languageId The id of the language.
     */
    private fun generateExtensionJs(languageName: String, languageId: String) {
        val context = VelocityContext()
        context.put("extensions", fileExtensions + languageId)
        context.put("name", languageName)
        context.put("serverFile", languageServerFile.name)

        writeFileWithTemplate(
            EXTENSION_JS_TEMPLATE,
            context,
            Path(path, SRC_FOLDER_PATH, EXTENSION_JS_PATH)
        )
    }

    /**
     * Generates the "launch.json" file.
     */
    private fun generateLaunchJson() {
        val context = VelocityContext()
        writeFileWithTemplate(
            LAUNCH_JSON_TEMPLATE,
            context,
            Path(path, DOT_VSCODE_FOLDER_PATH, LAUNCH_JSON_PATH)
        )
    }

    /**
     * Writes a file in the given path with a template.
     * @param template The template location.
     * @param context The [VelocityContext] for the template execution.
     * @param path The path of the file to write.
     */
    private fun writeFileWithTemplate(template: String, context: VelocityContext, path: Path) {
        val writer = FileWriter(File(path.toUri()))

        ve.mergeTemplate(template, ENCODING, context, writer)
        writer.flush()
        writer.close()
    }

    /**
     * Writes a json file prettified in the given path.
     * @param template The template location.
     * @param context The [VelocityContext] for the template execution.
     * @param path The path of the file to write.
     */
    private fun writeJsonFile(template: String, context: VelocityContext, path: Path) {
        val writer = StringWriter()
        ve.mergeTemplate(template, ENCODING, context, writer)

        // Writing json prettified to the file.
        File(path.toUri()).writeText(Utils.prettifyTextMateResult(writer.toString()))
    }

    /**
     * Obtains the language name from the grammar.
     */
    private fun getLanguageName(): String {
        return this.grammar.name.split(".").last()
    }

    companion object {
        private const val ENCODING = "UTF-8"

        // Folders
        private const val SYNTAXES_FOLDER_PATH = "syntaxes"
        private const val SRC_FOLDER_PATH = "src"
        private const val BIN_FOLDER_PATH = "bin"
        private const val DOT_VSCODE_FOLDER_PATH = ".vscode"

        private const val VSCODE_IGNORE_PATH = ".vscodeignore"
        private const val VSCODE_IGNORE_TEMPLATE = "templates/.vscodeignore.vm"

        private const val PACKAGE_JSON_PATH = "package.json"
        private const val PACKAGE_JSON_TEMPLATE = "templates/package.json.vm"

        private const val LANGUAGE_CONFIGURATION_PATH = "language-configuration.json"
        private const val LANGUAGE_CONFIGURATION_TEMPLATE =
            "templates/language-configuration.json.vm"

        private const val SYNTAX_FILE_PATH = "%s.tmLanguage.json"

        private const val EXTENSION_JS_PATH = "extension.js"
        private const val EXTENSION_JS_TEMPLATE = "templates/src/extension.js.vm"

        private const val LAUNCH_JSON_PATH = "launch.json"
        private const val LAUNCH_JSON_TEMPLATE = "templates/.vscode/launch.json.vm"

        private val ve = VelocityEngine()

        init {
            // Setting the VelocityEngine properties to read the template for the resources' folder.
            ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath")
            ve.setProperty(
                "classpath.resource.loader.class",
                ClasspathResourceLoader::class.java.name
            )
            ve.init()
        }
    }
}