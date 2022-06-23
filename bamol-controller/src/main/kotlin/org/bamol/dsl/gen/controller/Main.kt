package org.bamol.dsl.gen.controller

import org.bamol.dsl.gen.controller.commands.CommandManager
import picocli.CommandLine
import kotlin.system.exitProcess

object Main {
    @JvmStatic fun main(args: Array<String>) {
        exitProcess(CommandLine(CommandManager()).execute(*args))
    }
}
