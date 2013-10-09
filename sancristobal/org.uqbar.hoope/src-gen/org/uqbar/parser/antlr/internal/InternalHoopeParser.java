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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'object'", "'{'", "'}'", "':'", "'='", "'message'", "'method'", "'('", "','", "')'", "'+='", "'-='", "'||'", "'&&'", "'=='", "'!='", "'==='", "'!=='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..<'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'::'", "'?.'", "'#'", "'['", "']'", "'|'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'extends'", "'static'", "'import'", "'extension'", "'super'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'&'"
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

                if ( (LA4_0==RULE_ID||LA4_0==19) ) {
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
            else if ( (LA5_0==19) ) {
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:382:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:385:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:386:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:386:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:386:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )?
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:426:2: (otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:426:4: otherlv_3= '=' ( (lv_value_4_0= ruleXExpression ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleProperty996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:430:1: ( (lv_value_4_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:431:1: (lv_value_4_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:431:1: (lv_value_4_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:432:3: lv_value_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getValueXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleProperty1017);
                    lv_value_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMessage"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:456:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:457:2: (iv_ruleMessage= ruleMessage EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:458:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1055);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1065); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:465:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' otherlv_3= 'method' otherlv_4= '(' ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_type_10_0= ruleJvmTypeReference ) ) ( (lv_body_11_0= ruleXBlockExpression ) ) ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:468:28: ( (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' otherlv_3= 'method' otherlv_4= '(' ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_type_10_0= ruleJvmTypeReference ) ) ( (lv_body_11_0= ruleXBlockExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:469:1: (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' otherlv_3= 'method' otherlv_4= '(' ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_type_10_0= ruleJvmTypeReference ) ) ( (lv_body_11_0= ruleXBlockExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:469:1: (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' otherlv_3= 'method' otherlv_4= '(' ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_type_10_0= ruleJvmTypeReference ) ) ( (lv_body_11_0= ruleXBlockExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:469:3: otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' otherlv_3= 'method' otherlv_4= '(' ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_type_10_0= ruleJvmTypeReference ) ) ( (lv_body_11_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleMessage1102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:473:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:474:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:474:1: (lv_name_1_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:475:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleMessage1123);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMessage1135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMessage1147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getMethodKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleMessage1159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:503:1: ( ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==21||LA8_0==40) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:503:2: ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:503:2: ( (lv_params_5_0= ruleFullJvmFormalParameter ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:504:1: (lv_params_5_0= ruleFullJvmFormalParameter )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:504:1: (lv_params_5_0= ruleFullJvmFormalParameter )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:505:3: lv_params_5_0= ruleFullJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageAccess().getParamsFullJvmFormalParameterParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleMessage1181);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:521:2: (otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:521:4: otherlv_6= ',' ( (lv_params_7_0= ruleFullJvmFormalParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleMessage1194); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getCommaKeyword_5_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:525:1: ( (lv_params_7_0= ruleFullJvmFormalParameter ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:526:1: (lv_params_7_0= ruleFullJvmFormalParameter )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:526:1: (lv_params_7_0= ruleFullJvmFormalParameter )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:527:3: lv_params_7_0= ruleFullJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMessageAccess().getParamsFullJvmFormalParameterParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleMessage1215);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleMessage1231); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleMessage1243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getColonKeyword_7());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:551:1: ( (lv_type_10_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:552:1: (lv_type_10_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:552:1: (lv_type_10_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:553:3: lv_type_10_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageAccess().getTypeJvmTypeReferenceParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMessage1264);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:569:2: ( (lv_body_11_0= ruleXBlockExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:570:1: (lv_body_11_0= ruleXBlockExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:570:1: (lv_body_11_0= ruleXBlockExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:571:3: lv_body_11_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageAccess().getBodyXBlockExpressionParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleMessage1285);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:595:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:596:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:597:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1321);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1331); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:604:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:607:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:609:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1377);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:625:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:626:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:627:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1411);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1421); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:634:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:637:28: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:638:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:638:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==18) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||(LA10_1>=RULE_STRING && LA10_1<=RULE_ID)||(LA10_1>=13 && LA10_1<=17)||LA10_1==19||(LA10_1>=21 && LA10_1<=57)||(LA10_1>=59 && LA10_1<=83)) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 69:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==EOF||(LA10_2>=RULE_STRING && LA10_2<=RULE_ID)||(LA10_2>=13 && LA10_2<=17)||LA10_2==19||(LA10_2>=21 && LA10_2<=57)||(LA10_2>=59 && LA10_2<=83)) ) {
                    alt10=2;
                }
                else if ( (LA10_2==18) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==18) ) {
                    alt10=1;
                }
                else if ( (LA10_3==EOF||(LA10_3>=RULE_STRING && LA10_3<=RULE_ID)||(LA10_3>=13 && LA10_3<=17)||LA10_3==19||(LA10_3>=21 && LA10_3<=57)||(LA10_3>=59 && LA10_3<=83)) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 71:
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4==EOF||(LA10_4>=RULE_STRING && LA10_4<=RULE_ID)||(LA10_4>=13 && LA10_4<=17)||LA10_4==19||(LA10_4>=21 && LA10_4<=57)||(LA10_4>=59 && LA10_4<=83)) ) {
                    alt10=2;
                }
                else if ( (LA10_4==18) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                int LA10_5 = input.LA(2);

                if ( (LA10_5==18) ) {
                    alt10=1;
                }
                else if ( (LA10_5==EOF||(LA10_5>=RULE_STRING && LA10_5<=RULE_ID)||(LA10_5>=13 && LA10_5<=17)||LA10_5==19||(LA10_5>=21 && LA10_5<=57)||(LA10_5>=59 && LA10_5<=83)) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 5, input);

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
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:638:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:638:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:638:3: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:638:3: ()
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:639:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:644:2: ( ( ruleFeatureCallID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:645:1: ( ruleFeatureCallID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:645:1: ( ruleFeatureCallID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:646:3: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXAssignment1479);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1495);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:667:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:668:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:668:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:669:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1515);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:686:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:686:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:687:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1545);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:695:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==24) ) {
                        int LA9_1 = input.LA(2);

                        if ( (synpred1_InternalHoope()) ) {
                            alt9=1;
                        }
                    }
                    else if ( (LA9_0==25) ) {
                        int LA9_2 = input.LA(2);

                        if ( (synpred1_InternalHoope()) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:695:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:695:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:695:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:700:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:700:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:700:7: ()
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:701:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:706:2: ( ( ruleOpMultiAssign ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:707:1: ( ruleOpMultiAssign )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:707:1: ( ruleOpMultiAssign )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:708:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1598);
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

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:721:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:722:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:722:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:723:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1621);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:747:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:748:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:749:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1661);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1672); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:756:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:759:28: (kw= '=' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:761:2: kw= '='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpSingleAssign1709); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:774:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:775:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:776:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1749);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1760); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:783:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' ) ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:786:28: ( (kw= '+=' | kw= '-=' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:787:1: (kw= '+=' | kw= '-=' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:787:1: (kw= '+=' | kw= '-=' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:788:2: kw= '+='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpMultiAssign1798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:795:2: kw= '-='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpMultiAssign1817); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:808:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:809:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:810:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1857);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1867); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:817:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:820:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:821:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:821:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:822:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1914);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:830:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred2_InternalHoope()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:830:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:830:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:830:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:835:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:835:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:835:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:836:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:841:2: ( ( ruleOpOr ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:842:1: ( ruleOpOr )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:842:1: ( ruleOpOr )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:843:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1967);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:856:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:857:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:857:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:858:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1990);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:882:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:883:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:884:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2029);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2040); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:891:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:894:28: (kw= '||' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:896:2: kw= '||'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOr2077); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:909:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:910:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:911:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2116);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2126); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:918:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:921:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:922:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:922:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:923:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2173);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:931:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalHoope()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:931:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:931:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:931:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:936:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:936:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:936:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:937:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:942:2: ( ( ruleOpAnd ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:943:1: ( ruleOpAnd )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:943:1: ( ruleOpAnd )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:944:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2226);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:957:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:958:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:958:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:959:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2249);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:983:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:984:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:985:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2288);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2299); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:992:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:995:28: (kw= '&&' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:997:2: kw= '&&'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpAnd2336); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1010:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1011:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1012:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2375);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2385); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1019:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1022:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1023:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1023:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1024:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2432);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1032:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalHoope()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred4_InternalHoope()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred4_InternalHoope()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred4_InternalHoope()) ) {
                        alt14=1;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1032:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1032:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1032:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1037:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1037:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1037:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1038:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1043:2: ( ( ruleOpEquality ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1044:1: ( ruleOpEquality )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1044:1: ( ruleOpEquality )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1045:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2485);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1058:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1059:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1059:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1060:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2508);
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
            	    break loop14;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1084:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1085:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1086:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2547);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2558); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1093:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1096:28: ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1097:1: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1097:1: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 31:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1098:2: kw= '=='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpEquality2596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1105:2: kw= '!='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpEquality2615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1112:2: kw= '==='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpEquality2634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1119:2: kw= '!=='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality2653); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1132:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1133:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1134:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2693);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2703); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1141:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1144:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1145:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1145:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1146:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2750);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred6_InternalHoope()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred6_InternalHoope()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred5_InternalHoope()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred6_InternalHoope()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA16_6 = input.LA(2);

                    if ( (synpred6_InternalHoope()) ) {
                        alt16=2;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1156:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1156:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1156:6: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1157:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXRelationalExpression2786); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1166:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1167:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1167:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1168:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2809);
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
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1185:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1185:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1185:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1185:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1185:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1190:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1190:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1190:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1191:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1196:2: ( ( ruleOpCompare ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1197:1: ( ruleOpCompare )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1197:1: ( ruleOpCompare )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1198:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2870);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1211:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1212:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1212:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1213:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2893);
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
            	    break loop16;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1237:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1238:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1239:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2933);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2944); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1246:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1249:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1250:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1250:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case 35:
                {
                alt17=3;
                }
                break;
            case 36:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1251:2: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare2982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1258:2: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare3001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1265:2: kw= '>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare3020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1272:2: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3039); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1285:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1286:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1287:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3079);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3089); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1294:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1297:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1298:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1298:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1299:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3136);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1307:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1307:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1307:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1307:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1312:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1312:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1312:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1313:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1318:2: ( ( ruleOpOther ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1319:1: ( ruleOpOther )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1319:1: ( ruleOpOther )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1320:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3189);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1333:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1334:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1334:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1335:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3212);
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
            	    break loop18;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1359:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1360:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1361:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3251);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3262); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1368:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1371:28: ( (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1372:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1372:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt21=10;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1373:2: kw= '->'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1380:2: kw= '..<'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1386:6: (kw= '>' kw= '..' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1386:6: (kw= '>' kw= '..' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1387:2: kw= '>' kw= '..'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_2_0()); 
                          
                    }
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther3352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_2_1()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1400:2: kw= '..'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther3372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1407:2: kw= '=>'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpOther3391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1413:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1413:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1414:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_0()); 
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1419:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==35) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==35) && (synpred8_InternalHoope())) {
                            alt19=1;
                        }
                        else if ( (LA19_1==EOF||(LA19_1>=RULE_STRING && LA19_1<=RULE_ID)||(LA19_1>=14 && LA19_1<=15)||LA19_1==21||LA19_1==36||(LA19_1>=44 && LA19_1<=45)||LA19_1==50||(LA19_1>=55 && LA19_1<=56)||LA19_1==59||LA19_1==61||(LA19_1>=64 && LA19_1<=66)||(LA19_1>=69 && LA19_1<=81)) ) {
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
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1419:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1419:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1419:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1423:5: (kw= '>' kw= '>' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1424:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3442); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3455); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1437:2: kw= '>'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3476); if (state.failed) return current;
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1443:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1443:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1444:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_0()); 
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1449:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==36) ) {
                        int LA20_1 = input.LA(2);

                        if ( (synpred9_InternalHoope()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1449:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1449:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1449:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1453:5: (kw= '<' kw= '<' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1454:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3529); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3542); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1467:2: kw= '<'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3563); if (state.failed) return current;
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1474:2: kw= '<>'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1481:2: kw= '?:'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther3603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1488:2: kw= '<=>'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpOther3622); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1501:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1502:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1503:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3662);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3672); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1510:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1513:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1514:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1514:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1515:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3719);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1523:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred10_InternalHoope()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==45) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred10_InternalHoope()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1523:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1523:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1523:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1528:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1528:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1528:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1529:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1534:2: ( ( ruleOpAdd ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1535:1: ( ruleOpAdd )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1535:1: ( ruleOpAdd )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1536:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3772);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1549:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1550:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1550:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1551:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3795);
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
            	    break loop22;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1575:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1576:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1577:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3834);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3845); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1584:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1587:28: ( (kw= '+' | kw= '-' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1588:1: (kw= '+' | kw= '-' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1588:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            else if ( (LA23_0==45) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1589:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpAdd3883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1596:2: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpAdd3902); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1609:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1610:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1611:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3942);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3952); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1618:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1621:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1622:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1622:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1623:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3999);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1631:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred11_InternalHoope()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred11_InternalHoope()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred11_InternalHoope()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred11_InternalHoope()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1631:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1631:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1631:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1636:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1636:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1636:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1637:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1642:2: ( ( ruleOpMulti ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1643:1: ( ruleOpMulti )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1643:1: ( ruleOpMulti )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1644:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4052);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1657:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1658:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1658:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1659:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4075);
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
            	    break loop24;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1683:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1684:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1685:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4114);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4125); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1692:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1695:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1696:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1696:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt25=1;
                }
                break;
            case 47:
                {
                alt25=2;
                }
                break;
            case 48:
                {
                alt25=3;
                }
                break;
            case 49:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1697:2: kw= '*'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti4163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1704:2: kw= '**'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti4182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1711:2: kw= '/'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpMulti4201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1718:2: kw= '%'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpMulti4220); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1731:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1732:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1733:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4260);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4270); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1740:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1743:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1744:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1744:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=44 && LA26_0<=45)||LA26_0==50) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||(LA26_0>=14 && LA26_0<=15)||LA26_0==21||LA26_0==36||(LA26_0>=55 && LA26_0<=56)||LA26_0==59||LA26_0==61||(LA26_0>=64 && LA26_0<=66)||(LA26_0>=69 && LA26_0<=81)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1744:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1744:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1744:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1744:3: ()
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1745:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1750:2: ( ( ruleOpUnary ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1751:1: ( ruleOpUnary )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1751:1: ( ruleOpUnary )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1752:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4328);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1765:2: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1766:1: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1766:1: (lv_operand_2_0= ruleXUnaryOperation )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1767:3: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation4349);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1785:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4378);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1801:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1802:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1803:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4414);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4425); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1810:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1813:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1814:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1814:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt27=1;
                }
                break;
            case 45:
                {
                alt27=2;
                }
                break;
            case 44:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1815:2: kw= '!'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpUnary4463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1822:2: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpUnary4482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1829:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpUnary4501); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1842:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1843:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1844:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4541);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4551); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1851:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1854:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1855:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1855:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1856:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4598);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1864:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==51) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred12_InternalHoope()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1864:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1864:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1864:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1866:5: ( () otherlv_2= 'as' )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1866:6: () otherlv_2= 'as'
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1866:6: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1867:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXCastedExpression4633); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1876:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1877:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1877:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1878:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4656);
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
            	    break loop28;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1902:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1903:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1904:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4694);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4704); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1911:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1914:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1915:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1915:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1916:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4751);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:1: ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            loop37:
            do {
                int alt37=3;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred13_InternalHoope()) ) {
                        alt37=1;
                    }
                    else if ( (synpred14_InternalHoope()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred13_InternalHoope()) ) {
                        alt37=1;
                    }
                    else if ( (synpred14_InternalHoope()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred14_InternalHoope()) ) {
                        alt37=2;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:2: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:2: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:3: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:3: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:4: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1937:25: ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1937:26: () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1937:26: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1938:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1943:2: (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==52) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==53) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1943:4: otherlv_2= '.'
            	            {
            	            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall4823); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1948:6: ( (lv_explicitStatic_3_0= '::' ) )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1948:6: ( (lv_explicitStatic_3_0= '::' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1949:1: (lv_explicitStatic_3_0= '::' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1949:1: (lv_explicitStatic_3_0= '::' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1950:3: lv_explicitStatic_3_0= '::'
            	            {
            	            lv_explicitStatic_3_0=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall4847); if (state.failed) return current;
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1963:3: ( ( ruleFeatureCallID ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1964:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1964:1: ( ruleFeatureCallID )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1965:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4884);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4900);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1986:3: ( (lv_value_6_0= ruleXAssignment ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1987:1: (lv_value_6_0= ruleXAssignment )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1987:1: (lv_value_6_0= ruleXAssignment )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1988:3: lv_value_6_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4922);
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
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2021:7: ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2021:8: () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2021:8: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2022:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2027:2: (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    int alt30=3;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2027:4: otherlv_8= '.'
            	            {
            	            otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall5008); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2032:6: ( (lv_nullSafe_9_0= '?.' ) )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2032:6: ( (lv_nullSafe_9_0= '?.' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2033:1: (lv_nullSafe_9_0= '?.' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2033:1: (lv_nullSafe_9_0= '?.' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2034:3: lv_nullSafe_9_0= '?.'
            	            {
            	            lv_nullSafe_9_0=(Token)match(input,54,FOLLOW_54_in_ruleXMemberFeatureCall5032); if (state.failed) return current;
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
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2048:6: ( (lv_explicitStatic_10_0= '::' ) )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2048:6: ( (lv_explicitStatic_10_0= '::' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2049:1: (lv_explicitStatic_10_0= '::' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2049:1: (lv_explicitStatic_10_0= '::' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2050:3: lv_explicitStatic_10_0= '::'
            	            {
            	            lv_explicitStatic_10_0=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall5069); if (state.failed) return current;
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2063:5: (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==36) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2063:7: otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>'
            	            {
            	            otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall5098); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_11, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2067:1: ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2068:1: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2068:1: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2069:3: lv_typeArguments_12_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5119);
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

            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2085:2: (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==22) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2085:4: otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall5132); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_13, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2089:1: ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2090:1: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2090:1: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2091:3: lv_typeArguments_14_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5153);
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
            	            	    break loop31;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall5167); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2111:3: ( ( ruleFeatureCallID ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2112:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2112:1: ( ruleFeatureCallID )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2113:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall5192);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2126:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2126:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')'
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2126:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2126:4: ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2133:1: (lv_explicitOperationCall_17_0= '(' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2134:3: lv_explicitOperationCall_17_0= '('
            	            {
            	            lv_explicitOperationCall_17_0=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall5226); if (state.failed) return current;
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

            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2147:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?
            	            int alt34=3;
            	            alt34 = dfa34.predict(input);
            	            switch (alt34) {
            	                case 1 :
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2147:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2147:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2147:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2164:1: (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2165:3: lv_memberCallArguments_18_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5311);
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
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2182:6: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2182:6: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2182:7: ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2182:7: ( (lv_memberCallArguments_19_0= ruleXExpression ) )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2183:1: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2183:1: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2184:3: lv_memberCallArguments_19_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5339);
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

            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2200:2: (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    loop33:
            	                    do {
            	                        int alt33=2;
            	                        int LA33_0 = input.LA(1);

            	                        if ( (LA33_0==22) ) {
            	                            alt33=1;
            	                        }


            	                        switch (alt33) {
            	                    	case 1 :
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2200:4: otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_20=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall5352); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_20, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2204:1: ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2205:1: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2205:1: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2206:3: lv_memberCallArguments_21_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5373);
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
            	                    	    break loop33;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_22=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall5390); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_22, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2226:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    int alt36=2;
            	    alt36 = dfa36.predict(input);
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2226:4: ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2229:1: (lv_memberCallArguments_23_0= ruleXClosure )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2230:3: lv_memberCallArguments_23_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5425);
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
            	    break loop37;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2254:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2255:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2256:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5465);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5475); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2263:1: ruleXLiteral returns [EObject current=null] : (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2266:28: ( (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2267:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2267:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            int alt38=7;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            else if ( (LA38_0==56) && (synpred18_InternalHoope())) {
                alt38=2;
            }
            else if ( ((LA38_0>=75 && LA38_0<=76)) ) {
                alt38=3;
            }
            else if ( ((LA38_0>=RULE_HEX && LA38_0<=RULE_DECIMAL)) ) {
                alt38=4;
            }
            else if ( (LA38_0==77) ) {
                alt38=5;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=6;
            }
            else if ( (LA38_0==78) ) {
                alt38=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2268:5: this_XCollectionLiteral_0= ruleXCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXCollectionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral5522);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2277:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2277:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2277:7: ( ( () '[' ) )=>this_XClosure_1= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5562);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2290:5: this_XBooleanLiteral_2= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5590);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2300:5: this_XNumberLiteral_3= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5617);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2310:5: this_XNullLiteral_4= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5644);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2320:5: this_XStringLiteral_5= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5671);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2330:5: this_XTypeLiteral_6= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5698);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2346:1: entryRuleXCollectionLiteral returns [EObject current=null] : iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF ;
    public final EObject entryRuleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCollectionLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2347:2: (iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2348:2: iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCollectionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral5733);
            iv_ruleXCollectionLiteral=ruleXCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCollectionLiteral5743); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2355:1: ruleXCollectionLiteral returns [EObject current=null] : (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) ;
    public final EObject ruleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XSetLiteral_0 = null;

        EObject this_XListLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2358:28: ( (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2359:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2359:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==56) ) {
                    alt39=2;
                }
                else if ( (LA39_1==15) ) {
                    alt39=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2360:5: this_XSetLiteral_0= ruleXSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral5790);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2370:5: this_XListLiteral_1= ruleXListLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXListLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral5817);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2386:1: entryRuleXSetLiteral returns [EObject current=null] : iv_ruleXSetLiteral= ruleXSetLiteral EOF ;
    public final EObject entryRuleXSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSetLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2387:2: (iv_ruleXSetLiteral= ruleXSetLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2388:2: iv_ruleXSetLiteral= ruleXSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSetLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral5852);
            iv_ruleXSetLiteral=ruleXSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSetLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSetLiteral5862); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2395:1: ruleXSetLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2398:28: ( ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2399:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2399:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2399:2: () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2399:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2400:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSetLiteralAccess().getXSetLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXSetLiteral5908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSetLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXSetLiteral5920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXSetLiteralAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2413:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)||(LA41_0>=14 && LA41_0<=15)||LA41_0==21||LA41_0==36||(LA41_0>=44 && LA41_0<=45)||LA41_0==50||(LA41_0>=55 && LA41_0<=56)||LA41_0==59||LA41_0==61||(LA41_0>=64 && LA41_0<=66)||(LA41_0>=69 && LA41_0<=81)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2413:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2413:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2414:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2414:1: (lv_elements_3_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2415:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral5942);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2431:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==22) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2431:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleXSetLiteral5955); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXSetLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2435:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2436:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2436:1: (lv_elements_5_0= ruleXExpression )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2437:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral5976);
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
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleXSetLiteral5992); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2465:1: entryRuleXListLiteral returns [EObject current=null] : iv_ruleXListLiteral= ruleXListLiteral EOF ;
    public final EObject entryRuleXListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXListLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2466:2: (iv_ruleXListLiteral= ruleXListLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2467:2: iv_ruleXListLiteral= ruleXListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXListLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral6028);
            iv_ruleXListLiteral=ruleXListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXListLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXListLiteral6038); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2474:1: ruleXListLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2477:28: ( ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2478:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2478:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2478:2: () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2478:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2479:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXListLiteralAccess().getXListLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXListLiteral6084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXListLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleXListLiteral6096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXListLiteralAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2492:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||(LA43_0>=14 && LA43_0<=15)||LA43_0==21||LA43_0==36||(LA43_0>=44 && LA43_0<=45)||LA43_0==50||(LA43_0>=55 && LA43_0<=56)||LA43_0==59||LA43_0==61||(LA43_0>=64 && LA43_0<=66)||(LA43_0>=69 && LA43_0<=81)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2492:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2492:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2493:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2493:1: (lv_elements_3_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2494:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral6118);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2510:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==22) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2510:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleXListLiteral6131); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXListLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2514:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2515:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2515:1: (lv_elements_5_0= ruleXExpression )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2516:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral6152);
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
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleXListLiteral6168); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2544:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2545:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2546:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6204);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6214); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2553:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2556:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2557:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2557:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2557:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2557:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2557:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2559:5: ( () otherlv_1= '[' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2559:6: () otherlv_1= '['
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2559:6: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2560:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXClosure6274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2569:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2569:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2584:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2584:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2584:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID||LA45_0==21||LA45_0==40) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2584:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2584:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2585:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2585:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2586:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6347);
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

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2602:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==22) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2602:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXClosure6360); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2606:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2607:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2607:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2608:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6381);
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
                            	    break loop44;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2624:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2625:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2625:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2626:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,58,FOLLOW_58_in_ruleXClosure6403); if (state.failed) return current;
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2639:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2640:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2640:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2641:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6440);
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

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXClosure6452); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2669:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2670:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2671:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6488);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6498); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2678:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2681:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2682:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2682:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2682:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2682:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2683:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2688:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||(LA48_0>=14 && LA48_0<=15)||LA48_0==21||LA48_0==36||(LA48_0>=44 && LA48_0<=45)||LA48_0==50||(LA48_0>=55 && LA48_0<=56)||LA48_0==59||LA48_0==61||(LA48_0>=64 && LA48_0<=81)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2688:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2688:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2689:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2689:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2690:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6554);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2706:2: (otherlv_2= ';' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==13) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2706:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXExpressionInClosure6567); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2718:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2719:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2720:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6607);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6617); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2727:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2730:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2731:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2731:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2731:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2731:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2731:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2747:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2747:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2747:7: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2748:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2753:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==21||LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2753:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2753:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2754:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2754:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2755:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6725);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2771:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==22) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2771:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXShortClosure6738); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2775:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2776:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2776:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2777:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6759);
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
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2793:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2794:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2794:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2795:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,58,FOLLOW_58_in_ruleXShortClosure6781); if (state.failed) return current;
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2808:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2809:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2809:1: (lv_expression_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2810:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6817);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2834:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2835:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2836:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6853);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6863); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2843:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2846:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2847:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2847:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2847:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleXParenthesizedExpression6900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6922);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXParenthesizedExpression6933); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2872:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2873:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2874:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6969);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6979); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2881:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2884:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2885:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2885:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2885:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2885:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2886:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXIfExpression7025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXIfExpression7037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2899:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2900:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2900:1: (lv_if_3_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2901:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7058);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXIfExpression7070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2921:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2922:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2922:1: (lv_then_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2923:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7091);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2939:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred22_InternalHoope()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2939:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2939:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2939:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleXIfExpression7112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2944:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2945:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2945:1: (lv_else_7_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2946:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7134);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2970:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2971:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2972:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7172);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7182); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2979:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2982:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2983:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2983:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2983:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2983:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2984:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXSwitchExpression7228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)||(LA53_0>=14 && LA53_0<=15)||LA53_0==36||(LA53_0>=44 && LA53_0<=45)||LA53_0==50||(LA53_0>=55 && LA53_0<=56)||LA53_0==59||LA53_0==61||(LA53_0>=64 && LA53_0<=66)||(LA53_0>=69 && LA53_0<=81)) ) {
                alt53=1;
            }
            else if ( (LA53_0==21) ) {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==RULE_ID) ) {
                    int LA53_3 = input.LA(3);

                    if ( (LA53_3==18||LA53_3==21||(LA53_3>=23 && LA53_3<=49)||(LA53_3>=51 && LA53_3<=54)||LA53_3==56) ) {
                        alt53=1;
                    }
                    else if ( (LA53_3==17) && (synpred24_InternalHoope())) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA53_2>=RULE_STRING && LA53_2<=RULE_DECIMAL)||(LA53_2>=14 && LA53_2<=15)||LA53_2==21||LA53_2==36||(LA53_2>=44 && LA53_2<=45)||LA53_2==50||(LA53_2>=55 && LA53_2<=56)||LA53_2==59||LA53_2==61||(LA53_2>=64 && LA53_2<=66)||(LA53_2>=69 && LA53_2<=81)) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_ID) ) {
                        int LA52_1 = input.LA(2);

                        if ( (LA52_1==17) && (synpred23_InternalHoope())) {
                            alt52=1;
                        }
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2998:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2998:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2998:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2999:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2999:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3000:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7271);
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

                            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression7283); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3020:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3021:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3021:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3022:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7307);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3039:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3039:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3039:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3039:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3039:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3045:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3045:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression7351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3049:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3050:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3050:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3051:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7372);
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

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression7384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3071:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3072:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3072:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3073:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7407);
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

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleXSwitchExpression7419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleXSwitchExpression7433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3097:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID||LA54_0==17||LA54_0==21||LA54_0==40||LA54_0==63) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3098:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3098:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3099:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7454);
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
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3115:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==62) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3115:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_62_in_ruleXSwitchExpression7468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression7480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3123:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3124:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3124:1: (lv_default_14_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3125:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7501);
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

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression7515); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3153:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3154:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3155:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7551);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7561); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3162:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3165:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3166:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3166:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3166:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3166:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==21||LA56_0==40) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3167:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3167:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3168:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7607);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3184:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==63) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3184:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXCasePart7621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3188:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3189:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3189:1: (lv_case_2_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3190:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7642);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXCasePart7656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3210:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3211:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3211:1: (lv_then_4_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3212:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7677);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3236:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3237:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3238:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7713);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7723); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3245:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3248:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3249:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3249:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3249:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3249:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3250:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXForLoopExpression7769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression7781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3263:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3264:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3264:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3265:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7802);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXForLoopExpression7814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3285:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3286:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3286:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3287:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7835);
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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXForLoopExpression7847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3307:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3308:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3308:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3309:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7868);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3333:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3334:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3335:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7904);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7914); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3342:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3345:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3346:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3346:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3346:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3346:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3347:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXWhileExpression7960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXWhileExpression7972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3360:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3361:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3361:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3362:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7993);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXWhileExpression8005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3382:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3383:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3383:1: (lv_body_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3384:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8026);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3408:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3409:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3410:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8062);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8072); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3417:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3420:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3421:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3421:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3421:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3421:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3422:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXDoWhileExpression8118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3431:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3432:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3432:1: (lv_body_2_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3433:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8139);
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

            otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleXDoWhileExpression8151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXDoWhileExpression8163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3457:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3458:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3458:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3459:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8184);
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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXDoWhileExpression8196); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3487:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3488:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3489:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8232);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8242); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3496:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3499:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3500:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3500:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3500:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3500:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3501:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression8288); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3510:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_ID)||(LA59_0>=14 && LA59_0<=15)||LA59_0==21||LA59_0==36||(LA59_0>=44 && LA59_0<=45)||LA59_0==50||(LA59_0>=55 && LA59_0<=56)||LA59_0==59||LA59_0==61||(LA59_0>=64 && LA59_0<=81)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3510:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3510:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3511:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3511:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3512:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8310);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3528:2: (otherlv_3= ';' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==13) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3528:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression8323); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression8339); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3544:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3545:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3546:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8375);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8385); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3553:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3556:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3557:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3557:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=67 && LA60_0<=68)) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=RULE_STRING && LA60_0<=RULE_ID)||(LA60_0>=14 && LA60_0<=15)||LA60_0==21||LA60_0==36||(LA60_0>=44 && LA60_0<=45)||LA60_0==50||(LA60_0>=55 && LA60_0<=56)||LA60_0==59||LA60_0==61||(LA60_0>=64 && LA60_0<=66)||(LA60_0>=69 && LA60_0<=81)) ) {
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3558:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8432);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3568:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8459);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3584:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3585:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3586:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8494);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8504); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3593:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3596:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3597:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3597:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3597:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3597:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3598:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3603:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==67) ) {
                alt61=1;
            }
            else if ( (LA61_0==68) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3603:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3603:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3604:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3604:1: (lv_writeable_1_0= 'var' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3605:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,67,FOLLOW_67_in_ruleXVariableDeclaration8557); if (state.failed) return current;
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3619:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleXVariableDeclaration8588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3623:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred25_InternalHoope()) ) {
                    alt62=1;
                }
                else if ( (true) ) {
                    alt62=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA62_0==21) && (synpred25_InternalHoope())) {
                alt62=1;
            }
            else if ( (LA62_0==40) && (synpred25_InternalHoope())) {
                alt62=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3623:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3623:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3623:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3631:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3631:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3631:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3632:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3632:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3633:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8636);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3649:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3650:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3650:1: (lv_name_4_0= ruleValidID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3651:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8657);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3668:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3668:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3669:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3669:1: (lv_name_5_0= ruleValidID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3670:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8686);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3686:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==18) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3686:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration8700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3690:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3691:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3691:1: (lv_right_7_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3692:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8721);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3716:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3717:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3718:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8759);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8769); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3725:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3728:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3729:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3729:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3729:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3729:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==RULE_ID||LA64_1==36||LA64_1==52||LA64_1==56) ) {
                    alt64=1;
                }
            }
            else if ( (LA64_0==21||LA64_0==40) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3730:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3730:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3731:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8815);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3747:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3748:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3748:1: (lv_name_1_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3749:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8837);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3773:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3774:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3775:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8873);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8883); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3782:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3785:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3786:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3786:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3786:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3786:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3787:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3787:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3788:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8929);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3804:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3805:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3805:1: (lv_name_1_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3806:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8950);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3830:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3831:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3832:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8986);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8996); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3839:1: ruleXFeatureCall returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3842:28: ( ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3843:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3843:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3843:2: () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3843:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3844:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3849:2: (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==36) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3849:4: otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall9043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3853:1: ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3854:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3854:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3855:3: lv_typeArguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9064);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3871:2: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==22) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3871:4: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall9077); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXFeatureCallAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3875:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3876:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3876:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3877:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9098);
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
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleXFeatureCall9112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3897:3: ( ( ruleIdOrSuper ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3898:1: ( ruleIdOrSuper )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3898:1: ( ruleIdOrSuper )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3899:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9137);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3912:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3912:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3912:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3912:4: ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3919:1: (lv_explicitOperationCall_7_0= '(' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3920:3: lv_explicitOperationCall_7_0= '('
                    {
                    lv_explicitOperationCall_7_0=(Token)match(input,21,FOLLOW_21_in_ruleXFeatureCall9171); if (state.failed) return current;
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3933:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?
                    int alt68=3;
                    alt68 = dfa68.predict(input);
                    switch (alt68) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3933:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3933:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3933:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3950:1: (lv_featureCallArguments_8_0= ruleXShortClosure )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3951:3: lv_featureCallArguments_8_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9256);
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
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3968:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3968:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3968:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3968:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3969:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3969:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3970:3: lv_featureCallArguments_9_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9284);
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

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3986:2: (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==22) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3986:4: otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    {
                            	    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall9297); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getXFeatureCallAccess().getCommaKeyword_3_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3990:1: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3991:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3991:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3992:3: lv_featureCallArguments_11_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9318);
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
                            	    break loop67;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall9335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4012:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4012:4: ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4015:1: (lv_featureCallArguments_13_0= ruleXClosure )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4016:3: lv_featureCallArguments_13_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9370);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4040:1: entryRuleFeatureCallID returns [String current=null] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final String entryRuleFeatureCallID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCallID = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4041:2: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4042:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallIDRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID9408);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCallID9419); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4049:1: ruleFeatureCallID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCallID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4052:28: ( (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4053:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4053:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            int alt71=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt71=1;
                }
                break;
            case 69:
                {
                alt71=2;
                }
                break;
            case 70:
                {
                alt71=3;
                }
                break;
            case 71:
                {
                alt71=4;
                }
                break;
            case 72:
                {
                alt71=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4054:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallIDAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleFeatureCallID9466);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4066:2: kw= 'extends'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleFeatureCallID9490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtendsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4073:2: kw= 'static'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleFeatureCallID9509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getStaticKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4080:2: kw= 'import'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleFeatureCallID9528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4087:2: kw= 'extension'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleFeatureCallID9547); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4100:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4101:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4102:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9588);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9599); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4109:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureCallID_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4112:28: ( (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4113:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4113:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID||(LA72_0>=69 && LA72_0<=72)) ) {
                alt72=1;
            }
            else if ( (LA72_0==73) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4114:5: this_FeatureCallID_0= ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getFeatureCallIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper9646);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4126:2: kw= 'super'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleIdOrSuper9670); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4139:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4140:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4141:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9710);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9720); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4148:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4151:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4152:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4152:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4152:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4152:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4153:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXConstructorCall9766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4162:1: ( ( ruleQualifiedName ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4163:1: ( ruleQualifiedName )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4163:1: ( ruleQualifiedName )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4164:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9789);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4177:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4177:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4177:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4177:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall9810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4182:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4183:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4183:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4184:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9832);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4200:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==22) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4200:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9845); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4204:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4205:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4205:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4206:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9866);
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
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleXConstructorCall9880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4226:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4226:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4226:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4226:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleXConstructorCall9903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4231:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt76=3;
                    alt76 = dfa76.predict(input);
                    switch (alt76) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4231:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4231:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4231:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4248:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4249:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9976);
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
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4266:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4266:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4266:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4266:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4267:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4267:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4268:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10004);
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

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4284:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==22) ) {
                                    alt75=1;
                                }


                                switch (alt75) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4284:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall10017); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4288:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4289:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4289:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4290:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10038);
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
                            	    break loop75;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall10055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4310:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4310:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4313:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4314:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall10090);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4338:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4339:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4340:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10127);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10137); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4347:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4350:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4351:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4351:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4351:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4351:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4352:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4357:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==75) ) {
                alt79=1;
            }
            else if ( (LA79_0==76) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4357:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXBooleanLiteral10184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4362:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4362:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4363:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4363:1: (lv_isTrue_2_0= 'true' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4364:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,76,FOLLOW_76_in_ruleXBooleanLiteral10208); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4385:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4386:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4387:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10258);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10268); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4394:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4397:28: ( ( () otherlv_1= 'null' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4398:1: ( () otherlv_1= 'null' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4398:1: ( () otherlv_1= 'null' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4398:2: () otherlv_1= 'null'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4398:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4399:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXNullLiteral10314); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4416:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4417:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4418:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10350);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral10360); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4425:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4428:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4429:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4429:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4429:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4429:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4430:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4435:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4436:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4436:1: (lv_value_1_0= ruleNumber )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4437:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral10415);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4461:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4462:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4463:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10451);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10461); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4470:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4473:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4474:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4474:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4474:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4474:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4475:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4480:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4481:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4481:1: (lv_value_1_0= RULE_STRING )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4482:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10512); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4506:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4507:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4508:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10553);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10563); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4515:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4518:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4519:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4519:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4519:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4519:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4520:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleXTypeLiteral10609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXTypeLiteral10621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4533:1: ( ( ruleQualifiedName ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4534:1: ( ruleQualifiedName )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4534:1: ( ruleQualifiedName )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4535:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10644);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4548:2: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==56) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4549:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4549:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4550:3: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral10665);
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
            	    break loop80;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleXTypeLiteral10678); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4578:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4579:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4580:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10714);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10724); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4587:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4590:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4591:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4591:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4591:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4591:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4592:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleXThrowExpression10770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4601:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4602:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4602:1: (lv_expression_2_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4603:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10791);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4627:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4628:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4629:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10827);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10837); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4636:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4639:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4640:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4640:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4640:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4640:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4641:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleXReturnExpression10883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4650:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4650:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4655:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4656:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10914);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4680:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4681:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4682:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10951);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10961); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4689:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4692:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4693:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4693:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4693:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4693:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4694:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleXTryCatchFinallyExpression11007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4703:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4704:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4704:1: (lv_expression_2_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4705:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11028);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4721:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==83) ) {
                alt84=1;
            }
            else if ( (LA84_0==82) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4721:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4721:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4721:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4721:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt82=0;
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==83) ) {
                            int LA82_2 = input.LA(2);

                            if ( (synpred34_InternalHoope()) ) {
                                alt82=1;
                            }


                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4721:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4723:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4724:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11058);
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
                    	    if ( cnt82 >= 1 ) break loop82;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(82, input);
                                throw eee;
                        }
                        cnt82++;
                    } while (true);

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4740:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==82) ) {
                        int LA83_1 = input.LA(2);

                        if ( (synpred35_InternalHoope()) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4740:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4740:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4740:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,82,FOLLOW_82_in_ruleXTryCatchFinallyExpression11080); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4745:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4746:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4746:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4747:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11102);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4764:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4764:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4764:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,82,FOLLOW_82_in_ruleXTryCatchFinallyExpression11124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4768:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4769:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4769:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4770:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11145);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4794:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4795:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4796:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11183);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11193); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4803:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4806:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4807:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4807:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4807:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4807:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4807:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleXCatchClause11238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleXCatchClause11251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4816:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4817:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4817:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4818:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11272);
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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXCatchClause11284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4838:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4839:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4839:1: (lv_expression_4_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4840:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11305);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4864:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4865:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4866:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11342);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11353); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4873:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4876:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4877:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4877:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4878:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11400);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4888:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==52) ) {
                    int LA85_2 = input.LA(2);

                    if ( (LA85_2==RULE_ID) ) {
                        int LA85_3 = input.LA(3);

                        if ( (synpred37_InternalHoope()) ) {
                            alt85=1;
                        }


                    }


                }


                switch (alt85) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4888:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4888:2: ( ( '.' )=>kw= '.' )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4888:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,52,FOLLOW_52_in_ruleQualifiedName11428); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11451);
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
            	    break loop85;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4915:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4919:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4920:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber11505);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber11516); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4930:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4934:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4935:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4935:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_HEX) ) {
                alt89=1;
            }
            else if ( ((LA89_0>=RULE_INT && LA89_0<=RULE_DECIMAL)) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4935:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4943:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4943:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4943:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4943:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4943:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11588); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4951:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11614); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4958:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==52) ) {
                        int LA88_1 = input.LA(2);

                        if ( ((LA88_1>=RULE_INT && LA88_1<=RULE_DECIMAL)) ) {
                            alt88=1;
                        }
                    }
                    switch (alt88) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4959:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,52,FOLLOW_52_in_ruleNumber11634); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4964:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==RULE_INT) ) {
                                alt87=1;
                            }
                            else if ( (LA87_0==RULE_DECIMAL) ) {
                                alt87=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 87, 0, input);

                                throw nvae;
                            }
                            switch (alt87) {
                                case 1 :
                                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4964:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11650); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4972:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11676); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4992:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4993:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4994:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11731);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11741); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5001:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5004:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5005:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5005:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_ID) ) {
                alt91=1;
            }
            else if ( (LA91_0==21||LA91_0==40) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5005:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5005:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5006:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11789);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5014:1: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==56) ) {
                            int LA90_2 = input.LA(2);

                            if ( (LA90_2==57) ) {
                                int LA90_3 = input.LA(3);

                                if ( (synpred38_InternalHoope()) ) {
                                    alt90=1;
                                }


                            }


                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5014:2: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5015:24: ( () ruleArrayBrackets )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5015:25: () ruleArrayBrackets
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5015:25: ()
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5016:5: 
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
                    	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference11825);
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
                    	    break loop90;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5031:5: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11856);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5047:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5048:2: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5049:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets11892);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayBrackets11903); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5056:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5059:28: ( (kw= '[' kw= ']' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5060:1: (kw= '[' kw= ']' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5060:1: (kw= '[' kw= ']' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5061:2: kw= '[' kw= ']'
            {
            kw=(Token)match(input,56,FOLLOW_56_in_ruleArrayBrackets11941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
                  
            }
            kw=(Token)match(input,57,FOLLOW_57_in_ruleArrayBrackets11954); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5080:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5081:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5082:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11994);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef12004); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5089:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5092:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5093:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5093:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5093:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5093:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==21) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5093:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleXFunctionTypeRef12042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5097:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==RULE_ID||LA93_0==21||LA93_0==40) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5097:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5097:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5098:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5098:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5099:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12064);
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

                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5115:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==22) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5115:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXFunctionTypeRef12077); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5119:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5120:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5120:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5121:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12098);
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
                            	    break loop92;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXFunctionTypeRef12114); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef12128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5145:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5146:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5146:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5147:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12149);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5171:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5172:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5173:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12185);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12195); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5180:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5183:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5184:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5184:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5184:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5184:2: ( ( ruleQualifiedName ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5185:1: ( ruleQualifiedName )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5185:1: ( ruleQualifiedName )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5186:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12243);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5199:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt96=2;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5199:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5199:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5199:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference12264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5204:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5205:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5205:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5206:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12286);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5222:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==22) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5222:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleJvmParameterizedTypeReference12299); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5226:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5227:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5227:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5228:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12320);
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
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleJvmParameterizedTypeReference12334); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5256:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5257:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5258:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12372);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12382); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5265:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5268:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5269:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5269:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_ID||LA97_0==21||LA97_0==40) ) {
                alt97=1;
            }
            else if ( (LA97_0==84) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5270:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12429);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5280:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12456);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5296:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5297:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5298:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12491);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12501); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5305:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5308:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5309:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5309:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5309:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5309:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5310:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleJvmWildcardTypeReference12547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5319:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt98=3;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==69) ) {
                alt98=1;
            }
            else if ( (LA98_0==73) ) {
                alt98=2;
            }
            switch (alt98) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5319:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5319:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5320:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5320:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5321:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12569);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5338:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5338:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5339:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5339:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5340:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12596);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5364:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5365:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5366:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12634);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12644); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5373:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5376:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5377:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5377:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5377:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleJvmUpperBound12681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5381:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5382:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5382:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5383:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12702);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5407:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5408:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5409:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12738);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12748); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5416:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5419:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5420:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5420:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5420:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleJvmUpperBoundAnded12785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5424:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5425:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5425:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5426:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12806);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5450:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5451:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5452:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12842);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12852); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5459:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5462:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5463:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5463:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5463:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmLowerBound12889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5467:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5468:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5468:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5469:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12910);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5495:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5496:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5497:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12949);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12960); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5504:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5507:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5508:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5508:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5509:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard13007);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,52,FOLLOW_52_in_ruleQualifiedNameWithWildcard13025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,46,FOLLOW_46_in_ruleQualifiedNameWithWildcard13038); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5539:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5540:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5541:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID13079);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID13090); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5548:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5551:28: (this_ID_0= RULE_ID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5552:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID13129); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5569:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5570:2: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5571:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration13175);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImportDeclaration13185); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5578:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5581:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5582:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5582:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5582:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleXImportDeclaration13222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5586:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt100=3;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5586:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5586:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5586:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5586:3: ( (lv_static_1_0= 'static' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5587:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5587:1: (lv_static_1_0= 'static' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5588:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,70,FOLLOW_70_in_ruleXImportDeclaration13242); if (state.failed) return current;
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5601:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==72) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5602:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5602:1: (lv_extension_2_0= 'extension' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5603:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,72,FOLLOW_72_in_ruleXImportDeclaration13273); if (state.failed) return current;
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5616:3: ( ( ruleQualifiedName ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5617:1: ( ruleQualifiedName )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5617:1: ( ruleQualifiedName )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5618:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13310);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXImportDeclaration13322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXImportDeclarationAccess().getFullStopKeyword_1_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXImportDeclaration13334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXImportDeclarationAccess().getAsteriskKeyword_1_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5640:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5640:6: ( ( ruleQualifiedName ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5641:1: ( ruleQualifiedName )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5641:1: ( ruleQualifiedName )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5642:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13364);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5656:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5656:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5657:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5657:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5658:3: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration13391);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5674:3: (otherlv_8= ';' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==13) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5674:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleXImportDeclaration13405); if (state.failed) return current;
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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:695:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:695:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:695:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:695:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:695:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:696:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:696:2: ( ( ruleOpMultiAssign ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:697:1: ( ruleOpMultiAssign )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:697:1: ( ruleOpMultiAssign )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:698:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHoope1566);
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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:830:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:830:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:830:4: ( () ( ( ruleOpOr ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:830:5: () ( ( ruleOpOr ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:830:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:831:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:831:2: ( ( ruleOpOr ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:832:1: ( ruleOpOr )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:832:1: ( ruleOpOr )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:833:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHoope1935);
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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:931:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:931:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:931:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:931:5: () ( ( ruleOpAnd ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:931:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:932:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:932:2: ( ( ruleOpAnd ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:933:1: ( ruleOpAnd )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:933:1: ( ruleOpAnd )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:934:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHoope2194);
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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1032:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1032:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1032:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1032:5: () ( ( ruleOpEquality ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1032:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1033:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1033:2: ( ( ruleOpEquality ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1034:1: ( ruleOpEquality )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1034:1: ( ruleOpEquality )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1035:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHoope2453);
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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:4: ( ( () 'instanceof' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:5: ( () 'instanceof' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:5: ( () 'instanceof' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:6: () 'instanceof'
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1154:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1155:1: 
        {
        }

        match(input,32,FOLLOW_32_in_synpred5_InternalHoope2767); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHoope

    // $ANTLR start synpred6_InternalHoope
    public final void synpred6_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1185:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1185:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1185:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1185:10: () ( ( ruleOpCompare ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1185:10: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1186:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1186:2: ( ( ruleOpCompare ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1187:1: ( ruleOpCompare )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1187:1: ( ruleOpCompare )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1188:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHoope2838);
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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1307:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1307:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1307:4: ( () ( ( ruleOpOther ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1307:5: () ( ( ruleOpOther ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1307:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1308:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1308:2: ( ( ruleOpOther ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1309:1: ( ruleOpOther )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1309:1: ( ruleOpOther )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1310:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHoope3157);
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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1419:3: ( ( '>' '>' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1419:4: ( '>' '>' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1419:4: ( '>' '>' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1420:2: '>' '>'
        {
        match(input,35,FOLLOW_35_in_synpred8_InternalHoope3426); if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred8_InternalHoope3431); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalHoope

    // $ANTLR start synpred9_InternalHoope
    public final void synpred9_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1449:3: ( ( '<' '<' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1449:4: ( '<' '<' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1449:4: ( '<' '<' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1450:2: '<' '<'
        {
        match(input,36,FOLLOW_36_in_synpred9_InternalHoope3513); if (state.failed) return ;
        match(input,36,FOLLOW_36_in_synpred9_InternalHoope3518); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalHoope

    // $ANTLR start synpred10_InternalHoope
    public final void synpred10_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1523:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1523:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1523:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1523:5: () ( ( ruleOpAdd ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1523:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1524:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1524:2: ( ( ruleOpAdd ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1525:1: ( ruleOpAdd )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1525:1: ( ruleOpAdd )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1526:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHoope3740);
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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1631:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1631:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1631:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1631:5: () ( ( ruleOpMulti ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1631:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1632:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1632:2: ( ( ruleOpMulti ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1633:1: ( ruleOpMulti )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1633:1: ( ruleOpMulti )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1634:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHoope4020);
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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1864:3: ( ( () 'as' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1864:4: ( () 'as' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1864:4: ( () 'as' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1864:5: () 'as'
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1864:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1865:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred12_InternalHoope4614); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHoope

    // $ANTLR start synpred13_InternalHoope
    public final void synpred13_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:4: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:5: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:5: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:6: () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1924:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1925:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1925:2: ( '.' | ( ( '::' ) ) )
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==52) ) {
            alt102=1;
        }
        else if ( (LA102_0==53) ) {
            alt102=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 102, 0, input);

            throw nvae;
        }
        switch (alt102) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1925:4: '.'
                {
                match(input,52,FOLLOW_52_in_synpred13_InternalHoope4769); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1927:6: ( ( '::' ) )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1927:6: ( ( '::' ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1928:1: ( '::' )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1928:1: ( '::' )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1929:2: '::'
                {
                match(input,53,FOLLOW_53_in_synpred13_InternalHoope4783); if (state.failed) return ;

                }


                }


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1933:3: ( ( ruleFeatureCallID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1934:1: ( ruleFeatureCallID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1934:1: ( ruleFeatureCallID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:1935:3: ruleFeatureCallID
        {
        pushFollow(FOLLOW_ruleFeatureCallID_in_synpred13_InternalHoope4799);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHoope4805);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHoope

    // $ANTLR start synpred14_InternalHoope
    public final void synpred14_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:10: () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2005:10: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2006:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2006:2: ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        int alt103=3;
        switch ( input.LA(1) ) {
        case 52:
            {
            alt103=1;
            }
            break;
        case 54:
            {
            alt103=2;
            }
            break;
        case 53:
            {
            alt103=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 103, 0, input);

            throw nvae;
        }

        switch (alt103) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2006:4: '.'
                {
                match(input,52,FOLLOW_52_in_synpred14_InternalHoope4947); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2008:6: ( ( '?.' ) )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2008:6: ( ( '?.' ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2009:1: ( '?.' )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2009:1: ( '?.' )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2010:2: '?.'
                {
                match(input,54,FOLLOW_54_in_synpred14_InternalHoope4961); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2015:6: ( ( '::' ) )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2015:6: ( ( '::' ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2016:1: ( '::' )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2016:1: ( '::' )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2017:2: '::'
                {
                match(input,53,FOLLOW_53_in_synpred14_InternalHoope4981); if (state.failed) return ;

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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2126:4: ( ( '(' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2127:1: ( '(' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2127:1: ( '(' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2128:2: '('
        {
        match(input,21,FOLLOW_21_in_synpred15_InternalHoope5208); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHoope

    // $ANTLR start synpred16_InternalHoope
    public final void synpred16_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2147:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2147:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2147:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2147:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2147:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2148:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2148:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==RULE_ID||LA105_0==21||LA105_0==40) ) {
            alt105=1;
        }
        switch (alt105) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2148:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2148:3: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2149:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2149:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2150:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHoope5260);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2152:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop104:
                do {
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==22) ) {
                        alt104=1;
                    }


                    switch (alt104) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2152:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred16_InternalHoope5267); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2153:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2154:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2154:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2155:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHoope5274);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop104;
                    }
                } while (true);


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2157:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2158:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2158:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2159:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred16_InternalHoope5288); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHoope

    // $ANTLR start synpred17_InternalHoope
    public final void synpred17_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2226:4: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2226:5: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2226:5: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2226:6: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2226:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2227:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred17_InternalHoope5408); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHoope

    // $ANTLR start synpred18_InternalHoope
    public final void synpred18_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2277:7: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2277:8: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2277:8: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2277:9: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2277:9: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2278:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred18_InternalHoope5543); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalHoope

    // $ANTLR start synpred20_InternalHoope
    public final void synpred20_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2569:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2569:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2569:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2569:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2569:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt107=2;
        int LA107_0 = input.LA(1);

        if ( (LA107_0==RULE_ID||LA107_0==21||LA107_0==40) ) {
            alt107=1;
        }
        switch (alt107) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2569:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2569:7: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2570:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2570:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2571:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHoope6293);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2573:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop106:
                do {
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==22) ) {
                        alt106=1;
                    }


                    switch (alt106) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2573:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred20_InternalHoope6300); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2574:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2575:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2575:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2576:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHoope6307);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop106;
                    }
                } while (true);


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2578:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2579:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2579:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2580:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred20_InternalHoope6321); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHoope

    // $ANTLR start synpred22_InternalHoope
    public final void synpred22_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2939:4: ( 'else' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2939:6: 'else'
        {
        match(input,60,FOLLOW_60_in_synpred22_InternalHoope7104); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalHoope

    // $ANTLR start synpred23_InternalHoope
    public final void synpred23_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2993:6: ( ( ruleValidID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2994:1: ( ruleValidID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2994:1: ( ruleValidID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:2995:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHoope7246);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,17,FOLLOW_17_in_synpred23_InternalHoope7252); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHoope

    // $ANTLR start synpred24_InternalHoope
    public final void synpred24_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3039:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3039:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3039:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3039:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,21,FOLLOW_21_in_synpred24_InternalHoope7328); if (state.failed) return ;
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3040:1: ( ( ruleValidID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3041:1: ( ruleValidID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3041:1: ( ruleValidID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3042:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalHoope7335);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,17,FOLLOW_17_in_synpred24_InternalHoope7341); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHoope

    // $ANTLR start synpred25_InternalHoope
    public final void synpred25_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3623:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3623:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3623:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3623:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3623:6: ( ( ruleJvmTypeReference ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3624:1: ( ruleJvmTypeReference )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3624:1: ( ruleJvmTypeReference )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3625:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHoope8606);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3627:2: ( ( ruleValidID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3628:1: ( ruleValidID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3628:1: ( ruleValidID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3629:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalHoope8615);
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
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3912:4: ( ( '(' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3913:1: ( '(' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3913:1: ( '(' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3914:2: '('
        {
        match(input,21,FOLLOW_21_in_synpred26_InternalHoope9153); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHoope

    // $ANTLR start synpred27_InternalHoope
    public final void synpred27_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3933:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3933:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3933:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3933:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3933:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3934:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3934:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt111=2;
        int LA111_0 = input.LA(1);

        if ( (LA111_0==RULE_ID||LA111_0==21||LA111_0==40) ) {
            alt111=1;
        }
        switch (alt111) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3934:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3934:3: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3935:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3935:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3936:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHoope9205);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3938:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop110:
                do {
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==22) ) {
                        alt110=1;
                    }


                    switch (alt110) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3938:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred27_InternalHoope9212); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3939:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3940:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3940:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3941:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHoope9219);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop110;
                    }
                } while (true);


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3943:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3944:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3944:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:3945:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred27_InternalHoope9233); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHoope

    // $ANTLR start synpred28_InternalHoope
    public final void synpred28_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4012:4: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4012:5: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4012:5: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4012:6: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4012:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4013:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred28_InternalHoope9353); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHoope

    // $ANTLR start synpred29_InternalHoope
    public final void synpred29_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4177:4: ( '<' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4177:6: '<'
        {
        match(input,36,FOLLOW_36_in_synpred29_InternalHoope9802); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalHoope

    // $ANTLR start synpred30_InternalHoope
    public final void synpred30_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4226:5: ( '(' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4226:7: '('
        {
        match(input,21,FOLLOW_21_in_synpred30_InternalHoope9895); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHoope

    // $ANTLR start synpred31_InternalHoope
    public final void synpred31_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4231:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4231:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4231:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4231:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4231:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4232:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4232:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt113=2;
        int LA113_0 = input.LA(1);

        if ( (LA113_0==RULE_ID||LA113_0==21||LA113_0==40) ) {
            alt113=1;
        }
        switch (alt113) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4232:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4232:3: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4233:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4233:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4234:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHoope9925);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4236:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop112:
                do {
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==22) ) {
                        alt112=1;
                    }


                    switch (alt112) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4236:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred31_InternalHoope9932); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4237:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4238:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4238:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4239:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHoope9939);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop112;
                    }
                } while (true);


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4241:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4242:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4242:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4243:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred31_InternalHoope9953); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalHoope

    // $ANTLR start synpred32_InternalHoope
    public final void synpred32_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4310:4: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4310:5: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4310:5: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4310:6: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4310:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4311:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred32_InternalHoope10073); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalHoope

    // $ANTLR start synpred33_InternalHoope
    public final void synpred33_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4650:2: ( ( ruleXExpression ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4651:1: ( ruleXExpression )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4651:1: ( ruleXExpression )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4652:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalHoope10897);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalHoope

    // $ANTLR start synpred34_InternalHoope
    public final void synpred34_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4721:5: ( 'catch' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4721:7: 'catch'
        {
        match(input,83,FOLLOW_83_in_synpred34_InternalHoope11042); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalHoope

    // $ANTLR start synpred35_InternalHoope
    public final void synpred35_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4740:5: ( 'finally' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4740:7: 'finally'
        {
        match(input,82,FOLLOW_82_in_synpred35_InternalHoope11072); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHoope

    // $ANTLR start synpred37_InternalHoope
    public final void synpred37_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4888:3: ( '.' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:4889:2: '.'
        {
        match(input,52,FOLLOW_52_in_synpred37_InternalHoope11419); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHoope

    // $ANTLR start synpred38_InternalHoope
    public final void synpred38_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5014:2: ( ( () ruleArrayBrackets ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5014:3: ( () ruleArrayBrackets )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5014:3: ( () ruleArrayBrackets )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5014:4: () ruleArrayBrackets
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5014:4: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5015:1: 
        {
        }

        pushFollow(FOLLOW_ruleArrayBrackets_in_synpred38_InternalHoope11804);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalHoope

    // $ANTLR start synpred39_InternalHoope
    public final void synpred39_InternalHoope_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5199:4: ( '<' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/parser/antlr/internal/InternalHoope.g:5199:6: '<'
        {
        match(input,36,FOLLOW_36_in_synpred39_InternalHoope12256); if (state.failed) return ;

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
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA100 dfa100 = new DFA100(this);
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
    static final String DFA18_eotS =
        "\14\uffff";
    static final String DFA18_eofS =
        "\1\1\13\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\11\0\1\uffff";
    static final String DFA18_maxS =
        "\1\123\1\uffff\11\0\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA18_specialS =
        "\2\uffff\1\1\1\3\1\6\1\0\1\5\1\2\1\4\1\10\1\7\1\uffff}>";
    static final String[] DFA18_transitionS = {
            "\5\1\4\uffff\5\1\1\uffff\1\1\1\uffff\16\1\1\2\1\3\1\4\1\5\1"+
            "\6\1\7\1\10\1\11\1\12\16\1\1\uffff\31\1",
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1307:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_10 = input.LA(1);

                         
                        int index18_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHoope()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\14\uffff";
    static final String DFA21_eofS =
        "\14\uffff";
    static final String DFA21_minS =
        "\1\43\2\uffff\1\43\10\uffff";
    static final String DFA21_maxS =
        "\1\53\2\uffff\1\47\10\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\11\1\12\1\6\1\3";
    static final String DFA21_specialS =
        "\14\uffff}>";
    static final String[] DFA21_transitionS = {
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1372:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )";
        }
    }
    static final String DFA35_eotS =
        "\114\uffff";
    static final String DFA35_eofS =
        "\1\2\113\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA35_maxS =
        "\1\123\1\0\112\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA35_transitionS = {
            "\5\2\4\uffff\5\2\1\uffff\1\2\1\uffff\1\1\44\2\1\uffff\31\2",
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
            return "2126:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?";
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
                        if ( (synpred15_InternalHoope()) ) {s = 75;}

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
    static final String DFA34_eotS =
        "\44\uffff";
    static final String DFA34_eofS =
        "\44\uffff";
    static final String DFA34_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA34_maxS =
        "\1\121\2\0\41\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\2\1\1\2\35\uffff\1\3";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA34_transitionS = {
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
            return "2147:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==RULE_ID) ) {s = 1;}

                        else if ( (LA34_0==21) ) {s = 2;}

                        else if ( (LA34_0==40) && (synpred16_InternalHoope())) {s = 3;}

                        else if ( (LA34_0==58) && (synpred16_InternalHoope())) {s = 4;}

                        else if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_DECIMAL)||(LA34_0>=14 && LA34_0<=15)||LA34_0==36||(LA34_0>=44 && LA34_0<=45)||LA34_0==50||(LA34_0>=55 && LA34_0<=56)||LA34_0==59||LA34_0==61||(LA34_0>=64 && LA34_0<=66)||(LA34_0>=69 && LA34_0<=81)) ) {s = 5;}

                        else if ( (LA34_0==23) ) {s = 35;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_2);
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
    static final String DFA36_eotS =
        "\114\uffff";
    static final String DFA36_eofS =
        "\1\2\113\uffff";
    static final String DFA36_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA36_maxS =
        "\1\123\1\0\112\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA36_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA36_transitionS = {
            "\5\2\4\uffff\5\2\1\uffff\1\2\1\uffff\43\2\1\1\1\2\1\uffff\31"+
            "\2",
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2226:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\46\uffff";
    static final String DFA46_eofS =
        "\46\uffff";
    static final String DFA46_minS =
        "\1\4\2\0\43\uffff";
    static final String DFA46_maxS =
        "\1\121\2\0\43\uffff";
    static final String DFA46_acceptS =
        "\3\uffff\2\1\1\2\40\uffff";
    static final String DFA46_specialS =
        "\1\0\1\1\1\2\43\uffff}>";
    static final String[] DFA46_transitionS = {
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

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "2569:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_0 = input.LA(1);

                         
                        int index46_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA46_0==RULE_ID) ) {s = 1;}

                        else if ( (LA46_0==21) ) {s = 2;}

                        else if ( (LA46_0==40) && (synpred20_InternalHoope())) {s = 3;}

                        else if ( (LA46_0==58) && (synpred20_InternalHoope())) {s = 4;}

                        else if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_DECIMAL)||(LA46_0>=14 && LA46_0<=15)||LA46_0==36||(LA46_0>=44 && LA46_0<=45)||LA46_0==50||(LA46_0>=55 && LA46_0<=57)||LA46_0==59||LA46_0==61||(LA46_0>=64 && LA46_0<=81)) ) {s = 5;}

                         
                        input.seek(index46_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index46_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\114\uffff";
    static final String DFA69_eofS =
        "\1\2\113\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA69_maxS =
        "\1\123\1\0\112\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA69_transitionS = {
            "\5\2\4\uffff\5\2\1\uffff\1\2\1\uffff\1\1\44\2\1\uffff\31\2",
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
            return "3912:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?";
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
                        if ( (synpred26_InternalHoope()) ) {s = 75;}

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
    static final String DFA68_eotS =
        "\44\uffff";
    static final String DFA68_eofS =
        "\44\uffff";
    static final String DFA68_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA68_maxS =
        "\1\121\2\0\41\uffff";
    static final String DFA68_acceptS =
        "\3\uffff\2\1\1\2\35\uffff\1\3";
    static final String DFA68_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA68_transitionS = {
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
            return "3933:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_0 = input.LA(1);

                         
                        int index68_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA68_0==RULE_ID) ) {s = 1;}

                        else if ( (LA68_0==21) ) {s = 2;}

                        else if ( (LA68_0==40) && (synpred27_InternalHoope())) {s = 3;}

                        else if ( (LA68_0==58) && (synpred27_InternalHoope())) {s = 4;}

                        else if ( ((LA68_0>=RULE_STRING && LA68_0<=RULE_DECIMAL)||(LA68_0>=14 && LA68_0<=15)||LA68_0==36||(LA68_0>=44 && LA68_0<=45)||LA68_0==50||(LA68_0>=55 && LA68_0<=56)||LA68_0==59||LA68_0==61||(LA68_0>=64 && LA68_0<=66)||(LA68_0>=69 && LA68_0<=81)) ) {s = 5;}

                        else if ( (LA68_0==23) ) {s = 35;}

                         
                        input.seek(index68_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index68_2);
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
    static final String DFA70_eotS =
        "\114\uffff";
    static final String DFA70_eofS =
        "\1\2\113\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA70_maxS =
        "\1\123\1\0\112\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\4\uffff\5\2\1\uffff\1\2\1\uffff\43\2\1\1\1\2\1\uffff\31"+
            "\2",
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

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4012:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\114\uffff";
    static final String DFA74_eofS =
        "\1\2\113\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA74_maxS =
        "\1\123\1\0\112\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA74_transitionS = {
            "\5\2\4\uffff\5\2\1\uffff\1\2\1\uffff\17\2\1\1\25\2\1\uffff\31"+
            "\2",
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

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4177:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\114\uffff";
    static final String DFA77_eofS =
        "\1\2\113\uffff";
    static final String DFA77_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA77_maxS =
        "\1\123\1\0\112\uffff";
    static final String DFA77_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA77_transitionS = {
            "\5\2\4\uffff\5\2\1\uffff\1\2\1\uffff\1\1\44\2\1\uffff\31\2",
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
            return "4226:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred30_InternalHoope()) ) {s = 75;}

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
    static final String DFA76_eotS =
        "\44\uffff";
    static final String DFA76_eofS =
        "\44\uffff";
    static final String DFA76_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA76_maxS =
        "\1\121\2\0\41\uffff";
    static final String DFA76_acceptS =
        "\3\uffff\2\1\1\2\35\uffff\1\3";
    static final String DFA76_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA76_transitionS = {
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
            return "4231:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_0 = input.LA(1);

                         
                        int index76_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA76_0==RULE_ID) ) {s = 1;}

                        else if ( (LA76_0==21) ) {s = 2;}

                        else if ( (LA76_0==40) && (synpred31_InternalHoope())) {s = 3;}

                        else if ( (LA76_0==58) && (synpred31_InternalHoope())) {s = 4;}

                        else if ( ((LA76_0>=RULE_STRING && LA76_0<=RULE_DECIMAL)||(LA76_0>=14 && LA76_0<=15)||LA76_0==36||(LA76_0>=44 && LA76_0<=45)||LA76_0==50||(LA76_0>=55 && LA76_0<=56)||LA76_0==59||LA76_0==61||(LA76_0>=64 && LA76_0<=66)||(LA76_0>=69 && LA76_0<=81)) ) {s = 5;}

                        else if ( (LA76_0==23) ) {s = 35;}

                         
                        input.seek(index76_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHoope()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index76_2);
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
    static final String DFA78_eotS =
        "\114\uffff";
    static final String DFA78_eofS =
        "\1\2\113\uffff";
    static final String DFA78_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA78_maxS =
        "\1\123\1\0\112\uffff";
    static final String DFA78_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA78_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA78_transitionS = {
            "\5\2\4\uffff\5\2\1\uffff\1\2\1\uffff\43\2\1\1\1\2\1\uffff\31"+
            "\2",
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

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "4310:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\114\uffff";
    static final String DFA81_eofS =
        "\1\41\113\uffff";
    static final String DFA81_minS =
        "\1\4\40\0\53\uffff";
    static final String DFA81_maxS =
        "\1\123\40\0\53\uffff";
    static final String DFA81_acceptS =
        "\41\uffff\1\2\51\uffff\1\1";
    static final String DFA81_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\53\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\26\1\22\1\23\1\24\1\1\4\uffff\1\41\1\40\1\12\2\41\1\uffff"+
            "\1\41\1\uffff\1\37\16\41\1\14\7\41\1\10\1\7\4\41\1\6\4\41\1"+
            "\16\1\17\1\41\1\uffff\1\30\1\41\1\13\2\41\1\31\1\32\1\33\2\41"+
            "\1\2\1\3\1\4\1\5\1\15\1\11\1\20\1\21\1\25\1\27\1\34\1\35\1\36"+
            "\2\41",
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
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "4650:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_2 = input.LA(1);

                         
                        int index81_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_3 = input.LA(1);

                         
                        int index81_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_4 = input.LA(1);

                         
                        int index81_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_8 = input.LA(1);

                         
                        int index81_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_9 = input.LA(1);

                         
                        int index81_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_10 = input.LA(1);

                         
                        int index81_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_12 = input.LA(1);

                         
                        int index81_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA81_13 = input.LA(1);

                         
                        int index81_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA81_14 = input.LA(1);

                         
                        int index81_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA81_15 = input.LA(1);

                         
                        int index81_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA81_16 = input.LA(1);

                         
                        int index81_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA81_17 = input.LA(1);

                         
                        int index81_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA81_18 = input.LA(1);

                         
                        int index81_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA81_19 = input.LA(1);

                         
                        int index81_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA81_20 = input.LA(1);

                         
                        int index81_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA81_21 = input.LA(1);

                         
                        int index81_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA81_22 = input.LA(1);

                         
                        int index81_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA81_23 = input.LA(1);

                         
                        int index81_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA81_24 = input.LA(1);

                         
                        int index81_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA81_25 = input.LA(1);

                         
                        int index81_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA81_26 = input.LA(1);

                         
                        int index81_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA81_27 = input.LA(1);

                         
                        int index81_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA81_28 = input.LA(1);

                         
                        int index81_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA81_29 = input.LA(1);

                         
                        int index81_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA81_30 = input.LA(1);

                         
                        int index81_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA81_31 = input.LA(1);

                         
                        int index81_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA81_32 = input.LA(1);

                         
                        int index81_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHoope()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index81_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA96_eotS =
        "\115\uffff";
    static final String DFA96_eofS =
        "\1\2\114\uffff";
    static final String DFA96_minS =
        "\1\4\1\0\113\uffff";
    static final String DFA96_maxS =
        "\1\123\1\0\113\uffff";
    static final String DFA96_acceptS =
        "\2\uffff\1\2\111\uffff\1\1";
    static final String DFA96_specialS =
        "\1\uffff\1\0\113\uffff}>";
    static final String[] DFA96_transitionS = {
            "\5\2\4\uffff\7\2\1\uffff\17\2\1\1\25\2\1\uffff\31\2",
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
            "",
            ""
    };

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "5199:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA96_1 = input.LA(1);

                         
                        int index96_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalHoope()) ) {s = 76;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index96_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 96, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA100_eotS =
        "\7\uffff";
    static final String DFA100_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA100_minS =
        "\1\10\1\uffff\1\15\1\10\2\uffff\1\15";
    static final String DFA100_maxS =
        "\1\106\1\uffff\1\64\1\56\2\uffff\1\64";
    static final String DFA100_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA100_specialS =
        "\7\uffff}>";
    static final String[] DFA100_transitionS = {
            "\1\2\75\uffff\1\1",
            "",
            "\1\4\46\uffff\1\3",
            "\1\6\45\uffff\1\5",
            "",
            "",
            "\1\4\46\uffff\1\3"
    };

    static final short[] DFA100_eot = DFA.unpackEncodedString(DFA100_eotS);
    static final short[] DFA100_eof = DFA.unpackEncodedString(DFA100_eofS);
    static final char[] DFA100_min = DFA.unpackEncodedStringToUnsignedChars(DFA100_minS);
    static final char[] DFA100_max = DFA.unpackEncodedStringToUnsignedChars(DFA100_maxS);
    static final short[] DFA100_accept = DFA.unpackEncodedString(DFA100_acceptS);
    static final short[] DFA100_special = DFA.unpackEncodedString(DFA100_specialS);
    static final short[][] DFA100_transition;

    static {
        int numStates = DFA100_transitionS.length;
        DFA100_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA100_transition[i] = DFA.unpackEncodedString(DFA100_transitionS[i]);
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = DFA100_eot;
            this.eof = DFA100_eof;
            this.min = DFA100_min;
            this.max = DFA100_max;
            this.accept = DFA100_accept;
            this.special = DFA100_special;
            this.transition = DFA100_transition;
        }
        public String getDescription() {
            return "5586:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
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
    public static final BitSet FOLLOW_15_in_ruleHoopeObject705 = new BitSet(new long[]{0x0000000000090100L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleHoopeObject726 = new BitSet(new long[]{0x0000000000090100L});
    public static final BitSet FOLLOW_16_in_ruleHoopeObject739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFeature832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleFeature859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProperty950 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProperty962 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleProperty983 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleProperty996 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleProperty1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMessage1102 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMessage1123 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMessage1135 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMessage1147 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMessage1159 = new BitSet(new long[]{0x0000010000A00100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleMessage1181 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleMessage1194 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleMessage1215 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleMessage1231 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMessage1243 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMessage1264 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleMessage1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXAssignment1479 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1495 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1545 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1598 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpSingleAssign1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpMultiAssign1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpMultiAssign1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1914 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1967 = new BitSet(new long[]{0x298430100420E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1990 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOr2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2173 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2226 = new BitSet(new long[]{0x298430100820E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2249 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpAnd2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2432 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2485 = new BitSet(new long[]{0x29843010F020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2508 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpEquality2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpEquality2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpEquality2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2750 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_32_in_ruleXRelationalExpression2786 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2809 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2870 = new BitSet(new long[]{0x2984301F0020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2893 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3136 = new BitSet(new long[]{0x00000FF800000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3189 = new BitSet(new long[]{0x29843FF80020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3212 = new BitSet(new long[]{0x00000FF800000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3339 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOpOther3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpOther3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3411 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3442 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3498 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3529 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpOther3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpOther3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3719 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3772 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3795 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpAdd3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpAdd3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3999 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4052 = new BitSet(new long[]{0x2987F0100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4075 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpMulti4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpMulti4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4328 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpUnary4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpUnary4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpUnary4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4598 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXCastedExpression4633 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4656 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4751 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall4823 = new BitSet(new long[]{0x0000000000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall4847 = new BitSet(new long[]{0x0000000000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4884 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4900 = new BitSet(new long[]{0x29F430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4922 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall5008 = new BitSet(new long[]{0x0000001000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_54_in_ruleXMemberFeatureCall5032 = new BitSet(new long[]{0x0000001000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall5069 = new BitSet(new long[]{0x0000001000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall5098 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5119 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall5132 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5153 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall5167 = new BitSet(new long[]{0x0000000000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall5192 = new BitSet(new long[]{0x0170000000200002L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall5226 = new BitSet(new long[]{0x2D84311000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5311 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5339 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall5352 = new BitSet(new long[]{0x2984301000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5373 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall5390 = new BitSet(new long[]{0x0170000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5425 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral5733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCollectionLiteral5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral5852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSetLiteral5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXSetLiteral5908 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSetLiteral5920 = new BitSet(new long[]{0x298430100061E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral5942 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleXSetLiteral5955 = new BitSet(new long[]{0x298430100061E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral5976 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleXSetLiteral5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral6028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXListLiteral6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXListLiteral6084 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXListLiteral6096 = new BitSet(new long[]{0x2B8430100060E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral6118 = new BitSet(new long[]{0x0200000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXListLiteral6131 = new BitSet(new long[]{0x2B8430100060E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral6152 = new BitSet(new long[]{0x0200000000400000L});
    public static final BitSet FOLLOW_57_in_ruleXListLiteral6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXClosure6274 = new BitSet(new long[]{0x2D8431100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6347 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXClosure6360 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6381 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_ruleXClosure6403 = new BitSet(new long[]{0x2D8431100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6440 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXClosure6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6554 = new BitSet(new long[]{0x298430100020E1F2L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_13_in_ruleXExpressionInClosure6567 = new BitSet(new long[]{0x298430100020E1F2L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6725 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXShortClosure6738 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6759 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_ruleXShortClosure6781 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleXParenthesizedExpression6900 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6922 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXParenthesizedExpression6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXIfExpression7025 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXIfExpression7037 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7058 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXIfExpression7070 = new BitSet(new long[]{0x398430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7091 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXIfExpression7112 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression7228 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7271 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression7283 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7307 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression7351 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7372 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression7384 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7407 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXSwitchExpression7419 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSwitchExpression7433 = new BitSet(new long[]{0x8000010000220100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7454 = new BitSet(new long[]{0xC000010000230100L});
    public static final BitSet FOLLOW_62_in_ruleXSwitchExpression7468 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression7480 = new BitSet(new long[]{0x298430100021E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7501 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression7515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7607 = new BitSet(new long[]{0x8000000000020000L});
    public static final BitSet FOLLOW_63_in_ruleXCasePart7621 = new BitSet(new long[]{0x298430100022E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7642 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXCasePart7656 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXForLoopExpression7769 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression7781 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7802 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXForLoopExpression7814 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7835 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXForLoopExpression7847 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXWhileExpression7960 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXWhileExpression7972 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7993 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXWhileExpression8005 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXDoWhileExpression8118 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXDoWhileExpression8151 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXDoWhileExpression8163 = new BitSet(new long[]{0x2984301000A0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8184 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXDoWhileExpression8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression8288 = new BitSet(new long[]{0x298430100021E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8310 = new BitSet(new long[]{0x298430100021E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression8323 = new BitSet(new long[]{0x298430100021E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXVariableDeclaration8557 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_68_in_ruleXVariableDeclaration8588 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8636 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8657 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8686 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration8700 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8815 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8929 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall9043 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9064 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall9077 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9098 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXFeatureCall9112 = new BitSet(new long[]{0x0000001000000100L,0x00000000000003E0L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9137 = new BitSet(new long[]{0x0100000000200002L});
    public static final BitSet FOLLOW_21_in_ruleXFeatureCall9171 = new BitSet(new long[]{0x2D84311000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9256 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9284 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall9297 = new BitSet(new long[]{0x2984301000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9318 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall9335 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID9408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCallID9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFeatureCallID9466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleFeatureCallID9490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleFeatureCallID9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleFeatureCallID9528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleFeatureCallID9547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper9646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleIdOrSuper9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXConstructorCall9766 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9789 = new BitSet(new long[]{0x0100001000200002L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall9810 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9832 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9845 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9866 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXConstructorCall9880 = new BitSet(new long[]{0x0100000000200002L});
    public static final BitSet FOLLOW_21_in_ruleXConstructorCall9903 = new BitSet(new long[]{0x2D84311000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9976 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10004 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall10017 = new BitSet(new long[]{0x2984301000E0E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10038 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall10055 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall10090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXBooleanLiteral10184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXBooleanLiteral10208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXNullLiteral10314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral10360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral10415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXTypeLiteral10609 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXTypeLiteral10621 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10644 = new BitSet(new long[]{0x0100000000800000L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral10665 = new BitSet(new long[]{0x0100000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXTypeLiteral10678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXThrowExpression10770 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleXReturnExpression10883 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleXTryCatchFinallyExpression11007 = new BitSet(new long[]{0x298430100020E1F0L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11028 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11058 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_ruleXTryCatchFinallyExpression11080 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleXTryCatchFinallyExpression11124 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleXCatchClause11238 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCatchClause11251 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11272 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXCatchClause11284 = new BitSet(new long[]{0x298430100020E1F0L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11400 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleQualifiedName11428 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11451 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber11505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber11516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11588 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11614 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNumber11634 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11789 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference11825 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets11892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayBrackets11903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleArrayBrackets11941 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleArrayBrackets11954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef12004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleXFunctionTypeRef12042 = new BitSet(new long[]{0x0000010000A00100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12064 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXFunctionTypeRef12077 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12098 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXFunctionTypeRef12114 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef12128 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12243 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference12264 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12286 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleJvmParameterizedTypeReference12299 = new BitSet(new long[]{0x0000010000200100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12320 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleJvmParameterizedTypeReference12334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleJvmWildcardTypeReference12547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000220L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleJvmUpperBound12681 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleJvmUpperBoundAnded12785 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmLowerBound12889 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard13007 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleQualifiedNameWithWildcard13025 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleQualifiedNameWithWildcard13038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID13079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID13090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID13129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration13175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImportDeclaration13185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXImportDeclaration13222 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleXImportDeclaration13242 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleXImportDeclaration13273 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13310 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXImportDeclaration13322 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXImportDeclaration13334 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13364 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration13391 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleXImportDeclaration13405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHoope1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHoope1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHoope2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHoope2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred5_InternalHoope2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHoope2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHoope3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred8_InternalHoope3426 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred8_InternalHoope3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred9_InternalHoope3513 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_synpred9_InternalHoope3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHoope3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHoope4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred12_InternalHoope4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred13_InternalHoope4769 = new BitSet(new long[]{0x0000000000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_53_in_synpred13_InternalHoope4783 = new BitSet(new long[]{0x0000000000000100L,0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_synpred13_InternalHoope4799 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHoope4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred14_InternalHoope4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred14_InternalHoope4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred14_InternalHoope4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred15_InternalHoope5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHoope5260 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_synpred16_InternalHoope5267 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHoope5274 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_synpred16_InternalHoope5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred17_InternalHoope5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred18_InternalHoope5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHoope6293 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_synpred20_InternalHoope6300 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHoope6307 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_synpred20_InternalHoope6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_synpred22_InternalHoope7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHoope7246 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred23_InternalHoope7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred24_InternalHoope7328 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalHoope7335 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred24_InternalHoope7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHoope8606 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalHoope8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred26_InternalHoope9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHoope9205 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_synpred27_InternalHoope9212 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHoope9219 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_synpred27_InternalHoope9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred28_InternalHoope9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred29_InternalHoope9802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred30_InternalHoope9895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHoope9925 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_synpred31_InternalHoope9932 = new BitSet(new long[]{0x0000010000200100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHoope9939 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_58_in_synpred31_InternalHoope9953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred32_InternalHoope10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalHoope10897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_synpred34_InternalHoope11042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_synpred35_InternalHoope11072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred37_InternalHoope11419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_synpred38_InternalHoope11804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred39_InternalHoope12256 = new BitSet(new long[]{0x0000000000000002L});

}