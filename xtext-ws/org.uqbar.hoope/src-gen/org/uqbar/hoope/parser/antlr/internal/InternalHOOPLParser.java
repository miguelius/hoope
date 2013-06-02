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

@SuppressWarnings("all")
public class InternalHOOPLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'object'", "'{'", "'}'", "'='", "'@'", "'('", "')'", "'self'", "'subir'", "'bajar'", "'derecha'", "'izquierda'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
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
        	return "HOOPL";	
       	}
       	
       	@Override
       	protected HOOPLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHOOPL"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:67:1: entryRuleHOOPL returns [EObject current=null] : iv_ruleHOOPL= ruleHOOPL EOF ;
    public final EObject entryRuleHOOPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHOOPL = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:68:2: (iv_ruleHOOPL= ruleHOOPL EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:69:2: iv_ruleHOOPL= ruleHOOPL EOF
            {
             newCompositeNode(grammarAccess.getHOOPLRule()); 
            pushFollow(FOLLOW_ruleHOOPL_in_entryRuleHOOPL75);
            iv_ruleHOOPL=ruleHOOPL();

            state._fsp--;

             current =iv_ruleHOOPL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHOOPL85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHOOPL"


    // $ANTLR start "ruleHOOPL"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:76:1: ruleHOOPL returns [EObject current=null] : this_Object_0= ruleObject ;
    public final EObject ruleHOOPL() throws RecognitionException {
        EObject current = null;

        EObject this_Object_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:79:28: (this_Object_0= ruleObject )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:81:5: this_Object_0= ruleObject
            {
             
                    newCompositeNode(grammarAccess.getHOOPLAccess().getObjectParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleObject_in_ruleHOOPL131);
            this_Object_0=ruleObject();

            state._fsp--;

             
                    current = this_Object_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHOOPL"


    // $ANTLR start "entryRuleObject"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:97:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:98:2: (iv_ruleObject= ruleObject EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:99:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject165);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:106:1: ruleObject returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:109:28: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:110:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:110:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:110:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleObject212); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getObjectKeyword_0());
                
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:114:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:115:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:115:1: (lv_name_1_0= RULE_ID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:116:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObject229); 

            			newLeafNode(lv_name_1_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleObject246); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:136:1: ( (lv_features_3_0= ruleFeature ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:137:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:137:1: (lv_features_3_0= ruleFeature )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:138:3: lv_features_3_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleObject267);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_3_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleObject280); 

                	newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleFeature"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:166:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:167:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:168:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature316);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature326); 

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:175:1: ruleFeature returns [EObject current=null] : (this_Property_0= ruleProperty | this_Operation_1= ruleOperation ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Property_0 = null;

        EObject this_Operation_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:178:28: ( (this_Property_0= ruleProperty | this_Operation_1= ruleOperation ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:179:1: (this_Property_0= ruleProperty | this_Operation_1= ruleOperation )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:179:1: (this_Property_0= ruleProperty | this_Operation_1= ruleOperation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==RULE_ID||(LA2_1>=13 && LA2_1<=15)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==12) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:180:5: this_Property_0= ruleProperty
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProperty_in_ruleFeature373);
                    this_Property_0=ruleProperty();

                    state._fsp--;

                     
                            current = this_Property_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:190:5: this_Operation_1= ruleOperation
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOperation_in_ruleFeature400);
                    this_Operation_1=ruleOperation();

                    state._fsp--;

                     
                            current = this_Operation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:206:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:207:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:208:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty435);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty445); 

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:215:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:218:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:219:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:219:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:219:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:219:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:220:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:220:1: (lv_name_0_0= RULE_ID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:221:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty487); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            		

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

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:237:2: (otherlv_1= '=' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:237:4: otherlv_1= '=' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleProperty505); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1_0());
                        
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:241:1: (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==RULE_STRING) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:241:2: this_INT_2= RULE_INT
                            {
                            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProperty517); 
                             
                                newLeafNode(this_INT_2, grammarAccess.getPropertyAccess().getINTTerminalRuleCall_1_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:246:6: this_STRING_3= RULE_STRING
                            {
                            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty533); 
                             
                                newLeafNode(this_STRING_3, grammarAccess.getPropertyAccess().getSTRINGTerminalRuleCall_1_1_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleOperation"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:258:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:259:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:260:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation571);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation581); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:267:1: ruleOperation returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_sentence_3_1= ruleMutator | lv_sentence_3_2= ruleSendMessage ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_annotations_0_0 = null;

        EObject lv_sentence_3_1 = null;

        EObject lv_sentence_3_2 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:270:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_sentence_3_1= ruleMutator | lv_sentence_3_2= ruleSendMessage ) ) )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:271:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_sentence_3_1= ruleMutator | lv_sentence_3_2= ruleSendMessage ) ) )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:271:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_sentence_3_1= ruleMutator | lv_sentence_3_2= ruleSendMessage ) ) )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:271:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_sentence_3_1= ruleMutator | lv_sentence_3_2= ruleSendMessage ) ) )* otherlv_4= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:271:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:272:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:272:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:273:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleOperation627);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:289:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:290:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:290:1: (lv_name_1_0= RULE_ID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:291:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation645); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleOperation662); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:311:1: ( ( (lv_sentence_3_1= ruleMutator | lv_sentence_3_2= ruleSendMessage ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:312:1: ( (lv_sentence_3_1= ruleMutator | lv_sentence_3_2= ruleSendMessage ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:312:1: ( (lv_sentence_3_1= ruleMutator | lv_sentence_3_2= ruleSendMessage ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:313:1: (lv_sentence_3_1= ruleMutator | lv_sentence_3_2= ruleSendMessage )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:313:1: (lv_sentence_3_1= ruleMutator | lv_sentence_3_2= ruleSendMessage )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_ID) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (LA6_1==16) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_1==RULE_ID||(LA6_1>=19 && LA6_1<=22)) ) {
            	            alt6=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 6, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA6_0==18) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:314:3: lv_sentence_3_1= ruleMutator
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getOperationAccess().getSentenceMutatorParserRuleCall_3_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleMutator_in_ruleOperation685);
            	            lv_sentence_3_1=ruleMutator();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"sentence",
            	                    		lv_sentence_3_1, 
            	                    		"Mutator");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:329:8: lv_sentence_3_2= ruleSendMessage
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getOperationAccess().getSentenceSendMessageParserRuleCall_3_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleSendMessage_in_ruleOperation704);
            	            lv_sentence_3_2=ruleSendMessage();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"sentence",
            	                    		lv_sentence_3_2, 
            	                    		"SendMessage");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleOperation720); 

                	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:359:1: entryRuleAnnotation returns [String current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final String entryRuleAnnotation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotation = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:360:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:361:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation757);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:368:1: ruleAnnotation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' this_ID_1= RULE_ID (kw= '(' (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_ID_5= RULE_ID ) kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleAnnotation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_3=null;
        Token this_STRING_4=null;
        Token this_ID_5=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:371:28: ( (kw= '@' this_ID_1= RULE_ID (kw= '(' (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_ID_5= RULE_ID ) kw= ')' )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:372:1: (kw= '@' this_ID_1= RULE_ID (kw= '(' (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_ID_5= RULE_ID ) kw= ')' )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:372:1: (kw= '@' this_ID_1= RULE_ID (kw= '(' (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_ID_5= RULE_ID ) kw= ')' )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:373:2: kw= '@' this_ID_1= RULE_ID (kw= '(' (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_ID_5= RULE_ID ) kw= ')' )?
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleAnnotation806); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation821); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getAnnotationAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:385:1: (kw= '(' (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_ID_5= RULE_ID ) kw= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:386:2: kw= '(' (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_ID_5= RULE_ID ) kw= ')'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation840); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
                        
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:391:1: (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_ID_5= RULE_ID )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                        {
                        alt8=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt8=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:391:6: this_INT_3= RULE_INT
                            {
                            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAnnotation856); 

                            		current.merge(this_INT_3);
                                
                             
                                newLeafNode(this_INT_3, grammarAccess.getAnnotationAccess().getINTTerminalRuleCall_2_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:399:10: this_STRING_4= RULE_STRING
                            {
                            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation882); 

                            		current.merge(this_STRING_4);
                                
                             
                                newLeafNode(this_STRING_4, grammarAccess.getAnnotationAccess().getSTRINGTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:407:10: this_ID_5= RULE_ID
                            {
                            this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation908); 

                            		current.merge(this_ID_5);
                                
                             
                                newLeafNode(this_ID_5, grammarAccess.getAnnotationAccess().getIDTerminalRuleCall_2_1_2()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,17,FOLLOW_17_in_ruleAnnotation927); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleMutator"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:428:1: entryRuleMutator returns [EObject current=null] : iv_ruleMutator= ruleMutator EOF ;
    public final EObject entryRuleMutator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMutator = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:429:2: (iv_ruleMutator= ruleMutator EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:430:2: iv_ruleMutator= ruleMutator EOF
            {
             newCompositeNode(grammarAccess.getMutatorRule()); 
            pushFollow(FOLLOW_ruleMutator_in_entryRuleMutator969);
            iv_ruleMutator=ruleMutator();

            state._fsp--;

             current =iv_ruleMutator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMutator979); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMutator"


    // $ANTLR start "ruleMutator"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:437:1: ruleMutator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) otherlv_5= ')' ) ;
    public final EObject ruleMutator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;
        Token this_ID_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:440:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) otherlv_5= ')' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:441:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) otherlv_5= ')' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:441:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) otherlv_5= ')' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:441:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) otherlv_5= ')'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:441:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:442:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:442:1: (lv_name_0_0= RULE_ID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:443:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMutator1021); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMutatorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMutatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleMutator1038); 

                	newLeafNode(otherlv_1, grammarAccess.getMutatorAccess().getLeftParenthesisKeyword_1());
                
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:463:1: (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:463:2: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMutator1050); 
                     
                        newLeafNode(this_INT_2, grammarAccess.getMutatorAccess().getINTTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:468:6: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMutator1066); 
                     
                        newLeafNode(this_STRING_3, grammarAccess.getMutatorAccess().getSTRINGTerminalRuleCall_2_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:473:6: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMutator1082); 
                     
                        newLeafNode(this_ID_4, grammarAccess.getMutatorAccess().getIDTerminalRuleCall_2_2()); 
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleMutator1094); 

                	newLeafNode(otherlv_5, grammarAccess.getMutatorAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMutator"


    // $ANTLR start "entryRuleSendMessage"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:489:1: entryRuleSendMessage returns [EObject current=null] : iv_ruleSendMessage= ruleSendMessage EOF ;
    public final EObject entryRuleSendMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendMessage = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:490:2: (iv_ruleSendMessage= ruleSendMessage EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:491:2: iv_ruleSendMessage= ruleSendMessage EOF
            {
             newCompositeNode(grammarAccess.getSendMessageRule()); 
            pushFollow(FOLLOW_ruleSendMessage_in_entryRuleSendMessage1130);
            iv_ruleSendMessage=ruleSendMessage();

            state._fsp--;

             current =iv_ruleSendMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSendMessage1140); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendMessage"


    // $ANTLR start "ruleSendMessage"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:498:1: ruleSendMessage returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'self' ) ) ) ( ( (lv_message_1_1= RULE_ID | lv_message_1_2= rulePrimitive ) ) ) ) ;
    public final EObject ruleSendMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_message_1_1=null;
        AntlrDatatypeRuleToken lv_message_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:501:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'self' ) ) ) ( ( (lv_message_1_1= RULE_ID | lv_message_1_2= rulePrimitive ) ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:502:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'self' ) ) ) ( ( (lv_message_1_1= RULE_ID | lv_message_1_2= rulePrimitive ) ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:502:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'self' ) ) ) ( ( (lv_message_1_1= RULE_ID | lv_message_1_2= rulePrimitive ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:502:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'self' ) ) ) ( ( (lv_message_1_1= RULE_ID | lv_message_1_2= rulePrimitive ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:502:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'self' ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:503:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'self' ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:503:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'self' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:504:1: (lv_name_0_1= RULE_ID | lv_name_0_2= 'self' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:504:1: (lv_name_0_1= RULE_ID | lv_name_0_2= 'self' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==18) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:505:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSendMessage1184); 

                    			newLeafNode(lv_name_0_1, grammarAccess.getSendMessageAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSendMessageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:520:8: lv_name_0_2= 'self'
                    {
                    lv_name_0_2=(Token)match(input,18,FOLLOW_18_in_ruleSendMessage1205); 

                            newLeafNode(lv_name_0_2, grammarAccess.getSendMessageAccess().getNameSelfKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSendMessageRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:535:2: ( ( (lv_message_1_1= RULE_ID | lv_message_1_2= rulePrimitive ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:536:1: ( (lv_message_1_1= RULE_ID | lv_message_1_2= rulePrimitive ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:536:1: ( (lv_message_1_1= RULE_ID | lv_message_1_2= rulePrimitive ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:537:1: (lv_message_1_1= RULE_ID | lv_message_1_2= rulePrimitive )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:537:1: (lv_message_1_1= RULE_ID | lv_message_1_2= rulePrimitive )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=19 && LA12_0<=22)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:538:3: lv_message_1_1= RULE_ID
                    {
                    lv_message_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSendMessage1240); 

                    			newLeafNode(lv_message_1_1, grammarAccess.getSendMessageAccess().getMessageIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSendMessageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"message",
                            		lv_message_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:553:8: lv_message_1_2= rulePrimitive
                    {
                     
                    	        newCompositeNode(grammarAccess.getSendMessageAccess().getMessagePrimitiveParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitive_in_ruleSendMessage1264);
                    lv_message_1_2=rulePrimitive();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSendMessageRule());
                    	        }
                           		set(
                           			current, 
                           			"message",
                            		lv_message_1_2, 
                            		"Primitive");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendMessage"


    // $ANTLR start "entryRulePrimitive"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:579:1: entryRulePrimitive returns [String current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final String entryRulePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitive = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:580:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:581:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive1304);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive1315); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:588:1: rulePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subir' | kw= 'bajar' | kw= 'derecha' | kw= 'izquierda' ) ;
    public final AntlrDatatypeRuleToken rulePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:591:28: ( (kw= 'subir' | kw= 'bajar' | kw= 'derecha' | kw= 'izquierda' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:592:1: (kw= 'subir' | kw= 'bajar' | kw= 'derecha' | kw= 'izquierda' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:592:1: (kw= 'subir' | kw= 'bajar' | kw= 'derecha' | kw= 'izquierda' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt13=1;
                }
                break;
            case 20:
                {
                alt13=2;
                }
                break;
            case 21:
                {
                alt13=3;
                }
                break;
            case 22:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:593:2: kw= 'subir'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_rulePrimitive1353); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getSubirKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:600:2: kw= 'bajar'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_rulePrimitive1372); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getBajarKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:607:2: kw= 'derecha'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_rulePrimitive1391); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getDerechaKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:614:2: kw= 'izquierda'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_rulePrimitive1410); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getIzquierdaKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHOOPL_in_entryRuleHOOPL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHOOPL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleHOOPL131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleObject212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObject229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleObject246 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleObject267 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_13_in_ruleObject280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFeature373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleFeature400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty487 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleProperty505 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProperty517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleOperation627 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation645 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOperation662 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_ruleMutator_in_ruleOperation685 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_ruleSendMessage_in_ruleOperation704 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_13_in_ruleOperation720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAnnotation806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation821 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation840 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAnnotation856 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation882 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation908 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAnnotation927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMutator_in_entryRuleMutator969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMutator979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMutator1021 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMutator1038 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMutator1050 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMutator1066 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMutator1082 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMutator1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendMessage_in_entryRuleSendMessage1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSendMessage1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSendMessage1184 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_18_in_ruleSendMessage1205 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSendMessage1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleSendMessage1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimitive1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrimitive1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimitive1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrimitive1410 = new BitSet(new long[]{0x0000000000000002L});

}