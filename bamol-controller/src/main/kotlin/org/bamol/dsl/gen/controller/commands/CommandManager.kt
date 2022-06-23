package org.bamol.dsl.gen.controller.commands

import picocli.CommandLine.Command
import java.util.concurrent.Callable

@Command(name = "manager", subcommands = [CreateExtension::class, CreateXtextProject::class])
class CommandManager : Callable<Int>{

    override fun call(): Int {
        println("Command needed: 'xtext' or 'vscode'")
        return 0
    }
}