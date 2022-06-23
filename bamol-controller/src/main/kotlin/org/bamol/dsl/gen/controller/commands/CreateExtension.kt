package org.bamol.dsl.gen.controller.commands

import org.bamol.dsl.gen.xtext.util.GrammarLoader
import org.bamol.dsl.gen.vscode.ExtensionProjectGenerator
import picocli.CommandLine.*
import java.io.File
import java.util.concurrent.Callable

@Command(
    name = "vscode", version = ["vscode 1.0"],
    description = ["Creates an vscode extension for a xtext language."]
)
class CreateExtension : Callable<Int> {

    @Parameters(
        index = "0",
        description = ["The grammar file of the language.", "This is a .xtext file."]
    )
    lateinit var grammar: File

    @Parameters(index = "1", description = ["The language server jar file created from xtext."])
    lateinit var languageServer: File

    @Parameters(index = "2", split = ",", description = ["The file extensions of the dsl."])
    lateinit var extensions: List<String>

    @Option(
        names = ["-o", "--outDir"],
        description = ["The path to output the xtext project created.", "By default it is a extension folder in the current path."]
    )
    var outDir: String = "./extension"

    override fun call(): Int {
        val grammar = GrammarLoader.load(grammar)
        ExtensionProjectGenerator(grammar, extensions, outDir, languageServer).generate()
        println("Extension generated successfully.")
        return 0
    }

}