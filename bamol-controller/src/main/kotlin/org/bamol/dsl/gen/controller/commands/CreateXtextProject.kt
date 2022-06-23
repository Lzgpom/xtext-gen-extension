package org.bamol.dsl.gen.controller.commands

import org.bamol.dsl.gen.ecore.EPackageInfoLoader
import org.bamol.dsl.gen.xtext.ProjectCreator
import org.bamol.dsl.gen.xtext.entity.XtextConfiguration
import org.eclipse.xtext.xtext.wizard.EPackageInfo
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters
import java.io.File
import java.util.concurrent.Callable

@Command(
    name = "xtext", version = ["xtext 1.0"],
    description = ["Creates an xtext project given its configuration"]
)
class CreateXtextProject : Callable<Int> {

    @Parameters(index = "0", description = ["The genmodel file with the metamodel."])
    lateinit var genmodel: File

    @Parameters(index = "1", description = ["The default package."])
    lateinit var packageName: String

    @Parameters(index = "2", description = ["The root element."])
    lateinit var rootElement: String

    @Option(
        names = ["-o", "--outDir"],
        description = ["The path to output the xtext project created.", "By default is the current path."]
    )
    var outDir: File = File(".")

    @Parameters(
        index = "3",
        description = ["The language name.", "The last name of the language as to be capitalized.", "Example: org.bamol.Dsl"]
    )
    lateinit var languageName: String

    @Parameters(
        index = "4",
        description = ["The base name of the language.", "Example: statemachine"]
    )
    lateinit var baseName: String

    @Parameters(index = "5", split = ",", description = ["The file extensions of the dsl."])
    lateinit var extensions: List<String>

    override fun call(): Int {
        val packageInfos = EPackageInfoLoader.createEPackageInfosFromGenModel(genmodel)
        val defaultPackage: EPackageInfo =
            EPackageInfoLoader.findEPackageInfoByName(packageInfos, packageName)!!
        val rootElement = EPackageInfoLoader.findEClassByName(defaultPackage, rootElement)!!

        val config = XtextConfiguration(outDir, languageName, baseName, extensions,
            packageInfos, defaultPackage, rootElement)

        ProjectCreator.create(config)
        println("Xtext project created successfully.")
        return 0
    }

}