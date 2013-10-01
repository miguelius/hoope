package org.uqbar.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.uqbar.services.HoopeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHoopeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'object'", "'{'", "'}'", "':'", "'message'", "'='", "'method'", "'('", "','", "')'", "'+='", "'-='", "'||'", "'&&'", "'=='", "'!='", "'==='", "'!=='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..<'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'::'", "'?.'", "'#'", "'['", "']'", "'|'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'extends'", "'static'", "'import'", "'extension'", "'super'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=5;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_DECIMAL=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__84=84;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalHoopeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHoopeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHoopeParser.tokenNames; }
    public String getGrammarFileName() { return "../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g"; }



     	private HoopeGrammarAccess grammarAccess;
     	
        public InternalHoopeParser(TokenStream input, HoopeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected HoopeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:76:1: ruleProgram returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:79:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:80:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:80:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:80:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:80:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getProgramAccess().getProgramAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:86:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||(LA2_0>=14 && LA2_0<=15)||LA2_0==21||LA2_0==36||(LA2_0>=44 && LA2_0<=45)||LA2_0==50||(LA2_0>=55 && LA2_0<=56)||LA2_0==59||LA2_0==61||(LA2_0>=64 && LA2_0<=81)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:86:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:86:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:87:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:87:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:88:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleProgram141);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:104:2: (otherlv_2= ';' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:104:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleProgram154); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:116:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:117:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:118:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression194);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression204); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:125:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_HoopeObject_13= ruleHoopeObject ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;

        EObject this_HoopeObject_13 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:128:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_HoopeObject_13= ruleHoopeObject ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:129:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_HoopeObject_13= ruleHoopeObject )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:129:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_HoopeObject_13= ruleHoopeObject )
            int alt3=14;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:130:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression251);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:140:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression278);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:150:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression305);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:160:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression332);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:170:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression359);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:180:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression386);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:190:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression413);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:200:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression440);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:210:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression467);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:220:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression494);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:230:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression521);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:240:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression548);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:250:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression575);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:260:5: this_HoopeObject_13= ruleHoopeObject
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getHoopeObjectParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHoopeObject_in_ruleXPrimaryExpression602);
                    this_HoopeObject_13=ruleHoopeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HoopeObject_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleHoopeObject"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:276:1: entryRuleHoopeObject returns [EObject current=null] : iv_ruleHoopeObject= ruleHoopeObject EOF ;
    public final EObject entryRuleHoopeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoopeObject = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:277:2: (iv_ruleHoopeObject= ruleHoopeObject EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:278:2: iv_ruleHoopeObject= ruleHoopeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHoopeObjectRule()); 
            }
            pushFollow(FOLLOW_ruleHoopeObject_in_entryRuleHoopeObject637);
            iv_ruleHoopeObject=ruleHoopeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHoopeObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHoopeObject647); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHoopeObject"


    // $ANTLR start "ruleHoopeObject"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:285:1: ruleHoopeObject returns [EObject current=null] : ( () otherlv_1= 'object' otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleHoopeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:288:28: ( ( () otherlv_1= 'object' otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:289:1: ( () otherlv_1= 'object' otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:289:1: ( () otherlv_1= 'object' otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:289:2: () otherlv_1= 'object' otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:289:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:290:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHoopeObjectAccess().getHoopeObjectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleHoopeObject693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHoopeObjectAccess().getObjectKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleHoopeObject705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHoopeObjectAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:303:1: ( (lv_features_3_0= ruleFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:304:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:304:1: (lv_features_3_0= ruleFeature )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:305:3: lv_features_3_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHoopeObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleHoopeObject726);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHoopeObjectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"features",
            	              		lv_features_3_0, 
            	              		"Feature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleHoopeObject739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getHoopeObjectAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHoopeObject"


    // $ANTLR start "entryRuleFeature"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:333:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:334:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:335:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature775);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature785); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:342:1: ruleFeature returns [EObject current=null] : (this_Property_0= ruleProperty | this_Message_1= ruleMessage ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Property_0 = null;

        EObject this_Message_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:345:28: ( (this_Property_0= ruleProperty | this_Message_1= ruleMessage ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:346:1: (this_Property_0= ruleProperty | this_Message_1= ruleMessage )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:346:1: (this_Property_0= ruleProperty | this_Message_1= ruleMessage )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:347:5: this_Property_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleFeature832);
                    this_Property_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Property_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:357:5: this_Message_1= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getMessageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleFeature859);
                    this_Message_1=ruleMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Message_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleProperty"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:373:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:374:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:375:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty894);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty904); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:382:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:385:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:386:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:386:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:386:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:386:2: ( (lv_name_0_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:387:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:387:1: (lv_name_0_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:388:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getNameValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleProperty950);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleProperty962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:408:1: ( (lv_type_2_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:409:1: (lv_type_2_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:409:1: (lv_type_2_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:410:3: lv_type_2_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleProperty983);
            lv_type_2_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMessage"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:434:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:435:2: (iv_ruleMessage= ruleMessage EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:436:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1019);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1029); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:443:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' otherlv_3= 'method' otherlv_4= '(' ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_type_10_0= ruleJvmTypeReference ) ) ( (lv_body_11_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_type_10_0 = null;

        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:446:28: ( (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' otherlv_3= 'method' otherlv_4= '(' ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_type_10_0= ruleJvmTypeReference ) ) ( (lv_body_11_0= ruleXBlockExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:447:1: (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' otherlv_3= 'method' otherlv_4= '(' ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_type_10_0= ruleJvmTypeReference ) ) ( (lv_body_11_0= ruleXBlockExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:447:1: (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' otherlv_3= 'method' otherlv_4= '(' ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_type_10_0= ruleJvmTypeReference ) ) ( (lv_body_11_0= ruleXBlockExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:447:3: otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' otherlv_3= 'method' otherlv_4= '(' ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_type_10_0= ruleJvmTypeReference ) ) ( (lv_body_11_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMessage1066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:451:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:452:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:452:1: (lv_name_1_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:453:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleMessage1087);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMessageRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMessage1099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMessage1111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getMethodKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleMessage1123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:481:1: ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==21||LA7_0==40) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:481:2: ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:481:2: ( (lv_params_5_0= ruleFullJvmFormalParameter ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:482:1: (lv_params_5_0= ruleFullJvmFormalParameter )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:482:1: (lv_params_5_0= ruleFullJvmFormalParameter )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:483:3: lv_params_5_0= ruleFullJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageAccess().getParamsFullJvmFormalParameterParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleMessage1145);
                    lv_params_5_0=ruleFullJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMessageRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_5_0, 
                              		"FullJvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:499:2: (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:499:4: otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleMessage1158); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getCommaKeyword_5_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:503:1: ( (lv_params_7_0= ruleFullJvmFormalParameter ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:504:1: (lv_params_7_0= ruleFullJvmFormalParameter )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:504:1: (lv_params_7_0= ruleFullJvmFormalParameter )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:505:3: lv_params_7_0= ruleFullJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMessageAccess().getParamsFullJvmFormalParameterParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleMessage1179);
                    	    lv_params_7_0=ruleFullJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_7_0, 
                    	              		"FullJvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleMessage1195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleMessage1207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getColonKeyword_7());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:529:1: ( (lv_type_10_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:530:1: (lv_type_10_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:530:1: (lv_type_10_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:531:3: lv_type_10_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageAccess().getTypeJvmTypeReferenceParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMessage1228);
            lv_type_10_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMessageRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_10_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:547:2: ( (lv_body_11_0= ruleXBlockExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:548:1: (lv_body_11_0= ruleXBlockExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:548:1: (lv_body_11_0= ruleXBlockExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:549:3: lv_body_11_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageAccess().getBodyXBlockExpressionParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleMessage1249);
            lv_body_11_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMessageRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_11_0, 
                      		"XBlockExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleXExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:573:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:574:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:575:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1285);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1295); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:582:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:585:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:587:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1341);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:603:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:604:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:605:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1375);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1385); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:612:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:615:28: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:616:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:616:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==19) ) {
                    alt9=1;
                }
                else if ( (LA9_1==EOF||(LA9_1>=RULE_STRING && LA9_1<=RULE_ID)||(LA9_1>=13 && LA9_1<=17)||(LA9_1>=21 && LA9_1<=57)||(LA9_1>=59 && LA9_1<=83)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 69:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==19) ) {
                    alt9=1;
                }
                else if ( (LA9_2==EOF||(LA9_2>=RULE_STRING && LA9_2<=RULE_ID)||(LA9_2>=13 && LA9_2<=17)||(LA9_2>=21 && LA9_2<=57)||(LA9_2>=59 && LA9_2<=83)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==19) ) {
                    alt9=1;
                }
                else if ( (LA9_3==EOF||(LA9_3>=RULE_STRING && LA9_3<=RULE_ID)||(LA9_3>=13 && LA9_3<=17)||(LA9_3>=21 && LA9_3<=57)||(LA9_3>=59 && LA9_3<=83)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 71:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==EOF||(LA9_4>=RULE_STRING && LA9_4<=RULE_ID)||(LA9_4>=13 && LA9_4<=17)||(LA9_4>=21 && LA9_4<=57)||(LA9_4>=59 && LA9_4<=83)) ) {
                    alt9=2;
                }
                else if ( (LA9_4==19) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                int LA9_5 = input.LA(2);

                if ( (LA9_5==EOF||(LA9_5>=RULE_STRING && LA9_5<=RULE_ID)||(LA9_5>=13 && LA9_5<=17)||(LA9_5>=21 && LA9_5<=57)||(LA9_5>=59 && LA9_5<=83)) ) {
                    alt9=2;
                }
                else if ( (LA9_5==19) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 14:
            case 15:
            case 21:
            case 36:
            case 44:
            case 45:
            case 50:
            case 55:
            case 56:
            case 59:
            case 61:
            case 64:
            case 65:
            case 66:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:616:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:616:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:616:3: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:616:3: ()
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:617:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:622:2: ( ( ruleFeatureCallID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:623:1: ( ruleFeatureCallID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:623:1: ( ruleFeatureCallID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:624:3: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXAssignment1443);
                    ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1459);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:645:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:646:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:646:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:647:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1479);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:664:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:664:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:665:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1509);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:673:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==24) ) {
                        int LA8_1 = input.LA(2);

                        if ( (synpred1_InternalHoope()) ) {
                            alt8=1;
                        }
                    }
                    else if ( (LA8_0==25) ) {
                        int LA8_2 = input.LA(2);

                        if ( (synpred1_InternalHoope()) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:673:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:673:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:673:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:678:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:678:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:678:7: ()
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:679:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:684:2: ( ( ruleOpMultiAssign ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:685:1: ( ruleOpMultiAssign )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:685:1: ( ruleOpMultiAssign )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:686:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1562);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:699:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:700:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:700:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:701:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1585);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:725:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:726:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:727:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1625);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1636); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:734:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:737:28: (kw= '=' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:739:2: kw= '='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpSingleAssign1673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:752:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:753:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:754:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1713);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1724); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:761:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' ) ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:764:28: ( (kw= '+=' | kw= '-=' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:765:1: (kw= '+=' | kw= '-=' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:765:1: (kw= '+=' | kw= '-=' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:766:2: kw= '+='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpMultiAssign1762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:773:2: kw= '-='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpMultiAssign1781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getHyphenMinusEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:786:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:787:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:788:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1821);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1831); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:795:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:798:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:799:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:799:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:800:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1878);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:808:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred2_InternalHoope()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:808:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:808:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:808:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:813:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:813:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:813:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:814:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:819:2: ( ( ruleOpOr ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:820:1: ( ruleOpOr )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:820:1: ( ruleOpOr )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:821:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1931);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:834:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:835:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:835:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:836:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1954);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:860:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:861:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:862:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1993);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2004); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:869:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:872:28: (kw= '||' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:874:2: kw= '||'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOr2041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:887:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:888:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:889:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2080);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2090); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:896:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:899:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:900:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:900:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:901:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2137);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:909:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred3_InternalHoope()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:909:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:909:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:909:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:914:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:914:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:914:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:915:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:920:2: ( ( ruleOpAnd ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:921:1: ( ruleOpAnd )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:921:1: ( ruleOpAnd )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:922:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2190);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:935:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:936:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:936:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:937:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2213);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:961:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:962:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:963:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2252);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2263); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:970:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:973:28: (kw= '&&' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:975:2: kw= '&&'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpAnd2300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:988:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:989:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:990:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2339);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2349); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:997:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1000:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1001:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1001:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1002:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2396);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1010:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred4_InternalHoope()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred4_InternalHoope()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred4_InternalHoope()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred4_InternalHoope()) ) {
                        alt13=1;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1010:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1010:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1010:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1015:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1015:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1015:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1016:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1021:2: ( ( ruleOpEquality ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1022:1: ( ruleOpEquality )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1022:1: ( ruleOpEquality )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1023:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2449);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1036:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1037:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1037:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1038:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2472);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1062:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1063:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1064:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2511);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2522); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1071:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1074:28: ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1075:1: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1075:1: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 29:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            case 31:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1076:2: kw= '=='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpEquality2560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1083:2: kw= '!='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpEquality2579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1090:2: kw= '==='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpEquality2598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1097:2: kw= '!=='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality2617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1110:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1111:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1112:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2657);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2667); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1119:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1122:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1123:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1123:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1124:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2714);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop15:
            do {
                int alt15=3;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (synpred6_InternalHoope()) ) {
                        alt15=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (synpred6_InternalHoope()) ) {
                        alt15=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA15_4 = input.LA(2);

                    if ( (synpred5_InternalHoope()) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA15_5 = input.LA(2);

                    if ( (synpred6_InternalHoope()) ) {
                        alt15=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA15_6 = input.LA(2);

                    if ( (synpred6_InternalHoope()) ) {
                        alt15=2;
                    }


                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1134:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1134:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1134:6: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1135:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXRelationalExpression2750); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1144:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1145:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1145:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1146:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2773);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1163:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1163:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1163:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1163:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1163:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1168:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1168:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1168:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1169:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1174:2: ( ( ruleOpCompare ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1175:1: ( ruleOpCompare )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1175:1: ( ruleOpCompare )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1176:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2834);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1189:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1190:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1190:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1191:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2857);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1215:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1216:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1217:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2897);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2908); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1224:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1227:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1228:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1228:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            case 36:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1229:2: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare2946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1236:2: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare2965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1243:2: kw= '>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare2984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1250:2: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1263:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1264:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1265:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3043);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3053); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1272:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1275:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1276:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1276:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1277:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3100);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1285:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1285:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1285:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1285:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1290:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1290:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1290:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1291:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1296:2: ( ( ruleOpOther ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1297:1: ( ruleOpOther )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1297:1: ( ruleOpOther )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1298:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3153);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1311:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1312:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1312:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1313:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3176);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1337:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1338:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1339:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3215);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3226); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1346:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1349:28: ( (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1350:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1350:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt20=10;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1351:2: kw= '->'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1358:2: kw= '..<'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1364:6: (kw= '>' kw= '..' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1364:6: (kw= '>' kw= '..' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1365:2: kw= '>' kw= '..'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_2_0()); 
                          
                    }
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther3316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_2_1()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1378:2: kw= '..'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther3336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1385:2: kw= '=>'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpOther3355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1391:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1391:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1392:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_0()); 
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1397:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==35) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==35) && (synpred8_InternalHoope())) {
                            alt18=1;
                        }
                        else if ( (LA18_1==EOF||(LA18_1>=RULE_STRING && LA18_1<=RULE_ID)||(LA18_1>=14 && LA18_1<=15)||LA18_1==21||LA18_1==36||(LA18_1>=44 && LA18_1<=45)||LA18_1==50||(LA18_1>=55 && LA18_1<=56)||LA18_1==59||LA18_1==61||(LA18_1>=64 && LA18_1<=66)||(LA18_1>=69 && LA18_1<=81)) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1397:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1397:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1397:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1401:5: (kw= '>' kw= '>' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1402:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3406); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3419); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1415:2: kw= '>'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3440); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1421:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1421:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1422:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_0()); 
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1427:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==36) ) {
                        int LA19_1 = input.LA(2);

                        if ( (synpred9_InternalHoope()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1427:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1427:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1427:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1431:5: (kw= '<' kw= '<' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1432:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3493); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3506); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1445:2: kw= '<'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3527); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1452:2: kw= '<>'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1459:2: kw= '?:'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther3567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1466:2: kw= '<=>'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpOther3586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_9()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1479:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1480:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1481:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3626);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3636); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1488:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1491:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1492:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1492:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1493:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3683);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1501:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==44) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred10_InternalHoope()) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==45) ) {
                    int LA21_3 = input.LA(2);

                    if ( (synpred10_InternalHoope()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1501:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1501:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1501:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1506:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1506:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1506:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1507:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1512:2: ( ( ruleOpAdd ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1513:1: ( ruleOpAdd )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1513:1: ( ruleOpAdd )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1514:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3736);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1527:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1528:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1528:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1529:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3759);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1553:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1554:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1555:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3798);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3809); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1562:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1565:28: ( (kw= '+' | kw= '-' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1566:1: (kw= '+' | kw= '-' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1566:1: (kw= '+' | kw= '-' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            else if ( (LA22_0==45) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1567:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpAdd3847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1574:2: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpAdd3866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1587:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1588:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1589:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3906);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3916); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1596:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1599:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1600:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1600:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1601:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3963);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1609:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (synpred11_InternalHoope()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred11_InternalHoope()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (synpred11_InternalHoope()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (synpred11_InternalHoope()) ) {
                        alt23=1;
                    }


                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1609:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1609:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1609:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1614:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1614:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1614:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1615:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1620:2: ( ( ruleOpMulti ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1621:1: ( ruleOpMulti )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1621:1: ( ruleOpMulti )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1622:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4016);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1635:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1636:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1636:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1637:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4039);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1661:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1662:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1663:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4078);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4089); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1670:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1673:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1674:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1674:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt24=1;
                }
                break;
            case 47:
                {
                alt24=2;
                }
                break;
            case 48:
                {
                alt24=3;
                }
                break;
            case 49:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1675:2: kw= '*'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti4127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1682:2: kw= '**'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti4146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1689:2: kw= '/'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpMulti4165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1696:2: kw= '%'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpMulti4184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1709:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1710:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1711:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4224);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4234); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1718:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1721:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1722:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1722:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=44 && LA25_0<=45)||LA25_0==50) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||(LA25_0>=14 && LA25_0<=15)||LA25_0==21||LA25_0==36||(LA25_0>=55 && LA25_0<=56)||LA25_0==59||LA25_0==61||(LA25_0>=64 && LA25_0<=66)||(LA25_0>=69 && LA25_0<=81)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1722:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1722:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1722:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1722:3: ()
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1723:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1728:2: ( ( ruleOpUnary ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1729:1: ( ruleOpUnary )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1729:1: ( ruleOpUnary )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1730:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4292);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1743:2: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1744:1: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1744:1: (lv_operand_2_0= ruleXUnaryOperation )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1745:3: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation4313);
                    lv_operand_2_0=ruleXUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XUnaryOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1763:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4342);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1779:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1780:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1781:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4378);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4389); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1788:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1791:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1792:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1792:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt26=1;
                }
                break;
            case 45:
                {
                alt26=2;
                }
                break;
            case 44:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1793:2: kw= '!'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpUnary4427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1800:2: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpUnary4446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1807:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpUnary4465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1820:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1821:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1822:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4505);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4515); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1829:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1832:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1833:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1833:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1834:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4562);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1842:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==51) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred12_InternalHoope()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1842:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1842:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1842:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1844:5: ( () otherlv_2= 'as' )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1844:6: () otherlv_2= 'as'
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1844:6: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1845:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXCastedExpression4597); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1854:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1855:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1855:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1856:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4620);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1880:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1881:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1882:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4658);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4668); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1889:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitStatic_3_0=null;
        Token otherlv_8=null;
        Token lv_nullSafe_9_0=null;
        Token lv_explicitStatic_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_explicitOperationCall_17_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_typeArguments_12_0 = null;

        EObject lv_typeArguments_14_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_19_0 = null;

        EObject lv_memberCallArguments_21_0 = null;

        EObject lv_memberCallArguments_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1892:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1893:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1893:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1894:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4715);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:1: ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            loop36:
            do {
                int alt36=3;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred13_InternalHoope()) ) {
                        alt36=1;
                    }
                    else if ( (synpred14_InternalHoope()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred13_InternalHoope()) ) {
                        alt36=1;
                    }
                    else if ( (synpred14_InternalHoope()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred14_InternalHoope()) ) {
                        alt36=2;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:2: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:2: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:3: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:3: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:4: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1915:25: ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1915:26: () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1915:26: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1916:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1921:2: (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==52) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==53) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1921:4: otherlv_2= '.'
            	            {
            	            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall4787); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1926:6: ( (lv_explicitStatic_3_0= '::' ) )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1926:6: ( (lv_explicitStatic_3_0= '::' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1927:1: (lv_explicitStatic_3_0= '::' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1927:1: (lv_explicitStatic_3_0= '::' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1928:3: lv_explicitStatic_3_0= '::'
            	            {
            	            lv_explicitStatic_3_0=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall4811); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitStatic_3_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitStaticColonColonKeyword_1_0_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitStatic", true, "::");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1941:3: ( ( ruleFeatureCallID ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1942:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1942:1: ( ruleFeatureCallID )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1943:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4848);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4864);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1964:3: ( (lv_value_6_0= ruleXAssignment ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1965:1: (lv_value_6_0= ruleXAssignment )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1965:1: (lv_value_6_0= ruleXAssignment )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1966:3: lv_value_6_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4886);
            	    lv_value_6_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_6_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1983:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1983:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1983:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1983:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1983:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1999:7: ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1999:8: () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1999:8: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2000:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:2: (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:4: otherlv_8= '.'
            	            {
            	            otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall4972); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2010:6: ( (lv_nullSafe_9_0= '?.' ) )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2010:6: ( (lv_nullSafe_9_0= '?.' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2011:1: (lv_nullSafe_9_0= '?.' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2011:1: (lv_nullSafe_9_0= '?.' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2012:3: lv_nullSafe_9_0= '?.'
            	            {
            	            lv_nullSafe_9_0=(Token)match(input,54,FOLLOW_54_in_ruleXMemberFeatureCall4996); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_9_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2026:6: ( (lv_explicitStatic_10_0= '::' ) )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2026:6: ( (lv_explicitStatic_10_0= '::' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2027:1: (lv_explicitStatic_10_0= '::' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2027:1: (lv_explicitStatic_10_0= '::' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2028:3: lv_explicitStatic_10_0= '::'
            	            {
            	            lv_explicitStatic_10_0=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall5033); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitStatic_10_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitStaticColonColonKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitStatic", true, "::");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2041:5: (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==36) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2041:7: otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>'
            	            {
            	            otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall5062); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_11, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2045:1: ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2046:1: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2046:1: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2047:3: lv_typeArguments_12_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5083);
            	            lv_typeArguments_12_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_12_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2063:2: (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==22) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2063:4: otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall5096); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_13, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2067:1: ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2068:1: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2068:1: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2069:3: lv_typeArguments_14_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5117);
            	            	    lv_typeArguments_14_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_14_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop30;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall5131); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2089:3: ( ( ruleFeatureCallID ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2090:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2090:1: ( ruleFeatureCallID )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2091:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall5156);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2104:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2104:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')'
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2104:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2104:4: ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2111:1: (lv_explicitOperationCall_17_0= '(' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2112:3: lv_explicitOperationCall_17_0= '('
            	            {
            	            lv_explicitOperationCall_17_0=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall5190); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_17_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2125:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2125:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2125:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2125:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2142:1: (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2143:3: lv_memberCallArguments_18_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5275);
            	                    lv_memberCallArguments_18_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2160:6: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2160:6: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2160:7: ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2160:7: ( (lv_memberCallArguments_19_0= ruleXExpression ) )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2161:1: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2161:1: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2162:3: lv_memberCallArguments_19_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5303);
            	                    lv_memberCallArguments_19_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_19_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2178:2: (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==22) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2178:4: otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_20=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall5316); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_20, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2182:1: ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2183:1: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2183:1: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2184:3: lv_memberCallArguments_21_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5337);
            	                    	    lv_memberCallArguments_21_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_21_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop32;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_22=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall5354); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_22, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2204:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2204:4: ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2207:1: (lv_memberCallArguments_23_0= ruleXClosure )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2208:3: lv_memberCallArguments_23_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5389);
            	            lv_memberCallArguments_23_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_23_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2232:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2233:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2234:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5429);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5439); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2241:1: ruleXLiteral returns [EObject current=null] : (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XCollectionLiteral_0 = null;

        EObject this_XClosure_1 = null;

        EObject this_XBooleanLiteral_2 = null;

        EObject this_XNumberLiteral_3 = null;

        EObject this_XNullLiteral_4 = null;

        EObject this_XStringLiteral_5 = null;

        EObject this_XTypeLiteral_6 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2244:28: ( (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2245:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2245:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            int alt37=7;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            else if ( (LA37_0==56) && (synpred18_InternalHoope())) {
                alt37=2;
            }
            else if ( ((LA37_0>=75 && LA37_0<=76)) ) {
                alt37=3;
            }
            else if ( ((LA37_0>=RULE_HEX && LA37_0<=RULE_DECIMAL)) ) {
                alt37=4;
            }
            else if ( (LA37_0==77) ) {
                alt37=5;
            }
            else if ( (LA37_0==RULE_STRING) ) {
                alt37=6;
            }
            else if ( (LA37_0==78) ) {
                alt37=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2246:5: this_XCollectionLiteral_0= ruleXCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXCollectionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral5486);
                    this_XCollectionLiteral_0=ruleXCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCollectionLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2255:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2255:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2255:7: ( ( () '[' ) )=>this_XClosure_1= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5526);
                    this_XClosure_1=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2268:5: this_XBooleanLiteral_2= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5554);
                    this_XBooleanLiteral_2=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2278:5: this_XNumberLiteral_3= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5581);
                    this_XNumberLiteral_3=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2288:5: this_XNullLiteral_4= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5608);
                    this_XNullLiteral_4=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2298:5: this_XStringLiteral_5= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5635);
                    this_XStringLiteral_5=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2308:5: this_XTypeLiteral_6= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5662);
                    this_XTypeLiteral_6=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXCollectionLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2324:1: entryRuleXCollectionLiteral returns [EObject current=null] : iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF ;
    public final EObject entryRuleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCollectionLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2325:2: (iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2326:2: iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCollectionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral5697);
            iv_ruleXCollectionLiteral=ruleXCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCollectionLiteral5707); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCollectionLiteral"


    // $ANTLR start "ruleXCollectionLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2333:1: ruleXCollectionLiteral returns [EObject current=null] : (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) ;
    public final EObject ruleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XSetLiteral_0 = null;

        EObject this_XListLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2336:28: ( (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2337:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2337:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==56) ) {
                    alt38=2;
                }
                else if ( (LA38_1==15) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2338:5: this_XSetLiteral_0= ruleXSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral5754);
                    this_XSetLiteral_0=ruleXSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSetLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2348:5: this_XListLiteral_1= ruleXListLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXListLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral5781);
                    this_XListLiteral_1=ruleXListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XListLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCollectionLiteral"


    // $ANTLR start "entryRuleXSetLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2364:1: entryRuleXSetLiteral returns [EObject current=null] : iv_ruleXSetLiteral= ruleXSetLiteral EOF ;
    public final EObject entryRuleXSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSetLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2365:2: (iv_ruleXSetLiteral= ruleXSetLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2366:2: iv_ruleXSetLiteral= ruleXSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSetLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral5816);
            iv_ruleXSetLiteral=ruleXSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSetLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSetLiteral5826); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSetLiteral"


    // $ANTLR start "ruleXSetLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2373:1: ruleXSetLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleXSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2376:28: ( ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2377:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2377:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2377:2: () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2377:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2378:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSetLiteralAccess().getXSetLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXSetLiteral5872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSetLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXSetLiteral5884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXSetLiteralAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2391:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)||(LA40_0>=14 && LA40_0<=15)||LA40_0==21||LA40_0==36||(LA40_0>=44 && LA40_0<=45)||LA40_0==50||(LA40_0>=55 && LA40_0<=56)||LA40_0==59||LA40_0==61||(LA40_0>=64 && LA40_0<=66)||(LA40_0>=69 && LA40_0<=81)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2391:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2391:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2392:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2392:1: (lv_elements_3_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2393:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral5906);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_3_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2409:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==22) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2409:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleXSetLiteral5919); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXSetLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2413:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2414:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2414:1: (lv_elements_5_0= ruleXExpression )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2415:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral5940);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_5_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleXSetLiteral5956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXSetLiteralAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSetLiteral"


    // $ANTLR start "entryRuleXListLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2443:1: entryRuleXListLiteral returns [EObject current=null] : iv_ruleXListLiteral= ruleXListLiteral EOF ;
    public final EObject entryRuleXListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXListLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2444:2: (iv_ruleXListLiteral= ruleXListLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2445:2: iv_ruleXListLiteral= ruleXListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXListLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral5992);
            iv_ruleXListLiteral=ruleXListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXListLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXListLiteral6002); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXListLiteral"


    // $ANTLR start "ruleXListLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2452:1: ruleXListLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleXListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2455:28: ( ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2456:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2456:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2456:2: () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2456:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2457:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXListLiteralAccess().getXListLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXListLiteral6048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXListLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleXListLiteral6060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXListLiteralAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2470:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)||(LA42_0>=14 && LA42_0<=15)||LA42_0==21||LA42_0==36||(LA42_0>=44 && LA42_0<=45)||LA42_0==50||(LA42_0>=55 && LA42_0<=56)||LA42_0==59||LA42_0==61||(LA42_0>=64 && LA42_0<=66)||(LA42_0>=69 && LA42_0<=81)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2470:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2470:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2471:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2471:1: (lv_elements_3_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2472:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral6082);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_3_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2488:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==22) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2488:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleXListLiteral6095); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXListLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2492:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2493:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2493:1: (lv_elements_5_0= ruleXExpression )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2494:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral6116);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_5_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleXListLiteral6132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXListLiteralAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXListLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2522:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2523:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2524:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6168);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6178); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2531:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2534:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2535:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2535:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2535:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2535:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2535:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2537:5: ( () otherlv_1= '[' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2537:6: () otherlv_1= '['
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2537:6: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2538:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXClosure6238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2547:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2547:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2562:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2562:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2562:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID||LA44_0==21||LA44_0==40) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2562:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2562:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2563:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2563:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2564:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6311);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2580:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==22) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2580:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXClosure6324); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2584:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2585:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2585:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2586:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6345);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2602:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2603:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2603:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2604:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,58,FOLLOW_58_in_ruleXClosure6367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2617:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2618:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2618:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2619:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6404);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXClosure6416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2647:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2648:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2649:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6452);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6462); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2656:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2659:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2660:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2660:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2660:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2660:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2661:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2666:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)||(LA47_0>=14 && LA47_0<=15)||LA47_0==21||LA47_0==36||(LA47_0>=44 && LA47_0<=45)||LA47_0==50||(LA47_0>=55 && LA47_0<=56)||LA47_0==59||LA47_0==61||(LA47_0>=64 && LA47_0<=81)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2666:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2666:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2667:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2667:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2668:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6518);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2684:2: (otherlv_2= ';' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==13) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2684:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXExpressionInClosure6531); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2696:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2697:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2698:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6571);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6581); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2705:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2708:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2709:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2709:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2709:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2709:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2709:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2725:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2725:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2725:7: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2726:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2731:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||LA49_0==21||LA49_0==40) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2731:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2731:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2732:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2732:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2733:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6689);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2749:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==22) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2749:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXShortClosure6702); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2753:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2754:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2754:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2755:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6723);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2771:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2772:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2772:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2773:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,58,FOLLOW_58_in_ruleXShortClosure6745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2786:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2787:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2787:1: (lv_expression_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2788:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6781);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2812:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2813:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2814:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6817);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6827); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2821:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2824:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2825:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2825:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2825:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleXParenthesizedExpression6864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6886);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXParenthesizedExpression6897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2850:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2851:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2852:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6933);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6943); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2859:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2862:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2863:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2863:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2863:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2863:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2864:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXIfExpression6989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXIfExpression7001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2877:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2878:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2878:1: (lv_if_3_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2879:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7022);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXIfExpression7034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2899:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2900:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2900:1: (lv_then_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2901:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7055);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2917:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==60) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred22_InternalHoope()) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2917:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2917:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2917:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleXIfExpression7076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2922:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2923:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2923:1: (lv_else_7_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2924:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7098);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2948:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2949:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2950:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7136);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7146); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2957:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2960:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2961:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2961:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2961:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2961:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2962:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXSwitchExpression7192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||(LA52_0>=14 && LA52_0<=15)||LA52_0==36||(LA52_0>=44 && LA52_0<=45)||LA52_0==50||(LA52_0>=55 && LA52_0<=56)||LA52_0==59||LA52_0==61||(LA52_0>=64 && LA52_0<=66)||(LA52_0>=69 && LA52_0<=81)) ) {
                alt52=1;
            }
            else if ( (LA52_0==21) ) {
                int LA52_2 = input.LA(2);

                if ( (LA52_2==RULE_ID) ) {
                    int LA52_3 = input.LA(3);

                    if ( (LA52_3==19||LA52_3==21||(LA52_3>=23 && LA52_3<=49)||(LA52_3>=51 && LA52_3<=54)||LA52_3==56) ) {
                        alt52=1;
                    }
                    else if ( (LA52_3==17) && (synpred24_InternalHoope())) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA52_2>=RULE_STRING && LA52_2<=RULE_DECIMAL)||(LA52_2>=14 && LA52_2<=15)||LA52_2==21||LA52_2==36||(LA52_2>=44 && LA52_2<=45)||LA52_2==50||(LA52_2>=55 && LA52_2<=56)||LA52_2==59||LA52_2==61||(LA52_2>=64 && LA52_2<=66)||(LA52_2>=69 && LA52_2<=81)) ) {
                    alt52=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_ID) ) {
                        int LA51_1 = input.LA(2);

                        if ( (LA51_1==17) && (synpred23_InternalHoope())) {
                            alt51=1;
                        }
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2976:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2976:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2976:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2977:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2977:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2978:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7235);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression7247); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2998:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2999:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2999:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3000:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7271);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3017:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3017:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3017:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3017:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3017:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3023:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3023:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression7315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3027:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3028:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3028:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3029:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7336);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression7348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3049:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3050:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3050:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3051:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7371);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleXSwitchExpression7383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleXSwitchExpression7397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3075:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID||LA53_0==17||LA53_0==21||LA53_0==40||LA53_0==63) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3076:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3076:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3077:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7418);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3093:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==62) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3093:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_62_in_ruleXSwitchExpression7432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression7444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3101:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3102:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3102:1: (lv_default_14_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3103:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7465);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression7479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3131:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3132:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3133:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7515);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7525); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3140:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3143:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3144:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3144:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3144:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3144:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||LA55_0==21||LA55_0==40) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3145:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3145:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3146:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7571);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3162:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==63) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3162:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXCasePart7585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3166:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3167:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3167:1: (lv_case_2_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3168:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7606);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXCasePart7620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3188:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3189:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3189:1: (lv_then_4_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3190:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7641);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3214:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3215:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3216:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7677);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7687); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3223:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3226:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3227:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3227:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3227:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3227:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3228:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXForLoopExpression7733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression7745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3241:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3242:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3242:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3243:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7766);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXForLoopExpression7778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3263:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3264:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3264:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3265:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7799);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXForLoopExpression7811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3285:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3286:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3286:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3287:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7832);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3311:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3312:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3313:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7868);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7878); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3320:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3323:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3324:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3324:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3324:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3324:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3325:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXWhileExpression7924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXWhileExpression7936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3338:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3339:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3339:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3340:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7957);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXWhileExpression7969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3360:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3361:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3361:1: (lv_body_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3362:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7990);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3386:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3387:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3388:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8026);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8036); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3395:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3398:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3399:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3399:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3399:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3399:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3400:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXDoWhileExpression8082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3409:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3410:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3410:1: (lv_body_2_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3411:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8103);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleXDoWhileExpression8115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXDoWhileExpression8127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3435:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3436:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3436:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3437:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8148);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXDoWhileExpression8160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3465:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3466:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3467:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8196);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8206); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3474:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3477:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3478:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3478:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3478:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3478:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3479:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression8252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3488:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_ID)||(LA58_0>=14 && LA58_0<=15)||LA58_0==21||LA58_0==36||(LA58_0>=44 && LA58_0<=45)||LA58_0==50||(LA58_0>=55 && LA58_0<=56)||LA58_0==59||LA58_0==61||(LA58_0>=64 && LA58_0<=81)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3488:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3488:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3489:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3489:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3490:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8274);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3506:2: (otherlv_3= ';' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==13) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3506:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression8287); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression8303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3522:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3523:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3524:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8339);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8349); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3531:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3534:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3535:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3535:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=67 && LA59_0<=68)) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_ID)||(LA59_0>=14 && LA59_0<=15)||LA59_0==21||LA59_0==36||(LA59_0>=44 && LA59_0<=45)||LA59_0==50||(LA59_0>=55 && LA59_0<=56)||LA59_0==59||LA59_0==61||(LA59_0>=64 && LA59_0<=66)||(LA59_0>=69 && LA59_0<=81)) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3536:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8396);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3546:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8423);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3562:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3563:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3564:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8458);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8468); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3571:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3574:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3575:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3575:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3575:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3575:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3576:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3581:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==67) ) {
                alt60=1;
            }
            else if ( (LA60_0==68) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3581:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3581:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3582:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3582:1: (lv_writeable_1_0= 'var' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3583:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,67,FOLLOW_67_in_ruleXVariableDeclaration8521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3597:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleXVariableDeclaration8552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3601:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (synpred25_InternalHoope()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA61_0==21) && (synpred25_InternalHoope())) {
                alt61=1;
            }
            else if ( (LA61_0==40) && (synpred25_InternalHoope())) {
                alt61=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3601:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3601:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3601:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3609:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3609:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3609:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3610:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3610:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3611:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8600);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3627:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3628:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3628:1: (lv_name_4_0= ruleValidID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3629:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8621);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3646:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3646:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3647:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3647:1: (lv_name_5_0= ruleValidID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3648:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8650);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3664:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==19) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3664:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleXVariableDeclaration8664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3668:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3669:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3669:1: (lv_right_7_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3670:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8685);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3694:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3695:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3696:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8723);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8733); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3703:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3706:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3707:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3707:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3707:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3707:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==RULE_ID||LA63_1==36||LA63_1==52||LA63_1==56) ) {
                    alt63=1;
                }
            }
            else if ( (LA63_0==21||LA63_0==40) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3708:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3708:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3709:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8779);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3725:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3726:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3726:1: (lv_name_1_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3727:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8801);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3751:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3752:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3753:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8837);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8847); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3760:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3763:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3764:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3764:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3764:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3764:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3765:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3765:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3766:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8893);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3782:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3783:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3783:1: (lv_name_1_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3784:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8914);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3808:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3809:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3810:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8950);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8960); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3817:1: ruleXFeatureCall returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_explicitOperationCall_7_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_typeArguments_2_0 = null;

        EObject lv_typeArguments_4_0 = null;

        EObject lv_featureCallArguments_8_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_11_0 = null;

        EObject lv_featureCallArguments_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3820:28: ( ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3821:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3821:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3821:2: () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3821:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3822:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3827:2: (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==36) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3827:4: otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall9007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3831:1: ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3832:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3832:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3833:3: lv_typeArguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9028);
                    lv_typeArguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3849:2: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==22) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3849:4: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall9041); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXFeatureCallAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3853:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3854:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3854:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3855:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9062);
                    	    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleXFeatureCall9076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3875:3: ( ( ruleIdOrSuper ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3876:1: ( ruleIdOrSuper )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3876:1: ( ruleIdOrSuper )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3877:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9101);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3890:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3890:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3890:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3890:4: ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3897:1: (lv_explicitOperationCall_7_0= '(' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3898:3: lv_explicitOperationCall_7_0= '('
                    {
                    lv_explicitOperationCall_7_0=(Token)match(input,21,FOLLOW_21_in_ruleXFeatureCall9135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_7_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3911:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?
                    int alt67=3;
                    alt67 = dfa67.predict(input);
                    switch (alt67) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3911:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3911:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3911:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3928:1: (lv_featureCallArguments_8_0= ruleXShortClosure )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3929:3: lv_featureCallArguments_8_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9220);
                            lv_featureCallArguments_8_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_8_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3946:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3946:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3946:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3946:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3947:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3947:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3948:3: lv_featureCallArguments_9_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9248);
                            lv_featureCallArguments_9_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3964:2: (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==22) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3964:4: otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    {
                            	    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall9261); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getXFeatureCallAccess().getCommaKeyword_3_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3968:1: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3969:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3969:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3970:3: lv_featureCallArguments_11_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9282);
                            	    lv_featureCallArguments_11_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_11_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop66;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall9299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3990:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3990:4: ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3993:1: (lv_featureCallArguments_13_0= ruleXClosure )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3994:3: lv_featureCallArguments_13_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9334);
                    lv_featureCallArguments_13_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_13_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleFeatureCallID"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4018:1: entryRuleFeatureCallID returns [String current=null] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final String entryRuleFeatureCallID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCallID = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4019:2: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4020:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallIDRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID9372);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCallID9383); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCallID"


    // $ANTLR start "ruleFeatureCallID"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4027:1: ruleFeatureCallID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCallID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4030:28: ( (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4031:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4031:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            int alt70=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt70=1;
                }
                break;
            case 69:
                {
                alt70=2;
                }
                break;
            case 70:
                {
                alt70=3;
                }
                break;
            case 71:
                {
                alt70=4;
                }
                break;
            case 72:
                {
                alt70=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4032:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallIDAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleFeatureCallID9430);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4044:2: kw= 'extends'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleFeatureCallID9454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtendsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4051:2: kw= 'static'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleFeatureCallID9473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getStaticKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4058:2: kw= 'import'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleFeatureCallID9492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4065:2: kw= 'extension'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleFeatureCallID9511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtensionKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCallID"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4078:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4079:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4080:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9552);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9563); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4087:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureCallID_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4090:28: ( (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4091:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4091:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID||(LA71_0>=69 && LA71_0<=72)) ) {
                alt71=1;
            }
            else if ( (LA71_0==73) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4092:5: this_FeatureCallID_0= ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getFeatureCallIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper9610);
                    this_FeatureCallID_0=ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FeatureCallID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4104:2: kw= 'super'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleIdOrSuper9634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4117:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4118:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4119:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9674);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9684); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4126:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4129:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4130:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4130:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4130:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4130:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4131:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXConstructorCall9730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4140:1: ( ( ruleQualifiedName ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4141:1: ( ruleQualifiedName )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4141:1: ( ruleQualifiedName )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4142:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9753);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4155:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4155:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4155:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4155:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall9774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4160:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4161:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4161:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4162:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9796);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4178:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==22) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4178:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9809); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4182:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4183:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4183:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4184:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9830);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleXConstructorCall9844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4204:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4204:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4204:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4204:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleXConstructorCall9867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4209:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt75=3;
                    alt75 = dfa75.predict(input);
                    switch (alt75) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4209:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4209:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4209:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4226:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4227:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9940);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4244:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4244:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4244:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4244:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4245:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4245:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4246:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9968);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4262:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop74:
                            do {
                                int alt74=2;
                                int LA74_0 = input.LA(1);

                                if ( (LA74_0==22) ) {
                                    alt74=1;
                                }


                                switch (alt74) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4262:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9981); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4266:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4267:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4267:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4268:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10002);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop74;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall10019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4288:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4288:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4291:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4292:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall10054);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4316:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4317:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4318:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10091);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10101); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4325:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4328:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4329:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4329:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4329:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4329:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4330:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4335:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==75) ) {
                alt78=1;
            }
            else if ( (LA78_0==76) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4335:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXBooleanLiteral10148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4340:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4340:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4341:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4341:1: (lv_isTrue_2_0= 'true' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4342:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,76,FOLLOW_76_in_ruleXBooleanLiteral10172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4363:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4364:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4365:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10222);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10232); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4372:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4375:28: ( ( () otherlv_1= 'null' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4376:1: ( () otherlv_1= 'null' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4376:1: ( () otherlv_1= 'null' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4376:2: () otherlv_1= 'null'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4376:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4377:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXNullLiteral10278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4394:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4395:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4396:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10314);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral10324); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4403:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4406:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4407:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4407:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4407:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4407:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4408:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4413:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4414:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4414:1: (lv_value_1_0= ruleNumber )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4415:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral10379);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4439:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4440:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4441:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10415);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10425); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4448:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4451:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4452:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4452:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4452:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4452:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4453:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4458:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4459:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4459:1: (lv_value_1_0= RULE_STRING )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4460:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4484:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4485:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4486:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10517);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10527); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4493:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4496:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4497:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4497:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4497:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4497:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4498:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleXTypeLiteral10573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXTypeLiteral10585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4511:1: ( ( ruleQualifiedName ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4512:1: ( ruleQualifiedName )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4512:1: ( ruleQualifiedName )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4513:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10608);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4526:2: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==56) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4527:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4527:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4528:3: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral10629);
            	    lv_arrayDimensions_4_0=ruleArrayBrackets();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXTypeLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arrayDimensions",
            	              		lv_arrayDimensions_4_0, 
            	              		"ArrayBrackets");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleXTypeLiteral10642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4556:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4557:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4558:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10678);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10688); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4565:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4568:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4569:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4569:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4569:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4569:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4570:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleXThrowExpression10734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4579:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4580:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4580:1: (lv_expression_2_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4581:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10755);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4605:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4606:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4607:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10791);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10801); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4614:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4617:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4618:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4618:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4618:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4618:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4619:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleXReturnExpression10847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4628:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt80=2;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4628:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4633:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4634:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10878);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4658:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4659:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4660:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10915);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10925); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4667:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4670:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4671:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4671:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4671:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4671:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4672:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleXTryCatchFinallyExpression10971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4681:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4682:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4682:1: (lv_expression_2_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4683:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10992);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4699:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==83) ) {
                alt83=1;
            }
            else if ( (LA83_0==82) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4699:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4699:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4699:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4699:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt81=0;
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==83) ) {
                            int LA81_2 = input.LA(2);

                            if ( (synpred34_InternalHoope()) ) {
                                alt81=1;
                            }


                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4699:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4701:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4702:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11022);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt81 >= 1 ) break loop81;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(81, input);
                                throw eee;
                        }
                        cnt81++;
                    } while (true);

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4718:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==82) ) {
                        int LA82_1 = input.LA(2);

                        if ( (synpred35_InternalHoope()) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4718:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4718:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4718:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,82,FOLLOW_82_in_ruleXTryCatchFinallyExpression11044); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4723:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4724:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4724:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4725:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11066);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4742:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4742:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4742:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,82,FOLLOW_82_in_ruleXTryCatchFinallyExpression11088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4746:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4747:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4747:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4748:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11109);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4772:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4773:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4774:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11147);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11157); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4781:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4784:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4785:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4785:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4785:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4785:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4785:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleXCatchClause11202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleXCatchClause11215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4794:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4795:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4795:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4796:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11236);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXCatchClause11248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4816:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4817:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4817:1: (lv_expression_4_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4818:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11269);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4842:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4843:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4844:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11306);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11317); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4851:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4854:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4855:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4855:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4856:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11364);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4866:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==52) ) {
                    int LA84_2 = input.LA(2);

                    if ( (LA84_2==RULE_ID) ) {
                        int LA84_3 = input.LA(3);

                        if ( (synpred37_InternalHoope()) ) {
                            alt84=1;
                        }


                    }


                }


                switch (alt84) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4866:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4866:2: ( ( '.' )=>kw= '.' )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4866:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,52,FOLLOW_52_in_ruleQualifiedName11392); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11415);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4893:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4897:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4898:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber11469);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber11480); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4908:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4912:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4913:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4913:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_HEX) ) {
                alt88=1;
            }
            else if ( ((LA88_0>=RULE_INT && LA88_0<=RULE_DECIMAL)) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4913:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4921:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4921:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4921:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4921:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_INT) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==RULE_DECIMAL) ) {
                        alt85=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4921:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11552); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4929:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11578); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4936:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==52) ) {
                        int LA87_1 = input.LA(2);

                        if ( ((LA87_1>=RULE_INT && LA87_1<=RULE_DECIMAL)) ) {
                            alt87=1;
                        }
                    }
                    switch (alt87) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4937:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,52,FOLLOW_52_in_ruleNumber11598); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4942:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt86=2;
                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==RULE_INT) ) {
                                alt86=1;
                            }
                            else if ( (LA86_0==RULE_DECIMAL) ) {
                                alt86=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 86, 0, input);

                                throw nvae;
                            }
                            switch (alt86) {
                                case 1 :
                                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4942:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11614); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4950:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11640); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4970:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4971:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4972:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11695);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11705); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4979:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4982:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4983:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4983:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID) ) {
                alt90=1;
            }
            else if ( (LA90_0==21||LA90_0==40) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4983:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4983:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4984:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11753);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4992:1: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==56) ) {
                            int LA89_2 = input.LA(2);

                            if ( (LA89_2==57) ) {
                                int LA89_3 = input.LA(3);

                                if ( (synpred38_InternalHoope()) ) {
                                    alt89=1;
                                }


                            }


                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4992:2: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4993:24: ( () ruleArrayBrackets )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4993:25: () ruleArrayBrackets
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4993:25: ()
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4994:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference11789);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5009:5: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11820);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5025:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5026:2: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5027:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets11856);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayBrackets11867); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5034:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5037:28: ( (kw= '[' kw= ']' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5038:1: (kw= '[' kw= ']' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5038:1: (kw= '[' kw= ']' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5039:2: kw= '[' kw= ']'
            {
            kw=(Token)match(input,56,FOLLOW_56_in_ruleArrayBrackets11905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
                  
            }
            kw=(Token)match(input,57,FOLLOW_57_in_ruleArrayBrackets11918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5058:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5059:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5060:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11958);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11968); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5067:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5070:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5071:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5071:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5071:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5071:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==21) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5071:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleXFunctionTypeRef12006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5075:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==RULE_ID||LA92_0==21||LA92_0==40) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5075:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5075:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5076:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5076:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5077:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12028);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5093:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==22) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5093:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXFunctionTypeRef12041); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5097:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5098:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5098:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5099:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12062);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop91;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXFunctionTypeRef12078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef12092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5123:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5124:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5124:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5125:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12113);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5149:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5150:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5151:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12149);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12159); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5158:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5161:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5162:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5162:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5162:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5162:2: ( ( ruleQualifiedName ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5163:1: ( ruleQualifiedName )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5163:1: ( ruleQualifiedName )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5164:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12207);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5177:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5177:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5177:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5177:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference12228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5182:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5183:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5183:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5184:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12250);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5200:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==22) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5200:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleJvmParameterizedTypeReference12263); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5204:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5205:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5205:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5206:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12284);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleJvmParameterizedTypeReference12298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5234:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5235:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5236:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12336);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12346); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5243:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5246:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5247:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5247:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID||LA96_0==21||LA96_0==40) ) {
                alt96=1;
            }
            else if ( (LA96_0==84) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5248:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12393);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5258:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12420);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5274:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5275:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5276:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12455);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12465); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5283:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5286:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5287:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5287:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5287:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5287:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5288:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleJvmWildcardTypeReference12511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5297:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt97=3;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==69) ) {
                alt97=1;
            }
            else if ( (LA97_0==73) ) {
                alt97=2;
            }
            switch (alt97) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5297:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5297:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5298:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5298:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5299:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12533);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5316:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5316:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5317:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5317:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5318:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12560);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5342:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5343:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5344:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12598);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12608); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5351:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5354:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5355:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5355:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5355:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleJvmUpperBound12645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5359:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5360:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5360:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5361:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12666);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5385:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5386:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5387:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12702);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12712); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5394:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5397:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5398:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5398:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5398:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleJvmUpperBoundAnded12749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5402:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5403:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5403:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5404:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12770);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5428:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5429:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5430:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12806);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12816); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5437:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5440:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5441:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5441:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5441:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmLowerBound12853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5445:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5446:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5446:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5447:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12874);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5473:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5474:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5475:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12913);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12924); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5482:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5485:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5486:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5486:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5487:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12971);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,52,FOLLOW_52_in_ruleQualifiedNameWithWildcard12989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,46,FOLLOW_46_in_ruleQualifiedNameWithWildcard13002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5517:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5518:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5519:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID13043);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID13054); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5526:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5529:28: (this_ID_0= RULE_ID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5530:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID13093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5547:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5548:2: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5549:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration13139);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImportDeclaration13149); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5556:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5559:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5560:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5560:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5560:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleXImportDeclaration13186); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5564:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt99=3;
            alt99 = dfa99.predict(input);
            switch (alt99) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5564:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5564:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5564:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5564:3: ( (lv_static_1_0= 'static' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5565:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5565:1: (lv_static_1_0= 'static' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5566:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,70,FOLLOW_70_in_ruleXImportDeclaration13206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5579:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==72) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5580:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5580:1: (lv_extension_2_0= 'extension' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5581:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,72,FOLLOW_72_in_ruleXImportDeclaration13237); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "extension", true, "extension");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5594:3: ( ( ruleQualifiedName ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5595:1: ( ruleQualifiedName )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5595:1: ( ruleQualifiedName )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5596:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13274);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXImportDeclaration13286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXImportDeclarationAccess().getFullStopKeyword_1_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXImportDeclaration13298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXImportDeclarationAccess().getAsteriskKeyword_1_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5618:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5618:6: ( ( ruleQualifiedName ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5619:1: ( ruleQualifiedName )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5619:1: ( ruleQualifiedName )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5620:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13328);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5634:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5634:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5635:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5635:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5636:3: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration13355);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_7_0, 
                              		"QualifiedNameWithWildcard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5652:3: (otherlv_8= ';' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==13) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5652:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleXImportDeclaration13369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImportDeclaration"

    // $ANTLR start synpred1_InternalHoope
    public final void synpred1_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:673:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:673:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:673:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:673:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:673:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:674:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:674:2: ( ( ruleOpMultiAssign ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:675:1: ( ruleOpMultiAssign )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:675:1: ( ruleOpMultiAssign )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:676:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHoope1530);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalHoope

    // $ANTLR start synpred2_InternalHoope
    public final void synpred2_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:808:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:808:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:808:4: ( () ( ( ruleOpOr ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:808:5: () ( ( ruleOpOr ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:808:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:809:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:809:2: ( ( ruleOpOr ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:810:1: ( ruleOpOr )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:810:1: ( ruleOpOr )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:811:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHoope1899);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalHoope

    // $ANTLR start synpred3_InternalHoope
    public final void synpred3_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:909:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:909:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:909:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:909:5: () ( ( ruleOpAnd ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:909:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:910:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:910:2: ( ( ruleOpAnd ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:911:1: ( ruleOpAnd )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:911:1: ( ruleOpAnd )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:912:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHoope2158);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalHoope

    // $ANTLR start synpred4_InternalHoope
    public final void synpred4_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1010:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1010:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1010:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1010:5: () ( ( ruleOpEquality ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1010:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1011:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1011:2: ( ( ruleOpEquality ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1012:1: ( ruleOpEquality )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1012:1: ( ruleOpEquality )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1013:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHoope2417);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalHoope

    // $ANTLR start synpred5_InternalHoope
    public final void synpred5_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:4: ( ( () 'instanceof' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:5: ( () 'instanceof' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:5: ( () 'instanceof' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:6: () 'instanceof'
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1133:1: 
        {
        }

        match(input,32,FOLLOW_32_in_synpred5_InternalHoope2731); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHoope

    // $ANTLR start synpred6_InternalHoope
    public final void synpred6_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1163:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1163:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1163:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1163:10: () ( ( ruleOpCompare ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1163:10: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1164:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1164:2: ( ( ruleOpCompare ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1165:1: ( ruleOpCompare )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1165:1: ( ruleOpCompare )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1166:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHoope2802);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalHoope

    // $ANTLR start synpred7_InternalHoope
    public final void synpred7_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1285:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1285:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1285:4: ( () ( ( ruleOpOther ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1285:5: () ( ( ruleOpOther ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1285:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1286:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1286:2: ( ( ruleOpOther ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1287:1: ( ruleOpOther )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1287:1: ( ruleOpOther )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1288:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHoope3121);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalHoope

    // $ANTLR start synpred8_InternalHoope
    public final void synpred8_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1397:3: ( ( '>' '>' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1397:4: ( '>' '>' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1397:4: ( '>' '>' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1398:2: '>' '>'
        {
        match(input,35,FOLLOW_35_in_synpred8_InternalHoope3390); if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred8_InternalHoope3395); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalHoope

    // $ANTLR start synpred9_InternalHoope
    public final void synpred9_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1427:3: ( ( '<' '<' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1427:4: ( '<' '<' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1427:4: ( '<' '<' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1428:2: '<' '<'
        {
        match(input,36,FOLLOW_36_in_synpred9_InternalHoope3477); if (state.failed) return ;
        match(input,36,FOLLOW_36_in_synpred9_InternalHoope3482); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalHoope

    // $ANTLR start synpred10_InternalHoope
    public final void synpred10_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1501:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1501:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1501:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1501:5: () ( ( ruleOpAdd ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1501:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1502:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1502:2: ( ( ruleOpAdd ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1503:1: ( ruleOpAdd )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1503:1: ( ruleOpAdd )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1504:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHoope3704);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalHoope

    // $ANTLR start synpred11_InternalHoope
    public final void synpred11_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1609:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1609:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1609:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1609:5: () ( ( ruleOpMulti ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1609:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1610:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1610:2: ( ( ruleOpMulti ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1611:1: ( ruleOpMulti )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1611:1: ( ruleOpMulti )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1612:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHoope3984);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalHoope

    // $ANTLR start synpred12_InternalHoope
    public final void synpred12_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1842:3: ( ( () 'as' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1842:4: ( () 'as' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1842:4: ( () 'as' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1842:5: () 'as'
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1842:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1843:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred12_InternalHoope4578); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHoope

    // $ANTLR start synpred13_InternalHoope
    public final void synpred13_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:4: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:5: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:5: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:6: () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1903:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1903:2: ( '.' | ( ( '::' ) ) )
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==52) ) {
            alt101=1;
        }
        else if ( (LA101_0==53) ) {
            alt101=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 101, 0, input);

            throw nvae;
        }
        switch (alt101) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1903:4: '.'
                {
                match(input,52,FOLLOW_52_in_synpred13_InternalHoope4733); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1905:6: ( ( '::' ) )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1905:6: ( ( '::' ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1906:1: ( '::' )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1906:1: ( '::' )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1907:2: '::'
                {
                match(input,53,FOLLOW_53_in_synpred13_InternalHoope4747); if (state.failed) return ;

                }


                }


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1911:3: ( ( ruleFeatureCallID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1912:1: ( ruleFeatureCallID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1912:1: ( ruleFeatureCallID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1913:3: ruleFeatureCallID
        {
        pushFollow(FOLLOW_ruleFeatureCallID_in_synpred13_InternalHoope4763);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHoope4769);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHoope

    // $ANTLR start synpred14_InternalHoope
    public final void synpred14_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1983:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1983:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1983:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1983:10: () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1983:10: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1984:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1984:2: ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        int alt102=3;
        switch ( input.LA(1) ) {
        case 52:
            {
            alt102=1;
            }
            break;
        case 54:
            {
            alt102=2;
            }
            break;
        case 53:
            {
            alt102=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 102, 0, input);

            throw nvae;
        }

        switch (alt102) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1984:4: '.'
                {
                match(input,52,FOLLOW_52_in_synpred14_InternalHoope4911); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1986:6: ( ( '?.' ) )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1986:6: ( ( '?.' ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1987:1: ( '?.' )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1987:1: ( '?.' )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1988:2: '?.'
                {
                match(input,54,FOLLOW_54_in_synpred14_InternalHoope4925); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1993:6: ( ( '::' ) )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1993:6: ( ( '::' ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1994:1: ( '::' )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1994:1: ( '::' )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1995:2: '::'
                {
                match(input,53,FOLLOW_53_in_synpred14_InternalHoope4945); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHoope

    // $ANTLR start synpred15_InternalHoope
    public final void synpred15_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2104:4: ( ( '(' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2105:1: ( '(' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2105:1: ( '(' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2106:2: '('
        {
        match(input,21,FOLLOW_21_in_synpred15_InternalHoope5172); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHoope

    // $ANTLR start synpred16_InternalHoope
    public final void synpred16_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2125:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2125:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2125:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2125:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2125:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2126:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2126:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==21||LA104_0==40) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2126:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2126:3: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2127:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2127:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2128:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHoope5224);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2130:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==22) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2130:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred16_InternalHoope5231); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2131:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2132:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2132:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2133:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHoope5238);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop103;
                    }
                } while (true);


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2135:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2136:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2136:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2137:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred16_InternalHoope5252); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHoope

    // $ANTLR start synpred17_InternalHoope
    public final void synpred17_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2204:4: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2204:5: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2204:5: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2204:6: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2204:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2205:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred17_InternalHoope5372); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHoope

    // $ANTLR start synpred18_InternalHoope
    public final void synpred18_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2255:7: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2255:8: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2255:8: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2255:9: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2255:9: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2256:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred18_InternalHoope5507); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalHoope

    // $ANTLR start synpred20_InternalHoope
    public final void synpred20_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2547:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2547:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2547:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2547:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2547:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==RULE_ID||LA106_0==21||LA106_0==40) ) {
            alt106=1;
        }
        switch (alt106) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2547:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2547:7: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2548:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2548:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2549:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHoope6257);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2551:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop105:
                do {
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==22) ) {
                        alt105=1;
                    }


                    switch (alt105) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2551:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred20_InternalHoope6264); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2552:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2553:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2553:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2554:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHoope6271);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop105;
                    }
                } while (true);


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2556:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2557:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2557:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2558:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred20_InternalHoope6285); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHoope

    // $ANTLR start synpred22_InternalHoope
    public final void synpred22_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2917:4: ( 'else' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2917:6: 'else'
        {
        match(input,60,FOLLOW_60_in_synpred22_InternalHoope7068); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalHoope

    // $ANTLR start synpred23_InternalHoope
    public final void synpred23_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:6: ( ( ruleValidID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2972:1: ( ruleValidID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2972:1: ( ruleValidID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2973:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHoope7210);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,17,FOLLOW_17_in_synpred23_InternalHoope7216); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHoope

    // $ANTLR start synpred24_InternalHoope
    public final void synpred24_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3017:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3017:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3017:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3017:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,21,FOLLOW_21_in_synpred24_InternalHoope7292); if (state.failed) return ;
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3018:1: ( ( ruleValidID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3019:1: ( ruleValidID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3019:1: ( ruleValidID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3020:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalHoope7299);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,17,FOLLOW_17_in_synpred24_InternalHoope7305); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHoope

    // $ANTLR start synpred25_InternalHoope
    public final void synpred25_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3601:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3601:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3601:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3601:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3601:6: ( ( ruleJvmTypeReference ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3602:1: ( ruleJvmTypeReference )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3602:1: ( ruleJvmTypeReference )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3603:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHoope8570);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3605:2: ( ( ruleValidID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3606:1: ( ruleValidID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3606:1: ( ruleValidID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3607:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalHoope8579);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalHoope

    // $ANTLR start synpred26_InternalHoope
    public final void synpred26_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3890:4: ( ( '(' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3891:1: ( '(' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3891:1: ( '(' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3892:2: '('
        {
        match(input,21,FOLLOW_21_in_synpred26_InternalHoope9117); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHoope

    // $ANTLR start synpred27_InternalHoope
    public final void synpred27_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3911:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3911:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3911:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3911:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3911:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3912:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3912:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt110=2;
        int LA110_0 = input.LA(1);

        if ( (LA110_0==RULE_ID||LA110_0==21||LA110_0==40) ) {
            alt110=1;
        }
        switch (alt110) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3912:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3912:3: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3913:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3913:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3914:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHoope9169);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3916:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop109:
                do {
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==22) ) {
                        alt109=1;
                    }


                    switch (alt109) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3916:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred27_InternalHoope9176); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3917:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3918:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3918:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3919:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHoope9183);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop109;
                    }
                } while (true);


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3921:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3922:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3922:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3923:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred27_InternalHoope9197); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHoope

    // $ANTLR start synpred28_InternalHoope
    public final void synpred28_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3990:4: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3990:5: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3990:5: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3990:6: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3990:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3991:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred28_InternalHoope9317); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHoope

    // $ANTLR start synpred29_InternalHoope
    public final void synpred29_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4155:4: ( '<' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4155:6: '<'
        {
        match(input,36,FOLLOW_36_in_synpred29_InternalHoope9766); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalHoope

    // $ANTLR start synpred30_InternalHoope
    public final void synpred30_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4204:5: ( '(' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4204:7: '('
        {
        match(input,21,FOLLOW_21_in_synpred30_InternalHoope9859); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHoope

    // $ANTLR start synpred31_InternalHoope
    public final void synpred31_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4209:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4209:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4209:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4209:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4209:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4210:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4210:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt112=2;
        int LA112_0 = input.LA(1);

        if ( (LA112_0==RULE_ID||LA112_0==21||LA112_0==40) ) {
            alt112=1;
        }
        switch (alt112) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4210:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4210:3: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4211:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4211:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4212:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHoope9889);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4214:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop111:
                do {
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==22) ) {
                        alt111=1;
                    }


                    switch (alt111) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4214:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred31_InternalHoope9896); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4215:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4216:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4216:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4217:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHoope9903);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop111;
                    }
                } while (true);


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4219:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4220:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4220:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4221:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred31_InternalHoope9917); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalHoope

    // $ANTLR start synpred32_InternalHoope
    public final void synpred32_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4288:4: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4288:5: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4288:5: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4288:6: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4288:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4289:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred32_InternalHoope10037); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalHoope

    // $ANTLR start synpred33_InternalHoope
    public final void synpred33_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4628:2: ( ( ruleXExpression ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4629:1: ( ruleXExpression )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4629:1: ( ruleXExpression )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4630:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalHoope10861);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalHoope

    // $ANTLR start synpred34_InternalHoope
    public final void synpred34_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4699:5: ( 'catch' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4699:7: 'catch'
        {
        match(input,83,FOLLOW_83_in_synpred34_InternalHoope11006); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalHoope

    // $ANTLR start synpred35_InternalHoope
    public final void synpred35_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4718:5: ( 'finally' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4718:7: 'finally'
        {
        match(input,82,FOLLOW_82_in_synpred35_InternalHoope11036); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHoope

    // $ANTLR start synpred37_InternalHoope
    public final void synpred37_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4866:3: ( '.' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4867:2: '.'
        {
        match(input,52,FOLLOW_52_in_synpred37_InternalHoope11383); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHoope

    // $ANTLR start synpred38_InternalHoope
    public final void synpred38_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4992:2: ( ( () ruleArrayBrackets ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4992:3: ( () ruleArrayBrackets )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4992:3: ( () ruleArrayBrackets )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4992:4: () ruleArrayBrackets
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4992:4: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4993:1: 
        {
        }

        pushFollow(FOLLOW_ruleArrayBrackets_in_synpred38_InternalHoope11768);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalHoope

    // $ANTLR start synpred39_InternalHoope
    public final void synpred39_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5177:4: ( '<' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5177:6: '<'
        {
        match(input,36,FOLLOW_36_in_synpred39_InternalHoope12220); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalHoope

    // Delegated rules

    public final boolean synpred22_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalHoope() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalHoope_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA99 dfa99 = new DFA99(this);
    static final String DFA3_eotS =
        "\17\uffff";
    static final String DFA3_eofS =
        "\17\uffff";
    static final String DFA3_minS =
        "\1\4\16\uffff";
    static final String DFA3_maxS =
        "\1\121\16\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16";
    static final String DFA3_specialS =
        "\17\uffff}>";
    static final String[] DFA3_transitionS = {
            "\4\5\1\4\5\uffff\1\16\1\2\5\uffff\1\15\16\uffff\1\4\22\uffff"+
            "\2\5\2\uffff\1\6\1\uffff\1\3\2\uffff\1\7\1\10\1\11\2\uffff\5"+
            "\4\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "129:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_HoopeObject_13= ruleHoopeObject )";
        }
    }
    static final String DFA17_eotS =
        "\14\uffff";
    static final String DFA17_eofS =
        "\1\1\13\uffff";
    static final String DFA17_minS =
        "\1\4\1\uffff\11\0\1\uffff";
    static final String DFA17_maxS =
        "\1\123\1\uffff\11\0\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA17_specialS =
        "\2\uffff\1\3\1\10\1\7\1\5\1\0\1\2\1\6\1\1\1\4\1\uffff}>";
    static final String[] DFA17_transitionS = {
            "\5\1\4\uffff\5\1\3\uffff\16\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\16\1\1\uffff\31\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 1285:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\14\uffff";
    static final String DFA20_eofS =
        "\14\uffff";
    static final String DFA20_minS =
        "\1\43\2\uffff\1\43\10\uffff";
    static final String DFA20_maxS =
        "\1\53\2\uffff\1\47\10\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\11\1\12\1\6\1\3";
    static final String DFA20_specialS =
        "\14\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\3\1\6\1\1\1\2\1\4\1\5\1\7\1\10\1\11",
            "",
            "",
            "\1\12\3\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1350:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )";
        }
    }
    static final String DFA34_eotS =
        "\113\uffff";
    static final String DFA34_eofS =
        "\1\2\112\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\111\uffff";
    static final String DFA34_maxS =
        "\1\123\1\0\111\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\107\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\111\uffff}>";
    static final String[] DFA34_transitionS = {
            "\5\2\4\uffff\5\2\3\uffff\1\1\44\2\1\uffff\31\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2104:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\44\uffff";
    static final String DFA33_eofS =
        "\44\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA33_maxS =
        "\1\121\2\0\41\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\35\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA33_transitionS = {
            "\4\5\1\1\5\uffff\2\5\5\uffff\1\2\1\uffff\1\43\14\uffff\1\5\3"+
            "\uffff\1\3\3\uffff\2\5\4\uffff\1\5\4\uffff\2\5\1\uffff\1\4\1"+
            "\5\1\uffff\1\5\2\uffff\3\5\2\uffff\15\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2125:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( (LA33_0==21) ) {s = 2;}

                        else if ( (LA33_0==40) && (synpred16_InternalHoope())) {s = 3;}

                        else if ( (LA33_0==58) && (synpred16_InternalHoope())) {s = 4;}

                        else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_DECIMAL)||(LA33_0>=14 && LA33_0<=15)||LA33_0==36||(LA33_0>=44 && LA33_0<=45)||LA33_0==50||(LA33_0>=55 && LA33_0<=56)||LA33_0==59||LA33_0==61||(LA33_0>=64 && LA33_0<=66)||(LA33_0>=69 && LA33_0<=81)) ) {s = 5;}

                        else if ( (LA33_0==23) ) {s = 35;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\113\uffff";
    static final String DFA35_eofS =
        "\1\2\112\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\111\uffff";
    static final String DFA35_maxS =
        "\1\123\1\0\111\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\107\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\111\uffff}>";
    static final String[] DFA35_transitionS = {
            "\5\2\4\uffff\5\2\3\uffff\43\2\1\1\1\2\1\uffff\31\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2204:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA45_eotS =
        "\46\uffff";
    static final String DFA45_eofS =
        "\46\uffff";
    static final String DFA45_minS =
        "\1\4\2\0\43\uffff";
    static final String DFA45_maxS =
        "\1\121\2\0\43\uffff";
    static final String DFA45_acceptS =
        "\3\uffff\2\1\1\2\40\uffff";
    static final String DFA45_specialS =
        "\1\0\1\1\1\2\43\uffff}>";
    static final String[] DFA45_transitionS = {
            "\4\5\1\1\5\uffff\2\5\5\uffff\1\2\16\uffff\1\5\3\uffff\1\3\3"+
            "\uffff\2\5\4\uffff\1\5\4\uffff\3\5\1\4\1\5\1\uffff\1\5\2\uffff"+
            "\22\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "2547:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_0 = input.LA(1);

                         
                        int index45_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA45_0==RULE_ID) ) {s = 1;}

                        else if ( (LA45_0==21) ) {s = 2;}

                        else if ( (LA45_0==40) && (synpred20_InternalHoope())) {s = 3;}

                        else if ( (LA45_0==58) && (synpred20_InternalHoope())) {s = 4;}

                        else if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_DECIMAL)||(LA45_0>=14 && LA45_0<=15)||LA45_0==36||(LA45_0>=44 && LA45_0<=45)||LA45_0==50||(LA45_0>=55 && LA45_0<=57)||LA45_0==59||LA45_0==61||(LA45_0>=64 && LA45_0<=81)) ) {s = 5;}

                         
                        input.seek(index45_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_2 = input.LA(1);

                         
                        int index45_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index45_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\113\uffff";
    static final String DFA68_eofS =
        "\1\2\112\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\111\uffff";
    static final String DFA68_maxS =
        "\1\123\1\0\111\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\107\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\111\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\4\uffff\5\2\3\uffff\1\1\44\2\1\uffff\31\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3890:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\44\uffff";
    static final String DFA67_eofS =
        "\44\uffff";
    static final String DFA67_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA67_maxS =
        "\1\121\2\0\41\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\2\1\1\2\35\uffff\1\3";
    static final String DFA67_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA67_transitionS = {
            "\4\5\1\1\5\uffff\2\5\5\uffff\1\2\1\uffff\1\43\14\uffff\1\5\3"+
            "\uffff\1\3\3\uffff\2\5\4\uffff\1\5\4\uffff\2\5\1\uffff\1\4\1"+
            "\5\1\uffff\1\5\2\uffff\3\5\2\uffff\15\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3911:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==RULE_ID) ) {s = 1;}

                        else if ( (LA67_0==21) ) {s = 2;}

                        else if ( (LA67_0==40) && (synpred27_InternalHoope())) {s = 3;}

                        else if ( (LA67_0==58) && (synpred27_InternalHoope())) {s = 4;}

                        else if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_DECIMAL)||(LA67_0>=14 && LA67_0<=15)||LA67_0==36||(LA67_0>=44 && LA67_0<=45)||LA67_0==50||(LA67_0>=55 && LA67_0<=56)||LA67_0==59||LA67_0==61||(LA67_0>=64 && LA67_0<=66)||(LA67_0>=69 && LA67_0<=81)) ) {s = 5;}

                        else if ( (LA67_0==23) ) {s = 35;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\113\uffff";
    static final String DFA69_eofS =
        "\1\2\112\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\111\uffff";
    static final String DFA69_maxS =
        "\1\123\1\0\111\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\107\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\111\uffff}>";
    static final String[] DFA69_transitionS = {
            "\5\2\4\uffff\5\2\3\uffff\43\2\1\1\1\2\1\uffff\31\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "3990:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\113\uffff";
    static final String DFA73_eofS =
        "\1\2\112\uffff";
    static final String DFA73_minS =
        "\1\4\1\0\111\uffff";
    static final String DFA73_maxS =
        "\1\123\1\0\111\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\107\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\111\uffff}>";
    static final String[] DFA73_transitionS = {
            "\5\2\4\uffff\5\2\3\uffff\17\2\1\1\25\2\1\uffff\31\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "4155:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\113\uffff";
    static final String DFA76_eofS =
        "\1\2\112\uffff";
    static final String DFA76_minS =
        "\1\4\1\0\111\uffff";
    static final String DFA76_maxS =
        "\1\123\1\0\111\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\2\107\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\111\uffff}>";
    static final String[] DFA76_transitionS = {
            "\5\2\4\uffff\5\2\3\uffff\1\1\44\2\1\uffff\31\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "4204:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\44\uffff";
    static final String DFA75_eofS =
        "\44\uffff";
    static final String DFA75_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA75_maxS =
        "\1\121\2\0\41\uffff";
    static final String DFA75_acceptS =
        "\3\uffff\2\1\1\2\35\uffff\1\3";
    static final String DFA75_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA75_transitionS = {
            "\4\5\1\1\5\uffff\2\5\5\uffff\1\2\1\uffff\1\43\14\uffff\1\5\3"+
            "\uffff\1\3\3\uffff\2\5\4\uffff\1\5\4\uffff\2\5\1\uffff\1\4\1"+
            "\5\1\uffff\1\5\2\uffff\3\5\2\uffff\15\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "4209:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_0 = input.LA(1);

                         
                        int index75_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_0==RULE_ID) ) {s = 1;}

                        else if ( (LA75_0==21) ) {s = 2;}

                        else if ( (LA75_0==40) && (synpred31_InternalHoope())) {s = 3;}

                        else if ( (LA75_0==58) && (synpred31_InternalHoope())) {s = 4;}

                        else if ( ((LA75_0>=RULE_STRING && LA75_0<=RULE_DECIMAL)||(LA75_0>=14 && LA75_0<=15)||LA75_0==36||(LA75_0>=44 && LA75_0<=45)||LA75_0==50||(LA75_0>=55 && LA75_0<=56)||LA75_0==59||LA75_0==61||(LA75_0>=64 && LA75_0<=66)||(LA75_0>=69 && LA75_0<=81)) ) {s = 5;}

                        else if ( (LA75_0==23) ) {s = 35;}

                         
                        input.seek(index75_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA75_2 = input.LA(1);

                         
                        int index75_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index75_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\113\uffff";
    static final String DFA77_eofS =
        "\1\2\112\uffff";
    static final String DFA77_minS =
        "\1\4\1\0\111\uffff";
    static final String DFA77_maxS =
        "\1\123\1\0\111\uffff";
    static final String DFA77_acceptS =
        "\2\uffff\1\2\107\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\111\uffff}>";
    static final String[] DFA77_transitionS = {
            "\5\2\4\uffff\5\2\3\uffff\43\2\1\1\1\2\1\uffff\31\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "4288:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\113\uffff";
    static final String DFA80_eofS =
        "\1\41\112\uffff";
    static final String DFA80_minS =
        "\1\4\40\0\52\uffff";
    static final String DFA80_maxS =
        "\1\123\40\0\52\uffff";
    static final String DFA80_acceptS =
        "\41\uffff\1\2\50\uffff\1\1";
    static final String DFA80_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\52\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\26\1\22\1\23\1\24\1\1\4\uffff\1\41\1\40\1\12\2\41\3\uffff"+
            "\1\37\16\41\1\14\7\41\1\10\1\7\4\41\1\6\4\41\1\16\1\17\1\41"+
            "\1\uffff\1\30\1\41\1\13\2\41\1\31\1\32\1\33\2\41\1\2\1\3\1\4"+
            "\1\5\1\15\1\11\1\20\1\21\1\25\1\27\1\34\1\35\1\36\2\41",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "4628:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_1 = input.LA(1);

                         
                        int index80_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_2 = input.LA(1);

                         
                        int index80_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_3 = input.LA(1);

                         
                        int index80_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA80_4 = input.LA(1);

                         
                        int index80_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA80_5 = input.LA(1);

                         
                        int index80_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA80_6 = input.LA(1);

                         
                        int index80_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA80_7 = input.LA(1);

                         
                        int index80_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA80_8 = input.LA(1);

                         
                        int index80_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA80_9 = input.LA(1);

                         
                        int index80_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA80_10 = input.LA(1);

                         
                        int index80_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA80_11 = input.LA(1);

                         
                        int index80_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA80_12 = input.LA(1);

                         
                        int index80_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA80_13 = input.LA(1);

                         
                        int index80_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA80_14 = input.LA(1);

                         
                        int index80_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA80_15 = input.LA(1);

                         
                        int index80_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA80_16 = input.LA(1);

                         
                        int index80_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA80_17 = input.LA(1);

                         
                        int index80_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA80_18 = input.LA(1);

                         
                        int index80_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA80_19 = input.LA(1);

                         
                        int index80_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA80_20 = input.LA(1);

                         
                        int index80_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA80_21 = input.LA(1);

                         
                        int index80_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA80_22 = input.LA(1);

                         
                        int index80_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA80_23 = input.LA(1);

                         
                        int index80_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA80_24 = input.LA(1);

                         
                        int index80_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA80_25 = input.LA(1);

                         
                        int index80_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA80_26 = input.LA(1);

                         
                        int index80_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA80_27 = input.LA(1);

                         
                        int index80_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA80_28 = input.LA(1);

                         
                        int index80_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA80_29 = input.LA(1);

                         
                        int index80_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA80_30 = input.LA(1);

                         
                        int index80_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA80_31 = input.LA(1);

                         
                        int index80_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA80_32 = input.LA(1);

                         
                        int index80_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 74;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index80_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA95_eotS =
        "\114\uffff";
    static final String DFA95_eofS =
        "\1\2\113\uffff";
    static final String DFA95_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA95_maxS =
        "\1\123\1\0\112\uffff";
    static final String DFA95_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA95_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA95_transitionS = {
            "\5\2\4\uffff\6\2\2\uffff\17\2\1\1\25\2\1\uffff\31\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "5177:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA95_1 = input.LA(1);

                         
                        int index95_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index95_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 95, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA99_eotS =
        "\7\uffff";
    static final String DFA99_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA99_minS =
        "\1\10\1\uffff\1\15\1\10\2\uffff\1\15";
    static final String DFA99_maxS =
        "\1\106\1\uffff\1\64\1\56\2\uffff\1\64";
    static final String DFA99_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA99_specialS =
        "\7\uffff}>";
    static final String[] DFA99_transitionS = {
            "\1\2\75\uffff\1\1",
            "",
            "\1\4\46\uffff\1\3",
            "\1\6\45\uffff\1\5",
            "",
            "",
            "\1\4\46\uffff\1\3"
    };

    static final short[] DFA99_eot = DFA.unpackEncodedString(DFA99_eotS);
    static final short[] DFA99_eof = DFA.unpackEncodedString(DFA99_eofS);
    static final char[] DFA99_min = DFA.unpackEncodedStringToUnsignedChars(DFA99_minS);
    static final char[] DFA99_max = DFA.unpackEncodedStringToUnsignedChars(DFA99_maxS);
    static final short[] DFA99_accept = DFA.unpackEncodedString(DFA99_acceptS);
    static final short[] DFA99_special = DFA.unpackEncodedString(DFA99_specialS);
    static final short[][] DFA99_transition;

    static {
        int numStates = DFA99_transitionS.length;
        DFA99_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA99_transition[i] = DFA.unpackEncodedString(DFA99_transitionS[i]);
        }
    }

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = DFA99_eot;
            this.eof = DFA99_eof;
            this.min = DFA99_min;
            this.max = DFA99_max;
            this.accept = DFA99_accept;
            this.special = DFA99_special;
            this.transition = DFA99_transition;
        }
        public String getDescription() {
            return "5564:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleProgram141 = new BitSet(new long[]{0x298430100020E1F2L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_13_in_ruleProgram154 = new BitSet(new long[]{0x298430100020E1F2L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoopeObject_in_ruleXPrimaryExpression602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoopeObject_in_entryRuleHoopeObject637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHoopeObject647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleHoopeObject693 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHoopeObject705 = new BitSet(new long[]{0x0000000000050100L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleHoopeObject726 = new BitSet(new long[]{0x0000000000050100L});
    public static final BitSet FOLLOW_16_in_ruleHoopeObject739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFeature832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleFeature859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProperty950 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProperty962 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleProperty983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMessage1066 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMessage1087 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMessage1099 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMessage1111 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMessage1123 = new BitSet(new long[]{0x0000010000A00100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleMessage1145 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleMessage1158 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleMessage1179 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleMessage1195 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMessage1207 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMessage1228 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleMessage1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXAssignment1443 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1459 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1509 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1562 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpSingleAssign1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpMultiAssign1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpMultiAssign1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1878 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1931 = new BitSet(new long[]{0x298430100420E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1954 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOr2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2137 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2190 = new BitSet(new long[]{0x298430100820E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2213 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpAnd2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2396 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2449 = new BitSet(new long[]{0x29843010F020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2472 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpEquality2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpEquality2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpEquality2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2714 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_32_in_ruleXRelationalExpression2750 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2773 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2834 = new BitSet(new long[]{0x2984301F0020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2857 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3100 = new BitSet(new long[]{0x00000FF800000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3153 = new BitSet(new long[]{0x29843FF80020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3176 = new BitSet(new long[]{0x00000FF800000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3303 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOpOther3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpOther3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3375 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3406 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3462 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3493 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpOther3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpOther3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3683 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3736 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3759 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpAdd3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpAdd3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3963 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4016 = new BitSet(new long[]{0x2987F0100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4039 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpMulti4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpMulti4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4292 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpUnary4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpUnary4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpUnary4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4562 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXCastedExpression4597 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4620 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4715 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall4787 = new BitSet(new long[]{0x0000000000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall4811 = new BitSet(new long[]{0x0000000000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4848 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4864 = new BitSet(new long[]{0x29F430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4886 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall4972 = new BitSet(new long[]{0x0000001000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_54_in_ruleXMemberFeatureCall4996 = new BitSet(new long[]{0x0000001000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall5033 = new BitSet(new long[]{0x0000001000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall5062 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5083 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall5096 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5117 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall5131 = new BitSet(new long[]{0x0000000000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall5156 = new BitSet(new long[]{0x0170000000200002L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall5190 = new BitSet(new long[]{0x2D84311000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5275 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5303 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall5316 = new BitSet(new long[]{0x2984301000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5337 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall5354 = new BitSet(new long[]{0x0170000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5389 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral5697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCollectionLiteral5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral5816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSetLiteral5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXSetLiteral5872 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSetLiteral5884 = new BitSet(new long[]{0x298430100061E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral5906 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleXSetLiteral5919 = new BitSet(new long[]{0x298430100061E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral5940 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleXSetLiteral5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral5992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXListLiteral6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXListLiteral6048 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXListLiteral6060 = new BitSet(new long[]{0x2B8430100060E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral6082 = new BitSet(new long[]{0x0200000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXListLiteral6095 = new BitSet(new long[]{0x2B8430100060E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral6116 = new BitSet(new long[]{0x0200000000400000L});
    public static final BitSet FOLLOW_57_in_ruleXListLiteral6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXClosure6238 = new BitSet(new long[]{0x2D8431100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6311 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXClosure6324 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6345 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_ruleXClosure6367 = new BitSet(new long[]{0x2D8431100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6404 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXClosure6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6518 = new BitSet(new long[]{0x298430100020E1F2L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_13_in_ruleXExpressionInClosure6531 = new BitSet(new long[]{0x298430100020E1F2L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6689 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXShortClosure6702 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6723 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_ruleXShortClosure6745 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleXParenthesizedExpression6864 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6886 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXParenthesizedExpression6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXIfExpression6989 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXIfExpression7001 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7022 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXIfExpression7034 = new BitSet(new long[]{0x398430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7055 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXIfExpression7076 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression7192 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7235 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression7247 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7271 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression7315 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7336 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression7348 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7371 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXSwitchExpression7383 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSwitchExpression7397 = new BitSet(new long[]{0x8000010000220100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7418 = new BitSet(new long[]{0xC000010000230100L});
    public static final BitSet FOLLOW_62_in_ruleXSwitchExpression7432 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression7444 = new BitSet(new long[]{0x298430100021E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7465 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7571 = new BitSet(new long[]{0x8000000000020000L});
    public static final BitSet FOLLOW_63_in_ruleXCasePart7585 = new BitSet(new long[]{0x298430100022E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7606 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXCasePart7620 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXForLoopExpression7733 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression7745 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7766 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXForLoopExpression7778 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7799 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXForLoopExpression7811 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXWhileExpression7924 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXWhileExpression7936 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7957 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXWhileExpression7969 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXDoWhileExpression8082 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXDoWhileExpression8115 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXDoWhileExpression8127 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8148 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXDoWhileExpression8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression8252 = new BitSet(new long[]{0x298430100021E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8274 = new BitSet(new long[]{0x298430100021E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression8287 = new BitSet(new long[]{0x298430100021E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression8303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXVariableDeclaration8521 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_68_in_ruleXVariableDeclaration8552 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8600 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8621 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8650 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXVariableDeclaration8664 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8779 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8893 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall9007 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9028 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall9041 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9062 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXFeatureCall9076 = new BitSet(new long[]{0x0000001000000100L,0x00000000000003E0L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9101 = new BitSet(new long[]{0x0100000000200002L});
    public static final BitSet FOLLOW_21_in_ruleXFeatureCall9135 = new BitSet(new long[]{0x2D84311000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9220 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9248 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall9261 = new BitSet(new long[]{0x2984301000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9282 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall9299 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID9372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCallID9383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFeatureCallID9430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleFeatureCallID9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleFeatureCallID9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleFeatureCallID9492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleFeatureCallID9511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleIdOrSuper9634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXConstructorCall9730 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9753 = new BitSet(new long[]{0x0100001000200002L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall9774 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9796 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9809 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9830 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXConstructorCall9844 = new BitSet(new long[]{0x0100000000200002L});
    public static final BitSet FOLLOW_21_in_ruleXConstructorCall9867 = new BitSet(new long[]{0x2D84311000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9940 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9968 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9981 = new BitSet(new long[]{0x2984301000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10002 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall10019 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall10054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXBooleanLiteral10148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXBooleanLiteral10172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXNullLiteral10278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral10324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXTypeLiteral10573 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXTypeLiteral10585 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10608 = new BitSet(new long[]{0x0100000000800000L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral10629 = new BitSet(new long[]{0x0100000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXTypeLiteral10642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXThrowExpression10734 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleXReturnExpression10847 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleXTryCatchFinallyExpression10971 = new BitSet(new long[]{0x298430100020E1F0L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10992 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11022 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_ruleXTryCatchFinallyExpression11044 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleXTryCatchFinallyExpression11088 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleXCatchClause11202 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCatchClause11215 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11236 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXCatchClause11248 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11364 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleQualifiedName11392 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11415 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber11469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11552 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11578 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNumber11598 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11753 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference11789 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets11856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayBrackets11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleArrayBrackets11905 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleArrayBrackets11918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleXFunctionTypeRef12006 = new BitSet(new long[]{0x0000010000A00100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12028 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXFunctionTypeRef12041 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12062 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXFunctionTypeRef12078 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef12092 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12207 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference12228 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12250 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleJvmParameterizedTypeReference12263 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12284 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleJvmParameterizedTypeReference12298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleJvmWildcardTypeReference12511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000220L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleJvmUpperBound12645 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleJvmUpperBoundAnded12749 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmLowerBound12853 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12971 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleQualifiedNameWithWildcard12989 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleQualifiedNameWithWildcard13002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID13043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID13054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID13093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration13139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImportDeclaration13149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXImportDeclaration13186 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleXImportDeclaration13206 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleXImportDeclaration13237 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13274 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXImportDeclaration13286 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXImportDeclaration13298 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13328 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration13355 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleXImportDeclaration13369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHoope1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHoope1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHoope2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHoope2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred5_InternalHoope2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHoope2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHoope3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred8_InternalHoope3390 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred8_InternalHoope3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred9_InternalHoope3477 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_synpred9_InternalHoope3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHoope3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHoope3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred12_InternalHoope4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred13_InternalHoope4733 = new BitSet(new long[]{0x0000000000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_53_in_synpred13_InternalHoope4747 = new BitSet(new long[]{0x0000000000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_synpred13_InternalHoope4763 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHoope4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred14_InternalHoope4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred14_InternalHoope4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred14_InternalHoope4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred15_InternalHoope5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHoope5224 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_synpred16_InternalHoope5231 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHoope5238 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_synpred16_InternalHoope5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred17_InternalHoope5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred18_InternalHoope5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHoope6257 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_synpred20_InternalHoope6264 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHoope6271 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_synpred20_InternalHoope6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_synpred22_InternalHoope7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHoope7210 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred23_InternalHoope7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred24_InternalHoope7292 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalHoope7299 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred24_InternalHoope7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHoope8570 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalHoope8579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred26_InternalHoope9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHoope9169 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_synpred27_InternalHoope9176 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHoope9183 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_synpred27_InternalHoope9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred28_InternalHoope9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred29_InternalHoope9766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred30_InternalHoope9859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHoope9889 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_synpred31_InternalHoope9896 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHoope9903 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_synpred31_InternalHoope9917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred32_InternalHoope10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalHoope10861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_synpred34_InternalHoope11006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_synpred35_InternalHoope11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred37_InternalHoope11383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_synpred38_InternalHoope11768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred39_InternalHoope12220 = new BitSet(new long[]{0x0000000000000002L});

}