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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'roleset'", "':'", "'rec'", "'loop'", "';'", "'foreach'", "'{'", "'choice'", "'at'", "'or'", "')'", "'from'", "'to'", "'local'", "'int'", "'string'", "'action'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
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
            else if ( (LA1_0==31) ) {
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
    // InternalMyDsl.g:422:1: ruleProtocol returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_1_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:428:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* ) )
            // InternalMyDsl.g:429:2: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* )
            {
            // InternalMyDsl.g:429:2: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* )
            // InternalMyDsl.g:430:3: () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )*
            {
            // InternalMyDsl.g:430:3: ()
            // InternalMyDsl.g:431:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolAccess().getProtocolAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:437:3: ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=20 && LA5_0<=21)||LA5_0==23||LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:438:4: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) )
            	    {
            	    // InternalMyDsl.g:438:4: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) )
            	    // InternalMyDsl.g:439:5: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion )
            	    {
            	    // InternalMyDsl.g:439:5: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion )
            	    int alt4=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt4=4;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt4=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // InternalMyDsl.g:440:6: lv_actions_1_1= ruleMessage
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_1_0_0());
            	            					
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
            	            // InternalMyDsl.g:456:6: lv_actions_1_2= ruleChoice
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsChoiceParserRuleCall_1_0_1());
            	            					
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
            	            // InternalMyDsl.g:472:6: lv_actions_1_3= ruleRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_1_0_2());
            	            					
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
            	            // InternalMyDsl.g:488:6: lv_actions_1_4= ruleForEach
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_1_0_3());
            	            					
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
            	        case 5 :
            	            // InternalMyDsl.g:504:6: lv_actions_1_5= ruleCloseRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_12);
            	            lv_actions_1_5=ruleCloseRecursion();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleRecursion"
    // InternalMyDsl.g:526:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalMyDsl.g:526:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalMyDsl.g:527:2: iv_ruleRecursion= ruleRecursion EOF
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
    // InternalMyDsl.g:533:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:539:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            // InternalMyDsl.g:540:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' )
            {
            // InternalMyDsl.g:540:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' )
            // InternalMyDsl.g:541:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:545:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:546:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:546:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:547:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRecursionAccess().getColonKeyword_2());
            		

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
    // InternalMyDsl.g:571:1: entryRuleCloseRecursion returns [EObject current=null] : iv_ruleCloseRecursion= ruleCloseRecursion EOF ;
    public final EObject entryRuleCloseRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursion = null;


        try {
            // InternalMyDsl.g:571:55: (iv_ruleCloseRecursion= ruleCloseRecursion EOF )
            // InternalMyDsl.g:572:2: iv_ruleCloseRecursion= ruleCloseRecursion EOF
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
    // InternalMyDsl.g:578:1: ruleCloseRecursion returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleCloseRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:584:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:585:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:585:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:586:3: otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:590:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:591:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:591:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:592:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseRecursionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCloseRecursionAccess().getSemicolonKeyword_2());
            		

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
    // InternalMyDsl.g:611:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalMyDsl.g:611:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalMyDsl.g:612:2: iv_ruleForEach= ruleForEach EOF
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
    // InternalMyDsl.g:618:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) ;
    public final EObject ruleForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_eachRole_1_0 = null;

        EObject lv_branch_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:624:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:625:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:625:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            // InternalMyDsl.g:626:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:630:3: ( (lv_eachRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:631:4: (lv_eachRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:631:4: (lv_eachRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:632:5: lv_eachRole_1_0= ruleRoleOne
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getEachRoleRoleOneParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_eachRole_1_0=ruleRoleOne();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"eachRole",
            						lv_eachRole_1_0,
            						"org.xtext.globalTypes.MyDsl.RoleOne");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:653:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:654:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:654:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:655:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getRoleRoleSetCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:670:3: ( (lv_branch_5_0= ruleProtocol ) )
            // InternalMyDsl.g:671:4: (lv_branch_5_0= ruleProtocol )
            {
            // InternalMyDsl.g:671:4: (lv_branch_5_0= ruleProtocol )
            // InternalMyDsl.g:672:5: lv_branch_5_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_branch_5_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"branch",
            						lv_branch_5_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:697:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalMyDsl.g:697:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalMyDsl.g:698:2: iv_ruleChoice= ruleChoice EOF
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
    // InternalMyDsl.g:704:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_message_4_0 = null;

        EObject lv_branches_5_0 = null;

        EObject lv_message_9_0 = null;

        EObject lv_branches_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:710:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) )
            // InternalMyDsl.g:711:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            {
            // InternalMyDsl.g:711:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            // InternalMyDsl.g:712:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:720:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:721:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:721:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:722:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:737:3: ( (lv_message_4_0= ruleMessage ) )
            // InternalMyDsl.g:738:4: (lv_message_4_0= ruleMessage )
            {
            // InternalMyDsl.g:738:4: (lv_message_4_0= ruleMessage )
            // InternalMyDsl.g:739:5: lv_message_4_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getChoiceAccess().getMessageMessageParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_message_4_0=ruleMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceRule());
            					}
            					add(
            						current,
            						"message",
            						lv_message_4_0,
            						"org.xtext.globalTypes.MyDsl.Message");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:756:3: ( (lv_branches_5_0= ruleProtocol ) )
            // InternalMyDsl.g:757:4: (lv_branches_5_0= ruleProtocol )
            {
            // InternalMyDsl.g:757:4: (lv_branches_5_0= ruleProtocol )
            // InternalMyDsl.g:758:5: lv_branches_5_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getChoiceAccess().getBranchesProtocolParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_branches_5_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_5_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:779:3: (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:780:4: otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}'
            	    {
            	    otherlv_7=(Token)match(input,27,FOLLOW_15); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getOrKeyword_7_0());
            	    			
            	    otherlv_8=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_7_1());
            	    			
            	    // InternalMyDsl.g:788:4: ( (lv_message_9_0= ruleMessage ) )
            	    // InternalMyDsl.g:789:5: (lv_message_9_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:789:5: (lv_message_9_0= ruleMessage )
            	    // InternalMyDsl.g:790:6: lv_message_9_0= ruleMessage
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceAccess().getMessageMessageParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_message_9_0=ruleMessage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"message",
            	    							lv_message_9_0,
            	    							"org.xtext.globalTypes.MyDsl.Message");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:807:4: ( (lv_branches_10_0= ruleProtocol ) )
            	    // InternalMyDsl.g:808:5: (lv_branches_10_0= ruleProtocol )
            	    {
            	    // InternalMyDsl.g:808:5: (lv_branches_10_0= ruleProtocol )
            	    // InternalMyDsl.g:809:6: lv_branches_10_0= ruleProtocol
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceAccess().getBranchesProtocolParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_branches_10_0=ruleProtocol();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_10_0,
            	    							"org.xtext.globalTypes.MyDsl.Protocol");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_11, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_7_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:835:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:835:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:836:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:842:1: ruleMessage returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) ;
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
            // InternalMyDsl.g:848:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) )
            // InternalMyDsl.g:849:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:849:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            // InternalMyDsl.g:850:3: ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';'
            {
            // InternalMyDsl.g:850:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:851:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:851:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:852:5: lv_messageType_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:872:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=32 && LA7_0<=34)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:873:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:873:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:874:5: lv_payload_2_0= rulePayload
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getPayloadPayloadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_19);
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

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getFromKeyword_4());
            		
            // InternalMyDsl.g:899:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:900:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:900:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:901:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getToKeyword_6());
            		
            // InternalMyDsl.g:916:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:917:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:917:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:918:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getReceiverRoleOneCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getSemicolonKeyword_8());
            		

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
    // InternalMyDsl.g:937:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalMyDsl.g:937:48: (iv_rulePayload= rulePayload EOF )
            // InternalMyDsl.g:938:2: iv_rulePayload= rulePayload EOF
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
    // InternalMyDsl.g:944:1: rulePayload returns [EObject current=null] : ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_types_4_0=null;
        AntlrDatatypeRuleToken lv_types_1_0 = null;

        AntlrDatatypeRuleToken lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:950:2: ( ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:951:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:951:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=32 && LA9_0<=34)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:952:3: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
                    {
                    // InternalMyDsl.g:952:3: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
                    // InternalMyDsl.g:953:4: () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
                    {
                    // InternalMyDsl.g:953:4: ()
                    // InternalMyDsl.g:954:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPayloadAccess().getPayloadAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:960:4: ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
                    // InternalMyDsl.g:961:5: ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
                    {
                    // InternalMyDsl.g:961:5: ( (lv_types_1_0= ruleType ) )
                    // InternalMyDsl.g:962:6: (lv_types_1_0= ruleType )
                    {
                    // InternalMyDsl.g:962:6: (lv_types_1_0= ruleType )
                    // InternalMyDsl.g:963:7: lv_types_1_0= ruleType
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

                    // InternalMyDsl.g:980:5: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:981:6: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_22); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getPayloadAccess().getCommaKeyword_0_1_1_0());
                    	    					
                    	    // InternalMyDsl.g:985:6: ( (lv_types_3_0= ruleType ) )
                    	    // InternalMyDsl.g:986:7: (lv_types_3_0= ruleType )
                    	    {
                    	    // InternalMyDsl.g:986:7: (lv_types_3_0= ruleType )
                    	    // InternalMyDsl.g:987:8: lv_types_3_0= ruleType
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
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1008:3: ( (lv_types_4_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1008:3: ( (lv_types_4_0= RULE_ID ) )
                    // InternalMyDsl.g:1009:4: (lv_types_4_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1009:4: (lv_types_4_0= RULE_ID )
                    // InternalMyDsl.g:1010:5: lv_types_4_0= RULE_ID
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
    // InternalMyDsl.g:1030:1: entryRuleLocalProtocol returns [EObject current=null] : iv_ruleLocalProtocol= ruleLocalProtocol EOF ;
    public final EObject entryRuleLocalProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalProtocol = null;


        try {
            // InternalMyDsl.g:1030:54: (iv_ruleLocalProtocol= ruleLocalProtocol EOF )
            // InternalMyDsl.g:1031:2: iv_ruleLocalProtocol= ruleLocalProtocol EOF
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
    // InternalMyDsl.g:1037:1: ruleLocalProtocol returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' ) ;
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
            // InternalMyDsl.g:1043:2: ( (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1044:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1044:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1045:3: otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalProtocolAccess().getLocalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:1053:3: ( (lv_protocolName_2_0= RULE_ID ) )
            // InternalMyDsl.g:1054:4: (lv_protocolName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1054:4: (lv_protocolName_2_0= RULE_ID )
            // InternalMyDsl.g:1055:5: lv_protocolName_2_0= RULE_ID
            {
            lv_protocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_3=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalProtocolAccess().getAtKeyword_3());
            		
            // InternalMyDsl.g:1075:3: ( (lv_projectedRole_4_0= RULE_ID ) )
            // InternalMyDsl.g:1076:4: (lv_projectedRole_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1076:4: (lv_projectedRole_4_0= RULE_ID )
            // InternalMyDsl.g:1077:5: lv_projectedRole_4_0= RULE_ID
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
            		
            // InternalMyDsl.g:1097:3: ( (lv_roles_6_0= ruleRoles ) )
            // InternalMyDsl.g:1098:4: (lv_roles_6_0= ruleRoles )
            {
            // InternalMyDsl.g:1098:4: (lv_roles_6_0= ruleRoles )
            // InternalMyDsl.g:1099:5: lv_roles_6_0= ruleRoles
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getRolesRolesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_7=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1124:3: ( (lv_protocol_9_0= ruleProtocolL ) )
            // InternalMyDsl.g:1125:4: (lv_protocol_9_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1125:4: (lv_protocol_9_0= ruleProtocolL )
            // InternalMyDsl.g:1126:5: lv_protocol_9_0= ruleProtocolL
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
    // InternalMyDsl.g:1151:1: entryRuleProtocolL returns [EObject current=null] : iv_ruleProtocolL= ruleProtocolL EOF ;
    public final EObject entryRuleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolL = null;


        try {
            // InternalMyDsl.g:1151:50: (iv_ruleProtocolL= ruleProtocolL EOF )
            // InternalMyDsl.g:1152:2: iv_ruleProtocolL= ruleProtocolL EOF
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
    // InternalMyDsl.g:1158:1: ruleProtocolL returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* ) ;
    public final EObject ruleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_1_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1164:2: ( ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* ) )
            // InternalMyDsl.g:1165:2: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* )
            {
            // InternalMyDsl.g:1165:2: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* )
            // InternalMyDsl.g:1166:3: () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )*
            {
            // InternalMyDsl.g:1166:3: ()
            // InternalMyDsl.g:1167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolLAccess().getProtocolLAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1173:3: ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=20 && LA11_0<=21)||LA11_0==23||LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1174:4: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) )
            	    {
            	    // InternalMyDsl.g:1174:4: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) )
            	    // InternalMyDsl.g:1175:5: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion )
            	    {
            	    // InternalMyDsl.g:1175:5: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion )
            	    int alt10=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    case 21:
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
            	            // InternalMyDsl.g:1176:6: lv_actions_1_1= ruleMessageL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsMessageLParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_12);
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
            	            // InternalMyDsl.g:1192:6: lv_actions_1_2= ruleChoiceL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsChoiceLParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_12);
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
            	            // InternalMyDsl.g:1208:6: lv_actions_1_3= ruleForEachL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsForEachLParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_12);
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
            	            // InternalMyDsl.g:1224:6: lv_actions_1_4= ruleRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsRecursionParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_12);
            	            lv_actions_1_4=ruleRecursion();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolLRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_4,
            	            							"org.xtext.globalTypes.MyDsl.Recursion");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalMyDsl.g:1240:6: lv_actions_1_5= ruleCloseRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsCloseRecursionParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_12);
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


    // $ANTLR start "entryRuleMessageL"
    // InternalMyDsl.g:1262:1: entryRuleMessageL returns [EObject current=null] : iv_ruleMessageL= ruleMessageL EOF ;
    public final EObject entryRuleMessageL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageL = null;


        try {
            // InternalMyDsl.g:1262:49: (iv_ruleMessageL= ruleMessageL EOF )
            // InternalMyDsl.g:1263:2: iv_ruleMessageL= ruleMessageL EOF
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
    // InternalMyDsl.g:1269:1: ruleMessageL returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' ) ;
    public final EObject ruleMessageL() throws RecognitionException {
        EObject current = null;

        Token lv_messageType_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_payload_2_0 = null;

        EObject lv_target_4_0 = null;

        EObject lv_target_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1275:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' ) )
            // InternalMyDsl.g:1276:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' )
            {
            // InternalMyDsl.g:1276:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' )
            // InternalMyDsl.g:1277:3: ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';'
            {
            // InternalMyDsl.g:1277:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:1278:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1278:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:1279:5: lv_messageType_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageLAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1299:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=32 && LA12_0<=34)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1300:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:1300:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:1301:5: lv_payload_2_0= rulePayload
                    {

                    					newCompositeNode(grammarAccess.getMessageLAccess().getPayloadPayloadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_19);
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

            otherlv_3=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageLAccess().getRightParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1322:3: ( (lv_target_4_0= ruleSenderL ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1323:4: (lv_target_4_0= ruleSenderL )
                    {
                    // InternalMyDsl.g:1323:4: (lv_target_4_0= ruleSenderL )
                    // InternalMyDsl.g:1324:5: lv_target_4_0= ruleSenderL
                    {

                    					newCompositeNode(grammarAccess.getMessageLAccess().getTargetSenderLParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_target_4_0=ruleSenderL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageLRule());
                    					}
                    					add(
                    						current,
                    						"target",
                    						lv_target_4_0,
                    						"org.xtext.globalTypes.MyDsl.SenderL");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1341:3: ( (lv_target_5_0= ruleReceiverL ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1342:4: (lv_target_5_0= ruleReceiverL )
                    {
                    // InternalMyDsl.g:1342:4: (lv_target_5_0= ruleReceiverL )
                    // InternalMyDsl.g:1343:5: lv_target_5_0= ruleReceiverL
                    {

                    					newCompositeNode(grammarAccess.getMessageLAccess().getTargetReceiverLParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_target_5_0=ruleReceiverL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageLRule());
                    					}
                    					add(
                    						current,
                    						"target",
                    						lv_target_5_0,
                    						"org.xtext.globalTypes.MyDsl.ReceiverL");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageLAccess().getSemicolonKeyword_6());
            		

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


    // $ANTLR start "entryRuleSenderL"
    // InternalMyDsl.g:1368:1: entryRuleSenderL returns [EObject current=null] : iv_ruleSenderL= ruleSenderL EOF ;
    public final EObject entryRuleSenderL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenderL = null;


        try {
            // InternalMyDsl.g:1368:48: (iv_ruleSenderL= ruleSenderL EOF )
            // InternalMyDsl.g:1369:2: iv_ruleSenderL= ruleSenderL EOF
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
    // InternalMyDsl.g:1375:1: ruleSenderL returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSenderL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1381:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1382:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1382:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1383:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSenderLAccess().getFromKeyword_0());
            		
            // InternalMyDsl.g:1387:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1388:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1388:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1389:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSenderLRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSenderLAccess().getSenderRoleCrossReference_1_0());
            				

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
    // InternalMyDsl.g:1404:1: entryRuleReceiverL returns [EObject current=null] : iv_ruleReceiverL= ruleReceiverL EOF ;
    public final EObject entryRuleReceiverL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverL = null;


        try {
            // InternalMyDsl.g:1404:50: (iv_ruleReceiverL= ruleReceiverL EOF )
            // InternalMyDsl.g:1405:2: iv_ruleReceiverL= ruleReceiverL EOF
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
    // InternalMyDsl.g:1411:1: ruleReceiverL returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReceiverL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1417:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1418:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1418:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1419:3: otherlv_0= 'to' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiverLAccess().getToKeyword_0());
            		
            // InternalMyDsl.g:1423:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1424:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1424:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1425:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReceiverLRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getReceiverLAccess().getToRoleCrossReference_1_0());
            				

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
    // InternalMyDsl.g:1440:1: entryRuleChoiceL returns [EObject current=null] : iv_ruleChoiceL= ruleChoiceL EOF ;
    public final EObject entryRuleChoiceL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceL = null;


        try {
            // InternalMyDsl.g:1440:48: (iv_ruleChoiceL= ruleChoiceL EOF )
            // InternalMyDsl.g:1441:2: iv_ruleChoiceL= ruleChoiceL EOF
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
    // InternalMyDsl.g:1447:1: ruleChoiceL returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* ) ;
    public final EObject ruleChoiceL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_message_4_0 = null;

        EObject lv_branches_5_0 = null;

        EObject lv_message_9_0 = null;

        EObject lv_branches_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1453:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* ) )
            // InternalMyDsl.g:1454:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* )
            {
            // InternalMyDsl.g:1454:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* )
            // InternalMyDsl.g:1455:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceLAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceLAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:1463:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1464:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1464:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1465:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceLRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceLAccess().getRoleRoleCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1480:3: ( (lv_message_4_0= ruleMessageL ) )
            // InternalMyDsl.g:1481:4: (lv_message_4_0= ruleMessageL )
            {
            // InternalMyDsl.g:1481:4: (lv_message_4_0= ruleMessageL )
            // InternalMyDsl.g:1482:5: lv_message_4_0= ruleMessageL
            {

            					newCompositeNode(grammarAccess.getChoiceLAccess().getMessageMessageLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_message_4_0=ruleMessageL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceLRule());
            					}
            					add(
            						current,
            						"message",
            						lv_message_4_0,
            						"org.xtext.globalTypes.MyDsl.MessageL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1499:3: ( (lv_branches_5_0= ruleProtocolL ) )
            // InternalMyDsl.g:1500:4: (lv_branches_5_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1500:4: (lv_branches_5_0= ruleProtocolL )
            // InternalMyDsl.g:1501:5: lv_branches_5_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getChoiceLAccess().getBranchesProtocolLParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_branches_5_0=ruleProtocolL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceLRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_5_0,
            						"org.xtext.globalTypes.MyDsl.ProtocolL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:1522:3: (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1523:4: otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}'
            	    {
            	    otherlv_7=(Token)match(input,27,FOLLOW_15); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceLAccess().getOrKeyword_7_0());
            	    			
            	    otherlv_8=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_7_1());
            	    			
            	    // InternalMyDsl.g:1531:4: ( (lv_message_9_0= ruleMessageL ) )
            	    // InternalMyDsl.g:1532:5: (lv_message_9_0= ruleMessageL )
            	    {
            	    // InternalMyDsl.g:1532:5: (lv_message_9_0= ruleMessageL )
            	    // InternalMyDsl.g:1533:6: lv_message_9_0= ruleMessageL
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceLAccess().getMessageMessageLParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_message_9_0=ruleMessageL();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"message",
            	    							lv_message_9_0,
            	    							"org.xtext.globalTypes.MyDsl.MessageL");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:1550:4: ( (lv_branches_10_0= ruleProtocolL ) )
            	    // InternalMyDsl.g:1551:5: (lv_branches_10_0= ruleProtocolL )
            	    {
            	    // InternalMyDsl.g:1551:5: (lv_branches_10_0= ruleProtocolL )
            	    // InternalMyDsl.g:1552:6: lv_branches_10_0= ruleProtocolL
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceLAccess().getBranchesProtocolLParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_branches_10_0=ruleProtocolL();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_10_0,
            	    							"org.xtext.globalTypes.MyDsl.ProtocolL");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_11, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_7_4());
            	    			

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


    // $ANTLR start "entryRuleForEachL"
    // InternalMyDsl.g:1578:1: entryRuleForEachL returns [EObject current=null] : iv_ruleForEachL= ruleForEachL EOF ;
    public final EObject entryRuleForEachL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachL = null;


        try {
            // InternalMyDsl.g:1578:49: (iv_ruleForEachL= ruleForEachL EOF )
            // InternalMyDsl.g:1579:2: iv_ruleForEachL= ruleForEachL EOF
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
    // InternalMyDsl.g:1585:1: ruleForEachL returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' ) ;
    public final EObject ruleForEachL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_eachRole_1_0 = null;

        EObject lv_branch_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1591:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1592:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1592:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1593:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachLAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:1597:3: ( (lv_eachRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:1598:4: (lv_eachRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:1598:4: (lv_eachRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:1599:5: lv_eachRole_1_0= ruleRoleOne
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

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachLAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:1620:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1621:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1621:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1622:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachLRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_3, grammarAccess.getForEachLAccess().getRoleRoleSetCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1637:3: ( (lv_branch_5_0= ruleProtocolL ) )
            // InternalMyDsl.g:1638:4: (lv_branch_5_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1638:4: (lv_branch_5_0= ruleProtocolL )
            // InternalMyDsl.g:1639:5: lv_branch_5_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getForEachLAccess().getBranchProtocolLParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_branch_5_0=ruleProtocolL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachLRule());
            					}
            					set(
            						current,
            						"branch",
            						lv_branch_5_0,
            						"org.xtext.globalTypes.MyDsl.ProtocolL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForEachLAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:1664:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:1664:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:1665:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:1671:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'action' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1677:2: ( (kw= 'int' | kw= 'string' | kw= 'action' ) )
            // InternalMyDsl.g:1678:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            {
            // InternalMyDsl.g:1678:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1679:3: kw= 'int'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1685:3: kw= 'string'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1691:3: kw= 'action'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002B08010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002B00012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000710000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040400000L});

}