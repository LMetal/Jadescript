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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'roleset'", "':'", "'End'", "'rec'", "'{'", "'loop'", "'for'", "'<'", "'>'", "';'", "'choice'", "'at'", "'or'", "')'", "'()'", "'from'", "'to'", "'.'", "'QUIT'", "'local'", "'foreach'", "'int'", "'string'", "'action'"
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
    public static final int T__40=40;
    public static final int T__41=41;
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
            else if ( (LA1_0==37) ) {
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
    // InternalMyDsl.g:422:1: ruleProtocol returns [EObject current=null] : ( ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) ) ) ;
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
            // InternalMyDsl.g:428:2: ( ( ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) ) ) )
            // InternalMyDsl.g:429:2: ( ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) ) )
            {
            // InternalMyDsl.g:429:2: ( ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) ) )
            // InternalMyDsl.g:430:3: ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) )
            {
            // InternalMyDsl.g:430:3: ( (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol ) )
            // InternalMyDsl.g:431:4: (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol )
            {
            // InternalMyDsl.g:431:4: (lv_begin_0_1= ruleChoice | lv_begin_0_2= ruleMessage | lv_begin_0_3= ruleRecursion | lv_begin_0_4= ruleForEach | lv_begin_0_5= ruleCloseRecursion | lv_begin_0_6= ruleEndProtocol )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
            case 36:
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
            case 23:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:432:5: lv_begin_0_1= ruleChoice
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
                    // InternalMyDsl.g:448:5: lv_begin_0_2= ruleMessage
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
                    // InternalMyDsl.g:464:5: lv_begin_0_3= ruleRecursion
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
                    // InternalMyDsl.g:480:5: lv_begin_0_4= ruleForEach
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
                    // InternalMyDsl.g:496:5: lv_begin_0_5= ruleCloseRecursion
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
                    // InternalMyDsl.g:512:5: lv_begin_0_6= ruleEndProtocol
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
    // InternalMyDsl.g:533:1: entryRuleEndProtocol returns [EObject current=null] : iv_ruleEndProtocol= ruleEndProtocol EOF ;
    public final EObject entryRuleEndProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndProtocol = null;


        try {
            // InternalMyDsl.g:533:52: (iv_ruleEndProtocol= ruleEndProtocol EOF )
            // InternalMyDsl.g:534:2: iv_ruleEndProtocol= ruleEndProtocol EOF
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
    // InternalMyDsl.g:540:1: ruleEndProtocol returns [EObject current=null] : ( (lv_end_0_0= 'End' ) ) ;
    public final EObject ruleEndProtocol() throws RecognitionException {
        EObject current = null;

        Token lv_end_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:546:2: ( ( (lv_end_0_0= 'End' ) ) )
            // InternalMyDsl.g:547:2: ( (lv_end_0_0= 'End' ) )
            {
            // InternalMyDsl.g:547:2: ( (lv_end_0_0= 'End' ) )
            // InternalMyDsl.g:548:3: (lv_end_0_0= 'End' )
            {
            // InternalMyDsl.g:548:3: (lv_end_0_0= 'End' )
            // InternalMyDsl.g:549:4: lv_end_0_0= 'End'
            {
            lv_end_0_0=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMyDsl.g:564:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalMyDsl.g:564:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalMyDsl.g:565:2: iv_ruleRecursion= ruleRecursion EOF
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
    // InternalMyDsl.g:571:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:577:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:578:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:578:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' )
            // InternalMyDsl.g:579:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:583:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:584:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:584:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:585:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRecursionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRecursionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:609:3: ( (lv_recProtocol_4_0= ruleProtocol ) )
            // InternalMyDsl.g:610:4: (lv_recProtocol_4_0= ruleProtocol )
            {
            // InternalMyDsl.g:610:4: (lv_recProtocol_4_0= ruleProtocol )
            // InternalMyDsl.g:611:5: lv_recProtocol_4_0= ruleProtocol
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
    // InternalMyDsl.g:636:1: entryRuleCloseRecursion returns [EObject current=null] : iv_ruleCloseRecursion= ruleCloseRecursion EOF ;
    public final EObject entryRuleCloseRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursion = null;


        try {
            // InternalMyDsl.g:636:55: (iv_ruleCloseRecursion= ruleCloseRecursion EOF )
            // InternalMyDsl.g:637:2: iv_ruleCloseRecursion= ruleCloseRecursion EOF
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
    // InternalMyDsl.g:643:1: ruleCloseRecursion returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCloseRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:649:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:650:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:650:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:651:3: otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:655:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:656:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:656:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:657:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:672:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalMyDsl.g:672:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalMyDsl.g:673:2: iv_ruleForEach= ruleForEach EOF
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
    // InternalMyDsl.g:679:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) ) ;
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
            // InternalMyDsl.g:685:2: ( (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) ) )
            // InternalMyDsl.g:686:2: (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) )
            {
            // InternalMyDsl.g:686:2: (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) )
            // InternalMyDsl.g:687:3: otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForKeyword_0());
            		
            // InternalMyDsl.g:691:3: ( (lv_loopRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:692:4: (lv_loopRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:692:4: (lv_loopRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:693:5: lv_loopRole_1_0= ruleRoleOne
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

            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getLessThanSignKeyword_3());
            		
            // InternalMyDsl.g:718:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:719:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:719:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:720:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getRolesetRoleSetCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getForEachAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:735:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:736:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:736:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:737:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_6, grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getForEachAccess().getGreaterThanSignKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:756:3: ( (lv_forBody_9_0= ruleProtocol ) )
            // InternalMyDsl.g:757:4: (lv_forBody_9_0= ruleProtocol )
            {
            // InternalMyDsl.g:757:4: (lv_forBody_9_0= ruleProtocol )
            // InternalMyDsl.g:758:5: lv_forBody_9_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getForBodyProtocolParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_10=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getForEachAccess().getSemicolonKeyword_11());
            		
            // InternalMyDsl.g:783:3: ( (lv_protocol_12_0= ruleProtocol ) )
            // InternalMyDsl.g:784:4: (lv_protocol_12_0= ruleProtocol )
            {
            // InternalMyDsl.g:784:4: (lv_protocol_12_0= ruleProtocol )
            // InternalMyDsl.g:785:5: lv_protocol_12_0= ruleProtocol
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
    // InternalMyDsl.g:806:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalMyDsl.g:806:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalMyDsl.g:807:2: iv_ruleChoice= ruleChoice EOF
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
    // InternalMyDsl.g:813:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* ) ;
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
            // InternalMyDsl.g:819:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* ) )
            // InternalMyDsl.g:820:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* )
            {
            // InternalMyDsl.g:820:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* )
            // InternalMyDsl.g:821:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:829:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:830:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:830:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:831:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:846:3: ( (lv_branches_4_0= ruleMessage ) )
            // InternalMyDsl.g:847:4: (lv_branches_4_0= ruleMessage )
            {
            // InternalMyDsl.g:847:4: (lv_branches_4_0= ruleMessage )
            // InternalMyDsl.g:848:5: lv_branches_4_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getChoiceAccess().getBranchesMessageParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_5=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:869:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:870:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,22,FOLLOW_19); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalMyDsl.g:878:4: ( (lv_branches_8_0= ruleMessage ) )
            	    // InternalMyDsl.g:879:5: (lv_branches_8_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:879:5: (lv_branches_8_0= ruleMessage )
            	    // InternalMyDsl.g:880:6: lv_branches_8_0= ruleMessage
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceAccess().getBranchesMessageParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
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

            	    otherlv_9=(Token)match(input,15,FOLLOW_20); 

            	    				newLeafNode(otherlv_9, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalMyDsl.g:906:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:906:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:907:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:913:1: ruleMessage returns [EObject current=null] : (this_MessageNormal_0= ruleMessageNormal | this_MessageQuit_1= ruleMessageQuit ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_MessageNormal_0 = null;

        EObject this_MessageQuit_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:919:2: ( (this_MessageNormal_0= ruleMessageNormal | this_MessageQuit_1= ruleMessageQuit ) )
            // InternalMyDsl.g:920:2: (this_MessageNormal_0= ruleMessageNormal | this_MessageQuit_1= ruleMessageQuit )
            {
            // InternalMyDsl.g:920:2: (this_MessageNormal_0= ruleMessageNormal | this_MessageQuit_1= ruleMessageQuit )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==36) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:921:3: this_MessageNormal_0= ruleMessageNormal
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
                    // InternalMyDsl.g:930:3: this_MessageQuit_1= ruleMessageQuit
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
    // InternalMyDsl.g:942:1: entryRuleMessageNormal returns [EObject current=null] : iv_ruleMessageNormal= ruleMessageNormal EOF ;
    public final EObject entryRuleMessageNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageNormal = null;


        try {
            // InternalMyDsl.g:942:54: (iv_ruleMessageNormal= ruleMessageNormal EOF )
            // InternalMyDsl.g:943:2: iv_ruleMessageNormal= ruleMessageNormal EOF
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
    // InternalMyDsl.g:949:1: ruleMessageNormal returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) ) ;
    public final EObject ruleMessageNormal() throws RecognitionException {
        EObject current = null;

        Token lv_messageType_0_0=null;
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
            // InternalMyDsl.g:955:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) ) )
            // InternalMyDsl.g:956:2: ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) )
            {
            // InternalMyDsl.g:956:2: ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) )
            // InternalMyDsl.g:957:3: ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) )
            {
            // InternalMyDsl.g:957:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:958:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:958:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:959:5: lv_messageType_0_0= RULE_ID
            {
            lv_messageType_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_messageType_0_0, grammarAccess.getMessageNormalAccess().getMessageTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageNormalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"messageType",
            						lv_messageType_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:975:3: ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:976:4: (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:976:4: (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' )
                    // InternalMyDsl.g:977:5: otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_22); 

                    					newLeafNode(otherlv_1, grammarAccess.getMessageNormalAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyDsl.g:981:5: ( (lv_payload_2_0= rulePayload ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=39 && LA7_0<=41)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:982:6: (lv_payload_2_0= rulePayload )
                            {
                            // InternalMyDsl.g:982:6: (lv_payload_2_0= rulePayload )
                            // InternalMyDsl.g:983:7: lv_payload_2_0= rulePayload
                            {

                            							newCompositeNode(grammarAccess.getMessageNormalAccess().getPayloadPayloadParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_23);
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

                    otherlv_3=(Token)match(input,31,FOLLOW_24); 

                    					newLeafNode(otherlv_3, grammarAccess.getMessageNormalAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1006:4: otherlv_4= '()'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageNormalAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getMessageNormalAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:1015:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:1016:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:1016:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:1017:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageNormalRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_6, grammarAccess.getMessageNormalAccess().getSenderRoleOneCrossReference_3_0());
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getMessageNormalAccess().getToKeyword_4());
            		
            // InternalMyDsl.g:1032:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:1033:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:1033:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:1034:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageNormalRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_8, grammarAccess.getMessageNormalAccess().getReceiverRoleCrossReference_5_0());
            				

            }


            }

            otherlv_9=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getMessageNormalAccess().getFullStopKeyword_6());
            		
            // InternalMyDsl.g:1049:3: ( (lv_protocol_10_0= ruleProtocol ) )
            // InternalMyDsl.g:1050:4: (lv_protocol_10_0= ruleProtocol )
            {
            // InternalMyDsl.g:1050:4: (lv_protocol_10_0= ruleProtocol )
            // InternalMyDsl.g:1051:5: lv_protocol_10_0= ruleProtocol
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
    // InternalMyDsl.g:1072:1: entryRuleMessageQuit returns [EObject current=null] : iv_ruleMessageQuit= ruleMessageQuit EOF ;
    public final EObject entryRuleMessageQuit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageQuit = null;


        try {
            // InternalMyDsl.g:1072:52: (iv_ruleMessageQuit= ruleMessageQuit EOF )
            // InternalMyDsl.g:1073:2: iv_ruleMessageQuit= ruleMessageQuit EOF
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
    // InternalMyDsl.g:1079:1: ruleMessageQuit returns [EObject current=null] : ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleMessageQuit() throws RecognitionException {
        EObject current = null;

        Token lv_messageType_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1085:2: ( ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalMyDsl.g:1086:2: ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1086:2: ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalMyDsl.g:1087:3: ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            // InternalMyDsl.g:1087:3: ( (lv_messageType_0_0= 'QUIT' ) )
            // InternalMyDsl.g:1088:4: (lv_messageType_0_0= 'QUIT' )
            {
            // InternalMyDsl.g:1088:4: (lv_messageType_0_0= 'QUIT' )
            // InternalMyDsl.g:1089:5: lv_messageType_0_0= 'QUIT'
            {
            lv_messageType_0_0=(Token)match(input,36,FOLLOW_27); 

            					newLeafNode(lv_messageType_0_0, grammarAccess.getMessageQuitAccess().getMessageTypeQUITKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageQuitRule());
            					}
            					setWithLastConsumed(current, "messageType", lv_messageType_0_0, "QUIT");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageQuitAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageQuitAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:1109:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1110:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1110:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1111:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageQuitRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_3, grammarAccess.getMessageQuitAccess().getSenderRoleOneCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageQuitAccess().getToKeyword_4());
            		
            // InternalMyDsl.g:1126:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1127:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1127:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1128:5: otherlv_5= RULE_ID
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
    // InternalMyDsl.g:1143:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalMyDsl.g:1143:48: (iv_rulePayload= rulePayload EOF )
            // InternalMyDsl.g:1144:2: iv_rulePayload= rulePayload EOF
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
    // InternalMyDsl.g:1150:1: rulePayload returns [EObject current=null] : ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_types_0_0 = null;

        AntlrDatatypeRuleToken lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1156:2: ( ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* ) )
            // InternalMyDsl.g:1157:2: ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* )
            {
            // InternalMyDsl.g:1157:2: ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* )
            // InternalMyDsl.g:1158:3: ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )*
            {
            // InternalMyDsl.g:1158:3: ( (lv_types_0_0= ruleType ) )
            // InternalMyDsl.g:1159:4: (lv_types_0_0= ruleType )
            {
            // InternalMyDsl.g:1159:4: (lv_types_0_0= ruleType )
            // InternalMyDsl.g:1160:5: lv_types_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalMyDsl.g:1177:3: (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1178:4: otherlv_1= ',' ( (lv_types_2_0= ruleType ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_28); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPayloadAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1182:4: ( (lv_types_2_0= ruleType ) )
            	    // InternalMyDsl.g:1183:5: (lv_types_2_0= ruleType )
            	    {
            	    // InternalMyDsl.g:1183:5: (lv_types_2_0= ruleType )
            	    // InternalMyDsl.g:1184:6: lv_types_2_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
            	    break loop9;
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
    // InternalMyDsl.g:1206:1: entryRuleLocalProtocol returns [EObject current=null] : iv_ruleLocalProtocol= ruleLocalProtocol EOF ;
    public final EObject entryRuleLocalProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalProtocol = null;


        try {
            // InternalMyDsl.g:1206:54: (iv_ruleLocalProtocol= ruleLocalProtocol EOF )
            // InternalMyDsl.g:1207:2: iv_ruleLocalProtocol= ruleLocalProtocol EOF
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
    // InternalMyDsl.g:1213:1: ruleLocalProtocol returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= ruleRoleOne ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) ) ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:1219:2: ( (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= ruleRoleOne ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) ) ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' ) )
            // InternalMyDsl.g:1220:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= ruleRoleOne ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) ) ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' )
            {
            // InternalMyDsl.g:1220:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= ruleRoleOne ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) ) ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' )
            // InternalMyDsl.g:1221:3: otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= ruleRoleOne ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) ) ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalProtocolAccess().getLocalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:1229:3: ( (lv_protocolName_2_0= RULE_ID ) )
            // InternalMyDsl.g:1230:4: (lv_protocolName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1230:4: (lv_protocolName_2_0= RULE_ID )
            // InternalMyDsl.g:1231:5: lv_protocolName_2_0= RULE_ID
            {
            lv_protocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalProtocolAccess().getAtKeyword_3());
            		
            // InternalMyDsl.g:1251:3: ( (lv_projectedRole_4_0= ruleRoleOne ) )
            // InternalMyDsl.g:1252:4: (lv_projectedRole_4_0= ruleRoleOne )
            {
            // InternalMyDsl.g:1252:4: (lv_projectedRole_4_0= ruleRoleOne )
            // InternalMyDsl.g:1253:5: lv_projectedRole_4_0= ruleRoleOne
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getProjectedRoleRoleOneParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_projectedRole_4_0=ruleRoleOne();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalProtocolRule());
            					}
            					set(
            						current,
            						"projectedRole",
            						lv_projectedRole_4_0,
            						"org.xtext.globalTypes.MyDsl.RoleOne");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_5());
            		
            // InternalMyDsl.g:1274:3: ( (lv_roles_6_0= ruleRoles ) )
            // InternalMyDsl.g:1275:4: (lv_roles_6_0= ruleRoles )
            {
            // InternalMyDsl.g:1275:4: (lv_roles_6_0= ruleRoles )
            // InternalMyDsl.g:1276:5: lv_roles_6_0= ruleRoles
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getRolesRolesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalMyDsl.g:1293:3: (otherlv_7= '){' | (otherlv_8= ')' otherlv_9= '{' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1294:4: otherlv_7= '){'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getLocalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1299:4: (otherlv_8= ')' otherlv_9= '{' )
                    {
                    // InternalMyDsl.g:1299:4: (otherlv_8= ')' otherlv_9= '{' )
                    // InternalMyDsl.g:1300:5: otherlv_8= ')' otherlv_9= '{'
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_12); 

                    					newLeafNode(otherlv_8, grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7_1_0());
                    				
                    otherlv_9=(Token)match(input,22,FOLLOW_30); 

                    					newLeafNode(otherlv_9, grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_7_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1310:3: ( (lv_protocol_10_0= ruleProtocolL ) )
            // InternalMyDsl.g:1311:4: (lv_protocol_10_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1311:4: (lv_protocol_10_0= ruleProtocolL )
            // InternalMyDsl.g:1312:5: lv_protocol_10_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1337:1: entryRuleProtocolL returns [EObject current=null] : iv_ruleProtocolL= ruleProtocolL EOF ;
    public final EObject entryRuleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolL = null;


        try {
            // InternalMyDsl.g:1337:50: (iv_ruleProtocolL= ruleProtocolL EOF )
            // InternalMyDsl.g:1338:2: iv_ruleProtocolL= ruleProtocolL EOF
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
    // InternalMyDsl.g:1344:1: ruleProtocolL returns [EObject current=null] : ( ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) ) ) ;
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
            // InternalMyDsl.g:1350:2: ( ( ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) ) ) )
            // InternalMyDsl.g:1351:2: ( ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) ) )
            {
            // InternalMyDsl.g:1351:2: ( ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) ) )
            // InternalMyDsl.g:1352:3: ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) )
            {
            // InternalMyDsl.g:1352:3: ( (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol ) )
            // InternalMyDsl.g:1353:4: (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol )
            {
            // InternalMyDsl.g:1353:4: (lv_begin_0_1= ruleMessageL | lv_begin_0_2= ruleChoiceL | lv_begin_0_3= ruleForEachL | lv_begin_0_4= ruleRecursionL | lv_begin_0_5= ruleCloseRecursionL | lv_begin_0_6= ruleEndProtocol )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 36:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 23:
                {
                alt11=5;
                }
                break;
            case 20:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1354:5: lv_begin_0_1= ruleMessageL
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
                    // InternalMyDsl.g:1370:5: lv_begin_0_2= ruleChoiceL
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
                    // InternalMyDsl.g:1386:5: lv_begin_0_3= ruleForEachL
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
                    // InternalMyDsl.g:1402:5: lv_begin_0_4= ruleRecursionL
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
                    // InternalMyDsl.g:1418:5: lv_begin_0_5= ruleCloseRecursionL
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
                    // InternalMyDsl.g:1434:5: lv_begin_0_6= ruleEndProtocol
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
    // InternalMyDsl.g:1455:1: entryRuleRecursionL returns [EObject current=null] : iv_ruleRecursionL= ruleRecursionL EOF ;
    public final EObject entryRuleRecursionL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursionL = null;


        try {
            // InternalMyDsl.g:1455:51: (iv_ruleRecursionL= ruleRecursionL EOF )
            // InternalMyDsl.g:1456:2: iv_ruleRecursionL= ruleRecursionL EOF
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
    // InternalMyDsl.g:1462:1: ruleRecursionL returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:1468:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1469:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1469:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1470:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionLAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:1474:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1475:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1475:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1476:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRecursionLAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getRecursionLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1500:3: ( (lv_recProtocol_4_0= ruleProtocolL ) )
            // InternalMyDsl.g:1501:4: (lv_recProtocol_4_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1501:4: (lv_recProtocol_4_0= ruleProtocolL )
            // InternalMyDsl.g:1502:5: lv_recProtocol_4_0= ruleProtocolL
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


    // $ANTLR start "entryRuleCloseRecursionL"
    // InternalMyDsl.g:1527:1: entryRuleCloseRecursionL returns [EObject current=null] : iv_ruleCloseRecursionL= ruleCloseRecursionL EOF ;
    public final EObject entryRuleCloseRecursionL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursionL = null;


        try {
            // InternalMyDsl.g:1527:56: (iv_ruleCloseRecursionL= ruleCloseRecursionL EOF )
            // InternalMyDsl.g:1528:2: iv_ruleCloseRecursionL= ruleCloseRecursionL EOF
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
    // InternalMyDsl.g:1534:1: ruleCloseRecursionL returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCloseRecursionL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1540:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1541:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1541:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1542:3: otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionLAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:1546:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1547:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1547:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1548:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:1563:1: entryRuleMessageL returns [EObject current=null] : iv_ruleMessageL= ruleMessageL EOF ;
    public final EObject entryRuleMessageL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageL = null;


        try {
            // InternalMyDsl.g:1563:49: (iv_ruleMessageL= ruleMessageL EOF )
            // InternalMyDsl.g:1564:2: iv_ruleMessageL= ruleMessageL EOF
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
    // InternalMyDsl.g:1570:1: ruleMessageL returns [EObject current=null] : (this_MessageNormalL_0= ruleMessageNormalL | this_MessageQuitL_1= ruleMessageQuitL ) ;
    public final EObject ruleMessageL() throws RecognitionException {
        EObject current = null;

        EObject this_MessageNormalL_0 = null;

        EObject this_MessageQuitL_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1576:2: ( (this_MessageNormalL_0= ruleMessageNormalL | this_MessageQuitL_1= ruleMessageQuitL ) )
            // InternalMyDsl.g:1577:2: (this_MessageNormalL_0= ruleMessageNormalL | this_MessageQuitL_1= ruleMessageQuitL )
            {
            // InternalMyDsl.g:1577:2: (this_MessageNormalL_0= ruleMessageNormalL | this_MessageQuitL_1= ruleMessageQuitL )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==36) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1578:3: this_MessageNormalL_0= ruleMessageNormalL
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
                    // InternalMyDsl.g:1587:3: this_MessageQuitL_1= ruleMessageQuitL
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
    // InternalMyDsl.g:1599:1: entryRuleMessageNormalL returns [EObject current=null] : iv_ruleMessageNormalL= ruleMessageNormalL EOF ;
    public final EObject entryRuleMessageNormalL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageNormalL = null;


        try {
            // InternalMyDsl.g:1599:55: (iv_ruleMessageNormalL= ruleMessageNormalL EOF )
            // InternalMyDsl.g:1600:2: iv_ruleMessageNormalL= ruleMessageNormalL EOF
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
    // InternalMyDsl.g:1606:1: ruleMessageNormalL returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) ( (lv_sendReceive_5_0= ruleMessageType ) ) otherlv_6= '.' ( (lv_protocol_7_0= ruleProtocolL ) ) ) ;
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
            // InternalMyDsl.g:1612:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) ( (lv_sendReceive_5_0= ruleMessageType ) ) otherlv_6= '.' ( (lv_protocol_7_0= ruleProtocolL ) ) ) )
            // InternalMyDsl.g:1613:2: ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) ( (lv_sendReceive_5_0= ruleMessageType ) ) otherlv_6= '.' ( (lv_protocol_7_0= ruleProtocolL ) ) )
            {
            // InternalMyDsl.g:1613:2: ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) ( (lv_sendReceive_5_0= ruleMessageType ) ) otherlv_6= '.' ( (lv_protocol_7_0= ruleProtocolL ) ) )
            // InternalMyDsl.g:1614:3: ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) ( (lv_sendReceive_5_0= ruleMessageType ) ) otherlv_6= '.' ( (lv_protocol_7_0= ruleProtocolL ) )
            {
            // InternalMyDsl.g:1614:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:1615:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1615:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:1616:5: lv_messageType_0_0= RULE_ID
            {
            lv_messageType_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            // InternalMyDsl.g:1632:3: ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==32) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1633:4: (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:1633:4: (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' )
                    // InternalMyDsl.g:1634:5: otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_22); 

                    					newLeafNode(otherlv_1, grammarAccess.getMessageNormalLAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyDsl.g:1638:5: ( (lv_payload_2_0= rulePayload ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=39 && LA13_0<=41)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:1639:6: (lv_payload_2_0= rulePayload )
                            {
                            // InternalMyDsl.g:1639:6: (lv_payload_2_0= rulePayload )
                            // InternalMyDsl.g:1640:7: lv_payload_2_0= rulePayload
                            {

                            							newCompositeNode(grammarAccess.getMessageNormalLAccess().getPayloadPayloadParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_23);
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

                    otherlv_3=(Token)match(input,31,FOLLOW_31); 

                    					newLeafNode(otherlv_3, grammarAccess.getMessageNormalLAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1663:4: otherlv_4= '()'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageNormalLAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1668:3: ( (lv_sendReceive_5_0= ruleMessageType ) )
            // InternalMyDsl.g:1669:4: (lv_sendReceive_5_0= ruleMessageType )
            {
            // InternalMyDsl.g:1669:4: (lv_sendReceive_5_0= ruleMessageType )
            // InternalMyDsl.g:1670:5: lv_sendReceive_5_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getMessageNormalLAccess().getSendReceiveMessageTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_6=(Token)match(input,35,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageNormalLAccess().getFullStopKeyword_3());
            		
            // InternalMyDsl.g:1691:3: ( (lv_protocol_7_0= ruleProtocolL ) )
            // InternalMyDsl.g:1692:4: (lv_protocol_7_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1692:4: (lv_protocol_7_0= ruleProtocolL )
            // InternalMyDsl.g:1693:5: lv_protocol_7_0= ruleProtocolL
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
    // InternalMyDsl.g:1714:1: entryRuleMessageQuitL returns [EObject current=null] : iv_ruleMessageQuitL= ruleMessageQuitL EOF ;
    public final EObject entryRuleMessageQuitL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageQuitL = null;


        try {
            // InternalMyDsl.g:1714:53: (iv_ruleMessageQuitL= ruleMessageQuitL EOF )
            // InternalMyDsl.g:1715:2: iv_ruleMessageQuitL= ruleMessageQuitL EOF
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
    // InternalMyDsl.g:1721:1: ruleMessageQuitL returns [EObject current=null] : ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' ( (lv_sendReceive_2_0= ruleMessageType ) ) ) ;
    public final EObject ruleMessageQuitL() throws RecognitionException {
        EObject current = null;

        Token lv_messageType_0_0=null;
        Token otherlv_1=null;
        EObject lv_sendReceive_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1727:2: ( ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' ( (lv_sendReceive_2_0= ruleMessageType ) ) ) )
            // InternalMyDsl.g:1728:2: ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' ( (lv_sendReceive_2_0= ruleMessageType ) ) )
            {
            // InternalMyDsl.g:1728:2: ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' ( (lv_sendReceive_2_0= ruleMessageType ) ) )
            // InternalMyDsl.g:1729:3: ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' ( (lv_sendReceive_2_0= ruleMessageType ) )
            {
            // InternalMyDsl.g:1729:3: ( (lv_messageType_0_0= 'QUIT' ) )
            // InternalMyDsl.g:1730:4: (lv_messageType_0_0= 'QUIT' )
            {
            // InternalMyDsl.g:1730:4: (lv_messageType_0_0= 'QUIT' )
            // InternalMyDsl.g:1731:5: lv_messageType_0_0= 'QUIT'
            {
            lv_messageType_0_0=(Token)match(input,36,FOLLOW_27); 

            					newLeafNode(lv_messageType_0_0, grammarAccess.getMessageQuitLAccess().getMessageTypeQUITKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageQuitLRule());
            					}
            					setWithLastConsumed(current, "messageType", lv_messageType_0_0, "QUIT");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageQuitLAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1747:3: ( (lv_sendReceive_2_0= ruleMessageType ) )
            // InternalMyDsl.g:1748:4: (lv_sendReceive_2_0= ruleMessageType )
            {
            // InternalMyDsl.g:1748:4: (lv_sendReceive_2_0= ruleMessageType )
            // InternalMyDsl.g:1749:5: lv_sendReceive_2_0= ruleMessageType
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
    // InternalMyDsl.g:1770:1: entryRuleMessageType returns [EObject current=null] : iv_ruleMessageType= ruleMessageType EOF ;
    public final EObject entryRuleMessageType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageType = null;


        try {
            // InternalMyDsl.g:1770:52: (iv_ruleMessageType= ruleMessageType EOF )
            // InternalMyDsl.g:1771:2: iv_ruleMessageType= ruleMessageType EOF
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
    // InternalMyDsl.g:1777:1: ruleMessageType returns [EObject current=null] : (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL ) ;
    public final EObject ruleMessageType() throws RecognitionException {
        EObject current = null;

        EObject this_SenderL_0 = null;

        EObject this_ReceiverL_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1783:2: ( (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL ) )
            // InternalMyDsl.g:1784:2: (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL )
            {
            // InternalMyDsl.g:1784:2: (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1785:3: this_SenderL_0= ruleSenderL
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
                    // InternalMyDsl.g:1794:3: this_ReceiverL_1= ruleReceiverL
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
    // InternalMyDsl.g:1806:1: entryRuleSenderL returns [EObject current=null] : iv_ruleSenderL= ruleSenderL EOF ;
    public final EObject entryRuleSenderL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenderL = null;


        try {
            // InternalMyDsl.g:1806:48: (iv_ruleSenderL= ruleSenderL EOF )
            // InternalMyDsl.g:1807:2: iv_ruleSenderL= ruleSenderL EOF
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
    // InternalMyDsl.g:1813:1: ruleSenderL returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSenderL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1819:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1820:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1820:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1821:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSenderLAccess().getFromKeyword_0());
            		
            // InternalMyDsl.g:1825:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1826:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1826:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1827:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:1842:1: entryRuleReceiverL returns [EObject current=null] : iv_ruleReceiverL= ruleReceiverL EOF ;
    public final EObject entryRuleReceiverL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverL = null;


        try {
            // InternalMyDsl.g:1842:50: (iv_ruleReceiverL= ruleReceiverL EOF )
            // InternalMyDsl.g:1843:2: iv_ruleReceiverL= ruleReceiverL EOF
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
    // InternalMyDsl.g:1849:1: ruleReceiverL returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReceiverL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1855:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1856:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1856:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1857:3: otherlv_0= 'to' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiverLAccess().getToKeyword_0());
            		
            // InternalMyDsl.g:1861:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1862:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1862:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1863:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:1878:1: entryRuleChoiceL returns [EObject current=null] : iv_ruleChoiceL= ruleChoiceL EOF ;
    public final EObject entryRuleChoiceL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceL = null;


        try {
            // InternalMyDsl.g:1878:48: (iv_ruleChoiceL= ruleChoiceL EOF )
            // InternalMyDsl.g:1879:2: iv_ruleChoiceL= ruleChoiceL EOF
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
    // InternalMyDsl.g:1885:1: ruleChoiceL returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessageL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )* ) ;
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
            // InternalMyDsl.g:1891:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessageL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )* ) )
            // InternalMyDsl.g:1892:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessageL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )* )
            {
            // InternalMyDsl.g:1892:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessageL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )* )
            // InternalMyDsl.g:1893:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessageL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceLAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceLAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:1901:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1902:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1902:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1903:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceLRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1918:3: ( (lv_branches_4_0= ruleMessageL ) )
            // InternalMyDsl.g:1919:4: (lv_branches_4_0= ruleMessageL )
            {
            // InternalMyDsl.g:1919:4: (lv_branches_4_0= ruleMessageL )
            // InternalMyDsl.g:1920:5: lv_branches_4_0= ruleMessageL
            {

            					newCompositeNode(grammarAccess.getChoiceLAccess().getBranchesMessageLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_5=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1941:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1942:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessageL ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoiceLAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,22,FOLLOW_19); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalMyDsl.g:1950:4: ( (lv_branches_8_0= ruleMessageL ) )
            	    // InternalMyDsl.g:1951:5: (lv_branches_8_0= ruleMessageL )
            	    {
            	    // InternalMyDsl.g:1951:5: (lv_branches_8_0= ruleMessageL )
            	    // InternalMyDsl.g:1952:6: lv_branches_8_0= ruleMessageL
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceLAccess().getBranchesMessageLParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
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

            	    otherlv_9=(Token)match(input,15,FOLLOW_20); 

            	    				newLeafNode(otherlv_9, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:1978:1: entryRuleForEachL returns [EObject current=null] : iv_ruleForEachL= ruleForEachL EOF ;
    public final EObject entryRuleForEachL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachL = null;


        try {
            // InternalMyDsl.g:1978:49: (iv_ruleForEachL= ruleForEachL EOF )
            // InternalMyDsl.g:1979:2: iv_ruleForEachL= ruleForEachL EOF
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
    // InternalMyDsl.g:1985:1: ruleForEachL returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocolL ) ) ) ;
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
            // InternalMyDsl.g:1991:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocolL ) ) ) )
            // InternalMyDsl.g:1992:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocolL ) ) )
            {
            // InternalMyDsl.g:1992:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocolL ) ) )
            // InternalMyDsl.g:1993:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocolL ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachLAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:1997:3: ( (lv_eachRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:1998:4: (lv_eachRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:1998:4: (lv_eachRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:1999:5: lv_eachRole_1_0= ruleRoleOne
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

            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachLAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getForEachLAccess().getLessThanSignKeyword_3());
            		
            // InternalMyDsl.g:2024:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:2025:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:2025:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:2026:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachLRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_4, grammarAccess.getForEachLAccess().getRolesetRoleSetCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getForEachLAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:2041:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:2042:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:2042:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:2043:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachLRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_6, grammarAccess.getForEachLAccess().getRefroleRoleOneCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getForEachLAccess().getGreaterThanSignKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_30); 

            			newLeafNode(otherlv_8, grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:2062:3: ( (lv_branch_9_0= ruleProtocolL ) )
            // InternalMyDsl.g:2063:4: (lv_branch_9_0= ruleProtocolL )
            {
            // InternalMyDsl.g:2063:4: (lv_branch_9_0= ruleProtocolL )
            // InternalMyDsl.g:2064:5: lv_branch_9_0= ruleProtocolL
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

            otherlv_10=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getForEachLAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,27,FOLLOW_30); 

            			newLeafNode(otherlv_11, grammarAccess.getForEachLAccess().getSemicolonKeyword_11());
            		
            // InternalMyDsl.g:2089:3: ( (lv_protocol_12_0= ruleProtocolL ) )
            // InternalMyDsl.g:2090:4: (lv_protocol_12_0= ruleProtocolL )
            {
            // InternalMyDsl.g:2090:4: (lv_protocol_12_0= ruleProtocolL )
            // InternalMyDsl.g:2091:5: lv_protocol_12_0= ruleProtocolL
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
    // InternalMyDsl.g:2112:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:2112:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:2113:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:2119:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'action' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2125:2: ( (kw= 'int' | kw= 'string' | kw= 'action' ) )
            // InternalMyDsl.g:2126:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            {
            // InternalMyDsl.g:2126:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2127:3: kw= 'int'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2133:3: kw= 'string'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2139:3: kw= 'action'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001011B00010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000038080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000005011B00010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000600000000L});

}