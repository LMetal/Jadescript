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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'roleset'", "':'", "'End'", "'rec'", "'{'", "'loop'", "'for'", "'<'", "'>'", "';'", "'choice'", "'at'", "'or'", "')'", "'from'", "'to'", "'.'", "'local'", "'foreach'", "'int'", "'string'", "'action'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_protocol_0_0= ruleGlobalProtocol ) ) | ( (lv_protocol_1_0= ruleLocalProtocol ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_protocol_0_0 = null;

        EObject lv_protocol_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_protocol_0_0= ruleGlobalProtocol ) ) | ( (lv_protocol_1_0= ruleLocalProtocol ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_protocol_0_0= ruleGlobalProtocol ) ) | ( (lv_protocol_1_0= ruleLocalProtocol ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_protocol_0_0= ruleGlobalProtocol ) ) | ( (lv_protocol_1_0= ruleLocalProtocol ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:79:3: ( (lv_protocol_0_0= ruleGlobalProtocol ) )
                    {
                    // InternalMyDsl.g:79:3: ( (lv_protocol_0_0= ruleGlobalProtocol ) )
                    // InternalMyDsl.g:80:4: (lv_protocol_0_0= ruleGlobalProtocol )
                    {
                    // InternalMyDsl.g:80:4: (lv_protocol_0_0= ruleGlobalProtocol )
                    // InternalMyDsl.g:81:5: lv_protocol_0_0= ruleGlobalProtocol
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getProtocolGlobalProtocolParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_protocol_0_0=ruleGlobalProtocol();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"protocol",
                    						lv_protocol_0_0,
                    						"org.xtext.globalTypes.MyDsl.GlobalProtocol");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:99:3: ( (lv_protocol_1_0= ruleLocalProtocol ) )
                    {
                    // InternalMyDsl.g:99:3: ( (lv_protocol_1_0= ruleLocalProtocol ) )
                    // InternalMyDsl.g:100:4: (lv_protocol_1_0= ruleLocalProtocol )
                    {
                    // InternalMyDsl.g:100:4: (lv_protocol_1_0= ruleLocalProtocol )
                    // InternalMyDsl.g:101:5: lv_protocol_1_0= ruleLocalProtocol
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getProtocolLocalProtocolParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_protocol_1_0=ruleLocalProtocol();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"protocol",
                    						lv_protocol_1_0,
                    						"org.xtext.globalTypes.MyDsl.LocalProtocol");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGlobalProtocol"
    // InternalMyDsl.g:122:1: entryRuleGlobalProtocol returns [EObject current=null] : iv_ruleGlobalProtocol= ruleGlobalProtocol EOF ;
    public final EObject entryRuleGlobalProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalProtocol = null;


        try {
            // InternalMyDsl.g:122:55: (iv_ruleGlobalProtocol= ruleGlobalProtocol EOF )
            // InternalMyDsl.g:123:2: iv_ruleGlobalProtocol= ruleGlobalProtocol EOF
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
    // InternalMyDsl.g:129:1: ruleGlobalProtocol returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:135:2: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:136:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:136:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' )
            // InternalMyDsl.g:137:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalProtocolAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:145:3: ( (lv_protocolName_2_0= RULE_ID ) )
            // InternalMyDsl.g:146:4: (lv_protocolName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:146:4: (lv_protocolName_2_0= RULE_ID )
            // InternalMyDsl.g:147:5: lv_protocolName_2_0= RULE_ID
            {
            lv_protocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalProtocolAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:167:3: ( (lv_roles_4_0= ruleRoles ) )
            // InternalMyDsl.g:168:4: (lv_roles_4_0= ruleRoles )
            {
            // InternalMyDsl.g:168:4: (lv_roles_4_0= ruleRoles )
            // InternalMyDsl.g:169:5: lv_roles_4_0= ruleRoles
            {

            					newCompositeNode(grammarAccess.getGlobalProtocolAccess().getRolesRolesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getGlobalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:190:3: ( (lv_protocol_6_0= ruleProtocol ) )
            // InternalMyDsl.g:191:4: (lv_protocol_6_0= ruleProtocol )
            {
            // InternalMyDsl.g:191:4: (lv_protocol_6_0= ruleProtocol )
            // InternalMyDsl.g:192:5: lv_protocol_6_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getGlobalProtocolAccess().getProtocolProtocolParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
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


    // $ANTLR start "entryRuleRoles"
    // InternalMyDsl.g:217:1: entryRuleRoles returns [EObject current=null] : iv_ruleRoles= ruleRoles EOF ;
    public final EObject entryRuleRoles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoles = null;


        try {
            // InternalMyDsl.g:217:46: (iv_ruleRoles= ruleRoles EOF )
            // InternalMyDsl.g:218:2: iv_ruleRoles= ruleRoles EOF
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
    // InternalMyDsl.g:224:1: ruleRoles returns [EObject current=null] : ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* ) ;
    public final EObject ruleRoles() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_roles_0_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:230:2: ( ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* ) )
            // InternalMyDsl.g:231:2: ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* )
            {
            // InternalMyDsl.g:231:2: ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* )
            // InternalMyDsl.g:232:3: ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )*
            {
            // InternalMyDsl.g:232:3: ( (lv_roles_0_0= ruleRole ) )
            // InternalMyDsl.g:233:4: (lv_roles_0_0= ruleRole )
            {
            // InternalMyDsl.g:233:4: (lv_roles_0_0= ruleRole )
            // InternalMyDsl.g:234:5: lv_roles_0_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalMyDsl.g:251:3: (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:252:4: otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRolesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:256:4: ( (lv_roles_2_0= ruleRole ) )
            	    // InternalMyDsl.g:257:5: (lv_roles_2_0= ruleRole )
            	    {
            	    // InternalMyDsl.g:257:5: (lv_roles_2_0= ruleRole )
            	    // InternalMyDsl.g:258:6: lv_roles_2_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
            	    break loop2;
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
    // InternalMyDsl.g:280:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalMyDsl.g:280:45: (iv_ruleRole= ruleRole EOF )
            // InternalMyDsl.g:281:2: iv_ruleRole= ruleRole EOF
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
    // InternalMyDsl.g:287:1: ruleRole returns [EObject current=null] : (this_RoleOne_0= ruleRoleOne | this_RoleSet_1= ruleRoleSet ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_RoleOne_0 = null;

        EObject this_RoleSet_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:293:2: ( (this_RoleOne_0= ruleRoleOne | this_RoleSet_1= ruleRoleSet ) )
            // InternalMyDsl.g:294:2: (this_RoleOne_0= ruleRoleOne | this_RoleSet_1= ruleRoleSet )
            {
            // InternalMyDsl.g:294:2: (this_RoleOne_0= ruleRoleOne | this_RoleSet_1= ruleRoleSet )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:295:3: this_RoleOne_0= ruleRoleOne
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
                    // InternalMyDsl.g:304:3: this_RoleSet_1= ruleRoleSet
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
    // InternalMyDsl.g:316:1: entryRuleRoleOne returns [EObject current=null] : iv_ruleRoleOne= ruleRoleOne EOF ;
    public final EObject entryRuleRoleOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleOne = null;


        try {
            // InternalMyDsl.g:316:48: (iv_ruleRoleOne= ruleRoleOne EOF )
            // InternalMyDsl.g:317:2: iv_ruleRoleOne= ruleRoleOne EOF
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
    // InternalMyDsl.g:323:1: ruleRoleOne returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRoleOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:329:2: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:330:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:330:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:331:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleOneAccess().getRoleKeyword_0());
            		
            // InternalMyDsl.g:335:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:336:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:336:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:337:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:357:1: entryRuleRoleSet returns [EObject current=null] : iv_ruleRoleSet= ruleRoleSet EOF ;
    public final EObject entryRuleRoleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleSet = null;


        try {
            // InternalMyDsl.g:357:48: (iv_ruleRoleSet= ruleRoleSet EOF )
            // InternalMyDsl.g:358:2: iv_ruleRoleSet= ruleRoleSet EOF
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
    // InternalMyDsl.g:364:1: ruleRoleSet returns [EObject current=null] : (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleRoleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:370:2: ( (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMyDsl.g:371:2: (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMyDsl.g:371:2: (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalMyDsl.g:372:3: otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleSetAccess().getRolesetKeyword_0());
            		
            // InternalMyDsl.g:376:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:377:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:377:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:378:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleSetAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:398:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:399:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:399:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:400:5: otherlv_3= RULE_ID
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
    // InternalMyDsl.g:415:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalMyDsl.g:415:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalMyDsl.g:416:2: iv_ruleProtocol= ruleProtocol EOF
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
    // InternalMyDsl.g:422:1: ruleProtocol returns [EObject current=null] : ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ( (lv_doesEnd_2_0= 'End' ) )? ) | ( (lv_actions_3_0= ruleCloseRecursion ) ) ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token lv_doesEnd_2_0=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:428:2: ( ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ( (lv_doesEnd_2_0= 'End' ) )? ) | ( (lv_actions_3_0= ruleCloseRecursion ) ) ) )
            // InternalMyDsl.g:429:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ( (lv_doesEnd_2_0= 'End' ) )? ) | ( (lv_actions_3_0= ruleCloseRecursion ) ) )
            {
            // InternalMyDsl.g:429:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ( (lv_doesEnd_2_0= 'End' ) )? ) | ( (lv_actions_3_0= ruleCloseRecursion ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||LA7_0==RULE_ID||LA7_0==15||(LA7_0>=20 && LA7_0<=21)||LA7_0==24||LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:430:3: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ( (lv_doesEnd_2_0= 'End' ) )? )
                    {
                    // InternalMyDsl.g:430:3: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ( (lv_doesEnd_2_0= 'End' ) )? )
                    // InternalMyDsl.g:431:4: () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ( (lv_doesEnd_2_0= 'End' ) )?
                    {
                    // InternalMyDsl.g:431:4: ()
                    // InternalMyDsl.g:432:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getProtocolAccess().getProtocolAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:438:4: ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID||LA5_0==21||LA5_0==24||LA5_0==28) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:439:5: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) )
                    	    {
                    	    // InternalMyDsl.g:439:5: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) )
                    	    // InternalMyDsl.g:440:6: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach )
                    	    {
                    	    // InternalMyDsl.g:440:6: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach )
                    	    int alt4=4;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_ID:
                    	        {
                    	        alt4=1;
                    	        }
                    	        break;
                    	    case 28:
                    	        {
                    	        alt4=2;
                    	        }
                    	        break;
                    	    case 21:
                    	        {
                    	        alt4=3;
                    	        }
                    	        break;
                    	    case 24:
                    	        {
                    	        alt4=4;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 4, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt4) {
                    	        case 1 :
                    	            // InternalMyDsl.g:441:7: lv_actions_1_1= ruleMessage
                    	            {

                    	            							newCompositeNode(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_0_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_12);
                    	            lv_actions_1_1=ruleMessage();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getProtocolRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"actions",
                    	            								lv_actions_1_1,
                    	            								"org.xtext.globalTypes.MyDsl.Message");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDsl.g:457:7: lv_actions_1_2= ruleChoice
                    	            {

                    	            							newCompositeNode(grammarAccess.getProtocolAccess().getActionsChoiceParserRuleCall_0_1_0_1());
                    	            						
                    	            pushFollow(FOLLOW_12);
                    	            lv_actions_1_2=ruleChoice();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getProtocolRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"actions",
                    	            								lv_actions_1_2,
                    	            								"org.xtext.globalTypes.MyDsl.Choice");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalMyDsl.g:473:7: lv_actions_1_3= ruleRecursion
                    	            {

                    	            							newCompositeNode(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_0_1_0_2());
                    	            						
                    	            pushFollow(FOLLOW_12);
                    	            lv_actions_1_3=ruleRecursion();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getProtocolRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"actions",
                    	            								lv_actions_1_3,
                    	            								"org.xtext.globalTypes.MyDsl.Recursion");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 4 :
                    	            // InternalMyDsl.g:489:7: lv_actions_1_4= ruleForEach
                    	            {

                    	            							newCompositeNode(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_0_1_0_3());
                    	            						
                    	            pushFollow(FOLLOW_12);
                    	            lv_actions_1_4=ruleForEach();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getProtocolRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"actions",
                    	            								lv_actions_1_4,
                    	            								"org.xtext.globalTypes.MyDsl.ForEach");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalMyDsl.g:507:4: ( (lv_doesEnd_2_0= 'End' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==20) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:508:5: (lv_doesEnd_2_0= 'End' )
                            {
                            // InternalMyDsl.g:508:5: (lv_doesEnd_2_0= 'End' )
                            // InternalMyDsl.g:509:6: lv_doesEnd_2_0= 'End'
                            {
                            lv_doesEnd_2_0=(Token)match(input,20,FOLLOW_2); 

                            						newLeafNode(lv_doesEnd_2_0, grammarAccess.getProtocolAccess().getDoesEndEndKeyword_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getProtocolRule());
                            						}
                            						setWithLastConsumed(current, "doesEnd", lv_doesEnd_2_0, "End");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:523:3: ( (lv_actions_3_0= ruleCloseRecursion ) )
                    {
                    // InternalMyDsl.g:523:3: ( (lv_actions_3_0= ruleCloseRecursion ) )
                    // InternalMyDsl.g:524:4: (lv_actions_3_0= ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:524:4: (lv_actions_3_0= ruleCloseRecursion )
                    // InternalMyDsl.g:525:5: lv_actions_3_0= ruleCloseRecursion
                    {

                    					newCompositeNode(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actions_3_0=ruleCloseRecursion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolRule());
                    					}
                    					add(
                    						current,
                    						"actions",
                    						lv_actions_3_0,
                    						"org.xtext.globalTypes.MyDsl.CloseRecursion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleRecursion"
    // InternalMyDsl.g:546:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalMyDsl.g:546:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalMyDsl.g:547:2: iv_ruleRecursion= ruleRecursion EOF
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
    // InternalMyDsl.g:553:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:559:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:560:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:560:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' )
            // InternalMyDsl.g:561:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:565:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:566:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:566:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:567:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRecursionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRecursionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:591:3: ( (lv_recProtocol_4_0= ruleProtocol ) )
            // InternalMyDsl.g:592:4: (lv_recProtocol_4_0= ruleProtocol )
            {
            // InternalMyDsl.g:592:4: (lv_recProtocol_4_0= ruleProtocol )
            // InternalMyDsl.g:593:5: lv_recProtocol_4_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getRecursionAccess().getRecProtocolProtocolParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:618:1: entryRuleCloseRecursion returns [EObject current=null] : iv_ruleCloseRecursion= ruleCloseRecursion EOF ;
    public final EObject entryRuleCloseRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursion = null;


        try {
            // InternalMyDsl.g:618:55: (iv_ruleCloseRecursion= ruleCloseRecursion EOF )
            // InternalMyDsl.g:619:2: iv_ruleCloseRecursion= ruleCloseRecursion EOF
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
    // InternalMyDsl.g:625:1: ruleCloseRecursion returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCloseRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:631:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:632:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:632:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:633:3: otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:637:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:638:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:638:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:639:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:654:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalMyDsl.g:654:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalMyDsl.g:655:2: iv_ruleForEach= ruleForEach EOF
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
    // InternalMyDsl.g:661:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ) ;
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

        EObject lv_branch_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:667:2: ( (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ) )
            // InternalMyDsl.g:668:2: (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalMyDsl.g:668:2: (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' )
            // InternalMyDsl.g:669:3: otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForKeyword_0());
            		
            // InternalMyDsl.g:673:3: ( (lv_loopRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:674:4: (lv_loopRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:674:4: (lv_loopRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:675:5: lv_loopRole_1_0= ruleRoleOne
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getLoopRoleRoleOneParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getLessThanSignKeyword_3());
            		
            // InternalMyDsl.g:700:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:701:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:701:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:702:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getRolesetRoleSetCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getForEachAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:717:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:718:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:718:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:719:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_6, grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getForEachAccess().getGreaterThanSignKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:738:3: ( (lv_branch_9_0= ruleProtocol ) )
            // InternalMyDsl.g:739:4: (lv_branch_9_0= ruleProtocol )
            {
            // InternalMyDsl.g:739:4: (lv_branch_9_0= ruleProtocol )
            // InternalMyDsl.g:740:5: lv_branch_9_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_branch_9_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"branch",
            						lv_branch_9_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getForEachAccess().getSemicolonKeyword_11());
            		

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
    // InternalMyDsl.g:769:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalMyDsl.g:769:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalMyDsl.g:770:2: iv_ruleChoice= ruleChoice EOF
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
    // InternalMyDsl.g:776:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranch ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )* ) ;
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
            // InternalMyDsl.g:782:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranch ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )* ) )
            // InternalMyDsl.g:783:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranch ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )* )
            {
            // InternalMyDsl.g:783:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranch ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )* )
            // InternalMyDsl.g:784:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranch ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:792:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:793:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:793:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:794:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:809:3: ( (lv_branches_4_0= ruleChoiceBranch ) )
            // InternalMyDsl.g:810:4: (lv_branches_4_0= ruleChoiceBranch )
            {
            // InternalMyDsl.g:810:4: (lv_branches_4_0= ruleChoiceBranch )
            // InternalMyDsl.g:811:5: lv_branches_4_0= ruleChoiceBranch
            {

            					newCompositeNode(grammarAccess.getChoiceAccess().getBranchesChoiceBranchParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_branches_4_0=ruleChoiceBranch();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_4_0,
            						"org.xtext.globalTypes.MyDsl.ChoiceBranch");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:832:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:833:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,30,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,22,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalMyDsl.g:841:4: ( (lv_branches_8_0= ruleChoiceBranch ) )
            	    // InternalMyDsl.g:842:5: (lv_branches_8_0= ruleChoiceBranch )
            	    {
            	    // InternalMyDsl.g:842:5: (lv_branches_8_0= ruleChoiceBranch )
            	    // InternalMyDsl.g:843:6: lv_branches_8_0= ruleChoiceBranch
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceAccess().getBranchesChoiceBranchParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_branches_8_0=ruleChoiceBranch();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_8_0,
            	    							"org.xtext.globalTypes.MyDsl.ChoiceBranch");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,15,FOLLOW_20); 

            	    				newLeafNode(otherlv_9, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "entryRuleChoiceBranch"
    // InternalMyDsl.g:869:1: entryRuleChoiceBranch returns [EObject current=null] : iv_ruleChoiceBranch= ruleChoiceBranch EOF ;
    public final EObject entryRuleChoiceBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceBranch = null;


        try {
            // InternalMyDsl.g:869:53: (iv_ruleChoiceBranch= ruleChoiceBranch EOF )
            // InternalMyDsl.g:870:2: iv_ruleChoiceBranch= ruleChoiceBranch EOF
            {
             newCompositeNode(grammarAccess.getChoiceBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoiceBranch=ruleChoiceBranch();

            state._fsp--;

             current =iv_ruleChoiceBranch; 
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
    // $ANTLR end "entryRuleChoiceBranch"


    // $ANTLR start "ruleChoiceBranch"
    // InternalMyDsl.g:876:1: ruleChoiceBranch returns [EObject current=null] : ( ( (lv_message_0_0= ruleMessage ) ) ( (lv_protocol_1_0= ruleProtocol ) ) ) ;
    public final EObject ruleChoiceBranch() throws RecognitionException {
        EObject current = null;

        EObject lv_message_0_0 = null;

        EObject lv_protocol_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:882:2: ( ( ( (lv_message_0_0= ruleMessage ) ) ( (lv_protocol_1_0= ruleProtocol ) ) ) )
            // InternalMyDsl.g:883:2: ( ( (lv_message_0_0= ruleMessage ) ) ( (lv_protocol_1_0= ruleProtocol ) ) )
            {
            // InternalMyDsl.g:883:2: ( ( (lv_message_0_0= ruleMessage ) ) ( (lv_protocol_1_0= ruleProtocol ) ) )
            // InternalMyDsl.g:884:3: ( (lv_message_0_0= ruleMessage ) ) ( (lv_protocol_1_0= ruleProtocol ) )
            {
            // InternalMyDsl.g:884:3: ( (lv_message_0_0= ruleMessage ) )
            // InternalMyDsl.g:885:4: (lv_message_0_0= ruleMessage )
            {
            // InternalMyDsl.g:885:4: (lv_message_0_0= ruleMessage )
            // InternalMyDsl.g:886:5: lv_message_0_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getChoiceBranchAccess().getMessageMessageParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_message_0_0=ruleMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceBranchRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_0_0,
            						"org.xtext.globalTypes.MyDsl.Message");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:903:3: ( (lv_protocol_1_0= ruleProtocol ) )
            // InternalMyDsl.g:904:4: (lv_protocol_1_0= ruleProtocol )
            {
            // InternalMyDsl.g:904:4: (lv_protocol_1_0= ruleProtocol )
            // InternalMyDsl.g:905:5: lv_protocol_1_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getChoiceBranchAccess().getProtocolProtocolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_protocol_1_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceBranchRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_1_0,
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
    // $ANTLR end "ruleChoiceBranch"


    // $ANTLR start "entryRuleMessage"
    // InternalMyDsl.g:926:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:926:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:927:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:933:1: ruleMessage returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_messageType_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_payload_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:939:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) )
            // InternalMyDsl.g:940:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
            {
            // InternalMyDsl.g:940:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
            // InternalMyDsl.g:941:3: ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.'
            {
            // InternalMyDsl.g:941:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:942:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:942:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:943:5: lv_messageType_0_0= RULE_ID
            {
            lv_messageType_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_messageType_0_0, grammarAccess.getMessageAccess().getMessageTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"messageType",
            						lv_messageType_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:963:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=37 && LA9_0<=39)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:964:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:964:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:965:5: lv_payload_2_0= rulePayload
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getPayloadPayloadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_payload_2_0=rulePayload();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageRule());
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

            otherlv_3=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getFromKeyword_4());
            		
            // InternalMyDsl.g:990:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:991:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:991:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:992:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getToKeyword_6());
            		
            // InternalMyDsl.g:1007:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:1008:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:1008:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:1009:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getReceiverRoleCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getFullStopKeyword_8());
            		

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


    // $ANTLR start "entryRulePayload"
    // InternalMyDsl.g:1028:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalMyDsl.g:1028:48: (iv_rulePayload= rulePayload EOF )
            // InternalMyDsl.g:1029:2: iv_rulePayload= rulePayload EOF
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
    // InternalMyDsl.g:1035:1: rulePayload returns [EObject current=null] : ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_types_4_0=null;
        AntlrDatatypeRuleToken lv_types_1_0 = null;

        AntlrDatatypeRuleToken lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1041:2: ( ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1042:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1042:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=37 && LA11_0<=39)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1043:3: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
                    {
                    // InternalMyDsl.g:1043:3: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
                    // InternalMyDsl.g:1044:4: () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
                    {
                    // InternalMyDsl.g:1044:4: ()
                    // InternalMyDsl.g:1045:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPayloadAccess().getPayloadAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1051:4: ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
                    // InternalMyDsl.g:1052:5: ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
                    {
                    // InternalMyDsl.g:1052:5: ( (lv_types_1_0= ruleType ) )
                    // InternalMyDsl.g:1053:6: (lv_types_1_0= ruleType )
                    {
                    // InternalMyDsl.g:1053:6: (lv_types_1_0= ruleType )
                    // InternalMyDsl.g:1054:7: lv_types_1_0= ruleType
                    {

                    							newCompositeNode(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_0_1_0_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_types_1_0=ruleType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPayloadRule());
                    							}
                    							add(
                    								current,
                    								"types",
                    								lv_types_1_0,
                    								"org.xtext.globalTypes.MyDsl.Type");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:1071:5: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:1072:6: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_27); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getPayloadAccess().getCommaKeyword_0_1_1_0());
                    	    					
                    	    // InternalMyDsl.g:1076:6: ( (lv_types_3_0= ruleType ) )
                    	    // InternalMyDsl.g:1077:7: (lv_types_3_0= ruleType )
                    	    {
                    	    // InternalMyDsl.g:1077:7: (lv_types_3_0= ruleType )
                    	    // InternalMyDsl.g:1078:8: lv_types_3_0= ruleType
                    	    {

                    	    								newCompositeNode(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_0_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
                    	    lv_types_3_0=ruleType();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPayloadRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"types",
                    	    									lv_types_3_0,
                    	    									"org.xtext.globalTypes.MyDsl.Type");
                    	    								afterParserOrEnumRuleCall();
                    	    							

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


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1099:3: ( (lv_types_4_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1099:3: ( (lv_types_4_0= RULE_ID ) )
                    // InternalMyDsl.g:1100:4: (lv_types_4_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1100:4: (lv_types_4_0= RULE_ID )
                    // InternalMyDsl.g:1101:5: lv_types_4_0= RULE_ID
                    {
                    lv_types_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_types_4_0, grammarAccess.getPayloadAccess().getTypesIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPayloadRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"types",
                    						lv_types_4_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


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
    // $ANTLR end "rulePayload"


    // $ANTLR start "entryRuleLocalProtocol"
    // InternalMyDsl.g:1121:1: entryRuleLocalProtocol returns [EObject current=null] : iv_ruleLocalProtocol= ruleLocalProtocol EOF ;
    public final EObject entryRuleLocalProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalProtocol = null;


        try {
            // InternalMyDsl.g:1121:54: (iv_ruleLocalProtocol= ruleLocalProtocol EOF )
            // InternalMyDsl.g:1122:2: iv_ruleLocalProtocol= ruleLocalProtocol EOF
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
    // InternalMyDsl.g:1128:1: ruleLocalProtocol returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' ) ;
    public final EObject ruleLocalProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_protocolName_2_0=null;
        Token otherlv_3=null;
        Token lv_projectedRole_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_roles_6_0 = null;

        EObject lv_protocol_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1134:2: ( (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1135:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1135:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1136:3: otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalProtocolAccess().getLocalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:1144:3: ( (lv_protocolName_2_0= RULE_ID ) )
            // InternalMyDsl.g:1145:4: (lv_protocolName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1145:4: (lv_protocolName_2_0= RULE_ID )
            // InternalMyDsl.g:1146:5: lv_protocolName_2_0= RULE_ID
            {
            lv_protocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalProtocolAccess().getAtKeyword_3());
            		
            // InternalMyDsl.g:1166:3: ( (lv_projectedRole_4_0= RULE_ID ) )
            // InternalMyDsl.g:1167:4: (lv_projectedRole_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1167:4: (lv_projectedRole_4_0= RULE_ID )
            // InternalMyDsl.g:1168:5: lv_projectedRole_4_0= RULE_ID
            {
            lv_projectedRole_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_projectedRole_4_0, grammarAccess.getLocalProtocolAccess().getProjectedRoleIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalProtocolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"projectedRole",
            						lv_projectedRole_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_5());
            		
            // InternalMyDsl.g:1188:3: ( (lv_roles_6_0= ruleRoles ) )
            // InternalMyDsl.g:1189:4: (lv_roles_6_0= ruleRoles )
            {
            // InternalMyDsl.g:1189:4: (lv_roles_6_0= ruleRoles )
            // InternalMyDsl.g:1190:5: lv_roles_6_0= ruleRoles
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getRolesRolesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_7=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1215:3: ( (lv_protocol_9_0= ruleProtocolL ) )
            // InternalMyDsl.g:1216:4: (lv_protocol_9_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1216:4: (lv_protocol_9_0= ruleProtocolL )
            // InternalMyDsl.g:1217:5: lv_protocol_9_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_protocol_9_0=ruleProtocolL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalProtocolRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_9_0,
            						"org.xtext.globalTypes.MyDsl.ProtocolL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalMyDsl.g:1242:1: entryRuleProtocolL returns [EObject current=null] : iv_ruleProtocolL= ruleProtocolL EOF ;
    public final EObject entryRuleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolL = null;


        try {
            // InternalMyDsl.g:1242:50: (iv_ruleProtocolL= ruleProtocolL EOF )
            // InternalMyDsl.g:1243:2: iv_ruleProtocolL= ruleProtocolL EOF
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
    // InternalMyDsl.g:1249:1: ruleProtocolL returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )* (otherlv_2= 'End' )? ) ;
    public final EObject ruleProtocolL() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_1_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1255:2: ( ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )* (otherlv_2= 'End' )? ) )
            // InternalMyDsl.g:1256:2: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )* (otherlv_2= 'End' )? )
            {
            // InternalMyDsl.g:1256:2: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )* (otherlv_2= 'End' )? )
            // InternalMyDsl.g:1257:3: () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )* (otherlv_2= 'End' )?
            {
            // InternalMyDsl.g:1257:3: ()
            // InternalMyDsl.g:1258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolLAccess().getProtocolLAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1264:3: ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==21||LA13_0==23||LA13_0==28||LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1265:4: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) )
            	    {
            	    // InternalMyDsl.g:1265:4: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) )
            	    // InternalMyDsl.g:1266:5: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion )
            	    {
            	    // InternalMyDsl.g:1266:5: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion )
            	    int alt12=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt12=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // InternalMyDsl.g:1267:6: lv_actions_1_1= ruleMessageL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsMessageLParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_29);
            	            lv_actions_1_1=ruleMessageL();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolLRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_1,
            	            							"org.xtext.globalTypes.MyDsl.MessageL");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1283:6: lv_actions_1_2= ruleChoiceL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsChoiceLParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_29);
            	            lv_actions_1_2=ruleChoiceL();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolLRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_2,
            	            							"org.xtext.globalTypes.MyDsl.ChoiceL");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:1299:6: lv_actions_1_3= ruleForEachL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsForEachLParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_29);
            	            lv_actions_1_3=ruleForEachL();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolLRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_3,
            	            							"org.xtext.globalTypes.MyDsl.ForEachL");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalMyDsl.g:1315:6: lv_actions_1_4= ruleRecursionL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsRecursionLParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_29);
            	            lv_actions_1_4=ruleRecursionL();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolLRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_4,
            	            							"org.xtext.globalTypes.MyDsl.RecursionL");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalMyDsl.g:1331:6: lv_actions_1_5= ruleCloseRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsCloseRecursionParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_29);
            	            lv_actions_1_5=ruleCloseRecursion();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolLRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_5,
            	            							"org.xtext.globalTypes.MyDsl.CloseRecursion");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalMyDsl.g:1349:3: (otherlv_2= 'End' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1350:4: otherlv_2= 'End'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getProtocolLAccess().getEndKeyword_2());
                    			

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
    // $ANTLR end "ruleProtocolL"


    // $ANTLR start "entryRuleRecursionL"
    // InternalMyDsl.g:1359:1: entryRuleRecursionL returns [EObject current=null] : iv_ruleRecursionL= ruleRecursionL EOF ;
    public final EObject entryRuleRecursionL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursionL = null;


        try {
            // InternalMyDsl.g:1359:51: (iv_ruleRecursionL= ruleRecursionL EOF )
            // InternalMyDsl.g:1360:2: iv_ruleRecursionL= ruleRecursionL EOF
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
    // InternalMyDsl.g:1366:1: ruleRecursionL returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:1372:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1373:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1373:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1374:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionLAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:1378:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1379:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1379:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1380:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRecursionLAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getRecursionLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1404:3: ( (lv_recProtocol_4_0= ruleProtocolL ) )
            // InternalMyDsl.g:1405:4: (lv_recProtocol_4_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1405:4: (lv_recProtocol_4_0= ruleProtocolL )
            // InternalMyDsl.g:1406:5: lv_recProtocol_4_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getRecursionLAccess().getRecProtocolProtocolLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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


    // $ANTLR start "entryRuleMessageL"
    // InternalMyDsl.g:1431:1: entryRuleMessageL returns [EObject current=null] : iv_ruleMessageL= ruleMessageL EOF ;
    public final EObject entryRuleMessageL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageL = null;


        try {
            // InternalMyDsl.g:1431:49: (iv_ruleMessageL= ruleMessageL EOF )
            // InternalMyDsl.g:1432:2: iv_ruleMessageL= ruleMessageL EOF
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
    // InternalMyDsl.g:1438:1: ruleMessageL returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_sendReceive_4_0= ruleMessageType ) ) otherlv_5= '.' ) ;
    public final EObject ruleMessageL() throws RecognitionException {
        EObject current = null;

        Token lv_messageType_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_payload_2_0 = null;

        EObject lv_sendReceive_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1444:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_sendReceive_4_0= ruleMessageType ) ) otherlv_5= '.' ) )
            // InternalMyDsl.g:1445:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_sendReceive_4_0= ruleMessageType ) ) otherlv_5= '.' )
            {
            // InternalMyDsl.g:1445:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_sendReceive_4_0= ruleMessageType ) ) otherlv_5= '.' )
            // InternalMyDsl.g:1446:3: ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_sendReceive_4_0= ruleMessageType ) ) otherlv_5= '.'
            {
            // InternalMyDsl.g:1446:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:1447:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1447:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:1448:5: lv_messageType_0_0= RULE_ID
            {
            lv_messageType_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_messageType_0_0, grammarAccess.getMessageLAccess().getMessageTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"messageType",
            						lv_messageType_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageLAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1468:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||(LA15_0>=37 && LA15_0<=39)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1469:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:1469:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:1470:5: lv_payload_2_0= rulePayload
                    {

                    					newCompositeNode(grammarAccess.getMessageLAccess().getPayloadPayloadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_payload_2_0=rulePayload();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageLRule());
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

            otherlv_3=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageLAccess().getRightParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1491:3: ( (lv_sendReceive_4_0= ruleMessageType ) )
            // InternalMyDsl.g:1492:4: (lv_sendReceive_4_0= ruleMessageType )
            {
            // InternalMyDsl.g:1492:4: (lv_sendReceive_4_0= ruleMessageType )
            // InternalMyDsl.g:1493:5: lv_sendReceive_4_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getMessageLAccess().getSendReceiveMessageTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_sendReceive_4_0=ruleMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageLRule());
            					}
            					set(
            						current,
            						"sendReceive",
            						lv_sendReceive_4_0,
            						"org.xtext.globalTypes.MyDsl.MessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMessageLAccess().getFullStopKeyword_5());
            		

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


    // $ANTLR start "entryRuleMessageType"
    // InternalMyDsl.g:1518:1: entryRuleMessageType returns [EObject current=null] : iv_ruleMessageType= ruleMessageType EOF ;
    public final EObject entryRuleMessageType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageType = null;


        try {
            // InternalMyDsl.g:1518:52: (iv_ruleMessageType= ruleMessageType EOF )
            // InternalMyDsl.g:1519:2: iv_ruleMessageType= ruleMessageType EOF
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
    // InternalMyDsl.g:1525:1: ruleMessageType returns [EObject current=null] : (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL ) ;
    public final EObject ruleMessageType() throws RecognitionException {
        EObject current = null;

        EObject this_SenderL_0 = null;

        EObject this_ReceiverL_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1531:2: ( (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL ) )
            // InternalMyDsl.g:1532:2: (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL )
            {
            // InternalMyDsl.g:1532:2: (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1533:3: this_SenderL_0= ruleSenderL
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
                    // InternalMyDsl.g:1542:3: this_ReceiverL_1= ruleReceiverL
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
    // InternalMyDsl.g:1554:1: entryRuleSenderL returns [EObject current=null] : iv_ruleSenderL= ruleSenderL EOF ;
    public final EObject entryRuleSenderL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenderL = null;


        try {
            // InternalMyDsl.g:1554:48: (iv_ruleSenderL= ruleSenderL EOF )
            // InternalMyDsl.g:1555:2: iv_ruleSenderL= ruleSenderL EOF
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
    // InternalMyDsl.g:1561:1: ruleSenderL returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSenderL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1567:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1568:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1568:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1569:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSenderLAccess().getFromKeyword_0());
            		
            // InternalMyDsl.g:1573:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1574:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1574:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1575:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:1590:1: entryRuleReceiverL returns [EObject current=null] : iv_ruleReceiverL= ruleReceiverL EOF ;
    public final EObject entryRuleReceiverL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverL = null;


        try {
            // InternalMyDsl.g:1590:50: (iv_ruleReceiverL= ruleReceiverL EOF )
            // InternalMyDsl.g:1591:2: iv_ruleReceiverL= ruleReceiverL EOF
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
    // InternalMyDsl.g:1597:1: ruleReceiverL returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReceiverL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1603:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1604:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1604:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1605:3: otherlv_0= 'to' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiverLAccess().getToKeyword_0());
            		
            // InternalMyDsl.g:1609:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1610:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1610:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1611:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:1626:1: entryRuleChoiceL returns [EObject current=null] : iv_ruleChoiceL= ruleChoiceL EOF ;
    public final EObject entryRuleChoiceL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceL = null;


        try {
            // InternalMyDsl.g:1626:48: (iv_ruleChoiceL= ruleChoiceL EOF )
            // InternalMyDsl.g:1627:2: iv_ruleChoiceL= ruleChoiceL EOF
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
    // InternalMyDsl.g:1633:1: ruleChoiceL returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* ) ;
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
            // InternalMyDsl.g:1639:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* ) )
            // InternalMyDsl.g:1640:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* )
            {
            // InternalMyDsl.g:1640:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* )
            // InternalMyDsl.g:1641:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceLAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceLAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:1649:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1650:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1650:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1651:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceLRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1666:3: ( (lv_branches_4_0= ruleChoiceBranchL ) )
            // InternalMyDsl.g:1667:4: (lv_branches_4_0= ruleChoiceBranchL )
            {
            // InternalMyDsl.g:1667:4: (lv_branches_4_0= ruleChoiceBranchL )
            // InternalMyDsl.g:1668:5: lv_branches_4_0= ruleChoiceBranchL
            {

            					newCompositeNode(grammarAccess.getChoiceLAccess().getBranchesChoiceBranchLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_branches_4_0=ruleChoiceBranchL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceLRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_4_0,
            						"org.xtext.globalTypes.MyDsl.ChoiceBranchL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1689:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1690:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,30,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoiceLAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,22,FOLLOW_31); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalMyDsl.g:1698:4: ( (lv_branches_8_0= ruleChoiceBranchL ) )
            	    // InternalMyDsl.g:1699:5: (lv_branches_8_0= ruleChoiceBranchL )
            	    {
            	    // InternalMyDsl.g:1699:5: (lv_branches_8_0= ruleChoiceBranchL )
            	    // InternalMyDsl.g:1700:6: lv_branches_8_0= ruleChoiceBranchL
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceLAccess().getBranchesChoiceBranchLParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_branches_8_0=ruleChoiceBranchL();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_8_0,
            	    							"org.xtext.globalTypes.MyDsl.ChoiceBranchL");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,15,FOLLOW_20); 

            	    				newLeafNode(otherlv_9, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
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


    // $ANTLR start "entryRuleChoiceBranchL"
    // InternalMyDsl.g:1726:1: entryRuleChoiceBranchL returns [EObject current=null] : iv_ruleChoiceBranchL= ruleChoiceBranchL EOF ;
    public final EObject entryRuleChoiceBranchL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceBranchL = null;


        try {
            // InternalMyDsl.g:1726:54: (iv_ruleChoiceBranchL= ruleChoiceBranchL EOF )
            // InternalMyDsl.g:1727:2: iv_ruleChoiceBranchL= ruleChoiceBranchL EOF
            {
             newCompositeNode(grammarAccess.getChoiceBranchLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoiceBranchL=ruleChoiceBranchL();

            state._fsp--;

             current =iv_ruleChoiceBranchL; 
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
    // $ANTLR end "entryRuleChoiceBranchL"


    // $ANTLR start "ruleChoiceBranchL"
    // InternalMyDsl.g:1733:1: ruleChoiceBranchL returns [EObject current=null] : ( ( () otherlv_1= 'End' ) | ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) ) ) ;
    public final EObject ruleChoiceBranchL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_message_2_0 = null;

        EObject lv_protocol_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1739:2: ( ( ( () otherlv_1= 'End' ) | ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) ) ) )
            // InternalMyDsl.g:1740:2: ( ( () otherlv_1= 'End' ) | ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) ) )
            {
            // InternalMyDsl.g:1740:2: ( ( () otherlv_1= 'End' ) | ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1741:3: ( () otherlv_1= 'End' )
                    {
                    // InternalMyDsl.g:1741:3: ( () otherlv_1= 'End' )
                    // InternalMyDsl.g:1742:4: () otherlv_1= 'End'
                    {
                    // InternalMyDsl.g:1742:4: ()
                    // InternalMyDsl.g:1743:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getChoiceBranchLAccess().getChoiceBranchLAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getChoiceBranchLAccess().getEndKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1755:3: ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) )
                    {
                    // InternalMyDsl.g:1755:3: ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) )
                    // InternalMyDsl.g:1756:4: ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) )
                    {
                    // InternalMyDsl.g:1756:4: ( (lv_message_2_0= ruleMessageL ) )
                    // InternalMyDsl.g:1757:5: (lv_message_2_0= ruleMessageL )
                    {
                    // InternalMyDsl.g:1757:5: (lv_message_2_0= ruleMessageL )
                    // InternalMyDsl.g:1758:6: lv_message_2_0= ruleMessageL
                    {

                    						newCompositeNode(grammarAccess.getChoiceBranchLAccess().getMessageMessageLParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_message_2_0=ruleMessageL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoiceBranchLRule());
                    						}
                    						set(
                    							current,
                    							"message",
                    							lv_message_2_0,
                    							"org.xtext.globalTypes.MyDsl.MessageL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1775:4: ( (lv_protocol_3_0= ruleProtocolL ) )
                    // InternalMyDsl.g:1776:5: (lv_protocol_3_0= ruleProtocolL )
                    {
                    // InternalMyDsl.g:1776:5: (lv_protocol_3_0= ruleProtocolL )
                    // InternalMyDsl.g:1777:6: lv_protocol_3_0= ruleProtocolL
                    {

                    						newCompositeNode(grammarAccess.getChoiceBranchLAccess().getProtocolProtocolLParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_protocol_3_0=ruleProtocolL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoiceBranchLRule());
                    						}
                    						set(
                    							current,
                    							"protocol",
                    							lv_protocol_3_0,
                    							"org.xtext.globalTypes.MyDsl.ProtocolL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleChoiceBranchL"


    // $ANTLR start "entryRuleForEachL"
    // InternalMyDsl.g:1799:1: entryRuleForEachL returns [EObject current=null] : iv_ruleForEachL= ruleForEachL EOF ;
    public final EObject entryRuleForEachL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachL = null;


        try {
            // InternalMyDsl.g:1799:49: (iv_ruleForEachL= ruleForEachL EOF )
            // InternalMyDsl.g:1800:2: iv_ruleForEachL= ruleForEachL EOF
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
    // InternalMyDsl.g:1806:1: ruleForEachL returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' ) ;
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
        EObject lv_eachRole_1_0 = null;

        EObject lv_branch_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1812:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1813:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1813:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1814:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachLAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:1818:3: ( (lv_eachRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:1819:4: (lv_eachRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:1819:4: (lv_eachRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:1820:5: lv_eachRole_1_0= ruleRoleOne
            {

            					newCompositeNode(grammarAccess.getForEachLAccess().getEachRoleRoleOneParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachLAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getForEachLAccess().getLessThanSignKeyword_3());
            		
            // InternalMyDsl.g:1845:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:1846:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:1846:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:1847:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachLRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getForEachLAccess().getRolesetRoleSetCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getForEachLAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:1862:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:1863:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:1863:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:1864:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachLRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_6, grammarAccess.getForEachLAccess().getRefroleRoleOneCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getForEachLAccess().getGreaterThanSignKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1883:3: ( (lv_branch_9_0= ruleProtocolL ) )
            // InternalMyDsl.g:1884:4: (lv_branch_9_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1884:4: (lv_branch_9_0= ruleProtocolL )
            // InternalMyDsl.g:1885:5: lv_branch_9_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getForEachLAccess().getBranchProtocolLParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getForEachLAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalMyDsl.g:1910:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:1910:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:1911:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:1917:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'action' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1923:2: ( (kw= 'int' | kw= 'string' | kw= 'action' ) )
            // InternalMyDsl.g:1924:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            {
            // InternalMyDsl.g:1924:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt19=1;
                }
                break;
            case 38:
                {
                alt19=2;
                }
                break;
            case 39:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1925:3: kw= 'int'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1931:3: kw= 'string'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1937:3: kw= 'action'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getActionKeyword_2());
                    		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000011B08010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000011300012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000011B00010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000E080000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001011B00010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001011B00012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100010L});

}