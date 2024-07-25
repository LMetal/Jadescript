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
    // InternalMyDsl.g:422:1: ruleProtocol returns [EObject current=null] : ( () ( ( (lv_begin_1_1= ruleChoice | lv_begin_1_2= ruleMessage | lv_begin_1_3= ruleRecursion | lv_begin_1_4= ruleForEach | lv_begin_1_5= ruleCloseRecursion | lv_begin_1_6= ruleEndProtocol ) ) ) ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject lv_begin_1_1 = null;

        EObject lv_begin_1_2 = null;

        EObject lv_begin_1_3 = null;

        EObject lv_begin_1_4 = null;

        EObject lv_begin_1_5 = null;

        EObject lv_begin_1_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:428:2: ( ( () ( ( (lv_begin_1_1= ruleChoice | lv_begin_1_2= ruleMessage | lv_begin_1_3= ruleRecursion | lv_begin_1_4= ruleForEach | lv_begin_1_5= ruleCloseRecursion | lv_begin_1_6= ruleEndProtocol ) ) ) ) )
            // InternalMyDsl.g:429:2: ( () ( ( (lv_begin_1_1= ruleChoice | lv_begin_1_2= ruleMessage | lv_begin_1_3= ruleRecursion | lv_begin_1_4= ruleForEach | lv_begin_1_5= ruleCloseRecursion | lv_begin_1_6= ruleEndProtocol ) ) ) )
            {
            // InternalMyDsl.g:429:2: ( () ( ( (lv_begin_1_1= ruleChoice | lv_begin_1_2= ruleMessage | lv_begin_1_3= ruleRecursion | lv_begin_1_4= ruleForEach | lv_begin_1_5= ruleCloseRecursion | lv_begin_1_6= ruleEndProtocol ) ) ) )
            // InternalMyDsl.g:430:3: () ( ( (lv_begin_1_1= ruleChoice | lv_begin_1_2= ruleMessage | lv_begin_1_3= ruleRecursion | lv_begin_1_4= ruleForEach | lv_begin_1_5= ruleCloseRecursion | lv_begin_1_6= ruleEndProtocol ) ) )
            {
            // InternalMyDsl.g:430:3: ()
            // InternalMyDsl.g:431:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolAccess().getProtocolAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:437:3: ( ( (lv_begin_1_1= ruleChoice | lv_begin_1_2= ruleMessage | lv_begin_1_3= ruleRecursion | lv_begin_1_4= ruleForEach | lv_begin_1_5= ruleCloseRecursion | lv_begin_1_6= ruleEndProtocol ) ) )
            // InternalMyDsl.g:438:4: ( (lv_begin_1_1= ruleChoice | lv_begin_1_2= ruleMessage | lv_begin_1_3= ruleRecursion | lv_begin_1_4= ruleForEach | lv_begin_1_5= ruleCloseRecursion | lv_begin_1_6= ruleEndProtocol ) )
            {
            // InternalMyDsl.g:438:4: ( (lv_begin_1_1= ruleChoice | lv_begin_1_2= ruleMessage | lv_begin_1_3= ruleRecursion | lv_begin_1_4= ruleForEach | lv_begin_1_5= ruleCloseRecursion | lv_begin_1_6= ruleEndProtocol ) )
            // InternalMyDsl.g:439:5: (lv_begin_1_1= ruleChoice | lv_begin_1_2= ruleMessage | lv_begin_1_3= ruleRecursion | lv_begin_1_4= ruleForEach | lv_begin_1_5= ruleCloseRecursion | lv_begin_1_6= ruleEndProtocol )
            {
            // InternalMyDsl.g:439:5: (lv_begin_1_1= ruleChoice | lv_begin_1_2= ruleMessage | lv_begin_1_3= ruleRecursion | lv_begin_1_4= ruleForEach | lv_begin_1_5= ruleCloseRecursion | lv_begin_1_6= ruleEndProtocol )
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
                    // InternalMyDsl.g:440:6: lv_begin_1_1= ruleChoice
                    {

                    						newCompositeNode(grammarAccess.getProtocolAccess().getBeginChoiceParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_begin_1_1=ruleChoice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProtocolRule());
                    						}
                    						set(
                    							current,
                    							"begin",
                    							lv_begin_1_1,
                    							"org.xtext.globalTypes.MyDsl.Choice");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:456:6: lv_begin_1_2= ruleMessage
                    {

                    						newCompositeNode(grammarAccess.getProtocolAccess().getBeginMessageParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_begin_1_2=ruleMessage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProtocolRule());
                    						}
                    						set(
                    							current,
                    							"begin",
                    							lv_begin_1_2,
                    							"org.xtext.globalTypes.MyDsl.Message");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:472:6: lv_begin_1_3= ruleRecursion
                    {

                    						newCompositeNode(grammarAccess.getProtocolAccess().getBeginRecursionParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_begin_1_3=ruleRecursion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProtocolRule());
                    						}
                    						set(
                    							current,
                    							"begin",
                    							lv_begin_1_3,
                    							"org.xtext.globalTypes.MyDsl.Recursion");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:488:6: lv_begin_1_4= ruleForEach
                    {

                    						newCompositeNode(grammarAccess.getProtocolAccess().getBeginForEachParserRuleCall_1_0_3());
                    					
                    pushFollow(FOLLOW_2);
                    lv_begin_1_4=ruleForEach();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProtocolRule());
                    						}
                    						set(
                    							current,
                    							"begin",
                    							lv_begin_1_4,
                    							"org.xtext.globalTypes.MyDsl.ForEach");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:504:6: lv_begin_1_5= ruleCloseRecursion
                    {

                    						newCompositeNode(grammarAccess.getProtocolAccess().getBeginCloseRecursionParserRuleCall_1_0_4());
                    					
                    pushFollow(FOLLOW_2);
                    lv_begin_1_5=ruleCloseRecursion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProtocolRule());
                    						}
                    						set(
                    							current,
                    							"begin",
                    							lv_begin_1_5,
                    							"org.xtext.globalTypes.MyDsl.CloseRecursion");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:520:6: lv_begin_1_6= ruleEndProtocol
                    {

                    						newCompositeNode(grammarAccess.getProtocolAccess().getBeginEndProtocolParserRuleCall_1_0_5());
                    					
                    pushFollow(FOLLOW_2);
                    lv_begin_1_6=ruleEndProtocol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProtocolRule());
                    						}
                    						set(
                    							current,
                    							"begin",
                    							lv_begin_1_6,
                    							"org.xtext.globalTypes.MyDsl.EndProtocol");
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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleEndProtocol"
    // InternalMyDsl.g:542:1: entryRuleEndProtocol returns [EObject current=null] : iv_ruleEndProtocol= ruleEndProtocol EOF ;
    public final EObject entryRuleEndProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndProtocol = null;


        try {
            // InternalMyDsl.g:542:52: (iv_ruleEndProtocol= ruleEndProtocol EOF )
            // InternalMyDsl.g:543:2: iv_ruleEndProtocol= ruleEndProtocol EOF
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
    // InternalMyDsl.g:549:1: ruleEndProtocol returns [EObject current=null] : ( (lv_end_0_0= 'End' ) ) ;
    public final EObject ruleEndProtocol() throws RecognitionException {
        EObject current = null;

        Token lv_end_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:555:2: ( ( (lv_end_0_0= 'End' ) ) )
            // InternalMyDsl.g:556:2: ( (lv_end_0_0= 'End' ) )
            {
            // InternalMyDsl.g:556:2: ( (lv_end_0_0= 'End' ) )
            // InternalMyDsl.g:557:3: (lv_end_0_0= 'End' )
            {
            // InternalMyDsl.g:557:3: (lv_end_0_0= 'End' )
            // InternalMyDsl.g:558:4: lv_end_0_0= 'End'
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
    // InternalMyDsl.g:573:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalMyDsl.g:573:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalMyDsl.g:574:2: iv_ruleRecursion= ruleRecursion EOF
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
    // InternalMyDsl.g:580:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:586:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:587:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:587:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}' )
            // InternalMyDsl.g:588:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocol ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:592:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:593:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:593:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:594:5: lv_name_1_0= RULE_ID
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
            		
            // InternalMyDsl.g:618:3: ( (lv_recProtocol_4_0= ruleProtocol ) )
            // InternalMyDsl.g:619:4: (lv_recProtocol_4_0= ruleProtocol )
            {
            // InternalMyDsl.g:619:4: (lv_recProtocol_4_0= ruleProtocol )
            // InternalMyDsl.g:620:5: lv_recProtocol_4_0= ruleProtocol
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
    // InternalMyDsl.g:645:1: entryRuleCloseRecursion returns [EObject current=null] : iv_ruleCloseRecursion= ruleCloseRecursion EOF ;
    public final EObject entryRuleCloseRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursion = null;


        try {
            // InternalMyDsl.g:645:55: (iv_ruleCloseRecursion= ruleCloseRecursion EOF )
            // InternalMyDsl.g:646:2: iv_ruleCloseRecursion= ruleCloseRecursion EOF
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
    // InternalMyDsl.g:652:1: ruleCloseRecursion returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCloseRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:658:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:659:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:659:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:660:3: otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:664:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:665:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:665:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:666:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:681:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalMyDsl.g:681:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalMyDsl.g:682:2: iv_ruleForEach= ruleForEach EOF
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
    // InternalMyDsl.g:688:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) ) ;
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
            // InternalMyDsl.g:694:2: ( (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) ) )
            // InternalMyDsl.g:695:2: (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) )
            {
            // InternalMyDsl.g:695:2: (otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) ) )
            // InternalMyDsl.g:696:3: otherlv_0= 'for' ( (lv_loopRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_forBody_9_0= ruleProtocol ) ) otherlv_10= '}' otherlv_11= ';' ( (lv_protocol_12_0= ruleProtocol ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForKeyword_0());
            		
            // InternalMyDsl.g:700:3: ( (lv_loopRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:701:4: (lv_loopRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:701:4: (lv_loopRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:702:5: lv_loopRole_1_0= ruleRoleOne
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
            		
            // InternalMyDsl.g:727:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:728:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:728:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:729:5: otherlv_4= RULE_ID
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
            		
            // InternalMyDsl.g:744:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:745:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:745:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:746:5: otherlv_6= RULE_ID
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
            		
            // InternalMyDsl.g:765:3: ( (lv_forBody_9_0= ruleProtocol ) )
            // InternalMyDsl.g:766:4: (lv_forBody_9_0= ruleProtocol )
            {
            // InternalMyDsl.g:766:4: (lv_forBody_9_0= ruleProtocol )
            // InternalMyDsl.g:767:5: lv_forBody_9_0= ruleProtocol
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
            		
            // InternalMyDsl.g:792:3: ( (lv_protocol_12_0= ruleProtocol ) )
            // InternalMyDsl.g:793:4: (lv_protocol_12_0= ruleProtocol )
            {
            // InternalMyDsl.g:793:4: (lv_protocol_12_0= ruleProtocol )
            // InternalMyDsl.g:794:5: lv_protocol_12_0= ruleProtocol
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
    // InternalMyDsl.g:815:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalMyDsl.g:815:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalMyDsl.g:816:2: iv_ruleChoice= ruleChoice EOF
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
    // InternalMyDsl.g:822:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* ) ;
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
            // InternalMyDsl.g:828:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* ) )
            // InternalMyDsl.g:829:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* )
            {
            // InternalMyDsl.g:829:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )* )
            // InternalMyDsl.g:830:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleMessage ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:838:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:839:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:839:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:840:5: otherlv_2= RULE_ID
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
            		
            // InternalMyDsl.g:855:3: ( (lv_branches_4_0= ruleMessage ) )
            // InternalMyDsl.g:856:4: (lv_branches_4_0= ruleMessage )
            {
            // InternalMyDsl.g:856:4: (lv_branches_4_0= ruleMessage )
            // InternalMyDsl.g:857:5: lv_branches_4_0= ruleMessage
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
            		
            // InternalMyDsl.g:878:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:879:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleMessage ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,22,FOLLOW_19); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalMyDsl.g:887:4: ( (lv_branches_8_0= ruleMessage ) )
            	    // InternalMyDsl.g:888:5: (lv_branches_8_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:888:5: (lv_branches_8_0= ruleMessage )
            	    // InternalMyDsl.g:889:6: lv_branches_8_0= ruleMessage
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
    // InternalMyDsl.g:915:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:915:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:916:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:922:1: ruleMessage returns [EObject current=null] : (this_MessageBase_0= ruleMessageBase | this_MessageQuit_1= ruleMessageQuit ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_MessageBase_0 = null;

        EObject this_MessageQuit_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:928:2: ( (this_MessageBase_0= ruleMessageBase | this_MessageQuit_1= ruleMessageQuit ) )
            // InternalMyDsl.g:929:2: (this_MessageBase_0= ruleMessageBase | this_MessageQuit_1= ruleMessageQuit )
            {
            // InternalMyDsl.g:929:2: (this_MessageBase_0= ruleMessageBase | this_MessageQuit_1= ruleMessageQuit )
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
                    // InternalMyDsl.g:930:3: this_MessageBase_0= ruleMessageBase
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getMessageBaseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageBase_0=ruleMessageBase();

                    state._fsp--;


                    			current = this_MessageBase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:939:3: this_MessageQuit_1= ruleMessageQuit
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


    // $ANTLR start "entryRuleMessageBase"
    // InternalMyDsl.g:951:1: entryRuleMessageBase returns [EObject current=null] : iv_ruleMessageBase= ruleMessageBase EOF ;
    public final EObject entryRuleMessageBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageBase = null;


        try {
            // InternalMyDsl.g:951:52: (iv_ruleMessageBase= ruleMessageBase EOF )
            // InternalMyDsl.g:952:2: iv_ruleMessageBase= ruleMessageBase EOF
            {
             newCompositeNode(grammarAccess.getMessageBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageBase=ruleMessageBase();

            state._fsp--;

             current =iv_ruleMessageBase; 
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
    // $ANTLR end "entryRuleMessageBase"


    // $ANTLR start "ruleMessageBase"
    // InternalMyDsl.g:958:1: ruleMessageBase returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) ) ;
    public final EObject ruleMessageBase() throws RecognitionException {
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
            // InternalMyDsl.g:964:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) ) )
            // InternalMyDsl.g:965:2: ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) )
            {
            // InternalMyDsl.g:965:2: ( ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) ) )
            // InternalMyDsl.g:966:3: ( (lv_messageType_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' ) otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (lv_protocol_10_0= ruleProtocol ) )
            {
            // InternalMyDsl.g:966:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:967:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:967:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:968:5: lv_messageType_0_0= RULE_ID
            {
            lv_messageType_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_messageType_0_0, grammarAccess.getMessageBaseAccess().getMessageTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageBaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"messageType",
            						lv_messageType_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:984:3: ( (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ) | otherlv_4= '()' )
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
                    // InternalMyDsl.g:985:4: (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:985:4: (otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' )
                    // InternalMyDsl.g:986:5: otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_22); 

                    					newLeafNode(otherlv_1, grammarAccess.getMessageBaseAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyDsl.g:990:5: ( (lv_payload_2_0= rulePayload ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=39 && LA7_0<=41)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:991:6: (lv_payload_2_0= rulePayload )
                            {
                            // InternalMyDsl.g:991:6: (lv_payload_2_0= rulePayload )
                            // InternalMyDsl.g:992:7: lv_payload_2_0= rulePayload
                            {

                            							newCompositeNode(grammarAccess.getMessageBaseAccess().getPayloadPayloadParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_payload_2_0=rulePayload();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageBaseRule());
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

                    					newLeafNode(otherlv_3, grammarAccess.getMessageBaseAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1015:4: otherlv_4= '()'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageBaseAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getMessageBaseAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:1024:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:1025:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:1025:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:1026:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageBaseRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_6, grammarAccess.getMessageBaseAccess().getSenderRoleOneCrossReference_3_0());
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getMessageBaseAccess().getToKeyword_4());
            		
            // InternalMyDsl.g:1041:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:1042:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:1042:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:1043:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageBaseRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_8, grammarAccess.getMessageBaseAccess().getReceiverRoleCrossReference_5_0());
            				

            }


            }

            otherlv_9=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getMessageBaseAccess().getFullStopKeyword_6());
            		
            // InternalMyDsl.g:1058:3: ( (lv_protocol_10_0= ruleProtocol ) )
            // InternalMyDsl.g:1059:4: (lv_protocol_10_0= ruleProtocol )
            {
            // InternalMyDsl.g:1059:4: (lv_protocol_10_0= ruleProtocol )
            // InternalMyDsl.g:1060:5: lv_protocol_10_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getMessageBaseAccess().getProtocolProtocolParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_protocol_10_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageBaseRule());
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
    // $ANTLR end "ruleMessageBase"


    // $ANTLR start "entryRuleMessageQuit"
    // InternalMyDsl.g:1081:1: entryRuleMessageQuit returns [EObject current=null] : iv_ruleMessageQuit= ruleMessageQuit EOF ;
    public final EObject entryRuleMessageQuit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageQuit = null;


        try {
            // InternalMyDsl.g:1081:52: (iv_ruleMessageQuit= ruleMessageQuit EOF )
            // InternalMyDsl.g:1082:2: iv_ruleMessageQuit= ruleMessageQuit EOF
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
    // InternalMyDsl.g:1088:1: ruleMessageQuit returns [EObject current=null] : ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ) ;
    public final EObject ruleMessageQuit() throws RecognitionException {
        EObject current = null;

        Token lv_messageType_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1094:2: ( ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ) )
            // InternalMyDsl.g:1095:2: ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' )
            {
            // InternalMyDsl.g:1095:2: ( ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' )
            // InternalMyDsl.g:1096:3: ( (lv_messageType_0_0= 'QUIT' ) ) otherlv_1= '()' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.'
            {
            // InternalMyDsl.g:1096:3: ( (lv_messageType_0_0= 'QUIT' ) )
            // InternalMyDsl.g:1097:4: (lv_messageType_0_0= 'QUIT' )
            {
            // InternalMyDsl.g:1097:4: (lv_messageType_0_0= 'QUIT' )
            // InternalMyDsl.g:1098:5: lv_messageType_0_0= 'QUIT'
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
            		
            // InternalMyDsl.g:1118:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1119:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1119:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1120:5: otherlv_3= RULE_ID
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
            		
            // InternalMyDsl.g:1135:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1136:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1136:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1137:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageQuitRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageQuitAccess().getReceiverRoleCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageQuitAccess().getFullStopKeyword_6());
            		

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
    // InternalMyDsl.g:1156:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalMyDsl.g:1156:48: (iv_rulePayload= rulePayload EOF )
            // InternalMyDsl.g:1157:2: iv_rulePayload= rulePayload EOF
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
    // InternalMyDsl.g:1163:1: rulePayload returns [EObject current=null] : ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_types_0_0 = null;

        AntlrDatatypeRuleToken lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1169:2: ( ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* ) )
            // InternalMyDsl.g:1170:2: ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* )
            {
            // InternalMyDsl.g:1170:2: ( ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )* )
            // InternalMyDsl.g:1171:3: ( (lv_types_0_0= ruleType ) ) (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )*
            {
            // InternalMyDsl.g:1171:3: ( (lv_types_0_0= ruleType ) )
            // InternalMyDsl.g:1172:4: (lv_types_0_0= ruleType )
            {
            // InternalMyDsl.g:1172:4: (lv_types_0_0= ruleType )
            // InternalMyDsl.g:1173:5: lv_types_0_0= ruleType
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

            // InternalMyDsl.g:1190:3: (otherlv_1= ',' ( (lv_types_2_0= ruleType ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1191:4: otherlv_1= ',' ( (lv_types_2_0= ruleType ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_28); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPayloadAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1195:4: ( (lv_types_2_0= ruleType ) )
            	    // InternalMyDsl.g:1196:5: (lv_types_2_0= ruleType )
            	    {
            	    // InternalMyDsl.g:1196:5: (lv_types_2_0= ruleType )
            	    // InternalMyDsl.g:1197:6: lv_types_2_0= ruleType
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
    // InternalMyDsl.g:1219:1: entryRuleLocalProtocol returns [EObject current=null] : iv_ruleLocalProtocol= ruleLocalProtocol EOF ;
    public final EObject entryRuleLocalProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalProtocol = null;


        try {
            // InternalMyDsl.g:1219:54: (iv_ruleLocalProtocol= ruleLocalProtocol EOF )
            // InternalMyDsl.g:1220:2: iv_ruleLocalProtocol= ruleLocalProtocol EOF
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
    // InternalMyDsl.g:1226:1: ruleLocalProtocol returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' ) ;
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
            // InternalMyDsl.g:1232:2: ( (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1233:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1233:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1234:3: otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalProtocolAccess().getLocalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:1242:3: ( (lv_protocolName_2_0= RULE_ID ) )
            // InternalMyDsl.g:1243:4: (lv_protocolName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1243:4: (lv_protocolName_2_0= RULE_ID )
            // InternalMyDsl.g:1244:5: lv_protocolName_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalProtocolAccess().getAtKeyword_3());
            		
            // InternalMyDsl.g:1264:3: ( (lv_projectedRole_4_0= RULE_ID ) )
            // InternalMyDsl.g:1265:4: (lv_projectedRole_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1265:4: (lv_projectedRole_4_0= RULE_ID )
            // InternalMyDsl.g:1266:5: lv_projectedRole_4_0= RULE_ID
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
            		
            // InternalMyDsl.g:1286:3: ( (lv_roles_6_0= ruleRoles ) )
            // InternalMyDsl.g:1287:4: (lv_roles_6_0= ruleRoles )
            {
            // InternalMyDsl.g:1287:4: (lv_roles_6_0= ruleRoles )
            // InternalMyDsl.g:1288:5: lv_roles_6_0= ruleRoles
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

            otherlv_7=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_8, grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1313:3: ( (lv_protocol_9_0= ruleProtocolL ) )
            // InternalMyDsl.g:1314:4: (lv_protocol_9_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1314:4: (lv_protocol_9_0= ruleProtocolL )
            // InternalMyDsl.g:1315:5: lv_protocol_9_0= ruleProtocolL
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
    // InternalMyDsl.g:1340:1: entryRuleProtocolL returns [EObject current=null] : iv_ruleProtocolL= ruleProtocolL EOF ;
    public final EObject entryRuleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolL = null;


        try {
            // InternalMyDsl.g:1340:50: (iv_ruleProtocolL= ruleProtocolL EOF )
            // InternalMyDsl.g:1341:2: iv_ruleProtocolL= ruleProtocolL EOF
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
    // InternalMyDsl.g:1347:1: ruleProtocolL returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )* (otherlv_2= 'End' )? ) ;
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
            // InternalMyDsl.g:1353:2: ( ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )* (otherlv_2= 'End' )? ) )
            // InternalMyDsl.g:1354:2: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )* (otherlv_2= 'End' )? )
            {
            // InternalMyDsl.g:1354:2: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )* (otherlv_2= 'End' )? )
            // InternalMyDsl.g:1355:3: () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )* (otherlv_2= 'End' )?
            {
            // InternalMyDsl.g:1355:3: ()
            // InternalMyDsl.g:1356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolLAccess().getProtocolLAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1362:3: ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==21||LA11_0==23||LA11_0==28||LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1363:4: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) )
            	    {
            	    // InternalMyDsl.g:1363:4: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion ) )
            	    // InternalMyDsl.g:1364:5: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion )
            	    {
            	    // InternalMyDsl.g:1364:5: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursionL | lv_actions_1_5= ruleCloseRecursion )
            	    int alt10=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt10=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // InternalMyDsl.g:1365:6: lv_actions_1_1= ruleMessageL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsMessageLParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_30);
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
            	            // InternalMyDsl.g:1381:6: lv_actions_1_2= ruleChoiceL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsChoiceLParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_30);
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
            	            // InternalMyDsl.g:1397:6: lv_actions_1_3= ruleForEachL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsForEachLParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_30);
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
            	            // InternalMyDsl.g:1413:6: lv_actions_1_4= ruleRecursionL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsRecursionLParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_30);
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
            	            // InternalMyDsl.g:1429:6: lv_actions_1_5= ruleCloseRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsCloseRecursionParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_30);
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
            	    break loop11;
                }
            } while (true);

            // InternalMyDsl.g:1447:3: (otherlv_2= 'End' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1448:4: otherlv_2= 'End'
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
    // InternalMyDsl.g:1457:1: entryRuleRecursionL returns [EObject current=null] : iv_ruleRecursionL= ruleRecursionL EOF ;
    public final EObject entryRuleRecursionL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursionL = null;


        try {
            // InternalMyDsl.g:1457:51: (iv_ruleRecursionL= ruleRecursionL EOF )
            // InternalMyDsl.g:1458:2: iv_ruleRecursionL= ruleRecursionL EOF
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
    // InternalMyDsl.g:1464:1: ruleRecursionL returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:1470:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1471:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1471:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1472:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_recProtocol_4_0= ruleProtocolL ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionLAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:1476:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1477:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1477:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1478:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getRecursionLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1502:3: ( (lv_recProtocol_4_0= ruleProtocolL ) )
            // InternalMyDsl.g:1503:4: (lv_recProtocol_4_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1503:4: (lv_recProtocol_4_0= ruleProtocolL )
            // InternalMyDsl.g:1504:5: lv_recProtocol_4_0= ruleProtocolL
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
    // InternalMyDsl.g:1529:1: entryRuleMessageL returns [EObject current=null] : iv_ruleMessageL= ruleMessageL EOF ;
    public final EObject entryRuleMessageL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageL = null;


        try {
            // InternalMyDsl.g:1529:49: (iv_ruleMessageL= ruleMessageL EOF )
            // InternalMyDsl.g:1530:2: iv_ruleMessageL= ruleMessageL EOF
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
    // InternalMyDsl.g:1536:1: ruleMessageL returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_sendReceive_4_0= ruleMessageType ) ) otherlv_5= '.' ) ;
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
            // InternalMyDsl.g:1542:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_sendReceive_4_0= ruleMessageType ) ) otherlv_5= '.' ) )
            // InternalMyDsl.g:1543:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_sendReceive_4_0= ruleMessageType ) ) otherlv_5= '.' )
            {
            // InternalMyDsl.g:1543:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_sendReceive_4_0= ruleMessageType ) ) otherlv_5= '.' )
            // InternalMyDsl.g:1544:3: ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_sendReceive_4_0= ruleMessageType ) ) otherlv_5= '.'
            {
            // InternalMyDsl.g:1544:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:1545:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1545:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:1546:5: lv_messageType_0_0= RULE_ID
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
            		
            // InternalMyDsl.g:1566:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=39 && LA13_0<=41)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1567:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:1567:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:1568:5: lv_payload_2_0= rulePayload
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

            otherlv_3=(Token)match(input,31,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageLAccess().getRightParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1589:3: ( (lv_sendReceive_4_0= ruleMessageType ) )
            // InternalMyDsl.g:1590:4: (lv_sendReceive_4_0= ruleMessageType )
            {
            // InternalMyDsl.g:1590:4: (lv_sendReceive_4_0= ruleMessageType )
            // InternalMyDsl.g:1591:5: lv_sendReceive_4_0= ruleMessageType
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

            otherlv_5=(Token)match(input,35,FOLLOW_2); 

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
    // InternalMyDsl.g:1616:1: entryRuleMessageType returns [EObject current=null] : iv_ruleMessageType= ruleMessageType EOF ;
    public final EObject entryRuleMessageType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageType = null;


        try {
            // InternalMyDsl.g:1616:52: (iv_ruleMessageType= ruleMessageType EOF )
            // InternalMyDsl.g:1617:2: iv_ruleMessageType= ruleMessageType EOF
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
    // InternalMyDsl.g:1623:1: ruleMessageType returns [EObject current=null] : (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL ) ;
    public final EObject ruleMessageType() throws RecognitionException {
        EObject current = null;

        EObject this_SenderL_0 = null;

        EObject this_ReceiverL_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1629:2: ( (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL ) )
            // InternalMyDsl.g:1630:2: (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL )
            {
            // InternalMyDsl.g:1630:2: (this_SenderL_0= ruleSenderL | this_ReceiverL_1= ruleReceiverL )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1631:3: this_SenderL_0= ruleSenderL
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
                    // InternalMyDsl.g:1640:3: this_ReceiverL_1= ruleReceiverL
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
    // InternalMyDsl.g:1652:1: entryRuleSenderL returns [EObject current=null] : iv_ruleSenderL= ruleSenderL EOF ;
    public final EObject entryRuleSenderL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenderL = null;


        try {
            // InternalMyDsl.g:1652:48: (iv_ruleSenderL= ruleSenderL EOF )
            // InternalMyDsl.g:1653:2: iv_ruleSenderL= ruleSenderL EOF
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
    // InternalMyDsl.g:1659:1: ruleSenderL returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSenderL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1665:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1666:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1666:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1667:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSenderLAccess().getFromKeyword_0());
            		
            // InternalMyDsl.g:1671:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1672:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1672:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1673:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:1688:1: entryRuleReceiverL returns [EObject current=null] : iv_ruleReceiverL= ruleReceiverL EOF ;
    public final EObject entryRuleReceiverL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverL = null;


        try {
            // InternalMyDsl.g:1688:50: (iv_ruleReceiverL= ruleReceiverL EOF )
            // InternalMyDsl.g:1689:2: iv_ruleReceiverL= ruleReceiverL EOF
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
    // InternalMyDsl.g:1695:1: ruleReceiverL returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReceiverL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1701:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1702:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1702:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1703:3: otherlv_0= 'to' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiverLAccess().getToKeyword_0());
            		
            // InternalMyDsl.g:1707:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1708:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1708:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1709:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:1724:1: entryRuleChoiceL returns [EObject current=null] : iv_ruleChoiceL= ruleChoiceL EOF ;
    public final EObject entryRuleChoiceL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceL = null;


        try {
            // InternalMyDsl.g:1724:48: (iv_ruleChoiceL= ruleChoiceL EOF )
            // InternalMyDsl.g:1725:2: iv_ruleChoiceL= ruleChoiceL EOF
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
    // InternalMyDsl.g:1731:1: ruleChoiceL returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* ) ;
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
            // InternalMyDsl.g:1737:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* ) )
            // InternalMyDsl.g:1738:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* )
            {
            // InternalMyDsl.g:1738:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* )
            // InternalMyDsl.g:1739:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceLAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceLAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:1747:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1748:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1748:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1749:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceLRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1764:3: ( (lv_branches_4_0= ruleChoiceBranchL ) )
            // InternalMyDsl.g:1765:4: (lv_branches_4_0= ruleChoiceBranchL )
            {
            // InternalMyDsl.g:1765:4: (lv_branches_4_0= ruleChoiceBranchL )
            // InternalMyDsl.g:1766:5: lv_branches_4_0= ruleChoiceBranchL
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
            		
            // InternalMyDsl.g:1787:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1788:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoiceLAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,22,FOLLOW_32); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalMyDsl.g:1796:4: ( (lv_branches_8_0= ruleChoiceBranchL ) )
            	    // InternalMyDsl.g:1797:5: (lv_branches_8_0= ruleChoiceBranchL )
            	    {
            	    // InternalMyDsl.g:1797:5: (lv_branches_8_0= ruleChoiceBranchL )
            	    // InternalMyDsl.g:1798:6: lv_branches_8_0= ruleChoiceBranchL
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
            	    break loop15;
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
    // InternalMyDsl.g:1824:1: entryRuleChoiceBranchL returns [EObject current=null] : iv_ruleChoiceBranchL= ruleChoiceBranchL EOF ;
    public final EObject entryRuleChoiceBranchL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceBranchL = null;


        try {
            // InternalMyDsl.g:1824:54: (iv_ruleChoiceBranchL= ruleChoiceBranchL EOF )
            // InternalMyDsl.g:1825:2: iv_ruleChoiceBranchL= ruleChoiceBranchL EOF
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
    // InternalMyDsl.g:1831:1: ruleChoiceBranchL returns [EObject current=null] : ( ( () otherlv_1= 'End' ) | ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) ) ) ;
    public final EObject ruleChoiceBranchL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_message_2_0 = null;

        EObject lv_protocol_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1837:2: ( ( ( () otherlv_1= 'End' ) | ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) ) ) )
            // InternalMyDsl.g:1838:2: ( ( () otherlv_1= 'End' ) | ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) ) )
            {
            // InternalMyDsl.g:1838:2: ( ( () otherlv_1= 'End' ) | ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1839:3: ( () otherlv_1= 'End' )
                    {
                    // InternalMyDsl.g:1839:3: ( () otherlv_1= 'End' )
                    // InternalMyDsl.g:1840:4: () otherlv_1= 'End'
                    {
                    // InternalMyDsl.g:1840:4: ()
                    // InternalMyDsl.g:1841:5: 
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
                    // InternalMyDsl.g:1853:3: ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) )
                    {
                    // InternalMyDsl.g:1853:3: ( ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) ) )
                    // InternalMyDsl.g:1854:4: ( (lv_message_2_0= ruleMessageL ) ) ( (lv_protocol_3_0= ruleProtocolL ) )
                    {
                    // InternalMyDsl.g:1854:4: ( (lv_message_2_0= ruleMessageL ) )
                    // InternalMyDsl.g:1855:5: (lv_message_2_0= ruleMessageL )
                    {
                    // InternalMyDsl.g:1855:5: (lv_message_2_0= ruleMessageL )
                    // InternalMyDsl.g:1856:6: lv_message_2_0= ruleMessageL
                    {

                    						newCompositeNode(grammarAccess.getChoiceBranchLAccess().getMessageMessageLParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalMyDsl.g:1873:4: ( (lv_protocol_3_0= ruleProtocolL ) )
                    // InternalMyDsl.g:1874:5: (lv_protocol_3_0= ruleProtocolL )
                    {
                    // InternalMyDsl.g:1874:5: (lv_protocol_3_0= ruleProtocolL )
                    // InternalMyDsl.g:1875:6: lv_protocol_3_0= ruleProtocolL
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
    // InternalMyDsl.g:1897:1: entryRuleForEachL returns [EObject current=null] : iv_ruleForEachL= ruleForEachL EOF ;
    public final EObject entryRuleForEachL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachL = null;


        try {
            // InternalMyDsl.g:1897:49: (iv_ruleForEachL= ruleForEachL EOF )
            // InternalMyDsl.g:1898:2: iv_ruleForEachL= ruleForEachL EOF
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
    // InternalMyDsl.g:1904:1: ruleForEachL returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' ) ;
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
            // InternalMyDsl.g:1910:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1911:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1911:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1912:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '>' otherlv_8= '{' ( (lv_branch_9_0= ruleProtocolL ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachLAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:1916:3: ( (lv_eachRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:1917:4: (lv_eachRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:1917:4: (lv_eachRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:1918:5: lv_eachRole_1_0= ruleRoleOne
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
            		
            // InternalMyDsl.g:1943:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:1944:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:1944:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:1945:5: otherlv_4= RULE_ID
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
            		
            // InternalMyDsl.g:1960:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:1961:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:1961:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:1962:5: otherlv_6= RULE_ID
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
            		
            otherlv_8=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_8, grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1981:3: ( (lv_branch_9_0= ruleProtocolL ) )
            // InternalMyDsl.g:1982:4: (lv_branch_9_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1982:4: (lv_branch_9_0= ruleProtocolL )
            // InternalMyDsl.g:1983:5: lv_branch_9_0= ruleProtocolL
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
    // InternalMyDsl.g:2008:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:2008:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:2009:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:2015:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'action' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2021:2: ( (kw= 'int' | kw= 'string' | kw= 'action' ) )
            // InternalMyDsl.g:2022:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            {
            // InternalMyDsl.g:2022:2: (kw= 'int' | kw= 'string' | kw= 'action' )
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
                    // InternalMyDsl.g:2023:3: kw= 'int'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2029:3: kw= 'string'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2035:3: kw= 'action'
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
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004010B08010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004010B00012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004010B00010L});

}