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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ROLENAME", "RULE_RECNAME", "RULE_ROLENAME_L", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'multrole'", "':'", "'rec'", "'loop'", "';'", "'foreach'", "'{'", "'choice'", "'at'", "'or'", "')'", "'from'", "'to'", "'local'", "'projection'", "'on'", "'end'", "'REQUEST'", "'INFORM'", "'AGREE'", "'REFUSE'", "'int'", "'string'", "'action'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int RULE_ROLENAME=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_RECNAME=6;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_ROLENAME_L=7;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__44=44;
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

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==34) ) {
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
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalProtocolAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

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

            otherlv_5=(Token)match(input,17,FOLLOW_8); 

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

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

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

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:252:4: otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_6); 

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
    // InternalMyDsl.g:287:1: ruleRole returns [EObject current=null] : (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_RoleOne_0 = null;

        EObject this_RoleMultiple_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:293:2: ( (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple ) )
            // InternalMyDsl.g:294:2: (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple )
            {
            // InternalMyDsl.g:294:2: (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
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
                    // InternalMyDsl.g:304:3: this_RoleMultiple_1= ruleRoleMultiple
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getRoleMultipleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoleMultiple_1=ruleRoleMultiple();

                    state._fsp--;


                    			current = this_RoleMultiple_1;
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
    // InternalMyDsl.g:323:1: ruleRoleOne returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) ) ;
    public final EObject ruleRoleOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:329:2: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) ) )
            // InternalMyDsl.g:330:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) )
            {
            // InternalMyDsl.g:330:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) )
            // InternalMyDsl.g:331:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleOneAccess().getRoleKeyword_0());
            		
            // InternalMyDsl.g:335:3: ( (lv_name_1_0= RULE_ROLENAME ) )
            // InternalMyDsl.g:336:4: (lv_name_1_0= RULE_ROLENAME )
            {
            // InternalMyDsl.g:336:4: (lv_name_1_0= RULE_ROLENAME )
            // InternalMyDsl.g:337:5: lv_name_1_0= RULE_ROLENAME
            {
            lv_name_1_0=(Token)match(input,RULE_ROLENAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleOneAccess().getNameROLENAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleOneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globalTypes.MyDsl.ROLENAME");
            				

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


    // $ANTLR start "entryRuleRoleMultiple"
    // InternalMyDsl.g:357:1: entryRuleRoleMultiple returns [EObject current=null] : iv_ruleRoleMultiple= ruleRoleMultiple EOF ;
    public final EObject entryRuleRoleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleMultiple = null;


        try {
            // InternalMyDsl.g:357:53: (iv_ruleRoleMultiple= ruleRoleMultiple EOF )
            // InternalMyDsl.g:358:2: iv_ruleRoleMultiple= ruleRoleMultiple EOF
            {
             newCompositeNode(grammarAccess.getRoleMultipleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleMultiple=ruleRoleMultiple();

            state._fsp--;

             current =iv_ruleRoleMultiple; 
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
    // $ANTLR end "entryRuleRoleMultiple"


    // $ANTLR start "ruleRoleMultiple"
    // InternalMyDsl.g:364:1: ruleRoleMultiple returns [EObject current=null] : (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_ROLENAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) ) ;
    public final EObject ruleRoleMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:370:2: ( (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_ROLENAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) ) )
            // InternalMyDsl.g:371:2: (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_ROLENAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) )
            {
            // InternalMyDsl.g:371:2: (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_ROLENAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) )
            // InternalMyDsl.g:372:3: otherlv_0= 'multrole' ( (lv_name_1_0= RULE_ROLENAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleMultipleAccess().getMultroleKeyword_0());
            		
            // InternalMyDsl.g:376:3: ( (lv_name_1_0= RULE_ROLENAME ) )
            // InternalMyDsl.g:377:4: (lv_name_1_0= RULE_ROLENAME )
            {
            // InternalMyDsl.g:377:4: (lv_name_1_0= RULE_ROLENAME )
            // InternalMyDsl.g:378:5: lv_name_1_0= RULE_ROLENAME
            {
            lv_name_1_0=(Token)match(input,RULE_ROLENAME,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleMultipleAccess().getNameROLENAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleMultipleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globalTypes.MyDsl.ROLENAME");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleMultipleAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:398:3: ( (otherlv_3= RULE_ROLENAME ) )
            // InternalMyDsl.g:399:4: (otherlv_3= RULE_ROLENAME )
            {
            // InternalMyDsl.g:399:4: (otherlv_3= RULE_ROLENAME )
            // InternalMyDsl.g:400:5: otherlv_3= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleMultipleRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ROLENAME,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getRoleMultipleAccess().getRefRoleOneCrossReference_3_0());
            				

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
    // $ANTLR end "ruleRoleMultiple"


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
    // InternalMyDsl.g:422:1: ruleProtocol returns [EObject current=null] : ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* ) | ruleEndInteraction ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_1_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:428:2: ( ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* ) | ruleEndInteraction ) )
            // InternalMyDsl.g:429:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* ) | ruleEndInteraction )
            {
            // InternalMyDsl.g:429:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* ) | ruleEndInteraction )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EOF||LA6_0==18||(LA6_0>=23 && LA6_0<=24)||LA6_0==26||LA6_0==28||(LA6_0>=38 && LA6_0<=41)) ) {
                alt6=1;
            }
            else if ( (LA6_0==37) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:430:3: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* )
                    {
                    // InternalMyDsl.g:430:3: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* )
                    // InternalMyDsl.g:431:4: () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )*
                    {
                    // InternalMyDsl.g:431:4: ()
                    // InternalMyDsl.g:432:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getProtocolAccess().getProtocolAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:438:4: ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=23 && LA5_0<=24)||LA5_0==26||LA5_0==28||(LA5_0>=38 && LA5_0<=41)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:439:5: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) )
                    	    {
                    	    // InternalMyDsl.g:439:5: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) )
                    	    // InternalMyDsl.g:440:6: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion )
                    	    {
                    	    // InternalMyDsl.g:440:6: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion )
                    	    int alt4=5;
                    	    switch ( input.LA(1) ) {
                    	    case 38:
                    	    case 39:
                    	    case 40:
                    	    case 41:
                    	        {
                    	        alt4=1;
                    	        }
                    	        break;
                    	    case 28:
                    	        {
                    	        alt4=2;
                    	        }
                    	        break;
                    	    case 23:
                    	        {
                    	        alt4=3;
                    	        }
                    	        break;
                    	    case 26:
                    	        {
                    	        alt4=4;
                    	        }
                    	        break;
                    	    case 24:
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
                    	            // InternalMyDsl.g:441:7: lv_actions_1_1= ruleMessage
                    	            {

                    	            							newCompositeNode(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_0_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_13);
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
                    	            						
                    	            pushFollow(FOLLOW_13);
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
                    	            						
                    	            pushFollow(FOLLOW_13);
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
                    	            						
                    	            pushFollow(FOLLOW_13);
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
                    	            // InternalMyDsl.g:505:7: lv_actions_1_5= ruleCloseRecursion
                    	            {

                    	            							newCompositeNode(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_0_1_0_4());
                    	            						
                    	            pushFollow(FOLLOW_13);
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
                    break;
                case 2 :
                    // InternalMyDsl.g:525:3: ruleEndInteraction
                    {

                    			newCompositeNode(grammarAccess.getProtocolAccess().getEndInteractionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleEndInteraction();

                    state._fsp--;


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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleRecursion"
    // InternalMyDsl.g:536:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalMyDsl.g:536:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalMyDsl.g:537:2: iv_ruleRecursion= ruleRecursion EOF
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
    // InternalMyDsl.g:543:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:549:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' ) )
            // InternalMyDsl.g:550:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' )
            {
            // InternalMyDsl.g:550:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' )
            // InternalMyDsl.g:551:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:555:3: ( (lv_name_1_0= RULE_RECNAME ) )
            // InternalMyDsl.g:556:4: (lv_name_1_0= RULE_RECNAME )
            {
            // InternalMyDsl.g:556:4: (lv_name_1_0= RULE_RECNAME )
            // InternalMyDsl.g:557:5: lv_name_1_0= RULE_RECNAME
            {
            lv_name_1_0=(Token)match(input,RULE_RECNAME,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecursionAccess().getNameRECNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecursionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globalTypes.MyDsl.RECNAME");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:581:1: entryRuleCloseRecursion returns [EObject current=null] : iv_ruleCloseRecursion= ruleCloseRecursion EOF ;
    public final EObject entryRuleCloseRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursion = null;


        try {
            // InternalMyDsl.g:581:55: (iv_ruleCloseRecursion= ruleCloseRecursion EOF )
            // InternalMyDsl.g:582:2: iv_ruleCloseRecursion= ruleCloseRecursion EOF
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
    // InternalMyDsl.g:588:1: ruleCloseRecursion returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' ) ;
    public final EObject ruleCloseRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:594:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:595:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:595:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' )
            // InternalMyDsl.g:596:3: otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:600:3: ( (otherlv_1= RULE_RECNAME ) )
            // InternalMyDsl.g:601:4: (otherlv_1= RULE_RECNAME )
            {
            // InternalMyDsl.g:601:4: (otherlv_1= RULE_RECNAME )
            // InternalMyDsl.g:602:5: otherlv_1= RULE_RECNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseRecursionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_RECNAME,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:621:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalMyDsl.g:621:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalMyDsl.g:622:2: iv_ruleForEach= ruleForEach EOF
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
    // InternalMyDsl.g:628:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:634:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:635:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:635:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            // InternalMyDsl.g:636:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:640:3: ( (lv_eachRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:641:4: (lv_eachRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:641:4: (lv_eachRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:642:5: lv_eachRole_1_0= ruleRoleOne
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getEachRoleRoleOneParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:663:3: ( (otherlv_3= RULE_ROLENAME ) )
            // InternalMyDsl.g:664:4: (otherlv_3= RULE_ROLENAME )
            {
            // InternalMyDsl.g:664:4: (otherlv_3= RULE_ROLENAME )
            // InternalMyDsl.g:665:5: otherlv_3= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ROLENAME,FOLLOW_17); 

            					newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getRoleRoleMultipleCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:680:3: ( (lv_branch_5_0= ruleProtocol ) )
            // InternalMyDsl.g:681:4: (lv_branch_5_0= ruleProtocol )
            {
            // InternalMyDsl.g:681:4: (lv_branch_5_0= ruleProtocol )
            // InternalMyDsl.g:682:5: lv_branch_5_0= ruleProtocol
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

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:707:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalMyDsl.g:707:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalMyDsl.g:708:2: iv_ruleChoice= ruleChoice EOF
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
    // InternalMyDsl.g:714:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) ;
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
            // InternalMyDsl.g:720:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) )
            // InternalMyDsl.g:721:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            {
            // InternalMyDsl.g:721:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            // InternalMyDsl.g:722:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:730:3: ( (otherlv_2= RULE_ROLENAME ) )
            // InternalMyDsl.g:731:4: (otherlv_2= RULE_ROLENAME )
            {
            // InternalMyDsl.g:731:4: (otherlv_2= RULE_ROLENAME )
            // InternalMyDsl.g:732:5: otherlv_2= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ROLENAME,FOLLOW_17); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:747:3: ( (lv_message_4_0= ruleMessage ) )
            // InternalMyDsl.g:748:4: (lv_message_4_0= ruleMessage )
            {
            // InternalMyDsl.g:748:4: (lv_message_4_0= ruleMessage )
            // InternalMyDsl.g:749:5: lv_message_4_0= ruleMessage
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

            // InternalMyDsl.g:766:3: ( (lv_branches_5_0= ruleProtocol ) )
            // InternalMyDsl.g:767:4: (lv_branches_5_0= ruleProtocol )
            {
            // InternalMyDsl.g:767:4: (lv_branches_5_0= ruleProtocol )
            // InternalMyDsl.g:768:5: lv_branches_5_0= ruleProtocol
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

            otherlv_6=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:789:3: (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:790:4: otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}'
            	    {
            	    otherlv_7=(Token)match(input,30,FOLLOW_17); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getOrKeyword_7_0());
            	    			
            	    otherlv_8=(Token)match(input,27,FOLLOW_19); 

            	    				newLeafNode(otherlv_8, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_7_1());
            	    			
            	    // InternalMyDsl.g:798:4: ( (lv_message_9_0= ruleMessage ) )
            	    // InternalMyDsl.g:799:5: (lv_message_9_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:799:5: (lv_message_9_0= ruleMessage )
            	    // InternalMyDsl.g:800:6: lv_message_9_0= ruleMessage
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

            	    // InternalMyDsl.g:817:4: ( (lv_branches_10_0= ruleProtocol ) )
            	    // InternalMyDsl.g:818:5: (lv_branches_10_0= ruleProtocol )
            	    {
            	    // InternalMyDsl.g:818:5: (lv_branches_10_0= ruleProtocol )
            	    // InternalMyDsl.g:819:6: lv_branches_10_0= ruleProtocol
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

            	    otherlv_11=(Token)match(input,18,FOLLOW_20); 

            	    				newLeafNode(otherlv_11, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_7_4());
            	    			

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


    // $ANTLR start "entryRuleMessage"
    // InternalMyDsl.g:845:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:845:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:846:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:852:1: ruleMessage returns [EObject current=null] : ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_messageType_0_0 = null;

        EObject lv_payload_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:858:2: ( ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' ) )
            // InternalMyDsl.g:859:2: ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:859:2: ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' )
            // InternalMyDsl.g:860:3: ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';'
            {
            // InternalMyDsl.g:860:3: ( (lv_messageType_0_0= ruleMessageType ) )
            // InternalMyDsl.g:861:4: (lv_messageType_0_0= ruleMessageType )
            {
            // InternalMyDsl.g:861:4: (lv_messageType_0_0= ruleMessageType )
            // InternalMyDsl.g:862:5: lv_messageType_0_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getMessageTypeMessageTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_messageType_0_0=ruleMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageRule());
            					}
            					set(
            						current,
            						"messageType",
            						lv_messageType_0_0,
            						"org.xtext.globalTypes.MyDsl.MessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:883:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=42 && LA8_0<=44)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:884:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:884:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:885:5: lv_payload_2_0= rulePayload
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getPayloadPayloadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getFromKeyword_4());
            		
            // InternalMyDsl.g:910:3: ( (otherlv_5= RULE_ROLENAME ) )
            // InternalMyDsl.g:911:4: (otherlv_5= RULE_ROLENAME )
            {
            // InternalMyDsl.g:911:4: (otherlv_5= RULE_ROLENAME )
            // InternalMyDsl.g:912:5: otherlv_5= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ROLENAME,FOLLOW_24); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getToKeyword_6());
            		
            // InternalMyDsl.g:927:3: ( (otherlv_7= RULE_ROLENAME ) )
            // InternalMyDsl.g:928:4: (otherlv_7= RULE_ROLENAME )
            {
            // InternalMyDsl.g:928:4: (otherlv_7= RULE_ROLENAME )
            // InternalMyDsl.g:929:5: otherlv_7= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ROLENAME,FOLLOW_15); 

            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getReceiverRoleOneCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:948:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalMyDsl.g:948:48: (iv_rulePayload= rulePayload EOF )
            // InternalMyDsl.g:949:2: iv_rulePayload= rulePayload EOF
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
    // InternalMyDsl.g:955:1: rulePayload returns [EObject current=null] : ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_types_1_0 = null;

        AntlrDatatypeRuleToken lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:961:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) )
            // InternalMyDsl.g:962:2: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
            {
            // InternalMyDsl.g:962:2: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
            // InternalMyDsl.g:963:3: () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
            {
            // InternalMyDsl.g:963:3: ()
            // InternalMyDsl.g:964:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPayloadAccess().getPayloadAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:970:3: ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
            // InternalMyDsl.g:971:4: ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            {
            // InternalMyDsl.g:971:4: ( (lv_types_1_0= ruleType ) )
            // InternalMyDsl.g:972:5: (lv_types_1_0= ruleType )
            {
            // InternalMyDsl.g:972:5: (lv_types_1_0= ruleType )
            // InternalMyDsl.g:973:6: lv_types_1_0= ruleType
            {

            						newCompositeNode(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_0_0());
            					
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

            // InternalMyDsl.g:990:4: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:991:5: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_25); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPayloadAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalMyDsl.g:995:5: ( (lv_types_3_0= ruleType ) )
            	    // InternalMyDsl.g:996:6: (lv_types_3_0= ruleType )
            	    {
            	    // InternalMyDsl.g:996:6: (lv_types_3_0= ruleType )
            	    // InternalMyDsl.g:997:7: lv_types_3_0= ruleType
            	    {

            	    							newCompositeNode(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_1_1_0());
            	    						
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
    // InternalMyDsl.g:1020:1: entryRuleLocalProtocol returns [EObject current=null] : iv_ruleLocalProtocol= ruleLocalProtocol EOF ;
    public final EObject entryRuleLocalProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalProtocol = null;


        try {
            // InternalMyDsl.g:1020:54: (iv_ruleLocalProtocol= ruleLocalProtocol EOF )
            // InternalMyDsl.g:1021:2: iv_ruleLocalProtocol= ruleLocalProtocol EOF
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
    // InternalMyDsl.g:1027:1: ruleLocalProtocol returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'projection' otherlv_4= 'on' ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) otherlv_6= '(' ( (lv_roles_7_0= ruleRolesL ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' ) ;
    public final EObject ruleLocalProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_protocolName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_projectedRole_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_roles_7_0 = null;

        EObject lv_protocol_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1033:2: ( (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'projection' otherlv_4= 'on' ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) otherlv_6= '(' ( (lv_roles_7_0= ruleRolesL ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' ) )
            // InternalMyDsl.g:1034:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'projection' otherlv_4= 'on' ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) otherlv_6= '(' ( (lv_roles_7_0= ruleRolesL ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' )
            {
            // InternalMyDsl.g:1034:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'projection' otherlv_4= 'on' ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) otherlv_6= '(' ( (lv_roles_7_0= ruleRolesL ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}' )
            // InternalMyDsl.g:1035:3: otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= 'projection' otherlv_4= 'on' ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) otherlv_6= '(' ( (lv_roles_7_0= ruleRolesL ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_protocol_10_0= ruleProtocolL ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalProtocolAccess().getLocalKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:1043:3: ( (lv_protocolName_2_0= RULE_ID ) )
            // InternalMyDsl.g:1044:4: (lv_protocolName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1044:4: (lv_protocolName_2_0= RULE_ID )
            // InternalMyDsl.g:1045:5: lv_protocolName_2_0= RULE_ID
            {
            lv_protocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_3=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalProtocolAccess().getProjectionKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getLocalProtocolAccess().getOnKeyword_4());
            		
            // InternalMyDsl.g:1069:3: ( (lv_projectedRole_5_0= RULE_ROLENAME ) )
            // InternalMyDsl.g:1070:4: (lv_projectedRole_5_0= RULE_ROLENAME )
            {
            // InternalMyDsl.g:1070:4: (lv_projectedRole_5_0= RULE_ROLENAME )
            // InternalMyDsl.g:1071:5: lv_projectedRole_5_0= RULE_ROLENAME
            {
            lv_projectedRole_5_0=(Token)match(input,RULE_ROLENAME,FOLLOW_5); 

            					newLeafNode(lv_projectedRole_5_0, grammarAccess.getLocalProtocolAccess().getProjectedRoleROLENAMETerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalProtocolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"projectedRole",
            						lv_projectedRole_5_0,
            						"org.xtext.globalTypes.MyDsl.ROLENAME");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_6());
            		
            // InternalMyDsl.g:1091:3: ( (lv_roles_7_0= ruleRolesL ) )
            // InternalMyDsl.g:1092:4: (lv_roles_7_0= ruleRolesL )
            {
            // InternalMyDsl.g:1092:4: (lv_roles_7_0= ruleRolesL )
            // InternalMyDsl.g:1093:5: lv_roles_7_0= ruleRolesL
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getRolesRolesLParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_roles_7_0=ruleRolesL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalProtocolRule());
            					}
            					set(
            						current,
            						"roles",
            						lv_roles_7_0,
            						"org.xtext.globalTypes.MyDsl.RolesL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_28); 

            			newLeafNode(otherlv_9, grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMyDsl.g:1118:3: ( (lv_protocol_10_0= ruleProtocolL ) )
            // InternalMyDsl.g:1119:4: (lv_protocol_10_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1119:4: (lv_protocol_10_0= ruleProtocolL )
            // InternalMyDsl.g:1120:5: lv_protocol_10_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_10_0());
            				
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

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleRolesL"
    // InternalMyDsl.g:1145:1: entryRuleRolesL returns [EObject current=null] : iv_ruleRolesL= ruleRolesL EOF ;
    public final EObject entryRuleRolesL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolesL = null;


        try {
            // InternalMyDsl.g:1145:47: (iv_ruleRolesL= ruleRolesL EOF )
            // InternalMyDsl.g:1146:2: iv_ruleRolesL= ruleRolesL EOF
            {
             newCompositeNode(grammarAccess.getRolesLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRolesL=ruleRolesL();

            state._fsp--;

             current =iv_ruleRolesL; 
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
    // $ANTLR end "entryRuleRolesL"


    // $ANTLR start "ruleRolesL"
    // InternalMyDsl.g:1152:1: ruleRolesL returns [EObject current=null] : ( ( (lv_roles_0_0= ruleRoleL ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )* ) ;
    public final EObject ruleRolesL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_roles_0_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1158:2: ( ( ( (lv_roles_0_0= ruleRoleL ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )* ) )
            // InternalMyDsl.g:1159:2: ( ( (lv_roles_0_0= ruleRoleL ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )* )
            {
            // InternalMyDsl.g:1159:2: ( ( (lv_roles_0_0= ruleRoleL ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )* )
            // InternalMyDsl.g:1160:3: ( (lv_roles_0_0= ruleRoleL ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )*
            {
            // InternalMyDsl.g:1160:3: ( (lv_roles_0_0= ruleRoleL ) )
            // InternalMyDsl.g:1161:4: (lv_roles_0_0= ruleRoleL )
            {
            // InternalMyDsl.g:1161:4: (lv_roles_0_0= ruleRoleL )
            // InternalMyDsl.g:1162:5: lv_roles_0_0= ruleRoleL
            {

            					newCompositeNode(grammarAccess.getRolesLAccess().getRolesRoleLParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_roles_0_0=ruleRoleL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRolesLRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_0_0,
            						"org.xtext.globalTypes.MyDsl.RoleL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1179:3: (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1180:4: otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRolesLAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1184:4: ( (lv_roles_2_0= ruleRoleL ) )
            	    // InternalMyDsl.g:1185:5: (lv_roles_2_0= ruleRoleL )
            	    {
            	    // InternalMyDsl.g:1185:5: (lv_roles_2_0= ruleRoleL )
            	    // InternalMyDsl.g:1186:6: lv_roles_2_0= ruleRoleL
            	    {

            	    						newCompositeNode(grammarAccess.getRolesLAccess().getRolesRoleLParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_roles_2_0=ruleRoleL();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRolesLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_2_0,
            	    							"org.xtext.globalTypes.MyDsl.RoleL");
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
    // $ANTLR end "ruleRolesL"


    // $ANTLR start "entryRuleRoleL"
    // InternalMyDsl.g:1208:1: entryRuleRoleL returns [EObject current=null] : iv_ruleRoleL= ruleRoleL EOF ;
    public final EObject entryRuleRoleL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleL = null;


        try {
            // InternalMyDsl.g:1208:46: (iv_ruleRoleL= ruleRoleL EOF )
            // InternalMyDsl.g:1209:2: iv_ruleRoleL= ruleRoleL EOF
            {
             newCompositeNode(grammarAccess.getRoleLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleL=ruleRoleL();

            state._fsp--;

             current =iv_ruleRoleL; 
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
    // $ANTLR end "entryRuleRoleL"


    // $ANTLR start "ruleRoleL"
    // InternalMyDsl.g:1215:1: ruleRoleL returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME_L ) ) ) ;
    public final EObject ruleRoleL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1221:2: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME_L ) ) ) )
            // InternalMyDsl.g:1222:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME_L ) ) )
            {
            // InternalMyDsl.g:1222:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME_L ) ) )
            // InternalMyDsl.g:1223:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME_L ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleLAccess().getRoleKeyword_0());
            		
            // InternalMyDsl.g:1227:3: ( (lv_name_1_0= RULE_ROLENAME_L ) )
            // InternalMyDsl.g:1228:4: (lv_name_1_0= RULE_ROLENAME_L )
            {
            // InternalMyDsl.g:1228:4: (lv_name_1_0= RULE_ROLENAME_L )
            // InternalMyDsl.g:1229:5: lv_name_1_0= RULE_ROLENAME_L
            {
            lv_name_1_0=(Token)match(input,RULE_ROLENAME_L,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleLAccess().getNameROLENAME_LTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globalTypes.MyDsl.ROLENAME_L");
            				

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
    // $ANTLR end "ruleRoleL"


    // $ANTLR start "entryRuleProtocolL"
    // InternalMyDsl.g:1249:1: entryRuleProtocolL returns [EObject current=null] : iv_ruleProtocolL= ruleProtocolL EOF ;
    public final EObject entryRuleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolL = null;


        try {
            // InternalMyDsl.g:1249:50: (iv_ruleProtocolL= ruleProtocolL EOF )
            // InternalMyDsl.g:1250:2: iv_ruleProtocolL= ruleProtocolL EOF
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
    // InternalMyDsl.g:1256:1: ruleProtocolL returns [EObject current=null] : ( ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL ) ) )* ) | ruleEndInteractionL ) ;
    public final EObject ruleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1262:2: ( ( ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL ) ) )* ) | ruleEndInteractionL ) )
            // InternalMyDsl.g:1263:2: ( ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL ) ) )* ) | ruleEndInteractionL )
            {
            // InternalMyDsl.g:1263:2: ( ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL ) ) )* ) | ruleEndInteractionL )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EOF||LA13_0==18||(LA13_0>=23 && LA13_0<=24)||LA13_0==28||(LA13_0>=38 && LA13_0<=41)) ) {
                alt13=1;
            }
            else if ( (LA13_0==37) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1264:3: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL ) ) )* )
                    {
                    // InternalMyDsl.g:1264:3: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL ) ) )* )
                    // InternalMyDsl.g:1265:4: () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL ) ) )*
                    {
                    // InternalMyDsl.g:1265:4: ()
                    // InternalMyDsl.g:1266:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getProtocolLAccess().getProtocolLAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1272:4: ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=23 && LA12_0<=24)||LA12_0==28||(LA12_0>=38 && LA12_0<=41)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:1273:5: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL ) )
                    	    {
                    	    // InternalMyDsl.g:1273:5: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL ) )
                    	    // InternalMyDsl.g:1274:6: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL )
                    	    {
                    	    // InternalMyDsl.g:1274:6: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleRecursionL | lv_actions_1_4= ruleCloseRecursionL )
                    	    int alt11=4;
                    	    switch ( input.LA(1) ) {
                    	    case 38:
                    	    case 39:
                    	    case 40:
                    	    case 41:
                    	        {
                    	        alt11=1;
                    	        }
                    	        break;
                    	    case 28:
                    	        {
                    	        alt11=2;
                    	        }
                    	        break;
                    	    case 23:
                    	        {
                    	        alt11=3;
                    	        }
                    	        break;
                    	    case 24:
                    	        {
                    	        alt11=4;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 11, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt11) {
                    	        case 1 :
                    	            // InternalMyDsl.g:1275:7: lv_actions_1_1= ruleMessageL
                    	            {

                    	            							newCompositeNode(grammarAccess.getProtocolLAccess().getActionsMessageLParserRuleCall_0_1_0_0());
                    	            						
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
                    	            // InternalMyDsl.g:1291:7: lv_actions_1_2= ruleChoiceL
                    	            {

                    	            							newCompositeNode(grammarAccess.getProtocolLAccess().getActionsChoiceLParserRuleCall_0_1_0_1());
                    	            						
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
                    	            // InternalMyDsl.g:1307:7: lv_actions_1_3= ruleRecursionL
                    	            {

                    	            							newCompositeNode(grammarAccess.getProtocolLAccess().getActionsRecursionLParserRuleCall_0_1_0_2());
                    	            						
                    	            pushFollow(FOLLOW_30);
                    	            lv_actions_1_3=ruleRecursionL();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getProtocolLRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"actions",
                    	            								lv_actions_1_3,
                    	            								"org.xtext.globalTypes.MyDsl.RecursionL");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 4 :
                    	            // InternalMyDsl.g:1323:7: lv_actions_1_4= ruleCloseRecursionL
                    	            {

                    	            							newCompositeNode(grammarAccess.getProtocolLAccess().getActionsCloseRecursionLParserRuleCall_0_1_0_3());
                    	            						
                    	            pushFollow(FOLLOW_30);
                    	            lv_actions_1_4=ruleCloseRecursionL();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getProtocolLRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"actions",
                    	            								lv_actions_1_4,
                    	            								"org.xtext.globalTypes.MyDsl.CloseRecursionL");
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
                    break;
                case 2 :
                    // InternalMyDsl.g:1343:3: ruleEndInteractionL
                    {

                    			newCompositeNode(grammarAccess.getProtocolLAccess().getEndInteractionLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleEndInteractionL();

                    state._fsp--;


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
    // $ANTLR end "ruleProtocolL"


    // $ANTLR start "entryRuleMessageL"
    // InternalMyDsl.g:1354:1: entryRuleMessageL returns [EObject current=null] : iv_ruleMessageL= ruleMessageL EOF ;
    public final EObject entryRuleMessageL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageL = null;


        try {
            // InternalMyDsl.g:1354:49: (iv_ruleMessageL= ruleMessageL EOF )
            // InternalMyDsl.g:1355:2: iv_ruleMessageL= ruleMessageL EOF
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
    // InternalMyDsl.g:1361:1: ruleMessageL returns [EObject current=null] : ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( ( (lv_target_4_0= ruleSenderL ) ) | ( (lv_target_5_0= ruleReceiverL ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleMessageL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_messageType_0_0 = null;

        EObject lv_payload_2_0 = null;

        EObject lv_target_4_0 = null;

        EObject lv_target_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1367:2: ( ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( ( (lv_target_4_0= ruleSenderL ) ) | ( (lv_target_5_0= ruleReceiverL ) ) ) otherlv_6= ';' ) )
            // InternalMyDsl.g:1368:2: ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( ( (lv_target_4_0= ruleSenderL ) ) | ( (lv_target_5_0= ruleReceiverL ) ) ) otherlv_6= ';' )
            {
            // InternalMyDsl.g:1368:2: ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( ( (lv_target_4_0= ruleSenderL ) ) | ( (lv_target_5_0= ruleReceiverL ) ) ) otherlv_6= ';' )
            // InternalMyDsl.g:1369:3: ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( ( (lv_target_4_0= ruleSenderL ) ) | ( (lv_target_5_0= ruleReceiverL ) ) ) otherlv_6= ';'
            {
            // InternalMyDsl.g:1369:3: ( (lv_messageType_0_0= ruleMessageType ) )
            // InternalMyDsl.g:1370:4: (lv_messageType_0_0= ruleMessageType )
            {
            // InternalMyDsl.g:1370:4: (lv_messageType_0_0= ruleMessageType )
            // InternalMyDsl.g:1371:5: lv_messageType_0_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getMessageLAccess().getMessageTypeMessageTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_messageType_0_0=ruleMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageLRule());
            					}
            					set(
            						current,
            						"messageType",
            						lv_messageType_0_0,
            						"org.xtext.globalTypes.MyDsl.MessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageLAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1392:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=42 && LA14_0<=44)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1393:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:1393:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:1394:5: lv_payload_2_0= rulePayload
                    {

                    					newCompositeNode(grammarAccess.getMessageLAccess().getPayloadPayloadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_22);
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
            		
            // InternalMyDsl.g:1415:3: ( ( (lv_target_4_0= ruleSenderL ) ) | ( (lv_target_5_0= ruleReceiverL ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1416:4: ( (lv_target_4_0= ruleSenderL ) )
                    {
                    // InternalMyDsl.g:1416:4: ( (lv_target_4_0= ruleSenderL ) )
                    // InternalMyDsl.g:1417:5: (lv_target_4_0= ruleSenderL )
                    {
                    // InternalMyDsl.g:1417:5: (lv_target_4_0= ruleSenderL )
                    // InternalMyDsl.g:1418:6: lv_target_4_0= ruleSenderL
                    {

                    						newCompositeNode(grammarAccess.getMessageLAccess().getTargetSenderLParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_target_4_0=ruleSenderL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageLRule());
                    						}
                    						set(
                    							current,
                    							"target",
                    							lv_target_4_0,
                    							"org.xtext.globalTypes.MyDsl.SenderL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1436:4: ( (lv_target_5_0= ruleReceiverL ) )
                    {
                    // InternalMyDsl.g:1436:4: ( (lv_target_5_0= ruleReceiverL ) )
                    // InternalMyDsl.g:1437:5: (lv_target_5_0= ruleReceiverL )
                    {
                    // InternalMyDsl.g:1437:5: (lv_target_5_0= ruleReceiverL )
                    // InternalMyDsl.g:1438:6: lv_target_5_0= ruleReceiverL
                    {

                    						newCompositeNode(grammarAccess.getMessageLAccess().getTargetReceiverLParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_target_5_0=ruleReceiverL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageLRule());
                    						}
                    						set(
                    							current,
                    							"target",
                    							lv_target_5_0,
                    							"org.xtext.globalTypes.MyDsl.ReceiverL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageLAccess().getSemicolonKeyword_5());
            		

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
    // InternalMyDsl.g:1464:1: entryRuleSenderL returns [EObject current=null] : iv_ruleSenderL= ruleSenderL EOF ;
    public final EObject entryRuleSenderL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenderL = null;


        try {
            // InternalMyDsl.g:1464:48: (iv_ruleSenderL= ruleSenderL EOF )
            // InternalMyDsl.g:1465:2: iv_ruleSenderL= ruleSenderL EOF
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
    // InternalMyDsl.g:1471:1: ruleSenderL returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ROLENAME_L ) ) ) ;
    public final EObject ruleSenderL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1477:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ROLENAME_L ) ) ) )
            // InternalMyDsl.g:1478:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ROLENAME_L ) ) )
            {
            // InternalMyDsl.g:1478:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ROLENAME_L ) ) )
            // InternalMyDsl.g:1479:3: otherlv_0= 'from' ( (otherlv_1= RULE_ROLENAME_L ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getSenderLAccess().getFromKeyword_0());
            		
            // InternalMyDsl.g:1483:3: ( (otherlv_1= RULE_ROLENAME_L ) )
            // InternalMyDsl.g:1484:4: (otherlv_1= RULE_ROLENAME_L )
            {
            // InternalMyDsl.g:1484:4: (otherlv_1= RULE_ROLENAME_L )
            // InternalMyDsl.g:1485:5: otherlv_1= RULE_ROLENAME_L
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSenderLRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ROLENAME_L,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSenderLAccess().getSenderRoleLCrossReference_1_0());
            				

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
    // InternalMyDsl.g:1500:1: entryRuleReceiverL returns [EObject current=null] : iv_ruleReceiverL= ruleReceiverL EOF ;
    public final EObject entryRuleReceiverL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverL = null;


        try {
            // InternalMyDsl.g:1500:50: (iv_ruleReceiverL= ruleReceiverL EOF )
            // InternalMyDsl.g:1501:2: iv_ruleReceiverL= ruleReceiverL EOF
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
    // InternalMyDsl.g:1507:1: ruleReceiverL returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ROLENAME_L ) ) ) ;
    public final EObject ruleReceiverL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1513:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ROLENAME_L ) ) ) )
            // InternalMyDsl.g:1514:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ROLENAME_L ) ) )
            {
            // InternalMyDsl.g:1514:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ROLENAME_L ) ) )
            // InternalMyDsl.g:1515:3: otherlv_0= 'to' ( (otherlv_1= RULE_ROLENAME_L ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiverLAccess().getToKeyword_0());
            		
            // InternalMyDsl.g:1519:3: ( (otherlv_1= RULE_ROLENAME_L ) )
            // InternalMyDsl.g:1520:4: (otherlv_1= RULE_ROLENAME_L )
            {
            // InternalMyDsl.g:1520:4: (otherlv_1= RULE_ROLENAME_L )
            // InternalMyDsl.g:1521:5: otherlv_1= RULE_ROLENAME_L
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReceiverLRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ROLENAME_L,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getReceiverLAccess().getToRoleLCrossReference_1_0());
            				

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
    // InternalMyDsl.g:1536:1: entryRuleChoiceL returns [EObject current=null] : iv_ruleChoiceL= ruleChoiceL EOF ;
    public final EObject entryRuleChoiceL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceL = null;


        try {
            // InternalMyDsl.g:1536:48: (iv_ruleChoiceL= ruleChoiceL EOF )
            // InternalMyDsl.g:1537:2: iv_ruleChoiceL= ruleChoiceL EOF
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
    // InternalMyDsl.g:1543:1: ruleChoiceL returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME_L ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* ) ;
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
            // InternalMyDsl.g:1549:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME_L ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* ) )
            // InternalMyDsl.g:1550:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME_L ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* )
            {
            // InternalMyDsl.g:1550:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME_L ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* )
            // InternalMyDsl.g:1551:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME_L ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceLAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceLAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:1559:3: ( (otherlv_2= RULE_ROLENAME_L ) )
            // InternalMyDsl.g:1560:4: (otherlv_2= RULE_ROLENAME_L )
            {
            // InternalMyDsl.g:1560:4: (otherlv_2= RULE_ROLENAME_L )
            // InternalMyDsl.g:1561:5: otherlv_2= RULE_ROLENAME_L
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceLRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ROLENAME_L,FOLLOW_17); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceLAccess().getRoleRoleLCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1576:3: ( (lv_message_4_0= ruleMessageL ) )
            // InternalMyDsl.g:1577:4: (lv_message_4_0= ruleMessageL )
            {
            // InternalMyDsl.g:1577:4: (lv_message_4_0= ruleMessageL )
            // InternalMyDsl.g:1578:5: lv_message_4_0= ruleMessageL
            {

            					newCompositeNode(grammarAccess.getChoiceLAccess().getMessageMessageLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalMyDsl.g:1595:3: ( (lv_branches_5_0= ruleProtocolL ) )
            // InternalMyDsl.g:1596:4: (lv_branches_5_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1596:4: (lv_branches_5_0= ruleProtocolL )
            // InternalMyDsl.g:1597:5: lv_branches_5_0= ruleProtocolL
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

            otherlv_6=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:1618:3: (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1619:4: otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}'
            	    {
            	    otherlv_7=(Token)match(input,30,FOLLOW_17); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceLAccess().getOrKeyword_7_0());
            	    			
            	    otherlv_8=(Token)match(input,27,FOLLOW_19); 

            	    				newLeafNode(otherlv_8, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_7_1());
            	    			
            	    // InternalMyDsl.g:1627:4: ( (lv_message_9_0= ruleMessageL ) )
            	    // InternalMyDsl.g:1628:5: (lv_message_9_0= ruleMessageL )
            	    {
            	    // InternalMyDsl.g:1628:5: (lv_message_9_0= ruleMessageL )
            	    // InternalMyDsl.g:1629:6: lv_message_9_0= ruleMessageL
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceLAccess().getMessageMessageLParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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

            	    // InternalMyDsl.g:1646:4: ( (lv_branches_10_0= ruleProtocolL ) )
            	    // InternalMyDsl.g:1647:5: (lv_branches_10_0= ruleProtocolL )
            	    {
            	    // InternalMyDsl.g:1647:5: (lv_branches_10_0= ruleProtocolL )
            	    // InternalMyDsl.g:1648:6: lv_branches_10_0= ruleProtocolL
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

            	    otherlv_11=(Token)match(input,18,FOLLOW_20); 

            	    				newLeafNode(otherlv_11, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_7_4());
            	    			

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


    // $ANTLR start "entryRuleRecursionL"
    // InternalMyDsl.g:1674:1: entryRuleRecursionL returns [EObject current=null] : iv_ruleRecursionL= ruleRecursionL EOF ;
    public final EObject entryRuleRecursionL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursionL = null;


        try {
            // InternalMyDsl.g:1674:51: (iv_ruleRecursionL= ruleRecursionL EOF )
            // InternalMyDsl.g:1675:2: iv_ruleRecursionL= ruleRecursionL EOF
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
    // InternalMyDsl.g:1681:1: ruleRecursionL returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' ) ;
    public final EObject ruleRecursionL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1687:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' ) )
            // InternalMyDsl.g:1688:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' )
            {
            // InternalMyDsl.g:1688:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' )
            // InternalMyDsl.g:1689:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionLAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:1693:3: ( (lv_name_1_0= RULE_RECNAME ) )
            // InternalMyDsl.g:1694:4: (lv_name_1_0= RULE_RECNAME )
            {
            // InternalMyDsl.g:1694:4: (lv_name_1_0= RULE_RECNAME )
            // InternalMyDsl.g:1695:5: lv_name_1_0= RULE_RECNAME
            {
            lv_name_1_0=(Token)match(input,RULE_RECNAME,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecursionLAccess().getNameRECNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecursionLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globalTypes.MyDsl.RECNAME");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRecursionLAccess().getColonKeyword_2());
            		

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
    // InternalMyDsl.g:1719:1: entryRuleCloseRecursionL returns [EObject current=null] : iv_ruleCloseRecursionL= ruleCloseRecursionL EOF ;
    public final EObject entryRuleCloseRecursionL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursionL = null;


        try {
            // InternalMyDsl.g:1719:56: (iv_ruleCloseRecursionL= ruleCloseRecursionL EOF )
            // InternalMyDsl.g:1720:2: iv_ruleCloseRecursionL= ruleCloseRecursionL EOF
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
    // InternalMyDsl.g:1726:1: ruleCloseRecursionL returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' ) ;
    public final EObject ruleCloseRecursionL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1732:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:1733:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:1733:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' )
            // InternalMyDsl.g:1734:3: otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionLAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:1738:3: ( (otherlv_1= RULE_RECNAME ) )
            // InternalMyDsl.g:1739:4: (otherlv_1= RULE_RECNAME )
            {
            // InternalMyDsl.g:1739:4: (otherlv_1= RULE_RECNAME )
            // InternalMyDsl.g:1740:5: otherlv_1= RULE_RECNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseRecursionLRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_RECNAME,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCloseRecursionLAccess().getSemicolonKeyword_2());
            		

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


    // $ANTLR start "entryRuleEndInteractionL"
    // InternalMyDsl.g:1759:1: entryRuleEndInteractionL returns [String current=null] : iv_ruleEndInteractionL= ruleEndInteractionL EOF ;
    public final String entryRuleEndInteractionL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndInteractionL = null;


        try {
            // InternalMyDsl.g:1759:55: (iv_ruleEndInteractionL= ruleEndInteractionL EOF )
            // InternalMyDsl.g:1760:2: iv_ruleEndInteractionL= ruleEndInteractionL EOF
            {
             newCompositeNode(grammarAccess.getEndInteractionLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndInteractionL=ruleEndInteractionL();

            state._fsp--;

             current =iv_ruleEndInteractionL.getText(); 
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
    // $ANTLR end "entryRuleEndInteractionL"


    // $ANTLR start "ruleEndInteractionL"
    // InternalMyDsl.g:1766:1: ruleEndInteractionL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleEndInteractionL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1772:2: ( (kw= 'end' kw= ';' ) )
            // InternalMyDsl.g:1773:2: (kw= 'end' kw= ';' )
            {
            // InternalMyDsl.g:1773:2: (kw= 'end' kw= ';' )
            // InternalMyDsl.g:1774:3: kw= 'end' kw= ';'
            {
            kw=(Token)match(input,37,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEndInteractionLAccess().getEndKeyword_0());
            		
            kw=(Token)match(input,25,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEndInteractionLAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleEndInteractionL"


    // $ANTLR start "entryRuleEndInteraction"
    // InternalMyDsl.g:1788:1: entryRuleEndInteraction returns [String current=null] : iv_ruleEndInteraction= ruleEndInteraction EOF ;
    public final String entryRuleEndInteraction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndInteraction = null;


        try {
            // InternalMyDsl.g:1788:54: (iv_ruleEndInteraction= ruleEndInteraction EOF )
            // InternalMyDsl.g:1789:2: iv_ruleEndInteraction= ruleEndInteraction EOF
            {
             newCompositeNode(grammarAccess.getEndInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndInteraction=ruleEndInteraction();

            state._fsp--;

             current =iv_ruleEndInteraction.getText(); 
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
    // $ANTLR end "entryRuleEndInteraction"


    // $ANTLR start "ruleEndInteraction"
    // InternalMyDsl.g:1795:1: ruleEndInteraction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleEndInteraction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1801:2: ( (kw= 'end' kw= ';' ) )
            // InternalMyDsl.g:1802:2: (kw= 'end' kw= ';' )
            {
            // InternalMyDsl.g:1802:2: (kw= 'end' kw= ';' )
            // InternalMyDsl.g:1803:3: kw= 'end' kw= ';'
            {
            kw=(Token)match(input,37,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEndInteractionAccess().getEndKeyword_0());
            		
            kw=(Token)match(input,25,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEndInteractionAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleEndInteraction"


    // $ANTLR start "entryRuleMessageType"
    // InternalMyDsl.g:1817:1: entryRuleMessageType returns [String current=null] : iv_ruleMessageType= ruleMessageType EOF ;
    public final String entryRuleMessageType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMessageType = null;


        try {
            // InternalMyDsl.g:1817:51: (iv_ruleMessageType= ruleMessageType EOF )
            // InternalMyDsl.g:1818:2: iv_ruleMessageType= ruleMessageType EOF
            {
             newCompositeNode(grammarAccess.getMessageTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageType=ruleMessageType();

            state._fsp--;

             current =iv_ruleMessageType.getText(); 
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
    // InternalMyDsl.g:1824:1: ruleMessageType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' ) ;
    public final AntlrDatatypeRuleToken ruleMessageType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1830:2: ( (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' ) )
            // InternalMyDsl.g:1831:2: (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' )
            {
            // InternalMyDsl.g:1831:2: (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt17=1;
                }
                break;
            case 39:
                {
                alt17=2;
                }
                break;
            case 40:
                {
                alt17=3;
                }
                break;
            case 41:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1832:3: kw= 'REQUEST'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getREQUESTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1838:3: kw= 'INFORM'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getINFORMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1844:3: kw= 'AGREE'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getAGREEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1850:3: kw= 'REFUSE'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getREFUSEKeyword_3());
                    		

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


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:1859:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:1859:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:1860:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:1866:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'action' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1872:2: ( (kw= 'int' | kw= 'string' | kw= 'action' ) )
            // InternalMyDsl.g:1873:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            {
            // InternalMyDsl.g:1873:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt18=1;
                }
                break;
            case 43:
                {
                alt18=2;
                }
                break;
            case 44:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1874:3: kw= 'int'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1880:3: kw= 'string'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1886:3: kw= 'action'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000003E015840000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000003C015800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001C0080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000003E011840000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000003C011800002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300000000L});

}