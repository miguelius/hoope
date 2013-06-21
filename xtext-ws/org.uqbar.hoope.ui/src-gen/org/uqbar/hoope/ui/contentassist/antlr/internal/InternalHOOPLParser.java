package org.uqbar.hoope.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.uqbar.hoope.services.HOOPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHOOPLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'Number'", "'String'", "'Boolean'", "'ref'", "'= object {'", "'}'", "':'", "'='", "'message'", "'= method {'", "'if'", "'then'", "'else'", "'while'", "'{'", "'..'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalHOOPLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHOOPLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHOOPLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g"; }


     
     	private HOOPLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(HOOPLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProgram"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:61:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:62:1: ( ruleProgram EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:63:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram67);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:70:1: ruleProgram : ( ( rule__Program__ObjectsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:74:2: ( ( ( rule__Program__ObjectsAssignment )* ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:75:1: ( ( rule__Program__ObjectsAssignment )* )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:75:1: ( ( rule__Program__ObjectsAssignment )* )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:76:1: ( rule__Program__ObjectsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getObjectsAssignment()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:77:1: ( rule__Program__ObjectsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||LA1_0==18||LA1_0==25||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:77:2: rule__Program__ObjectsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__ObjectsAssignment_in_ruleProgram100);
            	    rule__Program__ObjectsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getObjectsAssignment()); 
            }

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleObjectDefinition"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:89:1: entryRuleObjectDefinition : ruleObjectDefinition EOF ;
    public final void entryRuleObjectDefinition() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:90:1: ( ruleObjectDefinition EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:91:1: ruleObjectDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectDefinition_in_entryRuleObjectDefinition128);
            ruleObjectDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDefinition135); if (state.failed) return ;

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
    // $ANTLR end "entryRuleObjectDefinition"


    // $ANTLR start "ruleObjectDefinition"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:98:1: ruleObjectDefinition : ( ( rule__ObjectDefinition__Group__0 ) ) ;
    public final void ruleObjectDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:102:2: ( ( ( rule__ObjectDefinition__Group__0 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:103:1: ( ( rule__ObjectDefinition__Group__0 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:103:1: ( ( rule__ObjectDefinition__Group__0 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:104:1: ( rule__ObjectDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectDefinitionAccess().getGroup()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:105:1: ( rule__ObjectDefinition__Group__0 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:105:2: rule__ObjectDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectDefinition__Group__0_in_ruleObjectDefinition161);
            rule__ObjectDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectDefinitionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleObjectDefinition"


    // $ANTLR start "entryRuleFeature"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:117:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:118:1: ( ruleFeature EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:119:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature188);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature195); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:126:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:130:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:131:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:131:1: ( ( rule__Feature__Alternatives ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:132:1: ( rule__Feature__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:133:1: ( rule__Feature__Alternatives )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:133:2: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_in_ruleFeature221);
            rule__Feature__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleProperty"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:145:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:146:1: ( ruleProperty EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:147:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty248);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty255); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:154:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:158:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:159:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:159:1: ( ( rule__Property__Group__0 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:160:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:161:1: ( rule__Property__Group__0 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:161:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty281);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMessage"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:173:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:174:1: ( ruleMessage EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:175:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage308);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage315); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:182:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:186:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:187:1: ( ( rule__Message__Group__0 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:187:1: ( ( rule__Message__Group__0 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:188:1: ( rule__Message__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:189:1: ( rule__Message__Group__0 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:189:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage341);
            rule__Message__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleExpresion"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:201:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:202:1: ( ruleExpresion EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:203:1: ruleExpresion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpresionRule()); 
            }
            pushFollow(FOLLOW_ruleExpresion_in_entryRuleExpresion368);
            ruleExpresion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpresionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpresion375); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:210:1: ruleExpresion : ( ( rule__Expresion__Alternatives ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:214:2: ( ( ( rule__Expresion__Alternatives ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:215:1: ( ( rule__Expresion__Alternatives ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:215:1: ( ( rule__Expresion__Alternatives ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:216:1: ( rule__Expresion__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpresionAccess().getAlternatives()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:217:1: ( rule__Expresion__Alternatives )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:217:2: rule__Expresion__Alternatives
            {
            pushFollow(FOLLOW_rule__Expresion__Alternatives_in_ruleExpresion401);
            rule__Expresion__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpresionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleIfExpresion"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:229:1: entryRuleIfExpresion : ruleIfExpresion EOF ;
    public final void entryRuleIfExpresion() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:230:1: ( ruleIfExpresion EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:231:1: ruleIfExpresion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionRule()); 
            }
            pushFollow(FOLLOW_ruleIfExpresion_in_entryRuleIfExpresion428);
            ruleIfExpresion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpresion435); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfExpresion"


    // $ANTLR start "ruleIfExpresion"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:238:1: ruleIfExpresion : ( ( rule__IfExpresion__Group__0 ) ) ;
    public final void ruleIfExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:242:2: ( ( ( rule__IfExpresion__Group__0 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:243:1: ( ( rule__IfExpresion__Group__0 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:243:1: ( ( rule__IfExpresion__Group__0 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:244:1: ( rule__IfExpresion__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getGroup()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:245:1: ( rule__IfExpresion__Group__0 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:245:2: rule__IfExpresion__Group__0
            {
            pushFollow(FOLLOW_rule__IfExpresion__Group__0_in_ruleIfExpresion461);
            rule__IfExpresion__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleIfExpresion"


    // $ANTLR start "entryRuleWhileExpresion"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:257:1: entryRuleWhileExpresion : ruleWhileExpresion EOF ;
    public final void entryRuleWhileExpresion() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:258:1: ( ruleWhileExpresion EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:259:1: ruleWhileExpresion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileExpresionRule()); 
            }
            pushFollow(FOLLOW_ruleWhileExpresion_in_entryRuleWhileExpresion488);
            ruleWhileExpresion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileExpresionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileExpresion495); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWhileExpresion"


    // $ANTLR start "ruleWhileExpresion"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:266:1: ruleWhileExpresion : ( ( rule__WhileExpresion__Group__0 ) ) ;
    public final void ruleWhileExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:270:2: ( ( ( rule__WhileExpresion__Group__0 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:271:1: ( ( rule__WhileExpresion__Group__0 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:271:1: ( ( rule__WhileExpresion__Group__0 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:272:1: ( rule__WhileExpresion__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileExpresionAccess().getGroup()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:273:1: ( rule__WhileExpresion__Group__0 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:273:2: rule__WhileExpresion__Group__0
            {
            pushFollow(FOLLOW_rule__WhileExpresion__Group__0_in_ruleWhileExpresion521);
            rule__WhileExpresion__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileExpresionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleWhileExpresion"


    // $ANTLR start "entryRuleTerminal"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:285:1: entryRuleTerminal : ruleTerminal EOF ;
    public final void entryRuleTerminal() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:286:1: ( ruleTerminal EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:287:1: ruleTerminal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalRule()); 
            }
            pushFollow(FOLLOW_ruleTerminal_in_entryRuleTerminal548);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal555); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:294:1: ruleTerminal : ( ( rule__Terminal__Alternatives ) ) ;
    public final void ruleTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:298:2: ( ( ( rule__Terminal__Alternatives ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:299:1: ( ( rule__Terminal__Alternatives ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:299:1: ( ( rule__Terminal__Alternatives ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:300:1: ( rule__Terminal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getAlternatives()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:301:1: ( rule__Terminal__Alternatives )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:301:2: rule__Terminal__Alternatives
            {
            pushFollow(FOLLOW_rule__Terminal__Alternatives_in_ruleTerminal581);
            rule__Terminal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleOperator"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:313:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:314:1: ( ruleOperator EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:315:1: ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator608);
            ruleOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator615); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:322:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:326:2: ( ( ( rule__Operator__Alternatives ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:327:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:327:1: ( ( rule__Operator__Alternatives ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:328:1: ( rule__Operator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAlternatives()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:329:1: ( rule__Operator__Alternatives )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:329:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator641);
            rule__Operator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleTypo"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:341:1: entryRuleTypo : ruleTypo EOF ;
    public final void entryRuleTypo() throws RecognitionException {
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:342:1: ( ruleTypo EOF )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:343:1: ruleTypo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypoRule()); 
            }
            pushFollow(FOLLOW_ruleTypo_in_entryRuleTypo668);
            ruleTypo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypoRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypo675); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypo"


    // $ANTLR start "ruleTypo"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:350:1: ruleTypo : ( ( rule__Typo__Alternatives ) ) ;
    public final void ruleTypo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:354:2: ( ( ( rule__Typo__Alternatives ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:355:1: ( ( rule__Typo__Alternatives ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:355:1: ( ( rule__Typo__Alternatives ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:356:1: ( rule__Typo__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypoAccess().getAlternatives()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:357:1: ( rule__Typo__Alternatives )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:357:2: rule__Typo__Alternatives
            {
            pushFollow(FOLLOW_rule__Typo__Alternatives_in_ruleTypo701);
            rule__Typo__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypoAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleTypo"


    // $ANTLR start "rule__Program__ObjectsAlternatives_0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:369:1: rule__Program__ObjectsAlternatives_0 : ( ( ruleExpresion ) | ( ruleObjectDefinition ) );
    public final void rule__Program__ObjectsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:373:1: ( ( ruleExpresion ) | ( ruleObjectDefinition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_ID)||LA2_0==25||LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:374:1: ( ruleExpresion )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:374:1: ( ruleExpresion )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:375:1: ruleExpresion
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProgramAccess().getObjectsExpresionParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleExpresion_in_rule__Program__ObjectsAlternatives_0737);
                    ruleExpresion();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProgramAccess().getObjectsExpresionParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:380:6: ( ruleObjectDefinition )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:380:6: ( ruleObjectDefinition )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:381:1: ruleObjectDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProgramAccess().getObjectsObjectDefinitionParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleObjectDefinition_in_rule__Program__ObjectsAlternatives_0754);
                    ruleObjectDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProgramAccess().getObjectsObjectDefinitionParserRuleCall_0_1()); 
                    }

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
    // $ANTLR end "rule__Program__ObjectsAlternatives_0"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:391:1: rule__Feature__Alternatives : ( ( ruleObjectDefinition ) | ( ruleProperty ) | ( ruleMessage ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:395:1: ( ( ruleObjectDefinition ) | ( ruleProperty ) | ( ruleMessage ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:396:1: ( ruleObjectDefinition )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:396:1: ( ruleObjectDefinition )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:397:1: ruleObjectDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getObjectDefinitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleObjectDefinition_in_rule__Feature__Alternatives786);
                    ruleObjectDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getObjectDefinitionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:402:6: ( ruleProperty )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:402:6: ( ruleProperty )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:403:1: ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleProperty_in_rule__Feature__Alternatives803);
                    ruleProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:408:6: ( ruleMessage )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:408:6: ( ruleMessage )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:409:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getMessageParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__Feature__Alternatives820);
                    ruleMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getMessageParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__Expresion__Alternatives"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:419:1: rule__Expresion__Alternatives : ( ( ruleWhileExpresion ) | ( ruleIfExpresion ) | ( ( rule__Expresion__Group_2__0 ) ) );
    public final void rule__Expresion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:423:1: ( ( ruleWhileExpresion ) | ( ruleIfExpresion ) | ( ( rule__Expresion__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:424:1: ( ruleWhileExpresion )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:424:1: ( ruleWhileExpresion )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:425:1: ruleWhileExpresion
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpresionAccess().getWhileExpresionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleWhileExpresion_in_rule__Expresion__Alternatives852);
                    ruleWhileExpresion();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpresionAccess().getWhileExpresionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:430:6: ( ruleIfExpresion )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:430:6: ( ruleIfExpresion )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:431:1: ruleIfExpresion
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpresionAccess().getIfExpresionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIfExpresion_in_rule__Expresion__Alternatives869);
                    ruleIfExpresion();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpresionAccess().getIfExpresionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:436:6: ( ( rule__Expresion__Group_2__0 ) )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:436:6: ( ( rule__Expresion__Group_2__0 ) )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:437:1: ( rule__Expresion__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpresionAccess().getGroup_2()); 
                    }
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:438:1: ( rule__Expresion__Group_2__0 )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:438:2: rule__Expresion__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Expresion__Group_2__0_in_rule__Expresion__Alternatives886);
                    rule__Expresion__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpresionAccess().getGroup_2()); 
                    }

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
    // $ANTLR end "rule__Expresion__Alternatives"


    // $ANTLR start "rule__Terminal__Alternatives"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:447:1: rule__Terminal__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_ID ) | ( ( rule__Terminal__Group_3__0 ) ) );
    public final void rule__Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:451:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_ID ) | ( ( rule__Terminal__Group_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==30) ) {
                    alt5=4;
                }
                else if ( (LA5_1==EOF||(LA5_1>=RULE_INT && LA5_1<=RULE_ID)||(LA5_1>=11 && LA5_1<=14)||LA5_1==18||LA5_1==20||LA5_1==23||(LA5_1>=25 && LA5_1<=29)) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:452:1: ( RULE_INT )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:452:1: ( RULE_INT )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:453:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Terminal__Alternatives919); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:458:6: ( RULE_STRING )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:458:6: ( RULE_STRING )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:459:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Terminal__Alternatives936); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:464:6: ( RULE_ID )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:464:6: ( RULE_ID )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:465:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getIDTerminalRuleCall_2()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminal__Alternatives953); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getIDTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:470:6: ( ( rule__Terminal__Group_3__0 ) )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:470:6: ( ( rule__Terminal__Group_3__0 ) )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:471:1: ( rule__Terminal__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getGroup_3()); 
                    }
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:472:1: ( rule__Terminal__Group_3__0 )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:472:2: rule__Terminal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Terminal__Group_3__0_in_rule__Terminal__Alternatives970);
                    rule__Terminal__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getGroup_3()); 
                    }

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
    // $ANTLR end "rule__Terminal__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:481:1: rule__Operator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:485:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:486:1: ( '+' )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:486:1: ( '+' )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:487:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Operator__Alternatives1004); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:494:6: ( '-' )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:494:6: ( '-' )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:495:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Operator__Alternatives1024); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:502:6: ( '*' )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:502:6: ( '*' )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:503:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Operator__Alternatives1044); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:510:6: ( '/' )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:510:6: ( '/' )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:511:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getSolidusKeyword_3()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Operator__Alternatives1064); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getSolidusKeyword_3()); 
                    }

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Typo__Alternatives"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:523:1: rule__Typo__Alternatives : ( ( 'Number' ) | ( 'String' ) | ( 'Boolean' ) );
    public final void rule__Typo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:527:1: ( ( 'Number' ) | ( 'String' ) | ( 'Boolean' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:528:1: ( 'Number' )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:528:1: ( 'Number' )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:529:1: 'Number'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypoAccess().getNumberKeyword_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Typo__Alternatives1099); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypoAccess().getNumberKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:536:6: ( 'String' )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:536:6: ( 'String' )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:537:1: 'String'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypoAccess().getStringKeyword_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Typo__Alternatives1119); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypoAccess().getStringKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:544:6: ( 'Boolean' )
                    {
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:544:6: ( 'Boolean' )
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:545:1: 'Boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypoAccess().getBooleanKeyword_2()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Typo__Alternatives1139); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypoAccess().getBooleanKeyword_2()); 
                    }

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
    // $ANTLR end "rule__Typo__Alternatives"


    // $ANTLR start "rule__ObjectDefinition__Group__0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:559:1: rule__ObjectDefinition__Group__0 : rule__ObjectDefinition__Group__0__Impl rule__ObjectDefinition__Group__1 ;
    public final void rule__ObjectDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:563:1: ( rule__ObjectDefinition__Group__0__Impl rule__ObjectDefinition__Group__1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:564:2: rule__ObjectDefinition__Group__0__Impl rule__ObjectDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectDefinition__Group__0__Impl_in_rule__ObjectDefinition__Group__01171);
            rule__ObjectDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObjectDefinition__Group__1_in_rule__ObjectDefinition__Group__01174);
            rule__ObjectDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ObjectDefinition__Group__0"


    // $ANTLR start "rule__ObjectDefinition__Group__0__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:571:1: rule__ObjectDefinition__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ObjectDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:575:1: ( ( 'ref' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:576:1: ( 'ref' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:576:1: ( 'ref' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:577:1: 'ref'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectDefinitionAccess().getRefKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__ObjectDefinition__Group__0__Impl1202); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectDefinitionAccess().getRefKeyword_0()); 
            }

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
    // $ANTLR end "rule__ObjectDefinition__Group__0__Impl"


    // $ANTLR start "rule__ObjectDefinition__Group__1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:590:1: rule__ObjectDefinition__Group__1 : rule__ObjectDefinition__Group__1__Impl rule__ObjectDefinition__Group__2 ;
    public final void rule__ObjectDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:594:1: ( rule__ObjectDefinition__Group__1__Impl rule__ObjectDefinition__Group__2 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:595:2: rule__ObjectDefinition__Group__1__Impl rule__ObjectDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectDefinition__Group__1__Impl_in_rule__ObjectDefinition__Group__11233);
            rule__ObjectDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObjectDefinition__Group__2_in_rule__ObjectDefinition__Group__11236);
            rule__ObjectDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ObjectDefinition__Group__1"


    // $ANTLR start "rule__ObjectDefinition__Group__1__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:602:1: rule__ObjectDefinition__Group__1__Impl : ( ( rule__ObjectDefinition__NameAssignment_1 ) ) ;
    public final void rule__ObjectDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:606:1: ( ( ( rule__ObjectDefinition__NameAssignment_1 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:607:1: ( ( rule__ObjectDefinition__NameAssignment_1 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:607:1: ( ( rule__ObjectDefinition__NameAssignment_1 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:608:1: ( rule__ObjectDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectDefinitionAccess().getNameAssignment_1()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:609:1: ( rule__ObjectDefinition__NameAssignment_1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:609:2: rule__ObjectDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectDefinition__NameAssignment_1_in_rule__ObjectDefinition__Group__1__Impl1263);
            rule__ObjectDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectDefinitionAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__ObjectDefinition__Group__1__Impl"


    // $ANTLR start "rule__ObjectDefinition__Group__2"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:619:1: rule__ObjectDefinition__Group__2 : rule__ObjectDefinition__Group__2__Impl rule__ObjectDefinition__Group__3 ;
    public final void rule__ObjectDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:623:1: ( rule__ObjectDefinition__Group__2__Impl rule__ObjectDefinition__Group__3 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:624:2: rule__ObjectDefinition__Group__2__Impl rule__ObjectDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectDefinition__Group__2__Impl_in_rule__ObjectDefinition__Group__21293);
            rule__ObjectDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObjectDefinition__Group__3_in_rule__ObjectDefinition__Group__21296);
            rule__ObjectDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ObjectDefinition__Group__2"


    // $ANTLR start "rule__ObjectDefinition__Group__2__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:631:1: rule__ObjectDefinition__Group__2__Impl : ( '= object {' ) ;
    public final void rule__ObjectDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:635:1: ( ( '= object {' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:636:1: ( '= object {' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:636:1: ( '= object {' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:637:1: '= object {'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectDefinitionAccess().getObjectKeyword_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__ObjectDefinition__Group__2__Impl1324); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectDefinitionAccess().getObjectKeyword_2()); 
            }

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
    // $ANTLR end "rule__ObjectDefinition__Group__2__Impl"


    // $ANTLR start "rule__ObjectDefinition__Group__3"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:650:1: rule__ObjectDefinition__Group__3 : rule__ObjectDefinition__Group__3__Impl rule__ObjectDefinition__Group__4 ;
    public final void rule__ObjectDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:654:1: ( rule__ObjectDefinition__Group__3__Impl rule__ObjectDefinition__Group__4 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:655:2: rule__ObjectDefinition__Group__3__Impl rule__ObjectDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectDefinition__Group__3__Impl_in_rule__ObjectDefinition__Group__31355);
            rule__ObjectDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObjectDefinition__Group__4_in_rule__ObjectDefinition__Group__31358);
            rule__ObjectDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ObjectDefinition__Group__3"


    // $ANTLR start "rule__ObjectDefinition__Group__3__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:662:1: rule__ObjectDefinition__Group__3__Impl : ( ( rule__ObjectDefinition__FeaturesAssignment_3 )* ) ;
    public final void rule__ObjectDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:666:1: ( ( ( rule__ObjectDefinition__FeaturesAssignment_3 )* ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:667:1: ( ( rule__ObjectDefinition__FeaturesAssignment_3 )* )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:667:1: ( ( rule__ObjectDefinition__FeaturesAssignment_3 )* )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:668:1: ( rule__ObjectDefinition__FeaturesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectDefinitionAccess().getFeaturesAssignment_3()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:669:1: ( rule__ObjectDefinition__FeaturesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==18||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:669:2: rule__ObjectDefinition__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ObjectDefinition__FeaturesAssignment_3_in_rule__ObjectDefinition__Group__3__Impl1385);
            	    rule__ObjectDefinition__FeaturesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectDefinitionAccess().getFeaturesAssignment_3()); 
            }

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
    // $ANTLR end "rule__ObjectDefinition__Group__3__Impl"


    // $ANTLR start "rule__ObjectDefinition__Group__4"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:679:1: rule__ObjectDefinition__Group__4 : rule__ObjectDefinition__Group__4__Impl ;
    public final void rule__ObjectDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:683:1: ( rule__ObjectDefinition__Group__4__Impl )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:684:2: rule__ObjectDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ObjectDefinition__Group__4__Impl_in_rule__ObjectDefinition__Group__41416);
            rule__ObjectDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ObjectDefinition__Group__4"


    // $ANTLR start "rule__ObjectDefinition__Group__4__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:690:1: rule__ObjectDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__ObjectDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:694:1: ( ( '}' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:695:1: ( '}' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:695:1: ( '}' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:696:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__ObjectDefinition__Group__4__Impl1444); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }

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
    // $ANTLR end "rule__ObjectDefinition__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:719:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:723:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:724:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__01485);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__01488);
            rule__Property__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:731:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:735:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:736:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:736:1: ( ( rule__Property__NameAssignment_0 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:737:1: ( rule__Property__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:738:1: ( rule__Property__NameAssignment_0 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:738:2: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__0__Impl1515);
            rule__Property__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            }

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
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:748:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:752:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:753:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__11545);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__11548);
            rule__Property__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:760:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:764:1: ( ( ':' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:765:1: ( ':' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:765:1: ( ':' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:766:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Property__Group__1__Impl1576); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            }

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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:779:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:783:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:784:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__21607);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__21610);
            rule__Property__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:791:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:795:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:796:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:796:1: ( ( rule__Property__TypeAssignment_2 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:797:1: ( rule__Property__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:798:1: ( rule__Property__TypeAssignment_2 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:798:2: rule__Property__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_2_in_rule__Property__Group__2__Impl1637);
            rule__Property__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            }

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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:808:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:812:1: ( rule__Property__Group__3__Impl )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:813:2: rule__Property__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__31667);
            rule__Property__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:819:1: rule__Property__Group__3__Impl : ( ( rule__Property__Group_3__0 )? ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:823:1: ( ( ( rule__Property__Group_3__0 )? ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:824:1: ( ( rule__Property__Group_3__0 )? )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:824:1: ( ( rule__Property__Group_3__0 )? )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:825:1: ( rule__Property__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup_3()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:826:1: ( rule__Property__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:826:2: rule__Property__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_3__0_in_rule__Property__Group__3__Impl1694);
                    rule__Property__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup_3()); 
            }

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
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group_3__0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:844:1: rule__Property__Group_3__0 : rule__Property__Group_3__0__Impl rule__Property__Group_3__1 ;
    public final void rule__Property__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:848:1: ( rule__Property__Group_3__0__Impl rule__Property__Group_3__1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:849:2: rule__Property__Group_3__0__Impl rule__Property__Group_3__1
            {
            pushFollow(FOLLOW_rule__Property__Group_3__0__Impl_in_rule__Property__Group_3__01733);
            rule__Property__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_3__1_in_rule__Property__Group_3__01736);
            rule__Property__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_3__0"


    // $ANTLR start "rule__Property__Group_3__0__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:856:1: rule__Property__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Property__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:860:1: ( ( '=' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:861:1: ( '=' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:861:1: ( '=' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:862:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Property__Group_3__0__Impl1764); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_3_0()); 
            }

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
    // $ANTLR end "rule__Property__Group_3__0__Impl"


    // $ANTLR start "rule__Property__Group_3__1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:875:1: rule__Property__Group_3__1 : rule__Property__Group_3__1__Impl ;
    public final void rule__Property__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:879:1: ( rule__Property__Group_3__1__Impl )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:880:2: rule__Property__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_3__1__Impl_in_rule__Property__Group_3__11795);
            rule__Property__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_3__1"


    // $ANTLR start "rule__Property__Group_3__1__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:886:1: rule__Property__Group_3__1__Impl : ( ( rule__Property__InitialAssignment_3_1 ) ) ;
    public final void rule__Property__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:890:1: ( ( ( rule__Property__InitialAssignment_3_1 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:891:1: ( ( rule__Property__InitialAssignment_3_1 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:891:1: ( ( rule__Property__InitialAssignment_3_1 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:892:1: ( rule__Property__InitialAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getInitialAssignment_3_1()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:893:1: ( rule__Property__InitialAssignment_3_1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:893:2: rule__Property__InitialAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Property__InitialAssignment_3_1_in_rule__Property__Group_3__1__Impl1822);
            rule__Property__InitialAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getInitialAssignment_3_1()); 
            }

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
    // $ANTLR end "rule__Property__Group_3__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:907:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:911:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:912:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__01856);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__01859);
            rule__Message__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:919:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:923:1: ( ( 'message' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:924:1: ( 'message' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:924:1: ( 'message' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:925:1: 'message'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Message__Group__0__Impl1887); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            }

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
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:938:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:942:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:943:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__11918);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__11921);
            rule__Message__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:950:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:954:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:955:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:955:1: ( ( rule__Message__NameAssignment_1 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:956:1: ( rule__Message__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:957:1: ( rule__Message__NameAssignment_1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:957:2: rule__Message__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl1948);
            rule__Message__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:967:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:971:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:972:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__21978);
            rule__Message__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__21981);
            rule__Message__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:979:1: rule__Message__Group__2__Impl : ( '= method {' ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:983:1: ( ( '= method {' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:984:1: ( '= method {' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:984:1: ( '= method {' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:985:1: '= method {'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMethodKeyword_2()); 
            }
            match(input,24,FOLLOW_24_in_rule__Message__Group__2__Impl2009); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getMethodKeyword_2()); 
            }

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
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__3"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:998:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1002:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1003:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__32040);
            rule__Message__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__4_in_rule__Message__Group__32043);
            rule__Message__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1010:1: rule__Message__Group__3__Impl : ( ( rule__Message__SentencesAssignment_3 )* ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1014:1: ( ( ( rule__Message__SentencesAssignment_3 )* ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1015:1: ( ( rule__Message__SentencesAssignment_3 )* )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1015:1: ( ( rule__Message__SentencesAssignment_3 )* )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1016:1: ( rule__Message__SentencesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getSentencesAssignment_3()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1017:1: ( rule__Message__SentencesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_ID)||LA10_0==25||LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1017:2: rule__Message__SentencesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Message__SentencesAssignment_3_in_rule__Message__Group__3__Impl2070);
            	    rule__Message__SentencesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getSentencesAssignment_3()); 
            }

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
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__4"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1027:1: rule__Message__Group__4 : rule__Message__Group__4__Impl ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1031:1: ( rule__Message__Group__4__Impl )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1032:2: rule__Message__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__42101);
            rule__Message__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Message__Group__4"


    // $ANTLR start "rule__Message__Group__4__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1038:1: rule__Message__Group__4__Impl : ( '}' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1042:1: ( ( '}' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1043:1: ( '}' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1043:1: ( '}' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1044:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__Message__Group__4__Impl2129); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4()); 
            }

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
    // $ANTLR end "rule__Message__Group__4__Impl"


    // $ANTLR start "rule__Expresion__Group_2__0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1067:1: rule__Expresion__Group_2__0 : rule__Expresion__Group_2__0__Impl rule__Expresion__Group_2__1 ;
    public final void rule__Expresion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1071:1: ( rule__Expresion__Group_2__0__Impl rule__Expresion__Group_2__1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1072:2: rule__Expresion__Group_2__0__Impl rule__Expresion__Group_2__1
            {
            pushFollow(FOLLOW_rule__Expresion__Group_2__0__Impl_in_rule__Expresion__Group_2__02170);
            rule__Expresion__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expresion__Group_2__1_in_rule__Expresion__Group_2__02173);
            rule__Expresion__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expresion__Group_2__0"


    // $ANTLR start "rule__Expresion__Group_2__0__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1079:1: rule__Expresion__Group_2__0__Impl : ( ruleTerminal ) ;
    public final void rule__Expresion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1083:1: ( ( ruleTerminal ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1084:1: ( ruleTerminal )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1084:1: ( ruleTerminal )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1085:1: ruleTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTerminal_in_rule__Expresion__Group_2__0__Impl2200);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Expresion__Group_2__0__Impl"


    // $ANTLR start "rule__Expresion__Group_2__1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1096:1: rule__Expresion__Group_2__1 : rule__Expresion__Group_2__1__Impl ;
    public final void rule__Expresion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1100:1: ( rule__Expresion__Group_2__1__Impl )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1101:2: rule__Expresion__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Expresion__Group_2__1__Impl_in_rule__Expresion__Group_2__12229);
            rule__Expresion__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expresion__Group_2__1"


    // $ANTLR start "rule__Expresion__Group_2__1__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1107:1: rule__Expresion__Group_2__1__Impl : ( ( rule__Expresion__Group_2_1__0 )* ) ;
    public final void rule__Expresion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1111:1: ( ( ( rule__Expresion__Group_2_1__0 )* ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1112:1: ( ( rule__Expresion__Group_2_1__0 )* )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1112:1: ( ( rule__Expresion__Group_2_1__0 )* )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1113:1: ( rule__Expresion__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpresionAccess().getGroup_2_1()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1114:1: ( rule__Expresion__Group_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=14)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1114:2: rule__Expresion__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expresion__Group_2_1__0_in_rule__Expresion__Group_2__1__Impl2256);
            	    rule__Expresion__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpresionAccess().getGroup_2_1()); 
            }

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
    // $ANTLR end "rule__Expresion__Group_2__1__Impl"


    // $ANTLR start "rule__Expresion__Group_2_1__0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1128:1: rule__Expresion__Group_2_1__0 : rule__Expresion__Group_2_1__0__Impl rule__Expresion__Group_2_1__1 ;
    public final void rule__Expresion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1132:1: ( rule__Expresion__Group_2_1__0__Impl rule__Expresion__Group_2_1__1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1133:2: rule__Expresion__Group_2_1__0__Impl rule__Expresion__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Expresion__Group_2_1__0__Impl_in_rule__Expresion__Group_2_1__02291);
            rule__Expresion__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expresion__Group_2_1__1_in_rule__Expresion__Group_2_1__02294);
            rule__Expresion__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expresion__Group_2_1__0"


    // $ANTLR start "rule__Expresion__Group_2_1__0__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1140:1: rule__Expresion__Group_2_1__0__Impl : ( ruleOperator ) ;
    public final void rule__Expresion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1144:1: ( ( ruleOperator ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1145:1: ( ruleOperator )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1145:1: ( ruleOperator )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1146:1: ruleOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpresionAccess().getOperatorParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperator_in_rule__Expresion__Group_2_1__0__Impl2321);
            ruleOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpresionAccess().getOperatorParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__Expresion__Group_2_1__0__Impl"


    // $ANTLR start "rule__Expresion__Group_2_1__1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1157:1: rule__Expresion__Group_2_1__1 : rule__Expresion__Group_2_1__1__Impl ;
    public final void rule__Expresion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1161:1: ( rule__Expresion__Group_2_1__1__Impl )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1162:2: rule__Expresion__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expresion__Group_2_1__1__Impl_in_rule__Expresion__Group_2_1__12350);
            rule__Expresion__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Expresion__Group_2_1__1"


    // $ANTLR start "rule__Expresion__Group_2_1__1__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1168:1: rule__Expresion__Group_2_1__1__Impl : ( ruleTerminal ) ;
    public final void rule__Expresion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1172:1: ( ( ruleTerminal ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1173:1: ( ruleTerminal )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1173:1: ( ruleTerminal )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1174:1: ruleTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_1_1()); 
            }
            pushFollow(FOLLOW_ruleTerminal_in_rule__Expresion__Group_2_1__1__Impl2377);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_1_1()); 
            }

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
    // $ANTLR end "rule__Expresion__Group_2_1__1__Impl"


    // $ANTLR start "rule__IfExpresion__Group__0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1189:1: rule__IfExpresion__Group__0 : rule__IfExpresion__Group__0__Impl rule__IfExpresion__Group__1 ;
    public final void rule__IfExpresion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1193:1: ( rule__IfExpresion__Group__0__Impl rule__IfExpresion__Group__1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1194:2: rule__IfExpresion__Group__0__Impl rule__IfExpresion__Group__1
            {
            pushFollow(FOLLOW_rule__IfExpresion__Group__0__Impl_in_rule__IfExpresion__Group__02410);
            rule__IfExpresion__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfExpresion__Group__1_in_rule__IfExpresion__Group__02413);
            rule__IfExpresion__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfExpresion__Group__0"


    // $ANTLR start "rule__IfExpresion__Group__0__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1201:1: rule__IfExpresion__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfExpresion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1205:1: ( ( 'if' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1206:1: ( 'if' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1206:1: ( 'if' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1207:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getIfKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__IfExpresion__Group__0__Impl2441); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getIfKeyword_0()); 
            }

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
    // $ANTLR end "rule__IfExpresion__Group__0__Impl"


    // $ANTLR start "rule__IfExpresion__Group__1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1220:1: rule__IfExpresion__Group__1 : rule__IfExpresion__Group__1__Impl rule__IfExpresion__Group__2 ;
    public final void rule__IfExpresion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1224:1: ( rule__IfExpresion__Group__1__Impl rule__IfExpresion__Group__2 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1225:2: rule__IfExpresion__Group__1__Impl rule__IfExpresion__Group__2
            {
            pushFollow(FOLLOW_rule__IfExpresion__Group__1__Impl_in_rule__IfExpresion__Group__12472);
            rule__IfExpresion__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfExpresion__Group__2_in_rule__IfExpresion__Group__12475);
            rule__IfExpresion__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfExpresion__Group__1"


    // $ANTLR start "rule__IfExpresion__Group__1__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1232:1: rule__IfExpresion__Group__1__Impl : ( ( rule__IfExpresion__ConditionAssignment_1 ) ) ;
    public final void rule__IfExpresion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1236:1: ( ( ( rule__IfExpresion__ConditionAssignment_1 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1237:1: ( ( rule__IfExpresion__ConditionAssignment_1 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1237:1: ( ( rule__IfExpresion__ConditionAssignment_1 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1238:1: ( rule__IfExpresion__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getConditionAssignment_1()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1239:1: ( rule__IfExpresion__ConditionAssignment_1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1239:2: rule__IfExpresion__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__IfExpresion__ConditionAssignment_1_in_rule__IfExpresion__Group__1__Impl2502);
            rule__IfExpresion__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getConditionAssignment_1()); 
            }

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
    // $ANTLR end "rule__IfExpresion__Group__1__Impl"


    // $ANTLR start "rule__IfExpresion__Group__2"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1249:1: rule__IfExpresion__Group__2 : rule__IfExpresion__Group__2__Impl rule__IfExpresion__Group__3 ;
    public final void rule__IfExpresion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1253:1: ( rule__IfExpresion__Group__2__Impl rule__IfExpresion__Group__3 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1254:2: rule__IfExpresion__Group__2__Impl rule__IfExpresion__Group__3
            {
            pushFollow(FOLLOW_rule__IfExpresion__Group__2__Impl_in_rule__IfExpresion__Group__22532);
            rule__IfExpresion__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfExpresion__Group__3_in_rule__IfExpresion__Group__22535);
            rule__IfExpresion__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfExpresion__Group__2"


    // $ANTLR start "rule__IfExpresion__Group__2__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1261:1: rule__IfExpresion__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfExpresion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1265:1: ( ( 'then' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1266:1: ( 'then' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1266:1: ( 'then' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1267:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getThenKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__IfExpresion__Group__2__Impl2563); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getThenKeyword_2()); 
            }

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
    // $ANTLR end "rule__IfExpresion__Group__2__Impl"


    // $ANTLR start "rule__IfExpresion__Group__3"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1280:1: rule__IfExpresion__Group__3 : rule__IfExpresion__Group__3__Impl rule__IfExpresion__Group__4 ;
    public final void rule__IfExpresion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1284:1: ( rule__IfExpresion__Group__3__Impl rule__IfExpresion__Group__4 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1285:2: rule__IfExpresion__Group__3__Impl rule__IfExpresion__Group__4
            {
            pushFollow(FOLLOW_rule__IfExpresion__Group__3__Impl_in_rule__IfExpresion__Group__32594);
            rule__IfExpresion__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfExpresion__Group__4_in_rule__IfExpresion__Group__32597);
            rule__IfExpresion__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfExpresion__Group__3"


    // $ANTLR start "rule__IfExpresion__Group__3__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1292:1: rule__IfExpresion__Group__3__Impl : ( ( rule__IfExpresion__ThenAssignment_3 ) ) ;
    public final void rule__IfExpresion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1296:1: ( ( ( rule__IfExpresion__ThenAssignment_3 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1297:1: ( ( rule__IfExpresion__ThenAssignment_3 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1297:1: ( ( rule__IfExpresion__ThenAssignment_3 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1298:1: ( rule__IfExpresion__ThenAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getThenAssignment_3()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1299:1: ( rule__IfExpresion__ThenAssignment_3 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1299:2: rule__IfExpresion__ThenAssignment_3
            {
            pushFollow(FOLLOW_rule__IfExpresion__ThenAssignment_3_in_rule__IfExpresion__Group__3__Impl2624);
            rule__IfExpresion__ThenAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getThenAssignment_3()); 
            }

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
    // $ANTLR end "rule__IfExpresion__Group__3__Impl"


    // $ANTLR start "rule__IfExpresion__Group__4"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1309:1: rule__IfExpresion__Group__4 : rule__IfExpresion__Group__4__Impl ;
    public final void rule__IfExpresion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1313:1: ( rule__IfExpresion__Group__4__Impl )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1314:2: rule__IfExpresion__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__IfExpresion__Group__4__Impl_in_rule__IfExpresion__Group__42654);
            rule__IfExpresion__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfExpresion__Group__4"


    // $ANTLR start "rule__IfExpresion__Group__4__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1320:1: rule__IfExpresion__Group__4__Impl : ( ( rule__IfExpresion__Group_4__0 )? ) ;
    public final void rule__IfExpresion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1324:1: ( ( ( rule__IfExpresion__Group_4__0 )? ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1325:1: ( ( rule__IfExpresion__Group_4__0 )? )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1325:1: ( ( rule__IfExpresion__Group_4__0 )? )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1326:1: ( rule__IfExpresion__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getGroup_4()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1327:1: ( rule__IfExpresion__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred19_InternalHOOPL()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1327:2: rule__IfExpresion__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__IfExpresion__Group_4__0_in_rule__IfExpresion__Group__4__Impl2681);
                    rule__IfExpresion__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__IfExpresion__Group__4__Impl"


    // $ANTLR start "rule__IfExpresion__Group_4__0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1347:1: rule__IfExpresion__Group_4__0 : rule__IfExpresion__Group_4__0__Impl rule__IfExpresion__Group_4__1 ;
    public final void rule__IfExpresion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1351:1: ( rule__IfExpresion__Group_4__0__Impl rule__IfExpresion__Group_4__1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1352:2: rule__IfExpresion__Group_4__0__Impl rule__IfExpresion__Group_4__1
            {
            pushFollow(FOLLOW_rule__IfExpresion__Group_4__0__Impl_in_rule__IfExpresion__Group_4__02722);
            rule__IfExpresion__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfExpresion__Group_4__1_in_rule__IfExpresion__Group_4__02725);
            rule__IfExpresion__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfExpresion__Group_4__0"


    // $ANTLR start "rule__IfExpresion__Group_4__0__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1359:1: rule__IfExpresion__Group_4__0__Impl : ( ( 'else' ) ) ;
    public final void rule__IfExpresion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1363:1: ( ( ( 'else' ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1364:1: ( ( 'else' ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1364:1: ( ( 'else' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1365:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getElseKeyword_4_0()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1366:1: ( 'else' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1367:2: 'else'
            {
            match(input,27,FOLLOW_27_in_rule__IfExpresion__Group_4__0__Impl2754); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getElseKeyword_4_0()); 
            }

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
    // $ANTLR end "rule__IfExpresion__Group_4__0__Impl"


    // $ANTLR start "rule__IfExpresion__Group_4__1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1378:1: rule__IfExpresion__Group_4__1 : rule__IfExpresion__Group_4__1__Impl ;
    public final void rule__IfExpresion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1382:1: ( rule__IfExpresion__Group_4__1__Impl )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1383:2: rule__IfExpresion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExpresion__Group_4__1__Impl_in_rule__IfExpresion__Group_4__12786);
            rule__IfExpresion__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfExpresion__Group_4__1"


    // $ANTLR start "rule__IfExpresion__Group_4__1__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1389:1: rule__IfExpresion__Group_4__1__Impl : ( ( rule__IfExpresion__ElseAssignment_4_1 ) ) ;
    public final void rule__IfExpresion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1393:1: ( ( ( rule__IfExpresion__ElseAssignment_4_1 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1394:1: ( ( rule__IfExpresion__ElseAssignment_4_1 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1394:1: ( ( rule__IfExpresion__ElseAssignment_4_1 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1395:1: ( rule__IfExpresion__ElseAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getElseAssignment_4_1()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1396:1: ( rule__IfExpresion__ElseAssignment_4_1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1396:2: rule__IfExpresion__ElseAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IfExpresion__ElseAssignment_4_1_in_rule__IfExpresion__Group_4__1__Impl2813);
            rule__IfExpresion__ElseAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getElseAssignment_4_1()); 
            }

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
    // $ANTLR end "rule__IfExpresion__Group_4__1__Impl"


    // $ANTLR start "rule__WhileExpresion__Group__0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1410:1: rule__WhileExpresion__Group__0 : rule__WhileExpresion__Group__0__Impl rule__WhileExpresion__Group__1 ;
    public final void rule__WhileExpresion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1414:1: ( rule__WhileExpresion__Group__0__Impl rule__WhileExpresion__Group__1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1415:2: rule__WhileExpresion__Group__0__Impl rule__WhileExpresion__Group__1
            {
            pushFollow(FOLLOW_rule__WhileExpresion__Group__0__Impl_in_rule__WhileExpresion__Group__02847);
            rule__WhileExpresion__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WhileExpresion__Group__1_in_rule__WhileExpresion__Group__02850);
            rule__WhileExpresion__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WhileExpresion__Group__0"


    // $ANTLR start "rule__WhileExpresion__Group__0__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1422:1: rule__WhileExpresion__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileExpresion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1426:1: ( ( 'while' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1427:1: ( 'while' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1427:1: ( 'while' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1428:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileExpresionAccess().getWhileKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__WhileExpresion__Group__0__Impl2878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileExpresionAccess().getWhileKeyword_0()); 
            }

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
    // $ANTLR end "rule__WhileExpresion__Group__0__Impl"


    // $ANTLR start "rule__WhileExpresion__Group__1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1441:1: rule__WhileExpresion__Group__1 : rule__WhileExpresion__Group__1__Impl rule__WhileExpresion__Group__2 ;
    public final void rule__WhileExpresion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1445:1: ( rule__WhileExpresion__Group__1__Impl rule__WhileExpresion__Group__2 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1446:2: rule__WhileExpresion__Group__1__Impl rule__WhileExpresion__Group__2
            {
            pushFollow(FOLLOW_rule__WhileExpresion__Group__1__Impl_in_rule__WhileExpresion__Group__12909);
            rule__WhileExpresion__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WhileExpresion__Group__2_in_rule__WhileExpresion__Group__12912);
            rule__WhileExpresion__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WhileExpresion__Group__1"


    // $ANTLR start "rule__WhileExpresion__Group__1__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1453:1: rule__WhileExpresion__Group__1__Impl : ( ( rule__WhileExpresion__ConditionAssignment_1 ) ) ;
    public final void rule__WhileExpresion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1457:1: ( ( ( rule__WhileExpresion__ConditionAssignment_1 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1458:1: ( ( rule__WhileExpresion__ConditionAssignment_1 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1458:1: ( ( rule__WhileExpresion__ConditionAssignment_1 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1459:1: ( rule__WhileExpresion__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileExpresionAccess().getConditionAssignment_1()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1460:1: ( rule__WhileExpresion__ConditionAssignment_1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1460:2: rule__WhileExpresion__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__WhileExpresion__ConditionAssignment_1_in_rule__WhileExpresion__Group__1__Impl2939);
            rule__WhileExpresion__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileExpresionAccess().getConditionAssignment_1()); 
            }

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
    // $ANTLR end "rule__WhileExpresion__Group__1__Impl"


    // $ANTLR start "rule__WhileExpresion__Group__2"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1470:1: rule__WhileExpresion__Group__2 : rule__WhileExpresion__Group__2__Impl rule__WhileExpresion__Group__3 ;
    public final void rule__WhileExpresion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1474:1: ( rule__WhileExpresion__Group__2__Impl rule__WhileExpresion__Group__3 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1475:2: rule__WhileExpresion__Group__2__Impl rule__WhileExpresion__Group__3
            {
            pushFollow(FOLLOW_rule__WhileExpresion__Group__2__Impl_in_rule__WhileExpresion__Group__22969);
            rule__WhileExpresion__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WhileExpresion__Group__3_in_rule__WhileExpresion__Group__22972);
            rule__WhileExpresion__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WhileExpresion__Group__2"


    // $ANTLR start "rule__WhileExpresion__Group__2__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1482:1: rule__WhileExpresion__Group__2__Impl : ( '{' ) ;
    public final void rule__WhileExpresion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1486:1: ( ( '{' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1487:1: ( '{' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1487:1: ( '{' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1488:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileExpresionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__WhileExpresion__Group__2__Impl3000); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileExpresionAccess().getLeftCurlyBracketKeyword_2()); 
            }

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
    // $ANTLR end "rule__WhileExpresion__Group__2__Impl"


    // $ANTLR start "rule__WhileExpresion__Group__3"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1501:1: rule__WhileExpresion__Group__3 : rule__WhileExpresion__Group__3__Impl rule__WhileExpresion__Group__4 ;
    public final void rule__WhileExpresion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1505:1: ( rule__WhileExpresion__Group__3__Impl rule__WhileExpresion__Group__4 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1506:2: rule__WhileExpresion__Group__3__Impl rule__WhileExpresion__Group__4
            {
            pushFollow(FOLLOW_rule__WhileExpresion__Group__3__Impl_in_rule__WhileExpresion__Group__33031);
            rule__WhileExpresion__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WhileExpresion__Group__4_in_rule__WhileExpresion__Group__33034);
            rule__WhileExpresion__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WhileExpresion__Group__3"


    // $ANTLR start "rule__WhileExpresion__Group__3__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1513:1: rule__WhileExpresion__Group__3__Impl : ( ( rule__WhileExpresion__SentencesAssignment_3 )* ) ;
    public final void rule__WhileExpresion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1517:1: ( ( ( rule__WhileExpresion__SentencesAssignment_3 )* ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1518:1: ( ( rule__WhileExpresion__SentencesAssignment_3 )* )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1518:1: ( ( rule__WhileExpresion__SentencesAssignment_3 )* )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1519:1: ( rule__WhileExpresion__SentencesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileExpresionAccess().getSentencesAssignment_3()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1520:1: ( rule__WhileExpresion__SentencesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_ID)||LA13_0==25||LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1520:2: rule__WhileExpresion__SentencesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__WhileExpresion__SentencesAssignment_3_in_rule__WhileExpresion__Group__3__Impl3061);
            	    rule__WhileExpresion__SentencesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileExpresionAccess().getSentencesAssignment_3()); 
            }

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
    // $ANTLR end "rule__WhileExpresion__Group__3__Impl"


    // $ANTLR start "rule__WhileExpresion__Group__4"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1530:1: rule__WhileExpresion__Group__4 : rule__WhileExpresion__Group__4__Impl ;
    public final void rule__WhileExpresion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1534:1: ( rule__WhileExpresion__Group__4__Impl )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1535:2: rule__WhileExpresion__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__WhileExpresion__Group__4__Impl_in_rule__WhileExpresion__Group__43092);
            rule__WhileExpresion__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WhileExpresion__Group__4"


    // $ANTLR start "rule__WhileExpresion__Group__4__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1541:1: rule__WhileExpresion__Group__4__Impl : ( '}' ) ;
    public final void rule__WhileExpresion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1545:1: ( ( '}' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1546:1: ( '}' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1546:1: ( '}' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1547:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileExpresionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__WhileExpresion__Group__4__Impl3120); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileExpresionAccess().getRightCurlyBracketKeyword_4()); 
            }

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
    // $ANTLR end "rule__WhileExpresion__Group__4__Impl"


    // $ANTLR start "rule__Terminal__Group_3__0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1570:1: rule__Terminal__Group_3__0 : rule__Terminal__Group_3__0__Impl rule__Terminal__Group_3__1 ;
    public final void rule__Terminal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1574:1: ( rule__Terminal__Group_3__0__Impl rule__Terminal__Group_3__1 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1575:2: rule__Terminal__Group_3__0__Impl rule__Terminal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Terminal__Group_3__0__Impl_in_rule__Terminal__Group_3__03161);
            rule__Terminal__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Terminal__Group_3__1_in_rule__Terminal__Group_3__03164);
            rule__Terminal__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Terminal__Group_3__0"


    // $ANTLR start "rule__Terminal__Group_3__0__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1582:1: rule__Terminal__Group_3__0__Impl : ( RULE_INT ) ;
    public final void rule__Terminal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1586:1: ( ( RULE_INT ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1587:1: ( RULE_INT )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1587:1: ( RULE_INT )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1588:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Terminal__Group_3__0__Impl3191); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__Terminal__Group_3__0__Impl"


    // $ANTLR start "rule__Terminal__Group_3__1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1599:1: rule__Terminal__Group_3__1 : rule__Terminal__Group_3__1__Impl rule__Terminal__Group_3__2 ;
    public final void rule__Terminal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1603:1: ( rule__Terminal__Group_3__1__Impl rule__Terminal__Group_3__2 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1604:2: rule__Terminal__Group_3__1__Impl rule__Terminal__Group_3__2
            {
            pushFollow(FOLLOW_rule__Terminal__Group_3__1__Impl_in_rule__Terminal__Group_3__13220);
            rule__Terminal__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Terminal__Group_3__2_in_rule__Terminal__Group_3__13223);
            rule__Terminal__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Terminal__Group_3__1"


    // $ANTLR start "rule__Terminal__Group_3__1__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1611:1: rule__Terminal__Group_3__1__Impl : ( '..' ) ;
    public final void rule__Terminal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1615:1: ( ( '..' ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1616:1: ( '..' )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1616:1: ( '..' )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1617:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_3_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Terminal__Group_3__1__Impl3251); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_3_1()); 
            }

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
    // $ANTLR end "rule__Terminal__Group_3__1__Impl"


    // $ANTLR start "rule__Terminal__Group_3__2"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1630:1: rule__Terminal__Group_3__2 : rule__Terminal__Group_3__2__Impl ;
    public final void rule__Terminal__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1634:1: ( rule__Terminal__Group_3__2__Impl )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1635:2: rule__Terminal__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Terminal__Group_3__2__Impl_in_rule__Terminal__Group_3__23282);
            rule__Terminal__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Terminal__Group_3__2"


    // $ANTLR start "rule__Terminal__Group_3__2__Impl"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1641:1: rule__Terminal__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__Terminal__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1645:1: ( ( RULE_INT ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1646:1: ( RULE_INT )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1646:1: ( RULE_INT )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1647:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_3_2()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Terminal__Group_3__2__Impl3309); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_3_2()); 
            }

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
    // $ANTLR end "rule__Terminal__Group_3__2__Impl"


    // $ANTLR start "rule__Program__ObjectsAssignment"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1665:1: rule__Program__ObjectsAssignment : ( ( rule__Program__ObjectsAlternatives_0 ) ) ;
    public final void rule__Program__ObjectsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1669:1: ( ( ( rule__Program__ObjectsAlternatives_0 ) ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1670:1: ( ( rule__Program__ObjectsAlternatives_0 ) )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1670:1: ( ( rule__Program__ObjectsAlternatives_0 ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1671:1: ( rule__Program__ObjectsAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getObjectsAlternatives_0()); 
            }
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1672:1: ( rule__Program__ObjectsAlternatives_0 )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1672:2: rule__Program__ObjectsAlternatives_0
            {
            pushFollow(FOLLOW_rule__Program__ObjectsAlternatives_0_in_rule__Program__ObjectsAssignment3349);
            rule__Program__ObjectsAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getObjectsAlternatives_0()); 
            }

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
    // $ANTLR end "rule__Program__ObjectsAssignment"


    // $ANTLR start "rule__ObjectDefinition__NameAssignment_1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1681:1: rule__ObjectDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1685:1: ( ( RULE_ID ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1686:1: ( RULE_ID )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1686:1: ( RULE_ID )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1687:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectDefinition__NameAssignment_13382); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__ObjectDefinition__NameAssignment_1"


    // $ANTLR start "rule__ObjectDefinition__FeaturesAssignment_3"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1696:1: rule__ObjectDefinition__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__ObjectDefinition__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1700:1: ( ( ruleFeature ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1701:1: ( ruleFeature )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1701:1: ( ruleFeature )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1702:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectDefinitionAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_rule__ObjectDefinition__FeaturesAssignment_33413);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectDefinitionAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__ObjectDefinition__FeaturesAssignment_3"


    // $ANTLR start "rule__Property__NameAssignment_0"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1711:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1715:1: ( ( RULE_ID ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1716:1: ( RULE_ID )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1716:1: ( RULE_ID )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1717:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_03444); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Property__TypeAssignment_2"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1726:1: rule__Property__TypeAssignment_2 : ( ruleTypo ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1730:1: ( ( ruleTypo ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1731:1: ( ruleTypo )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1731:1: ( ruleTypo )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1732:1: ruleTypo
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTypoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTypo_in_rule__Property__TypeAssignment_23475);
            ruleTypo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeTypoParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Property__TypeAssignment_2"


    // $ANTLR start "rule__Property__InitialAssignment_3_1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1741:1: rule__Property__InitialAssignment_3_1 : ( ruleTerminal ) ;
    public final void rule__Property__InitialAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1745:1: ( ( ruleTerminal ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1746:1: ( ruleTerminal )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1746:1: ( ruleTerminal )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1747:1: ruleTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getInitialTerminalParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleTerminal_in_rule__Property__InitialAssignment_3_13506);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getInitialTerminalParserRuleCall_3_1_0()); 
            }

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
    // $ANTLR end "rule__Property__InitialAssignment_3_1"


    // $ANTLR start "rule__Message__NameAssignment_1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1756:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1760:1: ( ( RULE_ID ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1761:1: ( RULE_ID )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1761:1: ( RULE_ID )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1762:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_13537); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Message__NameAssignment_1"


    // $ANTLR start "rule__Message__SentencesAssignment_3"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1771:1: rule__Message__SentencesAssignment_3 : ( ruleExpresion ) ;
    public final void rule__Message__SentencesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1775:1: ( ( ruleExpresion ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1776:1: ( ruleExpresion )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1776:1: ( ruleExpresion )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1777:1: ruleExpresion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getSentencesExpresionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpresion_in_rule__Message__SentencesAssignment_33568);
            ruleExpresion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getSentencesExpresionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__Message__SentencesAssignment_3"


    // $ANTLR start "rule__IfExpresion__ConditionAssignment_1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1786:1: rule__IfExpresion__ConditionAssignment_1 : ( ruleExpresion ) ;
    public final void rule__IfExpresion__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1790:1: ( ( ruleExpresion ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1791:1: ( ruleExpresion )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1791:1: ( ruleExpresion )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1792:1: ruleExpresion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getConditionExpresionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpresion_in_rule__IfExpresion__ConditionAssignment_13599);
            ruleExpresion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getConditionExpresionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__IfExpresion__ConditionAssignment_1"


    // $ANTLR start "rule__IfExpresion__ThenAssignment_3"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1801:1: rule__IfExpresion__ThenAssignment_3 : ( ruleExpresion ) ;
    public final void rule__IfExpresion__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1805:1: ( ( ruleExpresion ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1806:1: ( ruleExpresion )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1806:1: ( ruleExpresion )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1807:1: ruleExpresion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getThenExpresionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpresion_in_rule__IfExpresion__ThenAssignment_33630);
            ruleExpresion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getThenExpresionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__IfExpresion__ThenAssignment_3"


    // $ANTLR start "rule__IfExpresion__ElseAssignment_4_1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1816:1: rule__IfExpresion__ElseAssignment_4_1 : ( ruleExpresion ) ;
    public final void rule__IfExpresion__ElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1820:1: ( ( ruleExpresion ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1821:1: ( ruleExpresion )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1821:1: ( ruleExpresion )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1822:1: ruleExpresion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpresionAccess().getElseExpresionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpresion_in_rule__IfExpresion__ElseAssignment_4_13661);
            ruleExpresion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpresionAccess().getElseExpresionParserRuleCall_4_1_0()); 
            }

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
    // $ANTLR end "rule__IfExpresion__ElseAssignment_4_1"


    // $ANTLR start "rule__WhileExpresion__ConditionAssignment_1"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1831:1: rule__WhileExpresion__ConditionAssignment_1 : ( ruleExpresion ) ;
    public final void rule__WhileExpresion__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1835:1: ( ( ruleExpresion ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1836:1: ( ruleExpresion )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1836:1: ( ruleExpresion )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1837:1: ruleExpresion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileExpresionAccess().getConditionExpresionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpresion_in_rule__WhileExpresion__ConditionAssignment_13692);
            ruleExpresion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileExpresionAccess().getConditionExpresionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__WhileExpresion__ConditionAssignment_1"


    // $ANTLR start "rule__WhileExpresion__SentencesAssignment_3"
    // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1846:1: rule__WhileExpresion__SentencesAssignment_3 : ( ruleExpresion ) ;
    public final void rule__WhileExpresion__SentencesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1850:1: ( ( ruleExpresion ) )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1851:1: ( ruleExpresion )
            {
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1851:1: ( ruleExpresion )
            // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1852:1: ruleExpresion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileExpresionAccess().getSentencesExpresionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpresion_in_rule__WhileExpresion__SentencesAssignment_33723);
            ruleExpresion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileExpresionAccess().getSentencesExpresionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__WhileExpresion__SentencesAssignment_3"

    // $ANTLR start synpred19_InternalHOOPL
    public final void synpred19_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1327:2: ( rule__IfExpresion__Group_4__0 )
        // ../org.uqbar.hoope.ui/src-gen/org/uqbar/hoope/ui/contentassist/antlr/internal/InternalHOOPL.g:1327:2: rule__IfExpresion__Group_4__0
        {
        pushFollow(FOLLOW_rule__IfExpresion__Group_4__0_in_synpred19_InternalHOOPL2681);
        rule__IfExpresion__Group_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalHOOPL

    // Delegated rules

    public final boolean synpred19_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ObjectsAssignment_in_ruleProgram100 = new BitSet(new long[]{0x0000000012040072L});
    public static final BitSet FOLLOW_ruleObjectDefinition_in_entryRuleObjectDefinition128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDefinition135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__Group__0_in_ruleObjectDefinition161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpresion_in_entryRuleExpresion368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpresion375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expresion__Alternatives_in_ruleExpresion401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpresion_in_entryRuleIfExpresion428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpresion435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group__0_in_ruleIfExpresion461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileExpresion_in_entryRuleWhileExpresion488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileExpresion495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileExpresion__Group__0_in_ruleWhileExpresion521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_entryRuleTerminal548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Alternatives_in_ruleTerminal581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypo_in_entryRuleTypo668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypo675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typo__Alternatives_in_ruleTypo701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpresion_in_rule__Program__ObjectsAlternatives_0737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDefinition_in_rule__Program__ObjectsAlternatives_0754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDefinition_in_rule__Feature__Alternatives786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Feature__Alternatives803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Feature__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileExpresion_in_rule__Expresion__Alternatives852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpresion_in_rule__Expresion__Alternatives869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expresion__Group_2__0_in_rule__Expresion__Alternatives886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Terminal__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Terminal__Alternatives936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminal__Alternatives953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_3__0_in_rule__Terminal__Alternatives970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Operator__Alternatives1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Operator__Alternatives1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Operator__Alternatives1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Operator__Alternatives1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Typo__Alternatives1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Typo__Alternatives1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Typo__Alternatives1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__Group__0__Impl_in_rule__ObjectDefinition__Group__01171 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__Group__1_in_rule__ObjectDefinition__Group__01174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ObjectDefinition__Group__0__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__Group__1__Impl_in_rule__ObjectDefinition__Group__11233 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__Group__2_in_rule__ObjectDefinition__Group__11236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__NameAssignment_1_in_rule__ObjectDefinition__Group__1__Impl1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__Group__2__Impl_in_rule__ObjectDefinition__Group__21293 = new BitSet(new long[]{0x0000000012940070L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__Group__3_in_rule__ObjectDefinition__Group__21296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ObjectDefinition__Group__2__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__Group__3__Impl_in_rule__ObjectDefinition__Group__31355 = new BitSet(new long[]{0x0000000012940070L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__Group__4_in_rule__ObjectDefinition__Group__31358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__FeaturesAssignment_3_in_rule__ObjectDefinition__Group__3__Impl1385 = new BitSet(new long[]{0x0000000012840072L});
    public static final BitSet FOLLOW_rule__ObjectDefinition__Group__4__Impl_in_rule__ObjectDefinition__Group__41416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ObjectDefinition__Group__4__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__01485 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__01488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__0__Impl1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__11545 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__11548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Property__Group__1__Impl1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__21607 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__21610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_2_in_rule__Property__Group__2__Impl1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__31667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__0_in_rule__Property__Group__3__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__0__Impl_in_rule__Property__Group_3__01733 = new BitSet(new long[]{0x0000000012000070L});
    public static final BitSet FOLLOW_rule__Property__Group_3__1_in_rule__Property__Group_3__01736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Property__Group_3__0__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__1__Impl_in_rule__Property__Group_3__11795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__InitialAssignment_3_1_in_rule__Property__Group_3__1__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__01856 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__01859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Message__Group__0__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__11918 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_1_in_rule__Message__Group__1__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__21978 = new BitSet(new long[]{0x0000000012100070L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__21981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Message__Group__2__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__32040 = new BitSet(new long[]{0x0000000012100070L});
    public static final BitSet FOLLOW_rule__Message__Group__4_in_rule__Message__Group__32043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__SentencesAssignment_3_in_rule__Message__Group__3__Impl2070 = new BitSet(new long[]{0x0000000012000072L});
    public static final BitSet FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__42101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Message__Group__4__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expresion__Group_2__0__Impl_in_rule__Expresion__Group_2__02170 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Expresion__Group_2__1_in_rule__Expresion__Group_2__02173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_rule__Expresion__Group_2__0__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expresion__Group_2__1__Impl_in_rule__Expresion__Group_2__12229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expresion__Group_2_1__0_in_rule__Expresion__Group_2__1__Impl2256 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_rule__Expresion__Group_2_1__0__Impl_in_rule__Expresion__Group_2_1__02291 = new BitSet(new long[]{0x0000000012000070L});
    public static final BitSet FOLLOW_rule__Expresion__Group_2_1__1_in_rule__Expresion__Group_2_1__02294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__Expresion__Group_2_1__0__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expresion__Group_2_1__1__Impl_in_rule__Expresion__Group_2_1__12350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_rule__Expresion__Group_2_1__1__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group__0__Impl_in_rule__IfExpresion__Group__02410 = new BitSet(new long[]{0x0000000012000070L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group__1_in_rule__IfExpresion__Group__02413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IfExpresion__Group__0__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group__1__Impl_in_rule__IfExpresion__Group__12472 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group__2_in_rule__IfExpresion__Group__12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__ConditionAssignment_1_in_rule__IfExpresion__Group__1__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group__2__Impl_in_rule__IfExpresion__Group__22532 = new BitSet(new long[]{0x0000000012000070L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group__3_in_rule__IfExpresion__Group__22535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IfExpresion__Group__2__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group__3__Impl_in_rule__IfExpresion__Group__32594 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group__4_in_rule__IfExpresion__Group__32597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__ThenAssignment_3_in_rule__IfExpresion__Group__3__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group__4__Impl_in_rule__IfExpresion__Group__42654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group_4__0_in_rule__IfExpresion__Group__4__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group_4__0__Impl_in_rule__IfExpresion__Group_4__02722 = new BitSet(new long[]{0x0000000012000070L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group_4__1_in_rule__IfExpresion__Group_4__02725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__IfExpresion__Group_4__0__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group_4__1__Impl_in_rule__IfExpresion__Group_4__12786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__ElseAssignment_4_1_in_rule__IfExpresion__Group_4__1__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileExpresion__Group__0__Impl_in_rule__WhileExpresion__Group__02847 = new BitSet(new long[]{0x0000000012000070L});
    public static final BitSet FOLLOW_rule__WhileExpresion__Group__1_in_rule__WhileExpresion__Group__02850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__WhileExpresion__Group__0__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileExpresion__Group__1__Impl_in_rule__WhileExpresion__Group__12909 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__WhileExpresion__Group__2_in_rule__WhileExpresion__Group__12912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileExpresion__ConditionAssignment_1_in_rule__WhileExpresion__Group__1__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileExpresion__Group__2__Impl_in_rule__WhileExpresion__Group__22969 = new BitSet(new long[]{0x0000000012100070L});
    public static final BitSet FOLLOW_rule__WhileExpresion__Group__3_in_rule__WhileExpresion__Group__22972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__WhileExpresion__Group__2__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileExpresion__Group__3__Impl_in_rule__WhileExpresion__Group__33031 = new BitSet(new long[]{0x0000000012100070L});
    public static final BitSet FOLLOW_rule__WhileExpresion__Group__4_in_rule__WhileExpresion__Group__33034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileExpresion__SentencesAssignment_3_in_rule__WhileExpresion__Group__3__Impl3061 = new BitSet(new long[]{0x0000000012000072L});
    public static final BitSet FOLLOW_rule__WhileExpresion__Group__4__Impl_in_rule__WhileExpresion__Group__43092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__WhileExpresion__Group__4__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_3__0__Impl_in_rule__Terminal__Group_3__03161 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Terminal__Group_3__1_in_rule__Terminal__Group_3__03164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Terminal__Group_3__0__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_3__1__Impl_in_rule__Terminal__Group_3__13220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminal__Group_3__2_in_rule__Terminal__Group_3__13223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Terminal__Group_3__1__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_3__2__Impl_in_rule__Terminal__Group_3__23282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Terminal__Group_3__2__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ObjectsAlternatives_0_in_rule__Program__ObjectsAssignment3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectDefinition__NameAssignment_13382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__ObjectDefinition__FeaturesAssignment_33413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_03444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypo_in_rule__Property__TypeAssignment_23475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_rule__Property__InitialAssignment_3_13506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_13537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpresion_in_rule__Message__SentencesAssignment_33568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpresion_in_rule__IfExpresion__ConditionAssignment_13599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpresion_in_rule__IfExpresion__ThenAssignment_33630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpresion_in_rule__IfExpresion__ElseAssignment_4_13661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpresion_in_rule__WhileExpresion__ConditionAssignment_13692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpresion_in_rule__WhileExpresion__SentencesAssignment_33723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExpresion__Group_4__0_in_synpred19_InternalHOOPL2681 = new BitSet(new long[]{0x0000000000000002L});

}