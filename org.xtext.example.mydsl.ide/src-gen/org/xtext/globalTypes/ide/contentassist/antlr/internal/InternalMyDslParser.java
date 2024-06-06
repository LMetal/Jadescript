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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'action'", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'roleset'", "':'", "'rec'", "'loop'", "';'", "'foreach'", "'{'", "'choice'", "'at'", "'or'", "')'", "'from'", "'to'", "'local'"
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


    // $ANTLR start "entryRuleMessage"
    // InternalMyDsl.g:328:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleMessage EOF )
            // InternalMyDsl.g:330:1: ruleMessage EOF
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
    // InternalMyDsl.g:337:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Message__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Message__Group__0 )
            // InternalMyDsl.g:344:4: rule__Message__Group__0
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
    // InternalMyDsl.g:353:1: entryRulePayload : rulePayload EOF ;
    public final void entryRulePayload() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( rulePayload EOF )
            // InternalMyDsl.g:355:1: rulePayload EOF
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
    // InternalMyDsl.g:362:1: rulePayload : ( ( rule__Payload__Alternatives ) ) ;
    public final void rulePayload() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Payload__Alternatives ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Payload__Alternatives ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Payload__Alternatives ) )
            // InternalMyDsl.g:368:3: ( rule__Payload__Alternatives )
            {
             before(grammarAccess.getPayloadAccess().getAlternatives()); 
            // InternalMyDsl.g:369:3: ( rule__Payload__Alternatives )
            // InternalMyDsl.g:369:4: rule__Payload__Alternatives
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
    // InternalMyDsl.g:378:1: entryRuleLocalProtocol : ruleLocalProtocol EOF ;
    public final void entryRuleLocalProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleLocalProtocol EOF )
            // InternalMyDsl.g:380:1: ruleLocalProtocol EOF
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
    // InternalMyDsl.g:387:1: ruleLocalProtocol : ( ( rule__LocalProtocol__Group__0 ) ) ;
    public final void ruleLocalProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__LocalProtocol__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__LocalProtocol__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__LocalProtocol__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__LocalProtocol__Group__0 )
            {
             before(grammarAccess.getLocalProtocolAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__LocalProtocol__Group__0 )
            // InternalMyDsl.g:394:4: rule__LocalProtocol__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleProtocolL : ruleProtocolL EOF ;
    public final void entryRuleProtocolL() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleProtocolL EOF )
            // InternalMyDsl.g:405:1: ruleProtocolL EOF
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
    // InternalMyDsl.g:412:1: ruleProtocolL : ( ( rule__ProtocolL__Group__0 ) ) ;
    public final void ruleProtocolL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__ProtocolL__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__ProtocolL__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__ProtocolL__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__ProtocolL__Group__0 )
            {
             before(grammarAccess.getProtocolLAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__ProtocolL__Group__0 )
            // InternalMyDsl.g:419:4: rule__ProtocolL__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleMessageL : ruleMessageL EOF ;
    public final void entryRuleMessageL() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleMessageL EOF )
            // InternalMyDsl.g:430:1: ruleMessageL EOF
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
    // InternalMyDsl.g:437:1: ruleMessageL : ( ( rule__MessageL__Group__0 ) ) ;
    public final void ruleMessageL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__MessageL__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__MessageL__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__MessageL__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__MessageL__Group__0 )
            {
             before(grammarAccess.getMessageLAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__MessageL__Group__0 )
            // InternalMyDsl.g:444:4: rule__MessageL__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleSenderL : ruleSenderL EOF ;
    public final void entryRuleSenderL() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleSenderL EOF )
            // InternalMyDsl.g:455:1: ruleSenderL EOF
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
    // InternalMyDsl.g:462:1: ruleSenderL : ( ( rule__SenderL__Group__0 ) ) ;
    public final void ruleSenderL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__SenderL__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__SenderL__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__SenderL__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__SenderL__Group__0 )
            {
             before(grammarAccess.getSenderLAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__SenderL__Group__0 )
            // InternalMyDsl.g:469:4: rule__SenderL__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleReceiverL : ruleReceiverL EOF ;
    public final void entryRuleReceiverL() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleReceiverL EOF )
            // InternalMyDsl.g:480:1: ruleReceiverL EOF
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
    // InternalMyDsl.g:487:1: ruleReceiverL : ( ( rule__ReceiverL__Group__0 ) ) ;
    public final void ruleReceiverL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__ReceiverL__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__ReceiverL__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__ReceiverL__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__ReceiverL__Group__0 )
            {
             before(grammarAccess.getReceiverLAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__ReceiverL__Group__0 )
            // InternalMyDsl.g:494:4: rule__ReceiverL__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleChoiceL : ruleChoiceL EOF ;
    public final void entryRuleChoiceL() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleChoiceL EOF )
            // InternalMyDsl.g:505:1: ruleChoiceL EOF
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
    // InternalMyDsl.g:512:1: ruleChoiceL : ( ( rule__ChoiceL__Group__0 ) ) ;
    public final void ruleChoiceL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__ChoiceL__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__ChoiceL__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__ChoiceL__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__ChoiceL__Group__0 )
            {
             before(grammarAccess.getChoiceLAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__ChoiceL__Group__0 )
            // InternalMyDsl.g:519:4: rule__ChoiceL__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleForEachL : ruleForEachL EOF ;
    public final void entryRuleForEachL() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleForEachL EOF )
            // InternalMyDsl.g:530:1: ruleForEachL EOF
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
    // InternalMyDsl.g:537:1: ruleForEachL : ( ( rule__ForEachL__Group__0 ) ) ;
    public final void ruleForEachL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__ForEachL__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__ForEachL__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__ForEachL__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__ForEachL__Group__0 )
            {
             before(grammarAccess.getForEachLAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__ForEachL__Group__0 )
            // InternalMyDsl.g:544:4: rule__ForEachL__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleType EOF )
            // InternalMyDsl.g:555:1: ruleType EOF
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
    // InternalMyDsl.g:562:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:568:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:569:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:569:4: rule__Type__Alternatives
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
    // InternalMyDsl.g:577:1: rule__Model__Alternatives : ( ( ( rule__Model__ProtocolAssignment_0 ) ) | ( ( rule__Model__ProtocolAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( ( rule__Model__ProtocolAssignment_0 ) ) | ( ( rule__Model__ProtocolAssignment_1 ) ) )
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
                    // InternalMyDsl.g:582:2: ( ( rule__Model__ProtocolAssignment_0 ) )
                    {
                    // InternalMyDsl.g:582:2: ( ( rule__Model__ProtocolAssignment_0 ) )
                    // InternalMyDsl.g:583:3: ( rule__Model__ProtocolAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_0()); 
                    // InternalMyDsl.g:584:3: ( rule__Model__ProtocolAssignment_0 )
                    // InternalMyDsl.g:584:4: rule__Model__ProtocolAssignment_0
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
                    // InternalMyDsl.g:588:2: ( ( rule__Model__ProtocolAssignment_1 ) )
                    {
                    // InternalMyDsl.g:588:2: ( ( rule__Model__ProtocolAssignment_1 ) )
                    // InternalMyDsl.g:589:3: ( rule__Model__ProtocolAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getProtocolAssignment_1()); 
                    // InternalMyDsl.g:590:3: ( rule__Model__ProtocolAssignment_1 )
                    // InternalMyDsl.g:590:4: rule__Model__ProtocolAssignment_1
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
    // InternalMyDsl.g:598:1: rule__Role__Alternatives : ( ( ruleRoleOne ) | ( ruleRoleSet ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( ( ruleRoleOne ) | ( ruleRoleSet ) )
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
                    // InternalMyDsl.g:603:2: ( ruleRoleOne )
                    {
                    // InternalMyDsl.g:603:2: ( ruleRoleOne )
                    // InternalMyDsl.g:604:3: ruleRoleOne
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
                    // InternalMyDsl.g:609:2: ( ruleRoleSet )
                    {
                    // InternalMyDsl.g:609:2: ( ruleRoleSet )
                    // InternalMyDsl.g:610:3: ruleRoleSet
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


    // $ANTLR start "rule__Protocol__ActionsAlternatives_1_0"
    // InternalMyDsl.g:619:1: rule__Protocol__ActionsAlternatives_1_0 : ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) );
    public final void rule__Protocol__ActionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            case 24:
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
                    // InternalMyDsl.g:624:2: ( ruleMessage )
                    {
                    // InternalMyDsl.g:624:2: ( ruleMessage )
                    // InternalMyDsl.g:625:3: ruleMessage
                    {
                     before(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:630:2: ( ruleChoice )
                    {
                    // InternalMyDsl.g:630:2: ( ruleChoice )
                    // InternalMyDsl.g:631:3: ruleChoice
                    {
                     before(grammarAccess.getProtocolAccess().getActionsChoiceParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChoice();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsChoiceParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:636:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:636:2: ( ruleRecursion )
                    // InternalMyDsl.g:637:3: ruleRecursion
                    {
                     before(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:642:2: ( ruleForEach )
                    {
                    // InternalMyDsl.g:642:2: ( ruleForEach )
                    // InternalMyDsl.g:643:3: ruleForEach
                    {
                     before(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleForEach();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:648:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:648:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:649:3: ruleCloseRecursion
                    {
                     before(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_1_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCloseRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_1_0_4()); 

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
    // $ANTLR end "rule__Protocol__ActionsAlternatives_1_0"


    // $ANTLR start "rule__Payload__Alternatives"
    // InternalMyDsl.g:658:1: rule__Payload__Alternatives : ( ( ( rule__Payload__Group_0__0 ) ) | ( ( rule__Payload__TypesAssignment_1 ) ) );
    public final void rule__Payload__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( ( ( rule__Payload__Group_0__0 ) ) | ( ( rule__Payload__TypesAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:663:2: ( ( rule__Payload__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:663:2: ( ( rule__Payload__Group_0__0 ) )
                    // InternalMyDsl.g:664:3: ( rule__Payload__Group_0__0 )
                    {
                     before(grammarAccess.getPayloadAccess().getGroup_0()); 
                    // InternalMyDsl.g:665:3: ( rule__Payload__Group_0__0 )
                    // InternalMyDsl.g:665:4: rule__Payload__Group_0__0
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
                    // InternalMyDsl.g:669:2: ( ( rule__Payload__TypesAssignment_1 ) )
                    {
                    // InternalMyDsl.g:669:2: ( ( rule__Payload__TypesAssignment_1 ) )
                    // InternalMyDsl.g:670:3: ( rule__Payload__TypesAssignment_1 )
                    {
                     before(grammarAccess.getPayloadAccess().getTypesAssignment_1()); 
                    // InternalMyDsl.g:671:3: ( rule__Payload__TypesAssignment_1 )
                    // InternalMyDsl.g:671:4: rule__Payload__TypesAssignment_1
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
    // InternalMyDsl.g:679:1: rule__ProtocolL__ActionsAlternatives_1_0 : ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursion ) | ( ruleCloseRecursion ) );
    public final void rule__ProtocolL__ActionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:683:1: ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursion ) | ( ruleCloseRecursion ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:684:2: ( ruleMessageL )
                    {
                    // InternalMyDsl.g:684:2: ( ruleMessageL )
                    // InternalMyDsl.g:685:3: ruleMessageL
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
                    // InternalMyDsl.g:690:2: ( ruleChoiceL )
                    {
                    // InternalMyDsl.g:690:2: ( ruleChoiceL )
                    // InternalMyDsl.g:691:3: ruleChoiceL
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
                    // InternalMyDsl.g:696:2: ( ruleForEachL )
                    {
                    // InternalMyDsl.g:696:2: ( ruleForEachL )
                    // InternalMyDsl.g:697:3: ruleForEachL
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
                    // InternalMyDsl.g:702:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:702:2: ( ruleRecursion )
                    // InternalMyDsl.g:703:3: ruleRecursion
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
                    // InternalMyDsl.g:708:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:708:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:709:3: ruleCloseRecursion
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
    // InternalMyDsl.g:718:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'action' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:722:1: ( ( 'int' ) | ( 'string' ) | ( 'action' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:723:2: ( 'int' )
                    {
                    // InternalMyDsl.g:723:2: ( 'int' )
                    // InternalMyDsl.g:724:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:729:2: ( 'string' )
                    {
                    // InternalMyDsl.g:729:2: ( 'string' )
                    // InternalMyDsl.g:730:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:735:2: ( 'action' )
                    {
                    // InternalMyDsl.g:735:2: ( 'action' )
                    // InternalMyDsl.g:736:3: 'action'
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
    // InternalMyDsl.g:745:1: rule__GlobalProtocol__Group__0 : rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 ;
    public final void rule__GlobalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:749:1: ( rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 )
            // InternalMyDsl.g:750:2: rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1
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
    // InternalMyDsl.g:757:1: rule__GlobalProtocol__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( ( 'global' ) )
            // InternalMyDsl.g:762:1: ( 'global' )
            {
            // InternalMyDsl.g:762:1: ( 'global' )
            // InternalMyDsl.g:763:2: 'global'
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
    // InternalMyDsl.g:772:1: rule__GlobalProtocol__Group__1 : rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 ;
    public final void rule__GlobalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:776:1: ( rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 )
            // InternalMyDsl.g:777:2: rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2
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
    // InternalMyDsl.g:784:1: rule__GlobalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__GlobalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:789:1: ( 'protocol' )
            {
            // InternalMyDsl.g:789:1: ( 'protocol' )
            // InternalMyDsl.g:790:2: 'protocol'
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
    // InternalMyDsl.g:799:1: rule__GlobalProtocol__Group__2 : rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 ;
    public final void rule__GlobalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:803:1: ( rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 )
            // InternalMyDsl.g:804:2: rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3
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
    // InternalMyDsl.g:811:1: rule__GlobalProtocol__Group__2__Impl : ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__GlobalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:816:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:816:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:817:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:818:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:818:3: rule__GlobalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:826:1: rule__GlobalProtocol__Group__3 : rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 ;
    public final void rule__GlobalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:830:1: ( rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 )
            // InternalMyDsl.g:831:2: rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4
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
    // InternalMyDsl.g:838:1: rule__GlobalProtocol__Group__3__Impl : ( '(' ) ;
    public final void rule__GlobalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( ( '(' ) )
            // InternalMyDsl.g:843:1: ( '(' )
            {
            // InternalMyDsl.g:843:1: ( '(' )
            // InternalMyDsl.g:844:2: '('
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
    // InternalMyDsl.g:853:1: rule__GlobalProtocol__Group__4 : rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 ;
    public final void rule__GlobalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:857:1: ( rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 )
            // InternalMyDsl.g:858:2: rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5
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
    // InternalMyDsl.g:865:1: rule__GlobalProtocol__Group__4__Impl : ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) ;
    public final void rule__GlobalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) )
            // InternalMyDsl.g:870:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            {
            // InternalMyDsl.g:870:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            // InternalMyDsl.g:871:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getRolesAssignment_4()); 
            // InternalMyDsl.g:872:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            // InternalMyDsl.g:872:3: rule__GlobalProtocol__RolesAssignment_4
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
    // InternalMyDsl.g:880:1: rule__GlobalProtocol__Group__5 : rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 ;
    public final void rule__GlobalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:884:1: ( rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 )
            // InternalMyDsl.g:885:2: rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6
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
    // InternalMyDsl.g:892:1: rule__GlobalProtocol__Group__5__Impl : ( '){' ) ;
    public final void rule__GlobalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:896:1: ( ( '){' ) )
            // InternalMyDsl.g:897:1: ( '){' )
            {
            // InternalMyDsl.g:897:1: ( '){' )
            // InternalMyDsl.g:898:2: '){'
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
    // InternalMyDsl.g:907:1: rule__GlobalProtocol__Group__6 : rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 ;
    public final void rule__GlobalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:911:1: ( rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 )
            // InternalMyDsl.g:912:2: rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7
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
    // InternalMyDsl.g:919:1: rule__GlobalProtocol__Group__6__Impl : ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) ;
    public final void rule__GlobalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) )
            // InternalMyDsl.g:924:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            {
            // InternalMyDsl.g:924:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            // InternalMyDsl.g:925:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolAssignment_6()); 
            // InternalMyDsl.g:926:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            // InternalMyDsl.g:926:3: rule__GlobalProtocol__ProtocolAssignment_6
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
    // InternalMyDsl.g:934:1: rule__GlobalProtocol__Group__7 : rule__GlobalProtocol__Group__7__Impl ;
    public final void rule__GlobalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:938:1: ( rule__GlobalProtocol__Group__7__Impl )
            // InternalMyDsl.g:939:2: rule__GlobalProtocol__Group__7__Impl
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
    // InternalMyDsl.g:945:1: rule__GlobalProtocol__Group__7__Impl : ( '}' ) ;
    public final void rule__GlobalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( ( '}' ) )
            // InternalMyDsl.g:950:1: ( '}' )
            {
            // InternalMyDsl.g:950:1: ( '}' )
            // InternalMyDsl.g:951:2: '}'
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
    // InternalMyDsl.g:961:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:965:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalMyDsl.g:966:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
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
    // InternalMyDsl.g:973:1: rule__Roles__Group__0__Impl : ( ( rule__Roles__RolesAssignment_0 ) ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( ( ( rule__Roles__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:978:1: ( ( rule__Roles__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:978:1: ( ( rule__Roles__RolesAssignment_0 ) )
            // InternalMyDsl.g:979:2: ( rule__Roles__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:980:2: ( rule__Roles__RolesAssignment_0 )
            // InternalMyDsl.g:980:3: rule__Roles__RolesAssignment_0
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
    // InternalMyDsl.g:988:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:992:1: ( rule__Roles__Group__1__Impl )
            // InternalMyDsl.g:993:2: rule__Roles__Group__1__Impl
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
    // InternalMyDsl.g:999:1: rule__Roles__Group__1__Impl : ( ( rule__Roles__Group_1__0 )* ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( ( ( rule__Roles__Group_1__0 )* ) )
            // InternalMyDsl.g:1004:1: ( ( rule__Roles__Group_1__0 )* )
            {
            // InternalMyDsl.g:1004:1: ( ( rule__Roles__Group_1__0 )* )
            // InternalMyDsl.g:1005:2: ( rule__Roles__Group_1__0 )*
            {
             before(grammarAccess.getRolesAccess().getGroup_1()); 
            // InternalMyDsl.g:1006:2: ( rule__Roles__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1006:3: rule__Roles__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Roles__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyDsl.g:1015:1: rule__Roles__Group_1__0 : rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 ;
    public final void rule__Roles__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 )
            // InternalMyDsl.g:1020:2: rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1
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
    // InternalMyDsl.g:1027:1: rule__Roles__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Roles__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( ( ',' ) )
            // InternalMyDsl.g:1032:1: ( ',' )
            {
            // InternalMyDsl.g:1032:1: ( ',' )
            // InternalMyDsl.g:1033:2: ','
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
    // InternalMyDsl.g:1042:1: rule__Roles__Group_1__1 : rule__Roles__Group_1__1__Impl ;
    public final void rule__Roles__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( rule__Roles__Group_1__1__Impl )
            // InternalMyDsl.g:1047:2: rule__Roles__Group_1__1__Impl
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
    // InternalMyDsl.g:1053:1: rule__Roles__Group_1__1__Impl : ( ( rule__Roles__RolesAssignment_1_1 ) ) ;
    public final void rule__Roles__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( ( ( rule__Roles__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:1058:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1058:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:1059:2: ( rule__Roles__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:1060:2: ( rule__Roles__RolesAssignment_1_1 )
            // InternalMyDsl.g:1060:3: rule__Roles__RolesAssignment_1_1
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
    // InternalMyDsl.g:1069:1: rule__RoleOne__Group__0 : rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 ;
    public final void rule__RoleOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1073:1: ( rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 )
            // InternalMyDsl.g:1074:2: rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1
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
    // InternalMyDsl.g:1081:1: rule__RoleOne__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( ( 'role' ) )
            // InternalMyDsl.g:1086:1: ( 'role' )
            {
            // InternalMyDsl.g:1086:1: ( 'role' )
            // InternalMyDsl.g:1087:2: 'role'
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
    // InternalMyDsl.g:1096:1: rule__RoleOne__Group__1 : rule__RoleOne__Group__1__Impl ;
    public final void rule__RoleOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1100:1: ( rule__RoleOne__Group__1__Impl )
            // InternalMyDsl.g:1101:2: rule__RoleOne__Group__1__Impl
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
    // InternalMyDsl.g:1107:1: rule__RoleOne__Group__1__Impl : ( ( rule__RoleOne__NameAssignment_1 ) ) ;
    public final void rule__RoleOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( ( ( rule__RoleOne__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1112:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1112:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            // InternalMyDsl.g:1113:2: ( rule__RoleOne__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1114:2: ( rule__RoleOne__NameAssignment_1 )
            // InternalMyDsl.g:1114:3: rule__RoleOne__NameAssignment_1
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
    // InternalMyDsl.g:1123:1: rule__RoleSet__Group__0 : rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 ;
    public final void rule__RoleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1127:1: ( rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 )
            // InternalMyDsl.g:1128:2: rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1
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
    // InternalMyDsl.g:1135:1: rule__RoleSet__Group__0__Impl : ( 'roleset' ) ;
    public final void rule__RoleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( ( 'roleset' ) )
            // InternalMyDsl.g:1140:1: ( 'roleset' )
            {
            // InternalMyDsl.g:1140:1: ( 'roleset' )
            // InternalMyDsl.g:1141:2: 'roleset'
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
    // InternalMyDsl.g:1150:1: rule__RoleSet__Group__1 : rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 ;
    public final void rule__RoleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1154:1: ( rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 )
            // InternalMyDsl.g:1155:2: rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2
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
    // InternalMyDsl.g:1162:1: rule__RoleSet__Group__1__Impl : ( ( rule__RoleSet__NameAssignment_1 ) ) ;
    public final void rule__RoleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( ( ( rule__RoleSet__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1167:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1167:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            // InternalMyDsl.g:1168:2: ( rule__RoleSet__NameAssignment_1 )
            {
             before(grammarAccess.getRoleSetAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1169:2: ( rule__RoleSet__NameAssignment_1 )
            // InternalMyDsl.g:1169:3: rule__RoleSet__NameAssignment_1
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
    // InternalMyDsl.g:1177:1: rule__RoleSet__Group__2 : rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 ;
    public final void rule__RoleSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1181:1: ( rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 )
            // InternalMyDsl.g:1182:2: rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3
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
    // InternalMyDsl.g:1189:1: rule__RoleSet__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( ( ':' ) )
            // InternalMyDsl.g:1194:1: ( ':' )
            {
            // InternalMyDsl.g:1194:1: ( ':' )
            // InternalMyDsl.g:1195:2: ':'
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
    // InternalMyDsl.g:1204:1: rule__RoleSet__Group__3 : rule__RoleSet__Group__3__Impl ;
    public final void rule__RoleSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1208:1: ( rule__RoleSet__Group__3__Impl )
            // InternalMyDsl.g:1209:2: rule__RoleSet__Group__3__Impl
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
    // InternalMyDsl.g:1215:1: rule__RoleSet__Group__3__Impl : ( ( rule__RoleSet__RefAssignment_3 ) ) ;
    public final void rule__RoleSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( ( ( rule__RoleSet__RefAssignment_3 ) ) )
            // InternalMyDsl.g:1220:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:1220:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            // InternalMyDsl.g:1221:2: ( rule__RoleSet__RefAssignment_3 )
            {
             before(grammarAccess.getRoleSetAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:1222:2: ( rule__RoleSet__RefAssignment_3 )
            // InternalMyDsl.g:1222:3: rule__RoleSet__RefAssignment_3
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
    // InternalMyDsl.g:1231:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1235:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalMyDsl.g:1236:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
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
    // InternalMyDsl.g:1243:1: rule__Protocol__Group__0__Impl : ( () ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( ( () ) )
            // InternalMyDsl.g:1248:1: ( () )
            {
            // InternalMyDsl.g:1248:1: ( () )
            // InternalMyDsl.g:1249:2: ()
            {
             before(grammarAccess.getProtocolAccess().getProtocolAction_0()); 
            // InternalMyDsl.g:1250:2: ()
            // InternalMyDsl.g:1250:3: 
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
    // InternalMyDsl.g:1258:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( rule__Protocol__Group__1__Impl )
            // InternalMyDsl.g:1263:2: rule__Protocol__Group__1__Impl
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
    // InternalMyDsl.g:1269:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__ActionsAssignment_1 )* ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( ( ( rule__Protocol__ActionsAssignment_1 )* ) )
            // InternalMyDsl.g:1274:1: ( ( rule__Protocol__ActionsAssignment_1 )* )
            {
            // InternalMyDsl.g:1274:1: ( ( rule__Protocol__ActionsAssignment_1 )* )
            // InternalMyDsl.g:1275:2: ( rule__Protocol__ActionsAssignment_1 )*
            {
             before(grammarAccess.getProtocolAccess().getActionsAssignment_1()); 
            // InternalMyDsl.g:1276:2: ( rule__Protocol__ActionsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=23 && LA8_0<=24)||LA8_0==26||LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1276:3: rule__Protocol__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Protocol__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getActionsAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1285:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1289:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalMyDsl.g:1290:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
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
    // InternalMyDsl.g:1297:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( ( 'rec' ) )
            // InternalMyDsl.g:1302:1: ( 'rec' )
            {
            // InternalMyDsl.g:1302:1: ( 'rec' )
            // InternalMyDsl.g:1303:2: 'rec'
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
    // InternalMyDsl.g:1312:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1316:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // InternalMyDsl.g:1317:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
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
    // InternalMyDsl.g:1324:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__NameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( ( ( rule__Recursion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1329:1: ( ( rule__Recursion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1329:1: ( ( rule__Recursion__NameAssignment_1 ) )
            // InternalMyDsl.g:1330:2: ( rule__Recursion__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1331:2: ( rule__Recursion__NameAssignment_1 )
            // InternalMyDsl.g:1331:3: rule__Recursion__NameAssignment_1
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
    // InternalMyDsl.g:1339:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1343:1: ( rule__Recursion__Group__2__Impl )
            // InternalMyDsl.g:1344:2: rule__Recursion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1350:1: rule__Recursion__Group__2__Impl : ( ':' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( ( ':' ) )
            // InternalMyDsl.g:1355:1: ( ':' )
            {
            // InternalMyDsl.g:1355:1: ( ':' )
            // InternalMyDsl.g:1356:2: ':'
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


    // $ANTLR start "rule__CloseRecursion__Group__0"
    // InternalMyDsl.g:1366:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1370:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalMyDsl.g:1371:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
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
    // InternalMyDsl.g:1378:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( ( 'loop' ) )
            // InternalMyDsl.g:1383:1: ( 'loop' )
            {
            // InternalMyDsl.g:1383:1: ( 'loop' )
            // InternalMyDsl.g:1384:2: 'loop'
            {
             before(grammarAccess.getCloseRecursionAccess().getLoopKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1393:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1397:1: ( rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 )
            // InternalMyDsl.g:1398:2: rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1405:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:1410:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:1410:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:1411:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:1412:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:1412:3: rule__CloseRecursion__RecursionVariableAssignment_1
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
    // InternalMyDsl.g:1420:1: rule__CloseRecursion__Group__2 : rule__CloseRecursion__Group__2__Impl ;
    public final void rule__CloseRecursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1424:1: ( rule__CloseRecursion__Group__2__Impl )
            // InternalMyDsl.g:1425:2: rule__CloseRecursion__Group__2__Impl
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
    // InternalMyDsl.g:1431:1: rule__CloseRecursion__Group__2__Impl : ( ';' ) ;
    public final void rule__CloseRecursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( ( ';' ) )
            // InternalMyDsl.g:1436:1: ( ';' )
            {
            // InternalMyDsl.g:1436:1: ( ';' )
            // InternalMyDsl.g:1437:2: ';'
            {
             before(grammarAccess.getCloseRecursionAccess().getSemicolonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1447:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1451:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalMyDsl.g:1452:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1459:1: rule__ForEach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:1464:1: ( 'foreach' )
            {
            // InternalMyDsl.g:1464:1: ( 'foreach' )
            // InternalMyDsl.g:1465:2: 'foreach'
            {
             before(grammarAccess.getForEachAccess().getForeachKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1474:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1478:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalMyDsl.g:1479:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
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
    // InternalMyDsl.g:1486:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( ( ( rule__ForEach__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:1491:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:1491:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:1492:2: ( rule__ForEach__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:1493:2: ( rule__ForEach__EachRoleAssignment_1 )
            // InternalMyDsl.g:1493:3: rule__ForEach__EachRoleAssignment_1
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
    // InternalMyDsl.g:1501:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1505:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalMyDsl.g:1506:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
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
    // InternalMyDsl.g:1513:1: rule__ForEach__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( ( ':' ) )
            // InternalMyDsl.g:1518:1: ( ':' )
            {
            // InternalMyDsl.g:1518:1: ( ':' )
            // InternalMyDsl.g:1519:2: ':'
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
    // InternalMyDsl.g:1528:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1532:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalMyDsl.g:1533:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1540:1: rule__ForEach__Group__3__Impl : ( ( rule__ForEach__RoleAssignment_3 ) ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( ( ( rule__ForEach__RoleAssignment_3 ) ) )
            // InternalMyDsl.g:1545:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            {
            // InternalMyDsl.g:1545:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            // InternalMyDsl.g:1546:2: ( rule__ForEach__RoleAssignment_3 )
            {
             before(grammarAccess.getForEachAccess().getRoleAssignment_3()); 
            // InternalMyDsl.g:1547:2: ( rule__ForEach__RoleAssignment_3 )
            // InternalMyDsl.g:1547:3: rule__ForEach__RoleAssignment_3
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
    // InternalMyDsl.g:1555:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1559:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalMyDsl.g:1560:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1567:1: rule__ForEach__Group__4__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( ( '{' ) )
            // InternalMyDsl.g:1572:1: ( '{' )
            {
            // InternalMyDsl.g:1572:1: ( '{' )
            // InternalMyDsl.g:1573:2: '{'
            {
             before(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1582:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1586:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalMyDsl.g:1587:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1594:1: rule__ForEach__Group__5__Impl : ( ( rule__ForEach__BranchAssignment_5 ) ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( ( ( rule__ForEach__BranchAssignment_5 ) ) )
            // InternalMyDsl.g:1599:1: ( ( rule__ForEach__BranchAssignment_5 ) )
            {
            // InternalMyDsl.g:1599:1: ( ( rule__ForEach__BranchAssignment_5 ) )
            // InternalMyDsl.g:1600:2: ( rule__ForEach__BranchAssignment_5 )
            {
             before(grammarAccess.getForEachAccess().getBranchAssignment_5()); 
            // InternalMyDsl.g:1601:2: ( rule__ForEach__BranchAssignment_5 )
            // InternalMyDsl.g:1601:3: rule__ForEach__BranchAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__BranchAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getBranchAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:1609:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1613:1: ( rule__ForEach__Group__6__Impl )
            // InternalMyDsl.g:1614:2: rule__ForEach__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1620:1: rule__ForEach__Group__6__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( ( '}' ) )
            // InternalMyDsl.g:1625:1: ( '}' )
            {
            // InternalMyDsl.g:1625:1: ( '}' )
            // InternalMyDsl.g:1626:2: '}'
            {
             before(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choice__Group__0"
    // InternalMyDsl.g:1636:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1640:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:1641:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1648:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( ( 'choice' ) )
            // InternalMyDsl.g:1653:1: ( 'choice' )
            {
            // InternalMyDsl.g:1653:1: ( 'choice' )
            // InternalMyDsl.g:1654:2: 'choice'
            {
             before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1663:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1667:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:1668:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
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
    // InternalMyDsl.g:1675:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( ( 'at' ) )
            // InternalMyDsl.g:1680:1: ( 'at' )
            {
            // InternalMyDsl.g:1680:1: ( 'at' )
            // InternalMyDsl.g:1681:2: 'at'
            {
             before(grammarAccess.getChoiceAccess().getAtKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1690:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1694:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:1695:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1702:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:1707:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:1707:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalMyDsl.g:1708:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:1709:2: ( rule__Choice__RoleAssignment_2 )
            // InternalMyDsl.g:1709:3: rule__Choice__RoleAssignment_2
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
    // InternalMyDsl.g:1717:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1721:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:1722:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
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
    // InternalMyDsl.g:1729:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( ( '{' ) )
            // InternalMyDsl.g:1734:1: ( '{' )
            {
            // InternalMyDsl.g:1734:1: ( '{' )
            // InternalMyDsl.g:1735:2: '{'
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
    // InternalMyDsl.g:1744:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1748:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:1749:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1756:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__MessageAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( ( ( rule__Choice__MessageAssignment_4 ) ) )
            // InternalMyDsl.g:1761:1: ( ( rule__Choice__MessageAssignment_4 ) )
            {
            // InternalMyDsl.g:1761:1: ( ( rule__Choice__MessageAssignment_4 ) )
            // InternalMyDsl.g:1762:2: ( rule__Choice__MessageAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getMessageAssignment_4()); 
            // InternalMyDsl.g:1763:2: ( rule__Choice__MessageAssignment_4 )
            // InternalMyDsl.g:1763:3: rule__Choice__MessageAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Choice__MessageAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getMessageAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1771:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1775:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:1776:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1783:1: rule__Choice__Group__5__Impl : ( ( rule__Choice__BranchesAssignment_5 ) ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( ( ( rule__Choice__BranchesAssignment_5 ) ) )
            // InternalMyDsl.g:1788:1: ( ( rule__Choice__BranchesAssignment_5 ) )
            {
            // InternalMyDsl.g:1788:1: ( ( rule__Choice__BranchesAssignment_5 ) )
            // InternalMyDsl.g:1789:2: ( rule__Choice__BranchesAssignment_5 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_5()); 
            // InternalMyDsl.g:1790:2: ( rule__Choice__BranchesAssignment_5 )
            // InternalMyDsl.g:1790:3: rule__Choice__BranchesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Choice__BranchesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBranchesAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:1798:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl rule__Choice__Group__7 ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1802:1: ( rule__Choice__Group__6__Impl rule__Choice__Group__7 )
            // InternalMyDsl.g:1803:2: rule__Choice__Group__6__Impl rule__Choice__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Choice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__7();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1810:1: rule__Choice__Group__6__Impl : ( '}' ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( ( '}' ) )
            // InternalMyDsl.g:1815:1: ( '}' )
            {
            // InternalMyDsl.g:1815:1: ( '}' )
            // InternalMyDsl.g:1816:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choice__Group__7"
    // InternalMyDsl.g:1825:1: rule__Choice__Group__7 : rule__Choice__Group__7__Impl ;
    public final void rule__Choice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1829:1: ( rule__Choice__Group__7__Impl )
            // InternalMyDsl.g:1830:2: rule__Choice__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__7"


    // $ANTLR start "rule__Choice__Group__7__Impl"
    // InternalMyDsl.g:1836:1: rule__Choice__Group__7__Impl : ( ( rule__Choice__Group_7__0 )* ) ;
    public final void rule__Choice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( ( ( rule__Choice__Group_7__0 )* ) )
            // InternalMyDsl.g:1841:1: ( ( rule__Choice__Group_7__0 )* )
            {
            // InternalMyDsl.g:1841:1: ( ( rule__Choice__Group_7__0 )* )
            // InternalMyDsl.g:1842:2: ( rule__Choice__Group_7__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_7()); 
            // InternalMyDsl.g:1843:2: ( rule__Choice__Group_7__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1843:3: rule__Choice__Group_7__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Choice__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getChoiceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__7__Impl"


    // $ANTLR start "rule__Choice__Group_7__0"
    // InternalMyDsl.g:1852:1: rule__Choice__Group_7__0 : rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1 ;
    public final void rule__Choice__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1856:1: ( rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1 )
            // InternalMyDsl.g:1857:2: rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__Choice__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_7__0"


    // $ANTLR start "rule__Choice__Group_7__0__Impl"
    // InternalMyDsl.g:1864:1: rule__Choice__Group_7__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( ( 'or' ) )
            // InternalMyDsl.g:1869:1: ( 'or' )
            {
            // InternalMyDsl.g:1869:1: ( 'or' )
            // InternalMyDsl.g:1870:2: 'or'
            {
             before(grammarAccess.getChoiceAccess().getOrKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getOrKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_7__0__Impl"


    // $ANTLR start "rule__Choice__Group_7__1"
    // InternalMyDsl.g:1879:1: rule__Choice__Group_7__1 : rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2 ;
    public final void rule__Choice__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1883:1: ( rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2 )
            // InternalMyDsl.g:1884:2: rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__Choice__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_7__1"


    // $ANTLR start "rule__Choice__Group_7__1__Impl"
    // InternalMyDsl.g:1891:1: rule__Choice__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( ( '{' ) )
            // InternalMyDsl.g:1896:1: ( '{' )
            {
            // InternalMyDsl.g:1896:1: ( '{' )
            // InternalMyDsl.g:1897:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_7__1__Impl"


    // $ANTLR start "rule__Choice__Group_7__2"
    // InternalMyDsl.g:1906:1: rule__Choice__Group_7__2 : rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3 ;
    public final void rule__Choice__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1910:1: ( rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3 )
            // InternalMyDsl.g:1911:2: rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__Choice__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_7__2"


    // $ANTLR start "rule__Choice__Group_7__2__Impl"
    // InternalMyDsl.g:1918:1: rule__Choice__Group_7__2__Impl : ( ( rule__Choice__MessageAssignment_7_2 ) ) ;
    public final void rule__Choice__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( ( ( rule__Choice__MessageAssignment_7_2 ) ) )
            // InternalMyDsl.g:1923:1: ( ( rule__Choice__MessageAssignment_7_2 ) )
            {
            // InternalMyDsl.g:1923:1: ( ( rule__Choice__MessageAssignment_7_2 ) )
            // InternalMyDsl.g:1924:2: ( rule__Choice__MessageAssignment_7_2 )
            {
             before(grammarAccess.getChoiceAccess().getMessageAssignment_7_2()); 
            // InternalMyDsl.g:1925:2: ( rule__Choice__MessageAssignment_7_2 )
            // InternalMyDsl.g:1925:3: rule__Choice__MessageAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Choice__MessageAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getMessageAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_7__2__Impl"


    // $ANTLR start "rule__Choice__Group_7__3"
    // InternalMyDsl.g:1933:1: rule__Choice__Group_7__3 : rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4 ;
    public final void rule__Choice__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1937:1: ( rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4 )
            // InternalMyDsl.g:1938:2: rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4
            {
            pushFollow(FOLLOW_9);
            rule__Choice__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_7__3"


    // $ANTLR start "rule__Choice__Group_7__3__Impl"
    // InternalMyDsl.g:1945:1: rule__Choice__Group_7__3__Impl : ( ( rule__Choice__BranchesAssignment_7_3 ) ) ;
    public final void rule__Choice__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( ( ( rule__Choice__BranchesAssignment_7_3 ) ) )
            // InternalMyDsl.g:1950:1: ( ( rule__Choice__BranchesAssignment_7_3 ) )
            {
            // InternalMyDsl.g:1950:1: ( ( rule__Choice__BranchesAssignment_7_3 ) )
            // InternalMyDsl.g:1951:2: ( rule__Choice__BranchesAssignment_7_3 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_7_3()); 
            // InternalMyDsl.g:1952:2: ( rule__Choice__BranchesAssignment_7_3 )
            // InternalMyDsl.g:1952:3: rule__Choice__BranchesAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Choice__BranchesAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBranchesAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_7__3__Impl"


    // $ANTLR start "rule__Choice__Group_7__4"
    // InternalMyDsl.g:1960:1: rule__Choice__Group_7__4 : rule__Choice__Group_7__4__Impl ;
    public final void rule__Choice__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1964:1: ( rule__Choice__Group_7__4__Impl )
            // InternalMyDsl.g:1965:2: rule__Choice__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_7__4"


    // $ANTLR start "rule__Choice__Group_7__4__Impl"
    // InternalMyDsl.g:1971:1: rule__Choice__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Choice__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( ( '}' ) )
            // InternalMyDsl.g:1976:1: ( '}' )
            {
            // InternalMyDsl.g:1976:1: ( '}' )
            // InternalMyDsl.g:1977:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_7__4__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalMyDsl.g:1987:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1991:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:1992:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalMyDsl.g:1999:1: rule__Message__Group__0__Impl : ( ( rule__Message__MessageTypeAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( ( ( rule__Message__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2004:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2004:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2005:2: ( rule__Message__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2006:2: ( rule__Message__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2006:3: rule__Message__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2014:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2018:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:2019:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2026:1: rule__Message__Group__1__Impl : ( '(' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( ( '(' ) )
            // InternalMyDsl.g:2031:1: ( '(' )
            {
            // InternalMyDsl.g:2031:1: ( '(' )
            // InternalMyDsl.g:2032:2: '('
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
    // InternalMyDsl.g:2041:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2045:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:2046:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2053:1: rule__Message__Group__2__Impl : ( ( rule__Message__PayloadAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( ( ( rule__Message__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:2058:1: ( ( rule__Message__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:2058:1: ( ( rule__Message__PayloadAssignment_2 )? )
            // InternalMyDsl.g:2059:2: ( rule__Message__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:2060:2: ( rule__Message__PayloadAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=11 && LA10_0<=13)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:2060:3: rule__Message__PayloadAssignment_2
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
    // InternalMyDsl.g:2068:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2072:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:2073:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2080:1: rule__Message__Group__3__Impl : ( ')' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( ( ')' ) )
            // InternalMyDsl.g:2085:1: ( ')' )
            {
            // InternalMyDsl.g:2085:1: ( ')' )
            // InternalMyDsl.g:2086:2: ')'
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
    // InternalMyDsl.g:2095:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2099:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:2100:2: rule__Message__Group__4__Impl rule__Message__Group__5
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
    // InternalMyDsl.g:2107:1: rule__Message__Group__4__Impl : ( 'from' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( ( 'from' ) )
            // InternalMyDsl.g:2112:1: ( 'from' )
            {
            // InternalMyDsl.g:2112:1: ( 'from' )
            // InternalMyDsl.g:2113:2: 'from'
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
    // InternalMyDsl.g:2122:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2126:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:2127:2: rule__Message__Group__5__Impl rule__Message__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2134:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( ( ( rule__Message__SenderAssignment_5 ) ) )
            // InternalMyDsl.g:2139:1: ( ( rule__Message__SenderAssignment_5 ) )
            {
            // InternalMyDsl.g:2139:1: ( ( rule__Message__SenderAssignment_5 ) )
            // InternalMyDsl.g:2140:2: ( rule__Message__SenderAssignment_5 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_5()); 
            // InternalMyDsl.g:2141:2: ( rule__Message__SenderAssignment_5 )
            // InternalMyDsl.g:2141:3: rule__Message__SenderAssignment_5
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
    // InternalMyDsl.g:2149:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2153:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:2154:2: rule__Message__Group__6__Impl rule__Message__Group__7
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
    // InternalMyDsl.g:2161:1: rule__Message__Group__6__Impl : ( 'to' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( ( 'to' ) )
            // InternalMyDsl.g:2166:1: ( 'to' )
            {
            // InternalMyDsl.g:2166:1: ( 'to' )
            // InternalMyDsl.g:2167:2: 'to'
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
    // InternalMyDsl.g:2176:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2180:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:2181:2: rule__Message__Group__7__Impl rule__Message__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2188:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( ( ( rule__Message__ReceiverAssignment_7 ) ) )
            // InternalMyDsl.g:2193:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            {
            // InternalMyDsl.g:2193:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            // InternalMyDsl.g:2194:2: ( rule__Message__ReceiverAssignment_7 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 
            // InternalMyDsl.g:2195:2: ( rule__Message__ReceiverAssignment_7 )
            // InternalMyDsl.g:2195:3: rule__Message__ReceiverAssignment_7
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
    // InternalMyDsl.g:2203:1: rule__Message__Group__8 : rule__Message__Group__8__Impl ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2207:1: ( rule__Message__Group__8__Impl )
            // InternalMyDsl.g:2208:2: rule__Message__Group__8__Impl
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
    // InternalMyDsl.g:2214:1: rule__Message__Group__8__Impl : ( ';' ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( ( ';' ) )
            // InternalMyDsl.g:2219:1: ( ';' )
            {
            // InternalMyDsl.g:2219:1: ( ';' )
            // InternalMyDsl.g:2220:2: ';'
            {
             before(grammarAccess.getMessageAccess().getSemicolonKeyword_8()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2230:1: rule__Payload__Group_0__0 : rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1 ;
    public final void rule__Payload__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2234:1: ( rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1 )
            // InternalMyDsl.g:2235:2: rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2242:1: rule__Payload__Group_0__0__Impl : ( () ) ;
    public final void rule__Payload__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( ( () ) )
            // InternalMyDsl.g:2247:1: ( () )
            {
            // InternalMyDsl.g:2247:1: ( () )
            // InternalMyDsl.g:2248:2: ()
            {
             before(grammarAccess.getPayloadAccess().getPayloadAction_0_0()); 
            // InternalMyDsl.g:2249:2: ()
            // InternalMyDsl.g:2249:3: 
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
    // InternalMyDsl.g:2257:1: rule__Payload__Group_0__1 : rule__Payload__Group_0__1__Impl ;
    public final void rule__Payload__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2261:1: ( rule__Payload__Group_0__1__Impl )
            // InternalMyDsl.g:2262:2: rule__Payload__Group_0__1__Impl
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
    // InternalMyDsl.g:2268:1: rule__Payload__Group_0__1__Impl : ( ( rule__Payload__Group_0_1__0 ) ) ;
    public final void rule__Payload__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( ( ( rule__Payload__Group_0_1__0 ) ) )
            // InternalMyDsl.g:2273:1: ( ( rule__Payload__Group_0_1__0 ) )
            {
            // InternalMyDsl.g:2273:1: ( ( rule__Payload__Group_0_1__0 ) )
            // InternalMyDsl.g:2274:2: ( rule__Payload__Group_0_1__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup_0_1()); 
            // InternalMyDsl.g:2275:2: ( rule__Payload__Group_0_1__0 )
            // InternalMyDsl.g:2275:3: rule__Payload__Group_0_1__0
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
    // InternalMyDsl.g:2284:1: rule__Payload__Group_0_1__0 : rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1 ;
    public final void rule__Payload__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2288:1: ( rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1 )
            // InternalMyDsl.g:2289:2: rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1
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
    // InternalMyDsl.g:2296:1: rule__Payload__Group_0_1__0__Impl : ( ( rule__Payload__TypesAssignment_0_1_0 ) ) ;
    public final void rule__Payload__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( ( ( rule__Payload__TypesAssignment_0_1_0 ) ) )
            // InternalMyDsl.g:2301:1: ( ( rule__Payload__TypesAssignment_0_1_0 ) )
            {
            // InternalMyDsl.g:2301:1: ( ( rule__Payload__TypesAssignment_0_1_0 ) )
            // InternalMyDsl.g:2302:2: ( rule__Payload__TypesAssignment_0_1_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0_1_0()); 
            // InternalMyDsl.g:2303:2: ( rule__Payload__TypesAssignment_0_1_0 )
            // InternalMyDsl.g:2303:3: rule__Payload__TypesAssignment_0_1_0
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
    // InternalMyDsl.g:2311:1: rule__Payload__Group_0_1__1 : rule__Payload__Group_0_1__1__Impl ;
    public final void rule__Payload__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2315:1: ( rule__Payload__Group_0_1__1__Impl )
            // InternalMyDsl.g:2316:2: rule__Payload__Group_0_1__1__Impl
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
    // InternalMyDsl.g:2322:1: rule__Payload__Group_0_1__1__Impl : ( ( rule__Payload__Group_0_1_1__0 )* ) ;
    public final void rule__Payload__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( ( ( rule__Payload__Group_0_1_1__0 )* ) )
            // InternalMyDsl.g:2327:1: ( ( rule__Payload__Group_0_1_1__0 )* )
            {
            // InternalMyDsl.g:2327:1: ( ( rule__Payload__Group_0_1_1__0 )* )
            // InternalMyDsl.g:2328:2: ( rule__Payload__Group_0_1_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_0_1_1()); 
            // InternalMyDsl.g:2329:2: ( rule__Payload__Group_0_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2329:3: rule__Payload__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Payload__Group_0_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:2338:1: rule__Payload__Group_0_1_1__0 : rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1 ;
    public final void rule__Payload__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2342:1: ( rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1 )
            // InternalMyDsl.g:2343:2: rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2350:1: rule__Payload__Group_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( ( ',' ) )
            // InternalMyDsl.g:2355:1: ( ',' )
            {
            // InternalMyDsl.g:2355:1: ( ',' )
            // InternalMyDsl.g:2356:2: ','
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
    // InternalMyDsl.g:2365:1: rule__Payload__Group_0_1_1__1 : rule__Payload__Group_0_1_1__1__Impl ;
    public final void rule__Payload__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2369:1: ( rule__Payload__Group_0_1_1__1__Impl )
            // InternalMyDsl.g:2370:2: rule__Payload__Group_0_1_1__1__Impl
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
    // InternalMyDsl.g:2376:1: rule__Payload__Group_0_1_1__1__Impl : ( ( rule__Payload__TypesAssignment_0_1_1_1 ) ) ;
    public final void rule__Payload__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( ( ( rule__Payload__TypesAssignment_0_1_1_1 ) ) )
            // InternalMyDsl.g:2381:1: ( ( rule__Payload__TypesAssignment_0_1_1_1 ) )
            {
            // InternalMyDsl.g:2381:1: ( ( rule__Payload__TypesAssignment_0_1_1_1 ) )
            // InternalMyDsl.g:2382:2: ( rule__Payload__TypesAssignment_0_1_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0_1_1_1()); 
            // InternalMyDsl.g:2383:2: ( rule__Payload__TypesAssignment_0_1_1_1 )
            // InternalMyDsl.g:2383:3: rule__Payload__TypesAssignment_0_1_1_1
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
    // InternalMyDsl.g:2392:1: rule__LocalProtocol__Group__0 : rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 ;
    public final void rule__LocalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2396:1: ( rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 )
            // InternalMyDsl.g:2397:2: rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1
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
    // InternalMyDsl.g:2404:1: rule__LocalProtocol__Group__0__Impl : ( 'local' ) ;
    public final void rule__LocalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2408:1: ( ( 'local' ) )
            // InternalMyDsl.g:2409:1: ( 'local' )
            {
            // InternalMyDsl.g:2409:1: ( 'local' )
            // InternalMyDsl.g:2410:2: 'local'
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
    // InternalMyDsl.g:2419:1: rule__LocalProtocol__Group__1 : rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 ;
    public final void rule__LocalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2423:1: ( rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 )
            // InternalMyDsl.g:2424:2: rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2
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
    // InternalMyDsl.g:2431:1: rule__LocalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__LocalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:2436:1: ( 'protocol' )
            {
            // InternalMyDsl.g:2436:1: ( 'protocol' )
            // InternalMyDsl.g:2437:2: 'protocol'
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
    // InternalMyDsl.g:2446:1: rule__LocalProtocol__Group__2 : rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 ;
    public final void rule__LocalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2450:1: ( rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 )
            // InternalMyDsl.g:2451:2: rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2458:1: rule__LocalProtocol__Group__2__Impl : ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__LocalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2462:1: ( ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:2463:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:2463:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:2464:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:2465:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:2465:3: rule__LocalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:2473:1: rule__LocalProtocol__Group__3 : rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 ;
    public final void rule__LocalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2477:1: ( rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 )
            // InternalMyDsl.g:2478:2: rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4
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
    // InternalMyDsl.g:2485:1: rule__LocalProtocol__Group__3__Impl : ( 'at' ) ;
    public final void rule__LocalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( ( 'at' ) )
            // InternalMyDsl.g:2490:1: ( 'at' )
            {
            // InternalMyDsl.g:2490:1: ( 'at' )
            // InternalMyDsl.g:2491:2: 'at'
            {
             before(grammarAccess.getLocalProtocolAccess().getAtKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:2500:1: rule__LocalProtocol__Group__4 : rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 ;
    public final void rule__LocalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2504:1: ( rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 )
            // InternalMyDsl.g:2505:2: rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5
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
    // InternalMyDsl.g:2512:1: rule__LocalProtocol__Group__4__Impl : ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) ;
    public final void rule__LocalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2516:1: ( ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) )
            // InternalMyDsl.g:2517:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            {
            // InternalMyDsl.g:2517:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            // InternalMyDsl.g:2518:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_4()); 
            // InternalMyDsl.g:2519:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            // InternalMyDsl.g:2519:3: rule__LocalProtocol__ProjectedRoleAssignment_4
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
    // InternalMyDsl.g:2527:1: rule__LocalProtocol__Group__5 : rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 ;
    public final void rule__LocalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2531:1: ( rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 )
            // InternalMyDsl.g:2532:2: rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6
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
    // InternalMyDsl.g:2539:1: rule__LocalProtocol__Group__5__Impl : ( '(' ) ;
    public final void rule__LocalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( ( '(' ) )
            // InternalMyDsl.g:2544:1: ( '(' )
            {
            // InternalMyDsl.g:2544:1: ( '(' )
            // InternalMyDsl.g:2545:2: '('
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
    // InternalMyDsl.g:2554:1: rule__LocalProtocol__Group__6 : rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 ;
    public final void rule__LocalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2558:1: ( rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 )
            // InternalMyDsl.g:2559:2: rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2566:1: rule__LocalProtocol__Group__6__Impl : ( ( rule__LocalProtocol__RolesAssignment_6 ) ) ;
    public final void rule__LocalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2570:1: ( ( ( rule__LocalProtocol__RolesAssignment_6 ) ) )
            // InternalMyDsl.g:2571:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            {
            // InternalMyDsl.g:2571:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            // InternalMyDsl.g:2572:2: ( rule__LocalProtocol__RolesAssignment_6 )
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesAssignment_6()); 
            // InternalMyDsl.g:2573:2: ( rule__LocalProtocol__RolesAssignment_6 )
            // InternalMyDsl.g:2573:3: rule__LocalProtocol__RolesAssignment_6
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
    // InternalMyDsl.g:2581:1: rule__LocalProtocol__Group__7 : rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 ;
    public final void rule__LocalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2585:1: ( rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 )
            // InternalMyDsl.g:2586:2: rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2593:1: rule__LocalProtocol__Group__7__Impl : ( ')' ) ;
    public final void rule__LocalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2597:1: ( ( ')' ) )
            // InternalMyDsl.g:2598:1: ( ')' )
            {
            // InternalMyDsl.g:2598:1: ( ')' )
            // InternalMyDsl.g:2599:2: ')'
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
    // InternalMyDsl.g:2608:1: rule__LocalProtocol__Group__8 : rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 ;
    public final void rule__LocalProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2612:1: ( rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 )
            // InternalMyDsl.g:2613:2: rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9
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
    // InternalMyDsl.g:2620:1: rule__LocalProtocol__Group__8__Impl : ( '{' ) ;
    public final void rule__LocalProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2624:1: ( ( '{' ) )
            // InternalMyDsl.g:2625:1: ( '{' )
            {
            // InternalMyDsl.g:2625:1: ( '{' )
            // InternalMyDsl.g:2626:2: '{'
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2635:1: rule__LocalProtocol__Group__9 : rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 ;
    public final void rule__LocalProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2639:1: ( rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 )
            // InternalMyDsl.g:2640:2: rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10
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
    // InternalMyDsl.g:2647:1: rule__LocalProtocol__Group__9__Impl : ( ( rule__LocalProtocol__ProtocolAssignment_9 ) ) ;
    public final void rule__LocalProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( ( ( rule__LocalProtocol__ProtocolAssignment_9 ) ) )
            // InternalMyDsl.g:2652:1: ( ( rule__LocalProtocol__ProtocolAssignment_9 ) )
            {
            // InternalMyDsl.g:2652:1: ( ( rule__LocalProtocol__ProtocolAssignment_9 ) )
            // InternalMyDsl.g:2653:2: ( rule__LocalProtocol__ProtocolAssignment_9 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_9()); 
            // InternalMyDsl.g:2654:2: ( rule__LocalProtocol__ProtocolAssignment_9 )
            // InternalMyDsl.g:2654:3: rule__LocalProtocol__ProtocolAssignment_9
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
    // InternalMyDsl.g:2662:1: rule__LocalProtocol__Group__10 : rule__LocalProtocol__Group__10__Impl ;
    public final void rule__LocalProtocol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2666:1: ( rule__LocalProtocol__Group__10__Impl )
            // InternalMyDsl.g:2667:2: rule__LocalProtocol__Group__10__Impl
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
    // InternalMyDsl.g:2673:1: rule__LocalProtocol__Group__10__Impl : ( '}' ) ;
    public final void rule__LocalProtocol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2677:1: ( ( '}' ) )
            // InternalMyDsl.g:2678:1: ( '}' )
            {
            // InternalMyDsl.g:2678:1: ( '}' )
            // InternalMyDsl.g:2679:2: '}'
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
    // InternalMyDsl.g:2689:1: rule__ProtocolL__Group__0 : rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1 ;
    public final void rule__ProtocolL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2693:1: ( rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1 )
            // InternalMyDsl.g:2694:2: rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1
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
    // InternalMyDsl.g:2701:1: rule__ProtocolL__Group__0__Impl : ( () ) ;
    public final void rule__ProtocolL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2705:1: ( ( () ) )
            // InternalMyDsl.g:2706:1: ( () )
            {
            // InternalMyDsl.g:2706:1: ( () )
            // InternalMyDsl.g:2707:2: ()
            {
             before(grammarAccess.getProtocolLAccess().getProtocolLAction_0()); 
            // InternalMyDsl.g:2708:2: ()
            // InternalMyDsl.g:2708:3: 
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
    // InternalMyDsl.g:2716:1: rule__ProtocolL__Group__1 : rule__ProtocolL__Group__1__Impl ;
    public final void rule__ProtocolL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2720:1: ( rule__ProtocolL__Group__1__Impl )
            // InternalMyDsl.g:2721:2: rule__ProtocolL__Group__1__Impl
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
    // InternalMyDsl.g:2727:1: rule__ProtocolL__Group__1__Impl : ( ( rule__ProtocolL__ActionsAssignment_1 )* ) ;
    public final void rule__ProtocolL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2731:1: ( ( ( rule__ProtocolL__ActionsAssignment_1 )* ) )
            // InternalMyDsl.g:2732:1: ( ( rule__ProtocolL__ActionsAssignment_1 )* )
            {
            // InternalMyDsl.g:2732:1: ( ( rule__ProtocolL__ActionsAssignment_1 )* )
            // InternalMyDsl.g:2733:2: ( rule__ProtocolL__ActionsAssignment_1 )*
            {
             before(grammarAccess.getProtocolLAccess().getActionsAssignment_1()); 
            // InternalMyDsl.g:2734:2: ( rule__ProtocolL__ActionsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=23 && LA12_0<=24)||LA12_0==26||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2734:3: rule__ProtocolL__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ProtocolL__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:2743:1: rule__MessageL__Group__0 : rule__MessageL__Group__0__Impl rule__MessageL__Group__1 ;
    public final void rule__MessageL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2747:1: ( rule__MessageL__Group__0__Impl rule__MessageL__Group__1 )
            // InternalMyDsl.g:2748:2: rule__MessageL__Group__0__Impl rule__MessageL__Group__1
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
    // InternalMyDsl.g:2755:1: rule__MessageL__Group__0__Impl : ( ( rule__MessageL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2759:1: ( ( ( rule__MessageL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2760:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2760:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2761:2: ( rule__MessageL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2762:2: ( rule__MessageL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2762:3: rule__MessageL__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2770:1: rule__MessageL__Group__1 : rule__MessageL__Group__1__Impl rule__MessageL__Group__2 ;
    public final void rule__MessageL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2774:1: ( rule__MessageL__Group__1__Impl rule__MessageL__Group__2 )
            // InternalMyDsl.g:2775:2: rule__MessageL__Group__1__Impl rule__MessageL__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2782:1: rule__MessageL__Group__1__Impl : ( '(' ) ;
    public final void rule__MessageL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2786:1: ( ( '(' ) )
            // InternalMyDsl.g:2787:1: ( '(' )
            {
            // InternalMyDsl.g:2787:1: ( '(' )
            // InternalMyDsl.g:2788:2: '('
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
    // InternalMyDsl.g:2797:1: rule__MessageL__Group__2 : rule__MessageL__Group__2__Impl rule__MessageL__Group__3 ;
    public final void rule__MessageL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2801:1: ( rule__MessageL__Group__2__Impl rule__MessageL__Group__3 )
            // InternalMyDsl.g:2802:2: rule__MessageL__Group__2__Impl rule__MessageL__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2809:1: rule__MessageL__Group__2__Impl : ( ( rule__MessageL__PayloadAssignment_2 )? ) ;
    public final void rule__MessageL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2813:1: ( ( ( rule__MessageL__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:2814:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:2814:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            // InternalMyDsl.g:2815:2: ( rule__MessageL__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageLAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:2816:2: ( rule__MessageL__PayloadAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=11 && LA13_0<=13)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2816:3: rule__MessageL__PayloadAssignment_2
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
    // InternalMyDsl.g:2824:1: rule__MessageL__Group__3 : rule__MessageL__Group__3__Impl rule__MessageL__Group__4 ;
    public final void rule__MessageL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2828:1: ( rule__MessageL__Group__3__Impl rule__MessageL__Group__4 )
            // InternalMyDsl.g:2829:2: rule__MessageL__Group__3__Impl rule__MessageL__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2836:1: rule__MessageL__Group__3__Impl : ( ')' ) ;
    public final void rule__MessageL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2840:1: ( ( ')' ) )
            // InternalMyDsl.g:2841:1: ( ')' )
            {
            // InternalMyDsl.g:2841:1: ( ')' )
            // InternalMyDsl.g:2842:2: ')'
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
    // InternalMyDsl.g:2851:1: rule__MessageL__Group__4 : rule__MessageL__Group__4__Impl rule__MessageL__Group__5 ;
    public final void rule__MessageL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2855:1: ( rule__MessageL__Group__4__Impl rule__MessageL__Group__5 )
            // InternalMyDsl.g:2856:2: rule__MessageL__Group__4__Impl rule__MessageL__Group__5
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
    // InternalMyDsl.g:2863:1: rule__MessageL__Group__4__Impl : ( ( rule__MessageL__TargetAssignment_4 )? ) ;
    public final void rule__MessageL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2867:1: ( ( ( rule__MessageL__TargetAssignment_4 )? ) )
            // InternalMyDsl.g:2868:1: ( ( rule__MessageL__TargetAssignment_4 )? )
            {
            // InternalMyDsl.g:2868:1: ( ( rule__MessageL__TargetAssignment_4 )? )
            // InternalMyDsl.g:2869:2: ( rule__MessageL__TargetAssignment_4 )?
            {
             before(grammarAccess.getMessageLAccess().getTargetAssignment_4()); 
            // InternalMyDsl.g:2870:2: ( rule__MessageL__TargetAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2870:3: rule__MessageL__TargetAssignment_4
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
    // InternalMyDsl.g:2878:1: rule__MessageL__Group__5 : rule__MessageL__Group__5__Impl rule__MessageL__Group__6 ;
    public final void rule__MessageL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2882:1: ( rule__MessageL__Group__5__Impl rule__MessageL__Group__6 )
            // InternalMyDsl.g:2883:2: rule__MessageL__Group__5__Impl rule__MessageL__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2890:1: rule__MessageL__Group__5__Impl : ( ( rule__MessageL__TargetAssignment_5 )? ) ;
    public final void rule__MessageL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2894:1: ( ( ( rule__MessageL__TargetAssignment_5 )? ) )
            // InternalMyDsl.g:2895:1: ( ( rule__MessageL__TargetAssignment_5 )? )
            {
            // InternalMyDsl.g:2895:1: ( ( rule__MessageL__TargetAssignment_5 )? )
            // InternalMyDsl.g:2896:2: ( rule__MessageL__TargetAssignment_5 )?
            {
             before(grammarAccess.getMessageLAccess().getTargetAssignment_5()); 
            // InternalMyDsl.g:2897:2: ( rule__MessageL__TargetAssignment_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2897:3: rule__MessageL__TargetAssignment_5
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
    // InternalMyDsl.g:2905:1: rule__MessageL__Group__6 : rule__MessageL__Group__6__Impl ;
    public final void rule__MessageL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2909:1: ( rule__MessageL__Group__6__Impl )
            // InternalMyDsl.g:2910:2: rule__MessageL__Group__6__Impl
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
    // InternalMyDsl.g:2916:1: rule__MessageL__Group__6__Impl : ( ';' ) ;
    public final void rule__MessageL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( ( ';' ) )
            // InternalMyDsl.g:2921:1: ( ';' )
            {
            // InternalMyDsl.g:2921:1: ( ';' )
            // InternalMyDsl.g:2922:2: ';'
            {
             before(grammarAccess.getMessageLAccess().getSemicolonKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2932:1: rule__SenderL__Group__0 : rule__SenderL__Group__0__Impl rule__SenderL__Group__1 ;
    public final void rule__SenderL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2936:1: ( rule__SenderL__Group__0__Impl rule__SenderL__Group__1 )
            // InternalMyDsl.g:2937:2: rule__SenderL__Group__0__Impl rule__SenderL__Group__1
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
    // InternalMyDsl.g:2944:1: rule__SenderL__Group__0__Impl : ( 'from' ) ;
    public final void rule__SenderL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2948:1: ( ( 'from' ) )
            // InternalMyDsl.g:2949:1: ( 'from' )
            {
            // InternalMyDsl.g:2949:1: ( 'from' )
            // InternalMyDsl.g:2950:2: 'from'
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
    // InternalMyDsl.g:2959:1: rule__SenderL__Group__1 : rule__SenderL__Group__1__Impl ;
    public final void rule__SenderL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2963:1: ( rule__SenderL__Group__1__Impl )
            // InternalMyDsl.g:2964:2: rule__SenderL__Group__1__Impl
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
    // InternalMyDsl.g:2970:1: rule__SenderL__Group__1__Impl : ( ( rule__SenderL__SenderAssignment_1 ) ) ;
    public final void rule__SenderL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2974:1: ( ( ( rule__SenderL__SenderAssignment_1 ) ) )
            // InternalMyDsl.g:2975:1: ( ( rule__SenderL__SenderAssignment_1 ) )
            {
            // InternalMyDsl.g:2975:1: ( ( rule__SenderL__SenderAssignment_1 ) )
            // InternalMyDsl.g:2976:2: ( rule__SenderL__SenderAssignment_1 )
            {
             before(grammarAccess.getSenderLAccess().getSenderAssignment_1()); 
            // InternalMyDsl.g:2977:2: ( rule__SenderL__SenderAssignment_1 )
            // InternalMyDsl.g:2977:3: rule__SenderL__SenderAssignment_1
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
    // InternalMyDsl.g:2986:1: rule__ReceiverL__Group__0 : rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 ;
    public final void rule__ReceiverL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2990:1: ( rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 )
            // InternalMyDsl.g:2991:2: rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1
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
    // InternalMyDsl.g:2998:1: rule__ReceiverL__Group__0__Impl : ( 'to' ) ;
    public final void rule__ReceiverL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3002:1: ( ( 'to' ) )
            // InternalMyDsl.g:3003:1: ( 'to' )
            {
            // InternalMyDsl.g:3003:1: ( 'to' )
            // InternalMyDsl.g:3004:2: 'to'
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
    // InternalMyDsl.g:3013:1: rule__ReceiverL__Group__1 : rule__ReceiverL__Group__1__Impl ;
    public final void rule__ReceiverL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3017:1: ( rule__ReceiverL__Group__1__Impl )
            // InternalMyDsl.g:3018:2: rule__ReceiverL__Group__1__Impl
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
    // InternalMyDsl.g:3024:1: rule__ReceiverL__Group__1__Impl : ( ( rule__ReceiverL__ToAssignment_1 ) ) ;
    public final void rule__ReceiverL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3028:1: ( ( ( rule__ReceiverL__ToAssignment_1 ) ) )
            // InternalMyDsl.g:3029:1: ( ( rule__ReceiverL__ToAssignment_1 ) )
            {
            // InternalMyDsl.g:3029:1: ( ( rule__ReceiverL__ToAssignment_1 ) )
            // InternalMyDsl.g:3030:2: ( rule__ReceiverL__ToAssignment_1 )
            {
             before(grammarAccess.getReceiverLAccess().getToAssignment_1()); 
            // InternalMyDsl.g:3031:2: ( rule__ReceiverL__ToAssignment_1 )
            // InternalMyDsl.g:3031:3: rule__ReceiverL__ToAssignment_1
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
    // InternalMyDsl.g:3040:1: rule__ChoiceL__Group__0 : rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 ;
    public final void rule__ChoiceL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3044:1: ( rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 )
            // InternalMyDsl.g:3045:2: rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:3052:1: rule__ChoiceL__Group__0__Impl : ( 'choice' ) ;
    public final void rule__ChoiceL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3056:1: ( ( 'choice' ) )
            // InternalMyDsl.g:3057:1: ( 'choice' )
            {
            // InternalMyDsl.g:3057:1: ( 'choice' )
            // InternalMyDsl.g:3058:2: 'choice'
            {
             before(grammarAccess.getChoiceLAccess().getChoiceKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:3067:1: rule__ChoiceL__Group__1 : rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 ;
    public final void rule__ChoiceL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3071:1: ( rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 )
            // InternalMyDsl.g:3072:2: rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2
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
    // InternalMyDsl.g:3079:1: rule__ChoiceL__Group__1__Impl : ( 'at' ) ;
    public final void rule__ChoiceL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3083:1: ( ( 'at' ) )
            // InternalMyDsl.g:3084:1: ( 'at' )
            {
            // InternalMyDsl.g:3084:1: ( 'at' )
            // InternalMyDsl.g:3085:2: 'at'
            {
             before(grammarAccess.getChoiceLAccess().getAtKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:3094:1: rule__ChoiceL__Group__2 : rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 ;
    public final void rule__ChoiceL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3098:1: ( rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 )
            // InternalMyDsl.g:3099:2: rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:3106:1: rule__ChoiceL__Group__2__Impl : ( ( rule__ChoiceL__RoleAssignment_2 ) ) ;
    public final void rule__ChoiceL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3110:1: ( ( ( rule__ChoiceL__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:3111:1: ( ( rule__ChoiceL__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:3111:1: ( ( rule__ChoiceL__RoleAssignment_2 ) )
            // InternalMyDsl.g:3112:2: ( rule__ChoiceL__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceLAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:3113:2: ( rule__ChoiceL__RoleAssignment_2 )
            // InternalMyDsl.g:3113:3: rule__ChoiceL__RoleAssignment_2
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
    // InternalMyDsl.g:3121:1: rule__ChoiceL__Group__3 : rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 ;
    public final void rule__ChoiceL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3125:1: ( rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 )
            // InternalMyDsl.g:3126:2: rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4
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
    // InternalMyDsl.g:3133:1: rule__ChoiceL__Group__3__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3137:1: ( ( '{' ) )
            // InternalMyDsl.g:3138:1: ( '{' )
            {
            // InternalMyDsl.g:3138:1: ( '{' )
            // InternalMyDsl.g:3139:2: '{'
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
    // InternalMyDsl.g:3148:1: rule__ChoiceL__Group__4 : rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 ;
    public final void rule__ChoiceL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3152:1: ( rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 )
            // InternalMyDsl.g:3153:2: rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:3160:1: rule__ChoiceL__Group__4__Impl : ( ( rule__ChoiceL__MessageAssignment_4 ) ) ;
    public final void rule__ChoiceL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3164:1: ( ( ( rule__ChoiceL__MessageAssignment_4 ) ) )
            // InternalMyDsl.g:3165:1: ( ( rule__ChoiceL__MessageAssignment_4 ) )
            {
            // InternalMyDsl.g:3165:1: ( ( rule__ChoiceL__MessageAssignment_4 ) )
            // InternalMyDsl.g:3166:2: ( rule__ChoiceL__MessageAssignment_4 )
            {
             before(grammarAccess.getChoiceLAccess().getMessageAssignment_4()); 
            // InternalMyDsl.g:3167:2: ( rule__ChoiceL__MessageAssignment_4 )
            // InternalMyDsl.g:3167:3: rule__ChoiceL__MessageAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__MessageAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoiceLAccess().getMessageAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:3175:1: rule__ChoiceL__Group__5 : rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 ;
    public final void rule__ChoiceL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3179:1: ( rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 )
            // InternalMyDsl.g:3180:2: rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:3187:1: rule__ChoiceL__Group__5__Impl : ( ( rule__ChoiceL__BranchesAssignment_5 ) ) ;
    public final void rule__ChoiceL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3191:1: ( ( ( rule__ChoiceL__BranchesAssignment_5 ) ) )
            // InternalMyDsl.g:3192:1: ( ( rule__ChoiceL__BranchesAssignment_5 ) )
            {
            // InternalMyDsl.g:3192:1: ( ( rule__ChoiceL__BranchesAssignment_5 ) )
            // InternalMyDsl.g:3193:2: ( rule__ChoiceL__BranchesAssignment_5 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_5()); 
            // InternalMyDsl.g:3194:2: ( rule__ChoiceL__BranchesAssignment_5 )
            // InternalMyDsl.g:3194:3: rule__ChoiceL__BranchesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__BranchesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChoiceLAccess().getBranchesAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:3202:1: rule__ChoiceL__Group__6 : rule__ChoiceL__Group__6__Impl rule__ChoiceL__Group__7 ;
    public final void rule__ChoiceL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3206:1: ( rule__ChoiceL__Group__6__Impl rule__ChoiceL__Group__7 )
            // InternalMyDsl.g:3207:2: rule__ChoiceL__Group__6__Impl rule__ChoiceL__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__ChoiceL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group__7();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3214:1: rule__ChoiceL__Group__6__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3218:1: ( ( '}' ) )
            // InternalMyDsl.g:3219:1: ( '}' )
            {
            // InternalMyDsl.g:3219:1: ( '}' )
            // InternalMyDsl.g:3220:2: '}'
            {
             before(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__ChoiceL__Group__7"
    // InternalMyDsl.g:3229:1: rule__ChoiceL__Group__7 : rule__ChoiceL__Group__7__Impl ;
    public final void rule__ChoiceL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3233:1: ( rule__ChoiceL__Group__7__Impl )
            // InternalMyDsl.g:3234:2: rule__ChoiceL__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__7"


    // $ANTLR start "rule__ChoiceL__Group__7__Impl"
    // InternalMyDsl.g:3240:1: rule__ChoiceL__Group__7__Impl : ( ( rule__ChoiceL__Group_7__0 )* ) ;
    public final void rule__ChoiceL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3244:1: ( ( ( rule__ChoiceL__Group_7__0 )* ) )
            // InternalMyDsl.g:3245:1: ( ( rule__ChoiceL__Group_7__0 )* )
            {
            // InternalMyDsl.g:3245:1: ( ( rule__ChoiceL__Group_7__0 )* )
            // InternalMyDsl.g:3246:2: ( rule__ChoiceL__Group_7__0 )*
            {
             before(grammarAccess.getChoiceLAccess().getGroup_7()); 
            // InternalMyDsl.g:3247:2: ( rule__ChoiceL__Group_7__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:3247:3: rule__ChoiceL__Group_7__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ChoiceL__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getChoiceLAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group__7__Impl"


    // $ANTLR start "rule__ChoiceL__Group_7__0"
    // InternalMyDsl.g:3256:1: rule__ChoiceL__Group_7__0 : rule__ChoiceL__Group_7__0__Impl rule__ChoiceL__Group_7__1 ;
    public final void rule__ChoiceL__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3260:1: ( rule__ChoiceL__Group_7__0__Impl rule__ChoiceL__Group_7__1 )
            // InternalMyDsl.g:3261:2: rule__ChoiceL__Group_7__0__Impl rule__ChoiceL__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__ChoiceL__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_7__0"


    // $ANTLR start "rule__ChoiceL__Group_7__0__Impl"
    // InternalMyDsl.g:3268:1: rule__ChoiceL__Group_7__0__Impl : ( 'or' ) ;
    public final void rule__ChoiceL__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3272:1: ( ( 'or' ) )
            // InternalMyDsl.g:3273:1: ( 'or' )
            {
            // InternalMyDsl.g:3273:1: ( 'or' )
            // InternalMyDsl.g:3274:2: 'or'
            {
             before(grammarAccess.getChoiceLAccess().getOrKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getOrKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_7__0__Impl"


    // $ANTLR start "rule__ChoiceL__Group_7__1"
    // InternalMyDsl.g:3283:1: rule__ChoiceL__Group_7__1 : rule__ChoiceL__Group_7__1__Impl rule__ChoiceL__Group_7__2 ;
    public final void rule__ChoiceL__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3287:1: ( rule__ChoiceL__Group_7__1__Impl rule__ChoiceL__Group_7__2 )
            // InternalMyDsl.g:3288:2: rule__ChoiceL__Group_7__1__Impl rule__ChoiceL__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__ChoiceL__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_7__1"


    // $ANTLR start "rule__ChoiceL__Group_7__1__Impl"
    // InternalMyDsl.g:3295:1: rule__ChoiceL__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3299:1: ( ( '{' ) )
            // InternalMyDsl.g:3300:1: ( '{' )
            {
            // InternalMyDsl.g:3300:1: ( '{' )
            // InternalMyDsl.g:3301:2: '{'
            {
             before(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_7__1__Impl"


    // $ANTLR start "rule__ChoiceL__Group_7__2"
    // InternalMyDsl.g:3310:1: rule__ChoiceL__Group_7__2 : rule__ChoiceL__Group_7__2__Impl rule__ChoiceL__Group_7__3 ;
    public final void rule__ChoiceL__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3314:1: ( rule__ChoiceL__Group_7__2__Impl rule__ChoiceL__Group_7__3 )
            // InternalMyDsl.g:3315:2: rule__ChoiceL__Group_7__2__Impl rule__ChoiceL__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__ChoiceL__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_7__2"


    // $ANTLR start "rule__ChoiceL__Group_7__2__Impl"
    // InternalMyDsl.g:3322:1: rule__ChoiceL__Group_7__2__Impl : ( ( rule__ChoiceL__MessageAssignment_7_2 ) ) ;
    public final void rule__ChoiceL__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3326:1: ( ( ( rule__ChoiceL__MessageAssignment_7_2 ) ) )
            // InternalMyDsl.g:3327:1: ( ( rule__ChoiceL__MessageAssignment_7_2 ) )
            {
            // InternalMyDsl.g:3327:1: ( ( rule__ChoiceL__MessageAssignment_7_2 ) )
            // InternalMyDsl.g:3328:2: ( rule__ChoiceL__MessageAssignment_7_2 )
            {
             before(grammarAccess.getChoiceLAccess().getMessageAssignment_7_2()); 
            // InternalMyDsl.g:3329:2: ( rule__ChoiceL__MessageAssignment_7_2 )
            // InternalMyDsl.g:3329:3: rule__ChoiceL__MessageAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__MessageAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceLAccess().getMessageAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_7__2__Impl"


    // $ANTLR start "rule__ChoiceL__Group_7__3"
    // InternalMyDsl.g:3337:1: rule__ChoiceL__Group_7__3 : rule__ChoiceL__Group_7__3__Impl rule__ChoiceL__Group_7__4 ;
    public final void rule__ChoiceL__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3341:1: ( rule__ChoiceL__Group_7__3__Impl rule__ChoiceL__Group_7__4 )
            // InternalMyDsl.g:3342:2: rule__ChoiceL__Group_7__3__Impl rule__ChoiceL__Group_7__4
            {
            pushFollow(FOLLOW_9);
            rule__ChoiceL__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_7__3"


    // $ANTLR start "rule__ChoiceL__Group_7__3__Impl"
    // InternalMyDsl.g:3349:1: rule__ChoiceL__Group_7__3__Impl : ( ( rule__ChoiceL__BranchesAssignment_7_3 ) ) ;
    public final void rule__ChoiceL__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3353:1: ( ( ( rule__ChoiceL__BranchesAssignment_7_3 ) ) )
            // InternalMyDsl.g:3354:1: ( ( rule__ChoiceL__BranchesAssignment_7_3 ) )
            {
            // InternalMyDsl.g:3354:1: ( ( rule__ChoiceL__BranchesAssignment_7_3 ) )
            // InternalMyDsl.g:3355:2: ( rule__ChoiceL__BranchesAssignment_7_3 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_7_3()); 
            // InternalMyDsl.g:3356:2: ( rule__ChoiceL__BranchesAssignment_7_3 )
            // InternalMyDsl.g:3356:3: rule__ChoiceL__BranchesAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__BranchesAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getChoiceLAccess().getBranchesAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_7__3__Impl"


    // $ANTLR start "rule__ChoiceL__Group_7__4"
    // InternalMyDsl.g:3364:1: rule__ChoiceL__Group_7__4 : rule__ChoiceL__Group_7__4__Impl ;
    public final void rule__ChoiceL__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3368:1: ( rule__ChoiceL__Group_7__4__Impl )
            // InternalMyDsl.g:3369:2: rule__ChoiceL__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceL__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_7__4"


    // $ANTLR start "rule__ChoiceL__Group_7__4__Impl"
    // InternalMyDsl.g:3375:1: rule__ChoiceL__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3379:1: ( ( '}' ) )
            // InternalMyDsl.g:3380:1: ( '}' )
            {
            // InternalMyDsl.g:3380:1: ( '}' )
            // InternalMyDsl.g:3381:2: '}'
            {
             before(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__Group_7__4__Impl"


    // $ANTLR start "rule__ForEachL__Group__0"
    // InternalMyDsl.g:3391:1: rule__ForEachL__Group__0 : rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 ;
    public final void rule__ForEachL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3395:1: ( rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 )
            // InternalMyDsl.g:3396:2: rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:3403:1: rule__ForEachL__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEachL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3407:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:3408:1: ( 'foreach' )
            {
            // InternalMyDsl.g:3408:1: ( 'foreach' )
            // InternalMyDsl.g:3409:2: 'foreach'
            {
             before(grammarAccess.getForEachLAccess().getForeachKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:3418:1: rule__ForEachL__Group__1 : rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 ;
    public final void rule__ForEachL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3422:1: ( rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 )
            // InternalMyDsl.g:3423:2: rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2
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
    // InternalMyDsl.g:3430:1: rule__ForEachL__Group__1__Impl : ( ( rule__ForEachL__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEachL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3434:1: ( ( ( rule__ForEachL__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:3435:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3435:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:3436:2: ( rule__ForEachL__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachLAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:3437:2: ( rule__ForEachL__EachRoleAssignment_1 )
            // InternalMyDsl.g:3437:3: rule__ForEachL__EachRoleAssignment_1
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
    // InternalMyDsl.g:3445:1: rule__ForEachL__Group__2 : rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 ;
    public final void rule__ForEachL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3449:1: ( rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 )
            // InternalMyDsl.g:3450:2: rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3
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
    // InternalMyDsl.g:3457:1: rule__ForEachL__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEachL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3461:1: ( ( ':' ) )
            // InternalMyDsl.g:3462:1: ( ':' )
            {
            // InternalMyDsl.g:3462:1: ( ':' )
            // InternalMyDsl.g:3463:2: ':'
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
    // InternalMyDsl.g:3472:1: rule__ForEachL__Group__3 : rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 ;
    public final void rule__ForEachL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3476:1: ( rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 )
            // InternalMyDsl.g:3477:2: rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:3484:1: rule__ForEachL__Group__3__Impl : ( ( rule__ForEachL__RoleAssignment_3 ) ) ;
    public final void rule__ForEachL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3488:1: ( ( ( rule__ForEachL__RoleAssignment_3 ) ) )
            // InternalMyDsl.g:3489:1: ( ( rule__ForEachL__RoleAssignment_3 ) )
            {
            // InternalMyDsl.g:3489:1: ( ( rule__ForEachL__RoleAssignment_3 ) )
            // InternalMyDsl.g:3490:2: ( rule__ForEachL__RoleAssignment_3 )
            {
             before(grammarAccess.getForEachLAccess().getRoleAssignment_3()); 
            // InternalMyDsl.g:3491:2: ( rule__ForEachL__RoleAssignment_3 )
            // InternalMyDsl.g:3491:3: rule__ForEachL__RoleAssignment_3
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
    // InternalMyDsl.g:3499:1: rule__ForEachL__Group__4 : rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 ;
    public final void rule__ForEachL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3503:1: ( rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 )
            // InternalMyDsl.g:3504:2: rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5
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
    // InternalMyDsl.g:3511:1: rule__ForEachL__Group__4__Impl : ( '{' ) ;
    public final void rule__ForEachL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3515:1: ( ( '{' ) )
            // InternalMyDsl.g:3516:1: ( '{' )
            {
            // InternalMyDsl.g:3516:1: ( '{' )
            // InternalMyDsl.g:3517:2: '{'
            {
             before(grammarAccess.getForEachLAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:3526:1: rule__ForEachL__Group__5 : rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 ;
    public final void rule__ForEachL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3530:1: ( rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 )
            // InternalMyDsl.g:3531:2: rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6
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
    // InternalMyDsl.g:3538:1: rule__ForEachL__Group__5__Impl : ( ( rule__ForEachL__BranchAssignment_5 ) ) ;
    public final void rule__ForEachL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3542:1: ( ( ( rule__ForEachL__BranchAssignment_5 ) ) )
            // InternalMyDsl.g:3543:1: ( ( rule__ForEachL__BranchAssignment_5 ) )
            {
            // InternalMyDsl.g:3543:1: ( ( rule__ForEachL__BranchAssignment_5 ) )
            // InternalMyDsl.g:3544:2: ( rule__ForEachL__BranchAssignment_5 )
            {
             before(grammarAccess.getForEachLAccess().getBranchAssignment_5()); 
            // InternalMyDsl.g:3545:2: ( rule__ForEachL__BranchAssignment_5 )
            // InternalMyDsl.g:3545:3: rule__ForEachL__BranchAssignment_5
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
    // InternalMyDsl.g:3553:1: rule__ForEachL__Group__6 : rule__ForEachL__Group__6__Impl ;
    public final void rule__ForEachL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3557:1: ( rule__ForEachL__Group__6__Impl )
            // InternalMyDsl.g:3558:2: rule__ForEachL__Group__6__Impl
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
    // InternalMyDsl.g:3564:1: rule__ForEachL__Group__6__Impl : ( '}' ) ;
    public final void rule__ForEachL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3568:1: ( ( '}' ) )
            // InternalMyDsl.g:3569:1: ( '}' )
            {
            // InternalMyDsl.g:3569:1: ( '}' )
            // InternalMyDsl.g:3570:2: '}'
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
    // InternalMyDsl.g:3580:1: rule__Model__ProtocolAssignment_0 : ( ruleGlobalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3584:1: ( ( ruleGlobalProtocol ) )
            // InternalMyDsl.g:3585:2: ( ruleGlobalProtocol )
            {
            // InternalMyDsl.g:3585:2: ( ruleGlobalProtocol )
            // InternalMyDsl.g:3586:3: ruleGlobalProtocol
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
    // InternalMyDsl.g:3595:1: rule__Model__ProtocolAssignment_1 : ( ruleLocalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3599:1: ( ( ruleLocalProtocol ) )
            // InternalMyDsl.g:3600:2: ( ruleLocalProtocol )
            {
            // InternalMyDsl.g:3600:2: ( ruleLocalProtocol )
            // InternalMyDsl.g:3601:3: ruleLocalProtocol
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
    // InternalMyDsl.g:3610:1: rule__GlobalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3615:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3615:2: ( RULE_ID )
            // InternalMyDsl.g:3616:3: RULE_ID
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
    // InternalMyDsl.g:3625:1: rule__GlobalProtocol__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__GlobalProtocol__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3629:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:3630:2: ( ruleRoles )
            {
            // InternalMyDsl.g:3630:2: ( ruleRoles )
            // InternalMyDsl.g:3631:3: ruleRoles
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
    // InternalMyDsl.g:3640:1: rule__GlobalProtocol__ProtocolAssignment_6 : ( ruleProtocol ) ;
    public final void rule__GlobalProtocol__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3644:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:3645:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:3645:2: ( ruleProtocol )
            // InternalMyDsl.g:3646:3: ruleProtocol
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
    // InternalMyDsl.g:3655:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3659:1: ( ( ruleRole ) )
            // InternalMyDsl.g:3660:2: ( ruleRole )
            {
            // InternalMyDsl.g:3660:2: ( ruleRole )
            // InternalMyDsl.g:3661:3: ruleRole
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
    // InternalMyDsl.g:3670:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3674:1: ( ( ruleRole ) )
            // InternalMyDsl.g:3675:2: ( ruleRole )
            {
            // InternalMyDsl.g:3675:2: ( ruleRole )
            // InternalMyDsl.g:3676:3: ruleRole
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
    // InternalMyDsl.g:3685:1: rule__RoleOne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3689:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3690:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3690:2: ( RULE_ID )
            // InternalMyDsl.g:3691:3: RULE_ID
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
    // InternalMyDsl.g:3700:1: rule__RoleSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3704:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3705:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3705:2: ( RULE_ID )
            // InternalMyDsl.g:3706:3: RULE_ID
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
    // InternalMyDsl.g:3715:1: rule__RoleSet__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RoleSet__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3719:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3720:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3720:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3721:3: ( RULE_ID )
            {
             before(grammarAccess.getRoleSetAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:3722:3: ( RULE_ID )
            // InternalMyDsl.g:3723:4: RULE_ID
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


    // $ANTLR start "rule__Protocol__ActionsAssignment_1"
    // InternalMyDsl.g:3734:1: rule__Protocol__ActionsAssignment_1 : ( ( rule__Protocol__ActionsAlternatives_1_0 ) ) ;
    public final void rule__Protocol__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3738:1: ( ( ( rule__Protocol__ActionsAlternatives_1_0 ) ) )
            // InternalMyDsl.g:3739:2: ( ( rule__Protocol__ActionsAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:3739:2: ( ( rule__Protocol__ActionsAlternatives_1_0 ) )
            // InternalMyDsl.g:3740:3: ( rule__Protocol__ActionsAlternatives_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getActionsAlternatives_1_0()); 
            // InternalMyDsl.g:3741:3: ( rule__Protocol__ActionsAlternatives_1_0 )
            // InternalMyDsl.g:3741:4: rule__Protocol__ActionsAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__ActionsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getActionsAlternatives_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:3749:1: rule__Recursion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3753:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3754:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3754:2: ( RULE_ID )
            // InternalMyDsl.g:3755:3: RULE_ID
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


    // $ANTLR start "rule__CloseRecursion__RecursionVariableAssignment_1"
    // InternalMyDsl.g:3764:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3768:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3769:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3769:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3770:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalMyDsl.g:3771:3: ( RULE_ID )
            // InternalMyDsl.g:3772:4: RULE_ID
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
    // InternalMyDsl.g:3783:1: rule__ForEach__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEach__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3787:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:3788:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:3788:2: ( ruleRoleOne )
            // InternalMyDsl.g:3789:3: ruleRoleOne
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
    // InternalMyDsl.g:3798:1: rule__ForEach__RoleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3802:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3803:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3803:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3804:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRoleRoleSetCrossReference_3_0()); 
            // InternalMyDsl.g:3805:3: ( RULE_ID )
            // InternalMyDsl.g:3806:4: RULE_ID
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


    // $ANTLR start "rule__ForEach__BranchAssignment_5"
    // InternalMyDsl.g:3817:1: rule__ForEach__BranchAssignment_5 : ( ruleProtocol ) ;
    public final void rule__ForEach__BranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3821:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:3822:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:3822:2: ( ruleProtocol )
            // InternalMyDsl.g:3823:3: ruleProtocol
            {
             before(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__BranchAssignment_5"


    // $ANTLR start "rule__Choice__RoleAssignment_2"
    // InternalMyDsl.g:3832:1: rule__Choice__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3836:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3837:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3837:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3838:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 
            // InternalMyDsl.g:3839:3: ( RULE_ID )
            // InternalMyDsl.g:3840:4: RULE_ID
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


    // $ANTLR start "rule__Choice__MessageAssignment_4"
    // InternalMyDsl.g:3851:1: rule__Choice__MessageAssignment_4 : ( ruleMessage ) ;
    public final void rule__Choice__MessageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3855:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:3856:2: ( ruleMessage )
            {
            // InternalMyDsl.g:3856:2: ( ruleMessage )
            // InternalMyDsl.g:3857:3: ruleMessage
            {
             before(grammarAccess.getChoiceAccess().getMessageMessageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getMessageMessageParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__MessageAssignment_4"


    // $ANTLR start "rule__Choice__BranchesAssignment_5"
    // InternalMyDsl.g:3866:1: rule__Choice__BranchesAssignment_5 : ( ruleProtocol ) ;
    public final void rule__Choice__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3870:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:3871:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:3871:2: ( ruleProtocol )
            // InternalMyDsl.g:3872:3: ruleProtocol
            {
             before(grammarAccess.getChoiceAccess().getBranchesProtocolParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchesProtocolParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__BranchesAssignment_5"


    // $ANTLR start "rule__Choice__MessageAssignment_7_2"
    // InternalMyDsl.g:3881:1: rule__Choice__MessageAssignment_7_2 : ( ruleMessage ) ;
    public final void rule__Choice__MessageAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3885:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:3886:2: ( ruleMessage )
            {
            // InternalMyDsl.g:3886:2: ( ruleMessage )
            // InternalMyDsl.g:3887:3: ruleMessage
            {
             before(grammarAccess.getChoiceAccess().getMessageMessageParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getMessageMessageParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__MessageAssignment_7_2"


    // $ANTLR start "rule__Choice__BranchesAssignment_7_3"
    // InternalMyDsl.g:3896:1: rule__Choice__BranchesAssignment_7_3 : ( ruleProtocol ) ;
    public final void rule__Choice__BranchesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3900:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:3901:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:3901:2: ( ruleProtocol )
            // InternalMyDsl.g:3902:3: ruleProtocol
            {
             before(grammarAccess.getChoiceAccess().getBranchesProtocolParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchesProtocolParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__BranchesAssignment_7_3"


    // $ANTLR start "rule__Message__MessageTypeAssignment_0"
    // InternalMyDsl.g:3911:1: rule__Message__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3915:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3916:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3916:2: ( RULE_ID )
            // InternalMyDsl.g:3917:3: RULE_ID
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
    // InternalMyDsl.g:3926:1: rule__Message__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__Message__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3930:1: ( ( rulePayload ) )
            // InternalMyDsl.g:3931:2: ( rulePayload )
            {
            // InternalMyDsl.g:3931:2: ( rulePayload )
            // InternalMyDsl.g:3932:3: rulePayload
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
    // InternalMyDsl.g:3941:1: rule__Message__SenderAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3945:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3946:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3946:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3947:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0()); 
            // InternalMyDsl.g:3948:3: ( RULE_ID )
            // InternalMyDsl.g:3949:4: RULE_ID
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
    // InternalMyDsl.g:3960:1: rule__Message__ReceiverAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3964:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3965:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3965:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3966:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleOneCrossReference_7_0()); 
            // InternalMyDsl.g:3967:3: ( RULE_ID )
            // InternalMyDsl.g:3968:4: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleOneIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getReceiverRoleOneIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getReceiverRoleOneCrossReference_7_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:3979:1: rule__Payload__TypesAssignment_0_1_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3983:1: ( ( ruleType ) )
            // InternalMyDsl.g:3984:2: ( ruleType )
            {
            // InternalMyDsl.g:3984:2: ( ruleType )
            // InternalMyDsl.g:3985:3: ruleType
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
    // InternalMyDsl.g:3994:1: rule__Payload__TypesAssignment_0_1_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3998:1: ( ( ruleType ) )
            // InternalMyDsl.g:3999:2: ( ruleType )
            {
            // InternalMyDsl.g:3999:2: ( ruleType )
            // InternalMyDsl.g:4000:3: ruleType
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
    // InternalMyDsl.g:4009:1: rule__Payload__TypesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Payload__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4013:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4014:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4014:2: ( RULE_ID )
            // InternalMyDsl.g:4015:3: RULE_ID
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
    // InternalMyDsl.g:4024:1: rule__LocalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4028:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4029:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4029:2: ( RULE_ID )
            // InternalMyDsl.g:4030:3: RULE_ID
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
    // InternalMyDsl.g:4039:1: rule__LocalProtocol__ProjectedRoleAssignment_4 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProjectedRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4043:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4044:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4044:2: ( RULE_ID )
            // InternalMyDsl.g:4045:3: RULE_ID
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
    // InternalMyDsl.g:4054:1: rule__LocalProtocol__RolesAssignment_6 : ( ruleRoles ) ;
    public final void rule__LocalProtocol__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4058:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:4059:2: ( ruleRoles )
            {
            // InternalMyDsl.g:4059:2: ( ruleRoles )
            // InternalMyDsl.g:4060:3: ruleRoles
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
    // InternalMyDsl.g:4069:1: rule__LocalProtocol__ProtocolAssignment_9 : ( ruleProtocolL ) ;
    public final void rule__LocalProtocol__ProtocolAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4073:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4074:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4074:2: ( ruleProtocolL )
            // InternalMyDsl.g:4075:3: ruleProtocolL
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
    // InternalMyDsl.g:4084:1: rule__ProtocolL__ActionsAssignment_1 : ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) ) ;
    public final void rule__ProtocolL__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4088:1: ( ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) ) )
            // InternalMyDsl.g:4089:2: ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:4089:2: ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) )
            // InternalMyDsl.g:4090:3: ( rule__ProtocolL__ActionsAlternatives_1_0 )
            {
             before(grammarAccess.getProtocolLAccess().getActionsAlternatives_1_0()); 
            // InternalMyDsl.g:4091:3: ( rule__ProtocolL__ActionsAlternatives_1_0 )
            // InternalMyDsl.g:4091:4: rule__ProtocolL__ActionsAlternatives_1_0
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
    // InternalMyDsl.g:4099:1: rule__MessageL__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4103:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4104:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4104:2: ( RULE_ID )
            // InternalMyDsl.g:4105:3: RULE_ID
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
    // InternalMyDsl.g:4114:1: rule__MessageL__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__MessageL__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4118:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4119:2: ( rulePayload )
            {
            // InternalMyDsl.g:4119:2: ( rulePayload )
            // InternalMyDsl.g:4120:3: rulePayload
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
    // InternalMyDsl.g:4129:1: rule__MessageL__TargetAssignment_4 : ( ruleSenderL ) ;
    public final void rule__MessageL__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4133:1: ( ( ruleSenderL ) )
            // InternalMyDsl.g:4134:2: ( ruleSenderL )
            {
            // InternalMyDsl.g:4134:2: ( ruleSenderL )
            // InternalMyDsl.g:4135:3: ruleSenderL
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
    // InternalMyDsl.g:4144:1: rule__MessageL__TargetAssignment_5 : ( ruleReceiverL ) ;
    public final void rule__MessageL__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4148:1: ( ( ruleReceiverL ) )
            // InternalMyDsl.g:4149:2: ( ruleReceiverL )
            {
            // InternalMyDsl.g:4149:2: ( ruleReceiverL )
            // InternalMyDsl.g:4150:3: ruleReceiverL
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
    // InternalMyDsl.g:4159:1: rule__SenderL__SenderAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SenderL__SenderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4163:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4164:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4164:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4165:3: ( RULE_ID )
            {
             before(grammarAccess.getSenderLAccess().getSenderRoleCrossReference_1_0()); 
            // InternalMyDsl.g:4166:3: ( RULE_ID )
            // InternalMyDsl.g:4167:4: RULE_ID
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
    // InternalMyDsl.g:4178:1: rule__ReceiverL__ToAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReceiverL__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4182:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4183:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4183:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4184:3: ( RULE_ID )
            {
             before(grammarAccess.getReceiverLAccess().getToRoleCrossReference_1_0()); 
            // InternalMyDsl.g:4185:3: ( RULE_ID )
            // InternalMyDsl.g:4186:4: RULE_ID
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
    // InternalMyDsl.g:4197:1: rule__ChoiceL__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChoiceL__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4201:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4202:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4202:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4203:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceLAccess().getRoleRoleCrossReference_2_0()); 
            // InternalMyDsl.g:4204:3: ( RULE_ID )
            // InternalMyDsl.g:4205:4: RULE_ID
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


    // $ANTLR start "rule__ChoiceL__MessageAssignment_4"
    // InternalMyDsl.g:4216:1: rule__ChoiceL__MessageAssignment_4 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__MessageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4220:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:4221:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:4221:2: ( ruleMessageL )
            // InternalMyDsl.g:4222:3: ruleMessageL
            {
             before(grammarAccess.getChoiceLAccess().getMessageMessageLParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageL();

            state._fsp--;

             after(grammarAccess.getChoiceLAccess().getMessageMessageLParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__MessageAssignment_4"


    // $ANTLR start "rule__ChoiceL__BranchesAssignment_5"
    // InternalMyDsl.g:4231:1: rule__ChoiceL__BranchesAssignment_5 : ( ruleProtocolL ) ;
    public final void rule__ChoiceL__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4235:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4236:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4236:2: ( ruleProtocolL )
            // InternalMyDsl.g:4237:3: ruleProtocolL
            {
             before(grammarAccess.getChoiceLAccess().getBranchesProtocolLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getChoiceLAccess().getBranchesProtocolLParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__BranchesAssignment_5"


    // $ANTLR start "rule__ChoiceL__MessageAssignment_7_2"
    // InternalMyDsl.g:4246:1: rule__ChoiceL__MessageAssignment_7_2 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__MessageAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4250:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:4251:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:4251:2: ( ruleMessageL )
            // InternalMyDsl.g:4252:3: ruleMessageL
            {
             before(grammarAccess.getChoiceLAccess().getMessageMessageLParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageL();

            state._fsp--;

             after(grammarAccess.getChoiceLAccess().getMessageMessageLParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__MessageAssignment_7_2"


    // $ANTLR start "rule__ChoiceL__BranchesAssignment_7_3"
    // InternalMyDsl.g:4261:1: rule__ChoiceL__BranchesAssignment_7_3 : ( ruleProtocolL ) ;
    public final void rule__ChoiceL__BranchesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4265:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4266:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4266:2: ( ruleProtocolL )
            // InternalMyDsl.g:4267:3: ruleProtocolL
            {
             before(grammarAccess.getChoiceLAccess().getBranchesProtocolLParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getChoiceLAccess().getBranchesProtocolLParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceL__BranchesAssignment_7_3"


    // $ANTLR start "rule__ForEachL__EachRoleAssignment_1"
    // InternalMyDsl.g:4276:1: rule__ForEachL__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEachL__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4280:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:4281:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:4281:2: ( ruleRoleOne )
            // InternalMyDsl.g:4282:3: ruleRoleOne
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
    // InternalMyDsl.g:4291:1: rule__ForEachL__RoleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4295:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4296:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4296:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4297:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRoleRoleSetCrossReference_3_0()); 
            // InternalMyDsl.g:4298:3: ( RULE_ID )
            // InternalMyDsl.g:4299:4: RULE_ID
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
    // InternalMyDsl.g:4310:1: rule__ForEachL__BranchAssignment_5 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__BranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4314:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4315:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4315:2: ( ruleProtocolL )
            // InternalMyDsl.g:4316:3: ruleProtocolL
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000015800010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000015800012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080003810L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000302000000L});

}