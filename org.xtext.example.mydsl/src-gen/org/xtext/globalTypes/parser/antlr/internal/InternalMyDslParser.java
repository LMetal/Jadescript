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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ROLENAME", "RULE_RECNAME", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'multrole'", "':'", "'rec'", "'loop'", "';'", "'foreach'", "'{'", "'choice'", "'at'", "'or'", "')'", "'from'", "'to'", "'end'", "'REQUEST'", "'INFORM'", "'AGREE'", "'REFUSE'", "'int'", "'string'", "'action'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_RECNAME=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ROLENAME=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
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
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= '){' ( (lv_protocol_6_0= ruleProtocol ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getProtocolKeyword_1());
            		
            // InternalMyDsl.g:87:3: ( (lv_protocolName_2_0= RULE_ID ) )
            // InternalMyDsl.g:88:4: (lv_protocolName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:88:4: (lv_protocolName_2_0= RULE_ID )
            // InternalMyDsl.g:89:5: lv_protocolName_2_0= RULE_ID
            {
            lv_protocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_protocolName_2_0, grammarAccess.getModelAccess().getProtocolNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocolName",
            						lv_protocolName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:109:3: ( (lv_roles_4_0= ruleRoles ) )
            // InternalMyDsl.g:110:4: (lv_roles_4_0= ruleRoles )
            {
            // InternalMyDsl.g:110:4: (lv_roles_4_0= ruleRoles )
            // InternalMyDsl.g:111:5: lv_roles_4_0= ruleRoles
            {

            					newCompositeNode(grammarAccess.getModelAccess().getRolesRolesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_roles_4_0=ruleRoles();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"roles",
            						lv_roles_4_0,
            						"org.xtext.globalTypes.MyDsl.Roles");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightParenthesisLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:132:3: ( (lv_protocol_6_0= ruleProtocol ) )
            // InternalMyDsl.g:133:4: (lv_protocol_6_0= ruleProtocol )
            {
            // InternalMyDsl.g:133:4: (lv_protocol_6_0= ruleProtocol )
            // InternalMyDsl.g:134:5: lv_protocol_6_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_protocol_6_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_6_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleRoles"
    // InternalMyDsl.g:159:1: entryRuleRoles returns [EObject current=null] : iv_ruleRoles= ruleRoles EOF ;
    public final EObject entryRuleRoles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoles = null;


        try {
            // InternalMyDsl.g:159:46: (iv_ruleRoles= ruleRoles EOF )
            // InternalMyDsl.g:160:2: iv_ruleRoles= ruleRoles EOF
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
    // InternalMyDsl.g:166:1: ruleRoles returns [EObject current=null] : ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* ) ;
    public final EObject ruleRoles() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_roles_0_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:172:2: ( ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* ) )
            // InternalMyDsl.g:173:2: ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* )
            {
            // InternalMyDsl.g:173:2: ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* )
            // InternalMyDsl.g:174:3: ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )*
            {
            // InternalMyDsl.g:174:3: ( (lv_roles_0_0= ruleRole ) )
            // InternalMyDsl.g:175:4: (lv_roles_0_0= ruleRole )
            {
            // InternalMyDsl.g:175:4: (lv_roles_0_0= ruleRole )
            // InternalMyDsl.g:176:5: lv_roles_0_0= ruleRole
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

            // InternalMyDsl.g:193:3: (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:194:4: otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRolesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:198:4: ( (lv_roles_2_0= ruleRole ) )
            	    // InternalMyDsl.g:199:5: (lv_roles_2_0= ruleRole )
            	    {
            	    // InternalMyDsl.g:199:5: (lv_roles_2_0= ruleRole )
            	    // InternalMyDsl.g:200:6: lv_roles_2_0= ruleRole
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
            	    break loop1;
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
    // InternalMyDsl.g:222:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalMyDsl.g:222:45: (iv_ruleRole= ruleRole EOF )
            // InternalMyDsl.g:223:2: iv_ruleRole= ruleRole EOF
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
    // InternalMyDsl.g:229:1: ruleRole returns [EObject current=null] : (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_RoleOne_0 = null;

        EObject this_RoleMultiple_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:235:2: ( (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple ) )
            // InternalMyDsl.g:236:2: (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple )
            {
            // InternalMyDsl.g:236:2: (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:237:3: this_RoleOne_0= ruleRoleOne
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
                    // InternalMyDsl.g:246:3: this_RoleMultiple_1= ruleRoleMultiple
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
    // InternalMyDsl.g:258:1: entryRuleRoleOne returns [EObject current=null] : iv_ruleRoleOne= ruleRoleOne EOF ;
    public final EObject entryRuleRoleOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleOne = null;


        try {
            // InternalMyDsl.g:258:48: (iv_ruleRoleOne= ruleRoleOne EOF )
            // InternalMyDsl.g:259:2: iv_ruleRoleOne= ruleRoleOne EOF
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
    // InternalMyDsl.g:265:1: ruleRoleOne returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) ) ;
    public final EObject ruleRoleOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:271:2: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) ) )
            // InternalMyDsl.g:272:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) )
            {
            // InternalMyDsl.g:272:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) ) )
            // InternalMyDsl.g:273:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ROLENAME ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleOneAccess().getRoleKeyword_0());
            		
            // InternalMyDsl.g:277:3: ( (lv_name_1_0= RULE_ROLENAME ) )
            // InternalMyDsl.g:278:4: (lv_name_1_0= RULE_ROLENAME )
            {
            // InternalMyDsl.g:278:4: (lv_name_1_0= RULE_ROLENAME )
            // InternalMyDsl.g:279:5: lv_name_1_0= RULE_ROLENAME
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
    // InternalMyDsl.g:299:1: entryRuleRoleMultiple returns [EObject current=null] : iv_ruleRoleMultiple= ruleRoleMultiple EOF ;
    public final EObject entryRuleRoleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleMultiple = null;


        try {
            // InternalMyDsl.g:299:53: (iv_ruleRoleMultiple= ruleRoleMultiple EOF )
            // InternalMyDsl.g:300:2: iv_ruleRoleMultiple= ruleRoleMultiple EOF
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
    // InternalMyDsl.g:306:1: ruleRoleMultiple returns [EObject current=null] : (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_ROLENAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) ) ;
    public final EObject ruleRoleMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:312:2: ( (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_ROLENAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) ) )
            // InternalMyDsl.g:313:2: (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_ROLENAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) )
            {
            // InternalMyDsl.g:313:2: (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_ROLENAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) )
            // InternalMyDsl.g:314:3: otherlv_0= 'multrole' ( (lv_name_1_0= RULE_ROLENAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleMultipleAccess().getMultroleKeyword_0());
            		
            // InternalMyDsl.g:318:3: ( (lv_name_1_0= RULE_ROLENAME ) )
            // InternalMyDsl.g:319:4: (lv_name_1_0= RULE_ROLENAME )
            {
            // InternalMyDsl.g:319:4: (lv_name_1_0= RULE_ROLENAME )
            // InternalMyDsl.g:320:5: lv_name_1_0= RULE_ROLENAME
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

            otherlv_2=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleMultipleAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:340:3: ( (otherlv_3= RULE_ROLENAME ) )
            // InternalMyDsl.g:341:4: (otherlv_3= RULE_ROLENAME )
            {
            // InternalMyDsl.g:341:4: (otherlv_3= RULE_ROLENAME )
            // InternalMyDsl.g:342:5: otherlv_3= RULE_ROLENAME
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
    // InternalMyDsl.g:357:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalMyDsl.g:357:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalMyDsl.g:358:2: iv_ruleProtocol= ruleProtocol EOF
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
    // InternalMyDsl.g:364:1: ruleProtocol returns [EObject current=null] : ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* ) | ruleEndInteraction ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_1_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:370:2: ( ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* ) | ruleEndInteraction ) )
            // InternalMyDsl.g:371:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* ) | ruleEndInteraction )
            {
            // InternalMyDsl.g:371:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* ) | ruleEndInteraction )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||LA5_0==17||(LA5_0>=22 && LA5_0<=23)||LA5_0==25||LA5_0==27||(LA5_0>=34 && LA5_0<=37)) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:372:3: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* )
                    {
                    // InternalMyDsl.g:372:3: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )* )
                    // InternalMyDsl.g:373:4: () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )*
                    {
                    // InternalMyDsl.g:373:4: ()
                    // InternalMyDsl.g:374:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getProtocolAccess().getProtocolAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:380:4: ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=22 && LA4_0<=23)||LA4_0==25||LA4_0==27||(LA4_0>=34 && LA4_0<=37)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:381:5: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) )
                    	    {
                    	    // InternalMyDsl.g:381:5: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion ) )
                    	    // InternalMyDsl.g:382:6: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion )
                    	    {
                    	    // InternalMyDsl.g:382:6: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleRecursion | lv_actions_1_4= ruleForEach | lv_actions_1_5= ruleCloseRecursion )
                    	    int alt3=5;
                    	    switch ( input.LA(1) ) {
                    	    case 34:
                    	    case 35:
                    	    case 36:
                    	    case 37:
                    	        {
                    	        alt3=1;
                    	        }
                    	        break;
                    	    case 27:
                    	        {
                    	        alt3=2;
                    	        }
                    	        break;
                    	    case 22:
                    	        {
                    	        alt3=3;
                    	        }
                    	        break;
                    	    case 25:
                    	        {
                    	        alt3=4;
                    	        }
                    	        break;
                    	    case 23:
                    	        {
                    	        alt3=5;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 3, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt3) {
                    	        case 1 :
                    	            // InternalMyDsl.g:383:7: lv_actions_1_1= ruleMessage
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
                    	            // InternalMyDsl.g:399:7: lv_actions_1_2= ruleChoice
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
                    	            // InternalMyDsl.g:415:7: lv_actions_1_3= ruleRecursion
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
                    	            // InternalMyDsl.g:431:7: lv_actions_1_4= ruleForEach
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
                    	            // InternalMyDsl.g:447:7: lv_actions_1_5= ruleCloseRecursion
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
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:467:3: ruleEndInteraction
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
    // InternalMyDsl.g:478:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalMyDsl.g:478:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalMyDsl.g:479:2: iv_ruleRecursion= ruleRecursion EOF
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
    // InternalMyDsl.g:485:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:491:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' ) )
            // InternalMyDsl.g:492:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' )
            {
            // InternalMyDsl.g:492:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':' )
            // InternalMyDsl.g:493:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_RECNAME ) ) otherlv_2= ':'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalMyDsl.g:497:3: ( (lv_name_1_0= RULE_RECNAME ) )
            // InternalMyDsl.g:498:4: (lv_name_1_0= RULE_RECNAME )
            {
            // InternalMyDsl.g:498:4: (lv_name_1_0= RULE_RECNAME )
            // InternalMyDsl.g:499:5: lv_name_1_0= RULE_RECNAME
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

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:523:1: entryRuleCloseRecursion returns [EObject current=null] : iv_ruleCloseRecursion= ruleCloseRecursion EOF ;
    public final EObject entryRuleCloseRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursion = null;


        try {
            // InternalMyDsl.g:523:55: (iv_ruleCloseRecursion= ruleCloseRecursion EOF )
            // InternalMyDsl.g:524:2: iv_ruleCloseRecursion= ruleCloseRecursion EOF
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
    // InternalMyDsl.g:530:1: ruleCloseRecursion returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' ) ;
    public final EObject ruleCloseRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:536:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:537:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:537:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';' )
            // InternalMyDsl.g:538:3: otherlv_0= 'loop' ( (otherlv_1= RULE_RECNAME ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:542:3: ( (otherlv_1= RULE_RECNAME ) )
            // InternalMyDsl.g:543:4: (otherlv_1= RULE_RECNAME )
            {
            // InternalMyDsl.g:543:4: (otherlv_1= RULE_RECNAME )
            // InternalMyDsl.g:544:5: otherlv_1= RULE_RECNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseRecursionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_RECNAME,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMyDsl.g:563:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalMyDsl.g:563:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalMyDsl.g:564:2: iv_ruleForEach= ruleForEach EOF
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
    // InternalMyDsl.g:570:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRole ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:576:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRole ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:577:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRole ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:577:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRole ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            // InternalMyDsl.g:578:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRole ) ) otherlv_2= ':' ( (otherlv_3= RULE_ROLENAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:582:3: ( (lv_eachRole_1_0= ruleRole ) )
            // InternalMyDsl.g:583:4: (lv_eachRole_1_0= ruleRole )
            {
            // InternalMyDsl.g:583:4: (lv_eachRole_1_0= ruleRole )
            // InternalMyDsl.g:584:5: lv_eachRole_1_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getEachRoleRoleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_eachRole_1_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"eachRole",
            						lv_eachRole_1_0,
            						"org.xtext.globalTypes.MyDsl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:605:3: ( (otherlv_3= RULE_ROLENAME ) )
            // InternalMyDsl.g:606:4: (otherlv_3= RULE_ROLENAME )
            {
            // InternalMyDsl.g:606:4: (otherlv_3= RULE_ROLENAME )
            // InternalMyDsl.g:607:5: otherlv_3= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ROLENAME,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getRoleRoleMultipleCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:622:3: ( (lv_branch_5_0= ruleProtocol ) )
            // InternalMyDsl.g:623:4: (lv_branch_5_0= ruleProtocol )
            {
            // InternalMyDsl.g:623:4: (lv_branch_5_0= ruleProtocol )
            // InternalMyDsl.g:624:5: lv_branch_5_0= ruleProtocol
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

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalMyDsl.g:649:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalMyDsl.g:649:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalMyDsl.g:650:2: iv_ruleChoice= ruleChoice EOF
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
    // InternalMyDsl.g:656:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) ;
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

        EObject lv_branch_5_0 = null;

        EObject lv_message_9_0 = null;

        EObject lv_branch_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:662:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) )
            // InternalMyDsl.g:663:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            {
            // InternalMyDsl.g:663:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            // InternalMyDsl.g:664:3: otherlv_0= 'choice' otherlv_1= 'at' ( (otherlv_2= RULE_ROLENAME ) ) otherlv_3= '{' ( (lv_message_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
            		
            // InternalMyDsl.g:672:3: ( (otherlv_2= RULE_ROLENAME ) )
            // InternalMyDsl.g:673:4: (otherlv_2= RULE_ROLENAME )
            {
            // InternalMyDsl.g:673:4: (otherlv_2= RULE_ROLENAME )
            // InternalMyDsl.g:674:5: otherlv_2= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ROLENAME,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:689:3: ( (lv_message_4_0= ruleMessage ) )
            // InternalMyDsl.g:690:4: (lv_message_4_0= ruleMessage )
            {
            // InternalMyDsl.g:690:4: (lv_message_4_0= ruleMessage )
            // InternalMyDsl.g:691:5: lv_message_4_0= ruleMessage
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

            // InternalMyDsl.g:708:3: ( (lv_branch_5_0= ruleProtocol ) )
            // InternalMyDsl.g:709:4: (lv_branch_5_0= ruleProtocol )
            {
            // InternalMyDsl.g:709:4: (lv_branch_5_0= ruleProtocol )
            // InternalMyDsl.g:710:5: lv_branch_5_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_branch_5_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceRule());
            					}
            					add(
            						current,
            						"branch",
            						lv_branch_5_0,
            						"org.xtext.globalTypes.MyDsl.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:731:3: (otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:732:4: otherlv_7= 'or' otherlv_8= '{' ( (lv_message_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}'
            	    {
            	    otherlv_7=(Token)match(input,29,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getOrKeyword_7_0());
            	    			
            	    otherlv_8=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_8, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_7_1());
            	    			
            	    // InternalMyDsl.g:740:4: ( (lv_message_9_0= ruleMessage ) )
            	    // InternalMyDsl.g:741:5: (lv_message_9_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:741:5: (lv_message_9_0= ruleMessage )
            	    // InternalMyDsl.g:742:6: lv_message_9_0= ruleMessage
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

            	    // InternalMyDsl.g:759:4: ( (lv_branch_10_0= ruleProtocol ) )
            	    // InternalMyDsl.g:760:5: (lv_branch_10_0= ruleProtocol )
            	    {
            	    // InternalMyDsl.g:760:5: (lv_branch_10_0= ruleProtocol )
            	    // InternalMyDsl.g:761:6: lv_branch_10_0= ruleProtocol
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_branch_10_0=ruleProtocol();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branch",
            	    							lv_branch_10_0,
            	    							"org.xtext.globalTypes.MyDsl.Protocol");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,17,FOLLOW_19); 

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
    // InternalMyDsl.g:787:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:787:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:788:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:794:1: ruleMessage returns [EObject current=null] : ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' ) ;
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
            // InternalMyDsl.g:800:2: ( ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' ) )
            // InternalMyDsl.g:801:2: ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:801:2: ( ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';' )
            // InternalMyDsl.g:802:3: ( (lv_messageType_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (otherlv_5= RULE_ROLENAME ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ROLENAME ) ) otherlv_8= ';'
            {
            // InternalMyDsl.g:802:3: ( (lv_messageType_0_0= ruleMessageType ) )
            // InternalMyDsl.g:803:4: (lv_messageType_0_0= ruleMessageType )
            {
            // InternalMyDsl.g:803:4: (lv_messageType_0_0= ruleMessageType )
            // InternalMyDsl.g:804:5: lv_messageType_0_0= ruleMessageType
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

            otherlv_1=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:825:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=38 && LA7_0<=40)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:826:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalMyDsl.g:826:4: (lv_payload_2_0= rulePayload )
                    // InternalMyDsl.g:827:5: lv_payload_2_0= rulePayload
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getPayloadPayloadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
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

            otherlv_3=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getFromKeyword_4());
            		
            // InternalMyDsl.g:852:3: ( (otherlv_5= RULE_ROLENAME ) )
            // InternalMyDsl.g:853:4: (otherlv_5= RULE_ROLENAME )
            {
            // InternalMyDsl.g:853:4: (otherlv_5= RULE_ROLENAME )
            // InternalMyDsl.g:854:5: otherlv_5= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ROLENAME,FOLLOW_23); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getToKeyword_6());
            		
            // InternalMyDsl.g:869:3: ( (otherlv_7= RULE_ROLENAME ) )
            // InternalMyDsl.g:870:4: (otherlv_7= RULE_ROLENAME )
            {
            // InternalMyDsl.g:870:4: (otherlv_7= RULE_ROLENAME )
            // InternalMyDsl.g:871:5: otherlv_7= RULE_ROLENAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ROLENAME,FOLLOW_15); 

            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getReceiverRoleCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEndInteraction"
    // InternalMyDsl.g:890:1: entryRuleEndInteraction returns [String current=null] : iv_ruleEndInteraction= ruleEndInteraction EOF ;
    public final String entryRuleEndInteraction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndInteraction = null;


        try {
            // InternalMyDsl.g:890:54: (iv_ruleEndInteraction= ruleEndInteraction EOF )
            // InternalMyDsl.g:891:2: iv_ruleEndInteraction= ruleEndInteraction EOF
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
    // InternalMyDsl.g:897:1: ruleEndInteraction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleEndInteraction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:903:2: ( (kw= 'end' kw= ';' ) )
            // InternalMyDsl.g:904:2: (kw= 'end' kw= ';' )
            {
            // InternalMyDsl.g:904:2: (kw= 'end' kw= ';' )
            // InternalMyDsl.g:905:3: kw= 'end' kw= ';'
            {
            kw=(Token)match(input,33,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEndInteractionAccess().getEndKeyword_0());
            		
            kw=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMyDsl.g:919:1: entryRuleMessageType returns [String current=null] : iv_ruleMessageType= ruleMessageType EOF ;
    public final String entryRuleMessageType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMessageType = null;


        try {
            // InternalMyDsl.g:919:51: (iv_ruleMessageType= ruleMessageType EOF )
            // InternalMyDsl.g:920:2: iv_ruleMessageType= ruleMessageType EOF
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
    // InternalMyDsl.g:926:1: ruleMessageType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' ) ;
    public final AntlrDatatypeRuleToken ruleMessageType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:932:2: ( (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' ) )
            // InternalMyDsl.g:933:2: (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' )
            {
            // InternalMyDsl.g:933:2: (kw= 'REQUEST' | kw= 'INFORM' | kw= 'AGREE' | kw= 'REFUSE' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 37:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:934:3: kw= 'REQUEST'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getREQUESTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:940:3: kw= 'INFORM'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getINFORMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:946:3: kw= 'AGREE'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getAGREEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:952:3: kw= 'REFUSE'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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


    // $ANTLR start "entryRulePayload"
    // InternalMyDsl.g:961:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalMyDsl.g:961:48: (iv_rulePayload= rulePayload EOF )
            // InternalMyDsl.g:962:2: iv_rulePayload= rulePayload EOF
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
    // InternalMyDsl.g:968:1: rulePayload returns [EObject current=null] : ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_types_1_0 = null;

        AntlrDatatypeRuleToken lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:974:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) )
            // InternalMyDsl.g:975:2: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
            {
            // InternalMyDsl.g:975:2: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
            // InternalMyDsl.g:976:3: () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
            {
            // InternalMyDsl.g:976:3: ()
            // InternalMyDsl.g:977:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPayloadAccess().getPayloadAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:983:3: ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
            // InternalMyDsl.g:984:4: ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            {
            // InternalMyDsl.g:984:4: ( (lv_types_1_0= ruleType ) )
            // InternalMyDsl.g:985:5: (lv_types_1_0= ruleType )
            {
            // InternalMyDsl.g:985:5: (lv_types_1_0= ruleType )
            // InternalMyDsl.g:986:6: lv_types_1_0= ruleType
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

            // InternalMyDsl.g:1003:4: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1004:5: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_24); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPayloadAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalMyDsl.g:1008:5: ( (lv_types_3_0= ruleType ) )
            	    // InternalMyDsl.g:1009:6: (lv_types_3_0= ruleType )
            	    {
            	    // InternalMyDsl.g:1009:6: (lv_types_3_0= ruleType )
            	    // InternalMyDsl.g:1010:7: lv_types_3_0= ruleType
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


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:1033:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:1033:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:1034:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:1040:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'action' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1046:2: ( (kw= 'int' | kw= 'string' | kw= 'action' ) )
            // InternalMyDsl.g:1047:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            {
            // InternalMyDsl.g:1047:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt10=1;
                }
                break;
            case 39:
                {
                alt10=2;
                }
                break;
            case 40:
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
                    // InternalMyDsl.g:1048:3: kw= 'int'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1054:3: kw= 'string'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1060:3: kw= 'action'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003E0AC20000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003C0AC00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001C040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000001C000000000L});

}