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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'action'", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'roleset'", "':'", "'rec'", "'{'", "'loop'", "';'", "'foreach'", "'at'", "'choice'", "'or'", "')'", "'from'", "'to'", "'local'"
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


    // $ANTLR start "entryRuleMessageL"
    // InternalMyDsl.g:453:1: entryRuleMessageL : ruleMessageL EOF ;
    public final void entryRuleMessageL() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleMessageL EOF )
            // InternalMyDsl.g:455:1: ruleMessageL EOF
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
    // InternalMyDsl.g:462:1: ruleMessageL : ( ( rule__MessageL__Group__0 ) ) ;
    public final void ruleMessageL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__MessageL__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__MessageL__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__MessageL__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__MessageL__Group__0 )
            {
             before(grammarAccess.getMessageLAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__MessageL__Group__0 )
            // InternalMyDsl.g:469:4: rule__MessageL__Group__0
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


    // $ANTLR start "entryRuleSenderL"
    // InternalMyDsl.g:478:1: entryRuleSenderL : ruleSenderL EOF ;
    public final void entryRuleSenderL() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleSenderL EOF )
            // InternalMyDsl.g:480:1: ruleSenderL EOF
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
    // InternalMyDsl.g:487:1: ruleSenderL : ( ( rule__SenderL__Group__0 ) ) ;
    public final void ruleSenderL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__SenderL__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__SenderL__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__SenderL__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__SenderL__Group__0 )
            {
             before(grammarAccess.getSenderLAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__SenderL__Group__0 )
            // InternalMyDsl.g:494:4: rule__SenderL__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleReceiverL : ruleReceiverL EOF ;
    public final void entryRuleReceiverL() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleReceiverL EOF )
            // InternalMyDsl.g:505:1: ruleReceiverL EOF
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
    // InternalMyDsl.g:512:1: ruleReceiverL : ( ( rule__ReceiverL__Group__0 ) ) ;
    public final void ruleReceiverL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__ReceiverL__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__ReceiverL__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__ReceiverL__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__ReceiverL__Group__0 )
            {
             before(grammarAccess.getReceiverLAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__ReceiverL__Group__0 )
            // InternalMyDsl.g:519:4: rule__ReceiverL__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleChoiceL : ruleChoiceL EOF ;
    public final void entryRuleChoiceL() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleChoiceL EOF )
            // InternalMyDsl.g:530:1: ruleChoiceL EOF
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
    // InternalMyDsl.g:537:1: ruleChoiceL : ( ( rule__ChoiceL__Group__0 ) ) ;
    public final void ruleChoiceL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__ChoiceL__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__ChoiceL__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__ChoiceL__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__ChoiceL__Group__0 )
            {
             before(grammarAccess.getChoiceLAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__ChoiceL__Group__0 )
            // InternalMyDsl.g:544:4: rule__ChoiceL__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleChoiceBranchL : ruleChoiceBranchL EOF ;
    public final void entryRuleChoiceBranchL() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleChoiceBranchL EOF )
            // InternalMyDsl.g:555:1: ruleChoiceBranchL EOF
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
    // InternalMyDsl.g:562:1: ruleChoiceBranchL : ( ( rule__ChoiceBranchL__Group__0 ) ) ;
    public final void ruleChoiceBranchL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__ChoiceBranchL__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__ChoiceBranchL__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__ChoiceBranchL__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__ChoiceBranchL__Group__0 )
            {
             before(grammarAccess.getChoiceBranchLAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__ChoiceBranchL__Group__0 )
            // InternalMyDsl.g:569:4: rule__ChoiceBranchL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceBranchLAccess().getGroup()); 

            }


            }

        }
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
    // InternalMyDsl.g:578:1: entryRuleForEachL : ruleForEachL EOF ;
    public final void entryRuleForEachL() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleForEachL EOF )
            // InternalMyDsl.g:580:1: ruleForEachL EOF
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
    // InternalMyDsl.g:587:1: ruleForEachL : ( ( rule__ForEachL__Group__0 ) ) ;
    public final void ruleForEachL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__ForEachL__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__ForEachL__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__ForEachL__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__ForEachL__Group__0 )
            {
             before(grammarAccess.getForEachLAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__ForEachL__Group__0 )
            // InternalMyDsl.g:594:4: rule__ForEachL__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleType EOF )
            // InternalMyDsl.g:605:1: ruleType EOF
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
    // InternalMyDsl.g:612:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:618:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:619:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:619:4: rule__Type__Alternatives
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
    // InternalMyDsl.g:627:1: rule__Model__Alternatives : ( ( ( rule__Model__ProtocolAssignment_0 ) ) | ( ( rule__Model__ProtocolAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( ( ( rule__Model__ProtocolAssignment_0 ) ) | ( ( rule__Model__ProtocolAssignment_1 ) ) )
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
                    // InternalMyDsl.g:632:2: ( ( rule__Model__ProtocolAssignment_0 ) )
                    {
                    // InternalMyDsl.g:632:2: ( ( rule__Model__ProtocolAssignment_0 ) )
                    // InternalMyDsl.g:633:3: ( rule__Model__ProtocolAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_0()); 
                    // InternalMyDsl.g:634:3: ( rule__Model__ProtocolAssignment_0 )
                    // InternalMyDsl.g:634:4: rule__Model__ProtocolAssignment_0
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
                    // InternalMyDsl.g:638:2: ( ( rule__Model__ProtocolAssignment_1 ) )
                    {
                    // InternalMyDsl.g:638:2: ( ( rule__Model__ProtocolAssignment_1 ) )
                    // InternalMyDsl.g:639:3: ( rule__Model__ProtocolAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_1()); 
                    // InternalMyDsl.g:640:3: ( rule__Model__ProtocolAssignment_1 )
                    // InternalMyDsl.g:640:4: rule__Model__ProtocolAssignment_1
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
    // InternalMyDsl.g:648:1: rule__Role__Alternatives : ( ( ruleRoleOne ) | ( ruleRoleSet ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( ( ruleRoleOne ) | ( ruleRoleSet ) )
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
                    // InternalMyDsl.g:653:2: ( ruleRoleOne )
                    {
                    // InternalMyDsl.g:653:2: ( ruleRoleOne )
                    // InternalMyDsl.g:654:3: ruleRoleOne
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
                    // InternalMyDsl.g:659:2: ( ruleRoleSet )
                    {
                    // InternalMyDsl.g:659:2: ( ruleRoleSet )
                    // InternalMyDsl.g:660:3: ruleRoleSet
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
    // InternalMyDsl.g:669:1: rule__Protocol__Alternatives : ( ( ( rule__Protocol__Group_0__0 ) ) | ( ( rule__Protocol__ActionsAssignment_1 ) ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( ( ( rule__Protocol__Group_0__0 ) ) | ( ( rule__Protocol__ActionsAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_ID||LA3_0==18||LA3_0==23||LA3_0==27||LA3_0==29) ) {
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
                    // InternalMyDsl.g:674:2: ( ( rule__Protocol__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:674:2: ( ( rule__Protocol__Group_0__0 ) )
                    // InternalMyDsl.g:675:3: ( rule__Protocol__Group_0__0 )
                    {
                     before(grammarAccess.getProtocolAccess().getGroup_0()); 
                    // InternalMyDsl.g:676:3: ( rule__Protocol__Group_0__0 )
                    // InternalMyDsl.g:676:4: rule__Protocol__Group_0__0
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
                    // InternalMyDsl.g:680:2: ( ( rule__Protocol__ActionsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:680:2: ( ( rule__Protocol__ActionsAssignment_1 ) )
                    // InternalMyDsl.g:681:3: ( rule__Protocol__ActionsAssignment_1 )
                    {
                     before(grammarAccess.getProtocolAccess().getActionsAssignment_1()); 
                    // InternalMyDsl.g:682:3: ( rule__Protocol__ActionsAssignment_1 )
                    // InternalMyDsl.g:682:4: rule__Protocol__ActionsAssignment_1
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
    // InternalMyDsl.g:690:1: rule__Protocol__ActionsAlternatives_0_1_0 : ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) );
    public final void rule__Protocol__ActionsAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 27:
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
                    // InternalMyDsl.g:695:2: ( ruleMessage )
                    {
                    // InternalMyDsl.g:695:2: ( ruleMessage )
                    // InternalMyDsl.g:696:3: ruleMessage
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
                    // InternalMyDsl.g:701:2: ( ruleChoice )
                    {
                    // InternalMyDsl.g:701:2: ( ruleChoice )
                    // InternalMyDsl.g:702:3: ruleChoice
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
                    // InternalMyDsl.g:707:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:707:2: ( ruleRecursion )
                    // InternalMyDsl.g:708:3: ruleRecursion
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
                    // InternalMyDsl.g:713:2: ( ruleForEach )
                    {
                    // InternalMyDsl.g:713:2: ( ruleForEach )
                    // InternalMyDsl.g:714:3: ruleForEach
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
    // InternalMyDsl.g:723:1: rule__Payload__Alternatives : ( ( ( rule__Payload__Group_0__0 ) ) | ( ( rule__Payload__TypesAssignment_1 ) ) );
    public final void rule__Payload__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ( rule__Payload__Group_0__0 ) ) | ( ( rule__Payload__TypesAssignment_1 ) ) )
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
                    // InternalMyDsl.g:728:2: ( ( rule__Payload__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:728:2: ( ( rule__Payload__Group_0__0 ) )
                    // InternalMyDsl.g:729:3: ( rule__Payload__Group_0__0 )
                    {
                     before(grammarAccess.getPayloadAccess().getGroup_0()); 
                    // InternalMyDsl.g:730:3: ( rule__Payload__Group_0__0 )
                    // InternalMyDsl.g:730:4: rule__Payload__Group_0__0
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
                    // InternalMyDsl.g:734:2: ( ( rule__Payload__TypesAssignment_1 ) )
                    {
                    // InternalMyDsl.g:734:2: ( ( rule__Payload__TypesAssignment_1 ) )
                    // InternalMyDsl.g:735:3: ( rule__Payload__TypesAssignment_1 )
                    {
                     before(grammarAccess.getPayloadAccess().getTypesAssignment_1()); 
                    // InternalMyDsl.g:736:3: ( rule__Payload__TypesAssignment_1 )
                    // InternalMyDsl.g:736:4: rule__Payload__TypesAssignment_1
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
    // InternalMyDsl.g:744:1: rule__ProtocolL__ActionsAlternatives_1_0 : ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursion ) | ( ruleCloseRecursion ) );
    public final void rule__ProtocolL__ActionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursion ) | ( ruleCloseRecursion ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 27:
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
                    // InternalMyDsl.g:749:2: ( ruleMessageL )
                    {
                    // InternalMyDsl.g:749:2: ( ruleMessageL )
                    // InternalMyDsl.g:750:3: ruleMessageL
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
                    // InternalMyDsl.g:755:2: ( ruleChoiceL )
                    {
                    // InternalMyDsl.g:755:2: ( ruleChoiceL )
                    // InternalMyDsl.g:756:3: ruleChoiceL
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
                    // InternalMyDsl.g:761:2: ( ruleForEachL )
                    {
                    // InternalMyDsl.g:761:2: ( ruleForEachL )
                    // InternalMyDsl.g:762:3: ruleForEachL
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
                    // InternalMyDsl.g:767:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:767:2: ( ruleRecursion )
                    // InternalMyDsl.g:768:3: ruleRecursion
                    {
                     before(grammarAccess.getProtocolLAccess().getActionsRecursionParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getActionsRecursionParserRuleCall_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:773:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:773:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:774:3: ruleCloseRecursion
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:783:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'action' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( ( 'int' ) | ( 'string' ) | ( 'action' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:788:2: ( 'int' )
                    {
                    // InternalMyDsl.g:788:2: ( 'int' )
                    // InternalMyDsl.g:789:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:794:2: ( 'string' )
                    {
                    // InternalMyDsl.g:794:2: ( 'string' )
                    // InternalMyDsl.g:795:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:800:2: ( 'action' )
                    {
                    // InternalMyDsl.g:800:2: ( 'action' )
                    // InternalMyDsl.g:801:3: 'action'
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
    // InternalMyDsl.g:810:1: rule__GlobalProtocol__Group__0 : rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 ;
    public final void rule__GlobalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:814:1: ( rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 )
            // InternalMyDsl.g:815:2: rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1
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
    // InternalMyDsl.g:822:1: rule__GlobalProtocol__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( ( 'global' ) )
            // InternalMyDsl.g:827:1: ( 'global' )
            {
            // InternalMyDsl.g:827:1: ( 'global' )
            // InternalMyDsl.g:828:2: 'global'
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
    // InternalMyDsl.g:837:1: rule__GlobalProtocol__Group__1 : rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 ;
    public final void rule__GlobalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 )
            // InternalMyDsl.g:842:2: rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2
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
    // InternalMyDsl.g:849:1: rule__GlobalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__GlobalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:854:1: ( 'protocol' )
            {
            // InternalMyDsl.g:854:1: ( 'protocol' )
            // InternalMyDsl.g:855:2: 'protocol'
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
    // InternalMyDsl.g:864:1: rule__GlobalProtocol__Group__2 : rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 ;
    public final void rule__GlobalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 )
            // InternalMyDsl.g:869:2: rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3
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
    // InternalMyDsl.g:876:1: rule__GlobalProtocol__Group__2__Impl : ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__GlobalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:881:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:881:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:882:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:883:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:883:3: rule__GlobalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:891:1: rule__GlobalProtocol__Group__3 : rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 ;
    public final void rule__GlobalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 )
            // InternalMyDsl.g:896:2: rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4
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
    // InternalMyDsl.g:903:1: rule__GlobalProtocol__Group__3__Impl : ( '(' ) ;
    public final void rule__GlobalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( '(' ) )
            // InternalMyDsl.g:908:1: ( '(' )
            {
            // InternalMyDsl.g:908:1: ( '(' )
            // InternalMyDsl.g:909:2: '('
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
    // InternalMyDsl.g:918:1: rule__GlobalProtocol__Group__4 : rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 ;
    public final void rule__GlobalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 )
            // InternalMyDsl.g:923:2: rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5
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
    // InternalMyDsl.g:930:1: rule__GlobalProtocol__Group__4__Impl : ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) ;
    public final void rule__GlobalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) )
            // InternalMyDsl.g:935:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            {
            // InternalMyDsl.g:935:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            // InternalMyDsl.g:936:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getRolesAssignment_4()); 
            // InternalMyDsl.g:937:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            // InternalMyDsl.g:937:3: rule__GlobalProtocol__RolesAssignment_4
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
    // InternalMyDsl.g:945:1: rule__GlobalProtocol__Group__5 : rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 ;
    public final void rule__GlobalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 )
            // InternalMyDsl.g:950:2: rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6
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
    // InternalMyDsl.g:957:1: rule__GlobalProtocol__Group__5__Impl : ( '){' ) ;
    public final void rule__GlobalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( ( '){' ) )
            // InternalMyDsl.g:962:1: ( '){' )
            {
            // InternalMyDsl.g:962:1: ( '){' )
            // InternalMyDsl.g:963:2: '){'
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
    // InternalMyDsl.g:972:1: rule__GlobalProtocol__Group__6 : rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 ;
    public final void rule__GlobalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 )
            // InternalMyDsl.g:977:2: rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7
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
    // InternalMyDsl.g:984:1: rule__GlobalProtocol__Group__6__Impl : ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) ;
    public final void rule__GlobalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) )
            // InternalMyDsl.g:989:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            {
            // InternalMyDsl.g:989:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            // InternalMyDsl.g:990:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolAssignment_6()); 
            // InternalMyDsl.g:991:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            // InternalMyDsl.g:991:3: rule__GlobalProtocol__ProtocolAssignment_6
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
    // InternalMyDsl.g:999:1: rule__GlobalProtocol__Group__7 : rule__GlobalProtocol__Group__7__Impl ;
    public final void rule__GlobalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( rule__GlobalProtocol__Group__7__Impl )
            // InternalMyDsl.g:1004:2: rule__GlobalProtocol__Group__7__Impl
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
    // InternalMyDsl.g:1010:1: rule__GlobalProtocol__Group__7__Impl : ( '}' ) ;
    public final void rule__GlobalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( ( '}' ) )
            // InternalMyDsl.g:1015:1: ( '}' )
            {
            // InternalMyDsl.g:1015:1: ( '}' )
            // InternalMyDsl.g:1016:2: '}'
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
    // InternalMyDsl.g:1026:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalMyDsl.g:1031:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
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
    // InternalMyDsl.g:1038:1: rule__Roles__Group__0__Impl : ( ( rule__Roles__RolesAssignment_0 ) ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( ( ( rule__Roles__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:1043:1: ( ( rule__Roles__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:1043:1: ( ( rule__Roles__RolesAssignment_0 ) )
            // InternalMyDsl.g:1044:2: ( rule__Roles__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:1045:2: ( rule__Roles__RolesAssignment_0 )
            // InternalMyDsl.g:1045:3: rule__Roles__RolesAssignment_0
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
    // InternalMyDsl.g:1053:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( rule__Roles__Group__1__Impl )
            // InternalMyDsl.g:1058:2: rule__Roles__Group__1__Impl
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
    // InternalMyDsl.g:1064:1: rule__Roles__Group__1__Impl : ( ( rule__Roles__Group_1__0 )* ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( ( ( rule__Roles__Group_1__0 )* ) )
            // InternalMyDsl.g:1069:1: ( ( rule__Roles__Group_1__0 )* )
            {
            // InternalMyDsl.g:1069:1: ( ( rule__Roles__Group_1__0 )* )
            // InternalMyDsl.g:1070:2: ( rule__Roles__Group_1__0 )*
            {
             before(grammarAccess.getRolesAccess().getGroup_1()); 
            // InternalMyDsl.g:1071:2: ( rule__Roles__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1071:3: rule__Roles__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Roles__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:1080:1: rule__Roles__Group_1__0 : rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 ;
    public final void rule__Roles__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 )
            // InternalMyDsl.g:1085:2: rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1
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
    // InternalMyDsl.g:1092:1: rule__Roles__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Roles__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( ( ',' ) )
            // InternalMyDsl.g:1097:1: ( ',' )
            {
            // InternalMyDsl.g:1097:1: ( ',' )
            // InternalMyDsl.g:1098:2: ','
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
    // InternalMyDsl.g:1107:1: rule__Roles__Group_1__1 : rule__Roles__Group_1__1__Impl ;
    public final void rule__Roles__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( rule__Roles__Group_1__1__Impl )
            // InternalMyDsl.g:1112:2: rule__Roles__Group_1__1__Impl
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
    // InternalMyDsl.g:1118:1: rule__Roles__Group_1__1__Impl : ( ( rule__Roles__RolesAssignment_1_1 ) ) ;
    public final void rule__Roles__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( ( ( rule__Roles__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:1123:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1123:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:1124:2: ( rule__Roles__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:1125:2: ( rule__Roles__RolesAssignment_1_1 )
            // InternalMyDsl.g:1125:3: rule__Roles__RolesAssignment_1_1
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
    // InternalMyDsl.g:1134:1: rule__RoleOne__Group__0 : rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 ;
    public final void rule__RoleOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 )
            // InternalMyDsl.g:1139:2: rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1
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
    // InternalMyDsl.g:1146:1: rule__RoleOne__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( ( 'role' ) )
            // InternalMyDsl.g:1151:1: ( 'role' )
            {
            // InternalMyDsl.g:1151:1: ( 'role' )
            // InternalMyDsl.g:1152:2: 'role'
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
    // InternalMyDsl.g:1161:1: rule__RoleOne__Group__1 : rule__RoleOne__Group__1__Impl ;
    public final void rule__RoleOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( rule__RoleOne__Group__1__Impl )
            // InternalMyDsl.g:1166:2: rule__RoleOne__Group__1__Impl
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
    // InternalMyDsl.g:1172:1: rule__RoleOne__Group__1__Impl : ( ( rule__RoleOne__NameAssignment_1 ) ) ;
    public final void rule__RoleOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( ( ( rule__RoleOne__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1177:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1177:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            // InternalMyDsl.g:1178:2: ( rule__RoleOne__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1179:2: ( rule__RoleOne__NameAssignment_1 )
            // InternalMyDsl.g:1179:3: rule__RoleOne__NameAssignment_1
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
    // InternalMyDsl.g:1188:1: rule__RoleSet__Group__0 : rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 ;
    public final void rule__RoleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 )
            // InternalMyDsl.g:1193:2: rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1
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
    // InternalMyDsl.g:1200:1: rule__RoleSet__Group__0__Impl : ( 'roleset' ) ;
    public final void rule__RoleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( 'roleset' ) )
            // InternalMyDsl.g:1205:1: ( 'roleset' )
            {
            // InternalMyDsl.g:1205:1: ( 'roleset' )
            // InternalMyDsl.g:1206:2: 'roleset'
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
    // InternalMyDsl.g:1215:1: rule__RoleSet__Group__1 : rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 ;
    public final void rule__RoleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 )
            // InternalMyDsl.g:1220:2: rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2
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
    // InternalMyDsl.g:1227:1: rule__RoleSet__Group__1__Impl : ( ( rule__RoleSet__NameAssignment_1 ) ) ;
    public final void rule__RoleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( ( ( rule__RoleSet__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1232:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1232:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            // InternalMyDsl.g:1233:2: ( rule__RoleSet__NameAssignment_1 )
            {
             before(grammarAccess.getRoleSetAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1234:2: ( rule__RoleSet__NameAssignment_1 )
            // InternalMyDsl.g:1234:3: rule__RoleSet__NameAssignment_1
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
    // InternalMyDsl.g:1242:1: rule__RoleSet__Group__2 : rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 ;
    public final void rule__RoleSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 )
            // InternalMyDsl.g:1247:2: rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3
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
    // InternalMyDsl.g:1254:1: rule__RoleSet__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( ':' ) )
            // InternalMyDsl.g:1259:1: ( ':' )
            {
            // InternalMyDsl.g:1259:1: ( ':' )
            // InternalMyDsl.g:1260:2: ':'
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
    // InternalMyDsl.g:1269:1: rule__RoleSet__Group__3 : rule__RoleSet__Group__3__Impl ;
    public final void rule__RoleSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( rule__RoleSet__Group__3__Impl )
            // InternalMyDsl.g:1274:2: rule__RoleSet__Group__3__Impl
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
    // InternalMyDsl.g:1280:1: rule__RoleSet__Group__3__Impl : ( ( rule__RoleSet__RefAssignment_3 ) ) ;
    public final void rule__RoleSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( ( ( rule__RoleSet__RefAssignment_3 ) ) )
            // InternalMyDsl.g:1285:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:1285:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            // InternalMyDsl.g:1286:2: ( rule__RoleSet__RefAssignment_3 )
            {
             before(grammarAccess.getRoleSetAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:1287:2: ( rule__RoleSet__RefAssignment_3 )
            // InternalMyDsl.g:1287:3: rule__RoleSet__RefAssignment_3
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
    // InternalMyDsl.g:1296:1: rule__Protocol__Group_0__0 : rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 ;
    public final void rule__Protocol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 )
            // InternalMyDsl.g:1301:2: rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1
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
    // InternalMyDsl.g:1308:1: rule__Protocol__Group_0__0__Impl : ( () ) ;
    public final void rule__Protocol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( ( () ) )
            // InternalMyDsl.g:1313:1: ( () )
            {
            // InternalMyDsl.g:1313:1: ( () )
            // InternalMyDsl.g:1314:2: ()
            {
             before(grammarAccess.getProtocolAccess().getProtocolAction_0_0()); 
            // InternalMyDsl.g:1315:2: ()
            // InternalMyDsl.g:1315:3: 
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
    // InternalMyDsl.g:1323:1: rule__Protocol__Group_0__1 : rule__Protocol__Group_0__1__Impl ;
    public final void rule__Protocol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( rule__Protocol__Group_0__1__Impl )
            // InternalMyDsl.g:1328:2: rule__Protocol__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1334:1: rule__Protocol__Group_0__1__Impl : ( ( rule__Protocol__ActionsAssignment_0_1 )* ) ;
    public final void rule__Protocol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( ( ( rule__Protocol__ActionsAssignment_0_1 )* ) )
            // InternalMyDsl.g:1339:1: ( ( rule__Protocol__ActionsAssignment_0_1 )* )
            {
            // InternalMyDsl.g:1339:1: ( ( rule__Protocol__ActionsAssignment_0_1 )* )
            // InternalMyDsl.g:1340:2: ( rule__Protocol__ActionsAssignment_0_1 )*
            {
             before(grammarAccess.getProtocolAccess().getActionsAssignment_0_1()); 
            // InternalMyDsl.g:1341:2: ( rule__Protocol__ActionsAssignment_0_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==23||LA9_0==27||LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1341:3: rule__Protocol__ActionsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Protocol__ActionsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "rule__Recursion__Group__0"
    // InternalMyDsl.g:1350:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalMyDsl.g:1355:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
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
    // InternalMyDsl.g:1362:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( ( 'rec' ) )
            // InternalMyDsl.g:1367:1: ( 'rec' )
            {
            // InternalMyDsl.g:1367:1: ( 'rec' )
            // InternalMyDsl.g:1368:2: 'rec'
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
    // InternalMyDsl.g:1377:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // InternalMyDsl.g:1382:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1389:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__NameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( ( rule__Recursion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1394:1: ( ( rule__Recursion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1394:1: ( ( rule__Recursion__NameAssignment_1 ) )
            // InternalMyDsl.g:1395:2: ( rule__Recursion__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1396:2: ( rule__Recursion__NameAssignment_1 )
            // InternalMyDsl.g:1396:3: rule__Recursion__NameAssignment_1
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
    // InternalMyDsl.g:1404:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl rule__Recursion__Group__3 ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( rule__Recursion__Group__2__Impl rule__Recursion__Group__3 )
            // InternalMyDsl.g:1409:2: rule__Recursion__Group__2__Impl rule__Recursion__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1416:1: rule__Recursion__Group__2__Impl : ( '{' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( '{' ) )
            // InternalMyDsl.g:1421:1: ( '{' )
            {
            // InternalMyDsl.g:1421:1: ( '{' )
            // InternalMyDsl.g:1422:2: '{'
            {
             before(grammarAccess.getRecursionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:1431:1: rule__Recursion__Group__3 : rule__Recursion__Group__3__Impl rule__Recursion__Group__4 ;
    public final void rule__Recursion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( rule__Recursion__Group__3__Impl rule__Recursion__Group__4 )
            // InternalMyDsl.g:1436:2: rule__Recursion__Group__3__Impl rule__Recursion__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1443:1: rule__Recursion__Group__3__Impl : ( ( rule__Recursion__RecProtocolAssignment_3 ) ) ;
    public final void rule__Recursion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( ( ( rule__Recursion__RecProtocolAssignment_3 ) ) )
            // InternalMyDsl.g:1448:1: ( ( rule__Recursion__RecProtocolAssignment_3 ) )
            {
            // InternalMyDsl.g:1448:1: ( ( rule__Recursion__RecProtocolAssignment_3 ) )
            // InternalMyDsl.g:1449:2: ( rule__Recursion__RecProtocolAssignment_3 )
            {
             before(grammarAccess.getRecursionAccess().getRecProtocolAssignment_3()); 
            // InternalMyDsl.g:1450:2: ( rule__Recursion__RecProtocolAssignment_3 )
            // InternalMyDsl.g:1450:3: rule__Recursion__RecProtocolAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__RecProtocolAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRecursionAccess().getRecProtocolAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:1458:1: rule__Recursion__Group__4 : rule__Recursion__Group__4__Impl ;
    public final void rule__Recursion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( rule__Recursion__Group__4__Impl )
            // InternalMyDsl.g:1463:2: rule__Recursion__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1469:1: rule__Recursion__Group__4__Impl : ( '}' ) ;
    public final void rule__Recursion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( ( '}' ) )
            // InternalMyDsl.g:1474:1: ( '}' )
            {
            // InternalMyDsl.g:1474:1: ( '}' )
            // InternalMyDsl.g:1475:2: '}'
            {
             before(grammarAccess.getRecursionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__CloseRecursion__Group__0"
    // InternalMyDsl.g:1485:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalMyDsl.g:1490:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
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
    // InternalMyDsl.g:1497:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( ( 'loop' ) )
            // InternalMyDsl.g:1502:1: ( 'loop' )
            {
            // InternalMyDsl.g:1502:1: ( 'loop' )
            // InternalMyDsl.g:1503:2: 'loop'
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
    // InternalMyDsl.g:1512:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1516:1: ( rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 )
            // InternalMyDsl.g:1517:2: rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__CloseRecursion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CloseRecursion__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1524:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1528:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:1529:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:1529:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:1530:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:1531:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:1531:3: rule__CloseRecursion__RecursionVariableAssignment_1
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


    // $ANTLR start "rule__CloseRecursion__Group__2"
    // InternalMyDsl.g:1539:1: rule__CloseRecursion__Group__2 : rule__CloseRecursion__Group__2__Impl ;
    public final void rule__CloseRecursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( rule__CloseRecursion__Group__2__Impl )
            // InternalMyDsl.g:1544:2: rule__CloseRecursion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursion__Group__2"


    // $ANTLR start "rule__CloseRecursion__Group__2__Impl"
    // InternalMyDsl.g:1550:1: rule__CloseRecursion__Group__2__Impl : ( ';' ) ;
    public final void rule__CloseRecursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( ( ';' ) )
            // InternalMyDsl.g:1555:1: ( ';' )
            {
            // InternalMyDsl.g:1555:1: ( ';' )
            // InternalMyDsl.g:1556:2: ';'
            {
             before(grammarAccess.getCloseRecursionAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursion__Group__2__Impl"


    // $ANTLR start "rule__ForEach__Group__0"
    // InternalMyDsl.g:1566:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalMyDsl.g:1571:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1578:1: rule__ForEach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1582:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:1583:1: ( 'foreach' )
            {
            // InternalMyDsl.g:1583:1: ( 'foreach' )
            // InternalMyDsl.g:1584:2: 'foreach'
            {
             before(grammarAccess.getForEachAccess().getForeachKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getForeachKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1593:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1597:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalMyDsl.g:1598:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
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
    // InternalMyDsl.g:1605:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( ( ( rule__ForEach__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:1610:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:1610:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:1611:2: ( rule__ForEach__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:1612:2: ( rule__ForEach__EachRoleAssignment_1 )
            // InternalMyDsl.g:1612:3: rule__ForEach__EachRoleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__EachRoleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getEachRoleAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1620:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalMyDsl.g:1625:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1632:1: rule__ForEach__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( ( ':' ) )
            // InternalMyDsl.g:1637:1: ( ':' )
            {
            // InternalMyDsl.g:1637:1: ( ':' )
            // InternalMyDsl.g:1638:2: ':'
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
    // InternalMyDsl.g:1647:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1651:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalMyDsl.g:1652:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1659:1: rule__ForEach__Group__3__Impl : ( ( rule__ForEach__RoleAssignment_3 ) ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( ( ( rule__ForEach__RoleAssignment_3 ) ) )
            // InternalMyDsl.g:1664:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            {
            // InternalMyDsl.g:1664:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            // InternalMyDsl.g:1665:2: ( rule__ForEach__RoleAssignment_3 )
            {
             before(grammarAccess.getForEachAccess().getRoleAssignment_3()); 
            // InternalMyDsl.g:1666:2: ( rule__ForEach__RoleAssignment_3 )
            // InternalMyDsl.g:1666:3: rule__ForEach__RoleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__RoleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getRoleAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:1674:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalMyDsl.g:1679:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1686:1: rule__ForEach__Group__4__Impl : ( 'at' ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( ( 'at' ) )
            // InternalMyDsl.g:1691:1: ( 'at' )
            {
            // InternalMyDsl.g:1691:1: ( 'at' )
            // InternalMyDsl.g:1692:2: 'at'
            {
             before(grammarAccess.getForEachAccess().getAtKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getAtKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1701:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1705:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalMyDsl.g:1706:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1713:1: rule__ForEach__Group__5__Impl : ( ( rule__ForEach__RefRoleAssignment_5 ) ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( ( ( rule__ForEach__RefRoleAssignment_5 ) ) )
            // InternalMyDsl.g:1718:1: ( ( rule__ForEach__RefRoleAssignment_5 ) )
            {
            // InternalMyDsl.g:1718:1: ( ( rule__ForEach__RefRoleAssignment_5 ) )
            // InternalMyDsl.g:1719:2: ( rule__ForEach__RefRoleAssignment_5 )
            {
             before(grammarAccess.getForEachAccess().getRefRoleAssignment_5()); 
            // InternalMyDsl.g:1720:2: ( rule__ForEach__RefRoleAssignment_5 )
            // InternalMyDsl.g:1720:3: rule__ForEach__RefRoleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__RefRoleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getRefRoleAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:1728:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl rule__ForEach__Group__7 ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( rule__ForEach__Group__6__Impl rule__ForEach__Group__7 )
            // InternalMyDsl.g:1733:2: rule__ForEach__Group__6__Impl rule__ForEach__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1740:1: rule__ForEach__Group__6__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( ( '{' ) )
            // InternalMyDsl.g:1745:1: ( '{' )
            {
            // InternalMyDsl.g:1745:1: ( '{' )
            // InternalMyDsl.g:1746:2: '{'
            {
             before(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:1755:1: rule__ForEach__Group__7 : rule__ForEach__Group__7__Impl rule__ForEach__Group__8 ;
    public final void rule__ForEach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( rule__ForEach__Group__7__Impl rule__ForEach__Group__8 )
            // InternalMyDsl.g:1760:2: rule__ForEach__Group__7__Impl rule__ForEach__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1767:1: rule__ForEach__Group__7__Impl : ( ( rule__ForEach__BranchAssignment_7 ) ) ;
    public final void rule__ForEach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( ( ( rule__ForEach__BranchAssignment_7 ) ) )
            // InternalMyDsl.g:1772:1: ( ( rule__ForEach__BranchAssignment_7 ) )
            {
            // InternalMyDsl.g:1772:1: ( ( rule__ForEach__BranchAssignment_7 ) )
            // InternalMyDsl.g:1773:2: ( rule__ForEach__BranchAssignment_7 )
            {
             before(grammarAccess.getForEachAccess().getBranchAssignment_7()); 
            // InternalMyDsl.g:1774:2: ( rule__ForEach__BranchAssignment_7 )
            // InternalMyDsl.g:1774:3: rule__ForEach__BranchAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__BranchAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getBranchAssignment_7()); 

            }


            }

        }
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
    // InternalMyDsl.g:1782:1: rule__ForEach__Group__8 : rule__ForEach__Group__8__Impl ;
    public final void rule__ForEach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( rule__ForEach__Group__8__Impl )
            // InternalMyDsl.g:1787:2: rule__ForEach__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1793:1: rule__ForEach__Group__8__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1797:1: ( ( '}' ) )
            // InternalMyDsl.g:1798:1: ( '}' )
            {
            // InternalMyDsl.g:1798:1: ( '}' )
            // InternalMyDsl.g:1799:2: '}'
            {
             before(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choice__Group__0"
    // InternalMyDsl.g:1809:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:1814:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
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
    // InternalMyDsl.g:1821:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( ( 'choice' ) )
            // InternalMyDsl.g:1826:1: ( 'choice' )
            {
            // InternalMyDsl.g:1826:1: ( 'choice' )
            // InternalMyDsl.g:1827:2: 'choice'
            {
             before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1836:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:1841:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
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
    // InternalMyDsl.g:1848:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( 'at' ) )
            // InternalMyDsl.g:1853:1: ( 'at' )
            {
            // InternalMyDsl.g:1853:1: ( 'at' )
            // InternalMyDsl.g:1854:2: 'at'
            {
             before(grammarAccess.getChoiceAccess().getAtKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1863:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:1868:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
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
    // InternalMyDsl.g:1875:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:1880:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:1880:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalMyDsl.g:1881:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:1882:2: ( rule__Choice__RoleAssignment_2 )
            // InternalMyDsl.g:1882:3: rule__Choice__RoleAssignment_2
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
    // InternalMyDsl.g:1890:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:1895:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
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
    // InternalMyDsl.g:1902:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( ( '{' ) )
            // InternalMyDsl.g:1907:1: ( '{' )
            {
            // InternalMyDsl.g:1907:1: ( '{' )
            // InternalMyDsl.g:1908:2: '{'
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
    // InternalMyDsl.g:1917:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:1922:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
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
    // InternalMyDsl.g:1929:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__BranchesAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( ( rule__Choice__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:1934:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:1934:1: ( ( rule__Choice__BranchesAssignment_4 ) )
            // InternalMyDsl.g:1935:2: ( rule__Choice__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:1936:2: ( rule__Choice__BranchesAssignment_4 )
            // InternalMyDsl.g:1936:3: rule__Choice__BranchesAssignment_4
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
    // InternalMyDsl.g:1944:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:1949:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1956:1: rule__Choice__Group__5__Impl : ( '}' ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( ( '}' ) )
            // InternalMyDsl.g:1961:1: ( '}' )
            {
            // InternalMyDsl.g:1961:1: ( '}' )
            // InternalMyDsl.g:1962:2: '}'
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
    // InternalMyDsl.g:1971:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( rule__Choice__Group__6__Impl )
            // InternalMyDsl.g:1976:2: rule__Choice__Group__6__Impl
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
    // InternalMyDsl.g:1982:1: rule__Choice__Group__6__Impl : ( ( rule__Choice__Group_6__0 )* ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1986:1: ( ( ( rule__Choice__Group_6__0 )* ) )
            // InternalMyDsl.g:1987:1: ( ( rule__Choice__Group_6__0 )* )
            {
            // InternalMyDsl.g:1987:1: ( ( rule__Choice__Group_6__0 )* )
            // InternalMyDsl.g:1988:2: ( rule__Choice__Group_6__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_6()); 
            // InternalMyDsl.g:1989:2: ( rule__Choice__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1989:3: rule__Choice__Group_6__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Choice__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:1998:1: rule__Choice__Group_6__0 : rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 ;
    public final void rule__Choice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1 )
            // InternalMyDsl.g:2003:2: rule__Choice__Group_6__0__Impl rule__Choice__Group_6__1
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
    // InternalMyDsl.g:2010:1: rule__Choice__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( ( 'or' ) )
            // InternalMyDsl.g:2015:1: ( 'or' )
            {
            // InternalMyDsl.g:2015:1: ( 'or' )
            // InternalMyDsl.g:2016:2: 'or'
            {
             before(grammarAccess.getChoiceAccess().getOrKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2025:1: rule__Choice__Group_6__1 : rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 ;
    public final void rule__Choice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2 )
            // InternalMyDsl.g:2030:2: rule__Choice__Group_6__1__Impl rule__Choice__Group_6__2
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
    // InternalMyDsl.g:2037:1: rule__Choice__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( ( '{' ) )
            // InternalMyDsl.g:2042:1: ( '{' )
            {
            // InternalMyDsl.g:2042:1: ( '{' )
            // InternalMyDsl.g:2043:2: '{'
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
    // InternalMyDsl.g:2052:1: rule__Choice__Group_6__2 : rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 ;
    public final void rule__Choice__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3 )
            // InternalMyDsl.g:2057:2: rule__Choice__Group_6__2__Impl rule__Choice__Group_6__3
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
    // InternalMyDsl.g:2064:1: rule__Choice__Group_6__2__Impl : ( ( rule__Choice__BranchesAssignment_6_2 ) ) ;
    public final void rule__Choice__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( ( ( rule__Choice__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:2069:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:2069:1: ( ( rule__Choice__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:2070:2: ( rule__Choice__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:2071:2: ( rule__Choice__BranchesAssignment_6_2 )
            // InternalMyDsl.g:2071:3: rule__Choice__BranchesAssignment_6_2
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
    // InternalMyDsl.g:2079:1: rule__Choice__Group_6__3 : rule__Choice__Group_6__3__Impl ;
    public final void rule__Choice__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( rule__Choice__Group_6__3__Impl )
            // InternalMyDsl.g:2084:2: rule__Choice__Group_6__3__Impl
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
    // InternalMyDsl.g:2090:1: rule__Choice__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Choice__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2094:1: ( ( '}' ) )
            // InternalMyDsl.g:2095:1: ( '}' )
            {
            // InternalMyDsl.g:2095:1: ( '}' )
            // InternalMyDsl.g:2096:2: '}'
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
    // InternalMyDsl.g:2106:1: rule__ChoiceBranch__Group__0 : rule__ChoiceBranch__Group__0__Impl rule__ChoiceBranch__Group__1 ;
    public final void rule__ChoiceBranch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( rule__ChoiceBranch__Group__0__Impl rule__ChoiceBranch__Group__1 )
            // InternalMyDsl.g:2111:2: rule__ChoiceBranch__Group__0__Impl rule__ChoiceBranch__Group__1
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
    // InternalMyDsl.g:2118:1: rule__ChoiceBranch__Group__0__Impl : ( ( rule__ChoiceBranch__MessageAssignment_0 ) ) ;
    public final void rule__ChoiceBranch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( ( ( rule__ChoiceBranch__MessageAssignment_0 ) ) )
            // InternalMyDsl.g:2123:1: ( ( rule__ChoiceBranch__MessageAssignment_0 ) )
            {
            // InternalMyDsl.g:2123:1: ( ( rule__ChoiceBranch__MessageAssignment_0 ) )
            // InternalMyDsl.g:2124:2: ( rule__ChoiceBranch__MessageAssignment_0 )
            {
             before(grammarAccess.getChoiceBranchAccess().getMessageAssignment_0()); 
            // InternalMyDsl.g:2125:2: ( rule__ChoiceBranch__MessageAssignment_0 )
            // InternalMyDsl.g:2125:3: rule__ChoiceBranch__MessageAssignment_0
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
    // InternalMyDsl.g:2133:1: rule__ChoiceBranch__Group__1 : rule__ChoiceBranch__Group__1__Impl ;
    public final void rule__ChoiceBranch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( rule__ChoiceBranch__Group__1__Impl )
            // InternalMyDsl.g:2138:2: rule__ChoiceBranch__Group__1__Impl
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
    // InternalMyDsl.g:2144:1: rule__ChoiceBranch__Group__1__Impl : ( ( rule__ChoiceBranch__ProtocolAssignment_1 ) ) ;
    public final void rule__ChoiceBranch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2148:1: ( ( ( rule__ChoiceBranch__ProtocolAssignment_1 ) ) )
            // InternalMyDsl.g:2149:1: ( ( rule__ChoiceBranch__ProtocolAssignment_1 ) )
            {
            // InternalMyDsl.g:2149:1: ( ( rule__ChoiceBranch__ProtocolAssignment_1 ) )
            // InternalMyDsl.g:2150:2: ( rule__ChoiceBranch__ProtocolAssignment_1 )
            {
             before(grammarAccess.getChoiceBranchAccess().getProtocolAssignment_1()); 
            // InternalMyDsl.g:2151:2: ( rule__ChoiceBranch__ProtocolAssignment_1 )
            // InternalMyDsl.g:2151:3: rule__ChoiceBranch__ProtocolAssignment_1
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
    // InternalMyDsl.g:2160:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:2165:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalMyDsl.g:2172:1: rule__Message__Group__0__Impl : ( ( rule__Message__MessageTypeAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( ( ( rule__Message__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2177:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2177:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2178:2: ( rule__Message__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2179:2: ( rule__Message__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2179:3: rule__Message__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2187:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:2192:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2199:1: rule__Message__Group__1__Impl : ( '(' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( ( '(' ) )
            // InternalMyDsl.g:2204:1: ( '(' )
            {
            // InternalMyDsl.g:2204:1: ( '(' )
            // InternalMyDsl.g:2205:2: '('
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
    // InternalMyDsl.g:2214:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:2219:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2226:1: rule__Message__Group__2__Impl : ( ( rule__Message__PayloadAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( ( rule__Message__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:2231:1: ( ( rule__Message__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:2231:1: ( ( rule__Message__PayloadAssignment_2 )? )
            // InternalMyDsl.g:2232:2: ( rule__Message__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:2233:2: ( rule__Message__PayloadAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||(LA11_0>=11 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:2233:3: rule__Message__PayloadAssignment_2
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
    // InternalMyDsl.g:2241:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:2246:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2253:1: rule__Message__Group__3__Impl : ( ')' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( ')' ) )
            // InternalMyDsl.g:2258:1: ( ')' )
            {
            // InternalMyDsl.g:2258:1: ( ')' )
            // InternalMyDsl.g:2259:2: ')'
            {
             before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2268:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:2273:2: rule__Message__Group__4__Impl rule__Message__Group__5
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
    // InternalMyDsl.g:2280:1: rule__Message__Group__4__Impl : ( 'from' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( ( 'from' ) )
            // InternalMyDsl.g:2285:1: ( 'from' )
            {
            // InternalMyDsl.g:2285:1: ( 'from' )
            // InternalMyDsl.g:2286:2: 'from'
            {
             before(grammarAccess.getMessageAccess().getFromKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2295:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:2300:2: rule__Message__Group__5__Impl rule__Message__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2307:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( ( ( rule__Message__SenderAssignment_5 ) ) )
            // InternalMyDsl.g:2312:1: ( ( rule__Message__SenderAssignment_5 ) )
            {
            // InternalMyDsl.g:2312:1: ( ( rule__Message__SenderAssignment_5 ) )
            // InternalMyDsl.g:2313:2: ( rule__Message__SenderAssignment_5 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_5()); 
            // InternalMyDsl.g:2314:2: ( rule__Message__SenderAssignment_5 )
            // InternalMyDsl.g:2314:3: rule__Message__SenderAssignment_5
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
    // InternalMyDsl.g:2322:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:2327:2: rule__Message__Group__6__Impl rule__Message__Group__7
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
    // InternalMyDsl.g:2334:1: rule__Message__Group__6__Impl : ( 'to' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( ( 'to' ) )
            // InternalMyDsl.g:2339:1: ( 'to' )
            {
            // InternalMyDsl.g:2339:1: ( 'to' )
            // InternalMyDsl.g:2340:2: 'to'
            {
             before(grammarAccess.getMessageAccess().getToKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2349:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2353:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:2354:2: rule__Message__Group__7__Impl rule__Message__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2361:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( ( ( rule__Message__ReceiverAssignment_7 ) ) )
            // InternalMyDsl.g:2366:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            {
            // InternalMyDsl.g:2366:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            // InternalMyDsl.g:2367:2: ( rule__Message__ReceiverAssignment_7 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 
            // InternalMyDsl.g:2368:2: ( rule__Message__ReceiverAssignment_7 )
            // InternalMyDsl.g:2368:3: rule__Message__ReceiverAssignment_7
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
    // InternalMyDsl.g:2376:1: rule__Message__Group__8 : rule__Message__Group__8__Impl ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( rule__Message__Group__8__Impl )
            // InternalMyDsl.g:2381:2: rule__Message__Group__8__Impl
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
    // InternalMyDsl.g:2387:1: rule__Message__Group__8__Impl : ( ';' ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2391:1: ( ( ';' ) )
            // InternalMyDsl.g:2392:1: ( ';' )
            {
            // InternalMyDsl.g:2392:1: ( ';' )
            // InternalMyDsl.g:2393:2: ';'
            {
             before(grammarAccess.getMessageAccess().getSemicolonKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getSemicolonKeyword_8()); 

            }


            }

        }
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
    // InternalMyDsl.g:2403:1: rule__Payload__Group_0__0 : rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1 ;
    public final void rule__Payload__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1 )
            // InternalMyDsl.g:2408:2: rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2415:1: rule__Payload__Group_0__0__Impl : ( () ) ;
    public final void rule__Payload__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( ( () ) )
            // InternalMyDsl.g:2420:1: ( () )
            {
            // InternalMyDsl.g:2420:1: ( () )
            // InternalMyDsl.g:2421:2: ()
            {
             before(grammarAccess.getPayloadAccess().getPayloadAction_0_0()); 
            // InternalMyDsl.g:2422:2: ()
            // InternalMyDsl.g:2422:3: 
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
    // InternalMyDsl.g:2430:1: rule__Payload__Group_0__1 : rule__Payload__Group_0__1__Impl ;
    public final void rule__Payload__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( rule__Payload__Group_0__1__Impl )
            // InternalMyDsl.g:2435:2: rule__Payload__Group_0__1__Impl
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
    // InternalMyDsl.g:2441:1: rule__Payload__Group_0__1__Impl : ( ( rule__Payload__Group_0_1__0 ) ) ;
    public final void rule__Payload__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2445:1: ( ( ( rule__Payload__Group_0_1__0 ) ) )
            // InternalMyDsl.g:2446:1: ( ( rule__Payload__Group_0_1__0 ) )
            {
            // InternalMyDsl.g:2446:1: ( ( rule__Payload__Group_0_1__0 ) )
            // InternalMyDsl.g:2447:2: ( rule__Payload__Group_0_1__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup_0_1()); 
            // InternalMyDsl.g:2448:2: ( rule__Payload__Group_0_1__0 )
            // InternalMyDsl.g:2448:3: rule__Payload__Group_0_1__0
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
    // InternalMyDsl.g:2457:1: rule__Payload__Group_0_1__0 : rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1 ;
    public final void rule__Payload__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1 )
            // InternalMyDsl.g:2462:2: rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1
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
    // InternalMyDsl.g:2469:1: rule__Payload__Group_0_1__0__Impl : ( ( rule__Payload__TypesAssignment_0_1_0 ) ) ;
    public final void rule__Payload__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( ( ( rule__Payload__TypesAssignment_0_1_0 ) ) )
            // InternalMyDsl.g:2474:1: ( ( rule__Payload__TypesAssignment_0_1_0 ) )
            {
            // InternalMyDsl.g:2474:1: ( ( rule__Payload__TypesAssignment_0_1_0 ) )
            // InternalMyDsl.g:2475:2: ( rule__Payload__TypesAssignment_0_1_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0_1_0()); 
            // InternalMyDsl.g:2476:2: ( rule__Payload__TypesAssignment_0_1_0 )
            // InternalMyDsl.g:2476:3: rule__Payload__TypesAssignment_0_1_0
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
    // InternalMyDsl.g:2484:1: rule__Payload__Group_0_1__1 : rule__Payload__Group_0_1__1__Impl ;
    public final void rule__Payload__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2488:1: ( rule__Payload__Group_0_1__1__Impl )
            // InternalMyDsl.g:2489:2: rule__Payload__Group_0_1__1__Impl
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
    // InternalMyDsl.g:2495:1: rule__Payload__Group_0_1__1__Impl : ( ( rule__Payload__Group_0_1_1__0 )* ) ;
    public final void rule__Payload__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2499:1: ( ( ( rule__Payload__Group_0_1_1__0 )* ) )
            // InternalMyDsl.g:2500:1: ( ( rule__Payload__Group_0_1_1__0 )* )
            {
            // InternalMyDsl.g:2500:1: ( ( rule__Payload__Group_0_1_1__0 )* )
            // InternalMyDsl.g:2501:2: ( rule__Payload__Group_0_1_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_0_1_1()); 
            // InternalMyDsl.g:2502:2: ( rule__Payload__Group_0_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2502:3: rule__Payload__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Payload__Group_0_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:2511:1: rule__Payload__Group_0_1_1__0 : rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1 ;
    public final void rule__Payload__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2515:1: ( rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1 )
            // InternalMyDsl.g:2516:2: rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2523:1: rule__Payload__Group_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( ( ',' ) )
            // InternalMyDsl.g:2528:1: ( ',' )
            {
            // InternalMyDsl.g:2528:1: ( ',' )
            // InternalMyDsl.g:2529:2: ','
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
    // InternalMyDsl.g:2538:1: rule__Payload__Group_0_1_1__1 : rule__Payload__Group_0_1_1__1__Impl ;
    public final void rule__Payload__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( rule__Payload__Group_0_1_1__1__Impl )
            // InternalMyDsl.g:2543:2: rule__Payload__Group_0_1_1__1__Impl
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
    // InternalMyDsl.g:2549:1: rule__Payload__Group_0_1_1__1__Impl : ( ( rule__Payload__TypesAssignment_0_1_1_1 ) ) ;
    public final void rule__Payload__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( ( ( rule__Payload__TypesAssignment_0_1_1_1 ) ) )
            // InternalMyDsl.g:2554:1: ( ( rule__Payload__TypesAssignment_0_1_1_1 ) )
            {
            // InternalMyDsl.g:2554:1: ( ( rule__Payload__TypesAssignment_0_1_1_1 ) )
            // InternalMyDsl.g:2555:2: ( rule__Payload__TypesAssignment_0_1_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0_1_1_1()); 
            // InternalMyDsl.g:2556:2: ( rule__Payload__TypesAssignment_0_1_1_1 )
            // InternalMyDsl.g:2556:3: rule__Payload__TypesAssignment_0_1_1_1
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
    // InternalMyDsl.g:2565:1: rule__LocalProtocol__Group__0 : rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 ;
    public final void rule__LocalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2569:1: ( rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 )
            // InternalMyDsl.g:2570:2: rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1
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
    // InternalMyDsl.g:2577:1: rule__LocalProtocol__Group__0__Impl : ( 'local' ) ;
    public final void rule__LocalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( ( 'local' ) )
            // InternalMyDsl.g:2582:1: ( 'local' )
            {
            // InternalMyDsl.g:2582:1: ( 'local' )
            // InternalMyDsl.g:2583:2: 'local'
            {
             before(grammarAccess.getLocalProtocolAccess().getLocalKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2592:1: rule__LocalProtocol__Group__1 : rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 ;
    public final void rule__LocalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2596:1: ( rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 )
            // InternalMyDsl.g:2597:2: rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2
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
    // InternalMyDsl.g:2604:1: rule__LocalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__LocalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:2609:1: ( 'protocol' )
            {
            // InternalMyDsl.g:2609:1: ( 'protocol' )
            // InternalMyDsl.g:2610:2: 'protocol'
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
    // InternalMyDsl.g:2619:1: rule__LocalProtocol__Group__2 : rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 ;
    public final void rule__LocalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 )
            // InternalMyDsl.g:2624:2: rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3
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
    // InternalMyDsl.g:2631:1: rule__LocalProtocol__Group__2__Impl : ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__LocalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2635:1: ( ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:2636:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:2636:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:2637:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:2638:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:2638:3: rule__LocalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:2646:1: rule__LocalProtocol__Group__3 : rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 ;
    public final void rule__LocalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2650:1: ( rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 )
            // InternalMyDsl.g:2651:2: rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4
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
    // InternalMyDsl.g:2658:1: rule__LocalProtocol__Group__3__Impl : ( 'at' ) ;
    public final void rule__LocalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2662:1: ( ( 'at' ) )
            // InternalMyDsl.g:2663:1: ( 'at' )
            {
            // InternalMyDsl.g:2663:1: ( 'at' )
            // InternalMyDsl.g:2664:2: 'at'
            {
             before(grammarAccess.getLocalProtocolAccess().getAtKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2673:1: rule__LocalProtocol__Group__4 : rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 ;
    public final void rule__LocalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2677:1: ( rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 )
            // InternalMyDsl.g:2678:2: rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5
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
    // InternalMyDsl.g:2685:1: rule__LocalProtocol__Group__4__Impl : ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) ;
    public final void rule__LocalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2689:1: ( ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) )
            // InternalMyDsl.g:2690:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            {
            // InternalMyDsl.g:2690:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            // InternalMyDsl.g:2691:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_4()); 
            // InternalMyDsl.g:2692:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            // InternalMyDsl.g:2692:3: rule__LocalProtocol__ProjectedRoleAssignment_4
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
    // InternalMyDsl.g:2700:1: rule__LocalProtocol__Group__5 : rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 ;
    public final void rule__LocalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 )
            // InternalMyDsl.g:2705:2: rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6
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
    // InternalMyDsl.g:2712:1: rule__LocalProtocol__Group__5__Impl : ( '(' ) ;
    public final void rule__LocalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( ( '(' ) )
            // InternalMyDsl.g:2717:1: ( '(' )
            {
            // InternalMyDsl.g:2717:1: ( '(' )
            // InternalMyDsl.g:2718:2: '('
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
    // InternalMyDsl.g:2727:1: rule__LocalProtocol__Group__6 : rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 ;
    public final void rule__LocalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2731:1: ( rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 )
            // InternalMyDsl.g:2732:2: rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2739:1: rule__LocalProtocol__Group__6__Impl : ( ( rule__LocalProtocol__RolesAssignment_6 ) ) ;
    public final void rule__LocalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( ( ( rule__LocalProtocol__RolesAssignment_6 ) ) )
            // InternalMyDsl.g:2744:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            {
            // InternalMyDsl.g:2744:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            // InternalMyDsl.g:2745:2: ( rule__LocalProtocol__RolesAssignment_6 )
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesAssignment_6()); 
            // InternalMyDsl.g:2746:2: ( rule__LocalProtocol__RolesAssignment_6 )
            // InternalMyDsl.g:2746:3: rule__LocalProtocol__RolesAssignment_6
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
    // InternalMyDsl.g:2754:1: rule__LocalProtocol__Group__7 : rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 ;
    public final void rule__LocalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 )
            // InternalMyDsl.g:2759:2: rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8
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
    // InternalMyDsl.g:2766:1: rule__LocalProtocol__Group__7__Impl : ( ')' ) ;
    public final void rule__LocalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2770:1: ( ( ')' ) )
            // InternalMyDsl.g:2771:1: ( ')' )
            {
            // InternalMyDsl.g:2771:1: ( ')' )
            // InternalMyDsl.g:2772:2: ')'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2781:1: rule__LocalProtocol__Group__8 : rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 ;
    public final void rule__LocalProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2785:1: ( rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 )
            // InternalMyDsl.g:2786:2: rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2793:1: rule__LocalProtocol__Group__8__Impl : ( '{' ) ;
    public final void rule__LocalProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2797:1: ( ( '{' ) )
            // InternalMyDsl.g:2798:1: ( '{' )
            {
            // InternalMyDsl.g:2798:1: ( '{' )
            // InternalMyDsl.g:2799:2: '{'
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
    // InternalMyDsl.g:2808:1: rule__LocalProtocol__Group__9 : rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 ;
    public final void rule__LocalProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2812:1: ( rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 )
            // InternalMyDsl.g:2813:2: rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10
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
    // InternalMyDsl.g:2820:1: rule__LocalProtocol__Group__9__Impl : ( ( rule__LocalProtocol__ProtocolAssignment_9 ) ) ;
    public final void rule__LocalProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2824:1: ( ( ( rule__LocalProtocol__ProtocolAssignment_9 ) ) )
            // InternalMyDsl.g:2825:1: ( ( rule__LocalProtocol__ProtocolAssignment_9 ) )
            {
            // InternalMyDsl.g:2825:1: ( ( rule__LocalProtocol__ProtocolAssignment_9 ) )
            // InternalMyDsl.g:2826:2: ( rule__LocalProtocol__ProtocolAssignment_9 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_9()); 
            // InternalMyDsl.g:2827:2: ( rule__LocalProtocol__ProtocolAssignment_9 )
            // InternalMyDsl.g:2827:3: rule__LocalProtocol__ProtocolAssignment_9
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
    // InternalMyDsl.g:2835:1: rule__LocalProtocol__Group__10 : rule__LocalProtocol__Group__10__Impl ;
    public final void rule__LocalProtocol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2839:1: ( rule__LocalProtocol__Group__10__Impl )
            // InternalMyDsl.g:2840:2: rule__LocalProtocol__Group__10__Impl
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
    // InternalMyDsl.g:2846:1: rule__LocalProtocol__Group__10__Impl : ( '}' ) ;
    public final void rule__LocalProtocol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2850:1: ( ( '}' ) )
            // InternalMyDsl.g:2851:1: ( '}' )
            {
            // InternalMyDsl.g:2851:1: ( '}' )
            // InternalMyDsl.g:2852:2: '}'
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
    // InternalMyDsl.g:2862:1: rule__ProtocolL__Group__0 : rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1 ;
    public final void rule__ProtocolL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2866:1: ( rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1 )
            // InternalMyDsl.g:2867:2: rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2874:1: rule__ProtocolL__Group__0__Impl : ( () ) ;
    public final void rule__ProtocolL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2878:1: ( ( () ) )
            // InternalMyDsl.g:2879:1: ( () )
            {
            // InternalMyDsl.g:2879:1: ( () )
            // InternalMyDsl.g:2880:2: ()
            {
             before(grammarAccess.getProtocolLAccess().getProtocolLAction_0()); 
            // InternalMyDsl.g:2881:2: ()
            // InternalMyDsl.g:2881:3: 
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
    // InternalMyDsl.g:2889:1: rule__ProtocolL__Group__1 : rule__ProtocolL__Group__1__Impl ;
    public final void rule__ProtocolL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2893:1: ( rule__ProtocolL__Group__1__Impl )
            // InternalMyDsl.g:2894:2: rule__ProtocolL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolL__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2900:1: rule__ProtocolL__Group__1__Impl : ( ( rule__ProtocolL__ActionsAssignment_1 )* ) ;
    public final void rule__ProtocolL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2904:1: ( ( ( rule__ProtocolL__ActionsAssignment_1 )* ) )
            // InternalMyDsl.g:2905:1: ( ( rule__ProtocolL__ActionsAssignment_1 )* )
            {
            // InternalMyDsl.g:2905:1: ( ( rule__ProtocolL__ActionsAssignment_1 )* )
            // InternalMyDsl.g:2906:2: ( rule__ProtocolL__ActionsAssignment_1 )*
            {
             before(grammarAccess.getProtocolLAccess().getActionsAssignment_1()); 
            // InternalMyDsl.g:2907:2: ( rule__ProtocolL__ActionsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==23||LA13_0==25||LA13_0==27||LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2907:3: rule__ProtocolL__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ProtocolL__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "rule__MessageL__Group__0"
    // InternalMyDsl.g:2916:1: rule__MessageL__Group__0 : rule__MessageL__Group__0__Impl rule__MessageL__Group__1 ;
    public final void rule__MessageL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( rule__MessageL__Group__0__Impl rule__MessageL__Group__1 )
            // InternalMyDsl.g:2921:2: rule__MessageL__Group__0__Impl rule__MessageL__Group__1
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
    // InternalMyDsl.g:2928:1: rule__MessageL__Group__0__Impl : ( ( rule__MessageL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2932:1: ( ( ( rule__MessageL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2933:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2933:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2934:2: ( rule__MessageL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2935:2: ( rule__MessageL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2935:3: rule__MessageL__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2943:1: rule__MessageL__Group__1 : rule__MessageL__Group__1__Impl rule__MessageL__Group__2 ;
    public final void rule__MessageL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2947:1: ( rule__MessageL__Group__1__Impl rule__MessageL__Group__2 )
            // InternalMyDsl.g:2948:2: rule__MessageL__Group__1__Impl rule__MessageL__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2955:1: rule__MessageL__Group__1__Impl : ( '(' ) ;
    public final void rule__MessageL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2959:1: ( ( '(' ) )
            // InternalMyDsl.g:2960:1: ( '(' )
            {
            // InternalMyDsl.g:2960:1: ( '(' )
            // InternalMyDsl.g:2961:2: '('
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
    // InternalMyDsl.g:2970:1: rule__MessageL__Group__2 : rule__MessageL__Group__2__Impl rule__MessageL__Group__3 ;
    public final void rule__MessageL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2974:1: ( rule__MessageL__Group__2__Impl rule__MessageL__Group__3 )
            // InternalMyDsl.g:2975:2: rule__MessageL__Group__2__Impl rule__MessageL__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2982:1: rule__MessageL__Group__2__Impl : ( ( rule__MessageL__PayloadAssignment_2 )? ) ;
    public final void rule__MessageL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( ( ( rule__MessageL__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:2987:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:2987:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            // InternalMyDsl.g:2988:2: ( rule__MessageL__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageLAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:2989:2: ( rule__MessageL__PayloadAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||(LA14_0>=11 && LA14_0<=13)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2989:3: rule__MessageL__PayloadAssignment_2
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
    // InternalMyDsl.g:2997:1: rule__MessageL__Group__3 : rule__MessageL__Group__3__Impl rule__MessageL__Group__4 ;
    public final void rule__MessageL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3001:1: ( rule__MessageL__Group__3__Impl rule__MessageL__Group__4 )
            // InternalMyDsl.g:3002:2: rule__MessageL__Group__3__Impl rule__MessageL__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3009:1: rule__MessageL__Group__3__Impl : ( ')' ) ;
    public final void rule__MessageL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3013:1: ( ( ')' ) )
            // InternalMyDsl.g:3014:1: ( ')' )
            {
            // InternalMyDsl.g:3014:1: ( ')' )
            // InternalMyDsl.g:3015:2: ')'
            {
             before(grammarAccess.getMessageLAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:3024:1: rule__MessageL__Group__4 : rule__MessageL__Group__4__Impl rule__MessageL__Group__5 ;
    public final void rule__MessageL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3028:1: ( rule__MessageL__Group__4__Impl rule__MessageL__Group__5 )
            // InternalMyDsl.g:3029:2: rule__MessageL__Group__4__Impl rule__MessageL__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3036:1: rule__MessageL__Group__4__Impl : ( ( rule__MessageL__TargetAssignment_4 )? ) ;
    public final void rule__MessageL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3040:1: ( ( ( rule__MessageL__TargetAssignment_4 )? ) )
            // InternalMyDsl.g:3041:1: ( ( rule__MessageL__TargetAssignment_4 )? )
            {
            // InternalMyDsl.g:3041:1: ( ( rule__MessageL__TargetAssignment_4 )? )
            // InternalMyDsl.g:3042:2: ( rule__MessageL__TargetAssignment_4 )?
            {
             before(grammarAccess.getMessageLAccess().getTargetAssignment_4()); 
            // InternalMyDsl.g:3043:2: ( rule__MessageL__TargetAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:3043:3: rule__MessageL__TargetAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageL__TargetAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageLAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:3051:1: rule__MessageL__Group__5 : rule__MessageL__Group__5__Impl rule__MessageL__Group__6 ;
    public final void rule__MessageL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3055:1: ( rule__MessageL__Group__5__Impl rule__MessageL__Group__6 )
            // InternalMyDsl.g:3056:2: rule__MessageL__Group__5__Impl rule__MessageL__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__MessageL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageL__Group__6();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3063:1: rule__MessageL__Group__5__Impl : ( ( rule__MessageL__TargetAssignment_5 )? ) ;
    public final void rule__MessageL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3067:1: ( ( ( rule__MessageL__TargetAssignment_5 )? ) )
            // InternalMyDsl.g:3068:1: ( ( rule__MessageL__TargetAssignment_5 )? )
            {
            // InternalMyDsl.g:3068:1: ( ( rule__MessageL__TargetAssignment_5 )? )
            // InternalMyDsl.g:3069:2: ( rule__MessageL__TargetAssignment_5 )?
            {
             before(grammarAccess.getMessageLAccess().getTargetAssignment_5()); 
            // InternalMyDsl.g:3070:2: ( rule__MessageL__TargetAssignment_5 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:3070:3: rule__MessageL__TargetAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageL__TargetAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageLAccess().getTargetAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__MessageL__Group__6"
    // InternalMyDsl.g:3078:1: rule__MessageL__Group__6 : rule__MessageL__Group__6__Impl ;
    public final void rule__MessageL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3082:1: ( rule__MessageL__Group__6__Impl )
            // InternalMyDsl.g:3083:2: rule__MessageL__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageL__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__6"


    // $ANTLR start "rule__MessageL__Group__6__Impl"
    // InternalMyDsl.g:3089:1: rule__MessageL__Group__6__Impl : ( ';' ) ;
    public final void rule__MessageL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3093:1: ( ( ';' ) )
            // InternalMyDsl.g:3094:1: ( ';' )
            {
            // InternalMyDsl.g:3094:1: ( ';' )
            // InternalMyDsl.g:3095:2: ';'
            {
             before(grammarAccess.getMessageLAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMessageLAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__Group__6__Impl"


    // $ANTLR start "rule__SenderL__Group__0"
    // InternalMyDsl.g:3105:1: rule__SenderL__Group__0 : rule__SenderL__Group__0__Impl rule__SenderL__Group__1 ;
    public final void rule__SenderL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3109:1: ( rule__SenderL__Group__0__Impl rule__SenderL__Group__1 )
            // InternalMyDsl.g:3110:2: rule__SenderL__Group__0__Impl rule__SenderL__Group__1
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
    // InternalMyDsl.g:3117:1: rule__SenderL__Group__0__Impl : ( 'from' ) ;
    public final void rule__SenderL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3121:1: ( ( 'from' ) )
            // InternalMyDsl.g:3122:1: ( 'from' )
            {
            // InternalMyDsl.g:3122:1: ( 'from' )
            // InternalMyDsl.g:3123:2: 'from'
            {
             before(grammarAccess.getSenderLAccess().getFromKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:3132:1: rule__SenderL__Group__1 : rule__SenderL__Group__1__Impl ;
    public final void rule__SenderL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3136:1: ( rule__SenderL__Group__1__Impl )
            // InternalMyDsl.g:3137:2: rule__SenderL__Group__1__Impl
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
    // InternalMyDsl.g:3143:1: rule__SenderL__Group__1__Impl : ( ( rule__SenderL__SenderAssignment_1 ) ) ;
    public final void rule__SenderL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3147:1: ( ( ( rule__SenderL__SenderAssignment_1 ) ) )
            // InternalMyDsl.g:3148:1: ( ( rule__SenderL__SenderAssignment_1 ) )
            {
            // InternalMyDsl.g:3148:1: ( ( rule__SenderL__SenderAssignment_1 ) )
            // InternalMyDsl.g:3149:2: ( rule__SenderL__SenderAssignment_1 )
            {
             before(grammarAccess.getSenderLAccess().getSenderAssignment_1()); 
            // InternalMyDsl.g:3150:2: ( rule__SenderL__SenderAssignment_1 )
            // InternalMyDsl.g:3150:3: rule__SenderL__SenderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SenderL__SenderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSenderLAccess().getSenderAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3159:1: rule__ReceiverL__Group__0 : rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 ;
    public final void rule__ReceiverL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3163:1: ( rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 )
            // InternalMyDsl.g:3164:2: rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1
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
    // InternalMyDsl.g:3171:1: rule__ReceiverL__Group__0__Impl : ( 'to' ) ;
    public final void rule__ReceiverL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3175:1: ( ( 'to' ) )
            // InternalMyDsl.g:3176:1: ( 'to' )
            {
            // InternalMyDsl.g:3176:1: ( 'to' )
            // InternalMyDsl.g:3177:2: 'to'
            {
             before(grammarAccess.getReceiverLAccess().getToKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:3186:1: rule__ReceiverL__Group__1 : rule__ReceiverL__Group__1__Impl ;
    public final void rule__ReceiverL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3190:1: ( rule__ReceiverL__Group__1__Impl )
            // InternalMyDsl.g:3191:2: rule__ReceiverL__Group__1__Impl
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
    // InternalMyDsl.g:3197:1: rule__ReceiverL__Group__1__Impl : ( ( rule__ReceiverL__ToAssignment_1 ) ) ;
    public final void rule__ReceiverL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3201:1: ( ( ( rule__ReceiverL__ToAssignment_1 ) ) )
            // InternalMyDsl.g:3202:1: ( ( rule__ReceiverL__ToAssignment_1 ) )
            {
            // InternalMyDsl.g:3202:1: ( ( rule__ReceiverL__ToAssignment_1 ) )
            // InternalMyDsl.g:3203:2: ( rule__ReceiverL__ToAssignment_1 )
            {
             before(grammarAccess.getReceiverLAccess().getToAssignment_1()); 
            // InternalMyDsl.g:3204:2: ( rule__ReceiverL__ToAssignment_1 )
            // InternalMyDsl.g:3204:3: rule__ReceiverL__ToAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverL__ToAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReceiverLAccess().getToAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3213:1: rule__ChoiceL__Group__0 : rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 ;
    public final void rule__ChoiceL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3217:1: ( rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 )
            // InternalMyDsl.g:3218:2: rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1
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
    // InternalMyDsl.g:3225:1: rule__ChoiceL__Group__0__Impl : ( 'choice' ) ;
    public final void rule__ChoiceL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3229:1: ( ( 'choice' ) )
            // InternalMyDsl.g:3230:1: ( 'choice' )
            {
            // InternalMyDsl.g:3230:1: ( 'choice' )
            // InternalMyDsl.g:3231:2: 'choice'
            {
             before(grammarAccess.getChoiceLAccess().getChoiceKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:3240:1: rule__ChoiceL__Group__1 : rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 ;
    public final void rule__ChoiceL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3244:1: ( rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 )
            // InternalMyDsl.g:3245:2: rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2
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
    // InternalMyDsl.g:3252:1: rule__ChoiceL__Group__1__Impl : ( 'at' ) ;
    public final void rule__ChoiceL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3256:1: ( ( 'at' ) )
            // InternalMyDsl.g:3257:1: ( 'at' )
            {
            // InternalMyDsl.g:3257:1: ( 'at' )
            // InternalMyDsl.g:3258:2: 'at'
            {
             before(grammarAccess.getChoiceLAccess().getAtKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:3267:1: rule__ChoiceL__Group__2 : rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 ;
    public final void rule__ChoiceL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3271:1: ( rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 )
            // InternalMyDsl.g:3272:2: rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3
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
    // InternalMyDsl.g:3279:1: rule__ChoiceL__Group__2__Impl : ( ( rule__ChoiceL__RoleAssignment_2 ) ) ;
    public final void rule__ChoiceL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3283:1: ( ( ( rule__ChoiceL__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:3284:1: ( ( rule__ChoiceL__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:3284:1: ( ( rule__ChoiceL__RoleAssignment_2 ) )
            // InternalMyDsl.g:3285:2: ( rule__ChoiceL__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceLAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:3286:2: ( rule__ChoiceL__RoleAssignment_2 )
            // InternalMyDsl.g:3286:3: rule__ChoiceL__RoleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__RoleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceLAccess().getRoleAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:3294:1: rule__ChoiceL__Group__3 : rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 ;
    public final void rule__ChoiceL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3298:1: ( rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 )
            // InternalMyDsl.g:3299:2: rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3306:1: rule__ChoiceL__Group__3__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3310:1: ( ( '{' ) )
            // InternalMyDsl.g:3311:1: ( '{' )
            {
            // InternalMyDsl.g:3311:1: ( '{' )
            // InternalMyDsl.g:3312:2: '{'
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
    // InternalMyDsl.g:3321:1: rule__ChoiceL__Group__4 : rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 ;
    public final void rule__ChoiceL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3325:1: ( rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 )
            // InternalMyDsl.g:3326:2: rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5
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
    // InternalMyDsl.g:3333:1: rule__ChoiceL__Group__4__Impl : ( ( rule__ChoiceL__BranchesAssignment_4 ) ) ;
    public final void rule__ChoiceL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3337:1: ( ( ( rule__ChoiceL__BranchesAssignment_4 ) ) )
            // InternalMyDsl.g:3338:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            {
            // InternalMyDsl.g:3338:1: ( ( rule__ChoiceL__BranchesAssignment_4 ) )
            // InternalMyDsl.g:3339:2: ( rule__ChoiceL__BranchesAssignment_4 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_4()); 
            // InternalMyDsl.g:3340:2: ( rule__ChoiceL__BranchesAssignment_4 )
            // InternalMyDsl.g:3340:3: rule__ChoiceL__BranchesAssignment_4
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
    // InternalMyDsl.g:3348:1: rule__ChoiceL__Group__5 : rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 ;
    public final void rule__ChoiceL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3352:1: ( rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 )
            // InternalMyDsl.g:3353:2: rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3360:1: rule__ChoiceL__Group__5__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3364:1: ( ( '}' ) )
            // InternalMyDsl.g:3365:1: ( '}' )
            {
            // InternalMyDsl.g:3365:1: ( '}' )
            // InternalMyDsl.g:3366:2: '}'
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
    // InternalMyDsl.g:3375:1: rule__ChoiceL__Group__6 : rule__ChoiceL__Group__6__Impl ;
    public final void rule__ChoiceL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3379:1: ( rule__ChoiceL__Group__6__Impl )
            // InternalMyDsl.g:3380:2: rule__ChoiceL__Group__6__Impl
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
    // InternalMyDsl.g:3386:1: rule__ChoiceL__Group__6__Impl : ( ( rule__ChoiceL__Group_6__0 )* ) ;
    public final void rule__ChoiceL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3390:1: ( ( ( rule__ChoiceL__Group_6__0 )* ) )
            // InternalMyDsl.g:3391:1: ( ( rule__ChoiceL__Group_6__0 )* )
            {
            // InternalMyDsl.g:3391:1: ( ( rule__ChoiceL__Group_6__0 )* )
            // InternalMyDsl.g:3392:2: ( rule__ChoiceL__Group_6__0 )*
            {
             before(grammarAccess.getChoiceLAccess().getGroup_6()); 
            // InternalMyDsl.g:3393:2: ( rule__ChoiceL__Group_6__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:3393:3: rule__ChoiceL__Group_6__0
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3402:1: rule__ChoiceL__Group_6__0 : rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 ;
    public final void rule__ChoiceL__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3406:1: ( rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1 )
            // InternalMyDsl.g:3407:2: rule__ChoiceL__Group_6__0__Impl rule__ChoiceL__Group_6__1
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
    // InternalMyDsl.g:3414:1: rule__ChoiceL__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__ChoiceL__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3418:1: ( ( 'or' ) )
            // InternalMyDsl.g:3419:1: ( 'or' )
            {
            // InternalMyDsl.g:3419:1: ( 'or' )
            // InternalMyDsl.g:3420:2: 'or'
            {
             before(grammarAccess.getChoiceLAccess().getOrKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:3429:1: rule__ChoiceL__Group_6__1 : rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 ;
    public final void rule__ChoiceL__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3433:1: ( rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2 )
            // InternalMyDsl.g:3434:2: rule__ChoiceL__Group_6__1__Impl rule__ChoiceL__Group_6__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3441:1: rule__ChoiceL__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3445:1: ( ( '{' ) )
            // InternalMyDsl.g:3446:1: ( '{' )
            {
            // InternalMyDsl.g:3446:1: ( '{' )
            // InternalMyDsl.g:3447:2: '{'
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
    // InternalMyDsl.g:3456:1: rule__ChoiceL__Group_6__2 : rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 ;
    public final void rule__ChoiceL__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3460:1: ( rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3 )
            // InternalMyDsl.g:3461:2: rule__ChoiceL__Group_6__2__Impl rule__ChoiceL__Group_6__3
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
    // InternalMyDsl.g:3468:1: rule__ChoiceL__Group_6__2__Impl : ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) ;
    public final void rule__ChoiceL__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3472:1: ( ( ( rule__ChoiceL__BranchesAssignment_6_2 ) ) )
            // InternalMyDsl.g:3473:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:3473:1: ( ( rule__ChoiceL__BranchesAssignment_6_2 ) )
            // InternalMyDsl.g:3474:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_6_2()); 
            // InternalMyDsl.g:3475:2: ( rule__ChoiceL__BranchesAssignment_6_2 )
            // InternalMyDsl.g:3475:3: rule__ChoiceL__BranchesAssignment_6_2
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
    // InternalMyDsl.g:3483:1: rule__ChoiceL__Group_6__3 : rule__ChoiceL__Group_6__3__Impl ;
    public final void rule__ChoiceL__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3487:1: ( rule__ChoiceL__Group_6__3__Impl )
            // InternalMyDsl.g:3488:2: rule__ChoiceL__Group_6__3__Impl
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
    // InternalMyDsl.g:3494:1: rule__ChoiceL__Group_6__3__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3498:1: ( ( '}' ) )
            // InternalMyDsl.g:3499:1: ( '}' )
            {
            // InternalMyDsl.g:3499:1: ( '}' )
            // InternalMyDsl.g:3500:2: '}'
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


    // $ANTLR start "rule__ChoiceBranchL__Group__0"
    // InternalMyDsl.g:3510:1: rule__ChoiceBranchL__Group__0 : rule__ChoiceBranchL__Group__0__Impl rule__ChoiceBranchL__Group__1 ;
    public final void rule__ChoiceBranchL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3514:1: ( rule__ChoiceBranchL__Group__0__Impl rule__ChoiceBranchL__Group__1 )
            // InternalMyDsl.g:3515:2: rule__ChoiceBranchL__Group__0__Impl rule__ChoiceBranchL__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ChoiceBranchL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group__0"


    // $ANTLR start "rule__ChoiceBranchL__Group__0__Impl"
    // InternalMyDsl.g:3522:1: rule__ChoiceBranchL__Group__0__Impl : ( ( rule__ChoiceBranchL__MessageAssignment_0 ) ) ;
    public final void rule__ChoiceBranchL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3526:1: ( ( ( rule__ChoiceBranchL__MessageAssignment_0 ) ) )
            // InternalMyDsl.g:3527:1: ( ( rule__ChoiceBranchL__MessageAssignment_0 ) )
            {
            // InternalMyDsl.g:3527:1: ( ( rule__ChoiceBranchL__MessageAssignment_0 ) )
            // InternalMyDsl.g:3528:2: ( rule__ChoiceBranchL__MessageAssignment_0 )
            {
             before(grammarAccess.getChoiceBranchLAccess().getMessageAssignment_0()); 
            // InternalMyDsl.g:3529:2: ( rule__ChoiceBranchL__MessageAssignment_0 )
            // InternalMyDsl.g:3529:3: rule__ChoiceBranchL__MessageAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__MessageAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceBranchLAccess().getMessageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group__0__Impl"


    // $ANTLR start "rule__ChoiceBranchL__Group__1"
    // InternalMyDsl.g:3537:1: rule__ChoiceBranchL__Group__1 : rule__ChoiceBranchL__Group__1__Impl ;
    public final void rule__ChoiceBranchL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3541:1: ( rule__ChoiceBranchL__Group__1__Impl )
            // InternalMyDsl.g:3542:2: rule__ChoiceBranchL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group__1"


    // $ANTLR start "rule__ChoiceBranchL__Group__1__Impl"
    // InternalMyDsl.g:3548:1: rule__ChoiceBranchL__Group__1__Impl : ( ( rule__ChoiceBranchL__ProtocolAssignment_1 ) ) ;
    public final void rule__ChoiceBranchL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3552:1: ( ( ( rule__ChoiceBranchL__ProtocolAssignment_1 ) ) )
            // InternalMyDsl.g:3553:1: ( ( rule__ChoiceBranchL__ProtocolAssignment_1 ) )
            {
            // InternalMyDsl.g:3553:1: ( ( rule__ChoiceBranchL__ProtocolAssignment_1 ) )
            // InternalMyDsl.g:3554:2: ( rule__ChoiceBranchL__ProtocolAssignment_1 )
            {
             before(grammarAccess.getChoiceBranchLAccess().getProtocolAssignment_1()); 
            // InternalMyDsl.g:3555:2: ( rule__ChoiceBranchL__ProtocolAssignment_1 )
            // InternalMyDsl.g:3555:3: rule__ChoiceBranchL__ProtocolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceBranchL__ProtocolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceBranchLAccess().getProtocolAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__Group__1__Impl"


    // $ANTLR start "rule__ForEachL__Group__0"
    // InternalMyDsl.g:3564:1: rule__ForEachL__Group__0 : rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 ;
    public final void rule__ForEachL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3568:1: ( rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 )
            // InternalMyDsl.g:3569:2: rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:3576:1: rule__ForEachL__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEachL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3580:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:3581:1: ( 'foreach' )
            {
            // InternalMyDsl.g:3581:1: ( 'foreach' )
            // InternalMyDsl.g:3582:2: 'foreach'
            {
             before(grammarAccess.getForEachLAccess().getForeachKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:3591:1: rule__ForEachL__Group__1 : rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 ;
    public final void rule__ForEachL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3595:1: ( rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 )
            // InternalMyDsl.g:3596:2: rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2
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
    // InternalMyDsl.g:3603:1: rule__ForEachL__Group__1__Impl : ( ( rule__ForEachL__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEachL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3607:1: ( ( ( rule__ForEachL__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:3608:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3608:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:3609:2: ( rule__ForEachL__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachLAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:3610:2: ( rule__ForEachL__EachRoleAssignment_1 )
            // InternalMyDsl.g:3610:3: rule__ForEachL__EachRoleAssignment_1
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
    // InternalMyDsl.g:3618:1: rule__ForEachL__Group__2 : rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 ;
    public final void rule__ForEachL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3622:1: ( rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 )
            // InternalMyDsl.g:3623:2: rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3630:1: rule__ForEachL__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEachL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3634:1: ( ( ':' ) )
            // InternalMyDsl.g:3635:1: ( ':' )
            {
            // InternalMyDsl.g:3635:1: ( ':' )
            // InternalMyDsl.g:3636:2: ':'
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
    // InternalMyDsl.g:3645:1: rule__ForEachL__Group__3 : rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 ;
    public final void rule__ForEachL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3649:1: ( rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 )
            // InternalMyDsl.g:3650:2: rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:3657:1: rule__ForEachL__Group__3__Impl : ( ( rule__ForEachL__RoleAssignment_3 ) ) ;
    public final void rule__ForEachL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3661:1: ( ( ( rule__ForEachL__RoleAssignment_3 ) ) )
            // InternalMyDsl.g:3662:1: ( ( rule__ForEachL__RoleAssignment_3 ) )
            {
            // InternalMyDsl.g:3662:1: ( ( rule__ForEachL__RoleAssignment_3 ) )
            // InternalMyDsl.g:3663:2: ( rule__ForEachL__RoleAssignment_3 )
            {
             before(grammarAccess.getForEachLAccess().getRoleAssignment_3()); 
            // InternalMyDsl.g:3664:2: ( rule__ForEachL__RoleAssignment_3 )
            // InternalMyDsl.g:3664:3: rule__ForEachL__RoleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__RoleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForEachLAccess().getRoleAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:3672:1: rule__ForEachL__Group__4 : rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 ;
    public final void rule__ForEachL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3676:1: ( rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 )
            // InternalMyDsl.g:3677:2: rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:3684:1: rule__ForEachL__Group__4__Impl : ( '{' ) ;
    public final void rule__ForEachL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3688:1: ( ( '{' ) )
            // InternalMyDsl.g:3689:1: ( '{' )
            {
            // InternalMyDsl.g:3689:1: ( '{' )
            // InternalMyDsl.g:3690:2: '{'
            {
             before(grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:3699:1: rule__ForEachL__Group__5 : rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 ;
    public final void rule__ForEachL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3703:1: ( rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 )
            // InternalMyDsl.g:3704:2: rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:3711:1: rule__ForEachL__Group__5__Impl : ( ( rule__ForEachL__BranchAssignment_5 ) ) ;
    public final void rule__ForEachL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3715:1: ( ( ( rule__ForEachL__BranchAssignment_5 ) ) )
            // InternalMyDsl.g:3716:1: ( ( rule__ForEachL__BranchAssignment_5 ) )
            {
            // InternalMyDsl.g:3716:1: ( ( rule__ForEachL__BranchAssignment_5 ) )
            // InternalMyDsl.g:3717:2: ( rule__ForEachL__BranchAssignment_5 )
            {
             before(grammarAccess.getForEachLAccess().getBranchAssignment_5()); 
            // InternalMyDsl.g:3718:2: ( rule__ForEachL__BranchAssignment_5 )
            // InternalMyDsl.g:3718:3: rule__ForEachL__BranchAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__BranchAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForEachLAccess().getBranchAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:3726:1: rule__ForEachL__Group__6 : rule__ForEachL__Group__6__Impl ;
    public final void rule__ForEachL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3730:1: ( rule__ForEachL__Group__6__Impl )
            // InternalMyDsl.g:3731:2: rule__ForEachL__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEachL__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3737:1: rule__ForEachL__Group__6__Impl : ( '}' ) ;
    public final void rule__ForEachL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3741:1: ( ( '}' ) )
            // InternalMyDsl.g:3742:1: ( '}' )
            {
            // InternalMyDsl.g:3742:1: ( '}' )
            // InternalMyDsl.g:3743:2: '}'
            {
             before(grammarAccess.getForEachLAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__ProtocolAssignment_0"
    // InternalMyDsl.g:3753:1: rule__Model__ProtocolAssignment_0 : ( ruleGlobalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3757:1: ( ( ruleGlobalProtocol ) )
            // InternalMyDsl.g:3758:2: ( ruleGlobalProtocol )
            {
            // InternalMyDsl.g:3758:2: ( ruleGlobalProtocol )
            // InternalMyDsl.g:3759:3: ruleGlobalProtocol
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
    // InternalMyDsl.g:3768:1: rule__Model__ProtocolAssignment_1 : ( ruleLocalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3772:1: ( ( ruleLocalProtocol ) )
            // InternalMyDsl.g:3773:2: ( ruleLocalProtocol )
            {
            // InternalMyDsl.g:3773:2: ( ruleLocalProtocol )
            // InternalMyDsl.g:3774:3: ruleLocalProtocol
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
    // InternalMyDsl.g:3783:1: rule__GlobalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3787:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3788:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3788:2: ( RULE_ID )
            // InternalMyDsl.g:3789:3: RULE_ID
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
    // InternalMyDsl.g:3798:1: rule__GlobalProtocol__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__GlobalProtocol__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3802:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:3803:2: ( ruleRoles )
            {
            // InternalMyDsl.g:3803:2: ( ruleRoles )
            // InternalMyDsl.g:3804:3: ruleRoles
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
    // InternalMyDsl.g:3813:1: rule__GlobalProtocol__ProtocolAssignment_6 : ( ruleProtocol ) ;
    public final void rule__GlobalProtocol__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3817:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:3818:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:3818:2: ( ruleProtocol )
            // InternalMyDsl.g:3819:3: ruleProtocol
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
    // InternalMyDsl.g:3828:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3832:1: ( ( ruleRole ) )
            // InternalMyDsl.g:3833:2: ( ruleRole )
            {
            // InternalMyDsl.g:3833:2: ( ruleRole )
            // InternalMyDsl.g:3834:3: ruleRole
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
    // InternalMyDsl.g:3843:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3847:1: ( ( ruleRole ) )
            // InternalMyDsl.g:3848:2: ( ruleRole )
            {
            // InternalMyDsl.g:3848:2: ( ruleRole )
            // InternalMyDsl.g:3849:3: ruleRole
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
    // InternalMyDsl.g:3858:1: rule__RoleOne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3862:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3863:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3863:2: ( RULE_ID )
            // InternalMyDsl.g:3864:3: RULE_ID
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
    // InternalMyDsl.g:3873:1: rule__RoleSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3877:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3878:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3878:2: ( RULE_ID )
            // InternalMyDsl.g:3879:3: RULE_ID
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
    // InternalMyDsl.g:3888:1: rule__RoleSet__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RoleSet__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3892:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3893:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3893:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3894:3: ( RULE_ID )
            {
             before(grammarAccess.getRoleSetAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:3895:3: ( RULE_ID )
            // InternalMyDsl.g:3896:4: RULE_ID
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
    // InternalMyDsl.g:3907:1: rule__Protocol__ActionsAssignment_0_1 : ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) ) ;
    public final void rule__Protocol__ActionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) ) )
            // InternalMyDsl.g:3912:2: ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) )
            {
            // InternalMyDsl.g:3912:2: ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) )
            // InternalMyDsl.g:3913:3: ( rule__Protocol__ActionsAlternatives_0_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getActionsAlternatives_0_1_0()); 
            // InternalMyDsl.g:3914:3: ( rule__Protocol__ActionsAlternatives_0_1_0 )
            // InternalMyDsl.g:3914:4: rule__Protocol__ActionsAlternatives_0_1_0
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


    // $ANTLR start "rule__Protocol__ActionsAssignment_1"
    // InternalMyDsl.g:3922:1: rule__Protocol__ActionsAssignment_1 : ( ruleCloseRecursion ) ;
    public final void rule__Protocol__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3926:1: ( ( ruleCloseRecursion ) )
            // InternalMyDsl.g:3927:2: ( ruleCloseRecursion )
            {
            // InternalMyDsl.g:3927:2: ( ruleCloseRecursion )
            // InternalMyDsl.g:3928:3: ruleCloseRecursion
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
    // InternalMyDsl.g:3937:1: rule__Recursion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3941:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3942:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3942:2: ( RULE_ID )
            // InternalMyDsl.g:3943:3: RULE_ID
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


    // $ANTLR start "rule__Recursion__RecProtocolAssignment_3"
    // InternalMyDsl.g:3952:1: rule__Recursion__RecProtocolAssignment_3 : ( ruleProtocol ) ;
    public final void rule__Recursion__RecProtocolAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3956:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:3957:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:3957:2: ( ruleProtocol )
            // InternalMyDsl.g:3958:3: ruleProtocol
            {
             before(grammarAccess.getRecursionAccess().getRecProtocolProtocolParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getRecursionAccess().getRecProtocolProtocolParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__RecProtocolAssignment_3"


    // $ANTLR start "rule__CloseRecursion__RecursionVariableAssignment_1"
    // InternalMyDsl.g:3967:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3971:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3972:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3972:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3973:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalMyDsl.g:3974:3: ( RULE_ID )
            // InternalMyDsl.g:3975:4: RULE_ID
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


    // $ANTLR start "rule__ForEach__EachRoleAssignment_1"
    // InternalMyDsl.g:3986:1: rule__ForEach__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEach__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3990:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:3991:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:3991:2: ( ruleRoleOne )
            // InternalMyDsl.g:3992:3: ruleRoleOne
            {
             before(grammarAccess.getForEachAccess().getEachRoleRoleOneParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleOne();

            state._fsp--;

             after(grammarAccess.getForEachAccess().getEachRoleRoleOneParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__EachRoleAssignment_1"


    // $ANTLR start "rule__ForEach__RoleAssignment_3"
    // InternalMyDsl.g:4001:1: rule__ForEach__RoleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4005:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4006:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4006:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4007:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRoleRoleSetCrossReference_3_0()); 
            // InternalMyDsl.g:4008:3: ( RULE_ID )
            // InternalMyDsl.g:4009:4: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getRoleRoleSetIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRoleRoleSetIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getForEachAccess().getRoleRoleSetCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__RoleAssignment_3"


    // $ANTLR start "rule__ForEach__RefRoleAssignment_5"
    // InternalMyDsl.g:4020:1: rule__ForEach__RefRoleAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RefRoleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4024:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4025:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4025:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4026:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_5_0()); 
            // InternalMyDsl.g:4027:3: ( RULE_ID )
            // InternalMyDsl.g:4028:4: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getRefRoleRoleOneIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRefRoleRoleOneIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getForEachAccess().getRefRoleRoleOneCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__RefRoleAssignment_5"


    // $ANTLR start "rule__ForEach__BranchAssignment_7"
    // InternalMyDsl.g:4039:1: rule__ForEach__BranchAssignment_7 : ( ruleProtocol ) ;
    public final void rule__ForEach__BranchAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4043:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4044:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4044:2: ( ruleProtocol )
            // InternalMyDsl.g:4045:3: ruleProtocol
            {
             before(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__BranchAssignment_7"


    // $ANTLR start "rule__Choice__RoleAssignment_2"
    // InternalMyDsl.g:4054:1: rule__Choice__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4058:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4059:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4059:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4060:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 
            // InternalMyDsl.g:4061:3: ( RULE_ID )
            // InternalMyDsl.g:4062:4: RULE_ID
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
    // InternalMyDsl.g:4073:1: rule__Choice__BranchesAssignment_4 : ( ruleChoiceBranch ) ;
    public final void rule__Choice__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4077:1: ( ( ruleChoiceBranch ) )
            // InternalMyDsl.g:4078:2: ( ruleChoiceBranch )
            {
            // InternalMyDsl.g:4078:2: ( ruleChoiceBranch )
            // InternalMyDsl.g:4079:3: ruleChoiceBranch
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
    // InternalMyDsl.g:4088:1: rule__Choice__BranchesAssignment_6_2 : ( ruleChoiceBranch ) ;
    public final void rule__Choice__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4092:1: ( ( ruleChoiceBranch ) )
            // InternalMyDsl.g:4093:2: ( ruleChoiceBranch )
            {
            // InternalMyDsl.g:4093:2: ( ruleChoiceBranch )
            // InternalMyDsl.g:4094:3: ruleChoiceBranch
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
    // InternalMyDsl.g:4103:1: rule__ChoiceBranch__MessageAssignment_0 : ( ruleMessage ) ;
    public final void rule__ChoiceBranch__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4107:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4108:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4108:2: ( ruleMessage )
            // InternalMyDsl.g:4109:3: ruleMessage
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
    // InternalMyDsl.g:4118:1: rule__ChoiceBranch__ProtocolAssignment_1 : ( ruleProtocol ) ;
    public final void rule__ChoiceBranch__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4122:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4123:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4123:2: ( ruleProtocol )
            // InternalMyDsl.g:4124:3: ruleProtocol
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
    // InternalMyDsl.g:4133:1: rule__Message__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4137:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4138:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4138:2: ( RULE_ID )
            // InternalMyDsl.g:4139:3: RULE_ID
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
    // InternalMyDsl.g:4148:1: rule__Message__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__Message__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4152:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4153:2: ( rulePayload )
            {
            // InternalMyDsl.g:4153:2: ( rulePayload )
            // InternalMyDsl.g:4154:3: rulePayload
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
    // InternalMyDsl.g:4163:1: rule__Message__SenderAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4167:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4168:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4168:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4169:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0()); 
            // InternalMyDsl.g:4170:3: ( RULE_ID )
            // InternalMyDsl.g:4171:4: RULE_ID
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
    // InternalMyDsl.g:4182:1: rule__Message__ReceiverAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4186:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4187:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4187:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4188:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleCrossReference_7_0()); 
            // InternalMyDsl.g:4189:3: ( RULE_ID )
            // InternalMyDsl.g:4190:4: RULE_ID
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
    // InternalMyDsl.g:4201:1: rule__Payload__TypesAssignment_0_1_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4205:1: ( ( ruleType ) )
            // InternalMyDsl.g:4206:2: ( ruleType )
            {
            // InternalMyDsl.g:4206:2: ( ruleType )
            // InternalMyDsl.g:4207:3: ruleType
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
    // InternalMyDsl.g:4216:1: rule__Payload__TypesAssignment_0_1_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4220:1: ( ( ruleType ) )
            // InternalMyDsl.g:4221:2: ( ruleType )
            {
            // InternalMyDsl.g:4221:2: ( ruleType )
            // InternalMyDsl.g:4222:3: ruleType
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
    // InternalMyDsl.g:4231:1: rule__Payload__TypesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Payload__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4235:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4236:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4236:2: ( RULE_ID )
            // InternalMyDsl.g:4237:3: RULE_ID
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
    // InternalMyDsl.g:4246:1: rule__LocalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4250:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4251:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4251:2: ( RULE_ID )
            // InternalMyDsl.g:4252:3: RULE_ID
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
    // InternalMyDsl.g:4261:1: rule__LocalProtocol__ProjectedRoleAssignment_4 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProjectedRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4265:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4266:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4266:2: ( RULE_ID )
            // InternalMyDsl.g:4267:3: RULE_ID
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
    // InternalMyDsl.g:4276:1: rule__LocalProtocol__RolesAssignment_6 : ( ruleRoles ) ;
    public final void rule__LocalProtocol__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4280:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:4281:2: ( ruleRoles )
            {
            // InternalMyDsl.g:4281:2: ( ruleRoles )
            // InternalMyDsl.g:4282:3: ruleRoles
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
    // InternalMyDsl.g:4291:1: rule__LocalProtocol__ProtocolAssignment_9 : ( ruleProtocolL ) ;
    public final void rule__LocalProtocol__ProtocolAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4295:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4296:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4296:2: ( ruleProtocolL )
            // InternalMyDsl.g:4297:3: ruleProtocolL
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
    // InternalMyDsl.g:4306:1: rule__ProtocolL__ActionsAssignment_1 : ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) ) ;
    public final void rule__ProtocolL__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4310:1: ( ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) ) )
            // InternalMyDsl.g:4311:2: ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:4311:2: ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) )
            // InternalMyDsl.g:4312:3: ( rule__ProtocolL__ActionsAlternatives_1_0 )
            {
             before(grammarAccess.getProtocolLAccess().getActionsAlternatives_1_0()); 
            // InternalMyDsl.g:4313:3: ( rule__ProtocolL__ActionsAlternatives_1_0 )
            // InternalMyDsl.g:4313:4: rule__ProtocolL__ActionsAlternatives_1_0
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


    // $ANTLR start "rule__MessageL__MessageTypeAssignment_0"
    // InternalMyDsl.g:4321:1: rule__MessageL__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4325:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4326:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4326:2: ( RULE_ID )
            // InternalMyDsl.g:4327:3: RULE_ID
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
    // InternalMyDsl.g:4336:1: rule__MessageL__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__MessageL__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4340:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4341:2: ( rulePayload )
            {
            // InternalMyDsl.g:4341:2: ( rulePayload )
            // InternalMyDsl.g:4342:3: rulePayload
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


    // $ANTLR start "rule__MessageL__TargetAssignment_4"
    // InternalMyDsl.g:4351:1: rule__MessageL__TargetAssignment_4 : ( ruleSenderL ) ;
    public final void rule__MessageL__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4355:1: ( ( ruleSenderL ) )
            // InternalMyDsl.g:4356:2: ( ruleSenderL )
            {
            // InternalMyDsl.g:4356:2: ( ruleSenderL )
            // InternalMyDsl.g:4357:3: ruleSenderL
            {
             before(grammarAccess.getMessageLAccess().getTargetSenderLParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSenderL();

            state._fsp--;

             after(grammarAccess.getMessageLAccess().getTargetSenderLParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__TargetAssignment_4"


    // $ANTLR start "rule__MessageL__TargetAssignment_5"
    // InternalMyDsl.g:4366:1: rule__MessageL__TargetAssignment_5 : ( ruleReceiverL ) ;
    public final void rule__MessageL__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4370:1: ( ( ruleReceiverL ) )
            // InternalMyDsl.g:4371:2: ( ruleReceiverL )
            {
            // InternalMyDsl.g:4371:2: ( ruleReceiverL )
            // InternalMyDsl.g:4372:3: ruleReceiverL
            {
             before(grammarAccess.getMessageLAccess().getTargetReceiverLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleReceiverL();

            state._fsp--;

             after(grammarAccess.getMessageLAccess().getTargetReceiverLParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__TargetAssignment_5"


    // $ANTLR start "rule__SenderL__SenderAssignment_1"
    // InternalMyDsl.g:4381:1: rule__SenderL__SenderAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SenderL__SenderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4385:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4386:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4386:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4387:3: ( RULE_ID )
            {
             before(grammarAccess.getSenderLAccess().getSenderRoleCrossReference_1_0()); 
            // InternalMyDsl.g:4388:3: ( RULE_ID )
            // InternalMyDsl.g:4389:4: RULE_ID
            {
             before(grammarAccess.getSenderLAccess().getSenderRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSenderLAccess().getSenderRoleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSenderLAccess().getSenderRoleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SenderL__SenderAssignment_1"


    // $ANTLR start "rule__ReceiverL__ToAssignment_1"
    // InternalMyDsl.g:4400:1: rule__ReceiverL__ToAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReceiverL__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4404:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4405:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4405:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4406:3: ( RULE_ID )
            {
             before(grammarAccess.getReceiverLAccess().getToRoleCrossReference_1_0()); 
            // InternalMyDsl.g:4407:3: ( RULE_ID )
            // InternalMyDsl.g:4408:4: RULE_ID
            {
             before(grammarAccess.getReceiverLAccess().getToRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReceiverLAccess().getToRoleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReceiverLAccess().getToRoleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverL__ToAssignment_1"


    // $ANTLR start "rule__ChoiceL__RoleAssignment_2"
    // InternalMyDsl.g:4419:1: rule__ChoiceL__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChoiceL__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4423:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4424:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4424:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4425:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceLAccess().getRoleRoleCrossReference_2_0()); 
            // InternalMyDsl.g:4426:3: ( RULE_ID )
            // InternalMyDsl.g:4427:4: RULE_ID
            {
             before(grammarAccess.getChoiceLAccess().getRoleRoleIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getRoleRoleIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getChoiceLAccess().getRoleRoleCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__RoleAssignment_2"


    // $ANTLR start "rule__ChoiceL__BranchesAssignment_4"
    // InternalMyDsl.g:4438:1: rule__ChoiceL__BranchesAssignment_4 : ( ruleChoiceBranchL ) ;
    public final void rule__ChoiceL__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4442:1: ( ( ruleChoiceBranchL ) )
            // InternalMyDsl.g:4443:2: ( ruleChoiceBranchL )
            {
            // InternalMyDsl.g:4443:2: ( ruleChoiceBranchL )
            // InternalMyDsl.g:4444:3: ruleChoiceBranchL
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
    // InternalMyDsl.g:4453:1: rule__ChoiceL__BranchesAssignment_6_2 : ( ruleChoiceBranchL ) ;
    public final void rule__ChoiceL__BranchesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4457:1: ( ( ruleChoiceBranchL ) )
            // InternalMyDsl.g:4458:2: ( ruleChoiceBranchL )
            {
            // InternalMyDsl.g:4458:2: ( ruleChoiceBranchL )
            // InternalMyDsl.g:4459:3: ruleChoiceBranchL
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


    // $ANTLR start "rule__ChoiceBranchL__MessageAssignment_0"
    // InternalMyDsl.g:4468:1: rule__ChoiceBranchL__MessageAssignment_0 : ( ruleMessageL ) ;
    public final void rule__ChoiceBranchL__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4472:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:4473:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:4473:2: ( ruleMessageL )
            // InternalMyDsl.g:4474:3: ruleMessageL
            {
             before(grammarAccess.getChoiceBranchLAccess().getMessageMessageLParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageL();

            state._fsp--;

             after(grammarAccess.getChoiceBranchLAccess().getMessageMessageLParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__MessageAssignment_0"


    // $ANTLR start "rule__ChoiceBranchL__ProtocolAssignment_1"
    // InternalMyDsl.g:4483:1: rule__ChoiceBranchL__ProtocolAssignment_1 : ( ruleProtocolL ) ;
    public final void rule__ChoiceBranchL__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4487:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4488:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4488:2: ( ruleProtocolL )
            // InternalMyDsl.g:4489:3: ruleProtocolL
            {
             before(grammarAccess.getChoiceBranchLAccess().getProtocolProtocolLParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getChoiceBranchLAccess().getProtocolProtocolLParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceBranchL__ProtocolAssignment_1"


    // $ANTLR start "rule__ForEachL__EachRoleAssignment_1"
    // InternalMyDsl.g:4498:1: rule__ForEachL__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEachL__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4502:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:4503:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:4503:2: ( ruleRoleOne )
            // InternalMyDsl.g:4504:3: ruleRoleOne
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


    // $ANTLR start "rule__ForEachL__RoleAssignment_3"
    // InternalMyDsl.g:4513:1: rule__ForEachL__RoleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4517:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4518:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4518:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4519:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRoleRoleSetCrossReference_3_0()); 
            // InternalMyDsl.g:4520:3: ( RULE_ID )
            // InternalMyDsl.g:4521:4: RULE_ID
            {
             before(grammarAccess.getForEachLAccess().getRoleRoleSetIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getRoleRoleSetIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getForEachLAccess().getRoleRoleSetCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__RoleAssignment_3"


    // $ANTLR start "rule__ForEachL__BranchAssignment_5"
    // InternalMyDsl.g:4532:1: rule__ForEachL__BranchAssignment_5 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__BranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4536:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4537:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4537:2: ( ruleProtocolL )
            // InternalMyDsl.g:4538:3: ruleProtocolL
            {
             before(grammarAccess.getForEachLAccess().getBranchProtocolLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getForEachLAccess().getBranchProtocolLParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachL__BranchAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000002A800010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000028800010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000028800012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080003810L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000002A800012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000304000000L});

}