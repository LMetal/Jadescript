package org.xtext.globalTypes.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.globalTypes.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'()'", "'){'", "'integer'", "'text'", "'aid'", "'float'", "'global'", "'protocol'", "'('", "'}'", "')'", "','", "'role'", "'roleset'", "':'", "'rec'", "'{'", "'loop'", "'for'", "'<'", "'>'", "';'", "'choice'", "'at'", "'or'", "'from'", "'to'", "'.'", "'local'", "'foreach'", "'@proposition'", "'@action'", "'@predicate'", "'QUIT'", "'End'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGlobalProtocol"
    // InternalMyDsl.g:78:1: entryRuleGlobalProtocol : ruleGlobalProtocol EOF ;
    public final void entryRuleGlobalProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleGlobalProtocol EOF )
            // InternalMyDsl.g:80:1: ruleGlobalProtocol EOF
            {
             before(grammarAccess.getGlobalProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalProtocol();

            state._fsp--;

             after(grammarAccess.getGlobalProtocolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalProtocol"


    // $ANTLR start "ruleGlobalProtocol"
    // InternalMyDsl.g:87:1: ruleGlobalProtocol : ( ( rule__GlobalProtocol__Group__0 ) ) ;
    public final void ruleGlobalProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__GlobalProtocol__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__GlobalProtocol__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__GlobalProtocol__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__GlobalProtocol__Group__0 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__GlobalProtocol__Group__0 )
            // InternalMyDsl.g:94:4: rule__GlobalProtocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalProtocol"


    // $ANTLR start "entryRuleDefinition"
    // InternalMyDsl.g:103:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleDefinition EOF )
            // InternalMyDsl.g:105:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMyDsl.g:112:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Definition__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Definition__Alternatives )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Definition__Alternatives )
            // InternalMyDsl.g:119:4: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleQuitDefinition"
    // InternalMyDsl.g:128:1: entryRuleQuitDefinition : ruleQuitDefinition EOF ;
    public final void entryRuleQuitDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleQuitDefinition EOF )
            // InternalMyDsl.g:130:1: ruleQuitDefinition EOF
            {
             before(grammarAccess.getQuitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuitDefinition();

            state._fsp--;

             after(grammarAccess.getQuitDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuitDefinition"


    // $ANTLR start "ruleQuitDefinition"
    // InternalMyDsl.g:137:1: ruleQuitDefinition : ( ( rule__QuitDefinition__Group__0 ) ) ;
    public final void ruleQuitDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__QuitDefinition__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__QuitDefinition__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__QuitDefinition__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__QuitDefinition__Group__0 )
            {
             before(grammarAccess.getQuitDefinitionAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__QuitDefinition__Group__0 )
            // InternalMyDsl.g:144:4: rule__QuitDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuitDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuitDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuitDefinition"


    // $ANTLR start "entryRuleRoles"
    // InternalMyDsl.g:153:1: entryRuleRoles : ruleRoles EOF ;
    public final void entryRuleRoles() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleRoles EOF )
            // InternalMyDsl.g:155:1: ruleRoles EOF
            {
             before(grammarAccess.getRolesRule()); 
            pushFollow(FOLLOW_1);
            ruleRoles();

            state._fsp--;

             after(grammarAccess.getRolesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoles"


    // $ANTLR start "ruleRoles"
    // InternalMyDsl.g:162:1: ruleRoles : ( ( rule__Roles__Group__0 ) ) ;
    public final void ruleRoles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Roles__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Roles__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Roles__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Roles__Group__0 )
            {
             before(grammarAccess.getRolesAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Roles__Group__0 )
            // InternalMyDsl.g:169:4: rule__Roles__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Roles__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRolesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoles"


    // $ANTLR start "entryRuleRole"
    // InternalMyDsl.g:178:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleRole EOF )
            // InternalMyDsl.g:180:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalMyDsl.g:187:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Role__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Role__Alternatives )
            // InternalMyDsl.g:194:4: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Role__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleRoleOne"
    // InternalMyDsl.g:203:1: entryRuleRoleOne : ruleRoleOne EOF ;
    public final void entryRuleRoleOne() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleRoleOne EOF )
            // InternalMyDsl.g:205:1: ruleRoleOne EOF
            {
             before(grammarAccess.getRoleOneRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleOne();

            state._fsp--;

             after(grammarAccess.getRoleOneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoleOne"


    // $ANTLR start "ruleRoleOne"
    // InternalMyDsl.g:212:1: ruleRoleOne : ( ( rule__RoleOne__Group__0 ) ) ;
    public final void ruleRoleOne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__RoleOne__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__RoleOne__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__RoleOne__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__RoleOne__Group__0 )
            {
             before(grammarAccess.getRoleOneAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__RoleOne__Group__0 )
            // InternalMyDsl.g:219:4: rule__RoleOne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoleOne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleOneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleOne"


    // $ANTLR start "entryRuleRoleSet"
    // InternalMyDsl.g:228:1: entryRuleRoleSet : ruleRoleSet EOF ;
    public final void entryRuleRoleSet() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRoleSet EOF )
            // InternalMyDsl.g:230:1: ruleRoleSet EOF
            {
             before(grammarAccess.getRoleSetRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleSet();

            state._fsp--;

             after(grammarAccess.getRoleSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoleSet"


    // $ANTLR start "ruleRoleSet"
    // InternalMyDsl.g:237:1: ruleRoleSet : ( ( rule__RoleSet__Group__0 ) ) ;
    public final void ruleRoleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__RoleSet__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__RoleSet__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__RoleSet__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__RoleSet__Group__0 )
            {
             before(grammarAccess.getRoleSetAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__RoleSet__Group__0 )
            // InternalMyDsl.g:244:4: rule__RoleSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoleSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleSet"


    // $ANTLR start "entryRuleProtocol"
    // InternalMyDsl.g:253:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleProtocol EOF )
            // InternalMyDsl.g:255:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalMyDsl.g:262:1: ruleProtocol : ( ( rule__Protocol__BeginAssignment ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Protocol__BeginAssignment ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Protocol__BeginAssignment ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Protocol__BeginAssignment ) )
            // InternalMyDsl.g:268:3: ( rule__Protocol__BeginAssignment )
            {
             before(grammarAccess.getProtocolAccess().getBeginAssignment()); 
            // InternalMyDsl.g:269:3: ( rule__Protocol__BeginAssignment )
            // InternalMyDsl.g:269:4: rule__Protocol__BeginAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__BeginAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getBeginAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleEndProtocol"
    // InternalMyDsl.g:278:1: entryRuleEndProtocol : ruleEndProtocol EOF ;
    public final void entryRuleEndProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleEndProtocol EOF )
            // InternalMyDsl.g:280:1: ruleEndProtocol EOF
            {
             before(grammarAccess.getEndProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleEndProtocol();

            state._fsp--;

             after(grammarAccess.getEndProtocolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndProtocol"


    // $ANTLR start "ruleEndProtocol"
    // InternalMyDsl.g:287:1: ruleEndProtocol : ( ( rule__EndProtocol__EndAssignment ) ) ;
    public final void ruleEndProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__EndProtocol__EndAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__EndProtocol__EndAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__EndProtocol__EndAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__EndProtocol__EndAssignment )
            {
             before(grammarAccess.getEndProtocolAccess().getEndAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__EndProtocol__EndAssignment )
            // InternalMyDsl.g:294:4: rule__EndProtocol__EndAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EndProtocol__EndAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEndProtocolAccess().getEndAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndProtocol"


    // $ANTLR start "entryRuleRecursion"
    // InternalMyDsl.g:303:1: entryRuleRecursion : ruleRecursion EOF ;
    public final void entryRuleRecursion() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleRecursion EOF )
            // InternalMyDsl.g:305:1: ruleRecursion EOF
            {
             before(grammarAccess.getRecursionRule()); 
            pushFollow(FOLLOW_1);
            ruleRecursion();

            state._fsp--;

             after(grammarAccess.getRecursionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecursion"


    // $ANTLR start "ruleRecursion"
    // InternalMyDsl.g:312:1: ruleRecursion : ( ( rule__Recursion__Group__0 ) ) ;
    public final void ruleRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Recursion__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Recursion__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Recursion__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Recursion__Group__0 )
            {
             before(grammarAccess.getRecursionAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Recursion__Group__0 )
            // InternalMyDsl.g:319:4: rule__Recursion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecursionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecursion"


    // $ANTLR start "entryRuleCloseRecursion"
    // InternalMyDsl.g:328:1: entryRuleCloseRecursion : ruleCloseRecursion EOF ;
    public final void entryRuleCloseRecursion() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleCloseRecursion EOF )
            // InternalMyDsl.g:330:1: ruleCloseRecursion EOF
            {
             before(grammarAccess.getCloseRecursionRule()); 
            pushFollow(FOLLOW_1);
            ruleCloseRecursion();

            state._fsp--;

             after(grammarAccess.getCloseRecursionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCloseRecursion"


    // $ANTLR start "ruleCloseRecursion"
    // InternalMyDsl.g:337:1: ruleCloseRecursion : ( ( rule__CloseRecursion__Group__0 ) ) ;
    public final void ruleCloseRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__CloseRecursion__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__CloseRecursion__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__CloseRecursion__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__CloseRecursion__Group__0 )
            {
             before(grammarAccess.getCloseRecursionAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__CloseRecursion__Group__0 )
            // InternalMyDsl.g:344:4: rule__CloseRecursion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCloseRecursionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCloseRecursion"


    // $ANTLR start "entryRuleForEach"
    // InternalMyDsl.g:353:1: entryRuleForEach : ruleForEach EOF ;
    public final void entryRuleForEach() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleForEach EOF )
            // InternalMyDsl.g:355:1: ruleForEach EOF
            {
             before(grammarAccess.getForEachRule()); 
            pushFollow(FOLLOW_1);
            ruleForEach();

            state._fsp--;

             after(grammarAccess.getForEachRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForEach"


    // $ANTLR start "ruleForEach"
    // InternalMyDsl.g:362:1: ruleForEach : ( ( rule__ForEach__Group__0 ) ) ;
    public final void ruleForEach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__ForEach__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__ForEach__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__ForEach__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__ForEach__Group__0 )
            {
             before(grammarAccess.getForEachAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__ForEach__Group__0 )
            // InternalMyDsl.g:369:4: rule__ForEach__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForEach"


    // $ANTLR start "entryRuleChoice"
    // InternalMyDsl.g:378:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleChoice EOF )
            // InternalMyDsl.g:380:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalMyDsl.g:387:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Choice__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Choice__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Choice__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Choice__Group__0 )
            // InternalMyDsl.g:394:4: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleMessage"
    // InternalMyDsl.g:403:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleMessage EOF )
            // InternalMyDsl.g:405:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalMyDsl.g:412:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Message__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Message__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Message__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__Message__Alternatives )
            {
             before(grammarAccess.getMessageAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__Message__Alternatives )
            // InternalMyDsl.g:419:4: rule__Message__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Message__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageNormal"
    // InternalMyDsl.g:428:1: entryRuleMessageNormal : ruleMessageNormal EOF ;
    public final void entryRuleMessageNormal() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleMessageNormal EOF )
            // InternalMyDsl.g:430:1: ruleMessageNormal EOF
            {
             before(grammarAccess.getMessageNormalRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageNormal();

            state._fsp--;

             after(grammarAccess.getMessageNormalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageNormal"


    // $ANTLR start "ruleMessageNormal"
    // InternalMyDsl.g:437:1: ruleMessageNormal : ( ( rule__MessageNormal__Group__0 ) ) ;
    public final void ruleMessageNormal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__MessageNormal__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__MessageNormal__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__MessageNormal__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__MessageNormal__Group__0 )
            {
             before(grammarAccess.getMessageNormalAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__MessageNormal__Group__0 )
            // InternalMyDsl.g:444:4: rule__MessageNormal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageNormal"


    // $ANTLR start "entryRuleMessageQuit"
    // InternalMyDsl.g:453:1: entryRuleMessageQuit : ruleMessageQuit EOF ;
    public final void entryRuleMessageQuit() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleMessageQuit EOF )
            // InternalMyDsl.g:455:1: ruleMessageQuit EOF
            {
             before(grammarAccess.getMessageQuitRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageQuit();

            state._fsp--;

             after(grammarAccess.getMessageQuitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageQuit"


    // $ANTLR start "ruleMessageQuit"
    // InternalMyDsl.g:462:1: ruleMessageQuit : ( ( rule__MessageQuit__Group__0 ) ) ;
    public final void ruleMessageQuit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__MessageQuit__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__MessageQuit__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__MessageQuit__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__MessageQuit__Group__0 )
            {
             before(grammarAccess.getMessageQuitAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__MessageQuit__Group__0 )
            // InternalMyDsl.g:469:4: rule__MessageQuit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageQuitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageQuit"


    // $ANTLR start "entryRulePayload"
    // InternalMyDsl.g:478:1: entryRulePayload : rulePayload EOF ;
    public final void entryRulePayload() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( rulePayload EOF )
            // InternalMyDsl.g:480:1: rulePayload EOF
            {
             before(grammarAccess.getPayloadRule()); 
            pushFollow(FOLLOW_1);
            rulePayload();

            state._fsp--;

             after(grammarAccess.getPayloadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePayload"


    // $ANTLR start "rulePayload"
    // InternalMyDsl.g:487:1: rulePayload : ( ( rule__Payload__Group__0 ) ) ;
    public final void rulePayload() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Payload__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Payload__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Payload__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Payload__Group__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Payload__Group__0 )
            // InternalMyDsl.g:494:4: rule__Payload__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePayload"


    // $ANTLR start "entryRuleLocalProtocol"
    // InternalMyDsl.g:503:1: entryRuleLocalProtocol : ruleLocalProtocol EOF ;
    public final void entryRuleLocalProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleLocalProtocol EOF )
            // InternalMyDsl.g:505:1: ruleLocalProtocol EOF
            {
             before(grammarAccess.getLocalProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalProtocol();

            state._fsp--;

             after(grammarAccess.getLocalProtocolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalProtocol"


    // $ANTLR start "ruleLocalProtocol"
    // InternalMyDsl.g:512:1: ruleLocalProtocol : ( ( rule__LocalProtocol__Group__0 ) ) ;
    public final void ruleLocalProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__LocalProtocol__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__LocalProtocol__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__LocalProtocol__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__LocalProtocol__Group__0 )
            {
             before(grammarAccess.getLocalProtocolAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__LocalProtocol__Group__0 )
            // InternalMyDsl.g:519:4: rule__LocalProtocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalProtocolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalProtocol"


    // $ANTLR start "entryRuleProtocolL"
    // InternalMyDsl.g:528:1: entryRuleProtocolL : ruleProtocolL EOF ;
    public final void entryRuleProtocolL() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleProtocolL EOF )
            // InternalMyDsl.g:530:1: ruleProtocolL EOF
            {
             before(grammarAccess.getProtocolLRule()); 
            pushFollow(FOLLOW_1);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getProtocolLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocolL"


    // $ANTLR start "ruleProtocolL"
    // InternalMyDsl.g:537:1: ruleProtocolL : ( ( rule__ProtocolL__BeginAssignment ) ) ;
    public final void ruleProtocolL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__ProtocolL__BeginAssignment ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__ProtocolL__BeginAssignment ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__ProtocolL__BeginAssignment ) )
            // InternalMyDsl.g:543:3: ( rule__ProtocolL__BeginAssignment )
            {
             before(grammarAccess.getProtocolLAccess().getBeginAssignment()); 
            // InternalMyDsl.g:544:3: ( rule__ProtocolL__BeginAssignment )
            // InternalMyDsl.g:544:4: rule__ProtocolL__BeginAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolL__BeginAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProtocolLAccess().getBeginAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocolL"


    // $ANTLR start "entryRuleRecursionL"
    // InternalMyDsl.g:553:1: entryRuleRecursionL : ruleRecursionL EOF ;
    public final void entryRuleRecursionL() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleRecursionL EOF )
            // InternalMyDsl.g:555:1: ruleRecursionL EOF
            {
             before(grammarAccess.getRecursionLRule()); 
            pushFollow(FOLLOW_1);
            ruleRecursionL();

            state._fsp--;

             after(grammarAccess.getRecursionLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecursionL"


    // $ANTLR start "ruleRecursionL"
    // InternalMyDsl.g:562:1: ruleRecursionL : ( ( rule__RecursionL__Group__0 ) ) ;
    public final void ruleRecursionL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__RecursionL__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__RecursionL__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__RecursionL__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__RecursionL__Group__0 )
            {
             before(grammarAccess.getRecursionLAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__RecursionL__Group__0 )
            // InternalMyDsl.g:569:4: rule__RecursionL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecursionL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecursionLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecursionL"


    // $ANTLR start "entryRuleCloseRecursionL"
    // InternalMyDsl.g:578:1: entryRuleCloseRecursionL : ruleCloseRecursionL EOF ;
    public final void entryRuleCloseRecursionL() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleCloseRecursionL EOF )
            // InternalMyDsl.g:580:1: ruleCloseRecursionL EOF
            {
             before(grammarAccess.getCloseRecursionLRule()); 
            pushFollow(FOLLOW_1);
            ruleCloseRecursionL();

            state._fsp--;

             after(grammarAccess.getCloseRecursionLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCloseRecursionL"


    // $ANTLR start "ruleCloseRecursionL"
    // InternalMyDsl.g:587:1: ruleCloseRecursionL : ( ( rule__CloseRecursionL__Group__0 ) ) ;
    public final void ruleCloseRecursionL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__CloseRecursionL__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__CloseRecursionL__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__CloseRecursionL__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__CloseRecursionL__Group__0 )
            {
             before(grammarAccess.getCloseRecursionLAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__CloseRecursionL__Group__0 )
            // InternalMyDsl.g:594:4: rule__CloseRecursionL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursionL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCloseRecursionLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCloseRecursionL"


    // $ANTLR start "entryRuleMessageL"
    // InternalMyDsl.g:603:1: entryRuleMessageL : ruleMessageL EOF ;
    public final void entryRuleMessageL() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleMessageL EOF )
            // InternalMyDsl.g:605:1: ruleMessageL EOF
            {
             before(grammarAccess.getMessageLRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageL();

            state._fsp--;

             after(grammarAccess.getMessageLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageL"


    // $ANTLR start "ruleMessageL"
    // InternalMyDsl.g:612:1: ruleMessageL : ( ( rule__MessageL__Alternatives ) ) ;
    public final void ruleMessageL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__MessageL__Alternatives ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__MessageL__Alternatives ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__MessageL__Alternatives ) )
            // InternalMyDsl.g:618:3: ( rule__MessageL__Alternatives )
            {
             before(grammarAccess.getMessageLAccess().getAlternatives()); 
            // InternalMyDsl.g:619:3: ( rule__MessageL__Alternatives )
            // InternalMyDsl.g:619:4: rule__MessageL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MessageL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageL"


    // $ANTLR start "entryRuleMessageNormalL"
    // InternalMyDsl.g:628:1: entryRuleMessageNormalL : ruleMessageNormalL EOF ;
    public final void entryRuleMessageNormalL() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleMessageNormalL EOF )
            // InternalMyDsl.g:630:1: ruleMessageNormalL EOF
            {
             before(grammarAccess.getMessageNormalLRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageNormalL();

            state._fsp--;

             after(grammarAccess.getMessageNormalLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageNormalL"


    // $ANTLR start "ruleMessageNormalL"
    // InternalMyDsl.g:637:1: ruleMessageNormalL : ( ( rule__MessageNormalL__Group__0 ) ) ;
    public final void ruleMessageNormalL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__MessageNormalL__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__MessageNormalL__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__MessageNormalL__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__MessageNormalL__Group__0 )
            {
             before(grammarAccess.getMessageNormalLAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__MessageNormalL__Group__0 )
            // InternalMyDsl.g:644:4: rule__MessageNormalL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormalL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageNormalL"


    // $ANTLR start "entryRuleMessageQuitL"
    // InternalMyDsl.g:653:1: entryRuleMessageQuitL : ruleMessageQuitL EOF ;
    public final void entryRuleMessageQuitL() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleMessageQuitL EOF )
            // InternalMyDsl.g:655:1: ruleMessageQuitL EOF
            {
             before(grammarAccess.getMessageQuitLRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageQuitL();

            state._fsp--;

             after(grammarAccess.getMessageQuitLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageQuitL"


    // $ANTLR start "ruleMessageQuitL"
    // InternalMyDsl.g:662:1: ruleMessageQuitL : ( ( rule__MessageQuitL__Group__0 ) ) ;
    public final void ruleMessageQuitL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__MessageQuitL__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__MessageQuitL__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__MessageQuitL__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__MessageQuitL__Group__0 )
            {
             before(grammarAccess.getMessageQuitLAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__MessageQuitL__Group__0 )
            // InternalMyDsl.g:669:4: rule__MessageQuitL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuitL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageQuitLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageQuitL"


    // $ANTLR start "entryRuleMessageType"
    // InternalMyDsl.g:678:1: entryRuleMessageType : ruleMessageType EOF ;
    public final void entryRuleMessageType() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleMessageType EOF )
            // InternalMyDsl.g:680:1: ruleMessageType EOF
            {
             before(grammarAccess.getMessageTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageType"


    // $ANTLR start "ruleMessageType"
    // InternalMyDsl.g:687:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__MessageType__Alternatives ) )
            // InternalMyDsl.g:693:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:694:3: ( rule__MessageType__Alternatives )
            // InternalMyDsl.g:694:4: rule__MessageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MessageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageType"


    // $ANTLR start "entryRuleSenderL"
    // InternalMyDsl.g:703:1: entryRuleSenderL : ruleSenderL EOF ;
    public final void entryRuleSenderL() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleSenderL EOF )
            // InternalMyDsl.g:705:1: ruleSenderL EOF
            {
             before(grammarAccess.getSenderLRule()); 
            pushFollow(FOLLOW_1);
            ruleSenderL();

            state._fsp--;

             after(grammarAccess.getSenderLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSenderL"


    // $ANTLR start "ruleSenderL"
    // InternalMyDsl.g:712:1: ruleSenderL : ( ( rule__SenderL__Group__0 ) ) ;
    public final void ruleSenderL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__SenderL__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__SenderL__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__SenderL__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__SenderL__Group__0 )
            {
             before(grammarAccess.getSenderLAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__SenderL__Group__0 )
            // InternalMyDsl.g:719:4: rule__SenderL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SenderL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSenderLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSenderL"


    // $ANTLR start "entryRuleReceiverL"
    // InternalMyDsl.g:728:1: entryRuleReceiverL : ruleReceiverL EOF ;
    public final void entryRuleReceiverL() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleReceiverL EOF )
            // InternalMyDsl.g:730:1: ruleReceiverL EOF
            {
             before(grammarAccess.getReceiverLRule()); 
            pushFollow(FOLLOW_1);
            ruleReceiverL();

            state._fsp--;

             after(grammarAccess.getReceiverLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReceiverL"


    // $ANTLR start "ruleReceiverL"
    // InternalMyDsl.g:737:1: ruleReceiverL : ( ( rule__ReceiverL__Group__0 ) ) ;
    public final void ruleReceiverL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__ReceiverL__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__ReceiverL__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__ReceiverL__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__ReceiverL__Group__0 )
            {
             before(grammarAccess.getReceiverLAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__ReceiverL__Group__0 )
            // InternalMyDsl.g:744:4: rule__ReceiverL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReceiverLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReceiverL"


    // $ANTLR start "entryRuleChoiceL"
    // InternalMyDsl.g:753:1: entryRuleChoiceL : ruleChoiceL EOF ;
    public final void entryRuleChoiceL() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleChoiceL EOF )
            // InternalMyDsl.g:755:1: ruleChoiceL EOF
            {
             before(grammarAccess.getChoiceLRule()); 
            pushFollow(FOLLOW_1);
            ruleChoiceL();

            state._fsp--;

             after(grammarAccess.getChoiceLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoiceL"


    // $ANTLR start "ruleChoiceL"
    // InternalMyDsl.g:762:1: ruleChoiceL : ( ( rule__ChoiceL__Group__0 ) ) ;
    public final void ruleChoiceL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__ChoiceL__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__ChoiceL__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__ChoiceL__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__ChoiceL__Group__0 )
            {
             before(grammarAccess.getChoiceLAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__ChoiceL__Group__0 )
            // InternalMyDsl.g:769:4: rule__ChoiceL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoiceL"


    // $ANTLR start "entryRuleForEachL"
    // InternalMyDsl.g:778:1: entryRuleForEachL : ruleForEachL EOF ;
    public final void entryRuleForEachL() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleForEachL EOF )
            // InternalMyDsl.g:780:1: ruleForEachL EOF
            {
             before(grammarAccess.getForEachLRule()); 
            pushFollow(FOLLOW_1);
            ruleForEachL();

            state._fsp--;

             after(grammarAccess.getForEachLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForEachL"


    // $ANTLR start "ruleForEachL"
    // InternalMyDsl.g:787:1: ruleForEachL : ( ( rule__ForEachL__Group__0 ) ) ;
    public final void ruleForEachL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__ForEachL__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__ForEachL__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__ForEachL__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__ForEachL__Group__0 )
            {
             before(grammarAccess.getForEachLAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__ForEachL__Group__0 )
            // InternalMyDsl.g:794:4: rule__ForEachL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForEachLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForEachL"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:803:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleType EOF )
            // InternalMyDsl.g:805:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:812:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:818:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:819:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:819:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Model__Alternatives_2"
    // InternalMyDsl.g:827:1: rule__Model__Alternatives_2 : ( ( ( rule__Model__ProtocolAssignment_2_0 ) ) | ( ( rule__Model__ProtocolAssignment_2_1 ) ) );
    public final void rule__Model__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( ( rule__Model__ProtocolAssignment_2_0 ) ) | ( ( rule__Model__ProtocolAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==39) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:832:2: ( ( rule__Model__ProtocolAssignment_2_0 ) )
                    {
                    // InternalMyDsl.g:832:2: ( ( rule__Model__ProtocolAssignment_2_0 ) )
                    // InternalMyDsl.g:833:3: ( rule__Model__ProtocolAssignment_2_0 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_2_0()); 
                    // InternalMyDsl.g:834:3: ( rule__Model__ProtocolAssignment_2_0 )
                    // InternalMyDsl.g:834:4: rule__Model__ProtocolAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ProtocolAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getProtocolAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:838:2: ( ( rule__Model__ProtocolAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:838:2: ( ( rule__Model__ProtocolAssignment_2_1 ) )
                    // InternalMyDsl.g:839:3: ( rule__Model__ProtocolAssignment_2_1 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_2_1()); 
                    // InternalMyDsl.g:840:3: ( rule__Model__ProtocolAssignment_2_1 )
                    // InternalMyDsl.g:840:4: rule__Model__ProtocolAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ProtocolAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getProtocolAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_2"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalMyDsl.g:848:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ruleQuitDefinition ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ruleQuitDefinition ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt2=1;
                }
                break;
            case 42:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_2==44) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:853:2: ( ( rule__Definition__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:853:2: ( ( rule__Definition__Group_0__0 ) )
                    // InternalMyDsl.g:854:3: ( rule__Definition__Group_0__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    // InternalMyDsl.g:855:3: ( rule__Definition__Group_0__0 )
                    // InternalMyDsl.g:855:4: rule__Definition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:859:2: ( ( rule__Definition__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:859:2: ( ( rule__Definition__Group_1__0 ) )
                    // InternalMyDsl.g:860:3: ( rule__Definition__Group_1__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    // InternalMyDsl.g:861:3: ( rule__Definition__Group_1__0 )
                    // InternalMyDsl.g:861:4: rule__Definition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:865:2: ( ( rule__Definition__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:865:2: ( ( rule__Definition__Group_2__0 ) )
                    // InternalMyDsl.g:866:3: ( rule__Definition__Group_2__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_2()); 
                    // InternalMyDsl.g:867:3: ( rule__Definition__Group_2__0 )
                    // InternalMyDsl.g:867:4: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:871:2: ( ruleQuitDefinition )
                    {
                    // InternalMyDsl.g:871:2: ( ruleQuitDefinition )
                    // InternalMyDsl.g:872:3: ruleQuitDefinition
                    {
                     before(grammarAccess.getDefinitionAccess().getQuitDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleQuitDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getQuitDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__Role__Alternatives"
    // InternalMyDsl.g:881:1: rule__Role__Alternatives : ( ( ruleRoleOne ) | ( ruleRoleSet ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:885:1: ( ( ruleRoleOne ) | ( ruleRoleSet ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:886:2: ( ruleRoleOne )
                    {
                    // InternalMyDsl.g:886:2: ( ruleRoleOne )
                    // InternalMyDsl.g:887:3: ruleRoleOne
                    {
                     before(grammarAccess.getRoleAccess().getRoleOneParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRoleOne();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getRoleOneParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:892:2: ( ruleRoleSet )
                    {
                    // InternalMyDsl.g:892:2: ( ruleRoleSet )
                    // InternalMyDsl.g:893:3: ruleRoleSet
                    {
                     before(grammarAccess.getRoleAccess().getRoleSetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRoleSet();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getRoleSetParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Alternatives"


    // $ANTLR start "rule__Protocol__BeginAlternatives_0"
    // InternalMyDsl.g:902:1: rule__Protocol__BeginAlternatives_0 : ( ( ruleChoice ) | ( ruleMessage ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) | ( ruleEndProtocol ) );
    public final void rule__Protocol__BeginAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( ( ruleChoice ) | ( ruleMessage ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) | ( ruleEndProtocol ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
            case 44:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            case 28:
                {
                alt4=5;
                }
                break;
            case 45:
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
                    // InternalMyDsl.g:907:2: ( ruleChoice )
                    {
                    // InternalMyDsl.g:907:2: ( ruleChoice )
                    // InternalMyDsl.g:908:3: ruleChoice
                    {
                     before(grammarAccess.getProtocolAccess().getBeginChoiceParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleChoice();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginChoiceParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:913:2: ( ruleMessage )
                    {
                    // InternalMyDsl.g:913:2: ( ruleMessage )
                    // InternalMyDsl.g:914:3: ruleMessage
                    {
                     before(grammarAccess.getProtocolAccess().getBeginMessageParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginMessageParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:919:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:919:2: ( ruleRecursion )
                    // InternalMyDsl.g:920:3: ruleRecursion
                    {
                     before(grammarAccess.getProtocolAccess().getBeginRecursionParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginRecursionParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:925:2: ( ruleForEach )
                    {
                    // InternalMyDsl.g:925:2: ( ruleForEach )
                    // InternalMyDsl.g:926:3: ruleForEach
                    {
                     before(grammarAccess.getProtocolAccess().getBeginForEachParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleForEach();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginForEachParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:931:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:931:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:932:3: ruleCloseRecursion
                    {
                     before(grammarAccess.getProtocolAccess().getBeginCloseRecursionParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCloseRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginCloseRecursionParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:937:2: ( ruleEndProtocol )
                    {
                    // InternalMyDsl.g:937:2: ( ruleEndProtocol )
                    // InternalMyDsl.g:938:3: ruleEndProtocol
                    {
                     before(grammarAccess.getProtocolAccess().getBeginEndProtocolParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEndProtocol();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginEndProtocolParserRuleCall_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__BeginAlternatives_0"


    // $ANTLR start "rule__Message__Alternatives"
    // InternalMyDsl.g:947:1: rule__Message__Alternatives : ( ( ruleMessageNormal ) | ( ruleMessageQuit ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( ( ruleMessageNormal ) | ( ruleMessageQuit ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==44) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:952:2: ( ruleMessageNormal )
                    {
                    // InternalMyDsl.g:952:2: ( ruleMessageNormal )
                    // InternalMyDsl.g:953:3: ruleMessageNormal
                    {
                     before(grammarAccess.getMessageAccess().getMessageNormalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageNormal();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getMessageNormalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:958:2: ( ruleMessageQuit )
                    {
                    // InternalMyDsl.g:958:2: ( ruleMessageQuit )
                    // InternalMyDsl.g:959:3: ruleMessageQuit
                    {
                     before(grammarAccess.getMessageAccess().getMessageQuitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageQuit();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getMessageQuitParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Alternatives"


    // $ANTLR start "rule__MessageNormal__Alternatives_1"
    // InternalMyDsl.g:968:1: rule__MessageNormal__Alternatives_1 : ( ( ( rule__MessageNormal__Group_1_0__0 ) ) | ( '()' ) );
    public final void rule__MessageNormal__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( ( rule__MessageNormal__Group_1_0__0 ) ) | ( '()' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:973:2: ( ( rule__MessageNormal__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:973:2: ( ( rule__MessageNormal__Group_1_0__0 ) )
                    // InternalMyDsl.g:974:3: ( rule__MessageNormal__Group_1_0__0 )
                    {
                     before(grammarAccess.getMessageNormalAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:975:3: ( rule__MessageNormal__Group_1_0__0 )
                    // InternalMyDsl.g:975:4: rule__MessageNormal__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageNormal__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageNormalAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:979:2: ( '()' )
                    {
                    // InternalMyDsl.g:979:2: ( '()' )
                    // InternalMyDsl.g:980:3: '()'
                    {
                     before(grammarAccess.getMessageNormalAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMessageNormalAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Alternatives_1"


    // $ANTLR start "rule__LocalProtocol__Alternatives_7"
    // InternalMyDsl.g:989:1: rule__LocalProtocol__Alternatives_7 : ( ( '){' ) | ( ( rule__LocalProtocol__Group_7_1__0 ) ) );
    public final void rule__LocalProtocol__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:993:1: ( ( '){' ) | ( ( rule__LocalProtocol__Group_7_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:994:2: ( '){' )
                    {
                    // InternalMyDsl.g:994:2: ( '){' )
                    // InternalMyDsl.g:995:3: '){'
                    {
                     before(grammarAccess.getLocalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_7_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLocalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1000:2: ( ( rule__LocalProtocol__Group_7_1__0 ) )
                    {
                    // InternalMyDsl.g:1000:2: ( ( rule__LocalProtocol__Group_7_1__0 ) )
                    // InternalMyDsl.g:1001:3: ( rule__LocalProtocol__Group_7_1__0 )
                    {
                     before(grammarAccess.getLocalProtocolAccess().getGroup_7_1()); 
                    // InternalMyDsl.g:1002:3: ( rule__LocalProtocol__Group_7_1__0 )
                    // InternalMyDsl.g:1002:4: rule__LocalProtocol__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalProtocol__Group_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocalProtocolAccess().getGroup_7_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Alternatives_7"


    // $ANTLR start "rule__ProtocolL__BeginAlternatives_0"
    // InternalMyDsl.g:1010:1: rule__ProtocolL__BeginAlternatives_0 : ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursionL ) | ( ruleCloseRecursionL ) | ( ruleEndProtocol ) );
    public final void rule__ProtocolL__BeginAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursionL ) | ( ruleCloseRecursionL ) | ( ruleEndProtocol ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 44:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            case 45:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1015:2: ( ruleMessageL )
                    {
                    // InternalMyDsl.g:1015:2: ( ruleMessageL )
                    // InternalMyDsl.g:1016:3: ruleMessageL
                    {
                     before(grammarAccess.getProtocolLAccess().getBeginMessageLParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getBeginMessageLParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1021:2: ( ruleChoiceL )
                    {
                    // InternalMyDsl.g:1021:2: ( ruleChoiceL )
                    // InternalMyDsl.g:1022:3: ruleChoiceL
                    {
                     before(grammarAccess.getProtocolLAccess().getBeginChoiceLParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChoiceL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getBeginChoiceLParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1027:2: ( ruleForEachL )
                    {
                    // InternalMyDsl.g:1027:2: ( ruleForEachL )
                    // InternalMyDsl.g:1028:3: ruleForEachL
                    {
                     before(grammarAccess.getProtocolLAccess().getBeginForEachLParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForEachL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getBeginForEachLParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1033:2: ( ruleRecursionL )
                    {
                    // InternalMyDsl.g:1033:2: ( ruleRecursionL )
                    // InternalMyDsl.g:1034:3: ruleRecursionL
                    {
                     before(grammarAccess.getProtocolLAccess().getBeginRecursionLParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRecursionL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getBeginRecursionLParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1039:2: ( ruleCloseRecursionL )
                    {
                    // InternalMyDsl.g:1039:2: ( ruleCloseRecursionL )
                    // InternalMyDsl.g:1040:3: ruleCloseRecursionL
                    {
                     before(grammarAccess.getProtocolLAccess().getBeginCloseRecursionLParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCloseRecursionL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getBeginCloseRecursionLParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1045:2: ( ruleEndProtocol )
                    {
                    // InternalMyDsl.g:1045:2: ( ruleEndProtocol )
                    // InternalMyDsl.g:1046:3: ruleEndProtocol
                    {
                     before(grammarAccess.getProtocolLAccess().getBeginEndProtocolParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEndProtocol();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getBeginEndProtocolParserRuleCall_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__BeginAlternatives_0"


    // $ANTLR start "rule__MessageL__Alternatives"
    // InternalMyDsl.g:1055:1: rule__MessageL__Alternatives : ( ( ruleMessageNormalL ) | ( ruleMessageQuitL ) );
    public final void rule__MessageL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1059:1: ( ( ruleMessageNormalL ) | ( ruleMessageQuitL ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==44) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1060:2: ( ruleMessageNormalL )
                    {
                    // InternalMyDsl.g:1060:2: ( ruleMessageNormalL )
                    // InternalMyDsl.g:1061:3: ruleMessageNormalL
                    {
                     before(grammarAccess.getMessageLAccess().getMessageNormalLParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageNormalL();

                    state._fsp--;

                     after(grammarAccess.getMessageLAccess().getMessageNormalLParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1066:2: ( ruleMessageQuitL )
                    {
                    // InternalMyDsl.g:1066:2: ( ruleMessageQuitL )
                    // InternalMyDsl.g:1067:3: ruleMessageQuitL
                    {
                     before(grammarAccess.getMessageLAccess().getMessageQuitLParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageQuitL();

                    state._fsp--;

                     after(grammarAccess.getMessageLAccess().getMessageQuitLParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Alternatives"


    // $ANTLR start "rule__MessageNormalL__Alternatives_1"
    // InternalMyDsl.g:1076:1: rule__MessageNormalL__Alternatives_1 : ( ( ( rule__MessageNormalL__Group_1_0__0 ) ) | ( '()' ) );
    public final void rule__MessageNormalL__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( ( rule__MessageNormalL__Group_1_0__0 ) ) | ( '()' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==11) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1081:2: ( ( rule__MessageNormalL__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:1081:2: ( ( rule__MessageNormalL__Group_1_0__0 ) )
                    // InternalMyDsl.g:1082:3: ( rule__MessageNormalL__Group_1_0__0 )
                    {
                     before(grammarAccess.getMessageNormalLAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:1083:3: ( rule__MessageNormalL__Group_1_0__0 )
                    // InternalMyDsl.g:1083:4: rule__MessageNormalL__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageNormalL__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageNormalLAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1087:2: ( '()' )
                    {
                    // InternalMyDsl.g:1087:2: ( '()' )
                    // InternalMyDsl.g:1088:3: '()'
                    {
                     before(grammarAccess.getMessageNormalLAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMessageNormalLAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Alternatives_1"


    // $ANTLR start "rule__MessageType__Alternatives"
    // InternalMyDsl.g:1097:1: rule__MessageType__Alternatives : ( ( ruleSenderL ) | ( ruleReceiverL ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1101:1: ( ( ruleSenderL ) | ( ruleReceiverL ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            else if ( (LA11_0==37) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1102:2: ( ruleSenderL )
                    {
                    // InternalMyDsl.g:1102:2: ( ruleSenderL )
                    // InternalMyDsl.g:1103:3: ruleSenderL
                    {
                     before(grammarAccess.getMessageTypeAccess().getSenderLParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSenderL();

                    state._fsp--;

                     after(grammarAccess.getMessageTypeAccess().getSenderLParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1108:2: ( ruleReceiverL )
                    {
                    // InternalMyDsl.g:1108:2: ( ruleReceiverL )
                    // InternalMyDsl.g:1109:3: ruleReceiverL
                    {
                     before(grammarAccess.getMessageTypeAccess().getReceiverLParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReceiverL();

                    state._fsp--;

                     after(grammarAccess.getMessageTypeAccess().getReceiverLParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:1118:1: rule__Type__Alternatives : ( ( 'integer' ) | ( 'text' ) | ( 'aid' ) | ( 'float' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( ( 'integer' ) | ( 'text' ) | ( 'aid' ) | ( 'float' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt12=1;
                }
                break;
            case 14:
                {
                alt12=2;
                }
                break;
            case 15:
                {
                alt12=3;
                }
                break;
            case 16:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1123:2: ( 'integer' )
                    {
                    // InternalMyDsl.g:1123:2: ( 'integer' )
                    // InternalMyDsl.g:1124:3: 'integer'
                    {
                     before(grammarAccess.getTypeAccess().getIntegerKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntegerKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1129:2: ( 'text' )
                    {
                    // InternalMyDsl.g:1129:2: ( 'text' )
                    // InternalMyDsl.g:1130:3: 'text'
                    {
                     before(grammarAccess.getTypeAccess().getTextKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1135:2: ( 'aid' )
                    {
                    // InternalMyDsl.g:1135:2: ( 'aid' )
                    // InternalMyDsl.g:1136:3: 'aid'
                    {
                     before(grammarAccess.getTypeAccess().getAidKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getAidKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1141:2: ( 'float' )
                    {
                    // InternalMyDsl.g:1141:2: ( 'float' )
                    // InternalMyDsl.g:1142:3: 'float'
                    {
                     before(grammarAccess.getTypeAccess().getFloatKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getFloatKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:1151:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1155:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:1156:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:1163:1: rule__Model__Group__0__Impl : ( ( rule__Model__DefinitionsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1167:1: ( ( ( rule__Model__DefinitionsAssignment_0 ) ) )
            // InternalMyDsl.g:1168:1: ( ( rule__Model__DefinitionsAssignment_0 ) )
            {
            // InternalMyDsl.g:1168:1: ( ( rule__Model__DefinitionsAssignment_0 ) )
            // InternalMyDsl.g:1169:2: ( rule__Model__DefinitionsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getDefinitionsAssignment_0()); 
            // InternalMyDsl.g:1170:2: ( rule__Model__DefinitionsAssignment_0 )
            // InternalMyDsl.g:1170:3: rule__Model__DefinitionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__DefinitionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDefinitionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:1178:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:1183:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:1190:1: rule__Model__Group__1__Impl : ( ( rule__Model__DefinitionsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1194:1: ( ( ( rule__Model__DefinitionsAssignment_1 )* ) )
            // InternalMyDsl.g:1195:1: ( ( rule__Model__DefinitionsAssignment_1 )* )
            {
            // InternalMyDsl.g:1195:1: ( ( rule__Model__DefinitionsAssignment_1 )* )
            // InternalMyDsl.g:1196:2: ( rule__Model__DefinitionsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDefinitionsAssignment_1()); 
            // InternalMyDsl.g:1197:2: ( rule__Model__DefinitionsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=41 && LA13_0<=43)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1197:3: rule__Model__DefinitionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__DefinitionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDefinitionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyDsl.g:1205:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1209:1: ( rule__Model__Group__2__Impl )
            // InternalMyDsl.g:1210:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyDsl.g:1216:1: rule__Model__Group__2__Impl : ( ( rule__Model__Alternatives_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( ( ( rule__Model__Alternatives_2 ) ) )
            // InternalMyDsl.g:1221:1: ( ( rule__Model__Alternatives_2 ) )
            {
            // InternalMyDsl.g:1221:1: ( ( rule__Model__Alternatives_2 ) )
            // InternalMyDsl.g:1222:2: ( rule__Model__Alternatives_2 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_2()); 
            // InternalMyDsl.g:1223:2: ( rule__Model__Alternatives_2 )
            // InternalMyDsl.g:1223:3: rule__Model__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__GlobalProtocol__Group__0"
    // InternalMyDsl.g:1232:1: rule__GlobalProtocol__Group__0 : rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 ;
    public final void rule__GlobalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1236:1: ( rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 )
            // InternalMyDsl.g:1237:2: rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GlobalProtocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__0"


    // $ANTLR start "rule__GlobalProtocol__Group__0__Impl"
    // InternalMyDsl.g:1244:1: rule__GlobalProtocol__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1248:1: ( ( 'global' ) )
            // InternalMyDsl.g:1249:1: ( 'global' )
            {
            // InternalMyDsl.g:1249:1: ( 'global' )
            // InternalMyDsl.g:1250:2: 'global'
            {
             before(grammarAccess.getGlobalProtocolAccess().getGlobalKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGlobalProtocolAccess().getGlobalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__0__Impl"


    // $ANTLR start "rule__GlobalProtocol__Group__1"
    // InternalMyDsl.g:1259:1: rule__GlobalProtocol__Group__1 : rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 ;
    public final void rule__GlobalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1263:1: ( rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 )
            // InternalMyDsl.g:1264:2: rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__GlobalProtocol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__1"


    // $ANTLR start "rule__GlobalProtocol__Group__1__Impl"
    // InternalMyDsl.g:1271:1: rule__GlobalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__GlobalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1275:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:1276:1: ( 'protocol' )
            {
            // InternalMyDsl.g:1276:1: ( 'protocol' )
            // InternalMyDsl.g:1277:2: 'protocol'
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGlobalProtocolAccess().getProtocolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__1__Impl"


    // $ANTLR start "rule__GlobalProtocol__Group__2"
    // InternalMyDsl.g:1286:1: rule__GlobalProtocol__Group__2 : rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 ;
    public final void rule__GlobalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1290:1: ( rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 )
            // InternalMyDsl.g:1291:2: rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__GlobalProtocol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__2"


    // $ANTLR start "rule__GlobalProtocol__Group__2__Impl"
    // InternalMyDsl.g:1298:1: rule__GlobalProtocol__Group__2__Impl : ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__GlobalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1302:1: ( ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:1303:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:1303:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:1304:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:1305:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:1305:3: rule__GlobalProtocol__ProtocolNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__ProtocolNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolAccess().getProtocolNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__2__Impl"


    // $ANTLR start "rule__GlobalProtocol__Group__3"
    // InternalMyDsl.g:1313:1: rule__GlobalProtocol__Group__3 : rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 ;
    public final void rule__GlobalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1317:1: ( rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 )
            // InternalMyDsl.g:1318:2: rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__GlobalProtocol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__3"


    // $ANTLR start "rule__GlobalProtocol__Group__3__Impl"
    // InternalMyDsl.g:1325:1: rule__GlobalProtocol__Group__3__Impl : ( '(' ) ;
    public final void rule__GlobalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1329:1: ( ( '(' ) )
            // InternalMyDsl.g:1330:1: ( '(' )
            {
            // InternalMyDsl.g:1330:1: ( '(' )
            // InternalMyDsl.g:1331:2: '('
            {
             before(grammarAccess.getGlobalProtocolAccess().getLeftParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGlobalProtocolAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__3__Impl"


    // $ANTLR start "rule__GlobalProtocol__Group__4"
    // InternalMyDsl.g:1340:1: rule__GlobalProtocol__Group__4 : rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 ;
    public final void rule__GlobalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1344:1: ( rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 )
            // InternalMyDsl.g:1345:2: rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__GlobalProtocol__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__4"


    // $ANTLR start "rule__GlobalProtocol__Group__4__Impl"
    // InternalMyDsl.g:1352:1: rule__GlobalProtocol__Group__4__Impl : ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) ;
    public final void rule__GlobalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1356:1: ( ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) )
            // InternalMyDsl.g:1357:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            {
            // InternalMyDsl.g:1357:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            // InternalMyDsl.g:1358:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getRolesAssignment_4()); 
            // InternalMyDsl.g:1359:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            // InternalMyDsl.g:1359:3: rule__GlobalProtocol__RolesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolAccess().getRolesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__4__Impl"


    // $ANTLR start "rule__GlobalProtocol__Group__5"
    // InternalMyDsl.g:1367:1: rule__GlobalProtocol__Group__5 : rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 ;
    public final void rule__GlobalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1371:1: ( rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 )
            // InternalMyDsl.g:1372:2: rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__GlobalProtocol__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__5"


    // $ANTLR start "rule__GlobalProtocol__Group__5__Impl"
    // InternalMyDsl.g:1379:1: rule__GlobalProtocol__Group__5__Impl : ( '){' ) ;
    public final void rule__GlobalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1383:1: ( ( '){' ) )
            // InternalMyDsl.g:1384:1: ( '){' )
            {
            // InternalMyDsl.g:1384:1: ( '){' )
            // InternalMyDsl.g:1385:2: '){'
            {
             before(grammarAccess.getGlobalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGlobalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__5__Impl"


    // $ANTLR start "rule__GlobalProtocol__Group__6"
    // InternalMyDsl.g:1394:1: rule__GlobalProtocol__Group__6 : rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 ;
    public final void rule__GlobalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1398:1: ( rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 )
            // InternalMyDsl.g:1399:2: rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__GlobalProtocol__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__6"


    // $ANTLR start "rule__GlobalProtocol__Group__6__Impl"
    // InternalMyDsl.g:1406:1: rule__GlobalProtocol__Group__6__Impl : ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) ;
    public final void rule__GlobalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1410:1: ( ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) )
            // InternalMyDsl.g:1411:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            {
            // InternalMyDsl.g:1411:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            // InternalMyDsl.g:1412:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolAssignment_6()); 
            // InternalMyDsl.g:1413:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            // InternalMyDsl.g:1413:3: rule__GlobalProtocol__ProtocolAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__ProtocolAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolAccess().getProtocolAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__6__Impl"


    // $ANTLR start "rule__GlobalProtocol__Group__7"
    // InternalMyDsl.g:1421:1: rule__GlobalProtocol__Group__7 : rule__GlobalProtocol__Group__7__Impl ;
    public final void rule__GlobalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1425:1: ( rule__GlobalProtocol__Group__7__Impl )
            // InternalMyDsl.g:1426:2: rule__GlobalProtocol__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalProtocol__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__7"


    // $ANTLR start "rule__GlobalProtocol__Group__7__Impl"
    // InternalMyDsl.g:1432:1: rule__GlobalProtocol__Group__7__Impl : ( '}' ) ;
    public final void rule__GlobalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( ( '}' ) )
            // InternalMyDsl.g:1437:1: ( '}' )
            {
            // InternalMyDsl.g:1437:1: ( '}' )
            // InternalMyDsl.g:1438:2: '}'
            {
             before(grammarAccess.getGlobalProtocolAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGlobalProtocolAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__Group__7__Impl"


    // $ANTLR start "rule__Definition__Group_0__0"
    // InternalMyDsl.g:1448:1: rule__Definition__Group_0__0 : rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 ;
    public final void rule__Definition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1452:1: ( rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 )
            // InternalMyDsl.g:1453:2: rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0"


    // $ANTLR start "rule__Definition__Group_0__0__Impl"
    // InternalMyDsl.g:1460:1: rule__Definition__Group_0__0__Impl : ( ( rule__Definition__TypeAssignment_0_0 ) ) ;
    public final void rule__Definition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1464:1: ( ( ( rule__Definition__TypeAssignment_0_0 ) ) )
            // InternalMyDsl.g:1465:1: ( ( rule__Definition__TypeAssignment_0_0 ) )
            {
            // InternalMyDsl.g:1465:1: ( ( rule__Definition__TypeAssignment_0_0 ) )
            // InternalMyDsl.g:1466:2: ( rule__Definition__TypeAssignment_0_0 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAssignment_0_0()); 
            // InternalMyDsl.g:1467:2: ( rule__Definition__TypeAssignment_0_0 )
            // InternalMyDsl.g:1467:3: rule__Definition__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0__Impl"


    // $ANTLR start "rule__Definition__Group_0__1"
    // InternalMyDsl.g:1475:1: rule__Definition__Group_0__1 : rule__Definition__Group_0__1__Impl ;
    public final void rule__Definition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( rule__Definition__Group_0__1__Impl )
            // InternalMyDsl.g:1480:2: rule__Definition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1"


    // $ANTLR start "rule__Definition__Group_0__1__Impl"
    // InternalMyDsl.g:1486:1: rule__Definition__Group_0__1__Impl : ( ( rule__Definition__NameAssignment_0_1 ) ) ;
    public final void rule__Definition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( ( ( rule__Definition__NameAssignment_0_1 ) ) )
            // InternalMyDsl.g:1491:1: ( ( rule__Definition__NameAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1491:1: ( ( rule__Definition__NameAssignment_0_1 ) )
            // InternalMyDsl.g:1492:2: ( rule__Definition__NameAssignment_0_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0_1()); 
            // InternalMyDsl.g:1493:2: ( rule__Definition__NameAssignment_0_1 )
            // InternalMyDsl.g:1493:3: rule__Definition__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1__Impl"


    // $ANTLR start "rule__Definition__Group_1__0"
    // InternalMyDsl.g:1502:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalMyDsl.g:1507:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0"


    // $ANTLR start "rule__Definition__Group_1__0__Impl"
    // InternalMyDsl.g:1514:1: rule__Definition__Group_1__0__Impl : ( ( rule__Definition__TypeAssignment_1_0 ) ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1518:1: ( ( ( rule__Definition__TypeAssignment_1_0 ) ) )
            // InternalMyDsl.g:1519:1: ( ( rule__Definition__TypeAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1519:1: ( ( rule__Definition__TypeAssignment_1_0 ) )
            // InternalMyDsl.g:1520:2: ( rule__Definition__TypeAssignment_1_0 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAssignment_1_0()); 
            // InternalMyDsl.g:1521:2: ( rule__Definition__TypeAssignment_1_0 )
            // InternalMyDsl.g:1521:3: rule__Definition__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0__Impl"


    // $ANTLR start "rule__Definition__Group_1__1"
    // InternalMyDsl.g:1529:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalMyDsl.g:1534:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1"


    // $ANTLR start "rule__Definition__Group_1__1__Impl"
    // InternalMyDsl.g:1541:1: rule__Definition__Group_1__1__Impl : ( ( rule__Definition__NameAssignment_1_1 ) ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1545:1: ( ( ( rule__Definition__NameAssignment_1_1 ) ) )
            // InternalMyDsl.g:1546:1: ( ( rule__Definition__NameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1546:1: ( ( rule__Definition__NameAssignment_1_1 ) )
            // InternalMyDsl.g:1547:2: ( rule__Definition__NameAssignment_1_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1_1()); 
            // InternalMyDsl.g:1548:2: ( rule__Definition__NameAssignment_1_1 )
            // InternalMyDsl.g:1548:3: rule__Definition__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1__Impl"


    // $ANTLR start "rule__Definition__Group_1__2"
    // InternalMyDsl.g:1556:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1560:1: ( rule__Definition__Group_1__2__Impl )
            // InternalMyDsl.g:1561:2: rule__Definition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2"


    // $ANTLR start "rule__Definition__Group_1__2__Impl"
    // InternalMyDsl.g:1567:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__Group_1_2__0 )? ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( ( ( rule__Definition__Group_1_2__0 )? ) )
            // InternalMyDsl.g:1572:1: ( ( rule__Definition__Group_1_2__0 )? )
            {
            // InternalMyDsl.g:1572:1: ( ( rule__Definition__Group_1_2__0 )? )
            // InternalMyDsl.g:1573:2: ( rule__Definition__Group_1_2__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_1_2()); 
            // InternalMyDsl.g:1574:2: ( rule__Definition__Group_1_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1574:3: rule__Definition__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2__Impl"


    // $ANTLR start "rule__Definition__Group_1_2__0"
    // InternalMyDsl.g:1583:1: rule__Definition__Group_1_2__0 : rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 ;
    public final void rule__Definition__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1587:1: ( rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 )
            // InternalMyDsl.g:1588:2: rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Definition__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__0"


    // $ANTLR start "rule__Definition__Group_1_2__0__Impl"
    // InternalMyDsl.g:1595:1: rule__Definition__Group_1_2__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1599:1: ( ( '(' ) )
            // InternalMyDsl.g:1600:1: ( '(' )
            {
            // InternalMyDsl.g:1600:1: ( '(' )
            // InternalMyDsl.g:1601:2: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_1_2__1"
    // InternalMyDsl.g:1610:1: rule__Definition__Group_1_2__1 : rule__Definition__Group_1_2__1__Impl rule__Definition__Group_1_2__2 ;
    public final void rule__Definition__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1614:1: ( rule__Definition__Group_1_2__1__Impl rule__Definition__Group_1_2__2 )
            // InternalMyDsl.g:1615:2: rule__Definition__Group_1_2__1__Impl rule__Definition__Group_1_2__2
            {
            pushFollow(FOLLOW_13);
            rule__Definition__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__1"


    // $ANTLR start "rule__Definition__Group_1_2__1__Impl"
    // InternalMyDsl.g:1622:1: rule__Definition__Group_1_2__1__Impl : ( ( rule__Definition__TypesAssignment_1_2_1 ) ) ;
    public final void rule__Definition__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1626:1: ( ( ( rule__Definition__TypesAssignment_1_2_1 ) ) )
            // InternalMyDsl.g:1627:1: ( ( rule__Definition__TypesAssignment_1_2_1 ) )
            {
            // InternalMyDsl.g:1627:1: ( ( rule__Definition__TypesAssignment_1_2_1 ) )
            // InternalMyDsl.g:1628:2: ( rule__Definition__TypesAssignment_1_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getTypesAssignment_1_2_1()); 
            // InternalMyDsl.g:1629:2: ( rule__Definition__TypesAssignment_1_2_1 )
            // InternalMyDsl.g:1629:3: rule__Definition__TypesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__1__Impl"


    // $ANTLR start "rule__Definition__Group_1_2__2"
    // InternalMyDsl.g:1637:1: rule__Definition__Group_1_2__2 : rule__Definition__Group_1_2__2__Impl rule__Definition__Group_1_2__3 ;
    public final void rule__Definition__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1641:1: ( rule__Definition__Group_1_2__2__Impl rule__Definition__Group_1_2__3 )
            // InternalMyDsl.g:1642:2: rule__Definition__Group_1_2__2__Impl rule__Definition__Group_1_2__3
            {
            pushFollow(FOLLOW_13);
            rule__Definition__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__2"


    // $ANTLR start "rule__Definition__Group_1_2__2__Impl"
    // InternalMyDsl.g:1649:1: rule__Definition__Group_1_2__2__Impl : ( ( rule__Definition__Group_1_2_2__0 )? ) ;
    public final void rule__Definition__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1653:1: ( ( ( rule__Definition__Group_1_2_2__0 )? ) )
            // InternalMyDsl.g:1654:1: ( ( rule__Definition__Group_1_2_2__0 )? )
            {
            // InternalMyDsl.g:1654:1: ( ( rule__Definition__Group_1_2_2__0 )? )
            // InternalMyDsl.g:1655:2: ( rule__Definition__Group_1_2_2__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_1_2_2()); 
            // InternalMyDsl.g:1656:2: ( rule__Definition__Group_1_2_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1656:3: rule__Definition__Group_1_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getGroup_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__2__Impl"


    // $ANTLR start "rule__Definition__Group_1_2__3"
    // InternalMyDsl.g:1664:1: rule__Definition__Group_1_2__3 : rule__Definition__Group_1_2__3__Impl ;
    public final void rule__Definition__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1668:1: ( rule__Definition__Group_1_2__3__Impl )
            // InternalMyDsl.g:1669:2: rule__Definition__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__3"


    // $ANTLR start "rule__Definition__Group_1_2__3__Impl"
    // InternalMyDsl.g:1675:1: rule__Definition__Group_1_2__3__Impl : ( ')' ) ;
    public final void rule__Definition__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( ( ')' ) )
            // InternalMyDsl.g:1680:1: ( ')' )
            {
            // InternalMyDsl.g:1680:1: ( ')' )
            // InternalMyDsl.g:1681:2: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_2_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__3__Impl"


    // $ANTLR start "rule__Definition__Group_1_2_2__0"
    // InternalMyDsl.g:1691:1: rule__Definition__Group_1_2_2__0 : rule__Definition__Group_1_2_2__0__Impl rule__Definition__Group_1_2_2__1 ;
    public final void rule__Definition__Group_1_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( rule__Definition__Group_1_2_2__0__Impl rule__Definition__Group_1_2_2__1 )
            // InternalMyDsl.g:1696:2: rule__Definition__Group_1_2_2__0__Impl rule__Definition__Group_1_2_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Definition__Group_1_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_2__0"


    // $ANTLR start "rule__Definition__Group_1_2_2__0__Impl"
    // InternalMyDsl.g:1703:1: rule__Definition__Group_1_2_2__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_1_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1707:1: ( ( ',' ) )
            // InternalMyDsl.g:1708:1: ( ',' )
            {
            // InternalMyDsl.g:1708:1: ( ',' )
            // InternalMyDsl.g:1709:2: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_1_2_2__1"
    // InternalMyDsl.g:1718:1: rule__Definition__Group_1_2_2__1 : rule__Definition__Group_1_2_2__1__Impl ;
    public final void rule__Definition__Group_1_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1722:1: ( rule__Definition__Group_1_2_2__1__Impl )
            // InternalMyDsl.g:1723:2: rule__Definition__Group_1_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_2__1"


    // $ANTLR start "rule__Definition__Group_1_2_2__1__Impl"
    // InternalMyDsl.g:1729:1: rule__Definition__Group_1_2_2__1__Impl : ( ( rule__Definition__TypesAssignment_1_2_2_1 ) ) ;
    public final void rule__Definition__Group_1_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( ( ( rule__Definition__TypesAssignment_1_2_2_1 ) ) )
            // InternalMyDsl.g:1734:1: ( ( rule__Definition__TypesAssignment_1_2_2_1 ) )
            {
            // InternalMyDsl.g:1734:1: ( ( rule__Definition__TypesAssignment_1_2_2_1 ) )
            // InternalMyDsl.g:1735:2: ( rule__Definition__TypesAssignment_1_2_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getTypesAssignment_1_2_2_1()); 
            // InternalMyDsl.g:1736:2: ( rule__Definition__TypesAssignment_1_2_2_1 )
            // InternalMyDsl.g:1736:3: rule__Definition__TypesAssignment_1_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypesAssignment_1_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypesAssignment_1_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_2__1__Impl"


    // $ANTLR start "rule__Definition__Group_2__0"
    // InternalMyDsl.g:1745:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1749:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // InternalMyDsl.g:1750:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0"


    // $ANTLR start "rule__Definition__Group_2__0__Impl"
    // InternalMyDsl.g:1757:1: rule__Definition__Group_2__0__Impl : ( ( rule__Definition__TypeAssignment_2_0 ) ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1761:1: ( ( ( rule__Definition__TypeAssignment_2_0 ) ) )
            // InternalMyDsl.g:1762:1: ( ( rule__Definition__TypeAssignment_2_0 ) )
            {
            // InternalMyDsl.g:1762:1: ( ( rule__Definition__TypeAssignment_2_0 ) )
            // InternalMyDsl.g:1763:2: ( rule__Definition__TypeAssignment_2_0 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAssignment_2_0()); 
            // InternalMyDsl.g:1764:2: ( rule__Definition__TypeAssignment_2_0 )
            // InternalMyDsl.g:1764:3: rule__Definition__TypeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypeAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_2__1"
    // InternalMyDsl.g:1772:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1776:1: ( rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 )
            // InternalMyDsl.g:1777:2: rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1"


    // $ANTLR start "rule__Definition__Group_2__1__Impl"
    // InternalMyDsl.g:1784:1: rule__Definition__Group_2__1__Impl : ( ( rule__Definition__NameAssignment_2_1 ) ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1788:1: ( ( ( rule__Definition__NameAssignment_2_1 ) ) )
            // InternalMyDsl.g:1789:1: ( ( rule__Definition__NameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1789:1: ( ( rule__Definition__NameAssignment_2_1 ) )
            // InternalMyDsl.g:1790:2: ( rule__Definition__NameAssignment_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_2_1()); 
            // InternalMyDsl.g:1791:2: ( rule__Definition__NameAssignment_2_1 )
            // InternalMyDsl.g:1791:3: rule__Definition__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1__Impl"


    // $ANTLR start "rule__Definition__Group_2__2"
    // InternalMyDsl.g:1799:1: rule__Definition__Group_2__2 : rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 ;
    public final void rule__Definition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1803:1: ( rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 )
            // InternalMyDsl.g:1804:2: rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__Definition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__2"


    // $ANTLR start "rule__Definition__Group_2__2__Impl"
    // InternalMyDsl.g:1811:1: rule__Definition__Group_2__2__Impl : ( '(' ) ;
    public final void rule__Definition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1815:1: ( ( '(' ) )
            // InternalMyDsl.g:1816:1: ( '(' )
            {
            // InternalMyDsl.g:1816:1: ( '(' )
            // InternalMyDsl.g:1817:2: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__2__Impl"


    // $ANTLR start "rule__Definition__Group_2__3"
    // InternalMyDsl.g:1826:1: rule__Definition__Group_2__3 : rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4 ;
    public final void rule__Definition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1830:1: ( rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4 )
            // InternalMyDsl.g:1831:2: rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4
            {
            pushFollow(FOLLOW_13);
            rule__Definition__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__3"


    // $ANTLR start "rule__Definition__Group_2__3__Impl"
    // InternalMyDsl.g:1838:1: rule__Definition__Group_2__3__Impl : ( ( rule__Definition__TypesAssignment_2_3 ) ) ;
    public final void rule__Definition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1842:1: ( ( ( rule__Definition__TypesAssignment_2_3 ) ) )
            // InternalMyDsl.g:1843:1: ( ( rule__Definition__TypesAssignment_2_3 ) )
            {
            // InternalMyDsl.g:1843:1: ( ( rule__Definition__TypesAssignment_2_3 ) )
            // InternalMyDsl.g:1844:2: ( rule__Definition__TypesAssignment_2_3 )
            {
             before(grammarAccess.getDefinitionAccess().getTypesAssignment_2_3()); 
            // InternalMyDsl.g:1845:2: ( rule__Definition__TypesAssignment_2_3 )
            // InternalMyDsl.g:1845:3: rule__Definition__TypesAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypesAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypesAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__3__Impl"


    // $ANTLR start "rule__Definition__Group_2__4"
    // InternalMyDsl.g:1853:1: rule__Definition__Group_2__4 : rule__Definition__Group_2__4__Impl rule__Definition__Group_2__5 ;
    public final void rule__Definition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( rule__Definition__Group_2__4__Impl rule__Definition__Group_2__5 )
            // InternalMyDsl.g:1858:2: rule__Definition__Group_2__4__Impl rule__Definition__Group_2__5
            {
            pushFollow(FOLLOW_13);
            rule__Definition__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__4"


    // $ANTLR start "rule__Definition__Group_2__4__Impl"
    // InternalMyDsl.g:1865:1: rule__Definition__Group_2__4__Impl : ( ( rule__Definition__Group_2_4__0 )? ) ;
    public final void rule__Definition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1869:1: ( ( ( rule__Definition__Group_2_4__0 )? ) )
            // InternalMyDsl.g:1870:1: ( ( rule__Definition__Group_2_4__0 )? )
            {
            // InternalMyDsl.g:1870:1: ( ( rule__Definition__Group_2_4__0 )? )
            // InternalMyDsl.g:1871:2: ( rule__Definition__Group_2_4__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_2_4()); 
            // InternalMyDsl.g:1872:2: ( rule__Definition__Group_2_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1872:3: rule__Definition__Group_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getGroup_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__4__Impl"


    // $ANTLR start "rule__Definition__Group_2__5"
    // InternalMyDsl.g:1880:1: rule__Definition__Group_2__5 : rule__Definition__Group_2__5__Impl ;
    public final void rule__Definition__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1884:1: ( rule__Definition__Group_2__5__Impl )
            // InternalMyDsl.g:1885:2: rule__Definition__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__5"


    // $ANTLR start "rule__Definition__Group_2__5__Impl"
    // InternalMyDsl.g:1891:1: rule__Definition__Group_2__5__Impl : ( ')' ) ;
    public final void rule__Definition__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( ( ')' ) )
            // InternalMyDsl.g:1896:1: ( ')' )
            {
            // InternalMyDsl.g:1896:1: ( ')' )
            // InternalMyDsl.g:1897:2: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__5__Impl"


    // $ANTLR start "rule__Definition__Group_2_4__0"
    // InternalMyDsl.g:1907:1: rule__Definition__Group_2_4__0 : rule__Definition__Group_2_4__0__Impl rule__Definition__Group_2_4__1 ;
    public final void rule__Definition__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1911:1: ( rule__Definition__Group_2_4__0__Impl rule__Definition__Group_2_4__1 )
            // InternalMyDsl.g:1912:2: rule__Definition__Group_2_4__0__Impl rule__Definition__Group_2_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Definition__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2_4__0"


    // $ANTLR start "rule__Definition__Group_2_4__0__Impl"
    // InternalMyDsl.g:1919:1: rule__Definition__Group_2_4__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1923:1: ( ( ',' ) )
            // InternalMyDsl.g:1924:1: ( ',' )
            {
            // InternalMyDsl.g:1924:1: ( ',' )
            // InternalMyDsl.g:1925:2: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_2_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getCommaKeyword_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2_4__0__Impl"


    // $ANTLR start "rule__Definition__Group_2_4__1"
    // InternalMyDsl.g:1934:1: rule__Definition__Group_2_4__1 : rule__Definition__Group_2_4__1__Impl ;
    public final void rule__Definition__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1938:1: ( rule__Definition__Group_2_4__1__Impl )
            // InternalMyDsl.g:1939:2: rule__Definition__Group_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_2_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2_4__1"


    // $ANTLR start "rule__Definition__Group_2_4__1__Impl"
    // InternalMyDsl.g:1945:1: rule__Definition__Group_2_4__1__Impl : ( ( rule__Definition__TypesAssignment_2_4_1 ) ) ;
    public final void rule__Definition__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( ( ( rule__Definition__TypesAssignment_2_4_1 ) ) )
            // InternalMyDsl.g:1950:1: ( ( rule__Definition__TypesAssignment_2_4_1 ) )
            {
            // InternalMyDsl.g:1950:1: ( ( rule__Definition__TypesAssignment_2_4_1 ) )
            // InternalMyDsl.g:1951:2: ( rule__Definition__TypesAssignment_2_4_1 )
            {
             before(grammarAccess.getDefinitionAccess().getTypesAssignment_2_4_1()); 
            // InternalMyDsl.g:1952:2: ( rule__Definition__TypesAssignment_2_4_1 )
            // InternalMyDsl.g:1952:3: rule__Definition__TypesAssignment_2_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypesAssignment_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypesAssignment_2_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2_4__1__Impl"


    // $ANTLR start "rule__QuitDefinition__Group__0"
    // InternalMyDsl.g:1961:1: rule__QuitDefinition__Group__0 : rule__QuitDefinition__Group__0__Impl rule__QuitDefinition__Group__1 ;
    public final void rule__QuitDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1965:1: ( rule__QuitDefinition__Group__0__Impl rule__QuitDefinition__Group__1 )
            // InternalMyDsl.g:1966:2: rule__QuitDefinition__Group__0__Impl rule__QuitDefinition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__QuitDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuitDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuitDefinition__Group__0"


    // $ANTLR start "rule__QuitDefinition__Group__0__Impl"
    // InternalMyDsl.g:1973:1: rule__QuitDefinition__Group__0__Impl : ( ( rule__QuitDefinition__TypeAssignment_0 ) ) ;
    public final void rule__QuitDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1977:1: ( ( ( rule__QuitDefinition__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:1978:1: ( ( rule__QuitDefinition__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:1978:1: ( ( rule__QuitDefinition__TypeAssignment_0 ) )
            // InternalMyDsl.g:1979:2: ( rule__QuitDefinition__TypeAssignment_0 )
            {
             before(grammarAccess.getQuitDefinitionAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:1980:2: ( rule__QuitDefinition__TypeAssignment_0 )
            // InternalMyDsl.g:1980:3: rule__QuitDefinition__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QuitDefinition__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuitDefinitionAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuitDefinition__Group__0__Impl"


    // $ANTLR start "rule__QuitDefinition__Group__1"
    // InternalMyDsl.g:1988:1: rule__QuitDefinition__Group__1 : rule__QuitDefinition__Group__1__Impl ;
    public final void rule__QuitDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1992:1: ( rule__QuitDefinition__Group__1__Impl )
            // InternalMyDsl.g:1993:2: rule__QuitDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuitDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuitDefinition__Group__1"


    // $ANTLR start "rule__QuitDefinition__Group__1__Impl"
    // InternalMyDsl.g:1999:1: rule__QuitDefinition__Group__1__Impl : ( ( rule__QuitDefinition__NameAssignment_1 ) ) ;
    public final void rule__QuitDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( ( ( rule__QuitDefinition__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2004:1: ( ( rule__QuitDefinition__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2004:1: ( ( rule__QuitDefinition__NameAssignment_1 ) )
            // InternalMyDsl.g:2005:2: ( rule__QuitDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getQuitDefinitionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2006:2: ( rule__QuitDefinition__NameAssignment_1 )
            // InternalMyDsl.g:2006:3: rule__QuitDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuitDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuitDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuitDefinition__Group__1__Impl"


    // $ANTLR start "rule__Roles__Group__0"
    // InternalMyDsl.g:2015:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2019:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalMyDsl.g:2020:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Roles__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Roles__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group__0"


    // $ANTLR start "rule__Roles__Group__0__Impl"
    // InternalMyDsl.g:2027:1: rule__Roles__Group__0__Impl : ( ( rule__Roles__RolesAssignment_0 ) ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2031:1: ( ( ( rule__Roles__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:2032:1: ( ( rule__Roles__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:2032:1: ( ( rule__Roles__RolesAssignment_0 ) )
            // InternalMyDsl.g:2033:2: ( rule__Roles__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:2034:2: ( rule__Roles__RolesAssignment_0 )
            // InternalMyDsl.g:2034:3: rule__Roles__RolesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Roles__RolesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRolesAccess().getRolesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group__0__Impl"


    // $ANTLR start "rule__Roles__Group__1"
    // InternalMyDsl.g:2042:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2046:1: ( rule__Roles__Group__1__Impl )
            // InternalMyDsl.g:2047:2: rule__Roles__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Roles__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group__1"


    // $ANTLR start "rule__Roles__Group__1__Impl"
    // InternalMyDsl.g:2053:1: rule__Roles__Group__1__Impl : ( ( rule__Roles__Group_1__0 )* ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( ( ( rule__Roles__Group_1__0 )* ) )
            // InternalMyDsl.g:2058:1: ( ( rule__Roles__Group_1__0 )* )
            {
            // InternalMyDsl.g:2058:1: ( ( rule__Roles__Group_1__0 )* )
            // InternalMyDsl.g:2059:2: ( rule__Roles__Group_1__0 )*
            {
             before(grammarAccess.getRolesAccess().getGroup_1()); 
            // InternalMyDsl.g:2060:2: ( rule__Roles__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2060:3: rule__Roles__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Roles__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRolesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group__1__Impl"


    // $ANTLR start "rule__Roles__Group_1__0"
    // InternalMyDsl.g:2069:1: rule__Roles__Group_1__0 : rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 ;
    public final void rule__Roles__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2073:1: ( rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 )
            // InternalMyDsl.g:2074:2: rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Roles__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Roles__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group_1__0"


    // $ANTLR start "rule__Roles__Group_1__0__Impl"
    // InternalMyDsl.g:2081:1: rule__Roles__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Roles__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2085:1: ( ( ',' ) )
            // InternalMyDsl.g:2086:1: ( ',' )
            {
            // InternalMyDsl.g:2086:1: ( ',' )
            // InternalMyDsl.g:2087:2: ','
            {
             before(grammarAccess.getRolesAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRolesAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group_1__0__Impl"


    // $ANTLR start "rule__Roles__Group_1__1"
    // InternalMyDsl.g:2096:1: rule__Roles__Group_1__1 : rule__Roles__Group_1__1__Impl ;
    public final void rule__Roles__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2100:1: ( rule__Roles__Group_1__1__Impl )
            // InternalMyDsl.g:2101:2: rule__Roles__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Roles__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group_1__1"


    // $ANTLR start "rule__Roles__Group_1__1__Impl"
    // InternalMyDsl.g:2107:1: rule__Roles__Group_1__1__Impl : ( ( rule__Roles__RolesAssignment_1_1 ) ) ;
    public final void rule__Roles__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( ( ( rule__Roles__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:2112:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2112:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:2113:2: ( rule__Roles__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:2114:2: ( rule__Roles__RolesAssignment_1_1 )
            // InternalMyDsl.g:2114:3: rule__Roles__RolesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Roles__RolesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group_1__1__Impl"


    // $ANTLR start "rule__RoleOne__Group__0"
    // InternalMyDsl.g:2123:1: rule__RoleOne__Group__0 : rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 ;
    public final void rule__RoleOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2127:1: ( rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 )
            // InternalMyDsl.g:2128:2: rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RoleOne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleOne__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleOne__Group__0"


    // $ANTLR start "rule__RoleOne__Group__0__Impl"
    // InternalMyDsl.g:2135:1: rule__RoleOne__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2139:1: ( ( 'role' ) )
            // InternalMyDsl.g:2140:1: ( 'role' )
            {
            // InternalMyDsl.g:2140:1: ( 'role' )
            // InternalMyDsl.g:2141:2: 'role'
            {
             before(grammarAccess.getRoleOneAccess().getRoleKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRoleOneAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleOne__Group__0__Impl"


    // $ANTLR start "rule__RoleOne__Group__1"
    // InternalMyDsl.g:2150:1: rule__RoleOne__Group__1 : rule__RoleOne__Group__1__Impl ;
    public final void rule__RoleOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2154:1: ( rule__RoleOne__Group__1__Impl )
            // InternalMyDsl.g:2155:2: rule__RoleOne__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleOne__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleOne__Group__1"


    // $ANTLR start "rule__RoleOne__Group__1__Impl"
    // InternalMyDsl.g:2161:1: rule__RoleOne__Group__1__Impl : ( ( rule__RoleOne__NameAssignment_1 ) ) ;
    public final void rule__RoleOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( ( ( rule__RoleOne__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2166:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2166:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            // InternalMyDsl.g:2167:2: ( rule__RoleOne__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2168:2: ( rule__RoleOne__NameAssignment_1 )
            // InternalMyDsl.g:2168:3: rule__RoleOne__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoleOne__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleOne__Group__1__Impl"


    // $ANTLR start "rule__RoleSet__Group__0"
    // InternalMyDsl.g:2177:1: rule__RoleSet__Group__0 : rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 ;
    public final void rule__RoleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2181:1: ( rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 )
            // InternalMyDsl.g:2182:2: rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RoleSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSet__Group__0"


    // $ANTLR start "rule__RoleSet__Group__0__Impl"
    // InternalMyDsl.g:2189:1: rule__RoleSet__Group__0__Impl : ( 'roleset' ) ;
    public final void rule__RoleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2193:1: ( ( 'roleset' ) )
            // InternalMyDsl.g:2194:1: ( 'roleset' )
            {
            // InternalMyDsl.g:2194:1: ( 'roleset' )
            // InternalMyDsl.g:2195:2: 'roleset'
            {
             before(grammarAccess.getRoleSetAccess().getRolesetKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRoleSetAccess().getRolesetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSet__Group__0__Impl"


    // $ANTLR start "rule__RoleSet__Group__1"
    // InternalMyDsl.g:2204:1: rule__RoleSet__Group__1 : rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 ;
    public final void rule__RoleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2208:1: ( rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 )
            // InternalMyDsl.g:2209:2: rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RoleSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSet__Group__1"


    // $ANTLR start "rule__RoleSet__Group__1__Impl"
    // InternalMyDsl.g:2216:1: rule__RoleSet__Group__1__Impl : ( ( rule__RoleSet__NameAssignment_1 ) ) ;
    public final void rule__RoleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2220:1: ( ( ( rule__RoleSet__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2221:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2221:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            // InternalMyDsl.g:2222:2: ( rule__RoleSet__NameAssignment_1 )
            {
             before(grammarAccess.getRoleSetAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2223:2: ( rule__RoleSet__NameAssignment_1 )
            // InternalMyDsl.g:2223:3: rule__RoleSet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoleSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSet__Group__1__Impl"


    // $ANTLR start "rule__RoleSet__Group__2"
    // InternalMyDsl.g:2231:1: rule__RoleSet__Group__2 : rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 ;
    public final void rule__RoleSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2235:1: ( rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 )
            // InternalMyDsl.g:2236:2: rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RoleSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSet__Group__2"


    // $ANTLR start "rule__RoleSet__Group__2__Impl"
    // InternalMyDsl.g:2243:1: rule__RoleSet__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2247:1: ( ( ':' ) )
            // InternalMyDsl.g:2248:1: ( ':' )
            {
            // InternalMyDsl.g:2248:1: ( ':' )
            // InternalMyDsl.g:2249:2: ':'
            {
             before(grammarAccess.getRoleSetAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoleSetAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSet__Group__2__Impl"


    // $ANTLR start "rule__RoleSet__Group__3"
    // InternalMyDsl.g:2258:1: rule__RoleSet__Group__3 : rule__RoleSet__Group__3__Impl ;
    public final void rule__RoleSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2262:1: ( rule__RoleSet__Group__3__Impl )
            // InternalMyDsl.g:2263:2: rule__RoleSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleSet__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSet__Group__3"


    // $ANTLR start "rule__RoleSet__Group__3__Impl"
    // InternalMyDsl.g:2269:1: rule__RoleSet__Group__3__Impl : ( ( rule__RoleSet__RefAssignment_3 ) ) ;
    public final void rule__RoleSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( ( ( rule__RoleSet__RefAssignment_3 ) ) )
            // InternalMyDsl.g:2274:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:2274:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            // InternalMyDsl.g:2275:2: ( rule__RoleSet__RefAssignment_3 )
            {
             before(grammarAccess.getRoleSetAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:2276:2: ( rule__RoleSet__RefAssignment_3 )
            // InternalMyDsl.g:2276:3: rule__RoleSet__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RoleSet__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleSetAccess().getRefAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSet__Group__3__Impl"


    // $ANTLR start "rule__Recursion__Group__0"
    // InternalMyDsl.g:2285:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2289:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalMyDsl.g:2290:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Recursion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recursion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__0"


    // $ANTLR start "rule__Recursion__Group__0__Impl"
    // InternalMyDsl.g:2297:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2301:1: ( ( 'rec' ) )
            // InternalMyDsl.g:2302:1: ( 'rec' )
            {
            // InternalMyDsl.g:2302:1: ( 'rec' )
            // InternalMyDsl.g:2303:2: 'rec'
            {
             before(grammarAccess.getRecursionAccess().getRecKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getRecKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__0__Impl"


    // $ANTLR start "rule__Recursion__Group__1"
    // InternalMyDsl.g:2312:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2316:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // InternalMyDsl.g:2317:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Recursion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recursion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__1"


    // $ANTLR start "rule__Recursion__Group__1__Impl"
    // InternalMyDsl.g:2324:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__NameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2328:1: ( ( ( rule__Recursion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2329:1: ( ( rule__Recursion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2329:1: ( ( rule__Recursion__NameAssignment_1 ) )
            // InternalMyDsl.g:2330:2: ( rule__Recursion__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2331:2: ( rule__Recursion__NameAssignment_1 )
            // InternalMyDsl.g:2331:3: rule__Recursion__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecursionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__1__Impl"


    // $ANTLR start "rule__Recursion__Group__2"
    // InternalMyDsl.g:2339:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl rule__Recursion__Group__3 ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2343:1: ( rule__Recursion__Group__2__Impl rule__Recursion__Group__3 )
            // InternalMyDsl.g:2344:2: rule__Recursion__Group__2__Impl rule__Recursion__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Recursion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recursion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__2"


    // $ANTLR start "rule__Recursion__Group__2__Impl"
    // InternalMyDsl.g:2351:1: rule__Recursion__Group__2__Impl : ( ':' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2355:1: ( ( ':' ) )
            // InternalMyDsl.g:2356:1: ( ':' )
            {
            // InternalMyDsl.g:2356:1: ( ':' )
            // InternalMyDsl.g:2357:2: ':'
            {
             before(grammarAccess.getRecursionAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__2__Impl"


    // $ANTLR start "rule__Recursion__Group__3"
    // InternalMyDsl.g:2366:1: rule__Recursion__Group__3 : rule__Recursion__Group__3__Impl rule__Recursion__Group__4 ;
    public final void rule__Recursion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2370:1: ( rule__Recursion__Group__3__Impl rule__Recursion__Group__4 )
            // InternalMyDsl.g:2371:2: rule__Recursion__Group__3__Impl rule__Recursion__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Recursion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recursion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__3"


    // $ANTLR start "rule__Recursion__Group__3__Impl"
    // InternalMyDsl.g:2378:1: rule__Recursion__Group__3__Impl : ( '{' ) ;
    public final void rule__Recursion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2382:1: ( ( '{' ) )
            // InternalMyDsl.g:2383:1: ( '{' )
            {
            // InternalMyDsl.g:2383:1: ( '{' )
            // InternalMyDsl.g:2384:2: '{'
            {
             before(grammarAccess.getRecursionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__3__Impl"


    // $ANTLR start "rule__Recursion__Group__4"
    // InternalMyDsl.g:2393:1: rule__Recursion__Group__4 : rule__Recursion__Group__4__Impl rule__Recursion__Group__5 ;
    public final void rule__Recursion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2397:1: ( rule__Recursion__Group__4__Impl rule__Recursion__Group__5 )
            // InternalMyDsl.g:2398:2: rule__Recursion__Group__4__Impl rule__Recursion__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Recursion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recursion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__4"


    // $ANTLR start "rule__Recursion__Group__4__Impl"
    // InternalMyDsl.g:2405:1: rule__Recursion__Group__4__Impl : ( ( rule__Recursion__RecProtocolAssignment_4 ) ) ;
    public final void rule__Recursion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2409:1: ( ( ( rule__Recursion__RecProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:2410:1: ( ( rule__Recursion__RecProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:2410:1: ( ( rule__Recursion__RecProtocolAssignment_4 ) )
            // InternalMyDsl.g:2411:2: ( rule__Recursion__RecProtocolAssignment_4 )
            {
             before(grammarAccess.getRecursionAccess().getRecProtocolAssignment_4()); 
            // InternalMyDsl.g:2412:2: ( rule__Recursion__RecProtocolAssignment_4 )
            // InternalMyDsl.g:2412:3: rule__Recursion__RecProtocolAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__RecProtocolAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRecursionAccess().getRecProtocolAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__4__Impl"


    // $ANTLR start "rule__Recursion__Group__5"
    // InternalMyDsl.g:2420:1: rule__Recursion__Group__5 : rule__Recursion__Group__5__Impl ;
    public final void rule__Recursion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2424:1: ( rule__Recursion__Group__5__Impl )
            // InternalMyDsl.g:2425:2: rule__Recursion__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__5"


    // $ANTLR start "rule__Recursion__Group__5__Impl"
    // InternalMyDsl.g:2431:1: rule__Recursion__Group__5__Impl : ( '}' ) ;
    public final void rule__Recursion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( ( '}' ) )
            // InternalMyDsl.g:2436:1: ( '}' )
            {
            // InternalMyDsl.g:2436:1: ( '}' )
            // InternalMyDsl.g:2437:2: '}'
            {
             before(grammarAccess.getRecursionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__5__Impl"


    // $ANTLR start "rule__CloseRecursion__Group__0"
    // InternalMyDsl.g:2447:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2451:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalMyDsl.g:2452:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CloseRecursion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CloseRecursion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursion__Group__0"


    // $ANTLR start "rule__CloseRecursion__Group__0__Impl"
    // InternalMyDsl.g:2459:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2463:1: ( ( 'loop' ) )
            // InternalMyDsl.g:2464:1: ( 'loop' )
            {
            // InternalMyDsl.g:2464:1: ( 'loop' )
            // InternalMyDsl.g:2465:2: 'loop'
            {
             before(grammarAccess.getCloseRecursionAccess().getLoopKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionAccess().getLoopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursion__Group__0__Impl"


    // $ANTLR start "rule__CloseRecursion__Group__1"
    // InternalMyDsl.g:2474:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2478:1: ( rule__CloseRecursion__Group__1__Impl )
            // InternalMyDsl.g:2479:2: rule__CloseRecursion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursion__Group__1"


    // $ANTLR start "rule__CloseRecursion__Group__1__Impl"
    // InternalMyDsl.g:2485:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:2490:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:2490:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:2491:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:2492:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:2492:3: rule__CloseRecursion__RecursionVariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursion__RecursionVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursion__Group__1__Impl"


    // $ANTLR start "rule__ForEach__Group__0"
    // InternalMyDsl.g:2501:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2505:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalMyDsl.g:2506:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ForEach__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__0"


    // $ANTLR start "rule__ForEach__Group__0__Impl"
    // InternalMyDsl.g:2513:1: rule__ForEach__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2517:1: ( ( 'for' ) )
            // InternalMyDsl.g:2518:1: ( 'for' )
            {
            // InternalMyDsl.g:2518:1: ( 'for' )
            // InternalMyDsl.g:2519:2: 'for'
            {
             before(grammarAccess.getForEachAccess().getForKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__0__Impl"


    // $ANTLR start "rule__ForEach__Group__1"
    // InternalMyDsl.g:2528:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2532:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalMyDsl.g:2533:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ForEach__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__1"


    // $ANTLR start "rule__ForEach__Group__1__Impl"
    // InternalMyDsl.g:2540:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__LoopRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2544:1: ( ( ( rule__ForEach__LoopRoleAssignment_1 ) ) )
            // InternalMyDsl.g:2545:1: ( ( rule__ForEach__LoopRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:2545:1: ( ( rule__ForEach__LoopRoleAssignment_1 ) )
            // InternalMyDsl.g:2546:2: ( rule__ForEach__LoopRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getLoopRoleAssignment_1()); 
            // InternalMyDsl.g:2547:2: ( rule__ForEach__LoopRoleAssignment_1 )
            // InternalMyDsl.g:2547:3: rule__ForEach__LoopRoleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__LoopRoleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getLoopRoleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__1__Impl"


    // $ANTLR start "rule__ForEach__Group__2"
    // InternalMyDsl.g:2555:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2559:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalMyDsl.g:2560:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ForEach__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__2"


    // $ANTLR start "rule__ForEach__Group__2__Impl"
    // InternalMyDsl.g:2567:1: rule__ForEach__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2571:1: ( ( ':' ) )
            // InternalMyDsl.g:2572:1: ( ':' )
            {
            // InternalMyDsl.g:2572:1: ( ':' )
            // InternalMyDsl.g:2573:2: ':'
            {
             before(grammarAccess.getForEachAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__2__Impl"


    // $ANTLR start "rule__ForEach__Group__3"
    // InternalMyDsl.g:2582:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2586:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalMyDsl.g:2587:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ForEach__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__3"


    // $ANTLR start "rule__ForEach__Group__3__Impl"
    // InternalMyDsl.g:2594:1: rule__ForEach__Group__3__Impl : ( '<' ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2598:1: ( ( '<' ) )
            // InternalMyDsl.g:2599:1: ( '<' )
            {
            // InternalMyDsl.g:2599:1: ( '<' )
            // InternalMyDsl.g:2600:2: '<'
            {
             before(grammarAccess.getForEachAccess().getLessThanSignKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getLessThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__3__Impl"


    // $ANTLR start "rule__ForEach__Group__4"
    // InternalMyDsl.g:2609:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2613:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalMyDsl.g:2614:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ForEach__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__4"


    // $ANTLR start "rule__ForEach__Group__4__Impl"
    // InternalMyDsl.g:2621:1: rule__ForEach__Group__4__Impl : ( ( rule__ForEach__RolesetAssignment_4 ) ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2625:1: ( ( ( rule__ForEach__RolesetAssignment_4 ) ) )
            // InternalMyDsl.g:2626:1: ( ( rule__ForEach__RolesetAssignment_4 ) )
            {
            // InternalMyDsl.g:2626:1: ( ( rule__ForEach__RolesetAssignment_4 ) )
            // InternalMyDsl.g:2627:2: ( rule__ForEach__RolesetAssignment_4 )
            {
             before(grammarAccess.getForEachAccess().getRolesetAssignment_4()); 
            // InternalMyDsl.g:2628:2: ( rule__ForEach__RolesetAssignment_4 )
            // InternalMyDsl.g:2628:3: rule__ForEach__RolesetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__RolesetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getRolesetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__4__Impl"


    // $ANTLR start "rule__ForEach__Group__5"
    // InternalMyDsl.g:2636:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2640:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalMyDsl.g:2641:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ForEach__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__5"


    // $ANTLR start "rule__ForEach__Group__5__Impl"
    // InternalMyDsl.g:2648:1: rule__ForEach__Group__5__Impl : ( ',' ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2652:1: ( ( ',' ) )
            // InternalMyDsl.g:2653:1: ( ',' )
            {
            // InternalMyDsl.g:2653:1: ( ',' )
            // InternalMyDsl.g:2654:2: ','
            {
             before(grammarAccess.getForEachAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__5__Impl"


    // $ANTLR start "rule__ForEach__Group__6"
    // InternalMyDsl.g:2663:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl rule__ForEach__Group__7 ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2667:1: ( rule__ForEach__Group__6__Impl rule__ForEach__Group__7 )
            // InternalMyDsl.g:2668:2: rule__ForEach__Group__6__Impl rule__ForEach__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__ForEach__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__6"


    // $ANTLR start "rule__ForEach__Group__6__Impl"
    // InternalMyDsl.g:2675:1: rule__ForEach__Group__6__Impl : ( ( rule__ForEach__RefRoleAssignment_6 ) ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2679:1: ( ( ( rule__ForEach__RefRoleAssignment_6 ) ) )
            // InternalMyDsl.g:2680:1: ( ( rule__ForEach__RefRoleAssignment_6 ) )
            {
            // InternalMyDsl.g:2680:1: ( ( rule__ForEach__RefRoleAssignment_6 ) )
            // InternalMyDsl.g:2681:2: ( rule__ForEach__RefRoleAssignment_6 )
            {
             before(grammarAccess.getForEachAccess().getRefRoleAssignment_6()); 
            // InternalMyDsl.g:2682:2: ( rule__ForEach__RefRoleAssignment_6 )
            // InternalMyDsl.g:2682:3: rule__ForEach__RefRoleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__RefRoleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getRefRoleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__6__Impl"


    // $ANTLR start "rule__ForEach__Group__7"
    // InternalMyDsl.g:2690:1: rule__ForEach__Group__7 : rule__ForEach__Group__7__Impl rule__ForEach__Group__8 ;
    public final void rule__ForEach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2694:1: ( rule__ForEach__Group__7__Impl rule__ForEach__Group__8 )
            // InternalMyDsl.g:2695:2: rule__ForEach__Group__7__Impl rule__ForEach__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__ForEach__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__7"


    // $ANTLR start "rule__ForEach__Group__7__Impl"
    // InternalMyDsl.g:2702:1: rule__ForEach__Group__7__Impl : ( '>' ) ;
    public final void rule__ForEach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2706:1: ( ( '>' ) )
            // InternalMyDsl.g:2707:1: ( '>' )
            {
            // InternalMyDsl.g:2707:1: ( '>' )
            // InternalMyDsl.g:2708:2: '>'
            {
             before(grammarAccess.getForEachAccess().getGreaterThanSignKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__7__Impl"


    // $ANTLR start "rule__ForEach__Group__8"
    // InternalMyDsl.g:2717:1: rule__ForEach__Group__8 : rule__ForEach__Group__8__Impl rule__ForEach__Group__9 ;
    public final void rule__ForEach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2721:1: ( rule__ForEach__Group__8__Impl rule__ForEach__Group__9 )
            // InternalMyDsl.g:2722:2: rule__ForEach__Group__8__Impl rule__ForEach__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__ForEach__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__8"


    // $ANTLR start "rule__ForEach__Group__8__Impl"
    // InternalMyDsl.g:2729:1: rule__ForEach__Group__8__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2733:1: ( ( '{' ) )
            // InternalMyDsl.g:2734:1: ( '{' )
            {
            // InternalMyDsl.g:2734:1: ( '{' )
            // InternalMyDsl.g:2735:2: '{'
            {
             before(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__8__Impl"


    // $ANTLR start "rule__ForEach__Group__9"
    // InternalMyDsl.g:2744:1: rule__ForEach__Group__9 : rule__ForEach__Group__9__Impl rule__ForEach__Group__10 ;
    public final void rule__ForEach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2748:1: ( rule__ForEach__Group__9__Impl rule__ForEach__Group__10 )
            // InternalMyDsl.g:2749:2: rule__ForEach__Group__9__Impl rule__ForEach__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__ForEach__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__9"


    // $ANTLR start "rule__ForEach__Group__9__Impl"
    // InternalMyDsl.g:2756:1: rule__ForEach__Group__9__Impl : ( ( rule__ForEach__ForBodyAssignment_9 ) ) ;
    public final void rule__ForEach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2760:1: ( ( ( rule__ForEach__ForBodyAssignment_9 ) ) )
            // InternalMyDsl.g:2761:1: ( ( rule__ForEach__ForBodyAssignment_9 ) )
            {
            // InternalMyDsl.g:2761:1: ( ( rule__ForEach__ForBodyAssignment_9 ) )
            // InternalMyDsl.g:2762:2: ( rule__ForEach__ForBodyAssignment_9 )
            {
             before(grammarAccess.getForEachAccess().getForBodyAssignment_9()); 
            // InternalMyDsl.g:2763:2: ( rule__ForEach__ForBodyAssignment_9 )
            // InternalMyDsl.g:2763:3: rule__ForEach__ForBodyAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__ForBodyAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getForBodyAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__9__Impl"


    // $ANTLR start "rule__ForEach__Group__10"
    // InternalMyDsl.g:2771:1: rule__ForEach__Group__10 : rule__ForEach__Group__10__Impl rule__ForEach__Group__11 ;
    public final void rule__ForEach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2775:1: ( rule__ForEach__Group__10__Impl rule__ForEach__Group__11 )
            // InternalMyDsl.g:2776:2: rule__ForEach__Group__10__Impl rule__ForEach__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__ForEach__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__10"


    // $ANTLR start "rule__ForEach__Group__10__Impl"
    // InternalMyDsl.g:2783:1: rule__ForEach__Group__10__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2787:1: ( ( '}' ) )
            // InternalMyDsl.g:2788:1: ( '}' )
            {
            // InternalMyDsl.g:2788:1: ( '}' )
            // InternalMyDsl.g:2789:2: '}'
            {
             before(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__10__Impl"


    // $ANTLR start "rule__ForEach__Group__11"
    // InternalMyDsl.g:2798:1: rule__ForEach__Group__11 : rule__ForEach__Group__11__Impl rule__ForEach__Group__12 ;
    public final void rule__ForEach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2802:1: ( rule__ForEach__Group__11__Impl rule__ForEach__Group__12 )
            // InternalMyDsl.g:2803:2: rule__ForEach__Group__11__Impl rule__ForEach__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__ForEach__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__11"


    // $ANTLR start "rule__ForEach__Group__11__Impl"
    // InternalMyDsl.g:2810:1: rule__ForEach__Group__11__Impl : ( ';' ) ;
    public final void rule__ForEach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2814:1: ( ( ';' ) )
            // InternalMyDsl.g:2815:1: ( ';' )
            {
            // InternalMyDsl.g:2815:1: ( ';' )
            // InternalMyDsl.g:2816:2: ';'
            {
             before(grammarAccess.getForEachAccess().getSemicolonKeyword_11()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getSemicolonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__11__Impl"


    // $ANTLR start "rule__ForEach__Group__12"
    // InternalMyDsl.g:2825:1: rule__ForEach__Group__12 : rule__ForEach__Group__12__Impl ;
    public final void rule__ForEach__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2829:1: ( rule__ForEach__Group__12__Impl )
            // InternalMyDsl.g:2830:2: rule__ForEach__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__12"


    // $ANTLR start "rule__ForEach__Group__12__Impl"
    // InternalMyDsl.g:2836:1: rule__ForEach__Group__12__Impl : ( ( rule__ForEach__ProtocolAssignment_12 ) ) ;
    public final void rule__ForEach__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2840:1: ( ( ( rule__ForEach__ProtocolAssignment_12 ) ) )
            // InternalMyDsl.g:2841:1: ( ( rule__ForEach__ProtocolAssignment_12 ) )
            {
            // InternalMyDsl.g:2841:1: ( ( rule__ForEach__ProtocolAssignment_12 ) )
            // InternalMyDsl.g:2842:2: ( rule__ForEach__ProtocolAssignment_12 )
            {
             before(grammarAccess.getForEachAccess().getProtocolAssignment_12()); 
            // InternalMyDsl.g:2843:2: ( rule__ForEach__ProtocolAssignment_12 )
            // InternalMyDsl.g:2843:3: rule__ForEach__ProtocolAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__ProtocolAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getProtocolAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__12__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // InternalMyDsl.g:2852:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2856:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:2857:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // InternalMyDsl.g:2864:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2868:1: ( ( 'choice' ) )
            // InternalMyDsl.g:2869:1: ( 'choice' )
            {
            // InternalMyDsl.g:2869:1: ( 'choice' )
            // InternalMyDsl.g:2870:2: 'choice'
            {
             before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // InternalMyDsl.g:2879:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2883:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:2884:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // InternalMyDsl.g:2891:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2895:1: ( ( 'at' ) )
            // InternalMyDsl.g:2896:1: ( 'at' )
            {
            // InternalMyDsl.g:2896:1: ( 'at' )
            // InternalMyDsl.g:2897:2: 'at'
            {
             before(grammarAccess.getChoiceAccess().getAtKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__2"
    // InternalMyDsl.g:2906:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2910:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:2911:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Choice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // InternalMyDsl.g:2918:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2922:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:2923:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:2923:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalMyDsl.g:2924:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:2925:2: ( rule__Choice__RoleAssignment_2 )
            // InternalMyDsl.g:2925:3: rule__Choice__RoleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Choice__RoleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Choice__Group__3"
    // InternalMyDsl.g:2933:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2937:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:2938:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Choice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__3"


    // $ANTLR start "rule__Choice__Group__3__Impl"
    // InternalMyDsl.g:2945:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2949:1: ( ( '{' ) )
            // InternalMyDsl.g:2950:1: ( '{' )
            {
            // InternalMyDsl.g:2950:1: ( '{' )
            // InternalMyDsl.g:2951:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__3__Impl"


    // $ANTLR start "rule__Choice__Group__4"
    // InternalMyDsl.g:2960:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2964:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:2965:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Choice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__4"


    // $ANTLR start "rule__Choice__Group__4__Impl"
    // InternalMyDsl.g:2972:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__BranchesAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2976:1: ( ( ( rule__Choice__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:2977:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:2977:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            // InternalMyDsl.g:2978:2: ( rule__Choice__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:2979:2: ( rule__Choice__BranchesAssignment_4 )
            // InternalMyDsl.g:2979:3: rule__Choice__BranchesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Choice__BranchesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBranchesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__4__Impl"


    // $ANTLR start "rule__Choice__Group__5"
    // InternalMyDsl.g:2987:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2991:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:2992:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Choice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__5"


    // $ANTLR start "rule__Choice__Group__5__Impl"
    // InternalMyDsl.g:2999:1: rule__Choice__Group__5__Impl : ( '}' ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3003:1: ( ( '}' ) )
            // InternalMyDsl.g:3004:1: ( '}' )
            {
            // InternalMyDsl.g:3004:1: ( '}' )
            // InternalMyDsl.g:3005:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__5__Impl"


    // $ANTLR start "rule__Choice__Group__6"
    // InternalMyDsl.g:3014:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3018:1: ( rule__Choice__Group__6__Impl )
            // InternalMyDsl.g:3019:2: rule__Choice__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__6"


    // $ANTLR start "rule__Choice__Group__6__Impl"
    // InternalMyDsl.g:3025:1: rule__Choice__Group__6__Impl : ( ( rule__Choice__Group_6__0 )* ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3029:1: ( ( ( rule__Choice__Group_6__0 )* ) )
            // InternalMyDsl.g:3030:1: ( ( rule__Choice__Group_6__0 )* )
            {
            // InternalMyDsl.g:3030:1: ( ( rule__Choice__Group_6__0 )* )
            // InternalMyDsl.g:3031:2: ( rule__Choice__Group_6__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_6()); 
            // InternalMyDsl.g:3032:2: ( rule__Choice__Group_6__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:3032:3: rule__Choice__Group_6__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Choice__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getChoiceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__6__Impl"


    // $ANTLR start "rule__Choice__Group_6__0"
    // InternalMyDsl.g:3041:1: rule__Choice__Group_6__0 : rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 ;
    public final void rule__Choice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3045:1: ( rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 )
            // InternalMyDsl.g:3046:2: rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1
            {
            pushFollow(FOLLOW_18);
            rule__Choice__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_6__0"


    // $ANTLR start "rule__Choice__Group_6__0__Impl"
    // InternalMyDsl.g:3053:1: rule__Choice__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3057:1: ( ( 'or' ) )
            // InternalMyDsl.g:3058:1: ( 'or' )
            {
            // InternalMyDsl.g:3058:1: ( 'or' )
            // InternalMyDsl.g:3059:2: 'or'
            {
             before(grammarAccess.getChoiceAccess().getOrKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getOrKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_6__0__Impl"


    // $ANTLR start "rule__Choice__Group_6__1"
    // InternalMyDsl.g:3068:1: rule__Choice__Group_6__1 : rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 ;
    public final void rule__Choice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3072:1: ( rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 )
            // InternalMyDsl.g:3073:2: rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2
            {
            pushFollow(FOLLOW_24);
            rule__Choice__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_6__1"


    // $ANTLR start "rule__Choice__Group_6__1__Impl"
    // InternalMyDsl.g:3080:1: rule__Choice__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3084:1: ( ( '{' ) )
            // InternalMyDsl.g:3085:1: ( '{' )
            {
            // InternalMyDsl.g:3085:1: ( '{' )
            // InternalMyDsl.g:3086:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_6__1__Impl"


    // $ANTLR start "rule__Choice__Group_6__2"
    // InternalMyDsl.g:3095:1: rule__Choice__Group_6__2 : rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 ;
    public final void rule__Choice__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3099:1: ( rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 )
            // InternalMyDsl.g:3100:2: rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__Choice__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_6__2"


    // $ANTLR start "rule__Choice__Group_6__2__Impl"
    // InternalMyDsl.g:3107:1: rule__Choice__Group_6__2__Impl : ( ( rule__Choice__BranchesAssignment_6_2 ) ) ;
    public final void rule__Choice__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3111:1: ( ( ( rule__Choice__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:3112:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:3112:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:3113:2: ( rule__Choice__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:3114:2: ( rule__Choice__BranchesAssignment_6_2 )
            // InternalMyDsl.g:3114:3: rule__Choice__BranchesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Choice__BranchesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBranchesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_6__2__Impl"


    // $ANTLR start "rule__Choice__Group_6__3"
    // InternalMyDsl.g:3122:1: rule__Choice__Group_6__3 : rule__Choice__Group_6__3__Impl ;
    public final void rule__Choice__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3126:1: ( rule__Choice__Group_6__3__Impl )
            // InternalMyDsl.g:3127:2: rule__Choice__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_6__3"


    // $ANTLR start "rule__Choice__Group_6__3__Impl"
    // InternalMyDsl.g:3133:1: rule__Choice__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Choice__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3137:1: ( ( '}' ) )
            // InternalMyDsl.g:3138:1: ( '}' )
            {
            // InternalMyDsl.g:3138:1: ( '}' )
            // InternalMyDsl.g:3139:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_6__3__Impl"


    // $ANTLR start "rule__MessageNormal__Group__0"
    // InternalMyDsl.g:3149:1: rule__MessageNormal__Group__0 : rule__MessageNormal__Group__0__Impl rule__MessageNormal__Group__1 ;
    public final void rule__MessageNormal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3153:1: ( rule__MessageNormal__Group__0__Impl rule__MessageNormal__Group__1 )
            // InternalMyDsl.g:3154:2: rule__MessageNormal__Group__0__Impl rule__MessageNormal__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__MessageNormal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__0"


    // $ANTLR start "rule__MessageNormal__Group__0__Impl"
    // InternalMyDsl.g:3161:1: rule__MessageNormal__Group__0__Impl : ( ( rule__MessageNormal__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageNormal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3165:1: ( ( ( rule__MessageNormal__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3166:1: ( ( rule__MessageNormal__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3166:1: ( ( rule__MessageNormal__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:3167:2: ( rule__MessageNormal__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageNormalAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:3168:2: ( rule__MessageNormal__MessageTypeAssignment_0 )
            // InternalMyDsl.g:3168:3: rule__MessageNormal__MessageTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormal__MessageTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalAccess().getMessageTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__0__Impl"


    // $ANTLR start "rule__MessageNormal__Group__1"
    // InternalMyDsl.g:3176:1: rule__MessageNormal__Group__1 : rule__MessageNormal__Group__1__Impl rule__MessageNormal__Group__2 ;
    public final void rule__MessageNormal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3180:1: ( rule__MessageNormal__Group__1__Impl rule__MessageNormal__Group__2 )
            // InternalMyDsl.g:3181:2: rule__MessageNormal__Group__1__Impl rule__MessageNormal__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__MessageNormal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__1"


    // $ANTLR start "rule__MessageNormal__Group__1__Impl"
    // InternalMyDsl.g:3188:1: rule__MessageNormal__Group__1__Impl : ( ( rule__MessageNormal__Alternatives_1 ) ) ;
    public final void rule__MessageNormal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3192:1: ( ( ( rule__MessageNormal__Alternatives_1 ) ) )
            // InternalMyDsl.g:3193:1: ( ( rule__MessageNormal__Alternatives_1 ) )
            {
            // InternalMyDsl.g:3193:1: ( ( rule__MessageNormal__Alternatives_1 ) )
            // InternalMyDsl.g:3194:2: ( rule__MessageNormal__Alternatives_1 )
            {
             before(grammarAccess.getMessageNormalAccess().getAlternatives_1()); 
            // InternalMyDsl.g:3195:2: ( rule__MessageNormal__Alternatives_1 )
            // InternalMyDsl.g:3195:3: rule__MessageNormal__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormal__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__1__Impl"


    // $ANTLR start "rule__MessageNormal__Group__2"
    // InternalMyDsl.g:3203:1: rule__MessageNormal__Group__2 : rule__MessageNormal__Group__2__Impl rule__MessageNormal__Group__3 ;
    public final void rule__MessageNormal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3207:1: ( rule__MessageNormal__Group__2__Impl rule__MessageNormal__Group__3 )
            // InternalMyDsl.g:3208:2: rule__MessageNormal__Group__2__Impl rule__MessageNormal__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MessageNormal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__2"


    // $ANTLR start "rule__MessageNormal__Group__2__Impl"
    // InternalMyDsl.g:3215:1: rule__MessageNormal__Group__2__Impl : ( 'from' ) ;
    public final void rule__MessageNormal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3219:1: ( ( 'from' ) )
            // InternalMyDsl.g:3220:1: ( 'from' )
            {
            // InternalMyDsl.g:3220:1: ( 'from' )
            // InternalMyDsl.g:3221:2: 'from'
            {
             before(grammarAccess.getMessageNormalAccess().getFromKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMessageNormalAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__2__Impl"


    // $ANTLR start "rule__MessageNormal__Group__3"
    // InternalMyDsl.g:3230:1: rule__MessageNormal__Group__3 : rule__MessageNormal__Group__3__Impl rule__MessageNormal__Group__4 ;
    public final void rule__MessageNormal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3234:1: ( rule__MessageNormal__Group__3__Impl rule__MessageNormal__Group__4 )
            // InternalMyDsl.g:3235:2: rule__MessageNormal__Group__3__Impl rule__MessageNormal__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__MessageNormal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__3"


    // $ANTLR start "rule__MessageNormal__Group__3__Impl"
    // InternalMyDsl.g:3242:1: rule__MessageNormal__Group__3__Impl : ( ( rule__MessageNormal__SenderAssignment_3 ) ) ;
    public final void rule__MessageNormal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3246:1: ( ( ( rule__MessageNormal__SenderAssignment_3 ) ) )
            // InternalMyDsl.g:3247:1: ( ( rule__MessageNormal__SenderAssignment_3 ) )
            {
            // InternalMyDsl.g:3247:1: ( ( rule__MessageNormal__SenderAssignment_3 ) )
            // InternalMyDsl.g:3248:2: ( rule__MessageNormal__SenderAssignment_3 )
            {
             before(grammarAccess.getMessageNormalAccess().getSenderAssignment_3()); 
            // InternalMyDsl.g:3249:2: ( rule__MessageNormal__SenderAssignment_3 )
            // InternalMyDsl.g:3249:3: rule__MessageNormal__SenderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormal__SenderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalAccess().getSenderAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__3__Impl"


    // $ANTLR start "rule__MessageNormal__Group__4"
    // InternalMyDsl.g:3257:1: rule__MessageNormal__Group__4 : rule__MessageNormal__Group__4__Impl rule__MessageNormal__Group__5 ;
    public final void rule__MessageNormal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3261:1: ( rule__MessageNormal__Group__4__Impl rule__MessageNormal__Group__5 )
            // InternalMyDsl.g:3262:2: rule__MessageNormal__Group__4__Impl rule__MessageNormal__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__MessageNormal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__4"


    // $ANTLR start "rule__MessageNormal__Group__4__Impl"
    // InternalMyDsl.g:3269:1: rule__MessageNormal__Group__4__Impl : ( 'to' ) ;
    public final void rule__MessageNormal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3273:1: ( ( 'to' ) )
            // InternalMyDsl.g:3274:1: ( 'to' )
            {
            // InternalMyDsl.g:3274:1: ( 'to' )
            // InternalMyDsl.g:3275:2: 'to'
            {
             before(grammarAccess.getMessageNormalAccess().getToKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMessageNormalAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__4__Impl"


    // $ANTLR start "rule__MessageNormal__Group__5"
    // InternalMyDsl.g:3284:1: rule__MessageNormal__Group__5 : rule__MessageNormal__Group__5__Impl rule__MessageNormal__Group__6 ;
    public final void rule__MessageNormal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3288:1: ( rule__MessageNormal__Group__5__Impl rule__MessageNormal__Group__6 )
            // InternalMyDsl.g:3289:2: rule__MessageNormal__Group__5__Impl rule__MessageNormal__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__MessageNormal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__5"


    // $ANTLR start "rule__MessageNormal__Group__5__Impl"
    // InternalMyDsl.g:3296:1: rule__MessageNormal__Group__5__Impl : ( ( rule__MessageNormal__ReceiverAssignment_5 ) ) ;
    public final void rule__MessageNormal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3300:1: ( ( ( rule__MessageNormal__ReceiverAssignment_5 ) ) )
            // InternalMyDsl.g:3301:1: ( ( rule__MessageNormal__ReceiverAssignment_5 ) )
            {
            // InternalMyDsl.g:3301:1: ( ( rule__MessageNormal__ReceiverAssignment_5 ) )
            // InternalMyDsl.g:3302:2: ( rule__MessageNormal__ReceiverAssignment_5 )
            {
             before(grammarAccess.getMessageNormalAccess().getReceiverAssignment_5()); 
            // InternalMyDsl.g:3303:2: ( rule__MessageNormal__ReceiverAssignment_5 )
            // InternalMyDsl.g:3303:3: rule__MessageNormal__ReceiverAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormal__ReceiverAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalAccess().getReceiverAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__5__Impl"


    // $ANTLR start "rule__MessageNormal__Group__6"
    // InternalMyDsl.g:3311:1: rule__MessageNormal__Group__6 : rule__MessageNormal__Group__6__Impl rule__MessageNormal__Group__7 ;
    public final void rule__MessageNormal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3315:1: ( rule__MessageNormal__Group__6__Impl rule__MessageNormal__Group__7 )
            // InternalMyDsl.g:3316:2: rule__MessageNormal__Group__6__Impl rule__MessageNormal__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__MessageNormal__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__6"


    // $ANTLR start "rule__MessageNormal__Group__6__Impl"
    // InternalMyDsl.g:3323:1: rule__MessageNormal__Group__6__Impl : ( '.' ) ;
    public final void rule__MessageNormal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3327:1: ( ( '.' ) )
            // InternalMyDsl.g:3328:1: ( '.' )
            {
            // InternalMyDsl.g:3328:1: ( '.' )
            // InternalMyDsl.g:3329:2: '.'
            {
             before(grammarAccess.getMessageNormalAccess().getFullStopKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMessageNormalAccess().getFullStopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__6__Impl"


    // $ANTLR start "rule__MessageNormal__Group__7"
    // InternalMyDsl.g:3338:1: rule__MessageNormal__Group__7 : rule__MessageNormal__Group__7__Impl ;
    public final void rule__MessageNormal__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3342:1: ( rule__MessageNormal__Group__7__Impl )
            // InternalMyDsl.g:3343:2: rule__MessageNormal__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__7"


    // $ANTLR start "rule__MessageNormal__Group__7__Impl"
    // InternalMyDsl.g:3349:1: rule__MessageNormal__Group__7__Impl : ( ( rule__MessageNormal__ProtocolAssignment_7 ) ) ;
    public final void rule__MessageNormal__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3353:1: ( ( ( rule__MessageNormal__ProtocolAssignment_7 ) ) )
            // InternalMyDsl.g:3354:1: ( ( rule__MessageNormal__ProtocolAssignment_7 ) )
            {
            // InternalMyDsl.g:3354:1: ( ( rule__MessageNormal__ProtocolAssignment_7 ) )
            // InternalMyDsl.g:3355:2: ( rule__MessageNormal__ProtocolAssignment_7 )
            {
             before(grammarAccess.getMessageNormalAccess().getProtocolAssignment_7()); 
            // InternalMyDsl.g:3356:2: ( rule__MessageNormal__ProtocolAssignment_7 )
            // InternalMyDsl.g:3356:3: rule__MessageNormal__ProtocolAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormal__ProtocolAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalAccess().getProtocolAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group__7__Impl"


    // $ANTLR start "rule__MessageNormal__Group_1_0__0"
    // InternalMyDsl.g:3365:1: rule__MessageNormal__Group_1_0__0 : rule__MessageNormal__Group_1_0__0__Impl rule__MessageNormal__Group_1_0__1 ;
    public final void rule__MessageNormal__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3369:1: ( rule__MessageNormal__Group_1_0__0__Impl rule__MessageNormal__Group_1_0__1 )
            // InternalMyDsl.g:3370:2: rule__MessageNormal__Group_1_0__0__Impl rule__MessageNormal__Group_1_0__1
            {
            pushFollow(FOLLOW_31);
            rule__MessageNormal__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group_1_0__0"


    // $ANTLR start "rule__MessageNormal__Group_1_0__0__Impl"
    // InternalMyDsl.g:3377:1: rule__MessageNormal__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__MessageNormal__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3381:1: ( ( '(' ) )
            // InternalMyDsl.g:3382:1: ( '(' )
            {
            // InternalMyDsl.g:3382:1: ( '(' )
            // InternalMyDsl.g:3383:2: '('
            {
             before(grammarAccess.getMessageNormalAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMessageNormalAccess().getLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group_1_0__0__Impl"


    // $ANTLR start "rule__MessageNormal__Group_1_0__1"
    // InternalMyDsl.g:3392:1: rule__MessageNormal__Group_1_0__1 : rule__MessageNormal__Group_1_0__1__Impl rule__MessageNormal__Group_1_0__2 ;
    public final void rule__MessageNormal__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3396:1: ( rule__MessageNormal__Group_1_0__1__Impl rule__MessageNormal__Group_1_0__2 )
            // InternalMyDsl.g:3397:2: rule__MessageNormal__Group_1_0__1__Impl rule__MessageNormal__Group_1_0__2
            {
            pushFollow(FOLLOW_31);
            rule__MessageNormal__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group_1_0__1"


    // $ANTLR start "rule__MessageNormal__Group_1_0__1__Impl"
    // InternalMyDsl.g:3404:1: rule__MessageNormal__Group_1_0__1__Impl : ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? ) ;
    public final void rule__MessageNormal__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3408:1: ( ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? ) )
            // InternalMyDsl.g:3409:1: ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? )
            {
            // InternalMyDsl.g:3409:1: ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? )
            // InternalMyDsl.g:3410:2: ( rule__MessageNormal__PayloadAssignment_1_0_1 )?
            {
             before(grammarAccess.getMessageNormalAccess().getPayloadAssignment_1_0_1()); 
            // InternalMyDsl.g:3411:2: ( rule__MessageNormal__PayloadAssignment_1_0_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=13 && LA19_0<=16)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:3411:3: rule__MessageNormal__PayloadAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageNormal__PayloadAssignment_1_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageNormalAccess().getPayloadAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group_1_0__1__Impl"


    // $ANTLR start "rule__MessageNormal__Group_1_0__2"
    // InternalMyDsl.g:3419:1: rule__MessageNormal__Group_1_0__2 : rule__MessageNormal__Group_1_0__2__Impl ;
    public final void rule__MessageNormal__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3423:1: ( rule__MessageNormal__Group_1_0__2__Impl )
            // InternalMyDsl.g:3424:2: rule__MessageNormal__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormal__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group_1_0__2"


    // $ANTLR start "rule__MessageNormal__Group_1_0__2__Impl"
    // InternalMyDsl.g:3430:1: rule__MessageNormal__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__MessageNormal__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3434:1: ( ( ')' ) )
            // InternalMyDsl.g:3435:1: ( ')' )
            {
            // InternalMyDsl.g:3435:1: ( ')' )
            // InternalMyDsl.g:3436:2: ')'
            {
             before(grammarAccess.getMessageNormalAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMessageNormalAccess().getRightParenthesisKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__Group_1_0__2__Impl"


    // $ANTLR start "rule__MessageQuit__Group__0"
    // InternalMyDsl.g:3446:1: rule__MessageQuit__Group__0 : rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1 ;
    public final void rule__MessageQuit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3450:1: ( rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1 )
            // InternalMyDsl.g:3451:2: rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__MessageQuit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageQuit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__0"


    // $ANTLR start "rule__MessageQuit__Group__0__Impl"
    // InternalMyDsl.g:3458:1: rule__MessageQuit__Group__0__Impl : ( ( rule__MessageQuit__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageQuit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3462:1: ( ( ( rule__MessageQuit__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3463:1: ( ( rule__MessageQuit__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3463:1: ( ( rule__MessageQuit__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:3464:2: ( rule__MessageQuit__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageQuitAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:3465:2: ( rule__MessageQuit__MessageTypeAssignment_0 )
            // InternalMyDsl.g:3465:3: rule__MessageQuit__MessageTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuit__MessageTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageQuitAccess().getMessageTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__0__Impl"


    // $ANTLR start "rule__MessageQuit__Group__1"
    // InternalMyDsl.g:3473:1: rule__MessageQuit__Group__1 : rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2 ;
    public final void rule__MessageQuit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3477:1: ( rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2 )
            // InternalMyDsl.g:3478:2: rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__MessageQuit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageQuit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__1"


    // $ANTLR start "rule__MessageQuit__Group__1__Impl"
    // InternalMyDsl.g:3485:1: rule__MessageQuit__Group__1__Impl : ( '()' ) ;
    public final void rule__MessageQuit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3489:1: ( ( '()' ) )
            // InternalMyDsl.g:3490:1: ( '()' )
            {
            // InternalMyDsl.g:3490:1: ( '()' )
            // InternalMyDsl.g:3491:2: '()'
            {
             before(grammarAccess.getMessageQuitAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMessageQuitAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__1__Impl"


    // $ANTLR start "rule__MessageQuit__Group__2"
    // InternalMyDsl.g:3500:1: rule__MessageQuit__Group__2 : rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3 ;
    public final void rule__MessageQuit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3504:1: ( rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3 )
            // InternalMyDsl.g:3505:2: rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MessageQuit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageQuit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__2"


    // $ANTLR start "rule__MessageQuit__Group__2__Impl"
    // InternalMyDsl.g:3512:1: rule__MessageQuit__Group__2__Impl : ( 'from' ) ;
    public final void rule__MessageQuit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3516:1: ( ( 'from' ) )
            // InternalMyDsl.g:3517:1: ( 'from' )
            {
            // InternalMyDsl.g:3517:1: ( 'from' )
            // InternalMyDsl.g:3518:2: 'from'
            {
             before(grammarAccess.getMessageQuitAccess().getFromKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMessageQuitAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__2__Impl"


    // $ANTLR start "rule__MessageQuit__Group__3"
    // InternalMyDsl.g:3527:1: rule__MessageQuit__Group__3 : rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4 ;
    public final void rule__MessageQuit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3531:1: ( rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4 )
            // InternalMyDsl.g:3532:2: rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__MessageQuit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageQuit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__3"


    // $ANTLR start "rule__MessageQuit__Group__3__Impl"
    // InternalMyDsl.g:3539:1: rule__MessageQuit__Group__3__Impl : ( ( rule__MessageQuit__SenderAssignment_3 ) ) ;
    public final void rule__MessageQuit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3543:1: ( ( ( rule__MessageQuit__SenderAssignment_3 ) ) )
            // InternalMyDsl.g:3544:1: ( ( rule__MessageQuit__SenderAssignment_3 ) )
            {
            // InternalMyDsl.g:3544:1: ( ( rule__MessageQuit__SenderAssignment_3 ) )
            // InternalMyDsl.g:3545:2: ( rule__MessageQuit__SenderAssignment_3 )
            {
             before(grammarAccess.getMessageQuitAccess().getSenderAssignment_3()); 
            // InternalMyDsl.g:3546:2: ( rule__MessageQuit__SenderAssignment_3 )
            // InternalMyDsl.g:3546:3: rule__MessageQuit__SenderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuit__SenderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageQuitAccess().getSenderAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__3__Impl"


    // $ANTLR start "rule__MessageQuit__Group__4"
    // InternalMyDsl.g:3554:1: rule__MessageQuit__Group__4 : rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5 ;
    public final void rule__MessageQuit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3558:1: ( rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5 )
            // InternalMyDsl.g:3559:2: rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__MessageQuit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageQuit__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__4"


    // $ANTLR start "rule__MessageQuit__Group__4__Impl"
    // InternalMyDsl.g:3566:1: rule__MessageQuit__Group__4__Impl : ( 'to' ) ;
    public final void rule__MessageQuit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3570:1: ( ( 'to' ) )
            // InternalMyDsl.g:3571:1: ( 'to' )
            {
            // InternalMyDsl.g:3571:1: ( 'to' )
            // InternalMyDsl.g:3572:2: 'to'
            {
             before(grammarAccess.getMessageQuitAccess().getToKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMessageQuitAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__4__Impl"


    // $ANTLR start "rule__MessageQuit__Group__5"
    // InternalMyDsl.g:3581:1: rule__MessageQuit__Group__5 : rule__MessageQuit__Group__5__Impl ;
    public final void rule__MessageQuit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3585:1: ( rule__MessageQuit__Group__5__Impl )
            // InternalMyDsl.g:3586:2: rule__MessageQuit__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuit__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__5"


    // $ANTLR start "rule__MessageQuit__Group__5__Impl"
    // InternalMyDsl.g:3592:1: rule__MessageQuit__Group__5__Impl : ( ( rule__MessageQuit__ReceiverAssignment_5 ) ) ;
    public final void rule__MessageQuit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3596:1: ( ( ( rule__MessageQuit__ReceiverAssignment_5 ) ) )
            // InternalMyDsl.g:3597:1: ( ( rule__MessageQuit__ReceiverAssignment_5 ) )
            {
            // InternalMyDsl.g:3597:1: ( ( rule__MessageQuit__ReceiverAssignment_5 ) )
            // InternalMyDsl.g:3598:2: ( rule__MessageQuit__ReceiverAssignment_5 )
            {
             before(grammarAccess.getMessageQuitAccess().getReceiverAssignment_5()); 
            // InternalMyDsl.g:3599:2: ( rule__MessageQuit__ReceiverAssignment_5 )
            // InternalMyDsl.g:3599:3: rule__MessageQuit__ReceiverAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuit__ReceiverAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMessageQuitAccess().getReceiverAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__5__Impl"


    // $ANTLR start "rule__Payload__Group__0"
    // InternalMyDsl.g:3608:1: rule__Payload__Group__0 : rule__Payload__Group__0__Impl rule__Payload__Group__1 ;
    public final void rule__Payload__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3612:1: ( rule__Payload__Group__0__Impl rule__Payload__Group__1 )
            // InternalMyDsl.g:3613:2: rule__Payload__Group__0__Impl rule__Payload__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Payload__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Payload__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group__0"


    // $ANTLR start "rule__Payload__Group__0__Impl"
    // InternalMyDsl.g:3620:1: rule__Payload__Group__0__Impl : ( ( rule__Payload__TypesAssignment_0 ) ) ;
    public final void rule__Payload__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3624:1: ( ( ( rule__Payload__TypesAssignment_0 ) ) )
            // InternalMyDsl.g:3625:1: ( ( rule__Payload__TypesAssignment_0 ) )
            {
            // InternalMyDsl.g:3625:1: ( ( rule__Payload__TypesAssignment_0 ) )
            // InternalMyDsl.g:3626:2: ( rule__Payload__TypesAssignment_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0()); 
            // InternalMyDsl.g:3627:2: ( rule__Payload__TypesAssignment_0 )
            // InternalMyDsl.g:3627:3: rule__Payload__TypesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Payload__TypesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getTypesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group__0__Impl"


    // $ANTLR start "rule__Payload__Group__1"
    // InternalMyDsl.g:3635:1: rule__Payload__Group__1 : rule__Payload__Group__1__Impl ;
    public final void rule__Payload__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3639:1: ( rule__Payload__Group__1__Impl )
            // InternalMyDsl.g:3640:2: rule__Payload__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group__1"


    // $ANTLR start "rule__Payload__Group__1__Impl"
    // InternalMyDsl.g:3646:1: rule__Payload__Group__1__Impl : ( ( rule__Payload__Group_1__0 )* ) ;
    public final void rule__Payload__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3650:1: ( ( ( rule__Payload__Group_1__0 )* ) )
            // InternalMyDsl.g:3651:1: ( ( rule__Payload__Group_1__0 )* )
            {
            // InternalMyDsl.g:3651:1: ( ( rule__Payload__Group_1__0 )* )
            // InternalMyDsl.g:3652:2: ( rule__Payload__Group_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_1()); 
            // InternalMyDsl.g:3653:2: ( rule__Payload__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:3653:3: rule__Payload__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Payload__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPayloadAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group__1__Impl"


    // $ANTLR start "rule__Payload__Group_1__0"
    // InternalMyDsl.g:3662:1: rule__Payload__Group_1__0 : rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 ;
    public final void rule__Payload__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3666:1: ( rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 )
            // InternalMyDsl.g:3667:2: rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Payload__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Payload__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_1__0"


    // $ANTLR start "rule__Payload__Group_1__0__Impl"
    // InternalMyDsl.g:3674:1: rule__Payload__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3678:1: ( ( ',' ) )
            // InternalMyDsl.g:3679:1: ( ',' )
            {
            // InternalMyDsl.g:3679:1: ( ',' )
            // InternalMyDsl.g:3680:2: ','
            {
             before(grammarAccess.getPayloadAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPayloadAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_1__0__Impl"


    // $ANTLR start "rule__Payload__Group_1__1"
    // InternalMyDsl.g:3689:1: rule__Payload__Group_1__1 : rule__Payload__Group_1__1__Impl ;
    public final void rule__Payload__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3693:1: ( rule__Payload__Group_1__1__Impl )
            // InternalMyDsl.g:3694:2: rule__Payload__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_1__1"


    // $ANTLR start "rule__Payload__Group_1__1__Impl"
    // InternalMyDsl.g:3700:1: rule__Payload__Group_1__1__Impl : ( ( rule__Payload__TypesAssignment_1_1 ) ) ;
    public final void rule__Payload__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3704:1: ( ( ( rule__Payload__TypesAssignment_1_1 ) ) )
            // InternalMyDsl.g:3705:1: ( ( rule__Payload__TypesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:3705:1: ( ( rule__Payload__TypesAssignment_1_1 ) )
            // InternalMyDsl.g:3706:2: ( rule__Payload__TypesAssignment_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_1_1()); 
            // InternalMyDsl.g:3707:2: ( rule__Payload__TypesAssignment_1_1 )
            // InternalMyDsl.g:3707:3: rule__Payload__TypesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Payload__TypesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getTypesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_1__1__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__0"
    // InternalMyDsl.g:3716:1: rule__LocalProtocol__Group__0 : rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 ;
    public final void rule__LocalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3720:1: ( rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 )
            // InternalMyDsl.g:3721:2: rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__LocalProtocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__0"


    // $ANTLR start "rule__LocalProtocol__Group__0__Impl"
    // InternalMyDsl.g:3728:1: rule__LocalProtocol__Group__0__Impl : ( 'local' ) ;
    public final void rule__LocalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3732:1: ( ( 'local' ) )
            // InternalMyDsl.g:3733:1: ( 'local' )
            {
            // InternalMyDsl.g:3733:1: ( 'local' )
            // InternalMyDsl.g:3734:2: 'local'
            {
             before(grammarAccess.getLocalProtocolAccess().getLocalKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getLocalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__0__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__1"
    // InternalMyDsl.g:3743:1: rule__LocalProtocol__Group__1 : rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 ;
    public final void rule__LocalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3747:1: ( rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 )
            // InternalMyDsl.g:3748:2: rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__LocalProtocol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__1"


    // $ANTLR start "rule__LocalProtocol__Group__1__Impl"
    // InternalMyDsl.g:3755:1: rule__LocalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__LocalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3759:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:3760:1: ( 'protocol' )
            {
            // InternalMyDsl.g:3760:1: ( 'protocol' )
            // InternalMyDsl.g:3761:2: 'protocol'
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__1__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__2"
    // InternalMyDsl.g:3770:1: rule__LocalProtocol__Group__2 : rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 ;
    public final void rule__LocalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3774:1: ( rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 )
            // InternalMyDsl.g:3775:2: rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__LocalProtocol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__2"


    // $ANTLR start "rule__LocalProtocol__Group__2__Impl"
    // InternalMyDsl.g:3782:1: rule__LocalProtocol__Group__2__Impl : ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__LocalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3786:1: ( ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:3787:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:3787:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:3788:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:3789:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:3789:3: rule__LocalProtocol__ProtocolNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__ProtocolNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalProtocolAccess().getProtocolNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__2__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__3"
    // InternalMyDsl.g:3797:1: rule__LocalProtocol__Group__3 : rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 ;
    public final void rule__LocalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3801:1: ( rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 )
            // InternalMyDsl.g:3802:2: rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__LocalProtocol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__3"


    // $ANTLR start "rule__LocalProtocol__Group__3__Impl"
    // InternalMyDsl.g:3809:1: rule__LocalProtocol__Group__3__Impl : ( 'at' ) ;
    public final void rule__LocalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3813:1: ( ( 'at' ) )
            // InternalMyDsl.g:3814:1: ( 'at' )
            {
            // InternalMyDsl.g:3814:1: ( 'at' )
            // InternalMyDsl.g:3815:2: 'at'
            {
             before(grammarAccess.getLocalProtocolAccess().getAtKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getAtKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__3__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__4"
    // InternalMyDsl.g:3824:1: rule__LocalProtocol__Group__4 : rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 ;
    public final void rule__LocalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3828:1: ( rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 )
            // InternalMyDsl.g:3829:2: rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__LocalProtocol__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__4"


    // $ANTLR start "rule__LocalProtocol__Group__4__Impl"
    // InternalMyDsl.g:3836:1: rule__LocalProtocol__Group__4__Impl : ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) ;
    public final void rule__LocalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3840:1: ( ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) )
            // InternalMyDsl.g:3841:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            {
            // InternalMyDsl.g:3841:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            // InternalMyDsl.g:3842:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_4()); 
            // InternalMyDsl.g:3843:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            // InternalMyDsl.g:3843:3: rule__LocalProtocol__ProjectedRoleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__ProjectedRoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__4__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__5"
    // InternalMyDsl.g:3851:1: rule__LocalProtocol__Group__5 : rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 ;
    public final void rule__LocalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3855:1: ( rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 )
            // InternalMyDsl.g:3856:2: rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__LocalProtocol__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__5"


    // $ANTLR start "rule__LocalProtocol__Group__5__Impl"
    // InternalMyDsl.g:3863:1: rule__LocalProtocol__Group__5__Impl : ( '(' ) ;
    public final void rule__LocalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3867:1: ( ( '(' ) )
            // InternalMyDsl.g:3868:1: ( '(' )
            {
            // InternalMyDsl.g:3868:1: ( '(' )
            // InternalMyDsl.g:3869:2: '('
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__5__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__6"
    // InternalMyDsl.g:3878:1: rule__LocalProtocol__Group__6 : rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 ;
    public final void rule__LocalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3882:1: ( rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 )
            // InternalMyDsl.g:3883:2: rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__LocalProtocol__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__6"


    // $ANTLR start "rule__LocalProtocol__Group__6__Impl"
    // InternalMyDsl.g:3890:1: rule__LocalProtocol__Group__6__Impl : ( ( rule__LocalProtocol__RolesAssignment_6 ) ) ;
    public final void rule__LocalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3894:1: ( ( ( rule__LocalProtocol__RolesAssignment_6 ) ) )
            // InternalMyDsl.g:3895:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            {
            // InternalMyDsl.g:3895:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            // InternalMyDsl.g:3896:2: ( rule__LocalProtocol__RolesAssignment_6 )
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesAssignment_6()); 
            // InternalMyDsl.g:3897:2: ( rule__LocalProtocol__RolesAssignment_6 )
            // InternalMyDsl.g:3897:3: rule__LocalProtocol__RolesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__RolesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLocalProtocolAccess().getRolesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__6__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__7"
    // InternalMyDsl.g:3905:1: rule__LocalProtocol__Group__7 : rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 ;
    public final void rule__LocalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3909:1: ( rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 )
            // InternalMyDsl.g:3910:2: rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__LocalProtocol__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__7"


    // $ANTLR start "rule__LocalProtocol__Group__7__Impl"
    // InternalMyDsl.g:3917:1: rule__LocalProtocol__Group__7__Impl : ( ( rule__LocalProtocol__Alternatives_7 ) ) ;
    public final void rule__LocalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3921:1: ( ( ( rule__LocalProtocol__Alternatives_7 ) ) )
            // InternalMyDsl.g:3922:1: ( ( rule__LocalProtocol__Alternatives_7 ) )
            {
            // InternalMyDsl.g:3922:1: ( ( rule__LocalProtocol__Alternatives_7 ) )
            // InternalMyDsl.g:3923:2: ( rule__LocalProtocol__Alternatives_7 )
            {
             before(grammarAccess.getLocalProtocolAccess().getAlternatives_7()); 
            // InternalMyDsl.g:3924:2: ( rule__LocalProtocol__Alternatives_7 )
            // InternalMyDsl.g:3924:3: rule__LocalProtocol__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getLocalProtocolAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__7__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__8"
    // InternalMyDsl.g:3932:1: rule__LocalProtocol__Group__8 : rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 ;
    public final void rule__LocalProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3936:1: ( rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 )
            // InternalMyDsl.g:3937:2: rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__LocalProtocol__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__8"


    // $ANTLR start "rule__LocalProtocol__Group__8__Impl"
    // InternalMyDsl.g:3944:1: rule__LocalProtocol__Group__8__Impl : ( ( rule__LocalProtocol__ProtocolAssignment_8 ) ) ;
    public final void rule__LocalProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3948:1: ( ( ( rule__LocalProtocol__ProtocolAssignment_8 ) ) )
            // InternalMyDsl.g:3949:1: ( ( rule__LocalProtocol__ProtocolAssignment_8 ) )
            {
            // InternalMyDsl.g:3949:1: ( ( rule__LocalProtocol__ProtocolAssignment_8 ) )
            // InternalMyDsl.g:3950:2: ( rule__LocalProtocol__ProtocolAssignment_8 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_8()); 
            // InternalMyDsl.g:3951:2: ( rule__LocalProtocol__ProtocolAssignment_8 )
            // InternalMyDsl.g:3951:3: rule__LocalProtocol__ProtocolAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__ProtocolAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__8__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__9"
    // InternalMyDsl.g:3959:1: rule__LocalProtocol__Group__9 : rule__LocalProtocol__Group__9__Impl ;
    public final void rule__LocalProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3963:1: ( rule__LocalProtocol__Group__9__Impl )
            // InternalMyDsl.g:3964:2: rule__LocalProtocol__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__9"


    // $ANTLR start "rule__LocalProtocol__Group__9__Impl"
    // InternalMyDsl.g:3970:1: rule__LocalProtocol__Group__9__Impl : ( '}' ) ;
    public final void rule__LocalProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3974:1: ( ( '}' ) )
            // InternalMyDsl.g:3975:1: ( '}' )
            {
            // InternalMyDsl.g:3975:1: ( '}' )
            // InternalMyDsl.g:3976:2: '}'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__9__Impl"


    // $ANTLR start "rule__LocalProtocol__Group_7_1__0"
    // InternalMyDsl.g:3986:1: rule__LocalProtocol__Group_7_1__0 : rule__LocalProtocol__Group_7_1__0__Impl rule__LocalProtocol__Group_7_1__1 ;
    public final void rule__LocalProtocol__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3990:1: ( rule__LocalProtocol__Group_7_1__0__Impl rule__LocalProtocol__Group_7_1__1 )
            // InternalMyDsl.g:3991:2: rule__LocalProtocol__Group_7_1__0__Impl rule__LocalProtocol__Group_7_1__1
            {
            pushFollow(FOLLOW_18);
            rule__LocalProtocol__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group_7_1__0"


    // $ANTLR start "rule__LocalProtocol__Group_7_1__0__Impl"
    // InternalMyDsl.g:3998:1: rule__LocalProtocol__Group_7_1__0__Impl : ( ')' ) ;
    public final void rule__LocalProtocol__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4002:1: ( ( ')' ) )
            // InternalMyDsl.g:4003:1: ( ')' )
            {
            // InternalMyDsl.g:4003:1: ( ')' )
            // InternalMyDsl.g:4004:2: ')'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group_7_1__0__Impl"


    // $ANTLR start "rule__LocalProtocol__Group_7_1__1"
    // InternalMyDsl.g:4013:1: rule__LocalProtocol__Group_7_1__1 : rule__LocalProtocol__Group_7_1__1__Impl ;
    public final void rule__LocalProtocol__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4017:1: ( rule__LocalProtocol__Group_7_1__1__Impl )
            // InternalMyDsl.g:4018:2: rule__LocalProtocol__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group_7_1__1"


    // $ANTLR start "rule__LocalProtocol__Group_7_1__1__Impl"
    // InternalMyDsl.g:4024:1: rule__LocalProtocol__Group_7_1__1__Impl : ( '{' ) ;
    public final void rule__LocalProtocol__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4028:1: ( ( '{' ) )
            // InternalMyDsl.g:4029:1: ( '{' )
            {
            // InternalMyDsl.g:4029:1: ( '{' )
            // InternalMyDsl.g:4030:2: '{'
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_7_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group_7_1__1__Impl"


    // $ANTLR start "rule__RecursionL__Group__0"
    // InternalMyDsl.g:4040:1: rule__RecursionL__Group__0 : rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 ;
    public final void rule__RecursionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4044:1: ( rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 )
            // InternalMyDsl.g:4045:2: rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RecursionL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecursionL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__0"


    // $ANTLR start "rule__RecursionL__Group__0__Impl"
    // InternalMyDsl.g:4052:1: rule__RecursionL__Group__0__Impl : ( 'rec' ) ;
    public final void rule__RecursionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4056:1: ( ( 'rec' ) )
            // InternalMyDsl.g:4057:1: ( 'rec' )
            {
            // InternalMyDsl.g:4057:1: ( 'rec' )
            // InternalMyDsl.g:4058:2: 'rec'
            {
             before(grammarAccess.getRecursionLAccess().getRecKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecursionLAccess().getRecKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__0__Impl"


    // $ANTLR start "rule__RecursionL__Group__1"
    // InternalMyDsl.g:4067:1: rule__RecursionL__Group__1 : rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 ;
    public final void rule__RecursionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4071:1: ( rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 )
            // InternalMyDsl.g:4072:2: rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RecursionL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecursionL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__1"


    // $ANTLR start "rule__RecursionL__Group__1__Impl"
    // InternalMyDsl.g:4079:1: rule__RecursionL__Group__1__Impl : ( ( rule__RecursionL__NameAssignment_1 ) ) ;
    public final void rule__RecursionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4083:1: ( ( ( rule__RecursionL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4084:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4084:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            // InternalMyDsl.g:4085:2: ( rule__RecursionL__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4086:2: ( rule__RecursionL__NameAssignment_1 )
            // InternalMyDsl.g:4086:3: rule__RecursionL__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RecursionL__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecursionLAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__1__Impl"


    // $ANTLR start "rule__RecursionL__Group__2"
    // InternalMyDsl.g:4094:1: rule__RecursionL__Group__2 : rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3 ;
    public final void rule__RecursionL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4098:1: ( rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3 )
            // InternalMyDsl.g:4099:2: rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__RecursionL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecursionL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__2"


    // $ANTLR start "rule__RecursionL__Group__2__Impl"
    // InternalMyDsl.g:4106:1: rule__RecursionL__Group__2__Impl : ( ':' ) ;
    public final void rule__RecursionL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4110:1: ( ( ':' ) )
            // InternalMyDsl.g:4111:1: ( ':' )
            {
            // InternalMyDsl.g:4111:1: ( ':' )
            // InternalMyDsl.g:4112:2: ':'
            {
             before(grammarAccess.getRecursionLAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRecursionLAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__2__Impl"


    // $ANTLR start "rule__RecursionL__Group__3"
    // InternalMyDsl.g:4121:1: rule__RecursionL__Group__3 : rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4 ;
    public final void rule__RecursionL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4125:1: ( rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4 )
            // InternalMyDsl.g:4126:2: rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__RecursionL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecursionL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__3"


    // $ANTLR start "rule__RecursionL__Group__3__Impl"
    // InternalMyDsl.g:4133:1: rule__RecursionL__Group__3__Impl : ( '{' ) ;
    public final void rule__RecursionL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4137:1: ( ( '{' ) )
            // InternalMyDsl.g:4138:1: ( '{' )
            {
            // InternalMyDsl.g:4138:1: ( '{' )
            // InternalMyDsl.g:4139:2: '{'
            {
             before(grammarAccess.getRecursionLAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRecursionLAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__3__Impl"


    // $ANTLR start "rule__RecursionL__Group__4"
    // InternalMyDsl.g:4148:1: rule__RecursionL__Group__4 : rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5 ;
    public final void rule__RecursionL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4152:1: ( rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5 )
            // InternalMyDsl.g:4153:2: rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__RecursionL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecursionL__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__4"


    // $ANTLR start "rule__RecursionL__Group__4__Impl"
    // InternalMyDsl.g:4160:1: rule__RecursionL__Group__4__Impl : ( ( rule__RecursionL__RecProtocolAssignment_4 ) ) ;
    public final void rule__RecursionL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4164:1: ( ( ( rule__RecursionL__RecProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:4165:1: ( ( rule__RecursionL__RecProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:4165:1: ( ( rule__RecursionL__RecProtocolAssignment_4 ) )
            // InternalMyDsl.g:4166:2: ( rule__RecursionL__RecProtocolAssignment_4 )
            {
             before(grammarAccess.getRecursionLAccess().getRecProtocolAssignment_4()); 
            // InternalMyDsl.g:4167:2: ( rule__RecursionL__RecProtocolAssignment_4 )
            // InternalMyDsl.g:4167:3: rule__RecursionL__RecProtocolAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RecursionL__RecProtocolAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRecursionLAccess().getRecProtocolAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__4__Impl"


    // $ANTLR start "rule__RecursionL__Group__5"
    // InternalMyDsl.g:4175:1: rule__RecursionL__Group__5 : rule__RecursionL__Group__5__Impl ;
    public final void rule__RecursionL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4179:1: ( rule__RecursionL__Group__5__Impl )
            // InternalMyDsl.g:4180:2: rule__RecursionL__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecursionL__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__5"


    // $ANTLR start "rule__RecursionL__Group__5__Impl"
    // InternalMyDsl.g:4186:1: rule__RecursionL__Group__5__Impl : ( '}' ) ;
    public final void rule__RecursionL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4190:1: ( ( '}' ) )
            // InternalMyDsl.g:4191:1: ( '}' )
            {
            // InternalMyDsl.g:4191:1: ( '}' )
            // InternalMyDsl.g:4192:2: '}'
            {
             before(grammarAccess.getRecursionLAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRecursionLAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__Group__5__Impl"


    // $ANTLR start "rule__CloseRecursionL__Group__0"
    // InternalMyDsl.g:4202:1: rule__CloseRecursionL__Group__0 : rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1 ;
    public final void rule__CloseRecursionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4206:1: ( rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1 )
            // InternalMyDsl.g:4207:2: rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CloseRecursionL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CloseRecursionL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursionL__Group__0"


    // $ANTLR start "rule__CloseRecursionL__Group__0__Impl"
    // InternalMyDsl.g:4214:1: rule__CloseRecursionL__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4218:1: ( ( 'loop' ) )
            // InternalMyDsl.g:4219:1: ( 'loop' )
            {
            // InternalMyDsl.g:4219:1: ( 'loop' )
            // InternalMyDsl.g:4220:2: 'loop'
            {
             before(grammarAccess.getCloseRecursionLAccess().getLoopKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionLAccess().getLoopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursionL__Group__0__Impl"


    // $ANTLR start "rule__CloseRecursionL__Group__1"
    // InternalMyDsl.g:4229:1: rule__CloseRecursionL__Group__1 : rule__CloseRecursionL__Group__1__Impl ;
    public final void rule__CloseRecursionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4233:1: ( rule__CloseRecursionL__Group__1__Impl )
            // InternalMyDsl.g:4234:2: rule__CloseRecursionL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursionL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursionL__Group__1"


    // $ANTLR start "rule__CloseRecursionL__Group__1__Impl"
    // InternalMyDsl.g:4240:1: rule__CloseRecursionL__Group__1__Impl : ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4244:1: ( ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:4245:1: ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:4245:1: ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:4246:2: ( rule__CloseRecursionL__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionLAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:4247:2: ( rule__CloseRecursionL__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:4247:3: rule__CloseRecursionL__RecursionVariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursionL__RecursionVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCloseRecursionLAccess().getRecursionVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursionL__Group__1__Impl"


    // $ANTLR start "rule__MessageNormalL__Group__0"
    // InternalMyDsl.g:4256:1: rule__MessageNormalL__Group__0 : rule__MessageNormalL__Group__0__Impl rule__MessageNormalL__Group__1 ;
    public final void rule__MessageNormalL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4260:1: ( rule__MessageNormalL__Group__0__Impl rule__MessageNormalL__Group__1 )
            // InternalMyDsl.g:4261:2: rule__MessageNormalL__Group__0__Impl rule__MessageNormalL__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__MessageNormalL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormalL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group__0"


    // $ANTLR start "rule__MessageNormalL__Group__0__Impl"
    // InternalMyDsl.g:4268:1: rule__MessageNormalL__Group__0__Impl : ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageNormalL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4272:1: ( ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:4273:1: ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:4273:1: ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:4274:2: ( rule__MessageNormalL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageNormalLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:4275:2: ( rule__MessageNormalL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:4275:3: rule__MessageNormalL__MessageTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormalL__MessageTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalLAccess().getMessageTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group__0__Impl"


    // $ANTLR start "rule__MessageNormalL__Group__1"
    // InternalMyDsl.g:4283:1: rule__MessageNormalL__Group__1 : rule__MessageNormalL__Group__1__Impl rule__MessageNormalL__Group__2 ;
    public final void rule__MessageNormalL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4287:1: ( rule__MessageNormalL__Group__1__Impl rule__MessageNormalL__Group__2 )
            // InternalMyDsl.g:4288:2: rule__MessageNormalL__Group__1__Impl rule__MessageNormalL__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__MessageNormalL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormalL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group__1"


    // $ANTLR start "rule__MessageNormalL__Group__1__Impl"
    // InternalMyDsl.g:4295:1: rule__MessageNormalL__Group__1__Impl : ( ( rule__MessageNormalL__Alternatives_1 ) ) ;
    public final void rule__MessageNormalL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4299:1: ( ( ( rule__MessageNormalL__Alternatives_1 ) ) )
            // InternalMyDsl.g:4300:1: ( ( rule__MessageNormalL__Alternatives_1 ) )
            {
            // InternalMyDsl.g:4300:1: ( ( rule__MessageNormalL__Alternatives_1 ) )
            // InternalMyDsl.g:4301:2: ( rule__MessageNormalL__Alternatives_1 )
            {
             before(grammarAccess.getMessageNormalLAccess().getAlternatives_1()); 
            // InternalMyDsl.g:4302:2: ( rule__MessageNormalL__Alternatives_1 )
            // InternalMyDsl.g:4302:3: rule__MessageNormalL__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormalL__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalLAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group__1__Impl"


    // $ANTLR start "rule__MessageNormalL__Group__2"
    // InternalMyDsl.g:4310:1: rule__MessageNormalL__Group__2 : rule__MessageNormalL__Group__2__Impl rule__MessageNormalL__Group__3 ;
    public final void rule__MessageNormalL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4314:1: ( rule__MessageNormalL__Group__2__Impl rule__MessageNormalL__Group__3 )
            // InternalMyDsl.g:4315:2: rule__MessageNormalL__Group__2__Impl rule__MessageNormalL__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__MessageNormalL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormalL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group__2"


    // $ANTLR start "rule__MessageNormalL__Group__2__Impl"
    // InternalMyDsl.g:4322:1: rule__MessageNormalL__Group__2__Impl : ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) ) ;
    public final void rule__MessageNormalL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4326:1: ( ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) ) )
            // InternalMyDsl.g:4327:1: ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) )
            {
            // InternalMyDsl.g:4327:1: ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) )
            // InternalMyDsl.g:4328:2: ( rule__MessageNormalL__SendReceiveAssignment_2 )
            {
             before(grammarAccess.getMessageNormalLAccess().getSendReceiveAssignment_2()); 
            // InternalMyDsl.g:4329:2: ( rule__MessageNormalL__SendReceiveAssignment_2 )
            // InternalMyDsl.g:4329:3: rule__MessageNormalL__SendReceiveAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormalL__SendReceiveAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalLAccess().getSendReceiveAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group__2__Impl"


    // $ANTLR start "rule__MessageNormalL__Group__3"
    // InternalMyDsl.g:4337:1: rule__MessageNormalL__Group__3 : rule__MessageNormalL__Group__3__Impl rule__MessageNormalL__Group__4 ;
    public final void rule__MessageNormalL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4341:1: ( rule__MessageNormalL__Group__3__Impl rule__MessageNormalL__Group__4 )
            // InternalMyDsl.g:4342:2: rule__MessageNormalL__Group__3__Impl rule__MessageNormalL__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__MessageNormalL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormalL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group__3"


    // $ANTLR start "rule__MessageNormalL__Group__3__Impl"
    // InternalMyDsl.g:4349:1: rule__MessageNormalL__Group__3__Impl : ( '.' ) ;
    public final void rule__MessageNormalL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4353:1: ( ( '.' ) )
            // InternalMyDsl.g:4354:1: ( '.' )
            {
            // InternalMyDsl.g:4354:1: ( '.' )
            // InternalMyDsl.g:4355:2: '.'
            {
             before(grammarAccess.getMessageNormalLAccess().getFullStopKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMessageNormalLAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group__3__Impl"


    // $ANTLR start "rule__MessageNormalL__Group__4"
    // InternalMyDsl.g:4364:1: rule__MessageNormalL__Group__4 : rule__MessageNormalL__Group__4__Impl ;
    public final void rule__MessageNormalL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4368:1: ( rule__MessageNormalL__Group__4__Impl )
            // InternalMyDsl.g:4369:2: rule__MessageNormalL__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormalL__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group__4"


    // $ANTLR start "rule__MessageNormalL__Group__4__Impl"
    // InternalMyDsl.g:4375:1: rule__MessageNormalL__Group__4__Impl : ( ( rule__MessageNormalL__ProtocolAssignment_4 ) ) ;
    public final void rule__MessageNormalL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4379:1: ( ( ( rule__MessageNormalL__ProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:4380:1: ( ( rule__MessageNormalL__ProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:4380:1: ( ( rule__MessageNormalL__ProtocolAssignment_4 ) )
            // InternalMyDsl.g:4381:2: ( rule__MessageNormalL__ProtocolAssignment_4 )
            {
             before(grammarAccess.getMessageNormalLAccess().getProtocolAssignment_4()); 
            // InternalMyDsl.g:4382:2: ( rule__MessageNormalL__ProtocolAssignment_4 )
            // InternalMyDsl.g:4382:3: rule__MessageNormalL__ProtocolAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormalL__ProtocolAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMessageNormalLAccess().getProtocolAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group__4__Impl"


    // $ANTLR start "rule__MessageNormalL__Group_1_0__0"
    // InternalMyDsl.g:4391:1: rule__MessageNormalL__Group_1_0__0 : rule__MessageNormalL__Group_1_0__0__Impl rule__MessageNormalL__Group_1_0__1 ;
    public final void rule__MessageNormalL__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4395:1: ( rule__MessageNormalL__Group_1_0__0__Impl rule__MessageNormalL__Group_1_0__1 )
            // InternalMyDsl.g:4396:2: rule__MessageNormalL__Group_1_0__0__Impl rule__MessageNormalL__Group_1_0__1
            {
            pushFollow(FOLLOW_31);
            rule__MessageNormalL__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormalL__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group_1_0__0"


    // $ANTLR start "rule__MessageNormalL__Group_1_0__0__Impl"
    // InternalMyDsl.g:4403:1: rule__MessageNormalL__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__MessageNormalL__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4407:1: ( ( '(' ) )
            // InternalMyDsl.g:4408:1: ( '(' )
            {
            // InternalMyDsl.g:4408:1: ( '(' )
            // InternalMyDsl.g:4409:2: '('
            {
             before(grammarAccess.getMessageNormalLAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMessageNormalLAccess().getLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group_1_0__0__Impl"


    // $ANTLR start "rule__MessageNormalL__Group_1_0__1"
    // InternalMyDsl.g:4418:1: rule__MessageNormalL__Group_1_0__1 : rule__MessageNormalL__Group_1_0__1__Impl rule__MessageNormalL__Group_1_0__2 ;
    public final void rule__MessageNormalL__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4422:1: ( rule__MessageNormalL__Group_1_0__1__Impl rule__MessageNormalL__Group_1_0__2 )
            // InternalMyDsl.g:4423:2: rule__MessageNormalL__Group_1_0__1__Impl rule__MessageNormalL__Group_1_0__2
            {
            pushFollow(FOLLOW_31);
            rule__MessageNormalL__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageNormalL__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group_1_0__1"


    // $ANTLR start "rule__MessageNormalL__Group_1_0__1__Impl"
    // InternalMyDsl.g:4430:1: rule__MessageNormalL__Group_1_0__1__Impl : ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? ) ;
    public final void rule__MessageNormalL__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4434:1: ( ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? ) )
            // InternalMyDsl.g:4435:1: ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? )
            {
            // InternalMyDsl.g:4435:1: ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? )
            // InternalMyDsl.g:4436:2: ( rule__MessageNormalL__PayloadAssignment_1_0_1 )?
            {
             before(grammarAccess.getMessageNormalLAccess().getPayloadAssignment_1_0_1()); 
            // InternalMyDsl.g:4437:2: ( rule__MessageNormalL__PayloadAssignment_1_0_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=13 && LA21_0<=16)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:4437:3: rule__MessageNormalL__PayloadAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageNormalL__PayloadAssignment_1_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageNormalLAccess().getPayloadAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group_1_0__1__Impl"


    // $ANTLR start "rule__MessageNormalL__Group_1_0__2"
    // InternalMyDsl.g:4445:1: rule__MessageNormalL__Group_1_0__2 : rule__MessageNormalL__Group_1_0__2__Impl ;
    public final void rule__MessageNormalL__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4449:1: ( rule__MessageNormalL__Group_1_0__2__Impl )
            // InternalMyDsl.g:4450:2: rule__MessageNormalL__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageNormalL__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group_1_0__2"


    // $ANTLR start "rule__MessageNormalL__Group_1_0__2__Impl"
    // InternalMyDsl.g:4456:1: rule__MessageNormalL__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__MessageNormalL__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4460:1: ( ( ')' ) )
            // InternalMyDsl.g:4461:1: ( ')' )
            {
            // InternalMyDsl.g:4461:1: ( ')' )
            // InternalMyDsl.g:4462:2: ')'
            {
             before(grammarAccess.getMessageNormalLAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMessageNormalLAccess().getRightParenthesisKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__Group_1_0__2__Impl"


    // $ANTLR start "rule__MessageQuitL__Group__0"
    // InternalMyDsl.g:4472:1: rule__MessageQuitL__Group__0 : rule__MessageQuitL__Group__0__Impl rule__MessageQuitL__Group__1 ;
    public final void rule__MessageQuitL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4476:1: ( rule__MessageQuitL__Group__0__Impl rule__MessageQuitL__Group__1 )
            // InternalMyDsl.g:4477:2: rule__MessageQuitL__Group__0__Impl rule__MessageQuitL__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__MessageQuitL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageQuitL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuitL__Group__0"


    // $ANTLR start "rule__MessageQuitL__Group__0__Impl"
    // InternalMyDsl.g:4484:1: rule__MessageQuitL__Group__0__Impl : ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageQuitL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4488:1: ( ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:4489:1: ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:4489:1: ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:4490:2: ( rule__MessageQuitL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageQuitLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:4491:2: ( rule__MessageQuitL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:4491:3: rule__MessageQuitL__MessageTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuitL__MessageTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageQuitLAccess().getMessageTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuitL__Group__0__Impl"


    // $ANTLR start "rule__MessageQuitL__Group__1"
    // InternalMyDsl.g:4499:1: rule__MessageQuitL__Group__1 : rule__MessageQuitL__Group__1__Impl rule__MessageQuitL__Group__2 ;
    public final void rule__MessageQuitL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4503:1: ( rule__MessageQuitL__Group__1__Impl rule__MessageQuitL__Group__2 )
            // InternalMyDsl.g:4504:2: rule__MessageQuitL__Group__1__Impl rule__MessageQuitL__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__MessageQuitL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageQuitL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuitL__Group__1"


    // $ANTLR start "rule__MessageQuitL__Group__1__Impl"
    // InternalMyDsl.g:4511:1: rule__MessageQuitL__Group__1__Impl : ( '()' ) ;
    public final void rule__MessageQuitL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4515:1: ( ( '()' ) )
            // InternalMyDsl.g:4516:1: ( '()' )
            {
            // InternalMyDsl.g:4516:1: ( '()' )
            // InternalMyDsl.g:4517:2: '()'
            {
             before(grammarAccess.getMessageQuitLAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMessageQuitLAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuitL__Group__1__Impl"


    // $ANTLR start "rule__MessageQuitL__Group__2"
    // InternalMyDsl.g:4526:1: rule__MessageQuitL__Group__2 : rule__MessageQuitL__Group__2__Impl ;
    public final void rule__MessageQuitL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4530:1: ( rule__MessageQuitL__Group__2__Impl )
            // InternalMyDsl.g:4531:2: rule__MessageQuitL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuitL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuitL__Group__2"


    // $ANTLR start "rule__MessageQuitL__Group__2__Impl"
    // InternalMyDsl.g:4537:1: rule__MessageQuitL__Group__2__Impl : ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) ) ;
    public final void rule__MessageQuitL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4541:1: ( ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) ) )
            // InternalMyDsl.g:4542:1: ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) )
            {
            // InternalMyDsl.g:4542:1: ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) )
            // InternalMyDsl.g:4543:2: ( rule__MessageQuitL__SendReceiveAssignment_2 )
            {
             before(grammarAccess.getMessageQuitLAccess().getSendReceiveAssignment_2()); 
            // InternalMyDsl.g:4544:2: ( rule__MessageQuitL__SendReceiveAssignment_2 )
            // InternalMyDsl.g:4544:3: rule__MessageQuitL__SendReceiveAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuitL__SendReceiveAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageQuitLAccess().getSendReceiveAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuitL__Group__2__Impl"


    // $ANTLR start "rule__SenderL__Group__0"
    // InternalMyDsl.g:4553:1: rule__SenderL__Group__0 : rule__SenderL__Group__0__Impl rule__SenderL__Group__1 ;
    public final void rule__SenderL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4557:1: ( rule__SenderL__Group__0__Impl rule__SenderL__Group__1 )
            // InternalMyDsl.g:4558:2: rule__SenderL__Group__0__Impl rule__SenderL__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SenderL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SenderL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SenderL__Group__0"


    // $ANTLR start "rule__SenderL__Group__0__Impl"
    // InternalMyDsl.g:4565:1: rule__SenderL__Group__0__Impl : ( 'from' ) ;
    public final void rule__SenderL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4569:1: ( ( 'from' ) )
            // InternalMyDsl.g:4570:1: ( 'from' )
            {
            // InternalMyDsl.g:4570:1: ( 'from' )
            // InternalMyDsl.g:4571:2: 'from'
            {
             before(grammarAccess.getSenderLAccess().getFromKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSenderLAccess().getFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SenderL__Group__0__Impl"


    // $ANTLR start "rule__SenderL__Group__1"
    // InternalMyDsl.g:4580:1: rule__SenderL__Group__1 : rule__SenderL__Group__1__Impl ;
    public final void rule__SenderL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4584:1: ( rule__SenderL__Group__1__Impl )
            // InternalMyDsl.g:4585:2: rule__SenderL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SenderL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SenderL__Group__1"


    // $ANTLR start "rule__SenderL__Group__1__Impl"
    // InternalMyDsl.g:4591:1: rule__SenderL__Group__1__Impl : ( ( rule__SenderL__RoleAssignment_1 ) ) ;
    public final void rule__SenderL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4595:1: ( ( ( rule__SenderL__RoleAssignment_1 ) ) )
            // InternalMyDsl.g:4596:1: ( ( rule__SenderL__RoleAssignment_1 ) )
            {
            // InternalMyDsl.g:4596:1: ( ( rule__SenderL__RoleAssignment_1 ) )
            // InternalMyDsl.g:4597:2: ( rule__SenderL__RoleAssignment_1 )
            {
             before(grammarAccess.getSenderLAccess().getRoleAssignment_1()); 
            // InternalMyDsl.g:4598:2: ( rule__SenderL__RoleAssignment_1 )
            // InternalMyDsl.g:4598:3: rule__SenderL__RoleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SenderL__RoleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSenderLAccess().getRoleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SenderL__Group__1__Impl"


    // $ANTLR start "rule__ReceiverL__Group__0"
    // InternalMyDsl.g:4607:1: rule__ReceiverL__Group__0 : rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 ;
    public final void rule__ReceiverL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4611:1: ( rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 )
            // InternalMyDsl.g:4612:2: rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ReceiverL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReceiverL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverL__Group__0"


    // $ANTLR start "rule__ReceiverL__Group__0__Impl"
    // InternalMyDsl.g:4619:1: rule__ReceiverL__Group__0__Impl : ( 'to' ) ;
    public final void rule__ReceiverL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4623:1: ( ( 'to' ) )
            // InternalMyDsl.g:4624:1: ( 'to' )
            {
            // InternalMyDsl.g:4624:1: ( 'to' )
            // InternalMyDsl.g:4625:2: 'to'
            {
             before(grammarAccess.getReceiverLAccess().getToKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReceiverLAccess().getToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverL__Group__0__Impl"


    // $ANTLR start "rule__ReceiverL__Group__1"
    // InternalMyDsl.g:4634:1: rule__ReceiverL__Group__1 : rule__ReceiverL__Group__1__Impl ;
    public final void rule__ReceiverL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4638:1: ( rule__ReceiverL__Group__1__Impl )
            // InternalMyDsl.g:4639:2: rule__ReceiverL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverL__Group__1"


    // $ANTLR start "rule__ReceiverL__Group__1__Impl"
    // InternalMyDsl.g:4645:1: rule__ReceiverL__Group__1__Impl : ( ( rule__ReceiverL__RoleAssignment_1 ) ) ;
    public final void rule__ReceiverL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4649:1: ( ( ( rule__ReceiverL__RoleAssignment_1 ) ) )
            // InternalMyDsl.g:4650:1: ( ( rule__ReceiverL__RoleAssignment_1 ) )
            {
            // InternalMyDsl.g:4650:1: ( ( rule__ReceiverL__RoleAssignment_1 ) )
            // InternalMyDsl.g:4651:2: ( rule__ReceiverL__RoleAssignment_1 )
            {
             before(grammarAccess.getReceiverLAccess().getRoleAssignment_1()); 
            // InternalMyDsl.g:4652:2: ( rule__ReceiverL__RoleAssignment_1 )
            // InternalMyDsl.g:4652:3: rule__ReceiverL__RoleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverL__RoleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReceiverLAccess().getRoleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverL__Group__1__Impl"


    // $ANTLR start "rule__ChoiceL__Group__0"
    // InternalMyDsl.g:4661:1: rule__ChoiceL__Group__0 : rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 ;
    public final void rule__ChoiceL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4665:1: ( rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 )
            // InternalMyDsl.g:4666:2: rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ChoiceL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__0"


    // $ANTLR start "rule__ChoiceL__Group__0__Impl"
    // InternalMyDsl.g:4673:1: rule__ChoiceL__Group__0__Impl : ( 'choice' ) ;
    public final void rule__ChoiceL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4677:1: ( ( 'choice' ) )
            // InternalMyDsl.g:4678:1: ( 'choice' )
            {
            // InternalMyDsl.g:4678:1: ( 'choice' )
            // InternalMyDsl.g:4679:2: 'choice'
            {
             before(grammarAccess.getChoiceLAccess().getChoiceKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getChoiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__0__Impl"


    // $ANTLR start "rule__ChoiceL__Group__1"
    // InternalMyDsl.g:4688:1: rule__ChoiceL__Group__1 : rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 ;
    public final void rule__ChoiceL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4692:1: ( rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 )
            // InternalMyDsl.g:4693:2: rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ChoiceL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__1"


    // $ANTLR start "rule__ChoiceL__Group__1__Impl"
    // InternalMyDsl.g:4700:1: rule__ChoiceL__Group__1__Impl : ( 'at' ) ;
    public final void rule__ChoiceL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4704:1: ( ( 'at' ) )
            // InternalMyDsl.g:4705:1: ( 'at' )
            {
            // InternalMyDsl.g:4705:1: ( 'at' )
            // InternalMyDsl.g:4706:2: 'at'
            {
             before(grammarAccess.getChoiceLAccess().getAtKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__1__Impl"


    // $ANTLR start "rule__ChoiceL__Group__2"
    // InternalMyDsl.g:4715:1: rule__ChoiceL__Group__2 : rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 ;
    public final void rule__ChoiceL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4719:1: ( rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 )
            // InternalMyDsl.g:4720:2: rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ChoiceL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__2"


    // $ANTLR start "rule__ChoiceL__Group__2__Impl"
    // InternalMyDsl.g:4727:1: rule__ChoiceL__Group__2__Impl : ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) ) ;
    public final void rule__ChoiceL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4731:1: ( ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) ) )
            // InternalMyDsl.g:4732:1: ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) )
            {
            // InternalMyDsl.g:4732:1: ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) )
            // InternalMyDsl.g:4733:2: ( rule__ChoiceL__RoleMakingChoiceAssignment_2 )
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceAssignment_2()); 
            // InternalMyDsl.g:4734:2: ( rule__ChoiceL__RoleMakingChoiceAssignment_2 )
            // InternalMyDsl.g:4734:3: rule__ChoiceL__RoleMakingChoiceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__RoleMakingChoiceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceLAccess().getRoleMakingChoiceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__2__Impl"


    // $ANTLR start "rule__ChoiceL__Group__3"
    // InternalMyDsl.g:4742:1: rule__ChoiceL__Group__3 : rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 ;
    public final void rule__ChoiceL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4746:1: ( rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 )
            // InternalMyDsl.g:4747:2: rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ChoiceL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__3"


    // $ANTLR start "rule__ChoiceL__Group__3__Impl"
    // InternalMyDsl.g:4754:1: rule__ChoiceL__Group__3__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4758:1: ( ( '{' ) )
            // InternalMyDsl.g:4759:1: ( '{' )
            {
            // InternalMyDsl.g:4759:1: ( '{' )
            // InternalMyDsl.g:4760:2: '{'
            {
             before(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__3__Impl"


    // $ANTLR start "rule__ChoiceL__Group__4"
    // InternalMyDsl.g:4769:1: rule__ChoiceL__Group__4 : rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 ;
    public final void rule__ChoiceL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4773:1: ( rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 )
            // InternalMyDsl.g:4774:2: rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ChoiceL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__4"


    // $ANTLR start "rule__ChoiceL__Group__4__Impl"
    // InternalMyDsl.g:4781:1: rule__ChoiceL__Group__4__Impl : ( ( rule__ChoiceL__BranchesAssignment_4 ) ) ;
    public final void rule__ChoiceL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4785:1: ( ( ( rule__ChoiceL__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:4786:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:4786:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            // InternalMyDsl.g:4787:2: ( rule__ChoiceL__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:4788:2: ( rule__ChoiceL__BranchesAssignment_4 )
            // InternalMyDsl.g:4788:3: rule__ChoiceL__BranchesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__BranchesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoiceLAccess().getBranchesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__4__Impl"


    // $ANTLR start "rule__ChoiceL__Group__5"
    // InternalMyDsl.g:4796:1: rule__ChoiceL__Group__5 : rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 ;
    public final void rule__ChoiceL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4800:1: ( rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 )
            // InternalMyDsl.g:4801:2: rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__ChoiceL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__5"


    // $ANTLR start "rule__ChoiceL__Group__5__Impl"
    // InternalMyDsl.g:4808:1: rule__ChoiceL__Group__5__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4812:1: ( ( '}' ) )
            // InternalMyDsl.g:4813:1: ( '}' )
            {
            // InternalMyDsl.g:4813:1: ( '}' )
            // InternalMyDsl.g:4814:2: '}'
            {
             before(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__5__Impl"


    // $ANTLR start "rule__ChoiceL__Group__6"
    // InternalMyDsl.g:4823:1: rule__ChoiceL__Group__6 : rule__ChoiceL__Group__6__Impl ;
    public final void rule__ChoiceL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4827:1: ( rule__ChoiceL__Group__6__Impl )
            // InternalMyDsl.g:4828:2: rule__ChoiceL__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__6"


    // $ANTLR start "rule__ChoiceL__Group__6__Impl"
    // InternalMyDsl.g:4834:1: rule__ChoiceL__Group__6__Impl : ( ( rule__ChoiceL__Group_6__0 )* ) ;
    public final void rule__ChoiceL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4838:1: ( ( ( rule__ChoiceL__Group_6__0 )* ) )
            // InternalMyDsl.g:4839:1: ( ( rule__ChoiceL__Group_6__0 )* )
            {
            // InternalMyDsl.g:4839:1: ( ( rule__ChoiceL__Group_6__0 )* )
            // InternalMyDsl.g:4840:2: ( rule__ChoiceL__Group_6__0 )*
            {
             before(grammarAccess.getChoiceLAccess().getGroup_6()); 
            // InternalMyDsl.g:4841:2: ( rule__ChoiceL__Group_6__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:4841:3: rule__ChoiceL__Group_6__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ChoiceL__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getChoiceLAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__6__Impl"


    // $ANTLR start "rule__ChoiceL__Group_6__0"
    // InternalMyDsl.g:4850:1: rule__ChoiceL__Group_6__0 : rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 ;
    public final void rule__ChoiceL__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4854:1: ( rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 )
            // InternalMyDsl.g:4855:2: rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1
            {
            pushFollow(FOLLOW_18);
            rule__ChoiceL__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_6__0"


    // $ANTLR start "rule__ChoiceL__Group_6__0__Impl"
    // InternalMyDsl.g:4862:1: rule__ChoiceL__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__ChoiceL__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4866:1: ( ( 'or' ) )
            // InternalMyDsl.g:4867:1: ( 'or' )
            {
            // InternalMyDsl.g:4867:1: ( 'or' )
            // InternalMyDsl.g:4868:2: 'or'
            {
             before(grammarAccess.getChoiceLAccess().getOrKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getOrKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_6__0__Impl"


    // $ANTLR start "rule__ChoiceL__Group_6__1"
    // InternalMyDsl.g:4877:1: rule__ChoiceL__Group_6__1 : rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 ;
    public final void rule__ChoiceL__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4881:1: ( rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 )
            // InternalMyDsl.g:4882:2: rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2
            {
            pushFollow(FOLLOW_24);
            rule__ChoiceL__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_6__1"


    // $ANTLR start "rule__ChoiceL__Group_6__1__Impl"
    // InternalMyDsl.g:4889:1: rule__ChoiceL__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4893:1: ( ( '{' ) )
            // InternalMyDsl.g:4894:1: ( '{' )
            {
            // InternalMyDsl.g:4894:1: ( '{' )
            // InternalMyDsl.g:4895:2: '{'
            {
             before(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_6__1__Impl"


    // $ANTLR start "rule__ChoiceL__Group_6__2"
    // InternalMyDsl.g:4904:1: rule__ChoiceL__Group_6__2 : rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 ;
    public final void rule__ChoiceL__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4908:1: ( rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 )
            // InternalMyDsl.g:4909:2: rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__ChoiceL__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_6__2"


    // $ANTLR start "rule__ChoiceL__Group_6__2__Impl"
    // InternalMyDsl.g:4916:1: rule__ChoiceL__Group_6__2__Impl : ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) ;
    public final void rule__ChoiceL__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4920:1: ( ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:4921:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:4921:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:4922:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:4923:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            // InternalMyDsl.g:4923:3: rule__ChoiceL__BranchesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__BranchesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceLAccess().getBranchesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_6__2__Impl"


    // $ANTLR start "rule__ChoiceL__Group_6__3"
    // InternalMyDsl.g:4931:1: rule__ChoiceL__Group_6__3 : rule__ChoiceL__Group_6__3__Impl ;
    public final void rule__ChoiceL__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4935:1: ( rule__ChoiceL__Group_6__3__Impl )
            // InternalMyDsl.g:4936:2: rule__ChoiceL__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_6__3"


    // $ANTLR start "rule__ChoiceL__Group_6__3__Impl"
    // InternalMyDsl.g:4942:1: rule__ChoiceL__Group_6__3__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4946:1: ( ( '}' ) )
            // InternalMyDsl.g:4947:1: ( '}' )
            {
            // InternalMyDsl.g:4947:1: ( '}' )
            // InternalMyDsl.g:4948:2: '}'
            {
             before(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_6__3__Impl"


    // $ANTLR start "rule__ForEachL__Group__0"
    // InternalMyDsl.g:4958:1: rule__ForEachL__Group__0 : rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 ;
    public final void rule__ForEachL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4962:1: ( rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 )
            // InternalMyDsl.g:4963:2: rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ForEachL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__0"


    // $ANTLR start "rule__ForEachL__Group__0__Impl"
    // InternalMyDsl.g:4970:1: rule__ForEachL__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEachL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4974:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:4975:1: ( 'foreach' )
            {
            // InternalMyDsl.g:4975:1: ( 'foreach' )
            // InternalMyDsl.g:4976:2: 'foreach'
            {
             before(grammarAccess.getForEachLAccess().getForeachKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getForeachKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__0__Impl"


    // $ANTLR start "rule__ForEachL__Group__1"
    // InternalMyDsl.g:4985:1: rule__ForEachL__Group__1 : rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 ;
    public final void rule__ForEachL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4989:1: ( rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 )
            // InternalMyDsl.g:4990:2: rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ForEachL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__1"


    // $ANTLR start "rule__ForEachL__Group__1__Impl"
    // InternalMyDsl.g:4997:1: rule__ForEachL__Group__1__Impl : ( ( rule__ForEachL__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEachL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5001:1: ( ( ( rule__ForEachL__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:5002:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:5002:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:5003:2: ( rule__ForEachL__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachLAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:5004:2: ( rule__ForEachL__EachRoleAssignment_1 )
            // InternalMyDsl.g:5004:3: rule__ForEachL__EachRoleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__EachRoleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachLAccess().getEachRoleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__1__Impl"


    // $ANTLR start "rule__ForEachL__Group__2"
    // InternalMyDsl.g:5012:1: rule__ForEachL__Group__2 : rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 ;
    public final void rule__ForEachL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5016:1: ( rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 )
            // InternalMyDsl.g:5017:2: rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ForEachL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__2"


    // $ANTLR start "rule__ForEachL__Group__2__Impl"
    // InternalMyDsl.g:5024:1: rule__ForEachL__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEachL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5028:1: ( ( ':' ) )
            // InternalMyDsl.g:5029:1: ( ':' )
            {
            // InternalMyDsl.g:5029:1: ( ':' )
            // InternalMyDsl.g:5030:2: ':'
            {
             before(grammarAccess.getForEachLAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__2__Impl"


    // $ANTLR start "rule__ForEachL__Group__3"
    // InternalMyDsl.g:5039:1: rule__ForEachL__Group__3 : rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 ;
    public final void rule__ForEachL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5043:1: ( rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 )
            // InternalMyDsl.g:5044:2: rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ForEachL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__3"


    // $ANTLR start "rule__ForEachL__Group__3__Impl"
    // InternalMyDsl.g:5051:1: rule__ForEachL__Group__3__Impl : ( '<' ) ;
    public final void rule__ForEachL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5055:1: ( ( '<' ) )
            // InternalMyDsl.g:5056:1: ( '<' )
            {
            // InternalMyDsl.g:5056:1: ( '<' )
            // InternalMyDsl.g:5057:2: '<'
            {
             before(grammarAccess.getForEachLAccess().getLessThanSignKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getLessThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__3__Impl"


    // $ANTLR start "rule__ForEachL__Group__4"
    // InternalMyDsl.g:5066:1: rule__ForEachL__Group__4 : rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 ;
    public final void rule__ForEachL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5070:1: ( rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 )
            // InternalMyDsl.g:5071:2: rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ForEachL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__4"


    // $ANTLR start "rule__ForEachL__Group__4__Impl"
    // InternalMyDsl.g:5078:1: rule__ForEachL__Group__4__Impl : ( ( rule__ForEachL__RolesetAssignment_4 ) ) ;
    public final void rule__ForEachL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5082:1: ( ( ( rule__ForEachL__RolesetAssignment_4 ) ) )
            // InternalMyDsl.g:5083:1: ( ( rule__ForEachL__RolesetAssignment_4 ) )
            {
            // InternalMyDsl.g:5083:1: ( ( rule__ForEachL__RolesetAssignment_4 ) )
            // InternalMyDsl.g:5084:2: ( rule__ForEachL__RolesetAssignment_4 )
            {
             before(grammarAccess.getForEachLAccess().getRolesetAssignment_4()); 
            // InternalMyDsl.g:5085:2: ( rule__ForEachL__RolesetAssignment_4 )
            // InternalMyDsl.g:5085:3: rule__ForEachL__RolesetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__RolesetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForEachLAccess().getRolesetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__4__Impl"


    // $ANTLR start "rule__ForEachL__Group__5"
    // InternalMyDsl.g:5093:1: rule__ForEachL__Group__5 : rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 ;
    public final void rule__ForEachL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5097:1: ( rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 )
            // InternalMyDsl.g:5098:2: rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ForEachL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__5"


    // $ANTLR start "rule__ForEachL__Group__5__Impl"
    // InternalMyDsl.g:5105:1: rule__ForEachL__Group__5__Impl : ( ',' ) ;
    public final void rule__ForEachL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5109:1: ( ( ',' ) )
            // InternalMyDsl.g:5110:1: ( ',' )
            {
            // InternalMyDsl.g:5110:1: ( ',' )
            // InternalMyDsl.g:5111:2: ','
            {
             before(grammarAccess.getForEachLAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__5__Impl"


    // $ANTLR start "rule__ForEachL__Group__6"
    // InternalMyDsl.g:5120:1: rule__ForEachL__Group__6 : rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7 ;
    public final void rule__ForEachL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5124:1: ( rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7 )
            // InternalMyDsl.g:5125:2: rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__ForEachL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__6"


    // $ANTLR start "rule__ForEachL__Group__6__Impl"
    // InternalMyDsl.g:5132:1: rule__ForEachL__Group__6__Impl : ( ( rule__ForEachL__RefroleAssignment_6 ) ) ;
    public final void rule__ForEachL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5136:1: ( ( ( rule__ForEachL__RefroleAssignment_6 ) ) )
            // InternalMyDsl.g:5137:1: ( ( rule__ForEachL__RefroleAssignment_6 ) )
            {
            // InternalMyDsl.g:5137:1: ( ( rule__ForEachL__RefroleAssignment_6 ) )
            // InternalMyDsl.g:5138:2: ( rule__ForEachL__RefroleAssignment_6 )
            {
             before(grammarAccess.getForEachLAccess().getRefroleAssignment_6()); 
            // InternalMyDsl.g:5139:2: ( rule__ForEachL__RefroleAssignment_6 )
            // InternalMyDsl.g:5139:3: rule__ForEachL__RefroleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__RefroleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getForEachLAccess().getRefroleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__6__Impl"


    // $ANTLR start "rule__ForEachL__Group__7"
    // InternalMyDsl.g:5147:1: rule__ForEachL__Group__7 : rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8 ;
    public final void rule__ForEachL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5151:1: ( rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8 )
            // InternalMyDsl.g:5152:2: rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__ForEachL__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__7"


    // $ANTLR start "rule__ForEachL__Group__7__Impl"
    // InternalMyDsl.g:5159:1: rule__ForEachL__Group__7__Impl : ( '>' ) ;
    public final void rule__ForEachL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5163:1: ( ( '>' ) )
            // InternalMyDsl.g:5164:1: ( '>' )
            {
            // InternalMyDsl.g:5164:1: ( '>' )
            // InternalMyDsl.g:5165:2: '>'
            {
             before(grammarAccess.getForEachLAccess().getGreaterThanSignKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__7__Impl"


    // $ANTLR start "rule__ForEachL__Group__8"
    // InternalMyDsl.g:5174:1: rule__ForEachL__Group__8 : rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9 ;
    public final void rule__ForEachL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5178:1: ( rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9 )
            // InternalMyDsl.g:5179:2: rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9
            {
            pushFollow(FOLLOW_34);
            rule__ForEachL__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__8"


    // $ANTLR start "rule__ForEachL__Group__8__Impl"
    // InternalMyDsl.g:5186:1: rule__ForEachL__Group__8__Impl : ( '{' ) ;
    public final void rule__ForEachL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5190:1: ( ( '{' ) )
            // InternalMyDsl.g:5191:1: ( '{' )
            {
            // InternalMyDsl.g:5191:1: ( '{' )
            // InternalMyDsl.g:5192:2: '{'
            {
             before(grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__8__Impl"


    // $ANTLR start "rule__ForEachL__Group__9"
    // InternalMyDsl.g:5201:1: rule__ForEachL__Group__9 : rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10 ;
    public final void rule__ForEachL__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5205:1: ( rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10 )
            // InternalMyDsl.g:5206:2: rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__ForEachL__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__9"


    // $ANTLR start "rule__ForEachL__Group__9__Impl"
    // InternalMyDsl.g:5213:1: rule__ForEachL__Group__9__Impl : ( ( rule__ForEachL__BranchAssignment_9 ) ) ;
    public final void rule__ForEachL__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5217:1: ( ( ( rule__ForEachL__BranchAssignment_9 ) ) )
            // InternalMyDsl.g:5218:1: ( ( rule__ForEachL__BranchAssignment_9 ) )
            {
            // InternalMyDsl.g:5218:1: ( ( rule__ForEachL__BranchAssignment_9 ) )
            // InternalMyDsl.g:5219:2: ( rule__ForEachL__BranchAssignment_9 )
            {
             before(grammarAccess.getForEachLAccess().getBranchAssignment_9()); 
            // InternalMyDsl.g:5220:2: ( rule__ForEachL__BranchAssignment_9 )
            // InternalMyDsl.g:5220:3: rule__ForEachL__BranchAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__BranchAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getForEachLAccess().getBranchAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__9__Impl"


    // $ANTLR start "rule__ForEachL__Group__10"
    // InternalMyDsl.g:5228:1: rule__ForEachL__Group__10 : rule__ForEachL__Group__10__Impl rule__ForEachL__Group__11 ;
    public final void rule__ForEachL__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5232:1: ( rule__ForEachL__Group__10__Impl rule__ForEachL__Group__11 )
            // InternalMyDsl.g:5233:2: rule__ForEachL__Group__10__Impl rule__ForEachL__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__ForEachL__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__10"


    // $ANTLR start "rule__ForEachL__Group__10__Impl"
    // InternalMyDsl.g:5240:1: rule__ForEachL__Group__10__Impl : ( '}' ) ;
    public final void rule__ForEachL__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5244:1: ( ( '}' ) )
            // InternalMyDsl.g:5245:1: ( '}' )
            {
            // InternalMyDsl.g:5245:1: ( '}' )
            // InternalMyDsl.g:5246:2: '}'
            {
             before(grammarAccess.getForEachLAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__10__Impl"


    // $ANTLR start "rule__ForEachL__Group__11"
    // InternalMyDsl.g:5255:1: rule__ForEachL__Group__11 : rule__ForEachL__Group__11__Impl rule__ForEachL__Group__12 ;
    public final void rule__ForEachL__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5259:1: ( rule__ForEachL__Group__11__Impl rule__ForEachL__Group__12 )
            // InternalMyDsl.g:5260:2: rule__ForEachL__Group__11__Impl rule__ForEachL__Group__12
            {
            pushFollow(FOLLOW_34);
            rule__ForEachL__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__11"


    // $ANTLR start "rule__ForEachL__Group__11__Impl"
    // InternalMyDsl.g:5267:1: rule__ForEachL__Group__11__Impl : ( ';' ) ;
    public final void rule__ForEachL__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5271:1: ( ( ';' ) )
            // InternalMyDsl.g:5272:1: ( ';' )
            {
            // InternalMyDsl.g:5272:1: ( ';' )
            // InternalMyDsl.g:5273:2: ';'
            {
             before(grammarAccess.getForEachLAccess().getSemicolonKeyword_11()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getSemicolonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__11__Impl"


    // $ANTLR start "rule__ForEachL__Group__12"
    // InternalMyDsl.g:5282:1: rule__ForEachL__Group__12 : rule__ForEachL__Group__12__Impl ;
    public final void rule__ForEachL__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5286:1: ( rule__ForEachL__Group__12__Impl )
            // InternalMyDsl.g:5287:2: rule__ForEachL__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__12"


    // $ANTLR start "rule__ForEachL__Group__12__Impl"
    // InternalMyDsl.g:5293:1: rule__ForEachL__Group__12__Impl : ( ( rule__ForEachL__ProtocolAssignment_12 ) ) ;
    public final void rule__ForEachL__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5297:1: ( ( ( rule__ForEachL__ProtocolAssignment_12 ) ) )
            // InternalMyDsl.g:5298:1: ( ( rule__ForEachL__ProtocolAssignment_12 ) )
            {
            // InternalMyDsl.g:5298:1: ( ( rule__ForEachL__ProtocolAssignment_12 ) )
            // InternalMyDsl.g:5299:2: ( rule__ForEachL__ProtocolAssignment_12 )
            {
             before(grammarAccess.getForEachLAccess().getProtocolAssignment_12()); 
            // InternalMyDsl.g:5300:2: ( rule__ForEachL__ProtocolAssignment_12 )
            // InternalMyDsl.g:5300:3: rule__ForEachL__ProtocolAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__ProtocolAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getForEachLAccess().getProtocolAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__Group__12__Impl"


    // $ANTLR start "rule__Model__DefinitionsAssignment_0"
    // InternalMyDsl.g:5309:1: rule__Model__DefinitionsAssignment_0 : ( ruleQuitDefinition ) ;
    public final void rule__Model__DefinitionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5313:1: ( ( ruleQuitDefinition ) )
            // InternalMyDsl.g:5314:2: ( ruleQuitDefinition )
            {
            // InternalMyDsl.g:5314:2: ( ruleQuitDefinition )
            // InternalMyDsl.g:5315:3: ruleQuitDefinition
            {
             before(grammarAccess.getModelAccess().getDefinitionsQuitDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuitDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDefinitionsQuitDefinitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefinitionsAssignment_0"


    // $ANTLR start "rule__Model__DefinitionsAssignment_1"
    // InternalMyDsl.g:5324:1: rule__Model__DefinitionsAssignment_1 : ( ruleDefinition ) ;
    public final void rule__Model__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5328:1: ( ( ruleDefinition ) )
            // InternalMyDsl.g:5329:2: ( ruleDefinition )
            {
            // InternalMyDsl.g:5329:2: ( ruleDefinition )
            // InternalMyDsl.g:5330:3: ruleDefinition
            {
             before(grammarAccess.getModelAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefinitionsAssignment_1"


    // $ANTLR start "rule__Model__ProtocolAssignment_2_0"
    // InternalMyDsl.g:5339:1: rule__Model__ProtocolAssignment_2_0 : ( ruleGlobalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5343:1: ( ( ruleGlobalProtocol ) )
            // InternalMyDsl.g:5344:2: ( ruleGlobalProtocol )
            {
            // InternalMyDsl.g:5344:2: ( ruleGlobalProtocol )
            // InternalMyDsl.g:5345:3: ruleGlobalProtocol
            {
             before(grammarAccess.getModelAccess().getProtocolGlobalProtocolParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalProtocol();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProtocolGlobalProtocolParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProtocolAssignment_2_0"


    // $ANTLR start "rule__Model__ProtocolAssignment_2_1"
    // InternalMyDsl.g:5354:1: rule__Model__ProtocolAssignment_2_1 : ( ruleLocalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5358:1: ( ( ruleLocalProtocol ) )
            // InternalMyDsl.g:5359:2: ( ruleLocalProtocol )
            {
            // InternalMyDsl.g:5359:2: ( ruleLocalProtocol )
            // InternalMyDsl.g:5360:3: ruleLocalProtocol
            {
             before(grammarAccess.getModelAccess().getProtocolLocalProtocolParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalProtocol();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProtocolLocalProtocolParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProtocolAssignment_2_1"


    // $ANTLR start "rule__GlobalProtocol__ProtocolNameAssignment_2"
    // InternalMyDsl.g:5369:1: rule__GlobalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5373:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5374:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5374:2: ( RULE_ID )
            // InternalMyDsl.g:5375:3: RULE_ID
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGlobalProtocolAccess().getProtocolNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__ProtocolNameAssignment_2"


    // $ANTLR start "rule__GlobalProtocol__RolesAssignment_4"
    // InternalMyDsl.g:5384:1: rule__GlobalProtocol__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__GlobalProtocol__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5388:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:5389:2: ( ruleRoles )
            {
            // InternalMyDsl.g:5389:2: ( ruleRoles )
            // InternalMyDsl.g:5390:3: ruleRoles
            {
             before(grammarAccess.getGlobalProtocolAccess().getRolesRolesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRoles();

            state._fsp--;

             after(grammarAccess.getGlobalProtocolAccess().getRolesRolesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__RolesAssignment_4"


    // $ANTLR start "rule__GlobalProtocol__ProtocolAssignment_6"
    // InternalMyDsl.g:5399:1: rule__GlobalProtocol__ProtocolAssignment_6 : ( ruleProtocol ) ;
    public final void rule__GlobalProtocol__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5403:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:5404:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:5404:2: ( ruleProtocol )
            // InternalMyDsl.g:5405:3: ruleProtocol
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolProtocolParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getGlobalProtocolAccess().getProtocolProtocolParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocol__ProtocolAssignment_6"


    // $ANTLR start "rule__Definition__TypeAssignment_0_0"
    // InternalMyDsl.g:5414:1: rule__Definition__TypeAssignment_0_0 : ( ( '@proposition' ) ) ;
    public final void rule__Definition__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5418:1: ( ( ( '@proposition' ) ) )
            // InternalMyDsl.g:5419:2: ( ( '@proposition' ) )
            {
            // InternalMyDsl.g:5419:2: ( ( '@proposition' ) )
            // InternalMyDsl.g:5420:3: ( '@proposition' )
            {
             before(grammarAccess.getDefinitionAccess().getTypePropositionKeyword_0_0_0()); 
            // InternalMyDsl.g:5421:3: ( '@proposition' )
            // InternalMyDsl.g:5422:4: '@proposition'
            {
             before(grammarAccess.getDefinitionAccess().getTypePropositionKeyword_0_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getTypePropositionKeyword_0_0_0()); 

            }

             after(grammarAccess.getDefinitionAccess().getTypePropositionKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TypeAssignment_0_0"


    // $ANTLR start "rule__Definition__NameAssignment_0_1"
    // InternalMyDsl.g:5433:1: rule__Definition__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5437:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5438:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5438:2: ( RULE_ID )
            // InternalMyDsl.g:5439:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_0_1"


    // $ANTLR start "rule__Definition__TypeAssignment_1_0"
    // InternalMyDsl.g:5448:1: rule__Definition__TypeAssignment_1_0 : ( ( '@action' ) ) ;
    public final void rule__Definition__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5452:1: ( ( ( '@action' ) ) )
            // InternalMyDsl.g:5453:2: ( ( '@action' ) )
            {
            // InternalMyDsl.g:5453:2: ( ( '@action' ) )
            // InternalMyDsl.g:5454:3: ( '@action' )
            {
             before(grammarAccess.getDefinitionAccess().getTypeActionKeyword_1_0_0()); 
            // InternalMyDsl.g:5455:3: ( '@action' )
            // InternalMyDsl.g:5456:4: '@action'
            {
             before(grammarAccess.getDefinitionAccess().getTypeActionKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getTypeActionKeyword_1_0_0()); 

            }

             after(grammarAccess.getDefinitionAccess().getTypeActionKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TypeAssignment_1_0"


    // $ANTLR start "rule__Definition__NameAssignment_1_1"
    // InternalMyDsl.g:5467:1: rule__Definition__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5471:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5472:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5472:2: ( RULE_ID )
            // InternalMyDsl.g:5473:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_1_1"


    // $ANTLR start "rule__Definition__TypesAssignment_1_2_1"
    // InternalMyDsl.g:5482:1: rule__Definition__TypesAssignment_1_2_1 : ( ruleType ) ;
    public final void rule__Definition__TypesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5486:1: ( ( ruleType ) )
            // InternalMyDsl.g:5487:2: ( ruleType )
            {
            // InternalMyDsl.g:5487:2: ( ruleType )
            // InternalMyDsl.g:5488:3: ruleType
            {
             before(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TypesAssignment_1_2_1"


    // $ANTLR start "rule__Definition__TypesAssignment_1_2_2_1"
    // InternalMyDsl.g:5497:1: rule__Definition__TypesAssignment_1_2_2_1 : ( ruleType ) ;
    public final void rule__Definition__TypesAssignment_1_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5501:1: ( ( ruleType ) )
            // InternalMyDsl.g:5502:2: ( ruleType )
            {
            // InternalMyDsl.g:5502:2: ( ruleType )
            // InternalMyDsl.g:5503:3: ruleType
            {
             before(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_1_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_1_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TypesAssignment_1_2_2_1"


    // $ANTLR start "rule__Definition__TypeAssignment_2_0"
    // InternalMyDsl.g:5512:1: rule__Definition__TypeAssignment_2_0 : ( ( '@predicate' ) ) ;
    public final void rule__Definition__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5516:1: ( ( ( '@predicate' ) ) )
            // InternalMyDsl.g:5517:2: ( ( '@predicate' ) )
            {
            // InternalMyDsl.g:5517:2: ( ( '@predicate' ) )
            // InternalMyDsl.g:5518:3: ( '@predicate' )
            {
             before(grammarAccess.getDefinitionAccess().getTypePredicateKeyword_2_0_0()); 
            // InternalMyDsl.g:5519:3: ( '@predicate' )
            // InternalMyDsl.g:5520:4: '@predicate'
            {
             before(grammarAccess.getDefinitionAccess().getTypePredicateKeyword_2_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getTypePredicateKeyword_2_0_0()); 

            }

             after(grammarAccess.getDefinitionAccess().getTypePredicateKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TypeAssignment_2_0"


    // $ANTLR start "rule__Definition__NameAssignment_2_1"
    // InternalMyDsl.g:5531:1: rule__Definition__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5535:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5536:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5536:2: ( RULE_ID )
            // InternalMyDsl.g:5537:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_2_1"


    // $ANTLR start "rule__Definition__TypesAssignment_2_3"
    // InternalMyDsl.g:5546:1: rule__Definition__TypesAssignment_2_3 : ( ruleType ) ;
    public final void rule__Definition__TypesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5550:1: ( ( ruleType ) )
            // InternalMyDsl.g:5551:2: ( ruleType )
            {
            // InternalMyDsl.g:5551:2: ( ruleType )
            // InternalMyDsl.g:5552:3: ruleType
            {
             before(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TypesAssignment_2_3"


    // $ANTLR start "rule__Definition__TypesAssignment_2_4_1"
    // InternalMyDsl.g:5561:1: rule__Definition__TypesAssignment_2_4_1 : ( ruleType ) ;
    public final void rule__Definition__TypesAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5565:1: ( ( ruleType ) )
            // InternalMyDsl.g:5566:2: ( ruleType )
            {
            // InternalMyDsl.g:5566:2: ( ruleType )
            // InternalMyDsl.g:5567:3: ruleType
            {
             before(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getTypesTypeParserRuleCall_2_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TypesAssignment_2_4_1"


    // $ANTLR start "rule__QuitDefinition__TypeAssignment_0"
    // InternalMyDsl.g:5576:1: rule__QuitDefinition__TypeAssignment_0 : ( ( '@action' ) ) ;
    public final void rule__QuitDefinition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5580:1: ( ( ( '@action' ) ) )
            // InternalMyDsl.g:5581:2: ( ( '@action' ) )
            {
            // InternalMyDsl.g:5581:2: ( ( '@action' ) )
            // InternalMyDsl.g:5582:3: ( '@action' )
            {
             before(grammarAccess.getQuitDefinitionAccess().getTypeActionKeyword_0_0()); 
            // InternalMyDsl.g:5583:3: ( '@action' )
            // InternalMyDsl.g:5584:4: '@action'
            {
             before(grammarAccess.getQuitDefinitionAccess().getTypeActionKeyword_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQuitDefinitionAccess().getTypeActionKeyword_0_0()); 

            }

             after(grammarAccess.getQuitDefinitionAccess().getTypeActionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuitDefinition__TypeAssignment_0"


    // $ANTLR start "rule__QuitDefinition__NameAssignment_1"
    // InternalMyDsl.g:5595:1: rule__QuitDefinition__NameAssignment_1 : ( ( 'QUIT' ) ) ;
    public final void rule__QuitDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5599:1: ( ( ( 'QUIT' ) ) )
            // InternalMyDsl.g:5600:2: ( ( 'QUIT' ) )
            {
            // InternalMyDsl.g:5600:2: ( ( 'QUIT' ) )
            // InternalMyDsl.g:5601:3: ( 'QUIT' )
            {
             before(grammarAccess.getQuitDefinitionAccess().getNameQUITKeyword_1_0()); 
            // InternalMyDsl.g:5602:3: ( 'QUIT' )
            // InternalMyDsl.g:5603:4: 'QUIT'
            {
             before(grammarAccess.getQuitDefinitionAccess().getNameQUITKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQuitDefinitionAccess().getNameQUITKeyword_1_0()); 

            }

             after(grammarAccess.getQuitDefinitionAccess().getNameQUITKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuitDefinition__NameAssignment_1"


    // $ANTLR start "rule__Roles__RolesAssignment_0"
    // InternalMyDsl.g:5614:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5618:1: ( ( ruleRole ) )
            // InternalMyDsl.g:5619:2: ( ruleRole )
            {
            // InternalMyDsl.g:5619:2: ( ruleRole )
            // InternalMyDsl.g:5620:3: ruleRole
            {
             before(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__RolesAssignment_0"


    // $ANTLR start "rule__Roles__RolesAssignment_1_1"
    // InternalMyDsl.g:5629:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5633:1: ( ( ruleRole ) )
            // InternalMyDsl.g:5634:2: ( ruleRole )
            {
            // InternalMyDsl.g:5634:2: ( ruleRole )
            // InternalMyDsl.g:5635:3: ruleRole
            {
             before(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__RolesAssignment_1_1"


    // $ANTLR start "rule__RoleOne__NameAssignment_1"
    // InternalMyDsl.g:5644:1: rule__RoleOne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5648:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5649:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5649:2: ( RULE_ID )
            // InternalMyDsl.g:5650:3: RULE_ID
            {
             before(grammarAccess.getRoleOneAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleOneAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleOne__NameAssignment_1"


    // $ANTLR start "rule__RoleSet__NameAssignment_1"
    // InternalMyDsl.g:5659:1: rule__RoleSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5663:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5664:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5664:2: ( RULE_ID )
            // InternalMyDsl.g:5665:3: RULE_ID
            {
             before(grammarAccess.getRoleSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSet__NameAssignment_1"


    // $ANTLR start "rule__RoleSet__RefAssignment_3"
    // InternalMyDsl.g:5674:1: rule__RoleSet__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RoleSet__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5678:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5679:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5679:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5680:3: ( RULE_ID )
            {
             before(grammarAccess.getRoleSetAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:5681:3: ( RULE_ID )
            // InternalMyDsl.g:5682:4: RULE_ID
            {
             before(grammarAccess.getRoleSetAccess().getRefRoleOneIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleSetAccess().getRefRoleOneIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRoleSetAccess().getRefRoleOneCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSet__RefAssignment_3"


    // $ANTLR start "rule__Protocol__BeginAssignment"
    // InternalMyDsl.g:5693:1: rule__Protocol__BeginAssignment : ( ( rule__Protocol__BeginAlternatives_0 ) ) ;
    public final void rule__Protocol__BeginAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5697:1: ( ( ( rule__Protocol__BeginAlternatives_0 ) ) )
            // InternalMyDsl.g:5698:2: ( ( rule__Protocol__BeginAlternatives_0 ) )
            {
            // InternalMyDsl.g:5698:2: ( ( rule__Protocol__BeginAlternatives_0 ) )
            // InternalMyDsl.g:5699:3: ( rule__Protocol__BeginAlternatives_0 )
            {
             before(grammarAccess.getProtocolAccess().getBeginAlternatives_0()); 
            // InternalMyDsl.g:5700:3: ( rule__Protocol__BeginAlternatives_0 )
            // InternalMyDsl.g:5700:4: rule__Protocol__BeginAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__BeginAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getBeginAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__BeginAssignment"


    // $ANTLR start "rule__EndProtocol__EndAssignment"
    // InternalMyDsl.g:5708:1: rule__EndProtocol__EndAssignment : ( ( 'End' ) ) ;
    public final void rule__EndProtocol__EndAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5712:1: ( ( ( 'End' ) ) )
            // InternalMyDsl.g:5713:2: ( ( 'End' ) )
            {
            // InternalMyDsl.g:5713:2: ( ( 'End' ) )
            // InternalMyDsl.g:5714:3: ( 'End' )
            {
             before(grammarAccess.getEndProtocolAccess().getEndEndKeyword_0()); 
            // InternalMyDsl.g:5715:3: ( 'End' )
            // InternalMyDsl.g:5716:4: 'End'
            {
             before(grammarAccess.getEndProtocolAccess().getEndEndKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEndProtocolAccess().getEndEndKeyword_0()); 

            }

             after(grammarAccess.getEndProtocolAccess().getEndEndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndProtocol__EndAssignment"


    // $ANTLR start "rule__Recursion__NameAssignment_1"
    // InternalMyDsl.g:5727:1: rule__Recursion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5731:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5732:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5732:2: ( RULE_ID )
            // InternalMyDsl.g:5733:3: RULE_ID
            {
             before(grammarAccess.getRecursionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__NameAssignment_1"


    // $ANTLR start "rule__Recursion__RecProtocolAssignment_4"
    // InternalMyDsl.g:5742:1: rule__Recursion__RecProtocolAssignment_4 : ( ruleProtocol ) ;
    public final void rule__Recursion__RecProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5746:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:5747:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:5747:2: ( ruleProtocol )
            // InternalMyDsl.g:5748:3: ruleProtocol
            {
             before(grammarAccess.getRecursionAccess().getRecProtocolProtocolParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getRecursionAccess().getRecProtocolProtocolParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__RecProtocolAssignment_4"


    // $ANTLR start "rule__CloseRecursion__RecursionVariableAssignment_1"
    // InternalMyDsl.g:5757:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5761:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5762:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5762:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5763:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalMyDsl.g:5764:3: ( RULE_ID )
            // InternalMyDsl.g:5765:4: RULE_ID
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursion__RecursionVariableAssignment_1"


    // $ANTLR start "rule__ForEach__LoopRoleAssignment_1"
    // InternalMyDsl.g:5776:1: rule__ForEach__LoopRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEach__LoopRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5780:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:5781:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:5781:2: ( ruleRoleOne )
            // InternalMyDsl.g:5782:3: ruleRoleOne
            {
             before(grammarAccess.getForEachAccess().getLoopRoleRoleOneParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleOne();

            state._fsp--;

             after(grammarAccess.getForEachAccess().getLoopRoleRoleOneParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__LoopRoleAssignment_1"


    // $ANTLR start "rule__ForEach__RolesetAssignment_4"
    // InternalMyDsl.g:5791:1: rule__ForEach__RolesetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RolesetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5795:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5796:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5796:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5797:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRolesetRoleSetCrossReference_4_0()); 
            // InternalMyDsl.g:5798:3: ( RULE_ID )
            // InternalMyDsl.g:5799:4: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getRolesetRoleSetIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRolesetRoleSetIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getForEachAccess().getRolesetRoleSetCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__RolesetAssignment_4"


    // $ANTLR start "rule__ForEach__RefRoleAssignment_6"
    // InternalMyDsl.g:5810:1: rule__ForEach__RefRoleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RefRoleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5814:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5815:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5815:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5816:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_6_0()); 
            // InternalMyDsl.g:5817:3: ( RULE_ID )
            // InternalMyDsl.g:5818:4: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getRefRoleRoleOneIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRefRoleRoleOneIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__RefRoleAssignment_6"


    // $ANTLR start "rule__ForEach__ForBodyAssignment_9"
    // InternalMyDsl.g:5829:1: rule__ForEach__ForBodyAssignment_9 : ( ruleProtocol ) ;
    public final void rule__ForEach__ForBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5833:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:5834:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:5834:2: ( ruleProtocol )
            // InternalMyDsl.g:5835:3: ruleProtocol
            {
             before(grammarAccess.getForEachAccess().getForBodyProtocolParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getForEachAccess().getForBodyProtocolParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__ForBodyAssignment_9"


    // $ANTLR start "rule__ForEach__ProtocolAssignment_12"
    // InternalMyDsl.g:5844:1: rule__ForEach__ProtocolAssignment_12 : ( ruleProtocol ) ;
    public final void rule__ForEach__ProtocolAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5848:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:5849:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:5849:2: ( ruleProtocol )
            // InternalMyDsl.g:5850:3: ruleProtocol
            {
             before(grammarAccess.getForEachAccess().getProtocolProtocolParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getForEachAccess().getProtocolProtocolParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__ProtocolAssignment_12"


    // $ANTLR start "rule__Choice__RoleAssignment_2"
    // InternalMyDsl.g:5859:1: rule__Choice__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5863:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5864:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5864:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5865:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 
            // InternalMyDsl.g:5866:3: ( RULE_ID )
            // InternalMyDsl.g:5867:4: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getRoleRoleOneIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__RoleAssignment_2"


    // $ANTLR start "rule__Choice__BranchesAssignment_4"
    // InternalMyDsl.g:5878:1: rule__Choice__BranchesAssignment_4 : ( ruleMessage ) ;
    public final void rule__Choice__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5882:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:5883:2: ( ruleMessage )
            {
            // InternalMyDsl.g:5883:2: ( ruleMessage )
            // InternalMyDsl.g:5884:3: ruleMessage
            {
             before(grammarAccess.getChoiceAccess().getBranchesMessageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchesMessageParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__BranchesAssignment_4"


    // $ANTLR start "rule__Choice__BranchesAssignment_6_2"
    // InternalMyDsl.g:5893:1: rule__Choice__BranchesAssignment_6_2 : ( ruleMessage ) ;
    public final void rule__Choice__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5897:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:5898:2: ( ruleMessage )
            {
            // InternalMyDsl.g:5898:2: ( ruleMessage )
            // InternalMyDsl.g:5899:3: ruleMessage
            {
             before(grammarAccess.getChoiceAccess().getBranchesMessageParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchesMessageParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__BranchesAssignment_6_2"


    // $ANTLR start "rule__MessageNormal__MessageTypeAssignment_0"
    // InternalMyDsl.g:5908:1: rule__MessageNormal__MessageTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MessageNormal__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5912:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5913:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5913:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5914:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageNormalAccess().getMessageTypeDefinitionCrossReference_0_0()); 
            // InternalMyDsl.g:5915:3: ( RULE_ID )
            // InternalMyDsl.g:5916:4: RULE_ID
            {
             before(grammarAccess.getMessageNormalAccess().getMessageTypeDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageNormalAccess().getMessageTypeDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMessageNormalAccess().getMessageTypeDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__MessageTypeAssignment_0"


    // $ANTLR start "rule__MessageNormal__PayloadAssignment_1_0_1"
    // InternalMyDsl.g:5927:1: rule__MessageNormal__PayloadAssignment_1_0_1 : ( rulePayload ) ;
    public final void rule__MessageNormal__PayloadAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5931:1: ( ( rulePayload ) )
            // InternalMyDsl.g:5932:2: ( rulePayload )
            {
            // InternalMyDsl.g:5932:2: ( rulePayload )
            // InternalMyDsl.g:5933:3: rulePayload
            {
             before(grammarAccess.getMessageNormalAccess().getPayloadPayloadParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePayload();

            state._fsp--;

             after(grammarAccess.getMessageNormalAccess().getPayloadPayloadParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__PayloadAssignment_1_0_1"


    // $ANTLR start "rule__MessageNormal__SenderAssignment_3"
    // InternalMyDsl.g:5942:1: rule__MessageNormal__SenderAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MessageNormal__SenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5946:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5947:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5947:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5948:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageNormalAccess().getSenderRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:5949:3: ( RULE_ID )
            // InternalMyDsl.g:5950:4: RULE_ID
            {
             before(grammarAccess.getMessageNormalAccess().getSenderRoleOneIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageNormalAccess().getSenderRoleOneIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMessageNormalAccess().getSenderRoleOneCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__SenderAssignment_3"


    // $ANTLR start "rule__MessageNormal__ReceiverAssignment_5"
    // InternalMyDsl.g:5961:1: rule__MessageNormal__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__MessageNormal__ReceiverAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5965:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5966:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5966:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5967:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageNormalAccess().getReceiverRoleCrossReference_5_0()); 
            // InternalMyDsl.g:5968:3: ( RULE_ID )
            // InternalMyDsl.g:5969:4: RULE_ID
            {
             before(grammarAccess.getMessageNormalAccess().getReceiverRoleIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageNormalAccess().getReceiverRoleIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMessageNormalAccess().getReceiverRoleCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__ReceiverAssignment_5"


    // $ANTLR start "rule__MessageNormal__ProtocolAssignment_7"
    // InternalMyDsl.g:5980:1: rule__MessageNormal__ProtocolAssignment_7 : ( ruleProtocol ) ;
    public final void rule__MessageNormal__ProtocolAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5984:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:5985:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:5985:2: ( ruleProtocol )
            // InternalMyDsl.g:5986:3: ruleProtocol
            {
             before(grammarAccess.getMessageNormalAccess().getProtocolProtocolParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getMessageNormalAccess().getProtocolProtocolParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormal__ProtocolAssignment_7"


    // $ANTLR start "rule__MessageQuit__MessageTypeAssignment_0"
    // InternalMyDsl.g:5995:1: rule__MessageQuit__MessageTypeAssignment_0 : ( ( 'QUIT' ) ) ;
    public final void rule__MessageQuit__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5999:1: ( ( ( 'QUIT' ) ) )
            // InternalMyDsl.g:6000:2: ( ( 'QUIT' ) )
            {
            // InternalMyDsl.g:6000:2: ( ( 'QUIT' ) )
            // InternalMyDsl.g:6001:3: ( 'QUIT' )
            {
             before(grammarAccess.getMessageQuitAccess().getMessageTypeDefinitionCrossReference_0_0()); 
            // InternalMyDsl.g:6002:3: ( 'QUIT' )
            // InternalMyDsl.g:6003:4: 'QUIT'
            {
             before(grammarAccess.getMessageQuitAccess().getMessageTypeDefinitionQUITKeyword_0_0_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMessageQuitAccess().getMessageTypeDefinitionQUITKeyword_0_0_1()); 

            }

             after(grammarAccess.getMessageQuitAccess().getMessageTypeDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__MessageTypeAssignment_0"


    // $ANTLR start "rule__MessageQuit__SenderAssignment_3"
    // InternalMyDsl.g:6014:1: rule__MessageQuit__SenderAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MessageQuit__SenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6018:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6019:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6019:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6020:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageQuitAccess().getSenderRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:6021:3: ( RULE_ID )
            // InternalMyDsl.g:6022:4: RULE_ID
            {
             before(grammarAccess.getMessageQuitAccess().getSenderRoleOneIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageQuitAccess().getSenderRoleOneIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMessageQuitAccess().getSenderRoleOneCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__SenderAssignment_3"


    // $ANTLR start "rule__MessageQuit__ReceiverAssignment_5"
    // InternalMyDsl.g:6033:1: rule__MessageQuit__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__MessageQuit__ReceiverAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6037:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6038:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6038:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6039:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageQuitAccess().getReceiverRoleCrossReference_5_0()); 
            // InternalMyDsl.g:6040:3: ( RULE_ID )
            // InternalMyDsl.g:6041:4: RULE_ID
            {
             before(grammarAccess.getMessageQuitAccess().getReceiverRoleIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageQuitAccess().getReceiverRoleIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMessageQuitAccess().getReceiverRoleCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__ReceiverAssignment_5"


    // $ANTLR start "rule__Payload__TypesAssignment_0"
    // InternalMyDsl.g:6052:1: rule__Payload__TypesAssignment_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6056:1: ( ( ruleType ) )
            // InternalMyDsl.g:6057:2: ( ruleType )
            {
            // InternalMyDsl.g:6057:2: ( ruleType )
            // InternalMyDsl.g:6058:3: ruleType
            {
             before(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__TypesAssignment_0"


    // $ANTLR start "rule__Payload__TypesAssignment_1_1"
    // InternalMyDsl.g:6067:1: rule__Payload__TypesAssignment_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6071:1: ( ( ruleType ) )
            // InternalMyDsl.g:6072:2: ( ruleType )
            {
            // InternalMyDsl.g:6072:2: ( ruleType )
            // InternalMyDsl.g:6073:3: ruleType
            {
             before(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__TypesAssignment_1_1"


    // $ANTLR start "rule__LocalProtocol__ProtocolNameAssignment_2"
    // InternalMyDsl.g:6082:1: rule__LocalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6086:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6087:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6087:2: ( RULE_ID )
            // InternalMyDsl.g:6088:3: RULE_ID
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getProtocolNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__ProtocolNameAssignment_2"


    // $ANTLR start "rule__LocalProtocol__ProjectedRoleAssignment_4"
    // InternalMyDsl.g:6097:1: rule__LocalProtocol__ProjectedRoleAssignment_4 : ( ruleRole ) ;
    public final void rule__LocalProtocol__ProjectedRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6101:1: ( ( ruleRole ) )
            // InternalMyDsl.g:6102:2: ( ruleRole )
            {
            // InternalMyDsl.g:6102:2: ( ruleRole )
            // InternalMyDsl.g:6103:3: ruleRole
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getLocalProtocolAccess().getProjectedRoleRoleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__ProjectedRoleAssignment_4"


    // $ANTLR start "rule__LocalProtocol__RolesAssignment_6"
    // InternalMyDsl.g:6112:1: rule__LocalProtocol__RolesAssignment_6 : ( ruleRoles ) ;
    public final void rule__LocalProtocol__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6116:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:6117:2: ( ruleRoles )
            {
            // InternalMyDsl.g:6117:2: ( ruleRoles )
            // InternalMyDsl.g:6118:3: ruleRoles
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesRolesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRoles();

            state._fsp--;

             after(grammarAccess.getLocalProtocolAccess().getRolesRolesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__RolesAssignment_6"


    // $ANTLR start "rule__LocalProtocol__ProtocolAssignment_8"
    // InternalMyDsl.g:6127:1: rule__LocalProtocol__ProtocolAssignment_8 : ( ruleProtocolL ) ;
    public final void rule__LocalProtocol__ProtocolAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6131:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:6132:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:6132:2: ( ruleProtocolL )
            // InternalMyDsl.g:6133:3: ruleProtocolL
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__ProtocolAssignment_8"


    // $ANTLR start "rule__ProtocolL__BeginAssignment"
    // InternalMyDsl.g:6142:1: rule__ProtocolL__BeginAssignment : ( ( rule__ProtocolL__BeginAlternatives_0 ) ) ;
    public final void rule__ProtocolL__BeginAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6146:1: ( ( ( rule__ProtocolL__BeginAlternatives_0 ) ) )
            // InternalMyDsl.g:6147:2: ( ( rule__ProtocolL__BeginAlternatives_0 ) )
            {
            // InternalMyDsl.g:6147:2: ( ( rule__ProtocolL__BeginAlternatives_0 ) )
            // InternalMyDsl.g:6148:3: ( rule__ProtocolL__BeginAlternatives_0 )
            {
             before(grammarAccess.getProtocolLAccess().getBeginAlternatives_0()); 
            // InternalMyDsl.g:6149:3: ( rule__ProtocolL__BeginAlternatives_0 )
            // InternalMyDsl.g:6149:4: rule__ProtocolL__BeginAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolL__BeginAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolLAccess().getBeginAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__BeginAssignment"


    // $ANTLR start "rule__RecursionL__NameAssignment_1"
    // InternalMyDsl.g:6157:1: rule__RecursionL__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RecursionL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6161:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6162:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6162:2: ( RULE_ID )
            // InternalMyDsl.g:6163:3: RULE_ID
            {
             before(grammarAccess.getRecursionLAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecursionLAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__NameAssignment_1"


    // $ANTLR start "rule__RecursionL__RecProtocolAssignment_4"
    // InternalMyDsl.g:6172:1: rule__RecursionL__RecProtocolAssignment_4 : ( ruleProtocolL ) ;
    public final void rule__RecursionL__RecProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6176:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:6177:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:6177:2: ( ruleProtocolL )
            // InternalMyDsl.g:6178:3: ruleProtocolL
            {
             before(grammarAccess.getRecursionLAccess().getRecProtocolProtocolLParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getRecursionLAccess().getRecProtocolProtocolLParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecursionL__RecProtocolAssignment_4"


    // $ANTLR start "rule__CloseRecursionL__RecursionVariableAssignment_1"
    // InternalMyDsl.g:6187:1: rule__CloseRecursionL__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursionL__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6191:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6192:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6192:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6193:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLCrossReference_1_0()); 
            // InternalMyDsl.g:6194:3: ( RULE_ID )
            // InternalMyDsl.g:6195:4: RULE_ID
            {
             before(grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursionL__RecursionVariableAssignment_1"


    // $ANTLR start "rule__MessageNormalL__MessageTypeAssignment_0"
    // InternalMyDsl.g:6206:1: rule__MessageNormalL__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageNormalL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6210:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6211:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6211:2: ( RULE_ID )
            // InternalMyDsl.g:6212:3: RULE_ID
            {
             before(grammarAccess.getMessageNormalLAccess().getMessageTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageNormalLAccess().getMessageTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__MessageTypeAssignment_0"


    // $ANTLR start "rule__MessageNormalL__PayloadAssignment_1_0_1"
    // InternalMyDsl.g:6221:1: rule__MessageNormalL__PayloadAssignment_1_0_1 : ( rulePayload ) ;
    public final void rule__MessageNormalL__PayloadAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6225:1: ( ( rulePayload ) )
            // InternalMyDsl.g:6226:2: ( rulePayload )
            {
            // InternalMyDsl.g:6226:2: ( rulePayload )
            // InternalMyDsl.g:6227:3: rulePayload
            {
             before(grammarAccess.getMessageNormalLAccess().getPayloadPayloadParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePayload();

            state._fsp--;

             after(grammarAccess.getMessageNormalLAccess().getPayloadPayloadParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__PayloadAssignment_1_0_1"


    // $ANTLR start "rule__MessageNormalL__SendReceiveAssignment_2"
    // InternalMyDsl.g:6236:1: rule__MessageNormalL__SendReceiveAssignment_2 : ( ruleMessageType ) ;
    public final void rule__MessageNormalL__SendReceiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6240:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:6241:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:6241:2: ( ruleMessageType )
            // InternalMyDsl.g:6242:3: ruleMessageType
            {
             before(grammarAccess.getMessageNormalLAccess().getSendReceiveMessageTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageNormalLAccess().getSendReceiveMessageTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__SendReceiveAssignment_2"


    // $ANTLR start "rule__MessageNormalL__ProtocolAssignment_4"
    // InternalMyDsl.g:6251:1: rule__MessageNormalL__ProtocolAssignment_4 : ( ruleProtocolL ) ;
    public final void rule__MessageNormalL__ProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6255:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:6256:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:6256:2: ( ruleProtocolL )
            // InternalMyDsl.g:6257:3: ruleProtocolL
            {
             before(grammarAccess.getMessageNormalLAccess().getProtocolProtocolLParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getMessageNormalLAccess().getProtocolProtocolLParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageNormalL__ProtocolAssignment_4"


    // $ANTLR start "rule__MessageQuitL__MessageTypeAssignment_0"
    // InternalMyDsl.g:6266:1: rule__MessageQuitL__MessageTypeAssignment_0 : ( ( 'QUIT' ) ) ;
    public final void rule__MessageQuitL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6270:1: ( ( ( 'QUIT' ) ) )
            // InternalMyDsl.g:6271:2: ( ( 'QUIT' ) )
            {
            // InternalMyDsl.g:6271:2: ( ( 'QUIT' ) )
            // InternalMyDsl.g:6272:3: ( 'QUIT' )
            {
             before(grammarAccess.getMessageQuitLAccess().getMessageTypeQUITKeyword_0_0()); 
            // InternalMyDsl.g:6273:3: ( 'QUIT' )
            // InternalMyDsl.g:6274:4: 'QUIT'
            {
             before(grammarAccess.getMessageQuitLAccess().getMessageTypeQUITKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMessageQuitLAccess().getMessageTypeQUITKeyword_0_0()); 

            }

             after(grammarAccess.getMessageQuitLAccess().getMessageTypeQUITKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuitL__MessageTypeAssignment_0"


    // $ANTLR start "rule__MessageQuitL__SendReceiveAssignment_2"
    // InternalMyDsl.g:6285:1: rule__MessageQuitL__SendReceiveAssignment_2 : ( ruleMessageType ) ;
    public final void rule__MessageQuitL__SendReceiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6289:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:6290:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:6290:2: ( ruleMessageType )
            // InternalMyDsl.g:6291:3: ruleMessageType
            {
             before(grammarAccess.getMessageQuitLAccess().getSendReceiveMessageTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageQuitLAccess().getSendReceiveMessageTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuitL__SendReceiveAssignment_2"


    // $ANTLR start "rule__SenderL__RoleAssignment_1"
    // InternalMyDsl.g:6300:1: rule__SenderL__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SenderL__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6304:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6305:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6305:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6306:3: ( RULE_ID )
            {
             before(grammarAccess.getSenderLAccess().getRoleRoleCrossReference_1_0()); 
            // InternalMyDsl.g:6307:3: ( RULE_ID )
            // InternalMyDsl.g:6308:4: RULE_ID
            {
             before(grammarAccess.getSenderLAccess().getRoleRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSenderLAccess().getRoleRoleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSenderLAccess().getRoleRoleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SenderL__RoleAssignment_1"


    // $ANTLR start "rule__ReceiverL__RoleAssignment_1"
    // InternalMyDsl.g:6319:1: rule__ReceiverL__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReceiverL__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6323:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6324:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6324:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6325:3: ( RULE_ID )
            {
             before(grammarAccess.getReceiverLAccess().getRoleRoleCrossReference_1_0()); 
            // InternalMyDsl.g:6326:3: ( RULE_ID )
            // InternalMyDsl.g:6327:4: RULE_ID
            {
             before(grammarAccess.getReceiverLAccess().getRoleRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReceiverLAccess().getRoleRoleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReceiverLAccess().getRoleRoleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverL__RoleAssignment_1"


    // $ANTLR start "rule__ChoiceL__RoleMakingChoiceAssignment_2"
    // InternalMyDsl.g:6338:1: rule__ChoiceL__RoleMakingChoiceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChoiceL__RoleMakingChoiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6342:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6343:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6343:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6344:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleCrossReference_2_0()); 
            // InternalMyDsl.g:6345:3: ( RULE_ID )
            // InternalMyDsl.g:6346:4: RULE_ID
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__RoleMakingChoiceAssignment_2"


    // $ANTLR start "rule__ChoiceL__BranchesAssignment_4"
    // InternalMyDsl.g:6357:1: rule__ChoiceL__BranchesAssignment_4 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6361:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:6362:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:6362:2: ( ruleMessageL )
            // InternalMyDsl.g:6363:3: ruleMessageL
            {
             before(grammarAccess.getChoiceLAccess().getBranchesMessageLParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageL();

            state._fsp--;

             after(grammarAccess.getChoiceLAccess().getBranchesMessageLParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__BranchesAssignment_4"


    // $ANTLR start "rule__ChoiceL__BranchesAssignment_6_2"
    // InternalMyDsl.g:6372:1: rule__ChoiceL__BranchesAssignment_6_2 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6376:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:6377:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:6377:2: ( ruleMessageL )
            // InternalMyDsl.g:6378:3: ruleMessageL
            {
             before(grammarAccess.getChoiceLAccess().getBranchesMessageLParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageL();

            state._fsp--;

             after(grammarAccess.getChoiceLAccess().getBranchesMessageLParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__BranchesAssignment_6_2"


    // $ANTLR start "rule__ForEachL__EachRoleAssignment_1"
    // InternalMyDsl.g:6387:1: rule__ForEachL__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEachL__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6391:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:6392:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:6392:2: ( ruleRoleOne )
            // InternalMyDsl.g:6393:3: ruleRoleOne
            {
             before(grammarAccess.getForEachLAccess().getEachRoleRoleOneParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleOne();

            state._fsp--;

             after(grammarAccess.getForEachLAccess().getEachRoleRoleOneParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__EachRoleAssignment_1"


    // $ANTLR start "rule__ForEachL__RolesetAssignment_4"
    // InternalMyDsl.g:6402:1: rule__ForEachL__RolesetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RolesetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6406:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6407:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6407:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6408:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRolesetRoleSetCrossReference_4_0()); 
            // InternalMyDsl.g:6409:3: ( RULE_ID )
            // InternalMyDsl.g:6410:4: RULE_ID
            {
             before(grammarAccess.getForEachLAccess().getRolesetRoleSetIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getRolesetRoleSetIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getForEachLAccess().getRolesetRoleSetCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__RolesetAssignment_4"


    // $ANTLR start "rule__ForEachL__RefroleAssignment_6"
    // InternalMyDsl.g:6421:1: rule__ForEachL__RefroleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RefroleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6425:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6426:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6426:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6427:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRefroleRoleOneCrossReference_6_0()); 
            // InternalMyDsl.g:6428:3: ( RULE_ID )
            // InternalMyDsl.g:6429:4: RULE_ID
            {
             before(grammarAccess.getForEachLAccess().getRefroleRoleOneIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getRefroleRoleOneIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getForEachLAccess().getRefroleRoleOneCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__RefroleAssignment_6"


    // $ANTLR start "rule__ForEachL__BranchAssignment_9"
    // InternalMyDsl.g:6440:1: rule__ForEachL__BranchAssignment_9 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__BranchAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6444:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:6445:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:6445:2: ( ruleProtocolL )
            // InternalMyDsl.g:6446:3: ruleProtocolL
            {
             before(grammarAccess.getForEachLAccess().getBranchProtocolLParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getForEachLAccess().getBranchProtocolLParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__BranchAssignment_9"


    // $ANTLR start "rule__ForEachL__ProtocolAssignment_12"
    // InternalMyDsl.g:6455:1: rule__ForEachL__ProtocolAssignment_12 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__ProtocolAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6459:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:6460:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:6460:2: ( ruleProtocolL )
            // InternalMyDsl.g:6461:3: ruleProtocolL
            {
             before(grammarAccess.getForEachLAccess().getProtocolProtocolLParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getForEachLAccess().getProtocolProtocolLParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__ProtocolAssignment_12"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000E8000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000300234000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000021E000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000310234000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003000000000L});

}