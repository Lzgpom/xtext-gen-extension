package org.bamol.dsl.gen.textmate.util

import com.google.gson.GsonBuilder
import com.google.gson.JsonParser

/**
 * Random utils object.
 */
object Utils {

    /**
     * Escapes the all meta characters in the given string.
     *
     * @param inputString The string to escape.
     * @return The string escaped.
     */
    fun escapeMetaCharacters(inputString: String): String {
        var out = inputString
        val metaCharacters = arrayOf(
            "\\",
            "^",
            "$",
            "{",
            "}",
            "[",
            "]",
            "(",
            ")",
            ".",
            "*",
            "+",
            "?",
            "|",
            "<",
            ">",
            "-",
            "&",
            "%"
        )
        for (i in metaCharacters.indices) {
            if (out.contains(metaCharacters[i])) {
                out = inputString.replace(metaCharacters[i], "\\\\${metaCharacters[i]}")
            }
        }
        return out
    }

    /**
     * Prettify a TextMate file (aka a json file).
     *
     * @param input The input json.
     * @return The prettified TextMate file.
     */
    fun prettifyTextMateResult(input: String): String {
        val gson = GsonBuilder().setPrettyPrinting().create()
        val element = JsonParser.parseString(input)
        return gson.toJson(element)
    }
}