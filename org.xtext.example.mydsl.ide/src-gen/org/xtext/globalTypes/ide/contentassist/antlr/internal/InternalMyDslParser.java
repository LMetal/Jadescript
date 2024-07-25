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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'()'", "'int'", "'string'", "'action'", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'roleset'", "':'", "'rec'", "'{'", "'loop'", "'for'", "'<'", "'>'", "';'", "'choice'", "'at'", "'or'", "'from'", "'to'", "'.'", "')'", "'local'", "'End'", "'foreach'", "'QUIT'"
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
    // InternalMyDsl.g:212:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Protocol__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Protocol__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Protocol__Group__0 )
            // InternalMyDsl.g:219:4: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMessageBase"
    // InternalMyDsl.g:378:1: entryRuleMessageBase : ruleMessageBase EOF ;
    public final void entryRuleMessageBase() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleMessageBase EOF )
            // InternalMyDsl.g:380:1: ruleMessageBase EOF
            {
             before(grammarAccess.getMessageBaseRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageBase();

            state._fsp--;

             after(grammarAccess.getMessageBaseRule()); 
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
    // $ANTLR end "entryRuleMessageBase"


    // $ANTLR start "ruleMessageBase"
    // InternalMyDsl.g:387:1: ruleMessageBase : ( ( rule__MessageBase__Group__0 ) ) ;
    public final void ruleMessageBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__MessageBase__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__MessageBase__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__MessageBase__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__MessageBase__Group__0 )
            {
             before(grammarAccess.getMessageBaseAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__MessageBase__Group__0 )
            // InternalMyDsl.g:394:4: rule__MessageBase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageBase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageBaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageBase"


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
    // InternalMyDsl.g:487:1: ruleProtocolL : ( ( rule__ProtocolL__Group__0 ) ) ;
    public final void ruleProtocolL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__ProtocolL__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__ProtocolL__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__ProtocolL__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__ProtocolL__Group__0 )
            {
             before(grammarAccess.getProtocolLAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__ProtocolL__Group__0 )
            // InternalMyDsl.g:494:4: rule__ProtocolL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolLAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMessageL"
    // InternalMyDsl.g:528:1: entryRuleMessageL : ruleMessageL EOF ;
    public final void entryRuleMessageL() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleMessageL EOF )
            // InternalMyDsl.g:530:1: ruleMessageL EOF
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
    // InternalMyDsl.g:537:1: ruleMessageL : ( ( rule__MessageL__Group__0 ) ) ;
    public final void ruleMessageL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__MessageL__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__MessageL__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__MessageL__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__MessageL__Group__0 )
            {
             before(grammarAccess.getMessageLAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__MessageL__Group__0 )
            // InternalMyDsl.g:544:4: rule__MessageL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageLAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMessageType"
    // InternalMyDsl.g:553:1: entryRuleMessageType : ruleMessageType EOF ;
    public final void entryRuleMessageType() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleMessageType EOF )
            // InternalMyDsl.g:555:1: ruleMessageType EOF
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
    // InternalMyDsl.g:562:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__MessageType__Alternatives ) )
            // InternalMyDsl.g:568:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:569:3: ( rule__MessageType__Alternatives )
            // InternalMyDsl.g:569:4: rule__MessageType__Alternatives
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
    // InternalMyDsl.g:578:1: entryRuleSenderL : ruleSenderL EOF ;
    public final void entryRuleSenderL() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleSenderL EOF )
            // InternalMyDsl.g:580:1: ruleSenderL EOF
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
    // InternalMyDsl.g:587:1: ruleSenderL : ( ( rule__SenderL__Group__0 ) ) ;
    public final void ruleSenderL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__SenderL__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__SenderL__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__SenderL__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__SenderL__Group__0 )
            {
             before(grammarAccess.getSenderLAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__SenderL__Group__0 )
            // InternalMyDsl.g:594:4: rule__SenderL__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleReceiverL : ruleReceiverL EOF ;
    public final void entryRuleReceiverL() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleReceiverL EOF )
            // InternalMyDsl.g:605:1: ruleReceiverL EOF
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
    // InternalMyDsl.g:612:1: ruleReceiverL : ( ( rule__ReceiverL__Group__0 ) ) ;
    public final void ruleReceiverL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__ReceiverL__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__ReceiverL__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__ReceiverL__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__ReceiverL__Group__0 )
            {
             before(grammarAccess.getReceiverLAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__ReceiverL__Group__0 )
            // InternalMyDsl.g:619:4: rule__ReceiverL__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleChoiceL : ruleChoiceL EOF ;
    public final void entryRuleChoiceL() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleChoiceL EOF )
            // InternalMyDsl.g:630:1: ruleChoiceL EOF
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
    // InternalMyDsl.g:637:1: ruleChoiceL : ( ( rule__ChoiceL__Group__0 ) ) ;
    public final void ruleChoiceL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__ChoiceL__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__ChoiceL__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__ChoiceL__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__ChoiceL__Group__0 )
            {
             before(grammarAccess.getChoiceLAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__ChoiceL__Group__0 )
            // InternalMyDsl.g:644:4: rule__ChoiceL__Group__0
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


    // $ANTLR start "entryRuleChoiceBranchL"
    // InternalMyDsl.g:653:1: entryRuleChoiceBranchL : ruleChoiceBranchL EOF ;
    public final void entryRuleChoiceBranchL() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleChoiceBranchL EOF )
            // InternalMyDsl.g:655:1: ruleChoiceBranchL EOF
            {
             before(grammarAccess.getChoiceBranchLRule()); 
            pushFollow(FOLLOW_1);
            ruleChoiceBranchL();

            state._fsp--;

             after(grammarAccess.getChoiceBranchLRule()); 
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
    // $ANTLR end "entryRuleChoiceBranchL"


    // $ANTLR start "ruleChoiceBranchL"
    // InternalMyDsl.g:662:1: ruleChoiceBranchL : ( ( rule__ChoiceBranchL__Alternatives ) ) ;
    public final void ruleChoiceBranchL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__ChoiceBranchL__Alternatives ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__ChoiceBranchL__Alternatives ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__ChoiceBranchL__Alternatives ) )
            // InternalMyDsl.g:668:3: ( rule__ChoiceBranchL__Alternatives )
            {
             before(grammarAccess.getChoiceBranchLAccess().getAlternatives()); 
            // InternalMyDsl.g:669:3: ( rule__ChoiceBranchL__Alternatives )
            // InternalMyDsl.g:669:4: rule__ChoiceBranchL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChoiceBranchLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoiceBranchL"


    // $ANTLR start "entryRuleForEachL"
    // InternalMyDsl.g:678:1: entryRuleForEachL : ruleForEachL EOF ;
    public final void entryRuleForEachL() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleForEachL EOF )
            // InternalMyDsl.g:680:1: ruleForEachL EOF
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
    // InternalMyDsl.g:687:1: ruleForEachL : ( ( rule__ForEachL__Group__0 ) ) ;
    public final void ruleForEachL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__ForEachL__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__ForEachL__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__ForEachL__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__ForEachL__Group__0 )
            {
             before(grammarAccess.getForEachLAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__ForEachL__Group__0 )
            // InternalMyDsl.g:694:4: rule__ForEachL__Group__0
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
    // InternalMyDsl.g:703:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleType EOF )
            // InternalMyDsl.g:705:1: ruleType EOF
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
    // InternalMyDsl.g:712:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:718:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:719:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:719:4: rule__Type__Alternatives
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
    // InternalMyDsl.g:727:1: rule__Model__Alternatives : ( ( ( rule__Model__ProtocolAssignment_0 ) ) | ( ( rule__Model__ProtocolAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( ( ( rule__Model__ProtocolAssignment_0 ) ) | ( ( rule__Model__ProtocolAssignment_1 ) ) )
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
                    // InternalMyDsl.g:732:2: ( ( rule__Model__ProtocolAssignment_0 ) )
                    {
                    // InternalMyDsl.g:732:2: ( ( rule__Model__ProtocolAssignment_0 ) )
                    // InternalMyDsl.g:733:3: ( rule__Model__ProtocolAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_0()); 
                    // InternalMyDsl.g:734:3: ( rule__Model__ProtocolAssignment_0 )
                    // InternalMyDsl.g:734:4: rule__Model__ProtocolAssignment_0
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
                    // InternalMyDsl.g:738:2: ( ( rule__Model__ProtocolAssignment_1 ) )
                    {
                    // InternalMyDsl.g:738:2: ( ( rule__Model__ProtocolAssignment_1 ) )
                    // InternalMyDsl.g:739:3: ( rule__Model__ProtocolAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_1()); 
                    // InternalMyDsl.g:740:3: ( rule__Model__ProtocolAssignment_1 )
                    // InternalMyDsl.g:740:4: rule__Model__ProtocolAssignment_1
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
    // InternalMyDsl.g:748:1: rule__Role__Alternatives : ( ( ruleRoleOne ) | ( ruleRoleSet ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( ( ruleRoleOne ) | ( ruleRoleSet ) )
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
                    // InternalMyDsl.g:753:2: ( ruleRoleOne )
                    {
                    // InternalMyDsl.g:753:2: ( ruleRoleOne )
                    // InternalMyDsl.g:754:3: ruleRoleOne
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
                    // InternalMyDsl.g:759:2: ( ruleRoleSet )
                    {
                    // InternalMyDsl.g:759:2: ( ruleRoleSet )
                    // InternalMyDsl.g:760:3: ruleRoleSet
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


    // $ANTLR start "rule__Protocol__BeginAlternatives_1_0"
    // InternalMyDsl.g:769:1: rule__Protocol__BeginAlternatives_1_0 : ( ( ruleChoice ) | ( ruleMessage ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) | ( ruleEndProtocol ) );
    public final void rule__Protocol__BeginAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( ( ruleChoice ) | ( ruleMessage ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) | ( ruleEndProtocol ) )
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
            case 39:
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
                    // InternalMyDsl.g:774:2: ( ruleChoice )
                    {
                    // InternalMyDsl.g:774:2: ( ruleChoice )
                    // InternalMyDsl.g:775:3: ruleChoice
                    {
                     before(grammarAccess.getProtocolAccess().getBeginChoiceParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleChoice();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginChoiceParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:780:2: ( ruleMessage )
                    {
                    // InternalMyDsl.g:780:2: ( ruleMessage )
                    // InternalMyDsl.g:781:3: ruleMessage
                    {
                     before(grammarAccess.getProtocolAccess().getBeginMessageParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginMessageParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:786:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:786:2: ( ruleRecursion )
                    // InternalMyDsl.g:787:3: ruleRecursion
                    {
                     before(grammarAccess.getProtocolAccess().getBeginRecursionParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginRecursionParserRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:792:2: ( ruleForEach )
                    {
                    // InternalMyDsl.g:792:2: ( ruleForEach )
                    // InternalMyDsl.g:793:3: ruleForEach
                    {
                     before(grammarAccess.getProtocolAccess().getBeginForEachParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleForEach();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginForEachParserRuleCall_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:798:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:798:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:799:3: ruleCloseRecursion
                    {
                     before(grammarAccess.getProtocolAccess().getBeginCloseRecursionParserRuleCall_1_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCloseRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginCloseRecursionParserRuleCall_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:804:2: ( ruleEndProtocol )
                    {
                    // InternalMyDsl.g:804:2: ( ruleEndProtocol )
                    // InternalMyDsl.g:805:3: ruleEndProtocol
                    {
                     before(grammarAccess.getProtocolAccess().getBeginEndProtocolParserRuleCall_1_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEndProtocol();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getBeginEndProtocolParserRuleCall_1_0_5()); 

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
    // $ANTLR end "rule__Protocol__BeginAlternatives_1_0"


    // $ANTLR start "rule__Message__Alternatives"
    // InternalMyDsl.g:814:1: rule__Message__Alternatives : ( ( ruleMessageBase ) | ( ruleMessageQuit ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( ( ruleMessageBase ) | ( ruleMessageQuit ) )
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
                    // InternalMyDsl.g:819:2: ( ruleMessageBase )
                    {
                    // InternalMyDsl.g:819:2: ( ruleMessageBase )
                    // InternalMyDsl.g:820:3: ruleMessageBase
                    {
                     before(grammarAccess.getMessageAccess().getMessageBaseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageBase();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getMessageBaseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:825:2: ( ruleMessageQuit )
                    {
                    // InternalMyDsl.g:825:2: ( ruleMessageQuit )
                    // InternalMyDsl.g:826:3: ruleMessageQuit
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


    // $ANTLR start "rule__MessageBase__Alternatives_1"
    // InternalMyDsl.g:835:1: rule__MessageBase__Alternatives_1 : ( ( ( rule__MessageBase__Group_1_0__0 ) ) | ( '()' ) );
    public final void rule__MessageBase__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( ( rule__MessageBase__Group_1_0__0 ) ) | ( '()' ) )
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
                    // InternalMyDsl.g:840:2: ( ( rule__MessageBase__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:840:2: ( ( rule__MessageBase__Group_1_0__0 ) )
                    // InternalMyDsl.g:841:3: ( rule__MessageBase__Group_1_0__0 )
                    {
                     before(grammarAccess.getMessageBaseAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:842:3: ( rule__MessageBase__Group_1_0__0 )
                    // InternalMyDsl.g:842:4: rule__MessageBase__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageBase__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageBaseAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:846:2: ( '()' )
                    {
                    // InternalMyDsl.g:846:2: ( '()' )
                    // InternalMyDsl.g:847:3: '()'
                    {
                     before(grammarAccess.getMessageBaseAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMessageBaseAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__MessageBase__Alternatives_1"


    // $ANTLR start "rule__ProtocolL__ActionsAlternatives_1_0"
    // InternalMyDsl.g:856:1: rule__ProtocolL__ActionsAlternatives_1_0 : ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursionL ) | ( ruleCloseRecursion ) );
    public final void rule__ProtocolL__ActionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursionL ) | ( ruleCloseRecursion ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                alt6=2;
                }
                break;
            case 40:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:861:2: ( ruleMessageL )
                    {
                    // InternalMyDsl.g:861:2: ( ruleMessageL )
                    // InternalMyDsl.g:862:3: ruleMessageL
                    {
                     before(grammarAccess.getProtocolLAccess().getActionsMessageLParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getActionsMessageLParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:867:2: ( ruleChoiceL )
                    {
                    // InternalMyDsl.g:867:2: ( ruleChoiceL )
                    // InternalMyDsl.g:868:3: ruleChoiceL
                    {
                     before(grammarAccess.getProtocolLAccess().getActionsChoiceLParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChoiceL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getActionsChoiceLParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:873:2: ( ruleForEachL )
                    {
                    // InternalMyDsl.g:873:2: ( ruleForEachL )
                    // InternalMyDsl.g:874:3: ruleForEachL
                    {
                     before(grammarAccess.getProtocolLAccess().getActionsForEachLParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForEachL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getActionsForEachLParserRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:879:2: ( ruleRecursionL )
                    {
                    // InternalMyDsl.g:879:2: ( ruleRecursionL )
                    // InternalMyDsl.g:880:3: ruleRecursionL
                    {
                     before(grammarAccess.getProtocolLAccess().getActionsRecursionLParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRecursionL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getActionsRecursionLParserRuleCall_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:885:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:885:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:886:3: ruleCloseRecursion
                    {
                     before(grammarAccess.getProtocolLAccess().getActionsCloseRecursionParserRuleCall_1_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCloseRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getActionsCloseRecursionParserRuleCall_1_0_4()); 

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
    // $ANTLR end "rule__ProtocolL__ActionsAlternatives_1_0"


    // $ANTLR start "rule__MessageType__Alternatives"
    // InternalMyDsl.g:895:1: rule__MessageType__Alternatives : ( ( ruleSenderL ) | ( ruleReceiverL ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( ( ruleSenderL ) | ( ruleReceiverL ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:900:2: ( ruleSenderL )
                    {
                    // InternalMyDsl.g:900:2: ( ruleSenderL )
                    // InternalMyDsl.g:901:3: ruleSenderL
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
                    // InternalMyDsl.g:906:2: ( ruleReceiverL )
                    {
                    // InternalMyDsl.g:906:2: ( ruleReceiverL )
                    // InternalMyDsl.g:907:3: ruleReceiverL
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


    // $ANTLR start "rule__ChoiceBranchL__Alternatives"
    // InternalMyDsl.g:916:1: rule__ChoiceBranchL__Alternatives : ( ( ( rule__ChoiceBranchL__Group_0__0 ) ) | ( ( rule__ChoiceBranchL__Group_1__0 ) ) );
    public final void rule__ChoiceBranchL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ( rule__ChoiceBranchL__Group_0__0 ) ) | ( ( rule__ChoiceBranchL__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:921:2: ( ( rule__ChoiceBranchL__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:921:2: ( ( rule__ChoiceBranchL__Group_0__0 ) )
                    // InternalMyDsl.g:922:3: ( rule__ChoiceBranchL__Group_0__0 )
                    {
                     before(grammarAccess.getChoiceBranchLAccess().getGroup_0()); 
                    // InternalMyDsl.g:923:3: ( rule__ChoiceBranchL__Group_0__0 )
                    // InternalMyDsl.g:923:4: rule__ChoiceBranchL__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChoiceBranchL__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChoiceBranchLAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:927:2: ( ( rule__ChoiceBranchL__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:927:2: ( ( rule__ChoiceBranchL__Group_1__0 ) )
                    // InternalMyDsl.g:928:3: ( rule__ChoiceBranchL__Group_1__0 )
                    {
                     before(grammarAccess.getChoiceBranchLAccess().getGroup_1()); 
                    // InternalMyDsl.g:929:3: ( rule__ChoiceBranchL__Group_1__0 )
                    // InternalMyDsl.g:929:4: rule__ChoiceBranchL__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChoiceBranchL__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChoiceBranchLAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ChoiceBranchL__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:937:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'action' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( ( 'int' ) | ( 'string' ) | ( 'action' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case 14:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:942:2: ( 'int' )
                    {
                    // InternalMyDsl.g:942:2: ( 'int' )
                    // InternalMyDsl.g:943:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:948:2: ( 'string' )
                    {
                    // InternalMyDsl.g:948:2: ( 'string' )
                    // InternalMyDsl.g:949:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:954:2: ( 'action' )
                    {
                    // InternalMyDsl.g:954:2: ( 'action' )
                    // InternalMyDsl.g:955:3: 'action'
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
    // InternalMyDsl.g:964:1: rule__GlobalProtocol__Group__0 : rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 ;
    public final void rule__GlobalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 )
            // InternalMyDsl.g:969:2: rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1
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
    // InternalMyDsl.g:976:1: rule__GlobalProtocol__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( ( 'global' ) )
            // InternalMyDsl.g:981:1: ( 'global' )
            {
            // InternalMyDsl.g:981:1: ( 'global' )
            // InternalMyDsl.g:982:2: 'global'
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
    // InternalMyDsl.g:991:1: rule__GlobalProtocol__Group__1 : rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 ;
    public final void rule__GlobalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 )
            // InternalMyDsl.g:996:2: rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2
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
    // InternalMyDsl.g:1003:1: rule__GlobalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__GlobalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:1008:1: ( 'protocol' )
            {
            // InternalMyDsl.g:1008:1: ( 'protocol' )
            // InternalMyDsl.g:1009:2: 'protocol'
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
    // InternalMyDsl.g:1018:1: rule__GlobalProtocol__Group__2 : rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 ;
    public final void rule__GlobalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 )
            // InternalMyDsl.g:1023:2: rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3
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
    // InternalMyDsl.g:1030:1: rule__GlobalProtocol__Group__2__Impl : ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__GlobalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:1035:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:1035:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:1036:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:1037:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:1037:3: rule__GlobalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:1045:1: rule__GlobalProtocol__Group__3 : rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 ;
    public final void rule__GlobalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 )
            // InternalMyDsl.g:1050:2: rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4
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
    // InternalMyDsl.g:1057:1: rule__GlobalProtocol__Group__3__Impl : ( '(' ) ;
    public final void rule__GlobalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( '(' ) )
            // InternalMyDsl.g:1062:1: ( '(' )
            {
            // InternalMyDsl.g:1062:1: ( '(' )
            // InternalMyDsl.g:1063:2: '('
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
    // InternalMyDsl.g:1072:1: rule__GlobalProtocol__Group__4 : rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 ;
    public final void rule__GlobalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 )
            // InternalMyDsl.g:1077:2: rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5
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
    // InternalMyDsl.g:1084:1: rule__GlobalProtocol__Group__4__Impl : ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) ;
    public final void rule__GlobalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) )
            // InternalMyDsl.g:1089:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            {
            // InternalMyDsl.g:1089:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            // InternalMyDsl.g:1090:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getRolesAssignment_4()); 
            // InternalMyDsl.g:1091:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            // InternalMyDsl.g:1091:3: rule__GlobalProtocol__RolesAssignment_4
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
    // InternalMyDsl.g:1099:1: rule__GlobalProtocol__Group__5 : rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 ;
    public final void rule__GlobalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 )
            // InternalMyDsl.g:1104:2: rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6
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
    // InternalMyDsl.g:1111:1: rule__GlobalProtocol__Group__5__Impl : ( '){' ) ;
    public final void rule__GlobalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( '){' ) )
            // InternalMyDsl.g:1116:1: ( '){' )
            {
            // InternalMyDsl.g:1116:1: ( '){' )
            // InternalMyDsl.g:1117:2: '){'
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
    // InternalMyDsl.g:1126:1: rule__GlobalProtocol__Group__6 : rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 ;
    public final void rule__GlobalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 )
            // InternalMyDsl.g:1131:2: rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7
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
    // InternalMyDsl.g:1138:1: rule__GlobalProtocol__Group__6__Impl : ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) ;
    public final void rule__GlobalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) )
            // InternalMyDsl.g:1143:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            {
            // InternalMyDsl.g:1143:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            // InternalMyDsl.g:1144:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolAssignment_6()); 
            // InternalMyDsl.g:1145:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            // InternalMyDsl.g:1145:3: rule__GlobalProtocol__ProtocolAssignment_6
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
    // InternalMyDsl.g:1153:1: rule__GlobalProtocol__Group__7 : rule__GlobalProtocol__Group__7__Impl ;
    public final void rule__GlobalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( rule__GlobalProtocol__Group__7__Impl )
            // InternalMyDsl.g:1158:2: rule__GlobalProtocol__Group__7__Impl
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
    // InternalMyDsl.g:1164:1: rule__GlobalProtocol__Group__7__Impl : ( '}' ) ;
    public final void rule__GlobalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( ( '}' ) )
            // InternalMyDsl.g:1169:1: ( '}' )
            {
            // InternalMyDsl.g:1169:1: ( '}' )
            // InternalMyDsl.g:1170:2: '}'
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
    // InternalMyDsl.g:1180:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalMyDsl.g:1185:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
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
    // InternalMyDsl.g:1192:1: rule__Roles__Group__0__Impl : ( ( rule__Roles__RolesAssignment_0 ) ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1196:1: ( ( ( rule__Roles__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:1197:1: ( ( rule__Roles__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:1197:1: ( ( rule__Roles__RolesAssignment_0 ) )
            // InternalMyDsl.g:1198:2: ( rule__Roles__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:1199:2: ( rule__Roles__RolesAssignment_0 )
            // InternalMyDsl.g:1199:3: rule__Roles__RolesAssignment_0
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
    // InternalMyDsl.g:1207:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( rule__Roles__Group__1__Impl )
            // InternalMyDsl.g:1212:2: rule__Roles__Group__1__Impl
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
    // InternalMyDsl.g:1218:1: rule__Roles__Group__1__Impl : ( ( rule__Roles__Group_1__0 )* ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( ( ( rule__Roles__Group_1__0 )* ) )
            // InternalMyDsl.g:1223:1: ( ( rule__Roles__Group_1__0 )* )
            {
            // InternalMyDsl.g:1223:1: ( ( rule__Roles__Group_1__0 )* )
            // InternalMyDsl.g:1224:2: ( rule__Roles__Group_1__0 )*
            {
             before(grammarAccess.getRolesAccess().getGroup_1()); 
            // InternalMyDsl.g:1225:2: ( rule__Roles__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1225:3: rule__Roles__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Roles__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:1234:1: rule__Roles__Group_1__0 : rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 ;
    public final void rule__Roles__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 )
            // InternalMyDsl.g:1239:2: rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1
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
    // InternalMyDsl.g:1246:1: rule__Roles__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Roles__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( ( ',' ) )
            // InternalMyDsl.g:1251:1: ( ',' )
            {
            // InternalMyDsl.g:1251:1: ( ',' )
            // InternalMyDsl.g:1252:2: ','
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
    // InternalMyDsl.g:1261:1: rule__Roles__Group_1__1 : rule__Roles__Group_1__1__Impl ;
    public final void rule__Roles__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( rule__Roles__Group_1__1__Impl )
            // InternalMyDsl.g:1266:2: rule__Roles__Group_1__1__Impl
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
    // InternalMyDsl.g:1272:1: rule__Roles__Group_1__1__Impl : ( ( rule__Roles__RolesAssignment_1_1 ) ) ;
    public final void rule__Roles__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( ( ( rule__Roles__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:1277:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1277:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:1278:2: ( rule__Roles__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:1279:2: ( rule__Roles__RolesAssignment_1_1 )
            // InternalMyDsl.g:1279:3: rule__Roles__RolesAssignment_1_1
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
    // InternalMyDsl.g:1288:1: rule__RoleOne__Group__0 : rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 ;
    public final void rule__RoleOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 )
            // InternalMyDsl.g:1293:2: rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1
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
    // InternalMyDsl.g:1300:1: rule__RoleOne__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( ( 'role' ) )
            // InternalMyDsl.g:1305:1: ( 'role' )
            {
            // InternalMyDsl.g:1305:1: ( 'role' )
            // InternalMyDsl.g:1306:2: 'role'
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
    // InternalMyDsl.g:1315:1: rule__RoleOne__Group__1 : rule__RoleOne__Group__1__Impl ;
    public final void rule__RoleOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( rule__RoleOne__Group__1__Impl )
            // InternalMyDsl.g:1320:2: rule__RoleOne__Group__1__Impl
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
    // InternalMyDsl.g:1326:1: rule__RoleOne__Group__1__Impl : ( ( rule__RoleOne__NameAssignment_1 ) ) ;
    public final void rule__RoleOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( ( ( rule__RoleOne__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1331:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1331:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            // InternalMyDsl.g:1332:2: ( rule__RoleOne__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1333:2: ( rule__RoleOne__NameAssignment_1 )
            // InternalMyDsl.g:1333:3: rule__RoleOne__NameAssignment_1
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
    // InternalMyDsl.g:1342:1: rule__RoleSet__Group__0 : rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 ;
    public final void rule__RoleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 )
            // InternalMyDsl.g:1347:2: rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1
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
    // InternalMyDsl.g:1354:1: rule__RoleSet__Group__0__Impl : ( 'roleset' ) ;
    public final void rule__RoleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( ( 'roleset' ) )
            // InternalMyDsl.g:1359:1: ( 'roleset' )
            {
            // InternalMyDsl.g:1359:1: ( 'roleset' )
            // InternalMyDsl.g:1360:2: 'roleset'
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
    // InternalMyDsl.g:1369:1: rule__RoleSet__Group__1 : rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 ;
    public final void rule__RoleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 )
            // InternalMyDsl.g:1374:2: rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2
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
    // InternalMyDsl.g:1381:1: rule__RoleSet__Group__1__Impl : ( ( rule__RoleSet__NameAssignment_1 ) ) ;
    public final void rule__RoleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( ( ( rule__RoleSet__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1386:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1386:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            // InternalMyDsl.g:1387:2: ( rule__RoleSet__NameAssignment_1 )
            {
             before(grammarAccess.getRoleSetAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1388:2: ( rule__RoleSet__NameAssignment_1 )
            // InternalMyDsl.g:1388:3: rule__RoleSet__NameAssignment_1
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
    // InternalMyDsl.g:1396:1: rule__RoleSet__Group__2 : rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 ;
    public final void rule__RoleSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 )
            // InternalMyDsl.g:1401:2: rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3
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
    // InternalMyDsl.g:1408:1: rule__RoleSet__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( ( ':' ) )
            // InternalMyDsl.g:1413:1: ( ':' )
            {
            // InternalMyDsl.g:1413:1: ( ':' )
            // InternalMyDsl.g:1414:2: ':'
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
    // InternalMyDsl.g:1423:1: rule__RoleSet__Group__3 : rule__RoleSet__Group__3__Impl ;
    public final void rule__RoleSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( rule__RoleSet__Group__3__Impl )
            // InternalMyDsl.g:1428:2: rule__RoleSet__Group__3__Impl
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
    // InternalMyDsl.g:1434:1: rule__RoleSet__Group__3__Impl : ( ( rule__RoleSet__RefAssignment_3 ) ) ;
    public final void rule__RoleSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( ( ( rule__RoleSet__RefAssignment_3 ) ) )
            // InternalMyDsl.g:1439:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:1439:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            // InternalMyDsl.g:1440:2: ( rule__RoleSet__RefAssignment_3 )
            {
             before(grammarAccess.getRoleSetAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:1441:2: ( rule__RoleSet__RefAssignment_3 )
            // InternalMyDsl.g:1441:3: rule__RoleSet__RefAssignment_3
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


    // $ANTLR start "rule__Protocol__Group__0"
    // InternalMyDsl.g:1450:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalMyDsl.g:1455:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Protocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // InternalMyDsl.g:1462:1: rule__Protocol__Group__0__Impl : ( () ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1466:1: ( ( () ) )
            // InternalMyDsl.g:1467:1: ( () )
            {
            // InternalMyDsl.g:1467:1: ( () )
            // InternalMyDsl.g:1468:2: ()
            {
             before(grammarAccess.getProtocolAccess().getProtocolAction_0()); 
            // InternalMyDsl.g:1469:2: ()
            // InternalMyDsl.g:1469:3: 
            {
            }

             after(grammarAccess.getProtocolAccess().getProtocolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // InternalMyDsl.g:1477:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( rule__Protocol__Group__1__Impl )
            // InternalMyDsl.g:1482:2: rule__Protocol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // InternalMyDsl.g:1488:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__BeginAssignment_1 ) ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( ( ( rule__Protocol__BeginAssignment_1 ) ) )
            // InternalMyDsl.g:1493:1: ( ( rule__Protocol__BeginAssignment_1 ) )
            {
            // InternalMyDsl.g:1493:1: ( ( rule__Protocol__BeginAssignment_1 ) )
            // InternalMyDsl.g:1494:2: ( rule__Protocol__BeginAssignment_1 )
            {
             before(grammarAccess.getProtocolAccess().getBeginAssignment_1()); 
            // InternalMyDsl.g:1495:2: ( rule__Protocol__BeginAssignment_1 )
            // InternalMyDsl.g:1495:3: rule__Protocol__BeginAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__BeginAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getBeginAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Recursion__Group__0"
    // InternalMyDsl.g:1504:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalMyDsl.g:1509:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
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
    // InternalMyDsl.g:1516:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1520:1: ( ( 'rec' ) )
            // InternalMyDsl.g:1521:1: ( 'rec' )
            {
            // InternalMyDsl.g:1521:1: ( 'rec' )
            // InternalMyDsl.g:1522:2: 'rec'
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
    // InternalMyDsl.g:1531:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1535:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // InternalMyDsl.g:1536:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
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
    // InternalMyDsl.g:1543:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__NameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( ( ( rule__Recursion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1548:1: ( ( rule__Recursion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1548:1: ( ( rule__Recursion__NameAssignment_1 ) )
            // InternalMyDsl.g:1549:2: ( rule__Recursion__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1550:2: ( rule__Recursion__NameAssignment_1 )
            // InternalMyDsl.g:1550:3: rule__Recursion__NameAssignment_1
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
    // InternalMyDsl.g:1558:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl rule__Recursion__Group__3 ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( rule__Recursion__Group__2__Impl rule__Recursion__Group__3 )
            // InternalMyDsl.g:1563:2: rule__Recursion__Group__2__Impl rule__Recursion__Group__3
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
    // InternalMyDsl.g:1570:1: rule__Recursion__Group__2__Impl : ( ':' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( ( ':' ) )
            // InternalMyDsl.g:1575:1: ( ':' )
            {
            // InternalMyDsl.g:1575:1: ( ':' )
            // InternalMyDsl.g:1576:2: ':'
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
    // InternalMyDsl.g:1585:1: rule__Recursion__Group__3 : rule__Recursion__Group__3__Impl rule__Recursion__Group__4 ;
    public final void rule__Recursion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( rule__Recursion__Group__3__Impl rule__Recursion__Group__4 )
            // InternalMyDsl.g:1590:2: rule__Recursion__Group__3__Impl rule__Recursion__Group__4
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
    // InternalMyDsl.g:1597:1: rule__Recursion__Group__3__Impl : ( '{' ) ;
    public final void rule__Recursion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( ( '{' ) )
            // InternalMyDsl.g:1602:1: ( '{' )
            {
            // InternalMyDsl.g:1602:1: ( '{' )
            // InternalMyDsl.g:1603:2: '{'
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
    // InternalMyDsl.g:1612:1: rule__Recursion__Group__4 : rule__Recursion__Group__4__Impl rule__Recursion__Group__5 ;
    public final void rule__Recursion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1616:1: ( rule__Recursion__Group__4__Impl rule__Recursion__Group__5 )
            // InternalMyDsl.g:1617:2: rule__Recursion__Group__4__Impl rule__Recursion__Group__5
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
    // InternalMyDsl.g:1624:1: rule__Recursion__Group__4__Impl : ( ( rule__Recursion__RecProtocolAssignment_4 ) ) ;
    public final void rule__Recursion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( ( ( rule__Recursion__RecProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:1629:1: ( ( rule__Recursion__RecProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:1629:1: ( ( rule__Recursion__RecProtocolAssignment_4 ) )
            // InternalMyDsl.g:1630:2: ( rule__Recursion__RecProtocolAssignment_4 )
            {
             before(grammarAccess.getRecursionAccess().getRecProtocolAssignment_4()); 
            // InternalMyDsl.g:1631:2: ( rule__Recursion__RecProtocolAssignment_4 )
            // InternalMyDsl.g:1631:3: rule__Recursion__RecProtocolAssignment_4
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
    // InternalMyDsl.g:1639:1: rule__Recursion__Group__5 : rule__Recursion__Group__5__Impl ;
    public final void rule__Recursion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( rule__Recursion__Group__5__Impl )
            // InternalMyDsl.g:1644:2: rule__Recursion__Group__5__Impl
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
    // InternalMyDsl.g:1650:1: rule__Recursion__Group__5__Impl : ( '}' ) ;
    public final void rule__Recursion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( ( '}' ) )
            // InternalMyDsl.g:1655:1: ( '}' )
            {
            // InternalMyDsl.g:1655:1: ( '}' )
            // InternalMyDsl.g:1656:2: '}'
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
    // InternalMyDsl.g:1666:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalMyDsl.g:1671:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
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
    // InternalMyDsl.g:1678:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( ( 'loop' ) )
            // InternalMyDsl.g:1683:1: ( 'loop' )
            {
            // InternalMyDsl.g:1683:1: ( 'loop' )
            // InternalMyDsl.g:1684:2: 'loop'
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
    // InternalMyDsl.g:1693:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( rule__CloseRecursion__Group__1__Impl )
            // InternalMyDsl.g:1698:2: rule__CloseRecursion__Group__1__Impl
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
    // InternalMyDsl.g:1704:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:1709:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:1709:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:1710:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:1711:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:1711:3: rule__CloseRecursion__RecursionVariableAssignment_1
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
    // InternalMyDsl.g:1720:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1724:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalMyDsl.g:1725:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
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
    // InternalMyDsl.g:1732:1: rule__ForEach__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( ( 'for' ) )
            // InternalMyDsl.g:1737:1: ( 'for' )
            {
            // InternalMyDsl.g:1737:1: ( 'for' )
            // InternalMyDsl.g:1738:2: 'for'
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
    // InternalMyDsl.g:1747:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalMyDsl.g:1752:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
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
    // InternalMyDsl.g:1759:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__LoopRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( ( ( rule__ForEach__LoopRoleAssignment_1 ) ) )
            // InternalMyDsl.g:1764:1: ( ( rule__ForEach__LoopRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:1764:1: ( ( rule__ForEach__LoopRoleAssignment_1 ) )
            // InternalMyDsl.g:1765:2: ( rule__ForEach__LoopRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getLoopRoleAssignment_1()); 
            // InternalMyDsl.g:1766:2: ( rule__ForEach__LoopRoleAssignment_1 )
            // InternalMyDsl.g:1766:3: rule__ForEach__LoopRoleAssignment_1
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
    // InternalMyDsl.g:1774:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalMyDsl.g:1779:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
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
    // InternalMyDsl.g:1786:1: rule__ForEach__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( ( ':' ) )
            // InternalMyDsl.g:1791:1: ( ':' )
            {
            // InternalMyDsl.g:1791:1: ( ':' )
            // InternalMyDsl.g:1792:2: ':'
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
    // InternalMyDsl.g:1801:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalMyDsl.g:1806:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
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
    // InternalMyDsl.g:1813:1: rule__ForEach__Group__3__Impl : ( '<' ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1817:1: ( ( '<' ) )
            // InternalMyDsl.g:1818:1: ( '<' )
            {
            // InternalMyDsl.g:1818:1: ( '<' )
            // InternalMyDsl.g:1819:2: '<'
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
    // InternalMyDsl.g:1828:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalMyDsl.g:1833:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
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
    // InternalMyDsl.g:1840:1: rule__ForEach__Group__4__Impl : ( ( rule__ForEach__RolesetAssignment_4 ) ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1844:1: ( ( ( rule__ForEach__RolesetAssignment_4 ) ) )
            // InternalMyDsl.g:1845:1: ( ( rule__ForEach__RolesetAssignment_4 ) )
            {
            // InternalMyDsl.g:1845:1: ( ( rule__ForEach__RolesetAssignment_4 ) )
            // InternalMyDsl.g:1846:2: ( rule__ForEach__RolesetAssignment_4 )
            {
             before(grammarAccess.getForEachAccess().getRolesetAssignment_4()); 
            // InternalMyDsl.g:1847:2: ( rule__ForEach__RolesetAssignment_4 )
            // InternalMyDsl.g:1847:3: rule__ForEach__RolesetAssignment_4
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
    // InternalMyDsl.g:1855:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalMyDsl.g:1860:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
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
    // InternalMyDsl.g:1867:1: rule__ForEach__Group__5__Impl : ( ',' ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( ( ',' ) )
            // InternalMyDsl.g:1872:1: ( ',' )
            {
            // InternalMyDsl.g:1872:1: ( ',' )
            // InternalMyDsl.g:1873:2: ','
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
    // InternalMyDsl.g:1882:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl rule__ForEach__Group__7 ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( rule__ForEach__Group__6__Impl rule__ForEach__Group__7 )
            // InternalMyDsl.g:1887:2: rule__ForEach__Group__6__Impl rule__ForEach__Group__7
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
    // InternalMyDsl.g:1894:1: rule__ForEach__Group__6__Impl : ( ( rule__ForEach__RefRoleAssignment_6 ) ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1898:1: ( ( ( rule__ForEach__RefRoleAssignment_6 ) ) )
            // InternalMyDsl.g:1899:1: ( ( rule__ForEach__RefRoleAssignment_6 ) )
            {
            // InternalMyDsl.g:1899:1: ( ( rule__ForEach__RefRoleAssignment_6 ) )
            // InternalMyDsl.g:1900:2: ( rule__ForEach__RefRoleAssignment_6 )
            {
             before(grammarAccess.getForEachAccess().getRefRoleAssignment_6()); 
            // InternalMyDsl.g:1901:2: ( rule__ForEach__RefRoleAssignment_6 )
            // InternalMyDsl.g:1901:3: rule__ForEach__RefRoleAssignment_6
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
    // InternalMyDsl.g:1909:1: rule__ForEach__Group__7 : rule__ForEach__Group__7__Impl rule__ForEach__Group__8 ;
    public final void rule__ForEach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( rule__ForEach__Group__7__Impl rule__ForEach__Group__8 )
            // InternalMyDsl.g:1914:2: rule__ForEach__Group__7__Impl rule__ForEach__Group__8
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
    // InternalMyDsl.g:1921:1: rule__ForEach__Group__7__Impl : ( '>' ) ;
    public final void rule__ForEach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1925:1: ( ( '>' ) )
            // InternalMyDsl.g:1926:1: ( '>' )
            {
            // InternalMyDsl.g:1926:1: ( '>' )
            // InternalMyDsl.g:1927:2: '>'
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
    // InternalMyDsl.g:1936:1: rule__ForEach__Group__8 : rule__ForEach__Group__8__Impl rule__ForEach__Group__9 ;
    public final void rule__ForEach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( rule__ForEach__Group__8__Impl rule__ForEach__Group__9 )
            // InternalMyDsl.g:1941:2: rule__ForEach__Group__8__Impl rule__ForEach__Group__9
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
    // InternalMyDsl.g:1948:1: rule__ForEach__Group__8__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1952:1: ( ( '{' ) )
            // InternalMyDsl.g:1953:1: ( '{' )
            {
            // InternalMyDsl.g:1953:1: ( '{' )
            // InternalMyDsl.g:1954:2: '{'
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
    // InternalMyDsl.g:1963:1: rule__ForEach__Group__9 : rule__ForEach__Group__9__Impl rule__ForEach__Group__10 ;
    public final void rule__ForEach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( rule__ForEach__Group__9__Impl rule__ForEach__Group__10 )
            // InternalMyDsl.g:1968:2: rule__ForEach__Group__9__Impl rule__ForEach__Group__10
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
    // InternalMyDsl.g:1975:1: rule__ForEach__Group__9__Impl : ( ( rule__ForEach__ForBodyAssignment_9 ) ) ;
    public final void rule__ForEach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1979:1: ( ( ( rule__ForEach__ForBodyAssignment_9 ) ) )
            // InternalMyDsl.g:1980:1: ( ( rule__ForEach__ForBodyAssignment_9 ) )
            {
            // InternalMyDsl.g:1980:1: ( ( rule__ForEach__ForBodyAssignment_9 ) )
            // InternalMyDsl.g:1981:2: ( rule__ForEach__ForBodyAssignment_9 )
            {
             before(grammarAccess.getForEachAccess().getForBodyAssignment_9()); 
            // InternalMyDsl.g:1982:2: ( rule__ForEach__ForBodyAssignment_9 )
            // InternalMyDsl.g:1982:3: rule__ForEach__ForBodyAssignment_9
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
    // InternalMyDsl.g:1990:1: rule__ForEach__Group__10 : rule__ForEach__Group__10__Impl rule__ForEach__Group__11 ;
    public final void rule__ForEach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( rule__ForEach__Group__10__Impl rule__ForEach__Group__11 )
            // InternalMyDsl.g:1995:2: rule__ForEach__Group__10__Impl rule__ForEach__Group__11
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
    // InternalMyDsl.g:2002:1: rule__ForEach__Group__10__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2006:1: ( ( '}' ) )
            // InternalMyDsl.g:2007:1: ( '}' )
            {
            // InternalMyDsl.g:2007:1: ( '}' )
            // InternalMyDsl.g:2008:2: '}'
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
    // InternalMyDsl.g:2017:1: rule__ForEach__Group__11 : rule__ForEach__Group__11__Impl rule__ForEach__Group__12 ;
    public final void rule__ForEach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( rule__ForEach__Group__11__Impl rule__ForEach__Group__12 )
            // InternalMyDsl.g:2022:2: rule__ForEach__Group__11__Impl rule__ForEach__Group__12
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
    // InternalMyDsl.g:2029:1: rule__ForEach__Group__11__Impl : ( ';' ) ;
    public final void rule__ForEach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2033:1: ( ( ';' ) )
            // InternalMyDsl.g:2034:1: ( ';' )
            {
            // InternalMyDsl.g:2034:1: ( ';' )
            // InternalMyDsl.g:2035:2: ';'
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
    // InternalMyDsl.g:2044:1: rule__ForEach__Group__12 : rule__ForEach__Group__12__Impl ;
    public final void rule__ForEach__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( rule__ForEach__Group__12__Impl )
            // InternalMyDsl.g:2049:2: rule__ForEach__Group__12__Impl
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
    // InternalMyDsl.g:2055:1: rule__ForEach__Group__12__Impl : ( ( rule__ForEach__ProtocolAssignment_12 ) ) ;
    public final void rule__ForEach__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2059:1: ( ( ( rule__ForEach__ProtocolAssignment_12 ) ) )
            // InternalMyDsl.g:2060:1: ( ( rule__ForEach__ProtocolAssignment_12 ) )
            {
            // InternalMyDsl.g:2060:1: ( ( rule__ForEach__ProtocolAssignment_12 ) )
            // InternalMyDsl.g:2061:2: ( rule__ForEach__ProtocolAssignment_12 )
            {
             before(grammarAccess.getForEachAccess().getProtocolAssignment_12()); 
            // InternalMyDsl.g:2062:2: ( rule__ForEach__ProtocolAssignment_12 )
            // InternalMyDsl.g:2062:3: rule__ForEach__ProtocolAssignment_12
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
    // InternalMyDsl.g:2071:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:2076:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
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
    // InternalMyDsl.g:2083:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2087:1: ( ( 'choice' ) )
            // InternalMyDsl.g:2088:1: ( 'choice' )
            {
            // InternalMyDsl.g:2088:1: ( 'choice' )
            // InternalMyDsl.g:2089:2: 'choice'
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
    // InternalMyDsl.g:2098:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2102:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:2103:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
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
    // InternalMyDsl.g:2110:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2114:1: ( ( 'at' ) )
            // InternalMyDsl.g:2115:1: ( 'at' )
            {
            // InternalMyDsl.g:2115:1: ( 'at' )
            // InternalMyDsl.g:2116:2: 'at'
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
    // InternalMyDsl.g:2125:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:2130:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
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
    // InternalMyDsl.g:2137:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2141:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:2142:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:2142:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalMyDsl.g:2143:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:2144:2: ( rule__Choice__RoleAssignment_2 )
            // InternalMyDsl.g:2144:3: rule__Choice__RoleAssignment_2
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
    // InternalMyDsl.g:2152:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:2157:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
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
    // InternalMyDsl.g:2164:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( ( '{' ) )
            // InternalMyDsl.g:2169:1: ( '{' )
            {
            // InternalMyDsl.g:2169:1: ( '{' )
            // InternalMyDsl.g:2170:2: '{'
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
    // InternalMyDsl.g:2179:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:2184:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
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
    // InternalMyDsl.g:2191:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__BranchesAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2195:1: ( ( ( rule__Choice__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:2196:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:2196:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            // InternalMyDsl.g:2197:2: ( rule__Choice__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:2198:2: ( rule__Choice__BranchesAssignment_4 )
            // InternalMyDsl.g:2198:3: rule__Choice__BranchesAssignment_4
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
    // InternalMyDsl.g:2206:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:2211:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
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
    // InternalMyDsl.g:2218:1: rule__Choice__Group__5__Impl : ( '}' ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2222:1: ( ( '}' ) )
            // InternalMyDsl.g:2223:1: ( '}' )
            {
            // InternalMyDsl.g:2223:1: ( '}' )
            // InternalMyDsl.g:2224:2: '}'
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
    // InternalMyDsl.g:2233:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( rule__Choice__Group__6__Impl )
            // InternalMyDsl.g:2238:2: rule__Choice__Group__6__Impl
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
    // InternalMyDsl.g:2244:1: rule__Choice__Group__6__Impl : ( ( rule__Choice__Group_6__0 )* ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2248:1: ( ( ( rule__Choice__Group_6__0 )* ) )
            // InternalMyDsl.g:2249:1: ( ( rule__Choice__Group_6__0 )* )
            {
            // InternalMyDsl.g:2249:1: ( ( rule__Choice__Group_6__0 )* )
            // InternalMyDsl.g:2250:2: ( rule__Choice__Group_6__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_6()); 
            // InternalMyDsl.g:2251:2: ( rule__Choice__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2251:3: rule__Choice__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Choice__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:2260:1: rule__Choice__Group_6__0 : rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 ;
    public final void rule__Choice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 )
            // InternalMyDsl.g:2265:2: rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1
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
    // InternalMyDsl.g:2272:1: rule__Choice__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2276:1: ( ( 'or' ) )
            // InternalMyDsl.g:2277:1: ( 'or' )
            {
            // InternalMyDsl.g:2277:1: ( 'or' )
            // InternalMyDsl.g:2278:2: 'or'
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
    // InternalMyDsl.g:2287:1: rule__Choice__Group_6__1 : rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 ;
    public final void rule__Choice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2291:1: ( rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 )
            // InternalMyDsl.g:2292:2: rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2
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
    // InternalMyDsl.g:2299:1: rule__Choice__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2303:1: ( ( '{' ) )
            // InternalMyDsl.g:2304:1: ( '{' )
            {
            // InternalMyDsl.g:2304:1: ( '{' )
            // InternalMyDsl.g:2305:2: '{'
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
    // InternalMyDsl.g:2314:1: rule__Choice__Group_6__2 : rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 ;
    public final void rule__Choice__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 )
            // InternalMyDsl.g:2319:2: rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3
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
    // InternalMyDsl.g:2326:1: rule__Choice__Group_6__2__Impl : ( ( rule__Choice__BranchesAssignment_6_2 ) ) ;
    public final void rule__Choice__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2330:1: ( ( ( rule__Choice__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:2331:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:2331:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:2332:2: ( rule__Choice__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:2333:2: ( rule__Choice__BranchesAssignment_6_2 )
            // InternalMyDsl.g:2333:3: rule__Choice__BranchesAssignment_6_2
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
    // InternalMyDsl.g:2341:1: rule__Choice__Group_6__3 : rule__Choice__Group_6__3__Impl ;
    public final void rule__Choice__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( rule__Choice__Group_6__3__Impl )
            // InternalMyDsl.g:2346:2: rule__Choice__Group_6__3__Impl
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
    // InternalMyDsl.g:2352:1: rule__Choice__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Choice__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2356:1: ( ( '}' ) )
            // InternalMyDsl.g:2357:1: ( '}' )
            {
            // InternalMyDsl.g:2357:1: ( '}' )
            // InternalMyDsl.g:2358:2: '}'
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


    // $ANTLR start "rule__MessageBase__Group__0"
    // InternalMyDsl.g:2368:1: rule__MessageBase__Group__0 : rule__MessageBase__Group__0__Impl rule__MessageBase__Group__1 ;
    public final void rule__MessageBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( rule__MessageBase__Group__0__Impl rule__MessageBase__Group__1 )
            // InternalMyDsl.g:2373:2: rule__MessageBase__Group__0__Impl rule__MessageBase__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MessageBase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageBase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__0"


    // $ANTLR start "rule__MessageBase__Group__0__Impl"
    // InternalMyDsl.g:2380:1: rule__MessageBase__Group__0__Impl : ( ( rule__MessageBase__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2384:1: ( ( ( rule__MessageBase__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2385:1: ( ( rule__MessageBase__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2385:1: ( ( rule__MessageBase__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2386:2: ( rule__MessageBase__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageBaseAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2387:2: ( rule__MessageBase__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2387:3: rule__MessageBase__MessageTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageBase__MessageTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageBaseAccess().getMessageTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__0__Impl"


    // $ANTLR start "rule__MessageBase__Group__1"
    // InternalMyDsl.g:2395:1: rule__MessageBase__Group__1 : rule__MessageBase__Group__1__Impl rule__MessageBase__Group__2 ;
    public final void rule__MessageBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( rule__MessageBase__Group__1__Impl rule__MessageBase__Group__2 )
            // InternalMyDsl.g:2400:2: rule__MessageBase__Group__1__Impl rule__MessageBase__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__MessageBase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageBase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__1"


    // $ANTLR start "rule__MessageBase__Group__1__Impl"
    // InternalMyDsl.g:2407:1: rule__MessageBase__Group__1__Impl : ( ( rule__MessageBase__Alternatives_1 ) ) ;
    public final void rule__MessageBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( ( rule__MessageBase__Alternatives_1 ) ) )
            // InternalMyDsl.g:2412:1: ( ( rule__MessageBase__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2412:1: ( ( rule__MessageBase__Alternatives_1 ) )
            // InternalMyDsl.g:2413:2: ( rule__MessageBase__Alternatives_1 )
            {
             before(grammarAccess.getMessageBaseAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2414:2: ( rule__MessageBase__Alternatives_1 )
            // InternalMyDsl.g:2414:3: rule__MessageBase__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageBase__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageBaseAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__1__Impl"


    // $ANTLR start "rule__MessageBase__Group__2"
    // InternalMyDsl.g:2422:1: rule__MessageBase__Group__2 : rule__MessageBase__Group__2__Impl rule__MessageBase__Group__3 ;
    public final void rule__MessageBase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( rule__MessageBase__Group__2__Impl rule__MessageBase__Group__3 )
            // InternalMyDsl.g:2427:2: rule__MessageBase__Group__2__Impl rule__MessageBase__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MessageBase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageBase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__2"


    // $ANTLR start "rule__MessageBase__Group__2__Impl"
    // InternalMyDsl.g:2434:1: rule__MessageBase__Group__2__Impl : ( 'from' ) ;
    public final void rule__MessageBase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2438:1: ( ( 'from' ) )
            // InternalMyDsl.g:2439:1: ( 'from' )
            {
            // InternalMyDsl.g:2439:1: ( 'from' )
            // InternalMyDsl.g:2440:2: 'from'
            {
             before(grammarAccess.getMessageBaseAccess().getFromKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMessageBaseAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__2__Impl"


    // $ANTLR start "rule__MessageBase__Group__3"
    // InternalMyDsl.g:2449:1: rule__MessageBase__Group__3 : rule__MessageBase__Group__3__Impl rule__MessageBase__Group__4 ;
    public final void rule__MessageBase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( rule__MessageBase__Group__3__Impl rule__MessageBase__Group__4 )
            // InternalMyDsl.g:2454:2: rule__MessageBase__Group__3__Impl rule__MessageBase__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__MessageBase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageBase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__3"


    // $ANTLR start "rule__MessageBase__Group__3__Impl"
    // InternalMyDsl.g:2461:1: rule__MessageBase__Group__3__Impl : ( ( rule__MessageBase__SenderAssignment_3 ) ) ;
    public final void rule__MessageBase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2465:1: ( ( ( rule__MessageBase__SenderAssignment_3 ) ) )
            // InternalMyDsl.g:2466:1: ( ( rule__MessageBase__SenderAssignment_3 ) )
            {
            // InternalMyDsl.g:2466:1: ( ( rule__MessageBase__SenderAssignment_3 ) )
            // InternalMyDsl.g:2467:2: ( rule__MessageBase__SenderAssignment_3 )
            {
             before(grammarAccess.getMessageBaseAccess().getSenderAssignment_3()); 
            // InternalMyDsl.g:2468:2: ( rule__MessageBase__SenderAssignment_3 )
            // InternalMyDsl.g:2468:3: rule__MessageBase__SenderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MessageBase__SenderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageBaseAccess().getSenderAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__3__Impl"


    // $ANTLR start "rule__MessageBase__Group__4"
    // InternalMyDsl.g:2476:1: rule__MessageBase__Group__4 : rule__MessageBase__Group__4__Impl rule__MessageBase__Group__5 ;
    public final void rule__MessageBase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( rule__MessageBase__Group__4__Impl rule__MessageBase__Group__5 )
            // InternalMyDsl.g:2481:2: rule__MessageBase__Group__4__Impl rule__MessageBase__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__MessageBase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageBase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__4"


    // $ANTLR start "rule__MessageBase__Group__4__Impl"
    // InternalMyDsl.g:2488:1: rule__MessageBase__Group__4__Impl : ( 'to' ) ;
    public final void rule__MessageBase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2492:1: ( ( 'to' ) )
            // InternalMyDsl.g:2493:1: ( 'to' )
            {
            // InternalMyDsl.g:2493:1: ( 'to' )
            // InternalMyDsl.g:2494:2: 'to'
            {
             before(grammarAccess.getMessageBaseAccess().getToKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMessageBaseAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__4__Impl"


    // $ANTLR start "rule__MessageBase__Group__5"
    // InternalMyDsl.g:2503:1: rule__MessageBase__Group__5 : rule__MessageBase__Group__5__Impl rule__MessageBase__Group__6 ;
    public final void rule__MessageBase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( rule__MessageBase__Group__5__Impl rule__MessageBase__Group__6 )
            // InternalMyDsl.g:2508:2: rule__MessageBase__Group__5__Impl rule__MessageBase__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__MessageBase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageBase__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__5"


    // $ANTLR start "rule__MessageBase__Group__5__Impl"
    // InternalMyDsl.g:2515:1: rule__MessageBase__Group__5__Impl : ( ( rule__MessageBase__ReceiverAssignment_5 ) ) ;
    public final void rule__MessageBase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2519:1: ( ( ( rule__MessageBase__ReceiverAssignment_5 ) ) )
            // InternalMyDsl.g:2520:1: ( ( rule__MessageBase__ReceiverAssignment_5 ) )
            {
            // InternalMyDsl.g:2520:1: ( ( rule__MessageBase__ReceiverAssignment_5 ) )
            // InternalMyDsl.g:2521:2: ( rule__MessageBase__ReceiverAssignment_5 )
            {
             before(grammarAccess.getMessageBaseAccess().getReceiverAssignment_5()); 
            // InternalMyDsl.g:2522:2: ( rule__MessageBase__ReceiverAssignment_5 )
            // InternalMyDsl.g:2522:3: rule__MessageBase__ReceiverAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MessageBase__ReceiverAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMessageBaseAccess().getReceiverAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__5__Impl"


    // $ANTLR start "rule__MessageBase__Group__6"
    // InternalMyDsl.g:2530:1: rule__MessageBase__Group__6 : rule__MessageBase__Group__6__Impl rule__MessageBase__Group__7 ;
    public final void rule__MessageBase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( rule__MessageBase__Group__6__Impl rule__MessageBase__Group__7 )
            // InternalMyDsl.g:2535:2: rule__MessageBase__Group__6__Impl rule__MessageBase__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__MessageBase__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageBase__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__6"


    // $ANTLR start "rule__MessageBase__Group__6__Impl"
    // InternalMyDsl.g:2542:1: rule__MessageBase__Group__6__Impl : ( '.' ) ;
    public final void rule__MessageBase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2546:1: ( ( '.' ) )
            // InternalMyDsl.g:2547:1: ( '.' )
            {
            // InternalMyDsl.g:2547:1: ( '.' )
            // InternalMyDsl.g:2548:2: '.'
            {
             before(grammarAccess.getMessageBaseAccess().getFullStopKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMessageBaseAccess().getFullStopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__6__Impl"


    // $ANTLR start "rule__MessageBase__Group__7"
    // InternalMyDsl.g:2557:1: rule__MessageBase__Group__7 : rule__MessageBase__Group__7__Impl ;
    public final void rule__MessageBase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( rule__MessageBase__Group__7__Impl )
            // InternalMyDsl.g:2562:2: rule__MessageBase__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageBase__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__7"


    // $ANTLR start "rule__MessageBase__Group__7__Impl"
    // InternalMyDsl.g:2568:1: rule__MessageBase__Group__7__Impl : ( ( rule__MessageBase__ProtocolAssignment_7 ) ) ;
    public final void rule__MessageBase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2572:1: ( ( ( rule__MessageBase__ProtocolAssignment_7 ) ) )
            // InternalMyDsl.g:2573:1: ( ( rule__MessageBase__ProtocolAssignment_7 ) )
            {
            // InternalMyDsl.g:2573:1: ( ( rule__MessageBase__ProtocolAssignment_7 ) )
            // InternalMyDsl.g:2574:2: ( rule__MessageBase__ProtocolAssignment_7 )
            {
             before(grammarAccess.getMessageBaseAccess().getProtocolAssignment_7()); 
            // InternalMyDsl.g:2575:2: ( rule__MessageBase__ProtocolAssignment_7 )
            // InternalMyDsl.g:2575:3: rule__MessageBase__ProtocolAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MessageBase__ProtocolAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMessageBaseAccess().getProtocolAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group__7__Impl"


    // $ANTLR start "rule__MessageBase__Group_1_0__0"
    // InternalMyDsl.g:2584:1: rule__MessageBase__Group_1_0__0 : rule__MessageBase__Group_1_0__0__Impl rule__MessageBase__Group_1_0__1 ;
    public final void rule__MessageBase__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( rule__MessageBase__Group_1_0__0__Impl rule__MessageBase__Group_1_0__1 )
            // InternalMyDsl.g:2589:2: rule__MessageBase__Group_1_0__0__Impl rule__MessageBase__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
            rule__MessageBase__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageBase__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group_1_0__0"


    // $ANTLR start "rule__MessageBase__Group_1_0__0__Impl"
    // InternalMyDsl.g:2596:1: rule__MessageBase__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__MessageBase__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2600:1: ( ( '(' ) )
            // InternalMyDsl.g:2601:1: ( '(' )
            {
            // InternalMyDsl.g:2601:1: ( '(' )
            // InternalMyDsl.g:2602:2: '('
            {
             before(grammarAccess.getMessageBaseAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMessageBaseAccess().getLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group_1_0__0__Impl"


    // $ANTLR start "rule__MessageBase__Group_1_0__1"
    // InternalMyDsl.g:2611:1: rule__MessageBase__Group_1_0__1 : rule__MessageBase__Group_1_0__1__Impl rule__MessageBase__Group_1_0__2 ;
    public final void rule__MessageBase__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2615:1: ( rule__MessageBase__Group_1_0__1__Impl rule__MessageBase__Group_1_0__2 )
            // InternalMyDsl.g:2616:2: rule__MessageBase__Group_1_0__1__Impl rule__MessageBase__Group_1_0__2
            {
            pushFollow(FOLLOW_26);
            rule__MessageBase__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageBase__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group_1_0__1"


    // $ANTLR start "rule__MessageBase__Group_1_0__1__Impl"
    // InternalMyDsl.g:2623:1: rule__MessageBase__Group_1_0__1__Impl : ( ( rule__MessageBase__PayloadAssignment_1_0_1 )? ) ;
    public final void rule__MessageBase__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2627:1: ( ( ( rule__MessageBase__PayloadAssignment_1_0_1 )? ) )
            // InternalMyDsl.g:2628:1: ( ( rule__MessageBase__PayloadAssignment_1_0_1 )? )
            {
            // InternalMyDsl.g:2628:1: ( ( rule__MessageBase__PayloadAssignment_1_0_1 )? )
            // InternalMyDsl.g:2629:2: ( rule__MessageBase__PayloadAssignment_1_0_1 )?
            {
             before(grammarAccess.getMessageBaseAccess().getPayloadAssignment_1_0_1()); 
            // InternalMyDsl.g:2630:2: ( rule__MessageBase__PayloadAssignment_1_0_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=12 && LA12_0<=14)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:2630:3: rule__MessageBase__PayloadAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageBase__PayloadAssignment_1_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageBaseAccess().getPayloadAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group_1_0__1__Impl"


    // $ANTLR start "rule__MessageBase__Group_1_0__2"
    // InternalMyDsl.g:2638:1: rule__MessageBase__Group_1_0__2 : rule__MessageBase__Group_1_0__2__Impl ;
    public final void rule__MessageBase__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( rule__MessageBase__Group_1_0__2__Impl )
            // InternalMyDsl.g:2643:2: rule__MessageBase__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageBase__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group_1_0__2"


    // $ANTLR start "rule__MessageBase__Group_1_0__2__Impl"
    // InternalMyDsl.g:2649:1: rule__MessageBase__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__MessageBase__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2653:1: ( ( ')' ) )
            // InternalMyDsl.g:2654:1: ( ')' )
            {
            // InternalMyDsl.g:2654:1: ( ')' )
            // InternalMyDsl.g:2655:2: ')'
            {
             before(grammarAccess.getMessageBaseAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMessageBaseAccess().getRightParenthesisKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__Group_1_0__2__Impl"


    // $ANTLR start "rule__MessageQuit__Group__0"
    // InternalMyDsl.g:2665:1: rule__MessageQuit__Group__0 : rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1 ;
    public final void rule__MessageQuit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1 )
            // InternalMyDsl.g:2670:2: rule__MessageQuit__Group__0__Impl rule__MessageQuit__Group__1
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
    // InternalMyDsl.g:2677:1: rule__MessageQuit__Group__0__Impl : ( ( rule__MessageQuit__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageQuit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2681:1: ( ( ( rule__MessageQuit__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2682:1: ( ( rule__MessageQuit__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2682:1: ( ( rule__MessageQuit__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2683:2: ( rule__MessageQuit__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageQuitAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2684:2: ( rule__MessageQuit__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2684:3: rule__MessageQuit__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2692:1: rule__MessageQuit__Group__1 : rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2 ;
    public final void rule__MessageQuit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2 )
            // InternalMyDsl.g:2697:2: rule__MessageQuit__Group__1__Impl rule__MessageQuit__Group__2
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
    // InternalMyDsl.g:2704:1: rule__MessageQuit__Group__1__Impl : ( '()' ) ;
    public final void rule__MessageQuit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2708:1: ( ( '()' ) )
            // InternalMyDsl.g:2709:1: ( '()' )
            {
            // InternalMyDsl.g:2709:1: ( '()' )
            // InternalMyDsl.g:2710:2: '()'
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
    // InternalMyDsl.g:2719:1: rule__MessageQuit__Group__2 : rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3 ;
    public final void rule__MessageQuit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3 )
            // InternalMyDsl.g:2724:2: rule__MessageQuit__Group__2__Impl rule__MessageQuit__Group__3
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
    // InternalMyDsl.g:2731:1: rule__MessageQuit__Group__2__Impl : ( 'from' ) ;
    public final void rule__MessageQuit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2735:1: ( ( 'from' ) )
            // InternalMyDsl.g:2736:1: ( 'from' )
            {
            // InternalMyDsl.g:2736:1: ( 'from' )
            // InternalMyDsl.g:2737:2: 'from'
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
    // InternalMyDsl.g:2746:1: rule__MessageQuit__Group__3 : rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4 ;
    public final void rule__MessageQuit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4 )
            // InternalMyDsl.g:2751:2: rule__MessageQuit__Group__3__Impl rule__MessageQuit__Group__4
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
    // InternalMyDsl.g:2758:1: rule__MessageQuit__Group__3__Impl : ( ( rule__MessageQuit__SenderAssignment_3 ) ) ;
    public final void rule__MessageQuit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2762:1: ( ( ( rule__MessageQuit__SenderAssignment_3 ) ) )
            // InternalMyDsl.g:2763:1: ( ( rule__MessageQuit__SenderAssignment_3 ) )
            {
            // InternalMyDsl.g:2763:1: ( ( rule__MessageQuit__SenderAssignment_3 ) )
            // InternalMyDsl.g:2764:2: ( rule__MessageQuit__SenderAssignment_3 )
            {
             before(grammarAccess.getMessageQuitAccess().getSenderAssignment_3()); 
            // InternalMyDsl.g:2765:2: ( rule__MessageQuit__SenderAssignment_3 )
            // InternalMyDsl.g:2765:3: rule__MessageQuit__SenderAssignment_3
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
    // InternalMyDsl.g:2773:1: rule__MessageQuit__Group__4 : rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5 ;
    public final void rule__MessageQuit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5 )
            // InternalMyDsl.g:2778:2: rule__MessageQuit__Group__4__Impl rule__MessageQuit__Group__5
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
    // InternalMyDsl.g:2785:1: rule__MessageQuit__Group__4__Impl : ( 'to' ) ;
    public final void rule__MessageQuit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2789:1: ( ( 'to' ) )
            // InternalMyDsl.g:2790:1: ( 'to' )
            {
            // InternalMyDsl.g:2790:1: ( 'to' )
            // InternalMyDsl.g:2791:2: 'to'
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
    // InternalMyDsl.g:2800:1: rule__MessageQuit__Group__5 : rule__MessageQuit__Group__5__Impl rule__MessageQuit__Group__6 ;
    public final void rule__MessageQuit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( rule__MessageQuit__Group__5__Impl rule__MessageQuit__Group__6 )
            // InternalMyDsl.g:2805:2: rule__MessageQuit__Group__5__Impl rule__MessageQuit__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__MessageQuit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageQuit__Group__6();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2812:1: rule__MessageQuit__Group__5__Impl : ( ( rule__MessageQuit__ReceiverAssignment_5 ) ) ;
    public final void rule__MessageQuit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2816:1: ( ( ( rule__MessageQuit__ReceiverAssignment_5 ) ) )
            // InternalMyDsl.g:2817:1: ( ( rule__MessageQuit__ReceiverAssignment_5 ) )
            {
            // InternalMyDsl.g:2817:1: ( ( rule__MessageQuit__ReceiverAssignment_5 ) )
            // InternalMyDsl.g:2818:2: ( rule__MessageQuit__ReceiverAssignment_5 )
            {
             before(grammarAccess.getMessageQuitAccess().getReceiverAssignment_5()); 
            // InternalMyDsl.g:2819:2: ( rule__MessageQuit__ReceiverAssignment_5 )
            // InternalMyDsl.g:2819:3: rule__MessageQuit__ReceiverAssignment_5
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


    // $ANTLR start "rule__MessageQuit__Group__6"
    // InternalMyDsl.g:2827:1: rule__MessageQuit__Group__6 : rule__MessageQuit__Group__6__Impl ;
    public final void rule__MessageQuit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( rule__MessageQuit__Group__6__Impl )
            // InternalMyDsl.g:2832:2: rule__MessageQuit__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuit__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__6"


    // $ANTLR start "rule__MessageQuit__Group__6__Impl"
    // InternalMyDsl.g:2838:1: rule__MessageQuit__Group__6__Impl : ( '.' ) ;
    public final void rule__MessageQuit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2842:1: ( ( '.' ) )
            // InternalMyDsl.g:2843:1: ( '.' )
            {
            // InternalMyDsl.g:2843:1: ( '.' )
            // InternalMyDsl.g:2844:2: '.'
            {
             before(grammarAccess.getMessageQuitAccess().getFullStopKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMessageQuitAccess().getFullStopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuit__Group__6__Impl"


    // $ANTLR start "rule__Payload__Group__0"
    // InternalMyDsl.g:2854:1: rule__Payload__Group__0 : rule__Payload__Group__0__Impl rule__Payload__Group__1 ;
    public final void rule__Payload__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( rule__Payload__Group__0__Impl rule__Payload__Group__1 )
            // InternalMyDsl.g:2859:2: rule__Payload__Group__0__Impl rule__Payload__Group__1
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
    // InternalMyDsl.g:2866:1: rule__Payload__Group__0__Impl : ( ( rule__Payload__TypesAssignment_0 ) ) ;
    public final void rule__Payload__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2870:1: ( ( ( rule__Payload__TypesAssignment_0 ) ) )
            // InternalMyDsl.g:2871:1: ( ( rule__Payload__TypesAssignment_0 ) )
            {
            // InternalMyDsl.g:2871:1: ( ( rule__Payload__TypesAssignment_0 ) )
            // InternalMyDsl.g:2872:2: ( rule__Payload__TypesAssignment_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0()); 
            // InternalMyDsl.g:2873:2: ( rule__Payload__TypesAssignment_0 )
            // InternalMyDsl.g:2873:3: rule__Payload__TypesAssignment_0
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
    // InternalMyDsl.g:2881:1: rule__Payload__Group__1 : rule__Payload__Group__1__Impl ;
    public final void rule__Payload__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2885:1: ( rule__Payload__Group__1__Impl )
            // InternalMyDsl.g:2886:2: rule__Payload__Group__1__Impl
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
    // InternalMyDsl.g:2892:1: rule__Payload__Group__1__Impl : ( ( rule__Payload__Group_1__0 )* ) ;
    public final void rule__Payload__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2896:1: ( ( ( rule__Payload__Group_1__0 )* ) )
            // InternalMyDsl.g:2897:1: ( ( rule__Payload__Group_1__0 )* )
            {
            // InternalMyDsl.g:2897:1: ( ( rule__Payload__Group_1__0 )* )
            // InternalMyDsl.g:2898:2: ( rule__Payload__Group_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_1()); 
            // InternalMyDsl.g:2899:2: ( rule__Payload__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2899:3: rule__Payload__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Payload__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:2908:1: rule__Payload__Group_1__0 : rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 ;
    public final void rule__Payload__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 )
            // InternalMyDsl.g:2913:2: rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1
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
    // InternalMyDsl.g:2920:1: rule__Payload__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2924:1: ( ( ',' ) )
            // InternalMyDsl.g:2925:1: ( ',' )
            {
            // InternalMyDsl.g:2925:1: ( ',' )
            // InternalMyDsl.g:2926:2: ','
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
    // InternalMyDsl.g:2935:1: rule__Payload__Group_1__1 : rule__Payload__Group_1__1__Impl ;
    public final void rule__Payload__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2939:1: ( rule__Payload__Group_1__1__Impl )
            // InternalMyDsl.g:2940:2: rule__Payload__Group_1__1__Impl
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
    // InternalMyDsl.g:2946:1: rule__Payload__Group_1__1__Impl : ( ( rule__Payload__TypesAssignment_1_1 ) ) ;
    public final void rule__Payload__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2950:1: ( ( ( rule__Payload__TypesAssignment_1_1 ) ) )
            // InternalMyDsl.g:2951:1: ( ( rule__Payload__TypesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2951:1: ( ( rule__Payload__TypesAssignment_1_1 ) )
            // InternalMyDsl.g:2952:2: ( rule__Payload__TypesAssignment_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_1_1()); 
            // InternalMyDsl.g:2953:2: ( rule__Payload__TypesAssignment_1_1 )
            // InternalMyDsl.g:2953:3: rule__Payload__TypesAssignment_1_1
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
    // InternalMyDsl.g:2962:1: rule__LocalProtocol__Group__0 : rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 ;
    public final void rule__LocalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 )
            // InternalMyDsl.g:2967:2: rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1
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
    // InternalMyDsl.g:2974:1: rule__LocalProtocol__Group__0__Impl : ( 'local' ) ;
    public final void rule__LocalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2978:1: ( ( 'local' ) )
            // InternalMyDsl.g:2979:1: ( 'local' )
            {
            // InternalMyDsl.g:2979:1: ( 'local' )
            // InternalMyDsl.g:2980:2: 'local'
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
    // InternalMyDsl.g:2989:1: rule__LocalProtocol__Group__1 : rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 ;
    public final void rule__LocalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 )
            // InternalMyDsl.g:2994:2: rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2
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
    // InternalMyDsl.g:3001:1: rule__LocalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__LocalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3005:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:3006:1: ( 'protocol' )
            {
            // InternalMyDsl.g:3006:1: ( 'protocol' )
            // InternalMyDsl.g:3007:2: 'protocol'
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
    // InternalMyDsl.g:3016:1: rule__LocalProtocol__Group__2 : rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 ;
    public final void rule__LocalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3020:1: ( rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 )
            // InternalMyDsl.g:3021:2: rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3
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
    // InternalMyDsl.g:3028:1: rule__LocalProtocol__Group__2__Impl : ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__LocalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3032:1: ( ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:3033:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:3033:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:3034:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:3035:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:3035:3: rule__LocalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:3043:1: rule__LocalProtocol__Group__3 : rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 ;
    public final void rule__LocalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 )
            // InternalMyDsl.g:3048:2: rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3055:1: rule__LocalProtocol__Group__3__Impl : ( 'at' ) ;
    public final void rule__LocalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3059:1: ( ( 'at' ) )
            // InternalMyDsl.g:3060:1: ( 'at' )
            {
            // InternalMyDsl.g:3060:1: ( 'at' )
            // InternalMyDsl.g:3061:2: 'at'
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
    // InternalMyDsl.g:3070:1: rule__LocalProtocol__Group__4 : rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 ;
    public final void rule__LocalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3074:1: ( rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 )
            // InternalMyDsl.g:3075:2: rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5
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
    // InternalMyDsl.g:3082:1: rule__LocalProtocol__Group__4__Impl : ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) ;
    public final void rule__LocalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3086:1: ( ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) )
            // InternalMyDsl.g:3087:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            {
            // InternalMyDsl.g:3087:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            // InternalMyDsl.g:3088:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_4()); 
            // InternalMyDsl.g:3089:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            // InternalMyDsl.g:3089:3: rule__LocalProtocol__ProjectedRoleAssignment_4
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
    // InternalMyDsl.g:3097:1: rule__LocalProtocol__Group__5 : rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 ;
    public final void rule__LocalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 )
            // InternalMyDsl.g:3102:2: rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6
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
    // InternalMyDsl.g:3109:1: rule__LocalProtocol__Group__5__Impl : ( '(' ) ;
    public final void rule__LocalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3113:1: ( ( '(' ) )
            // InternalMyDsl.g:3114:1: ( '(' )
            {
            // InternalMyDsl.g:3114:1: ( '(' )
            // InternalMyDsl.g:3115:2: '('
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
    // InternalMyDsl.g:3124:1: rule__LocalProtocol__Group__6 : rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 ;
    public final void rule__LocalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3128:1: ( rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 )
            // InternalMyDsl.g:3129:2: rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7
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
    // InternalMyDsl.g:3136:1: rule__LocalProtocol__Group__6__Impl : ( ( rule__LocalProtocol__RolesAssignment_6 ) ) ;
    public final void rule__LocalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3140:1: ( ( ( rule__LocalProtocol__RolesAssignment_6 ) ) )
            // InternalMyDsl.g:3141:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            {
            // InternalMyDsl.g:3141:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            // InternalMyDsl.g:3142:2: ( rule__LocalProtocol__RolesAssignment_6 )
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesAssignment_6()); 
            // InternalMyDsl.g:3143:2: ( rule__LocalProtocol__RolesAssignment_6 )
            // InternalMyDsl.g:3143:3: rule__LocalProtocol__RolesAssignment_6
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
    // InternalMyDsl.g:3151:1: rule__LocalProtocol__Group__7 : rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 ;
    public final void rule__LocalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3155:1: ( rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 )
            // InternalMyDsl.g:3156:2: rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:3163:1: rule__LocalProtocol__Group__7__Impl : ( ')' ) ;
    public final void rule__LocalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3167:1: ( ( ')' ) )
            // InternalMyDsl.g:3168:1: ( ')' )
            {
            // InternalMyDsl.g:3168:1: ( ')' )
            // InternalMyDsl.g:3169:2: ')'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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
    // InternalMyDsl.g:3178:1: rule__LocalProtocol__Group__8 : rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 ;
    public final void rule__LocalProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 )
            // InternalMyDsl.g:3183:2: rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3190:1: rule__LocalProtocol__Group__8__Impl : ( '{' ) ;
    public final void rule__LocalProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3194:1: ( ( '{' ) )
            // InternalMyDsl.g:3195:1: ( '{' )
            {
            // InternalMyDsl.g:3195:1: ( '{' )
            // InternalMyDsl.g:3196:2: '{'
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // InternalMyDsl.g:3205:1: rule__LocalProtocol__Group__9 : rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 ;
    public final void rule__LocalProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 )
            // InternalMyDsl.g:3210:2: rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__LocalProtocol__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__10();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3217:1: rule__LocalProtocol__Group__9__Impl : ( ( rule__LocalProtocol__ProtocolAssignment_9 ) ) ;
    public final void rule__LocalProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3221:1: ( ( ( rule__LocalProtocol__ProtocolAssignment_9 ) ) )
            // InternalMyDsl.g:3222:1: ( ( rule__LocalProtocol__ProtocolAssignment_9 ) )
            {
            // InternalMyDsl.g:3222:1: ( ( rule__LocalProtocol__ProtocolAssignment_9 ) )
            // InternalMyDsl.g:3223:2: ( rule__LocalProtocol__ProtocolAssignment_9 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_9()); 
            // InternalMyDsl.g:3224:2: ( rule__LocalProtocol__ProtocolAssignment_9 )
            // InternalMyDsl.g:3224:3: rule__LocalProtocol__ProtocolAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__ProtocolAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__LocalProtocol__Group__10"
    // InternalMyDsl.g:3232:1: rule__LocalProtocol__Group__10 : rule__LocalProtocol__Group__10__Impl ;
    public final void rule__LocalProtocol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( rule__LocalProtocol__Group__10__Impl )
            // InternalMyDsl.g:3237:2: rule__LocalProtocol__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__10"


    // $ANTLR start "rule__LocalProtocol__Group__10__Impl"
    // InternalMyDsl.g:3243:1: rule__LocalProtocol__Group__10__Impl : ( '}' ) ;
    public final void rule__LocalProtocol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( ( '}' ) )
            // InternalMyDsl.g:3248:1: ( '}' )
            {
            // InternalMyDsl.g:3248:1: ( '}' )
            // InternalMyDsl.g:3249:2: '}'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__10__Impl"


    // $ANTLR start "rule__ProtocolL__Group__0"
    // InternalMyDsl.g:3259:1: rule__ProtocolL__Group__0 : rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1 ;
    public final void rule__ProtocolL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3263:1: ( rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1 )
            // InternalMyDsl.g:3264:2: rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ProtocolL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtocolL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__Group__0"


    // $ANTLR start "rule__ProtocolL__Group__0__Impl"
    // InternalMyDsl.g:3271:1: rule__ProtocolL__Group__0__Impl : ( () ) ;
    public final void rule__ProtocolL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3275:1: ( ( () ) )
            // InternalMyDsl.g:3276:1: ( () )
            {
            // InternalMyDsl.g:3276:1: ( () )
            // InternalMyDsl.g:3277:2: ()
            {
             before(grammarAccess.getProtocolLAccess().getProtocolLAction_0()); 
            // InternalMyDsl.g:3278:2: ()
            // InternalMyDsl.g:3278:3: 
            {
            }

             after(grammarAccess.getProtocolLAccess().getProtocolLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__Group__0__Impl"


    // $ANTLR start "rule__ProtocolL__Group__1"
    // InternalMyDsl.g:3286:1: rule__ProtocolL__Group__1 : rule__ProtocolL__Group__1__Impl rule__ProtocolL__Group__2 ;
    public final void rule__ProtocolL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( rule__ProtocolL__Group__1__Impl rule__ProtocolL__Group__2 )
            // InternalMyDsl.g:3291:2: rule__ProtocolL__Group__1__Impl rule__ProtocolL__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__ProtocolL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtocolL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__Group__1"


    // $ANTLR start "rule__ProtocolL__Group__1__Impl"
    // InternalMyDsl.g:3298:1: rule__ProtocolL__Group__1__Impl : ( ( rule__ProtocolL__ActionsAssignment_1 )* ) ;
    public final void rule__ProtocolL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3302:1: ( ( ( rule__ProtocolL__ActionsAssignment_1 )* ) )
            // InternalMyDsl.g:3303:1: ( ( rule__ProtocolL__ActionsAssignment_1 )* )
            {
            // InternalMyDsl.g:3303:1: ( ( rule__ProtocolL__ActionsAssignment_1 )* )
            // InternalMyDsl.g:3304:2: ( rule__ProtocolL__ActionsAssignment_1 )*
            {
             before(grammarAccess.getProtocolLAccess().getActionsAssignment_1()); 
            // InternalMyDsl.g:3305:2: ( rule__ProtocolL__ActionsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==24||LA14_0==26||LA14_0==31||LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:3305:3: rule__ProtocolL__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ProtocolL__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProtocolLAccess().getActionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__Group__1__Impl"


    // $ANTLR start "rule__ProtocolL__Group__2"
    // InternalMyDsl.g:3313:1: rule__ProtocolL__Group__2 : rule__ProtocolL__Group__2__Impl ;
    public final void rule__ProtocolL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( rule__ProtocolL__Group__2__Impl )
            // InternalMyDsl.g:3318:2: rule__ProtocolL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__Group__2"


    // $ANTLR start "rule__ProtocolL__Group__2__Impl"
    // InternalMyDsl.g:3324:1: rule__ProtocolL__Group__2__Impl : ( ( 'End' )? ) ;
    public final void rule__ProtocolL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3328:1: ( ( ( 'End' )? ) )
            // InternalMyDsl.g:3329:1: ( ( 'End' )? )
            {
            // InternalMyDsl.g:3329:1: ( ( 'End' )? )
            // InternalMyDsl.g:3330:2: ( 'End' )?
            {
             before(grammarAccess.getProtocolLAccess().getEndKeyword_2()); 
            // InternalMyDsl.g:3331:2: ( 'End' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:3331:3: 'End'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getProtocolLAccess().getEndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__Group__2__Impl"


    // $ANTLR start "rule__RecursionL__Group__0"
    // InternalMyDsl.g:3340:1: rule__RecursionL__Group__0 : rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 ;
    public final void rule__RecursionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 )
            // InternalMyDsl.g:3345:2: rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1
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
    // InternalMyDsl.g:3352:1: rule__RecursionL__Group__0__Impl : ( 'rec' ) ;
    public final void rule__RecursionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3356:1: ( ( 'rec' ) )
            // InternalMyDsl.g:3357:1: ( 'rec' )
            {
            // InternalMyDsl.g:3357:1: ( 'rec' )
            // InternalMyDsl.g:3358:2: 'rec'
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
    // InternalMyDsl.g:3367:1: rule__RecursionL__Group__1 : rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 ;
    public final void rule__RecursionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3371:1: ( rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 )
            // InternalMyDsl.g:3372:2: rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2
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
    // InternalMyDsl.g:3379:1: rule__RecursionL__Group__1__Impl : ( ( rule__RecursionL__NameAssignment_1 ) ) ;
    public final void rule__RecursionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3383:1: ( ( ( rule__RecursionL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3384:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3384:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            // InternalMyDsl.g:3385:2: ( rule__RecursionL__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3386:2: ( rule__RecursionL__NameAssignment_1 )
            // InternalMyDsl.g:3386:3: rule__RecursionL__NameAssignment_1
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
    // InternalMyDsl.g:3394:1: rule__RecursionL__Group__2 : rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3 ;
    public final void rule__RecursionL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3398:1: ( rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3 )
            // InternalMyDsl.g:3399:2: rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3
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
    // InternalMyDsl.g:3406:1: rule__RecursionL__Group__2__Impl : ( ':' ) ;
    public final void rule__RecursionL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3410:1: ( ( ':' ) )
            // InternalMyDsl.g:3411:1: ( ':' )
            {
            // InternalMyDsl.g:3411:1: ( ':' )
            // InternalMyDsl.g:3412:2: ':'
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
    // InternalMyDsl.g:3421:1: rule__RecursionL__Group__3 : rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4 ;
    public final void rule__RecursionL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4 )
            // InternalMyDsl.g:3426:2: rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4
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
    // InternalMyDsl.g:3433:1: rule__RecursionL__Group__3__Impl : ( '{' ) ;
    public final void rule__RecursionL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3437:1: ( ( '{' ) )
            // InternalMyDsl.g:3438:1: ( '{' )
            {
            // InternalMyDsl.g:3438:1: ( '{' )
            // InternalMyDsl.g:3439:2: '{'
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
    // InternalMyDsl.g:3448:1: rule__RecursionL__Group__4 : rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5 ;
    public final void rule__RecursionL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5 )
            // InternalMyDsl.g:3453:2: rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5
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
    // InternalMyDsl.g:3460:1: rule__RecursionL__Group__4__Impl : ( ( rule__RecursionL__RecProtocolAssignment_4 ) ) ;
    public final void rule__RecursionL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3464:1: ( ( ( rule__RecursionL__RecProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:3465:1: ( ( rule__RecursionL__RecProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:3465:1: ( ( rule__RecursionL__RecProtocolAssignment_4 ) )
            // InternalMyDsl.g:3466:2: ( rule__RecursionL__RecProtocolAssignment_4 )
            {
             before(grammarAccess.getRecursionLAccess().getRecProtocolAssignment_4()); 
            // InternalMyDsl.g:3467:2: ( rule__RecursionL__RecProtocolAssignment_4 )
            // InternalMyDsl.g:3467:3: rule__RecursionL__RecProtocolAssignment_4
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
    // InternalMyDsl.g:3475:1: rule__RecursionL__Group__5 : rule__RecursionL__Group__5__Impl ;
    public final void rule__RecursionL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( rule__RecursionL__Group__5__Impl )
            // InternalMyDsl.g:3480:2: rule__RecursionL__Group__5__Impl
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
    // InternalMyDsl.g:3486:1: rule__RecursionL__Group__5__Impl : ( '}' ) ;
    public final void rule__RecursionL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3490:1: ( ( '}' ) )
            // InternalMyDsl.g:3491:1: ( '}' )
            {
            // InternalMyDsl.g:3491:1: ( '}' )
            // InternalMyDsl.g:3492:2: '}'
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


    // $ANTLR start "rule__MessageL__Group__0"
    // InternalMyDsl.g:3502:1: rule__MessageL__Group__0 : rule__MessageL__Group__0__Impl rule__MessageL__Group__1 ;
    public final void rule__MessageL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( rule__MessageL__Group__0__Impl rule__MessageL__Group__1 )
            // InternalMyDsl.g:3507:2: rule__MessageL__Group__0__Impl rule__MessageL__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MessageL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__0"


    // $ANTLR start "rule__MessageL__Group__0__Impl"
    // InternalMyDsl.g:3514:1: rule__MessageL__Group__0__Impl : ( ( rule__MessageL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3518:1: ( ( ( rule__MessageL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3519:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3519:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:3520:2: ( rule__MessageL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:3521:2: ( rule__MessageL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:3521:3: rule__MessageL__MessageTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageL__MessageTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageLAccess().getMessageTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__0__Impl"


    // $ANTLR start "rule__MessageL__Group__1"
    // InternalMyDsl.g:3529:1: rule__MessageL__Group__1 : rule__MessageL__Group__1__Impl rule__MessageL__Group__2 ;
    public final void rule__MessageL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( rule__MessageL__Group__1__Impl rule__MessageL__Group__2 )
            // InternalMyDsl.g:3534:2: rule__MessageL__Group__1__Impl rule__MessageL__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__MessageL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__1"


    // $ANTLR start "rule__MessageL__Group__1__Impl"
    // InternalMyDsl.g:3541:1: rule__MessageL__Group__1__Impl : ( '(' ) ;
    public final void rule__MessageL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3545:1: ( ( '(' ) )
            // InternalMyDsl.g:3546:1: ( '(' )
            {
            // InternalMyDsl.g:3546:1: ( '(' )
            // InternalMyDsl.g:3547:2: '('
            {
             before(grammarAccess.getMessageLAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMessageLAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__1__Impl"


    // $ANTLR start "rule__MessageL__Group__2"
    // InternalMyDsl.g:3556:1: rule__MessageL__Group__2 : rule__MessageL__Group__2__Impl rule__MessageL__Group__3 ;
    public final void rule__MessageL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( rule__MessageL__Group__2__Impl rule__MessageL__Group__3 )
            // InternalMyDsl.g:3561:2: rule__MessageL__Group__2__Impl rule__MessageL__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__MessageL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__2"


    // $ANTLR start "rule__MessageL__Group__2__Impl"
    // InternalMyDsl.g:3568:1: rule__MessageL__Group__2__Impl : ( ( rule__MessageL__PayloadAssignment_2 )? ) ;
    public final void rule__MessageL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3572:1: ( ( ( rule__MessageL__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:3573:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:3573:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            // InternalMyDsl.g:3574:2: ( rule__MessageL__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageLAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:3575:2: ( rule__MessageL__PayloadAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=12 && LA16_0<=14)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:3575:3: rule__MessageL__PayloadAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageL__PayloadAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageLAccess().getPayloadAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__2__Impl"


    // $ANTLR start "rule__MessageL__Group__3"
    // InternalMyDsl.g:3583:1: rule__MessageL__Group__3 : rule__MessageL__Group__3__Impl rule__MessageL__Group__4 ;
    public final void rule__MessageL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( rule__MessageL__Group__3__Impl rule__MessageL__Group__4 )
            // InternalMyDsl.g:3588:2: rule__MessageL__Group__3__Impl rule__MessageL__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__MessageL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__3"


    // $ANTLR start "rule__MessageL__Group__3__Impl"
    // InternalMyDsl.g:3595:1: rule__MessageL__Group__3__Impl : ( ')' ) ;
    public final void rule__MessageL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3599:1: ( ( ')' ) )
            // InternalMyDsl.g:3600:1: ( ')' )
            {
            // InternalMyDsl.g:3600:1: ( ')' )
            // InternalMyDsl.g:3601:2: ')'
            {
             before(grammarAccess.getMessageLAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMessageLAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__3__Impl"


    // $ANTLR start "rule__MessageL__Group__4"
    // InternalMyDsl.g:3610:1: rule__MessageL__Group__4 : rule__MessageL__Group__4__Impl rule__MessageL__Group__5 ;
    public final void rule__MessageL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( rule__MessageL__Group__4__Impl rule__MessageL__Group__5 )
            // InternalMyDsl.g:3615:2: rule__MessageL__Group__4__Impl rule__MessageL__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__MessageL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageL__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__4"


    // $ANTLR start "rule__MessageL__Group__4__Impl"
    // InternalMyDsl.g:3622:1: rule__MessageL__Group__4__Impl : ( ( rule__MessageL__SendReceiveAssignment_4 ) ) ;
    public final void rule__MessageL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3626:1: ( ( ( rule__MessageL__SendReceiveAssignment_4 ) ) )
            // InternalMyDsl.g:3627:1: ( ( rule__MessageL__SendReceiveAssignment_4 ) )
            {
            // InternalMyDsl.g:3627:1: ( ( rule__MessageL__SendReceiveAssignment_4 ) )
            // InternalMyDsl.g:3628:2: ( rule__MessageL__SendReceiveAssignment_4 )
            {
             before(grammarAccess.getMessageLAccess().getSendReceiveAssignment_4()); 
            // InternalMyDsl.g:3629:2: ( rule__MessageL__SendReceiveAssignment_4 )
            // InternalMyDsl.g:3629:3: rule__MessageL__SendReceiveAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MessageL__SendReceiveAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMessageLAccess().getSendReceiveAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__4__Impl"


    // $ANTLR start "rule__MessageL__Group__5"
    // InternalMyDsl.g:3637:1: rule__MessageL__Group__5 : rule__MessageL__Group__5__Impl ;
    public final void rule__MessageL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( rule__MessageL__Group__5__Impl )
            // InternalMyDsl.g:3642:2: rule__MessageL__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageL__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__5"


    // $ANTLR start "rule__MessageL__Group__5__Impl"
    // InternalMyDsl.g:3648:1: rule__MessageL__Group__5__Impl : ( '.' ) ;
    public final void rule__MessageL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3652:1: ( ( '.' ) )
            // InternalMyDsl.g:3653:1: ( '.' )
            {
            // InternalMyDsl.g:3653:1: ( '.' )
            // InternalMyDsl.g:3654:2: '.'
            {
             before(grammarAccess.getMessageLAccess().getFullStopKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMessageLAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__5__Impl"


    // $ANTLR start "rule__SenderL__Group__0"
    // InternalMyDsl.g:3664:1: rule__SenderL__Group__0 : rule__SenderL__Group__0__Impl rule__SenderL__Group__1 ;
    public final void rule__SenderL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3668:1: ( rule__SenderL__Group__0__Impl rule__SenderL__Group__1 )
            // InternalMyDsl.g:3669:2: rule__SenderL__Group__0__Impl rule__SenderL__Group__1
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
    // InternalMyDsl.g:3676:1: rule__SenderL__Group__0__Impl : ( 'from' ) ;
    public final void rule__SenderL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3680:1: ( ( 'from' ) )
            // InternalMyDsl.g:3681:1: ( 'from' )
            {
            // InternalMyDsl.g:3681:1: ( 'from' )
            // InternalMyDsl.g:3682:2: 'from'
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
    // InternalMyDsl.g:3691:1: rule__SenderL__Group__1 : rule__SenderL__Group__1__Impl ;
    public final void rule__SenderL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( rule__SenderL__Group__1__Impl )
            // InternalMyDsl.g:3696:2: rule__SenderL__Group__1__Impl
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
    // InternalMyDsl.g:3702:1: rule__SenderL__Group__1__Impl : ( ( rule__SenderL__RoleAssignment_1 ) ) ;
    public final void rule__SenderL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3706:1: ( ( ( rule__SenderL__RoleAssignment_1 ) ) )
            // InternalMyDsl.g:3707:1: ( ( rule__SenderL__RoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3707:1: ( ( rule__SenderL__RoleAssignment_1 ) )
            // InternalMyDsl.g:3708:2: ( rule__SenderL__RoleAssignment_1 )
            {
             before(grammarAccess.getSenderLAccess().getRoleAssignment_1()); 
            // InternalMyDsl.g:3709:2: ( rule__SenderL__RoleAssignment_1 )
            // InternalMyDsl.g:3709:3: rule__SenderL__RoleAssignment_1
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
    // InternalMyDsl.g:3718:1: rule__ReceiverL__Group__0 : rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 ;
    public final void rule__ReceiverL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3722:1: ( rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 )
            // InternalMyDsl.g:3723:2: rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1
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
    // InternalMyDsl.g:3730:1: rule__ReceiverL__Group__0__Impl : ( 'to' ) ;
    public final void rule__ReceiverL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3734:1: ( ( 'to' ) )
            // InternalMyDsl.g:3735:1: ( 'to' )
            {
            // InternalMyDsl.g:3735:1: ( 'to' )
            // InternalMyDsl.g:3736:2: 'to'
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
    // InternalMyDsl.g:3745:1: rule__ReceiverL__Group__1 : rule__ReceiverL__Group__1__Impl ;
    public final void rule__ReceiverL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( rule__ReceiverL__Group__1__Impl )
            // InternalMyDsl.g:3750:2: rule__ReceiverL__Group__1__Impl
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
    // InternalMyDsl.g:3756:1: rule__ReceiverL__Group__1__Impl : ( ( rule__ReceiverL__RoleAssignment_1 ) ) ;
    public final void rule__ReceiverL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3760:1: ( ( ( rule__ReceiverL__RoleAssignment_1 ) ) )
            // InternalMyDsl.g:3761:1: ( ( rule__ReceiverL__RoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3761:1: ( ( rule__ReceiverL__RoleAssignment_1 ) )
            // InternalMyDsl.g:3762:2: ( rule__ReceiverL__RoleAssignment_1 )
            {
             before(grammarAccess.getReceiverLAccess().getRoleAssignment_1()); 
            // InternalMyDsl.g:3763:2: ( rule__ReceiverL__RoleAssignment_1 )
            // InternalMyDsl.g:3763:3: rule__ReceiverL__RoleAssignment_1
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
    // InternalMyDsl.g:3772:1: rule__ChoiceL__Group__0 : rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 ;
    public final void rule__ChoiceL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 )
            // InternalMyDsl.g:3777:2: rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1
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
    // InternalMyDsl.g:3784:1: rule__ChoiceL__Group__0__Impl : ( 'choice' ) ;
    public final void rule__ChoiceL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3788:1: ( ( 'choice' ) )
            // InternalMyDsl.g:3789:1: ( 'choice' )
            {
            // InternalMyDsl.g:3789:1: ( 'choice' )
            // InternalMyDsl.g:3790:2: 'choice'
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
    // InternalMyDsl.g:3799:1: rule__ChoiceL__Group__1 : rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 ;
    public final void rule__ChoiceL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 )
            // InternalMyDsl.g:3804:2: rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2
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
    // InternalMyDsl.g:3811:1: rule__ChoiceL__Group__1__Impl : ( 'at' ) ;
    public final void rule__ChoiceL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3815:1: ( ( 'at' ) )
            // InternalMyDsl.g:3816:1: ( 'at' )
            {
            // InternalMyDsl.g:3816:1: ( 'at' )
            // InternalMyDsl.g:3817:2: 'at'
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
    // InternalMyDsl.g:3826:1: rule__ChoiceL__Group__2 : rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 ;
    public final void rule__ChoiceL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 )
            // InternalMyDsl.g:3831:2: rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3
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
    // InternalMyDsl.g:3838:1: rule__ChoiceL__Group__2__Impl : ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) ) ;
    public final void rule__ChoiceL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3842:1: ( ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) ) )
            // InternalMyDsl.g:3843:1: ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) )
            {
            // InternalMyDsl.g:3843:1: ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) )
            // InternalMyDsl.g:3844:2: ( rule__ChoiceL__RoleMakingChoiceAssignment_2 )
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceAssignment_2()); 
            // InternalMyDsl.g:3845:2: ( rule__ChoiceL__RoleMakingChoiceAssignment_2 )
            // InternalMyDsl.g:3845:3: rule__ChoiceL__RoleMakingChoiceAssignment_2
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
    // InternalMyDsl.g:3853:1: rule__ChoiceL__Group__3 : rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 ;
    public final void rule__ChoiceL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 )
            // InternalMyDsl.g:3858:2: rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3865:1: rule__ChoiceL__Group__3__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3869:1: ( ( '{' ) )
            // InternalMyDsl.g:3870:1: ( '{' )
            {
            // InternalMyDsl.g:3870:1: ( '{' )
            // InternalMyDsl.g:3871:2: '{'
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
    // InternalMyDsl.g:3880:1: rule__ChoiceL__Group__4 : rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 ;
    public final void rule__ChoiceL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3884:1: ( rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 )
            // InternalMyDsl.g:3885:2: rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5
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
    // InternalMyDsl.g:3892:1: rule__ChoiceL__Group__4__Impl : ( ( rule__ChoiceL__BranchesAssignment_4 ) ) ;
    public final void rule__ChoiceL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3896:1: ( ( ( rule__ChoiceL__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:3897:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:3897:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            // InternalMyDsl.g:3898:2: ( rule__ChoiceL__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:3899:2: ( rule__ChoiceL__BranchesAssignment_4 )
            // InternalMyDsl.g:3899:3: rule__ChoiceL__BranchesAssignment_4
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
    // InternalMyDsl.g:3907:1: rule__ChoiceL__Group__5 : rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 ;
    public final void rule__ChoiceL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 )
            // InternalMyDsl.g:3912:2: rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6
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
    // InternalMyDsl.g:3919:1: rule__ChoiceL__Group__5__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3923:1: ( ( '}' ) )
            // InternalMyDsl.g:3924:1: ( '}' )
            {
            // InternalMyDsl.g:3924:1: ( '}' )
            // InternalMyDsl.g:3925:2: '}'
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
    // InternalMyDsl.g:3934:1: rule__ChoiceL__Group__6 : rule__ChoiceL__Group__6__Impl ;
    public final void rule__ChoiceL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( rule__ChoiceL__Group__6__Impl )
            // InternalMyDsl.g:3939:2: rule__ChoiceL__Group__6__Impl
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
    // InternalMyDsl.g:3945:1: rule__ChoiceL__Group__6__Impl : ( ( rule__ChoiceL__Group_6__0 )* ) ;
    public final void rule__ChoiceL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3949:1: ( ( ( rule__ChoiceL__Group_6__0 )* ) )
            // InternalMyDsl.g:3950:1: ( ( rule__ChoiceL__Group_6__0 )* )
            {
            // InternalMyDsl.g:3950:1: ( ( rule__ChoiceL__Group_6__0 )* )
            // InternalMyDsl.g:3951:2: ( rule__ChoiceL__Group_6__0 )*
            {
             before(grammarAccess.getChoiceLAccess().getGroup_6()); 
            // InternalMyDsl.g:3952:2: ( rule__ChoiceL__Group_6__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:3952:3: rule__ChoiceL__Group_6__0
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
    // InternalMyDsl.g:3961:1: rule__ChoiceL__Group_6__0 : rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 ;
    public final void rule__ChoiceL__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 )
            // InternalMyDsl.g:3966:2: rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1
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
    // InternalMyDsl.g:3973:1: rule__ChoiceL__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__ChoiceL__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3977:1: ( ( 'or' ) )
            // InternalMyDsl.g:3978:1: ( 'or' )
            {
            // InternalMyDsl.g:3978:1: ( 'or' )
            // InternalMyDsl.g:3979:2: 'or'
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
    // InternalMyDsl.g:3988:1: rule__ChoiceL__Group_6__1 : rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 ;
    public final void rule__ChoiceL__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3992:1: ( rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 )
            // InternalMyDsl.g:3993:2: rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4000:1: rule__ChoiceL__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4004:1: ( ( '{' ) )
            // InternalMyDsl.g:4005:1: ( '{' )
            {
            // InternalMyDsl.g:4005:1: ( '{' )
            // InternalMyDsl.g:4006:2: '{'
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
    // InternalMyDsl.g:4015:1: rule__ChoiceL__Group_6__2 : rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 ;
    public final void rule__ChoiceL__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 )
            // InternalMyDsl.g:4020:2: rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3
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
    // InternalMyDsl.g:4027:1: rule__ChoiceL__Group_6__2__Impl : ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) ;
    public final void rule__ChoiceL__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4031:1: ( ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:4032:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:4032:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:4033:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:4034:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            // InternalMyDsl.g:4034:3: rule__ChoiceL__BranchesAssignment_6_2
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
    // InternalMyDsl.g:4042:1: rule__ChoiceL__Group_6__3 : rule__ChoiceL__Group_6__3__Impl ;
    public final void rule__ChoiceL__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4046:1: ( rule__ChoiceL__Group_6__3__Impl )
            // InternalMyDsl.g:4047:2: rule__ChoiceL__Group_6__3__Impl
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
    // InternalMyDsl.g:4053:1: rule__ChoiceL__Group_6__3__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4057:1: ( ( '}' ) )
            // InternalMyDsl.g:4058:1: ( '}' )
            {
            // InternalMyDsl.g:4058:1: ( '}' )
            // InternalMyDsl.g:4059:2: '}'
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


    // $ANTLR start "rule__ChoiceBranchL__Group_0__0"
    // InternalMyDsl.g:4069:1: rule__ChoiceBranchL__Group_0__0 : rule__ChoiceBranchL__Group_0__0__Impl rule__ChoiceBranchL__Group_0__1 ;
    public final void rule__ChoiceBranchL__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4073:1: ( rule__ChoiceBranchL__Group_0__0__Impl rule__ChoiceBranchL__Group_0__1 )
            // InternalMyDsl.g:4074:2: rule__ChoiceBranchL__Group_0__0__Impl rule__ChoiceBranchL__Group_0__1
            {
            pushFollow(FOLLOW_34);
            rule__ChoiceBranchL__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group_0__0"


    // $ANTLR start "rule__ChoiceBranchL__Group_0__0__Impl"
    // InternalMyDsl.g:4081:1: rule__ChoiceBranchL__Group_0__0__Impl : ( () ) ;
    public final void rule__ChoiceBranchL__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4085:1: ( ( () ) )
            // InternalMyDsl.g:4086:1: ( () )
            {
            // InternalMyDsl.g:4086:1: ( () )
            // InternalMyDsl.g:4087:2: ()
            {
             before(grammarAccess.getChoiceBranchLAccess().getChoiceBranchLAction_0_0()); 
            // InternalMyDsl.g:4088:2: ()
            // InternalMyDsl.g:4088:3: 
            {
            }

             after(grammarAccess.getChoiceBranchLAccess().getChoiceBranchLAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group_0__0__Impl"


    // $ANTLR start "rule__ChoiceBranchL__Group_0__1"
    // InternalMyDsl.g:4096:1: rule__ChoiceBranchL__Group_0__1 : rule__ChoiceBranchL__Group_0__1__Impl ;
    public final void rule__ChoiceBranchL__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4100:1: ( rule__ChoiceBranchL__Group_0__1__Impl )
            // InternalMyDsl.g:4101:2: rule__ChoiceBranchL__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group_0__1"


    // $ANTLR start "rule__ChoiceBranchL__Group_0__1__Impl"
    // InternalMyDsl.g:4107:1: rule__ChoiceBranchL__Group_0__1__Impl : ( 'End' ) ;
    public final void rule__ChoiceBranchL__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4111:1: ( ( 'End' ) )
            // InternalMyDsl.g:4112:1: ( 'End' )
            {
            // InternalMyDsl.g:4112:1: ( 'End' )
            // InternalMyDsl.g:4113:2: 'End'
            {
             before(grammarAccess.getChoiceBranchLAccess().getEndKeyword_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChoiceBranchLAccess().getEndKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group_0__1__Impl"


    // $ANTLR start "rule__ChoiceBranchL__Group_1__0"
    // InternalMyDsl.g:4123:1: rule__ChoiceBranchL__Group_1__0 : rule__ChoiceBranchL__Group_1__0__Impl rule__ChoiceBranchL__Group_1__1 ;
    public final void rule__ChoiceBranchL__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4127:1: ( rule__ChoiceBranchL__Group_1__0__Impl rule__ChoiceBranchL__Group_1__1 )
            // InternalMyDsl.g:4128:2: rule__ChoiceBranchL__Group_1__0__Impl rule__ChoiceBranchL__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__ChoiceBranchL__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group_1__0"


    // $ANTLR start "rule__ChoiceBranchL__Group_1__0__Impl"
    // InternalMyDsl.g:4135:1: rule__ChoiceBranchL__Group_1__0__Impl : ( ( rule__ChoiceBranchL__MessageAssignment_1_0 ) ) ;
    public final void rule__ChoiceBranchL__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4139:1: ( ( ( rule__ChoiceBranchL__MessageAssignment_1_0 ) ) )
            // InternalMyDsl.g:4140:1: ( ( rule__ChoiceBranchL__MessageAssignment_1_0 ) )
            {
            // InternalMyDsl.g:4140:1: ( ( rule__ChoiceBranchL__MessageAssignment_1_0 ) )
            // InternalMyDsl.g:4141:2: ( rule__ChoiceBranchL__MessageAssignment_1_0 )
            {
             before(grammarAccess.getChoiceBranchLAccess().getMessageAssignment_1_0()); 
            // InternalMyDsl.g:4142:2: ( rule__ChoiceBranchL__MessageAssignment_1_0 )
            // InternalMyDsl.g:4142:3: rule__ChoiceBranchL__MessageAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__MessageAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceBranchLAccess().getMessageAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group_1__0__Impl"


    // $ANTLR start "rule__ChoiceBranchL__Group_1__1"
    // InternalMyDsl.g:4150:1: rule__ChoiceBranchL__Group_1__1 : rule__ChoiceBranchL__Group_1__1__Impl ;
    public final void rule__ChoiceBranchL__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4154:1: ( rule__ChoiceBranchL__Group_1__1__Impl )
            // InternalMyDsl.g:4155:2: rule__ChoiceBranchL__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group_1__1"


    // $ANTLR start "rule__ChoiceBranchL__Group_1__1__Impl"
    // InternalMyDsl.g:4161:1: rule__ChoiceBranchL__Group_1__1__Impl : ( ( rule__ChoiceBranchL__ProtocolAssignment_1_1 ) ) ;
    public final void rule__ChoiceBranchL__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4165:1: ( ( ( rule__ChoiceBranchL__ProtocolAssignment_1_1 ) ) )
            // InternalMyDsl.g:4166:1: ( ( rule__ChoiceBranchL__ProtocolAssignment_1_1 ) )
            {
            // InternalMyDsl.g:4166:1: ( ( rule__ChoiceBranchL__ProtocolAssignment_1_1 ) )
            // InternalMyDsl.g:4167:2: ( rule__ChoiceBranchL__ProtocolAssignment_1_1 )
            {
             before(grammarAccess.getChoiceBranchLAccess().getProtocolAssignment_1_1()); 
            // InternalMyDsl.g:4168:2: ( rule__ChoiceBranchL__ProtocolAssignment_1_1 )
            // InternalMyDsl.g:4168:3: rule__ChoiceBranchL__ProtocolAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__ProtocolAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceBranchLAccess().getProtocolAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group_1__1__Impl"


    // $ANTLR start "rule__ForEachL__Group__0"
    // InternalMyDsl.g:4177:1: rule__ForEachL__Group__0 : rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 ;
    public final void rule__ForEachL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 )
            // InternalMyDsl.g:4182:2: rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1
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
    // InternalMyDsl.g:4189:1: rule__ForEachL__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEachL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4193:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:4194:1: ( 'foreach' )
            {
            // InternalMyDsl.g:4194:1: ( 'foreach' )
            // InternalMyDsl.g:4195:2: 'foreach'
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
    // InternalMyDsl.g:4204:1: rule__ForEachL__Group__1 : rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 ;
    public final void rule__ForEachL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4208:1: ( rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 )
            // InternalMyDsl.g:4209:2: rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2
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
    // InternalMyDsl.g:4216:1: rule__ForEachL__Group__1__Impl : ( ( rule__ForEachL__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEachL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4220:1: ( ( ( rule__ForEachL__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:4221:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:4221:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:4222:2: ( rule__ForEachL__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachLAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:4223:2: ( rule__ForEachL__EachRoleAssignment_1 )
            // InternalMyDsl.g:4223:3: rule__ForEachL__EachRoleAssignment_1
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
    // InternalMyDsl.g:4231:1: rule__ForEachL__Group__2 : rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 ;
    public final void rule__ForEachL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4235:1: ( rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 )
            // InternalMyDsl.g:4236:2: rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3
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
    // InternalMyDsl.g:4243:1: rule__ForEachL__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEachL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4247:1: ( ( ':' ) )
            // InternalMyDsl.g:4248:1: ( ':' )
            {
            // InternalMyDsl.g:4248:1: ( ':' )
            // InternalMyDsl.g:4249:2: ':'
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
    // InternalMyDsl.g:4258:1: rule__ForEachL__Group__3 : rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 ;
    public final void rule__ForEachL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4262:1: ( rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 )
            // InternalMyDsl.g:4263:2: rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4
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
    // InternalMyDsl.g:4270:1: rule__ForEachL__Group__3__Impl : ( '<' ) ;
    public final void rule__ForEachL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4274:1: ( ( '<' ) )
            // InternalMyDsl.g:4275:1: ( '<' )
            {
            // InternalMyDsl.g:4275:1: ( '<' )
            // InternalMyDsl.g:4276:2: '<'
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
    // InternalMyDsl.g:4285:1: rule__ForEachL__Group__4 : rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 ;
    public final void rule__ForEachL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4289:1: ( rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 )
            // InternalMyDsl.g:4290:2: rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5
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
    // InternalMyDsl.g:4297:1: rule__ForEachL__Group__4__Impl : ( ( rule__ForEachL__RolesetAssignment_4 ) ) ;
    public final void rule__ForEachL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4301:1: ( ( ( rule__ForEachL__RolesetAssignment_4 ) ) )
            // InternalMyDsl.g:4302:1: ( ( rule__ForEachL__RolesetAssignment_4 ) )
            {
            // InternalMyDsl.g:4302:1: ( ( rule__ForEachL__RolesetAssignment_4 ) )
            // InternalMyDsl.g:4303:2: ( rule__ForEachL__RolesetAssignment_4 )
            {
             before(grammarAccess.getForEachLAccess().getRolesetAssignment_4()); 
            // InternalMyDsl.g:4304:2: ( rule__ForEachL__RolesetAssignment_4 )
            // InternalMyDsl.g:4304:3: rule__ForEachL__RolesetAssignment_4
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
    // InternalMyDsl.g:4312:1: rule__ForEachL__Group__5 : rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 ;
    public final void rule__ForEachL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4316:1: ( rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 )
            // InternalMyDsl.g:4317:2: rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6
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
    // InternalMyDsl.g:4324:1: rule__ForEachL__Group__5__Impl : ( ',' ) ;
    public final void rule__ForEachL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4328:1: ( ( ',' ) )
            // InternalMyDsl.g:4329:1: ( ',' )
            {
            // InternalMyDsl.g:4329:1: ( ',' )
            // InternalMyDsl.g:4330:2: ','
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
    // InternalMyDsl.g:4339:1: rule__ForEachL__Group__6 : rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7 ;
    public final void rule__ForEachL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4343:1: ( rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7 )
            // InternalMyDsl.g:4344:2: rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7
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
    // InternalMyDsl.g:4351:1: rule__ForEachL__Group__6__Impl : ( ( rule__ForEachL__RefroleAssignment_6 ) ) ;
    public final void rule__ForEachL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4355:1: ( ( ( rule__ForEachL__RefroleAssignment_6 ) ) )
            // InternalMyDsl.g:4356:1: ( ( rule__ForEachL__RefroleAssignment_6 ) )
            {
            // InternalMyDsl.g:4356:1: ( ( rule__ForEachL__RefroleAssignment_6 ) )
            // InternalMyDsl.g:4357:2: ( rule__ForEachL__RefroleAssignment_6 )
            {
             before(grammarAccess.getForEachLAccess().getRefroleAssignment_6()); 
            // InternalMyDsl.g:4358:2: ( rule__ForEachL__RefroleAssignment_6 )
            // InternalMyDsl.g:4358:3: rule__ForEachL__RefroleAssignment_6
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
    // InternalMyDsl.g:4366:1: rule__ForEachL__Group__7 : rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8 ;
    public final void rule__ForEachL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4370:1: ( rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8 )
            // InternalMyDsl.g:4371:2: rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8
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
    // InternalMyDsl.g:4378:1: rule__ForEachL__Group__7__Impl : ( '>' ) ;
    public final void rule__ForEachL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4382:1: ( ( '>' ) )
            // InternalMyDsl.g:4383:1: ( '>' )
            {
            // InternalMyDsl.g:4383:1: ( '>' )
            // InternalMyDsl.g:4384:2: '>'
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
    // InternalMyDsl.g:4393:1: rule__ForEachL__Group__8 : rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9 ;
    public final void rule__ForEachL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4397:1: ( rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9 )
            // InternalMyDsl.g:4398:2: rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9
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
    // InternalMyDsl.g:4405:1: rule__ForEachL__Group__8__Impl : ( '{' ) ;
    public final void rule__ForEachL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4409:1: ( ( '{' ) )
            // InternalMyDsl.g:4410:1: ( '{' )
            {
            // InternalMyDsl.g:4410:1: ( '{' )
            // InternalMyDsl.g:4411:2: '{'
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
    // InternalMyDsl.g:4420:1: rule__ForEachL__Group__9 : rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10 ;
    public final void rule__ForEachL__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4424:1: ( rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10 )
            // InternalMyDsl.g:4425:2: rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10
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
    // InternalMyDsl.g:4432:1: rule__ForEachL__Group__9__Impl : ( ( rule__ForEachL__BranchAssignment_9 ) ) ;
    public final void rule__ForEachL__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4436:1: ( ( ( rule__ForEachL__BranchAssignment_9 ) ) )
            // InternalMyDsl.g:4437:1: ( ( rule__ForEachL__BranchAssignment_9 ) )
            {
            // InternalMyDsl.g:4437:1: ( ( rule__ForEachL__BranchAssignment_9 ) )
            // InternalMyDsl.g:4438:2: ( rule__ForEachL__BranchAssignment_9 )
            {
             before(grammarAccess.getForEachLAccess().getBranchAssignment_9()); 
            // InternalMyDsl.g:4439:2: ( rule__ForEachL__BranchAssignment_9 )
            // InternalMyDsl.g:4439:3: rule__ForEachL__BranchAssignment_9
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
    // InternalMyDsl.g:4447:1: rule__ForEachL__Group__10 : rule__ForEachL__Group__10__Impl ;
    public final void rule__ForEachL__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4451:1: ( rule__ForEachL__Group__10__Impl )
            // InternalMyDsl.g:4452:2: rule__ForEachL__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__10__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:4458:1: rule__ForEachL__Group__10__Impl : ( '}' ) ;
    public final void rule__ForEachL__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4462:1: ( ( '}' ) )
            // InternalMyDsl.g:4463:1: ( '}' )
            {
            // InternalMyDsl.g:4463:1: ( '}' )
            // InternalMyDsl.g:4464:2: '}'
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


    // $ANTLR start "rule__Model__ProtocolAssignment_0"
    // InternalMyDsl.g:4474:1: rule__Model__ProtocolAssignment_0 : ( ruleGlobalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4478:1: ( ( ruleGlobalProtocol ) )
            // InternalMyDsl.g:4479:2: ( ruleGlobalProtocol )
            {
            // InternalMyDsl.g:4479:2: ( ruleGlobalProtocol )
            // InternalMyDsl.g:4480:3: ruleGlobalProtocol
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
    // InternalMyDsl.g:4489:1: rule__Model__ProtocolAssignment_1 : ( ruleLocalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4493:1: ( ( ruleLocalProtocol ) )
            // InternalMyDsl.g:4494:2: ( ruleLocalProtocol )
            {
            // InternalMyDsl.g:4494:2: ( ruleLocalProtocol )
            // InternalMyDsl.g:4495:3: ruleLocalProtocol
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
    // InternalMyDsl.g:4504:1: rule__GlobalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4508:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4509:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4509:2: ( RULE_ID )
            // InternalMyDsl.g:4510:3: RULE_ID
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
    // InternalMyDsl.g:4519:1: rule__GlobalProtocol__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__GlobalProtocol__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4523:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:4524:2: ( ruleRoles )
            {
            // InternalMyDsl.g:4524:2: ( ruleRoles )
            // InternalMyDsl.g:4525:3: ruleRoles
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
    // InternalMyDsl.g:4534:1: rule__GlobalProtocol__ProtocolAssignment_6 : ( ruleProtocol ) ;
    public final void rule__GlobalProtocol__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4538:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4539:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4539:2: ( ruleProtocol )
            // InternalMyDsl.g:4540:3: ruleProtocol
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
    // InternalMyDsl.g:4549:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4553:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4554:2: ( ruleRole )
            {
            // InternalMyDsl.g:4554:2: ( ruleRole )
            // InternalMyDsl.g:4555:3: ruleRole
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
    // InternalMyDsl.g:4564:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4568:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4569:2: ( ruleRole )
            {
            // InternalMyDsl.g:4569:2: ( ruleRole )
            // InternalMyDsl.g:4570:3: ruleRole
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
    // InternalMyDsl.g:4579:1: rule__RoleOne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4583:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4584:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4584:2: ( RULE_ID )
            // InternalMyDsl.g:4585:3: RULE_ID
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
    // InternalMyDsl.g:4594:1: rule__RoleSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4598:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4599:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4599:2: ( RULE_ID )
            // InternalMyDsl.g:4600:3: RULE_ID
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
    // InternalMyDsl.g:4609:1: rule__RoleSet__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RoleSet__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4613:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4614:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4614:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4615:3: ( RULE_ID )
            {
             before(grammarAccess.getRoleSetAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4616:3: ( RULE_ID )
            // InternalMyDsl.g:4617:4: RULE_ID
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


    // $ANTLR start "rule__Protocol__BeginAssignment_1"
    // InternalMyDsl.g:4628:1: rule__Protocol__BeginAssignment_1 : ( ( rule__Protocol__BeginAlternatives_1_0 ) ) ;
    public final void rule__Protocol__BeginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4632:1: ( ( ( rule__Protocol__BeginAlternatives_1_0 ) ) )
            // InternalMyDsl.g:4633:2: ( ( rule__Protocol__BeginAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:4633:2: ( ( rule__Protocol__BeginAlternatives_1_0 ) )
            // InternalMyDsl.g:4634:3: ( rule__Protocol__BeginAlternatives_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getBeginAlternatives_1_0()); 
            // InternalMyDsl.g:4635:3: ( rule__Protocol__BeginAlternatives_1_0 )
            // InternalMyDsl.g:4635:4: rule__Protocol__BeginAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__BeginAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getBeginAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__BeginAssignment_1"


    // $ANTLR start "rule__EndProtocol__EndAssignment"
    // InternalMyDsl.g:4643:1: rule__EndProtocol__EndAssignment : ( ( 'End' ) ) ;
    public final void rule__EndProtocol__EndAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4647:1: ( ( ( 'End' ) ) )
            // InternalMyDsl.g:4648:2: ( ( 'End' ) )
            {
            // InternalMyDsl.g:4648:2: ( ( 'End' ) )
            // InternalMyDsl.g:4649:3: ( 'End' )
            {
             before(grammarAccess.getEndProtocolAccess().getEndEndKeyword_0()); 
            // InternalMyDsl.g:4650:3: ( 'End' )
            // InternalMyDsl.g:4651:4: 'End'
            {
             before(grammarAccess.getEndProtocolAccess().getEndEndKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:4662:1: rule__Recursion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4666:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4667:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4667:2: ( RULE_ID )
            // InternalMyDsl.g:4668:3: RULE_ID
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
    // InternalMyDsl.g:4677:1: rule__Recursion__RecProtocolAssignment_4 : ( ruleProtocol ) ;
    public final void rule__Recursion__RecProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4681:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4682:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4682:2: ( ruleProtocol )
            // InternalMyDsl.g:4683:3: ruleProtocol
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
    // InternalMyDsl.g:4692:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4696:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4697:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4697:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4698:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalMyDsl.g:4699:3: ( RULE_ID )
            // InternalMyDsl.g:4700:4: RULE_ID
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
    // InternalMyDsl.g:4711:1: rule__ForEach__LoopRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEach__LoopRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4715:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:4716:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:4716:2: ( ruleRoleOne )
            // InternalMyDsl.g:4717:3: ruleRoleOne
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
    // InternalMyDsl.g:4726:1: rule__ForEach__RolesetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RolesetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4730:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4731:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4731:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4732:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRolesetRoleSetCrossReference_4_0()); 
            // InternalMyDsl.g:4733:3: ( RULE_ID )
            // InternalMyDsl.g:4734:4: RULE_ID
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
    // InternalMyDsl.g:4745:1: rule__ForEach__RefRoleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RefRoleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4749:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4750:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4750:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4751:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_6_0()); 
            // InternalMyDsl.g:4752:3: ( RULE_ID )
            // InternalMyDsl.g:4753:4: RULE_ID
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
    // InternalMyDsl.g:4764:1: rule__ForEach__ForBodyAssignment_9 : ( ruleProtocol ) ;
    public final void rule__ForEach__ForBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4768:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4769:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4769:2: ( ruleProtocol )
            // InternalMyDsl.g:4770:3: ruleProtocol
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
    // InternalMyDsl.g:4779:1: rule__ForEach__ProtocolAssignment_12 : ( ruleProtocol ) ;
    public final void rule__ForEach__ProtocolAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4783:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4784:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4784:2: ( ruleProtocol )
            // InternalMyDsl.g:4785:3: ruleProtocol
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
    // InternalMyDsl.g:4794:1: rule__Choice__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4798:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4799:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4799:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4800:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 
            // InternalMyDsl.g:4801:3: ( RULE_ID )
            // InternalMyDsl.g:4802:4: RULE_ID
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
    // InternalMyDsl.g:4813:1: rule__Choice__BranchesAssignment_4 : ( ruleMessage ) ;
    public final void rule__Choice__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4817:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4818:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4818:2: ( ruleMessage )
            // InternalMyDsl.g:4819:3: ruleMessage
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
    // InternalMyDsl.g:4828:1: rule__Choice__BranchesAssignment_6_2 : ( ruleMessage ) ;
    public final void rule__Choice__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4832:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4833:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4833:2: ( ruleMessage )
            // InternalMyDsl.g:4834:3: ruleMessage
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


    // $ANTLR start "rule__MessageBase__MessageTypeAssignment_0"
    // InternalMyDsl.g:4843:1: rule__MessageBase__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageBase__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4847:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4848:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4848:2: ( RULE_ID )
            // InternalMyDsl.g:4849:3: RULE_ID
            {
             before(grammarAccess.getMessageBaseAccess().getMessageTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageBaseAccess().getMessageTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__MessageTypeAssignment_0"


    // $ANTLR start "rule__MessageBase__PayloadAssignment_1_0_1"
    // InternalMyDsl.g:4858:1: rule__MessageBase__PayloadAssignment_1_0_1 : ( rulePayload ) ;
    public final void rule__MessageBase__PayloadAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4862:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4863:2: ( rulePayload )
            {
            // InternalMyDsl.g:4863:2: ( rulePayload )
            // InternalMyDsl.g:4864:3: rulePayload
            {
             before(grammarAccess.getMessageBaseAccess().getPayloadPayloadParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePayload();

            state._fsp--;

             after(grammarAccess.getMessageBaseAccess().getPayloadPayloadParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__PayloadAssignment_1_0_1"


    // $ANTLR start "rule__MessageBase__SenderAssignment_3"
    // InternalMyDsl.g:4873:1: rule__MessageBase__SenderAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MessageBase__SenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4877:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4878:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4878:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4879:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageBaseAccess().getSenderRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4880:3: ( RULE_ID )
            // InternalMyDsl.g:4881:4: RULE_ID
            {
             before(grammarAccess.getMessageBaseAccess().getSenderRoleOneIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageBaseAccess().getSenderRoleOneIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMessageBaseAccess().getSenderRoleOneCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__SenderAssignment_3"


    // $ANTLR start "rule__MessageBase__ReceiverAssignment_5"
    // InternalMyDsl.g:4892:1: rule__MessageBase__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__MessageBase__ReceiverAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4896:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4897:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4897:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4898:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageBaseAccess().getReceiverRoleCrossReference_5_0()); 
            // InternalMyDsl.g:4899:3: ( RULE_ID )
            // InternalMyDsl.g:4900:4: RULE_ID
            {
             before(grammarAccess.getMessageBaseAccess().getReceiverRoleIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageBaseAccess().getReceiverRoleIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMessageBaseAccess().getReceiverRoleCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__ReceiverAssignment_5"


    // $ANTLR start "rule__MessageBase__ProtocolAssignment_7"
    // InternalMyDsl.g:4911:1: rule__MessageBase__ProtocolAssignment_7 : ( ruleProtocol ) ;
    public final void rule__MessageBase__ProtocolAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4915:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4916:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4916:2: ( ruleProtocol )
            // InternalMyDsl.g:4917:3: ruleProtocol
            {
             before(grammarAccess.getMessageBaseAccess().getProtocolProtocolParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getMessageBaseAccess().getProtocolProtocolParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageBase__ProtocolAssignment_7"


    // $ANTLR start "rule__MessageQuit__MessageTypeAssignment_0"
    // InternalMyDsl.g:4926:1: rule__MessageQuit__MessageTypeAssignment_0 : ( ( 'QUIT' ) ) ;
    public final void rule__MessageQuit__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4930:1: ( ( ( 'QUIT' ) ) )
            // InternalMyDsl.g:4931:2: ( ( 'QUIT' ) )
            {
            // InternalMyDsl.g:4931:2: ( ( 'QUIT' ) )
            // InternalMyDsl.g:4932:3: ( 'QUIT' )
            {
             before(grammarAccess.getMessageQuitAccess().getMessageTypeQUITKeyword_0_0()); 
            // InternalMyDsl.g:4933:3: ( 'QUIT' )
            // InternalMyDsl.g:4934:4: 'QUIT'
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
    // InternalMyDsl.g:4945:1: rule__MessageQuit__SenderAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MessageQuit__SenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4949:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4950:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4950:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4951:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageQuitAccess().getSenderRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4952:3: ( RULE_ID )
            // InternalMyDsl.g:4953:4: RULE_ID
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
    // InternalMyDsl.g:4964:1: rule__MessageQuit__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__MessageQuit__ReceiverAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4968:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4969:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4969:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4970:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageQuitAccess().getReceiverRoleCrossReference_5_0()); 
            // InternalMyDsl.g:4971:3: ( RULE_ID )
            // InternalMyDsl.g:4972:4: RULE_ID
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
    // InternalMyDsl.g:4983:1: rule__Payload__TypesAssignment_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4987:1: ( ( ruleType ) )
            // InternalMyDsl.g:4988:2: ( ruleType )
            {
            // InternalMyDsl.g:4988:2: ( ruleType )
            // InternalMyDsl.g:4989:3: ruleType
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
    // InternalMyDsl.g:4998:1: rule__Payload__TypesAssignment_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5002:1: ( ( ruleType ) )
            // InternalMyDsl.g:5003:2: ( ruleType )
            {
            // InternalMyDsl.g:5003:2: ( ruleType )
            // InternalMyDsl.g:5004:3: ruleType
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
    // InternalMyDsl.g:5013:1: rule__LocalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5017:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5018:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5018:2: ( RULE_ID )
            // InternalMyDsl.g:5019:3: RULE_ID
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
    // InternalMyDsl.g:5028:1: rule__LocalProtocol__ProjectedRoleAssignment_4 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProjectedRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5032:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5033:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5033:2: ( RULE_ID )
            // InternalMyDsl.g:5034:3: RULE_ID
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getProjectedRoleIDTerminalRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:5043:1: rule__LocalProtocol__RolesAssignment_6 : ( ruleRoles ) ;
    public final void rule__LocalProtocol__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5047:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:5048:2: ( ruleRoles )
            {
            // InternalMyDsl.g:5048:2: ( ruleRoles )
            // InternalMyDsl.g:5049:3: ruleRoles
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


    // $ANTLR start "rule__LocalProtocol__ProtocolAssignment_9"
    // InternalMyDsl.g:5058:1: rule__LocalProtocol__ProtocolAssignment_9 : ( ruleProtocolL ) ;
    public final void rule__LocalProtocol__ProtocolAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5062:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5063:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5063:2: ( ruleProtocolL )
            // InternalMyDsl.g:5064:3: ruleProtocolL
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__ProtocolAssignment_9"


    // $ANTLR start "rule__ProtocolL__ActionsAssignment_1"
    // InternalMyDsl.g:5073:1: rule__ProtocolL__ActionsAssignment_1 : ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) ) ;
    public final void rule__ProtocolL__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5077:1: ( ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) ) )
            // InternalMyDsl.g:5078:2: ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:5078:2: ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) )
            // InternalMyDsl.g:5079:3: ( rule__ProtocolL__ActionsAlternatives_1_0 )
            {
             before(grammarAccess.getProtocolLAccess().getActionsAlternatives_1_0()); 
            // InternalMyDsl.g:5080:3: ( rule__ProtocolL__ActionsAlternatives_1_0 )
            // InternalMyDsl.g:5080:4: rule__ProtocolL__ActionsAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolL__ActionsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolLAccess().getActionsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__ActionsAssignment_1"


    // $ANTLR start "rule__RecursionL__NameAssignment_1"
    // InternalMyDsl.g:5088:1: rule__RecursionL__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RecursionL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5092:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5093:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5093:2: ( RULE_ID )
            // InternalMyDsl.g:5094:3: RULE_ID
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
    // InternalMyDsl.g:5103:1: rule__RecursionL__RecProtocolAssignment_4 : ( ruleProtocolL ) ;
    public final void rule__RecursionL__RecProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5107:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5108:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5108:2: ( ruleProtocolL )
            // InternalMyDsl.g:5109:3: ruleProtocolL
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


    // $ANTLR start "rule__MessageL__MessageTypeAssignment_0"
    // InternalMyDsl.g:5118:1: rule__MessageL__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5122:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5123:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5123:2: ( RULE_ID )
            // InternalMyDsl.g:5124:3: RULE_ID
            {
             before(grammarAccess.getMessageLAccess().getMessageTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageLAccess().getMessageTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__MessageTypeAssignment_0"


    // $ANTLR start "rule__MessageL__PayloadAssignment_2"
    // InternalMyDsl.g:5133:1: rule__MessageL__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__MessageL__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5137:1: ( ( rulePayload ) )
            // InternalMyDsl.g:5138:2: ( rulePayload )
            {
            // InternalMyDsl.g:5138:2: ( rulePayload )
            // InternalMyDsl.g:5139:3: rulePayload
            {
             before(grammarAccess.getMessageLAccess().getPayloadPayloadParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePayload();

            state._fsp--;

             after(grammarAccess.getMessageLAccess().getPayloadPayloadParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__PayloadAssignment_2"


    // $ANTLR start "rule__MessageL__SendReceiveAssignment_4"
    // InternalMyDsl.g:5148:1: rule__MessageL__SendReceiveAssignment_4 : ( ruleMessageType ) ;
    public final void rule__MessageL__SendReceiveAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5152:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:5153:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:5153:2: ( ruleMessageType )
            // InternalMyDsl.g:5154:3: ruleMessageType
            {
             before(grammarAccess.getMessageLAccess().getSendReceiveMessageTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageLAccess().getSendReceiveMessageTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__SendReceiveAssignment_4"


    // $ANTLR start "rule__SenderL__RoleAssignment_1"
    // InternalMyDsl.g:5163:1: rule__SenderL__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SenderL__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5167:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5168:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5168:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5169:3: ( RULE_ID )
            {
             before(grammarAccess.getSenderLAccess().getRoleRoleCrossReference_1_0()); 
            // InternalMyDsl.g:5170:3: ( RULE_ID )
            // InternalMyDsl.g:5171:4: RULE_ID
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
    // InternalMyDsl.g:5182:1: rule__ReceiverL__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReceiverL__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5186:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5187:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5187:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5188:3: ( RULE_ID )
            {
             before(grammarAccess.getReceiverLAccess().getRoleRoleCrossReference_1_0()); 
            // InternalMyDsl.g:5189:3: ( RULE_ID )
            // InternalMyDsl.g:5190:4: RULE_ID
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
    // InternalMyDsl.g:5201:1: rule__ChoiceL__RoleMakingChoiceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChoiceL__RoleMakingChoiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5205:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5206:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5206:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5207:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleCrossReference_2_0()); 
            // InternalMyDsl.g:5208:3: ( RULE_ID )
            // InternalMyDsl.g:5209:4: RULE_ID
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
    // InternalMyDsl.g:5220:1: rule__ChoiceL__BranchesAssignment_4 : ( ruleChoiceBranchL ) ;
    public final void rule__ChoiceL__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5224:1: ( ( ruleChoiceBranchL ) )
            // InternalMyDsl.g:5225:2: ( ruleChoiceBranchL )
            {
            // InternalMyDsl.g:5225:2: ( ruleChoiceBranchL )
            // InternalMyDsl.g:5226:3: ruleChoiceBranchL
            {
             before(grammarAccess.getChoiceLAccess().getBranchesChoiceBranchLParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleChoiceBranchL();

            state._fsp--;

             after(grammarAccess.getChoiceLAccess().getBranchesChoiceBranchLParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:5235:1: rule__ChoiceL__BranchesAssignment_6_2 : ( ruleChoiceBranchL ) ;
    public final void rule__ChoiceL__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5239:1: ( ( ruleChoiceBranchL ) )
            // InternalMyDsl.g:5240:2: ( ruleChoiceBranchL )
            {
            // InternalMyDsl.g:5240:2: ( ruleChoiceBranchL )
            // InternalMyDsl.g:5241:3: ruleChoiceBranchL
            {
             before(grammarAccess.getChoiceLAccess().getBranchesChoiceBranchLParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChoiceBranchL();

            state._fsp--;

             after(grammarAccess.getChoiceLAccess().getBranchesChoiceBranchLParserRuleCall_6_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ChoiceBranchL__MessageAssignment_1_0"
    // InternalMyDsl.g:5250:1: rule__ChoiceBranchL__MessageAssignment_1_0 : ( ruleMessageL ) ;
    public final void rule__ChoiceBranchL__MessageAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5254:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:5255:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:5255:2: ( ruleMessageL )
            // InternalMyDsl.g:5256:3: ruleMessageL
            {
             before(grammarAccess.getChoiceBranchLAccess().getMessageMessageLParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageL();

            state._fsp--;

             after(grammarAccess.getChoiceBranchLAccess().getMessageMessageLParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__MessageAssignment_1_0"


    // $ANTLR start "rule__ChoiceBranchL__ProtocolAssignment_1_1"
    // InternalMyDsl.g:5265:1: rule__ChoiceBranchL__ProtocolAssignment_1_1 : ( ruleProtocolL ) ;
    public final void rule__ChoiceBranchL__ProtocolAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5269:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5270:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5270:2: ( ruleProtocolL )
            // InternalMyDsl.g:5271:3: ruleProtocolL
            {
             before(grammarAccess.getChoiceBranchLAccess().getProtocolProtocolLParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getChoiceBranchLAccess().getProtocolProtocolLParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__ProtocolAssignment_1_1"


    // $ANTLR start "rule__ForEachL__EachRoleAssignment_1"
    // InternalMyDsl.g:5280:1: rule__ForEachL__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEachL__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5284:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:5285:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:5285:2: ( ruleRoleOne )
            // InternalMyDsl.g:5286:3: ruleRoleOne
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
    // InternalMyDsl.g:5295:1: rule__ForEachL__RolesetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RolesetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5299:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5300:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5300:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5301:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRolesetRoleSetCrossReference_4_0()); 
            // InternalMyDsl.g:5302:3: ( RULE_ID )
            // InternalMyDsl.g:5303:4: RULE_ID
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
    // InternalMyDsl.g:5314:1: rule__ForEachL__RefroleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RefroleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5318:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5319:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5319:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5320:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRefroleRoleOneCrossReference_6_0()); 
            // InternalMyDsl.g:5321:3: ( RULE_ID )
            // InternalMyDsl.g:5322:4: RULE_ID
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
    // InternalMyDsl.g:5333:1: rule__ForEachL__BranchAssignment_9 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__BranchAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5337:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5338:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5338:2: ( ruleProtocolL )
            // InternalMyDsl.g:5339:3: ruleProtocolL
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000002808D000010L});
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
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018085000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010085000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});

}