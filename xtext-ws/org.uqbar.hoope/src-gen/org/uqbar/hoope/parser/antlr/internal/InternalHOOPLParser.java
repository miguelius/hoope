package org.uqbar.hoope.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.uqbar.hoope.services.HOOPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHOOPLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ref'", "'= object {'", "'}'", "':'", "'='", "'message'", "'= method {'", "'if'", "'then'", "'else'", "'while'", "'{'", "'..'", "'+'", "'-'", "'*'", "'/'", "'Number'", "'String'", "'Boolean'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g"; }



     	private HOOPLGrammarAccess grammarAccess;
     	
        public InternalHOOPLParser(TokenStream input, HOOPLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected HOOPLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:69:2: iv_ruleProgram= ruleProgram EOF
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:76:1: ruleProgram returns [EObject current=null] : ( ( (lv_objects_0_1= ruleExpresion | lv_objects_0_2= ruleObjectDefinition ) ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_objects_0_1 = null;

        EObject lv_objects_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:79:28: ( ( ( (lv_objects_0_1= ruleExpresion | lv_objects_0_2= ruleObjectDefinition ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:80:1: ( ( (lv_objects_0_1= ruleExpresion | lv_objects_0_2= ruleObjectDefinition ) ) )*
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:80:1: ( ( (lv_objects_0_1= ruleExpresion | lv_objects_0_2= ruleObjectDefinition ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)||LA2_0==11||LA2_0==18||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:81:1: ( (lv_objects_0_1= ruleExpresion | lv_objects_0_2= ruleObjectDefinition ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:81:1: ( (lv_objects_0_1= ruleExpresion | lv_objects_0_2= ruleObjectDefinition ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:82:1: (lv_objects_0_1= ruleExpresion | lv_objects_0_2= ruleObjectDefinition )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:82:1: (lv_objects_0_1= ruleExpresion | lv_objects_0_2= ruleObjectDefinition )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==18||LA1_0==21) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==11) ) {
            	        alt1=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:83:3: lv_objects_0_1= ruleExpresion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getProgramAccess().getObjectsExpresionParserRuleCall_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpresion_in_ruleProgram132);
            	            lv_objects_0_1=ruleExpresion();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"objects",
            	                      		lv_objects_0_1, 
            	                      		"Expresion");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:98:8: lv_objects_0_2= ruleObjectDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getProgramAccess().getObjectsObjectDefinitionParserRuleCall_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleObjectDefinition_in_ruleProgram151);
            	            lv_objects_0_2=ruleObjectDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"objects",
            	                      		lv_objects_0_2, 
            	                      		"ObjectDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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


    // $ANTLR start "entryRuleObjectDefinition"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:124:1: entryRuleObjectDefinition returns [EObject current=null] : iv_ruleObjectDefinition= ruleObjectDefinition EOF ;
    public final EObject entryRuleObjectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDefinition = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:125:2: (iv_ruleObjectDefinition= ruleObjectDefinition EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:126:2: iv_ruleObjectDefinition= ruleObjectDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectDefinition_in_entryRuleObjectDefinition190);
            iv_ruleObjectDefinition=ruleObjectDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDefinition200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectDefinition"


    // $ANTLR start "ruleObjectDefinition"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:133:1: ruleObjectDefinition returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '= object {' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleObjectDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:136:28: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '= object {' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:137:1: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '= object {' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:137:1: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '= object {' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:137:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '= object {' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleObjectDefinition237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getObjectDefinitionAccess().getRefKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:141:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:142:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:142:1: (lv_name_1_0= RULE_ID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:143:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectDefinition254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getObjectDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleObjectDefinition271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getObjectDefinitionAccess().getObjectKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:163:1: ( (lv_features_3_0= ruleFeature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==11||LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:164:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:164:1: (lv_features_3_0= ruleFeature )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:165:3: lv_features_3_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getObjectDefinitionAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleObjectDefinition292);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
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
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleObjectDefinition305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getObjectDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleObjectDefinition"


    // $ANTLR start "entryRuleFeature"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:193:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:194:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:195:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature341);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature351); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:202:1: ruleFeature returns [EObject current=null] : (this_ObjectDefinition_0= ruleObjectDefinition | this_Property_1= ruleProperty | this_Message_2= ruleMessage ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectDefinition_0 = null;

        EObject this_Property_1 = null;

        EObject this_Message_2 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:205:28: ( (this_ObjectDefinition_0= ruleObjectDefinition | this_Property_1= ruleProperty | this_Message_2= ruleMessage ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:206:1: (this_ObjectDefinition_0= ruleObjectDefinition | this_Property_1= ruleProperty | this_Message_2= ruleMessage )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:206:1: (this_ObjectDefinition_0= ruleObjectDefinition | this_Property_1= ruleProperty | this_Message_2= ruleMessage )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:207:5: this_ObjectDefinition_0= ruleObjectDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getObjectDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectDefinition_in_ruleFeature398);
                    this_ObjectDefinition_0=ruleObjectDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ObjectDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:217:5: this_Property_1= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleFeature425);
                    this_Property_1=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Property_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:227:5: this_Message_2= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getMessageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleFeature452);
                    this_Message_2=ruleMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Message_2; 
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:243:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:244:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:245:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty487);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty497); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:252:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypo ) ) (otherlv_3= '=' ( (lv_initial_4_0= ruleTerminal ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_initial_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:255:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypo ) ) (otherlv_3= '=' ( (lv_initial_4_0= ruleTerminal ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:256:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypo ) ) (otherlv_3= '=' ( (lv_initial_4_0= ruleTerminal ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:256:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypo ) ) (otherlv_3= '=' ( (lv_initial_4_0= ruleTerminal ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:256:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypo ) ) (otherlv_3= '=' ( (lv_initial_4_0= ruleTerminal ) ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:256:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:257:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:257:1: (lv_name_0_0= RULE_ID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:258:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleProperty556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:278:1: ( (lv_type_2_0= ruleTypo ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:279:1: (lv_type_2_0= ruleTypo )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:279:1: (lv_type_2_0= ruleTypo )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:280:3: lv_type_2_0= ruleTypo
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypoParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypo_in_ruleProperty577);
            lv_type_2_0=ruleTypo();

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
                      		"Typo");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:296:2: (otherlv_3= '=' ( (lv_initial_4_0= ruleTerminal ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:296:4: otherlv_3= '=' ( (lv_initial_4_0= ruleTerminal ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleProperty590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:300:1: ( (lv_initial_4_0= ruleTerminal ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:301:1: (lv_initial_4_0= ruleTerminal )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:301:1: (lv_initial_4_0= ruleTerminal )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:302:3: lv_initial_4_0= ruleTerminal
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getInitialTerminalParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTerminal_in_ruleProperty611);
                    lv_initial_4_0=ruleTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"initial",
                              		lv_initial_4_0, 
                              		"Terminal");
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:326:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:327:2: (iv_ruleMessage= ruleMessage EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:328:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage649);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage659); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:335:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '= method {' ( (lv_sentences_3_0= ruleExpresion ) )* otherlv_4= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sentences_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:338:28: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '= method {' ( (lv_sentences_3_0= ruleExpresion ) )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:339:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '= method {' ( (lv_sentences_3_0= ruleExpresion ) )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:339:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '= method {' ( (lv_sentences_3_0= ruleExpresion ) )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:339:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '= method {' ( (lv_sentences_3_0= ruleExpresion ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleMessage696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:343:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:344:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:344:1: (lv_name_1_0= RULE_ID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:345:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMessage730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getMethodKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:365:1: ( (lv_sentences_3_0= ruleExpresion ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||LA6_0==18||LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:366:1: (lv_sentences_3_0= ruleExpresion )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:366:1: (lv_sentences_3_0= ruleExpresion )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:367:3: lv_sentences_3_0= ruleExpresion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMessageAccess().getSentencesExpresionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpresion_in_ruleMessage751);
            	    lv_sentences_3_0=ruleExpresion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMessageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sentences",
            	              		lv_sentences_3_0, 
            	              		"Expresion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMessage764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4());
                  
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


    // $ANTLR start "entryRuleExpresion"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:395:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:396:2: (iv_ruleExpresion= ruleExpresion EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:397:2: iv_ruleExpresion= ruleExpresion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpresionRule()); 
            }
            pushFollow(FOLLOW_ruleExpresion_in_entryRuleExpresion800);
            iv_ruleExpresion=ruleExpresion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpresion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpresion810); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:404:1: ruleExpresion returns [EObject current=null] : (this_WhileExpresion_0= ruleWhileExpresion | this_IfExpresion_1= ruleIfExpresion | ( ruleTerminal ( ruleOperator ruleTerminal )* ) ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        EObject this_WhileExpresion_0 = null;

        EObject this_IfExpresion_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:407:28: ( (this_WhileExpresion_0= ruleWhileExpresion | this_IfExpresion_1= ruleIfExpresion | ( ruleTerminal ( ruleOperator ruleTerminal )* ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:408:1: (this_WhileExpresion_0= ruleWhileExpresion | this_IfExpresion_1= ruleIfExpresion | ( ruleTerminal ( ruleOperator ruleTerminal )* ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:408:1: (this_WhileExpresion_0= ruleWhileExpresion | this_IfExpresion_1= ruleIfExpresion | ( ruleTerminal ( ruleOperator ruleTerminal )* ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:409:5: this_WhileExpresion_0= ruleWhileExpresion
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpresionAccess().getWhileExpresionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhileExpresion_in_ruleExpresion857);
                    this_WhileExpresion_0=ruleWhileExpresion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WhileExpresion_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:419:5: this_IfExpresion_1= ruleIfExpresion
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpresionAccess().getIfExpresionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfExpresion_in_ruleExpresion884);
                    this_IfExpresion_1=ruleIfExpresion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExpresion_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:428:6: ( ruleTerminal ( ruleOperator ruleTerminal )* )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:428:6: ( ruleTerminal ( ruleOperator ruleTerminal )* )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:429:5: ruleTerminal ( ruleOperator ruleTerminal )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTerminal_in_ruleExpresion906);
                    ruleTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:436:1: ( ruleOperator ruleTerminal )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=24 && LA7_0<=27)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:437:5: ruleOperator ruleTerminal
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getExpresionAccess().getOperatorParserRuleCall_2_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleOperator_in_ruleExpresion922);
                    	    ruleOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleTerminal_in_ruleExpresion937);
                    	    ruleTerminal();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


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
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleIfExpresion"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:460:1: entryRuleIfExpresion returns [EObject current=null] : iv_ruleIfExpresion= ruleIfExpresion EOF ;
    public final EObject entryRuleIfExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpresion = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:461:2: (iv_ruleIfExpresion= ruleIfExpresion EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:462:2: iv_ruleIfExpresion= ruleIfExpresion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpresionRule()); 
            }
            pushFollow(FOLLOW_ruleIfExpresion_in_entryRuleIfExpresion975);
            iv_ruleIfExpresion=ruleIfExpresion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpresion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpresion985); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpresion"


    // $ANTLR start "ruleIfExpresion"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:469:1: ruleIfExpresion returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpresion ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleExpresion ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleExpresion ) ) )? ) ;
    public final EObject ruleIfExpresion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:472:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpresion ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleExpresion ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleExpresion ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:473:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpresion ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleExpresion ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleExpresion ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:473:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpresion ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleExpresion ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleExpresion ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:473:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpresion ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleExpresion ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleExpresion ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleIfExpresion1022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpresionAccess().getIfKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:477:1: ( (lv_condition_1_0= ruleExpresion ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:478:1: (lv_condition_1_0= ruleExpresion )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:478:1: (lv_condition_1_0= ruleExpresion )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:479:3: lv_condition_1_0= ruleExpresion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpresionAccess().getConditionExpresionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpresion_in_ruleIfExpresion1043);
            lv_condition_1_0=ruleExpresion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpresionRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"Expresion");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleIfExpresion1055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpresionAccess().getThenKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:499:1: ( (lv_then_3_0= ruleExpresion ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:500:1: (lv_then_3_0= ruleExpresion )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:500:1: (lv_then_3_0= ruleExpresion )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:501:3: lv_then_3_0= ruleExpresion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpresionAccess().getThenExpresionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpresion_in_ruleIfExpresion1076);
            lv_then_3_0=ruleExpresion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpresionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_3_0, 
                      		"Expresion");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:517:2: ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleExpresion ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred1_InternalHOOPL()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:517:3: ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleExpresion ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:517:3: ( ( 'else' )=>otherlv_4= 'else' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:517:4: ( 'else' )=>otherlv_4= 'else'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleIfExpresion1097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIfExpresionAccess().getElseKeyword_4_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:522:2: ( (lv_else_5_0= ruleExpresion ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:523:1: (lv_else_5_0= ruleExpresion )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:523:1: (lv_else_5_0= ruleExpresion )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:524:3: lv_else_5_0= ruleExpresion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpresionAccess().getElseExpresionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpresion_in_ruleIfExpresion1119);
                    lv_else_5_0=ruleExpresion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpresionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_5_0, 
                              		"Expresion");
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
    // $ANTLR end "ruleIfExpresion"


    // $ANTLR start "entryRuleWhileExpresion"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:548:1: entryRuleWhileExpresion returns [EObject current=null] : iv_ruleWhileExpresion= ruleWhileExpresion EOF ;
    public final EObject entryRuleWhileExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileExpresion = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:549:2: (iv_ruleWhileExpresion= ruleWhileExpresion EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:550:2: iv_ruleWhileExpresion= ruleWhileExpresion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileExpresionRule()); 
            }
            pushFollow(FOLLOW_ruleWhileExpresion_in_entryRuleWhileExpresion1157);
            iv_ruleWhileExpresion=ruleWhileExpresion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileExpresion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileExpresion1167); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileExpresion"


    // $ANTLR start "ruleWhileExpresion"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:557:1: ruleWhileExpresion returns [EObject current=null] : (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpresion ) ) otherlv_2= '{' ( (lv_sentences_3_0= ruleExpresion ) )* otherlv_4= '}' ) ;
    public final EObject ruleWhileExpresion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_sentences_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:560:28: ( (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpresion ) ) otherlv_2= '{' ( (lv_sentences_3_0= ruleExpresion ) )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:561:1: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpresion ) ) otherlv_2= '{' ( (lv_sentences_3_0= ruleExpresion ) )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:561:1: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpresion ) ) otherlv_2= '{' ( (lv_sentences_3_0= ruleExpresion ) )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:561:3: otherlv_0= 'while' ( (lv_condition_1_0= ruleExpresion ) ) otherlv_2= '{' ( (lv_sentences_3_0= ruleExpresion ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleWhileExpresion1204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileExpresionAccess().getWhileKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:565:1: ( (lv_condition_1_0= ruleExpresion ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:566:1: (lv_condition_1_0= ruleExpresion )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:566:1: (lv_condition_1_0= ruleExpresion )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:567:3: lv_condition_1_0= ruleExpresion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileExpresionAccess().getConditionExpresionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpresion_in_ruleWhileExpresion1225);
            lv_condition_1_0=ruleExpresion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileExpresionRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"Expresion");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleWhileExpresion1237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWhileExpresionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:587:1: ( (lv_sentences_3_0= ruleExpresion ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==18||LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:588:1: (lv_sentences_3_0= ruleExpresion )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:588:1: (lv_sentences_3_0= ruleExpresion )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:589:3: lv_sentences_3_0= ruleExpresion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getWhileExpresionAccess().getSentencesExpresionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpresion_in_ruleWhileExpresion1258);
            	    lv_sentences_3_0=ruleExpresion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getWhileExpresionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sentences",
            	              		lv_sentences_3_0, 
            	              		"Expresion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleWhileExpresion1271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getWhileExpresionAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleWhileExpresion"


    // $ANTLR start "entryRuleTerminal"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:617:1: entryRuleTerminal returns [String current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final String entryRuleTerminal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminal = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:618:2: (iv_ruleTerminal= ruleTerminal EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:619:2: iv_ruleTerminal= ruleTerminal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalRule()); 
            }
            pushFollow(FOLLOW_ruleTerminal_in_entryRuleTerminal1308);
            iv_ruleTerminal=ruleTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal1319); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:626:1: ruleTerminal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | (this_INT_3= RULE_INT kw= '..' this_INT_5= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleTerminal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_ID_2=null;
        Token this_INT_3=null;
        Token kw=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:629:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | (this_INT_3= RULE_INT kw= '..' this_INT_5= RULE_INT ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:630:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | (this_INT_3= RULE_INT kw= '..' this_INT_5= RULE_INT ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:630:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | (this_INT_3= RULE_INT kw= '..' this_INT_5= RULE_INT ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=RULE_ID && LA11_1<=RULE_STRING)||LA11_1==11||LA11_1==13||LA11_1==16||(LA11_1>=18 && LA11_1<=22)||(LA11_1>=24 && LA11_1<=27)) ) {
                    alt11=1;
                }
                else if ( (LA11_1==23) ) {
                    alt11=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:630:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminal1359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getTerminalAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:638:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminal1385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getTerminalAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:646:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminal1411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getTerminalAccess().getIDTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:654:6: (this_INT_3= RULE_INT kw= '..' this_INT_5= RULE_INT )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:654:6: (this_INT_3= RULE_INT kw= '..' this_INT_5= RULE_INT )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:654:11: this_INT_3= RULE_INT kw= '..' this_INT_5= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminal1438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_3, grammarAccess.getTerminalAccess().getINTTerminalRuleCall_3_0()); 
                          
                    }
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleTerminal1456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_3_1()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminal1471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_5, grammarAccess.getTerminalAccess().getINTTerminalRuleCall_3_2()); 
                          
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
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleOperator"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:682:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:683:2: (iv_ruleOperator= ruleOperator EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:684:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1518);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator1529); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:691:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:694:28: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:695:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:695:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            case 27:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:696:2: kw= '+'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOperator1567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:703:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOperator1586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:710:2: kw= '*'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOperator1605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:717:2: kw= '/'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOperator1624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_3()); 
                          
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleTypo"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:730:1: entryRuleTypo returns [String current=null] : iv_ruleTypo= ruleTypo EOF ;
    public final String entryRuleTypo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypo = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:731:2: (iv_ruleTypo= ruleTypo EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:732:2: iv_ruleTypo= ruleTypo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypoRule()); 
            }
            pushFollow(FOLLOW_ruleTypo_in_entryRuleTypo1665);
            iv_ruleTypo=ruleTypo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypo.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypo1676); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypo"


    // $ANTLR start "ruleTypo"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:739:1: ruleTypo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Number' | kw= 'String' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleTypo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:742:28: ( (kw= 'Number' | kw= 'String' | kw= 'Boolean' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:743:1: (kw= 'Number' | kw= 'String' | kw= 'Boolean' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:743:1: (kw= 'Number' | kw= 'String' | kw= 'Boolean' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:744:2: kw= 'Number'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleTypo1714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypoAccess().getNumberKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:751:2: kw= 'String'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleTypo1733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypoAccess().getStringKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:758:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleTypo1752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypoAccess().getBooleanKeyword_2()); 
                          
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
    // $ANTLR end "ruleTypo"

    // $ANTLR start synpred1_InternalHOOPL
    public final void synpred1_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:517:4: ( 'else' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:517:6: 'else'
        {
        match(input,20,FOLLOW_20_in_synpred1_InternalHOOPL1089); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalHOOPL

    // Delegated rules

    public final boolean synpred1_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpresion_in_ruleProgram132 = new BitSet(new long[]{0x0000000000240872L});
    public static final BitSet FOLLOW_ruleObjectDefinition_in_ruleProgram151 = new BitSet(new long[]{0x0000000000240872L});
    public static final BitSet FOLLOW_ruleObjectDefinition_in_entryRuleObjectDefinition190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDefinition200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleObjectDefinition237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectDefinition254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleObjectDefinition271 = new BitSet(new long[]{0x0000000000252870L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleObjectDefinition292 = new BitSet(new long[]{0x0000000000252870L});
    public static final BitSet FOLLOW_13_in_ruleObjectDefinition305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDefinition_in_ruleFeature398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFeature425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleFeature452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty539 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProperty556 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_ruleTypo_in_ruleProperty577 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleProperty590 = new BitSet(new long[]{0x0000000000240070L});
    public static final BitSet FOLLOW_ruleTerminal_in_ruleProperty611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMessage696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage713 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMessage730 = new BitSet(new long[]{0x0000000000242070L});
    public static final BitSet FOLLOW_ruleExpresion_in_ruleMessage751 = new BitSet(new long[]{0x0000000000242070L});
    public static final BitSet FOLLOW_13_in_ruleMessage764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpresion_in_entryRuleExpresion800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpresion810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileExpresion_in_ruleExpresion857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpresion_in_ruleExpresion884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_ruleExpresion906 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleExpresion922 = new BitSet(new long[]{0x0000000000240070L});
    public static final BitSet FOLLOW_ruleTerminal_in_ruleExpresion937 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_ruleIfExpresion_in_entryRuleIfExpresion975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpresion985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleIfExpresion1022 = new BitSet(new long[]{0x0000000000240070L});
    public static final BitSet FOLLOW_ruleExpresion_in_ruleIfExpresion1043 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIfExpresion1055 = new BitSet(new long[]{0x0000000000240070L});
    public static final BitSet FOLLOW_ruleExpresion_in_ruleIfExpresion1076 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleIfExpresion1097 = new BitSet(new long[]{0x0000000000240070L});
    public static final BitSet FOLLOW_ruleExpresion_in_ruleIfExpresion1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileExpresion_in_entryRuleWhileExpresion1157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileExpresion1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleWhileExpresion1204 = new BitSet(new long[]{0x0000000000240070L});
    public static final BitSet FOLLOW_ruleExpresion_in_ruleWhileExpresion1225 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWhileExpresion1237 = new BitSet(new long[]{0x0000000000242070L});
    public static final BitSet FOLLOW_ruleExpresion_in_ruleWhileExpresion1258 = new BitSet(new long[]{0x0000000000242070L});
    public static final BitSet FOLLOW_13_in_ruleWhileExpresion1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_entryRuleTerminal1308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminal1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminal1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminal1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminal1438 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTerminal1456 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminal1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOperator1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOperator1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOperator1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOperator1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypo_in_entryRuleTypo1665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypo1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTypo1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTypo1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTypo1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred1_InternalHOOPL1089 = new BitSet(new long[]{0x0000000000000002L});

}