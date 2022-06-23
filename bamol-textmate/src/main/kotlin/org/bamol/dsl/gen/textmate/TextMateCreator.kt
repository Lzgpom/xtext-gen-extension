package org.bamol.dsl.gen.textmate

import org.apache.velocity.VelocityContext
import org.apache.velocity.app.VelocityEngine
import org.apache.velocity.runtime.RuntimeConstants
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader
import org.bamol.dsl.gen.textmate.entity.GrammarInfo
import org.bamol.dsl.gen.textmate.util.Utils
import org.eclipse.xtext.Grammar
import java.io.StringWriter

/**
 * Object for creation of TextMate files from Xtext files.
 */
object TextMateCreator {
    private const val TEMPLATE_PATH = "templates/language.json.vm"
    private const val GRAMMAR_TEMPLATE_VARIABLE = "grammar"

    private val ve = VelocityEngine()

    init {
        // Setting the VelocityEngine properties to read the template for the resources' folder.
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath")
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader::class.java.name)
        ve.init()
    }

    /**
     * Creates the TextMate file from the given the Xtext grammar.
     *
     * @param grammar The [Grammar] of the Xtext language.
     * @param fileExtensions The file extensions of the dsl.
     * @return The Textmate file created.
     */
    fun create(grammar: Grammar, fileExtensions: Iterable<String>): String {
        val grammarInfo = GrammarInfo.fromGrammar(grammar, fileExtensions)

        // Preparing the context for the template.
        val context = VelocityContext()
        context.put(GRAMMAR_TEMPLATE_VARIABLE, grammarInfo)

        // Read template.
        val template = ve.getTemplate(TEMPLATE_PATH)

        // Executing the template with the context.
        val writer = StringWriter()
        template.merge(context, writer)

        return Utils.prettifyTextMateResult(writer.toString())
    }
}