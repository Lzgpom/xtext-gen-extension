package org.eclipse.xtext.example.arithmetics.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.example.arithmetics.services.ArithmeticsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArithmeticsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'import'", "'def'", "':'", "';'", "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NUMBER=5;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalArithmeticsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArithmeticsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArithmeticsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArithmetics.g"; }


    	private ArithmeticsGrammarAccess grammarAccess;

    	public void setGrammarAccess(ArithmeticsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModule"
    // InternalArithmetics.g:53:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalArithmetics.g:54:1: ( ruleModule EOF )
            // InternalArithmetics.g:55:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalArithmetics.g:62:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:66:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalArithmetics.g:67:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalArithmetics.g:67:2: ( ( rule__Module__Group__0 ) )
            // InternalArithmetics.g:68:3: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalArithmetics.g:69:3: ( rule__Module__Group__0 )
            // InternalArithmetics.g:69:4: rule__Module__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleImport"
    // InternalArithmetics.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalArithmetics.g:79:1: ( ruleImport EOF )
            // InternalArithmetics.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalArithmetics.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalArithmetics.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalArithmetics.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalArithmetics.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalArithmetics.g:94:3: ( rule__Import__Group__0 )
            // InternalArithmetics.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleStatement"
    // InternalArithmetics.g:103:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalArithmetics.g:104:1: ( ruleStatement EOF )
            // InternalArithmetics.g:105:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalArithmetics.g:112:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:116:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalArithmetics.g:117:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalArithmetics.g:117:2: ( ( rule__Statement__Alternatives ) )
            // InternalArithmetics.g:118:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalArithmetics.g:119:3: ( rule__Statement__Alternatives )
            // InternalArithmetics.g:119:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDefinition"
    // InternalArithmetics.g:128:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalArithmetics.g:129:1: ( ruleDefinition EOF )
            // InternalArithmetics.g:130:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalArithmetics.g:137:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:141:2: ( ( ( rule__Definition__Group__0 ) ) )
            // InternalArithmetics.g:142:2: ( ( rule__Definition__Group__0 ) )
            {
            // InternalArithmetics.g:142:2: ( ( rule__Definition__Group__0 ) )
            // InternalArithmetics.g:143:3: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // InternalArithmetics.g:144:3: ( rule__Definition__Group__0 )
            // InternalArithmetics.g:144:4: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleDeclaredParameter"
    // InternalArithmetics.g:153:1: entryRuleDeclaredParameter : ruleDeclaredParameter EOF ;
    public final void entryRuleDeclaredParameter() throws RecognitionException {
        try {
            // InternalArithmetics.g:154:1: ( ruleDeclaredParameter EOF )
            // InternalArithmetics.g:155:1: ruleDeclaredParameter EOF
            {
             before(grammarAccess.getDeclaredParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaredParameter();

            state._fsp--;

             after(grammarAccess.getDeclaredParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // InternalArithmetics.g:162:1: ruleDeclaredParameter : ( ( rule__DeclaredParameter__NameAssignment ) ) ;
    public final void ruleDeclaredParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:166:2: ( ( ( rule__DeclaredParameter__NameAssignment ) ) )
            // InternalArithmetics.g:167:2: ( ( rule__DeclaredParameter__NameAssignment ) )
            {
            // InternalArithmetics.g:167:2: ( ( rule__DeclaredParameter__NameAssignment ) )
            // InternalArithmetics.g:168:3: ( rule__DeclaredParameter__NameAssignment )
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameAssignment()); 
            // InternalArithmetics.g:169:3: ( rule__DeclaredParameter__NameAssignment )
            // InternalArithmetics.g:169:4: rule__DeclaredParameter__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredParameter__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredParameterAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "entryRuleEvaluation"
    // InternalArithmetics.g:178:1: entryRuleEvaluation : ruleEvaluation EOF ;
    public final void entryRuleEvaluation() throws RecognitionException {
        try {
            // InternalArithmetics.g:179:1: ( ruleEvaluation EOF )
            // InternalArithmetics.g:180:1: ruleEvaluation EOF
            {
             before(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getEvaluationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // InternalArithmetics.g:187:1: ruleEvaluation : ( ( rule__Evaluation__Group__0 ) ) ;
    public final void ruleEvaluation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:191:2: ( ( ( rule__Evaluation__Group__0 ) ) )
            // InternalArithmetics.g:192:2: ( ( rule__Evaluation__Group__0 ) )
            {
            // InternalArithmetics.g:192:2: ( ( rule__Evaluation__Group__0 ) )
            // InternalArithmetics.g:193:3: ( rule__Evaluation__Group__0 )
            {
             before(grammarAccess.getEvaluationAccess().getGroup()); 
            // InternalArithmetics.g:194:3: ( rule__Evaluation__Group__0 )
            // InternalArithmetics.g:194:4: rule__Evaluation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleExpression"
    // InternalArithmetics.g:203:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalArithmetics.g:204:1: ( ruleExpression EOF )
            // InternalArithmetics.g:205:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalArithmetics.g:212:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:216:2: ( ( ruleAddition ) )
            // InternalArithmetics.g:217:2: ( ruleAddition )
            {
            // InternalArithmetics.g:217:2: ( ruleAddition )
            // InternalArithmetics.g:218:3: ruleAddition
            {
             before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalArithmetics.g:228:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalArithmetics.g:229:1: ( ruleAddition EOF )
            // InternalArithmetics.g:230:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalArithmetics.g:237:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:241:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalArithmetics.g:242:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalArithmetics.g:242:2: ( ( rule__Addition__Group__0 ) )
            // InternalArithmetics.g:243:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalArithmetics.g:244:3: ( rule__Addition__Group__0 )
            // InternalArithmetics.g:244:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalArithmetics.g:253:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalArithmetics.g:254:1: ( ruleMultiplication EOF )
            // InternalArithmetics.g:255:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalArithmetics.g:262:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:266:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalArithmetics.g:267:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalArithmetics.g:267:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalArithmetics.g:268:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalArithmetics.g:269:3: ( rule__Multiplication__Group__0 )
            // InternalArithmetics.g:269:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalArithmetics.g:278:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalArithmetics.g:279:1: ( rulePrimaryExpression EOF )
            // InternalArithmetics.g:280:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalArithmetics.g:287:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:291:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalArithmetics.g:292:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalArithmetics.g:292:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalArithmetics.g:293:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalArithmetics.g:294:3: ( rule__PrimaryExpression__Alternatives )
            // InternalArithmetics.g:294:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalArithmetics.g:302:1: rule__Statement__Alternatives : ( ( ruleDefinition ) | ( ruleEvaluation ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:306:1: ( ( ruleDefinition ) | ( ruleEvaluation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NUMBER)||LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalArithmetics.g:307:2: ( ruleDefinition )
                    {
                    // InternalArithmetics.g:307:2: ( ruleDefinition )
                    // InternalArithmetics.g:308:3: ruleDefinition
                    {
                     before(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArithmetics.g:313:2: ( ruleEvaluation )
                    {
                    // InternalArithmetics.g:313:2: ( ruleEvaluation )
                    // InternalArithmetics.g:314:3: ruleEvaluation
                    {
                     before(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvaluation();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // InternalArithmetics.g:323:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:327:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalArithmetics.g:328:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalArithmetics.g:328:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalArithmetics.g:329:3: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // InternalArithmetics.g:330:3: ( rule__Addition__Group_1_0_0__0 )
                    // InternalArithmetics.g:330:4: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArithmetics.g:334:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalArithmetics.g:334:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalArithmetics.g:335:3: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // InternalArithmetics.g:336:3: ( rule__Addition__Group_1_0_1__0 )
                    // InternalArithmetics.g:336:4: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // InternalArithmetics.g:344:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:348:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArithmetics.g:349:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalArithmetics.g:349:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalArithmetics.g:350:3: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // InternalArithmetics.g:351:3: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalArithmetics.g:351:4: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArithmetics.g:355:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalArithmetics.g:355:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalArithmetics.g:356:3: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // InternalArithmetics.g:357:3: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalArithmetics.g:357:4: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalArithmetics.g:365:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:369:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalArithmetics.g:370:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalArithmetics.g:370:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalArithmetics.g:371:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalArithmetics.g:372:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalArithmetics.g:372:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArithmetics.g:376:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalArithmetics.g:376:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalArithmetics.g:377:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalArithmetics.g:378:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalArithmetics.g:378:4: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArithmetics.g:382:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalArithmetics.g:382:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalArithmetics.g:383:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalArithmetics.g:384:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalArithmetics.g:384:4: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // InternalArithmetics.g:392:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:396:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalArithmetics.g:397:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // InternalArithmetics.g:404:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:408:1: ( ( 'module' ) )
            // InternalArithmetics.g:409:1: ( 'module' )
            {
            // InternalArithmetics.g:409:1: ( 'module' )
            // InternalArithmetics.g:410:2: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // InternalArithmetics.g:419:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:423:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalArithmetics.g:424:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // InternalArithmetics.g:431:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:435:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalArithmetics.g:436:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalArithmetics.g:436:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalArithmetics.g:437:2: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // InternalArithmetics.g:438:2: ( rule__Module__NameAssignment_1 )
            // InternalArithmetics.g:438:3: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // InternalArithmetics.g:446:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:450:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalArithmetics.g:451:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // InternalArithmetics.g:458:1: rule__Module__Group__2__Impl : ( ( rule__Module__ImportsAssignment_2 )* ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:462:1: ( ( ( rule__Module__ImportsAssignment_2 )* ) )
            // InternalArithmetics.g:463:1: ( ( rule__Module__ImportsAssignment_2 )* )
            {
            // InternalArithmetics.g:463:1: ( ( rule__Module__ImportsAssignment_2 )* )
            // InternalArithmetics.g:464:2: ( rule__Module__ImportsAssignment_2 )*
            {
             before(grammarAccess.getModuleAccess().getImportsAssignment_2()); 
            // InternalArithmetics.g:465:2: ( rule__Module__ImportsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArithmetics.g:465:3: rule__Module__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Module__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // InternalArithmetics.g:473:1: rule__Module__Group__3 : rule__Module__Group__3__Impl ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:477:1: ( rule__Module__Group__3__Impl )
            // InternalArithmetics.g:478:2: rule__Module__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // InternalArithmetics.g:484:1: rule__Module__Group__3__Impl : ( ( rule__Module__StatementsAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:488:1: ( ( ( rule__Module__StatementsAssignment_3 )* ) )
            // InternalArithmetics.g:489:1: ( ( rule__Module__StatementsAssignment_3 )* )
            {
            // InternalArithmetics.g:489:1: ( ( rule__Module__StatementsAssignment_3 )* )
            // InternalArithmetics.g:490:2: ( rule__Module__StatementsAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getStatementsAssignment_3()); 
            // InternalArithmetics.g:491:2: ( rule__Module__StatementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_NUMBER)||LA6_0==14||LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArithmetics.g:491:3: rule__Module__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Module__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalArithmetics.g:500:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:504:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalArithmetics.g:505:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalArithmetics.g:512:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:516:1: ( ( 'import' ) )
            // InternalArithmetics.g:517:1: ( 'import' )
            {
            // InternalArithmetics.g:517:1: ( 'import' )
            // InternalArithmetics.g:518:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalArithmetics.g:527:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:531:1: ( rule__Import__Group__1__Impl )
            // InternalArithmetics.g:532:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalArithmetics.g:538:1: rule__Import__Group__1__Impl : ( ( rule__Import__ModuleAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:542:1: ( ( ( rule__Import__ModuleAssignment_1 ) ) )
            // InternalArithmetics.g:543:1: ( ( rule__Import__ModuleAssignment_1 ) )
            {
            // InternalArithmetics.g:543:1: ( ( rule__Import__ModuleAssignment_1 ) )
            // InternalArithmetics.g:544:2: ( rule__Import__ModuleAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getModuleAssignment_1()); 
            // InternalArithmetics.g:545:2: ( rule__Import__ModuleAssignment_1 )
            // InternalArithmetics.g:545:3: rule__Import__ModuleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getModuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // InternalArithmetics.g:554:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:558:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalArithmetics.g:559:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // InternalArithmetics.g:566:1: rule__Definition__Group__0__Impl : ( 'def' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:570:1: ( ( 'def' ) )
            // InternalArithmetics.g:571:1: ( 'def' )
            {
            // InternalArithmetics.g:571:1: ( 'def' )
            // InternalArithmetics.g:572:2: 'def'
            {
             before(grammarAccess.getDefinitionAccess().getDefKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // InternalArithmetics.g:581:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:585:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalArithmetics.g:586:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // InternalArithmetics.g:593:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__NameAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:597:1: ( ( ( rule__Definition__NameAssignment_1 ) ) )
            // InternalArithmetics.g:598:1: ( ( rule__Definition__NameAssignment_1 ) )
            {
            // InternalArithmetics.g:598:1: ( ( rule__Definition__NameAssignment_1 ) )
            // InternalArithmetics.g:599:2: ( rule__Definition__NameAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 
            // InternalArithmetics.g:600:2: ( rule__Definition__NameAssignment_1 )
            // InternalArithmetics.g:600:3: rule__Definition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // InternalArithmetics.g:608:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:612:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // InternalArithmetics.g:613:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // InternalArithmetics.g:620:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__Group_2__0 )? ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:624:1: ( ( ( rule__Definition__Group_2__0 )? ) )
            // InternalArithmetics.g:625:1: ( ( rule__Definition__Group_2__0 )? )
            {
            // InternalArithmetics.g:625:1: ( ( rule__Definition__Group_2__0 )? )
            // InternalArithmetics.g:626:2: ( rule__Definition__Group_2__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_2()); 
            // InternalArithmetics.g:627:2: ( rule__Definition__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalArithmetics.g:627:3: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // InternalArithmetics.g:635:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:639:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // InternalArithmetics.g:640:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // InternalArithmetics.g:647:1: rule__Definition__Group__3__Impl : ( ':' ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:651:1: ( ( ':' ) )
            // InternalArithmetics.g:652:1: ( ':' )
            {
            // InternalArithmetics.g:652:1: ( ':' )
            // InternalArithmetics.g:653:2: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__4"
    // InternalArithmetics.g:662:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:666:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // InternalArithmetics.g:667:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4"


    // $ANTLR start "rule__Definition__Group__4__Impl"
    // InternalArithmetics.g:674:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__ExprAssignment_4 ) ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:678:1: ( ( ( rule__Definition__ExprAssignment_4 ) ) )
            // InternalArithmetics.g:679:1: ( ( rule__Definition__ExprAssignment_4 ) )
            {
            // InternalArithmetics.g:679:1: ( ( rule__Definition__ExprAssignment_4 ) )
            // InternalArithmetics.g:680:2: ( rule__Definition__ExprAssignment_4 )
            {
             before(grammarAccess.getDefinitionAccess().getExprAssignment_4()); 
            // InternalArithmetics.g:681:2: ( rule__Definition__ExprAssignment_4 )
            // InternalArithmetics.g:681:3: rule__Definition__ExprAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ExprAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getExprAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4__Impl"


    // $ANTLR start "rule__Definition__Group__5"
    // InternalArithmetics.g:689:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:693:1: ( rule__Definition__Group__5__Impl )
            // InternalArithmetics.g:694:2: rule__Definition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__5"


    // $ANTLR start "rule__Definition__Group__5__Impl"
    // InternalArithmetics.g:700:1: rule__Definition__Group__5__Impl : ( ';' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:704:1: ( ( ';' ) )
            // InternalArithmetics.g:705:1: ( ';' )
            {
            // InternalArithmetics.g:705:1: ( ';' )
            // InternalArithmetics.g:706:2: ';'
            {
             before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__5__Impl"


    // $ANTLR start "rule__Definition__Group_2__0"
    // InternalArithmetics.g:716:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:720:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // InternalArithmetics.g:721:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Definition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0"


    // $ANTLR start "rule__Definition__Group_2__0__Impl"
    // InternalArithmetics.g:728:1: rule__Definition__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:732:1: ( ( '(' ) )
            // InternalArithmetics.g:733:1: ( '(' )
            {
            // InternalArithmetics.g:733:1: ( '(' )
            // InternalArithmetics.g:734:2: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_2__1"
    // InternalArithmetics.g:743:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:747:1: ( rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 )
            // InternalArithmetics.g:748:2: rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1"


    // $ANTLR start "rule__Definition__Group_2__1__Impl"
    // InternalArithmetics.g:755:1: rule__Definition__Group_2__1__Impl : ( ( rule__Definition__ArgsAssignment_2_1 ) ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:759:1: ( ( ( rule__Definition__ArgsAssignment_2_1 ) ) )
            // InternalArithmetics.g:760:1: ( ( rule__Definition__ArgsAssignment_2_1 ) )
            {
            // InternalArithmetics.g:760:1: ( ( rule__Definition__ArgsAssignment_2_1 ) )
            // InternalArithmetics.g:761:2: ( rule__Definition__ArgsAssignment_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_2_1()); 
            // InternalArithmetics.g:762:2: ( rule__Definition__ArgsAssignment_2_1 )
            // InternalArithmetics.g:762:3: rule__Definition__ArgsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ArgsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getArgsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1__Impl"


    // $ANTLR start "rule__Definition__Group_2__2"
    // InternalArithmetics.g:770:1: rule__Definition__Group_2__2 : rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 ;
    public final void rule__Definition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:774:1: ( rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 )
            // InternalArithmetics.g:775:2: rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__2"


    // $ANTLR start "rule__Definition__Group_2__2__Impl"
    // InternalArithmetics.g:782:1: rule__Definition__Group_2__2__Impl : ( ( rule__Definition__Group_2_2__0 )* ) ;
    public final void rule__Definition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:786:1: ( ( ( rule__Definition__Group_2_2__0 )* ) )
            // InternalArithmetics.g:787:1: ( ( rule__Definition__Group_2_2__0 )* )
            {
            // InternalArithmetics.g:787:1: ( ( rule__Definition__Group_2_2__0 )* )
            // InternalArithmetics.g:788:2: ( rule__Definition__Group_2_2__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_2_2()); 
            // InternalArithmetics.g:789:2: ( rule__Definition__Group_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArithmetics.g:789:3: rule__Definition__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Definition__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__2__Impl"


    // $ANTLR start "rule__Definition__Group_2__3"
    // InternalArithmetics.g:797:1: rule__Definition__Group_2__3 : rule__Definition__Group_2__3__Impl ;
    public final void rule__Definition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:801:1: ( rule__Definition__Group_2__3__Impl )
            // InternalArithmetics.g:802:2: rule__Definition__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__3"


    // $ANTLR start "rule__Definition__Group_2__3__Impl"
    // InternalArithmetics.g:808:1: rule__Definition__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Definition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:812:1: ( ( ')' ) )
            // InternalArithmetics.g:813:1: ( ')' )
            {
            // InternalArithmetics.g:813:1: ( ')' )
            // InternalArithmetics.g:814:2: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__3__Impl"


    // $ANTLR start "rule__Definition__Group_2_2__0"
    // InternalArithmetics.g:824:1: rule__Definition__Group_2_2__0 : rule__Definition__Group_2_2__0__Impl rule__Definition__Group_2_2__1 ;
    public final void rule__Definition__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:828:1: ( rule__Definition__Group_2_2__0__Impl rule__Definition__Group_2_2__1 )
            // InternalArithmetics.g:829:2: rule__Definition__Group_2_2__0__Impl rule__Definition__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Definition__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2_2__0"


    // $ANTLR start "rule__Definition__Group_2_2__0__Impl"
    // InternalArithmetics.g:836:1: rule__Definition__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:840:1: ( ( ',' ) )
            // InternalArithmetics.g:841:1: ( ',' )
            {
            // InternalArithmetics.g:841:1: ( ',' )
            // InternalArithmetics.g:842:2: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_2_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_2_2__1"
    // InternalArithmetics.g:851:1: rule__Definition__Group_2_2__1 : rule__Definition__Group_2_2__1__Impl ;
    public final void rule__Definition__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:855:1: ( rule__Definition__Group_2_2__1__Impl )
            // InternalArithmetics.g:856:2: rule__Definition__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2_2__1"


    // $ANTLR start "rule__Definition__Group_2_2__1__Impl"
    // InternalArithmetics.g:862:1: rule__Definition__Group_2_2__1__Impl : ( ( rule__Definition__ArgsAssignment_2_2_1 ) ) ;
    public final void rule__Definition__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:866:1: ( ( ( rule__Definition__ArgsAssignment_2_2_1 ) ) )
            // InternalArithmetics.g:867:1: ( ( rule__Definition__ArgsAssignment_2_2_1 ) )
            {
            // InternalArithmetics.g:867:1: ( ( rule__Definition__ArgsAssignment_2_2_1 ) )
            // InternalArithmetics.g:868:2: ( rule__Definition__ArgsAssignment_2_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_2_2_1()); 
            // InternalArithmetics.g:869:2: ( rule__Definition__ArgsAssignment_2_2_1 )
            // InternalArithmetics.g:869:3: rule__Definition__ArgsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ArgsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getArgsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2_2__1__Impl"


    // $ANTLR start "rule__Evaluation__Group__0"
    // InternalArithmetics.g:878:1: rule__Evaluation__Group__0 : rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 ;
    public final void rule__Evaluation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:882:1: ( rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 )
            // InternalArithmetics.g:883:2: rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Evaluation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__0"


    // $ANTLR start "rule__Evaluation__Group__0__Impl"
    // InternalArithmetics.g:890:1: rule__Evaluation__Group__0__Impl : ( ( rule__Evaluation__ExpressionAssignment_0 ) ) ;
    public final void rule__Evaluation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:894:1: ( ( ( rule__Evaluation__ExpressionAssignment_0 ) ) )
            // InternalArithmetics.g:895:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            {
            // InternalArithmetics.g:895:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            // InternalArithmetics.g:896:2: ( rule__Evaluation__ExpressionAssignment_0 )
            {
             before(grammarAccess.getEvaluationAccess().getExpressionAssignment_0()); 
            // InternalArithmetics.g:897:2: ( rule__Evaluation__ExpressionAssignment_0 )
            // InternalArithmetics.g:897:3: rule__Evaluation__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__0__Impl"


    // $ANTLR start "rule__Evaluation__Group__1"
    // InternalArithmetics.g:905:1: rule__Evaluation__Group__1 : rule__Evaluation__Group__1__Impl ;
    public final void rule__Evaluation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:909:1: ( rule__Evaluation__Group__1__Impl )
            // InternalArithmetics.g:910:2: rule__Evaluation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__1"


    // $ANTLR start "rule__Evaluation__Group__1__Impl"
    // InternalArithmetics.g:916:1: rule__Evaluation__Group__1__Impl : ( ';' ) ;
    public final void rule__Evaluation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:920:1: ( ( ';' ) )
            // InternalArithmetics.g:921:1: ( ';' )
            {
            // InternalArithmetics.g:921:1: ( ';' )
            // InternalArithmetics.g:922:2: ';'
            {
             before(grammarAccess.getEvaluationAccess().getSemicolonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalArithmetics.g:932:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:936:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalArithmetics.g:937:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalArithmetics.g:944:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:948:1: ( ( ruleMultiplication ) )
            // InternalArithmetics.g:949:1: ( ruleMultiplication )
            {
            // InternalArithmetics.g:949:1: ( ruleMultiplication )
            // InternalArithmetics.g:950:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalArithmetics.g:959:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:963:1: ( rule__Addition__Group__1__Impl )
            // InternalArithmetics.g:964:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalArithmetics.g:970:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:974:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalArithmetics.g:975:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalArithmetics.g:975:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalArithmetics.g:976:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalArithmetics.g:977:2: ( rule__Addition__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=20 && LA9_0<=21)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArithmetics.g:977:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalArithmetics.g:986:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:990:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalArithmetics.g:991:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalArithmetics.g:998:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1002:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalArithmetics.g:1003:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalArithmetics.g:1003:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalArithmetics.g:1004:2: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // InternalArithmetics.g:1005:2: ( rule__Addition__Alternatives_1_0 )
            // InternalArithmetics.g:1005:3: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalArithmetics.g:1013:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1017:1: ( rule__Addition__Group_1__1__Impl )
            // InternalArithmetics.g:1018:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalArithmetics.g:1024:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1028:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalArithmetics.g:1029:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalArithmetics.g:1029:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalArithmetics.g:1030:2: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // InternalArithmetics.g:1031:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalArithmetics.g:1031:3: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // InternalArithmetics.g:1040:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1044:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalArithmetics.g:1045:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // InternalArithmetics.g:1052:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1056:1: ( ( () ) )
            // InternalArithmetics.g:1057:1: ( () )
            {
            // InternalArithmetics.g:1057:1: ( () )
            // InternalArithmetics.g:1058:2: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalArithmetics.g:1059:2: ()
            // InternalArithmetics.g:1059:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // InternalArithmetics.g:1067:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1071:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalArithmetics.g:1072:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // InternalArithmetics.g:1078:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1082:1: ( ( '+' ) )
            // InternalArithmetics.g:1083:1: ( '+' )
            {
            // InternalArithmetics.g:1083:1: ( '+' )
            // InternalArithmetics.g:1084:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // InternalArithmetics.g:1094:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1098:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalArithmetics.g:1099:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // InternalArithmetics.g:1106:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1110:1: ( ( () ) )
            // InternalArithmetics.g:1111:1: ( () )
            {
            // InternalArithmetics.g:1111:1: ( () )
            // InternalArithmetics.g:1112:2: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalArithmetics.g:1113:2: ()
            // InternalArithmetics.g:1113:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // InternalArithmetics.g:1121:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1125:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalArithmetics.g:1126:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // InternalArithmetics.g:1132:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1136:1: ( ( '-' ) )
            // InternalArithmetics.g:1137:1: ( '-' )
            {
            // InternalArithmetics.g:1137:1: ( '-' )
            // InternalArithmetics.g:1138:2: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalArithmetics.g:1148:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1152:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalArithmetics.g:1153:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalArithmetics.g:1160:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1164:1: ( ( rulePrimaryExpression ) )
            // InternalArithmetics.g:1165:1: ( rulePrimaryExpression )
            {
            // InternalArithmetics.g:1165:1: ( rulePrimaryExpression )
            // InternalArithmetics.g:1166:2: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalArithmetics.g:1175:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1179:1: ( rule__Multiplication__Group__1__Impl )
            // InternalArithmetics.g:1180:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalArithmetics.g:1186:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1190:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalArithmetics.g:1191:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalArithmetics.g:1191:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalArithmetics.g:1192:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalArithmetics.g:1193:2: ( rule__Multiplication__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=22 && LA10_0<=23)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArithmetics.g:1193:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalArithmetics.g:1202:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1206:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalArithmetics.g:1207:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalArithmetics.g:1214:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1218:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalArithmetics.g:1219:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalArithmetics.g:1219:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalArithmetics.g:1220:2: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // InternalArithmetics.g:1221:2: ( rule__Multiplication__Alternatives_1_0 )
            // InternalArithmetics.g:1221:3: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalArithmetics.g:1229:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1233:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalArithmetics.g:1234:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalArithmetics.g:1240:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1244:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalArithmetics.g:1245:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalArithmetics.g:1245:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalArithmetics.g:1246:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // InternalArithmetics.g:1247:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalArithmetics.g:1247:3: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // InternalArithmetics.g:1256:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1260:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalArithmetics.g:1261:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // InternalArithmetics.g:1268:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1272:1: ( ( () ) )
            // InternalArithmetics.g:1273:1: ( () )
            {
            // InternalArithmetics.g:1273:1: ( () )
            // InternalArithmetics.g:1274:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // InternalArithmetics.g:1275:2: ()
            // InternalArithmetics.g:1275:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // InternalArithmetics.g:1283:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1287:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalArithmetics.g:1288:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // InternalArithmetics.g:1294:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1298:1: ( ( '*' ) )
            // InternalArithmetics.g:1299:1: ( '*' )
            {
            // InternalArithmetics.g:1299:1: ( '*' )
            // InternalArithmetics.g:1300:2: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // InternalArithmetics.g:1310:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1314:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalArithmetics.g:1315:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // InternalArithmetics.g:1322:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1326:1: ( ( () ) )
            // InternalArithmetics.g:1327:1: ( () )
            {
            // InternalArithmetics.g:1327:1: ( () )
            // InternalArithmetics.g:1328:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // InternalArithmetics.g:1329:2: ()
            // InternalArithmetics.g:1329:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // InternalArithmetics.g:1337:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1341:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalArithmetics.g:1342:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // InternalArithmetics.g:1348:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1352:1: ( ( '/' ) )
            // InternalArithmetics.g:1353:1: ( '/' )
            {
            // InternalArithmetics.g:1353:1: ( '/' )
            // InternalArithmetics.g:1354:2: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalArithmetics.g:1364:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1368:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalArithmetics.g:1369:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalArithmetics.g:1376:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1380:1: ( ( '(' ) )
            // InternalArithmetics.g:1381:1: ( '(' )
            {
            // InternalArithmetics.g:1381:1: ( '(' )
            // InternalArithmetics.g:1382:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalArithmetics.g:1391:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1395:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalArithmetics.g:1396:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalArithmetics.g:1403:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1407:1: ( ( ruleExpression ) )
            // InternalArithmetics.g:1408:1: ( ruleExpression )
            {
            // InternalArithmetics.g:1408:1: ( ruleExpression )
            // InternalArithmetics.g:1409:2: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalArithmetics.g:1418:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1422:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalArithmetics.g:1423:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalArithmetics.g:1429:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1433:1: ( ( ')' ) )
            // InternalArithmetics.g:1434:1: ( ')' )
            {
            // InternalArithmetics.g:1434:1: ( ')' )
            // InternalArithmetics.g:1435:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // InternalArithmetics.g:1445:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1449:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalArithmetics.g:1450:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // InternalArithmetics.g:1457:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1461:1: ( ( () ) )
            // InternalArithmetics.g:1462:1: ( () )
            {
            // InternalArithmetics.g:1462:1: ( () )
            // InternalArithmetics.g:1463:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 
            // InternalArithmetics.g:1464:2: ()
            // InternalArithmetics.g:1464:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // InternalArithmetics.g:1472:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1476:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalArithmetics.g:1477:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // InternalArithmetics.g:1483:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1487:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalArithmetics.g:1488:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalArithmetics.g:1488:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalArithmetics.g:1489:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // InternalArithmetics.g:1490:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalArithmetics.g:1490:3: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalArithmetics.g:1499:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1503:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalArithmetics.g:1504:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalArithmetics.g:1511:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1515:1: ( ( () ) )
            // InternalArithmetics.g:1516:1: ( () )
            {
            // InternalArithmetics.g:1516:1: ( () )
            // InternalArithmetics.g:1517:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0()); 
            // InternalArithmetics.g:1518:2: ()
            // InternalArithmetics.g:1518:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalArithmetics.g:1526:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1530:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalArithmetics.g:1531:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalArithmetics.g:1538:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__FuncAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1542:1: ( ( ( rule__PrimaryExpression__FuncAssignment_2_1 ) ) )
            // InternalArithmetics.g:1543:1: ( ( rule__PrimaryExpression__FuncAssignment_2_1 ) )
            {
            // InternalArithmetics.g:1543:1: ( ( rule__PrimaryExpression__FuncAssignment_2_1 ) )
            // InternalArithmetics.g:1544:2: ( rule__PrimaryExpression__FuncAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFuncAssignment_2_1()); 
            // InternalArithmetics.g:1545:2: ( rule__PrimaryExpression__FuncAssignment_2_1 )
            // InternalArithmetics.g:1545:3: rule__PrimaryExpression__FuncAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__FuncAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getFuncAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // InternalArithmetics.g:1553:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1557:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalArithmetics.g:1558:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // InternalArithmetics.g:1564:1: rule__PrimaryExpression__Group_2__2__Impl : ( ( rule__PrimaryExpression__Group_2_2__0 )? ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1568:1: ( ( ( rule__PrimaryExpression__Group_2_2__0 )? ) )
            // InternalArithmetics.g:1569:1: ( ( rule__PrimaryExpression__Group_2_2__0 )? )
            {
            // InternalArithmetics.g:1569:1: ( ( rule__PrimaryExpression__Group_2_2__0 )? )
            // InternalArithmetics.g:1570:2: ( rule__PrimaryExpression__Group_2_2__0 )?
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2()); 
            // InternalArithmetics.g:1571:2: ( rule__PrimaryExpression__Group_2_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalArithmetics.g:1571:3: rule__PrimaryExpression__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__0"
    // InternalArithmetics.g:1580:1: rule__PrimaryExpression__Group_2_2__0 : rule__PrimaryExpression__Group_2_2__0__Impl rule__PrimaryExpression__Group_2_2__1 ;
    public final void rule__PrimaryExpression__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1584:1: ( rule__PrimaryExpression__Group_2_2__0__Impl rule__PrimaryExpression__Group_2_2__1 )
            // InternalArithmetics.g:1585:2: rule__PrimaryExpression__Group_2_2__0__Impl rule__PrimaryExpression__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryExpression__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__0__Impl"
    // InternalArithmetics.g:1592:1: rule__PrimaryExpression__Group_2_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1596:1: ( ( '(' ) )
            // InternalArithmetics.g:1597:1: ( '(' )
            {
            // InternalArithmetics.g:1597:1: ( '(' )
            // InternalArithmetics.g:1598:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__1"
    // InternalArithmetics.g:1607:1: rule__PrimaryExpression__Group_2_2__1 : rule__PrimaryExpression__Group_2_2__1__Impl rule__PrimaryExpression__Group_2_2__2 ;
    public final void rule__PrimaryExpression__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1611:1: ( rule__PrimaryExpression__Group_2_2__1__Impl rule__PrimaryExpression__Group_2_2__2 )
            // InternalArithmetics.g:1612:2: rule__PrimaryExpression__Group_2_2__1__Impl rule__PrimaryExpression__Group_2_2__2
            {
            pushFollow(FOLLOW_10);
            rule__PrimaryExpression__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__1__Impl"
    // InternalArithmetics.g:1619:1: rule__PrimaryExpression__Group_2_2__1__Impl : ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1623:1: ( ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 ) ) )
            // InternalArithmetics.g:1624:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 ) )
            {
            // InternalArithmetics.g:1624:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 ) )
            // InternalArithmetics.g:1625:2: ( rule__PrimaryExpression__ArgsAssignment_2_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_1()); 
            // InternalArithmetics.g:1626:2: ( rule__PrimaryExpression__ArgsAssignment_2_2_1 )
            // InternalArithmetics.g:1626:3: rule__PrimaryExpression__ArgsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ArgsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__2"
    // InternalArithmetics.g:1634:1: rule__PrimaryExpression__Group_2_2__2 : rule__PrimaryExpression__Group_2_2__2__Impl rule__PrimaryExpression__Group_2_2__3 ;
    public final void rule__PrimaryExpression__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1638:1: ( rule__PrimaryExpression__Group_2_2__2__Impl rule__PrimaryExpression__Group_2_2__3 )
            // InternalArithmetics.g:1639:2: rule__PrimaryExpression__Group_2_2__2__Impl rule__PrimaryExpression__Group_2_2__3
            {
            pushFollow(FOLLOW_10);
            rule__PrimaryExpression__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__2__Impl"
    // InternalArithmetics.g:1646:1: rule__PrimaryExpression__Group_2_2__2__Impl : ( ( rule__PrimaryExpression__Group_2_2_2__0 )* ) ;
    public final void rule__PrimaryExpression__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1650:1: ( ( ( rule__PrimaryExpression__Group_2_2_2__0 )* ) )
            // InternalArithmetics.g:1651:1: ( ( rule__PrimaryExpression__Group_2_2_2__0 )* )
            {
            // InternalArithmetics.g:1651:1: ( ( rule__PrimaryExpression__Group_2_2_2__0 )* )
            // InternalArithmetics.g:1652:2: ( rule__PrimaryExpression__Group_2_2_2__0 )*
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2_2()); 
            // InternalArithmetics.g:1653:2: ( rule__PrimaryExpression__Group_2_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArithmetics.g:1653:3: rule__PrimaryExpression__Group_2_2_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PrimaryExpression__Group_2_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__3"
    // InternalArithmetics.g:1661:1: rule__PrimaryExpression__Group_2_2__3 : rule__PrimaryExpression__Group_2_2__3__Impl ;
    public final void rule__PrimaryExpression__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1665:1: ( rule__PrimaryExpression__Group_2_2__3__Impl )
            // InternalArithmetics.g:1666:2: rule__PrimaryExpression__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__3"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__3__Impl"
    // InternalArithmetics.g:1672:1: rule__PrimaryExpression__Group_2_2__3__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1676:1: ( ( ')' ) )
            // InternalArithmetics.g:1677:1: ( ')' )
            {
            // InternalArithmetics.g:1677:1: ( ')' )
            // InternalArithmetics.g:1678:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__0"
    // InternalArithmetics.g:1688:1: rule__PrimaryExpression__Group_2_2_2__0 : rule__PrimaryExpression__Group_2_2_2__0__Impl rule__PrimaryExpression__Group_2_2_2__1 ;
    public final void rule__PrimaryExpression__Group_2_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1692:1: ( rule__PrimaryExpression__Group_2_2_2__0__Impl rule__PrimaryExpression__Group_2_2_2__1 )
            // InternalArithmetics.g:1693:2: rule__PrimaryExpression__Group_2_2_2__0__Impl rule__PrimaryExpression__Group_2_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryExpression__Group_2_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__0__Impl"
    // InternalArithmetics.g:1700:1: rule__PrimaryExpression__Group_2_2_2__0__Impl : ( ',' ) ;
    public final void rule__PrimaryExpression__Group_2_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1704:1: ( ( ',' ) )
            // InternalArithmetics.g:1705:1: ( ',' )
            {
            // InternalArithmetics.g:1705:1: ( ',' )
            // InternalArithmetics.g:1706:2: ','
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__1"
    // InternalArithmetics.g:1715:1: rule__PrimaryExpression__Group_2_2_2__1 : rule__PrimaryExpression__Group_2_2_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1719:1: ( rule__PrimaryExpression__Group_2_2_2__1__Impl )
            // InternalArithmetics.g:1720:2: rule__PrimaryExpression__Group_2_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__1__Impl"
    // InternalArithmetics.g:1726:1: rule__PrimaryExpression__Group_2_2_2__1__Impl : ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1730:1: ( ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) ) )
            // InternalArithmetics.g:1731:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) )
            {
            // InternalArithmetics.g:1731:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) )
            // InternalArithmetics.g:1732:2: ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_2_1()); 
            // InternalArithmetics.g:1733:2: ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 )
            // InternalArithmetics.g:1733:3: rule__PrimaryExpression__ArgsAssignment_2_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ArgsAssignment_2_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__1__Impl"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // InternalArithmetics.g:1742:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1746:1: ( ( RULE_ID ) )
            // InternalArithmetics.g:1747:2: ( RULE_ID )
            {
            // InternalArithmetics.g:1747:2: ( RULE_ID )
            // InternalArithmetics.g:1748:3: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__ImportsAssignment_2"
    // InternalArithmetics.g:1757:1: rule__Module__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1761:1: ( ( ruleImport ) )
            // InternalArithmetics.g:1762:2: ( ruleImport )
            {
            // InternalArithmetics.g:1762:2: ( ruleImport )
            // InternalArithmetics.g:1763:3: ruleImport
            {
             before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ImportsAssignment_2"


    // $ANTLR start "rule__Module__StatementsAssignment_3"
    // InternalArithmetics.g:1772:1: rule__Module__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Module__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1776:1: ( ( ruleStatement ) )
            // InternalArithmetics.g:1777:2: ( ruleStatement )
            {
            // InternalArithmetics.g:1777:2: ( ruleStatement )
            // InternalArithmetics.g:1778:3: ruleStatement
            {
             before(grammarAccess.getModuleAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__StatementsAssignment_3"


    // $ANTLR start "rule__Import__ModuleAssignment_1"
    // InternalArithmetics.g:1787:1: rule__Import__ModuleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Import__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1791:1: ( ( ( RULE_ID ) ) )
            // InternalArithmetics.g:1792:2: ( ( RULE_ID ) )
            {
            // InternalArithmetics.g:1792:2: ( ( RULE_ID ) )
            // InternalArithmetics.g:1793:3: ( RULE_ID )
            {
             before(grammarAccess.getImportAccess().getModuleModuleCrossReference_1_0()); 
            // InternalArithmetics.g:1794:3: ( RULE_ID )
            // InternalArithmetics.g:1795:4: RULE_ID
            {
             before(grammarAccess.getImportAccess().getModuleModuleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getModuleModuleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getImportAccess().getModuleModuleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ModuleAssignment_1"


    // $ANTLR start "rule__Definition__NameAssignment_1"
    // InternalArithmetics.g:1806:1: rule__Definition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1810:1: ( ( RULE_ID ) )
            // InternalArithmetics.g:1811:2: ( RULE_ID )
            {
            // InternalArithmetics.g:1811:2: ( RULE_ID )
            // InternalArithmetics.g:1812:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_1"


    // $ANTLR start "rule__Definition__ArgsAssignment_2_1"
    // InternalArithmetics.g:1821:1: rule__Definition__ArgsAssignment_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ArgsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1825:1: ( ( ruleDeclaredParameter ) )
            // InternalArithmetics.g:1826:2: ( ruleDeclaredParameter )
            {
            // InternalArithmetics.g:1826:2: ( ruleDeclaredParameter )
            // InternalArithmetics.g:1827:3: ruleDeclaredParameter
            {
             before(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaredParameter();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ArgsAssignment_2_1"


    // $ANTLR start "rule__Definition__ArgsAssignment_2_2_1"
    // InternalArithmetics.g:1836:1: rule__Definition__ArgsAssignment_2_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ArgsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1840:1: ( ( ruleDeclaredParameter ) )
            // InternalArithmetics.g:1841:2: ( ruleDeclaredParameter )
            {
            // InternalArithmetics.g:1841:2: ( ruleDeclaredParameter )
            // InternalArithmetics.g:1842:3: ruleDeclaredParameter
            {
             before(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaredParameter();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ArgsAssignment_2_2_1"


    // $ANTLR start "rule__Definition__ExprAssignment_4"
    // InternalArithmetics.g:1851:1: rule__Definition__ExprAssignment_4 : ( ruleExpression ) ;
    public final void rule__Definition__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1855:1: ( ( ruleExpression ) )
            // InternalArithmetics.g:1856:2: ( ruleExpression )
            {
            // InternalArithmetics.g:1856:2: ( ruleExpression )
            // InternalArithmetics.g:1857:3: ruleExpression
            {
             before(grammarAccess.getDefinitionAccess().getExprExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getExprExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ExprAssignment_4"


    // $ANTLR start "rule__DeclaredParameter__NameAssignment"
    // InternalArithmetics.g:1866:1: rule__DeclaredParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__DeclaredParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1870:1: ( ( RULE_ID ) )
            // InternalArithmetics.g:1871:2: ( RULE_ID )
            {
            // InternalArithmetics.g:1871:2: ( RULE_ID )
            // InternalArithmetics.g:1872:3: RULE_ID
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredParameter__NameAssignment"


    // $ANTLR start "rule__Evaluation__ExpressionAssignment_0"
    // InternalArithmetics.g:1881:1: rule__Evaluation__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__Evaluation__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1885:1: ( ( ruleExpression ) )
            // InternalArithmetics.g:1886:2: ( ruleExpression )
            {
            // InternalArithmetics.g:1886:2: ( ruleExpression )
            // InternalArithmetics.g:1887:3: ruleExpression
            {
             before(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__ExpressionAssignment_0"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // InternalArithmetics.g:1896:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1900:1: ( ( ruleMultiplication ) )
            // InternalArithmetics.g:1901:2: ( ruleMultiplication )
            {
            // InternalArithmetics.g:1901:2: ( ruleMultiplication )
            // InternalArithmetics.g:1902:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // InternalArithmetics.g:1911:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1915:1: ( ( rulePrimaryExpression ) )
            // InternalArithmetics.g:1916:2: ( rulePrimaryExpression )
            {
            // InternalArithmetics.g:1916:2: ( rulePrimaryExpression )
            // InternalArithmetics.g:1917:3: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_1_1"
    // InternalArithmetics.g:1926:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1930:1: ( ( RULE_NUMBER ) )
            // InternalArithmetics.g:1931:2: ( RULE_NUMBER )
            {
            // InternalArithmetics.g:1931:2: ( RULE_NUMBER )
            // InternalArithmetics.g:1932:3: RULE_NUMBER
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__FuncAssignment_2_1"
    // InternalArithmetics.g:1941:1: rule__PrimaryExpression__FuncAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__FuncAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1945:1: ( ( ( RULE_ID ) ) )
            // InternalArithmetics.g:1946:2: ( ( RULE_ID ) )
            {
            // InternalArithmetics.g:1946:2: ( ( RULE_ID ) )
            // InternalArithmetics.g:1947:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionCrossReference_2_1_0()); 
            // InternalArithmetics.g:1948:3: ( RULE_ID )
            // InternalArithmetics.g:1949:4: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__FuncAssignment_2_1"


    // $ANTLR start "rule__PrimaryExpression__ArgsAssignment_2_2_1"
    // InternalArithmetics.g:1960:1: rule__PrimaryExpression__ArgsAssignment_2_2_1 : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__ArgsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1964:1: ( ( ruleExpression ) )
            // InternalArithmetics.g:1965:2: ( ruleExpression )
            {
            // InternalArithmetics.g:1965:2: ( ruleExpression )
            // InternalArithmetics.g:1966:3: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ArgsAssignment_2_2_1"


    // $ANTLR start "rule__PrimaryExpression__ArgsAssignment_2_2_2_1"
    // InternalArithmetics.g:1975:1: rule__PrimaryExpression__ArgsAssignment_2_2_2_1 : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__ArgsAssignment_2_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetics.g:1979:1: ( ( ruleExpression ) )
            // InternalArithmetics.g:1980:2: ( ruleExpression )
            {
            // InternalArithmetics.g:1980:2: ( ruleExpression )
            // InternalArithmetics.g:1981:3: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ArgsAssignment_2_2_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000026030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000024032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000024030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});

}