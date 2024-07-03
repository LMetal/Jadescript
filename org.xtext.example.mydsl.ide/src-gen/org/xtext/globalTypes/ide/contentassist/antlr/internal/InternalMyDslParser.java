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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'action'", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'roleset'", "':'", "'rec'", "'{'", "'loop'", "'for'", "'<'", "'>'", "';'", "'choice'", "'at'", "'or'", "')'", "'from'", "'to'", "'.'", "'local'", "'End'", "'foreach'"
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
    // InternalMyDsl.g:212:1: ruleProtocol : ( ( rule__Protocol__Alternatives ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Protocol__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Protocol__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Protocol__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__Protocol__Alternatives )
            {
             before(grammarAccess.getProtocolAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__Protocol__Alternatives )
            // InternalMyDsl.g:219:4: rule__Protocol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleRecursion"
    // InternalMyDsl.g:228:1: entryRuleRecursion : ruleRecursion EOF ;
    public final void entryRuleRecursion() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRecursion EOF )
            // InternalMyDsl.g:230:1: ruleRecursion EOF
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
    // InternalMyDsl.g:237:1: ruleRecursion : ( ( rule__Recursion__Group__0 ) ) ;
    public final void ruleRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Recursion__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Recursion__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Recursion__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Recursion__Group__0 )
            {
             before(grammarAccess.getRecursionAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Recursion__Group__0 )
            // InternalMyDsl.g:244:4: rule__Recursion__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleCloseRecursion : ruleCloseRecursion EOF ;
    public final void entryRuleCloseRecursion() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleCloseRecursion EOF )
            // InternalMyDsl.g:255:1: ruleCloseRecursion EOF
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
    // InternalMyDsl.g:262:1: ruleCloseRecursion : ( ( rule__CloseRecursion__Group__0 ) ) ;
    public final void ruleCloseRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__CloseRecursion__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__CloseRecursion__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__CloseRecursion__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__CloseRecursion__Group__0 )
            {
             before(grammarAccess.getCloseRecursionAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__CloseRecursion__Group__0 )
            // InternalMyDsl.g:269:4: rule__CloseRecursion__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleForEach : ruleForEach EOF ;
    public final void entryRuleForEach() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleForEach EOF )
            // InternalMyDsl.g:280:1: ruleForEach EOF
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
    // InternalMyDsl.g:287:1: ruleForEach : ( ( rule__ForEach__Group__0 ) ) ;
    public final void ruleForEach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ForEach__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ForEach__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ForEach__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__ForEach__Group__0 )
            {
             before(grammarAccess.getForEachAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__ForEach__Group__0 )
            // InternalMyDsl.g:294:4: rule__ForEach__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleChoice EOF )
            // InternalMyDsl.g:305:1: ruleChoice EOF
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
    // InternalMyDsl.g:312:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Choice__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Choice__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Choice__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Choice__Group__0 )
            // InternalMyDsl.g:319:4: rule__Choice__Group__0
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


    // $ANTLR start "entryRuleChoiceBranch"
    // InternalMyDsl.g:328:1: entryRuleChoiceBranch : ruleChoiceBranch EOF ;
    public final void entryRuleChoiceBranch() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleChoiceBranch EOF )
            // InternalMyDsl.g:330:1: ruleChoiceBranch EOF
            {
             before(grammarAccess.getChoiceBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleChoiceBranch();

            state._fsp--;

             after(grammarAccess.getChoiceBranchRule()); 
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
    // $ANTLR end "entryRuleChoiceBranch"


    // $ANTLR start "ruleChoiceBranch"
    // InternalMyDsl.g:337:1: ruleChoiceBranch : ( ( rule__ChoiceBranch__Group__0 ) ) ;
    public final void ruleChoiceBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ChoiceBranch__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ChoiceBranch__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ChoiceBranch__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ChoiceBranch__Group__0 )
            {
             before(grammarAccess.getChoiceBranchAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ChoiceBranch__Group__0 )
            // InternalMyDsl.g:344:4: rule__ChoiceBranch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceBranchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoiceBranch"


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
    // InternalMyDsl.g:362:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Message__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Message__Group__0 )
            // InternalMyDsl.g:369:4: rule__Message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePayload"
    // InternalMyDsl.g:378:1: entryRulePayload : rulePayload EOF ;
    public final void entryRulePayload() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( rulePayload EOF )
            // InternalMyDsl.g:380:1: rulePayload EOF
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
    // InternalMyDsl.g:387:1: rulePayload : ( ( rule__Payload__Alternatives ) ) ;
    public final void rulePayload() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Payload__Alternatives ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Payload__Alternatives ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Payload__Alternatives ) )
            // InternalMyDsl.g:393:3: ( rule__Payload__Alternatives )
            {
             before(grammarAccess.getPayloadAccess().getAlternatives()); 
            // InternalMyDsl.g:394:3: ( rule__Payload__Alternatives )
            // InternalMyDsl.g:394:4: rule__Payload__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMyDsl.g:403:1: entryRuleLocalProtocol : ruleLocalProtocol EOF ;
    public final void entryRuleLocalProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleLocalProtocol EOF )
            // InternalMyDsl.g:405:1: ruleLocalProtocol EOF
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
    // InternalMyDsl.g:412:1: ruleLocalProtocol : ( ( rule__LocalProtocol__Group__0 ) ) ;
    public final void ruleLocalProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__LocalProtocol__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__LocalProtocol__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__LocalProtocol__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__LocalProtocol__Group__0 )
            {
             before(grammarAccess.getLocalProtocolAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__LocalProtocol__Group__0 )
            // InternalMyDsl.g:419:4: rule__LocalProtocol__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleProtocolL : ruleProtocolL EOF ;
    public final void entryRuleProtocolL() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleProtocolL EOF )
            // InternalMyDsl.g:430:1: ruleProtocolL EOF
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
    // InternalMyDsl.g:437:1: ruleProtocolL : ( ( rule__ProtocolL__Group__0 ) ) ;
    public final void ruleProtocolL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__ProtocolL__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__ProtocolL__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__ProtocolL__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__ProtocolL__Group__0 )
            {
             before(grammarAccess.getProtocolLAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__ProtocolL__Group__0 )
            // InternalMyDsl.g:444:4: rule__ProtocolL__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleRecursionL : ruleRecursionL EOF ;
    public final void entryRuleRecursionL() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleRecursionL EOF )
            // InternalMyDsl.g:455:1: ruleRecursionL EOF
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
    // InternalMyDsl.g:462:1: ruleRecursionL : ( ( rule__RecursionL__Group__0 ) ) ;
    public final void ruleRecursionL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__RecursionL__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__RecursionL__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__RecursionL__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__RecursionL__Group__0 )
            {
             before(grammarAccess.getRecursionLAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__RecursionL__Group__0 )
            // InternalMyDsl.g:469:4: rule__RecursionL__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleMessageL : ruleMessageL EOF ;
    public final void entryRuleMessageL() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleMessageL EOF )
            // InternalMyDsl.g:480:1: ruleMessageL EOF
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
    // InternalMyDsl.g:487:1: ruleMessageL : ( ( rule__MessageL__Group__0 ) ) ;
    public final void ruleMessageL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__MessageL__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__MessageL__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__MessageL__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__MessageL__Group__0 )
            {
             before(grammarAccess.getMessageLAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__MessageL__Group__0 )
            // InternalMyDsl.g:494:4: rule__MessageL__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleMessageType : ruleMessageType EOF ;
    public final void entryRuleMessageType() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleMessageType EOF )
            // InternalMyDsl.g:505:1: ruleMessageType EOF
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
    // InternalMyDsl.g:512:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__MessageType__Alternatives ) )
            // InternalMyDsl.g:518:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:519:3: ( rule__MessageType__Alternatives )
            // InternalMyDsl.g:519:4: rule__MessageType__Alternatives
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
    // InternalMyDsl.g:528:1: entryRuleSenderL : ruleSenderL EOF ;
    public final void entryRuleSenderL() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleSenderL EOF )
            // InternalMyDsl.g:530:1: ruleSenderL EOF
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
    // InternalMyDsl.g:537:1: ruleSenderL : ( ( rule__SenderL__Group__0 ) ) ;
    public final void ruleSenderL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__SenderL__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__SenderL__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__SenderL__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__SenderL__Group__0 )
            {
             before(grammarAccess.getSenderLAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__SenderL__Group__0 )
            // InternalMyDsl.g:544:4: rule__SenderL__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleReceiverL : ruleReceiverL EOF ;
    public final void entryRuleReceiverL() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleReceiverL EOF )
            // InternalMyDsl.g:555:1: ruleReceiverL EOF
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
    // InternalMyDsl.g:562:1: ruleReceiverL : ( ( rule__ReceiverL__Group__0 ) ) ;
    public final void ruleReceiverL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__ReceiverL__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__ReceiverL__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__ReceiverL__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__ReceiverL__Group__0 )
            {
             before(grammarAccess.getReceiverLAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__ReceiverL__Group__0 )
            // InternalMyDsl.g:569:4: rule__ReceiverL__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleChoiceL : ruleChoiceL EOF ;
    public final void entryRuleChoiceL() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleChoiceL EOF )
            // InternalMyDsl.g:580:1: ruleChoiceL EOF
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
    // InternalMyDsl.g:587:1: ruleChoiceL : ( ( rule__ChoiceL__Group__0 ) ) ;
    public final void ruleChoiceL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__ChoiceL__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__ChoiceL__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__ChoiceL__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__ChoiceL__Group__0 )
            {
             before(grammarAccess.getChoiceLAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__ChoiceL__Group__0 )
            // InternalMyDsl.g:594:4: rule__ChoiceL__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleChoiceBranchL : ruleChoiceBranchL EOF ;
    public final void entryRuleChoiceBranchL() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleChoiceBranchL EOF )
            // InternalMyDsl.g:605:1: ruleChoiceBranchL EOF
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
    // InternalMyDsl.g:612:1: ruleChoiceBranchL : ( ( rule__ChoiceBranchL__Alternatives ) ) ;
    public final void ruleChoiceBranchL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__ChoiceBranchL__Alternatives ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__ChoiceBranchL__Alternatives ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__ChoiceBranchL__Alternatives ) )
            // InternalMyDsl.g:618:3: ( rule__ChoiceBranchL__Alternatives )
            {
             before(grammarAccess.getChoiceBranchLAccess().getAlternatives()); 
            // InternalMyDsl.g:619:3: ( rule__ChoiceBranchL__Alternatives )
            // InternalMyDsl.g:619:4: rule__ChoiceBranchL__Alternatives
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
    // InternalMyDsl.g:628:1: entryRuleForEachL : ruleForEachL EOF ;
    public final void entryRuleForEachL() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleForEachL EOF )
            // InternalMyDsl.g:630:1: ruleForEachL EOF
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
    // InternalMyDsl.g:637:1: ruleForEachL : ( ( rule__ForEachL__Group__0 ) ) ;
    public final void ruleForEachL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__ForEachL__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__ForEachL__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__ForEachL__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__ForEachL__Group__0 )
            {
             before(grammarAccess.getForEachLAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__ForEachL__Group__0 )
            // InternalMyDsl.g:644:4: rule__ForEachL__Group__0
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
    // InternalMyDsl.g:653:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleType EOF )
            // InternalMyDsl.g:655:1: ruleType EOF
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
    // InternalMyDsl.g:662:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:668:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:669:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:669:4: rule__Type__Alternatives
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
    // InternalMyDsl.g:677:1: rule__Model__Alternatives : ( ( ( rule__Model__ProtocolAssignment_0 ) ) | ( ( rule__Model__ProtocolAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( ( ( rule__Model__ProtocolAssignment_0 ) ) | ( ( rule__Model__ProtocolAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
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
                    // InternalMyDsl.g:682:2: ( ( rule__Model__ProtocolAssignment_0 ) )
                    {
                    // InternalMyDsl.g:682:2: ( ( rule__Model__ProtocolAssignment_0 ) )
                    // InternalMyDsl.g:683:3: ( rule__Model__ProtocolAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_0()); 
                    // InternalMyDsl.g:684:3: ( rule__Model__ProtocolAssignment_0 )
                    // InternalMyDsl.g:684:4: rule__Model__ProtocolAssignment_0
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
                    // InternalMyDsl.g:688:2: ( ( rule__Model__ProtocolAssignment_1 ) )
                    {
                    // InternalMyDsl.g:688:2: ( ( rule__Model__ProtocolAssignment_1 ) )
                    // InternalMyDsl.g:689:3: ( rule__Model__ProtocolAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_1()); 
                    // InternalMyDsl.g:690:3: ( rule__Model__ProtocolAssignment_1 )
                    // InternalMyDsl.g:690:4: rule__Model__ProtocolAssignment_1
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
    // InternalMyDsl.g:698:1: rule__Role__Alternatives : ( ( ruleRoleOne ) | ( ruleRoleSet ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ruleRoleOne ) | ( ruleRoleSet ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:703:2: ( ruleRoleOne )
                    {
                    // InternalMyDsl.g:703:2: ( ruleRoleOne )
                    // InternalMyDsl.g:704:3: ruleRoleOne
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
                    // InternalMyDsl.g:709:2: ( ruleRoleSet )
                    {
                    // InternalMyDsl.g:709:2: ( ruleRoleSet )
                    // InternalMyDsl.g:710:3: ruleRoleSet
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


    // $ANTLR start "rule__Protocol__Alternatives"
    // InternalMyDsl.g:719:1: rule__Protocol__Alternatives : ( ( ( rule__Protocol__Group_0__0 ) ) | ( ( rule__Protocol__ActionsAssignment_1 ) ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( ( rule__Protocol__Group_0__0 ) ) | ( ( rule__Protocol__ActionsAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_ID||LA3_0==18||LA3_0==23||LA3_0==26||LA3_0==30||LA3_0==38) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:724:2: ( ( rule__Protocol__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:724:2: ( ( rule__Protocol__Group_0__0 ) )
                    // InternalMyDsl.g:725:3: ( rule__Protocol__Group_0__0 )
                    {
                     before(grammarAccess.getProtocolAccess().getGroup_0()); 
                    // InternalMyDsl.g:726:3: ( rule__Protocol__Group_0__0 )
                    // InternalMyDsl.g:726:4: rule__Protocol__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Protocol__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProtocolAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:730:2: ( ( rule__Protocol__ActionsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:730:2: ( ( rule__Protocol__ActionsAssignment_1 ) )
                    // InternalMyDsl.g:731:3: ( rule__Protocol__ActionsAssignment_1 )
                    {
                     before(grammarAccess.getProtocolAccess().getActionsAssignment_1()); 
                    // InternalMyDsl.g:732:3: ( rule__Protocol__ActionsAssignment_1 )
                    // InternalMyDsl.g:732:4: rule__Protocol__ActionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Protocol__ActionsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProtocolAccess().getActionsAssignment_1()); 

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
    // $ANTLR end "rule__Protocol__Alternatives"


    // $ANTLR start "rule__Protocol__ActionsAlternatives_0_1_0"
    // InternalMyDsl.g:740:1: rule__Protocol__ActionsAlternatives_0_1_0 : ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) );
    public final void rule__Protocol__ActionsAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 30:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:745:2: ( ruleMessage )
                    {
                    // InternalMyDsl.g:745:2: ( ruleMessage )
                    // InternalMyDsl.g:746:3: ruleMessage
                    {
                     before(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_0_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:751:2: ( ruleChoice )
                    {
                    // InternalMyDsl.g:751:2: ( ruleChoice )
                    // InternalMyDsl.g:752:3: ruleChoice
                    {
                     before(grammarAccess.getProtocolAccess().getActionsChoiceParserRuleCall_0_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChoice();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsChoiceParserRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:757:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:757:2: ( ruleRecursion )
                    // InternalMyDsl.g:758:3: ruleRecursion
                    {
                     before(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_0_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:763:2: ( ruleForEach )
                    {
                    // InternalMyDsl.g:763:2: ( ruleForEach )
                    // InternalMyDsl.g:764:3: ruleForEach
                    {
                     before(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_0_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleForEach();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_0_1_0_3()); 

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
    // $ANTLR end "rule__Protocol__ActionsAlternatives_0_1_0"


    // $ANTLR start "rule__Payload__Alternatives"
    // InternalMyDsl.g:773:1: rule__Payload__Alternatives : ( ( ( rule__Payload__Group_0__0 ) ) | ( ( rule__Payload__TypesAssignment_1 ) ) );
    public final void rule__Payload__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( ( rule__Payload__Group_0__0 ) ) | ( ( rule__Payload__TypesAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=11 && LA5_0<=13)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:778:2: ( ( rule__Payload__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:778:2: ( ( rule__Payload__Group_0__0 ) )
                    // InternalMyDsl.g:779:3: ( rule__Payload__Group_0__0 )
                    {
                     before(grammarAccess.getPayloadAccess().getGroup_0()); 
                    // InternalMyDsl.g:780:3: ( rule__Payload__Group_0__0 )
                    // InternalMyDsl.g:780:4: rule__Payload__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Payload__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPayloadAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:784:2: ( ( rule__Payload__TypesAssignment_1 ) )
                    {
                    // InternalMyDsl.g:784:2: ( ( rule__Payload__TypesAssignment_1 ) )
                    // InternalMyDsl.g:785:3: ( rule__Payload__TypesAssignment_1 )
                    {
                     before(grammarAccess.getPayloadAccess().getTypesAssignment_1()); 
                    // InternalMyDsl.g:786:3: ( rule__Payload__TypesAssignment_1 )
                    // InternalMyDsl.g:786:4: rule__Payload__TypesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Payload__TypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPayloadAccess().getTypesAssignment_1()); 

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
    // $ANTLR end "rule__Payload__Alternatives"


    // $ANTLR start "rule__ProtocolL__ActionsAlternatives_1_0"
    // InternalMyDsl.g:794:1: rule__ProtocolL__ActionsAlternatives_1_0 : ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursionL ) | ( ruleCloseRecursion ) );
    public final void rule__ProtocolL__ActionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursionL ) | ( ruleCloseRecursion ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 39:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 25:
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
                    // InternalMyDsl.g:799:2: ( ruleMessageL )
                    {
                    // InternalMyDsl.g:799:2: ( ruleMessageL )
                    // InternalMyDsl.g:800:3: ruleMessageL
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
                    // InternalMyDsl.g:805:2: ( ruleChoiceL )
                    {
                    // InternalMyDsl.g:805:2: ( ruleChoiceL )
                    // InternalMyDsl.g:806:3: ruleChoiceL
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
                    // InternalMyDsl.g:811:2: ( ruleForEachL )
                    {
                    // InternalMyDsl.g:811:2: ( ruleForEachL )
                    // InternalMyDsl.g:812:3: ruleForEachL
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
                    // InternalMyDsl.g:817:2: ( ruleRecursionL )
                    {
                    // InternalMyDsl.g:817:2: ( ruleRecursionL )
                    // InternalMyDsl.g:818:3: ruleRecursionL
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
                    // InternalMyDsl.g:823:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:823:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:824:3: ruleCloseRecursion
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
    // InternalMyDsl.g:833:1: rule__MessageType__Alternatives : ( ( ruleSenderL ) | ( ruleReceiverL ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ruleSenderL ) | ( ruleReceiverL ) )
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
                    // InternalMyDsl.g:838:2: ( ruleSenderL )
                    {
                    // InternalMyDsl.g:838:2: ( ruleSenderL )
                    // InternalMyDsl.g:839:3: ruleSenderL
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
                    // InternalMyDsl.g:844:2: ( ruleReceiverL )
                    {
                    // InternalMyDsl.g:844:2: ( ruleReceiverL )
                    // InternalMyDsl.g:845:3: ruleReceiverL
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
    // InternalMyDsl.g:854:1: rule__ChoiceBranchL__Alternatives : ( ( ( rule__ChoiceBranchL__Group_0__0 ) ) | ( ( rule__ChoiceBranchL__Group_1__0 ) ) );
    public final void rule__ChoiceBranchL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:858:1: ( ( ( rule__ChoiceBranchL__Group_0__0 ) ) | ( ( rule__ChoiceBranchL__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
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
                    // InternalMyDsl.g:859:2: ( ( rule__ChoiceBranchL__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:859:2: ( ( rule__ChoiceBranchL__Group_0__0 ) )
                    // InternalMyDsl.g:860:3: ( rule__ChoiceBranchL__Group_0__0 )
                    {
                     before(grammarAccess.getChoiceBranchLAccess().getGroup_0()); 
                    // InternalMyDsl.g:861:3: ( rule__ChoiceBranchL__Group_0__0 )
                    // InternalMyDsl.g:861:4: rule__ChoiceBranchL__Group_0__0
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
                    // InternalMyDsl.g:865:2: ( ( rule__ChoiceBranchL__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:865:2: ( ( rule__ChoiceBranchL__Group_1__0 ) )
                    // InternalMyDsl.g:866:3: ( rule__ChoiceBranchL__Group_1__0 )
                    {
                     before(grammarAccess.getChoiceBranchLAccess().getGroup_1()); 
                    // InternalMyDsl.g:867:3: ( rule__ChoiceBranchL__Group_1__0 )
                    // InternalMyDsl.g:867:4: rule__ChoiceBranchL__Group_1__0
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
    // InternalMyDsl.g:875:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'action' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( ( 'int' ) | ( 'string' ) | ( 'action' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt9=1;
                }
                break;
            case 12:
                {
                alt9=2;
                }
                break;
            case 13:
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
                    // InternalMyDsl.g:880:2: ( 'int' )
                    {
                    // InternalMyDsl.g:880:2: ( 'int' )
                    // InternalMyDsl.g:881:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:886:2: ( 'string' )
                    {
                    // InternalMyDsl.g:886:2: ( 'string' )
                    // InternalMyDsl.g:887:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:892:2: ( 'action' )
                    {
                    // InternalMyDsl.g:892:2: ( 'action' )
                    // InternalMyDsl.g:893:3: 'action'
                    {
                     before(grammarAccess.getTypeAccess().getActionKeyword_2()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:902:1: rule__GlobalProtocol__Group__0 : rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 ;
    public final void rule__GlobalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 )
            // InternalMyDsl.g:907:2: rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1
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
    // InternalMyDsl.g:914:1: rule__GlobalProtocol__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( 'global' ) )
            // InternalMyDsl.g:919:1: ( 'global' )
            {
            // InternalMyDsl.g:919:1: ( 'global' )
            // InternalMyDsl.g:920:2: 'global'
            {
             before(grammarAccess.getGlobalProtocolAccess().getGlobalKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:929:1: rule__GlobalProtocol__Group__1 : rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 ;
    public final void rule__GlobalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 )
            // InternalMyDsl.g:934:2: rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2
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
    // InternalMyDsl.g:941:1: rule__GlobalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__GlobalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:946:1: ( 'protocol' )
            {
            // InternalMyDsl.g:946:1: ( 'protocol' )
            // InternalMyDsl.g:947:2: 'protocol'
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:956:1: rule__GlobalProtocol__Group__2 : rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 ;
    public final void rule__GlobalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 )
            // InternalMyDsl.g:961:2: rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3
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
    // InternalMyDsl.g:968:1: rule__GlobalProtocol__Group__2__Impl : ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__GlobalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:973:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:973:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:974:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:975:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:975:3: rule__GlobalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:983:1: rule__GlobalProtocol__Group__3 : rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 ;
    public final void rule__GlobalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 )
            // InternalMyDsl.g:988:2: rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4
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
    // InternalMyDsl.g:995:1: rule__GlobalProtocol__Group__3__Impl : ( '(' ) ;
    public final void rule__GlobalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( '(' ) )
            // InternalMyDsl.g:1000:1: ( '(' )
            {
            // InternalMyDsl.g:1000:1: ( '(' )
            // InternalMyDsl.g:1001:2: '('
            {
             before(grammarAccess.getGlobalProtocolAccess().getLeftParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1010:1: rule__GlobalProtocol__Group__4 : rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 ;
    public final void rule__GlobalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 )
            // InternalMyDsl.g:1015:2: rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5
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
    // InternalMyDsl.g:1022:1: rule__GlobalProtocol__Group__4__Impl : ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) ;
    public final void rule__GlobalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) )
            // InternalMyDsl.g:1027:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            {
            // InternalMyDsl.g:1027:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            // InternalMyDsl.g:1028:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getRolesAssignment_4()); 
            // InternalMyDsl.g:1029:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            // InternalMyDsl.g:1029:3: rule__GlobalProtocol__RolesAssignment_4
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
    // InternalMyDsl.g:1037:1: rule__GlobalProtocol__Group__5 : rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 ;
    public final void rule__GlobalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 )
            // InternalMyDsl.g:1042:2: rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6
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
    // InternalMyDsl.g:1049:1: rule__GlobalProtocol__Group__5__Impl : ( '){' ) ;
    public final void rule__GlobalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( ( '){' ) )
            // InternalMyDsl.g:1054:1: ( '){' )
            {
            // InternalMyDsl.g:1054:1: ( '){' )
            // InternalMyDsl.g:1055:2: '){'
            {
             before(grammarAccess.getGlobalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1064:1: rule__GlobalProtocol__Group__6 : rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 ;
    public final void rule__GlobalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 )
            // InternalMyDsl.g:1069:2: rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7
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
    // InternalMyDsl.g:1076:1: rule__GlobalProtocol__Group__6__Impl : ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) ;
    public final void rule__GlobalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) )
            // InternalMyDsl.g:1081:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            {
            // InternalMyDsl.g:1081:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            // InternalMyDsl.g:1082:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolAssignment_6()); 
            // InternalMyDsl.g:1083:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            // InternalMyDsl.g:1083:3: rule__GlobalProtocol__ProtocolAssignment_6
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
    // InternalMyDsl.g:1091:1: rule__GlobalProtocol__Group__7 : rule__GlobalProtocol__Group__7__Impl ;
    public final void rule__GlobalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( rule__GlobalProtocol__Group__7__Impl )
            // InternalMyDsl.g:1096:2: rule__GlobalProtocol__Group__7__Impl
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
    // InternalMyDsl.g:1102:1: rule__GlobalProtocol__Group__7__Impl : ( '}' ) ;
    public final void rule__GlobalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( ( '}' ) )
            // InternalMyDsl.g:1107:1: ( '}' )
            {
            // InternalMyDsl.g:1107:1: ( '}' )
            // InternalMyDsl.g:1108:2: '}'
            {
             before(grammarAccess.getGlobalProtocolAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1118:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalMyDsl.g:1123:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
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
    // InternalMyDsl.g:1130:1: rule__Roles__Group__0__Impl : ( ( rule__Roles__RolesAssignment_0 ) ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( ( ( rule__Roles__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:1135:1: ( ( rule__Roles__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:1135:1: ( ( rule__Roles__RolesAssignment_0 ) )
            // InternalMyDsl.g:1136:2: ( rule__Roles__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:1137:2: ( rule__Roles__RolesAssignment_0 )
            // InternalMyDsl.g:1137:3: rule__Roles__RolesAssignment_0
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
    // InternalMyDsl.g:1145:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( rule__Roles__Group__1__Impl )
            // InternalMyDsl.g:1150:2: rule__Roles__Group__1__Impl
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
    // InternalMyDsl.g:1156:1: rule__Roles__Group__1__Impl : ( ( rule__Roles__Group_1__0 )* ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( ( ( rule__Roles__Group_1__0 )* ) )
            // InternalMyDsl.g:1161:1: ( ( rule__Roles__Group_1__0 )* )
            {
            // InternalMyDsl.g:1161:1: ( ( rule__Roles__Group_1__0 )* )
            // InternalMyDsl.g:1162:2: ( rule__Roles__Group_1__0 )*
            {
             before(grammarAccess.getRolesAccess().getGroup_1()); 
            // InternalMyDsl.g:1163:2: ( rule__Roles__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1163:3: rule__Roles__Group_1__0
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
    // InternalMyDsl.g:1172:1: rule__Roles__Group_1__0 : rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 ;
    public final void rule__Roles__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 )
            // InternalMyDsl.g:1177:2: rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1
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
    // InternalMyDsl.g:1184:1: rule__Roles__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Roles__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( ',' ) )
            // InternalMyDsl.g:1189:1: ( ',' )
            {
            // InternalMyDsl.g:1189:1: ( ',' )
            // InternalMyDsl.g:1190:2: ','
            {
             before(grammarAccess.getRolesAccess().getCommaKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1199:1: rule__Roles__Group_1__1 : rule__Roles__Group_1__1__Impl ;
    public final void rule__Roles__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( rule__Roles__Group_1__1__Impl )
            // InternalMyDsl.g:1204:2: rule__Roles__Group_1__1__Impl
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
    // InternalMyDsl.g:1210:1: rule__Roles__Group_1__1__Impl : ( ( rule__Roles__RolesAssignment_1_1 ) ) ;
    public final void rule__Roles__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( ( ( rule__Roles__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:1215:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1215:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:1216:2: ( rule__Roles__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:1217:2: ( rule__Roles__RolesAssignment_1_1 )
            // InternalMyDsl.g:1217:3: rule__Roles__RolesAssignment_1_1
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
    // InternalMyDsl.g:1226:1: rule__RoleOne__Group__0 : rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 ;
    public final void rule__RoleOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 )
            // InternalMyDsl.g:1231:2: rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1
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
    // InternalMyDsl.g:1238:1: rule__RoleOne__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( 'role' ) )
            // InternalMyDsl.g:1243:1: ( 'role' )
            {
            // InternalMyDsl.g:1243:1: ( 'role' )
            // InternalMyDsl.g:1244:2: 'role'
            {
             before(grammarAccess.getRoleOneAccess().getRoleKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1253:1: rule__RoleOne__Group__1 : rule__RoleOne__Group__1__Impl ;
    public final void rule__RoleOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( rule__RoleOne__Group__1__Impl )
            // InternalMyDsl.g:1258:2: rule__RoleOne__Group__1__Impl
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
    // InternalMyDsl.g:1264:1: rule__RoleOne__Group__1__Impl : ( ( rule__RoleOne__NameAssignment_1 ) ) ;
    public final void rule__RoleOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( ( ( rule__RoleOne__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1269:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1269:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            // InternalMyDsl.g:1270:2: ( rule__RoleOne__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1271:2: ( rule__RoleOne__NameAssignment_1 )
            // InternalMyDsl.g:1271:3: rule__RoleOne__NameAssignment_1
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
    // InternalMyDsl.g:1280:1: rule__RoleSet__Group__0 : rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 ;
    public final void rule__RoleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 )
            // InternalMyDsl.g:1285:2: rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1
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
    // InternalMyDsl.g:1292:1: rule__RoleSet__Group__0__Impl : ( 'roleset' ) ;
    public final void rule__RoleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( 'roleset' ) )
            // InternalMyDsl.g:1297:1: ( 'roleset' )
            {
            // InternalMyDsl.g:1297:1: ( 'roleset' )
            // InternalMyDsl.g:1298:2: 'roleset'
            {
             before(grammarAccess.getRoleSetAccess().getRolesetKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1307:1: rule__RoleSet__Group__1 : rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 ;
    public final void rule__RoleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 )
            // InternalMyDsl.g:1312:2: rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2
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
    // InternalMyDsl.g:1319:1: rule__RoleSet__Group__1__Impl : ( ( rule__RoleSet__NameAssignment_1 ) ) ;
    public final void rule__RoleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1323:1: ( ( ( rule__RoleSet__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1324:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1324:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            // InternalMyDsl.g:1325:2: ( rule__RoleSet__NameAssignment_1 )
            {
             before(grammarAccess.getRoleSetAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1326:2: ( rule__RoleSet__NameAssignment_1 )
            // InternalMyDsl.g:1326:3: rule__RoleSet__NameAssignment_1
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
    // InternalMyDsl.g:1334:1: rule__RoleSet__Group__2 : rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 ;
    public final void rule__RoleSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 )
            // InternalMyDsl.g:1339:2: rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3
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
    // InternalMyDsl.g:1346:1: rule__RoleSet__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( ( ':' ) )
            // InternalMyDsl.g:1351:1: ( ':' )
            {
            // InternalMyDsl.g:1351:1: ( ':' )
            // InternalMyDsl.g:1352:2: ':'
            {
             before(grammarAccess.getRoleSetAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1361:1: rule__RoleSet__Group__3 : rule__RoleSet__Group__3__Impl ;
    public final void rule__RoleSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( rule__RoleSet__Group__3__Impl )
            // InternalMyDsl.g:1366:2: rule__RoleSet__Group__3__Impl
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
    // InternalMyDsl.g:1372:1: rule__RoleSet__Group__3__Impl : ( ( rule__RoleSet__RefAssignment_3 ) ) ;
    public final void rule__RoleSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( ( ( rule__RoleSet__RefAssignment_3 ) ) )
            // InternalMyDsl.g:1377:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:1377:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            // InternalMyDsl.g:1378:2: ( rule__RoleSet__RefAssignment_3 )
            {
             before(grammarAccess.getRoleSetAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:1379:2: ( rule__RoleSet__RefAssignment_3 )
            // InternalMyDsl.g:1379:3: rule__RoleSet__RefAssignment_3
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


    // $ANTLR start "rule__Protocol__Group_0__0"
    // InternalMyDsl.g:1388:1: rule__Protocol__Group_0__0 : rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 ;
    public final void rule__Protocol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 )
            // InternalMyDsl.g:1393:2: rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Protocol__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_0__0"


    // $ANTLR start "rule__Protocol__Group_0__0__Impl"
    // InternalMyDsl.g:1400:1: rule__Protocol__Group_0__0__Impl : ( () ) ;
    public final void rule__Protocol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( () ) )
            // InternalMyDsl.g:1405:1: ( () )
            {
            // InternalMyDsl.g:1405:1: ( () )
            // InternalMyDsl.g:1406:2: ()
            {
             before(grammarAccess.getProtocolAccess().getProtocolAction_0_0()); 
            // InternalMyDsl.g:1407:2: ()
            // InternalMyDsl.g:1407:3: 
            {
            }

             after(grammarAccess.getProtocolAccess().getProtocolAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_0__0__Impl"


    // $ANTLR start "rule__Protocol__Group_0__1"
    // InternalMyDsl.g:1415:1: rule__Protocol__Group_0__1 : rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2 ;
    public final void rule__Protocol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2 )
            // InternalMyDsl.g:1420:2: rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__Protocol__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_0__1"


    // $ANTLR start "rule__Protocol__Group_0__1__Impl"
    // InternalMyDsl.g:1427:1: rule__Protocol__Group_0__1__Impl : ( ( rule__Protocol__ActionsAssignment_0_1 )* ) ;
    public final void rule__Protocol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( ( rule__Protocol__ActionsAssignment_0_1 )* ) )
            // InternalMyDsl.g:1432:1: ( ( rule__Protocol__ActionsAssignment_0_1 )* )
            {
            // InternalMyDsl.g:1432:1: ( ( rule__Protocol__ActionsAssignment_0_1 )* )
            // InternalMyDsl.g:1433:2: ( rule__Protocol__ActionsAssignment_0_1 )*
            {
             before(grammarAccess.getProtocolAccess().getActionsAssignment_0_1()); 
            // InternalMyDsl.g:1434:2: ( rule__Protocol__ActionsAssignment_0_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==23||LA11_0==26||LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1434:3: rule__Protocol__ActionsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Protocol__ActionsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getActionsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_0__1__Impl"


    // $ANTLR start "rule__Protocol__Group_0__2"
    // InternalMyDsl.g:1442:1: rule__Protocol__Group_0__2 : rule__Protocol__Group_0__2__Impl ;
    public final void rule__Protocol__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( rule__Protocol__Group_0__2__Impl )
            // InternalMyDsl.g:1447:2: rule__Protocol__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_0__2"


    // $ANTLR start "rule__Protocol__Group_0__2__Impl"
    // InternalMyDsl.g:1453:1: rule__Protocol__Group_0__2__Impl : ( ( rule__Protocol__DoesEndAssignment_0_2 )? ) ;
    public final void rule__Protocol__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1457:1: ( ( ( rule__Protocol__DoesEndAssignment_0_2 )? ) )
            // InternalMyDsl.g:1458:1: ( ( rule__Protocol__DoesEndAssignment_0_2 )? )
            {
            // InternalMyDsl.g:1458:1: ( ( rule__Protocol__DoesEndAssignment_0_2 )? )
            // InternalMyDsl.g:1459:2: ( rule__Protocol__DoesEndAssignment_0_2 )?
            {
             before(grammarAccess.getProtocolAccess().getDoesEndAssignment_0_2()); 
            // InternalMyDsl.g:1460:2: ( rule__Protocol__DoesEndAssignment_0_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1460:3: rule__Protocol__DoesEndAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Protocol__DoesEndAssignment_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProtocolAccess().getDoesEndAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_0__2__Impl"


    // $ANTLR start "rule__Recursion__Group__0"
    // InternalMyDsl.g:1469:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalMyDsl.g:1474:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
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
    // InternalMyDsl.g:1481:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1485:1: ( ( 'rec' ) )
            // InternalMyDsl.g:1486:1: ( 'rec' )
            {
            // InternalMyDsl.g:1486:1: ( 'rec' )
            // InternalMyDsl.g:1487:2: 'rec'
            {
             before(grammarAccess.getRecursionAccess().getRecKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1496:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // InternalMyDsl.g:1501:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
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
    // InternalMyDsl.g:1508:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__NameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1512:1: ( ( ( rule__Recursion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1513:1: ( ( rule__Recursion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1513:1: ( ( rule__Recursion__NameAssignment_1 ) )
            // InternalMyDsl.g:1514:2: ( rule__Recursion__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1515:2: ( rule__Recursion__NameAssignment_1 )
            // InternalMyDsl.g:1515:3: rule__Recursion__NameAssignment_1
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
    // InternalMyDsl.g:1523:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl rule__Recursion__Group__3 ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( rule__Recursion__Group__2__Impl rule__Recursion__Group__3 )
            // InternalMyDsl.g:1528:2: rule__Recursion__Group__2__Impl rule__Recursion__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1535:1: rule__Recursion__Group__2__Impl : ( ':' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( ( ':' ) )
            // InternalMyDsl.g:1540:1: ( ':' )
            {
            // InternalMyDsl.g:1540:1: ( ':' )
            // InternalMyDsl.g:1541:2: ':'
            {
             before(grammarAccess.getRecursionAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1550:1: rule__Recursion__Group__3 : rule__Recursion__Group__3__Impl rule__Recursion__Group__4 ;
    public final void rule__Recursion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( rule__Recursion__Group__3__Impl rule__Recursion__Group__4 )
            // InternalMyDsl.g:1555:2: rule__Recursion__Group__3__Impl rule__Recursion__Group__4
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
    // InternalMyDsl.g:1562:1: rule__Recursion__Group__3__Impl : ( '{' ) ;
    public final void rule__Recursion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1566:1: ( ( '{' ) )
            // InternalMyDsl.g:1567:1: ( '{' )
            {
            // InternalMyDsl.g:1567:1: ( '{' )
            // InternalMyDsl.g:1568:2: '{'
            {
             before(grammarAccess.getRecursionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1577:1: rule__Recursion__Group__4 : rule__Recursion__Group__4__Impl rule__Recursion__Group__5 ;
    public final void rule__Recursion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( rule__Recursion__Group__4__Impl rule__Recursion__Group__5 )
            // InternalMyDsl.g:1582:2: rule__Recursion__Group__4__Impl rule__Recursion__Group__5
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
    // InternalMyDsl.g:1589:1: rule__Recursion__Group__4__Impl : ( ( rule__Recursion__RecProtocolAssignment_4 ) ) ;
    public final void rule__Recursion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( ( rule__Recursion__RecProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:1594:1: ( ( rule__Recursion__RecProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:1594:1: ( ( rule__Recursion__RecProtocolAssignment_4 ) )
            // InternalMyDsl.g:1595:2: ( rule__Recursion__RecProtocolAssignment_4 )
            {
             before(grammarAccess.getRecursionAccess().getRecProtocolAssignment_4()); 
            // InternalMyDsl.g:1596:2: ( rule__Recursion__RecProtocolAssignment_4 )
            // InternalMyDsl.g:1596:3: rule__Recursion__RecProtocolAssignment_4
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
    // InternalMyDsl.g:1604:1: rule__Recursion__Group__5 : rule__Recursion__Group__5__Impl ;
    public final void rule__Recursion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( rule__Recursion__Group__5__Impl )
            // InternalMyDsl.g:1609:2: rule__Recursion__Group__5__Impl
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
    // InternalMyDsl.g:1615:1: rule__Recursion__Group__5__Impl : ( '}' ) ;
    public final void rule__Recursion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( '}' ) )
            // InternalMyDsl.g:1620:1: ( '}' )
            {
            // InternalMyDsl.g:1620:1: ( '}' )
            // InternalMyDsl.g:1621:2: '}'
            {
             before(grammarAccess.getRecursionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1631:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalMyDsl.g:1636:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
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
    // InternalMyDsl.g:1643:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1647:1: ( ( 'loop' ) )
            // InternalMyDsl.g:1648:1: ( 'loop' )
            {
            // InternalMyDsl.g:1648:1: ( 'loop' )
            // InternalMyDsl.g:1649:2: 'loop'
            {
             before(grammarAccess.getCloseRecursionAccess().getLoopKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1658:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1662:1: ( rule__CloseRecursion__Group__1__Impl )
            // InternalMyDsl.g:1663:2: rule__CloseRecursion__Group__1__Impl
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
    // InternalMyDsl.g:1669:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1673:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:1674:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:1674:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:1675:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:1676:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:1676:3: rule__CloseRecursion__RecursionVariableAssignment_1
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
    // InternalMyDsl.g:1685:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1689:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalMyDsl.g:1690:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1697:1: rule__ForEach__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1701:1: ( ( 'for' ) )
            // InternalMyDsl.g:1702:1: ( 'for' )
            {
            // InternalMyDsl.g:1702:1: ( 'for' )
            // InternalMyDsl.g:1703:2: 'for'
            {
             before(grammarAccess.getForEachAccess().getForKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1712:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalMyDsl.g:1717:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
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
    // InternalMyDsl.g:1724:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__LoopRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( ( ( rule__ForEach__LoopRoleAssignment_1 ) ) )
            // InternalMyDsl.g:1729:1: ( ( rule__ForEach__LoopRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:1729:1: ( ( rule__ForEach__LoopRoleAssignment_1 ) )
            // InternalMyDsl.g:1730:2: ( rule__ForEach__LoopRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getLoopRoleAssignment_1()); 
            // InternalMyDsl.g:1731:2: ( rule__ForEach__LoopRoleAssignment_1 )
            // InternalMyDsl.g:1731:3: rule__ForEach__LoopRoleAssignment_1
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
    // InternalMyDsl.g:1739:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1743:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalMyDsl.g:1744:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1751:1: rule__ForEach__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1755:1: ( ( ':' ) )
            // InternalMyDsl.g:1756:1: ( ':' )
            {
            // InternalMyDsl.g:1756:1: ( ':' )
            // InternalMyDsl.g:1757:2: ':'
            {
             before(grammarAccess.getForEachAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1766:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1770:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalMyDsl.g:1771:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
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
    // InternalMyDsl.g:1778:1: rule__ForEach__Group__3__Impl : ( '<' ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1782:1: ( ( '<' ) )
            // InternalMyDsl.g:1783:1: ( '<' )
            {
            // InternalMyDsl.g:1783:1: ( '<' )
            // InternalMyDsl.g:1784:2: '<'
            {
             before(grammarAccess.getForEachAccess().getLessThanSignKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1793:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1797:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalMyDsl.g:1798:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
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
    // InternalMyDsl.g:1805:1: rule__ForEach__Group__4__Impl : ( ( rule__ForEach__RolesetAssignment_4 ) ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1809:1: ( ( ( rule__ForEach__RolesetAssignment_4 ) ) )
            // InternalMyDsl.g:1810:1: ( ( rule__ForEach__RolesetAssignment_4 ) )
            {
            // InternalMyDsl.g:1810:1: ( ( rule__ForEach__RolesetAssignment_4 ) )
            // InternalMyDsl.g:1811:2: ( rule__ForEach__RolesetAssignment_4 )
            {
             before(grammarAccess.getForEachAccess().getRolesetAssignment_4()); 
            // InternalMyDsl.g:1812:2: ( rule__ForEach__RolesetAssignment_4 )
            // InternalMyDsl.g:1812:3: rule__ForEach__RolesetAssignment_4
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
    // InternalMyDsl.g:1820:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1824:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalMyDsl.g:1825:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
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
    // InternalMyDsl.g:1832:1: rule__ForEach__Group__5__Impl : ( ',' ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1836:1: ( ( ',' ) )
            // InternalMyDsl.g:1837:1: ( ',' )
            {
            // InternalMyDsl.g:1837:1: ( ',' )
            // InternalMyDsl.g:1838:2: ','
            {
             before(grammarAccess.getForEachAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1847:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl rule__ForEach__Group__7 ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1851:1: ( rule__ForEach__Group__6__Impl rule__ForEach__Group__7 )
            // InternalMyDsl.g:1852:2: rule__ForEach__Group__6__Impl rule__ForEach__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1859:1: rule__ForEach__Group__6__Impl : ( ( rule__ForEach__RefRoleAssignment_6 ) ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1863:1: ( ( ( rule__ForEach__RefRoleAssignment_6 ) ) )
            // InternalMyDsl.g:1864:1: ( ( rule__ForEach__RefRoleAssignment_6 ) )
            {
            // InternalMyDsl.g:1864:1: ( ( rule__ForEach__RefRoleAssignment_6 ) )
            // InternalMyDsl.g:1865:2: ( rule__ForEach__RefRoleAssignment_6 )
            {
             before(grammarAccess.getForEachAccess().getRefRoleAssignment_6()); 
            // InternalMyDsl.g:1866:2: ( rule__ForEach__RefRoleAssignment_6 )
            // InternalMyDsl.g:1866:3: rule__ForEach__RefRoleAssignment_6
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
    // InternalMyDsl.g:1874:1: rule__ForEach__Group__7 : rule__ForEach__Group__7__Impl rule__ForEach__Group__8 ;
    public final void rule__ForEach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1878:1: ( rule__ForEach__Group__7__Impl rule__ForEach__Group__8 )
            // InternalMyDsl.g:1879:2: rule__ForEach__Group__7__Impl rule__ForEach__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1886:1: rule__ForEach__Group__7__Impl : ( '>' ) ;
    public final void rule__ForEach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1890:1: ( ( '>' ) )
            // InternalMyDsl.g:1891:1: ( '>' )
            {
            // InternalMyDsl.g:1891:1: ( '>' )
            // InternalMyDsl.g:1892:2: '>'
            {
             before(grammarAccess.getForEachAccess().getGreaterThanSignKeyword_7()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1901:1: rule__ForEach__Group__8 : rule__ForEach__Group__8__Impl rule__ForEach__Group__9 ;
    public final void rule__ForEach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1905:1: ( rule__ForEach__Group__8__Impl rule__ForEach__Group__9 )
            // InternalMyDsl.g:1906:2: rule__ForEach__Group__8__Impl rule__ForEach__Group__9
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
    // InternalMyDsl.g:1913:1: rule__ForEach__Group__8__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1917:1: ( ( '{' ) )
            // InternalMyDsl.g:1918:1: ( '{' )
            {
            // InternalMyDsl.g:1918:1: ( '{' )
            // InternalMyDsl.g:1919:2: '{'
            {
             before(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1928:1: rule__ForEach__Group__9 : rule__ForEach__Group__9__Impl rule__ForEach__Group__10 ;
    public final void rule__ForEach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( rule__ForEach__Group__9__Impl rule__ForEach__Group__10 )
            // InternalMyDsl.g:1933:2: rule__ForEach__Group__9__Impl rule__ForEach__Group__10
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
    // InternalMyDsl.g:1940:1: rule__ForEach__Group__9__Impl : ( ( rule__ForEach__BranchAssignment_9 ) ) ;
    public final void rule__ForEach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( ( ( rule__ForEach__BranchAssignment_9 ) ) )
            // InternalMyDsl.g:1945:1: ( ( rule__ForEach__BranchAssignment_9 ) )
            {
            // InternalMyDsl.g:1945:1: ( ( rule__ForEach__BranchAssignment_9 ) )
            // InternalMyDsl.g:1946:2: ( rule__ForEach__BranchAssignment_9 )
            {
             before(grammarAccess.getForEachAccess().getBranchAssignment_9()); 
            // InternalMyDsl.g:1947:2: ( rule__ForEach__BranchAssignment_9 )
            // InternalMyDsl.g:1947:3: rule__ForEach__BranchAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__BranchAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getBranchAssignment_9()); 

            }


            }

        }
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
    // InternalMyDsl.g:1955:1: rule__ForEach__Group__10 : rule__ForEach__Group__10__Impl rule__ForEach__Group__11 ;
    public final void rule__ForEach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( rule__ForEach__Group__10__Impl rule__ForEach__Group__11 )
            // InternalMyDsl.g:1960:2: rule__ForEach__Group__10__Impl rule__ForEach__Group__11
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1967:1: rule__ForEach__Group__10__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1971:1: ( ( '}' ) )
            // InternalMyDsl.g:1972:1: ( '}' )
            {
            // InternalMyDsl.g:1972:1: ( '}' )
            // InternalMyDsl.g:1973:2: '}'
            {
             before(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1982:1: rule__ForEach__Group__11 : rule__ForEach__Group__11__Impl ;
    public final void rule__ForEach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1986:1: ( rule__ForEach__Group__11__Impl )
            // InternalMyDsl.g:1987:2: rule__ForEach__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group__11__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1993:1: rule__ForEach__Group__11__Impl : ( ';' ) ;
    public final void rule__ForEach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1997:1: ( ( ';' ) )
            // InternalMyDsl.g:1998:1: ( ';' )
            {
            // InternalMyDsl.g:1998:1: ( ';' )
            // InternalMyDsl.g:1999:2: ';'
            {
             before(grammarAccess.getForEachAccess().getSemicolonKeyword_11()); 
            match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__Choice__Group__0"
    // InternalMyDsl.g:2009:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2013:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:2014:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2021:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2025:1: ( ( 'choice' ) )
            // InternalMyDsl.g:2026:1: ( 'choice' )
            {
            // InternalMyDsl.g:2026:1: ( 'choice' )
            // InternalMyDsl.g:2027:2: 'choice'
            {
             before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2036:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2040:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:2041:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
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
    // InternalMyDsl.g:2048:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( ( 'at' ) )
            // InternalMyDsl.g:2053:1: ( 'at' )
            {
            // InternalMyDsl.g:2053:1: ( 'at' )
            // InternalMyDsl.g:2054:2: 'at'
            {
             before(grammarAccess.getChoiceAccess().getAtKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2063:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:2068:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2075:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2079:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:2080:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:2080:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalMyDsl.g:2081:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:2082:2: ( rule__Choice__RoleAssignment_2 )
            // InternalMyDsl.g:2082:3: rule__Choice__RoleAssignment_2
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
    // InternalMyDsl.g:2090:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2094:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:2095:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2102:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( ( '{' ) )
            // InternalMyDsl.g:2107:1: ( '{' )
            {
            // InternalMyDsl.g:2107:1: ( '{' )
            // InternalMyDsl.g:2108:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2117:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2121:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:2122:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
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
    // InternalMyDsl.g:2129:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__BranchesAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2133:1: ( ( ( rule__Choice__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:2134:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:2134:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            // InternalMyDsl.g:2135:2: ( rule__Choice__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:2136:2: ( rule__Choice__BranchesAssignment_4 )
            // InternalMyDsl.g:2136:3: rule__Choice__BranchesAssignment_4
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
    // InternalMyDsl.g:2144:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2148:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:2149:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2156:1: rule__Choice__Group__5__Impl : ( '}' ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2160:1: ( ( '}' ) )
            // InternalMyDsl.g:2161:1: ( '}' )
            {
            // InternalMyDsl.g:2161:1: ( '}' )
            // InternalMyDsl.g:2162:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2171:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2175:1: ( rule__Choice__Group__6__Impl )
            // InternalMyDsl.g:2176:2: rule__Choice__Group__6__Impl
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
    // InternalMyDsl.g:2182:1: rule__Choice__Group__6__Impl : ( ( rule__Choice__Group_6__0 )* ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2186:1: ( ( ( rule__Choice__Group_6__0 )* ) )
            // InternalMyDsl.g:2187:1: ( ( rule__Choice__Group_6__0 )* )
            {
            // InternalMyDsl.g:2187:1: ( ( rule__Choice__Group_6__0 )* )
            // InternalMyDsl.g:2188:2: ( rule__Choice__Group_6__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_6()); 
            // InternalMyDsl.g:2189:2: ( rule__Choice__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2189:3: rule__Choice__Group_6__0
            	    {
            	    pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2198:1: rule__Choice__Group_6__0 : rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 ;
    public final void rule__Choice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2202:1: ( rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 )
            // InternalMyDsl.g:2203:2: rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2210:1: rule__Choice__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2214:1: ( ( 'or' ) )
            // InternalMyDsl.g:2215:1: ( 'or' )
            {
            // InternalMyDsl.g:2215:1: ( 'or' )
            // InternalMyDsl.g:2216:2: 'or'
            {
             before(grammarAccess.getChoiceAccess().getOrKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2225:1: rule__Choice__Group_6__1 : rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 ;
    public final void rule__Choice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2229:1: ( rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 )
            // InternalMyDsl.g:2230:2: rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2237:1: rule__Choice__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2241:1: ( ( '{' ) )
            // InternalMyDsl.g:2242:1: ( '{' )
            {
            // InternalMyDsl.g:2242:1: ( '{' )
            // InternalMyDsl.g:2243:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2252:1: rule__Choice__Group_6__2 : rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 ;
    public final void rule__Choice__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2256:1: ( rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 )
            // InternalMyDsl.g:2257:2: rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3
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
    // InternalMyDsl.g:2264:1: rule__Choice__Group_6__2__Impl : ( ( rule__Choice__BranchesAssignment_6_2 ) ) ;
    public final void rule__Choice__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( ( ( rule__Choice__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:2269:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:2269:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:2270:2: ( rule__Choice__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:2271:2: ( rule__Choice__BranchesAssignment_6_2 )
            // InternalMyDsl.g:2271:3: rule__Choice__BranchesAssignment_6_2
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
    // InternalMyDsl.g:2279:1: rule__Choice__Group_6__3 : rule__Choice__Group_6__3__Impl ;
    public final void rule__Choice__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( rule__Choice__Group_6__3__Impl )
            // InternalMyDsl.g:2284:2: rule__Choice__Group_6__3__Impl
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
    // InternalMyDsl.g:2290:1: rule__Choice__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Choice__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2294:1: ( ( '}' ) )
            // InternalMyDsl.g:2295:1: ( '}' )
            {
            // InternalMyDsl.g:2295:1: ( '}' )
            // InternalMyDsl.g:2296:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__ChoiceBranch__Group__0"
    // InternalMyDsl.g:2306:1: rule__ChoiceBranch__Group__0 : rule__ChoiceBranch__Group__0__Impl rule__ChoiceBranch__Group__1 ;
    public final void rule__ChoiceBranch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( rule__ChoiceBranch__Group__0__Impl rule__ChoiceBranch__Group__1 )
            // InternalMyDsl.g:2311:2: rule__ChoiceBranch__Group__0__Impl rule__ChoiceBranch__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ChoiceBranch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceBranch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranch__Group__0"


    // $ANTLR start "rule__ChoiceBranch__Group__0__Impl"
    // InternalMyDsl.g:2318:1: rule__ChoiceBranch__Group__0__Impl : ( ( rule__ChoiceBranch__MessageAssignment_0 ) ) ;
    public final void rule__ChoiceBranch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2322:1: ( ( ( rule__ChoiceBranch__MessageAssignment_0 ) ) )
            // InternalMyDsl.g:2323:1: ( ( rule__ChoiceBranch__MessageAssignment_0 ) )
            {
            // InternalMyDsl.g:2323:1: ( ( rule__ChoiceBranch__MessageAssignment_0 ) )
            // InternalMyDsl.g:2324:2: ( rule__ChoiceBranch__MessageAssignment_0 )
            {
             before(grammarAccess.getChoiceBranchAccess().getMessageAssignment_0()); 
            // InternalMyDsl.g:2325:2: ( rule__ChoiceBranch__MessageAssignment_0 )
            // InternalMyDsl.g:2325:3: rule__ChoiceBranch__MessageAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranch__MessageAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceBranchAccess().getMessageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranch__Group__0__Impl"


    // $ANTLR start "rule__ChoiceBranch__Group__1"
    // InternalMyDsl.g:2333:1: rule__ChoiceBranch__Group__1 : rule__ChoiceBranch__Group__1__Impl ;
    public final void rule__ChoiceBranch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2337:1: ( rule__ChoiceBranch__Group__1__Impl )
            // InternalMyDsl.g:2338:2: rule__ChoiceBranch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranch__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranch__Group__1"


    // $ANTLR start "rule__ChoiceBranch__Group__1__Impl"
    // InternalMyDsl.g:2344:1: rule__ChoiceBranch__Group__1__Impl : ( ( rule__ChoiceBranch__ProtocolAssignment_1 ) ) ;
    public final void rule__ChoiceBranch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2348:1: ( ( ( rule__ChoiceBranch__ProtocolAssignment_1 ) ) )
            // InternalMyDsl.g:2349:1: ( ( rule__ChoiceBranch__ProtocolAssignment_1 ) )
            {
            // InternalMyDsl.g:2349:1: ( ( rule__ChoiceBranch__ProtocolAssignment_1 ) )
            // InternalMyDsl.g:2350:2: ( rule__ChoiceBranch__ProtocolAssignment_1 )
            {
             before(grammarAccess.getChoiceBranchAccess().getProtocolAssignment_1()); 
            // InternalMyDsl.g:2351:2: ( rule__ChoiceBranch__ProtocolAssignment_1 )
            // InternalMyDsl.g:2351:3: rule__ChoiceBranch__ProtocolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranch__ProtocolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceBranchAccess().getProtocolAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranch__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalMyDsl.g:2360:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2364:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:2365:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalMyDsl.g:2372:1: rule__Message__Group__0__Impl : ( ( rule__Message__MessageTypeAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2376:1: ( ( ( rule__Message__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2377:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2377:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2378:2: ( rule__Message__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2379:2: ( rule__Message__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2379:3: rule__Message__MessageTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Message__MessageTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getMessageTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // InternalMyDsl.g:2387:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2391:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:2392:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalMyDsl.g:2399:1: rule__Message__Group__1__Impl : ( '(' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2403:1: ( ( '(' ) )
            // InternalMyDsl.g:2404:1: ( '(' )
            {
            // InternalMyDsl.g:2404:1: ( '(' )
            // InternalMyDsl.g:2405:2: '('
            {
             before(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // InternalMyDsl.g:2414:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2418:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:2419:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Message__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalMyDsl.g:2426:1: rule__Message__Group__2__Impl : ( ( rule__Message__PayloadAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2430:1: ( ( ( rule__Message__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:2431:1: ( ( rule__Message__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:2431:1: ( ( rule__Message__PayloadAssignment_2 )? )
            // InternalMyDsl.g:2432:2: ( rule__Message__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:2433:2: ( rule__Message__PayloadAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||(LA14_0>=11 && LA14_0<=13)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2433:3: rule__Message__PayloadAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__PayloadAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getPayloadAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__3"
    // InternalMyDsl.g:2441:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2445:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:2446:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Message__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // InternalMyDsl.g:2453:1: rule__Message__Group__3__Impl : ( ')' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2457:1: ( ( ')' ) )
            // InternalMyDsl.g:2458:1: ( ')' )
            {
            // InternalMyDsl.g:2458:1: ( ')' )
            // InternalMyDsl.g:2459:2: ')'
            {
             before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__4"
    // InternalMyDsl.g:2468:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2472:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:2473:2: rule__Message__Group__4__Impl rule__Message__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Message__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4"


    // $ANTLR start "rule__Message__Group__4__Impl"
    // InternalMyDsl.g:2480:1: rule__Message__Group__4__Impl : ( 'from' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2484:1: ( ( 'from' ) )
            // InternalMyDsl.g:2485:1: ( 'from' )
            {
            // InternalMyDsl.g:2485:1: ( 'from' )
            // InternalMyDsl.g:2486:2: 'from'
            {
             before(grammarAccess.getMessageAccess().getFromKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getFromKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4__Impl"


    // $ANTLR start "rule__Message__Group__5"
    // InternalMyDsl.g:2495:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2499:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:2500:2: rule__Message__Group__5__Impl rule__Message__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Message__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__5"


    // $ANTLR start "rule__Message__Group__5__Impl"
    // InternalMyDsl.g:2507:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2511:1: ( ( ( rule__Message__SenderAssignment_5 ) ) )
            // InternalMyDsl.g:2512:1: ( ( rule__Message__SenderAssignment_5 ) )
            {
            // InternalMyDsl.g:2512:1: ( ( rule__Message__SenderAssignment_5 ) )
            // InternalMyDsl.g:2513:2: ( rule__Message__SenderAssignment_5 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_5()); 
            // InternalMyDsl.g:2514:2: ( rule__Message__SenderAssignment_5 )
            // InternalMyDsl.g:2514:3: rule__Message__SenderAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Message__SenderAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getSenderAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__5__Impl"


    // $ANTLR start "rule__Message__Group__6"
    // InternalMyDsl.g:2522:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2526:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:2527:2: rule__Message__Group__6__Impl rule__Message__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Message__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__6"


    // $ANTLR start "rule__Message__Group__6__Impl"
    // InternalMyDsl.g:2534:1: rule__Message__Group__6__Impl : ( 'to' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2538:1: ( ( 'to' ) )
            // InternalMyDsl.g:2539:1: ( 'to' )
            {
            // InternalMyDsl.g:2539:1: ( 'to' )
            // InternalMyDsl.g:2540:2: 'to'
            {
             before(grammarAccess.getMessageAccess().getToKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__6__Impl"


    // $ANTLR start "rule__Message__Group__7"
    // InternalMyDsl.g:2549:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:2554:2: rule__Message__Group__7__Impl rule__Message__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Message__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__7"


    // $ANTLR start "rule__Message__Group__7__Impl"
    // InternalMyDsl.g:2561:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2565:1: ( ( ( rule__Message__ReceiverAssignment_7 ) ) )
            // InternalMyDsl.g:2566:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            {
            // InternalMyDsl.g:2566:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            // InternalMyDsl.g:2567:2: ( rule__Message__ReceiverAssignment_7 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 
            // InternalMyDsl.g:2568:2: ( rule__Message__ReceiverAssignment_7 )
            // InternalMyDsl.g:2568:3: rule__Message__ReceiverAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Message__ReceiverAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__7__Impl"


    // $ANTLR start "rule__Message__Group__8"
    // InternalMyDsl.g:2576:1: rule__Message__Group__8 : rule__Message__Group__8__Impl ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2580:1: ( rule__Message__Group__8__Impl )
            // InternalMyDsl.g:2581:2: rule__Message__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__8"


    // $ANTLR start "rule__Message__Group__8__Impl"
    // InternalMyDsl.g:2587:1: rule__Message__Group__8__Impl : ( '.' ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2591:1: ( ( '.' ) )
            // InternalMyDsl.g:2592:1: ( '.' )
            {
            // InternalMyDsl.g:2592:1: ( '.' )
            // InternalMyDsl.g:2593:2: '.'
            {
             before(grammarAccess.getMessageAccess().getFullStopKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__8__Impl"


    // $ANTLR start "rule__Payload__Group_0__0"
    // InternalMyDsl.g:2603:1: rule__Payload__Group_0__0 : rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1 ;
    public final void rule__Payload__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2607:1: ( rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1 )
            // InternalMyDsl.g:2608:2: rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Payload__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Payload__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0__0"


    // $ANTLR start "rule__Payload__Group_0__0__Impl"
    // InternalMyDsl.g:2615:1: rule__Payload__Group_0__0__Impl : ( () ) ;
    public final void rule__Payload__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2619:1: ( ( () ) )
            // InternalMyDsl.g:2620:1: ( () )
            {
            // InternalMyDsl.g:2620:1: ( () )
            // InternalMyDsl.g:2621:2: ()
            {
             before(grammarAccess.getPayloadAccess().getPayloadAction_0_0()); 
            // InternalMyDsl.g:2622:2: ()
            // InternalMyDsl.g:2622:3: 
            {
            }

             after(grammarAccess.getPayloadAccess().getPayloadAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0__0__Impl"


    // $ANTLR start "rule__Payload__Group_0__1"
    // InternalMyDsl.g:2630:1: rule__Payload__Group_0__1 : rule__Payload__Group_0__1__Impl ;
    public final void rule__Payload__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2634:1: ( rule__Payload__Group_0__1__Impl )
            // InternalMyDsl.g:2635:2: rule__Payload__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0__1"


    // $ANTLR start "rule__Payload__Group_0__1__Impl"
    // InternalMyDsl.g:2641:1: rule__Payload__Group_0__1__Impl : ( ( rule__Payload__Group_0_1__0 ) ) ;
    public final void rule__Payload__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2645:1: ( ( ( rule__Payload__Group_0_1__0 ) ) )
            // InternalMyDsl.g:2646:1: ( ( rule__Payload__Group_0_1__0 ) )
            {
            // InternalMyDsl.g:2646:1: ( ( rule__Payload__Group_0_1__0 ) )
            // InternalMyDsl.g:2647:2: ( rule__Payload__Group_0_1__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup_0_1()); 
            // InternalMyDsl.g:2648:2: ( rule__Payload__Group_0_1__0 )
            // InternalMyDsl.g:2648:3: rule__Payload__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0__1__Impl"


    // $ANTLR start "rule__Payload__Group_0_1__0"
    // InternalMyDsl.g:2657:1: rule__Payload__Group_0_1__0 : rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1 ;
    public final void rule__Payload__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2661:1: ( rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1 )
            // InternalMyDsl.g:2662:2: rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Payload__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Payload__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0_1__0"


    // $ANTLR start "rule__Payload__Group_0_1__0__Impl"
    // InternalMyDsl.g:2669:1: rule__Payload__Group_0_1__0__Impl : ( ( rule__Payload__TypesAssignment_0_1_0 ) ) ;
    public final void rule__Payload__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2673:1: ( ( ( rule__Payload__TypesAssignment_0_1_0 ) ) )
            // InternalMyDsl.g:2674:1: ( ( rule__Payload__TypesAssignment_0_1_0 ) )
            {
            // InternalMyDsl.g:2674:1: ( ( rule__Payload__TypesAssignment_0_1_0 ) )
            // InternalMyDsl.g:2675:2: ( rule__Payload__TypesAssignment_0_1_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0_1_0()); 
            // InternalMyDsl.g:2676:2: ( rule__Payload__TypesAssignment_0_1_0 )
            // InternalMyDsl.g:2676:3: rule__Payload__TypesAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Payload__TypesAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getTypesAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0_1__0__Impl"


    // $ANTLR start "rule__Payload__Group_0_1__1"
    // InternalMyDsl.g:2684:1: rule__Payload__Group_0_1__1 : rule__Payload__Group_0_1__1__Impl ;
    public final void rule__Payload__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2688:1: ( rule__Payload__Group_0_1__1__Impl )
            // InternalMyDsl.g:2689:2: rule__Payload__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0_1__1"


    // $ANTLR start "rule__Payload__Group_0_1__1__Impl"
    // InternalMyDsl.g:2695:1: rule__Payload__Group_0_1__1__Impl : ( ( rule__Payload__Group_0_1_1__0 )* ) ;
    public final void rule__Payload__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2699:1: ( ( ( rule__Payload__Group_0_1_1__0 )* ) )
            // InternalMyDsl.g:2700:1: ( ( rule__Payload__Group_0_1_1__0 )* )
            {
            // InternalMyDsl.g:2700:1: ( ( rule__Payload__Group_0_1_1__0 )* )
            // InternalMyDsl.g:2701:2: ( rule__Payload__Group_0_1_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_0_1_1()); 
            // InternalMyDsl.g:2702:2: ( rule__Payload__Group_0_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2702:3: rule__Payload__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Payload__Group_0_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPayloadAccess().getGroup_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0_1__1__Impl"


    // $ANTLR start "rule__Payload__Group_0_1_1__0"
    // InternalMyDsl.g:2711:1: rule__Payload__Group_0_1_1__0 : rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1 ;
    public final void rule__Payload__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2715:1: ( rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1 )
            // InternalMyDsl.g:2716:2: rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Payload__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Payload__Group_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0_1_1__0"


    // $ANTLR start "rule__Payload__Group_0_1_1__0__Impl"
    // InternalMyDsl.g:2723:1: rule__Payload__Group_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2727:1: ( ( ',' ) )
            // InternalMyDsl.g:2728:1: ( ',' )
            {
            // InternalMyDsl.g:2728:1: ( ',' )
            // InternalMyDsl.g:2729:2: ','
            {
             before(grammarAccess.getPayloadAccess().getCommaKeyword_0_1_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPayloadAccess().getCommaKeyword_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__Payload__Group_0_1_1__1"
    // InternalMyDsl.g:2738:1: rule__Payload__Group_0_1_1__1 : rule__Payload__Group_0_1_1__1__Impl ;
    public final void rule__Payload__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2742:1: ( rule__Payload__Group_0_1_1__1__Impl )
            // InternalMyDsl.g:2743:2: rule__Payload__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group_0_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0_1_1__1"


    // $ANTLR start "rule__Payload__Group_0_1_1__1__Impl"
    // InternalMyDsl.g:2749:1: rule__Payload__Group_0_1_1__1__Impl : ( ( rule__Payload__TypesAssignment_0_1_1_1 ) ) ;
    public final void rule__Payload__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2753:1: ( ( ( rule__Payload__TypesAssignment_0_1_1_1 ) ) )
            // InternalMyDsl.g:2754:1: ( ( rule__Payload__TypesAssignment_0_1_1_1 ) )
            {
            // InternalMyDsl.g:2754:1: ( ( rule__Payload__TypesAssignment_0_1_1_1 ) )
            // InternalMyDsl.g:2755:2: ( rule__Payload__TypesAssignment_0_1_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0_1_1_1()); 
            // InternalMyDsl.g:2756:2: ( rule__Payload__TypesAssignment_0_1_1_1 )
            // InternalMyDsl.g:2756:3: rule__Payload__TypesAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Payload__TypesAssignment_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getTypesAssignment_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__0"
    // InternalMyDsl.g:2765:1: rule__LocalProtocol__Group__0 : rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 ;
    public final void rule__LocalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2769:1: ( rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 )
            // InternalMyDsl.g:2770:2: rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1
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
    // InternalMyDsl.g:2777:1: rule__LocalProtocol__Group__0__Impl : ( 'local' ) ;
    public final void rule__LocalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2781:1: ( ( 'local' ) )
            // InternalMyDsl.g:2782:1: ( 'local' )
            {
            // InternalMyDsl.g:2782:1: ( 'local' )
            // InternalMyDsl.g:2783:2: 'local'
            {
             before(grammarAccess.getLocalProtocolAccess().getLocalKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2792:1: rule__LocalProtocol__Group__1 : rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 ;
    public final void rule__LocalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2796:1: ( rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 )
            // InternalMyDsl.g:2797:2: rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2
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
    // InternalMyDsl.g:2804:1: rule__LocalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__LocalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2808:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:2809:1: ( 'protocol' )
            {
            // InternalMyDsl.g:2809:1: ( 'protocol' )
            // InternalMyDsl.g:2810:2: 'protocol'
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:2819:1: rule__LocalProtocol__Group__2 : rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 ;
    public final void rule__LocalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2823:1: ( rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 )
            // InternalMyDsl.g:2824:2: rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2831:1: rule__LocalProtocol__Group__2__Impl : ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__LocalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2835:1: ( ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:2836:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:2836:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:2837:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:2838:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:2838:3: rule__LocalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:2846:1: rule__LocalProtocol__Group__3 : rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 ;
    public final void rule__LocalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2850:1: ( rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 )
            // InternalMyDsl.g:2851:2: rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4
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
    // InternalMyDsl.g:2858:1: rule__LocalProtocol__Group__3__Impl : ( 'at' ) ;
    public final void rule__LocalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2862:1: ( ( 'at' ) )
            // InternalMyDsl.g:2863:1: ( 'at' )
            {
            // InternalMyDsl.g:2863:1: ( 'at' )
            // InternalMyDsl.g:2864:2: 'at'
            {
             before(grammarAccess.getLocalProtocolAccess().getAtKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2873:1: rule__LocalProtocol__Group__4 : rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 ;
    public final void rule__LocalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2877:1: ( rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 )
            // InternalMyDsl.g:2878:2: rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5
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
    // InternalMyDsl.g:2885:1: rule__LocalProtocol__Group__4__Impl : ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) ;
    public final void rule__LocalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2889:1: ( ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) )
            // InternalMyDsl.g:2890:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            {
            // InternalMyDsl.g:2890:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            // InternalMyDsl.g:2891:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_4()); 
            // InternalMyDsl.g:2892:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            // InternalMyDsl.g:2892:3: rule__LocalProtocol__ProjectedRoleAssignment_4
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
    // InternalMyDsl.g:2900:1: rule__LocalProtocol__Group__5 : rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 ;
    public final void rule__LocalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2904:1: ( rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 )
            // InternalMyDsl.g:2905:2: rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6
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
    // InternalMyDsl.g:2912:1: rule__LocalProtocol__Group__5__Impl : ( '(' ) ;
    public final void rule__LocalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2916:1: ( ( '(' ) )
            // InternalMyDsl.g:2917:1: ( '(' )
            {
            // InternalMyDsl.g:2917:1: ( '(' )
            // InternalMyDsl.g:2918:2: '('
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:2927:1: rule__LocalProtocol__Group__6 : rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 ;
    public final void rule__LocalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2931:1: ( rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 )
            // InternalMyDsl.g:2932:2: rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2939:1: rule__LocalProtocol__Group__6__Impl : ( ( rule__LocalProtocol__RolesAssignment_6 ) ) ;
    public final void rule__LocalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2943:1: ( ( ( rule__LocalProtocol__RolesAssignment_6 ) ) )
            // InternalMyDsl.g:2944:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            {
            // InternalMyDsl.g:2944:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            // InternalMyDsl.g:2945:2: ( rule__LocalProtocol__RolesAssignment_6 )
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesAssignment_6()); 
            // InternalMyDsl.g:2946:2: ( rule__LocalProtocol__RolesAssignment_6 )
            // InternalMyDsl.g:2946:3: rule__LocalProtocol__RolesAssignment_6
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
    // InternalMyDsl.g:2954:1: rule__LocalProtocol__Group__7 : rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 ;
    public final void rule__LocalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2958:1: ( rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 )
            // InternalMyDsl.g:2959:2: rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2966:1: rule__LocalProtocol__Group__7__Impl : ( ')' ) ;
    public final void rule__LocalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2970:1: ( ( ')' ) )
            // InternalMyDsl.g:2971:1: ( ')' )
            {
            // InternalMyDsl.g:2971:1: ( ')' )
            // InternalMyDsl.g:2972:2: ')'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2981:1: rule__LocalProtocol__Group__8 : rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 ;
    public final void rule__LocalProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2985:1: ( rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 )
            // InternalMyDsl.g:2986:2: rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2993:1: rule__LocalProtocol__Group__8__Impl : ( '{' ) ;
    public final void rule__LocalProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2997:1: ( ( '{' ) )
            // InternalMyDsl.g:2998:1: ( '{' )
            {
            // InternalMyDsl.g:2998:1: ( '{' )
            // InternalMyDsl.g:2999:2: '{'
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:3008:1: rule__LocalProtocol__Group__9 : rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 ;
    public final void rule__LocalProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3012:1: ( rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 )
            // InternalMyDsl.g:3013:2: rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10
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
    // InternalMyDsl.g:3020:1: rule__LocalProtocol__Group__9__Impl : ( ( rule__LocalProtocol__ProtocolAssignment_9 ) ) ;
    public final void rule__LocalProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3024:1: ( ( ( rule__LocalProtocol__ProtocolAssignment_9 ) ) )
            // InternalMyDsl.g:3025:1: ( ( rule__LocalProtocol__ProtocolAssignment_9 ) )
            {
            // InternalMyDsl.g:3025:1: ( ( rule__LocalProtocol__ProtocolAssignment_9 ) )
            // InternalMyDsl.g:3026:2: ( rule__LocalProtocol__ProtocolAssignment_9 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_9()); 
            // InternalMyDsl.g:3027:2: ( rule__LocalProtocol__ProtocolAssignment_9 )
            // InternalMyDsl.g:3027:3: rule__LocalProtocol__ProtocolAssignment_9
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
    // InternalMyDsl.g:3035:1: rule__LocalProtocol__Group__10 : rule__LocalProtocol__Group__10__Impl ;
    public final void rule__LocalProtocol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3039:1: ( rule__LocalProtocol__Group__10__Impl )
            // InternalMyDsl.g:3040:2: rule__LocalProtocol__Group__10__Impl
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
    // InternalMyDsl.g:3046:1: rule__LocalProtocol__Group__10__Impl : ( '}' ) ;
    public final void rule__LocalProtocol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3050:1: ( ( '}' ) )
            // InternalMyDsl.g:3051:1: ( '}' )
            {
            // InternalMyDsl.g:3051:1: ( '}' )
            // InternalMyDsl.g:3052:2: '}'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3062:1: rule__ProtocolL__Group__0 : rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1 ;
    public final void rule__ProtocolL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3066:1: ( rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1 )
            // InternalMyDsl.g:3067:2: rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3074:1: rule__ProtocolL__Group__0__Impl : ( () ) ;
    public final void rule__ProtocolL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3078:1: ( ( () ) )
            // InternalMyDsl.g:3079:1: ( () )
            {
            // InternalMyDsl.g:3079:1: ( () )
            // InternalMyDsl.g:3080:2: ()
            {
             before(grammarAccess.getProtocolLAccess().getProtocolLAction_0()); 
            // InternalMyDsl.g:3081:2: ()
            // InternalMyDsl.g:3081:3: 
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
    // InternalMyDsl.g:3089:1: rule__ProtocolL__Group__1 : rule__ProtocolL__Group__1__Impl rule__ProtocolL__Group__2 ;
    public final void rule__ProtocolL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3093:1: ( rule__ProtocolL__Group__1__Impl rule__ProtocolL__Group__2 )
            // InternalMyDsl.g:3094:2: rule__ProtocolL__Group__1__Impl rule__ProtocolL__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3101:1: rule__ProtocolL__Group__1__Impl : ( ( rule__ProtocolL__ActionsAssignment_1 )* ) ;
    public final void rule__ProtocolL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3105:1: ( ( ( rule__ProtocolL__ActionsAssignment_1 )* ) )
            // InternalMyDsl.g:3106:1: ( ( rule__ProtocolL__ActionsAssignment_1 )* )
            {
            // InternalMyDsl.g:3106:1: ( ( rule__ProtocolL__ActionsAssignment_1 )* )
            // InternalMyDsl.g:3107:2: ( rule__ProtocolL__ActionsAssignment_1 )*
            {
             before(grammarAccess.getProtocolLAccess().getActionsAssignment_1()); 
            // InternalMyDsl.g:3108:2: ( rule__ProtocolL__ActionsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==23||LA16_0==25||LA16_0==30||LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:3108:3: rule__ProtocolL__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ProtocolL__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:3116:1: rule__ProtocolL__Group__2 : rule__ProtocolL__Group__2__Impl ;
    public final void rule__ProtocolL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3120:1: ( rule__ProtocolL__Group__2__Impl )
            // InternalMyDsl.g:3121:2: rule__ProtocolL__Group__2__Impl
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
    // InternalMyDsl.g:3127:1: rule__ProtocolL__Group__2__Impl : ( ( 'End' )? ) ;
    public final void rule__ProtocolL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3131:1: ( ( ( 'End' )? ) )
            // InternalMyDsl.g:3132:1: ( ( 'End' )? )
            {
            // InternalMyDsl.g:3132:1: ( ( 'End' )? )
            // InternalMyDsl.g:3133:2: ( 'End' )?
            {
             before(grammarAccess.getProtocolLAccess().getEndKeyword_2()); 
            // InternalMyDsl.g:3134:2: ( 'End' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:3134:3: 'End'
                    {
                    match(input,38,FOLLOW_2); 

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
    // InternalMyDsl.g:3143:1: rule__RecursionL__Group__0 : rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 ;
    public final void rule__RecursionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3147:1: ( rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 )
            // InternalMyDsl.g:3148:2: rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1
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
    // InternalMyDsl.g:3155:1: rule__RecursionL__Group__0__Impl : ( 'rec' ) ;
    public final void rule__RecursionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3159:1: ( ( 'rec' ) )
            // InternalMyDsl.g:3160:1: ( 'rec' )
            {
            // InternalMyDsl.g:3160:1: ( 'rec' )
            // InternalMyDsl.g:3161:2: 'rec'
            {
             before(grammarAccess.getRecursionLAccess().getRecKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:3170:1: rule__RecursionL__Group__1 : rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 ;
    public final void rule__RecursionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3174:1: ( rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 )
            // InternalMyDsl.g:3175:2: rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2
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
    // InternalMyDsl.g:3182:1: rule__RecursionL__Group__1__Impl : ( ( rule__RecursionL__NameAssignment_1 ) ) ;
    public final void rule__RecursionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3186:1: ( ( ( rule__RecursionL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3187:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3187:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            // InternalMyDsl.g:3188:2: ( rule__RecursionL__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3189:2: ( rule__RecursionL__NameAssignment_1 )
            // InternalMyDsl.g:3189:3: rule__RecursionL__NameAssignment_1
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
    // InternalMyDsl.g:3197:1: rule__RecursionL__Group__2 : rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3 ;
    public final void rule__RecursionL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3201:1: ( rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3 )
            // InternalMyDsl.g:3202:2: rule__RecursionL__Group__2__Impl rule__RecursionL__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:3209:1: rule__RecursionL__Group__2__Impl : ( ':' ) ;
    public final void rule__RecursionL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3213:1: ( ( ':' ) )
            // InternalMyDsl.g:3214:1: ( ':' )
            {
            // InternalMyDsl.g:3214:1: ( ':' )
            // InternalMyDsl.g:3215:2: ':'
            {
             before(grammarAccess.getRecursionLAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:3224:1: rule__RecursionL__Group__3 : rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4 ;
    public final void rule__RecursionL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3228:1: ( rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4 )
            // InternalMyDsl.g:3229:2: rule__RecursionL__Group__3__Impl rule__RecursionL__Group__4
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
    // InternalMyDsl.g:3236:1: rule__RecursionL__Group__3__Impl : ( '{' ) ;
    public final void rule__RecursionL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3240:1: ( ( '{' ) )
            // InternalMyDsl.g:3241:1: ( '{' )
            {
            // InternalMyDsl.g:3241:1: ( '{' )
            // InternalMyDsl.g:3242:2: '{'
            {
             before(grammarAccess.getRecursionLAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:3251:1: rule__RecursionL__Group__4 : rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5 ;
    public final void rule__RecursionL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3255:1: ( rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5 )
            // InternalMyDsl.g:3256:2: rule__RecursionL__Group__4__Impl rule__RecursionL__Group__5
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
    // InternalMyDsl.g:3263:1: rule__RecursionL__Group__4__Impl : ( ( rule__RecursionL__RecProtocolAssignment_4 ) ) ;
    public final void rule__RecursionL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3267:1: ( ( ( rule__RecursionL__RecProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:3268:1: ( ( rule__RecursionL__RecProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:3268:1: ( ( rule__RecursionL__RecProtocolAssignment_4 ) )
            // InternalMyDsl.g:3269:2: ( rule__RecursionL__RecProtocolAssignment_4 )
            {
             before(grammarAccess.getRecursionLAccess().getRecProtocolAssignment_4()); 
            // InternalMyDsl.g:3270:2: ( rule__RecursionL__RecProtocolAssignment_4 )
            // InternalMyDsl.g:3270:3: rule__RecursionL__RecProtocolAssignment_4
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
    // InternalMyDsl.g:3278:1: rule__RecursionL__Group__5 : rule__RecursionL__Group__5__Impl ;
    public final void rule__RecursionL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3282:1: ( rule__RecursionL__Group__5__Impl )
            // InternalMyDsl.g:3283:2: rule__RecursionL__Group__5__Impl
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
    // InternalMyDsl.g:3289:1: rule__RecursionL__Group__5__Impl : ( '}' ) ;
    public final void rule__RecursionL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3293:1: ( ( '}' ) )
            // InternalMyDsl.g:3294:1: ( '}' )
            {
            // InternalMyDsl.g:3294:1: ( '}' )
            // InternalMyDsl.g:3295:2: '}'
            {
             before(grammarAccess.getRecursionLAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3305:1: rule__MessageL__Group__0 : rule__MessageL__Group__0__Impl rule__MessageL__Group__1 ;
    public final void rule__MessageL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3309:1: ( rule__MessageL__Group__0__Impl rule__MessageL__Group__1 )
            // InternalMyDsl.g:3310:2: rule__MessageL__Group__0__Impl rule__MessageL__Group__1
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
    // InternalMyDsl.g:3317:1: rule__MessageL__Group__0__Impl : ( ( rule__MessageL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3321:1: ( ( ( rule__MessageL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3322:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3322:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:3323:2: ( rule__MessageL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:3324:2: ( rule__MessageL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:3324:3: rule__MessageL__MessageTypeAssignment_0
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
    // InternalMyDsl.g:3332:1: rule__MessageL__Group__1 : rule__MessageL__Group__1__Impl rule__MessageL__Group__2 ;
    public final void rule__MessageL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3336:1: ( rule__MessageL__Group__1__Impl rule__MessageL__Group__2 )
            // InternalMyDsl.g:3337:2: rule__MessageL__Group__1__Impl rule__MessageL__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3344:1: rule__MessageL__Group__1__Impl : ( '(' ) ;
    public final void rule__MessageL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3348:1: ( ( '(' ) )
            // InternalMyDsl.g:3349:1: ( '(' )
            {
            // InternalMyDsl.g:3349:1: ( '(' )
            // InternalMyDsl.g:3350:2: '('
            {
             before(grammarAccess.getMessageLAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:3359:1: rule__MessageL__Group__2 : rule__MessageL__Group__2__Impl rule__MessageL__Group__3 ;
    public final void rule__MessageL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3363:1: ( rule__MessageL__Group__2__Impl rule__MessageL__Group__3 )
            // InternalMyDsl.g:3364:2: rule__MessageL__Group__2__Impl rule__MessageL__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3371:1: rule__MessageL__Group__2__Impl : ( ( rule__MessageL__PayloadAssignment_2 )? ) ;
    public final void rule__MessageL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3375:1: ( ( ( rule__MessageL__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:3376:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:3376:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            // InternalMyDsl.g:3377:2: ( rule__MessageL__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageLAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:3378:2: ( rule__MessageL__PayloadAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=11 && LA18_0<=13)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:3378:3: rule__MessageL__PayloadAssignment_2
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
    // InternalMyDsl.g:3386:1: rule__MessageL__Group__3 : rule__MessageL__Group__3__Impl rule__MessageL__Group__4 ;
    public final void rule__MessageL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3390:1: ( rule__MessageL__Group__3__Impl rule__MessageL__Group__4 )
            // InternalMyDsl.g:3391:2: rule__MessageL__Group__3__Impl rule__MessageL__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3398:1: rule__MessageL__Group__3__Impl : ( ')' ) ;
    public final void rule__MessageL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3402:1: ( ( ')' ) )
            // InternalMyDsl.g:3403:1: ( ')' )
            {
            // InternalMyDsl.g:3403:1: ( ')' )
            // InternalMyDsl.g:3404:2: ')'
            {
             before(grammarAccess.getMessageLAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:3413:1: rule__MessageL__Group__4 : rule__MessageL__Group__4__Impl rule__MessageL__Group__5 ;
    public final void rule__MessageL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3417:1: ( rule__MessageL__Group__4__Impl rule__MessageL__Group__5 )
            // InternalMyDsl.g:3418:2: rule__MessageL__Group__4__Impl rule__MessageL__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3425:1: rule__MessageL__Group__4__Impl : ( ( rule__MessageL__SendReceiveAssignment_4 ) ) ;
    public final void rule__MessageL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3429:1: ( ( ( rule__MessageL__SendReceiveAssignment_4 ) ) )
            // InternalMyDsl.g:3430:1: ( ( rule__MessageL__SendReceiveAssignment_4 ) )
            {
            // InternalMyDsl.g:3430:1: ( ( rule__MessageL__SendReceiveAssignment_4 ) )
            // InternalMyDsl.g:3431:2: ( rule__MessageL__SendReceiveAssignment_4 )
            {
             before(grammarAccess.getMessageLAccess().getSendReceiveAssignment_4()); 
            // InternalMyDsl.g:3432:2: ( rule__MessageL__SendReceiveAssignment_4 )
            // InternalMyDsl.g:3432:3: rule__MessageL__SendReceiveAssignment_4
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
    // InternalMyDsl.g:3440:1: rule__MessageL__Group__5 : rule__MessageL__Group__5__Impl ;
    public final void rule__MessageL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3444:1: ( rule__MessageL__Group__5__Impl )
            // InternalMyDsl.g:3445:2: rule__MessageL__Group__5__Impl
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
    // InternalMyDsl.g:3451:1: rule__MessageL__Group__5__Impl : ( '.' ) ;
    public final void rule__MessageL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3455:1: ( ( '.' ) )
            // InternalMyDsl.g:3456:1: ( '.' )
            {
            // InternalMyDsl.g:3456:1: ( '.' )
            // InternalMyDsl.g:3457:2: '.'
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
    // InternalMyDsl.g:3467:1: rule__SenderL__Group__0 : rule__SenderL__Group__0__Impl rule__SenderL__Group__1 ;
    public final void rule__SenderL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3471:1: ( rule__SenderL__Group__0__Impl rule__SenderL__Group__1 )
            // InternalMyDsl.g:3472:2: rule__SenderL__Group__0__Impl rule__SenderL__Group__1
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
    // InternalMyDsl.g:3479:1: rule__SenderL__Group__0__Impl : ( 'from' ) ;
    public final void rule__SenderL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3483:1: ( ( 'from' ) )
            // InternalMyDsl.g:3484:1: ( 'from' )
            {
            // InternalMyDsl.g:3484:1: ( 'from' )
            // InternalMyDsl.g:3485:2: 'from'
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
    // InternalMyDsl.g:3494:1: rule__SenderL__Group__1 : rule__SenderL__Group__1__Impl ;
    public final void rule__SenderL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3498:1: ( rule__SenderL__Group__1__Impl )
            // InternalMyDsl.g:3499:2: rule__SenderL__Group__1__Impl
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
    // InternalMyDsl.g:3505:1: rule__SenderL__Group__1__Impl : ( ( rule__SenderL__RoleAssignment_1 ) ) ;
    public final void rule__SenderL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3509:1: ( ( ( rule__SenderL__RoleAssignment_1 ) ) )
            // InternalMyDsl.g:3510:1: ( ( rule__SenderL__RoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3510:1: ( ( rule__SenderL__RoleAssignment_1 ) )
            // InternalMyDsl.g:3511:2: ( rule__SenderL__RoleAssignment_1 )
            {
             before(grammarAccess.getSenderLAccess().getRoleAssignment_1()); 
            // InternalMyDsl.g:3512:2: ( rule__SenderL__RoleAssignment_1 )
            // InternalMyDsl.g:3512:3: rule__SenderL__RoleAssignment_1
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
    // InternalMyDsl.g:3521:1: rule__ReceiverL__Group__0 : rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 ;
    public final void rule__ReceiverL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3525:1: ( rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 )
            // InternalMyDsl.g:3526:2: rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1
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
    // InternalMyDsl.g:3533:1: rule__ReceiverL__Group__0__Impl : ( 'to' ) ;
    public final void rule__ReceiverL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3537:1: ( ( 'to' ) )
            // InternalMyDsl.g:3538:1: ( 'to' )
            {
            // InternalMyDsl.g:3538:1: ( 'to' )
            // InternalMyDsl.g:3539:2: 'to'
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
    // InternalMyDsl.g:3548:1: rule__ReceiverL__Group__1 : rule__ReceiverL__Group__1__Impl ;
    public final void rule__ReceiverL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3552:1: ( rule__ReceiverL__Group__1__Impl )
            // InternalMyDsl.g:3553:2: rule__ReceiverL__Group__1__Impl
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
    // InternalMyDsl.g:3559:1: rule__ReceiverL__Group__1__Impl : ( ( rule__ReceiverL__RoleAssignment_1 ) ) ;
    public final void rule__ReceiverL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3563:1: ( ( ( rule__ReceiverL__RoleAssignment_1 ) ) )
            // InternalMyDsl.g:3564:1: ( ( rule__ReceiverL__RoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3564:1: ( ( rule__ReceiverL__RoleAssignment_1 ) )
            // InternalMyDsl.g:3565:2: ( rule__ReceiverL__RoleAssignment_1 )
            {
             before(grammarAccess.getReceiverLAccess().getRoleAssignment_1()); 
            // InternalMyDsl.g:3566:2: ( rule__ReceiverL__RoleAssignment_1 )
            // InternalMyDsl.g:3566:3: rule__ReceiverL__RoleAssignment_1
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
    // InternalMyDsl.g:3575:1: rule__ChoiceL__Group__0 : rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 ;
    public final void rule__ChoiceL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3579:1: ( rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 )
            // InternalMyDsl.g:3580:2: rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3587:1: rule__ChoiceL__Group__0__Impl : ( 'choice' ) ;
    public final void rule__ChoiceL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3591:1: ( ( 'choice' ) )
            // InternalMyDsl.g:3592:1: ( 'choice' )
            {
            // InternalMyDsl.g:3592:1: ( 'choice' )
            // InternalMyDsl.g:3593:2: 'choice'
            {
             before(grammarAccess.getChoiceLAccess().getChoiceKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:3602:1: rule__ChoiceL__Group__1 : rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 ;
    public final void rule__ChoiceL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3606:1: ( rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 )
            // InternalMyDsl.g:3607:2: rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2
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
    // InternalMyDsl.g:3614:1: rule__ChoiceL__Group__1__Impl : ( 'at' ) ;
    public final void rule__ChoiceL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3618:1: ( ( 'at' ) )
            // InternalMyDsl.g:3619:1: ( 'at' )
            {
            // InternalMyDsl.g:3619:1: ( 'at' )
            // InternalMyDsl.g:3620:2: 'at'
            {
             before(grammarAccess.getChoiceLAccess().getAtKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:3629:1: rule__ChoiceL__Group__2 : rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 ;
    public final void rule__ChoiceL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3633:1: ( rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 )
            // InternalMyDsl.g:3634:2: rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:3641:1: rule__ChoiceL__Group__2__Impl : ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) ) ;
    public final void rule__ChoiceL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3645:1: ( ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) ) )
            // InternalMyDsl.g:3646:1: ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) )
            {
            // InternalMyDsl.g:3646:1: ( ( rule__ChoiceL__RoleMakingChoiceAssignment_2 ) )
            // InternalMyDsl.g:3647:2: ( rule__ChoiceL__RoleMakingChoiceAssignment_2 )
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceAssignment_2()); 
            // InternalMyDsl.g:3648:2: ( rule__ChoiceL__RoleMakingChoiceAssignment_2 )
            // InternalMyDsl.g:3648:3: rule__ChoiceL__RoleMakingChoiceAssignment_2
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
    // InternalMyDsl.g:3656:1: rule__ChoiceL__Group__3 : rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 ;
    public final void rule__ChoiceL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3660:1: ( rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 )
            // InternalMyDsl.g:3661:2: rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3668:1: rule__ChoiceL__Group__3__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3672:1: ( ( '{' ) )
            // InternalMyDsl.g:3673:1: ( '{' )
            {
            // InternalMyDsl.g:3673:1: ( '{' )
            // InternalMyDsl.g:3674:2: '{'
            {
             before(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:3683:1: rule__ChoiceL__Group__4 : rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 ;
    public final void rule__ChoiceL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3687:1: ( rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 )
            // InternalMyDsl.g:3688:2: rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5
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
    // InternalMyDsl.g:3695:1: rule__ChoiceL__Group__4__Impl : ( ( rule__ChoiceL__BranchesAssignment_4 ) ) ;
    public final void rule__ChoiceL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3699:1: ( ( ( rule__ChoiceL__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:3700:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:3700:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            // InternalMyDsl.g:3701:2: ( rule__ChoiceL__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:3702:2: ( rule__ChoiceL__BranchesAssignment_4 )
            // InternalMyDsl.g:3702:3: rule__ChoiceL__BranchesAssignment_4
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
    // InternalMyDsl.g:3710:1: rule__ChoiceL__Group__5 : rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 ;
    public final void rule__ChoiceL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3714:1: ( rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 )
            // InternalMyDsl.g:3715:2: rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:3722:1: rule__ChoiceL__Group__5__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3726:1: ( ( '}' ) )
            // InternalMyDsl.g:3727:1: ( '}' )
            {
            // InternalMyDsl.g:3727:1: ( '}' )
            // InternalMyDsl.g:3728:2: '}'
            {
             before(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3737:1: rule__ChoiceL__Group__6 : rule__ChoiceL__Group__6__Impl ;
    public final void rule__ChoiceL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3741:1: ( rule__ChoiceL__Group__6__Impl )
            // InternalMyDsl.g:3742:2: rule__ChoiceL__Group__6__Impl
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
    // InternalMyDsl.g:3748:1: rule__ChoiceL__Group__6__Impl : ( ( rule__ChoiceL__Group_6__0 )* ) ;
    public final void rule__ChoiceL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3752:1: ( ( ( rule__ChoiceL__Group_6__0 )* ) )
            // InternalMyDsl.g:3753:1: ( ( rule__ChoiceL__Group_6__0 )* )
            {
            // InternalMyDsl.g:3753:1: ( ( rule__ChoiceL__Group_6__0 )* )
            // InternalMyDsl.g:3754:2: ( rule__ChoiceL__Group_6__0 )*
            {
             before(grammarAccess.getChoiceLAccess().getGroup_6()); 
            // InternalMyDsl.g:3755:2: ( rule__ChoiceL__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:3755:3: rule__ChoiceL__Group_6__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ChoiceL__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMyDsl.g:3764:1: rule__ChoiceL__Group_6__0 : rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 ;
    public final void rule__ChoiceL__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3768:1: ( rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 )
            // InternalMyDsl.g:3769:2: rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:3776:1: rule__ChoiceL__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__ChoiceL__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3780:1: ( ( 'or' ) )
            // InternalMyDsl.g:3781:1: ( 'or' )
            {
            // InternalMyDsl.g:3781:1: ( 'or' )
            // InternalMyDsl.g:3782:2: 'or'
            {
             before(grammarAccess.getChoiceLAccess().getOrKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:3791:1: rule__ChoiceL__Group_6__1 : rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 ;
    public final void rule__ChoiceL__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3795:1: ( rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 )
            // InternalMyDsl.g:3796:2: rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3803:1: rule__ChoiceL__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3807:1: ( ( '{' ) )
            // InternalMyDsl.g:3808:1: ( '{' )
            {
            // InternalMyDsl.g:3808:1: ( '{' )
            // InternalMyDsl.g:3809:2: '{'
            {
             before(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:3818:1: rule__ChoiceL__Group_6__2 : rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 ;
    public final void rule__ChoiceL__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3822:1: ( rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 )
            // InternalMyDsl.g:3823:2: rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3
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
    // InternalMyDsl.g:3830:1: rule__ChoiceL__Group_6__2__Impl : ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) ;
    public final void rule__ChoiceL__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3834:1: ( ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:3835:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:3835:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:3836:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:3837:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            // InternalMyDsl.g:3837:3: rule__ChoiceL__BranchesAssignment_6_2
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
    // InternalMyDsl.g:3845:1: rule__ChoiceL__Group_6__3 : rule__ChoiceL__Group_6__3__Impl ;
    public final void rule__ChoiceL__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3849:1: ( rule__ChoiceL__Group_6__3__Impl )
            // InternalMyDsl.g:3850:2: rule__ChoiceL__Group_6__3__Impl
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
    // InternalMyDsl.g:3856:1: rule__ChoiceL__Group_6__3__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3860:1: ( ( '}' ) )
            // InternalMyDsl.g:3861:1: ( '}' )
            {
            // InternalMyDsl.g:3861:1: ( '}' )
            // InternalMyDsl.g:3862:2: '}'
            {
             before(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3872:1: rule__ChoiceBranchL__Group_0__0 : rule__ChoiceBranchL__Group_0__0__Impl rule__ChoiceBranchL__Group_0__1 ;
    public final void rule__ChoiceBranchL__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3876:1: ( rule__ChoiceBranchL__Group_0__0__Impl rule__ChoiceBranchL__Group_0__1 )
            // InternalMyDsl.g:3877:2: rule__ChoiceBranchL__Group_0__0__Impl rule__ChoiceBranchL__Group_0__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3884:1: rule__ChoiceBranchL__Group_0__0__Impl : ( () ) ;
    public final void rule__ChoiceBranchL__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3888:1: ( ( () ) )
            // InternalMyDsl.g:3889:1: ( () )
            {
            // InternalMyDsl.g:3889:1: ( () )
            // InternalMyDsl.g:3890:2: ()
            {
             before(grammarAccess.getChoiceBranchLAccess().getChoiceBranchLAction_0_0()); 
            // InternalMyDsl.g:3891:2: ()
            // InternalMyDsl.g:3891:3: 
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
    // InternalMyDsl.g:3899:1: rule__ChoiceBranchL__Group_0__1 : rule__ChoiceBranchL__Group_0__1__Impl ;
    public final void rule__ChoiceBranchL__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3903:1: ( rule__ChoiceBranchL__Group_0__1__Impl )
            // InternalMyDsl.g:3904:2: rule__ChoiceBranchL__Group_0__1__Impl
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
    // InternalMyDsl.g:3910:1: rule__ChoiceBranchL__Group_0__1__Impl : ( 'End' ) ;
    public final void rule__ChoiceBranchL__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3914:1: ( ( 'End' ) )
            // InternalMyDsl.g:3915:1: ( 'End' )
            {
            // InternalMyDsl.g:3915:1: ( 'End' )
            // InternalMyDsl.g:3916:2: 'End'
            {
             before(grammarAccess.getChoiceBranchLAccess().getEndKeyword_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:3926:1: rule__ChoiceBranchL__Group_1__0 : rule__ChoiceBranchL__Group_1__0__Impl rule__ChoiceBranchL__Group_1__1 ;
    public final void rule__ChoiceBranchL__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3930:1: ( rule__ChoiceBranchL__Group_1__0__Impl rule__ChoiceBranchL__Group_1__1 )
            // InternalMyDsl.g:3931:2: rule__ChoiceBranchL__Group_1__0__Impl rule__ChoiceBranchL__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3938:1: rule__ChoiceBranchL__Group_1__0__Impl : ( ( rule__ChoiceBranchL__MessageAssignment_1_0 ) ) ;
    public final void rule__ChoiceBranchL__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3942:1: ( ( ( rule__ChoiceBranchL__MessageAssignment_1_0 ) ) )
            // InternalMyDsl.g:3943:1: ( ( rule__ChoiceBranchL__MessageAssignment_1_0 ) )
            {
            // InternalMyDsl.g:3943:1: ( ( rule__ChoiceBranchL__MessageAssignment_1_0 ) )
            // InternalMyDsl.g:3944:2: ( rule__ChoiceBranchL__MessageAssignment_1_0 )
            {
             before(grammarAccess.getChoiceBranchLAccess().getMessageAssignment_1_0()); 
            // InternalMyDsl.g:3945:2: ( rule__ChoiceBranchL__MessageAssignment_1_0 )
            // InternalMyDsl.g:3945:3: rule__ChoiceBranchL__MessageAssignment_1_0
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
    // InternalMyDsl.g:3953:1: rule__ChoiceBranchL__Group_1__1 : rule__ChoiceBranchL__Group_1__1__Impl ;
    public final void rule__ChoiceBranchL__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3957:1: ( rule__ChoiceBranchL__Group_1__1__Impl )
            // InternalMyDsl.g:3958:2: rule__ChoiceBranchL__Group_1__1__Impl
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
    // InternalMyDsl.g:3964:1: rule__ChoiceBranchL__Group_1__1__Impl : ( ( rule__ChoiceBranchL__ProtocolAssignment_1_1 ) ) ;
    public final void rule__ChoiceBranchL__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3968:1: ( ( ( rule__ChoiceBranchL__ProtocolAssignment_1_1 ) ) )
            // InternalMyDsl.g:3969:1: ( ( rule__ChoiceBranchL__ProtocolAssignment_1_1 ) )
            {
            // InternalMyDsl.g:3969:1: ( ( rule__ChoiceBranchL__ProtocolAssignment_1_1 ) )
            // InternalMyDsl.g:3970:2: ( rule__ChoiceBranchL__ProtocolAssignment_1_1 )
            {
             before(grammarAccess.getChoiceBranchLAccess().getProtocolAssignment_1_1()); 
            // InternalMyDsl.g:3971:2: ( rule__ChoiceBranchL__ProtocolAssignment_1_1 )
            // InternalMyDsl.g:3971:3: rule__ChoiceBranchL__ProtocolAssignment_1_1
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
    // InternalMyDsl.g:3980:1: rule__ForEachL__Group__0 : rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 ;
    public final void rule__ForEachL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3984:1: ( rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 )
            // InternalMyDsl.g:3985:2: rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:3992:1: rule__ForEachL__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEachL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3996:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:3997:1: ( 'foreach' )
            {
            // InternalMyDsl.g:3997:1: ( 'foreach' )
            // InternalMyDsl.g:3998:2: 'foreach'
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
    // InternalMyDsl.g:4007:1: rule__ForEachL__Group__1 : rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 ;
    public final void rule__ForEachL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4011:1: ( rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 )
            // InternalMyDsl.g:4012:2: rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2
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
    // InternalMyDsl.g:4019:1: rule__ForEachL__Group__1__Impl : ( ( rule__ForEachL__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEachL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4023:1: ( ( ( rule__ForEachL__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:4024:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:4024:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:4025:2: ( rule__ForEachL__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachLAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:4026:2: ( rule__ForEachL__EachRoleAssignment_1 )
            // InternalMyDsl.g:4026:3: rule__ForEachL__EachRoleAssignment_1
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
    // InternalMyDsl.g:4034:1: rule__ForEachL__Group__2 : rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 ;
    public final void rule__ForEachL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4038:1: ( rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 )
            // InternalMyDsl.g:4039:2: rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:4046:1: rule__ForEachL__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEachL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4050:1: ( ( ':' ) )
            // InternalMyDsl.g:4051:1: ( ':' )
            {
            // InternalMyDsl.g:4051:1: ( ':' )
            // InternalMyDsl.g:4052:2: ':'
            {
             before(grammarAccess.getForEachLAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:4061:1: rule__ForEachL__Group__3 : rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 ;
    public final void rule__ForEachL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4065:1: ( rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 )
            // InternalMyDsl.g:4066:2: rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4
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
    // InternalMyDsl.g:4073:1: rule__ForEachL__Group__3__Impl : ( '<' ) ;
    public final void rule__ForEachL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4077:1: ( ( '<' ) )
            // InternalMyDsl.g:4078:1: ( '<' )
            {
            // InternalMyDsl.g:4078:1: ( '<' )
            // InternalMyDsl.g:4079:2: '<'
            {
             before(grammarAccess.getForEachLAccess().getLessThanSignKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:4088:1: rule__ForEachL__Group__4 : rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 ;
    public final void rule__ForEachL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4092:1: ( rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 )
            // InternalMyDsl.g:4093:2: rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5
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
    // InternalMyDsl.g:4100:1: rule__ForEachL__Group__4__Impl : ( ( rule__ForEachL__RolesetAssignment_4 ) ) ;
    public final void rule__ForEachL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4104:1: ( ( ( rule__ForEachL__RolesetAssignment_4 ) ) )
            // InternalMyDsl.g:4105:1: ( ( rule__ForEachL__RolesetAssignment_4 ) )
            {
            // InternalMyDsl.g:4105:1: ( ( rule__ForEachL__RolesetAssignment_4 ) )
            // InternalMyDsl.g:4106:2: ( rule__ForEachL__RolesetAssignment_4 )
            {
             before(grammarAccess.getForEachLAccess().getRolesetAssignment_4()); 
            // InternalMyDsl.g:4107:2: ( rule__ForEachL__RolesetAssignment_4 )
            // InternalMyDsl.g:4107:3: rule__ForEachL__RolesetAssignment_4
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
    // InternalMyDsl.g:4115:1: rule__ForEachL__Group__5 : rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 ;
    public final void rule__ForEachL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4119:1: ( rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 )
            // InternalMyDsl.g:4120:2: rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6
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
    // InternalMyDsl.g:4127:1: rule__ForEachL__Group__5__Impl : ( ',' ) ;
    public final void rule__ForEachL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4131:1: ( ( ',' ) )
            // InternalMyDsl.g:4132:1: ( ',' )
            {
            // InternalMyDsl.g:4132:1: ( ',' )
            // InternalMyDsl.g:4133:2: ','
            {
             before(grammarAccess.getForEachLAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:4142:1: rule__ForEachL__Group__6 : rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7 ;
    public final void rule__ForEachL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4146:1: ( rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7 )
            // InternalMyDsl.g:4147:2: rule__ForEachL__Group__6__Impl rule__ForEachL__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:4154:1: rule__ForEachL__Group__6__Impl : ( ( rule__ForEachL__RefroleAssignment_6 ) ) ;
    public final void rule__ForEachL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4158:1: ( ( ( rule__ForEachL__RefroleAssignment_6 ) ) )
            // InternalMyDsl.g:4159:1: ( ( rule__ForEachL__RefroleAssignment_6 ) )
            {
            // InternalMyDsl.g:4159:1: ( ( rule__ForEachL__RefroleAssignment_6 ) )
            // InternalMyDsl.g:4160:2: ( rule__ForEachL__RefroleAssignment_6 )
            {
             before(grammarAccess.getForEachLAccess().getRefroleAssignment_6()); 
            // InternalMyDsl.g:4161:2: ( rule__ForEachL__RefroleAssignment_6 )
            // InternalMyDsl.g:4161:3: rule__ForEachL__RefroleAssignment_6
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
    // InternalMyDsl.g:4169:1: rule__ForEachL__Group__7 : rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8 ;
    public final void rule__ForEachL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4173:1: ( rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8 )
            // InternalMyDsl.g:4174:2: rule__ForEachL__Group__7__Impl rule__ForEachL__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4181:1: rule__ForEachL__Group__7__Impl : ( '>' ) ;
    public final void rule__ForEachL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4185:1: ( ( '>' ) )
            // InternalMyDsl.g:4186:1: ( '>' )
            {
            // InternalMyDsl.g:4186:1: ( '>' )
            // InternalMyDsl.g:4187:2: '>'
            {
             before(grammarAccess.getForEachLAccess().getGreaterThanSignKeyword_7()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:4196:1: rule__ForEachL__Group__8 : rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9 ;
    public final void rule__ForEachL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4200:1: ( rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9 )
            // InternalMyDsl.g:4201:2: rule__ForEachL__Group__8__Impl rule__ForEachL__Group__9
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
    // InternalMyDsl.g:4208:1: rule__ForEachL__Group__8__Impl : ( '{' ) ;
    public final void rule__ForEachL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4212:1: ( ( '{' ) )
            // InternalMyDsl.g:4213:1: ( '{' )
            {
            // InternalMyDsl.g:4213:1: ( '{' )
            // InternalMyDsl.g:4214:2: '{'
            {
             before(grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:4223:1: rule__ForEachL__Group__9 : rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10 ;
    public final void rule__ForEachL__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4227:1: ( rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10 )
            // InternalMyDsl.g:4228:2: rule__ForEachL__Group__9__Impl rule__ForEachL__Group__10
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
    // InternalMyDsl.g:4235:1: rule__ForEachL__Group__9__Impl : ( ( rule__ForEachL__BranchAssignment_9 ) ) ;
    public final void rule__ForEachL__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4239:1: ( ( ( rule__ForEachL__BranchAssignment_9 ) ) )
            // InternalMyDsl.g:4240:1: ( ( rule__ForEachL__BranchAssignment_9 ) )
            {
            // InternalMyDsl.g:4240:1: ( ( rule__ForEachL__BranchAssignment_9 ) )
            // InternalMyDsl.g:4241:2: ( rule__ForEachL__BranchAssignment_9 )
            {
             before(grammarAccess.getForEachLAccess().getBranchAssignment_9()); 
            // InternalMyDsl.g:4242:2: ( rule__ForEachL__BranchAssignment_9 )
            // InternalMyDsl.g:4242:3: rule__ForEachL__BranchAssignment_9
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
    // InternalMyDsl.g:4250:1: rule__ForEachL__Group__10 : rule__ForEachL__Group__10__Impl ;
    public final void rule__ForEachL__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4254:1: ( rule__ForEachL__Group__10__Impl )
            // InternalMyDsl.g:4255:2: rule__ForEachL__Group__10__Impl
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
    // InternalMyDsl.g:4261:1: rule__ForEachL__Group__10__Impl : ( '}' ) ;
    public final void rule__ForEachL__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4265:1: ( ( '}' ) )
            // InternalMyDsl.g:4266:1: ( '}' )
            {
            // InternalMyDsl.g:4266:1: ( '}' )
            // InternalMyDsl.g:4267:2: '}'
            {
             before(grammarAccess.getForEachLAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:4277:1: rule__Model__ProtocolAssignment_0 : ( ruleGlobalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4281:1: ( ( ruleGlobalProtocol ) )
            // InternalMyDsl.g:4282:2: ( ruleGlobalProtocol )
            {
            // InternalMyDsl.g:4282:2: ( ruleGlobalProtocol )
            // InternalMyDsl.g:4283:3: ruleGlobalProtocol
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
    // InternalMyDsl.g:4292:1: rule__Model__ProtocolAssignment_1 : ( ruleLocalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4296:1: ( ( ruleLocalProtocol ) )
            // InternalMyDsl.g:4297:2: ( ruleLocalProtocol )
            {
            // InternalMyDsl.g:4297:2: ( ruleLocalProtocol )
            // InternalMyDsl.g:4298:3: ruleLocalProtocol
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
    // InternalMyDsl.g:4307:1: rule__GlobalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4311:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4312:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4312:2: ( RULE_ID )
            // InternalMyDsl.g:4313:3: RULE_ID
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
    // InternalMyDsl.g:4322:1: rule__GlobalProtocol__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__GlobalProtocol__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4326:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:4327:2: ( ruleRoles )
            {
            // InternalMyDsl.g:4327:2: ( ruleRoles )
            // InternalMyDsl.g:4328:3: ruleRoles
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
    // InternalMyDsl.g:4337:1: rule__GlobalProtocol__ProtocolAssignment_6 : ( ruleProtocol ) ;
    public final void rule__GlobalProtocol__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4341:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4342:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4342:2: ( ruleProtocol )
            // InternalMyDsl.g:4343:3: ruleProtocol
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
    // InternalMyDsl.g:4352:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4356:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4357:2: ( ruleRole )
            {
            // InternalMyDsl.g:4357:2: ( ruleRole )
            // InternalMyDsl.g:4358:3: ruleRole
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
    // InternalMyDsl.g:4367:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4371:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4372:2: ( ruleRole )
            {
            // InternalMyDsl.g:4372:2: ( ruleRole )
            // InternalMyDsl.g:4373:3: ruleRole
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
    // InternalMyDsl.g:4382:1: rule__RoleOne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4386:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4387:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4387:2: ( RULE_ID )
            // InternalMyDsl.g:4388:3: RULE_ID
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
    // InternalMyDsl.g:4397:1: rule__RoleSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4401:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4402:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4402:2: ( RULE_ID )
            // InternalMyDsl.g:4403:3: RULE_ID
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
    // InternalMyDsl.g:4412:1: rule__RoleSet__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RoleSet__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4416:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4417:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4417:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4418:3: ( RULE_ID )
            {
             before(grammarAccess.getRoleSetAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4419:3: ( RULE_ID )
            // InternalMyDsl.g:4420:4: RULE_ID
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


    // $ANTLR start "rule__Protocol__ActionsAssignment_0_1"
    // InternalMyDsl.g:4431:1: rule__Protocol__ActionsAssignment_0_1 : ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) ) ;
    public final void rule__Protocol__ActionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4435:1: ( ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) ) )
            // InternalMyDsl.g:4436:2: ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) )
            {
            // InternalMyDsl.g:4436:2: ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) )
            // InternalMyDsl.g:4437:3: ( rule__Protocol__ActionsAlternatives_0_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getActionsAlternatives_0_1_0()); 
            // InternalMyDsl.g:4438:3: ( rule__Protocol__ActionsAlternatives_0_1_0 )
            // InternalMyDsl.g:4438:4: rule__Protocol__ActionsAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__ActionsAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getActionsAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__ActionsAssignment_0_1"


    // $ANTLR start "rule__Protocol__DoesEndAssignment_0_2"
    // InternalMyDsl.g:4446:1: rule__Protocol__DoesEndAssignment_0_2 : ( ( 'End' ) ) ;
    public final void rule__Protocol__DoesEndAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4450:1: ( ( ( 'End' ) ) )
            // InternalMyDsl.g:4451:2: ( ( 'End' ) )
            {
            // InternalMyDsl.g:4451:2: ( ( 'End' ) )
            // InternalMyDsl.g:4452:3: ( 'End' )
            {
             before(grammarAccess.getProtocolAccess().getDoesEndEndKeyword_0_2_0()); 
            // InternalMyDsl.g:4453:3: ( 'End' )
            // InternalMyDsl.g:4454:4: 'End'
            {
             before(grammarAccess.getProtocolAccess().getDoesEndEndKeyword_0_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getDoesEndEndKeyword_0_2_0()); 

            }

             after(grammarAccess.getProtocolAccess().getDoesEndEndKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__DoesEndAssignment_0_2"


    // $ANTLR start "rule__Protocol__ActionsAssignment_1"
    // InternalMyDsl.g:4465:1: rule__Protocol__ActionsAssignment_1 : ( ruleCloseRecursion ) ;
    public final void rule__Protocol__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4469:1: ( ( ruleCloseRecursion ) )
            // InternalMyDsl.g:4470:2: ( ruleCloseRecursion )
            {
            // InternalMyDsl.g:4470:2: ( ruleCloseRecursion )
            // InternalMyDsl.g:4471:3: ruleCloseRecursion
            {
             before(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCloseRecursion();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__ActionsAssignment_1"


    // $ANTLR start "rule__Recursion__NameAssignment_1"
    // InternalMyDsl.g:4480:1: rule__Recursion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4484:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4485:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4485:2: ( RULE_ID )
            // InternalMyDsl.g:4486:3: RULE_ID
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
    // InternalMyDsl.g:4495:1: rule__Recursion__RecProtocolAssignment_4 : ( ruleProtocol ) ;
    public final void rule__Recursion__RecProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4499:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4500:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4500:2: ( ruleProtocol )
            // InternalMyDsl.g:4501:3: ruleProtocol
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
    // InternalMyDsl.g:4510:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4514:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4515:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4515:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4516:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalMyDsl.g:4517:3: ( RULE_ID )
            // InternalMyDsl.g:4518:4: RULE_ID
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
    // InternalMyDsl.g:4529:1: rule__ForEach__LoopRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEach__LoopRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4533:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:4534:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:4534:2: ( ruleRoleOne )
            // InternalMyDsl.g:4535:3: ruleRoleOne
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
    // InternalMyDsl.g:4544:1: rule__ForEach__RolesetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RolesetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4548:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4549:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4549:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4550:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRolesetRoleSetCrossReference_4_0()); 
            // InternalMyDsl.g:4551:3: ( RULE_ID )
            // InternalMyDsl.g:4552:4: RULE_ID
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
    // InternalMyDsl.g:4563:1: rule__ForEach__RefRoleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RefRoleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4567:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4568:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4568:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4569:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_6_0()); 
            // InternalMyDsl.g:4570:3: ( RULE_ID )
            // InternalMyDsl.g:4571:4: RULE_ID
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


    // $ANTLR start "rule__ForEach__BranchAssignment_9"
    // InternalMyDsl.g:4582:1: rule__ForEach__BranchAssignment_9 : ( ruleProtocol ) ;
    public final void rule__ForEach__BranchAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4586:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4587:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4587:2: ( ruleProtocol )
            // InternalMyDsl.g:4588:3: ruleProtocol
            {
             before(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__BranchAssignment_9"


    // $ANTLR start "rule__Choice__RoleAssignment_2"
    // InternalMyDsl.g:4597:1: rule__Choice__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4601:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4602:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4602:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4603:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 
            // InternalMyDsl.g:4604:3: ( RULE_ID )
            // InternalMyDsl.g:4605:4: RULE_ID
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
    // InternalMyDsl.g:4616:1: rule__Choice__BranchesAssignment_4 : ( ruleChoiceBranch ) ;
    public final void rule__Choice__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4620:1: ( ( ruleChoiceBranch ) )
            // InternalMyDsl.g:4621:2: ( ruleChoiceBranch )
            {
            // InternalMyDsl.g:4621:2: ( ruleChoiceBranch )
            // InternalMyDsl.g:4622:3: ruleChoiceBranch
            {
             before(grammarAccess.getChoiceAccess().getBranchesChoiceBranchParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleChoiceBranch();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchesChoiceBranchParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4631:1: rule__Choice__BranchesAssignment_6_2 : ( ruleChoiceBranch ) ;
    public final void rule__Choice__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4635:1: ( ( ruleChoiceBranch ) )
            // InternalMyDsl.g:4636:2: ( ruleChoiceBranch )
            {
            // InternalMyDsl.g:4636:2: ( ruleChoiceBranch )
            // InternalMyDsl.g:4637:3: ruleChoiceBranch
            {
             before(grammarAccess.getChoiceAccess().getBranchesChoiceBranchParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChoiceBranch();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchesChoiceBranchParserRuleCall_6_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ChoiceBranch__MessageAssignment_0"
    // InternalMyDsl.g:4646:1: rule__ChoiceBranch__MessageAssignment_0 : ( ruleMessage ) ;
    public final void rule__ChoiceBranch__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4650:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4651:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4651:2: ( ruleMessage )
            // InternalMyDsl.g:4652:3: ruleMessage
            {
             before(grammarAccess.getChoiceBranchAccess().getMessageMessageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getChoiceBranchAccess().getMessageMessageParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranch__MessageAssignment_0"


    // $ANTLR start "rule__ChoiceBranch__ProtocolAssignment_1"
    // InternalMyDsl.g:4661:1: rule__ChoiceBranch__ProtocolAssignment_1 : ( ruleProtocol ) ;
    public final void rule__ChoiceBranch__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4665:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4666:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4666:2: ( ruleProtocol )
            // InternalMyDsl.g:4667:3: ruleProtocol
            {
             before(grammarAccess.getChoiceBranchAccess().getProtocolProtocolParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getChoiceBranchAccess().getProtocolProtocolParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranch__ProtocolAssignment_1"


    // $ANTLR start "rule__Message__MessageTypeAssignment_0"
    // InternalMyDsl.g:4676:1: rule__Message__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4680:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4681:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4681:2: ( RULE_ID )
            // InternalMyDsl.g:4682:3: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getMessageTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getMessageTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__MessageTypeAssignment_0"


    // $ANTLR start "rule__Message__PayloadAssignment_2"
    // InternalMyDsl.g:4691:1: rule__Message__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__Message__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4695:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4696:2: ( rulePayload )
            {
            // InternalMyDsl.g:4696:2: ( rulePayload )
            // InternalMyDsl.g:4697:3: rulePayload
            {
             before(grammarAccess.getMessageAccess().getPayloadPayloadParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePayload();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getPayloadPayloadParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__PayloadAssignment_2"


    // $ANTLR start "rule__Message__SenderAssignment_5"
    // InternalMyDsl.g:4706:1: rule__Message__SenderAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4710:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4711:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4711:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4712:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0()); 
            // InternalMyDsl.g:4713:3: ( RULE_ID )
            // InternalMyDsl.g:4714:4: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getSenderRoleOneIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getSenderRoleOneIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__SenderAssignment_5"


    // $ANTLR start "rule__Message__ReceiverAssignment_7"
    // InternalMyDsl.g:4725:1: rule__Message__ReceiverAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4729:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4730:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4730:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4731:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleCrossReference_7_0()); 
            // InternalMyDsl.g:4732:3: ( RULE_ID )
            // InternalMyDsl.g:4733:4: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getReceiverRoleIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getReceiverRoleCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ReceiverAssignment_7"


    // $ANTLR start "rule__Payload__TypesAssignment_0_1_0"
    // InternalMyDsl.g:4744:1: rule__Payload__TypesAssignment_0_1_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4748:1: ( ( ruleType ) )
            // InternalMyDsl.g:4749:2: ( ruleType )
            {
            // InternalMyDsl.g:4749:2: ( ruleType )
            // InternalMyDsl.g:4750:3: ruleType
            {
             before(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__TypesAssignment_0_1_0"


    // $ANTLR start "rule__Payload__TypesAssignment_0_1_1_1"
    // InternalMyDsl.g:4759:1: rule__Payload__TypesAssignment_0_1_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4763:1: ( ( ruleType ) )
            // InternalMyDsl.g:4764:2: ( ruleType )
            {
            // InternalMyDsl.g:4764:2: ( ruleType )
            // InternalMyDsl.g:4765:3: ruleType
            {
             before(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__TypesAssignment_0_1_1_1"


    // $ANTLR start "rule__Payload__TypesAssignment_1"
    // InternalMyDsl.g:4774:1: rule__Payload__TypesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Payload__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4778:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4779:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4779:2: ( RULE_ID )
            // InternalMyDsl.g:4780:3: RULE_ID
            {
             before(grammarAccess.getPayloadAccess().getTypesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPayloadAccess().getTypesIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__TypesAssignment_1"


    // $ANTLR start "rule__LocalProtocol__ProtocolNameAssignment_2"
    // InternalMyDsl.g:4789:1: rule__LocalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4793:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4794:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4794:2: ( RULE_ID )
            // InternalMyDsl.g:4795:3: RULE_ID
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
    // InternalMyDsl.g:4804:1: rule__LocalProtocol__ProjectedRoleAssignment_4 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProjectedRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4808:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4809:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4809:2: ( RULE_ID )
            // InternalMyDsl.g:4810:3: RULE_ID
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
    // InternalMyDsl.g:4819:1: rule__LocalProtocol__RolesAssignment_6 : ( ruleRoles ) ;
    public final void rule__LocalProtocol__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4823:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:4824:2: ( ruleRoles )
            {
            // InternalMyDsl.g:4824:2: ( ruleRoles )
            // InternalMyDsl.g:4825:3: ruleRoles
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
    // InternalMyDsl.g:4834:1: rule__LocalProtocol__ProtocolAssignment_9 : ( ruleProtocolL ) ;
    public final void rule__LocalProtocol__ProtocolAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4838:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4839:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4839:2: ( ruleProtocolL )
            // InternalMyDsl.g:4840:3: ruleProtocolL
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
    // InternalMyDsl.g:4849:1: rule__ProtocolL__ActionsAssignment_1 : ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) ) ;
    public final void rule__ProtocolL__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4853:1: ( ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) ) )
            // InternalMyDsl.g:4854:2: ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:4854:2: ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) )
            // InternalMyDsl.g:4855:3: ( rule__ProtocolL__ActionsAlternatives_1_0 )
            {
             before(grammarAccess.getProtocolLAccess().getActionsAlternatives_1_0()); 
            // InternalMyDsl.g:4856:3: ( rule__ProtocolL__ActionsAlternatives_1_0 )
            // InternalMyDsl.g:4856:4: rule__ProtocolL__ActionsAlternatives_1_0
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
    // InternalMyDsl.g:4864:1: rule__RecursionL__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RecursionL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4868:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4869:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4869:2: ( RULE_ID )
            // InternalMyDsl.g:4870:3: RULE_ID
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
    // InternalMyDsl.g:4879:1: rule__RecursionL__RecProtocolAssignment_4 : ( ruleProtocolL ) ;
    public final void rule__RecursionL__RecProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4883:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4884:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4884:2: ( ruleProtocolL )
            // InternalMyDsl.g:4885:3: ruleProtocolL
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
    // InternalMyDsl.g:4894:1: rule__MessageL__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4898:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4899:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4899:2: ( RULE_ID )
            // InternalMyDsl.g:4900:3: RULE_ID
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
    // InternalMyDsl.g:4909:1: rule__MessageL__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__MessageL__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4913:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4914:2: ( rulePayload )
            {
            // InternalMyDsl.g:4914:2: ( rulePayload )
            // InternalMyDsl.g:4915:3: rulePayload
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
    // InternalMyDsl.g:4924:1: rule__MessageL__SendReceiveAssignment_4 : ( ruleMessageType ) ;
    public final void rule__MessageL__SendReceiveAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4928:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:4929:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:4929:2: ( ruleMessageType )
            // InternalMyDsl.g:4930:3: ruleMessageType
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
    // InternalMyDsl.g:4939:1: rule__SenderL__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SenderL__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4943:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4944:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4944:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4945:3: ( RULE_ID )
            {
             before(grammarAccess.getSenderLAccess().getRoleRoleCrossReference_1_0()); 
            // InternalMyDsl.g:4946:3: ( RULE_ID )
            // InternalMyDsl.g:4947:4: RULE_ID
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
    // InternalMyDsl.g:4958:1: rule__ReceiverL__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReceiverL__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4962:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4963:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4963:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4964:3: ( RULE_ID )
            {
             before(grammarAccess.getReceiverLAccess().getRoleRoleCrossReference_1_0()); 
            // InternalMyDsl.g:4965:3: ( RULE_ID )
            // InternalMyDsl.g:4966:4: RULE_ID
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
    // InternalMyDsl.g:4977:1: rule__ChoiceL__RoleMakingChoiceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChoiceL__RoleMakingChoiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4981:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4982:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4982:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4983:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceLAccess().getRoleMakingChoiceRoleCrossReference_2_0()); 
            // InternalMyDsl.g:4984:3: ( RULE_ID )
            // InternalMyDsl.g:4985:4: RULE_ID
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
    // InternalMyDsl.g:4996:1: rule__ChoiceL__BranchesAssignment_4 : ( ruleChoiceBranchL ) ;
    public final void rule__ChoiceL__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5000:1: ( ( ruleChoiceBranchL ) )
            // InternalMyDsl.g:5001:2: ( ruleChoiceBranchL )
            {
            // InternalMyDsl.g:5001:2: ( ruleChoiceBranchL )
            // InternalMyDsl.g:5002:3: ruleChoiceBranchL
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
    // InternalMyDsl.g:5011:1: rule__ChoiceL__BranchesAssignment_6_2 : ( ruleChoiceBranchL ) ;
    public final void rule__ChoiceL__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5015:1: ( ( ruleChoiceBranchL ) )
            // InternalMyDsl.g:5016:2: ( ruleChoiceBranchL )
            {
            // InternalMyDsl.g:5016:2: ( ruleChoiceBranchL )
            // InternalMyDsl.g:5017:3: ruleChoiceBranchL
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
    // InternalMyDsl.g:5026:1: rule__ChoiceBranchL__MessageAssignment_1_0 : ( ruleMessageL ) ;
    public final void rule__ChoiceBranchL__MessageAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5030:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:5031:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:5031:2: ( ruleMessageL )
            // InternalMyDsl.g:5032:3: ruleMessageL
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
    // InternalMyDsl.g:5041:1: rule__ChoiceBranchL__ProtocolAssignment_1_1 : ( ruleProtocolL ) ;
    public final void rule__ChoiceBranchL__ProtocolAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5045:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5046:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5046:2: ( ruleProtocolL )
            // InternalMyDsl.g:5047:3: ruleProtocolL
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
    // InternalMyDsl.g:5056:1: rule__ForEachL__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEachL__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5060:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:5061:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:5061:2: ( ruleRoleOne )
            // InternalMyDsl.g:5062:3: ruleRoleOne
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
    // InternalMyDsl.g:5071:1: rule__ForEachL__RolesetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RolesetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5075:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5076:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5076:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5077:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRolesetRoleSetCrossReference_4_0()); 
            // InternalMyDsl.g:5078:3: ( RULE_ID )
            // InternalMyDsl.g:5079:4: RULE_ID
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
    // InternalMyDsl.g:5090:1: rule__ForEachL__RefroleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RefroleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5094:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5095:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5095:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5096:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRefroleRoleOneCrossReference_6_0()); 
            // InternalMyDsl.g:5097:3: ( RULE_ID )
            // InternalMyDsl.g:5098:4: RULE_ID
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
    // InternalMyDsl.g:5109:1: rule__ForEachL__BranchAssignment_9 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__BranchAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5113:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:5114:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:5114:2: ( ruleProtocolL )
            // InternalMyDsl.g:5115:3: ruleProtocolL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004046800010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004044800010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000044800012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200003810L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000C046800010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C046800012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});

}