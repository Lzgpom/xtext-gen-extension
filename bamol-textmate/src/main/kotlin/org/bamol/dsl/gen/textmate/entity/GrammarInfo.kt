package org.bamol.dsl.gen.textmate.entity

import com.google.common.collect.Lists
import org.bamol.dsl.gen.textmate.util.Utils
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessExtensions
import org.eclipse.xtext.xtext.generator.parser.antlr.KeywordHelper

/**
 * The grammar information needed to create a Textmate file for a dsl
 *
 * @param name The name of the dsl.
 * @param fileExtensions The file extension of the dsl.
 * @param keywords The list of [Keyword] in the dsl.
 * @param operations TODO what to do with this.
 * @param regularExpressions TODO what to do with this
 * @param comment The information regarding comments in the dsl.
 */
data class GrammarInfo(
    val name: String,
    val fileExtensions: Iterable<String>,
    val keywords: MutableList<Keyword>,
    val operations: MutableList<String>,
    val regularExpressions: MutableList<String>,
    val comment: Comment
) {

    companion object {

        /**
         * Creates an instance of [GrammarInfo] from a [Grammar]
         *
         * @return the instance created.
         */
        fun fromGrammar(grammar: Grammar, fileExtensions: Iterable<String>): GrammarInfo {
            val name = nameFromGrammar(grammar)
            val keywords = keywordsFromGrammar(grammar)
            val operations = operationsFromGrammar(grammar)
            val comment = Comment.fromGrammar(grammar)

            return GrammarInfo(
                name,
                fileExtensions,
                keywords,
                operations,
                Lists.newArrayList(),
                comment
            )
        }

        /**
         * Obtains the name from the given [Grammar].
         *
         * @param grammar The given [Grammar]
         * @return The name obtained.
         */
        private fun nameFromGrammar(grammar: Grammar): String {
            return grammar.name.split(".").last().lowercase()
        }

        /**
         * Obtains the list of [Keyword] from the given [Grammar].
         *
         * @param grammar The given [Grammar]
         * @return The list of [Keyword] obtained.
         */
        private fun keywordsFromGrammar(grammar: Grammar): MutableList<Keyword> {
            val keywords: MutableList<Keyword> = Lists.newArrayList()
            val keywordHelper = KeywordHelper(grammar, false, GrammarAccessExtensions())
            for (keyword in keywordHelper.allKeywords) {
                val escapedKeyword = Utils.escapeMetaCharacters(keyword)
                if (KeywordType.SUPPORT_CLASS.regex.matches(keyword)) {
                    keywords.add(Keyword("\\\\b$escapedKeyword\\\\b", KeywordType.SUPPORT_CLASS))
                } else if (KeywordType.CONSTANT_LANGUAGE.regex.matches(keyword)) {
                    keywords.add(Keyword(escapedKeyword, KeywordType.CONSTANT_LANGUAGE))
                }
            }

            return keywords
        }

        /**
         * TODO complete this
         */
        private fun operationsFromGrammar(grammar: Grammar): MutableList<String> {
            return Lists.newArrayList()
        }
    }


}