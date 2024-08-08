package org.xtext.globalTypes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.globalTypes.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "'){'", "'}'", "'@proposition'", "'@action'", "','", "')'", "'@predicate'", "'QUIT'", "'role'", "'roleset'", "':'", "'End'", "'rec'", "'{'", "'loop'", "'for'", "'<'", "'>'", "';'", "'choice'", "'at'", "'or'", "'()'", "'from'", "'to'", "'.'", "'local'", "'foreach'", "'int'", "'text'", "'aid'", "'float'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_definitions_0_0= ruleQuitDefinition ) ) ( (lv_definitions_1_0= ruleDefinition ) )* ( ( (lv_protocol_2_0= ruleGlobalProtocol ) ) | ( (lv_protocol_3_0= ruleLocalProtocol ) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_0_0 = null;

        EObject lv_definitions_1_0 = null;

        EObject lv_protocol_2_0 = null;

        EObject lv_protocol_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_definitions_0_0= ruleQuitDefinition ) ) ( (lv_definitions_1_0= ruleDefinition ) )* ( ( (lv_protocol_2_0= ruleGlobalProtocol ) ) | ( (lv_protocol_3_0= ruleLocalProtocol ) ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_definitions_0_0= ruleQuitDefinition ) ) ( (lv_definitions_1_0= ruleDefinition ) )* ( ( (lv_protocol_2_0= ruleGlobalProtocol ) ) | ( (lv_protocol_3_0= ruleLocalProtocol ) ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_definitions_0_0= ruleQuitDefinition ) ) ( (lv_definitions_1_0= ruleDefinition ) )* ( ( (lv_protocol_2_0= ruleGlobalProtocol ) ) | ( (lv_protocol_3_0= ruleLocalProtocol ) ) ) )
            // InternalMyDsl.g:79:3: ( (lv_definitions_0_0= ruleQuitDefinition ) ) ( (lv_definitions_1_0= ruleDefinition ) )* ( ( (lv_protocol_2_0= ruleGlobalProtocol ) ) | ( (lv_protocol_3_0= ruleLocalProtocol ) ) )
            {
            // InternalMyDsl.g:79:3: ( (lv_definitions_0_0= ruleQuitDefinition ) )
            // InternalMyDsl.g:80:4: (lv_definitions_0_0= ruleQuitDefinition )
            {
            // InternalMyDsl.g:80:4: (lv_definitions_0_0= ruleQuitDefinition )
            // InternalMyDsl.g:81:5: lv_definitions_0_0= ruleQuitDefinition
            {

            					newCompositeNode(grammarAccess.getModelAccess().getDefinitionsQuitDefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_definitions_0_0=ruleQuitDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"definitions",
            						lv_definitions_0_0,
            						"org.xtext.globalTypes.MyDsl.QuitDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_definitions_1_0= ruleDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=17)||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_definitions_1_0= ruleDefinition )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_definitions_1_0= ruleDefinition )
            	    // InternalMyDsl.g:100:5: lv_definitions_1_0= ruleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDefinitionsDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_definitions_1_0=ruleDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"definitions",
            	    						lv_definitions_1_0,
            	    						"org.xtext.globalTypes.MyDsl.Definition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:117:3: ( ( (lv_protocol_2_0= ruleGlobalProtocol ) ) | ( (lv_protocol_3_0= ruleLocalProtocol ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==40) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:118:4: ( (lv_protocol_2_0= ruleGlobalProtocol ) )
                    {
                    // InternalMyDsl.g:118:4: ( (lv_protocol_2_0= ruleGlobalProtocol ) )
                    // InternalMyDsl.g:119:5: (lv_protocol_2_0= ruleGlobalProtocol )
                    {
                    // InternalMyDsl.g:119:5: (lv_protocol_2_0= ruleGlobalProtocol )
                    // InternalMyDsl.g:120:6: lv_protocol_2_0= ruleGlobalProtocol
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getProtocolGlobalProtocolParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_protocol_2_0=ruleGlobalProtocol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"protocol",
                    							lv_protocol_2_0,
                    							"org.xtext.globalTypes.MyDsl.GlobalProtocol");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:138:4: ( (lv_protocol_3_0= ruleLocalProtocol ) )
                    {
                    // InternalMyDsl.g:138:4: ( (lv_protocol_3_0= ruleLocalProtocol ) )
                    // InternalMyDsl.g:139:5: (lv_protocol_3_0= ruleLocalProtocol )
                    {
                    // InternalMyDsl.g:139:5: (lv_protocol_3_0= ruleLocalProtocol )
                    // InternalMyDsl.g:140:6: lv_protocol_3_0= ruleLocalProtocol
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getProtocolLocalProtocolParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_protocol_3_0=ruleLocalProtocol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"protocol",
                    							lv_protocol_3_0,
                    							"org.xtext.globalTypes.MyDsl.LocalProtocol");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGlobalProtocol"
    // InternalMyDsl.g:162:1: entryRuleGlobalProtocol returns [EObject current=null] : iv_ruleGlobalProtocol= ruleGlobalProtocol EOF ;
    public final EObject entryRuleGlobalProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalProtocol = null;


        try {
            // InternalMyDsl.g:162:55: (iv_ruleGlobalProtocol= ruleGlobalProtocol EOF )
            // InternalMyDsl.g:163:2: iv_ruleGlobalProtocol= ruleGlobalProtocol EOF
            {
             newCompositeNode(grammarAccess.getGlobalProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalProtocol=ruleGlobalProtocol();

            state._fsp--;

             current =iv_ruleGlobalProtocol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalProtocol"


    // $ANTLR start "ruleGlobalProtocol"
    // InternalMyDsl.g:169:1: ruleGlobalProtocol returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' ) ;
    public final EObject ruleGlobalProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_protocolName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_roles_4_0 = null;

        EObject lv_protocol_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:175:2: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:176:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:176:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' )
            // InternalMyDsl.g:177:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalProtocolAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:185:3: ( (lv_protocolName_2_0= RULE_ID ) )
            // InternalMyDsl.g:186:4: (lv_protocolName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:186:4: (lv_protocolName_2_0= RULE_ID )
            // InternalMyDsl.g:187:5: lv_protocolName_2_0= RULE_ID
            {
            lv_protocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_protocolName_2_0, grammarAccess.getGlobalProtocolAccess().getProtocolNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalProtocolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocolName",
            						lv_protocolName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalProtocolAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:207:3: ( (lv_roles_4_0= ruleRoles ) )
            // InternalMyDsl.g:208:4: (lv_roles_4_0= ruleRoles )
            {
            // InternalMyDsl.g:208:4: (lv_roles_4_0= ruleRoles )
            // InternalMyDsl.g:209:5: lv_roles_4_0= ruleRoles
            {

            					newCompositeNode(grammarAccess.getGlobalProtocolAccess().getRolesRolesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_roles_4_0=ruleRoles();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalProtocolRule());
            					}
            					set(
            						current,
            						"roles",
            						lv_roles_4_0,
            						"org.xtext.globalTypes.MyDsl.Roles");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getGlobalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:230:3: ( (lv_protocol_6_0= ruleProtocol ) )
            // InternalMyDsl.g:231:4: (lv_protocol_6_0= ruleProtocol )
            {
            // InternalMyDsl.g:231:4: (lv_protocol_6_0= ruleProtocol )
            // InternalMyDsl.g:232:5: lv_protocol_6_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getGlobalProtocolAccess().getProtocolProtocolParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_protocol_6_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalProtocolRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_6_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGlobalProtocolAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleGlobalProtocol"


    // $ANTLR start "entryRuleDefinition"
    // InternalMyDsl.g:257:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalMyDsl.g:257:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalMyDsl.g:258:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMyDsl.g:264:1: ruleDefinition returns [EObject current=null] : ( ( ( (lv_type_0_0= '@proposition' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( ( (lv_type_2_0= '@action' ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleType ) ) )? otherlv_8= ')' )? ) | ( ( (lv_type_9_0= '@predicate' ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )? otherlv_15= ')' ) | this_QuitDefinition_16= ruleQuitDefinition ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token lv_type_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_type_9_0=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_types_5_0 = null;

        AntlrDatatypeRuleToken lv_types_7_0 = null;

        AntlrDatatypeRuleToken lv_types_12_0 = null;

        AntlrDatatypeRuleToken lv_types_14_0 = null;

        EObject this_QuitDefinition_16 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:270:2: ( ( ( ( (lv_type_0_0= '@proposition' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( ( (lv_type_2_0= '@action' ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleType ) ) )? otherlv_8= ')' )? ) | ( ( (lv_type_9_0= '@predicate' ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )? otherlv_15= ')' ) | this_QuitDefinition_16= ruleQuitDefinition ) )
            // InternalMyDsl.g:271:2: ( ( ( (lv_type_0_0= '@proposition' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( ( (lv_type_2_0= '@action' ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleType ) ) )? otherlv_8= ')' )? ) | ( ( (lv_type_9_0= '@predicate' ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )? otherlv_15= ')' ) | this_QuitDefinition_16= ruleQuitDefinition )
            {
            // InternalMyDsl.g:271:2: ( ( ( (lv_type_0_0= '@proposition' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( ( (lv_type_2_0= '@action' ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleType ) ) )? otherlv_8= ')' )? ) | ( ( (lv_type_9_0= '@predicate' ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )? otherlv_15= ')' ) | this_QuitDefinition_16= ruleQuitDefinition )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    alt6=2;
                }
                else if ( (LA6_2==21) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:272:3: ( ( (lv_type_0_0= '@proposition' ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:272:3: ( ( (lv_type_0_0= '@proposition' ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalMyDsl.g:273:4: ( (lv_type_0_0= '@proposition' ) ) ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:273:4: ( (lv_type_0_0= '@proposition' ) )
                    // InternalMyDsl.g:274:5: (lv_type_0_0= '@proposition' )
                    {
                    // InternalMyDsl.g:274:5: (lv_type_0_0= '@proposition' )
                    // InternalMyDsl.g:275:6: lv_type_0_0= '@proposition'
                    {
                    lv_type_0_0=(Token)match(input,16,FOLLOW_5); 

                    						newLeafNode(lv_type_0_0, grammarAccess.getDefinitionAccess().getTypePropositionKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_0, "@proposition");
                    					

                    }


                    }

                    // InternalMyDsl.g:287:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalMyDsl.g:288:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:288:5: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:289:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:307:3: ( ( (lv_type_2_0= '@action' ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleType ) ) )? otherlv_8= ')' )? )
                    {
                    // InternalMyDsl.g:307:3: ( ( (lv_type_2_0= '@action' ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleType ) ) )? otherlv_8= ')' )? )
                    // InternalMyDsl.g:308:4: ( (lv_type_2_0= '@action' ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleType ) ) )? otherlv_8= ')' )?
                    {
                    // InternalMyDsl.g:308:4: ( (lv_type_2_0= '@action' ) )
                    // InternalMyDsl.g:309:5: (lv_type_2_0= '@action' )
                    {
                    // InternalMyDsl.g:309:5: (lv_type_2_0= '@action' )
                    // InternalMyDsl.g:310:6: lv_type_2_0= '@action'
                    {
                    lv_type_2_0=(Token)match(input,17,FOLLOW_5); 

                    						newLeafNode(lv_type_2_0, grammarAccess.getDefinitionAccess().getTypeActionKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_0, "@action");
                    					

                    }


                    }

                    // InternalMyDsl.g:322:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalMyDsl.g:323:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMyDsl.g:323:5: (lv_name_3_0= RULE_ID )
                    // InternalMyDsl.g:324:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyDsl.g:340:4: (otherlv_4= '(' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleType ) ) )? otherlv_8= ')' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==13) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMyDsl.g:341:5: otherlv_4= '(' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleType ) ) )? otherlv_8= ')'
                            {
                            otherlv_4=(Token)match(input,13,FOLLOW_12); 

                            					newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_2_0());
                            				
                            // InternalMyDsl.g:345:5: ( (lv_types_5_0= ruleType ) )
                            // InternalMyDsl.g:346:6: (lv_types_5_0= ruleType )
                            {
                            // InternalMyDsl.g:346:6: (lv_types_5_0= ruleType )
                            // InternalMyDsl.g:347:7: lv_types_5_0= ruleType
                            {

                            							newCompositeNode(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_types_5_0=ruleType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDefinitionRule());
                            							}
                            							add(
                            								current,
                            								"types",
                            								lv_types_5_0,
                            								"org.xtext.globalTypes.MyDsl.Type");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDsl.g:364:5: (otherlv_6= ',' ( (lv_types_7_0= ruleType ) ) )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==18) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // InternalMyDsl.g:365:6: otherlv_6= ',' ( (lv_types_7_0= ruleType ) )
                                    {
                                    otherlv_6=(Token)match(input,18,FOLLOW_12); 

                                    						newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_2_0());
                                    					
                                    // InternalMyDsl.g:369:6: ( (lv_types_7_0= ruleType ) )
                                    // InternalMyDsl.g:370:7: (lv_types_7_0= ruleType )
                                    {
                                    // InternalMyDsl.g:370:7: (lv_types_7_0= ruleType )
                                    // InternalMyDsl.g:371:8: lv_types_7_0= ruleType
                                    {

                                    								newCompositeNode(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_1_2_2_1_0());
                                    							
                                    pushFollow(FOLLOW_14);
                                    lv_types_7_0=ruleType();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getDefinitionRule());
                                    								}
                                    								add(
                                    									current,
                                    									"types",
                                    									lv_types_7_0,
                                    									"org.xtext.globalTypes.MyDsl.Type");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_8=(Token)match(input,19,FOLLOW_2); 

                            					newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_2_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:396:3: ( ( (lv_type_9_0= '@predicate' ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )? otherlv_15= ')' )
                    {
                    // InternalMyDsl.g:396:3: ( ( (lv_type_9_0= '@predicate' ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )? otherlv_15= ')' )
                    // InternalMyDsl.g:397:4: ( (lv_type_9_0= '@predicate' ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )? otherlv_15= ')'
                    {
                    // InternalMyDsl.g:397:4: ( (lv_type_9_0= '@predicate' ) )
                    // InternalMyDsl.g:398:5: (lv_type_9_0= '@predicate' )
                    {
                    // InternalMyDsl.g:398:5: (lv_type_9_0= '@predicate' )
                    // InternalMyDsl.g:399:6: lv_type_9_0= '@predicate'
                    {
                    lv_type_9_0=(Token)match(input,20,FOLLOW_5); 

                    						newLeafNode(lv_type_9_0, grammarAccess.getDefinitionAccess().getTypePredicateKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_9_0, "@predicate");
                    					

                    }


                    }

                    // InternalMyDsl.g:411:4: ( (lv_name_10_0= RULE_ID ) )
                    // InternalMyDsl.g:412:5: (lv_name_10_0= RULE_ID )
                    {
                    // InternalMyDsl.g:412:5: (lv_name_10_0= RULE_ID )
                    // InternalMyDsl.g:413:6: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_10_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalMyDsl.g:433:4: ( (lv_types_12_0= ruleType ) )
                    // InternalMyDsl.g:434:5: (lv_types_12_0= ruleType )
                    {
                    // InternalMyDsl.g:434:5: (lv_types_12_0= ruleType )
                    // InternalMyDsl.g:435:6: lv_types_12_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_types_12_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_12_0,
                    							"org.xtext.globalTypes.MyDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:452:4: (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMyDsl.g:453:5: otherlv_13= ',' ( (lv_types_14_0= ruleType ) )
                            {
                            otherlv_13=(Token)match(input,18,FOLLOW_12); 

                            					newLeafNode(otherlv_13, grammarAccess.getDefinitionAccess().getCommaKeyword_2_4_0());
                            				
                            // InternalMyDsl.g:457:5: ( (lv_types_14_0= ruleType ) )
                            // InternalMyDsl.g:458:6: (lv_types_14_0= ruleType )
                            {
                            // InternalMyDsl.g:458:6: (lv_types_14_0= ruleType )
                            // InternalMyDsl.g:459:7: lv_types_14_0= ruleType
                            {

                            							newCompositeNode(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_2_4_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_types_14_0=ruleType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDefinitionRule());
                            							}
                            							add(
                            								current,
                            								"types",
                            								lv_types_14_0,
                            								"org.xtext.globalTypes.MyDsl.Type");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:483:3: this_QuitDefinition_16= ruleQuitDefinition
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getQuitDefinitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuitDefinition_16=ruleQuitDefinition();

                    state._fsp--;


                    			current = this_QuitDefinition_16;
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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleQuitDefinition"
    // InternalMyDsl.g:495:1: entryRuleQuitDefinition returns [EObject current=null] : iv_ruleQuitDefinition= ruleQuitDefinition EOF ;
    public final EObject entryRuleQuitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuitDefinition = null;


        try {
            // InternalMyDsl.g:495:55: (iv_ruleQuitDefinition= ruleQuitDefinition EOF )
            // InternalMyDsl.g:496:2: iv_ruleQuitDefinition= ruleQuitDefinition EOF
            {
             newCompositeNode(grammarAccess.getQuitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuitDefinition=ruleQuitDefinition();

            state._fsp--;

             current =iv_ruleQuitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuitDefinition"


    // $ANTLR start "ruleQuitDefinition"
    // InternalMyDsl.g:502:1: ruleQuitDefinition returns [EObject current=null] : ( ( (lv_type_0_0= '@action' ) ) ( (lv_name_1_0= 'QUIT' ) ) ) ;
    public final EObject ruleQuitDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:508:2: ( ( ( (lv_type_0_0= '@action' ) ) ( (lv_name_1_0= 'QUIT' ) ) ) )
            // InternalMyDsl.g:509:2: ( ( (lv_type_0_0= '@action' ) ) ( (lv_name_1_0= 'QUIT' ) ) )
            {
            // InternalMyDsl.g:509:2: ( ( (lv_type_0_0= '@action' ) ) ( (lv_name_1_0= 'QUIT' ) ) )
            // InternalMyDsl.g:510:3: ( (lv_type_0_0= '@action' ) ) ( (lv_name_1_0= 'QUIT' ) )
            {
            // InternalMyDsl.g:510:3: ( (lv_type_0_0= '@action' ) )
            // InternalMyDsl.g:511:4: (lv_type_0_0= '@action' )
            {
            // InternalMyDsl.g:511:4: (lv_type_0_0= '@action' )
            // InternalMyDsl.g:512:5: lv_type_0_0= '@action'
            {
            lv_type_0_0=(Token)match(input,17,FOLLOW_15); 

            					newLeafNode(lv_type_0_0, grammarAccess.getQuitDefinitionAccess().getTypeActionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuitDefinitionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "@action");
            				

            }


            }

            // InternalMyDsl.g:524:3: ( (lv_name_1_0= 'QUIT' ) )
            // InternalMyDsl.g:525:4: (lv_name_1_0= 'QUIT' )
            {
            // InternalMyDsl.g:525:4: (lv_name_1_0= 'QUIT' )
            // InternalMyDsl.g:526:5: lv_name_1_0= 'QUIT'
            {
            lv_name_1_0=(Token)match(input,21,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQuitDefinitionAccess().getNameQUITKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuitDefinitionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "QUIT");
            				

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
    // $ANTLR end "ruleQuitDefinition"


    // $ANTLR start "entryRuleRoles"
    // InternalMyDsl.g:542:1: entryRuleRoles returns [EObject current=null] : iv_ruleRoles= ruleRoles EOF ;
    public final EObject entryRuleRoles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoles = null;


        try {
            // InternalMyDsl.g:542:46: (iv_ruleRoles= ruleRoles EOF )
            // InternalMyDsl.g:543:2: iv_ruleRoles= ruleRoles EOF
            {
             newCompositeNode(grammarAccess.getRolesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoles=ruleRoles();

            state._fsp--;

             current =iv_ruleRoles; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoles"


    // $ANTLR start "ruleRoles"
    // InternalMyDsl.g:549:1: ruleRoles returns [EObject current=null] : ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* ) ;
    public final EObject ruleRoles() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_roles_0_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:555:2: ( ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* ) )
            // InternalMyDsl.g:556:2: ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* )
            {
            // InternalMyDsl.g:556:2: ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* )
            // InternalMyDsl.g:557:3: ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )*
            {
            // InternalMyDsl.g:557:3: ( (lv_roles_0_0= ruleRole ) )
            // InternalMyDsl.g:558:4: (lv_roles_0_0= ruleRole )
            {
            // InternalMyDsl.g:558:4: (lv_roles_0_0= ruleRole )
            // InternalMyDsl.g:559:5: lv_roles_0_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_roles_0_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRolesRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_0_0,
            						"org.xtext.globalTypes.MyDsl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:576:3: (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:577:4: otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRolesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:581:4: ( (lv_roles_2_0= ruleRole ) )
            	    // InternalMyDsl.g:582:5: (lv_roles_2_0= ruleRole )
            	    {
            	    // InternalMyDsl.g:582:5: (lv_roles_2_0= ruleRole )
            	    // InternalMyDsl.g:583:6: lv_roles_2_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_roles_2_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRolesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_2_0,
            	    							"org.xtext.globalTypes.MyDsl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleRoles"


    // $ANTLR start "entryRuleRole"
    // InternalMyDsl.g:605:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalMyDsl.g:605:45: (iv_ruleRole= ruleRole EOF )
            // InternalMyDsl.g:606:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalMyDsl.g:612:1: ruleRole returns [EObject current=null] : (this_RoleOne_0= ruleRoleOne | this_RoleSet_1= ruleRoleSet ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_RoleOne_0 = null;

        EObject this_RoleSet_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:618:2: ( (this_RoleOne_0= ruleRoleOne | this_RoleSet_1= ruleRoleSet ) )
            // InternalMyDsl.g:619:2: (this_RoleOne_0= ruleRoleOne | this_RoleSet_1= ruleRoleSet )
            {
            // InternalMyDsl.g:619:2: (this_RoleOne_0= ruleRoleOne | this_RoleSet_1= ruleRoleSet )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:620:3: this_RoleOne_0= ruleRoleOne
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getRoleOneParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoleOne_0=ruleRoleOne();

                    state._fsp--;


                    			current = this_RoleOne_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:629:3: this_RoleSet_1= ruleRoleSet
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getRoleSetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoleSet_1=ruleRoleSet();

                    state._fsp--;


                    			current = this_RoleSet_1;
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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleRoleOne"
    // InternalMyDsl.g:641:1: entryRuleRoleOne returns [EObject current=null] : iv_ruleRoleOne= ruleRoleOne EOF ;
    public final EObject entryRuleRoleOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleOne = null;


        try {
            // InternalMyDsl.g:641:48: (iv_ruleRoleOne= ruleRoleOne EOF )
            // InternalMyDsl.g:642:2: iv_ruleRoleOne= ruleRoleOne EOF
            {
             newCompositeNode(grammarAccess.getRoleOneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleOne=ruleRoleOne();

            state._fsp--;

             current =iv_ruleRoleOne; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleOne"


    // $ANTLR start "ruleRoleOne"
    // InternalMyDsl.g:648:1: ruleRoleOne returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRoleOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:654:2: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:655:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:655:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:656:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleOneAccess().getRoleKeyword_0());
            		
            // InternalMyDsl.g:660:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:661:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:661:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:662:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleOneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleOneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleRoleOne"


    // $ANTLR start "entryRuleRoleSet"
    // InternalMyDsl.g:682:1: entryRuleRoleSet returns [EObject current=null] : iv_ruleRoleSet= ruleRoleSet EOF ;
    public final EObject entryRuleRoleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleSet = null;


        try {
            // InternalMyDsl.g:682:48: (iv_ruleRoleSet= ruleRoleSet EOF )
            // InternalMyDsl.g:683:2: iv_ruleRoleSet= ruleRoleSet EOF
            {
             newCompositeNode(grammarAccess.getRoleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleSet=ruleRoleSet();

            state._fsp--;

             current =iv_ruleRoleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleSet"


    // $ANTLR start "ruleRoleSet"
    // InternalMyDsl.g:689:1: ruleRoleSet returns [EObject current=null] : (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleRoleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:695:2: ( (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMyDsl.g:696:2: (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMyDsl.g:696:2: (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalMyDsl.g:697:3: otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleSetAccess().getRolesetKeyword_0());
            		
            // InternalMyDsl.g:701:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:702:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:702:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:703:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleSetAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:723:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:724:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:724:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:725:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleSetRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getRoleSetAccess().getRefRoleOneCrossReference_3_0());
            				

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
    // $ANTLR end "ruleRoleSet"


    // $ANTLR start "entryRuleProtocol"
    // InternalMyDsl.g:740:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalMyDsl.g:740:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalMyDsl.g:741:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalMyDsl.g:747:1: ruleProtocol returns [EObject current=null] : ( ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) ) ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject lv_begin_0_1 = null;

        EObject lv_begin_0_2 = null;

        EObject lv_begin_0_3 = null;

        EObject lv_begin_0_4 = null;

        EObject lv_begin_0_5 = null;

        EObject lv_begin_0_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:753:2: ( ( ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) ) ) )
            // InternalMyDsl.g:754:2: ( ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) ) )
            {
            // InternalMyDsl.g:754:2: ( ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) ) )
            // InternalMyDsl.g:755:3: ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) )
            {
            // InternalMyDsl.g:755:3: ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) )
            // InternalMyDsl.g:756:4: (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol )
            {
            // InternalMyDsl.g:756:4: (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
            case 21:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            case 25:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:757:5: lv_begin_0_1= ruleChoice
                    {

                    					newCompositeNode(grammarAccess.getProtocolAccess().getBeginChoiceParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_1=ruleChoice();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_1,
                    						"org.xtext.globalTypes.MyDsl.Choice");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:773:5: lv_begin_0_2= ruleMessage
                    {

                    					newCompositeNode(grammarAccess.getProtocolAccess().getBeginMessageParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_2=ruleMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_2,
                    						"org.xtext.globalTypes.MyDsl.Message");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:789:5: lv_begin_0_3= ruleRecursion
                    {

                    					newCompositeNode(grammarAccess.getProtocolAccess().getBeginRecursionParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_3=ruleRecursion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_3,
                    						"org.xtext.globalTypes.MyDsl.Recursion");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:805:5: lv_begin_0_4= ruleForEach
                    {

                    					newCompositeNode(grammarAccess.getProtocolAccess().getBeginForEachParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_4=ruleForEach();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_4,
                    						"org.xtext.globalTypes.MyDsl.ForEach");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:821:5: lv_begin_0_5= ruleCloseRecursion
                    {

                    					newCompositeNode(grammarAccess.getProtocolAccess().getBeginCloseRecursionParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_5=ruleCloseRecursion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_5,
                    						"org.xtext.globalTypes.MyDsl.CloseRecursion");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:837:5: lv_begin_0_6= ruleEndProtocol
                    {

                    					newCompositeNode(grammarAccess.getProtocolAccess().getBeginEndProtocolParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_6=ruleEndProtocol();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_6,
                    						"org.xtext.globalTypes.MyDsl.EndProtocol");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleEndProtocol"
    // InternalMyDsl.g:858:1: entryRuleEndProtocol returns [EObject current=null] : iv_ruleEndProtocol= ruleEndProtocol EOF ;
    public final EObject entryRuleEndProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndProtocol = null;


        try {
            // InternalMyDsl.g:858:52: (iv_ruleEndProtocol= ruleEndProtocol EOF )
            // InternalMyDsl.g:859:2: iv_ruleEndProtocol= ruleEndProtocol EOF
            {
             newCompositeNode(grammarAccess.getEndProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndProtocol=ruleEndProtocol();

            state._fsp--;

             current =iv_ruleEndProtocol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndProtocol"


    // $ANTLR start "ruleEndProtocol"
    // InternalMyDsl.g:865:1: ruleEndProtocol returns [EObject current=null] : ( (lv_end_0_0= 'End' ) ) ;
    public final EObject ruleEndProtocol() throws RecognitionException {
        EObject current = null;

        Token lv_end_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:871:2: ( ( (lv_end_0_0= 'End' ) ) )
            // InternalMyDsl.g:872:2: ( (lv_end_0_0= 'End' ) )
            {
            // InternalMyDsl.g:872:2: ( (lv_end_0_0= 'End' ) )
            // InternalMyDsl.g:873:3: (lv_end_0_0= 'End' )
            {
            // InternalMyDsl.g:873:3: (lv_end_0_0= 'End' )
            // InternalMyDsl.g:874:4: lv_end_0_0= 'End'
            {
            lv_end_0_0=(Token)match(input,25,FOLLOW_2); 

            				newLeafNode(lv_end_0_0, grammarAccess.getEndProtocolAccess().getEndEndKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEndProtocolRule());
            				}
            				setWithLastConsumed(current, "end", lv_end_0_0, "End");
            			

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
    // $ANTLR end "ruleEndProtocol"


    // $ANTLR start "entryRuleRecursion"
    // InternalMyDsl.g:889:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalMyDsl.g:889:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalMyDsl.g:890:2: iv_ruleRecursion= ruleRecursion EOF
            {
             newCompositeNode(grammarAccess.getRecursionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecursion=ruleRecursion();

            state._fsp--;

             current =iv_ruleRecursion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecursion"


    // $ANTLR start "ruleRecursion"
    // InternalMyDsl.g:896:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_recProtocol_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:902:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:903:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:903:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' )
            // InternalMyDsl.g:904:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:908:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:909:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:909:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:910:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecursionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecursionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getRecursionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRecursionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:934:3: ( (lv_recProtocol_4_0= ruleProtocol ) )
            // InternalMyDsl.g:935:4: (lv_recProtocol_4_0= ruleProtocol )
            {
            // InternalMyDsl.g:935:4: (lv_recProtocol_4_0= ruleProtocol )
            // InternalMyDsl.g:936:5: lv_recProtocol_4_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getRecursionAccess().getRecProtocolProtocolParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_recProtocol_4_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecursionRule());
            					}
            					set(
            						current,
            						"recProtocol",
            						lv_recProtocol_4_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRecursionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRecursion"


    // $ANTLR start "entryRuleCloseRecursion"
    // InternalMyDsl.g:961:1: entryRuleCloseRecursion returns [EObject current=null] : iv_ruleCloseRecursion= ruleCloseRecursion EOF ;
    public final EObject entryRuleCloseRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursion = null;


        try {
            // InternalMyDsl.g:961:55: (iv_ruleCloseRecursion= ruleCloseRecursion EOF )
            // InternalMyDsl.g:962:2: iv_ruleCloseRecursion= ruleCloseRecursion EOF
            {
             newCompositeNode(grammarAccess.getCloseRecursionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCloseRecursion=ruleCloseRecursion();

            state._fsp--;

             current =iv_ruleCloseRecursion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloseRecursion"


    // $ANTLR start "ruleCloseRecursion"
    // InternalMyDsl.g:968:1: ruleCloseRecursion returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCloseRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:974:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:975:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:975:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:976:3: otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:980:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:981:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:981:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:982:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseRecursionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleCloseRecursion"


    // $ANTLR start "entryRuleForEach"
    // InternalMyDsl.g:997:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalMyDsl.g:997:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalMyDsl.g:998:2: iv_ruleForEach= ruleForEach EOF
            {
             newCompositeNode(grammarAccess.getForEachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEach=ruleForEach();

            state._fsp--;

             current =iv_ruleForEach; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForEach"


    // $ANTLR start "ruleForEach"
    // InternalMyDsl.g:1004:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) ) ;
    public final EObject ruleForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_loopRole_1_0 = null;

        EObject lv_forBody_9_0 = null;

        EObject lv_protocol_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1010:2: ( (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) ) )
            // InternalMyDsl.g:1011:2: (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) )
            {
            // InternalMyDsl.g:1011:2: (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) )
            // InternalMyDsl.g:1012:3: otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForKeyword_0());
            		
            // InternalMyDsl.g:1016:3: ( (lv_loopRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:1017:4: (lv_loopRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:1017:4: (lv_loopRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:1018:5: lv_loopRole_1_0= ruleRoleOne
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getLoopRoleRoleOneParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_loopRole_1_0=ruleRoleOne();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"loopRole",
            						lv_loopRole_1_0,
            						"org.xtext.globalTypes.MyDsl.RoleOne");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getLessThanSignKeyword_3());
            		
            // InternalMyDsl.g:1043:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:1044:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:1044:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:1045:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getRolesetRoleSetCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getForEachAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:1060:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:1061:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:1061:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:1062:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_6, grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getForEachAccess().getGreaterThanSignKeyword_7());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1081:3: ( (lv_forBody_9_0= ruleProtocol ) )
            // InternalMyDsl.g:1082:4: (lv_forBody_9_0= ruleProtocol )
            {
            // InternalMyDsl.g:1082:4: (lv_forBody_9_0= ruleProtocol )
            // InternalMyDsl.g:1083:5: lv_forBody_9_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getForBodyProtocolParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_forBody_9_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"forBody",
            						lv_forBody_9_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getForEachAccess().getSemicolonKeyword_11());
            		
            // InternalMyDsl.g:1108:3: ( (lv_protocol_12_0= ruleProtocol ) )
            // InternalMyDsl.g:1109:4: (lv_protocol_12_0= ruleProtocol )
            {
            // InternalMyDsl.g:1109:4: (lv_protocol_12_0= ruleProtocol )
            // InternalMyDsl.g:1110:5: lv_protocol_12_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getProtocolProtocolParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_protocol_12_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_12_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleForEach"


    // $ANTLR start "entryRuleChoice"
    // InternalMyDsl.g:1131:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalMyDsl.g:1131:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalMyDsl.g:1132:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalMyDsl.g:1138:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_branches_4_0 = null;

        EObject lv_branches_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1144:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* ) )
            // InternalMyDsl.g:1145:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* )
            {
            // InternalMyDsl.g:1145:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* )
            // InternalMyDsl.g:1146:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:1154:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1155:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1155:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1156:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1171:3: ( (lv_branches_4_0= ruleMessage ) )
            // InternalMyDsl.g:1172:4: (lv_branches_4_0= ruleMessage )
            {
            // InternalMyDsl.g:1172:4: (lv_branches_4_0= ruleMessage )
            // InternalMyDsl.g:1173:5: lv_branches_4_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getChoiceAccess().getBranchesMessageParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_branches_4_0=ruleMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_4_0,
            						"org.xtext.globalTypes.MyDsl.Message");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1194:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1195:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,35,FOLLOW_18); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,27,FOLLOW_25); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalMyDsl.g:1203:4: ( (lv_branches_8_0= ruleMessage ) )
            	    // InternalMyDsl.g:1204:5: (lv_branches_8_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:1204:5: (lv_branches_8_0= ruleMessage )
            	    // InternalMyDsl.g:1205:6: lv_branches_8_0= ruleMessage
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceAccess().getBranchesMessageParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_branches_8_0=ruleMessage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_8_0,
            	    							"org.xtext.globalTypes.MyDsl.Message");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,15,FOLLOW_26); 

            	    				newLeafNode(otherlv_9, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleMessage"
    // InternalMyDsl.g:1231:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:1231:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:1232:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalMyDsl.g:1238:1: ruleMessage returns [EObject current=null] : (this_MessageNormal_0= ruleMessageNormal | this_MessageQuit_1= ruleMessageQuit ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_MessageNormal_0 = null;

        EObject this_MessageQuit_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1244:2: ( (this_MessageNormal_0= ruleMessageNormal | this_MessageQuit_1= ruleMessageQuit ) )
            // InternalMyDsl.g:1245:2: (this_MessageNormal_0= ruleMessageNormal | this_MessageQuit_1= ruleMessageQuit )
            {
            // InternalMyDsl.g:1245:2: (this_MessageNormal_0= ruleMessageNormal | this_MessageQuit_1= ruleMessageQuit )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1246:3: this_MessageNormal_0= ruleMessageNormal
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getMessageNormalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageNormal_0=ruleMessageNormal();

                    state._fsp--;


                    			current = this_MessageNormal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1255:3: this_MessageQuit_1= ruleMessageQuit
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getMessageQuitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageQuit_1=ruleMessageQuit();

                    state._fsp--;


                    			current = this_MessageQuit_1;
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageNormal"
    // InternalMyDsl.g:1267:1: entryRuleMessageNormal returns [EObject current=null] : iv_ruleMessageNormal= ruleMessageNormal EOF ;
    public final EObject entryRuleMessageNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageNormal = null;


        try {
            // InternalMyDsl.g:1267:54: (iv_ruleMessageNormal= ruleMessageNormal EOF )
            // InternalMyDsl.g:1268:2: iv_ruleMessageNormal= ruleMessageNormal EOF
            {
             newCompositeNode(grammarAccess.getMessageNormalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageNormal=ruleMessageNormal();

            state._fsp--;

             current =iv_ruleMessageNormal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageNormal"


    // $ANTLR start "ruleMessageNormal"
    // InternalMyDsl.g:1274:1: ruleMessageNormal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) ) ;
    public final EObject ruleMessageNormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_payload_2_0 = null;

        EObject lv_protocol_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1280:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) ) )
            // InternalMyDsl.g:1281:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) )
            {
            // InternalMyDsl.g:1281:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) )
            // InternalMyDsl.g:1282:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) )
            {
            // InternalMyDsl.g:1282:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1283:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1283:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1284:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageNormalRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_0, grammarAccess.getMessageNormalAccess().getMessageTypeDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:1295:3: ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1296:4: (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:1296:4: (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' )
                    // InternalMyDsl.g:1297:5: otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_28); 

                    					newLeafNode(otherlv_1, grammarAccess.getMessageNormalAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyDsl.g:1301:5: ( (lv_payload_2_0= rulePayload ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=42 && LA12_0<=45)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:1302:6: (lv_payload_2_0= rulePayload )
                            {
                            // InternalMyDsl.g:1302:6: (lv_payload_2_0= rulePayload )
                            // InternalMyDsl.g:1303:7: lv_payload_2_0= rulePayload
                            {

                            							newCompositeNode(grammarAccess.getMessageNormalAccess().getPayloadPayloadParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_payload_2_0=rulePayload();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageNormalRule());
                            							}
                            							set(
                            								current,
                            								"payload",
                            								lv_payload_2_0,
                            								"org.xtext.globalTypes.MyDsl.Payload");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_29); 

                    					newLeafNode(otherlv_3, grammarAccess.getMessageNormalAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1326:4: otherlv_4= '()'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageNormalAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getMessageNormalAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:1335:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:1336:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:1336:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:1337:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageNormalRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_6, grammarAccess.getMessageNormalAccess().getSenderRoleOneCrossReference_3_0());
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getMessageNormalAccess().getToKeyword_4());
            		
            // InternalMyDsl.g:1352:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:1353:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:1353:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:1354:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageNormalRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_8, grammarAccess.getMessageNormalAccess().getReceiverRoleCrossReference_5_0());
            				

            }


            }

            otherlv_9=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getMessageNormalAccess().getFullStopKeyword_6());
            		
            // InternalMyDsl.g:1369:3: ( (lv_protocol_10_0= ruleProtocol ) )
            // InternalMyDsl.g:1370:4: (lv_protocol_10_0= ruleProtocol )
            {
            // InternalMyDsl.g:1370:4: (lv_protocol_10_0= ruleProtocol )
            // InternalMyDsl.g:1371:5: lv_protocol_10_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getMessageNormalAccess().getProtocolProtocolParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_protocol_10_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageNormalRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_10_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMessageNormal"


    // $ANTLR start "entryRuleMessageQuit"
    // InternalMyDsl.g:1392:1: entryRuleMessageQuit returns [EObject current=null] : iv_ruleMessageQuit= ruleMessageQuit EOF ;
    public final EObject entryRuleMessageQuit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageQuit = null;


        try {
            // InternalMyDsl.g:1392:52: (iv_ruleMessageQuit= ruleMessageQuit EOF )
            // InternalMyDsl.g:1393:2: iv_ruleMessageQuit= ruleMessageQuit EOF
            {
             newCompositeNode(grammarAccess.getMessageQuitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageQuit=ruleMessageQuit();

            state._fsp--;

             current =iv_ruleMessageQuit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageQuit"


    // $ANTLR start "ruleMessageQuit"
    // InternalMyDsl.g:1399:1: ruleMessageQuit returns [EObject current=null] : ( ( (otherlv_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleMessageQuit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1405:2: ( ( ( (otherlv_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalMyDsl.g:1406:2: ( ( (otherlv_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1406:2: ( ( (otherlv_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalMyDsl.g:1407:3: ( (otherlv_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            // InternalMyDsl.g:1407:3: ( (otherlv_0= 'QUIT' ) )
            // InternalMyDsl.g:1408:4: (otherlv_0= 'QUIT' )
            {
            // InternalMyDsl.g:1408:4: (otherlv_0= 'QUIT' )
            // InternalMyDsl.g:1409:5: otherlv_0= 'QUIT'
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageQuitRule());
            					}
            				
            otherlv_0=(Token)match(input,21,FOLLOW_32); 

            					newLeafNode(otherlv_0, grammarAccess.getMessageQuitAccess().getMessageTypeDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageQuitAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageQuitAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:1428:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1429:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1429:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1430:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageQuitRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_3, grammarAccess.getMessageQuitAccess().getSenderRoleOneCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageQuitAccess().getToKeyword_4());
            		
            // InternalMyDsl.g:1445:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1446:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1446:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1447:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageQuitRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageQuitAccess().getReceiverRoleCrossReference_5_0());
            				

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
    // $ANTLR end "ruleMessageQuit"


    // $ANTLR start "entryRulePayload"
    // InternalMyDsl.g:1462:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalMyDsl.g:1462:48: (iv_rulePayload= rulePayload EOF )
            // InternalMyDsl.g:1463:2: iv_rulePayload= rulePayload EOF
            {
             newCompositeNode(grammarAccess.getPayloadRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePayload=rulePayload();

            state._fsp--;

             current =iv_rulePayload; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePayload"


    // $ANTLR start "rulePayload"
    // InternalMyDsl.g:1469:1: rulePayload returns [EObject current=null] : ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_types_0_0 = null;

        AntlrDatatypeRuleToken lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1475:2: ( ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* ) )
            // InternalMyDsl.g:1476:2: ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* )
            {
            // InternalMyDsl.g:1476:2: ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* )
            // InternalMyDsl.g:1477:3: ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )*
            {
            // InternalMyDsl.g:1477:3: ( (lv_types_0_0= ruleType ) )
            // InternalMyDsl.g:1478:4: (lv_types_0_0= ruleType )
            {
            // InternalMyDsl.g:1478:4: (lv_types_0_0= ruleType )
            // InternalMyDsl.g:1479:5: lv_types_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_types_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPayloadRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_0_0,
            						"org.xtext.globalTypes.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1496:3: (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1497:4: otherlv_1= ',' ( (lv_types_2_0= ruleType ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPayloadAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1501:4: ( (lv_types_2_0= ruleType ) )
            	    // InternalMyDsl.g:1502:5: (lv_types_2_0= ruleType )
            	    {
            	    // InternalMyDsl.g:1502:5: (lv_types_2_0= ruleType )
            	    // InternalMyDsl.g:1503:6: lv_types_2_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_types_2_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPayloadRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_2_0,
            	    							"org.xtext.globalTypes.MyDsl.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "rulePayload"


    // $ANTLR start "entryRuleLocalProtocol"
    // InternalMyDsl.g:1525:1: entryRuleLocalProtocol returns [EObject current=null] : iv_ruleLocalProtocol= ruleLocalProtocol EOF ;
    public final EObject entryRuleLocalProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalProtocol = null;


        try {
            // InternalMyDsl.g:1525:54: (iv_ruleLocalProtocol= ruleLocalProtocol EOF )
            // InternalMyDsl.g:1526:2: iv_ruleLocalProtocol= ruleLocalProtocol EOF
            {
             newCompositeNode(grammarAccess.getLocalProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalProtocol=ruleLocalProtocol();

            state._fsp--;

             current =iv_ruleLocalProtocol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalProtocol"


    // $ANTLR start "ruleLocalProtocol"
    // InternalMyDsl.g:1532:1: ruleLocalProtocol returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= ruleRole ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) ) ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' ) ;
    public final EObject ruleLocalProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_protocolName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_projectedRole_4_0 = null;

        EObject lv_roles_6_0 = null;

        EObject lv_protocol_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1538:2: ( (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= ruleRole ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) ) ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' ) )
            // InternalMyDsl.g:1539:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= ruleRole ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) ) ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' )
            {
            // InternalMyDsl.g:1539:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= ruleRole ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) ) ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' )
            // InternalMyDsl.g:1540:3: otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= ruleRole ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) ) ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalProtocolAccess().getLocalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:1548:3: ( (lv_protocolName_2_0= RULE_ID ) )
            // InternalMyDsl.g:1549:4: (lv_protocolName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1549:4: (lv_protocolName_2_0= RULE_ID )
            // InternalMyDsl.g:1550:5: lv_protocolName_2_0= RULE_ID
            {
            lv_protocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_protocolName_2_0, grammarAccess.getLocalProtocolAccess().getProtocolNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalProtocolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocolName",
            						lv_protocolName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalProtocolAccess().getAtKeyword_3());
            		
            // InternalMyDsl.g:1570:3: ( (lv_projectedRole_4_0= ruleRole ) )
            // InternalMyDsl.g:1571:4: (lv_projectedRole_4_0= ruleRole )
            {
            // InternalMyDsl.g:1571:4: (lv_projectedRole_4_0= ruleRole )
            // InternalMyDsl.g:1572:5: lv_projectedRole_4_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getProjectedRoleRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_projectedRole_4_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalProtocolRule());
            					}
            					set(
            						current,
            						"projectedRole",
            						lv_projectedRole_4_0,
            						"org.xtext.globalTypes.MyDsl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_5());
            		
            // InternalMyDsl.g:1593:3: ( (lv_roles_6_0= ruleRoles ) )
            // InternalMyDsl.g:1594:4: (lv_roles_6_0= ruleRoles )
            {
            // InternalMyDsl.g:1594:4: (lv_roles_6_0= ruleRoles )
            // InternalMyDsl.g:1595:5: lv_roles_6_0= ruleRoles
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getRolesRolesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_33);
            lv_roles_6_0=ruleRoles();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalProtocolRule());
            					}
            					set(
            						current,
            						"roles",
            						lv_roles_6_0,
            						"org.xtext.globalTypes.MyDsl.Roles");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1612:3: (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            else if ( (LA15_0==19) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1613:4: otherlv_7= '){'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_34); 

                    				newLeafNode(otherlv_7, grammarAccess.getLocalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1618:4: (otherlv_8= ')' otherlv_9= '{' )
                    {
                    // InternalMyDsl.g:1618:4: (otherlv_8= ')' otherlv_9= '{' )
                    // InternalMyDsl.g:1619:5: otherlv_8= ')' otherlv_9= '{'
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_18); 

                    					newLeafNode(otherlv_8, grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7_1_0());
                    				
                    otherlv_9=(Token)match(input,27,FOLLOW_34); 

                    					newLeafNode(otherlv_9, grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_7_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1629:3: ( (lv_protocol_10_0= ruleProtocolL ) )
            // InternalMyDsl.g:1630:4: (lv_protocol_10_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1630:4: (lv_protocol_10_0= ruleProtocolL )
            // InternalMyDsl.g:1631:5: lv_protocol_10_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_protocol_10_0=ruleProtocolL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalProtocolRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_10_0,
            						"org.xtext.globalTypes.MyDsl.ProtocolL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleLocalProtocol"


    // $ANTLR start "entryRuleProtocolL"
    // InternalMyDsl.g:1656:1: entryRuleProtocolL returns [EObject current=null] : iv_ruleProtocolL= ruleProtocolL EOF ;
    public final EObject entryRuleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolL = null;


        try {
            // InternalMyDsl.g:1656:50: (iv_ruleProtocolL= ruleProtocolL EOF )
            // InternalMyDsl.g:1657:2: iv_ruleProtocolL= ruleProtocolL EOF
            {
             newCompositeNode(grammarAccess.getProtocolLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocolL=ruleProtocolL();

            state._fsp--;

             current =iv_ruleProtocolL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocolL"


    // $ANTLR start "ruleProtocolL"
    // InternalMyDsl.g:1663:1: ruleProtocolL returns [EObject current=null] : ( ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) ) ) ;
    public final EObject ruleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject lv_begin_0_1 = null;

        EObject lv_begin_0_2 = null;

        EObject lv_begin_0_3 = null;

        EObject lv_begin_0_4 = null;

        EObject lv_begin_0_5 = null;

        EObject lv_begin_0_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1669:2: ( ( ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) ) ) )
            // InternalMyDsl.g:1670:2: ( ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) ) )
            {
            // InternalMyDsl.g:1670:2: ( ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) ) )
            // InternalMyDsl.g:1671:3: ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) )
            {
            // InternalMyDsl.g:1671:3: ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) )
            // InternalMyDsl.g:1672:4: (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol )
            {
            // InternalMyDsl.g:1672:4: (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol )
            int alt16=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 21:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 41:
                {
                alt16=3;
                }
                break;
            case 26:
                {
                alt16=4;
                }
                break;
            case 28:
                {
                alt16=5;
                }
                break;
            case 25:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1673:5: lv_begin_0_1= ruleMessageL
                    {

                    					newCompositeNode(grammarAccess.getProtocolLAccess().getBeginMessageLParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_1=ruleMessageL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolLRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_1,
                    						"org.xtext.globalTypes.MyDsl.MessageL");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1689:5: lv_begin_0_2= ruleChoiceL
                    {

                    					newCompositeNode(grammarAccess.getProtocolLAccess().getBeginChoiceLParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_2=ruleChoiceL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolLRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_2,
                    						"org.xtext.globalTypes.MyDsl.ChoiceL");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1705:5: lv_begin_0_3= ruleForEachL
                    {

                    					newCompositeNode(grammarAccess.getProtocolLAccess().getBeginForEachLParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_3=ruleForEachL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolLRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_3,
                    						"org.xtext.globalTypes.MyDsl.ForEachL");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1721:5: lv_begin_0_4= ruleRecursionL
                    {

                    					newCompositeNode(grammarAccess.getProtocolLAccess().getBeginRecursionLParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_4=ruleRecursionL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolLRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_4,
                    						"org.xtext.globalTypes.MyDsl.RecursionL");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1737:5: lv_begin_0_5= ruleCloseRecursionL
                    {

                    					newCompositeNode(grammarAccess.getProtocolLAccess().getBeginCloseRecursionLParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_5=ruleCloseRecursionL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolLRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_5,
                    						"org.xtext.globalTypes.MyDsl.CloseRecursionL");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1753:5: lv_begin_0_6= ruleEndProtocol
                    {

                    					newCompositeNode(grammarAccess.getProtocolLAccess().getBeginEndProtocolParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_6=ruleEndProtocol();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolLRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_6,
                    						"org.xtext.globalTypes.MyDsl.EndProtocol");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleProtocolL"


    // $ANTLR start "entryRuleRecursionL"
    // InternalMyDsl.g:1774:1: entryRuleRecursionL returns [EObject current=null] : iv_ruleRecursionL= ruleRecursionL EOF ;
    public final EObject entryRuleRecursionL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursionL = null;


        try {
            // InternalMyDsl.g:1774:51: (iv_ruleRecursionL= ruleRecursionL EOF )
            // InternalMyDsl.g:1775:2: iv_ruleRecursionL= ruleRecursionL EOF
            {
             newCompositeNode(grammarAccess.getRecursionLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecursionL=ruleRecursionL();

            state._fsp--;

             current =iv_ruleRecursionL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecursionL"


    // $ANTLR start "ruleRecursionL"
    // InternalMyDsl.g:1781:1: ruleRecursionL returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' ) ;
    public final EObject ruleRecursionL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_recProtocol_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1787:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1788:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1788:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1789:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionLAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:1793:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1794:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1794:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1795:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecursionLAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecursionLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getRecursionLAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getRecursionLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1819:3: ( (lv_recProtocol_4_0= ruleProtocolL ) )
            // InternalMyDsl.g:1820:4: (lv_recProtocol_4_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1820:4: (lv_recProtocol_4_0= ruleProtocolL )
            // InternalMyDsl.g:1821:5: lv_recProtocol_4_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getRecursionLAccess().getRecProtocolProtocolLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_recProtocol_4_0=ruleProtocolL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecursionLRule());
            					}
            					set(
            						current,
            						"recProtocol",
            						lv_recProtocol_4_0,
            						"org.xtext.globalTypes.MyDsl.ProtocolL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRecursionLAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRecursionL"


    // $ANTLR start "entryRuleCloseRecursionL"
    // InternalMyDsl.g:1846:1: entryRuleCloseRecursionL returns [EObject current=null] : iv_ruleCloseRecursionL= ruleCloseRecursionL EOF ;
    public final EObject entryRuleCloseRecursionL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursionL = null;


        try {
            // InternalMyDsl.g:1846:56: (iv_ruleCloseRecursionL= ruleCloseRecursionL EOF )
            // InternalMyDsl.g:1847:2: iv_ruleCloseRecursionL= ruleCloseRecursionL EOF
            {
             newCompositeNode(grammarAccess.getCloseRecursionLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCloseRecursionL=ruleCloseRecursionL();

            state._fsp--;

             current =iv_ruleCloseRecursionL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloseRecursionL"


    // $ANTLR start "ruleCloseRecursionL"
    // InternalMyDsl.g:1853:1: ruleCloseRecursionL returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCloseRecursionL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1859:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1860:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1860:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1861:3: otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionLAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:1865:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1866:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1866:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1867:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseRecursionLRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLCrossReference_1_0());
            				

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
    // $ANTLR end "ruleCloseRecursionL"


    // $ANTLR start "entryRuleMessageL"
    // InternalMyDsl.g:1882:1: entryRuleMessageL returns [EObject current=null] : iv_ruleMessageL= ruleMessageL EOF ;
    public final EObject entryRuleMessageL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageL = null;


        try {
            // InternalMyDsl.g:1882:49: (iv_ruleMessageL= ruleMessageL EOF )
            // InternalMyDsl.g:1883:2: iv_ruleMessageL= ruleMessageL EOF
            {
             newCompositeNode(grammarAccess.getMessageLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageL=ruleMessageL();

            state._fsp--;

             current =iv_ruleMessageL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageL"


    // $ANTLR start "ruleMessageL"
    // InternalMyDsl.g:1889:1: ruleMessageL returns [EObject current=null] : (this_MessageNormalL_0= ruleMessageNormalL | this_MessageQuitL_1= ruleMessageQuitL ) ;
    public final EObject ruleMessageL() throws RecognitionException {
        EObject current = null;

        EObject this_MessageNormalL_0 = null;

        EObject this_MessageQuitL_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1895:2: ( (this_MessageNormalL_0= ruleMessageNormalL | this_MessageQuitL_1= ruleMessageQuitL ) )
            // InternalMyDsl.g:1896:2: (this_MessageNormalL_0= ruleMessageNormalL | this_MessageQuitL_1= ruleMessageQuitL )
            {
            // InternalMyDsl.g:1896:2: (this_MessageNormalL_0= ruleMessageNormalL | this_MessageQuitL_1= ruleMessageQuitL )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==21) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1897:3: this_MessageNormalL_0= ruleMessageNormalL
                    {

                    			newCompositeNode(grammarAccess.getMessageLAccess().getMessageNormalLParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageNormalL_0=ruleMessageNormalL();

                    state._fsp--;


                    			current = this_MessageNormalL_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1906:3: this_MessageQuitL_1= ruleMessageQuitL
                    {

                    			newCompositeNode(grammarAccess.getMessageLAccess().getMessageQuitLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageQuitL_1=ruleMessageQuitL();

                    state._fsp--;


                    			current = this_MessageQuitL_1;
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
    // $ANTLR end "ruleMessageL"


    // $ANTLR start "entryRuleMessageNormalL"
    // InternalMyDsl.g:1918:1: entryRuleMessageNormalL returns [EObject current=null] : iv_ruleMessageNormalL= ruleMessageNormalL EOF ;
    public final EObject entryRuleMessageNormalL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageNormalL = null;


        try {
            // InternalMyDsl.g:1918:55: (iv_ruleMessageNormalL= ruleMessageNormalL EOF )
            // InternalMyDsl.g:1919:2: iv_ruleMessageNormalL= ruleMessageNormalL EOF
            {
             newCompositeNode(grammarAccess.getMessageNormalLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageNormalL=ruleMessageNormalL();

            state._fsp--;

             current =iv_ruleMessageNormalL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageNormalL"


    // $ANTLR start "ruleMessageNormalL"
    // InternalMyDsl.g:1925:1: ruleMessageNormalL returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) ( (lv_sendReceive_5_0= ruleMessageType ) ) otherlv_6= '.' ( (lv_protocol_7_0= ruleProtocolL ) ) ) ;
    public final EObject ruleMessageNormalL() throws RecognitionException {
        EObject current = null;

        Token lv_messageType_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_payload_2_0 = null;

        EObject lv_sendReceive_5_0 = null;

        EObject lv_protocol_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1931:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) ( (lv_sendReceive_5_0= ruleMessageType ) ) otherlv_6= '.' ( (lv_protocol_7_0= ruleProtocolL ) ) ) )
            // InternalMyDsl.g:1932:2: ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) ( (lv_sendReceive_5_0= ruleMessageType ) ) otherlv_6= '.' ( (lv_protocol_7_0= ruleProtocolL ) ) )
            {
            // InternalMyDsl.g:1932:2: ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) ( (lv_sendReceive_5_0= ruleMessageType ) ) otherlv_6= '.' ( (lv_protocol_7_0= ruleProtocolL ) ) )
            // InternalMyDsl.g:1933:3: ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) ( (lv_sendReceive_5_0= ruleMessageType ) ) otherlv_6= '.' ( (lv_protocol_7_0= ruleProtocolL ) )
            {
            // InternalMyDsl.g:1933:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:1934:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1934:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:1935:5: lv_messageType_0_0= RULE_ID
            {
            lv_messageType_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_messageType_0_0, grammarAccess.getMessageNormalLAccess().getMessageTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageNormalLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"messageType",
            						lv_messageType_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:1951:3: ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1952:4: (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:1952:4: (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' )
                    // InternalMyDsl.g:1953:5: otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_28); 

                    					newLeafNode(otherlv_1, grammarAccess.getMessageNormalLAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyDsl.g:1957:5: ( (lv_payload_2_0= rulePayload ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=42 && LA18_0<=45)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyDsl.g:1958:6: (lv_payload_2_0= rulePayload )
                            {
                            // InternalMyDsl.g:1958:6: (lv_payload_2_0= rulePayload )
                            // InternalMyDsl.g:1959:7: lv_payload_2_0= rulePayload
                            {

                            							newCompositeNode(grammarAccess.getMessageNormalLAccess().getPayloadPayloadParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_payload_2_0=rulePayload();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageNormalLRule());
                            							}
                            							set(
                            								current,
                            								"payload",
                            								lv_payload_2_0,
                            								"org.xtext.globalTypes.MyDsl.Payload");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_35); 

                    					newLeafNode(otherlv_3, grammarAccess.getMessageNormalLAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1982:4: otherlv_4= '()'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageNormalLAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1987:3: ( (lv_sendReceive_5_0= ruleMessageType ) )
            // InternalMyDsl.g:1988:4: (lv_sendReceive_5_0= ruleMessageType )
            {
            // InternalMyDsl.g:1988:4: (lv_sendReceive_5_0= ruleMessageType )
            // InternalMyDsl.g:1989:5: lv_sendReceive_5_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getMessageNormalLAccess().getSendReceiveMessageTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_sendReceive_5_0=ruleMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageNormalLRule());
            					}
            					set(
            						current,
            						"sendReceive",
            						lv_sendReceive_5_0,
            						"org.xtext.globalTypes.MyDsl.MessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageNormalLAccess().getFullStopKeyword_3());
            		
            // InternalMyDsl.g:2010:3: ( (lv_protocol_7_0= ruleProtocolL ) )
            // InternalMyDsl.g:2011:4: (lv_protocol_7_0= ruleProtocolL )
            {
            // InternalMyDsl.g:2011:4: (lv_protocol_7_0= ruleProtocolL )
            // InternalMyDsl.g:2012:5: lv_protocol_7_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getMessageNormalLAccess().getProtocolProtocolLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_protocol_7_0=ruleProtocolL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageNormalLRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_7_0,
            						"org.xtext.globalTypes.MyDsl.ProtocolL");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMessageNormalL"


    // $ANTLR start "entryRuleMessageQuitL"
    // InternalMyDsl.g:2033:1: entryRuleMessageQuitL returns [EObject current=null] : iv_ruleMessageQuitL= ruleMessageQuitL EOF ;
    public final EObject entryRuleMessageQuitL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageQuitL = null;


        try {
            // InternalMyDsl.g:2033:53: (iv_ruleMessageQuitL= ruleMessageQuitL EOF )
            // InternalMyDsl.g:2034:2: iv_ruleMessageQuitL= ruleMessageQuitL EOF
            {
             newCompositeNode(grammarAccess.getMessageQuitLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageQuitL=ruleMessageQuitL();

            state._fsp--;

             current =iv_ruleMessageQuitL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageQuitL"


    // $ANTLR start "ruleMessageQuitL"
    // InternalMyDsl.g:2040:1: ruleMessageQuitL returns [EObject current=null] : ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' ( (lv_sendReceive_2_0= ruleMessageType ) ) ) ;
    public final EObject ruleMessageQuitL() throws RecognitionException {
        EObject current = null;

        Token lv_messageType_0_0=null;
        Token otherlv_1=null;
        EObject lv_sendReceive_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2046:2: ( ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' ( (lv_sendReceive_2_0= ruleMessageType ) ) ) )
            // InternalMyDsl.g:2047:2: ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' ( (lv_sendReceive_2_0= ruleMessageType ) ) )
            {
            // InternalMyDsl.g:2047:2: ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' ( (lv_sendReceive_2_0= ruleMessageType ) ) )
            // InternalMyDsl.g:2048:3: ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' ( (lv_sendReceive_2_0= ruleMessageType ) )
            {
            // InternalMyDsl.g:2048:3: ( (lv_messageType_0_0= 'QUIT' ) )
            // InternalMyDsl.g:2049:4: (lv_messageType_0_0= 'QUIT' )
            {
            // InternalMyDsl.g:2049:4: (lv_messageType_0_0= 'QUIT' )
            // InternalMyDsl.g:2050:5: lv_messageType_0_0= 'QUIT'
            {
            lv_messageType_0_0=(Token)match(input,21,FOLLOW_32); 

            					newLeafNode(lv_messageType_0_0, grammarAccess.getMessageQuitLAccess().getMessageTypeQUITKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageQuitLRule());
            					}
            					setWithLastConsumed(current, "messageType", lv_messageType_0_0, "QUIT");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageQuitLAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2066:3: ( (lv_sendReceive_2_0= ruleMessageType ) )
            // InternalMyDsl.g:2067:4: (lv_sendReceive_2_0= ruleMessageType )
            {
            // InternalMyDsl.g:2067:4: (lv_sendReceive_2_0= ruleMessageType )
            // InternalMyDsl.g:2068:5: lv_sendReceive_2_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getMessageQuitLAccess().getSendReceiveMessageTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sendReceive_2_0=ruleMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageQuitLRule());
            					}
            					set(
            						current,
            						"sendReceive",
            						lv_sendReceive_2_0,
            						"org.xtext.globalTypes.MyDsl.MessageType");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMessageQuitL"


    // $ANTLR start "entryRuleMessageType"
    // InternalMyDsl.g:2089:1: entryRuleMessageType returns [EObject current=null] : iv_ruleMessageType= ruleMessageType EOF ;
    public final EObject entryRuleMessageType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageType = null;


        try {
            // InternalMyDsl.g:2089:52: (iv_ruleMessageType= ruleMessageType EOF )
            // InternalMyDsl.g:2090:2: iv_ruleMessageType= ruleMessageType EOF
            {
             newCompositeNode(grammarAccess.getMessageTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageType=ruleMessageType();

            state._fsp--;

             current =iv_ruleMessageType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageType"


    // $ANTLR start "ruleMessageType"
    // InternalMyDsl.g:2096:1: ruleMessageType returns [EObject current=null] : (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL ) ;
    public final EObject ruleMessageType() throws RecognitionException {
        EObject current = null;

        EObject this_SenderL_0 = null;

        EObject this_ReceiverL_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2102:2: ( (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL ) )
            // InternalMyDsl.g:2103:2: (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL )
            {
            // InternalMyDsl.g:2103:2: (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            else if ( (LA20_0==38) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2104:3: this_SenderL_0= ruleSenderL
                    {

                    			newCompositeNode(grammarAccess.getMessageTypeAccess().getSenderLParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SenderL_0=ruleSenderL();

                    state._fsp--;


                    			current = this_SenderL_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2113:3: this_ReceiverL_1= ruleReceiverL
                    {

                    			newCompositeNode(grammarAccess.getMessageTypeAccess().getReceiverLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReceiverL_1=ruleReceiverL();

                    state._fsp--;


                    			current = this_ReceiverL_1;
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
    // $ANTLR end "ruleMessageType"


    // $ANTLR start "entryRuleSenderL"
    // InternalMyDsl.g:2125:1: entryRuleSenderL returns [EObject current=null] : iv_ruleSenderL= ruleSenderL EOF ;
    public final EObject entryRuleSenderL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenderL = null;


        try {
            // InternalMyDsl.g:2125:48: (iv_ruleSenderL= ruleSenderL EOF )
            // InternalMyDsl.g:2126:2: iv_ruleSenderL= ruleSenderL EOF
            {
             newCompositeNode(grammarAccess.getSenderLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSenderL=ruleSenderL();

            state._fsp--;

             current =iv_ruleSenderL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSenderL"


    // $ANTLR start "ruleSenderL"
    // InternalMyDsl.g:2132:1: ruleSenderL returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSenderL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2138:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:2139:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2139:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:2140:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSenderLAccess().getFromKeyword_0());
            		
            // InternalMyDsl.g:2144:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:2145:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:2145:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:2146:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSenderLRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSenderLAccess().getRoleRoleCrossReference_1_0());
            				

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
    // $ANTLR end "ruleSenderL"


    // $ANTLR start "entryRuleReceiverL"
    // InternalMyDsl.g:2161:1: entryRuleReceiverL returns [EObject current=null] : iv_ruleReceiverL= ruleReceiverL EOF ;
    public final EObject entryRuleReceiverL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverL = null;


        try {
            // InternalMyDsl.g:2161:50: (iv_ruleReceiverL= ruleReceiverL EOF )
            // InternalMyDsl.g:2162:2: iv_ruleReceiverL= ruleReceiverL EOF
            {
             newCompositeNode(grammarAccess.getReceiverLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReceiverL=ruleReceiverL();

            state._fsp--;

             current =iv_ruleReceiverL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReceiverL"


    // $ANTLR start "ruleReceiverL"
    // InternalMyDsl.g:2168:1: ruleReceiverL returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReceiverL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2174:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:2175:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2175:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:2176:3: otherlv_0= 'to' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiverLAccess().getToKeyword_0());
            		
            // InternalMyDsl.g:2180:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:2181:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:2181:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:2182:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReceiverLRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getReceiverLAccess().getRoleRoleCrossReference_1_0());
            				

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
    // $ANTLR end "ruleReceiverL"


    // $ANTLR start "entryRuleChoiceL"
    // InternalMyDsl.g:2197:1: entryRuleChoiceL returns [EObject current=null] : iv_ruleChoiceL= ruleChoiceL EOF ;
    public final EObject entryRuleChoiceL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceL = null;


        try {
            // InternalMyDsl.g:2197:48: (iv_ruleChoiceL= ruleChoiceL EOF )
            // InternalMyDsl.g:2198:2: iv_ruleChoiceL= ruleChoiceL EOF
            {
             newCompositeNode(grammarAccess.getChoiceLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoiceL=ruleChoiceL();

            state._fsp--;

             current =iv_ruleChoiceL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoiceL"


    // $ANTLR start "ruleChoiceL"
    // InternalMyDsl.g:2204:1: ruleChoiceL returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessageL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )* ) ;
    public final EObject ruleChoiceL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_branches_4_0 = null;

        EObject lv_branches_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2210:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessageL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )* ) )
            // InternalMyDsl.g:2211:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessageL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )* )
            {
            // InternalMyDsl.g:2211:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessageL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )* )
            // InternalMyDsl.g:2212:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessageL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceLAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceLAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:2220:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:2221:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:2221:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:2222:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceLRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2237:3: ( (lv_branches_4_0= ruleMessageL ) )
            // InternalMyDsl.g:2238:4: (lv_branches_4_0= ruleMessageL )
            {
            // InternalMyDsl.g:2238:4: (lv_branches_4_0= ruleMessageL )
            // InternalMyDsl.g:2239:5: lv_branches_4_0= ruleMessageL
            {

            					newCompositeNode(grammarAccess.getChoiceLAccess().getBranchesMessageLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_branches_4_0=ruleMessageL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceLRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_4_0,
            						"org.xtext.globalTypes.MyDsl.MessageL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:2260:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2261:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,35,FOLLOW_18); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoiceLAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,27,FOLLOW_25); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalMyDsl.g:2269:4: ( (lv_branches_8_0= ruleMessageL ) )
            	    // InternalMyDsl.g:2270:5: (lv_branches_8_0= ruleMessageL )
            	    {
            	    // InternalMyDsl.g:2270:5: (lv_branches_8_0= ruleMessageL )
            	    // InternalMyDsl.g:2271:6: lv_branches_8_0= ruleMessageL
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceLAccess().getBranchesMessageLParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_branches_8_0=ruleMessageL();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_8_0,
            	    							"org.xtext.globalTypes.MyDsl.MessageL");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,15,FOLLOW_26); 

            	    				newLeafNode(otherlv_9, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleChoiceL"


    // $ANTLR start "entryRuleForEachL"
    // InternalMyDsl.g:2297:1: entryRuleForEachL returns [EObject current=null] : iv_ruleForEachL= ruleForEachL EOF ;
    public final EObject entryRuleForEachL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachL = null;


        try {
            // InternalMyDsl.g:2297:49: (iv_ruleForEachL= ruleForEachL EOF )
            // InternalMyDsl.g:2298:2: iv_ruleForEachL= ruleForEachL EOF
            {
             newCompositeNode(grammarAccess.getForEachLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEachL=ruleForEachL();

            state._fsp--;

             current =iv_ruleForEachL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForEachL"


    // $ANTLR start "ruleForEachL"
    // InternalMyDsl.g:2304:1: ruleForEachL returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocolL ) ) ) ;
    public final EObject ruleForEachL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_eachRole_1_0 = null;

        EObject lv_branch_9_0 = null;

        EObject lv_protocol_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2310:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocolL ) ) ) )
            // InternalMyDsl.g:2311:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocolL ) ) )
            {
            // InternalMyDsl.g:2311:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocolL ) ) )
            // InternalMyDsl.g:2312:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocolL ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachLAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:2316:3: ( (lv_eachRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:2317:4: (lv_eachRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:2317:4: (lv_eachRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:2318:5: lv_eachRole_1_0= ruleRoleOne
            {

            					newCompositeNode(grammarAccess.getForEachLAccess().getEachRoleRoleOneParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_eachRole_1_0=ruleRoleOne();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachLRule());
            					}
            					set(
            						current,
            						"eachRole",
            						lv_eachRole_1_0,
            						"org.xtext.globalTypes.MyDsl.RoleOne");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachLAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getForEachLAccess().getLessThanSignKeyword_3());
            		
            // InternalMyDsl.g:2343:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:2344:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:2344:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:2345:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachLRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_4, grammarAccess.getForEachLAccess().getRolesetRoleSetCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getForEachLAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:2360:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:2361:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:2361:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:2362:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachLRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_6, grammarAccess.getForEachLAccess().getRefroleRoleOneCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getForEachLAccess().getGreaterThanSignKeyword_7());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_34); 

            			newLeafNode(otherlv_8, grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:2381:3: ( (lv_branch_9_0= ruleProtocolL ) )
            // InternalMyDsl.g:2382:4: (lv_branch_9_0= ruleProtocolL )
            {
            // InternalMyDsl.g:2382:4: (lv_branch_9_0= ruleProtocolL )
            // InternalMyDsl.g:2383:5: lv_branch_9_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getForEachLAccess().getBranchProtocolLParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_branch_9_0=ruleProtocolL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachLRule());
            					}
            					set(
            						current,
            						"branch",
            						lv_branch_9_0,
            						"org.xtext.globalTypes.MyDsl.ProtocolL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getForEachLAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_34); 

            			newLeafNode(otherlv_11, grammarAccess.getForEachLAccess().getSemicolonKeyword_11());
            		
            // InternalMyDsl.g:2408:3: ( (lv_protocol_12_0= ruleProtocolL ) )
            // InternalMyDsl.g:2409:4: (lv_protocol_12_0= ruleProtocolL )
            {
            // InternalMyDsl.g:2409:4: (lv_protocol_12_0= ruleProtocolL )
            // InternalMyDsl.g:2410:5: lv_protocol_12_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getForEachLAccess().getProtocolProtocolLParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_protocol_12_0=ruleProtocolL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachLRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_12_0,
            						"org.xtext.globalTypes.MyDsl.ProtocolL");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleForEachL"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:2431:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:2431:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:2432:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:2438:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'text' | kw= 'aid' | kw= 'float' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2444:2: ( (kw= 'int' | kw= 'text' | kw= 'aid' | kw= 'float' ) )
            // InternalMyDsl.g:2445:2: (kw= 'int' | kw= 'text' | kw= 'aid' | kw= 'float' )
            {
            // InternalMyDsl.g:2445:2: (kw= 'int' | kw= 'text' | kw= 'aid' | kw= 'float' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt22=1;
                }
                break;
            case 43:
                {
                alt22=2;
                }
                break;
            case 44:
                {
                alt22=3;
                }
                break;
            case 45:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2446:3: kw= 'int'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2452:3: kw= 'text'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2458:3: kw= 'aid'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getAidKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2464:3: kw= 'float'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getFloatKeyword_3());
                    		

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010000130800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000236200010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00003C0000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020236200010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000006000000000L});

}