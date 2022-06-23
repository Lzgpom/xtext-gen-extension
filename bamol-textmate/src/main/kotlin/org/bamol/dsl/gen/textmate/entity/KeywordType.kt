package org.bamol.dsl.gen.textmate.entity

/**
 * The enum with the keyword types the value for the TextMate
 *
 * @param value The value used for the TextMate
 * @param regex The regex of the type of the keyword
 */
enum class KeywordType (val value: String, val regex: Regex) {
    SUPPORT_CLASS("support.class", Regex("^\\w*\$")),
    CONSTANT_LANGUAGE("constant.language", Regex("[^()]+"))
}