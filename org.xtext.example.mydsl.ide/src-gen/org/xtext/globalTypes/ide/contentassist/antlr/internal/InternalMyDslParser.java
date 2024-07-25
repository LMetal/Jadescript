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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'()'", "'int'", "'string'", "'action'", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'roleset'", "':'", "'rec'", "'{'", "'loop'", "'for'", "'<'", "'>'", "';'", "'choice'", "'at'", "'or'", "'from'", "'to'", "'.'", "')'", "'local'", "'foreach'", "'End'", "'QUIT'"
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

            if ( (LA1_0==15) ) {
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

            if ( (LA5_0==17) ) {
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


    // $ANTLR start "rule__ProtocolL__BeginAlternatives_0"
    // InternalMyDsl.g:906:1: rule__ProtocolL__BeginAlternatives_0 : ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursionL ) | ( ruleCloseRecursionL ) | ( ruleEndProtocol ) );
    public final void rule__ProtocolL__BeginAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursionL ) | ( ruleCloseRecursionL ) | ( ruleEndProtocol ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 41:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                alt6=2;
                }
                break;
            case 39:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            case 40:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:911:2: ( ruleMessageL )
                    {
                    // InternalMyDsl.g:911:2: ( ruleMessageL )
                    // InternalMyDsl.g:912:3: ruleMessageL
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
                    // InternalMyDsl.g:917:2: ( ruleChoiceL )
                    {
                    // InternalMyDsl.g:917:2: ( ruleChoiceL )
                    // InternalMyDsl.g:918:3: ruleChoiceL
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
                    // InternalMyDsl.g:923:2: ( ruleForEachL )
                    {
                    // InternalMyDsl.g:923:2: ( ruleForEachL )
                    // InternalMyDsl.g:924:3: ruleForEachL
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
                    // InternalMyDsl.g:929:2: ( ruleRecursionL )
                    {
                    // InternalMyDsl.g:929:2: ( ruleRecursionL )
                    // InternalMyDsl.g:930:3: ruleRecursionL
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
                    // InternalMyDsl.g:935:2: ( ruleCloseRecursionL )
                    {
                    // InternalMyDsl.g:935:2: ( ruleCloseRecursionL )
                    // InternalMyDsl.g:936:3: ruleCloseRecursionL
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
                    // InternalMyDsl.g:941:2: ( ruleEndProtocol )
                    {
                    // InternalMyDsl.g:941:2: ( ruleEndProtocol )
                    // InternalMyDsl.g:942:3: ruleEndProtocol
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
    // InternalMyDsl.g:951:1: rule__MessageL__Alternatives : ( ( ruleMessageNormalL ) | ( ruleMessageQuitL ) );
    public final void rule__MessageL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( ( ruleMessageNormalL ) | ( ruleMessageQuitL ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==41) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:956:2: ( ruleMessageNormalL )
                    {
                    // InternalMyDsl.g:956:2: ( ruleMessageNormalL )
                    // InternalMyDsl.g:957:3: ruleMessageNormalL
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
                    // InternalMyDsl.g:962:2: ( ruleMessageQuitL )
                    {
                    // InternalMyDsl.g:962:2: ( ruleMessageQuitL )
                    // InternalMyDsl.g:963:3: ruleMessageQuitL
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
    // InternalMyDsl.g:972:1: rule__MessageNormalL__Alternatives_1 : ( ( ( rule__MessageNormalL__Group_1_0__0 ) ) | ( '()' ) );
    public final void rule__MessageNormalL__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( ( ( rule__MessageNormalL__Group_1_0__0 ) ) | ( '()' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==11) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:977:2: ( ( rule__MessageNormalL__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:977:2: ( ( rule__MessageNormalL__Group_1_0__0 ) )
                    // InternalMyDsl.g:978:3: ( rule__MessageNormalL__Group_1_0__0 )
                    {
                     before(grammarAccess.getMessageNormalLAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:979:3: ( rule__MessageNormalL__Group_1_0__0 )
                    // InternalMyDsl.g:979:4: rule__MessageNormalL__Group_1_0__0
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
                    // InternalMyDsl.g:983:2: ( '()' )
                    {
                    // InternalMyDsl.g:983:2: ( '()' )
                    // InternalMyDsl.g:984:3: '()'
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
    // InternalMyDsl.g:993:1: rule__MessageType__Alternatives : ( ( ruleSenderL ) | ( ruleReceiverL ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( ( ruleSenderL ) | ( ruleReceiverL ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            else if ( (LA9_0==35) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:998:2: ( ruleSenderL )
                    {
                    // InternalMyDsl.g:998:2: ( ruleSenderL )
                    // InternalMyDsl.g:999:3: ruleSenderL
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
                    // InternalMyDsl.g:1004:2: ( ruleReceiverL )
                    {
                    // InternalMyDsl.g:1004:2: ( ruleReceiverL )
                    // InternalMyDsl.g:1005:3: ruleReceiverL
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
    // InternalMyDsl.g:1014:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'action' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( ( 'int' ) | ( 'string' ) | ( 'action' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt10=1;
                }
                break;
            case 13:
                {
                alt10=2;
                }
                break;
            case 14:
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
                    // InternalMyDsl.g:1019:2: ( 'int' )
                    {
                    // InternalMyDsl.g:1019:2: ( 'int' )
                    // InternalMyDsl.g:1020:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1025:2: ( 'string' )
                    {
                    // InternalMyDsl.g:1025:2: ( 'string' )
                    // InternalMyDsl.g:1026:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1031:2: ( 'action' )
                    {
                    // InternalMyDsl.g:1031:2: ( 'action' )
                    // InternalMyDsl.g:1032:3: 'action'
                    {
                     before(grammarAccess.getTypeAccess().getActionKeyword_2()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:1041:1: rule__GlobalProtocol__Group__0 : rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 ;
    public final void rule__GlobalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1045:1: ( rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 )
            // InternalMyDsl.g:1046:2: rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1
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
    // InternalMyDsl.g:1053:1: rule__GlobalProtocol__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( ( 'global' ) )
            // InternalMyDsl.g:1058:1: ( 'global' )
            {
            // InternalMyDsl.g:1058:1: ( 'global' )
            // InternalMyDsl.g:1059:2: 'global'
            {
             before(grammarAccess.getGlobalProtocolAccess().getGlobalKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:1068:1: rule__GlobalProtocol__Group__1 : rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 ;
    public final void rule__GlobalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 )
            // InternalMyDsl.g:1073:2: rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2
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
    // InternalMyDsl.g:1080:1: rule__GlobalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__GlobalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:1085:1: ( 'protocol' )
            {
            // InternalMyDsl.g:1085:1: ( 'protocol' )
            // InternalMyDsl.g:1086:2: 'protocol'
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1095:1: rule__GlobalProtocol__Group__2 : rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 ;
    public final void rule__GlobalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 )
            // InternalMyDsl.g:1100:2: rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3
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
    // InternalMyDsl.g:1107:1: rule__GlobalProtocol__Group__2__Impl : ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__GlobalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:1112:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:1112:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:1113:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:1114:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:1114:3: rule__GlobalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:1122:1: rule__GlobalProtocol__Group__3 : rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 ;
    public final void rule__GlobalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 )
            // InternalMyDsl.g:1127:2: rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4
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
    // InternalMyDsl.g:1134:1: rule__GlobalProtocol__Group__3__Impl : ( '(' ) ;
    public final void rule__GlobalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( ( '(' ) )
            // InternalMyDsl.g:1139:1: ( '(' )
            {
            // InternalMyDsl.g:1139:1: ( '(' )
            // InternalMyDsl.g:1140:2: '('
            {
             before(grammarAccess.getGlobalProtocolAccess().getLeftParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1149:1: rule__GlobalProtocol__Group__4 : rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 ;
    public final void rule__GlobalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 )
            // InternalMyDsl.g:1154:2: rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5
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
    // InternalMyDsl.g:1161:1: rule__GlobalProtocol__Group__4__Impl : ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) ;
    public final void rule__GlobalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) )
            // InternalMyDsl.g:1166:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            {
            // InternalMyDsl.g:1166:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            // InternalMyDsl.g:1167:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getRolesAssignment_4()); 
            // InternalMyDsl.g:1168:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            // InternalMyDsl.g:1168:3: rule__GlobalProtocol__RolesAssignment_4
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
    // InternalMyDsl.g:1176:1: rule__GlobalProtocol__Group__5 : rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 ;
    public final void rule__GlobalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1180:1: ( rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 )
            // InternalMyDsl.g:1181:2: rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6
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
    // InternalMyDsl.g:1188:1: rule__GlobalProtocol__Group__5__Impl : ( '){' ) ;
    public final void rule__GlobalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( ( '){' ) )
            // InternalMyDsl.g:1193:1: ( '){' )
            {
            // InternalMyDsl.g:1193:1: ( '){' )
            // InternalMyDsl.g:1194:2: '){'
            {
             before(grammarAccess.getGlobalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1203:1: rule__GlobalProtocol__Group__6 : rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 ;
    public final void rule__GlobalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 )
            // InternalMyDsl.g:1208:2: rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7
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
    // InternalMyDsl.g:1215:1: rule__GlobalProtocol__Group__6__Impl : ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) ;
    public final void rule__GlobalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) )
            // InternalMyDsl.g:1220:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            {
            // InternalMyDsl.g:1220:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            // InternalMyDsl.g:1221:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolAssignment_6()); 
            // InternalMyDsl.g:1222:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            // InternalMyDsl.g:1222:3: rule__GlobalProtocol__ProtocolAssignment_6
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
    // InternalMyDsl.g:1230:1: rule__GlobalProtocol__Group__7 : rule__GlobalProtocol__Group__7__Impl ;
    public final void rule__GlobalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( rule__GlobalProtocol__Group__7__Impl )
            // InternalMyDsl.g:1235:2: rule__GlobalProtocol__Group__7__Impl
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
    // InternalMyDsl.g:1241:1: rule__GlobalProtocol__Group__7__Impl : ( '}' ) ;
    public final void rule__GlobalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( ( '}' ) )
            // InternalMyDsl.g:1246:1: ( '}' )
            {
            // InternalMyDsl.g:1246:1: ( '}' )
            // InternalMyDsl.g:1247:2: '}'
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
    // InternalMyDsl.g:1257:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalMyDsl.g:1262:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
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
    // InternalMyDsl.g:1269:1: rule__Roles__Group__0__Impl : ( ( rule__Roles__RolesAssignment_0 ) ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( ( ( rule__Roles__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:1274:1: ( ( rule__Roles__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:1274:1: ( ( rule__Roles__RolesAssignment_0 ) )
            // InternalMyDsl.g:1275:2: ( rule__Roles__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:1276:2: ( rule__Roles__RolesAssignment_0 )
            // InternalMyDsl.g:1276:3: rule__Roles__RolesAssignment_0
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
    // InternalMyDsl.g:1284:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( rule__Roles__Group__1__Impl )
            // InternalMyDsl.g:1289:2: rule__Roles__Group__1__Impl
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
    // InternalMyDsl.g:1295:1: rule__Roles__Group__1__Impl : ( ( rule__Roles__Group_1__0 )* ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( ( ( rule__Roles__Group_1__0 )* ) )
            // InternalMyDsl.g:1300:1: ( ( rule__Roles__Group_1__0 )* )
            {
            // InternalMyDsl.g:1300:1: ( ( rule__Roles__Group_1__0 )* )
            // InternalMyDsl.g:1301:2: ( rule__Roles__Group_1__0 )*
            {
             before(grammarAccess.getRolesAccess().getGroup_1()); 
            // InternalMyDsl.g:1302:2: ( rule__Roles__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1302:3: rule__Roles__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Roles__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:1311:1: rule__Roles__Group_1__0 : rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 ;
    public final void rule__Roles__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 )
            // InternalMyDsl.g:1316:2: rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1
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
    // InternalMyDsl.g:1323:1: rule__Roles__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Roles__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( ( ',' ) )
            // InternalMyDsl.g:1328:1: ( ',' )
            {
            // InternalMyDsl.g:1328:1: ( ',' )
            // InternalMyDsl.g:1329:2: ','
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
    // InternalMyDsl.g:1338:1: rule__Roles__Group_1__1 : rule__Roles__Group_1__1__Impl ;
    public final void rule__Roles__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( rule__Roles__Group_1__1__Impl )
            // InternalMyDsl.g:1343:2: rule__Roles__Group_1__1__Impl
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
    // InternalMyDsl.g:1349:1: rule__Roles__Group_1__1__Impl : ( ( rule__Roles__RolesAssignment_1_1 ) ) ;
    public final void rule__Roles__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( ( ( rule__Roles__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:1354:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1354:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:1355:2: ( rule__Roles__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:1356:2: ( rule__Roles__RolesAssignment_1_1 )
            // InternalMyDsl.g:1356:3: rule__Roles__RolesAssignment_1_1
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
    // InternalMyDsl.g:1365:1: rule__RoleOne__Group__0 : rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 ;
    public final void rule__RoleOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1369:1: ( rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 )
            // InternalMyDsl.g:1370:2: rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1
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
    // InternalMyDsl.g:1377:1: rule__RoleOne__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( ( 'role' ) )
            // InternalMyDsl.g:1382:1: ( 'role' )
            {
            // InternalMyDsl.g:1382:1: ( 'role' )
            // InternalMyDsl.g:1383:2: 'role'
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
    // InternalMyDsl.g:1392:1: rule__RoleOne__Group__1 : rule__RoleOne__Group__1__Impl ;
    public final void rule__RoleOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( rule__RoleOne__Group__1__Impl )
            // InternalMyDsl.g:1397:2: rule__RoleOne__Group__1__Impl
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
    // InternalMyDsl.g:1403:1: rule__RoleOne__Group__1__Impl : ( ( rule__RoleOne__NameAssignment_1 ) ) ;
    public final void rule__RoleOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( ( ( rule__RoleOne__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1408:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1408:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            // InternalMyDsl.g:1409:2: ( rule__RoleOne__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1410:2: ( rule__RoleOne__NameAssignment_1 )
            // InternalMyDsl.g:1410:3: rule__RoleOne__NameAssignment_1
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
    // InternalMyDsl.g:1419:1: rule__RoleSet__Group__0 : rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 ;
    public final void rule__RoleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 )
            // InternalMyDsl.g:1424:2: rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1
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
    // InternalMyDsl.g:1431:1: rule__RoleSet__Group__0__Impl : ( 'roleset' ) ;
    public final void rule__RoleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( ( 'roleset' ) )
            // InternalMyDsl.g:1436:1: ( 'roleset' )
            {
            // InternalMyDsl.g:1436:1: ( 'roleset' )
            // InternalMyDsl.g:1437:2: 'roleset'
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
    // InternalMyDsl.g:1446:1: rule__RoleSet__Group__1 : rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 ;
    public final void rule__RoleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 )
            // InternalMyDsl.g:1451:2: rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2
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
    // InternalMyDsl.g:1458:1: rule__RoleSet__Group__1__Impl : ( ( rule__RoleSet__NameAssignment_1 ) ) ;
    public final void rule__RoleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( ( ( rule__RoleSet__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1463:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1463:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            // InternalMyDsl.g:1464:2: ( rule__RoleSet__NameAssignment_1 )
            {
             before(grammarAccess.getRoleSetAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1465:2: ( rule__RoleSet__NameAssignment_1 )
            // InternalMyDsl.g:1465:3: rule__RoleSet__NameAssignment_1
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
    // InternalMyDsl.g:1473:1: rule__RoleSet__Group__2 : rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 ;
    public final void rule__RoleSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 )
            // InternalMyDsl.g:1478:2: rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3
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
    // InternalMyDsl.g:1485:1: rule__RoleSet__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( ( ':' ) )
            // InternalMyDsl.g:1490:1: ( ':' )
            {
            // InternalMyDsl.g:1490:1: ( ':' )
            // InternalMyDsl.g:1491:2: ':'
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
    // InternalMyDsl.g:1500:1: rule__RoleSet__Group__3 : rule__RoleSet__Group__3__Impl ;
    public final void rule__RoleSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( rule__RoleSet__Group__3__Impl )
            // InternalMyDsl.g:1505:2: rule__RoleSet__Group__3__Impl
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
    // InternalMyDsl.g:1511:1: rule__RoleSet__Group__3__Impl : ( ( rule__RoleSet__RefAssignment_3 ) ) ;
    public final void rule__RoleSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( ( ( rule__RoleSet__RefAssignment_3 ) ) )
            // InternalMyDsl.g:1516:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:1516:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            // InternalMyDsl.g:1517:2: ( rule__RoleSet__RefAssignment_3 )
            {
             before(grammarAccess.getRoleSetAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:1518:2: ( rule__RoleSet__RefAssignment_3 )
            // InternalMyDsl.g:1518:3: rule__RoleSet__RefAssignment_3
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
    // InternalMyDsl.g:1527:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalMyDsl.g:1532:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
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
    // InternalMyDsl.g:1539:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( ( 'rec' ) )
            // InternalMyDsl.g:1544:1: ( 'rec' )
            {
            // InternalMyDsl.g:1544:1: ( 'rec' )
            // InternalMyDsl.g:1545:2: 'rec'
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
    // InternalMyDsl.g:1554:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // InternalMyDsl.g:1559:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
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
    // InternalMyDsl.g:1566:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__NameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( ( ( rule__Recursion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1571:1: ( ( rule__Recursion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1571:1: ( ( rule__Recursion__NameAssignment_1 ) )
            // InternalMyDsl.g:1572:2: ( rule__Recursion__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1573:2: ( rule__Recursion__NameAssignment_1 )
            // InternalMyDsl.g:1573:3: rule__Recursion__NameAssignment_1
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
    // InternalMyDsl.g:1581:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl rule__Recursion__Group__3 ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( rule__Recursion__Group__2__Impl rule__Recursion__Group__3 )
            // InternalMyDsl.g:1586:2: rule__Recursion__Group__2__Impl rule__Recursion__Group__3
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
    // InternalMyDsl.g:1593:1: rule__Recursion__Group__2__Impl : ( ':' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1597:1: ( ( ':' ) )
            // InternalMyDsl.g:1598:1: ( ':' )
            {
            // InternalMyDsl.g:1598:1: ( ':' )
            // InternalMyDsl.g:1599:2: ':'
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
    // InternalMyDsl.g:1608:1: rule__Recursion__Group__3 : rule__Recursion__Group__3__Impl rule__Recursion__Group__4 ;
    public final void rule__Recursion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1612:1: ( rule__Recursion__Group__3__Impl rule__Recursion__Group__4 )
            // InternalMyDsl.g:1613:2: rule__Recursion__Group__3__Impl rule__Recursion__Group__4
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
    // InternalMyDsl.g:1620:1: rule__Recursion__Group__3__Impl : ( '{' ) ;
    public final void rule__Recursion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( ( '{' ) )
            // InternalMyDsl.g:1625:1: ( '{' )
            {
            // InternalMyDsl.g:1625:1: ( '{' )
            // InternalMyDsl.g:1626:2: '{'
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
    // InternalMyDsl.g:1635:1: rule__Recursion__Group__4 : rule__Recursion__Group__4__Impl rule__Recursion__Group__5 ;
    public final void rule__Recursion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1639:1: ( rule__Recursion__Group__4__Impl rule__Recursion__Group__5 )
            // InternalMyDsl.g:1640:2: rule__Recursion__Group__4__Impl rule__Recursion__Group__5
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
    // InternalMyDsl.g:1647:1: rule__Recursion__Group__4__Impl : ( ( rule__Recursion__RecProtocolAssignment_4 ) ) ;
    public final void rule__Recursion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1651:1: ( ( ( rule__Recursion__RecProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:1652:1: ( ( rule__Recursion__RecProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:1652:1: ( ( rule__Recursion__RecProtocolAssignment_4 ) )
            // InternalMyDsl.g:1653:2: ( rule__Recursion__RecProtocolAssignment_4 )
            {
             before(grammarAccess.getRecursionAccess().getRecProtocolAssignment_4()); 
            // InternalMyDsl.g:1654:2: ( rule__Recursion__RecProtocolAssignment_4 )
            // InternalMyDsl.g:1654:3: rule__Recursion__RecProtocolAssignment_4
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
    // InternalMyDsl.g:1662:1: rule__Recursion__Group__5 : rule__Recursion__Group__5__Impl ;
    public final void rule__Recursion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1666:1: ( rule__Recursion__Group__5__Impl )
            // InternalMyDsl.g:1667:2: rule__Recursion__Group__5__Impl
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
    // InternalMyDsl.g:1673:1: rule__Recursion__Group__5__Impl : ( '}' ) ;
    public final void rule__Recursion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1677:1: ( ( '}' ) )
            // InternalMyDsl.g:1678:1: ( '}' )
            {
            // InternalMyDsl.g:1678:1: ( '}' )
            // InternalMyDsl.g:1679:2: '}'
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
    // InternalMyDsl.g:1689:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1693:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalMyDsl.g:1694:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
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
    // InternalMyDsl.g:1701:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1705:1: ( ( 'loop' ) )
            // InternalMyDsl.g:1706:1: ( 'loop' )
            {
            // InternalMyDsl.g:1706:1: ( 'loop' )
            // InternalMyDsl.g:1707:2: 'loop'
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
    // InternalMyDsl.g:1716:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1720:1: ( rule__CloseRecursion__Group__1__Impl )
            // InternalMyDsl.g:1721:2: rule__CloseRecursion__Group__1__Impl
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
    // InternalMyDsl.g:1727:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1731:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:1732:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:1732:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:1733:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:1734:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:1734:3: rule__CloseRecursion__RecursionVariableAssignment_1
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
    // InternalMyDsl.g:1743:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalMyDsl.g:1748:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
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
    // InternalMyDsl.g:1755:1: rule__ForEach__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( ( 'for' ) )
            // InternalMyDsl.g:1760:1: ( 'for' )
            {
            // InternalMyDsl.g:1760:1: ( 'for' )
            // InternalMyDsl.g:1761:2: 'for'
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
    // InternalMyDsl.g:1770:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1774:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalMyDsl.g:1775:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
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
    // InternalMyDsl.g:1782:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__LoopRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( ( ( rule__ForEach__LoopRoleAssignment_1 ) ) )
            // InternalMyDsl.g:1787:1: ( ( rule__ForEach__LoopRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:1787:1: ( ( rule__ForEach__LoopRoleAssignment_1 ) )
            // InternalMyDsl.g:1788:2: ( rule__ForEach__LoopRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getLoopRoleAssignment_1()); 
            // InternalMyDsl.g:1789:2: ( rule__ForEach__LoopRoleAssignment_1 )
            // InternalMyDsl.g:1789:3: rule__ForEach__LoopRoleAssignment_1
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
    // InternalMyDsl.g:1797:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1801:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalMyDsl.g:1802:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
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
    // InternalMyDsl.g:1809:1: rule__ForEach__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( ( ':' ) )
            // InternalMyDsl.g:1814:1: ( ':' )
            {
            // InternalMyDsl.g:1814:1: ( ':' )
            // InternalMyDsl.g:1815:2: ':'
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
    // InternalMyDsl.g:1824:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1828:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalMyDsl.g:1829:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
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
    // InternalMyDsl.g:1836:1: rule__ForEach__Group__3__Impl : ( '<' ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( ( '<' ) )
            // InternalMyDsl.g:1841:1: ( '<' )
            {
            // InternalMyDsl.g:1841:1: ( '<' )
            // InternalMyDsl.g:1842:2: '<'
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
    // InternalMyDsl.g:1851:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1855:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalMyDsl.g:1856:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
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
    // InternalMyDsl.g:1863:1: rule__ForEach__Group__4__Impl : ( ( rule__ForEach__RolesetAssignment_4 ) ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( ( ( rule__ForEach__RolesetAssignment_4 ) ) )
            // InternalMyDsl.g:1868:1: ( ( rule__ForEach__RolesetAssignment_4 ) )
            {
            // InternalMyDsl.g:1868:1: ( ( rule__ForEach__RolesetAssignment_4 ) )
            // InternalMyDsl.g:1869:2: ( rule__ForEach__RolesetAssignment_4 )
            {
             before(grammarAccess.getForEachAccess().getRolesetAssignment_4()); 
            // InternalMyDsl.g:1870:2: ( rule__ForEach__RolesetAssignment_4 )
            // InternalMyDsl.g:1870:3: rule__ForEach__RolesetAssignment_4
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
    // InternalMyDsl.g:1878:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1882:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalMyDsl.g:1883:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
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
    // InternalMyDsl.g:1890:1: rule__ForEach__Group__5__Impl : ( ',' ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( ( ',' ) )
            // InternalMyDsl.g:1895:1: ( ',' )
            {
            // InternalMyDsl.g:1895:1: ( ',' )
            // InternalMyDsl.g:1896:2: ','
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
    // InternalMyDsl.g:1905:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl rule__ForEach__Group__7 ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1909:1: ( rule__ForEach__Group__6__Impl rule__ForEach__Group__7 )
            // InternalMyDsl.g:1910:2: rule__ForEach__Group__6__Impl rule__ForEach__Group__7
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
    // InternalMyDsl.g:1917:1: rule__ForEach__Group__6__Impl : ( ( rule__ForEach__RefRoleAssignment_6 ) ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( ( ( rule__ForEach__RefRoleAssignment_6 ) ) )
            // InternalMyDsl.g:1922:1: ( ( rule__ForEach__RefRoleAssignment_6 ) )
            {
            // InternalMyDsl.g:1922:1: ( ( rule__ForEach__RefRoleAssignment_6 ) )
            // InternalMyDsl.g:1923:2: ( rule__ForEach__RefRoleAssignment_6 )
            {
             before(grammarAccess.getForEachAccess().getRefRoleAssignment_6()); 
            // InternalMyDsl.g:1924:2: ( rule__ForEach__RefRoleAssignment_6 )
            // InternalMyDsl.g:1924:3: rule__ForEach__RefRoleAssignment_6
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
    // InternalMyDsl.g:1932:1: rule__ForEach__Group__7 : rule__ForEach__Group__7__Impl rule__ForEach__Group__8 ;
    public final void rule__ForEach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1936:1: ( rule__ForEach__Group__7__Impl rule__ForEach__Group__8 )
            // InternalMyDsl.g:1937:2: rule__ForEach__Group__7__Impl rule__ForEach__Group__8
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
    // InternalMyDsl.g:1944:1: rule__ForEach__Group__7__Impl : ( '>' ) ;
    public final void rule__ForEach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( ( '>' ) )
            // InternalMyDsl.g:1949:1: ( '>' )
            {
            // InternalMyDsl.g:1949:1: ( '>' )
            // InternalMyDsl.g:1950:2: '>'
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
    // InternalMyDsl.g:1959:1: rule__ForEach__Group__8 : rule__ForEach__Group__8__Impl rule__ForEach__Group__9 ;
    public final void rule__ForEach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1963:1: ( rule__ForEach__Group__8__Impl rule__ForEach__Group__9 )
            // InternalMyDsl.g:1964:2: rule__ForEach__Group__8__Impl rule__ForEach__Group__9
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
    // InternalMyDsl.g:1971:1: rule__ForEach__Group__8__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( ( '{' ) )
            // InternalMyDsl.g:1976:1: ( '{' )
            {
            // InternalMyDsl.g:1976:1: ( '{' )
            // InternalMyDsl.g:1977:2: '{'
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
    // InternalMyDsl.g:1986:1: rule__ForEach__Group__9 : rule__ForEach__Group__9__Impl rule__ForEach__Group__10 ;
    public final void rule__ForEach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1990:1: ( rule__ForEach__Group__9__Impl rule__ForEach__Group__10 )
            // InternalMyDsl.g:1991:2: rule__ForEach__Group__9__Impl rule__ForEach__Group__10
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
    // InternalMyDsl.g:1998:1: rule__ForEach__Group__9__Impl : ( ( rule__ForEach__ForBodyAssignment_9 ) ) ;
    public final void rule__ForEach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( ( ( rule__ForEach__ForBodyAssignment_9 ) ) )
            // InternalMyDsl.g:2003:1: ( ( rule__ForEach__ForBodyAssignment_9 ) )
            {
            // InternalMyDsl.g:2003:1: ( ( rule__ForEach__ForBodyAssignment_9 ) )
            // InternalMyDsl.g:2004:2: ( rule__ForEach__ForBodyAssignment_9 )
            {
             before(grammarAccess.getForEachAccess().getForBodyAssignment_9()); 
            // InternalMyDsl.g:2005:2: ( rule__ForEach__ForBodyAssignment_9 )
            // InternalMyDsl.g:2005:3: rule__ForEach__ForBodyAssignment_9
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
    // InternalMyDsl.g:2013:1: rule__ForEach__Group__10 : rule__ForEach__Group__10__Impl rule__ForEach__Group__11 ;
    public final void rule__ForEach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2017:1: ( rule__ForEach__Group__10__Impl rule__ForEach__Group__11 )
            // InternalMyDsl.g:2018:2: rule__ForEach__Group__10__Impl rule__ForEach__Group__11
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
    // InternalMyDsl.g:2025:1: rule__ForEach__Group__10__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( ( '}' ) )
            // InternalMyDsl.g:2030:1: ( '}' )
            {
            // InternalMyDsl.g:2030:1: ( '}' )
            // InternalMyDsl.g:2031:2: '}'
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
    // InternalMyDsl.g:2040:1: rule__ForEach__Group__11 : rule__ForEach__Group__11__Impl rule__ForEach__Group__12 ;
    public final void rule__ForEach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2044:1: ( rule__ForEach__Group__11__Impl rule__ForEach__Group__12 )
            // InternalMyDsl.g:2045:2: rule__ForEach__Group__11__Impl rule__ForEach__Group__12
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
    // InternalMyDsl.g:2052:1: rule__ForEach__Group__11__Impl : ( ';' ) ;
    public final void rule__ForEach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( ( ';' ) )
            // InternalMyDsl.g:2057:1: ( ';' )
            {
            // InternalMyDsl.g:2057:1: ( ';' )
            // InternalMyDsl.g:2058:2: ';'
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
    // InternalMyDsl.g:2067:1: rule__ForEach__Group__12 : rule__ForEach__Group__12__Impl ;
    public final void rule__ForEach__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2071:1: ( rule__ForEach__Group__12__Impl )
            // InternalMyDsl.g:2072:2: rule__ForEach__Group__12__Impl
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
    // InternalMyDsl.g:2078:1: rule__ForEach__Group__12__Impl : ( ( rule__ForEach__ProtocolAssignment_12 ) ) ;
    public final void rule__ForEach__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( ( ( rule__ForEach__ProtocolAssignment_12 ) ) )
            // InternalMyDsl.g:2083:1: ( ( rule__ForEach__ProtocolAssignment_12 ) )
            {
            // InternalMyDsl.g:2083:1: ( ( rule__ForEach__ProtocolAssignment_12 ) )
            // InternalMyDsl.g:2084:2: ( rule__ForEach__ProtocolAssignment_12 )
            {
             before(grammarAccess.getForEachAccess().getProtocolAssignment_12()); 
            // InternalMyDsl.g:2085:2: ( rule__ForEach__ProtocolAssignment_12 )
            // InternalMyDsl.g:2085:3: rule__ForEach__ProtocolAssignment_12
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
    // InternalMyDsl.g:2094:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2098:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:2099:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
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
    // InternalMyDsl.g:2106:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( ( 'choice' ) )
            // InternalMyDsl.g:2111:1: ( 'choice' )
            {
            // InternalMyDsl.g:2111:1: ( 'choice' )
            // InternalMyDsl.g:2112:2: 'choice'
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
    // InternalMyDsl.g:2121:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2125:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:2126:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
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
    // InternalMyDsl.g:2133:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( ( 'at' ) )
            // InternalMyDsl.g:2138:1: ( 'at' )
            {
            // InternalMyDsl.g:2138:1: ( 'at' )
            // InternalMyDsl.g:2139:2: 'at'
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
    // InternalMyDsl.g:2148:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2152:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:2153:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
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
    // InternalMyDsl.g:2160:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:2165:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:2165:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalMyDsl.g:2166:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:2167:2: ( rule__Choice__RoleAssignment_2 )
            // InternalMyDsl.g:2167:3: rule__Choice__RoleAssignment_2
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
    // InternalMyDsl.g:2175:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2179:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:2180:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
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
    // InternalMyDsl.g:2187:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( ( '{' ) )
            // InternalMyDsl.g:2192:1: ( '{' )
            {
            // InternalMyDsl.g:2192:1: ( '{' )
            // InternalMyDsl.g:2193:2: '{'
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
    // InternalMyDsl.g:2202:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2206:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:2207:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
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
    // InternalMyDsl.g:2214:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__BranchesAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( ( ( rule__Choice__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:2219:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:2219:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            // InternalMyDsl.g:2220:2: ( rule__Choice__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:2221:2: ( rule__Choice__BranchesAssignment_4 )
            // InternalMyDsl.g:2221:3: rule__Choice__BranchesAssignment_4
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
    // InternalMyDsl.g:2229:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2233:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:2234:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
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
    // InternalMyDsl.g:2241:1: rule__Choice__Group__5__Impl : ( '}' ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( ( '}' ) )
            // InternalMyDsl.g:2246:1: ( '}' )
            {
            // InternalMyDsl.g:2246:1: ( '}' )
            // InternalMyDsl.g:2247:2: '}'
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
    // InternalMyDsl.g:2256:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2260:1: ( rule__Choice__Group__6__Impl )
            // InternalMyDsl.g:2261:2: rule__Choice__Group__6__Impl
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
    // InternalMyDsl.g:2267:1: rule__Choice__Group__6__Impl : ( ( rule__Choice__Group_6__0 )* ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2271:1: ( ( ( rule__Choice__Group_6__0 )* ) )
            // InternalMyDsl.g:2272:1: ( ( rule__Choice__Group_6__0 )* )
            {
            // InternalMyDsl.g:2272:1: ( ( rule__Choice__Group_6__0 )* )
            // InternalMyDsl.g:2273:2: ( rule__Choice__Group_6__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_6()); 
            // InternalMyDsl.g:2274:2: ( rule__Choice__Group_6__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2274:3: rule__Choice__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Choice__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:2283:1: rule__Choice__Group_6__0 : rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 ;
    public final void rule__Choice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2287:1: ( rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 )
            // InternalMyDsl.g:2288:2: rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1
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
    // InternalMyDsl.g:2295:1: rule__Choice__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( ( 'or' ) )
            // InternalMyDsl.g:2300:1: ( 'or' )
            {
            // InternalMyDsl.g:2300:1: ( 'or' )
            // InternalMyDsl.g:2301:2: 'or'
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
    // InternalMyDsl.g:2310:1: rule__Choice__Group_6__1 : rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 ;
    public final void rule__Choice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2314:1: ( rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 )
            // InternalMyDsl.g:2315:2: rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2
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
    // InternalMyDsl.g:2322:1: rule__Choice__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( ( '{' ) )
            // InternalMyDsl.g:2327:1: ( '{' )
            {
            // InternalMyDsl.g:2327:1: ( '{' )
            // InternalMyDsl.g:2328:2: '{'
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
    // InternalMyDsl.g:2337:1: rule__Choice__Group_6__2 : rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 ;
    public final void rule__Choice__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2341:1: ( rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 )
            // InternalMyDsl.g:2342:2: rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3
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
    // InternalMyDsl.g:2349:1: rule__Choice__Group_6__2__Impl : ( ( rule__Choice__BranchesAssignment_6_2 ) ) ;
    public final void rule__Choice__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2353:1: ( ( ( rule__Choice__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:2354:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:2354:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:2355:2: ( rule__Choice__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:2356:2: ( rule__Choice__BranchesAssignment_6_2 )
            // InternalMyDsl.g:2356:3: rule__Choice__BranchesAssignment_6_2
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
    // InternalMyDsl.g:2364:1: rule__Choice__Group_6__3 : rule__Choice__Group_6__3__Impl ;
    public final void rule__Choice__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2368:1: ( rule__Choice__Group_6__3__Impl )
            // InternalMyDsl.g:2369:2: rule__Choice__Group_6__3__Impl
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
    // InternalMyDsl.g:2375:1: rule__Choice__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Choice__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2379:1: ( ( '}' ) )
            // InternalMyDsl.g:2380:1: ( '}' )
            {
            // InternalMyDsl.g:2380:1: ( '}' )
            // InternalMyDsl.g:2381:2: '}'
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
    // InternalMyDsl.g:2391:1: rule__MessageNormal__Group__0 : rule__MessageNormal__Group__0__Impl rule__MessageNormal__Group__1 ;
    public final void rule__MessageNormal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2395:1: ( rule__MessageNormal__Group__0__Impl rule__MessageNormal__Group__1 )
            // InternalMyDsl.g:2396:2: rule__MessageNormal__Group__0__Impl rule__MessageNormal__Group__1
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
    // InternalMyDsl.g:2403:1: rule__MessageNormal__Group__0__Impl : ( ( rule__MessageNormal__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageNormal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( ( ( rule__MessageNormal__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2408:1: ( ( rule__MessageNormal__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2408:1: ( ( rule__MessageNormal__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2409:2: ( rule__MessageNormal__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageNormalAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2410:2: ( rule__MessageNormal__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2410:3: rule__MessageNormal__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2418:1: rule__MessageNormal__Group__1 : rule__MessageNormal__Group__1__Impl rule__MessageNormal__Group__2 ;
    public final void rule__MessageNormal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2422:1: ( rule__MessageNormal__Group__1__Impl rule__MessageNormal__Group__2 )
            // InternalMyDsl.g:2423:2: rule__MessageNormal__Group__1__Impl rule__MessageNormal__Group__2
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
    // InternalMyDsl.g:2430:1: rule__MessageNormal__Group__1__Impl : ( ( rule__MessageNormal__Alternatives_1 ) ) ;
    public final void rule__MessageNormal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( ( ( rule__MessageNormal__Alternatives_1 ) ) )
            // InternalMyDsl.g:2435:1: ( ( rule__MessageNormal__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2435:1: ( ( rule__MessageNormal__Alternatives_1 ) )
            // InternalMyDsl.g:2436:2: ( rule__MessageNormal__Alternatives_1 )
            {
             before(grammarAccess.getMessageNormalAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2437:2: ( rule__MessageNormal__Alternatives_1 )
            // InternalMyDsl.g:2437:3: rule__MessageNormal__Alternatives_1
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
    // InternalMyDsl.g:2445:1: rule__MessageNormal__Group__2 : rule__MessageNormal__Group__2__Impl rule__MessageNormal__Group__3 ;
    public final void rule__MessageNormal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2449:1: ( rule__MessageNormal__Group__2__Impl rule__MessageNormal__Group__3 )
            // InternalMyDsl.g:2450:2: rule__MessageNormal__Group__2__Impl rule__MessageNormal__Group__3
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
    // InternalMyDsl.g:2457:1: rule__MessageNormal__Group__2__Impl : ( 'from' ) ;
    public final void rule__MessageNormal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( ( 'from' ) )
            // InternalMyDsl.g:2462:1: ( 'from' )
            {
            // InternalMyDsl.g:2462:1: ( 'from' )
            // InternalMyDsl.g:2463:2: 'from'
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
    // InternalMyDsl.g:2472:1: rule__MessageNormal__Group__3 : rule__MessageNormal__Group__3__Impl rule__MessageNormal__Group__4 ;
    public final void rule__MessageNormal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2476:1: ( rule__MessageNormal__Group__3__Impl rule__MessageNormal__Group__4 )
            // InternalMyDsl.g:2477:2: rule__MessageNormal__Group__3__Impl rule__MessageNormal__Group__4
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
    // InternalMyDsl.g:2484:1: rule__MessageNormal__Group__3__Impl : ( ( rule__MessageNormal__SenderAssignment_3 ) ) ;
    public final void rule__MessageNormal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2488:1: ( ( ( rule__MessageNormal__SenderAssignment_3 ) ) )
            // InternalMyDsl.g:2489:1: ( ( rule__MessageNormal__SenderAssignment_3 ) )
            {
            // InternalMyDsl.g:2489:1: ( ( rule__MessageNormal__SenderAssignment_3 ) )
            // InternalMyDsl.g:2490:2: ( rule__MessageNormal__SenderAssignment_3 )
            {
             before(grammarAccess.getMessageNormalAccess().getSenderAssignment_3()); 
            // InternalMyDsl.g:2491:2: ( rule__MessageNormal__SenderAssignment_3 )
            // InternalMyDsl.g:2491:3: rule__MessageNormal__SenderAssignment_3
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
    // InternalMyDsl.g:2499:1: rule__MessageNormal__Group__4 : rule__MessageNormal__Group__4__Impl rule__MessageNormal__Group__5 ;
    public final void rule__MessageNormal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2503:1: ( rule__MessageNormal__Group__4__Impl rule__MessageNormal__Group__5 )
            // InternalMyDsl.g:2504:2: rule__MessageNormal__Group__4__Impl rule__MessageNormal__Group__5
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
    // InternalMyDsl.g:2511:1: rule__MessageNormal__Group__4__Impl : ( 'to' ) ;
    public final void rule__MessageNormal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2515:1: ( ( 'to' ) )
            // InternalMyDsl.g:2516:1: ( 'to' )
            {
            // InternalMyDsl.g:2516:1: ( 'to' )
            // InternalMyDsl.g:2517:2: 'to'
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
    // InternalMyDsl.g:2526:1: rule__MessageNormal__Group__5 : rule__MessageNormal__Group__5__Impl rule__MessageNormal__Group__6 ;
    public final void rule__MessageNormal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2530:1: ( rule__MessageNormal__Group__5__Impl rule__MessageNormal__Group__6 )
            // InternalMyDsl.g:2531:2: rule__MessageNormal__Group__5__Impl rule__MessageNormal__Group__6
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
    // InternalMyDsl.g:2538:1: rule__MessageNormal__Group__5__Impl : ( ( rule__MessageNormal__ReceiverAssignment_5 ) ) ;
    public final void rule__MessageNormal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( ( ( rule__MessageNormal__ReceiverAssignment_5 ) ) )
            // InternalMyDsl.g:2543:1: ( ( rule__MessageNormal__ReceiverAssignment_5 ) )
            {
            // InternalMyDsl.g:2543:1: ( ( rule__MessageNormal__ReceiverAssignment_5 ) )
            // InternalMyDsl.g:2544:2: ( rule__MessageNormal__ReceiverAssignment_5 )
            {
             before(grammarAccess.getMessageNormalAccess().getReceiverAssignment_5()); 
            // InternalMyDsl.g:2545:2: ( rule__MessageNormal__ReceiverAssignment_5 )
            // InternalMyDsl.g:2545:3: rule__MessageNormal__ReceiverAssignment_5
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
    // InternalMyDsl.g:2553:1: rule__MessageNormal__Group__6 : rule__MessageNormal__Group__6__Impl rule__MessageNormal__Group__7 ;
    public final void rule__MessageNormal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2557:1: ( rule__MessageNormal__Group__6__Impl rule__MessageNormal__Group__7 )
            // InternalMyDsl.g:2558:2: rule__MessageNormal__Group__6__Impl rule__MessageNormal__Group__7
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
    // InternalMyDsl.g:2565:1: rule__MessageNormal__Group__6__Impl : ( '.' ) ;
    public final void rule__MessageNormal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2569:1: ( ( '.' ) )
            // InternalMyDsl.g:2570:1: ( '.' )
            {
            // InternalMyDsl.g:2570:1: ( '.' )
            // InternalMyDsl.g:2571:2: '.'
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
    // InternalMyDsl.g:2580:1: rule__MessageNormal__Group__7 : rule__MessageNormal__Group__7__Impl ;
    public final void rule__MessageNormal__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2584:1: ( rule__MessageNormal__Group__7__Impl )
            // InternalMyDsl.g:2585:2: rule__MessageNormal__Group__7__Impl
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
    // InternalMyDsl.g:2591:1: rule__MessageNormal__Group__7__Impl : ( ( rule__MessageNormal__ProtocolAssignment_7 ) ) ;
    public final void rule__MessageNormal__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2595:1: ( ( ( rule__MessageNormal__ProtocolAssignment_7 ) ) )
            // InternalMyDsl.g:2596:1: ( ( rule__MessageNormal__ProtocolAssignment_7 ) )
            {
            // InternalMyDsl.g:2596:1: ( ( rule__MessageNormal__ProtocolAssignment_7 ) )
            // InternalMyDsl.g:2597:2: ( rule__MessageNormal__ProtocolAssignment_7 )
            {
             before(grammarAccess.getMessageNormalAccess().getProtocolAssignment_7()); 
            // InternalMyDsl.g:2598:2: ( rule__MessageNormal__ProtocolAssignment_7 )
            // InternalMyDsl.g:2598:3: rule__MessageNormal__ProtocolAssignment_7
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
    // InternalMyDsl.g:2607:1: rule__MessageNormal__Group_1_0__0 : rule__MessageNormal__Group_1_0__0__Impl rule__MessageNormal__Group_1_0__1 ;
    public final void rule__MessageNormal__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2611:1: ( rule__MessageNormal__Group_1_0__0__Impl rule__MessageNormal__Group_1_0__1 )
            // InternalMyDsl.g:2612:2: rule__MessageNormal__Group_1_0__0__Impl rule__MessageNormal__Group_1_0__1
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
    // InternalMyDsl.g:2619:1: rule__MessageNormal__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__MessageNormal__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( ( '(' ) )
            // InternalMyDsl.g:2624:1: ( '(' )
            {
            // InternalMyDsl.g:2624:1: ( '(' )
            // InternalMyDsl.g:2625:2: '('
            {
             before(grammarAccess.getMessageNormalAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:2634:1: rule__MessageNormal__Group_1_0__1 : rule__MessageNormal__Group_1_0__1__Impl rule__MessageNormal__Group_1_0__2 ;
    public final void rule__MessageNormal__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2638:1: ( rule__MessageNormal__Group_1_0__1__Impl rule__MessageNormal__Group_1_0__2 )
            // InternalMyDsl.g:2639:2: rule__MessageNormal__Group_1_0__1__Impl rule__MessageNormal__Group_1_0__2
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
    // InternalMyDsl.g:2646:1: rule__MessageNormal__Group_1_0__1__Impl : ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? ) ;
    public final void rule__MessageNormal__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2650:1: ( ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? ) )
            // InternalMyDsl.g:2651:1: ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? )
            {
            // InternalMyDsl.g:2651:1: ( ( rule__MessageNormal__PayloadAssignment_1_0_1 )? )
            // InternalMyDsl.g:2652:2: ( rule__MessageNormal__PayloadAssignment_1_0_1 )?
            {
             before(grammarAccess.getMessageNormalAccess().getPayloadAssignment_1_0_1()); 
            // InternalMyDsl.g:2653:2: ( rule__MessageNormal__PayloadAssignment_1_0_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=12 && LA13_0<=14)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2653:3: rule__MessageNormal__PayloadAssignment_1_0_1
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
    // InternalMyDsl.g:2661:1: rule__MessageNormal__Group_1_0__2 : rule__MessageNormal__Group_1_0__2__Impl ;
    public final void rule__MessageNormal__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2665:1: ( rule__MessageNormal__Group_1_0__2__Impl )
            // InternalMyDsl.g:2666:2: rule__MessageNormal__Group_1_0__2__Impl
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
    // InternalMyDsl.g:2672:1: rule__MessageNormal__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__MessageNormal__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2676:1: ( ( ')' ) )
            // InternalMyDsl.g:2677:1: ( ')' )
            {
            // InternalMyDsl.g:2677:1: ( ')' )
            // InternalMyDsl.g:2678:2: ')'
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
    // InternalMyDsl.g:2688:1: rule__MessageQuit__Group__0 : rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1 ;
    public final void rule__MessageQuit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2692:1: ( rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1 )
            // InternalMyDsl.g:2693:2: rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1
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
    // InternalMyDsl.g:2700:1: rule__MessageQuit__Group__0__Impl : ( ( rule__MessageQuit__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageQuit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( ( ( rule__MessageQuit__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2705:1: ( ( rule__MessageQuit__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2705:1: ( ( rule__MessageQuit__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2706:2: ( rule__MessageQuit__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageQuitAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2707:2: ( rule__MessageQuit__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2707:3: rule__MessageQuit__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2715:1: rule__MessageQuit__Group__1 : rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2 ;
    public final void rule__MessageQuit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2719:1: ( rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2 )
            // InternalMyDsl.g:2720:2: rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2
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
    // InternalMyDsl.g:2727:1: rule__MessageQuit__Group__1__Impl : ( '()' ) ;
    public final void rule__MessageQuit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2731:1: ( ( '()' ) )
            // InternalMyDsl.g:2732:1: ( '()' )
            {
            // InternalMyDsl.g:2732:1: ( '()' )
            // InternalMyDsl.g:2733:2: '()'
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
    // InternalMyDsl.g:2742:1: rule__MessageQuit__Group__2 : rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3 ;
    public final void rule__MessageQuit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2746:1: ( rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3 )
            // InternalMyDsl.g:2747:2: rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3
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
    // InternalMyDsl.g:2754:1: rule__MessageQuit__Group__2__Impl : ( 'from' ) ;
    public final void rule__MessageQuit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( ( 'from' ) )
            // InternalMyDsl.g:2759:1: ( 'from' )
            {
            // InternalMyDsl.g:2759:1: ( 'from' )
            // InternalMyDsl.g:2760:2: 'from'
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
    // InternalMyDsl.g:2769:1: rule__MessageQuit__Group__3 : rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4 ;
    public final void rule__MessageQuit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2773:1: ( rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4 )
            // InternalMyDsl.g:2774:2: rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4
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
    // InternalMyDsl.g:2781:1: rule__MessageQuit__Group__3__Impl : ( ( rule__MessageQuit__SenderAssignment_3 ) ) ;
    public final void rule__MessageQuit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2785:1: ( ( ( rule__MessageQuit__SenderAssignment_3 ) ) )
            // InternalMyDsl.g:2786:1: ( ( rule__MessageQuit__SenderAssignment_3 ) )
            {
            // InternalMyDsl.g:2786:1: ( ( rule__MessageQuit__SenderAssignment_3 ) )
            // InternalMyDsl.g:2787:2: ( rule__MessageQuit__SenderAssignment_3 )
            {
             before(grammarAccess.getMessageQuitAccess().getSenderAssignment_3()); 
            // InternalMyDsl.g:2788:2: ( rule__MessageQuit__SenderAssignment_3 )
            // InternalMyDsl.g:2788:3: rule__MessageQuit__SenderAssignment_3
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
    // InternalMyDsl.g:2796:1: rule__MessageQuit__Group__4 : rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5 ;
    public final void rule__MessageQuit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2800:1: ( rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5 )
            // InternalMyDsl.g:2801:2: rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5
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
    // InternalMyDsl.g:2808:1: rule__MessageQuit__Group__4__Impl : ( 'to' ) ;
    public final void rule__MessageQuit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2812:1: ( ( 'to' ) )
            // InternalMyDsl.g:2813:1: ( 'to' )
            {
            // InternalMyDsl.g:2813:1: ( 'to' )
            // InternalMyDsl.g:2814:2: 'to'
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
    // InternalMyDsl.g:2823:1: rule__MessageQuit__Group__5 : rule__MessageQuit__Group__5__Impl ;
    public final void rule__MessageQuit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2827:1: ( rule__MessageQuit__Group__5__Impl )
            // InternalMyDsl.g:2828:2: rule__MessageQuit__Group__5__Impl
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
    // InternalMyDsl.g:2834:1: rule__MessageQuit__Group__5__Impl : ( ( rule__MessageQuit__ReceiverAssignment_5 ) ) ;
    public final void rule__MessageQuit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2838:1: ( ( ( rule__MessageQuit__ReceiverAssignment_5 ) ) )
            // InternalMyDsl.g:2839:1: ( ( rule__MessageQuit__ReceiverAssignment_5 ) )
            {
            // InternalMyDsl.g:2839:1: ( ( rule__MessageQuit__ReceiverAssignment_5 ) )
            // InternalMyDsl.g:2840:2: ( rule__MessageQuit__ReceiverAssignment_5 )
            {
             before(grammarAccess.getMessageQuitAccess().getReceiverAssignment_5()); 
            // InternalMyDsl.g:2841:2: ( rule__MessageQuit__ReceiverAssignment_5 )
            // InternalMyDsl.g:2841:3: rule__MessageQuit__ReceiverAssignment_5
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
    // InternalMyDsl.g:2850:1: rule__Payload__Group__0 : rule__Payload__Group__0__Impl rule__Payload__Group__1 ;
    public final void rule__Payload__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2854:1: ( rule__Payload__Group__0__Impl rule__Payload__Group__1 )
            // InternalMyDsl.g:2855:2: rule__Payload__Group__0__Impl rule__Payload__Group__1
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
    // InternalMyDsl.g:2862:1: rule__Payload__Group__0__Impl : ( ( rule__Payload__TypesAssignment_0 ) ) ;
    public final void rule__Payload__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2866:1: ( ( ( rule__Payload__TypesAssignment_0 ) ) )
            // InternalMyDsl.g:2867:1: ( ( rule__Payload__TypesAssignment_0 ) )
            {
            // InternalMyDsl.g:2867:1: ( ( rule__Payload__TypesAssignment_0 ) )
            // InternalMyDsl.g:2868:2: ( rule__Payload__TypesAssignment_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0()); 
            // InternalMyDsl.g:2869:2: ( rule__Payload__TypesAssignment_0 )
            // InternalMyDsl.g:2869:3: rule__Payload__TypesAssignment_0
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
    // InternalMyDsl.g:2877:1: rule__Payload__Group__1 : rule__Payload__Group__1__Impl ;
    public final void rule__Payload__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2881:1: ( rule__Payload__Group__1__Impl )
            // InternalMyDsl.g:2882:2: rule__Payload__Group__1__Impl
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
    // InternalMyDsl.g:2888:1: rule__Payload__Group__1__Impl : ( ( rule__Payload__Group_1__0 )* ) ;
    public final void rule__Payload__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2892:1: ( ( ( rule__Payload__Group_1__0 )* ) )
            // InternalMyDsl.g:2893:1: ( ( rule__Payload__Group_1__0 )* )
            {
            // InternalMyDsl.g:2893:1: ( ( rule__Payload__Group_1__0 )* )
            // InternalMyDsl.g:2894:2: ( rule__Payload__Group_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_1()); 
            // InternalMyDsl.g:2895:2: ( rule__Payload__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2895:3: rule__Payload__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Payload__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:2904:1: rule__Payload__Group_1__0 : rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 ;
    public final void rule__Payload__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2908:1: ( rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 )
            // InternalMyDsl.g:2909:2: rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1
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
    // InternalMyDsl.g:2916:1: rule__Payload__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( ( ',' ) )
            // InternalMyDsl.g:2921:1: ( ',' )
            {
            // InternalMyDsl.g:2921:1: ( ',' )
            // InternalMyDsl.g:2922:2: ','
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
    // InternalMyDsl.g:2931:1: rule__Payload__Group_1__1 : rule__Payload__Group_1__1__Impl ;
    public final void rule__Payload__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2935:1: ( rule__Payload__Group_1__1__Impl )
            // InternalMyDsl.g:2936:2: rule__Payload__Group_1__1__Impl
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
    // InternalMyDsl.g:2942:1: rule__Payload__Group_1__1__Impl : ( ( rule__Payload__TypesAssignment_1_1 ) ) ;
    public final void rule__Payload__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2946:1: ( ( ( rule__Payload__TypesAssignment_1_1 ) ) )
            // InternalMyDsl.g:2947:1: ( ( rule__Payload__TypesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2947:1: ( ( rule__Payload__TypesAssignment_1_1 ) )
            // InternalMyDsl.g:2948:2: ( rule__Payload__TypesAssignment_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_1_1()); 
            // InternalMyDsl.g:2949:2: ( rule__Payload__TypesAssignment_1_1 )
            // InternalMyDsl.g:2949:3: rule__Payload__TypesAssignment_1_1
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
    // InternalMyDsl.g:2958:1: rule__LocalProtocol__Group__0 : rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 ;
    public final void rule__LocalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2962:1: ( rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 )
            // InternalMyDsl.g:2963:2: rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1
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
    // InternalMyDsl.g:2970:1: rule__LocalProtocol__Group__0__Impl : ( 'local' ) ;
    public final void rule__LocalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2974:1: ( ( 'local' ) )
            // InternalMyDsl.g:2975:1: ( 'local' )
            {
            // InternalMyDsl.g:2975:1: ( 'local' )
            // InternalMyDsl.g:2976:2: 'local'
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
    // InternalMyDsl.g:2985:1: rule__LocalProtocol__Group__1 : rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 ;
    public final void rule__LocalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2989:1: ( rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 )
            // InternalMyDsl.g:2990:2: rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2
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
    // InternalMyDsl.g:2997:1: rule__LocalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__LocalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3001:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:3002:1: ( 'protocol' )
            {
            // InternalMyDsl.g:3002:1: ( 'protocol' )
            // InternalMyDsl.g:3003:2: 'protocol'
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:3012:1: rule__LocalProtocol__Group__2 : rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 ;
    public final void rule__LocalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3016:1: ( rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 )
            // InternalMyDsl.g:3017:2: rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3
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
    // InternalMyDsl.g:3024:1: rule__LocalProtocol__Group__2__Impl : ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__LocalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3028:1: ( ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:3029:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:3029:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:3030:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:3031:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:3031:3: rule__LocalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:3039:1: rule__LocalProtocol__Group__3 : rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 ;
    public final void rule__LocalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3043:1: ( rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 )
            // InternalMyDsl.g:3044:2: rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4
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
    // InternalMyDsl.g:3051:1: rule__LocalProtocol__Group__3__Impl : ( 'at' ) ;
    public final void rule__LocalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3055:1: ( ( 'at' ) )
            // InternalMyDsl.g:3056:1: ( 'at' )
            {
            // InternalMyDsl.g:3056:1: ( 'at' )
            // InternalMyDsl.g:3057:2: 'at'
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
    // InternalMyDsl.g:3066:1: rule__LocalProtocol__Group__4 : rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 ;
    public final void rule__LocalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3070:1: ( rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 )
            // InternalMyDsl.g:3071:2: rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5
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
    // InternalMyDsl.g:3078:1: rule__LocalProtocol__Group__4__Impl : ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) ;
    public final void rule__LocalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3082:1: ( ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) )
            // InternalMyDsl.g:3083:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            {
            // InternalMyDsl.g:3083:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            // InternalMyDsl.g:3084:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_4()); 
            // InternalMyDsl.g:3085:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            // InternalMyDsl.g:3085:3: rule__LocalProtocol__ProjectedRoleAssignment_4
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
    // InternalMyDsl.g:3093:1: rule__LocalProtocol__Group__5 : rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 ;
    public final void rule__LocalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3097:1: ( rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 )
            // InternalMyDsl.g:3098:2: rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6
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
    // InternalMyDsl.g:3105:1: rule__LocalProtocol__Group__5__Impl : ( '(' ) ;
    public final void rule__LocalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3109:1: ( ( '(' ) )
            // InternalMyDsl.g:3110:1: ( '(' )
            {
            // InternalMyDsl.g:3110:1: ( '(' )
            // InternalMyDsl.g:3111:2: '('
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:3120:1: rule__LocalProtocol__Group__6 : rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 ;
    public final void rule__LocalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3124:1: ( rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 )
            // InternalMyDsl.g:3125:2: rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:3132:1: rule__LocalProtocol__Group__6__Impl : ( ( rule__LocalProtocol__RolesAssignment_6 ) ) ;
    public final void rule__LocalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3136:1: ( ( ( rule__LocalProtocol__RolesAssignment_6 ) ) )
            // InternalMyDsl.g:3137:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            {
            // InternalMyDsl.g:3137:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            // InternalMyDsl.g:3138:2: ( rule__LocalProtocol__RolesAssignment_6 )
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesAssignment_6()); 
            // InternalMyDsl.g:3139:2: ( rule__LocalProtocol__RolesAssignment_6 )
            // InternalMyDsl.g:3139:3: rule__LocalProtocol__RolesAssignment_6
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
    // InternalMyDsl.g:3147:1: rule__LocalProtocol__Group__7 : rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 ;
    public final void rule__LocalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3151:1: ( rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 )
            // InternalMyDsl.g:3152:2: rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3159:1: rule__LocalProtocol__Group__7__Impl : ( '){' ) ;
    public final void rule__LocalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3163:1: ( ( '){' ) )
            // InternalMyDsl.g:3164:1: ( '){' )
            {
            // InternalMyDsl.g:3164:1: ( '){' )
            // InternalMyDsl.g:3165:2: '){'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalMyDsl.g:3174:1: rule__LocalProtocol__Group__8 : rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 ;
    public final void rule__LocalProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3178:1: ( rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 )
            // InternalMyDsl.g:3179:2: rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9
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
    // InternalMyDsl.g:3186:1: rule__LocalProtocol__Group__8__Impl : ( ( rule__LocalProtocol__ProtocolAssignment_8 ) ) ;
    public final void rule__LocalProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3190:1: ( ( ( rule__LocalProtocol__ProtocolAssignment_8 ) ) )
            // InternalMyDsl.g:3191:1: ( ( rule__LocalProtocol__ProtocolAssignment_8 ) )
            {
            // InternalMyDsl.g:3191:1: ( ( rule__LocalProtocol__ProtocolAssignment_8 ) )
            // InternalMyDsl.g:3192:2: ( rule__LocalProtocol__ProtocolAssignment_8 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_8()); 
            // InternalMyDsl.g:3193:2: ( rule__LocalProtocol__ProtocolAssignment_8 )
            // InternalMyDsl.g:3193:3: rule__LocalProtocol__ProtocolAssignment_8
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
    // InternalMyDsl.g:3201:1: rule__LocalProtocol__Group__9 : rule__LocalProtocol__Group__9__Impl ;
    public final void rule__LocalProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3205:1: ( rule__LocalProtocol__Group__9__Impl )
            // InternalMyDsl.g:3206:2: rule__LocalProtocol__Group__9__Impl
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
    // InternalMyDsl.g:3212:1: rule__LocalProtocol__Group__9__Impl : ( '}' ) ;
    public final void rule__LocalProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3216:1: ( ( '}' ) )
            // InternalMyDsl.g:3217:1: ( '}' )
            {
            // InternalMyDsl.g:3217:1: ( '}' )
            // InternalMyDsl.g:3218:2: '}'
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


    // $ANTLR start "rule__RecursionL__Group__0"
    // InternalMyDsl.g:3228:1: rule__RecursionL__Group__0 : rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 ;
    public final void rule__RecursionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3232:1: ( rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 )
            // InternalMyDsl.g:3233:2: rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1
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
    // InternalMyDsl.g:3240:1: rule__RecursionL__Group__0__Impl : ( 'rec' ) ;
    public final void rule__RecursionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3244:1: ( ( 'rec' ) )
            // InternalMyDsl.g:3245:1: ( 'rec' )
            {
            // InternalMyDsl.g:3245:1: ( 'rec' )
            // InternalMyDsl.g:3246:2: 'rec'
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
    // InternalMyDsl.g:3255:1: rule__RecursionL__Group__1 : rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 ;
    public final void rule__RecursionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3259:1: ( rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 )
            // InternalMyDsl.g:3260:2: rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2
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
    // InternalMyDsl.g:3267:1: rule__RecursionL__Group__1__Impl : ( ( rule__RecursionL__NameAssignment_1 ) ) ;
    public final void rule__RecursionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3271:1: ( ( ( rule__RecursionL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3272:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3272:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            // InternalMyDsl.g:3273:2: ( rule__RecursionL__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3274:2: ( rule__RecursionL__NameAssignment_1 )
            // InternalMyDsl.g:3274:3: rule__RecursionL__NameAssignment_1
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
    // InternalMyDsl.g:3282:1: rule__RecursionL__Group__2 : rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3 ;
    public final void rule__RecursionL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3286:1: ( rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3 )
            // InternalMyDsl.g:3287:2: rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3
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
    // InternalMyDsl.g:3294:1: rule__RecursionL__Group__2__Impl : ( ':' ) ;
    public final void rule__RecursionL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3298:1: ( ( ':' ) )
            // InternalMyDsl.g:3299:1: ( ':' )
            {
            // InternalMyDsl.g:3299:1: ( ':' )
            // InternalMyDsl.g:3300:2: ':'
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
    // InternalMyDsl.g:3309:1: rule__RecursionL__Group__3 : rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4 ;
    public final void rule__RecursionL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3313:1: ( rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4 )
            // InternalMyDsl.g:3314:2: rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3321:1: rule__RecursionL__Group__3__Impl : ( '{' ) ;
    public final void rule__RecursionL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3325:1: ( ( '{' ) )
            // InternalMyDsl.g:3326:1: ( '{' )
            {
            // InternalMyDsl.g:3326:1: ( '{' )
            // InternalMyDsl.g:3327:2: '{'
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
    // InternalMyDsl.g:3336:1: rule__RecursionL__Group__4 : rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5 ;
    public final void rule__RecursionL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3340:1: ( rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5 )
            // InternalMyDsl.g:3341:2: rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5
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
    // InternalMyDsl.g:3348:1: rule__RecursionL__Group__4__Impl : ( ( rule__RecursionL__RecProtocolAssignment_4 ) ) ;
    public final void rule__RecursionL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3352:1: ( ( ( rule__RecursionL__RecProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:3353:1: ( ( rule__RecursionL__RecProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:3353:1: ( ( rule__RecursionL__RecProtocolAssignment_4 ) )
            // InternalMyDsl.g:3354:2: ( rule__RecursionL__RecProtocolAssignment_4 )
            {
             before(grammarAccess.getRecursionLAccess().getRecProtocolAssignment_4()); 
            // InternalMyDsl.g:3355:2: ( rule__RecursionL__RecProtocolAssignment_4 )
            // InternalMyDsl.g:3355:3: rule__RecursionL__RecProtocolAssignment_4
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
    // InternalMyDsl.g:3363:1: rule__RecursionL__Group__5 : rule__RecursionL__Group__5__Impl ;
    public final void rule__RecursionL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3367:1: ( rule__RecursionL__Group__5__Impl )
            // InternalMyDsl.g:3368:2: rule__RecursionL__Group__5__Impl
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
    // InternalMyDsl.g:3374:1: rule__RecursionL__Group__5__Impl : ( '}' ) ;
    public final void rule__RecursionL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3378:1: ( ( '}' ) )
            // InternalMyDsl.g:3379:1: ( '}' )
            {
            // InternalMyDsl.g:3379:1: ( '}' )
            // InternalMyDsl.g:3380:2: '}'
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
    // InternalMyDsl.g:3390:1: rule__CloseRecursionL__Group__0 : rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1 ;
    public final void rule__CloseRecursionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3394:1: ( rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1 )
            // InternalMyDsl.g:3395:2: rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1
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
    // InternalMyDsl.g:3402:1: rule__CloseRecursionL__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3406:1: ( ( 'loop' ) )
            // InternalMyDsl.g:3407:1: ( 'loop' )
            {
            // InternalMyDsl.g:3407:1: ( 'loop' )
            // InternalMyDsl.g:3408:2: 'loop'
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
    // InternalMyDsl.g:3417:1: rule__CloseRecursionL__Group__1 : rule__CloseRecursionL__Group__1__Impl ;
    public final void rule__CloseRecursionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3421:1: ( rule__CloseRecursionL__Group__1__Impl )
            // InternalMyDsl.g:3422:2: rule__CloseRecursionL__Group__1__Impl
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
    // InternalMyDsl.g:3428:1: rule__CloseRecursionL__Group__1__Impl : ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3432:1: ( ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:3433:1: ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:3433:1: ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:3434:2: ( rule__CloseRecursionL__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionLAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:3435:2: ( rule__CloseRecursionL__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:3435:3: rule__CloseRecursionL__RecursionVariableAssignment_1
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
    // InternalMyDsl.g:3444:1: rule__MessageNormalL__Group__0 : rule__MessageNormalL__Group__0__Impl rule__MessageNormalL__Group__1 ;
    public final void rule__MessageNormalL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3448:1: ( rule__MessageNormalL__Group__0__Impl rule__MessageNormalL__Group__1 )
            // InternalMyDsl.g:3449:2: rule__MessageNormalL__Group__0__Impl rule__MessageNormalL__Group__1
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
    // InternalMyDsl.g:3456:1: rule__MessageNormalL__Group__0__Impl : ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageNormalL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3460:1: ( ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3461:1: ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3461:1: ( ( rule__MessageNormalL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:3462:2: ( rule__MessageNormalL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageNormalLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:3463:2: ( rule__MessageNormalL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:3463:3: rule__MessageNormalL__MessageTypeAssignment_0
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
    // InternalMyDsl.g:3471:1: rule__MessageNormalL__Group__1 : rule__MessageNormalL__Group__1__Impl rule__MessageNormalL__Group__2 ;
    public final void rule__MessageNormalL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3475:1: ( rule__MessageNormalL__Group__1__Impl rule__MessageNormalL__Group__2 )
            // InternalMyDsl.g:3476:2: rule__MessageNormalL__Group__1__Impl rule__MessageNormalL__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3483:1: rule__MessageNormalL__Group__1__Impl : ( ( rule__MessageNormalL__Alternatives_1 ) ) ;
    public final void rule__MessageNormalL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3487:1: ( ( ( rule__MessageNormalL__Alternatives_1 ) ) )
            // InternalMyDsl.g:3488:1: ( ( rule__MessageNormalL__Alternatives_1 ) )
            {
            // InternalMyDsl.g:3488:1: ( ( rule__MessageNormalL__Alternatives_1 ) )
            // InternalMyDsl.g:3489:2: ( rule__MessageNormalL__Alternatives_1 )
            {
             before(grammarAccess.getMessageNormalLAccess().getAlternatives_1()); 
            // InternalMyDsl.g:3490:2: ( rule__MessageNormalL__Alternatives_1 )
            // InternalMyDsl.g:3490:3: rule__MessageNormalL__Alternatives_1
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
    // InternalMyDsl.g:3498:1: rule__MessageNormalL__Group__2 : rule__MessageNormalL__Group__2__Impl rule__MessageNormalL__Group__3 ;
    public final void rule__MessageNormalL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3502:1: ( rule__MessageNormalL__Group__2__Impl rule__MessageNormalL__Group__3 )
            // InternalMyDsl.g:3503:2: rule__MessageNormalL__Group__2__Impl rule__MessageNormalL__Group__3
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
    // InternalMyDsl.g:3510:1: rule__MessageNormalL__Group__2__Impl : ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) ) ;
    public final void rule__MessageNormalL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3514:1: ( ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) ) )
            // InternalMyDsl.g:3515:1: ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) )
            {
            // InternalMyDsl.g:3515:1: ( ( rule__MessageNormalL__SendReceiveAssignment_2 ) )
            // InternalMyDsl.g:3516:2: ( rule__MessageNormalL__SendReceiveAssignment_2 )
            {
             before(grammarAccess.getMessageNormalLAccess().getSendReceiveAssignment_2()); 
            // InternalMyDsl.g:3517:2: ( rule__MessageNormalL__SendReceiveAssignment_2 )
            // InternalMyDsl.g:3517:3: rule__MessageNormalL__SendReceiveAssignment_2
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
    // InternalMyDsl.g:3525:1: rule__MessageNormalL__Group__3 : rule__MessageNormalL__Group__3__Impl rule__MessageNormalL__Group__4 ;
    public final void rule__MessageNormalL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3529:1: ( rule__MessageNormalL__Group__3__Impl rule__MessageNormalL__Group__4 )
            // InternalMyDsl.g:3530:2: rule__MessageNormalL__Group__3__Impl rule__MessageNormalL__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3537:1: rule__MessageNormalL__Group__3__Impl : ( '.' ) ;
    public final void rule__MessageNormalL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3541:1: ( ( '.' ) )
            // InternalMyDsl.g:3542:1: ( '.' )
            {
            // InternalMyDsl.g:3542:1: ( '.' )
            // InternalMyDsl.g:3543:2: '.'
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
    // InternalMyDsl.g:3552:1: rule__MessageNormalL__Group__4 : rule__MessageNormalL__Group__4__Impl ;
    public final void rule__MessageNormalL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3556:1: ( rule__MessageNormalL__Group__4__Impl )
            // InternalMyDsl.g:3557:2: rule__MessageNormalL__Group__4__Impl
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
    // InternalMyDsl.g:3563:1: rule__MessageNormalL__Group__4__Impl : ( ( rule__MessageNormalL__ProtocolAssignment_4 ) ) ;
    public final void rule__MessageNormalL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3567:1: ( ( ( rule__MessageNormalL__ProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:3568:1: ( ( rule__MessageNormalL__ProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:3568:1: ( ( rule__MessageNormalL__ProtocolAssignment_4 ) )
            // InternalMyDsl.g:3569:2: ( rule__MessageNormalL__ProtocolAssignment_4 )
            {
             before(grammarAccess.getMessageNormalLAccess().getProtocolAssignment_4()); 
            // InternalMyDsl.g:3570:2: ( rule__MessageNormalL__ProtocolAssignment_4 )
            // InternalMyDsl.g:3570:3: rule__MessageNormalL__ProtocolAssignment_4
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
    // InternalMyDsl.g:3579:1: rule__MessageNormalL__Group_1_0__0 : rule__MessageNormalL__Group_1_0__0__Impl rule__MessageNormalL__Group_1_0__1 ;
    public final void rule__MessageNormalL__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3583:1: ( rule__MessageNormalL__Group_1_0__0__Impl rule__MessageNormalL__Group_1_0__1 )
            // InternalMyDsl.g:3584:2: rule__MessageNormalL__Group_1_0__0__Impl rule__MessageNormalL__Group_1_0__1
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
    // InternalMyDsl.g:3591:1: rule__MessageNormalL__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__MessageNormalL__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3595:1: ( ( '(' ) )
            // InternalMyDsl.g:3596:1: ( '(' )
            {
            // InternalMyDsl.g:3596:1: ( '(' )
            // InternalMyDsl.g:3597:2: '('
            {
             before(grammarAccess.getMessageNormalLAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:3606:1: rule__MessageNormalL__Group_1_0__1 : rule__MessageNormalL__Group_1_0__1__Impl rule__MessageNormalL__Group_1_0__2 ;
    public final void rule__MessageNormalL__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3610:1: ( rule__MessageNormalL__Group_1_0__1__Impl rule__MessageNormalL__Group_1_0__2 )
            // InternalMyDsl.g:3611:2: rule__MessageNormalL__Group_1_0__1__Impl rule__MessageNormalL__Group_1_0__2
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
    // InternalMyDsl.g:3618:1: rule__MessageNormalL__Group_1_0__1__Impl : ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? ) ;
    public final void rule__MessageNormalL__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3622:1: ( ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? ) )
            // InternalMyDsl.g:3623:1: ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? )
            {
            // InternalMyDsl.g:3623:1: ( ( rule__MessageNormalL__PayloadAssignment_1_0_1 )? )
            // InternalMyDsl.g:3624:2: ( rule__MessageNormalL__PayloadAssignment_1_0_1 )?
            {
             before(grammarAccess.getMessageNormalLAccess().getPayloadAssignment_1_0_1()); 
            // InternalMyDsl.g:3625:2: ( rule__MessageNormalL__PayloadAssignment_1_0_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=12 && LA15_0<=14)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:3625:3: rule__MessageNormalL__PayloadAssignment_1_0_1
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
    // InternalMyDsl.g:3633:1: rule__MessageNormalL__Group_1_0__2 : rule__MessageNormalL__Group_1_0__2__Impl ;
    public final void rule__MessageNormalL__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3637:1: ( rule__MessageNormalL__Group_1_0__2__Impl )
            // InternalMyDsl.g:3638:2: rule__MessageNormalL__Group_1_0__2__Impl
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
    // InternalMyDsl.g:3644:1: rule__MessageNormalL__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__MessageNormalL__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3648:1: ( ( ')' ) )
            // InternalMyDsl.g:3649:1: ( ')' )
            {
            // InternalMyDsl.g:3649:1: ( ')' )
            // InternalMyDsl.g:3650:2: ')'
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
    // InternalMyDsl.g:3660:1: rule__MessageQuitL__Group__0 : rule__MessageQuitL__Group__0__Impl rule__MessageQuitL__Group__1 ;
    public final void rule__MessageQuitL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3664:1: ( rule__MessageQuitL__Group__0__Impl rule__MessageQuitL__Group__1 )
            // InternalMyDsl.g:3665:2: rule__MessageQuitL__Group__0__Impl rule__MessageQuitL__Group__1
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
    // InternalMyDsl.g:3672:1: rule__MessageQuitL__Group__0__Impl : ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageQuitL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3676:1: ( ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3677:1: ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3677:1: ( ( rule__MessageQuitL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:3678:2: ( rule__MessageQuitL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageQuitLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:3679:2: ( rule__MessageQuitL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:3679:3: rule__MessageQuitL__MessageTypeAssignment_0
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
    // InternalMyDsl.g:3687:1: rule__MessageQuitL__Group__1 : rule__MessageQuitL__Group__1__Impl rule__MessageQuitL__Group__2 ;
    public final void rule__MessageQuitL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3691:1: ( rule__MessageQuitL__Group__1__Impl rule__MessageQuitL__Group__2 )
            // InternalMyDsl.g:3692:2: rule__MessageQuitL__Group__1__Impl rule__MessageQuitL__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3699:1: rule__MessageQuitL__Group__1__Impl : ( '()' ) ;
    public final void rule__MessageQuitL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3703:1: ( ( '()' ) )
            // InternalMyDsl.g:3704:1: ( '()' )
            {
            // InternalMyDsl.g:3704:1: ( '()' )
            // InternalMyDsl.g:3705:2: '()'
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
    // InternalMyDsl.g:3714:1: rule__MessageQuitL__Group__2 : rule__MessageQuitL__Group__2__Impl ;
    public final void rule__MessageQuitL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3718:1: ( rule__MessageQuitL__Group__2__Impl )
            // InternalMyDsl.g:3719:2: rule__MessageQuitL__Group__2__Impl
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
    // InternalMyDsl.g:3725:1: rule__MessageQuitL__Group__2__Impl : ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) ) ;
    public final void rule__MessageQuitL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3729:1: ( ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) ) )
            // InternalMyDsl.g:3730:1: ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) )
            {
            // InternalMyDsl.g:3730:1: ( ( rule__MessageQuitL__SendReceiveAssignment_2 ) )
            // InternalMyDsl.g:3731:2: ( rule__MessageQuitL__SendReceiveAssignment_2 )
            {
             before(grammarAccess.getMessageQuitLAccess().getSendReceiveAssignment_2()); 
            // InternalMyDsl.g:3732:2: ( rule__MessageQuitL__SendReceiveAssignment_2 )
            // InternalMyDsl.g:3732:3: rule__MessageQuitL__SendReceiveAssignment_2
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
    // InternalMyDsl.g:3741:1: rule__SenderL__Group__0 : rule__SenderL__Group__0__Impl rule__SenderL__Group__1 ;
    public final void rule__SenderL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3745:1: ( rule__SenderL__Group__0__Impl rule__SenderL__Group__1 )
            // InternalMyDsl.g:3746:2: rule__SenderL__Group__0__Impl rule__SenderL__Group__1
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
    // InternalMyDsl.g:3753:1: rule__SenderL__Group__0__Impl : ( 'from' ) ;
    public final void rule__SenderL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3757:1: ( ( 'from' ) )
            // InternalMyDsl.g:3758:1: ( 'from' )
            {
            // InternalMyDsl.g:3758:1: ( 'from' )
            // InternalMyDsl.g:3759:2: 'from'
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
    // InternalMyDsl.g:3768:1: rule__SenderL__Group__1 : rule__SenderL__Group__1__Impl ;
    public final void rule__SenderL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3772:1: ( rule__SenderL__Group__1__Impl )
            // InternalMyDsl.g:3773:2: rule__SenderL__Group__1__Impl
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
    // InternalMyDsl.g:3779:1: rule__SenderL__Group__1__Impl : ( ( rule__SenderL__RoleAssignment_1 ) ) ;
    public final void rule__SenderL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3783:1: ( ( ( rule__SenderL__RoleAssignment_1 ) ) )
            // InternalMyDsl.g:3784:1: ( ( rule__SenderL__RoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3784:1: ( ( rule__SenderL__RoleAssignment_1 ) )
            // InternalMyDsl.g:3785:2: ( rule__SenderL__RoleAssignment_1 )
            {
             before(grammarAccess.getSenderLAccess().getRoleAssignment_1()); 
            // InternalMyDsl.g:3786:2: ( rule__SenderL__RoleAssignment_1 )
            // InternalMyDsl.g:3786:3: rule__SenderL__RoleAssignment_1
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
    // InternalMyDsl.g:3795:1: rule__ReceiverL__Group__0 : rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 ;
    public final void rule__ReceiverL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3799:1: ( rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 )
            // InternalMyDsl.g:3800:2: rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1
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
    // InternalMyDsl.g:3807:1: rule__ReceiverL__Group__0__Impl : ( 'to' ) ;
    public final void rule__ReceiverL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3811:1: ( ( 'to' ) )
            // InternalMyDsl.g:3812:1: ( 'to' )
            {
            // InternalMyDsl.g:3812:1: ( 'to' )
            // InternalMyDsl.g:3813:2: 'to'
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
    // InternalMyDsl.g:3822:1: rule__ReceiverL__Group__1 : rule__ReceiverL__Group__1__Impl ;
    public final void rule__ReceiverL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3826:1: ( rule__ReceiverL__Group__1__Impl )
            // InternalMyDsl.g:3827:2: rule__ReceiverL__Group__1__Impl
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
    // InternalMyDsl.g:3833:1: rule__ReceiverL__Group__1__Impl : ( ( rule__ReceiverL__RoleAssignment_1 ) ) ;
    public final void rule__ReceiverL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3837:1: ( ( ( rule__ReceiverL__RoleAssignment_1 ) ) )
            // InternalMyDsl.g:3838:1: ( ( rule__ReceiverL__RoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3838:1: ( ( rule__ReceiverL__RoleAssignment_1 ) )
            // InternalMyDsl.g:3839:2: ( rule__ReceiverL__RoleAssignment_1 )
            {
             before(grammarAccess.getReceiverLAccess().getRoleAssignment_1()); 
            // InternalMyDsl.g:3840:2: ( rule__ReceiverL__RoleAssignment_1 )
            // InternalMyDsl.g:3840:3: rule__ReceiverL__RoleAssignment_1
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
    // InternalMyDsl.g:3849:1: rule__ChoiceL__Group__0 : rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 ;
    public final void rule__ChoiceL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3853:1: ( rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 )
            // InternalMyDsl.g:3854:2: rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1
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
    // InternalMyDsl.g:3861:1: rule__ChoiceL__Group__0__Impl : ( 'choice' ) ;
    public final void rule__ChoiceL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3865:1: ( ( 'choice' ) )
            // InternalMyDsl.g:3866:1: ( 'choice' )
            {
            // InternalMyDsl.g:3866:1: ( 'choice' )
            // InternalMyDsl.g:3867:2: 'choice'
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
    // InternalMyDsl.g:3876:1: rule__ChoiceL__Group__1 : rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 ;
    public final void rule__ChoiceL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3880:1: ( rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 )
            // InternalMyDsl.g:3881:2: rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2
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
    // InternalMyDsl.g:3888:1: rule__ChoiceL__Group__1__Impl : ( 'at' ) ;
    public final void rule__ChoiceL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3892:1: ( ( 'at' ) )
            // InternalMyDsl.g:3893:1: ( 'at' )
            {
            // InternalMyDsl.g:3893:1: ( 'at' )
            // InternalMyDsl.g:3894:2: 'at'
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
    // InternalMyDsl.g:3903:1: rule__ChoiceL__Group__2 : rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 ;
    public final void rule__ChoiceL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3907:1: ( rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 )
            // InternalMyDsl.g:3908:2: rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3
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
    // InternalMyDsl.g:3915:1: rule__ChoiceL__Group__2__Impl : ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) ) ;
    public final void rule__ChoiceL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3919:1: ( ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) ) )
            // InternalMyDsl.g:3920:1: ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) )
            {
            // InternalMyDsl.g:3920:1: ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) )
            // InternalMyDsl.g:3921:2: ( rule__ChoiceL__RoleMakingChoiceAssignment_2 )
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceAssignment_2()); 
            // InternalMyDsl.g:3922:2: ( rule__ChoiceL__RoleMakingChoiceAssignment_2 )
            // InternalMyDsl.g:3922:3: rule__ChoiceL__RoleMakingChoiceAssignment_2
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
    // InternalMyDsl.g:3930:1: rule__ChoiceL__Group__3 : rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 ;
    public final void rule__ChoiceL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3934:1: ( rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 )
            // InternalMyDsl.g:3935:2: rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4
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
    // InternalMyDsl.g:3942:1: rule__ChoiceL__Group__3__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3946:1: ( ( '{' ) )
            // InternalMyDsl.g:3947:1: ( '{' )
            {
            // InternalMyDsl.g:3947:1: ( '{' )
            // InternalMyDsl.g:3948:2: '{'
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
    // InternalMyDsl.g:3957:1: rule__ChoiceL__Group__4 : rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 ;
    public final void rule__ChoiceL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3961:1: ( rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 )
            // InternalMyDsl.g:3962:2: rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5
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
    // InternalMyDsl.g:3969:1: rule__ChoiceL__Group__4__Impl : ( ( rule__ChoiceL__BranchesAssignment_4 ) ) ;
    public final void rule__ChoiceL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3973:1: ( ( ( rule__ChoiceL__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:3974:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:3974:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            // InternalMyDsl.g:3975:2: ( rule__ChoiceL__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:3976:2: ( rule__ChoiceL__BranchesAssignment_4 )
            // InternalMyDsl.g:3976:3: rule__ChoiceL__BranchesAssignment_4
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
    // InternalMyDsl.g:3984:1: rule__ChoiceL__Group__5 : rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 ;
    public final void rule__ChoiceL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3988:1: ( rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 )
            // InternalMyDsl.g:3989:2: rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6
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
    // InternalMyDsl.g:3996:1: rule__ChoiceL__Group__5__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4000:1: ( ( '}' ) )
            // InternalMyDsl.g:4001:1: ( '}' )
            {
            // InternalMyDsl.g:4001:1: ( '}' )
            // InternalMyDsl.g:4002:2: '}'
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
    // InternalMyDsl.g:4011:1: rule__ChoiceL__Group__6 : rule__ChoiceL__Group__6__Impl ;
    public final void rule__ChoiceL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4015:1: ( rule__ChoiceL__Group__6__Impl )
            // InternalMyDsl.g:4016:2: rule__ChoiceL__Group__6__Impl
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
    // InternalMyDsl.g:4022:1: rule__ChoiceL__Group__6__Impl : ( ( rule__ChoiceL__Group_6__0 )* ) ;
    public final void rule__ChoiceL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4026:1: ( ( ( rule__ChoiceL__Group_6__0 )* ) )
            // InternalMyDsl.g:4027:1: ( ( rule__ChoiceL__Group_6__0 )* )
            {
            // InternalMyDsl.g:4027:1: ( ( rule__ChoiceL__Group_6__0 )* )
            // InternalMyDsl.g:4028:2: ( rule__ChoiceL__Group_6__0 )*
            {
             before(grammarAccess.getChoiceLAccess().getGroup_6()); 
            // InternalMyDsl.g:4029:2: ( rule__ChoiceL__Group_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:4029:3: rule__ChoiceL__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ChoiceL__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:4038:1: rule__ChoiceL__Group_6__0 : rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 ;
    public final void rule__ChoiceL__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4042:1: ( rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 )
            // InternalMyDsl.g:4043:2: rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1
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
    // InternalMyDsl.g:4050:1: rule__ChoiceL__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__ChoiceL__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4054:1: ( ( 'or' ) )
            // InternalMyDsl.g:4055:1: ( 'or' )
            {
            // InternalMyDsl.g:4055:1: ( 'or' )
            // InternalMyDsl.g:4056:2: 'or'
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
    // InternalMyDsl.g:4065:1: rule__ChoiceL__Group_6__1 : rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 ;
    public final void rule__ChoiceL__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4069:1: ( rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 )
            // InternalMyDsl.g:4070:2: rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2
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
    // InternalMyDsl.g:4077:1: rule__ChoiceL__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4081:1: ( ( '{' ) )
            // InternalMyDsl.g:4082:1: ( '{' )
            {
            // InternalMyDsl.g:4082:1: ( '{' )
            // InternalMyDsl.g:4083:2: '{'
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
    // InternalMyDsl.g:4092:1: rule__ChoiceL__Group_6__2 : rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 ;
    public final void rule__ChoiceL__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4096:1: ( rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 )
            // InternalMyDsl.g:4097:2: rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3
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
    // InternalMyDsl.g:4104:1: rule__ChoiceL__Group_6__2__Impl : ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) ;
    public final void rule__ChoiceL__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4108:1: ( ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:4109:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:4109:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:4110:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:4111:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            // InternalMyDsl.g:4111:3: rule__ChoiceL__BranchesAssignment_6_2
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
    // InternalMyDsl.g:4119:1: rule__ChoiceL__Group_6__3 : rule__ChoiceL__Group_6__3__Impl ;
    public final void rule__ChoiceL__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4123:1: ( rule__ChoiceL__Group_6__3__Impl )
            // InternalMyDsl.g:4124:2: rule__ChoiceL__Group_6__3__Impl
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
    // InternalMyDsl.g:4130:1: rule__ChoiceL__Group_6__3__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4134:1: ( ( '}' ) )
            // InternalMyDsl.g:4135:1: ( '}' )
            {
            // InternalMyDsl.g:4135:1: ( '}' )
            // InternalMyDsl.g:4136:2: '}'
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
    // InternalMyDsl.g:4146:1: rule__ForEachL__Group__0 : rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 ;
    public final void rule__ForEachL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4150:1: ( rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 )
            // InternalMyDsl.g:4151:2: rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1
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
    // InternalMyDsl.g:4158:1: rule__ForEachL__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEachL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4162:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:4163:1: ( 'foreach' )
            {
            // InternalMyDsl.g:4163:1: ( 'foreach' )
            // InternalMyDsl.g:4164:2: 'foreach'
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
    // InternalMyDsl.g:4173:1: rule__ForEachL__Group__1 : rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 ;
    public final void rule__ForEachL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4177:1: ( rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 )
            // InternalMyDsl.g:4178:2: rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2
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
    // InternalMyDsl.g:4185:1: rule__ForEachL__Group__1__Impl : ( ( rule__ForEachL__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEachL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4189:1: ( ( ( rule__ForEachL__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:4190:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:4190:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:4191:2: ( rule__ForEachL__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachLAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:4192:2: ( rule__ForEachL__EachRoleAssignment_1 )
            // InternalMyDsl.g:4192:3: rule__ForEachL__EachRoleAssignment_1
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
    // InternalMyDsl.g:4200:1: rule__ForEachL__Group__2 : rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 ;
    public final void rule__ForEachL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4204:1: ( rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 )
            // InternalMyDsl.g:4205:2: rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3
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
    // InternalMyDsl.g:4212:1: rule__ForEachL__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEachL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4216:1: ( ( ':' ) )
            // InternalMyDsl.g:4217:1: ( ':' )
            {
            // InternalMyDsl.g:4217:1: ( ':' )
            // InternalMyDsl.g:4218:2: ':'
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
    // InternalMyDsl.g:4227:1: rule__ForEachL__Group__3 : rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 ;
    public final void rule__ForEachL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4231:1: ( rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 )
            // InternalMyDsl.g:4232:2: rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4
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
    // InternalMyDsl.g:4239:1: rule__ForEachL__Group__3__Impl : ( '<' ) ;
    public final void rule__ForEachL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4243:1: ( ( '<' ) )
            // InternalMyDsl.g:4244:1: ( '<' )
            {
            // InternalMyDsl.g:4244:1: ( '<' )
            // InternalMyDsl.g:4245:2: '<'
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
    // InternalMyDsl.g:4254:1: rule__ForEachL__Group__4 : rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 ;
    public final void rule__ForEachL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4258:1: ( rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 )
            // InternalMyDsl.g:4259:2: rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5
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
    // InternalMyDsl.g:4266:1: rule__ForEachL__Group__4__Impl : ( ( rule__ForEachL__RolesetAssignment_4 ) ) ;
    public final void rule__ForEachL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4270:1: ( ( ( rule__ForEachL__RolesetAssignment_4 ) ) )
            // InternalMyDsl.g:4271:1: ( ( rule__ForEachL__RolesetAssignment_4 ) )
            {
            // InternalMyDsl.g:4271:1: ( ( rule__ForEachL__RolesetAssignment_4 ) )
            // InternalMyDsl.g:4272:2: ( rule__ForEachL__RolesetAssignment_4 )
            {
             before(grammarAccess.getForEachLAccess().getRolesetAssignment_4()); 
            // InternalMyDsl.g:4273:2: ( rule__ForEachL__RolesetAssignment_4 )
            // InternalMyDsl.g:4273:3: rule__ForEachL__RolesetAssignment_4
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
    // InternalMyDsl.g:4281:1: rule__ForEachL__Group__5 : rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 ;
    public final void rule__ForEachL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4285:1: ( rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 )
            // InternalMyDsl.g:4286:2: rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6
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
    // InternalMyDsl.g:4293:1: rule__ForEachL__Group__5__Impl : ( ',' ) ;
    public final void rule__ForEachL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4297:1: ( ( ',' ) )
            // InternalMyDsl.g:4298:1: ( ',' )
            {
            // InternalMyDsl.g:4298:1: ( ',' )
            // InternalMyDsl.g:4299:2: ','
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
    // InternalMyDsl.g:4308:1: rule__ForEachL__Group__6 : rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7 ;
    public final void rule__ForEachL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4312:1: ( rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7 )
            // InternalMyDsl.g:4313:2: rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7
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
    // InternalMyDsl.g:4320:1: rule__ForEachL__Group__6__Impl : ( ( rule__ForEachL__RefroleAssignment_6 ) ) ;
    public final void rule__ForEachL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4324:1: ( ( ( rule__ForEachL__RefroleAssignment_6 ) ) )
            // InternalMyDsl.g:4325:1: ( ( rule__ForEachL__RefroleAssignment_6 ) )
            {
            // InternalMyDsl.g:4325:1: ( ( rule__ForEachL__RefroleAssignment_6 ) )
            // InternalMyDsl.g:4326:2: ( rule__ForEachL__RefroleAssignment_6 )
            {
             before(grammarAccess.getForEachLAccess().getRefroleAssignment_6()); 
            // InternalMyDsl.g:4327:2: ( rule__ForEachL__RefroleAssignment_6 )
            // InternalMyDsl.g:4327:3: rule__ForEachL__RefroleAssignment_6
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
    // InternalMyDsl.g:4335:1: rule__ForEachL__Group__7 : rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8 ;
    public final void rule__ForEachL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4339:1: ( rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8 )
            // InternalMyDsl.g:4340:2: rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8
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
    // InternalMyDsl.g:4347:1: rule__ForEachL__Group__7__Impl : ( '>' ) ;
    public final void rule__ForEachL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4351:1: ( ( '>' ) )
            // InternalMyDsl.g:4352:1: ( '>' )
            {
            // InternalMyDsl.g:4352:1: ( '>' )
            // InternalMyDsl.g:4353:2: '>'
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
    // InternalMyDsl.g:4362:1: rule__ForEachL__Group__8 : rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9 ;
    public final void rule__ForEachL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4366:1: ( rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9 )
            // InternalMyDsl.g:4367:2: rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:4374:1: rule__ForEachL__Group__8__Impl : ( '{' ) ;
    public final void rule__ForEachL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4378:1: ( ( '{' ) )
            // InternalMyDsl.g:4379:1: ( '{' )
            {
            // InternalMyDsl.g:4379:1: ( '{' )
            // InternalMyDsl.g:4380:2: '{'
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
    // InternalMyDsl.g:4389:1: rule__ForEachL__Group__9 : rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10 ;
    public final void rule__ForEachL__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4393:1: ( rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10 )
            // InternalMyDsl.g:4394:2: rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10
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
    // InternalMyDsl.g:4401:1: rule__ForEachL__Group__9__Impl : ( ( rule__ForEachL__BranchAssignment_9 ) ) ;
    public final void rule__ForEachL__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4405:1: ( ( ( rule__ForEachL__BranchAssignment_9 ) ) )
            // InternalMyDsl.g:4406:1: ( ( rule__ForEachL__BranchAssignment_9 ) )
            {
            // InternalMyDsl.g:4406:1: ( ( rule__ForEachL__BranchAssignment_9 ) )
            // InternalMyDsl.g:4407:2: ( rule__ForEachL__BranchAssignment_9 )
            {
             before(grammarAccess.getForEachLAccess().getBranchAssignment_9()); 
            // InternalMyDsl.g:4408:2: ( rule__ForEachL__BranchAssignment_9 )
            // InternalMyDsl.g:4408:3: rule__ForEachL__BranchAssignment_9
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
    // InternalMyDsl.g:4416:1: rule__ForEachL__Group__10 : rule__ForEachL__Group__10__Impl rule__ForEachL__Group__11 ;
    public final void rule__ForEachL__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4420:1: ( rule__ForEachL__Group__10__Impl rule__ForEachL__Group__11 )
            // InternalMyDsl.g:4421:2: rule__ForEachL__Group__10__Impl rule__ForEachL__Group__11
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
    // InternalMyDsl.g:4428:1: rule__ForEachL__Group__10__Impl : ( '}' ) ;
    public final void rule__ForEachL__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4432:1: ( ( '}' ) )
            // InternalMyDsl.g:4433:1: ( '}' )
            {
            // InternalMyDsl.g:4433:1: ( '}' )
            // InternalMyDsl.g:4434:2: '}'
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
    // InternalMyDsl.g:4443:1: rule__ForEachL__Group__11 : rule__ForEachL__Group__11__Impl rule__ForEachL__Group__12 ;
    public final void rule__ForEachL__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4447:1: ( rule__ForEachL__Group__11__Impl rule__ForEachL__Group__12 )
            // InternalMyDsl.g:4448:2: rule__ForEachL__Group__11__Impl rule__ForEachL__Group__12
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:4455:1: rule__ForEachL__Group__11__Impl : ( ';' ) ;
    public final void rule__ForEachL__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4459:1: ( ( ';' ) )
            // InternalMyDsl.g:4460:1: ( ';' )
            {
            // InternalMyDsl.g:4460:1: ( ';' )
            // InternalMyDsl.g:4461:2: ';'
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
    // InternalMyDsl.g:4470:1: rule__ForEachL__Group__12 : rule__ForEachL__Group__12__Impl ;
    public final void rule__ForEachL__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4474:1: ( rule__ForEachL__Group__12__Impl )
            // InternalMyDsl.g:4475:2: rule__ForEachL__Group__12__Impl
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
    // InternalMyDsl.g:4481:1: rule__ForEachL__Group__12__Impl : ( ( rule__ForEachL__ProtocolAssignment_12 ) ) ;
    public final void rule__ForEachL__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4485:1: ( ( ( rule__ForEachL__ProtocolAssignment_12 ) ) )
            // InternalMyDsl.g:4486:1: ( ( rule__ForEachL__ProtocolAssignment_12 ) )
            {
            // InternalMyDsl.g:4486:1: ( ( rule__ForEachL__ProtocolAssignment_12 ) )
            // InternalMyDsl.g:4487:2: ( rule__ForEachL__ProtocolAssignment_12 )
            {
             before(grammarAccess.getForEachLAccess().getProtocolAssignment_12()); 
            // InternalMyDsl.g:4488:2: ( rule__ForEachL__ProtocolAssignment_12 )
            // InternalMyDsl.g:4488:3: rule__ForEachL__ProtocolAssignment_12
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
    // InternalMyDsl.g:4497:1: rule__Model__ProtocolAssignment_0 : ( ruleGlobalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4501:1: ( ( ruleGlobalProtocol ) )
            // InternalMyDsl.g:4502:2: ( ruleGlobalProtocol )
            {
            // InternalMyDsl.g:4502:2: ( ruleGlobalProtocol )
            // InternalMyDsl.g:4503:3: ruleGlobalProtocol
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
    // InternalMyDsl.g:4512:1: rule__Model__ProtocolAssignment_1 : ( ruleLocalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4516:1: ( ( ruleLocalProtocol ) )
            // InternalMyDsl.g:4517:2: ( ruleLocalProtocol )
            {
            // InternalMyDsl.g:4517:2: ( ruleLocalProtocol )
            // InternalMyDsl.g:4518:3: ruleLocalProtocol
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
    // InternalMyDsl.g:4527:1: rule__GlobalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4531:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4532:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4532:2: ( RULE_ID )
            // InternalMyDsl.g:4533:3: RULE_ID
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
    // InternalMyDsl.g:4542:1: rule__GlobalProtocol__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__GlobalProtocol__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4546:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:4547:2: ( ruleRoles )
            {
            // InternalMyDsl.g:4547:2: ( ruleRoles )
            // InternalMyDsl.g:4548:3: ruleRoles
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
    // InternalMyDsl.g:4557:1: rule__GlobalProtocol__ProtocolAssignment_6 : ( ruleProtocol ) ;
    public final void rule__GlobalProtocol__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4561:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4562:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4562:2: ( ruleProtocol )
            // InternalMyDsl.g:4563:3: ruleProtocol
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
    // InternalMyDsl.g:4572:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4576:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4577:2: ( ruleRole )
            {
            // InternalMyDsl.g:4577:2: ( ruleRole )
            // InternalMyDsl.g:4578:3: ruleRole
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
    // InternalMyDsl.g:4587:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4591:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4592:2: ( ruleRole )
            {
            // InternalMyDsl.g:4592:2: ( ruleRole )
            // InternalMyDsl.g:4593:3: ruleRole
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
    // InternalMyDsl.g:4602:1: rule__RoleOne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4606:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4607:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4607:2: ( RULE_ID )
            // InternalMyDsl.g:4608:3: RULE_ID
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
    // InternalMyDsl.g:4617:1: rule__RoleSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4621:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4622:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4622:2: ( RULE_ID )
            // InternalMyDsl.g:4623:3: RULE_ID
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
    // InternalMyDsl.g:4632:1: rule__RoleSet__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RoleSet__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4636:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4637:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4637:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4638:3: ( RULE_ID )
            {
             before(grammarAccess.getRoleSetAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4639:3: ( RULE_ID )
            // InternalMyDsl.g:4640:4: RULE_ID
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
    // InternalMyDsl.g:4651:1: rule__Protocol__BeginAssignment : ( ( rule__Protocol__BeginAlternatives_0 ) ) ;
    public final void rule__Protocol__BeginAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4655:1: ( ( ( rule__Protocol__BeginAlternatives_0 ) ) )
            // InternalMyDsl.g:4656:2: ( ( rule__Protocol__BeginAlternatives_0 ) )
            {
            // InternalMyDsl.g:4656:2: ( ( rule__Protocol__BeginAlternatives_0 ) )
            // InternalMyDsl.g:4657:3: ( rule__Protocol__BeginAlternatives_0 )
            {
             before(grammarAccess.getProtocolAccess().getBeginAlternatives_0()); 
            // InternalMyDsl.g:4658:3: ( rule__Protocol__BeginAlternatives_0 )
            // InternalMyDsl.g:4658:4: rule__Protocol__BeginAlternatives_0
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
    // InternalMyDsl.g:4666:1: rule__EndProtocol__EndAssignment : ( ( 'End' ) ) ;
    public final void rule__EndProtocol__EndAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4670:1: ( ( ( 'End' ) ) )
            // InternalMyDsl.g:4671:2: ( ( 'End' ) )
            {
            // InternalMyDsl.g:4671:2: ( ( 'End' ) )
            // InternalMyDsl.g:4672:3: ( 'End' )
            {
             before(grammarAccess.getEndProtocolAccess().getEndEndKeyword_0()); 
            // InternalMyDsl.g:4673:3: ( 'End' )
            // InternalMyDsl.g:4674:4: 'End'
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
    // InternalMyDsl.g:4685:1: rule__Recursion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4689:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4690:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4690:2: ( RULE_ID )
            // InternalMyDsl.g:4691:3: RULE_ID
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
    // InternalMyDsl.g:4700:1: rule__Recursion__RecProtocolAssignment_4 : ( ruleProtocol ) ;
    public final void rule__Recursion__RecProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4704:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4705:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4705:2: ( ruleProtocol )
            // InternalMyDsl.g:4706:3: ruleProtocol
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
    // InternalMyDsl.g:4715:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4719:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4720:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4720:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4721:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalMyDsl.g:4722:3: ( RULE_ID )
            // InternalMyDsl.g:4723:4: RULE_ID
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
    // InternalMyDsl.g:4734:1: rule__ForEach__LoopRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEach__LoopRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4738:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:4739:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:4739:2: ( ruleRoleOne )
            // InternalMyDsl.g:4740:3: ruleRoleOne
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
    // InternalMyDsl.g:4749:1: rule__ForEach__RolesetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RolesetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4753:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4754:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4754:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4755:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRolesetRoleSetCrossReference_4_0()); 
            // InternalMyDsl.g:4756:3: ( RULE_ID )
            // InternalMyDsl.g:4757:4: RULE_ID
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
    // InternalMyDsl.g:4768:1: rule__ForEach__RefRoleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RefRoleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4772:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4773:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4773:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4774:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_6_0()); 
            // InternalMyDsl.g:4775:3: ( RULE_ID )
            // InternalMyDsl.g:4776:4: RULE_ID
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
    // InternalMyDsl.g:4787:1: rule__ForEach__ForBodyAssignment_9 : ( ruleProtocol ) ;
    public final void rule__ForEach__ForBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4791:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4792:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4792:2: ( ruleProtocol )
            // InternalMyDsl.g:4793:3: ruleProtocol
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
    // InternalMyDsl.g:4802:1: rule__ForEach__ProtocolAssignment_12 : ( ruleProtocol ) ;
    public final void rule__ForEach__ProtocolAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4806:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4807:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4807:2: ( ruleProtocol )
            // InternalMyDsl.g:4808:3: ruleProtocol
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
    // InternalMyDsl.g:4817:1: rule__Choice__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4821:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4822:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4822:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4823:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 
            // InternalMyDsl.g:4824:3: ( RULE_ID )
            // InternalMyDsl.g:4825:4: RULE_ID
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
    // InternalMyDsl.g:4836:1: rule__Choice__BranchesAssignment_4 : ( ruleMessage ) ;
    public final void rule__Choice__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4840:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4841:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4841:2: ( ruleMessage )
            // InternalMyDsl.g:4842:3: ruleMessage
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
    // InternalMyDsl.g:4851:1: rule__Choice__BranchesAssignment_6_2 : ( ruleMessage ) ;
    public final void rule__Choice__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4855:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4856:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4856:2: ( ruleMessage )
            // InternalMyDsl.g:4857:3: ruleMessage
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
    // InternalMyDsl.g:4866:1: rule__MessageNormal__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageNormal__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4870:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4871:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4871:2: ( RULE_ID )
            // InternalMyDsl.g:4872:3: RULE_ID
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
    // InternalMyDsl.g:4881:1: rule__MessageNormal__PayloadAssignment_1_0_1 : ( rulePayload ) ;
    public final void rule__MessageNormal__PayloadAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4885:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4886:2: ( rulePayload )
            {
            // InternalMyDsl.g:4886:2: ( rulePayload )
            // InternalMyDsl.g:4887:3: rulePayload
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
    // InternalMyDsl.g:4896:1: rule__MessageNormal__SenderAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MessageNormal__SenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4900:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4901:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4901:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4902:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageNormalAccess().getSenderRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4903:3: ( RULE_ID )
            // InternalMyDsl.g:4904:4: RULE_ID
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
    // InternalMyDsl.g:4915:1: rule__MessageNormal__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__MessageNormal__ReceiverAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4919:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4920:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4920:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4921:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageNormalAccess().getReceiverRoleCrossReference_5_0()); 
            // InternalMyDsl.g:4922:3: ( RULE_ID )
            // InternalMyDsl.g:4923:4: RULE_ID
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
    // InternalMyDsl.g:4934:1: rule__MessageNormal__ProtocolAssignment_7 : ( ruleProtocol ) ;
    public final void rule__MessageNormal__ProtocolAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4938:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4939:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4939:2: ( ruleProtocol )
            // InternalMyDsl.g:4940:3: ruleProtocol
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
    // InternalMyDsl.g:4949:1: rule__MessageQuit__MessageTypeAssignment_0 : ( ( 'QUIT' ) ) ;
    public final void rule__MessageQuit__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4953:1: ( ( ( 'QUIT' ) ) )
            // InternalMyDsl.g:4954:2: ( ( 'QUIT' ) )
            {
            // InternalMyDsl.g:4954:2: ( ( 'QUIT' ) )
            // InternalMyDsl.g:4955:3: ( 'QUIT' )
            {
             before(grammarAccess.getMessageQuitAccess().getMessageTypeQUITKeyword_0_0()); 
            // InternalMyDsl.g:4956:3: ( 'QUIT' )
            // InternalMyDsl.g:4957:4: 'QUIT'
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
    // InternalMyDsl.g:4968:1: rule__MessageQuit__SenderAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MessageQuit__SenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4972:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4973:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4973:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4974:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageQuitAccess().getSenderRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4975:3: ( RULE_ID )
            // InternalMyDsl.g:4976:4: RULE_ID
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
    // InternalMyDsl.g:4987:1: rule__MessageQuit__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__MessageQuit__ReceiverAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4991:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4992:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4992:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4993:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageQuitAccess().getReceiverRoleCrossReference_5_0()); 
            // InternalMyDsl.g:4994:3: ( RULE_ID )
            // InternalMyDsl.g:4995:4: RULE_ID
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
    // InternalMyDsl.g:5006:1: rule__Payload__TypesAssignment_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5010:1: ( ( ruleType ) )
            // InternalMyDsl.g:5011:2: ( ruleType )
            {
            // InternalMyDsl.g:5011:2: ( ruleType )
            // InternalMyDsl.g:5012:3: ruleType
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
    // InternalMyDsl.g:5021:1: rule__Payload__TypesAssignment_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5025:1: ( ( ruleType ) )
            // InternalMyDsl.g:5026:2: ( ruleType )
            {
            // InternalMyDsl.g:5026:2: ( ruleType )
            // InternalMyDsl.g:5027:3: ruleType
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
    // InternalMyDsl.g:5036:1: rule__LocalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5040:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5041:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5041:2: ( RULE_ID )
            // InternalMyDsl.g:5042:3: RULE_ID
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
    // InternalMyDsl.g:5051:1: rule__LocalProtocol__ProjectedRoleAssignment_4 : ( ruleRoleOne ) ;
    public final void rule__LocalProtocol__ProjectedRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5055:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:5056:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:5056:2: ( ruleRoleOne )
            // InternalMyDsl.g:5057:3: ruleRoleOne
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
    // InternalMyDsl.g:5066:1: rule__LocalProtocol__RolesAssignment_6 : ( ruleRoles ) ;
    public final void rule__LocalProtocol__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5070:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:5071:2: ( ruleRoles )
            {
            // InternalMyDsl.g:5071:2: ( ruleRoles )
            // InternalMyDsl.g:5072:3: ruleRoles
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
    // InternalMyDsl.g:5081:1: rule__LocalProtocol__ProtocolAssignment_8 : ( ruleProtocolL ) ;
    public final void rule__LocalProtocol__ProtocolAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5085:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5086:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5086:2: ( ruleProtocolL )
            // InternalMyDsl.g:5087:3: ruleProtocolL
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
    // InternalMyDsl.g:5096:1: rule__ProtocolL__BeginAssignment : ( ( rule__ProtocolL__BeginAlternatives_0 ) ) ;
    public final void rule__ProtocolL__BeginAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5100:1: ( ( ( rule__ProtocolL__BeginAlternatives_0 ) ) )
            // InternalMyDsl.g:5101:2: ( ( rule__ProtocolL__BeginAlternatives_0 ) )
            {
            // InternalMyDsl.g:5101:2: ( ( rule__ProtocolL__BeginAlternatives_0 ) )
            // InternalMyDsl.g:5102:3: ( rule__ProtocolL__BeginAlternatives_0 )
            {
             before(grammarAccess.getProtocolLAccess().getBeginAlternatives_0()); 
            // InternalMyDsl.g:5103:3: ( rule__ProtocolL__BeginAlternatives_0 )
            // InternalMyDsl.g:5103:4: rule__ProtocolL__BeginAlternatives_0
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
    // InternalMyDsl.g:5111:1: rule__RecursionL__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RecursionL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5115:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5116:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5116:2: ( RULE_ID )
            // InternalMyDsl.g:5117:3: RULE_ID
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
    // InternalMyDsl.g:5126:1: rule__RecursionL__RecProtocolAssignment_4 : ( ruleProtocolL ) ;
    public final void rule__RecursionL__RecProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5130:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5131:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5131:2: ( ruleProtocolL )
            // InternalMyDsl.g:5132:3: ruleProtocolL
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
    // InternalMyDsl.g:5141:1: rule__CloseRecursionL__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursionL__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5145:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5146:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5146:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5147:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLCrossReference_1_0()); 
            // InternalMyDsl.g:5148:3: ( RULE_ID )
            // InternalMyDsl.g:5149:4: RULE_ID
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
    // InternalMyDsl.g:5160:1: rule__MessageNormalL__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageNormalL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5164:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5165:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5165:2: ( RULE_ID )
            // InternalMyDsl.g:5166:3: RULE_ID
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
    // InternalMyDsl.g:5175:1: rule__MessageNormalL__PayloadAssignment_1_0_1 : ( rulePayload ) ;
    public final void rule__MessageNormalL__PayloadAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5179:1: ( ( rulePayload ) )
            // InternalMyDsl.g:5180:2: ( rulePayload )
            {
            // InternalMyDsl.g:5180:2: ( rulePayload )
            // InternalMyDsl.g:5181:3: rulePayload
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
    // InternalMyDsl.g:5190:1: rule__MessageNormalL__SendReceiveAssignment_2 : ( ruleMessageType ) ;
    public final void rule__MessageNormalL__SendReceiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5194:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:5195:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:5195:2: ( ruleMessageType )
            // InternalMyDsl.g:5196:3: ruleMessageType
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
    // InternalMyDsl.g:5205:1: rule__MessageNormalL__ProtocolAssignment_4 : ( ruleProtocolL ) ;
    public final void rule__MessageNormalL__ProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5209:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5210:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5210:2: ( ruleProtocolL )
            // InternalMyDsl.g:5211:3: ruleProtocolL
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
    // InternalMyDsl.g:5220:1: rule__MessageQuitL__MessageTypeAssignment_0 : ( ( 'QUIT' ) ) ;
    public final void rule__MessageQuitL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5224:1: ( ( ( 'QUIT' ) ) )
            // InternalMyDsl.g:5225:2: ( ( 'QUIT' ) )
            {
            // InternalMyDsl.g:5225:2: ( ( 'QUIT' ) )
            // InternalMyDsl.g:5226:3: ( 'QUIT' )
            {
             before(grammarAccess.getMessageQuitLAccess().getMessageTypeQUITKeyword_0_0()); 
            // InternalMyDsl.g:5227:3: ( 'QUIT' )
            // InternalMyDsl.g:5228:4: 'QUIT'
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
    // InternalMyDsl.g:5239:1: rule__MessageQuitL__SendReceiveAssignment_2 : ( ruleMessageType ) ;
    public final void rule__MessageQuitL__SendReceiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5243:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:5244:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:5244:2: ( ruleMessageType )
            // InternalMyDsl.g:5245:3: ruleMessageType
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
    // InternalMyDsl.g:5254:1: rule__SenderL__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SenderL__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5258:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5259:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5259:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5260:3: ( RULE_ID )
            {
             before(grammarAccess.getSenderLAccess().getRoleRoleCrossReference_1_0()); 
            // InternalMyDsl.g:5261:3: ( RULE_ID )
            // InternalMyDsl.g:5262:4: RULE_ID
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
    // InternalMyDsl.g:5273:1: rule__ReceiverL__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReceiverL__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5277:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5278:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5278:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5279:3: ( RULE_ID )
            {
             before(grammarAccess.getReceiverLAccess().getRoleRoleCrossReference_1_0()); 
            // InternalMyDsl.g:5280:3: ( RULE_ID )
            // InternalMyDsl.g:5281:4: RULE_ID
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
    // InternalMyDsl.g:5292:1: rule__ChoiceL__RoleMakingChoiceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChoiceL__RoleMakingChoiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5296:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5297:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5297:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5298:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleCrossReference_2_0()); 
            // InternalMyDsl.g:5299:3: ( RULE_ID )
            // InternalMyDsl.g:5300:4: RULE_ID
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
    // InternalMyDsl.g:5311:1: rule__ChoiceL__BranchesAssignment_4 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5315:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:5316:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:5316:2: ( ruleMessageL )
            // InternalMyDsl.g:5317:3: ruleMessageL
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
    // InternalMyDsl.g:5326:1: rule__ChoiceL__BranchesAssignment_6_2 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5330:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:5331:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:5331:2: ( ruleMessageL )
            // InternalMyDsl.g:5332:3: ruleMessageL
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
    // InternalMyDsl.g:5341:1: rule__ForEachL__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEachL__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5345:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:5346:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:5346:2: ( ruleRoleOne )
            // InternalMyDsl.g:5347:3: ruleRoleOne
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
    // InternalMyDsl.g:5356:1: rule__ForEachL__RolesetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RolesetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5360:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5361:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5361:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5362:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRolesetRoleSetCrossReference_4_0()); 
            // InternalMyDsl.g:5363:3: ( RULE_ID )
            // InternalMyDsl.g:5364:4: RULE_ID
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
    // InternalMyDsl.g:5375:1: rule__ForEachL__RefroleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RefroleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5379:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5380:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5380:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5381:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRefroleRoleOneCrossReference_6_0()); 
            // InternalMyDsl.g:5382:3: ( RULE_ID )
            // InternalMyDsl.g:5383:4: RULE_ID
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
    // InternalMyDsl.g:5394:1: rule__ForEachL__BranchAssignment_9 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__BranchAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5398:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5399:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5399:2: ( ruleProtocolL )
            // InternalMyDsl.g:5400:3: ruleProtocolL
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
    // InternalMyDsl.g:5409:1: rule__ForEachL__ProtocolAssignment_12 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__ProtocolAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5413:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5414:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5414:2: ( ruleProtocolL )
            // InternalMyDsl.g:5415:3: ruleProtocolL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
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
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000007000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003808D000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C00000000L});

}