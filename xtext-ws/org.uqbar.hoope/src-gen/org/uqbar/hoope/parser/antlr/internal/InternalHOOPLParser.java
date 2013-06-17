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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ref'", "'= object {'", "'}'", "':'", "'message'", "'= method {'", "'='", "'+='", "'-='", "'||'", "'&&'", "'=='", "'!='", "'==='", "'!=='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..<'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'#'", "'{'", "'['", "']'", "'|'", "';'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'extends'", "'static'", "'import'", "'extension'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'&'"
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
    public static final int T__15=15;
    public static final int T__52=52;
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
    public static final int T__87=87;
    public static final int T__86=86;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_objects_0_0= ruleObjectDefinition ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_objects_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:79:28: ( ( (lv_objects_0_0= ruleObjectDefinition ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:80:1: ( (lv_objects_0_0= ruleObjectDefinition ) )*
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:80:1: ( (lv_objects_0_0= ruleObjectDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:81:1: (lv_objects_0_0= ruleObjectDefinition )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:81:1: (lv_objects_0_0= ruleObjectDefinition )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:82:3: lv_objects_0_0= ruleObjectDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getObjectsObjectDefinitionParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleObjectDefinition_in_ruleProgram130);
            	    lv_objects_0_0=ruleObjectDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"objects",
            	              		lv_objects_0_0, 
            	              		"ObjectDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:106:1: entryRuleObjectDefinition returns [EObject current=null] : iv_ruleObjectDefinition= ruleObjectDefinition EOF ;
    public final EObject entryRuleObjectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDefinition = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:107:2: (iv_ruleObjectDefinition= ruleObjectDefinition EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:108:2: iv_ruleObjectDefinition= ruleObjectDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectDefinition_in_entryRuleObjectDefinition166);
            iv_ruleObjectDefinition=ruleObjectDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDefinition176); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:115:1: ruleObjectDefinition returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '= object {' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleObjectDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:118:28: ( (otherlv_0= 'ref' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '= object {' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:119:1: (otherlv_0= 'ref' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '= object {' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:119:1: (otherlv_0= 'ref' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '= object {' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:119:3: otherlv_0= 'ref' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '= object {' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleObjectDefinition213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getObjectDefinitionAccess().getRefKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:123:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:124:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:124:1: (lv_name_1_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:125:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectDefinitionAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleObjectDefinition234);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleObjectDefinition246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getObjectDefinitionAccess().getObjectKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:145:1: ( (lv_features_3_0= ruleFeature ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==13||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:146:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:146:1: (lv_features_3_0= ruleFeature )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:147:3: lv_features_3_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getObjectDefinitionAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleObjectDefinition267);
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
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleObjectDefinition280); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:175:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:176:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:177:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature316);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature326); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:184:1: ruleFeature returns [EObject current=null] : (this_ObjectDefinition_0= ruleObjectDefinition | this_Property_1= ruleProperty | this_Message_2= ruleMessage ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectDefinition_0 = null;

        EObject this_Property_1 = null;

        EObject this_Message_2 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:187:28: ( (this_ObjectDefinition_0= ruleObjectDefinition | this_Property_1= ruleProperty | this_Message_2= ruleMessage ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:188:1: (this_ObjectDefinition_0= ruleObjectDefinition | this_Property_1= ruleProperty | this_Message_2= ruleMessage )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:188:1: (this_ObjectDefinition_0= ruleObjectDefinition | this_Property_1= ruleProperty | this_Message_2= ruleMessage )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:189:5: this_ObjectDefinition_0= ruleObjectDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getObjectDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectDefinition_in_ruleFeature373);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:199:5: this_Property_1= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleFeature400);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:209:5: this_Message_2= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getMessageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleFeature427);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:225:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:226:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:227:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty462);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty472); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:234:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:237:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:238:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:238:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:238:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:238:2: ( (lv_name_0_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:239:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:239:1: (lv_name_0_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:240:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getNameValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleProperty518);
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProperty530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:260:1: ( (lv_type_2_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:261:1: (lv_type_2_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:261:1: (lv_type_2_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:262:3: lv_type_2_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleProperty551);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:286:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:287:2: (iv_ruleMessage= ruleMessage EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:288:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage587);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage597); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:295:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '= method {' ( (lv_sentences_3_0= ruleXExpression ) )* otherlv_4= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sentences_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:298:28: ( (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '= method {' ( (lv_sentences_3_0= ruleXExpression ) )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:299:1: (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '= method {' ( (lv_sentences_3_0= ruleXExpression ) )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:299:1: (otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '= method {' ( (lv_sentences_3_0= ruleXExpression ) )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:299:3: otherlv_0= 'message' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '= method {' ( (lv_sentences_3_0= ruleXExpression ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleMessage634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:303:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:304:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:304:1: (lv_name_1_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:305:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleMessage655);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMessage667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getMethodKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:325:1: ( (lv_sentences_3_0= ruleXExpression ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==32||(LA4_0>=40 && LA4_0<=41)||LA4_0==46||LA4_0==52||(LA4_0>=54 && LA4_0<=56)||LA4_0==60||LA4_0==62||(LA4_0>=65 && LA4_0<=67)||(LA4_0>=70 && LA4_0<=74)||(LA4_0>=76 && LA4_0<=83)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:326:1: (lv_sentences_3_0= ruleXExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:326:1: (lv_sentences_3_0= ruleXExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:327:3: lv_sentences_3_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMessageAccess().getSentencesXExpressionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleMessage688);
            	    lv_sentences_3_0=ruleXExpression();

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
            	              		"XExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleMessage701); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:355:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:356:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:357:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression737);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression747); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:364:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:367:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:369:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression793);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:385:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:386:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:387:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment827);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment837); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:394:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:397:28: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:398:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:398:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==19) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||(LA6_1>=RULE_STRING && LA6_1<=RULE_ID)||(LA6_1>=15 && LA6_1<=16)||(LA6_1>=20 && LA6_1<=57)||(LA6_1>=59 && LA6_1<=85)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==EOF||(LA6_2>=RULE_STRING && LA6_2<=RULE_ID)||(LA6_2>=15 && LA6_2<=16)||(LA6_2>=20 && LA6_2<=57)||(LA6_2>=59 && LA6_2<=74)||(LA6_2>=76 && LA6_2<=85)) ) {
                    alt6=2;
                }
                else if ( (LA6_2==19) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 71:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==19) ) {
                    alt6=1;
                }
                else if ( (LA6_3==EOF||(LA6_3>=RULE_STRING && LA6_3<=RULE_ID)||(LA6_3>=15 && LA6_3<=16)||(LA6_3>=20 && LA6_3<=57)||(LA6_3>=59 && LA6_3<=74)||(LA6_3>=76 && LA6_3<=85)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==EOF||(LA6_4>=RULE_STRING && LA6_4<=RULE_ID)||(LA6_4>=15 && LA6_4<=16)||(LA6_4>=20 && LA6_4<=57)||(LA6_4>=59 && LA6_4<=74)||(LA6_4>=76 && LA6_4<=85)) ) {
                    alt6=2;
                }
                else if ( (LA6_4==19) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 73:
                {
                int LA6_5 = input.LA(2);

                if ( (LA6_5==19) ) {
                    alt6=1;
                }
                else if ( (LA6_5==EOF||(LA6_5>=RULE_STRING && LA6_5<=RULE_ID)||(LA6_5>=15 && LA6_5<=16)||(LA6_5>=20 && LA6_5<=57)||(LA6_5>=59 && LA6_5<=74)||(LA6_5>=76 && LA6_5<=85)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 32:
            case 40:
            case 41:
            case 46:
            case 52:
            case 54:
            case 55:
            case 56:
            case 60:
            case 62:
            case 65:
            case 66:
            case 67:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:398:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:398:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:398:3: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:398:3: ()
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:399:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:404:2: ( ( ruleFeatureCallID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:405:1: ( ruleFeatureCallID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:405:1: ( ruleFeatureCallID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:406:3: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXAssignment895);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment911);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:427:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:428:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:428:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:429:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment931);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:446:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:446:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:447:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment961);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:455:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==20) ) {
                        int LA5_1 = input.LA(2);

                        if ( (synpred1_InternalHOOPL()) ) {
                            alt5=1;
                        }
                    }
                    else if ( (LA5_0==21) ) {
                        int LA5_2 = input.LA(2);

                        if ( (synpred1_InternalHOOPL()) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:455:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:455:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:455:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:460:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:460:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:460:7: ()
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:461:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:466:2: ( ( ruleOpMultiAssign ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:467:1: ( ruleOpMultiAssign )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:467:1: ( ruleOpMultiAssign )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:468:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1014);
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

                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:481:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:482:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:482:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:483:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1037);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:507:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:508:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:509:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1077);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1088); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:516:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:519:28: (kw= '=' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:521:2: kw= '='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpSingleAssign1125); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:534:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:535:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:536:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1165);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1176); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:543:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' ) ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:546:28: ( (kw= '+=' | kw= '-=' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:547:1: (kw= '+=' | kw= '-=' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:547:1: (kw= '+=' | kw= '-=' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:548:2: kw= '+='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpMultiAssign1214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:555:2: kw= '-='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpMultiAssign1233); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:568:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:569:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:570:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1273);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1283); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:577:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:580:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:581:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:581:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:582:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1330);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:590:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred2_InternalHOOPL()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:590:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:590:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:590:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:595:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:595:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:595:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:596:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:601:2: ( ( ruleOpOr ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:602:1: ( ruleOpOr )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:602:1: ( ruleOpOr )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:603:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1383);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:616:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:617:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:617:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:618:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1406);
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
            	    break loop8;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:642:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:643:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:644:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1445);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1456); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:651:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:654:28: (kw= '||' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:656:2: kw= '||'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpOr1493); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:669:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:670:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:671:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1532);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1542); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:678:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:681:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:682:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:682:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:683:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1589);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:691:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred3_InternalHOOPL()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:691:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:691:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:691:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:696:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:696:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:696:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:697:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:702:2: ( ( ruleOpAnd ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:703:1: ( ruleOpAnd )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:703:1: ( ruleOpAnd )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:704:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1642);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:717:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:718:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:718:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:719:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1665);
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
            	    break loop9;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:743:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:744:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:745:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1704);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1715); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:752:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:755:28: (kw= '&&' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:757:2: kw= '&&'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpAnd1752); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:770:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:771:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:772:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1791);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1801); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:779:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:782:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:783:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:783:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:784:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1848);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:792:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred4_InternalHOOPL()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred4_InternalHOOPL()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred4_InternalHOOPL()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred4_InternalHOOPL()) ) {
                        alt10=1;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:792:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:792:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:792:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:797:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:797:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:797:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:798:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:803:2: ( ( ruleOpEquality ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:804:1: ( ruleOpEquality )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:804:1: ( ruleOpEquality )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:805:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1901);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:818:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:819:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:819:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:820:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1924);
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
            	    break loop10;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:844:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:845:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:846:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1963);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1974); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:853:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:856:28: ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:857:1: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:857:1: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:858:2: kw= '=='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality2012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:865:2: kw= '!='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpEquality2031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:872:2: kw= '==='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpEquality2050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:879:2: kw= '!=='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpEquality2069); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:892:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:893:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:894:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2109);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2119); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:901:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:904:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:905:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:905:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:906:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2166);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop12:
            do {
                int alt12=3;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred6_InternalHOOPL()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred6_InternalHOOPL()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (synpred5_InternalHOOPL()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (synpred6_InternalHOOPL()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (synpred6_InternalHOOPL()) ) {
                        alt12=2;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:916:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:916:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:916:6: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:917:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXRelationalExpression2202); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:926:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:927:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:927:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:928:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2225);
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
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:945:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:945:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:945:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:945:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:945:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:950:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:950:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:950:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:951:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:956:2: ( ( ruleOpCompare ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:957:1: ( ruleOpCompare )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:957:1: ( ruleOpCompare )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:958:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2286);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:971:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:972:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:972:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:973:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2309);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:997:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:998:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:999:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2349);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2360); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1006:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1009:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1010:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1010:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            case 32:
                {
                alt13=4;
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1011:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1018:2: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1025:2: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare2436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1032:2: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare2455); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1045:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1046:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1047:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2495);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2505); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1054:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1057:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1058:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1058:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1059:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2552);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1067:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1067:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1067:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1067:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1072:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1072:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1072:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1073:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1078:2: ( ( ruleOpOther ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1079:1: ( ruleOpOther )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1079:1: ( ruleOpOther )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1080:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2605);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1093:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1094:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1094:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1095:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2628);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1119:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1120:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1121:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2667);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2678); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1128:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1131:28: ( (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1132:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1132:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt17=10;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1133:2: kw= '->'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1140:2: kw= '..<'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther2735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1146:6: (kw= '>' kw= '..' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1146:6: (kw= '>' kw= '..' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1147:2: kw= '>' kw= '..'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_2_0()); 
                          
                    }
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther2768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_2_1()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1160:2: kw= '..'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther2788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1167:2: kw= '=>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther2807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1173:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1173:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1174:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_0()); 
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1179:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==31) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==31) && (synpred8_InternalHOOPL())) {
                            alt15=1;
                        }
                        else if ( (LA15_1==EOF||(LA15_1>=RULE_STRING && LA15_1<=RULE_ID)||LA15_1==32||(LA15_1>=40 && LA15_1<=41)||LA15_1==46||LA15_1==52||(LA15_1>=54 && LA15_1<=56)||LA15_1==60||LA15_1==62||(LA15_1>=65 && LA15_1<=67)||(LA15_1>=70 && LA15_1<=74)||(LA15_1>=76 && LA15_1<=83)) ) {
                            alt15=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1179:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1179:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1179:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1183:5: (kw= '>' kw= '>' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1184:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2858); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2871); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1197:2: kw= '>'
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2892); if (state.failed) return current;
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1203:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1203:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1204:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_0()); 
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1209:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==32) ) {
                        int LA16_1 = input.LA(2);

                        if ( (synpred9_InternalHOOPL()) ) {
                            alt16=1;
                        }
                        else if ( (true) ) {
                            alt16=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1209:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1209:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1209:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1213:5: (kw= '<' kw= '<' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1214:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2945); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2958); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1227:2: kw= '<'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2979); if (state.failed) return current;
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1234:2: kw= '<>'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1241:2: kw= '?:'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1248:2: kw= '<=>'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther3038); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1261:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1262:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1263:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3078);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3088); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1270:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1273:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1274:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1274:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1275:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3135);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1283:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred10_InternalHOOPL()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==40) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred10_InternalHOOPL()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1283:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1283:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1283:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1288:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1288:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1288:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1289:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1294:2: ( ( ruleOpAdd ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1295:1: ( ruleOpAdd )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1295:1: ( ruleOpAdd )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1296:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3188);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1309:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1310:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1310:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1311:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3211);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1335:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1336:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1337:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3250);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3261); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1344:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1347:28: ( (kw= '+' | kw= '-' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1348:1: (kw= '+' | kw= '-' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1348:1: (kw= '+' | kw= '-' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            else if ( (LA19_0==41) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1349:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpAdd3299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1356:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpAdd3318); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1369:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1370:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1371:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3358);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3368); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1378:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1381:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1382:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1382:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1383:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3415);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1391:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred11_InternalHOOPL()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred11_InternalHOOPL()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred11_InternalHOOPL()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (synpred11_InternalHOOPL()) ) {
                        alt20=1;
                    }


                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1391:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1391:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1391:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1396:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1396:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1396:7: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1397:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1402:2: ( ( ruleOpMulti ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1403:1: ( ruleOpMulti )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1403:1: ( ruleOpMulti )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1404:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3468);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1417:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1418:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1418:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1419:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3491);
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
            	    break loop20;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1443:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1444:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1445:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3530);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3541); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1452:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1455:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1456:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1456:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt21=1;
                }
                break;
            case 43:
                {
                alt21=2;
                }
                break;
            case 44:
                {
                alt21=3;
                }
                break;
            case 45:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1457:2: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti3579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1464:2: kw= '**'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti3598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1471:2: kw= '/'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti3617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1478:2: kw= '%'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti3636); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1491:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1492:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1493:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3676);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3686); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1500:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1503:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1504:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1504:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=40 && LA22_0<=41)||LA22_0==46) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||LA22_0==32||LA22_0==52||(LA22_0>=54 && LA22_0<=56)||LA22_0==60||LA22_0==62||(LA22_0>=65 && LA22_0<=67)||(LA22_0>=70 && LA22_0<=74)||(LA22_0>=76 && LA22_0<=83)) ) {
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1504:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1504:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1504:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1504:3: ()
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1505:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1510:2: ( ( ruleOpUnary ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1511:1: ( ruleOpUnary )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1511:1: ( ruleOpUnary )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1512:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3744);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1525:2: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1526:1: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1526:1: (lv_operand_2_0= ruleXUnaryOperation )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1527:3: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3765);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1545:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3794);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1561:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1562:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1563:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3830);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3841); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1570:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1573:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1574:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1574:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt23=1;
                }
                break;
            case 41:
                {
                alt23=2;
                }
                break;
            case 40:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1575:2: kw= '!'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpUnary3879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1582:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpUnary3898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1589:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary3917); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1602:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1603:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1604:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3957);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3967); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1611:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1614:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1615:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1615:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1616:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4014);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1624:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==47) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred12_InternalHOOPL()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1624:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1624:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1624:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1626:5: ( () otherlv_2= 'as' )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1626:6: () otherlv_2= 'as'
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1626:6: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1627:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXCastedExpression4049); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1636:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1637:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1637:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1638:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4072);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1662:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1663:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1664:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4110);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4120); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1671:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1674:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1675:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1675:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1676:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4167);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:1: ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop32:
            do {
                int alt32=3;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred13_InternalHOOPL()) ) {
                        alt32=1;
                    }
                    else if ( (synpred14_InternalHOOPL()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred14_InternalHOOPL()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred14_InternalHOOPL()) ) {
                        alt32=2;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:2: ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:2: ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:3: ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:3: ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:4: ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1690:25: ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1690:26: () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1690:26: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1691:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4216); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1700:1: ( ( ruleFeatureCallID ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1701:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1701:1: ( ruleFeatureCallID )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1702:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4239);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4255);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1723:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1724:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1724:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1725:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4277);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1742:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1742:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1742:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1742:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1742:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1758:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1758:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1758:8: ()
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1759:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1764:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt25=3;
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
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1764:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4363); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1769:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1769:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1770:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1770:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1771:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall4387); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
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
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1785:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1785:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1786:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1786:1: (lv_spreading_9_0= '*.' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1787:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall4424); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1800:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==32) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1800:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall4453); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1804:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1805:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1805:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1806:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4474);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1822:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==51) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1822:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall4487); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1826:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1827:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1827:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1828:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4508);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop26;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall4522); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1848:3: ( ( ruleFeatureCallID ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1849:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1849:1: ( ruleFeatureCallID )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1850:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4547);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1863:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1863:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1863:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1863:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1870:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1871:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall4581); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1884:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt29=3;
            	            alt29 = dfa29.predict(input);
            	            switch (alt29) {
            	                case 1 :
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1884:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1884:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1884:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1901:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1902:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4666);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1919:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1919:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1919:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1919:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1920:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1920:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1921:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4694);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

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
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1937:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop28:
            	                    do {
            	                        int alt28=2;
            	                        int LA28_0 = input.LA(1);

            	                        if ( (LA28_0==51) ) {
            	                            alt28=1;
            	                        }


            	                        switch (alt28) {
            	                    	case 1 :
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1937:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall4707); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1941:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1942:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1942:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1943:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4728);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
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
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall4745); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1963:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt31=2;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1963:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1966:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1967:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4780);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
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
            	    break loop32;
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


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1991:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1992:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1993:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4820);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4830); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2000:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2003:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2004:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2004:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt33=13;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2005:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4877);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2015:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4904);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2025:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4931);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2035:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4958);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2045:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4985);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2055:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5012);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2065:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5039);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2075:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5066);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2085:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5093);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2095:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5120);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2105:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5147);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2115:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5174);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2125:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5201);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
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


    // $ANTLR start "entryRuleXLiteral"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2141:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2142:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2143:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5236);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5246); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2150:1: ruleXLiteral returns [EObject current=null] : (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2153:28: ( (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2154:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2154:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            int alt34=7;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            else if ( (LA34_0==56) && (synpred18_InternalHOOPL())) {
                alt34=2;
            }
            else if ( ((LA34_0>=77 && LA34_0<=78)) ) {
                alt34=3;
            }
            else if ( ((LA34_0>=RULE_HEX && LA34_0<=RULE_DECIMAL)) ) {
                alt34=4;
            }
            else if ( (LA34_0==79) ) {
                alt34=5;
            }
            else if ( (LA34_0==RULE_STRING) ) {
                alt34=6;
            }
            else if ( (LA34_0==80) ) {
                alt34=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2155:5: this_XCollectionLiteral_0= ruleXCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXCollectionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral5293);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2164:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2164:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2164:7: ( ( () '[' ) )=>this_XClosure_1= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5333);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2177:5: this_XBooleanLiteral_2= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5361);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2187:5: this_XNumberLiteral_3= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5388);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2197:5: this_XNullLiteral_4= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5415);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2207:5: this_XStringLiteral_5= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5442);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2217:5: this_XTypeLiteral_6= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5469);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2233:1: entryRuleXCollectionLiteral returns [EObject current=null] : iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF ;
    public final EObject entryRuleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCollectionLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2234:2: (iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2235:2: iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCollectionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral5504);
            iv_ruleXCollectionLiteral=ruleXCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCollectionLiteral5514); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2242:1: ruleXCollectionLiteral returns [EObject current=null] : (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) ;
    public final EObject ruleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XSetLiteral_0 = null;

        EObject this_XListLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2245:28: ( (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2246:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2246:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==55) ) {
                    alt35=1;
                }
                else if ( (LA35_1==56) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2247:5: this_XSetLiteral_0= ruleXSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral5561);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2257:5: this_XListLiteral_1= ruleXListLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXListLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral5588);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2273:1: entryRuleXSetLiteral returns [EObject current=null] : iv_ruleXSetLiteral= ruleXSetLiteral EOF ;
    public final EObject entryRuleXSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSetLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2274:2: (iv_ruleXSetLiteral= ruleXSetLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2275:2: iv_ruleXSetLiteral= ruleXSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSetLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral5623);
            iv_ruleXSetLiteral=ruleXSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSetLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSetLiteral5633); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2282:1: ruleXSetLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2285:28: ( ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2286:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2286:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2286:2: () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2286:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2287:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSetLiteralAccess().getXSetLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXSetLiteral5679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSetLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleXSetLiteral5691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXSetLiteralAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2300:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||LA37_0==32||(LA37_0>=40 && LA37_0<=41)||LA37_0==46||LA37_0==52||(LA37_0>=54 && LA37_0<=56)||LA37_0==60||LA37_0==62||(LA37_0>=65 && LA37_0<=67)||(LA37_0>=70 && LA37_0<=74)||(LA37_0>=76 && LA37_0<=83)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2300:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2300:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2301:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2301:1: (lv_elements_3_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2302:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral5713);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2318:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==51) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2318:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXSetLiteral5726); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXSetLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2322:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2323:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2323:1: (lv_elements_5_0= ruleXExpression )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2324:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral5747);
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXSetLiteral5763); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2352:1: entryRuleXListLiteral returns [EObject current=null] : iv_ruleXListLiteral= ruleXListLiteral EOF ;
    public final EObject entryRuleXListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXListLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2353:2: (iv_ruleXListLiteral= ruleXListLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2354:2: iv_ruleXListLiteral= ruleXListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXListLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral5799);
            iv_ruleXListLiteral=ruleXListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXListLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXListLiteral5809); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2361:1: ruleXListLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2364:28: ( ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2365:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2365:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2365:2: () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2365:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2366:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXListLiteralAccess().getXListLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXListLiteral5855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXListLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleXListLiteral5867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXListLiteralAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2379:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)||LA39_0==32||(LA39_0>=40 && LA39_0<=41)||LA39_0==46||LA39_0==52||(LA39_0>=54 && LA39_0<=56)||LA39_0==60||LA39_0==62||(LA39_0>=65 && LA39_0<=67)||(LA39_0>=70 && LA39_0<=74)||(LA39_0>=76 && LA39_0<=83)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2379:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2379:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2380:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2380:1: (lv_elements_3_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2381:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral5889);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2397:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==51) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2397:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXListLiteral5902); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXListLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2401:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2402:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2402:1: (lv_elements_5_0= ruleXExpression )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2403:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral5923);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleXListLiteral5939); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2431:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2432:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2433:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5975);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5985); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2440:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2443:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2444:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2444:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2444:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2444:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2444:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2446:5: ( () otherlv_1= '[' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2446:6: () otherlv_1= '['
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2446:6: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2447:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXClosure6045); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2456:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2456:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2471:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2471:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2471:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID||LA41_0==36||LA41_0==52) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2471:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2471:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2472:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2472:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2473:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6118);
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

                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2489:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==51) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2489:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXClosure6131); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2493:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2494:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2494:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2495:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6152);
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
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2511:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2512:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2512:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2513:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,58,FOLLOW_58_in_ruleXClosure6174); if (state.failed) return current;
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2526:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2527:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2527:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2528:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6211);
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

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXClosure6223); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2556:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2557:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2558:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6259);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6269); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2565:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2568:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2569:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2569:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2569:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2569:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2570:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2575:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||LA44_0==32||(LA44_0>=40 && LA44_0<=41)||LA44_0==46||LA44_0==52||(LA44_0>=54 && LA44_0<=56)||LA44_0==60||LA44_0==62||(LA44_0>=65 && LA44_0<=74)||(LA44_0>=76 && LA44_0<=83)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2575:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2575:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2576:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2576:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2577:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6325);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2593:2: (otherlv_2= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==59) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2593:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleXExpressionInClosure6338); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2605:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2606:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2607:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6378);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6388); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2614:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2617:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2618:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2618:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2618:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2618:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2618:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2634:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2634:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2634:7: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2635:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2640:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==36||LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2640:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2640:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2641:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2641:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2642:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6496);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2658:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==51) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2658:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXShortClosure6509); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2662:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2663:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2663:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2664:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6530);
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2680:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2681:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2681:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2682:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,58,FOLLOW_58_in_ruleXShortClosure6552); if (state.failed) return current;
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2695:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2696:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2696:1: (lv_expression_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2697:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6588);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2721:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2722:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2723:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6624);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6634); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2730:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2733:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2734:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2734:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2734:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleXParenthesizedExpression6671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6693);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXParenthesizedExpression6704); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2759:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2760:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2761:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6740);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6750); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2768:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2771:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2772:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2772:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2772:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2772:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2773:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXIfExpression6796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2786:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2787:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2787:1: (lv_if_3_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2788:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6829);
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

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression6841); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2808:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2809:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2809:1: (lv_then_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2810:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6862);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2826:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==61) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred22_InternalHOOPL()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2826:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2826:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2826:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_61_in_ruleXIfExpression6883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2831:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2832:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2832:1: (lv_else_7_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2833:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6905);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2857:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2858:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2859:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6943);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6953); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2866:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2869:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2870:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2870:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2870:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2870:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2871:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXSwitchExpression6999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||LA49_0==32||(LA49_0>=40 && LA49_0<=41)||LA49_0==46||(LA49_0>=54 && LA49_0<=56)||LA49_0==60||LA49_0==62||(LA49_0>=65 && LA49_0<=67)||(LA49_0>=70 && LA49_0<=74)||(LA49_0>=76 && LA49_0<=83)) ) {
                alt49=1;
            }
            else if ( (LA49_0==52) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==RULE_ID) ) {
                    int LA49_3 = input.LA(3);

                    if ( ((LA49_3>=19 && LA49_3<=45)||(LA49_3>=47 && LA49_3<=50)||(LA49_3>=52 && LA49_3<=53)||LA49_3==56||LA49_3==75) ) {
                        alt49=1;
                    }
                    else if ( (LA49_3==16) && (synpred24_InternalHOOPL())) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA49_2>=RULE_STRING && LA49_2<=RULE_DECIMAL)||LA49_2==32||(LA49_2>=40 && LA49_2<=41)||LA49_2==46||LA49_2==52||(LA49_2>=54 && LA49_2<=56)||LA49_2==60||LA49_2==62||(LA49_2>=65 && LA49_2<=67)||(LA49_2>=70 && LA49_2<=74)||(LA49_2>=76 && LA49_2<=83)) ) {
                    alt49=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID) ) {
                        int LA48_1 = input.LA(2);

                        if ( (LA48_1==16) && (synpred23_InternalHOOPL())) {
                            alt48=1;
                        }
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2885:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2885:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2885:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2886:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2886:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2887:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7042);
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

                            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression7054); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2907:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2908:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2908:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2909:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7078);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2926:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2926:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2926:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2926:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2926:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2932:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2932:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression7122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2936:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2937:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2937:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2938:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7143);
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

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression7155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2958:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2959:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2959:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2960:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7178);
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

                    otherlv_9=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression7190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2984:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID||LA50_0==16||LA50_0==36||LA50_0==52||LA50_0==64) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2985:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2985:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2986:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7225);
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
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3002:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==63) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3002:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,63,FOLLOW_63_in_ruleXSwitchExpression7239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression7251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3010:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3011:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3011:1: (lv_default_14_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3012:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7272);
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

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleXSwitchExpression7286); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3040:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3041:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3042:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7322);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7332); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3049:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3052:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3053:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3053:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3053:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3053:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==36||LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3054:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3054:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3055:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7378);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3071:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==64) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3071:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXCasePart7392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3075:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3076:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3076:1: (lv_case_2_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3077:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7413);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXCasePart7427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3097:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3098:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3098:1: (lv_then_4_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3099:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7448);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3123:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3124:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3125:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7484);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7494); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3132:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3135:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3136:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3136:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3136:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3136:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3137:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXForLoopExpression7540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXForLoopExpression7552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3150:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3151:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3151:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3152:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7573);
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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXForLoopExpression7585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3172:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3173:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3173:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3174:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7606);
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

            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression7618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3194:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3195:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3195:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3196:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7639);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3220:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3221:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3222:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7675);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7685); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3229:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3232:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3233:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3233:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3233:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3233:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3234:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXWhileExpression7731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXWhileExpression7743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3247:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3248:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3248:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3249:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7764);
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

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXWhileExpression7776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3269:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3270:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3270:1: (lv_body_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3271:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7797);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3295:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3296:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3297:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7833);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7843); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3304:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3307:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3308:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3308:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3308:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3308:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3309:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXDoWhileExpression7889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3318:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3319:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3319:1: (lv_body_2_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3320:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7910);
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

            otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleXDoWhileExpression7922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXDoWhileExpression7934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3344:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3345:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3345:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3346:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7955);
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

            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleXDoWhileExpression7967); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3374:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3375:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3376:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8003);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8013); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3383:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3386:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3387:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3387:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3387:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3387:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3388:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression8059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3397:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)||LA55_0==32||(LA55_0>=40 && LA55_0<=41)||LA55_0==46||LA55_0==52||(LA55_0>=54 && LA55_0<=56)||LA55_0==60||LA55_0==62||(LA55_0>=65 && LA55_0<=74)||(LA55_0>=76 && LA55_0<=83)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3397:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3397:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3398:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3398:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3399:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8081);
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

            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3415:2: (otherlv_3= ';' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==59) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3415:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleXBlockExpression8094); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression8110); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3431:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3432:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3433:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8146);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8156); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3440:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3443:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3444:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3444:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=68 && LA56_0<=69)) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_ID)||LA56_0==32||(LA56_0>=40 && LA56_0<=41)||LA56_0==46||LA56_0==52||(LA56_0>=54 && LA56_0<=56)||LA56_0==60||LA56_0==62||(LA56_0>=65 && LA56_0<=67)||(LA56_0>=70 && LA56_0<=74)||(LA56_0>=76 && LA56_0<=83)) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3445:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8203);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3455:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8230);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3471:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3472:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3473:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8265);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8275); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3480:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3483:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3484:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3484:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3484:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3484:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3485:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3490:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==68) ) {
                alt57=1;
            }
            else if ( (LA57_0==69) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3490:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3490:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3491:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3491:1: (lv_writeable_1_0= 'var' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3492:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,68,FOLLOW_68_in_ruleXVariableDeclaration8328); if (state.failed) return current;
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3506:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleXVariableDeclaration8359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3510:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred25_InternalHOOPL()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA58_0==52) && (synpred25_InternalHOOPL())) {
                alt58=1;
            }
            else if ( (LA58_0==36) && (synpred25_InternalHOOPL())) {
                alt58=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3510:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3510:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3510:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3518:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3518:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3518:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3519:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3519:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3520:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8407);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3536:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3537:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3537:1: (lv_name_4_0= ruleValidID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3538:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8428);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3555:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3555:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3556:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3556:1: (lv_name_5_0= ruleValidID )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3557:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8457);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3573:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==19) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3573:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleXVariableDeclaration8471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3577:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3578:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3578:1: (lv_right_7_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3579:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8492);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3603:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3604:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3605:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8530);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8540); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3612:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3615:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3616:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3616:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3616:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3616:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==RULE_ID||LA60_1==32||LA60_1==48||LA60_1==56) ) {
                    alt60=1;
                }
            }
            else if ( (LA60_0==36||LA60_0==52) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3617:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3617:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3618:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8586);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3634:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3635:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3635:1: (lv_name_1_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3636:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8608);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3660:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3661:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3662:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8644);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8654); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3669:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3672:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3673:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3673:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3673:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3673:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3674:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3674:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3675:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8700);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3691:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3692:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3692:1: (lv_name_1_0= ruleValidID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3693:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8721);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3717:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3718:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3719:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8757);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8767); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3726:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3729:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3730:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3730:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3730:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3730:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3731:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3736:2: ( ( ruleStaticQualifier ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==75) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3737:1: ( ruleStaticQualifier )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3737:1: ( ruleStaticQualifier )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3738:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8824);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3751:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==32) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3751:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXFeatureCall8838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3755:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3756:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3756:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3757:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8859);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3773:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==51) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3773:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXFeatureCall8872); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3777:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3778:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3778:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3779:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8893);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall8907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3799:3: ( ( ruleIdOrSuper ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3800:1: ( ruleIdOrSuper )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3800:1: ( ruleIdOrSuper )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3801:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8932);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3814:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3814:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3814:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3814:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3821:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3822:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,52,FOLLOW_52_in_ruleXFeatureCall8966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3835:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt65=3;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3835:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3835:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3835:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3852:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3853:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9051);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

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
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3870:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3870:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3870:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3870:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3871:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3871:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3872:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9079);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3888:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==51) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3888:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,51,FOLLOW_51_in_ruleXFeatureCall9092); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3892:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3893:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3893:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3894:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9113);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
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


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,53,FOLLOW_53_in_ruleXFeatureCall9130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3914:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3914:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3917:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3918:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9165);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3942:1: entryRuleFeatureCallID returns [String current=null] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final String entryRuleFeatureCallID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCallID = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3943:2: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3944:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallIDRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID9203);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCallID9214); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3951:1: ruleFeatureCallID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCallID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3954:28: ( (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3955:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3955:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            int alt68=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt68=1;
                }
                break;
            case 70:
                {
                alt68=2;
                }
                break;
            case 71:
                {
                alt68=3;
                }
                break;
            case 72:
                {
                alt68=4;
                }
                break;
            case 73:
                {
                alt68=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3956:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallIDAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleFeatureCallID9261);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3968:2: kw= 'extends'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleFeatureCallID9285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtendsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3975:2: kw= 'static'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleFeatureCallID9304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getStaticKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3982:2: kw= 'import'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleFeatureCallID9323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3989:2: kw= 'extension'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleFeatureCallID9342); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4002:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4003:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4004:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9383);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9394); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4011:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureCallID_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4014:28: ( (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4015:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4015:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID||(LA69_0>=70 && LA69_0<=73)) ) {
                alt69=1;
            }
            else if ( (LA69_0==74) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4016:5: this_FeatureCallID_0= ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getFeatureCallIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper9441);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4028:2: kw= 'super'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleIdOrSuper9465); if (state.failed) return current;
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


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4041:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4042:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4043:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9506);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9517); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4050:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4053:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4054:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4054:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_ID) ) {
                    int LA70_2 = input.LA(2);

                    if ( (LA70_2==75) ) {
                        alt70=1;
                    }


                }


                switch (alt70) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4055:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9564);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,75,FOLLOW_75_in_ruleStaticQualifier9582); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4079:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4080:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4081:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9623);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9633); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4088:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4091:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4092:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4092:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4092:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4092:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4093:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXConstructorCall9679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4102:1: ( ( ruleQualifiedName ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4103:1: ( ruleQualifiedName )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4103:1: ( ruleQualifiedName )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4104:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9702);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4117:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4117:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4117:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4117:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleXConstructorCall9723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4122:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4123:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4123:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4124:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9745);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4140:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==51) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4140:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleXConstructorCall9758); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4144:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4145:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4145:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4146:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9779);
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
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleXConstructorCall9793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4166:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4166:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4166:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4166:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleXConstructorCall9816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4171:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt74=3;
                    alt74 = dfa74.predict(input);
                    switch (alt74) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4171:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4171:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4171:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4188:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4189:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9889);
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
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4206:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4206:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4206:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4206:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4207:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4207:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4208:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9917);
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

                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4224:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==51) ) {
                                    alt73=1;
                                }


                                switch (alt73) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4224:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,51,FOLLOW_51_in_ruleXConstructorCall9930); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4228:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4229:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4229:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4230:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9951);
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
                            	    break loop73;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,53,FOLLOW_53_in_ruleXConstructorCall9968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4250:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4250:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4253:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4254:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall10003);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4278:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4279:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4280:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10040);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10050); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4287:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4290:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4291:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4291:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4291:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4291:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4292:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4297:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==77) ) {
                alt77=1;
            }
            else if ( (LA77_0==78) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4297:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXBooleanLiteral10097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4302:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4302:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4303:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4303:1: (lv_isTrue_2_0= 'true' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4304:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,78,FOLLOW_78_in_ruleXBooleanLiteral10121); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4325:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4326:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4327:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10171);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10181); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4334:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4337:28: ( ( () otherlv_1= 'null' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4338:1: ( () otherlv_1= 'null' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4338:1: ( () otherlv_1= 'null' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4338:2: () otherlv_1= 'null'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4338:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4339:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleXNullLiteral10227); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4356:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4357:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4358:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10263);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral10273); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4365:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4368:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4369:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4369:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4369:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4369:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4370:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4375:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4376:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4376:1: (lv_value_1_0= ruleNumber )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4377:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral10328);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4401:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4402:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4403:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10364);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10374); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4410:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4413:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4414:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4414:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4414:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4414:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4415:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4420:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4421:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4421:1: (lv_value_1_0= RULE_STRING )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4422:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10425); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4446:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4447:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4448:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10466);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10476); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4455:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4458:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4459:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4459:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4459:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4459:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4460:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleXTypeLiteral10522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXTypeLiteral10534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4473:1: ( ( ruleQualifiedName ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4474:1: ( ruleQualifiedName )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4474:1: ( ruleQualifiedName )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4475:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10557);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4488:2: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==56) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4489:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4489:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4490:3: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral10578);
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
            	    break loop78;
                }
            } while (true);

            otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleXTypeLiteral10591); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4518:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4519:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4520:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10627);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10637); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4527:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4530:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4531:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4531:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4531:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4531:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4532:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleXThrowExpression10683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4541:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4542:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4542:1: (lv_expression_2_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4543:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10704);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4567:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4568:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4569:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10740);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10750); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4576:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4579:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4580:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4580:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4580:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4580:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4581:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleXReturnExpression10796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4590:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4590:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4595:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4596:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10827);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4620:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4621:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4622:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10864);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10874); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4629:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4632:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4633:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4633:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4633:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4633:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4634:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleXTryCatchFinallyExpression10920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4643:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4644:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4644:1: (lv_expression_2_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4645:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10941);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4661:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==85) ) {
                alt82=1;
            }
            else if ( (LA82_0==84) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4661:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4661:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4661:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4661:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt80=0;
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==85) ) {
                            int LA80_2 = input.LA(2);

                            if ( (synpred34_InternalHOOPL()) ) {
                                alt80=1;
                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4661:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4663:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4664:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10971);
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
                    	    if ( cnt80 >= 1 ) break loop80;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(80, input);
                                throw eee;
                        }
                        cnt80++;
                    } while (true);

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4680:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==84) ) {
                        int LA81_1 = input.LA(2);

                        if ( (synpred35_InternalHOOPL()) ) {
                            alt81=1;
                        }
                    }
                    switch (alt81) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4680:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4680:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4680:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,84,FOLLOW_84_in_ruleXTryCatchFinallyExpression10993); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4685:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4686:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4686:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4687:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11015);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4704:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4704:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4704:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,84,FOLLOW_84_in_ruleXTryCatchFinallyExpression11037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4708:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4709:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4709:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4710:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11058);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4734:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4735:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4736:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11096);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11106); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4743:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4746:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4747:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4747:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4747:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4747:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4747:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleXCatchClause11151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXCatchClause11164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4756:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4757:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4757:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4758:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11185);
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

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXCatchClause11197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4778:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4779:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4779:1: (lv_expression_4_0= ruleXExpression )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4780:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11218);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4804:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4805:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4806:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11255);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11266); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4813:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4816:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4817:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4817:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4818:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11313);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4828:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==48) ) {
                    int LA83_2 = input.LA(2);

                    if ( (LA83_2==RULE_ID) ) {
                        int LA83_3 = input.LA(3);

                        if ( (synpred37_InternalHOOPL()) ) {
                            alt83=1;
                        }


                    }


                }


                switch (alt83) {
            	case 1 :
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4828:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4828:2: ( ( '.' )=>kw= '.' )
            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4828:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,48,FOLLOW_48_in_ruleQualifiedName11341); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11364);
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
            	    break loop83;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4855:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4859:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4860:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber11418);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber11429); if (state.failed) return current;

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4870:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4874:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4875:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4875:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_HEX) ) {
                alt87=1;
            }
            else if ( ((LA87_0>=RULE_INT && LA87_0<=RULE_DECIMAL)) ) {
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4875:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4883:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4883:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4883:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4883:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_INT) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==RULE_DECIMAL) ) {
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
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4883:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11501); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4891:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11527); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4898:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==48) ) {
                        int LA86_1 = input.LA(2);

                        if ( ((LA86_1>=RULE_INT && LA86_1<=RULE_DECIMAL)) ) {
                            alt86=1;
                        }
                    }
                    switch (alt86) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4899:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,48,FOLLOW_48_in_ruleNumber11547); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4904:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4904:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11563); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4912:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11589); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4930:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4931:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4932:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11642);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11652); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4939:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4942:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4943:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4943:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID) ) {
                alt89=1;
            }
            else if ( (LA89_0==36||LA89_0==52) ) {
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4943:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4943:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4944:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11700);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4952:1: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==56) ) {
                            int LA88_2 = input.LA(2);

                            if ( (LA88_2==57) ) {
                                int LA88_3 = input.LA(3);

                                if ( (synpred38_InternalHOOPL()) ) {
                                    alt88=1;
                                }


                            }


                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4952:2: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4953:24: ( () ruleArrayBrackets )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4953:25: () ruleArrayBrackets
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4953:25: ()
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4954:5: 
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
                    	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference11736);
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
                    	    break loop88;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4969:5: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11767);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4985:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4986:2: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4987:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets11803);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayBrackets11814); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4994:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4997:28: ( (kw= '[' kw= ']' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4998:1: (kw= '[' kw= ']' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4998:1: (kw= '[' kw= ']' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4999:2: kw= '[' kw= ']'
            {
            kw=(Token)match(input,56,FOLLOW_56_in_ruleArrayBrackets11852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
                  
            }
            kw=(Token)match(input,57,FOLLOW_57_in_ruleArrayBrackets11865); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5018:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5019:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5020:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11905);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11915); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5027:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5030:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5031:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5031:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5031:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5031:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==52) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5031:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleXFunctionTypeRef11953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5035:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==RULE_ID||LA91_0==36||LA91_0==52) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5035:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5035:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5036:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5036:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5037:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11975);
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

                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5053:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop90:
                            do {
                                int alt90=2;
                                int LA90_0 = input.LA(1);

                                if ( (LA90_0==51) ) {
                                    alt90=1;
                                }


                                switch (alt90) {
                            	case 1 :
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5053:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXFunctionTypeRef11988); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5057:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5058:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5058:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5059:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12009);
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
                            	    break loop90;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXFunctionTypeRef12025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleXFunctionTypeRef12039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5083:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5084:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5084:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5085:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12060);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5109:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5110:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5111:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12096);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12106); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5118:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5121:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5122:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5122:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5122:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5122:2: ( ( ruleQualifiedName ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5123:1: ( ruleQualifiedName )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5123:1: ( ruleQualifiedName )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5124:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12154);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5137:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt94=2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5137:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5137:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5137:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleJvmParameterizedTypeReference12175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5142:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5143:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5143:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5144:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12197);
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5160:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==51) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5160:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleJvmParameterizedTypeReference12210); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5164:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5165:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5165:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5166:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12231);
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
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleJvmParameterizedTypeReference12245); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5194:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5195:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5196:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12283);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12293); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5203:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5206:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5207:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5207:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID||LA95_0==36||LA95_0==52) ) {
                alt95=1;
            }
            else if ( (LA95_0==86) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5208:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12340);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5218:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12367);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5234:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5235:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5236:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12402);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12412); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5243:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5246:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5247:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5247:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5247:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5247:2: ()
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5248:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleJvmWildcardTypeReference12458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5257:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt96=3;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==70) ) {
                alt96=1;
            }
            else if ( (LA96_0==74) ) {
                alt96=2;
            }
            switch (alt96) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5257:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5257:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5258:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5258:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5259:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12480);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5276:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5276:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5277:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5277:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5278:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12507);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5302:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5303:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5304:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12545);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12555); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5311:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5314:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5315:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5315:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5315:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleJvmUpperBound12592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5319:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5320:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5320:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5321:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12613);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5345:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5346:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5347:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12649);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12659); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5354:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5357:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5358:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5358:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5358:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,87,FOLLOW_87_in_ruleJvmUpperBoundAnded12696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5362:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5363:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5363:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5364:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12717);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5388:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5389:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5390:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12753);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12763); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5397:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5400:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5401:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5401:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5401:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmLowerBound12800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5405:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5406:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5406:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5407:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12821);
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5433:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5434:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5435:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12860);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12871); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5442:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5445:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5446:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5446:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5447:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12918);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,48,FOLLOW_48_in_ruleQualifiedNameWithWildcard12936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifiedNameWithWildcard12949); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5477:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5478:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5479:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12990);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID13001); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5486:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5489:28: (this_ID_0= RULE_ID )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5490:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID13040); if (state.failed) return current;
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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5507:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5508:2: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5509:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration13086);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImportDeclaration13096); if (state.failed) return current;

            }

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
    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5516:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
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
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5519:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5520:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5520:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5520:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleXImportDeclaration13133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5524:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt98=3;
            alt98 = dfa98.predict(input);
            switch (alt98) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5524:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5524:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5524:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5524:3: ( (lv_static_1_0= 'static' ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5525:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5525:1: (lv_static_1_0= 'static' )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5526:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,71,FOLLOW_71_in_ruleXImportDeclaration13153); if (state.failed) return current;
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5539:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==73) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5540:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5540:1: (lv_extension_2_0= 'extension' )
                            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5541:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,73,FOLLOW_73_in_ruleXImportDeclaration13184); if (state.failed) return current;
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

                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5554:3: ( ( ruleQualifiedName ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5555:1: ( ruleQualifiedName )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5555:1: ( ruleQualifiedName )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5556:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13221);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXImportDeclaration13233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXImportDeclarationAccess().getFullStopKeyword_1_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleXImportDeclaration13245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXImportDeclarationAccess().getAsteriskKeyword_1_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5578:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5578:6: ( ( ruleQualifiedName ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5579:1: ( ruleQualifiedName )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5579:1: ( ruleQualifiedName )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5580:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13275);
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
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5594:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5594:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5595:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5595:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5596:3: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration13302);
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

            // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5612:3: (otherlv_8= ';' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==59) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5612:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_59_in_ruleXImportDeclaration13316); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalHOOPL
    public final void synpred1_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:455:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:455:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:455:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:455:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:455:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:456:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:456:2: ( ( ruleOpMultiAssign ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:457:1: ( ruleOpMultiAssign )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:457:1: ( ruleOpMultiAssign )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:458:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHOOPL982);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalHOOPL

    // $ANTLR start synpred2_InternalHOOPL
    public final void synpred2_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:590:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:590:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:590:4: ( () ( ( ruleOpOr ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:590:5: () ( ( ruleOpOr ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:590:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:591:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:591:2: ( ( ruleOpOr ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:592:1: ( ruleOpOr )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:592:1: ( ruleOpOr )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:593:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHOOPL1351);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalHOOPL

    // $ANTLR start synpred3_InternalHOOPL
    public final void synpred3_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:691:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:691:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:691:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:691:5: () ( ( ruleOpAnd ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:691:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:692:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:692:2: ( ( ruleOpAnd ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:693:1: ( ruleOpAnd )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:693:1: ( ruleOpAnd )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:694:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHOOPL1610);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalHOOPL

    // $ANTLR start synpred4_InternalHOOPL
    public final void synpred4_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:792:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:792:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:792:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:792:5: () ( ( ruleOpEquality ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:792:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:793:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:793:2: ( ( ruleOpEquality ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:794:1: ( ruleOpEquality )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:794:1: ( ruleOpEquality )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:795:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHOOPL1869);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalHOOPL

    // $ANTLR start synpred5_InternalHOOPL
    public final void synpred5_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:4: ( ( () 'instanceof' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:5: ( () 'instanceof' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:5: ( () 'instanceof' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:6: () 'instanceof'
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:914:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:915:1: 
        {
        }

        match(input,28,FOLLOW_28_in_synpred5_InternalHOOPL2183); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHOOPL

    // $ANTLR start synpred6_InternalHOOPL
    public final void synpred6_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:945:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:945:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:945:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:945:10: () ( ( ruleOpCompare ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:945:10: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:946:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:946:2: ( ( ruleOpCompare ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:947:1: ( ruleOpCompare )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:947:1: ( ruleOpCompare )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:948:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHOOPL2254);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalHOOPL

    // $ANTLR start synpred7_InternalHOOPL
    public final void synpred7_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1067:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1067:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1067:4: ( () ( ( ruleOpOther ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1067:5: () ( ( ruleOpOther ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1067:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1068:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1068:2: ( ( ruleOpOther ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1069:1: ( ruleOpOther )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1069:1: ( ruleOpOther )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1070:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHOOPL2573);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalHOOPL

    // $ANTLR start synpred8_InternalHOOPL
    public final void synpred8_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1179:3: ( ( '>' '>' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1179:4: ( '>' '>' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1179:4: ( '>' '>' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1180:2: '>' '>'
        {
        match(input,31,FOLLOW_31_in_synpred8_InternalHOOPL2842); if (state.failed) return ;
        match(input,31,FOLLOW_31_in_synpred8_InternalHOOPL2847); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalHOOPL

    // $ANTLR start synpred9_InternalHOOPL
    public final void synpred9_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1209:3: ( ( '<' '<' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1209:4: ( '<' '<' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1209:4: ( '<' '<' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1210:2: '<' '<'
        {
        match(input,32,FOLLOW_32_in_synpred9_InternalHOOPL2929); if (state.failed) return ;
        match(input,32,FOLLOW_32_in_synpred9_InternalHOOPL2934); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalHOOPL

    // $ANTLR start synpred10_InternalHOOPL
    public final void synpred10_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1283:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1283:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1283:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1283:5: () ( ( ruleOpAdd ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1283:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1284:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1284:2: ( ( ruleOpAdd ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1285:1: ( ruleOpAdd )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1285:1: ( ruleOpAdd )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1286:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHOOPL3156);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalHOOPL

    // $ANTLR start synpred11_InternalHOOPL
    public final void synpred11_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1391:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1391:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1391:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1391:5: () ( ( ruleOpMulti ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1391:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1392:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1392:2: ( ( ruleOpMulti ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1393:1: ( ruleOpMulti )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1393:1: ( ruleOpMulti )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1394:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHOOPL3436);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalHOOPL

    // $ANTLR start synpred12_InternalHOOPL
    public final void synpred12_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1624:3: ( ( () 'as' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1624:4: ( () 'as' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1624:4: ( () 'as' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1624:5: () 'as'
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1624:5: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1625:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred12_InternalHOOPL4030); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHOOPL

    // $ANTLR start synpred13_InternalHOOPL
    public final void synpred13_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:4: ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:5: ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:5: ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:6: () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1684:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1685:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred13_InternalHOOPL4184); if (state.failed) return ;
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1686:1: ( ( ruleFeatureCallID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1687:1: ( ruleFeatureCallID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1687:1: ( ruleFeatureCallID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1688:3: ruleFeatureCallID
        {
        pushFollow(FOLLOW_ruleFeatureCallID_in_synpred13_InternalHOOPL4193);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHOOPL4199);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHOOPL

    // $ANTLR start synpred14_InternalHOOPL
    public final void synpred14_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1742:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1742:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1742:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1742:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1742:10: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1743:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1743:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt100=3;
        switch ( input.LA(1) ) {
        case 48:
            {
            alt100=1;
            }
            break;
        case 49:
            {
            alt100=2;
            }
            break;
        case 50:
            {
            alt100=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 100, 0, input);

            throw nvae;
        }

        switch (alt100) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1743:4: '.'
                {
                match(input,48,FOLLOW_48_in_synpred14_InternalHOOPL4302); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1745:6: ( ( '?.' ) )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1745:6: ( ( '?.' ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1746:1: ( '?.' )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1746:1: ( '?.' )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1747:2: '?.'
                {
                match(input,49,FOLLOW_49_in_synpred14_InternalHOOPL4316); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1752:6: ( ( '*.' ) )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1752:6: ( ( '*.' ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1753:1: ( '*.' )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1753:1: ( '*.' )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1754:2: '*.'
                {
                match(input,50,FOLLOW_50_in_synpred14_InternalHOOPL4336); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHOOPL

    // $ANTLR start synpred15_InternalHOOPL
    public final void synpred15_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1863:4: ( ( '(' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1864:1: ( '(' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1864:1: ( '(' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1865:2: '('
        {
        match(input,52,FOLLOW_52_in_synpred15_InternalHOOPL4563); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHOOPL

    // $ANTLR start synpred16_InternalHOOPL
    public final void synpred16_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1884:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1884:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1884:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1884:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1884:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1885:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1885:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==36||LA102_0==52) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1885:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1885:3: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1886:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1886:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1887:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHOOPL4615);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1889:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==51) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1889:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,51,FOLLOW_51_in_synpred16_InternalHOOPL4622); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1890:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1891:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1891:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1892:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHOOPL4629);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop101;
                    }
                } while (true);


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1894:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1895:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1895:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1896:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred16_InternalHOOPL4643); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHOOPL

    // $ANTLR start synpred17_InternalHOOPL
    public final void synpred17_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1963:4: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1963:5: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1963:5: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1963:6: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1963:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:1964:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred17_InternalHOOPL4763); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHOOPL

    // $ANTLR start synpred18_InternalHOOPL
    public final void synpred18_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2164:7: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2164:8: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2164:8: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2164:9: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2164:9: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2165:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred18_InternalHOOPL5314); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalHOOPL

    // $ANTLR start synpred20_InternalHOOPL
    public final void synpred20_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2456:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2456:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2456:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2456:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2456:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==36||LA104_0==52) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2456:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2456:7: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2457:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2457:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2458:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHOOPL6064);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2460:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==51) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2460:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,51,FOLLOW_51_in_synpred20_InternalHOOPL6071); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2461:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2462:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2462:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2463:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHOOPL6078);
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

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2465:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2466:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2466:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2467:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred20_InternalHOOPL6092); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHOOPL

    // $ANTLR start synpred22_InternalHOOPL
    public final void synpred22_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2826:4: ( 'else' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2826:6: 'else'
        {
        match(input,61,FOLLOW_61_in_synpred22_InternalHOOPL6875); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalHOOPL

    // $ANTLR start synpred23_InternalHOOPL
    public final void synpred23_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2880:6: ( ( ruleValidID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2881:1: ( ruleValidID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2881:1: ( ruleValidID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2882:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHOOPL7017);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,16,FOLLOW_16_in_synpred23_InternalHOOPL7023); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHOOPL

    // $ANTLR start synpred24_InternalHOOPL
    public final void synpred24_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2926:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2926:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2926:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2926:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,52,FOLLOW_52_in_synpred24_InternalHOOPL7099); if (state.failed) return ;
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2927:1: ( ( ruleValidID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2928:1: ( ruleValidID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2928:1: ( ruleValidID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:2929:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalHOOPL7106);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,16,FOLLOW_16_in_synpred24_InternalHOOPL7112); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHOOPL

    // $ANTLR start synpred25_InternalHOOPL
    public final void synpred25_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3510:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3510:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3510:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3510:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3510:6: ( ( ruleJvmTypeReference ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3511:1: ( ruleJvmTypeReference )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3511:1: ( ruleJvmTypeReference )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3512:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHOOPL8377);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3514:2: ( ( ruleValidID ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3515:1: ( ruleValidID )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3515:1: ( ruleValidID )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3516:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalHOOPL8386);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalHOOPL

    // $ANTLR start synpred26_InternalHOOPL
    public final void synpred26_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3814:4: ( ( '(' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3815:1: ( '(' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3815:1: ( '(' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3816:2: '('
        {
        match(input,52,FOLLOW_52_in_synpred26_InternalHOOPL8948); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHOOPL

    // $ANTLR start synpred27_InternalHOOPL
    public final void synpred27_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3835:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3835:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3835:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3835:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3835:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3836:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3836:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt108=2;
        int LA108_0 = input.LA(1);

        if ( (LA108_0==RULE_ID||LA108_0==36||LA108_0==52) ) {
            alt108=1;
        }
        switch (alt108) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3836:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3836:3: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3837:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3837:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3838:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHOOPL9000);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3840:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop107:
                do {
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==51) ) {
                        alt107=1;
                    }


                    switch (alt107) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3840:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,51,FOLLOW_51_in_synpred27_InternalHOOPL9007); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3841:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3842:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3842:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3843:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHOOPL9014);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop107;
                    }
                } while (true);


                }
                break;

        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3845:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3846:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3846:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3847:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred27_InternalHOOPL9028); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHOOPL

    // $ANTLR start synpred28_InternalHOOPL
    public final void synpred28_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3914:4: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3914:5: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3914:5: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3914:6: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3914:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:3915:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred28_InternalHOOPL9148); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHOOPL

    // $ANTLR start synpred29_InternalHOOPL
    public final void synpred29_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4117:4: ( '<' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4117:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred29_InternalHOOPL9715); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalHOOPL

    // $ANTLR start synpred30_InternalHOOPL
    public final void synpred30_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4166:5: ( '(' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4166:7: '('
        {
        match(input,52,FOLLOW_52_in_synpred30_InternalHOOPL9808); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHOOPL

    // $ANTLR start synpred31_InternalHOOPL
    public final void synpred31_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4171:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4171:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4171:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4171:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4171:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4172:1: 
        {
        }

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4172:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt110=2;
        int LA110_0 = input.LA(1);

        if ( (LA110_0==RULE_ID||LA110_0==36||LA110_0==52) ) {
            alt110=1;
        }
        switch (alt110) {
            case 1 :
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4172:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4172:3: ( ( ruleJvmFormalParameter ) )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4173:1: ( ruleJvmFormalParameter )
                {
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4173:1: ( ruleJvmFormalParameter )
                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4174:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHOOPL9838);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4176:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop109:
                do {
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==51) ) {
                        alt109=1;
                    }


                    switch (alt109) {
                	case 1 :
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4176:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,51,FOLLOW_51_in_synpred31_InternalHOOPL9845); if (state.failed) return ;
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4177:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4178:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4178:1: ( ruleJvmFormalParameter )
                	    // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4179:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHOOPL9852);
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

        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4181:6: ( ( '|' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4182:1: ( '|' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4182:1: ( '|' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4183:2: '|'
        {
        match(input,58,FOLLOW_58_in_synpred31_InternalHOOPL9866); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalHOOPL

    // $ANTLR start synpred32_InternalHOOPL
    public final void synpred32_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4250:4: ( ( () '[' ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4250:5: ( () '[' )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4250:5: ( () '[' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4250:6: () '['
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4250:6: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4251:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred32_InternalHOOPL9986); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalHOOPL

    // $ANTLR start synpred33_InternalHOOPL
    public final void synpred33_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4590:2: ( ( ruleXExpression ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4591:1: ( ruleXExpression )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4591:1: ( ruleXExpression )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4592:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalHOOPL10810);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalHOOPL

    // $ANTLR start synpred34_InternalHOOPL
    public final void synpred34_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4661:5: ( 'catch' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4661:7: 'catch'
        {
        match(input,85,FOLLOW_85_in_synpred34_InternalHOOPL10955); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalHOOPL

    // $ANTLR start synpred35_InternalHOOPL
    public final void synpred35_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4680:5: ( 'finally' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4680:7: 'finally'
        {
        match(input,84,FOLLOW_84_in_synpred35_InternalHOOPL10985); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHOOPL

    // $ANTLR start synpred37_InternalHOOPL
    public final void synpred37_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4828:3: ( '.' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4829:2: '.'
        {
        match(input,48,FOLLOW_48_in_synpred37_InternalHOOPL11332); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHOOPL

    // $ANTLR start synpred38_InternalHOOPL
    public final void synpred38_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4952:2: ( ( () ruleArrayBrackets ) )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4952:3: ( () ruleArrayBrackets )
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4952:3: ( () ruleArrayBrackets )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4952:4: () ruleArrayBrackets
        {
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4952:4: ()
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:4953:1: 
        {
        }

        pushFollow(FOLLOW_ruleArrayBrackets_in_synpred38_InternalHOOPL11715);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalHOOPL

    // $ANTLR start synpred39_InternalHOOPL
    public final void synpred39_InternalHOOPL_fragment() throws RecognitionException {   
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5137:4: ( '<' )
        // ../org.uqbar.hoope/src-gen/org/uqbar/hoope/parser/antlr/internal/InternalHOOPL.g:5137:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred39_InternalHOOPL12167); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalHOOPL

    // Delegated rules

    public final boolean synpred4_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred34_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalHOOPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHOOPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA98 dfa98 = new DFA98(this);
    static final String DFA14_eotS =
        "\14\uffff";
    static final String DFA14_eofS =
        "\1\1\13\uffff";
    static final String DFA14_minS =
        "\1\4\1\uffff\11\0\1\uffff";
    static final String DFA14_maxS =
        "\1\125\1\uffff\11\0\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA14_specialS =
        "\2\uffff\1\4\1\7\1\5\1\6\1\3\1\10\1\2\1\1\1\0\1\uffff}>";
    static final String[] DFA14_transitionS = {
            "\5\1\6\uffff\2\1\3\uffff\13\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\22\1\1\uffff\20\1\1\uffff\12\1",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 1067:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_10 = input.LA(1);

                         
                        int index14_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHOOPL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHOOPL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHOOPL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHOOPL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHOOPL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHOOPL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHOOPL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHOOPL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHOOPL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\14\uffff";
    static final String DFA17_eofS =
        "\14\uffff";
    static final String DFA17_minS =
        "\1\37\2\uffff\1\37\10\uffff";
    static final String DFA17_maxS =
        "\1\47\2\uffff\1\43\10\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\11\1\12\1\3\1\6";
    static final String DFA17_specialS =
        "\14\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\3\1\6\1\1\1\2\1\4\1\5\1\7\1\10\1\11",
            "",
            "",
            "\1\13\3\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "1132:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )";
        }
    }
    static final String DFA30_eotS =
        "\112\uffff";
    static final String DFA30_eofS =
        "\1\2\111\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\110\uffff";
    static final String DFA30_maxS =
        "\1\125\1\0\110\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\106\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\110\uffff}>";
    static final String[] DFA30_transitionS = {
            "\5\2\6\uffff\2\2\3\uffff\40\2\1\1\5\2\1\uffff\20\2\1\uffff\12"+
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
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1863:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\43\uffff";
    static final String DFA29_eofS =
        "\43\uffff";
    static final String DFA29_minS =
        "\1\4\2\0\40\uffff";
    static final String DFA29_maxS =
        "\1\123\2\0\40\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\2\1\1\2\34\uffff\1\3";
    static final String DFA29_specialS =
        "\1\0\1\1\1\2\40\uffff}>";
    static final String[] DFA29_transitionS = {
            "\4\5\1\1\27\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\42\3\5\1\uffff\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff"+
            "\3\5\2\uffff\5\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1884:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==RULE_ID) ) {s = 1;}

                        else if ( (LA29_0==52) ) {s = 2;}

                        else if ( (LA29_0==36) && (synpred16_InternalHOOPL())) {s = 3;}

                        else if ( (LA29_0==58) && (synpred16_InternalHOOPL())) {s = 4;}

                        else if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_DECIMAL)||LA29_0==32||(LA29_0>=40 && LA29_0<=41)||LA29_0==46||(LA29_0>=54 && LA29_0<=56)||LA29_0==60||LA29_0==62||(LA29_0>=65 && LA29_0<=67)||(LA29_0>=70 && LA29_0<=74)||(LA29_0>=76 && LA29_0<=83)) ) {s = 5;}

                        else if ( (LA29_0==53) ) {s = 34;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHOOPL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHOOPL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\112\uffff";
    static final String DFA31_eofS =
        "\1\2\111\uffff";
    static final String DFA31_minS =
        "\1\4\1\0\110\uffff";
    static final String DFA31_maxS =
        "\1\125\1\0\110\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\106\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\110\uffff}>";
    static final String[] DFA31_transitionS = {
            "\5\2\6\uffff\2\2\3\uffff\44\2\1\1\1\2\1\uffff\20\2\1\uffff\12"+
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
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1963:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\16\uffff";
    static final String DFA33_eofS =
        "\16\uffff";
    static final String DFA33_minS =
        "\1\4\15\uffff";
    static final String DFA33_maxS =
        "\1\123\15\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA33_specialS =
        "\16\uffff}>";
    static final String[] DFA33_transitionS = {
            "\4\5\1\4\27\uffff\1\4\23\uffff\1\15\1\uffff\1\5\1\2\1\5\3\uffff"+
            "\1\6\1\uffff\1\3\2\uffff\1\7\1\10\1\11\2\uffff\5\4\1\uffff\1"+
            "\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
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
            return "2004:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA42_eotS =
        "\45\uffff";
    static final String DFA42_eofS =
        "\45\uffff";
    static final String DFA42_minS =
        "\1\4\2\0\42\uffff";
    static final String DFA42_maxS =
        "\1\123\2\0\42\uffff";
    static final String DFA42_acceptS =
        "\3\uffff\2\1\1\2\37\uffff";
    static final String DFA42_specialS =
        "\1\0\1\1\1\2\42\uffff}>";
    static final String[] DFA42_transitionS = {
            "\4\5\1\1\27\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\uffff\4\5\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff\12"+
            "\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "2456:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_0 = input.LA(1);

                         
                        int index42_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA42_0==RULE_ID) ) {s = 1;}

                        else if ( (LA42_0==52) ) {s = 2;}

                        else if ( (LA42_0==36) && (synpred20_InternalHOOPL())) {s = 3;}

                        else if ( (LA42_0==58) && (synpred20_InternalHOOPL())) {s = 4;}

                        else if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_DECIMAL)||LA42_0==32||(LA42_0>=40 && LA42_0<=41)||LA42_0==46||(LA42_0>=54 && LA42_0<=57)||LA42_0==60||LA42_0==62||(LA42_0>=65 && LA42_0<=74)||(LA42_0>=76 && LA42_0<=83)) ) {s = 5;}

                         
                        input.seek(index42_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHOOPL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHOOPL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\112\uffff";
    static final String DFA66_eofS =
        "\1\2\111\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\110\uffff";
    static final String DFA66_maxS =
        "\1\125\1\0\110\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\106\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\110\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\6\uffff\2\2\3\uffff\40\2\1\1\5\2\1\uffff\20\2\1\uffff\12"+
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
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3814:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\43\uffff";
    static final String DFA65_eofS =
        "\43\uffff";
    static final String DFA65_minS =
        "\1\4\2\0\40\uffff";
    static final String DFA65_maxS =
        "\1\123\2\0\40\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\2\1\1\2\34\uffff\1\3";
    static final String DFA65_specialS =
        "\1\0\1\1\1\2\40\uffff}>";
    static final String[] DFA65_transitionS = {
            "\4\5\1\1\27\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\42\3\5\1\uffff\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff"+
            "\3\5\2\uffff\5\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3835:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_0 = input.LA(1);

                         
                        int index65_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_0==RULE_ID) ) {s = 1;}

                        else if ( (LA65_0==52) ) {s = 2;}

                        else if ( (LA65_0==36) && (synpred27_InternalHOOPL())) {s = 3;}

                        else if ( (LA65_0==58) && (synpred27_InternalHOOPL())) {s = 4;}

                        else if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_DECIMAL)||LA65_0==32||(LA65_0>=40 && LA65_0<=41)||LA65_0==46||(LA65_0>=54 && LA65_0<=56)||LA65_0==60||LA65_0==62||(LA65_0>=65 && LA65_0<=67)||(LA65_0>=70 && LA65_0<=74)||(LA65_0>=76 && LA65_0<=83)) ) {s = 5;}

                        else if ( (LA65_0==53) ) {s = 34;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHOOPL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHOOPL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\112\uffff";
    static final String DFA67_eofS =
        "\1\2\111\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\110\uffff";
    static final String DFA67_maxS =
        "\1\125\1\0\110\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\106\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\110\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\6\uffff\2\2\3\uffff\44\2\1\1\1\2\1\uffff\20\2\1\uffff\12"+
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
            return "3914:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
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
    static final String DFA72_eotS =
        "\112\uffff";
    static final String DFA72_eofS =
        "\1\2\111\uffff";
    static final String DFA72_minS =
        "\1\4\1\0\110\uffff";
    static final String DFA72_maxS =
        "\1\125\1\0\110\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\106\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\110\uffff}>";
    static final String[] DFA72_transitionS = {
            "\5\2\6\uffff\2\2\3\uffff\14\2\1\1\31\2\1\uffff\20\2\1\uffff"+
            "\12\2",
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
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4117:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\112\uffff";
    static final String DFA75_eofS =
        "\1\2\111\uffff";
    static final String DFA75_minS =
        "\1\4\1\0\110\uffff";
    static final String DFA75_maxS =
        "\1\125\1\0\110\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\2\106\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\110\uffff}>";
    static final String[] DFA75_transitionS = {
            "\5\2\6\uffff\2\2\3\uffff\40\2\1\1\5\2\1\uffff\20\2\1\uffff\12"+
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
            return "4166:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index75_1);
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
    static final String DFA74_eotS =
        "\43\uffff";
    static final String DFA74_eofS =
        "\43\uffff";
    static final String DFA74_minS =
        "\1\4\2\0\40\uffff";
    static final String DFA74_maxS =
        "\1\123\2\0\40\uffff";
    static final String DFA74_acceptS =
        "\3\uffff\2\1\1\2\34\uffff\1\3";
    static final String DFA74_specialS =
        "\1\0\1\1\1\2\40\uffff}>";
    static final String[] DFA74_transitionS = {
            "\4\5\1\1\27\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\42\3\5\1\uffff\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff"+
            "\3\5\2\uffff\5\5\1\uffff\10\5",
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
            return "4171:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_0 = input.LA(1);

                         
                        int index74_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_0==RULE_ID) ) {s = 1;}

                        else if ( (LA74_0==52) ) {s = 2;}

                        else if ( (LA74_0==36) && (synpred31_InternalHOOPL())) {s = 3;}

                        else if ( (LA74_0==58) && (synpred31_InternalHOOPL())) {s = 4;}

                        else if ( ((LA74_0>=RULE_STRING && LA74_0<=RULE_DECIMAL)||LA74_0==32||(LA74_0>=40 && LA74_0<=41)||LA74_0==46||(LA74_0>=54 && LA74_0<=56)||LA74_0==60||LA74_0==62||(LA74_0>=65 && LA74_0<=67)||(LA74_0>=70 && LA74_0<=74)||(LA74_0>=76 && LA74_0<=83)) ) {s = 5;}

                        else if ( (LA74_0==53) ) {s = 34;}

                         
                        input.seek(index74_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHOOPL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHOOPL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index74_2);
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
    static final String DFA76_eotS =
        "\112\uffff";
    static final String DFA76_eofS =
        "\1\2\111\uffff";
    static final String DFA76_minS =
        "\1\4\1\0\110\uffff";
    static final String DFA76_maxS =
        "\1\125\1\0\110\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\2\106\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\110\uffff}>";
    static final String[] DFA76_transitionS = {
            "\5\2\6\uffff\2\2\3\uffff\44\2\1\1\1\2\1\uffff\20\2\1\uffff\12"+
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
            return "4250:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred32_InternalHOOPL()) ) {s = 73;}

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
    static final String DFA79_eotS =
        "\112\uffff";
    static final String DFA79_eofS =
        "\1\40\111\uffff";
    static final String DFA79_minS =
        "\1\4\37\0\52\uffff";
    static final String DFA79_maxS =
        "\1\125\37\0\52\uffff";
    static final String DFA79_acceptS =
        "\40\uffff\1\2\50\uffff\1\1";
    static final String DFA79_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\52\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\26\1\22\1\23\1\24\1\1\6\uffff\2\40\3\uffff\14\40\1\14\7\40"+
            "\1\10\1\7\4\40\1\6\5\40\1\37\1\40\1\16\1\12\1\17\1\40\1\uffff"+
            "\1\40\1\30\1\40\1\13\2\40\1\31\1\32\1\33\2\40\1\2\1\3\1\4\1"+
            "\5\1\15\1\uffff\1\11\1\20\1\21\1\25\1\27\1\34\1\35\1\36\2\40",
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

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "4590:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_3 = input.LA(1);

                         
                        int index79_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_4 = input.LA(1);

                         
                        int index79_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_5 = input.LA(1);

                         
                        int index79_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_6 = input.LA(1);

                         
                        int index79_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_7 = input.LA(1);

                         
                        int index79_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA79_8 = input.LA(1);

                         
                        int index79_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA79_9 = input.LA(1);

                         
                        int index79_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA79_10 = input.LA(1);

                         
                        int index79_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA79_11 = input.LA(1);

                         
                        int index79_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA79_12 = input.LA(1);

                         
                        int index79_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA79_13 = input.LA(1);

                         
                        int index79_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA79_14 = input.LA(1);

                         
                        int index79_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA79_15 = input.LA(1);

                         
                        int index79_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA79_16 = input.LA(1);

                         
                        int index79_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA79_17 = input.LA(1);

                         
                        int index79_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA79_18 = input.LA(1);

                         
                        int index79_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA79_19 = input.LA(1);

                         
                        int index79_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA79_20 = input.LA(1);

                         
                        int index79_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA79_21 = input.LA(1);

                         
                        int index79_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA79_22 = input.LA(1);

                         
                        int index79_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA79_23 = input.LA(1);

                         
                        int index79_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA79_24 = input.LA(1);

                         
                        int index79_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA79_25 = input.LA(1);

                         
                        int index79_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA79_26 = input.LA(1);

                         
                        int index79_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA79_27 = input.LA(1);

                         
                        int index79_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA79_28 = input.LA(1);

                         
                        int index79_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA79_29 = input.LA(1);

                         
                        int index79_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA79_30 = input.LA(1);

                         
                        int index79_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA79_31 = input.LA(1);

                         
                        int index79_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHOOPL()) ) {s = 73;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_31);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA94_eotS =
        "\114\uffff";
    static final String DFA94_eofS =
        "\1\2\113\uffff";
    static final String DFA94_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA94_maxS =
        "\1\125\1\0\112\uffff";
    static final String DFA94_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA94_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA94_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\3\2\2\uffff\14\2\1\1\31\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "5137:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_1 = input.LA(1);

                         
                        int index94_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalHOOPL()) ) {s = 75;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index94_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA98_eotS =
        "\7\uffff";
    static final String DFA98_eofS =
        "\2\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String DFA98_minS =
        "\1\10\1\uffff\1\60\1\10\1\uffff\1\60\1\uffff";
    static final String DFA98_maxS =
        "\1\107\1\uffff\1\73\1\52\1\uffff\1\73\1\uffff";
    static final String DFA98_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String DFA98_specialS =
        "\7\uffff}>";
    static final String[] DFA98_transitionS = {
            "\1\2\76\uffff\1\1",
            "",
            "\1\3\12\uffff\1\4",
            "\1\5\41\uffff\1\6",
            "",
            "\1\3\12\uffff\1\4",
            ""
    };

    static final short[] DFA98_eot = DFA.unpackEncodedString(DFA98_eotS);
    static final short[] DFA98_eof = DFA.unpackEncodedString(DFA98_eofS);
    static final char[] DFA98_min = DFA.unpackEncodedStringToUnsignedChars(DFA98_minS);
    static final char[] DFA98_max = DFA.unpackEncodedStringToUnsignedChars(DFA98_maxS);
    static final short[] DFA98_accept = DFA.unpackEncodedString(DFA98_acceptS);
    static final short[] DFA98_special = DFA.unpackEncodedString(DFA98_specialS);
    static final short[][] DFA98_transition;

    static {
        int numStates = DFA98_transitionS.length;
        DFA98_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA98_transition[i] = DFA.unpackEncodedString(DFA98_transitionS[i]);
        }
    }

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = DFA98_eot;
            this.eof = DFA98_eof;
            this.min = DFA98_min;
            this.max = DFA98_max;
            this.accept = DFA98_accept;
            this.special = DFA98_special;
            this.transition = DFA98_transition;
        }
        public String getDescription() {
            return "5524:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDefinition_in_ruleProgram130 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleObjectDefinition_in_entryRuleObjectDefinition166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDefinition176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleObjectDefinition213 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleObjectDefinition234 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleObjectDefinition246 = new BitSet(new long[]{0x000000000002A100L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleObjectDefinition267 = new BitSet(new long[]{0x000000000002A100L});
    public static final BitSet FOLLOW_15_in_ruleObjectDefinition280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDefinition_in_ruleFeature373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFeature400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleFeature427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProperty518 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProperty530 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleProperty551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMessage634 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMessage655 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMessage667 = new BitSet(new long[]{0x51D04301000081F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleMessage688 = new BitSet(new long[]{0x51D04301000081F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_15_in_ruleMessage701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXAssignment895 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment911 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment961 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1014 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpSingleAssign1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpMultiAssign1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpMultiAssign1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1330 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1383 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1406 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpOr1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1589 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1642 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1665 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpAnd1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1848 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1901 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1924 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpEquality2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpEquality2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2166 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_28_in_ruleXRelationalExpression2202 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2225 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2286 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2309 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2552 = new BitSet(new long[]{0x000000FF80000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2605 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2628 = new BitSet(new long[]{0x000000FF80000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2755 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpOther2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2827 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2858 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2914 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2945 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3135 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3188 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3211 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpAdd3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpAdd3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3415 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3468 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3491 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3744 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpUnary3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpUnary3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4014 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXCastedExpression4049 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4072 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4167 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4216 = new BitSet(new long[]{0x0000000000000100L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4239 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4255 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4277 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4363 = new BitSet(new long[]{0x0000000100000100L,0x00000000000003C0L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall4387 = new BitSet(new long[]{0x0000000100000100L,0x00000000000003C0L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall4424 = new BitSet(new long[]{0x0000000100000100L,0x00000000000003C0L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall4453 = new BitSet(new long[]{0x0010001000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4474 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall4487 = new BitSet(new long[]{0x0010001000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4508 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall4522 = new BitSet(new long[]{0x0000000000000100L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4547 = new BitSet(new long[]{0x0117000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall4581 = new BitSet(new long[]{0x55F04311000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4666 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4694 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall4707 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4728 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall4745 = new BitSet(new long[]{0x0107000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4780 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral5504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCollectionLiteral5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral5623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSetLiteral5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXSetLiteral5679 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSetLiteral5691 = new BitSet(new long[]{0x51D04301000081F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral5713 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_51_in_ruleXSetLiteral5726 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral5747 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSetLiteral5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral5799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXListLiteral5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXListLiteral5855 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXListLiteral5867 = new BitSet(new long[]{0x53D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral5889 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXListLiteral5902 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral5923 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXListLiteral5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXClosure6045 = new BitSet(new long[]{0x57D04311000001F0L,0x00000000000FF7FEL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6118 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure6131 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6152 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXClosure6174 = new BitSet(new long[]{0x53D04301000001F0L,0x00000000000FF7FEL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6211 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXClosure6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6325 = new BitSet(new long[]{0x59D04301000001F2L,0x00000000000FF7FEL});
    public static final BitSet FOLLOW_59_in_ruleXExpressionInClosure6338 = new BitSet(new long[]{0x51D04301000001F2L,0x00000000000FF7FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6496 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXShortClosure6509 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6530 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXShortClosure6552 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXParenthesizedExpression6671 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6693 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXParenthesizedExpression6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXIfExpression6796 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6808 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6829 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression6841 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6862 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXIfExpression6883 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXSwitchExpression6999 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7042 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression7054 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7078 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression7122 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7143 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression7155 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7178 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression7190 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7204 = new BitSet(new long[]{0x0010001000010100L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7225 = new BitSet(new long[]{0x8010001000018100L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleXSwitchExpression7239 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression7251 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7272 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSwitchExpression7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7378 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleXCasePart7392 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7413 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXCasePart7427 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXForLoopExpression7540 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXForLoopExpression7552 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7573 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXForLoopExpression7585 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7606 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression7618 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXWhileExpression7731 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXWhileExpression7743 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7764 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXWhileExpression7776 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXDoWhileExpression7889 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXDoWhileExpression7922 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXDoWhileExpression7934 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7955 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXDoWhileExpression7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression8059 = new BitSet(new long[]{0x51D04301000081F0L,0x00000000000FF7FEL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8081 = new BitSet(new long[]{0x59D04301000081F0L,0x00000000000FF7FEL});
    public static final BitSet FOLLOW_59_in_ruleXBlockExpression8094 = new BitSet(new long[]{0x51D04301000081F0L,0x00000000000FF7FEL});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXVariableDeclaration8328 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_69_in_ruleXVariableDeclaration8359 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8407 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8428 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8457 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXVariableDeclaration8471 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8586 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8700 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8824 = new BitSet(new long[]{0x0000000100000100L,0x00000000000007C0L});
    public static final BitSet FOLLOW_32_in_ruleXFeatureCall8838 = new BitSet(new long[]{0x0010001000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8859 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_51_in_ruleXFeatureCall8872 = new BitSet(new long[]{0x0010001000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8893 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall8907 = new BitSet(new long[]{0x0000000100000100L,0x00000000000007C0L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8932 = new BitSet(new long[]{0x0110000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXFeatureCall8966 = new BitSet(new long[]{0x55F04311000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9051 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9079 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXFeatureCall9092 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9113 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXFeatureCall9130 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID9203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCallID9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFeatureCallID9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleFeatureCallID9285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleFeatureCallID9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleFeatureCallID9323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleFeatureCallID9342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper9441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleIdOrSuper9465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleStaticQualifier9582 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXConstructorCall9679 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9702 = new BitSet(new long[]{0x0110000100000002L});
    public static final BitSet FOLLOW_32_in_ruleXConstructorCall9723 = new BitSet(new long[]{0x0010001000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9745 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_51_in_ruleXConstructorCall9758 = new BitSet(new long[]{0x0010001000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9779 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXConstructorCall9793 = new BitSet(new long[]{0x0110000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXConstructorCall9816 = new BitSet(new long[]{0x55F04311000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9889 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9917 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXConstructorCall9930 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9951 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXConstructorCall9968 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall10003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXBooleanLiteral10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXBooleanLiteral10121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXNullLiteral10227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral10273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral10328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleXTypeLiteral10522 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXTypeLiteral10534 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10557 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral10578 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXTypeLiteral10591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleXThrowExpression10683 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleXReturnExpression10796 = new BitSet(new long[]{0x51D04301000001F2L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleXTryCatchFinallyExpression10920 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10971 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_84_in_ruleXTryCatchFinallyExpression10993 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleXTryCatchFinallyExpression11037 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleXCatchClause11151 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCatchClause11164 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11185 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXCatchClause11197 = new BitSet(new long[]{0x51D04301000001F0L,0x00000000000FF7CEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11313 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleQualifiedName11341 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11364 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber11418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber11429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11501 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11527 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNumber11547 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11700 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference11736 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets11803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayBrackets11814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleArrayBrackets11852 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleArrayBrackets11865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXFunctionTypeRef11953 = new BitSet(new long[]{0x0030001000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11975 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXFunctionTypeRef11988 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12009 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXFunctionTypeRef12025 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXFunctionTypeRef12039 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12154 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleJvmParameterizedTypeReference12175 = new BitSet(new long[]{0x0010001000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12197 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_51_in_ruleJvmParameterizedTypeReference12210 = new BitSet(new long[]{0x0010001000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12231 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_31_in_ruleJvmParameterizedTypeReference12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleJvmWildcardTypeReference12458 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000440L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleJvmUpperBound12592 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleJvmUpperBoundAnded12696 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmLowerBound12800 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12918 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleQualifiedNameWithWildcard12936 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleQualifiedNameWithWildcard12949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID13001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID13040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration13086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImportDeclaration13096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXImportDeclaration13133 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleXImportDeclaration13153 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleXImportDeclaration13184 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13221 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXImportDeclaration13233 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXImportDeclaration13245 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration13275 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration13302 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXImportDeclaration13316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHOOPL982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHOOPL1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHOOPL1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHOOPL1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred5_InternalHOOPL2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHOOPL2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHOOPL2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred8_InternalHOOPL2842 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred8_InternalHOOPL2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred9_InternalHOOPL2929 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred9_InternalHOOPL2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHOOPL3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHOOPL3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred12_InternalHOOPL4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred13_InternalHOOPL4184 = new BitSet(new long[]{0x0000000000000100L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_synpred13_InternalHOOPL4193 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHOOPL4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred14_InternalHOOPL4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred14_InternalHOOPL4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred14_InternalHOOPL4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred15_InternalHOOPL4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHOOPL4615 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_51_in_synpred16_InternalHOOPL4622 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHOOPL4629 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_58_in_synpred16_InternalHOOPL4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred17_InternalHOOPL4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred18_InternalHOOPL5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHOOPL6064 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_51_in_synpred20_InternalHOOPL6071 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHOOPL6078 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_58_in_synpred20_InternalHOOPL6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred22_InternalHOOPL6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHOOPL7017 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred23_InternalHOOPL7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred24_InternalHOOPL7099 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalHOOPL7106 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred24_InternalHOOPL7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHOOPL8377 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalHOOPL8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred26_InternalHOOPL8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHOOPL9000 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_51_in_synpred27_InternalHOOPL9007 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHOOPL9014 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_58_in_synpred27_InternalHOOPL9028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred28_InternalHOOPL9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred29_InternalHOOPL9715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred30_InternalHOOPL9808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHOOPL9838 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_51_in_synpred31_InternalHOOPL9845 = new BitSet(new long[]{0x0010001000000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHOOPL9852 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_58_in_synpred31_InternalHOOPL9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred32_InternalHOOPL9986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalHOOPL10810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_synpred34_InternalHOOPL10955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_synpred35_InternalHOOPL10985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred37_InternalHOOPL11332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_synpred38_InternalHOOPL11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred39_InternalHOOPL12167 = new BitSet(new long[]{0x0000000000000002L});

}