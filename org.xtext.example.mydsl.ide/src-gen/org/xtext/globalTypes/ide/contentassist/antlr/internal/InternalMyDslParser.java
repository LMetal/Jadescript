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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'()'", "'){'", "'int'", "'string'", "'action'", "'global'", "'protocol'", "'('", "'}'", "','", "'role'", "'roleset'", "':'", "'rec'", "'{'", "'loop'", "'for'", "'<'", "'>'", "';'", "'choice'", "'at'", "'or'", "'from'", "'to'", "'.'", "')'", "'local'", "'foreach'", "'End'", "'QUIT'"
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
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Alternatives ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Alternatives ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Alternatives )
            // InternalMyDsl.g:69:4: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleRoles"
    // InternalMyDsl.g:103:1: entryRuleRoles : ruleRoles EOF ;
    public final void entryRuleRoles() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleRoles EOF )
            // InternalMyDsl.g:105:1: ruleRoles EOF
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
    // InternalMyDsl.g:112:1: ruleRoles : ( ( rule__Roles__Group__0 ) ) ;
    public final void ruleRoles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Roles__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Roles__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Roles__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Roles__Group__0 )
            {
             before(grammarAccess.getRolesAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Roles__Group__0 )
            // InternalMyDsl.g:119:4: rule__Roles__Group__0
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
    // InternalMyDsl.g:128:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRole EOF )
            // InternalMyDsl.g:130:1: ruleRole EOF
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
    // InternalMyDsl.g:137:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Role__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Role__Alternatives )
            // InternalMyDsl.g:144:4: rule__Role__Alternatives
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
    // InternalMyDsl.g:153:1: entryRuleRoleOne : ruleRoleOne EOF ;
    public final void entryRuleRoleOne() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleRoleOne EOF )
            // InternalMyDsl.g:155:1: ruleRoleOne EOF
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
    // InternalMyDsl.g:162:1: ruleRoleOne : ( ( rule__RoleOne__Group__0 ) ) ;
    public final void ruleRoleOne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__RoleOne__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__RoleOne__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__RoleOne__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__RoleOne__Group__0 )
            {
             before(grammarAccess.getRoleOneAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__RoleOne__Group__0 )
            // InternalMyDsl.g:169:4: rule__RoleOne__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleRoleSet : ruleRoleSet EOF ;
    public final void entryRuleRoleSet() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleRoleSet EOF )
            // InternalMyDsl.g:180:1: ruleRoleSet EOF
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
    // InternalMyDsl.g:187:1: ruleRoleSet : ( ( rule__RoleSet__Group__0 ) ) ;
    public final void ruleRoleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__RoleSet__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__RoleSet__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__RoleSet__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__RoleSet__Group__0 )
            {
             before(grammarAccess.getRoleSetAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__RoleSet__Group__0 )
            // InternalMyDsl.g:194:4: rule__RoleSet__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleProtocol EOF )
            // InternalMyDsl.g:205:1: ruleProtocol EOF
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
    // InternalMyDsl.g:212:1: ruleProtocol : ( ( rule__Protocol__BeginAssignment ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Protocol__BeginAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Protocol__BeginAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Protocol__BeginAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__Protocol__BeginAssignment )
            {
             before(grammarAccess.getProtocolAccess().getBeginAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__Protocol__BeginAssignment )
            // InternalMyDsl.g:219:4: rule__Protocol__BeginAssignment
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
    // InternalMyDsl.g:228:1: entryRuleEndProtocol : ruleEndProtocol EOF ;
    public final void entryRuleEndProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleEndProtocol EOF )
            // InternalMyDsl.g:230:1: ruleEndProtocol EOF
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
    // InternalMyDsl.g:237:1: ruleEndProtocol : ( ( rule__EndProtocol__EndAssignment ) ) ;
    public final void ruleEndProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__EndProtocol__EndAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__EndProtocol__EndAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__EndProtocol__EndAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__EndProtocol__EndAssignment )
            {
             before(grammarAccess.getEndProtocolAccess().getEndAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__EndProtocol__EndAssignment )
            // InternalMyDsl.g:244:4: rule__EndProtocol__EndAssignment
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
    // InternalMyDsl.g:253:1: entryRuleRecursion : ruleRecursion EOF ;
    public final void entryRuleRecursion() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleRecursion EOF )
            // InternalMyDsl.g:255:1: ruleRecursion EOF
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
    // InternalMyDsl.g:262:1: ruleRecursion : ( ( rule__Recursion__Group__0 ) ) ;
    public final void ruleRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Recursion__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Recursion__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Recursion__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Recursion__Group__0 )
            {
             before(grammarAccess.getRecursionAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Recursion__Group__0 )
            // InternalMyDsl.g:269:4: rule__Recursion__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleCloseRecursion : ruleCloseRecursion EOF ;
    public final void entryRuleCloseRecursion() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleCloseRecursion EOF )
            // InternalMyDsl.g:280:1: ruleCloseRecursion EOF
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
    // InternalMyDsl.g:287:1: ruleCloseRecursion : ( ( rule__CloseRecursion__Group__0 ) ) ;
    public final void ruleCloseRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__CloseRecursion__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__CloseRecursion__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__CloseRecursion__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__CloseRecursion__Group__0 )
            {
             before(grammarAccess.getCloseRecursionAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__CloseRecursion__Group__0 )
            // InternalMyDsl.g:294:4: rule__CloseRecursion__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleForEach : ruleForEach EOF ;
    public final void entryRuleForEach() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleForEach EOF )
            // InternalMyDsl.g:305:1: ruleForEach EOF
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
    // InternalMyDsl.g:312:1: ruleForEach : ( ( rule__ForEach__Group__0 ) ) ;
    public final void ruleForEach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ForEach__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ForEach__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ForEach__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ForEach__Group__0 )
            {
             before(grammarAccess.getForEachAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ForEach__Group__0 )
            // InternalMyDsl.g:319:4: rule__ForEach__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleChoice EOF )
            // InternalMyDsl.g:330:1: ruleChoice EOF
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
    // InternalMyDsl.g:337:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Choice__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Choice__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Choice__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Choice__Group__0 )
            // InternalMyDsl.g:344:4: rule__Choice__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleMessage EOF )
            // InternalMyDsl.g:355:1: ruleMessage EOF
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
    // InternalMyDsl.g:362:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Message__Alternatives ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Message__Alternatives ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Message__Alternatives ) )
            // InternalMyDsl.g:368:3: ( rule__Message__Alternatives )
            {
             before(grammarAccess.getMessageAccess().getAlternatives()); 
            // InternalMyDsl.g:369:3: ( rule__Message__Alternatives )
            // InternalMyDsl.g:369:4: rule__Message__Alternatives
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
    // InternalMyDsl.g:378:1: entryRuleMessageNormal : ruleMessageNormal EOF ;
    public final void entryRuleMessageNormal() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleMessageNormal EOF )
            // InternalMyDsl.g:380:1: ruleMessageNormal EOF
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
    // InternalMyDsl.g:387:1: ruleMessageNormal : ( ( rule__MessageNormal__Group__0 ) ) ;
    public final void ruleMessageNormal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__MessageNormal__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__MessageNormal__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__MessageNormal__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__MessageNormal__Group__0 )
            {
             before(grammarAccess.getMessageNormalAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__MessageNormal__Group__0 )
            // InternalMyDsl.g:394:4: rule__MessageNormal__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleMessageQuit : ruleMessageQuit EOF ;
    public final void entryRuleMessageQuit() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleMessageQuit EOF )
            // InternalMyDsl.g:405:1: ruleMessageQuit EOF
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
    // InternalMyDsl.g:412:1: ruleMessageQuit : ( ( rule__MessageQuit__Group__0 ) ) ;
    public final void ruleMessageQuit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__MessageQuit__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__MessageQuit__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__MessageQuit__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__MessageQuit__Group__0 )
            {
             before(grammarAccess.getMessageQuitAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__MessageQuit__Group__0 )
            // InternalMyDsl.g:419:4: rule__MessageQuit__Group__0
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
    // InternalMyDsl.g:428:1: entryRulePayload : rulePayload EOF ;
    public final void entryRulePayload() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( rulePayload EOF )
            // InternalMyDsl.g:430:1: rulePayload EOF
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
    // InternalMyDsl.g:437:1: rulePayload : ( ( rule__Payload__Group__0 ) ) ;
    public final void rulePayload() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Payload__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Payload__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Payload__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Payload__Group__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Payload__Group__0 )
            // InternalMyDsl.g:444:4: rule__Payload__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleLocalProtocol : ruleLocalProtocol EOF ;
    public final void entryRuleLocalProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleLocalProtocol EOF )
            // InternalMyDsl.g:455:1: ruleLocalProtocol EOF
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
    // InternalMyDsl.g:462:1: ruleLocalProtocol : ( ( rule__LocalProtocol__Group__0 ) ) ;
    public final void ruleLocalProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__LocalProtocol__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__LocalProtocol__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__LocalProtocol__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__LocalProtocol__Group__0 )
            {
             before(grammarAccess.getLocalProtocolAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__LocalProtocol__Group__0 )
            // InternalMyDsl.g:469:4: rule__LocalProtocol__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleProtocolL : ruleProtocolL EOF ;
    public final void entryRuleProtocolL() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleProtocolL EOF )
            // InternalMyDsl.g:480:1: ruleProtocolL EOF
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
    // InternalMyDsl.g:487:1: ruleProtocolL : ( ( rule__ProtocolL__BeginAssignment ) ) ;
    public final void ruleProtocolL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__ProtocolL__BeginAssignment ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__ProtocolL__BeginAssignment ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__ProtocolL__BeginAssignment ) )
            // InternalMyDsl.g:493:3: ( rule__ProtocolL__BeginAssignment )
            {
             before(grammarAccess.getProtocolLAccess().getBeginAssignment()); 
            // InternalMyDsl.g:494:3: ( rule__ProtocolL__BeginAssignment )
            // InternalMyDsl.g:494:4: rule__ProtocolL__BeginAssignment
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
    // InternalMyDsl.g:503:1: entryRuleRecursionL : ruleRecursionL EOF ;
    public final void entryRuleRecursionL() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleRecursionL EOF )
            // InternalMyDsl.g:505:1: ruleRecursionL EOF
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
    // InternalMyDsl.g:512:1: ruleRecursionL : ( ( rule__RecursionL__Group__0 ) ) ;
    public final void ruleRecursionL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__RecursionL__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__RecursionL__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__RecursionL__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__RecursionL__Group__0 )
            {
             before(grammarAccess.getRecursionLAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__RecursionL__Group__0 )
            // InternalMyDsl.g:519:4: rule__RecursionL__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleCloseRecursionL : ruleCloseRecursionL EOF ;
    public final void entryRuleCloseRecursionL() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleCloseRecursionL EOF )
            // InternalMyDsl.g:530:1: ruleCloseRecursionL EOF
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
    // InternalMyDsl.g:537:1: ruleCloseRecursionL : ( ( rule__CloseRecursionL__Group__0 ) ) ;
    public final void ruleCloseRecursionL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__CloseRecursionL__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__CloseRecursionL__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__CloseRecursionL__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__CloseRecursionL__Group__0 )
            {
             before(grammarAccess.getCloseRecursionLAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__CloseRecursionL__Group__0 )
            // InternalMyDsl.g:544:4: rule__CloseRecursionL__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleMessageL : ruleMessageL EOF ;
    public final void entryRuleMessageL() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleMessageL EOF )
            // InternalMyDsl.g:555:1: ruleMessageL EOF
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
    // InternalMyDsl.g:562:1: ruleMessageL : ( ( rule__MessageL__Alternatives ) ) ;
    public final void ruleMessageL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__MessageL__Alternatives ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__MessageL__Alternatives ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__MessageL__Alternatives ) )
            // InternalMyDsl.g:568:3: ( rule__MessageL__Alternatives )
            {
             before(grammarAccess.getMessageLAccess().getAlternatives()); 
            // InternalMyDsl.g:569:3: ( rule__MessageL__Alternatives )
            // InternalMyDsl.g:569:4: rule__MessageL__Alternatives
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
    // InternalMyDsl.g:578:1: entryRuleMessageNormalL : ruleMessageNormalL EOF ;
    public final void entryRuleMessageNormalL() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleMessageNormalL EOF )
            // InternalMyDsl.g:580:1: ruleMessageNormalL EOF
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
    // InternalMyDsl.g:587:1: ruleMessageNormalL : ( ( rule__MessageNormalL__Group__0 ) ) ;
    public final void ruleMessageNormalL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__MessageNormalL__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__MessageNormalL__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__MessageNormalL__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__MessageNormalL__Group__0 )
            {
             before(grammarAccess.getMessageNormalLAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__MessageNormalL__Group__0 )
            // InternalMyDsl.g:594:4: rule__MessageNormalL__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleMessageQuitL : ruleMessageQuitL EOF ;
    public final void entryRuleMessageQuitL() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleMessageQuitL EOF )
            // InternalMyDsl.g:605:1: ruleMessageQuitL EOF
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
    // InternalMyDsl.g:612:1: ruleMessageQuitL : ( ( rule__MessageQuitL__Group__0 ) ) ;
    public final void ruleMessageQuitL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__MessageQuitL__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__MessageQuitL__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__MessageQuitL__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__MessageQuitL__Group__0 )
            {
             before(grammarAccess.getMessageQuitLAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__MessageQuitL__Group__0 )
            // InternalMyDsl.g:619:4: rule__MessageQuitL__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleMessageType : ruleMessageType EOF ;
    public final void entryRuleMessageType() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleMessageType EOF )
            // InternalMyDsl.g:630:1: ruleMessageType EOF
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
    // InternalMyDsl.g:637:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__MessageType__Alternatives ) )
            // InternalMyDsl.g:643:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:644:3: ( rule__MessageType__Alternatives )
            // InternalMyDsl.g:644:4: rule__MessageType__Alternatives
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
    // InternalMyDsl.g:653:1: entryRuleSenderL : ruleSenderL EOF ;
    public final void entryRuleSenderL() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleSenderL EOF )
            // InternalMyDsl.g:655:1: ruleSenderL EOF
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
    // InternalMyDsl.g:662:1: ruleSenderL : ( ( rule__SenderL__Group__0 ) ) ;
    public final void ruleSenderL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__SenderL__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__SenderL__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__SenderL__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__SenderL__Group__0 )
            {
             before(grammarAccess.getSenderLAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__SenderL__Group__0 )
            // InternalMyDsl.g:669:4: rule__SenderL__Group__0
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
    // InternalMyDsl.g:678:1: entryRuleReceiverL : ruleReceiverL EOF ;
    public final void entryRuleReceiverL() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleReceiverL EOF )
            // InternalMyDsl.g:680:1: ruleReceiverL EOF
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
    // InternalMyDsl.g:687:1: ruleReceiverL : ( ( rule__ReceiverL__Group__0 ) ) ;
    public final void ruleReceiverL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__ReceiverL__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__ReceiverL__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__ReceiverL__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__ReceiverL__Group__0 )
            {
             before(grammarAccess.getReceiverLAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__ReceiverL__Group__0 )
            // InternalMyDsl.g:694:4: rule__ReceiverL__Group__0
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
    // InternalMyDsl.g:703:1: entryRuleChoiceL : ruleChoiceL EOF ;
    public final void entryRuleChoiceL() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleChoiceL EOF )
            // InternalMyDsl.g:705:1: ruleChoiceL EOF
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
    // InternalMyDsl.g:712:1: ruleChoiceL : ( ( rule__ChoiceL__Group__0 ) ) ;
    public final void ruleChoiceL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__ChoiceL__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__ChoiceL__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__ChoiceL__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__ChoiceL__Group__0 )
            {
             before(grammarAccess.getChoiceLAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__ChoiceL__Group__0 )
            // InternalMyDsl.g:719:4: rule__ChoiceL__Group__0
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
    // InternalMyDsl.g:728:1: entryRuleForEachL : ruleForEachL EOF ;
    public final void entryRuleForEachL() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleForEachL EOF )
            // InternalMyDsl.g:730:1: ruleForEachL EOF
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
    // InternalMyDsl.g:737:1: ruleForEachL : ( ( rule__ForEachL__Group__0 ) ) ;
    public final void ruleForEachL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__ForEachL__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__ForEachL__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__ForEachL__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__ForEachL__Group__0 )
            {
             before(grammarAccess.getForEachLAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__ForEachL__Group__0 )
            // InternalMyDsl.g:744:4: rule__ForEachL__Group__0
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
    // InternalMyDsl.g:753:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleType EOF )
            // InternalMyDsl.g:755:1: ruleType EOF
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
    // InternalMyDsl.g:762:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:768:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:769:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:769:4: rule__Type__Alternatives
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


    // $ANTLR start "rule__Model__Alternatives"
    // InternalMyDsl.g:777:1: rule__Model__Alternatives : ( ( ( rule__Model__ProtocolAssignment_0 ) ) | ( ( rule__Model__ProtocolAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( ( ( rule__Model__ProtocolAssignment_0 ) ) | ( ( rule__Model__ProtocolAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==38) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:782:2: ( ( rule__Model__ProtocolAssignment_0 ) )
                    {
                    // InternalMyDsl.g:782:2: ( ( rule__Model__ProtocolAssignment_0 ) )
                    // InternalMyDsl.g:783:3: ( rule__Model__ProtocolAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_0()); 
                    // InternalMyDsl.g:784:3: ( rule__Model__ProtocolAssignment_0 )
                    // InternalMyDsl.g:784:4: rule__Model__ProtocolAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ProtocolAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getProtocolAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:788:2: ( ( rule__Model__ProtocolAssignment_1 ) )
                    {
                    // InternalMyDsl.g:788:2: ( ( rule__Model__ProtocolAssignment_1 ) )
                    // InternalMyDsl.g:789:3: ( rule__Model__ProtocolAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_1()); 
                    // InternalMyDsl.g:790:3: ( rule__Model__ProtocolAssignment_1 )
                    // InternalMyDsl.g:790:4: rule__Model__ProtocolAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ProtocolAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getProtocolAssignment_1()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Role__Alternatives"
    // InternalMyDsl.g:798:1: rule__Role__Alternatives : ( ( ruleRoleOne ) | ( ruleRoleSet ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:802:1: ( ( ruleRoleOne ) | ( ruleRoleSet ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:803:2: ( ruleRoleOne )
                    {
                    // InternalMyDsl.g:803:2: ( ruleRoleOne )
                    // InternalMyDsl.g:804:3: ruleRoleOne
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
                    // InternalMyDsl.g:809:2: ( ruleRoleSet )
                    {
                    // InternalMyDsl.g:809:2: ( ruleRoleSet )
                    // InternalMyDsl.g:810:3: ruleRoleSet
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
    // InternalMyDsl.g:819:1: rule__Protocol__BeginAlternatives_0 : ( ( ruleChoice ) | ( ruleMessage ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) | ( ruleEndProtocol ) );
    public final void rule__Protocol__BeginAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:823:1: ( ( ruleChoice ) | ( ruleMessage ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) | ( ruleEndProtocol ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
            case 41:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            case 40:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:824:2: ( ruleChoice )
                    {
                    // InternalMyDsl.g:824:2: ( ruleChoice )
                    // InternalMyDsl.g:825:3: ruleChoice
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
                    // InternalMyDsl.g:830:2: ( ruleMessage )
                    {
                    // InternalMyDsl.g:830:2: ( ruleMessage )
                    // InternalMyDsl.g:831:3: ruleMessage
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
                    // InternalMyDsl.g:836:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:836:2: ( ruleRecursion )
                    // InternalMyDsl.g:837:3: ruleRecursion
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
                    // InternalMyDsl.g:842:2: ( ruleForEach )
                    {
                    // InternalMyDsl.g:842:2: ( ruleForEach )
                    // InternalMyDsl.g:843:3: ruleForEach
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
                    // InternalMyDsl.g:848:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:848:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:849:3: ruleCloseRecursion
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
                    // InternalMyDsl.g:854:2: ( ruleEndProtocol )
                    {
                    // InternalMyDsl.g:854:2: ( ruleEndProtocol )
                    // InternalMyDsl.g:855:3: ruleEndProtocol
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
    // InternalMyDsl.g:864:1: rule__Message__Alternatives : ( ( ruleMessageNormal ) | ( ruleMessageQuit ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( ( ruleMessageNormal ) | ( ruleMessageQuit ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==41) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:869:2: ( ruleMessageNormal )
                    {
                    // InternalMyDsl.g:869:2: ( ruleMessageNormal )
                    // InternalMyDsl.g:870:3: ruleMessageNormal
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
                    // InternalMyDsl.g:875:2: ( ruleMessageQuit )
                    {
                    // InternalMyDsl.g:875:2: ( ruleMessageQuit )
                    // InternalMyDsl.g:876:3: ruleMessageQuit
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
    // InternalMyDsl.g:885:1: rule__MessageNormal__Alternatives_1 : ( ( ( rule__MessageNormal__Group_1_0__0 ) ) | ( '()' ) );
    public final void rule__MessageNormal__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:889:1: ( ( ( rule__MessageNormal__Group_1_0__0 ) ) | ( '()' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:890:2: ( ( rule__MessageNormal__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:890:2: ( ( rule__MessageNormal__Group_1_0__0 ) )
                    // InternalMyDsl.g:891:3: ( rule__MessageNormal__Group_1_0__0 )
                    {
                     before(grammarAccess.getMessageNormalAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:892:3: ( rule__MessageNormal__Group_1_0__0 )
                    // InternalMyDsl.g:892:4: rule__MessageNormal__Group_1_0__0
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
                    // InternalMyDsl.g:896:2: ( '()' )
                    {
                    // InternalMyDsl.g:896:2: ( '()' )
                    // InternalMyDsl.g:897:3: '()'
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
    // InternalMyDsl.g:906:1: rule__LocalProtocol__Alternatives_7 : ( ( '){' ) | ( ( rule__LocalProtocol__Group_7_1__0 ) ) );
    public final void rule__LocalProtocol__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( ( '){' ) | ( ( rule__LocalProtocol__Group_7_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
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
                    // InternalMyDsl.g:911:2: ( '){' )
                    {
                    // InternalMyDsl.g:911:2: ( '){' )
                    // InternalMyDsl.g:912:3: '){'
                    {
                     before(grammarAccess.getLocalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_7_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLocalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:917:2: ( ( rule__LocalProtocol__Group_7_1__0 ) )
                    {
                    // InternalMyDsl.g:917:2: ( ( rule__LocalProtocol__Group_7_1__0 ) )
                    // InternalMyDsl.g:918:3: ( rule__LocalProtocol__Group_7_1__0 )
                    {
                     before(grammarAccess.getLocalProtocolAccess().getGroup_7_1()); 
                    // InternalMyDsl.g:919:3: ( rule__LocalProtocol__Group_7_1__0 )
                    // InternalMyDsl.g:919:4: rule__LocalProtocol__Group_7_1__0
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
    // InternalMyDsl.g:927:1: rule__ProtocolL__BeginAlternatives_0 : ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursionL ) | ( ruleCloseRecursionL ) | ( ruleEndProtocol ) );
    public final void rule__ProtocolL__BeginAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursionL ) | ( ruleCloseRecursionL ) | ( ruleEndProtocol ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 41:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 39:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 40:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:932:2: ( ruleMessageL )
                    {
                    // InternalMyDsl.g:932:2: ( ruleMessageL )
                    // InternalMyDsl.g:933:3: ruleMessageL
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
                    // InternalMyDsl.g:938:2: ( ruleChoiceL )
                    {
                    // InternalMyDsl.g:938:2: ( ruleChoiceL )
                    // InternalMyDsl.g:939:3: ruleChoiceL
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
                    // InternalMyDsl.g:944:2: ( ruleForEachL )
                    {
                    // InternalMyDsl.g:944:2: ( ruleForEachL )
                    // InternalMyDsl.g:945:3: ruleForEachL
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
                    // InternalMyDsl.g:950:2: ( ruleRecursionL )
                    {
                    // InternalMyDsl.g:950:2: ( ruleRecursionL )
                    // InternalMyDsl.g:951:3: ruleRecursionL
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
                    // InternalMyDsl.g:956:2: ( ruleCloseRecursionL )
                    {
                    // InternalMyDsl.g:956:2: ( ruleCloseRecursionL )
                    // InternalMyDsl.g:957:3: ruleCloseRecursionL
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
                    // InternalMyDsl.g:962:2: ( ruleEndProtocol )
                    {
                    // InternalMyDsl.g:962:2: ( ruleEndProtocol )
                    // InternalMyDsl.g:963:3: ruleEndProtocol
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
    // InternalMyDsl.g:972:1: rule__MessageL__Alternatives : ( ( ruleMessageNormalL ) | ( ruleMessageQuitL ) );
    public final void rule__MessageL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( ( ruleMessageNormalL ) | ( ruleMessageQuitL ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==41) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:977:2: ( ruleMessageNormalL )
                    {
                    // InternalMyDsl.g:977:2: ( ruleMessageNormalL )
                    // InternalMyDsl.g:978:3: ruleMessageNormalL
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
                    // InternalMyDsl.g:983:2: ( ruleMessageQuitL )
                    {
                    // InternalMyDsl.g:983:2: ( ruleMessageQuitL )
                    // InternalMyDsl.g:984:3: ruleMessageQuitL
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
    // InternalMyDsl.g:993:1: rule__MessageNormalL__Alternatives_1 : ( ( ( rule__MessageNormalL__Group_1_0__0 ) ) | ( '()' ) );
    public final void rule__MessageNormalL__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( ( ( rule__MessageNormalL__Group_1_0__0 ) ) | ( '()' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==11) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:998:2: ( ( rule__MessageNormalL__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:998:2: ( ( rule__MessageNormalL__Group_1_0__0 ) )
                    // InternalMyDsl.g:999:3: ( rule__MessageNormalL__Group_1_0__0 )
                    {
                     before(grammarAccess.getMessageNormalLAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:1000:3: ( rule__MessageNormalL__Group_1_0__0 )
                    // InternalMyDsl.g:1000:4: rule__MessageNormalL__Group_1_0__0
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
                    // InternalMyDsl.g:1004:2: ( '()' )
                    {
                    // InternalMyDsl.g:1004:2: ( '()' )
                    // InternalMyDsl.g:1005:3: '()'
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
    // InternalMyDsl.g:1014:1: rule__MessageType__Alternatives : ( ( ruleSenderL ) | ( ruleReceiverL ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( ( ruleSenderL ) | ( ruleReceiverL ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1019:2: ( ruleSenderL )
                    {
                    // InternalMyDsl.g:1019:2: ( ruleSenderL )
                    // InternalMyDsl.g:1020:3: ruleSenderL
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
                    // InternalMyDsl.g:1025:2: ( ruleReceiverL )
                    {
                    // InternalMyDsl.g:1025:2: ( ruleReceiverL )
                    // InternalMyDsl.g:1026:3: ruleReceiverL
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
    // InternalMyDsl.g:1035:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'action' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( ( 'int' ) | ( 'string' ) | ( 'action' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt11=1;
                }
                break;
            case 14:
                {
                alt11=2;
                }
                break;
            case 15:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1040:2: ( 'int' )
                    {
                    // InternalMyDsl.g:1040:2: ( 'int' )
                    // InternalMyDsl.g:1041:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1046:2: ( 'string' )
                    {
                    // InternalMyDsl.g:1046:2: ( 'string' )
                    // InternalMyDsl.g:1047:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1052:2: ( 'action' )
                    {
                    // InternalMyDsl.g:1052:2: ( 'action' )
                    // InternalMyDsl.g:1053:3: 'action'
                    {
                     before(grammarAccess.getTypeAccess().getActionKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getActionKeyword_2()); 

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


    // $ANTLR start "rule__GlobalProtocol__Group__0"
    // InternalMyDsl.g:1062:1: rule__GlobalProtocol__Group__0 : rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 ;
    public final void rule__GlobalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 )
            // InternalMyDsl.g:1067:2: rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1074:1: rule__GlobalProtocol__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( ( 'global' ) )
            // InternalMyDsl.g:1079:1: ( 'global' )
            {
            // InternalMyDsl.g:1079:1: ( 'global' )
            // InternalMyDsl.g:1080:2: 'global'
            {
             before(grammarAccess.getGlobalProtocolAccess().getGlobalKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1089:1: rule__GlobalProtocol__Group__1 : rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 ;
    public final void rule__GlobalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 )
            // InternalMyDsl.g:1094:2: rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1101:1: rule__GlobalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__GlobalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:1106:1: ( 'protocol' )
            {
            // InternalMyDsl.g:1106:1: ( 'protocol' )
            // InternalMyDsl.g:1107:2: 'protocol'
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1116:1: rule__GlobalProtocol__Group__2 : rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 ;
    public final void rule__GlobalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 )
            // InternalMyDsl.g:1121:2: rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1128:1: rule__GlobalProtocol__Group__2__Impl : ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__GlobalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:1133:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:1133:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:1134:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:1135:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:1135:3: rule__GlobalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:1143:1: rule__GlobalProtocol__Group__3 : rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 ;
    public final void rule__GlobalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 )
            // InternalMyDsl.g:1148:2: rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1155:1: rule__GlobalProtocol__Group__3__Impl : ( '(' ) ;
    public final void rule__GlobalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( ( '(' ) )
            // InternalMyDsl.g:1160:1: ( '(' )
            {
            // InternalMyDsl.g:1160:1: ( '(' )
            // InternalMyDsl.g:1161:2: '('
            {
             before(grammarAccess.getGlobalProtocolAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1170:1: rule__GlobalProtocol__Group__4 : rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 ;
    public final void rule__GlobalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 )
            // InternalMyDsl.g:1175:2: rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1182:1: rule__GlobalProtocol__Group__4__Impl : ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) ;
    public final void rule__GlobalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) )
            // InternalMyDsl.g:1187:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            {
            // InternalMyDsl.g:1187:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            // InternalMyDsl.g:1188:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getRolesAssignment_4()); 
            // InternalMyDsl.g:1189:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            // InternalMyDsl.g:1189:3: rule__GlobalProtocol__RolesAssignment_4
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
    // InternalMyDsl.g:1197:1: rule__GlobalProtocol__Group__5 : rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 ;
    public final void rule__GlobalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 )
            // InternalMyDsl.g:1202:2: rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1209:1: rule__GlobalProtocol__Group__5__Impl : ( '){' ) ;
    public final void rule__GlobalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( ( '){' ) )
            // InternalMyDsl.g:1214:1: ( '){' )
            {
            // InternalMyDsl.g:1214:1: ( '){' )
            // InternalMyDsl.g:1215:2: '){'
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
    // InternalMyDsl.g:1224:1: rule__GlobalProtocol__Group__6 : rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 ;
    public final void rule__GlobalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 )
            // InternalMyDsl.g:1229:2: rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1236:1: rule__GlobalProtocol__Group__6__Impl : ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) ;
    public final void rule__GlobalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) )
            // InternalMyDsl.g:1241:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            {
            // InternalMyDsl.g:1241:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            // InternalMyDsl.g:1242:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolAssignment_6()); 
            // InternalMyDsl.g:1243:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            // InternalMyDsl.g:1243:3: rule__GlobalProtocol__ProtocolAssignment_6
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
    // InternalMyDsl.g:1251:1: rule__GlobalProtocol__Group__7 : rule__GlobalProtocol__Group__7__Impl ;
    public final void rule__GlobalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( rule__GlobalProtocol__Group__7__Impl )
            // InternalMyDsl.g:1256:2: rule__GlobalProtocol__Group__7__Impl
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
    // InternalMyDsl.g:1262:1: rule__GlobalProtocol__Group__7__Impl : ( '}' ) ;
    public final void rule__GlobalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( ( '}' ) )
            // InternalMyDsl.g:1267:1: ( '}' )
            {
            // InternalMyDsl.g:1267:1: ( '}' )
            // InternalMyDsl.g:1268:2: '}'
            {
             before(grammarAccess.getGlobalProtocolAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__Roles__Group__0"
    // InternalMyDsl.g:1278:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalMyDsl.g:1283:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1290:1: rule__Roles__Group__0__Impl : ( ( rule__Roles__RolesAssignment_0 ) ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( ( ( rule__Roles__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:1295:1: ( ( rule__Roles__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:1295:1: ( ( rule__Roles__RolesAssignment_0 ) )
            // InternalMyDsl.g:1296:2: ( rule__Roles__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:1297:2: ( rule__Roles__RolesAssignment_0 )
            // InternalMyDsl.g:1297:3: rule__Roles__RolesAssignment_0
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
    // InternalMyDsl.g:1305:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( rule__Roles__Group__1__Impl )
            // InternalMyDsl.g:1310:2: rule__Roles__Group__1__Impl
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
    // InternalMyDsl.g:1316:1: rule__Roles__Group__1__Impl : ( ( rule__Roles__Group_1__0 )* ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1320:1: ( ( ( rule__Roles__Group_1__0 )* ) )
            // InternalMyDsl.g:1321:1: ( ( rule__Roles__Group_1__0 )* )
            {
            // InternalMyDsl.g:1321:1: ( ( rule__Roles__Group_1__0 )* )
            // InternalMyDsl.g:1322:2: ( rule__Roles__Group_1__0 )*
            {
             before(grammarAccess.getRolesAccess().getGroup_1()); 
            // InternalMyDsl.g:1323:2: ( rule__Roles__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1323:3: rule__Roles__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Roles__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:1332:1: rule__Roles__Group_1__0 : rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 ;
    public final void rule__Roles__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 )
            // InternalMyDsl.g:1337:2: rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1344:1: rule__Roles__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Roles__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( ( ',' ) )
            // InternalMyDsl.g:1349:1: ( ',' )
            {
            // InternalMyDsl.g:1349:1: ( ',' )
            // InternalMyDsl.g:1350:2: ','
            {
             before(grammarAccess.getRolesAccess().getCommaKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1359:1: rule__Roles__Group_1__1 : rule__Roles__Group_1__1__Impl ;
    public final void rule__Roles__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( rule__Roles__Group_1__1__Impl )
            // InternalMyDsl.g:1364:2: rule__Roles__Group_1__1__Impl
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
    // InternalMyDsl.g:1370:1: rule__Roles__Group_1__1__Impl : ( ( rule__Roles__RolesAssignment_1_1 ) ) ;
    public final void rule__Roles__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1374:1: ( ( ( rule__Roles__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:1375:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1375:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:1376:2: ( rule__Roles__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:1377:2: ( rule__Roles__RolesAssignment_1_1 )
            // InternalMyDsl.g:1377:3: rule__Roles__RolesAssignment_1_1
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
    // InternalMyDsl.g:1386:1: rule__RoleOne__Group__0 : rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 ;
    public final void rule__RoleOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 )
            // InternalMyDsl.g:1391:2: rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1398:1: rule__RoleOne__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( ( 'role' ) )
            // InternalMyDsl.g:1403:1: ( 'role' )
            {
            // InternalMyDsl.g:1403:1: ( 'role' )
            // InternalMyDsl.g:1404:2: 'role'
            {
             before(grammarAccess.getRoleOneAccess().getRoleKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1413:1: rule__RoleOne__Group__1 : rule__RoleOne__Group__1__Impl ;
    public final void rule__RoleOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( rule__RoleOne__Group__1__Impl )
            // InternalMyDsl.g:1418:2: rule__RoleOne__Group__1__Impl
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
    // InternalMyDsl.g:1424:1: rule__RoleOne__Group__1__Impl : ( ( rule__RoleOne__NameAssignment_1 ) ) ;
    public final void rule__RoleOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( ( ( rule__RoleOne__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1429:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1429:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            // InternalMyDsl.g:1430:2: ( rule__RoleOne__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1431:2: ( rule__RoleOne__NameAssignment_1 )
            // InternalMyDsl.g:1431:3: rule__RoleOne__NameAssignment_1
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
    // InternalMyDsl.g:1440:1: rule__RoleSet__Group__0 : rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 ;
    public final void rule__RoleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 )
            // InternalMyDsl.g:1445:2: rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1452:1: rule__RoleSet__Group__0__Impl : ( 'roleset' ) ;
    public final void rule__RoleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( ( 'roleset' ) )
            // InternalMyDsl.g:1457:1: ( 'roleset' )
            {
            // InternalMyDsl.g:1457:1: ( 'roleset' )
            // InternalMyDsl.g:1458:2: 'roleset'
            {
             before(grammarAccess.getRoleSetAccess().getRolesetKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1467:1: rule__RoleSet__Group__1 : rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 ;
    public final void rule__RoleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 )
            // InternalMyDsl.g:1472:2: rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1479:1: rule__RoleSet__Group__1__Impl : ( ( rule__RoleSet__NameAssignment_1 ) ) ;
    public final void rule__RoleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( ( ( rule__RoleSet__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1484:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1484:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            // InternalMyDsl.g:1485:2: ( rule__RoleSet__NameAssignment_1 )
            {
             before(grammarAccess.getRoleSetAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1486:2: ( rule__RoleSet__NameAssignment_1 )
            // InternalMyDsl.g:1486:3: rule__RoleSet__NameAssignment_1
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
    // InternalMyDsl.g:1494:1: rule__RoleSet__Group__2 : rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 ;
    public final void rule__RoleSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 )
            // InternalMyDsl.g:1499:2: rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1506:1: rule__RoleSet__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( ( ':' ) )
            // InternalMyDsl.g:1511:1: ( ':' )
            {
            // InternalMyDsl.g:1511:1: ( ':' )
            // InternalMyDsl.g:1512:2: ':'
            {
             before(grammarAccess.getRoleSetAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1521:1: rule__RoleSet__Group__3 : rule__RoleSet__Group__3__Impl ;
    public final void rule__RoleSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( rule__RoleSet__Group__3__Impl )
            // InternalMyDsl.g:1526:2: rule__RoleSet__Group__3__Impl
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
    // InternalMyDsl.g:1532:1: rule__RoleSet__Group__3__Impl : ( ( rule__RoleSet__RefAssignment_3 ) ) ;
    public final void rule__RoleSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1536:1: ( ( ( rule__RoleSet__RefAssignment_3 ) ) )
            // InternalMyDsl.g:1537:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:1537:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            // InternalMyDsl.g:1538:2: ( rule__RoleSet__RefAssignment_3 )
            {
             before(grammarAccess.getRoleSetAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:1539:2: ( rule__RoleSet__RefAssignment_3 )
            // InternalMyDsl.g:1539:3: rule__RoleSet__RefAssignment_3
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
    // InternalMyDsl.g:1548:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1552:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalMyDsl.g:1553:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1560:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( ( 'rec' ) )
            // InternalMyDsl.g:1565:1: ( 'rec' )
            {
            // InternalMyDsl.g:1565:1: ( 'rec' )
            // InternalMyDsl.g:1566:2: 'rec'
            {
             before(grammarAccess.getRecursionAccess().getRecKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1575:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1579:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // InternalMyDsl.g:1580:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1587:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__NameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( ( ( rule__Recursion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1592:1: ( ( rule__Recursion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1592:1: ( ( rule__Recursion__NameAssignment_1 ) )
            // InternalMyDsl.g:1593:2: ( rule__Recursion__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1594:2: ( rule__Recursion__NameAssignment_1 )
            // InternalMyDsl.g:1594:3: rule__Recursion__NameAssignment_1
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
    // InternalMyDsl.g:1602:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl rule__Recursion__Group__3 ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( rule__Recursion__Group__2__Impl rule__Recursion__Group__3 )
            // InternalMyDsl.g:1607:2: rule__Recursion__Group__2__Impl rule__Recursion__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1614:1: rule__Recursion__Group__2__Impl : ( ':' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( ( ':' ) )
            // InternalMyDsl.g:1619:1: ( ':' )
            {
            // InternalMyDsl.g:1619:1: ( ':' )
            // InternalMyDsl.g:1620:2: ':'
            {
             before(grammarAccess.getRecursionAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1629:1: rule__Recursion__Group__3 : rule__Recursion__Group__3__Impl rule__Recursion__Group__4 ;
    public final void rule__Recursion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( rule__Recursion__Group__3__Impl rule__Recursion__Group__4 )
            // InternalMyDsl.g:1634:2: rule__Recursion__Group__3__Impl rule__Recursion__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1641:1: rule__Recursion__Group__3__Impl : ( '{' ) ;
    public final void rule__Recursion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( ( '{' ) )
            // InternalMyDsl.g:1646:1: ( '{' )
            {
            // InternalMyDsl.g:1646:1: ( '{' )
            // InternalMyDsl.g:1647:2: '{'
            {
             before(grammarAccess.getRecursionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1656:1: rule__Recursion__Group__4 : rule__Recursion__Group__4__Impl rule__Recursion__Group__5 ;
    public final void rule__Recursion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( rule__Recursion__Group__4__Impl rule__Recursion__Group__5 )
            // InternalMyDsl.g:1661:2: rule__Recursion__Group__4__Impl rule__Recursion__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1668:1: rule__Recursion__Group__4__Impl : ( ( rule__Recursion__RecProtocolAssignment_4 ) ) ;
    public final void rule__Recursion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( ( ( rule__Recursion__RecProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:1673:1: ( ( rule__Recursion__RecProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:1673:1: ( ( rule__Recursion__RecProtocolAssignment_4 ) )
            // InternalMyDsl.g:1674:2: ( rule__Recursion__RecProtocolAssignment_4 )
            {
             before(grammarAccess.getRecursionAccess().getRecProtocolAssignment_4()); 
            // InternalMyDsl.g:1675:2: ( rule__Recursion__RecProtocolAssignment_4 )
            // InternalMyDsl.g:1675:3: rule__Recursion__RecProtocolAssignment_4
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
    // InternalMyDsl.g:1683:1: rule__Recursion__Group__5 : rule__Recursion__Group__5__Impl ;
    public final void rule__Recursion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( rule__Recursion__Group__5__Impl )
            // InternalMyDsl.g:1688:2: rule__Recursion__Group__5__Impl
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
    // InternalMyDsl.g:1694:1: rule__Recursion__Group__5__Impl : ( '}' ) ;
    public final void rule__Recursion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1698:1: ( ( '}' ) )
            // InternalMyDsl.g:1699:1: ( '}' )
            {
            // InternalMyDsl.g:1699:1: ( '}' )
            // InternalMyDsl.g:1700:2: '}'
            {
             before(grammarAccess.getRecursionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1710:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalMyDsl.g:1715:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1722:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( ( 'loop' ) )
            // InternalMyDsl.g:1727:1: ( 'loop' )
            {
            // InternalMyDsl.g:1727:1: ( 'loop' )
            // InternalMyDsl.g:1728:2: 'loop'
            {
             before(grammarAccess.getCloseRecursionAccess().getLoopKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1737:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( rule__CloseRecursion__Group__1__Impl )
            // InternalMyDsl.g:1742:2: rule__CloseRecursion__Group__1__Impl
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
    // InternalMyDsl.g:1748:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1752:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:1753:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:1753:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:1754:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:1755:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:1755:3: rule__CloseRecursion__RecursionVariableAssignment_1
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
    // InternalMyDsl.g:1764:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalMyDsl.g:1769:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1776:1: rule__ForEach__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( ( 'for' ) )
            // InternalMyDsl.g:1781:1: ( 'for' )
            {
            // InternalMyDsl.g:1781:1: ( 'for' )
            // InternalMyDsl.g:1782:2: 'for'
            {
             before(grammarAccess.getForEachAccess().getForKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1791:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalMyDsl.g:1796:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1803:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__LoopRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( ( ( rule__ForEach__LoopRoleAssignment_1 ) ) )
            // InternalMyDsl.g:1808:1: ( ( rule__ForEach__LoopRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:1808:1: ( ( rule__ForEach__LoopRoleAssignment_1 ) )
            // InternalMyDsl.g:1809:2: ( rule__ForEach__LoopRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getLoopRoleAssignment_1()); 
            // InternalMyDsl.g:1810:2: ( rule__ForEach__LoopRoleAssignment_1 )
            // InternalMyDsl.g:1810:3: rule__ForEach__LoopRoleAssignment_1
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
    // InternalMyDsl.g:1818:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalMyDsl.g:1823:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1830:1: rule__ForEach__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( ':' ) )
            // InternalMyDsl.g:1835:1: ( ':' )
            {
            // InternalMyDsl.g:1835:1: ( ':' )
            // InternalMyDsl.g:1836:2: ':'
            {
             before(grammarAccess.getForEachAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1845:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalMyDsl.g:1850:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1857:1: rule__ForEach__Group__3__Impl : ( '<' ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( ( '<' ) )
            // InternalMyDsl.g:1862:1: ( '<' )
            {
            // InternalMyDsl.g:1862:1: ( '<' )
            // InternalMyDsl.g:1863:2: '<'
            {
             before(grammarAccess.getForEachAccess().getLessThanSignKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1872:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalMyDsl.g:1877:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1884:1: rule__ForEach__Group__4__Impl : ( ( rule__ForEach__RolesetAssignment_4 ) ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( ( ( rule__ForEach__RolesetAssignment_4 ) ) )
            // InternalMyDsl.g:1889:1: ( ( rule__ForEach__RolesetAssignment_4 ) )
            {
            // InternalMyDsl.g:1889:1: ( ( rule__ForEach__RolesetAssignment_4 ) )
            // InternalMyDsl.g:1890:2: ( rule__ForEach__RolesetAssignment_4 )
            {
             before(grammarAccess.getForEachAccess().getRolesetAssignment_4()); 
            // InternalMyDsl.g:1891:2: ( rule__ForEach__RolesetAssignment_4 )
            // InternalMyDsl.g:1891:3: rule__ForEach__RolesetAssignment_4
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
    // InternalMyDsl.g:1899:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalMyDsl.g:1904:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1911:1: rule__ForEach__Group__5__Impl : ( ',' ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( ( ',' ) )
            // InternalMyDsl.g:1916:1: ( ',' )
            {
            // InternalMyDsl.g:1916:1: ( ',' )
            // InternalMyDsl.g:1917:2: ','
            {
             before(grammarAccess.getForEachAccess().getCommaKeyword_5()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1926:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl rule__ForEach__Group__7 ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( rule__ForEach__Group__6__Impl rule__ForEach__Group__7 )
            // InternalMyDsl.g:1931:2: rule__ForEach__Group__6__Impl rule__ForEach__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1938:1: rule__ForEach__Group__6__Impl : ( ( rule__ForEach__RefRoleAssignment_6 ) ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( ( ( rule__ForEach__RefRoleAssignment_6 ) ) )
            // InternalMyDsl.g:1943:1: ( ( rule__ForEach__RefRoleAssignment_6 ) )
            {
            // InternalMyDsl.g:1943:1: ( ( rule__ForEach__RefRoleAssignment_6 ) )
            // InternalMyDsl.g:1944:2: ( rule__ForEach__RefRoleAssignment_6 )
            {
             before(grammarAccess.getForEachAccess().getRefRoleAssignment_6()); 
            // InternalMyDsl.g:1945:2: ( rule__ForEach__RefRoleAssignment_6 )
            // InternalMyDsl.g:1945:3: rule__ForEach__RefRoleAssignment_6
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
    // InternalMyDsl.g:1953:1: rule__ForEach__Group__7 : rule__ForEach__Group__7__Impl rule__ForEach__Group__8 ;
    public final void rule__ForEach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( rule__ForEach__Group__7__Impl rule__ForEach__Group__8 )
            // InternalMyDsl.g:1958:2: rule__ForEach__Group__7__Impl rule__ForEach__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1965:1: rule__ForEach__Group__7__Impl : ( '>' ) ;
    public final void rule__ForEach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( ( '>' ) )
            // InternalMyDsl.g:1970:1: ( '>' )
            {
            // InternalMyDsl.g:1970:1: ( '>' )
            // InternalMyDsl.g:1971:2: '>'
            {
             before(grammarAccess.getForEachAccess().getGreaterThanSignKeyword_7()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1980:1: rule__ForEach__Group__8 : rule__ForEach__Group__8__Impl rule__ForEach__Group__9 ;
    public final void rule__ForEach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( rule__ForEach__Group__8__Impl rule__ForEach__Group__9 )
            // InternalMyDsl.g:1985:2: rule__ForEach__Group__8__Impl rule__ForEach__Group__9
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1992:1: rule__ForEach__Group__8__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( ( '{' ) )
            // InternalMyDsl.g:1997:1: ( '{' )
            {
            // InternalMyDsl.g:1997:1: ( '{' )
            // InternalMyDsl.g:1998:2: '{'
            {
             before(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2007:1: rule__ForEach__Group__9 : rule__ForEach__Group__9__Impl rule__ForEach__Group__10 ;
    public final void rule__ForEach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2011:1: ( rule__ForEach__Group__9__Impl rule__ForEach__Group__10 )
            // InternalMyDsl.g:2012:2: rule__ForEach__Group__9__Impl rule__ForEach__Group__10
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2019:1: rule__ForEach__Group__9__Impl : ( ( rule__ForEach__ForBodyAssignment_9 ) ) ;
    public final void rule__ForEach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( ( ( rule__ForEach__ForBodyAssignment_9 ) ) )
            // InternalMyDsl.g:2024:1: ( ( rule__ForEach__ForBodyAssignment_9 ) )
            {
            // InternalMyDsl.g:2024:1: ( ( rule__ForEach__ForBodyAssignment_9 ) )
            // InternalMyDsl.g:2025:2: ( rule__ForEach__ForBodyAssignment_9 )
            {
             before(grammarAccess.getForEachAccess().getForBodyAssignment_9()); 
            // InternalMyDsl.g:2026:2: ( rule__ForEach__ForBodyAssignment_9 )
            // InternalMyDsl.g:2026:3: rule__ForEach__ForBodyAssignment_9
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
    // InternalMyDsl.g:2034:1: rule__ForEach__Group__10 : rule__ForEach__Group__10__Impl rule__ForEach__Group__11 ;
    public final void rule__ForEach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2038:1: ( rule__ForEach__Group__10__Impl rule__ForEach__Group__11 )
            // InternalMyDsl.g:2039:2: rule__ForEach__Group__10__Impl rule__ForEach__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2046:1: rule__ForEach__Group__10__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( ( '}' ) )
            // InternalMyDsl.g:2051:1: ( '}' )
            {
            // InternalMyDsl.g:2051:1: ( '}' )
            // InternalMyDsl.g:2052:2: '}'
            {
             before(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2061:1: rule__ForEach__Group__11 : rule__ForEach__Group__11__Impl rule__ForEach__Group__12 ;
    public final void rule__ForEach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2065:1: ( rule__ForEach__Group__11__Impl rule__ForEach__Group__12 )
            // InternalMyDsl.g:2066:2: rule__ForEach__Group__11__Impl rule__ForEach__Group__12
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2073:1: rule__ForEach__Group__11__Impl : ( ';' ) ;
    public final void rule__ForEach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( ( ';' ) )
            // InternalMyDsl.g:2078:1: ( ';' )
            {
            // InternalMyDsl.g:2078:1: ( ';' )
            // InternalMyDsl.g:2079:2: ';'
            {
             before(grammarAccess.getForEachAccess().getSemicolonKeyword_11()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2088:1: rule__ForEach__Group__12 : rule__ForEach__Group__12__Impl ;
    public final void rule__ForEach__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( rule__ForEach__Group__12__Impl )
            // InternalMyDsl.g:2093:2: rule__ForEach__Group__12__Impl
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
    // InternalMyDsl.g:2099:1: rule__ForEach__Group__12__Impl : ( ( rule__ForEach__ProtocolAssignment_12 ) ) ;
    public final void rule__ForEach__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2103:1: ( ( ( rule__ForEach__ProtocolAssignment_12 ) ) )
            // InternalMyDsl.g:2104:1: ( ( rule__ForEach__ProtocolAssignment_12 ) )
            {
            // InternalMyDsl.g:2104:1: ( ( rule__ForEach__ProtocolAssignment_12 ) )
            // InternalMyDsl.g:2105:2: ( rule__ForEach__ProtocolAssignment_12 )
            {
             before(grammarAccess.getForEachAccess().getProtocolAssignment_12()); 
            // InternalMyDsl.g:2106:2: ( rule__ForEach__ProtocolAssignment_12 )
            // InternalMyDsl.g:2106:3: rule__ForEach__ProtocolAssignment_12
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
    // InternalMyDsl.g:2115:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2119:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:2120:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2127:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( ( 'choice' ) )
            // InternalMyDsl.g:2132:1: ( 'choice' )
            {
            // InternalMyDsl.g:2132:1: ( 'choice' )
            // InternalMyDsl.g:2133:2: 'choice'
            {
             before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2142:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:2147:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2154:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( ( 'at' ) )
            // InternalMyDsl.g:2159:1: ( 'at' )
            {
            // InternalMyDsl.g:2159:1: ( 'at' )
            // InternalMyDsl.g:2160:2: 'at'
            {
             before(grammarAccess.getChoiceAccess().getAtKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2169:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2173:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:2174:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2181:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:2186:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:2186:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalMyDsl.g:2187:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:2188:2: ( rule__Choice__RoleAssignment_2 )
            // InternalMyDsl.g:2188:3: rule__Choice__RoleAssignment_2
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
    // InternalMyDsl.g:2196:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:2201:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2208:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( ( '{' ) )
            // InternalMyDsl.g:2213:1: ( '{' )
            {
            // InternalMyDsl.g:2213:1: ( '{' )
            // InternalMyDsl.g:2214:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2223:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2227:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:2228:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2235:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__BranchesAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( ( ( rule__Choice__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:2240:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:2240:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            // InternalMyDsl.g:2241:2: ( rule__Choice__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:2242:2: ( rule__Choice__BranchesAssignment_4 )
            // InternalMyDsl.g:2242:3: rule__Choice__BranchesAssignment_4
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
    // InternalMyDsl.g:2250:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2254:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:2255:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2262:1: rule__Choice__Group__5__Impl : ( '}' ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( ( '}' ) )
            // InternalMyDsl.g:2267:1: ( '}' )
            {
            // InternalMyDsl.g:2267:1: ( '}' )
            // InternalMyDsl.g:2268:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2277:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2281:1: ( rule__Choice__Group__6__Impl )
            // InternalMyDsl.g:2282:2: rule__Choice__Group__6__Impl
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
    // InternalMyDsl.g:2288:1: rule__Choice__Group__6__Impl : ( ( rule__Choice__Group_6__0 )* ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2292:1: ( ( ( rule__Choice__Group_6__0 )* ) )
            // InternalMyDsl.g:2293:1: ( ( rule__Choice__Group_6__0 )* )
            {
            // InternalMyDsl.g:2293:1: ( ( rule__Choice__Group_6__0 )* )
            // InternalMyDsl.g:2294:2: ( rule__Choice__Group_6__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_6()); 
            // InternalMyDsl.g:2295:2: ( rule__Choice__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2295:3: rule__Choice__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Choice__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:2304:1: rule__Choice__Group_6__0 : rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 ;
    public final void rule__Choice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 )
            // InternalMyDsl.g:2309:2: rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2316:1: rule__Choice__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( ( 'or' ) )
            // InternalMyDsl.g:2321:1: ( 'or' )
            {
            // InternalMyDsl.g:2321:1: ( 'or' )
            // InternalMyDsl.g:2322:2: 'or'
            {
             before(grammarAccess.getChoiceAccess().getOrKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2331:1: rule__Choice__Group_6__1 : rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 ;
    public final void rule__Choice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2335:1: ( rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 )
            // InternalMyDsl.g:2336:2: rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2343:1: rule__Choice__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( ( '{' ) )
            // InternalMyDsl.g:2348:1: ( '{' )
            {
            // InternalMyDsl.g:2348:1: ( '{' )
            // InternalMyDsl.g:2349:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2358:1: rule__Choice__Group_6__2 : rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 ;
    public final void rule__Choice__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2362:1: ( rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 )
            // InternalMyDsl.g:2363:2: rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2370:1: rule__Choice__Group_6__2__Impl : ( ( rule__Choice__BranchesAssignment_6_2 ) ) ;
    public final void rule__Choice__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( ( ( rule__Choice__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:2375:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:2375:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:2376:2: ( rule__Choice__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:2377:2: ( rule__Choice__BranchesAssignment_6_2 )
            // InternalMyDsl.g:2377:3: rule__Choice__BranchesAssignment_6_2
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
    // InternalMyDsl.g:2385:1: rule__Choice__Group_6__3 : rule__Choice__Group_6__3__Impl ;
    public final void rule__Choice__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( rule__Choice__Group_6__3__Impl )
            // InternalMyDsl.g:2390:2: rule__Choice__Group_6__3__Impl
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
    // InternalMyDsl.g:2396:1: rule__Choice__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Choice__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2400:1: ( ( '}' ) )
            // InternalMyDsl.g:2401:1: ( '}' )
            {
            // InternalMyDsl.g:2401:1: ( '}' )
            // InternalMyDsl.g:2402:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2412:1: rule__MessageNormal__Group__0 : rule__MessageNormal__Group__0__Impl rule__MessageNormal__Group__1 ;
    public final void rule__MessageNormal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2416:1: ( rule__MessageNormal__Group__0__Impl rule__MessageNormal__Group__1 )
            // InternalMyDsl.g:2417:2: rule__MessageNormal__Group__0__Impl rule__MessageNormal__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2424:1: rule__MessageNormal__Group__0__Impl : ( ( rule__MessageNormal__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageNormal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( ( ( rule__MessageNormal__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2429:1: ( ( rule__MessageNormal__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2429:1: ( ( rule__MessageNormal__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2430:2: ( rule__MessageNormal__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageNormalAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2431:2: ( rule__MessageNormal__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2431:3: rule__MessageNormal__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2439:1: rule__MessageNormal__Group__1 : rule__MessageNormal__Group__1__Impl rule__MessageNormal__Group__2 ;
    public final void rule__MessageNormal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( rule__MessageNormal__Group__1__Impl rule__MessageNormal__Group__2 )
            // InternalMyDsl.g:2444:2: rule__MessageNormal__Group__1__Impl rule__MessageNormal__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2451:1: rule__MessageNormal__Group__1__Impl : ( ( rule__MessageNormal__Alternatives_1 ) ) ;
    public final void rule__MessageNormal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( ( ( rule__MessageNormal__Alternatives_1 ) ) )
            // InternalMyDsl.g:2456:1: ( ( rule__MessageNormal__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2456:1: ( ( rule__MessageNormal__Alternatives_1 ) )
            // InternalMyDsl.g:2457:2: ( rule__MessageNormal__Alternatives_1 )
            {
             before(grammarAccess.getMessageNormalAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2458:2: ( rule__MessageNormal__Alternatives_1 )
            // InternalMyDsl.g:2458:3: rule__MessageNormal__Alternatives_1
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
    // InternalMyDsl.g:2466:1: rule__MessageNormal__Group__2 : rule__MessageNormal__Group__2__Impl rule__MessageNormal__Group__3 ;
    public final void rule__MessageNormal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2470:1: ( rule__MessageNormal__Group__2__Impl rule__MessageNormal__Group__3 )
            // InternalMyDsl.g:2471:2: rule__MessageNormal__Group__2__Impl rule__MessageNormal__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2478:1: rule__MessageNormal__Group__2__Impl : ( 'from' ) ;
    public final void rule__MessageNormal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( ( 'from' ) )
            // InternalMyDsl.g:2483:1: ( 'from' )
            {
            // InternalMyDsl.g:2483:1: ( 'from' )
            // InternalMyDsl.g:2484:2: 'from'
            {
             before(grammarAccess.getMessageNormalAccess().getFromKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2493:1: rule__MessageNormal__Group__3 : rule__MessageNormal__Group__3__Impl rule__MessageNormal__Group__4 ;
    public final void rule__MessageNormal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( rule__MessageNormal__Group__3__Impl rule__MessageNormal__Group__4 )
            // InternalMyDsl.g:2498:2: rule__MessageNormal__Group__3__Impl rule__MessageNormal__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2505:1: rule__MessageNormal__Group__3__Impl : ( ( rule__MessageNormal__SenderAssignment_3 ) ) ;
    public final void rule__MessageNormal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( ( ( rule__MessageNormal__SenderAssignment_3 ) ) )
            // InternalMyDsl.g:2510:1: ( ( rule__MessageNormal__SenderAssignment_3 ) )
            {
            // InternalMyDsl.g:2510:1: ( ( rule__MessageNormal__SenderAssignment_3 ) )
            // InternalMyDsl.g:2511:2: ( rule__MessageNormal__SenderAssignment_3 )
            {
             before(grammarAccess.getMessageNormalAccess().getSenderAssignment_3()); 
            // InternalMyDsl.g:2512:2: ( rule__MessageNormal__SenderAssignment_3 )
            // InternalMyDsl.g:2512:3: rule__MessageNormal__SenderAssignment_3
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
    // InternalMyDsl.g:2520:1: rule__MessageNormal__Group__4 : rule__MessageNormal__Group__4__Impl rule__MessageNormal__Group__5 ;
    public final void rule__MessageNormal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2524:1: ( rule__MessageNormal__Group__4__Impl rule__MessageNormal__Group__5 )
            // InternalMyDsl.g:2525:2: rule__MessageNormal__Group__4__Impl rule__MessageNormal__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2532:1: rule__MessageNormal__Group__4__Impl : ( 'to' ) ;
    public final void rule__MessageNormal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( ( 'to' ) )
            // InternalMyDsl.g:2537:1: ( 'to' )
            {
            // InternalMyDsl.g:2537:1: ( 'to' )
            // InternalMyDsl.g:2538:2: 'to'
            {
             before(grammarAccess.getMessageNormalAccess().getToKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2547:1: rule__MessageNormal__Group__5 : rule__MessageNormal__Group__5__Impl rule__MessageNormal__Group__6 ;
    public final void rule__MessageNormal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2551:1: ( rule__MessageNormal__Group__5__Impl rule__MessageNormal__Group__6 )
            // InternalMyDsl.g:2552:2: rule__MessageNormal__Group__5__Impl rule__MessageNormal__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2559:1: rule__MessageNormal__Group__5__Impl : ( ( rule__MessageNormal__ReceiverAssignment_5 ) ) ;
    public final void rule__MessageNormal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( ( ( rule__MessageNormal__ReceiverAssignment_5 ) ) )
            // InternalMyDsl.g:2564:1: ( ( rule__MessageNormal__ReceiverAssignment_5 ) )
            {
            // InternalMyDsl.g:2564:1: ( ( rule__MessageNormal__ReceiverAssignment_5 ) )
            // InternalMyDsl.g:2565:2: ( rule__MessageNormal__ReceiverAssignment_5 )
            {
             before(grammarAccess.getMessageNormalAccess().getReceiverAssignment_5()); 
            // InternalMyDsl.g:2566:2: ( rule__MessageNormal__ReceiverAssignment_5 )
            // InternalMyDsl.g:2566:3: rule__MessageNormal__ReceiverAssignment_5
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
    // InternalMyDsl.g:2574:1: rule__MessageNormal__Group__6 : rule__MessageNormal__Group__6__Impl rule__MessageNormal__Group__7 ;
    public final void rule__MessageNormal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2578:1: ( rule__MessageNormal__Group__6__Impl rule__MessageNormal__Group__7 )
            // InternalMyDsl.g:2579:2: rule__MessageNormal__Group__6__Impl rule__MessageNormal__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2586:1: rule__MessageNormal__Group__6__Impl : ( '.' ) ;
    public final void rule__MessageNormal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( ( '.' ) )
            // InternalMyDsl.g:2591:1: ( '.' )
            {
            // InternalMyDsl.g:2591:1: ( '.' )
            // InternalMyDsl.g:2592:2: '.'
            {
             before(grammarAccess.getMessageNormalAccess().getFullStopKeyword_6()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:2601:1: rule__MessageNormal__Group__7 : rule__MessageNormal__Group__7__Impl ;
    public final void rule__MessageNormal__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2605:1: ( rule__MessageNormal__Group__7__Impl )
            // InternalMyDsl.g:2606:2: rule__MessageNormal__Group__7__Impl
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
    // InternalMyDsl.g:2612:1: rule__MessageNormal__Group__7__Impl : ( ( rule__MessageNormal__ProtocolAssignment_7 ) ) ;
    public final void rule__MessageNormal__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2616:1: ( ( ( rule__MessageNormal__ProtocolAssignment_7 ) ) )
            // InternalMyDsl.g:2617:1: ( ( rule__MessageNormal__ProtocolAssignment_7 ) )
            {
            // InternalMyDsl.g:2617:1: ( ( rule__MessageNormal__ProtocolAssignment_7 ) )
            // InternalMyDsl.g:2618:2: ( rule__MessageNormal__ProtocolAssignment_7 )
            {
             before(grammarAccess.getMessageNormalAccess().getProtocolAssignment_7()); 
            // InternalMyDsl.g:2619:2: ( rule__MessageNormal__ProtocolAssignment_7 )
            // InternalMyDsl.g:2619:3: rule__MessageNormal__ProtocolAssignment_7
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
    // InternalMyDsl.g:2628:1: rule__MessageNormal__Group_1_0__0 : rule__MessageNormal__Group_1_0__0__Impl rule__MessageNormal__Group_1_0__1 ;
    public final void rule__MessageNormal__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2632:1: ( rule__MessageNormal__Group_1_0__0__Impl rule__MessageNormal__Group_1_0__1 )
            // InternalMyDsl.g:2633:2: rule__MessageNormal__Group_1_0__0__Impl rule__MessageNormal__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2640:1: rule__MessageNormal__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__MessageNormal__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( ( '(' ) )
            // InternalMyDsl.g:2645:1: ( '(' )
            {
            // InternalMyDsl.g:2645:1: ( '(' )
            // InternalMyDsl.g:2646:2: '('
            {
             before(grammarAccess.getMessageNormalAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2655:1: rule__MessageNormal__Group_1_0__1 : rule__MessageNormal__Group_1_0__1__Impl rule__MessageNormal__Group_1_0__2 ;
    public final void rule__MessageNormal__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2659:1: ( rule__MessageNormal__Group_1_0__1__Impl rule__MessageNormal__Group_1_0__2 )
            // InternalMyDsl.g:2660:2: rule__MessageNormal__Group_1_0__1__Impl rule__MessageNormal__Group_1_0__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2667:1: rule__MessageNormal__Group_1_0__1__Impl : ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? ) ;
    public final void rule__MessageNormal__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? ) )
            // InternalMyDsl.g:2672:1: ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? )
            {
            // InternalMyDsl.g:2672:1: ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? )
            // InternalMyDsl.g:2673:2: ( rule__MessageNormal__PayloadAssignment_1_0_1 )?
            {
             before(grammarAccess.getMessageNormalAccess().getPayloadAssignment_1_0_1()); 
            // InternalMyDsl.g:2674:2: ( rule__MessageNormal__PayloadAssignment_1_0_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=13 && LA14_0<=15)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2674:3: rule__MessageNormal__PayloadAssignment_1_0_1
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
    // InternalMyDsl.g:2682:1: rule__MessageNormal__Group_1_0__2 : rule__MessageNormal__Group_1_0__2__Impl ;
    public final void rule__MessageNormal__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( rule__MessageNormal__Group_1_0__2__Impl )
            // InternalMyDsl.g:2687:2: rule__MessageNormal__Group_1_0__2__Impl
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
    // InternalMyDsl.g:2693:1: rule__MessageNormal__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__MessageNormal__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2697:1: ( ( ')' ) )
            // InternalMyDsl.g:2698:1: ( ')' )
            {
            // InternalMyDsl.g:2698:1: ( ')' )
            // InternalMyDsl.g:2699:2: ')'
            {
             before(grammarAccess.getMessageNormalAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2709:1: rule__MessageQuit__Group__0 : rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1 ;
    public final void rule__MessageQuit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1 )
            // InternalMyDsl.g:2714:2: rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2721:1: rule__MessageQuit__Group__0__Impl : ( ( rule__MessageQuit__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageQuit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2725:1: ( ( ( rule__MessageQuit__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2726:1: ( ( rule__MessageQuit__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2726:1: ( ( rule__MessageQuit__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2727:2: ( rule__MessageQuit__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageQuitAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2728:2: ( rule__MessageQuit__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2728:3: rule__MessageQuit__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2736:1: rule__MessageQuit__Group__1 : rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2 ;
    public final void rule__MessageQuit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2740:1: ( rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2 )
            // InternalMyDsl.g:2741:2: rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2748:1: rule__MessageQuit__Group__1__Impl : ( '()' ) ;
    public final void rule__MessageQuit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( ( '()' ) )
            // InternalMyDsl.g:2753:1: ( '()' )
            {
            // InternalMyDsl.g:2753:1: ( '()' )
            // InternalMyDsl.g:2754:2: '()'
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
    // InternalMyDsl.g:2763:1: rule__MessageQuit__Group__2 : rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3 ;
    public final void rule__MessageQuit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2767:1: ( rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3 )
            // InternalMyDsl.g:2768:2: rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2775:1: rule__MessageQuit__Group__2__Impl : ( 'from' ) ;
    public final void rule__MessageQuit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( ( 'from' ) )
            // InternalMyDsl.g:2780:1: ( 'from' )
            {
            // InternalMyDsl.g:2780:1: ( 'from' )
            // InternalMyDsl.g:2781:2: 'from'
            {
             before(grammarAccess.getMessageQuitAccess().getFromKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2790:1: rule__MessageQuit__Group__3 : rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4 ;
    public final void rule__MessageQuit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4 )
            // InternalMyDsl.g:2795:2: rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2802:1: rule__MessageQuit__Group__3__Impl : ( ( rule__MessageQuit__SenderAssignment_3 ) ) ;
    public final void rule__MessageQuit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( ( ( rule__MessageQuit__SenderAssignment_3 ) ) )
            // InternalMyDsl.g:2807:1: ( ( rule__MessageQuit__SenderAssignment_3 ) )
            {
            // InternalMyDsl.g:2807:1: ( ( rule__MessageQuit__SenderAssignment_3 ) )
            // InternalMyDsl.g:2808:2: ( rule__MessageQuit__SenderAssignment_3 )
            {
             before(grammarAccess.getMessageQuitAccess().getSenderAssignment_3()); 
            // InternalMyDsl.g:2809:2: ( rule__MessageQuit__SenderAssignment_3 )
            // InternalMyDsl.g:2809:3: rule__MessageQuit__SenderAssignment_3
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
    // InternalMyDsl.g:2817:1: rule__MessageQuit__Group__4 : rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5 ;
    public final void rule__MessageQuit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2821:1: ( rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5 )
            // InternalMyDsl.g:2822:2: rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2829:1: rule__MessageQuit__Group__4__Impl : ( 'to' ) ;
    public final void rule__MessageQuit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( ( 'to' ) )
            // InternalMyDsl.g:2834:1: ( 'to' )
            {
            // InternalMyDsl.g:2834:1: ( 'to' )
            // InternalMyDsl.g:2835:2: 'to'
            {
             before(grammarAccess.getMessageQuitAccess().getToKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2844:1: rule__MessageQuit__Group__5 : rule__MessageQuit__Group__5__Impl ;
    public final void rule__MessageQuit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( rule__MessageQuit__Group__5__Impl )
            // InternalMyDsl.g:2849:2: rule__MessageQuit__Group__5__Impl
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
    // InternalMyDsl.g:2855:1: rule__MessageQuit__Group__5__Impl : ( ( rule__MessageQuit__ReceiverAssignment_5 ) ) ;
    public final void rule__MessageQuit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2859:1: ( ( ( rule__MessageQuit__ReceiverAssignment_5 ) ) )
            // InternalMyDsl.g:2860:1: ( ( rule__MessageQuit__ReceiverAssignment_5 ) )
            {
            // InternalMyDsl.g:2860:1: ( ( rule__MessageQuit__ReceiverAssignment_5 ) )
            // InternalMyDsl.g:2861:2: ( rule__MessageQuit__ReceiverAssignment_5 )
            {
             before(grammarAccess.getMessageQuitAccess().getReceiverAssignment_5()); 
            // InternalMyDsl.g:2862:2: ( rule__MessageQuit__ReceiverAssignment_5 )
            // InternalMyDsl.g:2862:3: rule__MessageQuit__ReceiverAssignment_5
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
    // InternalMyDsl.g:2871:1: rule__Payload__Group__0 : rule__Payload__Group__0__Impl rule__Payload__Group__1 ;
    public final void rule__Payload__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2875:1: ( rule__Payload__Group__0__Impl rule__Payload__Group__1 )
            // InternalMyDsl.g:2876:2: rule__Payload__Group__0__Impl rule__Payload__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2883:1: rule__Payload__Group__0__Impl : ( ( rule__Payload__TypesAssignment_0 ) ) ;
    public final void rule__Payload__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( ( ( rule__Payload__TypesAssignment_0 ) ) )
            // InternalMyDsl.g:2888:1: ( ( rule__Payload__TypesAssignment_0 ) )
            {
            // InternalMyDsl.g:2888:1: ( ( rule__Payload__TypesAssignment_0 ) )
            // InternalMyDsl.g:2889:2: ( rule__Payload__TypesAssignment_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0()); 
            // InternalMyDsl.g:2890:2: ( rule__Payload__TypesAssignment_0 )
            // InternalMyDsl.g:2890:3: rule__Payload__TypesAssignment_0
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
    // InternalMyDsl.g:2898:1: rule__Payload__Group__1 : rule__Payload__Group__1__Impl ;
    public final void rule__Payload__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2902:1: ( rule__Payload__Group__1__Impl )
            // InternalMyDsl.g:2903:2: rule__Payload__Group__1__Impl
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
    // InternalMyDsl.g:2909:1: rule__Payload__Group__1__Impl : ( ( rule__Payload__Group_1__0 )* ) ;
    public final void rule__Payload__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2913:1: ( ( ( rule__Payload__Group_1__0 )* ) )
            // InternalMyDsl.g:2914:1: ( ( rule__Payload__Group_1__0 )* )
            {
            // InternalMyDsl.g:2914:1: ( ( rule__Payload__Group_1__0 )* )
            // InternalMyDsl.g:2915:2: ( rule__Payload__Group_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_1()); 
            // InternalMyDsl.g:2916:2: ( rule__Payload__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2916:3: rule__Payload__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Payload__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:2925:1: rule__Payload__Group_1__0 : rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 ;
    public final void rule__Payload__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2929:1: ( rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 )
            // InternalMyDsl.g:2930:2: rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2937:1: rule__Payload__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( ( ',' ) )
            // InternalMyDsl.g:2942:1: ( ',' )
            {
            // InternalMyDsl.g:2942:1: ( ',' )
            // InternalMyDsl.g:2943:2: ','
            {
             before(grammarAccess.getPayloadAccess().getCommaKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:2952:1: rule__Payload__Group_1__1 : rule__Payload__Group_1__1__Impl ;
    public final void rule__Payload__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2956:1: ( rule__Payload__Group_1__1__Impl )
            // InternalMyDsl.g:2957:2: rule__Payload__Group_1__1__Impl
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
    // InternalMyDsl.g:2963:1: rule__Payload__Group_1__1__Impl : ( ( rule__Payload__TypesAssignment_1_1 ) ) ;
    public final void rule__Payload__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2967:1: ( ( ( rule__Payload__TypesAssignment_1_1 ) ) )
            // InternalMyDsl.g:2968:1: ( ( rule__Payload__TypesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2968:1: ( ( rule__Payload__TypesAssignment_1_1 ) )
            // InternalMyDsl.g:2969:2: ( rule__Payload__TypesAssignment_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_1_1()); 
            // InternalMyDsl.g:2970:2: ( rule__Payload__TypesAssignment_1_1 )
            // InternalMyDsl.g:2970:3: rule__Payload__TypesAssignment_1_1
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
    // InternalMyDsl.g:2979:1: rule__LocalProtocol__Group__0 : rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 ;
    public final void rule__LocalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2983:1: ( rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 )
            // InternalMyDsl.g:2984:2: rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:2991:1: rule__LocalProtocol__Group__0__Impl : ( 'local' ) ;
    public final void rule__LocalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( ( 'local' ) )
            // InternalMyDsl.g:2996:1: ( 'local' )
            {
            // InternalMyDsl.g:2996:1: ( 'local' )
            // InternalMyDsl.g:2997:2: 'local'
            {
             before(grammarAccess.getLocalProtocolAccess().getLocalKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:3006:1: rule__LocalProtocol__Group__1 : rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 ;
    public final void rule__LocalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3010:1: ( rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 )
            // InternalMyDsl.g:3011:2: rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3018:1: rule__LocalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__LocalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:3023:1: ( 'protocol' )
            {
            // InternalMyDsl.g:3023:1: ( 'protocol' )
            // InternalMyDsl.g:3024:2: 'protocol'
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:3033:1: rule__LocalProtocol__Group__2 : rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 ;
    public final void rule__LocalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 )
            // InternalMyDsl.g:3038:2: rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:3045:1: rule__LocalProtocol__Group__2__Impl : ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__LocalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:3050:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:3050:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:3051:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:3052:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:3052:3: rule__LocalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:3060:1: rule__LocalProtocol__Group__3 : rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 ;
    public final void rule__LocalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3064:1: ( rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 )
            // InternalMyDsl.g:3065:2: rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:3072:1: rule__LocalProtocol__Group__3__Impl : ( 'at' ) ;
    public final void rule__LocalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( ( 'at' ) )
            // InternalMyDsl.g:3077:1: ( 'at' )
            {
            // InternalMyDsl.g:3077:1: ( 'at' )
            // InternalMyDsl.g:3078:2: 'at'
            {
             before(grammarAccess.getLocalProtocolAccess().getAtKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:3087:1: rule__LocalProtocol__Group__4 : rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 ;
    public final void rule__LocalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 )
            // InternalMyDsl.g:3092:2: rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:3099:1: rule__LocalProtocol__Group__4__Impl : ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) ;
    public final void rule__LocalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) )
            // InternalMyDsl.g:3104:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            {
            // InternalMyDsl.g:3104:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            // InternalMyDsl.g:3105:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_4()); 
            // InternalMyDsl.g:3106:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            // InternalMyDsl.g:3106:3: rule__LocalProtocol__ProjectedRoleAssignment_4
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
    // InternalMyDsl.g:3114:1: rule__LocalProtocol__Group__5 : rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 ;
    public final void rule__LocalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3118:1: ( rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 )
            // InternalMyDsl.g:3119:2: rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3126:1: rule__LocalProtocol__Group__5__Impl : ( '(' ) ;
    public final void rule__LocalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( ( '(' ) )
            // InternalMyDsl.g:3131:1: ( '(' )
            {
            // InternalMyDsl.g:3131:1: ( '(' )
            // InternalMyDsl.g:3132:2: '('
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3141:1: rule__LocalProtocol__Group__6 : rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 ;
    public final void rule__LocalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3145:1: ( rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 )
            // InternalMyDsl.g:3146:2: rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3153:1: rule__LocalProtocol__Group__6__Impl : ( ( rule__LocalProtocol__RolesAssignment_6 ) ) ;
    public final void rule__LocalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( ( ( rule__LocalProtocol__RolesAssignment_6 ) ) )
            // InternalMyDsl.g:3158:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            {
            // InternalMyDsl.g:3158:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            // InternalMyDsl.g:3159:2: ( rule__LocalProtocol__RolesAssignment_6 )
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesAssignment_6()); 
            // InternalMyDsl.g:3160:2: ( rule__LocalProtocol__RolesAssignment_6 )
            // InternalMyDsl.g:3160:3: rule__LocalProtocol__RolesAssignment_6
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
    // InternalMyDsl.g:3168:1: rule__LocalProtocol__Group__7 : rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 ;
    public final void rule__LocalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3172:1: ( rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 )
            // InternalMyDsl.g:3173:2: rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3180:1: rule__LocalProtocol__Group__7__Impl : ( ( rule__LocalProtocol__Alternatives_7 ) ) ;
    public final void rule__LocalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( ( ( rule__LocalProtocol__Alternatives_7 ) ) )
            // InternalMyDsl.g:3185:1: ( ( rule__LocalProtocol__Alternatives_7 ) )
            {
            // InternalMyDsl.g:3185:1: ( ( rule__LocalProtocol__Alternatives_7 ) )
            // InternalMyDsl.g:3186:2: ( rule__LocalProtocol__Alternatives_7 )
            {
             before(grammarAccess.getLocalProtocolAccess().getAlternatives_7()); 
            // InternalMyDsl.g:3187:2: ( rule__LocalProtocol__Alternatives_7 )
            // InternalMyDsl.g:3187:3: rule__LocalProtocol__Alternatives_7
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
    // InternalMyDsl.g:3195:1: rule__LocalProtocol__Group__8 : rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 ;
    public final void rule__LocalProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3199:1: ( rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 )
            // InternalMyDsl.g:3200:2: rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:3207:1: rule__LocalProtocol__Group__8__Impl : ( ( rule__LocalProtocol__ProtocolAssignment_8 ) ) ;
    public final void rule__LocalProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( ( ( rule__LocalProtocol__ProtocolAssignment_8 ) ) )
            // InternalMyDsl.g:3212:1: ( ( rule__LocalProtocol__ProtocolAssignment_8 ) )
            {
            // InternalMyDsl.g:3212:1: ( ( rule__LocalProtocol__ProtocolAssignment_8 ) )
            // InternalMyDsl.g:3213:2: ( rule__LocalProtocol__ProtocolAssignment_8 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_8()); 
            // InternalMyDsl.g:3214:2: ( rule__LocalProtocol__ProtocolAssignment_8 )
            // InternalMyDsl.g:3214:3: rule__LocalProtocol__ProtocolAssignment_8
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
    // InternalMyDsl.g:3222:1: rule__LocalProtocol__Group__9 : rule__LocalProtocol__Group__9__Impl ;
    public final void rule__LocalProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3226:1: ( rule__LocalProtocol__Group__9__Impl )
            // InternalMyDsl.g:3227:2: rule__LocalProtocol__Group__9__Impl
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
    // InternalMyDsl.g:3233:1: rule__LocalProtocol__Group__9__Impl : ( '}' ) ;
    public final void rule__LocalProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3237:1: ( ( '}' ) )
            // InternalMyDsl.g:3238:1: ( '}' )
            {
            // InternalMyDsl.g:3238:1: ( '}' )
            // InternalMyDsl.g:3239:2: '}'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:3249:1: rule__LocalProtocol__Group_7_1__0 : rule__LocalProtocol__Group_7_1__0__Impl rule__LocalProtocol__Group_7_1__1 ;
    public final void rule__LocalProtocol__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3253:1: ( rule__LocalProtocol__Group_7_1__0__Impl rule__LocalProtocol__Group_7_1__1 )
            // InternalMyDsl.g:3254:2: rule__LocalProtocol__Group_7_1__0__Impl rule__LocalProtocol__Group_7_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:3261:1: rule__LocalProtocol__Group_7_1__0__Impl : ( ')' ) ;
    public final void rule__LocalProtocol__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3265:1: ( ( ')' ) )
            // InternalMyDsl.g:3266:1: ( ')' )
            {
            // InternalMyDsl.g:3266:1: ( ')' )
            // InternalMyDsl.g:3267:2: ')'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:3276:1: rule__LocalProtocol__Group_7_1__1 : rule__LocalProtocol__Group_7_1__1__Impl ;
    public final void rule__LocalProtocol__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3280:1: ( rule__LocalProtocol__Group_7_1__1__Impl )
            // InternalMyDsl.g:3281:2: rule__LocalProtocol__Group_7_1__1__Impl
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
    // InternalMyDsl.g:3287:1: rule__LocalProtocol__Group_7_1__1__Impl : ( '{' ) ;
    public final void rule__LocalProtocol__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3291:1: ( ( '{' ) )
            // InternalMyDsl.g:3292:1: ( '{' )
            {
            // InternalMyDsl.g:3292:1: ( '{' )
            // InternalMyDsl.g:3293:2: '{'
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_7_1_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:3303:1: rule__RecursionL__Group__0 : rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 ;
    public final void rule__RecursionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3307:1: ( rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 )
            // InternalMyDsl.g:3308:2: rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3315:1: rule__RecursionL__Group__0__Impl : ( 'rec' ) ;
    public final void rule__RecursionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( ( 'rec' ) )
            // InternalMyDsl.g:3320:1: ( 'rec' )
            {
            // InternalMyDsl.g:3320:1: ( 'rec' )
            // InternalMyDsl.g:3321:2: 'rec'
            {
             before(grammarAccess.getRecursionLAccess().getRecKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:3330:1: rule__RecursionL__Group__1 : rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 ;
    public final void rule__RecursionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3334:1: ( rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 )
            // InternalMyDsl.g:3335:2: rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3342:1: rule__RecursionL__Group__1__Impl : ( ( rule__RecursionL__NameAssignment_1 ) ) ;
    public final void rule__RecursionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3346:1: ( ( ( rule__RecursionL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3347:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3347:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            // InternalMyDsl.g:3348:2: ( rule__RecursionL__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3349:2: ( rule__RecursionL__NameAssignment_1 )
            // InternalMyDsl.g:3349:3: rule__RecursionL__NameAssignment_1
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
    // InternalMyDsl.g:3357:1: rule__RecursionL__Group__2 : rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3 ;
    public final void rule__RecursionL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3361:1: ( rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3 )
            // InternalMyDsl.g:3362:2: rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:3369:1: rule__RecursionL__Group__2__Impl : ( ':' ) ;
    public final void rule__RecursionL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3373:1: ( ( ':' ) )
            // InternalMyDsl.g:3374:1: ( ':' )
            {
            // InternalMyDsl.g:3374:1: ( ':' )
            // InternalMyDsl.g:3375:2: ':'
            {
             before(grammarAccess.getRecursionLAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:3384:1: rule__RecursionL__Group__3 : rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4 ;
    public final void rule__RecursionL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3388:1: ( rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4 )
            // InternalMyDsl.g:3389:2: rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3396:1: rule__RecursionL__Group__3__Impl : ( '{' ) ;
    public final void rule__RecursionL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3400:1: ( ( '{' ) )
            // InternalMyDsl.g:3401:1: ( '{' )
            {
            // InternalMyDsl.g:3401:1: ( '{' )
            // InternalMyDsl.g:3402:2: '{'
            {
             before(grammarAccess.getRecursionLAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:3411:1: rule__RecursionL__Group__4 : rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5 ;
    public final void rule__RecursionL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3415:1: ( rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5 )
            // InternalMyDsl.g:3416:2: rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:3423:1: rule__RecursionL__Group__4__Impl : ( ( rule__RecursionL__RecProtocolAssignment_4 ) ) ;
    public final void rule__RecursionL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3427:1: ( ( ( rule__RecursionL__RecProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:3428:1: ( ( rule__RecursionL__RecProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:3428:1: ( ( rule__RecursionL__RecProtocolAssignment_4 ) )
            // InternalMyDsl.g:3429:2: ( rule__RecursionL__RecProtocolAssignment_4 )
            {
             before(grammarAccess.getRecursionLAccess().getRecProtocolAssignment_4()); 
            // InternalMyDsl.g:3430:2: ( rule__RecursionL__RecProtocolAssignment_4 )
            // InternalMyDsl.g:3430:3: rule__RecursionL__RecProtocolAssignment_4
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
    // InternalMyDsl.g:3438:1: rule__RecursionL__Group__5 : rule__RecursionL__Group__5__Impl ;
    public final void rule__RecursionL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3442:1: ( rule__RecursionL__Group__5__Impl )
            // InternalMyDsl.g:3443:2: rule__RecursionL__Group__5__Impl
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
    // InternalMyDsl.g:3449:1: rule__RecursionL__Group__5__Impl : ( '}' ) ;
    public final void rule__RecursionL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3453:1: ( ( '}' ) )
            // InternalMyDsl.g:3454:1: ( '}' )
            {
            // InternalMyDsl.g:3454:1: ( '}' )
            // InternalMyDsl.g:3455:2: '}'
            {
             before(grammarAccess.getRecursionLAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:3465:1: rule__CloseRecursionL__Group__0 : rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1 ;
    public final void rule__CloseRecursionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3469:1: ( rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1 )
            // InternalMyDsl.g:3470:2: rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3477:1: rule__CloseRecursionL__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3481:1: ( ( 'loop' ) )
            // InternalMyDsl.g:3482:1: ( 'loop' )
            {
            // InternalMyDsl.g:3482:1: ( 'loop' )
            // InternalMyDsl.g:3483:2: 'loop'
            {
             before(grammarAccess.getCloseRecursionLAccess().getLoopKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:3492:1: rule__CloseRecursionL__Group__1 : rule__CloseRecursionL__Group__1__Impl ;
    public final void rule__CloseRecursionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3496:1: ( rule__CloseRecursionL__Group__1__Impl )
            // InternalMyDsl.g:3497:2: rule__CloseRecursionL__Group__1__Impl
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
    // InternalMyDsl.g:3503:1: rule__CloseRecursionL__Group__1__Impl : ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3507:1: ( ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:3508:1: ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:3508:1: ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:3509:2: ( rule__CloseRecursionL__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionLAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:3510:2: ( rule__CloseRecursionL__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:3510:3: rule__CloseRecursionL__RecursionVariableAssignment_1
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
    // InternalMyDsl.g:3519:1: rule__MessageNormalL__Group__0 : rule__MessageNormalL__Group__0__Impl rule__MessageNormalL__Group__1 ;
    public final void rule__MessageNormalL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3523:1: ( rule__MessageNormalL__Group__0__Impl rule__MessageNormalL__Group__1 )
            // InternalMyDsl.g:3524:2: rule__MessageNormalL__Group__0__Impl rule__MessageNormalL__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:3531:1: rule__MessageNormalL__Group__0__Impl : ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageNormalL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3536:1: ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3536:1: ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:3537:2: ( rule__MessageNormalL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageNormalLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:3538:2: ( rule__MessageNormalL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:3538:3: rule__MessageNormalL__MessageTypeAssignment_0
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
    // InternalMyDsl.g:3546:1: rule__MessageNormalL__Group__1 : rule__MessageNormalL__Group__1__Impl rule__MessageNormalL__Group__2 ;
    public final void rule__MessageNormalL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3550:1: ( rule__MessageNormalL__Group__1__Impl rule__MessageNormalL__Group__2 )
            // InternalMyDsl.g:3551:2: rule__MessageNormalL__Group__1__Impl rule__MessageNormalL__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3558:1: rule__MessageNormalL__Group__1__Impl : ( ( rule__MessageNormalL__Alternatives_1 ) ) ;
    public final void rule__MessageNormalL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3562:1: ( ( ( rule__MessageNormalL__Alternatives_1 ) ) )
            // InternalMyDsl.g:3563:1: ( ( rule__MessageNormalL__Alternatives_1 ) )
            {
            // InternalMyDsl.g:3563:1: ( ( rule__MessageNormalL__Alternatives_1 ) )
            // InternalMyDsl.g:3564:2: ( rule__MessageNormalL__Alternatives_1 )
            {
             before(grammarAccess.getMessageNormalLAccess().getAlternatives_1()); 
            // InternalMyDsl.g:3565:2: ( rule__MessageNormalL__Alternatives_1 )
            // InternalMyDsl.g:3565:3: rule__MessageNormalL__Alternatives_1
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
    // InternalMyDsl.g:3573:1: rule__MessageNormalL__Group__2 : rule__MessageNormalL__Group__2__Impl rule__MessageNormalL__Group__3 ;
    public final void rule__MessageNormalL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3577:1: ( rule__MessageNormalL__Group__2__Impl rule__MessageNormalL__Group__3 )
            // InternalMyDsl.g:3578:2: rule__MessageNormalL__Group__2__Impl rule__MessageNormalL__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3585:1: rule__MessageNormalL__Group__2__Impl : ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) ) ;
    public final void rule__MessageNormalL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3589:1: ( ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) ) )
            // InternalMyDsl.g:3590:1: ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) )
            {
            // InternalMyDsl.g:3590:1: ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) )
            // InternalMyDsl.g:3591:2: ( rule__MessageNormalL__SendReceiveAssignment_2 )
            {
             before(grammarAccess.getMessageNormalLAccess().getSendReceiveAssignment_2()); 
            // InternalMyDsl.g:3592:2: ( rule__MessageNormalL__SendReceiveAssignment_2 )
            // InternalMyDsl.g:3592:3: rule__MessageNormalL__SendReceiveAssignment_2
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
    // InternalMyDsl.g:3600:1: rule__MessageNormalL__Group__3 : rule__MessageNormalL__Group__3__Impl rule__MessageNormalL__Group__4 ;
    public final void rule__MessageNormalL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3604:1: ( rule__MessageNormalL__Group__3__Impl rule__MessageNormalL__Group__4 )
            // InternalMyDsl.g:3605:2: rule__MessageNormalL__Group__3__Impl rule__MessageNormalL__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3612:1: rule__MessageNormalL__Group__3__Impl : ( '.' ) ;
    public final void rule__MessageNormalL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3616:1: ( ( '.' ) )
            // InternalMyDsl.g:3617:1: ( '.' )
            {
            // InternalMyDsl.g:3617:1: ( '.' )
            // InternalMyDsl.g:3618:2: '.'
            {
             before(grammarAccess.getMessageNormalLAccess().getFullStopKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:3627:1: rule__MessageNormalL__Group__4 : rule__MessageNormalL__Group__4__Impl ;
    public final void rule__MessageNormalL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3631:1: ( rule__MessageNormalL__Group__4__Impl )
            // InternalMyDsl.g:3632:2: rule__MessageNormalL__Group__4__Impl
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
    // InternalMyDsl.g:3638:1: rule__MessageNormalL__Group__4__Impl : ( ( rule__MessageNormalL__ProtocolAssignment_4 ) ) ;
    public final void rule__MessageNormalL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3642:1: ( ( ( rule__MessageNormalL__ProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:3643:1: ( ( rule__MessageNormalL__ProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:3643:1: ( ( rule__MessageNormalL__ProtocolAssignment_4 ) )
            // InternalMyDsl.g:3644:2: ( rule__MessageNormalL__ProtocolAssignment_4 )
            {
             before(grammarAccess.getMessageNormalLAccess().getProtocolAssignment_4()); 
            // InternalMyDsl.g:3645:2: ( rule__MessageNormalL__ProtocolAssignment_4 )
            // InternalMyDsl.g:3645:3: rule__MessageNormalL__ProtocolAssignment_4
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
    // InternalMyDsl.g:3654:1: rule__MessageNormalL__Group_1_0__0 : rule__MessageNormalL__Group_1_0__0__Impl rule__MessageNormalL__Group_1_0__1 ;
    public final void rule__MessageNormalL__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3658:1: ( rule__MessageNormalL__Group_1_0__0__Impl rule__MessageNormalL__Group_1_0__1 )
            // InternalMyDsl.g:3659:2: rule__MessageNormalL__Group_1_0__0__Impl rule__MessageNormalL__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3666:1: rule__MessageNormalL__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__MessageNormalL__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3670:1: ( ( '(' ) )
            // InternalMyDsl.g:3671:1: ( '(' )
            {
            // InternalMyDsl.g:3671:1: ( '(' )
            // InternalMyDsl.g:3672:2: '('
            {
             before(grammarAccess.getMessageNormalLAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3681:1: rule__MessageNormalL__Group_1_0__1 : rule__MessageNormalL__Group_1_0__1__Impl rule__MessageNormalL__Group_1_0__2 ;
    public final void rule__MessageNormalL__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3685:1: ( rule__MessageNormalL__Group_1_0__1__Impl rule__MessageNormalL__Group_1_0__2 )
            // InternalMyDsl.g:3686:2: rule__MessageNormalL__Group_1_0__1__Impl rule__MessageNormalL__Group_1_0__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3693:1: rule__MessageNormalL__Group_1_0__1__Impl : ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? ) ;
    public final void rule__MessageNormalL__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3697:1: ( ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? ) )
            // InternalMyDsl.g:3698:1: ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? )
            {
            // InternalMyDsl.g:3698:1: ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? )
            // InternalMyDsl.g:3699:2: ( rule__MessageNormalL__PayloadAssignment_1_0_1 )?
            {
             before(grammarAccess.getMessageNormalLAccess().getPayloadAssignment_1_0_1()); 
            // InternalMyDsl.g:3700:2: ( rule__MessageNormalL__PayloadAssignment_1_0_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=13 && LA16_0<=15)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:3700:3: rule__MessageNormalL__PayloadAssignment_1_0_1
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
    // InternalMyDsl.g:3708:1: rule__MessageNormalL__Group_1_0__2 : rule__MessageNormalL__Group_1_0__2__Impl ;
    public final void rule__MessageNormalL__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3712:1: ( rule__MessageNormalL__Group_1_0__2__Impl )
            // InternalMyDsl.g:3713:2: rule__MessageNormalL__Group_1_0__2__Impl
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
    // InternalMyDsl.g:3719:1: rule__MessageNormalL__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__MessageNormalL__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3723:1: ( ( ')' ) )
            // InternalMyDsl.g:3724:1: ( ')' )
            {
            // InternalMyDsl.g:3724:1: ( ')' )
            // InternalMyDsl.g:3725:2: ')'
            {
             before(grammarAccess.getMessageNormalLAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:3735:1: rule__MessageQuitL__Group__0 : rule__MessageQuitL__Group__0__Impl rule__MessageQuitL__Group__1 ;
    public final void rule__MessageQuitL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3739:1: ( rule__MessageQuitL__Group__0__Impl rule__MessageQuitL__Group__1 )
            // InternalMyDsl.g:3740:2: rule__MessageQuitL__Group__0__Impl rule__MessageQuitL__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3747:1: rule__MessageQuitL__Group__0__Impl : ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageQuitL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3751:1: ( ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3752:1: ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3752:1: ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:3753:2: ( rule__MessageQuitL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageQuitLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:3754:2: ( rule__MessageQuitL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:3754:3: rule__MessageQuitL__MessageTypeAssignment_0
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
    // InternalMyDsl.g:3762:1: rule__MessageQuitL__Group__1 : rule__MessageQuitL__Group__1__Impl rule__MessageQuitL__Group__2 ;
    public final void rule__MessageQuitL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3766:1: ( rule__MessageQuitL__Group__1__Impl rule__MessageQuitL__Group__2 )
            // InternalMyDsl.g:3767:2: rule__MessageQuitL__Group__1__Impl rule__MessageQuitL__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3774:1: rule__MessageQuitL__Group__1__Impl : ( '()' ) ;
    public final void rule__MessageQuitL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3778:1: ( ( '()' ) )
            // InternalMyDsl.g:3779:1: ( '()' )
            {
            // InternalMyDsl.g:3779:1: ( '()' )
            // InternalMyDsl.g:3780:2: '()'
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
    // InternalMyDsl.g:3789:1: rule__MessageQuitL__Group__2 : rule__MessageQuitL__Group__2__Impl ;
    public final void rule__MessageQuitL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3793:1: ( rule__MessageQuitL__Group__2__Impl )
            // InternalMyDsl.g:3794:2: rule__MessageQuitL__Group__2__Impl
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
    // InternalMyDsl.g:3800:1: rule__MessageQuitL__Group__2__Impl : ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) ) ;
    public final void rule__MessageQuitL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3804:1: ( ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) ) )
            // InternalMyDsl.g:3805:1: ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) )
            {
            // InternalMyDsl.g:3805:1: ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) )
            // InternalMyDsl.g:3806:2: ( rule__MessageQuitL__SendReceiveAssignment_2 )
            {
             before(grammarAccess.getMessageQuitLAccess().getSendReceiveAssignment_2()); 
            // InternalMyDsl.g:3807:2: ( rule__MessageQuitL__SendReceiveAssignment_2 )
            // InternalMyDsl.g:3807:3: rule__MessageQuitL__SendReceiveAssignment_2
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
    // InternalMyDsl.g:3816:1: rule__SenderL__Group__0 : rule__SenderL__Group__0__Impl rule__SenderL__Group__1 ;
    public final void rule__SenderL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3820:1: ( rule__SenderL__Group__0__Impl rule__SenderL__Group__1 )
            // InternalMyDsl.g:3821:2: rule__SenderL__Group__0__Impl rule__SenderL__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3828:1: rule__SenderL__Group__0__Impl : ( 'from' ) ;
    public final void rule__SenderL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3832:1: ( ( 'from' ) )
            // InternalMyDsl.g:3833:1: ( 'from' )
            {
            // InternalMyDsl.g:3833:1: ( 'from' )
            // InternalMyDsl.g:3834:2: 'from'
            {
             before(grammarAccess.getSenderLAccess().getFromKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:3843:1: rule__SenderL__Group__1 : rule__SenderL__Group__1__Impl ;
    public final void rule__SenderL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3847:1: ( rule__SenderL__Group__1__Impl )
            // InternalMyDsl.g:3848:2: rule__SenderL__Group__1__Impl
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
    // InternalMyDsl.g:3854:1: rule__SenderL__Group__1__Impl : ( ( rule__SenderL__RoleAssignment_1 ) ) ;
    public final void rule__SenderL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3858:1: ( ( ( rule__SenderL__RoleAssignment_1 ) ) )
            // InternalMyDsl.g:3859:1: ( ( rule__SenderL__RoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3859:1: ( ( rule__SenderL__RoleAssignment_1 ) )
            // InternalMyDsl.g:3860:2: ( rule__SenderL__RoleAssignment_1 )
            {
             before(grammarAccess.getSenderLAccess().getRoleAssignment_1()); 
            // InternalMyDsl.g:3861:2: ( rule__SenderL__RoleAssignment_1 )
            // InternalMyDsl.g:3861:3: rule__SenderL__RoleAssignment_1
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
    // InternalMyDsl.g:3870:1: rule__ReceiverL__Group__0 : rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 ;
    public final void rule__ReceiverL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3874:1: ( rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 )
            // InternalMyDsl.g:3875:2: rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3882:1: rule__ReceiverL__Group__0__Impl : ( 'to' ) ;
    public final void rule__ReceiverL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3886:1: ( ( 'to' ) )
            // InternalMyDsl.g:3887:1: ( 'to' )
            {
            // InternalMyDsl.g:3887:1: ( 'to' )
            // InternalMyDsl.g:3888:2: 'to'
            {
             before(grammarAccess.getReceiverLAccess().getToKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:3897:1: rule__ReceiverL__Group__1 : rule__ReceiverL__Group__1__Impl ;
    public final void rule__ReceiverL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3901:1: ( rule__ReceiverL__Group__1__Impl )
            // InternalMyDsl.g:3902:2: rule__ReceiverL__Group__1__Impl
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
    // InternalMyDsl.g:3908:1: rule__ReceiverL__Group__1__Impl : ( ( rule__ReceiverL__RoleAssignment_1 ) ) ;
    public final void rule__ReceiverL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3912:1: ( ( ( rule__ReceiverL__RoleAssignment_1 ) ) )
            // InternalMyDsl.g:3913:1: ( ( rule__ReceiverL__RoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3913:1: ( ( rule__ReceiverL__RoleAssignment_1 ) )
            // InternalMyDsl.g:3914:2: ( rule__ReceiverL__RoleAssignment_1 )
            {
             before(grammarAccess.getReceiverLAccess().getRoleAssignment_1()); 
            // InternalMyDsl.g:3915:2: ( rule__ReceiverL__RoleAssignment_1 )
            // InternalMyDsl.g:3915:3: rule__ReceiverL__RoleAssignment_1
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
    // InternalMyDsl.g:3924:1: rule__ChoiceL__Group__0 : rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 ;
    public final void rule__ChoiceL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3928:1: ( rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 )
            // InternalMyDsl.g:3929:2: rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:3936:1: rule__ChoiceL__Group__0__Impl : ( 'choice' ) ;
    public final void rule__ChoiceL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3940:1: ( ( 'choice' ) )
            // InternalMyDsl.g:3941:1: ( 'choice' )
            {
            // InternalMyDsl.g:3941:1: ( 'choice' )
            // InternalMyDsl.g:3942:2: 'choice'
            {
             before(grammarAccess.getChoiceLAccess().getChoiceKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:3951:1: rule__ChoiceL__Group__1 : rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 ;
    public final void rule__ChoiceL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3955:1: ( rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 )
            // InternalMyDsl.g:3956:2: rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3963:1: rule__ChoiceL__Group__1__Impl : ( 'at' ) ;
    public final void rule__ChoiceL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3967:1: ( ( 'at' ) )
            // InternalMyDsl.g:3968:1: ( 'at' )
            {
            // InternalMyDsl.g:3968:1: ( 'at' )
            // InternalMyDsl.g:3969:2: 'at'
            {
             before(grammarAccess.getChoiceLAccess().getAtKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:3978:1: rule__ChoiceL__Group__2 : rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 ;
    public final void rule__ChoiceL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3982:1: ( rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 )
            // InternalMyDsl.g:3983:2: rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:3990:1: rule__ChoiceL__Group__2__Impl : ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) ) ;
    public final void rule__ChoiceL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3994:1: ( ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) ) )
            // InternalMyDsl.g:3995:1: ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) )
            {
            // InternalMyDsl.g:3995:1: ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) )
            // InternalMyDsl.g:3996:2: ( rule__ChoiceL__RoleMakingChoiceAssignment_2 )
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceAssignment_2()); 
            // InternalMyDsl.g:3997:2: ( rule__ChoiceL__RoleMakingChoiceAssignment_2 )
            // InternalMyDsl.g:3997:3: rule__ChoiceL__RoleMakingChoiceAssignment_2
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
    // InternalMyDsl.g:4005:1: rule__ChoiceL__Group__3 : rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 ;
    public final void rule__ChoiceL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4009:1: ( rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 )
            // InternalMyDsl.g:4010:2: rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:4017:1: rule__ChoiceL__Group__3__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4021:1: ( ( '{' ) )
            // InternalMyDsl.g:4022:1: ( '{' )
            {
            // InternalMyDsl.g:4022:1: ( '{' )
            // InternalMyDsl.g:4023:2: '{'
            {
             before(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:4032:1: rule__ChoiceL__Group__4 : rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 ;
    public final void rule__ChoiceL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4036:1: ( rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 )
            // InternalMyDsl.g:4037:2: rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4044:1: rule__ChoiceL__Group__4__Impl : ( ( rule__ChoiceL__BranchesAssignment_4 ) ) ;
    public final void rule__ChoiceL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4048:1: ( ( ( rule__ChoiceL__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:4049:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:4049:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            // InternalMyDsl.g:4050:2: ( rule__ChoiceL__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:4051:2: ( rule__ChoiceL__BranchesAssignment_4 )
            // InternalMyDsl.g:4051:3: rule__ChoiceL__BranchesAssignment_4
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
    // InternalMyDsl.g:4059:1: rule__ChoiceL__Group__5 : rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 ;
    public final void rule__ChoiceL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4063:1: ( rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 )
            // InternalMyDsl.g:4064:2: rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4071:1: rule__ChoiceL__Group__5__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4075:1: ( ( '}' ) )
            // InternalMyDsl.g:4076:1: ( '}' )
            {
            // InternalMyDsl.g:4076:1: ( '}' )
            // InternalMyDsl.g:4077:2: '}'
            {
             before(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:4086:1: rule__ChoiceL__Group__6 : rule__ChoiceL__Group__6__Impl ;
    public final void rule__ChoiceL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4090:1: ( rule__ChoiceL__Group__6__Impl )
            // InternalMyDsl.g:4091:2: rule__ChoiceL__Group__6__Impl
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
    // InternalMyDsl.g:4097:1: rule__ChoiceL__Group__6__Impl : ( ( rule__ChoiceL__Group_6__0 )* ) ;
    public final void rule__ChoiceL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4101:1: ( ( ( rule__ChoiceL__Group_6__0 )* ) )
            // InternalMyDsl.g:4102:1: ( ( rule__ChoiceL__Group_6__0 )* )
            {
            // InternalMyDsl.g:4102:1: ( ( rule__ChoiceL__Group_6__0 )* )
            // InternalMyDsl.g:4103:2: ( rule__ChoiceL__Group_6__0 )*
            {
             before(grammarAccess.getChoiceLAccess().getGroup_6()); 
            // InternalMyDsl.g:4104:2: ( rule__ChoiceL__Group_6__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:4104:3: rule__ChoiceL__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ChoiceL__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:4113:1: rule__ChoiceL__Group_6__0 : rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 ;
    public final void rule__ChoiceL__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4117:1: ( rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 )
            // InternalMyDsl.g:4118:2: rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:4125:1: rule__ChoiceL__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__ChoiceL__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4129:1: ( ( 'or' ) )
            // InternalMyDsl.g:4130:1: ( 'or' )
            {
            // InternalMyDsl.g:4130:1: ( 'or' )
            // InternalMyDsl.g:4131:2: 'or'
            {
             before(grammarAccess.getChoiceLAccess().getOrKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:4140:1: rule__ChoiceL__Group_6__1 : rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 ;
    public final void rule__ChoiceL__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4144:1: ( rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 )
            // InternalMyDsl.g:4145:2: rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:4152:1: rule__ChoiceL__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4156:1: ( ( '{' ) )
            // InternalMyDsl.g:4157:1: ( '{' )
            {
            // InternalMyDsl.g:4157:1: ( '{' )
            // InternalMyDsl.g:4158:2: '{'
            {
             before(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:4167:1: rule__ChoiceL__Group_6__2 : rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 ;
    public final void rule__ChoiceL__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4171:1: ( rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 )
            // InternalMyDsl.g:4172:2: rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4179:1: rule__ChoiceL__Group_6__2__Impl : ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) ;
    public final void rule__ChoiceL__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4183:1: ( ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:4184:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:4184:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:4185:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:4186:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            // InternalMyDsl.g:4186:3: rule__ChoiceL__BranchesAssignment_6_2
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
    // InternalMyDsl.g:4194:1: rule__ChoiceL__Group_6__3 : rule__ChoiceL__Group_6__3__Impl ;
    public final void rule__ChoiceL__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4198:1: ( rule__ChoiceL__Group_6__3__Impl )
            // InternalMyDsl.g:4199:2: rule__ChoiceL__Group_6__3__Impl
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
    // InternalMyDsl.g:4205:1: rule__ChoiceL__Group_6__3__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4209:1: ( ( '}' ) )
            // InternalMyDsl.g:4210:1: ( '}' )
            {
            // InternalMyDsl.g:4210:1: ( '}' )
            // InternalMyDsl.g:4211:2: '}'
            {
             before(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:4221:1: rule__ForEachL__Group__0 : rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 ;
    public final void rule__ForEachL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4225:1: ( rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 )
            // InternalMyDsl.g:4226:2: rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:4233:1: rule__ForEachL__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEachL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4237:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:4238:1: ( 'foreach' )
            {
            // InternalMyDsl.g:4238:1: ( 'foreach' )
            // InternalMyDsl.g:4239:2: 'foreach'
            {
             before(grammarAccess.getForEachLAccess().getForeachKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:4248:1: rule__ForEachL__Group__1 : rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 ;
    public final void rule__ForEachL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4252:1: ( rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 )
            // InternalMyDsl.g:4253:2: rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:4260:1: rule__ForEachL__Group__1__Impl : ( ( rule__ForEachL__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEachL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4264:1: ( ( ( rule__ForEachL__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:4265:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:4265:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:4266:2: ( rule__ForEachL__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachLAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:4267:2: ( rule__ForEachL__EachRoleAssignment_1 )
            // InternalMyDsl.g:4267:3: rule__ForEachL__EachRoleAssignment_1
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
    // InternalMyDsl.g:4275:1: rule__ForEachL__Group__2 : rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 ;
    public final void rule__ForEachL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4279:1: ( rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 )
            // InternalMyDsl.g:4280:2: rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4287:1: rule__ForEachL__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEachL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4291:1: ( ( ':' ) )
            // InternalMyDsl.g:4292:1: ( ':' )
            {
            // InternalMyDsl.g:4292:1: ( ':' )
            // InternalMyDsl.g:4293:2: ':'
            {
             before(grammarAccess.getForEachLAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:4302:1: rule__ForEachL__Group__3 : rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 ;
    public final void rule__ForEachL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4306:1: ( rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 )
            // InternalMyDsl.g:4307:2: rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4314:1: rule__ForEachL__Group__3__Impl : ( '<' ) ;
    public final void rule__ForEachL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4318:1: ( ( '<' ) )
            // InternalMyDsl.g:4319:1: ( '<' )
            {
            // InternalMyDsl.g:4319:1: ( '<' )
            // InternalMyDsl.g:4320:2: '<'
            {
             before(grammarAccess.getForEachLAccess().getLessThanSignKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:4329:1: rule__ForEachL__Group__4 : rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 ;
    public final void rule__ForEachL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4333:1: ( rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 )
            // InternalMyDsl.g:4334:2: rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4341:1: rule__ForEachL__Group__4__Impl : ( ( rule__ForEachL__RolesetAssignment_4 ) ) ;
    public final void rule__ForEachL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4345:1: ( ( ( rule__ForEachL__RolesetAssignment_4 ) ) )
            // InternalMyDsl.g:4346:1: ( ( rule__ForEachL__RolesetAssignment_4 ) )
            {
            // InternalMyDsl.g:4346:1: ( ( rule__ForEachL__RolesetAssignment_4 ) )
            // InternalMyDsl.g:4347:2: ( rule__ForEachL__RolesetAssignment_4 )
            {
             before(grammarAccess.getForEachLAccess().getRolesetAssignment_4()); 
            // InternalMyDsl.g:4348:2: ( rule__ForEachL__RolesetAssignment_4 )
            // InternalMyDsl.g:4348:3: rule__ForEachL__RolesetAssignment_4
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
    // InternalMyDsl.g:4356:1: rule__ForEachL__Group__5 : rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 ;
    public final void rule__ForEachL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4360:1: ( rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 )
            // InternalMyDsl.g:4361:2: rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4368:1: rule__ForEachL__Group__5__Impl : ( ',' ) ;
    public final void rule__ForEachL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4372:1: ( ( ',' ) )
            // InternalMyDsl.g:4373:1: ( ',' )
            {
            // InternalMyDsl.g:4373:1: ( ',' )
            // InternalMyDsl.g:4374:2: ','
            {
             before(grammarAccess.getForEachLAccess().getCommaKeyword_5()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:4383:1: rule__ForEachL__Group__6 : rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7 ;
    public final void rule__ForEachL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4387:1: ( rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7 )
            // InternalMyDsl.g:4388:2: rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:4395:1: rule__ForEachL__Group__6__Impl : ( ( rule__ForEachL__RefroleAssignment_6 ) ) ;
    public final void rule__ForEachL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4399:1: ( ( ( rule__ForEachL__RefroleAssignment_6 ) ) )
            // InternalMyDsl.g:4400:1: ( ( rule__ForEachL__RefroleAssignment_6 ) )
            {
            // InternalMyDsl.g:4400:1: ( ( rule__ForEachL__RefroleAssignment_6 ) )
            // InternalMyDsl.g:4401:2: ( rule__ForEachL__RefroleAssignment_6 )
            {
             before(grammarAccess.getForEachLAccess().getRefroleAssignment_6()); 
            // InternalMyDsl.g:4402:2: ( rule__ForEachL__RefroleAssignment_6 )
            // InternalMyDsl.g:4402:3: rule__ForEachL__RefroleAssignment_6
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
    // InternalMyDsl.g:4410:1: rule__ForEachL__Group__7 : rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8 ;
    public final void rule__ForEachL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4414:1: ( rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8 )
            // InternalMyDsl.g:4415:2: rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:4422:1: rule__ForEachL__Group__7__Impl : ( '>' ) ;
    public final void rule__ForEachL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4426:1: ( ( '>' ) )
            // InternalMyDsl.g:4427:1: ( '>' )
            {
            // InternalMyDsl.g:4427:1: ( '>' )
            // InternalMyDsl.g:4428:2: '>'
            {
             before(grammarAccess.getForEachLAccess().getGreaterThanSignKeyword_7()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:4437:1: rule__ForEachL__Group__8 : rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9 ;
    public final void rule__ForEachL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4441:1: ( rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9 )
            // InternalMyDsl.g:4442:2: rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:4449:1: rule__ForEachL__Group__8__Impl : ( '{' ) ;
    public final void rule__ForEachL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4453:1: ( ( '{' ) )
            // InternalMyDsl.g:4454:1: ( '{' )
            {
            // InternalMyDsl.g:4454:1: ( '{' )
            // InternalMyDsl.g:4455:2: '{'
            {
             before(grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:4464:1: rule__ForEachL__Group__9 : rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10 ;
    public final void rule__ForEachL__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4468:1: ( rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10 )
            // InternalMyDsl.g:4469:2: rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4476:1: rule__ForEachL__Group__9__Impl : ( ( rule__ForEachL__BranchAssignment_9 ) ) ;
    public final void rule__ForEachL__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4480:1: ( ( ( rule__ForEachL__BranchAssignment_9 ) ) )
            // InternalMyDsl.g:4481:1: ( ( rule__ForEachL__BranchAssignment_9 ) )
            {
            // InternalMyDsl.g:4481:1: ( ( rule__ForEachL__BranchAssignment_9 ) )
            // InternalMyDsl.g:4482:2: ( rule__ForEachL__BranchAssignment_9 )
            {
             before(grammarAccess.getForEachLAccess().getBranchAssignment_9()); 
            // InternalMyDsl.g:4483:2: ( rule__ForEachL__BranchAssignment_9 )
            // InternalMyDsl.g:4483:3: rule__ForEachL__BranchAssignment_9
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
    // InternalMyDsl.g:4491:1: rule__ForEachL__Group__10 : rule__ForEachL__Group__10__Impl rule__ForEachL__Group__11 ;
    public final void rule__ForEachL__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4495:1: ( rule__ForEachL__Group__10__Impl rule__ForEachL__Group__11 )
            // InternalMyDsl.g:4496:2: rule__ForEachL__Group__10__Impl rule__ForEachL__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:4503:1: rule__ForEachL__Group__10__Impl : ( '}' ) ;
    public final void rule__ForEachL__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4507:1: ( ( '}' ) )
            // InternalMyDsl.g:4508:1: ( '}' )
            {
            // InternalMyDsl.g:4508:1: ( '}' )
            // InternalMyDsl.g:4509:2: '}'
            {
             before(grammarAccess.getForEachLAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:4518:1: rule__ForEachL__Group__11 : rule__ForEachL__Group__11__Impl rule__ForEachL__Group__12 ;
    public final void rule__ForEachL__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4522:1: ( rule__ForEachL__Group__11__Impl rule__ForEachL__Group__12 )
            // InternalMyDsl.g:4523:2: rule__ForEachL__Group__11__Impl rule__ForEachL__Group__12
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:4530:1: rule__ForEachL__Group__11__Impl : ( ';' ) ;
    public final void rule__ForEachL__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4534:1: ( ( ';' ) )
            // InternalMyDsl.g:4535:1: ( ';' )
            {
            // InternalMyDsl.g:4535:1: ( ';' )
            // InternalMyDsl.g:4536:2: ';'
            {
             before(grammarAccess.getForEachLAccess().getSemicolonKeyword_11()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:4545:1: rule__ForEachL__Group__12 : rule__ForEachL__Group__12__Impl ;
    public final void rule__ForEachL__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4549:1: ( rule__ForEachL__Group__12__Impl )
            // InternalMyDsl.g:4550:2: rule__ForEachL__Group__12__Impl
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
    // InternalMyDsl.g:4556:1: rule__ForEachL__Group__12__Impl : ( ( rule__ForEachL__ProtocolAssignment_12 ) ) ;
    public final void rule__ForEachL__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4560:1: ( ( ( rule__ForEachL__ProtocolAssignment_12 ) ) )
            // InternalMyDsl.g:4561:1: ( ( rule__ForEachL__ProtocolAssignment_12 ) )
            {
            // InternalMyDsl.g:4561:1: ( ( rule__ForEachL__ProtocolAssignment_12 ) )
            // InternalMyDsl.g:4562:2: ( rule__ForEachL__ProtocolAssignment_12 )
            {
             before(grammarAccess.getForEachLAccess().getProtocolAssignment_12()); 
            // InternalMyDsl.g:4563:2: ( rule__ForEachL__ProtocolAssignment_12 )
            // InternalMyDsl.g:4563:3: rule__ForEachL__ProtocolAssignment_12
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


    // $ANTLR start "rule__Model__ProtocolAssignment_0"
    // InternalMyDsl.g:4572:1: rule__Model__ProtocolAssignment_0 : ( ruleGlobalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4576:1: ( ( ruleGlobalProtocol ) )
            // InternalMyDsl.g:4577:2: ( ruleGlobalProtocol )
            {
            // InternalMyDsl.g:4577:2: ( ruleGlobalProtocol )
            // InternalMyDsl.g:4578:3: ruleGlobalProtocol
            {
             before(grammarAccess.getModelAccess().getProtocolGlobalProtocolParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalProtocol();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProtocolGlobalProtocolParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ProtocolAssignment_0"


    // $ANTLR start "rule__Model__ProtocolAssignment_1"
    // InternalMyDsl.g:4587:1: rule__Model__ProtocolAssignment_1 : ( ruleLocalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4591:1: ( ( ruleLocalProtocol ) )
            // InternalMyDsl.g:4592:2: ( ruleLocalProtocol )
            {
            // InternalMyDsl.g:4592:2: ( ruleLocalProtocol )
            // InternalMyDsl.g:4593:3: ruleLocalProtocol
            {
             before(grammarAccess.getModelAccess().getProtocolLocalProtocolParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalProtocol();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProtocolLocalProtocolParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ProtocolAssignment_1"


    // $ANTLR start "rule__GlobalProtocol__ProtocolNameAssignment_2"
    // InternalMyDsl.g:4602:1: rule__GlobalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4606:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4607:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4607:2: ( RULE_ID )
            // InternalMyDsl.g:4608:3: RULE_ID
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
    // InternalMyDsl.g:4617:1: rule__GlobalProtocol__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__GlobalProtocol__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4621:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:4622:2: ( ruleRoles )
            {
            // InternalMyDsl.g:4622:2: ( ruleRoles )
            // InternalMyDsl.g:4623:3: ruleRoles
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
    // InternalMyDsl.g:4632:1: rule__GlobalProtocol__ProtocolAssignment_6 : ( ruleProtocol ) ;
    public final void rule__GlobalProtocol__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4636:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4637:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4637:2: ( ruleProtocol )
            // InternalMyDsl.g:4638:3: ruleProtocol
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


    // $ANTLR start "rule__Roles__RolesAssignment_0"
    // InternalMyDsl.g:4647:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4651:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4652:2: ( ruleRole )
            {
            // InternalMyDsl.g:4652:2: ( ruleRole )
            // InternalMyDsl.g:4653:3: ruleRole
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
    // InternalMyDsl.g:4662:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4666:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4667:2: ( ruleRole )
            {
            // InternalMyDsl.g:4667:2: ( ruleRole )
            // InternalMyDsl.g:4668:3: ruleRole
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
    // InternalMyDsl.g:4677:1: rule__RoleOne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4681:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4682:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4682:2: ( RULE_ID )
            // InternalMyDsl.g:4683:3: RULE_ID
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
    // InternalMyDsl.g:4692:1: rule__RoleSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4696:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4697:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4697:2: ( RULE_ID )
            // InternalMyDsl.g:4698:3: RULE_ID
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
    // InternalMyDsl.g:4707:1: rule__RoleSet__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RoleSet__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4711:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4712:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4712:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4713:3: ( RULE_ID )
            {
             before(grammarAccess.getRoleSetAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4714:3: ( RULE_ID )
            // InternalMyDsl.g:4715:4: RULE_ID
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
    // InternalMyDsl.g:4726:1: rule__Protocol__BeginAssignment : ( ( rule__Protocol__BeginAlternatives_0 ) ) ;
    public final void rule__Protocol__BeginAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4730:1: ( ( ( rule__Protocol__BeginAlternatives_0 ) ) )
            // InternalMyDsl.g:4731:2: ( ( rule__Protocol__BeginAlternatives_0 ) )
            {
            // InternalMyDsl.g:4731:2: ( ( rule__Protocol__BeginAlternatives_0 ) )
            // InternalMyDsl.g:4732:3: ( rule__Protocol__BeginAlternatives_0 )
            {
             before(grammarAccess.getProtocolAccess().getBeginAlternatives_0()); 
            // InternalMyDsl.g:4733:3: ( rule__Protocol__BeginAlternatives_0 )
            // InternalMyDsl.g:4733:4: rule__Protocol__BeginAlternatives_0
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
    // InternalMyDsl.g:4741:1: rule__EndProtocol__EndAssignment : ( ( 'End' ) ) ;
    public final void rule__EndProtocol__EndAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4745:1: ( ( ( 'End' ) ) )
            // InternalMyDsl.g:4746:2: ( ( 'End' ) )
            {
            // InternalMyDsl.g:4746:2: ( ( 'End' ) )
            // InternalMyDsl.g:4747:3: ( 'End' )
            {
             before(grammarAccess.getEndProtocolAccess().getEndEndKeyword_0()); 
            // InternalMyDsl.g:4748:3: ( 'End' )
            // InternalMyDsl.g:4749:4: 'End'
            {
             before(grammarAccess.getEndProtocolAccess().getEndEndKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:4760:1: rule__Recursion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4764:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4765:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4765:2: ( RULE_ID )
            // InternalMyDsl.g:4766:3: RULE_ID
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
    // InternalMyDsl.g:4775:1: rule__Recursion__RecProtocolAssignment_4 : ( ruleProtocol ) ;
    public final void rule__Recursion__RecProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4779:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4780:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4780:2: ( ruleProtocol )
            // InternalMyDsl.g:4781:3: ruleProtocol
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
    // InternalMyDsl.g:4790:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4794:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4795:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4795:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4796:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalMyDsl.g:4797:3: ( RULE_ID )
            // InternalMyDsl.g:4798:4: RULE_ID
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
    // InternalMyDsl.g:4809:1: rule__ForEach__LoopRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEach__LoopRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4813:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:4814:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:4814:2: ( ruleRoleOne )
            // InternalMyDsl.g:4815:3: ruleRoleOne
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
    // InternalMyDsl.g:4824:1: rule__ForEach__RolesetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RolesetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4828:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4829:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4829:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4830:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRolesetRoleSetCrossReference_4_0()); 
            // InternalMyDsl.g:4831:3: ( RULE_ID )
            // InternalMyDsl.g:4832:4: RULE_ID
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
    // InternalMyDsl.g:4843:1: rule__ForEach__RefRoleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RefRoleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4847:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4848:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4848:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4849:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_6_0()); 
            // InternalMyDsl.g:4850:3: ( RULE_ID )
            // InternalMyDsl.g:4851:4: RULE_ID
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
    // InternalMyDsl.g:4862:1: rule__ForEach__ForBodyAssignment_9 : ( ruleProtocol ) ;
    public final void rule__ForEach__ForBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4866:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4867:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4867:2: ( ruleProtocol )
            // InternalMyDsl.g:4868:3: ruleProtocol
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
    // InternalMyDsl.g:4877:1: rule__ForEach__ProtocolAssignment_12 : ( ruleProtocol ) ;
    public final void rule__ForEach__ProtocolAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4881:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4882:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4882:2: ( ruleProtocol )
            // InternalMyDsl.g:4883:3: ruleProtocol
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
    // InternalMyDsl.g:4892:1: rule__Choice__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4896:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4897:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4897:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4898:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 
            // InternalMyDsl.g:4899:3: ( RULE_ID )
            // InternalMyDsl.g:4900:4: RULE_ID
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
    // InternalMyDsl.g:4911:1: rule__Choice__BranchesAssignment_4 : ( ruleMessage ) ;
    public final void rule__Choice__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4915:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4916:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4916:2: ( ruleMessage )
            // InternalMyDsl.g:4917:3: ruleMessage
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
    // InternalMyDsl.g:4926:1: rule__Choice__BranchesAssignment_6_2 : ( ruleMessage ) ;
    public final void rule__Choice__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4930:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4931:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4931:2: ( ruleMessage )
            // InternalMyDsl.g:4932:3: ruleMessage
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
    // InternalMyDsl.g:4941:1: rule__MessageNormal__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageNormal__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4945:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4946:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4946:2: ( RULE_ID )
            // InternalMyDsl.g:4947:3: RULE_ID
            {
             before(grammarAccess.getMessageNormalAccess().getMessageTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageNormalAccess().getMessageTypeIDTerminalRuleCall_0_0()); 

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
    // InternalMyDsl.g:4956:1: rule__MessageNormal__PayloadAssignment_1_0_1 : ( rulePayload ) ;
    public final void rule__MessageNormal__PayloadAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4960:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4961:2: ( rulePayload )
            {
            // InternalMyDsl.g:4961:2: ( rulePayload )
            // InternalMyDsl.g:4962:3: rulePayload
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
    // InternalMyDsl.g:4971:1: rule__MessageNormal__SenderAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MessageNormal__SenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4975:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4976:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4976:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4977:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageNormalAccess().getSenderRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4978:3: ( RULE_ID )
            // InternalMyDsl.g:4979:4: RULE_ID
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
    // InternalMyDsl.g:4990:1: rule__MessageNormal__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__MessageNormal__ReceiverAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4994:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4995:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4995:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4996:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageNormalAccess().getReceiverRoleCrossReference_5_0()); 
            // InternalMyDsl.g:4997:3: ( RULE_ID )
            // InternalMyDsl.g:4998:4: RULE_ID
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
    // InternalMyDsl.g:5009:1: rule__MessageNormal__ProtocolAssignment_7 : ( ruleProtocol ) ;
    public final void rule__MessageNormal__ProtocolAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5013:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:5014:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:5014:2: ( ruleProtocol )
            // InternalMyDsl.g:5015:3: ruleProtocol
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
    // InternalMyDsl.g:5024:1: rule__MessageQuit__MessageTypeAssignment_0 : ( ( 'QUIT' ) ) ;
    public final void rule__MessageQuit__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5028:1: ( ( ( 'QUIT' ) ) )
            // InternalMyDsl.g:5029:2: ( ( 'QUIT' ) )
            {
            // InternalMyDsl.g:5029:2: ( ( 'QUIT' ) )
            // InternalMyDsl.g:5030:3: ( 'QUIT' )
            {
             before(grammarAccess.getMessageQuitAccess().getMessageTypeQUITKeyword_0_0()); 
            // InternalMyDsl.g:5031:3: ( 'QUIT' )
            // InternalMyDsl.g:5032:4: 'QUIT'
            {
             before(grammarAccess.getMessageQuitAccess().getMessageTypeQUITKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMessageQuitAccess().getMessageTypeQUITKeyword_0_0()); 

            }

             after(grammarAccess.getMessageQuitAccess().getMessageTypeQUITKeyword_0_0()); 

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
    // InternalMyDsl.g:5043:1: rule__MessageQuit__SenderAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MessageQuit__SenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5047:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5048:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5048:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5049:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageQuitAccess().getSenderRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:5050:3: ( RULE_ID )
            // InternalMyDsl.g:5051:4: RULE_ID
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
    // InternalMyDsl.g:5062:1: rule__MessageQuit__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__MessageQuit__ReceiverAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5066:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5067:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5067:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5068:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageQuitAccess().getReceiverRoleCrossReference_5_0()); 
            // InternalMyDsl.g:5069:3: ( RULE_ID )
            // InternalMyDsl.g:5070:4: RULE_ID
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
    // InternalMyDsl.g:5081:1: rule__Payload__TypesAssignment_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5085:1: ( ( ruleType ) )
            // InternalMyDsl.g:5086:2: ( ruleType )
            {
            // InternalMyDsl.g:5086:2: ( ruleType )
            // InternalMyDsl.g:5087:3: ruleType
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
    // InternalMyDsl.g:5096:1: rule__Payload__TypesAssignment_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5100:1: ( ( ruleType ) )
            // InternalMyDsl.g:5101:2: ( ruleType )
            {
            // InternalMyDsl.g:5101:2: ( ruleType )
            // InternalMyDsl.g:5102:3: ruleType
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
    // InternalMyDsl.g:5111:1: rule__LocalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5115:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5116:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5116:2: ( RULE_ID )
            // InternalMyDsl.g:5117:3: RULE_ID
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
    // InternalMyDsl.g:5126:1: rule__LocalProtocol__ProjectedRoleAssignment_4 : ( ruleRoleOne ) ;
    public final void rule__LocalProtocol__ProjectedRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5130:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:5131:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:5131:2: ( ruleRoleOne )
            // InternalMyDsl.g:5132:3: ruleRoleOne
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleRoleOneParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleOne();

            state._fsp--;

             after(grammarAccess.getLocalProtocolAccess().getProjectedRoleRoleOneParserRuleCall_4_0()); 

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
    // InternalMyDsl.g:5141:1: rule__LocalProtocol__RolesAssignment_6 : ( ruleRoles ) ;
    public final void rule__LocalProtocol__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5145:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:5146:2: ( ruleRoles )
            {
            // InternalMyDsl.g:5146:2: ( ruleRoles )
            // InternalMyDsl.g:5147:3: ruleRoles
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
    // InternalMyDsl.g:5156:1: rule__LocalProtocol__ProtocolAssignment_8 : ( ruleProtocolL ) ;
    public final void rule__LocalProtocol__ProtocolAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5160:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5161:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5161:2: ( ruleProtocolL )
            // InternalMyDsl.g:5162:3: ruleProtocolL
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
    // InternalMyDsl.g:5171:1: rule__ProtocolL__BeginAssignment : ( ( rule__ProtocolL__BeginAlternatives_0 ) ) ;
    public final void rule__ProtocolL__BeginAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5175:1: ( ( ( rule__ProtocolL__BeginAlternatives_0 ) ) )
            // InternalMyDsl.g:5176:2: ( ( rule__ProtocolL__BeginAlternatives_0 ) )
            {
            // InternalMyDsl.g:5176:2: ( ( rule__ProtocolL__BeginAlternatives_0 ) )
            // InternalMyDsl.g:5177:3: ( rule__ProtocolL__BeginAlternatives_0 )
            {
             before(grammarAccess.getProtocolLAccess().getBeginAlternatives_0()); 
            // InternalMyDsl.g:5178:3: ( rule__ProtocolL__BeginAlternatives_0 )
            // InternalMyDsl.g:5178:4: rule__ProtocolL__BeginAlternatives_0
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
    // InternalMyDsl.g:5186:1: rule__RecursionL__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RecursionL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5190:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5191:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5191:2: ( RULE_ID )
            // InternalMyDsl.g:5192:3: RULE_ID
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
    // InternalMyDsl.g:5201:1: rule__RecursionL__RecProtocolAssignment_4 : ( ruleProtocolL ) ;
    public final void rule__RecursionL__RecProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5205:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5206:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5206:2: ( ruleProtocolL )
            // InternalMyDsl.g:5207:3: ruleProtocolL
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
    // InternalMyDsl.g:5216:1: rule__CloseRecursionL__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursionL__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5220:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5221:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5221:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5222:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLCrossReference_1_0()); 
            // InternalMyDsl.g:5223:3: ( RULE_ID )
            // InternalMyDsl.g:5224:4: RULE_ID
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
    // InternalMyDsl.g:5235:1: rule__MessageNormalL__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageNormalL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5239:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5240:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5240:2: ( RULE_ID )
            // InternalMyDsl.g:5241:3: RULE_ID
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
    // InternalMyDsl.g:5250:1: rule__MessageNormalL__PayloadAssignment_1_0_1 : ( rulePayload ) ;
    public final void rule__MessageNormalL__PayloadAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5254:1: ( ( rulePayload ) )
            // InternalMyDsl.g:5255:2: ( rulePayload )
            {
            // InternalMyDsl.g:5255:2: ( rulePayload )
            // InternalMyDsl.g:5256:3: rulePayload
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
    // InternalMyDsl.g:5265:1: rule__MessageNormalL__SendReceiveAssignment_2 : ( ruleMessageType ) ;
    public final void rule__MessageNormalL__SendReceiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5269:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:5270:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:5270:2: ( ruleMessageType )
            // InternalMyDsl.g:5271:3: ruleMessageType
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
    // InternalMyDsl.g:5280:1: rule__MessageNormalL__ProtocolAssignment_4 : ( ruleProtocolL ) ;
    public final void rule__MessageNormalL__ProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5284:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5285:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5285:2: ( ruleProtocolL )
            // InternalMyDsl.g:5286:3: ruleProtocolL
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
    // InternalMyDsl.g:5295:1: rule__MessageQuitL__MessageTypeAssignment_0 : ( ( 'QUIT' ) ) ;
    public final void rule__MessageQuitL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5299:1: ( ( ( 'QUIT' ) ) )
            // InternalMyDsl.g:5300:2: ( ( 'QUIT' ) )
            {
            // InternalMyDsl.g:5300:2: ( ( 'QUIT' ) )
            // InternalMyDsl.g:5301:3: ( 'QUIT' )
            {
             before(grammarAccess.getMessageQuitLAccess().getMessageTypeQUITKeyword_0_0()); 
            // InternalMyDsl.g:5302:3: ( 'QUIT' )
            // InternalMyDsl.g:5303:4: 'QUIT'
            {
             before(grammarAccess.getMessageQuitLAccess().getMessageTypeQUITKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:5314:1: rule__MessageQuitL__SendReceiveAssignment_2 : ( ruleMessageType ) ;
    public final void rule__MessageQuitL__SendReceiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5318:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:5319:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:5319:2: ( ruleMessageType )
            // InternalMyDsl.g:5320:3: ruleMessageType
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
    // InternalMyDsl.g:5329:1: rule__SenderL__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SenderL__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5333:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5334:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5334:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5335:3: ( RULE_ID )
            {
             before(grammarAccess.getSenderLAccess().getRoleRoleCrossReference_1_0()); 
            // InternalMyDsl.g:5336:3: ( RULE_ID )
            // InternalMyDsl.g:5337:4: RULE_ID
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
    // InternalMyDsl.g:5348:1: rule__ReceiverL__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReceiverL__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5352:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5353:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5353:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5354:3: ( RULE_ID )
            {
             before(grammarAccess.getReceiverLAccess().getRoleRoleCrossReference_1_0()); 
            // InternalMyDsl.g:5355:3: ( RULE_ID )
            // InternalMyDsl.g:5356:4: RULE_ID
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
    // InternalMyDsl.g:5367:1: rule__ChoiceL__RoleMakingChoiceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChoiceL__RoleMakingChoiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5371:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5372:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5372:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5373:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleCrossReference_2_0()); 
            // InternalMyDsl.g:5374:3: ( RULE_ID )
            // InternalMyDsl.g:5375:4: RULE_ID
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
    // InternalMyDsl.g:5386:1: rule__ChoiceL__BranchesAssignment_4 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5390:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:5391:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:5391:2: ( ruleMessageL )
            // InternalMyDsl.g:5392:3: ruleMessageL
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
    // InternalMyDsl.g:5401:1: rule__ChoiceL__BranchesAssignment_6_2 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5405:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:5406:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:5406:2: ( ruleMessageL )
            // InternalMyDsl.g:5407:3: ruleMessageL
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
    // InternalMyDsl.g:5416:1: rule__ForEachL__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEachL__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5420:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:5421:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:5421:2: ( ruleRoleOne )
            // InternalMyDsl.g:5422:3: ruleRoleOne
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
    // InternalMyDsl.g:5431:1: rule__ForEachL__RolesetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RolesetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5435:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5436:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5436:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5437:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRolesetRoleSetCrossReference_4_0()); 
            // InternalMyDsl.g:5438:3: ( RULE_ID )
            // InternalMyDsl.g:5439:4: RULE_ID
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
    // InternalMyDsl.g:5450:1: rule__ForEachL__RefroleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RefroleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5454:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5455:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5455:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5456:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRefroleRoleOneCrossReference_6_0()); 
            // InternalMyDsl.g:5457:3: ( RULE_ID )
            // InternalMyDsl.g:5458:4: RULE_ID
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
    // InternalMyDsl.g:5469:1: rule__ForEachL__BranchAssignment_9 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__BranchAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5473:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5474:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5474:2: ( ruleProtocolL )
            // InternalMyDsl.g:5475:3: ruleProtocolL
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
    // InternalMyDsl.g:5484:1: rule__ForEachL__ProtocolAssignment_12 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__ProtocolAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5488:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5489:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5489:2: ( ruleProtocolL )
            // InternalMyDsl.g:5490:3: ruleProtocolL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000003008D000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000200000E000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000003808D000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000C00000000L});

}