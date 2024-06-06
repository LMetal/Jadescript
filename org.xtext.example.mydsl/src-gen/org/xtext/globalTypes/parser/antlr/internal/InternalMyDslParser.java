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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'roleset'", "':'", "'rec'", "'{'", "'loop'", "';'", "'foreach'", "'choice'", "'at'", "'or'", "')'", "'from'", "'to'", "'local'", "'int'", "'string'", "'action'"
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
    // InternalMyDsl.g:422:1: ruleProtocol returns [EObject current=null] : ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ) | ( (lv_actions_2_0= ruleCloseRecursion ) ) ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:428:2: ( ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ) | ( (lv_actions_2_0= ruleCloseRecursion ) ) ) )
            // InternalMyDsl.g:429:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ) | ( (lv_actions_2_0= ruleCloseRecursion ) ) )
            {
            // InternalMyDsl.g:429:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* ) | ( (lv_actions_2_0= ruleCloseRecursion ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EOF||LA6_0==RULE_ID||LA6_0==15||LA6_0==20||(LA6_0>=24 && LA6_0<=25)) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:430:3: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* )
                    {
                    // InternalMyDsl.g:430:3: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )* )
                    // InternalMyDsl.g:431:4: () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach ) ) )*
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

                        if ( (LA5_0==RULE_ID||LA5_0==20||(LA5_0>=24 && LA5_0<=25)) ) {
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


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:509:3: ( (lv_actions_2_0= ruleCloseRecursion ) )
                    {
                    // InternalMyDsl.g:509:3: ( (lv_actions_2_0= ruleCloseRecursion ) )
                    // InternalMyDsl.g:510:4: (lv_actions_2_0= ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:510:4: (lv_actions_2_0= ruleCloseRecursion )
                    // InternalMyDsl.g:511:5: lv_actions_2_0= ruleCloseRecursion
                    {

                    					newCompositeNode(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actions_2_0=ruleCloseRecursion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProtocolRule());
                    					}
                    					add(
                    						current,
                    						"actions",
                    						lv_actions_2_0,
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
    // InternalMyDsl.g:532:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalMyDsl.g:532:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalMyDsl.g:533:2: iv_ruleRecursion= ruleRecursion EOF
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
    // InternalMyDsl.g:539:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_recProtocol_3_0= ruleProtocol ) ) otherlv_4= '}' ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_recProtocol_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:545:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_recProtocol_3_0= ruleProtocol ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:546:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_recProtocol_3_0= ruleProtocol ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:546:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_recProtocol_3_0= ruleProtocol ) ) otherlv_4= '}' )
            // InternalMyDsl.g:547:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_recProtocol_3_0= ruleProtocol ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:551:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:552:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:552:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:553:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRecursionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:573:3: ( (lv_recProtocol_3_0= ruleProtocol ) )
            // InternalMyDsl.g:574:4: (lv_recProtocol_3_0= ruleProtocol )
            {
            // InternalMyDsl.g:574:4: (lv_recProtocol_3_0= ruleProtocol )
            // InternalMyDsl.g:575:5: lv_recProtocol_3_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getRecursionAccess().getRecProtocolProtocolParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_recProtocol_3_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecursionRule());
            					}
            					set(
            						current,
            						"recProtocol",
            						lv_recProtocol_3_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRecursionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMyDsl.g:600:1: entryRuleCloseRecursion returns [EObject current=null] : iv_ruleCloseRecursion= ruleCloseRecursion EOF ;
    public final EObject entryRuleCloseRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursion = null;


        try {
            // InternalMyDsl.g:600:55: (iv_ruleCloseRecursion= ruleCloseRecursion EOF )
            // InternalMyDsl.g:601:2: iv_ruleCloseRecursion= ruleCloseRecursion EOF
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
    // InternalMyDsl.g:607:1: ruleCloseRecursion returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleCloseRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:613:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:614:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:614:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:615:3: otherlv_0= 'loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:619:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:620:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:620:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:621:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseRecursionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyDsl.g:640:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalMyDsl.g:640:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalMyDsl.g:641:2: iv_ruleForEach= ruleForEach EOF
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
    // InternalMyDsl.g:647:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:653:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:654:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:654:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            // InternalMyDsl.g:655:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:659:3: ( (lv_eachRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:660:4: (lv_eachRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:660:4: (lv_eachRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:661:5: lv_eachRole_1_0= ruleRoleOne
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
            		
            // InternalMyDsl.g:682:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:683:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:683:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:684:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getRoleRoleSetCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:699:3: ( (lv_branch_5_0= ruleProtocol ) )
            // InternalMyDsl.g:700:4: (lv_branch_5_0= ruleProtocol )
            {
            // InternalMyDsl.g:700:4: (lv_branch_5_0= ruleProtocol )
            // InternalMyDsl.g:701:5: lv_branch_5_0= ruleProtocol
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
    // InternalMyDsl.g:726:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalMyDsl.g:726:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalMyDsl.g:727:2: iv_ruleChoice= ruleChoice EOF
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
    // InternalMyDsl.g:733:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranch ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )* ) ;
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
            // InternalMyDsl.g:739:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranch ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )* ) )
            // InternalMyDsl.g:740:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranch ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )* )
            {
            // InternalMyDsl.g:740:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranch ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )* )
            // InternalMyDsl.g:741:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranch ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:749:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:750:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:750:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:751:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:766:3: ( (lv_branches_4_0= ruleChoiceBranch ) )
            // InternalMyDsl.g:767:4: (lv_branches_4_0= ruleChoiceBranch )
            {
            // InternalMyDsl.g:767:4: (lv_branches_4_0= ruleChoiceBranch )
            // InternalMyDsl.g:768:5: lv_branches_4_0= ruleChoiceBranch
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

            otherlv_5=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:789:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:790:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranch ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,21,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalMyDsl.g:798:4: ( (lv_branches_8_0= ruleChoiceBranch ) )
            	    // InternalMyDsl.g:799:5: (lv_branches_8_0= ruleChoiceBranch )
            	    {
            	    // InternalMyDsl.g:799:5: (lv_branches_8_0= ruleChoiceBranch )
            	    // InternalMyDsl.g:800:6: lv_branches_8_0= ruleChoiceBranch
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

            	    otherlv_9=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_9, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6_3());
            	    			

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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleChoiceBranch"
    // InternalMyDsl.g:826:1: entryRuleChoiceBranch returns [EObject current=null] : iv_ruleChoiceBranch= ruleChoiceBranch EOF ;
    public final EObject entryRuleChoiceBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceBranch = null;


        try {
            // InternalMyDsl.g:826:53: (iv_ruleChoiceBranch= ruleChoiceBranch EOF )
            // InternalMyDsl.g:827:2: iv_ruleChoiceBranch= ruleChoiceBranch EOF
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
    // InternalMyDsl.g:833:1: ruleChoiceBranch returns [EObject current=null] : ( ( (lv_message_0_0= ruleMessage ) ) ( (lv_protocol_1_0= ruleProtocol ) ) ) ;
    public final EObject ruleChoiceBranch() throws RecognitionException {
        EObject current = null;

        EObject lv_message_0_0 = null;

        EObject lv_protocol_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:839:2: ( ( ( (lv_message_0_0= ruleMessage ) ) ( (lv_protocol_1_0= ruleProtocol ) ) ) )
            // InternalMyDsl.g:840:2: ( ( (lv_message_0_0= ruleMessage ) ) ( (lv_protocol_1_0= ruleProtocol ) ) )
            {
            // InternalMyDsl.g:840:2: ( ( (lv_message_0_0= ruleMessage ) ) ( (lv_protocol_1_0= ruleProtocol ) ) )
            // InternalMyDsl.g:841:3: ( (lv_message_0_0= ruleMessage ) ) ( (lv_protocol_1_0= ruleProtocol ) )
            {
            // InternalMyDsl.g:841:3: ( (lv_message_0_0= ruleMessage ) )
            // InternalMyDsl.g:842:4: (lv_message_0_0= ruleMessage )
            {
            // InternalMyDsl.g:842:4: (lv_message_0_0= ruleMessage )
            // InternalMyDsl.g:843:5: lv_message_0_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getChoiceBranchAccess().getMessageMessageParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:860:3: ( (lv_protocol_1_0= ruleProtocol ) )
            // InternalMyDsl.g:861:4: (lv_protocol_1_0= ruleProtocol )
            {
            // InternalMyDsl.g:861:4: (lv_protocol_1_0= ruleProtocol )
            // InternalMyDsl.g:862:5: lv_protocol_1_0= ruleProtocol
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
    // InternalMyDsl.g:883:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:883:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:884:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:890:1: ruleMessage returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) ;
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
            // InternalMyDsl.g:896:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) )
            // InternalMyDsl.g:897:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:897:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            // InternalMyDsl.g:898:3: ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';'
            {
            // InternalMyDsl.g:898:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:899:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:899:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:900:5: lv_messageType_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:920:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=32 && LA8_0<=34)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:921:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:921:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:922:5: lv_payload_2_0= rulePayload
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getPayloadPayloadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_20);
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

            otherlv_3=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getFromKeyword_4());
            		
            // InternalMyDsl.g:947:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:948:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:948:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:949:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getToKeyword_6());
            		
            // InternalMyDsl.g:964:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:965:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:965:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:966:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getReceiverRoleOneCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyDsl.g:985:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalMyDsl.g:985:48: (iv_rulePayload= rulePayload EOF )
            // InternalMyDsl.g:986:2: iv_rulePayload= rulePayload EOF
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
    // InternalMyDsl.g:992:1: rulePayload returns [EObject current=null] : ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_types_4_0=null;
        AntlrDatatypeRuleToken lv_types_1_0 = null;

        AntlrDatatypeRuleToken lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:998:2: ( ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:999:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:999:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=32 && LA10_0<=34)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1000:3: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
                    {
                    // InternalMyDsl.g:1000:3: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
                    // InternalMyDsl.g:1001:4: () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
                    {
                    // InternalMyDsl.g:1001:4: ()
                    // InternalMyDsl.g:1002:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPayloadAccess().getPayloadAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1008:4: ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
                    // InternalMyDsl.g:1009:5: ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
                    {
                    // InternalMyDsl.g:1009:5: ( (lv_types_1_0= ruleType ) )
                    // InternalMyDsl.g:1010:6: (lv_types_1_0= ruleType )
                    {
                    // InternalMyDsl.g:1010:6: (lv_types_1_0= ruleType )
                    // InternalMyDsl.g:1011:7: lv_types_1_0= ruleType
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

                    // InternalMyDsl.g:1028:5: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:1029:6: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_23); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getPayloadAccess().getCommaKeyword_0_1_1_0());
                    	    					
                    	    // InternalMyDsl.g:1033:6: ( (lv_types_3_0= ruleType ) )
                    	    // InternalMyDsl.g:1034:7: (lv_types_3_0= ruleType )
                    	    {
                    	    // InternalMyDsl.g:1034:7: (lv_types_3_0= ruleType )
                    	    // InternalMyDsl.g:1035:8: lv_types_3_0= ruleType
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
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1056:3: ( (lv_types_4_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1056:3: ( (lv_types_4_0= RULE_ID ) )
                    // InternalMyDsl.g:1057:4: (lv_types_4_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1057:4: (lv_types_4_0= RULE_ID )
                    // InternalMyDsl.g:1058:5: lv_types_4_0= RULE_ID
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
    // InternalMyDsl.g:1078:1: entryRuleLocalProtocol returns [EObject current=null] : iv_ruleLocalProtocol= ruleLocalProtocol EOF ;
    public final EObject entryRuleLocalProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalProtocol = null;


        try {
            // InternalMyDsl.g:1078:54: (iv_ruleLocalProtocol= ruleLocalProtocol EOF )
            // InternalMyDsl.g:1079:2: iv_ruleLocalProtocol= ruleLocalProtocol EOF
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
    // InternalMyDsl.g:1085:1: ruleLocalProtocol returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' ) ;
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
            // InternalMyDsl.g:1091:2: ( (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1092:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1092:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1093:3: otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'at' ( (lv_projectedRole_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_roles_6_0= ruleRoles ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocolL ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalProtocolAccess().getLocalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:1101:3: ( (lv_protocolName_2_0= RULE_ID ) )
            // InternalMyDsl.g:1102:4: (lv_protocolName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1102:4: (lv_protocolName_2_0= RULE_ID )
            // InternalMyDsl.g:1103:5: lv_protocolName_2_0= RULE_ID
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
            		
            // InternalMyDsl.g:1123:3: ( (lv_projectedRole_4_0= RULE_ID ) )
            // InternalMyDsl.g:1124:4: (lv_projectedRole_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1124:4: (lv_projectedRole_4_0= RULE_ID )
            // InternalMyDsl.g:1125:5: lv_projectedRole_4_0= RULE_ID
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
            		
            // InternalMyDsl.g:1145:3: ( (lv_roles_6_0= ruleRoles ) )
            // InternalMyDsl.g:1146:4: (lv_roles_6_0= ruleRoles )
            {
            // InternalMyDsl.g:1146:4: (lv_roles_6_0= ruleRoles )
            // InternalMyDsl.g:1147:5: lv_roles_6_0= ruleRoles
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getRolesRolesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_7=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1172:3: ( (lv_protocol_9_0= ruleProtocolL ) )
            // InternalMyDsl.g:1173:4: (lv_protocol_9_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1173:4: (lv_protocol_9_0= ruleProtocolL )
            // InternalMyDsl.g:1174:5: lv_protocol_9_0= ruleProtocolL
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
    // InternalMyDsl.g:1199:1: entryRuleProtocolL returns [EObject current=null] : iv_ruleProtocolL= ruleProtocolL EOF ;
    public final EObject entryRuleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolL = null;


        try {
            // InternalMyDsl.g:1199:50: (iv_ruleProtocolL= ruleProtocolL EOF )
            // InternalMyDsl.g:1200:2: iv_ruleProtocolL= ruleProtocolL EOF
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
    // InternalMyDsl.g:1206:1: ruleProtocolL returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* ) ;
    public final EObject ruleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_1_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1212:2: ( ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* ) )
            // InternalMyDsl.g:1213:2: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* )
            {
            // InternalMyDsl.g:1213:2: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* )
            // InternalMyDsl.g:1214:3: () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )*
            {
            // InternalMyDsl.g:1214:3: ()
            // InternalMyDsl.g:1215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolLAccess().getProtocolLAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1221:3: ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==20||LA12_0==22||(LA12_0>=24 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1222:4: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) )
            	    {
            	    // InternalMyDsl.g:1222:4: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) )
            	    // InternalMyDsl.g:1223:5: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion )
            	    {
            	    // InternalMyDsl.g:1223:5: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion )
            	    int alt11=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt11=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalMyDsl.g:1224:6: lv_actions_1_1= ruleMessageL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsMessageLParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_24);
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
            	            // InternalMyDsl.g:1240:6: lv_actions_1_2= ruleChoiceL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsChoiceLParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_24);
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
            	            // InternalMyDsl.g:1256:6: lv_actions_1_3= ruleForEachL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsForEachLParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_24);
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
            	            // InternalMyDsl.g:1272:6: lv_actions_1_4= ruleRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsRecursionParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_24);
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
            	            // InternalMyDsl.g:1288:6: lv_actions_1_5= ruleCloseRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsCloseRecursionParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_24);
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
            	    break loop12;
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
    // InternalMyDsl.g:1310:1: entryRuleMessageL returns [EObject current=null] : iv_ruleMessageL= ruleMessageL EOF ;
    public final EObject entryRuleMessageL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageL = null;


        try {
            // InternalMyDsl.g:1310:49: (iv_ruleMessageL= ruleMessageL EOF )
            // InternalMyDsl.g:1311:2: iv_ruleMessageL= ruleMessageL EOF
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
    // InternalMyDsl.g:1317:1: ruleMessageL returns [EObject current=null] : ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' ) ;
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
            // InternalMyDsl.g:1323:2: ( ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' ) )
            // InternalMyDsl.g:1324:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' )
            {
            // InternalMyDsl.g:1324:2: ( ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' )
            // InternalMyDsl.g:1325:3: ( (lv_messageType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';'
            {
            // InternalMyDsl.g:1325:3: ( (lv_messageType_0_0= RULE_ID ) )
            // InternalMyDsl.g:1326:4: (lv_messageType_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1326:4: (lv_messageType_0_0= RULE_ID )
            // InternalMyDsl.g:1327:5: lv_messageType_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageLAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1347:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=32 && LA13_0<=34)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1348:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:1348:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:1349:5: lv_payload_2_0= rulePayload
                    {

                    					newCompositeNode(grammarAccess.getMessageLAccess().getPayloadPayloadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_20);
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

            otherlv_3=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageLAccess().getRightParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1370:3: ( (lv_target_4_0= ruleSenderL ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1371:4: (lv_target_4_0= ruleSenderL )
                    {
                    // InternalMyDsl.g:1371:4: (lv_target_4_0= ruleSenderL )
                    // InternalMyDsl.g:1372:5: lv_target_4_0= ruleSenderL
                    {

                    					newCompositeNode(grammarAccess.getMessageLAccess().getTargetSenderLParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_26);
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

            // InternalMyDsl.g:1389:3: ( (lv_target_5_0= ruleReceiverL ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1390:4: (lv_target_5_0= ruleReceiverL )
                    {
                    // InternalMyDsl.g:1390:4: (lv_target_5_0= ruleReceiverL )
                    // InternalMyDsl.g:1391:5: lv_target_5_0= ruleReceiverL
                    {

                    					newCompositeNode(grammarAccess.getMessageLAccess().getTargetReceiverLParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyDsl.g:1416:1: entryRuleSenderL returns [EObject current=null] : iv_ruleSenderL= ruleSenderL EOF ;
    public final EObject entryRuleSenderL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenderL = null;


        try {
            // InternalMyDsl.g:1416:48: (iv_ruleSenderL= ruleSenderL EOF )
            // InternalMyDsl.g:1417:2: iv_ruleSenderL= ruleSenderL EOF
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
    // InternalMyDsl.g:1423:1: ruleSenderL returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSenderL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1429:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1430:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1430:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1431:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSenderLAccess().getFromKeyword_0());
            		
            // InternalMyDsl.g:1435:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1436:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1436:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1437:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:1452:1: entryRuleReceiverL returns [EObject current=null] : iv_ruleReceiverL= ruleReceiverL EOF ;
    public final EObject entryRuleReceiverL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverL = null;


        try {
            // InternalMyDsl.g:1452:50: (iv_ruleReceiverL= ruleReceiverL EOF )
            // InternalMyDsl.g:1453:2: iv_ruleReceiverL= ruleReceiverL EOF
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
    // InternalMyDsl.g:1459:1: ruleReceiverL returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReceiverL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1465:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1466:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1466:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1467:3: otherlv_0= 'to' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiverLAccess().getToKeyword_0());
            		
            // InternalMyDsl.g:1471:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1472:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1472:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1473:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:1488:1: entryRuleChoiceL returns [EObject current=null] : iv_ruleChoiceL= ruleChoiceL EOF ;
    public final EObject entryRuleChoiceL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceL = null;


        try {
            // InternalMyDsl.g:1488:48: (iv_ruleChoiceL= ruleChoiceL EOF )
            // InternalMyDsl.g:1489:2: iv_ruleChoiceL= ruleChoiceL EOF
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
    // InternalMyDsl.g:1495:1: ruleChoiceL returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* ) ;
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
            // InternalMyDsl.g:1501:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* ) )
            // InternalMyDsl.g:1502:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* )
            {
            // InternalMyDsl.g:1502:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )* )
            // InternalMyDsl.g:1503:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_branches_4_0= ruleChoiceBranchL ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceLAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceLAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:1511:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1512:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1512:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1513:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceLRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceLAccess().getRoleRoleCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1528:3: ( (lv_branches_4_0= ruleChoiceBranchL ) )
            // InternalMyDsl.g:1529:4: (lv_branches_4_0= ruleChoiceBranchL )
            {
            // InternalMyDsl.g:1529:4: (lv_branches_4_0= ruleChoiceBranchL )
            // InternalMyDsl.g:1530:5: lv_branches_4_0= ruleChoiceBranchL
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

            otherlv_5=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1551:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1552:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branches_8_0= ruleChoiceBranchL ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoiceLAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,21,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalMyDsl.g:1560:4: ( (lv_branches_8_0= ruleChoiceBranchL ) )
            	    // InternalMyDsl.g:1561:5: (lv_branches_8_0= ruleChoiceBranchL )
            	    {
            	    // InternalMyDsl.g:1561:5: (lv_branches_8_0= ruleChoiceBranchL )
            	    // InternalMyDsl.g:1562:6: lv_branches_8_0= ruleChoiceBranchL
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

            	    otherlv_9=(Token)match(input,15,FOLLOW_17); 

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


    // $ANTLR start "entryRuleChoiceBranchL"
    // InternalMyDsl.g:1588:1: entryRuleChoiceBranchL returns [EObject current=null] : iv_ruleChoiceBranchL= ruleChoiceBranchL EOF ;
    public final EObject entryRuleChoiceBranchL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceBranchL = null;


        try {
            // InternalMyDsl.g:1588:54: (iv_ruleChoiceBranchL= ruleChoiceBranchL EOF )
            // InternalMyDsl.g:1589:2: iv_ruleChoiceBranchL= ruleChoiceBranchL EOF
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
    // InternalMyDsl.g:1595:1: ruleChoiceBranchL returns [EObject current=null] : ( ( (lv_message_0_0= ruleMessageL ) ) ( (lv_protocol_1_0= ruleProtocolL ) ) ) ;
    public final EObject ruleChoiceBranchL() throws RecognitionException {
        EObject current = null;

        EObject lv_message_0_0 = null;

        EObject lv_protocol_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1601:2: ( ( ( (lv_message_0_0= ruleMessageL ) ) ( (lv_protocol_1_0= ruleProtocolL ) ) ) )
            // InternalMyDsl.g:1602:2: ( ( (lv_message_0_0= ruleMessageL ) ) ( (lv_protocol_1_0= ruleProtocolL ) ) )
            {
            // InternalMyDsl.g:1602:2: ( ( (lv_message_0_0= ruleMessageL ) ) ( (lv_protocol_1_0= ruleProtocolL ) ) )
            // InternalMyDsl.g:1603:3: ( (lv_message_0_0= ruleMessageL ) ) ( (lv_protocol_1_0= ruleProtocolL ) )
            {
            // InternalMyDsl.g:1603:3: ( (lv_message_0_0= ruleMessageL ) )
            // InternalMyDsl.g:1604:4: (lv_message_0_0= ruleMessageL )
            {
            // InternalMyDsl.g:1604:4: (lv_message_0_0= ruleMessageL )
            // InternalMyDsl.g:1605:5: lv_message_0_0= ruleMessageL
            {

            					newCompositeNode(grammarAccess.getChoiceBranchLAccess().getMessageMessageLParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_message_0_0=ruleMessageL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceBranchLRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_0_0,
            						"org.xtext.globalTypes.MyDsl.MessageL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1622:3: ( (lv_protocol_1_0= ruleProtocolL ) )
            // InternalMyDsl.g:1623:4: (lv_protocol_1_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1623:4: (lv_protocol_1_0= ruleProtocolL )
            // InternalMyDsl.g:1624:5: lv_protocol_1_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getChoiceBranchLAccess().getProtocolProtocolLParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_protocol_1_0=ruleProtocolL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceBranchLRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_1_0,
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
    // $ANTLR end "ruleChoiceBranchL"


    // $ANTLR start "entryRuleForEachL"
    // InternalMyDsl.g:1645:1: entryRuleForEachL returns [EObject current=null] : iv_ruleForEachL= ruleForEachL EOF ;
    public final EObject entryRuleForEachL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachL = null;


        try {
            // InternalMyDsl.g:1645:49: (iv_ruleForEachL= ruleForEachL EOF )
            // InternalMyDsl.g:1646:2: iv_ruleForEachL= ruleForEachL EOF
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
    // InternalMyDsl.g:1652:1: ruleForEachL returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1658:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1659:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1659:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1660:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachLAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:1664:3: ( (lv_eachRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:1665:4: (lv_eachRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:1665:4: (lv_eachRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:1666:5: lv_eachRole_1_0= ruleRoleOne
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
            		
            // InternalMyDsl.g:1687:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1688:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1688:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1689:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachLRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getForEachLAccess().getRoleRoleSetCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1704:3: ( (lv_branch_5_0= ruleProtocolL ) )
            // InternalMyDsl.g:1705:4: (lv_branch_5_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1705:4: (lv_branch_5_0= ruleProtocolL )
            // InternalMyDsl.g:1706:5: lv_branch_5_0= ruleProtocolL
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
    // InternalMyDsl.g:1731:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:1731:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:1732:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:1738:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'action' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1744:2: ( (kw= 'int' | kw= 'string' | kw= 'action' ) )
            // InternalMyDsl.g:1745:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            {
            // InternalMyDsl.g:1745:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 34:
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
                    // InternalMyDsl.g:1746:3: kw= 'int'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1752:3: kw= 'string'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1758:3: kw= 'action'
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003508010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003100012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003500010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000710000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000003500012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040800000L});

}