package org.bamol.dsl.gen.textmate.entity

/**
 * The keywords used by [GrammarInfo].
 *
 * @param match The regex of the keyword
 * @param type The [KeywordType] of the type.
 */
data class Keyword (val match: String, val type: KeywordType)