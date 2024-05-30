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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PROTOCOLNAME", "RULE_ROLENAME", "RULE_ROLESETNAME", "RULE_RECNAME", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'roleset'", "':'", "'rec'", "'loop'", "';'", "'foreach'", "'{'", "'choice'", "'at'", "'or'", "')'", "'from'", "'to'", "'local'", "'projection'", "'on'", "'REQUEST'", "'INFORM'", "'AGREE'", "'REFUSE'", "'CFP'", "'QUIT'", "'int'", "'string'", "'action'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_PROTOCOLNAME=4;
    public static final int RULE_ID=8;
    public static final int RULE_ROLENAME=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
    public static final int RULE_RECNAME=7;
    public static final int RULE_SL_COMMENT=12;
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
    public static final int RULE_WS=13;
    public static final int RULE_ROLESETNAME=6;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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

            if ( (LA1_0==15) ) {
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
    // InternalMyDsl.g:129:1: ruleGlobalProtocol returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:135:2: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:136:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:136:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' )
            // InternalMyDsl.g:137:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalProtocolAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:145:3: ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) )
            // InternalMyDsl.g:146:4: (lv_protocolName_2_0= RULE_PROTOCOLNAME )
            {
            // InternalMyDsl.g:146:4: (lv_protocolName_2_0= RULE_PROTOCOLNAME )
            // InternalMyDsl.g:147:5: lv_protocolName_2_0= RULE_PROTOCOLNAME
            {
            lv_protocolName_2_0=(Token)match(input,RULE_PROTOCOLNAME,FOLLOW_5); 

            					newLeafNode(lv_protocolName_2_0, grammarAccess.getGlobalProtocolAccess().getProtocolNamePROTOCOLNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalProtocolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocolName",
            						lv_protocolName_2_0,
            						"org.xtext.globalTypes.MyDsl.PROTOCOLNAME");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_6); 

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

            otherlv_5=(Token)match(input,18,FOLLOW_8); 

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

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:252:4: otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_6); 

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

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
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
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

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
    // InternalMyDsl.g:364:1: ruleRoleSet returns [EObject current=null] : (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ROLESETNAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) ) ;
    public final EObject ruleRoleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:370:2: ( (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ROLESETNAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) ) )
            // InternalMyDsl.g:371:2: (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ROLESETNAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) )
            {
            // InternalMyDsl.g:371:2: (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ROLESETNAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) )
            // InternalMyDsl.g:372:3: otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ROLESETNAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleSetAccess().getRolesetKeyword_0());
            		
            // InternalMyDsl.g:376:3: ( (lv_name_1_0= RULE_ROLESETNAME ) )
            // InternalMyDsl.g:377:4: (lv_name_1_0= RULE_ROLESETNAME )
            {
            // InternalMyDsl.g:377:4: (lv_name_1_0= RULE_ROLESETNAME )
            // InternalMyDsl.g:378:5: lv_name_1_0= RULE_ROLESETNAME
            {
            lv_name_1_0=(Token)match(input,RULE_ROLESETNAME,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleSetAccess().getNameROLESETNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globalTypes.MyDsl.ROLESETNAME");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleSetAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:398:3: ( (otherlv_3= RULE_ROLENAME ) )
            // InternalMyDsl.g:399:4: (otherlv_3= RULE_ROLENAME )
            {
            // InternalMyDsl.g:399:4: (otherlv_3= RULE_ROLENAME )
            // InternalMyDsl.g:400:5: otherlv_3= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleSetRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ROLENAME,FOLLOW_2); 

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

                if ( ((LA5_0>=24 && LA5_0<=25)||LA5_0==27||LA5_0==29||(LA5_0>=38 && LA5_0<=43)) ) {
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
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt4=4;
            	        }
            	        break;
            	    case 25:
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
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            					
            	            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:533:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:539:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' ) )
            // InternalMyDsl.g:540:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' )
            {
            // InternalMyDsl.g:540:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' )
            // InternalMyDsl.g:541:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:545:3: ( (lv_name_1_0= RULE_RECNAME ) )
            // InternalMyDsl.g:546:4: (lv_name_1_0= RULE_RECNAME )
            {
            // InternalMyDsl.g:546:4: (lv_name_1_0= RULE_RECNAME )
            // InternalMyDsl.g:547:5: lv_name_1_0= RULE_RECNAME
            {
            lv_name_1_0=(Token)match(input,RULE_RECNAME,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyDsl.g:578:1: ruleCloseRecursion returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' ) ;
    public final EObject ruleCloseRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:584:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:585:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:585:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' )
            // InternalMyDsl.g:586:3: otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:590:3: ( (otherlv_1= RULE_RECNAME ) )
            // InternalMyDsl.g:591:4: (otherlv_1= RULE_RECNAME )
            {
            // InternalMyDsl.g:591:4: (otherlv_1= RULE_RECNAME )
            // InternalMyDsl.g:592:5: otherlv_1= RULE_RECNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseRecursionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_RECNAME,FOLLOW_16); 

            					newLeafNode(otherlv_1, grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMyDsl.g:618:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLESETNAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:624:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLESETNAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:625:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLESETNAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:625:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLESETNAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            // InternalMyDsl.g:626:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOne ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLESETNAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:630:3: ( (lv_eachRole_1_0= ruleRoleOne ) )
            // InternalMyDsl.g:631:4: (lv_eachRole_1_0= ruleRoleOne )
            {
            // InternalMyDsl.g:631:4: (lv_eachRole_1_0= ruleRoleOne )
            // InternalMyDsl.g:632:5: lv_eachRole_1_0= ruleRoleOne
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getEachRoleRoleOneParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:653:3: ( (otherlv_3= RULE_ROLESETNAME ) )
            // InternalMyDsl.g:654:4: (otherlv_3= RULE_ROLESETNAME )
            {
            // InternalMyDsl.g:654:4: (otherlv_3= RULE_ROLESETNAME )
            // InternalMyDsl.g:655:5: otherlv_3= RULE_ROLESETNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ROLESETNAME,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getRoleRoleSetCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_8); 

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

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMyDsl.g:704:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) ;
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
            // InternalMyDsl.g:710:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) )
            // InternalMyDsl.g:711:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            {
            // InternalMyDsl.g:711:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            // InternalMyDsl.g:712:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branches_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:720:3: ( (otherlv_2= RULE_ROLENAME ) )
            // InternalMyDsl.g:721:4: (otherlv_2= RULE_ROLENAME )
            {
            // InternalMyDsl.g:721:4: (otherlv_2= RULE_ROLENAME )
            // InternalMyDsl.g:722:5: otherlv_2= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ROLENAME,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

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

            otherlv_6=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:779:3: (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:780:4: otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branches_10_0= ruleProtocol ) ) otherlv_11= '}'
            	    {
            	    otherlv_7=(Token)match(input,31,FOLLOW_18); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getOrKeyword_7_0());
            	    			
            	    otherlv_8=(Token)match(input,28,FOLLOW_20); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_21); 

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
    // InternalMyDsl.g:842:1: ruleMessage returns [EObject current=null] : ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' ) ;
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
            // InternalMyDsl.g:848:2: ( ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' ) )
            // InternalMyDsl.g:849:2: ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:849:2: ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' )
            // InternalMyDsl.g:850:3: ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';'
            {
            // InternalMyDsl.g:850:3: ( (lv_messageType_0_0= ruleMessageType ) )
            // InternalMyDsl.g:851:4: (lv_messageType_0_0= ruleMessageType )
            {
            // InternalMyDsl.g:851:4: (lv_messageType_0_0= ruleMessageType )
            // InternalMyDsl.g:852:5: lv_messageType_0_0= ruleMessageType
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

            otherlv_1=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:873:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=44 && LA7_0<=46)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:874:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:874:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:875:5: lv_payload_2_0= rulePayload
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

            otherlv_3=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getFromKeyword_4());
            		
            // InternalMyDsl.g:900:3: ( (otherlv_5= RULE_ROLENAME ) )
            // InternalMyDsl.g:901:4: (otherlv_5= RULE_ROLENAME )
            {
            // InternalMyDsl.g:901:4: (otherlv_5= RULE_ROLENAME )
            // InternalMyDsl.g:902:5: otherlv_5= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ROLENAME,FOLLOW_25); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getToKeyword_6());
            		
            // InternalMyDsl.g:917:3: ( (otherlv_7= RULE_ROLENAME ) )
            // InternalMyDsl.g:918:4: (otherlv_7= RULE_ROLENAME )
            {
            // InternalMyDsl.g:918:4: (otherlv_7= RULE_ROLENAME )
            // InternalMyDsl.g:919:5: otherlv_7= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ROLENAME,FOLLOW_16); 

            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getReceiverRoleOneCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMyDsl.g:938:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalMyDsl.g:938:48: (iv_rulePayload= rulePayload EOF )
            // InternalMyDsl.g:939:2: iv_rulePayload= rulePayload EOF
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
    // InternalMyDsl.g:945:1: rulePayload returns [EObject current=null] : ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_types_4_0=null;
        AntlrDatatypeRuleToken lv_types_1_0 = null;

        AntlrDatatypeRuleToken lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:951:2: ( ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:952:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:952:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) | ( (lv_types_4_0= RULE_ID ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=44 && LA9_0<=46)) ) {
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
                    // InternalMyDsl.g:953:3: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
                    {
                    // InternalMyDsl.g:953:3: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
                    // InternalMyDsl.g:954:4: () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
                    {
                    // InternalMyDsl.g:954:4: ()
                    // InternalMyDsl.g:955:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPayloadAccess().getPayloadAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:961:4: ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
                    // InternalMyDsl.g:962:5: ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
                    {
                    // InternalMyDsl.g:962:5: ( (lv_types_1_0= ruleType ) )
                    // InternalMyDsl.g:963:6: (lv_types_1_0= ruleType )
                    {
                    // InternalMyDsl.g:963:6: (lv_types_1_0= ruleType )
                    // InternalMyDsl.g:964:7: lv_types_1_0= ruleType
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

                    // InternalMyDsl.g:981:5: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:982:6: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_26); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getPayloadAccess().getCommaKeyword_0_1_1_0());
                    	    					
                    	    // InternalMyDsl.g:986:6: ( (lv_types_3_0= ruleType ) )
                    	    // InternalMyDsl.g:987:7: (lv_types_3_0= ruleType )
                    	    {
                    	    // InternalMyDsl.g:987:7: (lv_types_3_0= ruleType )
                    	    // InternalMyDsl.g:988:8: lv_types_3_0= ruleType
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
                    // InternalMyDsl.g:1009:3: ( (lv_types_4_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1009:3: ( (lv_types_4_0= RULE_ID ) )
                    // InternalMyDsl.g:1010:4: (lv_types_4_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1010:4: (lv_types_4_0= RULE_ID )
                    // InternalMyDsl.g:1011:5: lv_types_4_0= RULE_ID
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
    // InternalMyDsl.g:1031:1: entryRuleLocalProtocol returns [EObject current=null] : iv_ruleLocalProtocol= ruleLocalProtocol EOF ;
    public final EObject entryRuleLocalProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalProtocol = null;


        try {
            // InternalMyDsl.g:1031:54: (iv_ruleLocalProtocol= ruleLocalProtocol EOF )
            // InternalMyDsl.g:1032:2: iv_ruleLocalProtocol= ruleLocalProtocol EOF
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
    // InternalMyDsl.g:1038:1: ruleLocalProtocol returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) ) otherlv_3= 'projection' otherlv_4= 'on' ( ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) | ( (lv_projectedRole_6_0= RULE_ROLESETNAME ) ) ) otherlv_7= '(' ( (lv_roles_8_0= ruleRolesL ) ) otherlv_9= ')' otherlv_10= '{' ( (lv_protocol_11_0= ruleProtocolL ) ) otherlv_12= '}' ) ;
    public final EObject ruleLocalProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_protocolName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_projectedRole_5_0=null;
        Token lv_projectedRole_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_roles_8_0 = null;

        EObject lv_protocol_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1044:2: ( (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) ) otherlv_3= 'projection' otherlv_4= 'on' ( ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) | ( (lv_projectedRole_6_0= RULE_ROLESETNAME ) ) ) otherlv_7= '(' ( (lv_roles_8_0= ruleRolesL ) ) otherlv_9= ')' otherlv_10= '{' ( (lv_protocol_11_0= ruleProtocolL ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1045:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) ) otherlv_3= 'projection' otherlv_4= 'on' ( ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) | ( (lv_projectedRole_6_0= RULE_ROLESETNAME ) ) ) otherlv_7= '(' ( (lv_roles_8_0= ruleRolesL ) ) otherlv_9= ')' otherlv_10= '{' ( (lv_protocol_11_0= ruleProtocolL ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1045:2: (otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) ) otherlv_3= 'projection' otherlv_4= 'on' ( ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) | ( (lv_projectedRole_6_0= RULE_ROLESETNAME ) ) ) otherlv_7= '(' ( (lv_roles_8_0= ruleRolesL ) ) otherlv_9= ')' otherlv_10= '{' ( (lv_protocol_11_0= ruleProtocolL ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1046:3: otherlv_0= 'local' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) ) otherlv_3= 'projection' otherlv_4= 'on' ( ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) | ( (lv_projectedRole_6_0= RULE_ROLESETNAME ) ) ) otherlv_7= '(' ( (lv_roles_8_0= ruleRolesL ) ) otherlv_9= ')' otherlv_10= '{' ( (lv_protocol_11_0= ruleProtocolL ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalProtocolAccess().getLocalKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:1054:3: ( (lv_protocolName_2_0= RULE_PROTOCOLNAME ) )
            // InternalMyDsl.g:1055:4: (lv_protocolName_2_0= RULE_PROTOCOLNAME )
            {
            // InternalMyDsl.g:1055:4: (lv_protocolName_2_0= RULE_PROTOCOLNAME )
            // InternalMyDsl.g:1056:5: lv_protocolName_2_0= RULE_PROTOCOLNAME
            {
            lv_protocolName_2_0=(Token)match(input,RULE_PROTOCOLNAME,FOLLOW_27); 

            					newLeafNode(lv_protocolName_2_0, grammarAccess.getLocalProtocolAccess().getProtocolNamePROTOCOLNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalProtocolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocolName",
            						lv_protocolName_2_0,
            						"org.xtext.globalTypes.MyDsl.PROTOCOLNAME");
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalProtocolAccess().getProjectionKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getLocalProtocolAccess().getOnKeyword_4());
            		
            // InternalMyDsl.g:1080:3: ( ( (lv_projectedRole_5_0= RULE_ROLENAME ) ) | ( (lv_projectedRole_6_0= RULE_ROLESETNAME ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ROLENAME) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ROLESETNAME) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1081:4: ( (lv_projectedRole_5_0= RULE_ROLENAME ) )
                    {
                    // InternalMyDsl.g:1081:4: ( (lv_projectedRole_5_0= RULE_ROLENAME ) )
                    // InternalMyDsl.g:1082:5: (lv_projectedRole_5_0= RULE_ROLENAME )
                    {
                    // InternalMyDsl.g:1082:5: (lv_projectedRole_5_0= RULE_ROLENAME )
                    // InternalMyDsl.g:1083:6: lv_projectedRole_5_0= RULE_ROLENAME
                    {
                    lv_projectedRole_5_0=(Token)match(input,RULE_ROLENAME,FOLLOW_5); 

                    						newLeafNode(lv_projectedRole_5_0, grammarAccess.getLocalProtocolAccess().getProjectedRoleROLENAMETerminalRuleCall_5_0_0());
                    					

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


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1100:4: ( (lv_projectedRole_6_0= RULE_ROLESETNAME ) )
                    {
                    // InternalMyDsl.g:1100:4: ( (lv_projectedRole_6_0= RULE_ROLESETNAME ) )
                    // InternalMyDsl.g:1101:5: (lv_projectedRole_6_0= RULE_ROLESETNAME )
                    {
                    // InternalMyDsl.g:1101:5: (lv_projectedRole_6_0= RULE_ROLESETNAME )
                    // InternalMyDsl.g:1102:6: lv_projectedRole_6_0= RULE_ROLESETNAME
                    {
                    lv_projectedRole_6_0=(Token)match(input,RULE_ROLESETNAME,FOLLOW_5); 

                    						newLeafNode(lv_projectedRole_6_0, grammarAccess.getLocalProtocolAccess().getProjectedRoleROLESETNAMETerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocalProtocolRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"projectedRole",
                    							lv_projectedRole_6_0,
                    							"org.xtext.globalTypes.MyDsl.ROLESETNAME");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_6());
            		
            // InternalMyDsl.g:1123:3: ( (lv_roles_8_0= ruleRolesL ) )
            // InternalMyDsl.g:1124:4: (lv_roles_8_0= ruleRolesL )
            {
            // InternalMyDsl.g:1124:4: (lv_roles_8_0= ruleRolesL )
            // InternalMyDsl.g:1125:5: lv_roles_8_0= ruleRolesL
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getRolesRolesLParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_roles_8_0=ruleRolesL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalProtocolRule());
            					}
            					set(
            						current,
            						"roles",
            						lv_roles_8_0,
            						"org.xtext.globalTypes.MyDsl.RolesL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMyDsl.g:1150:3: ( (lv_protocol_11_0= ruleProtocolL ) )
            // InternalMyDsl.g:1151:4: (lv_protocol_11_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1151:4: (lv_protocol_11_0= ruleProtocolL )
            // InternalMyDsl.g:1152:5: lv_protocol_11_0= ruleProtocolL
            {

            					newCompositeNode(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_protocol_11_0=ruleProtocolL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalProtocolRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_11_0,
            						"org.xtext.globalTypes.MyDsl.ProtocolL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalMyDsl.g:1177:1: entryRuleRolesL returns [EObject current=null] : iv_ruleRolesL= ruleRolesL EOF ;
    public final EObject entryRuleRolesL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolesL = null;


        try {
            // InternalMyDsl.g:1177:47: (iv_ruleRolesL= ruleRolesL EOF )
            // InternalMyDsl.g:1178:2: iv_ruleRolesL= ruleRolesL EOF
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
    // InternalMyDsl.g:1184:1: ruleRolesL returns [EObject current=null] : ( ( (lv_roles_0_0= ruleRoleL ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )* ) ;
    public final EObject ruleRolesL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_roles_0_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1190:2: ( ( ( (lv_roles_0_0= ruleRoleL ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )* ) )
            // InternalMyDsl.g:1191:2: ( ( (lv_roles_0_0= ruleRoleL ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )* )
            {
            // InternalMyDsl.g:1191:2: ( ( (lv_roles_0_0= ruleRoleL ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )* )
            // InternalMyDsl.g:1192:3: ( (lv_roles_0_0= ruleRoleL ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )*
            {
            // InternalMyDsl.g:1192:3: ( (lv_roles_0_0= ruleRoleL ) )
            // InternalMyDsl.g:1193:4: (lv_roles_0_0= ruleRoleL )
            {
            // InternalMyDsl.g:1193:4: (lv_roles_0_0= ruleRoleL )
            // InternalMyDsl.g:1194:5: lv_roles_0_0= ruleRoleL
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

            // InternalMyDsl.g:1211:3: (otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1212:4: otherlv_1= ',' ( (lv_roles_2_0= ruleRoleL ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRolesLAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1216:4: ( (lv_roles_2_0= ruleRoleL ) )
            	    // InternalMyDsl.g:1217:5: (lv_roles_2_0= ruleRoleL )
            	    {
            	    // InternalMyDsl.g:1217:5: (lv_roles_2_0= ruleRoleL )
            	    // InternalMyDsl.g:1218:6: lv_roles_2_0= ruleRoleL
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
    // $ANTLR end "ruleRolesL"


    // $ANTLR start "entryRuleRoleL"
    // InternalMyDsl.g:1240:1: entryRuleRoleL returns [EObject current=null] : iv_ruleRoleL= ruleRoleL EOF ;
    public final EObject entryRuleRoleL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleL = null;


        try {
            // InternalMyDsl.g:1240:46: (iv_ruleRoleL= ruleRoleL EOF )
            // InternalMyDsl.g:1241:2: iv_ruleRoleL= ruleRoleL EOF
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
    // InternalMyDsl.g:1247:1: ruleRoleL returns [EObject current=null] : (this_RoleOneL_0= ruleRoleOneL | this_RoleSetL_1= ruleRoleSetL ) ;
    public final EObject ruleRoleL() throws RecognitionException {
        EObject current = null;

        EObject this_RoleOneL_0 = null;

        EObject this_RoleSetL_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1253:2: ( (this_RoleOneL_0= ruleRoleOneL | this_RoleSetL_1= ruleRoleSetL ) )
            // InternalMyDsl.g:1254:2: (this_RoleOneL_0= ruleRoleOneL | this_RoleSetL_1= ruleRoleSetL )
            {
            // InternalMyDsl.g:1254:2: (this_RoleOneL_0= ruleRoleOneL | this_RoleSetL_1= ruleRoleSetL )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1255:3: this_RoleOneL_0= ruleRoleOneL
                    {

                    			newCompositeNode(grammarAccess.getRoleLAccess().getRoleOneLParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoleOneL_0=ruleRoleOneL();

                    state._fsp--;


                    			current = this_RoleOneL_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1264:3: this_RoleSetL_1= ruleRoleSetL
                    {

                    			newCompositeNode(grammarAccess.getRoleLAccess().getRoleSetLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoleSetL_1=ruleRoleSetL();

                    state._fsp--;


                    			current = this_RoleSetL_1;
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
    // $ANTLR end "ruleRoleL"


    // $ANTLR start "entryRuleRoleOneL"
    // InternalMyDsl.g:1276:1: entryRuleRoleOneL returns [EObject current=null] : iv_ruleRoleOneL= ruleRoleOneL EOF ;
    public final EObject entryRuleRoleOneL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleOneL = null;


        try {
            // InternalMyDsl.g:1276:49: (iv_ruleRoleOneL= ruleRoleOneL EOF )
            // InternalMyDsl.g:1277:2: iv_ruleRoleOneL= ruleRoleOneL EOF
            {
             newCompositeNode(grammarAccess.getRoleOneLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleOneL=ruleRoleOneL();

            state._fsp--;

             current =iv_ruleRoleOneL; 
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
    // $ANTLR end "entryRuleRoleOneL"


    // $ANTLR start "ruleRoleOneL"
    // InternalMyDsl.g:1283:1: ruleRoleOneL returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) ) ;
    public final EObject ruleRoleOneL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1289:2: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) ) )
            // InternalMyDsl.g:1290:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) )
            {
            // InternalMyDsl.g:1290:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) )
            // InternalMyDsl.g:1291:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleOneLAccess().getRoleKeyword_0());
            		
            // InternalMyDsl.g:1295:3: ( (lv_name_1_0= RULE_ROLENAME ) )
            // InternalMyDsl.g:1296:4: (lv_name_1_0= RULE_ROLENAME )
            {
            // InternalMyDsl.g:1296:4: (lv_name_1_0= RULE_ROLENAME )
            // InternalMyDsl.g:1297:5: lv_name_1_0= RULE_ROLENAME
            {
            lv_name_1_0=(Token)match(input,RULE_ROLENAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleOneLAccess().getNameROLENAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleOneLRule());
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
    // $ANTLR end "ruleRoleOneL"


    // $ANTLR start "entryRuleRoleSetL"
    // InternalMyDsl.g:1317:1: entryRuleRoleSetL returns [EObject current=null] : iv_ruleRoleSetL= ruleRoleSetL EOF ;
    public final EObject entryRuleRoleSetL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleSetL = null;


        try {
            // InternalMyDsl.g:1317:49: (iv_ruleRoleSetL= ruleRoleSetL EOF )
            // InternalMyDsl.g:1318:2: iv_ruleRoleSetL= ruleRoleSetL EOF
            {
             newCompositeNode(grammarAccess.getRoleSetLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleSetL=ruleRoleSetL();

            state._fsp--;

             current =iv_ruleRoleSetL; 
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
    // $ANTLR end "entryRuleRoleSetL"


    // $ANTLR start "ruleRoleSetL"
    // InternalMyDsl.g:1324:1: ruleRoleSetL returns [EObject current=null] : (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ROLESETNAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) ) ;
    public final EObject ruleRoleSetL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1330:2: ( (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ROLESETNAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) ) )
            // InternalMyDsl.g:1331:2: (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ROLESETNAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) )
            {
            // InternalMyDsl.g:1331:2: (otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ROLESETNAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) )
            // InternalMyDsl.g:1332:3: otherlv_0= 'roleset' ( (lv_name_1_0= RULE_ROLESETNAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleSetLAccess().getRolesetKeyword_0());
            		
            // InternalMyDsl.g:1336:3: ( (lv_name_1_0= RULE_ROLESETNAME ) )
            // InternalMyDsl.g:1337:4: (lv_name_1_0= RULE_ROLESETNAME )
            {
            // InternalMyDsl.g:1337:4: (lv_name_1_0= RULE_ROLESETNAME )
            // InternalMyDsl.g:1338:5: lv_name_1_0= RULE_ROLESETNAME
            {
            lv_name_1_0=(Token)match(input,RULE_ROLESETNAME,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleSetLAccess().getNameROLESETNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleSetLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globalTypes.MyDsl.ROLESETNAME");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleSetLAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:1358:3: ( (otherlv_3= RULE_ROLENAME ) )
            // InternalMyDsl.g:1359:4: (otherlv_3= RULE_ROLENAME )
            {
            // InternalMyDsl.g:1359:4: (otherlv_3= RULE_ROLENAME )
            // InternalMyDsl.g:1360:5: otherlv_3= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleSetLRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ROLENAME,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getRoleSetLAccess().getRefRoleOneLCrossReference_3_0());
            				

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
    // $ANTLR end "ruleRoleSetL"


    // $ANTLR start "entryRuleProtocolL"
    // InternalMyDsl.g:1375:1: entryRuleProtocolL returns [EObject current=null] : iv_ruleProtocolL= ruleProtocolL EOF ;
    public final EObject entryRuleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolL = null;


        try {
            // InternalMyDsl.g:1375:50: (iv_ruleProtocolL= ruleProtocolL EOF )
            // InternalMyDsl.g:1376:2: iv_ruleProtocolL= ruleProtocolL EOF
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
    // InternalMyDsl.g:1382:1: ruleProtocolL returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* ) ;
    public final EObject ruleProtocolL() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_1_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1388:2: ( ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* ) )
            // InternalMyDsl.g:1389:2: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* )
            {
            // InternalMyDsl.g:1389:2: ( () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* )
            // InternalMyDsl.g:1390:3: () ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )*
            {
            // InternalMyDsl.g:1390:3: ()
            // InternalMyDsl.g:1391:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolLAccess().getProtocolLAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1397:3: ( ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=24 && LA14_0<=25)||LA14_0==27||LA14_0==29||(LA14_0>=38 && LA14_0<=43)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1398:4: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) )
            	    {
            	    // InternalMyDsl.g:1398:4: ( (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) )
            	    // InternalMyDsl.g:1399:5: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion )
            	    {
            	    // InternalMyDsl.g:1399:5: (lv_actions_1_1= ruleMessageL | lv_actions_1_2= ruleChoiceL | lv_actions_1_3= ruleForEachL | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion )
            	    int alt13=5;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt13=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // InternalMyDsl.g:1400:6: lv_actions_1_1= ruleMessageL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsMessageLParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            // InternalMyDsl.g:1416:6: lv_actions_1_2= ruleChoiceL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsChoiceLParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            // InternalMyDsl.g:1432:6: lv_actions_1_3= ruleForEachL
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsForEachLParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            // InternalMyDsl.g:1448:6: lv_actions_1_4= ruleRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsRecursionParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            // InternalMyDsl.g:1464:6: lv_actions_1_5= ruleCloseRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolLAccess().getActionsCloseRecursionParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_14);
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
    // $ANTLR end "ruleProtocolL"


    // $ANTLR start "entryRuleMessageL"
    // InternalMyDsl.g:1486:1: entryRuleMessageL returns [EObject current=null] : iv_ruleMessageL= ruleMessageL EOF ;
    public final EObject entryRuleMessageL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageL = null;


        try {
            // InternalMyDsl.g:1486:49: (iv_ruleMessageL= ruleMessageL EOF )
            // InternalMyDsl.g:1487:2: iv_ruleMessageL= ruleMessageL EOF
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
    // InternalMyDsl.g:1493:1: ruleMessageL returns [EObject current=null] : ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' ) ;
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
            // InternalMyDsl.g:1499:2: ( ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' ) )
            // InternalMyDsl.g:1500:2: ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' )
            {
            // InternalMyDsl.g:1500:2: ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';' )
            // InternalMyDsl.g:1501:3: ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' ( (lv_target_4_0= ruleSenderL ) )? ( (lv_target_5_0= ruleReceiverL ) )? otherlv_6= ';'
            {
            // InternalMyDsl.g:1501:3: ( (lv_messageType_0_0= ruleMessageType ) )
            // InternalMyDsl.g:1502:4: (lv_messageType_0_0= ruleMessageType )
            {
            // InternalMyDsl.g:1502:4: (lv_messageType_0_0= ruleMessageType )
            // InternalMyDsl.g:1503:5: lv_messageType_0_0= ruleMessageType
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

            otherlv_1=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageLAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1524:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||(LA15_0>=44 && LA15_0<=46)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1525:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:1525:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:1526:5: lv_payload_2_0= rulePayload
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

            otherlv_3=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageLAccess().getRightParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1547:3: ( (lv_target_4_0= ruleSenderL ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1548:4: (lv_target_4_0= ruleSenderL )
                    {
                    // InternalMyDsl.g:1548:4: (lv_target_4_0= ruleSenderL )
                    // InternalMyDsl.g:1549:5: lv_target_4_0= ruleSenderL
                    {

                    					newCompositeNode(grammarAccess.getMessageLAccess().getTargetSenderLParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_31);
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

            // InternalMyDsl.g:1566:3: ( (lv_target_5_0= ruleReceiverL ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1567:4: (lv_target_5_0= ruleReceiverL )
                    {
                    // InternalMyDsl.g:1567:4: (lv_target_5_0= ruleReceiverL )
                    // InternalMyDsl.g:1568:5: lv_target_5_0= ruleReceiverL
                    {

                    					newCompositeNode(grammarAccess.getMessageLAccess().getTargetReceiverLParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_16);
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

            otherlv_6=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMyDsl.g:1593:1: entryRuleSenderL returns [EObject current=null] : iv_ruleSenderL= ruleSenderL EOF ;
    public final EObject entryRuleSenderL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenderL = null;


        try {
            // InternalMyDsl.g:1593:48: (iv_ruleSenderL= ruleSenderL EOF )
            // InternalMyDsl.g:1594:2: iv_ruleSenderL= ruleSenderL EOF
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
    // InternalMyDsl.g:1600:1: ruleSenderL returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ROLENAME ) ) ) ;
    public final EObject ruleSenderL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1606:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ROLENAME ) ) ) )
            // InternalMyDsl.g:1607:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ROLENAME ) ) )
            {
            // InternalMyDsl.g:1607:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ROLENAME ) ) )
            // InternalMyDsl.g:1608:3: otherlv_0= 'from' ( (otherlv_1= RULE_ROLENAME ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSenderLAccess().getFromKeyword_0());
            		
            // InternalMyDsl.g:1612:3: ( (otherlv_1= RULE_ROLENAME ) )
            // InternalMyDsl.g:1613:4: (otherlv_1= RULE_ROLENAME )
            {
            // InternalMyDsl.g:1613:4: (otherlv_1= RULE_ROLENAME )
            // InternalMyDsl.g:1614:5: otherlv_1= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSenderLRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ROLENAME,FOLLOW_2); 

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
    // InternalMyDsl.g:1629:1: entryRuleReceiverL returns [EObject current=null] : iv_ruleReceiverL= ruleReceiverL EOF ;
    public final EObject entryRuleReceiverL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverL = null;


        try {
            // InternalMyDsl.g:1629:50: (iv_ruleReceiverL= ruleReceiverL EOF )
            // InternalMyDsl.g:1630:2: iv_ruleReceiverL= ruleReceiverL EOF
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
    // InternalMyDsl.g:1636:1: ruleReceiverL returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ROLENAME ) ) ) ;
    public final EObject ruleReceiverL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1642:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ROLENAME ) ) ) )
            // InternalMyDsl.g:1643:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ROLENAME ) ) )
            {
            // InternalMyDsl.g:1643:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ROLENAME ) ) )
            // InternalMyDsl.g:1644:3: otherlv_0= 'to' ( (otherlv_1= RULE_ROLENAME ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiverLAccess().getToKeyword_0());
            		
            // InternalMyDsl.g:1648:3: ( (otherlv_1= RULE_ROLENAME ) )
            // InternalMyDsl.g:1649:4: (otherlv_1= RULE_ROLENAME )
            {
            // InternalMyDsl.g:1649:4: (otherlv_1= RULE_ROLENAME )
            // InternalMyDsl.g:1650:5: otherlv_1= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReceiverLRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ROLENAME,FOLLOW_2); 

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
    // InternalMyDsl.g:1665:1: entryRuleChoiceL returns [EObject current=null] : iv_ruleChoiceL= ruleChoiceL EOF ;
    public final EObject entryRuleChoiceL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceL = null;


        try {
            // InternalMyDsl.g:1665:48: (iv_ruleChoiceL= ruleChoiceL EOF )
            // InternalMyDsl.g:1666:2: iv_ruleChoiceL= ruleChoiceL EOF
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
    // InternalMyDsl.g:1672:1: ruleChoiceL returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* ) ;
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
            // InternalMyDsl.g:1678:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* ) )
            // InternalMyDsl.g:1679:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* )
            {
            // InternalMyDsl.g:1679:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )* )
            // InternalMyDsl.g:1680:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessageL ) ) ( (lv_branches_5_0= ruleProtocolL ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceLAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceLAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:1688:3: ( (otherlv_2= RULE_ROLENAME ) )
            // InternalMyDsl.g:1689:4: (otherlv_2= RULE_ROLENAME )
            {
            // InternalMyDsl.g:1689:4: (otherlv_2= RULE_ROLENAME )
            // InternalMyDsl.g:1690:5: otherlv_2= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceLRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ROLENAME,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceLAccess().getRoleRoleLCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1705:3: ( (lv_message_4_0= ruleMessageL ) )
            // InternalMyDsl.g:1706:4: (lv_message_4_0= ruleMessageL )
            {
            // InternalMyDsl.g:1706:4: (lv_message_4_0= ruleMessageL )
            // InternalMyDsl.g:1707:5: lv_message_4_0= ruleMessageL
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

            // InternalMyDsl.g:1724:3: ( (lv_branches_5_0= ruleProtocolL ) )
            // InternalMyDsl.g:1725:4: (lv_branches_5_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1725:4: (lv_branches_5_0= ruleProtocolL )
            // InternalMyDsl.g:1726:5: lv_branches_5_0= ruleProtocolL
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

            otherlv_6=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:1747:3: (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1748:4: otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessageL ) ) ( (lv_branches_10_0= ruleProtocolL ) ) otherlv_11= '}'
            	    {
            	    otherlv_7=(Token)match(input,31,FOLLOW_18); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceLAccess().getOrKeyword_7_0());
            	    			
            	    otherlv_8=(Token)match(input,28,FOLLOW_20); 

            	    				newLeafNode(otherlv_8, grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_7_1());
            	    			
            	    // InternalMyDsl.g:1756:4: ( (lv_message_9_0= ruleMessageL ) )
            	    // InternalMyDsl.g:1757:5: (lv_message_9_0= ruleMessageL )
            	    {
            	    // InternalMyDsl.g:1757:5: (lv_message_9_0= ruleMessageL )
            	    // InternalMyDsl.g:1758:6: lv_message_9_0= ruleMessageL
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

            	    // InternalMyDsl.g:1775:4: ( (lv_branches_10_0= ruleProtocolL ) )
            	    // InternalMyDsl.g:1776:5: (lv_branches_10_0= ruleProtocolL )
            	    {
            	    // InternalMyDsl.g:1776:5: (lv_branches_10_0= ruleProtocolL )
            	    // InternalMyDsl.g:1777:6: lv_branches_10_0= ruleProtocolL
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

            	    otherlv_11=(Token)match(input,19,FOLLOW_21); 

            	    				newLeafNode(otherlv_11, grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_7_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:1803:1: entryRuleForEachL returns [EObject current=null] : iv_ruleForEachL= ruleForEachL EOF ;
    public final EObject entryRuleForEachL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachL = null;


        try {
            // InternalMyDsl.g:1803:49: (iv_ruleForEachL= ruleForEachL EOF )
            // InternalMyDsl.g:1804:2: iv_ruleForEachL= ruleForEachL EOF
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
    // InternalMyDsl.g:1810:1: ruleForEachL returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOneL ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLESETNAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1816:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOneL ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLESETNAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1817:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOneL ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLESETNAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1817:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOneL ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLESETNAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1818:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRoleOneL ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLESETNAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocolL ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachLAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:1822:3: ( (lv_eachRole_1_0= ruleRoleOneL ) )
            // InternalMyDsl.g:1823:4: (lv_eachRole_1_0= ruleRoleOneL )
            {
            // InternalMyDsl.g:1823:4: (lv_eachRole_1_0= ruleRoleOneL )
            // InternalMyDsl.g:1824:5: lv_eachRole_1_0= ruleRoleOneL
            {

            					newCompositeNode(grammarAccess.getForEachLAccess().getEachRoleRoleOneLParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_eachRole_1_0=ruleRoleOneL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachLRule());
            					}
            					set(
            						current,
            						"eachRole",
            						lv_eachRole_1_0,
            						"org.xtext.globalTypes.MyDsl.RoleOneL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachLAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:1845:3: ( (otherlv_3= RULE_ROLESETNAME ) )
            // InternalMyDsl.g:1846:4: (otherlv_3= RULE_ROLESETNAME )
            {
            // InternalMyDsl.g:1846:4: (otherlv_3= RULE_ROLESETNAME )
            // InternalMyDsl.g:1847:5: otherlv_3= RULE_ROLESETNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachLRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ROLESETNAME,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getForEachLAccess().getRoleRoleSetLCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1862:3: ( (lv_branch_5_0= ruleProtocolL ) )
            // InternalMyDsl.g:1863:4: (lv_branch_5_0= ruleProtocolL )
            {
            // InternalMyDsl.g:1863:4: (lv_branch_5_0= ruleProtocolL )
            // InternalMyDsl.g:1864:5: lv_branch_5_0= ruleProtocolL
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

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMessageType"
    // InternalMyDsl.g:1889:1: entryRuleMessageType returns [String current=null] : iv_ruleMessageType= ruleMessageType EOF ;
    public final String entryRuleMessageType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMessageType = null;


        try {
            // InternalMyDsl.g:1889:51: (iv_ruleMessageType= ruleMessageType EOF )
            // InternalMyDsl.g:1890:2: iv_ruleMessageType= ruleMessageType EOF
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
    // InternalMyDsl.g:1896:1: ruleMessageType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' | kw= 'CFP' | kw= 'QUIT' ) ;
    public final AntlrDatatypeRuleToken ruleMessageType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1902:2: ( (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' | kw= 'CFP' | kw= 'QUIT' ) )
            // InternalMyDsl.g:1903:2: (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' | kw= 'CFP' | kw= 'QUIT' )
            {
            // InternalMyDsl.g:1903:2: (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' | kw= 'CFP' | kw= 'QUIT' )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                alt19=4;
                }
                break;
            case 42:
                {
                alt19=5;
                }
                break;
            case 43:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1904:3: kw= 'REQUEST'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getREQUESTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1910:3: kw= 'INFORM'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getINFORMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1916:3: kw= 'AGREE'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getAGREEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1922:3: kw= 'REFUSE'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getREFUSEKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1928:3: kw= 'CFP'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getCFPKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1934:3: kw= 'QUIT'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getQUITKeyword_5());
                    		

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
    // InternalMyDsl.g:1943:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:1943:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:1944:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:1950:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'action' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1956:2: ( (kw= 'int' | kw= 'string' | kw= 'action' ) )
            // InternalMyDsl.g:1957:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            {
            // InternalMyDsl.g:1957:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt20=1;
                }
                break;
            case 45:
                {
                alt20=2;
                }
                break;
            case 46:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1958:3: kw= 'int'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1964:3: kw= 'string'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1970:3: kw= 'action'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000FC02B080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000FC02B000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000FC000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000700100000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000604000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000404000000L});

}