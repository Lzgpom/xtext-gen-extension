package org.bamol.dsl.gen.textmate.entity

import org.bamol.dsl.gen.textmate.util.Utils
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.Group
import org.eclipse.xtext.UntilToken

/**
 * The information regarding comments in the dsl.
 *
 * @param line The literal for a single line comment.
 * @param blockStart The literal for the start of a multiple line comment.
 * @param blockEnd The literal for the end of a multiple line comment.
 */
data class Comment(val line: String?, val blockStart: String?, val blockEnd: String?) {
    companion object {

        private const val SINGLE_LINE_COMMENT_TERMINAL_RULE = "SL_COMMENT"
        private const val MULTI_LINE_COMMENT_TERMINAL_RULE = "ML_COMMENT"

        /**
         * Creates an instance of [Comment] from a [Grammar]
         *
         * @return the instance created.
         */
        fun fromGrammar(grammar: Grammar): Comment {
            var line: String? = null
            var blockStart: String? = null
            var blockEnd: String? = null

            val rules = GrammarUtil.allTerminalRules(grammar)
            for (rule in rules) {
                if (rule.name == SINGLE_LINE_COMMENT_TERMINAL_RULE) {
                    line = Utils.escapeMetaCharacters(
                        ((rule.eContents()[1] as Group).elements[0] as org.eclipse.xtext.Keyword).value)

                } else if (rule.name == MULTI_LINE_COMMENT_TERMINAL_RULE) {
                    val group = (rule.eContents()[1] as Group)
                    blockStart = Utils.escapeMetaCharacters(
                        (group.elements[0] as org.eclipse.xtext.Keyword).value)
                    blockEnd = Utils.escapeMetaCharacters(
                        (((group.elements[1] as UntilToken).terminal) as org.eclipse.xtext.Keyword).value)
                }
            }

            return Comment(line, blockStart, blockEnd)
        }
    }
}