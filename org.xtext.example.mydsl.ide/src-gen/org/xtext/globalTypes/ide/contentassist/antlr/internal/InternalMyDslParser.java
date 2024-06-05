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


    // $ANTLR start "entryRuleRolesL"
    // InternalMyDsl.g:403:1: entryRuleRolesL : ruleRolesL EOF ;
    public final void entryRuleRolesL() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleRolesL EOF )
            // InternalMyDsl.g:405:1: ruleRolesL EOF
            {
             before(grammarAccess.getRolesLRule()); 
            pushFollow(FOLLOW_1);
            ruleRolesL();

            state._fsp--;

             after(grammarAccess.getRolesLRule()); 
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
    // $ANTLR end "entryRuleRolesL"


    // $ANTLR start "ruleRolesL"
    // InternalMyDsl.g:412:1: ruleRolesL : ( ( rule__RolesL__Group__0 ) ) ;
    public final void ruleRolesL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__RolesL__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__RolesL__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__RolesL__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__RolesL__Group__0 )
            {
             before(grammarAccess.getRolesLAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__RolesL__Group__0 )
            // InternalMyDsl.g:419:4: rule__RolesL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RolesL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRolesLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRolesL"


    // $ANTLR start "entryRuleRoleL"
    // InternalMyDsl.g:428:1: entryRuleRoleL : ruleRoleL EOF ;
    public final void entryRuleRoleL() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleRoleL EOF )
            // InternalMyDsl.g:430:1: ruleRoleL EOF
            {
             before(grammarAccess.getRoleLRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleL();

            state._fsp--;

             after(grammarAccess.getRoleLRule()); 
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
    // $ANTLR end "entryRuleRoleL"


    // $ANTLR start "ruleRoleL"
    // InternalMyDsl.g:437:1: ruleRoleL : ( ( rule__RoleL__Alternatives ) ) ;
    public final void ruleRoleL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__RoleL__Alternatives ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__RoleL__Alternatives ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__RoleL__Alternatives ) )
            // InternalMyDsl.g:443:3: ( rule__RoleL__Alternatives )
            {
             before(grammarAccess.getRoleLAccess().getAlternatives()); 
            // InternalMyDsl.g:444:3: ( rule__RoleL__Alternatives )
            // InternalMyDsl.g:444:4: rule__RoleL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoleL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleL"


    // $ANTLR start "entryRuleRoleOneL"
    // InternalMyDsl.g:453:1: entryRuleRoleOneL : ruleRoleOneL EOF ;
    public final void entryRuleRoleOneL() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleRoleOneL EOF )
            // InternalMyDsl.g:455:1: ruleRoleOneL EOF
            {
             before(grammarAccess.getRoleOneLRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleOneL();

            state._fsp--;

             after(grammarAccess.getRoleOneLRule()); 
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
    // $ANTLR end "entryRuleRoleOneL"


    // $ANTLR start "ruleRoleOneL"
    // InternalMyDsl.g:462:1: ruleRoleOneL : ( ( rule__RoleOneL__Group__0 ) ) ;
    public final void ruleRoleOneL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__RoleOneL__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__RoleOneL__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__RoleOneL__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__RoleOneL__Group__0 )
            {
             before(grammarAccess.getRoleOneLAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__RoleOneL__Group__0 )
            // InternalMyDsl.g:469:4: rule__RoleOneL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoleOneL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleOneLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleOneL"


    // $ANTLR start "entryRuleRoleSetL"
    // InternalMyDsl.g:478:1: entryRuleRoleSetL : ruleRoleSetL EOF ;
    public final void entryRuleRoleSetL() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleRoleSetL EOF )
            // InternalMyDsl.g:480:1: ruleRoleSetL EOF
            {
             before(grammarAccess.getRoleSetLRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleSetL();

            state._fsp--;

             after(grammarAccess.getRoleSetLRule()); 
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
    // $ANTLR end "entryRuleRoleSetL"


    // $ANTLR start "ruleRoleSetL"
    // InternalMyDsl.g:487:1: ruleRoleSetL : ( ( rule__RoleSetL__Group__0 ) ) ;
    public final void ruleRoleSetL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__RoleSetL__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__RoleSetL__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__RoleSetL__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__RoleSetL__Group__0 )
            {
             before(grammarAccess.getRoleSetLAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__RoleSetL__Group__0 )
            // InternalMyDsl.g:494:4: rule__RoleSetL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoleSetL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleSetLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleSetL"


    // $ANTLR start "entryRuleProtocolL"
    // InternalMyDsl.g:503:1: entryRuleProtocolL : ruleProtocolL EOF ;
    public final void entryRuleProtocolL() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleProtocolL EOF )
            // InternalMyDsl.g:505:1: ruleProtocolL EOF
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
    // InternalMyDsl.g:512:1: ruleProtocolL : ( ( rule__ProtocolL__Group__0 ) ) ;
    public final void ruleProtocolL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__ProtocolL__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__ProtocolL__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__ProtocolL__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__ProtocolL__Group__0 )
            {
             before(grammarAccess.getProtocolLAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__ProtocolL__Group__0 )
            // InternalMyDsl.g:519:4: rule__ProtocolL__Group__0
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


    // $ANTLR start "entryRuleSenderL"
    // InternalMyDsl.g:553:1: entryRuleSenderL : ruleSenderL EOF ;
    public final void entryRuleSenderL() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleSenderL EOF )
            // InternalMyDsl.g:555:1: ruleSenderL EOF
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
    // InternalMyDsl.g:562:1: ruleSenderL : ( ( rule__SenderL__Group__0 ) ) ;
    public final void ruleSenderL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__SenderL__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__SenderL__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__SenderL__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__SenderL__Group__0 )
            {
             before(grammarAccess.getSenderLAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__SenderL__Group__0 )
            // InternalMyDsl.g:569:4: rule__SenderL__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleReceiverL : ruleReceiverL EOF ;
    public final void entryRuleReceiverL() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleReceiverL EOF )
            // InternalMyDsl.g:580:1: ruleReceiverL EOF
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
    // InternalMyDsl.g:587:1: ruleReceiverL : ( ( rule__ReceiverL__Group__0 ) ) ;
    public final void ruleReceiverL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__ReceiverL__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__ReceiverL__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__ReceiverL__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__ReceiverL__Group__0 )
            {
             before(grammarAccess.getReceiverLAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__ReceiverL__Group__0 )
            // InternalMyDsl.g:594:4: rule__ReceiverL__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleChoiceL : ruleChoiceL EOF ;
    public final void entryRuleChoiceL() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleChoiceL EOF )
            // InternalMyDsl.g:605:1: ruleChoiceL EOF
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
    // InternalMyDsl.g:612:1: ruleChoiceL : ( ( rule__ChoiceL__Group__0 ) ) ;
    public final void ruleChoiceL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__ChoiceL__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__ChoiceL__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__ChoiceL__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__ChoiceL__Group__0 )
            {
             before(grammarAccess.getChoiceLAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__ChoiceL__Group__0 )
            // InternalMyDsl.g:619:4: rule__ChoiceL__Group__0
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


    // $ANTLR start "rule__Protocol__ActionsAlternatives_1_0"
    // InternalMyDsl.g:719:1: rule__Protocol__ActionsAlternatives_1_0 : ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) );
    public final void rule__Protocol__ActionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) )
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
                    // InternalMyDsl.g:724:2: ( ruleMessage )
                    {
                    // InternalMyDsl.g:724:2: ( ruleMessage )
                    // InternalMyDsl.g:725:3: ruleMessage
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
                    // InternalMyDsl.g:730:2: ( ruleChoice )
                    {
                    // InternalMyDsl.g:730:2: ( ruleChoice )
                    // InternalMyDsl.g:731:3: ruleChoice
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
                    // InternalMyDsl.g:736:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:736:2: ( ruleRecursion )
                    // InternalMyDsl.g:737:3: ruleRecursion
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
                    // InternalMyDsl.g:742:2: ( ruleForEach )
                    {
                    // InternalMyDsl.g:742:2: ( ruleForEach )
                    // InternalMyDsl.g:743:3: ruleForEach
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
                    // InternalMyDsl.g:748:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:748:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:749:3: ruleCloseRecursion
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
    // InternalMyDsl.g:758:1: rule__Payload__Alternatives : ( ( ( rule__Payload__Group_0__0 ) ) | ( ( rule__Payload__TypesAssignment_1 ) ) );
    public final void rule__Payload__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:762:1: ( ( ( rule__Payload__Group_0__0 ) ) | ( ( rule__Payload__TypesAssignment_1 ) ) )
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
                    // InternalMyDsl.g:763:2: ( ( rule__Payload__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:763:2: ( ( rule__Payload__Group_0__0 ) )
                    // InternalMyDsl.g:764:3: ( rule__Payload__Group_0__0 )
                    {
                     before(grammarAccess.getPayloadAccess().getGroup_0()); 
                    // InternalMyDsl.g:765:3: ( rule__Payload__Group_0__0 )
                    // InternalMyDsl.g:765:4: rule__Payload__Group_0__0
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
                    // InternalMyDsl.g:769:2: ( ( rule__Payload__TypesAssignment_1 ) )
                    {
                    // InternalMyDsl.g:769:2: ( ( rule__Payload__TypesAssignment_1 ) )
                    // InternalMyDsl.g:770:3: ( rule__Payload__TypesAssignment_1 )
                    {
                     before(grammarAccess.getPayloadAccess().getTypesAssignment_1()); 
                    // InternalMyDsl.g:771:3: ( rule__Payload__TypesAssignment_1 )
                    // InternalMyDsl.g:771:4: rule__Payload__TypesAssignment_1
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


    // $ANTLR start "rule__RoleL__Alternatives"
    // InternalMyDsl.g:779:1: rule__RoleL__Alternatives : ( ( ruleRoleOneL ) | ( ruleRoleSetL ) );
    public final void rule__RoleL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( ( ruleRoleOneL ) | ( ruleRoleSetL ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:784:2: ( ruleRoleOneL )
                    {
                    // InternalMyDsl.g:784:2: ( ruleRoleOneL )
                    // InternalMyDsl.g:785:3: ruleRoleOneL
                    {
                     before(grammarAccess.getRoleLAccess().getRoleOneLParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRoleOneL();

                    state._fsp--;

                     after(grammarAccess.getRoleLAccess().getRoleOneLParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:790:2: ( ruleRoleSetL )
                    {
                    // InternalMyDsl.g:790:2: ( ruleRoleSetL )
                    // InternalMyDsl.g:791:3: ruleRoleSetL
                    {
                     before(grammarAccess.getRoleLAccess().getRoleSetLParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRoleSetL();

                    state._fsp--;

                     after(grammarAccess.getRoleLAccess().getRoleSetLParserRuleCall_1()); 

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
    // $ANTLR end "rule__RoleL__Alternatives"


    // $ANTLR start "rule__ProtocolL__ActionsAlternatives_1_0"
    // InternalMyDsl.g:800:1: rule__ProtocolL__ActionsAlternatives_1_0 : ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursion ) | ( ruleCloseRecursion ) );
    public final void rule__ProtocolL__ActionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleForEachL ) | ( ruleRecursion ) | ( ruleCloseRecursion ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 24:
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
                    // InternalMyDsl.g:805:2: ( ruleMessageL )
                    {
                    // InternalMyDsl.g:805:2: ( ruleMessageL )
                    // InternalMyDsl.g:806:3: ruleMessageL
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
                    // InternalMyDsl.g:811:2: ( ruleChoiceL )
                    {
                    // InternalMyDsl.g:811:2: ( ruleChoiceL )
                    // InternalMyDsl.g:812:3: ruleChoiceL
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
                    // InternalMyDsl.g:817:2: ( ruleForEachL )
                    {
                    // InternalMyDsl.g:817:2: ( ruleForEachL )
                    // InternalMyDsl.g:818:3: ruleForEachL
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
                    // InternalMyDsl.g:823:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:823:2: ( ruleRecursion )
                    // InternalMyDsl.g:824:3: ruleRecursion
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
                    // InternalMyDsl.g:829:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:829:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:830:3: ruleCloseRecursion
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
    // InternalMyDsl.g:839:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'action' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:843:1: ( ( 'int' ) | ( 'string' ) | ( 'action' ) )
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
                    // InternalMyDsl.g:844:2: ( 'int' )
                    {
                    // InternalMyDsl.g:844:2: ( 'int' )
                    // InternalMyDsl.g:845:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:850:2: ( 'string' )
                    {
                    // InternalMyDsl.g:850:2: ( 'string' )
                    // InternalMyDsl.g:851:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:856:2: ( 'action' )
                    {
                    // InternalMyDsl.g:856:2: ( 'action' )
                    // InternalMyDsl.g:857:3: 'action'
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
    // InternalMyDsl.g:866:1: rule__GlobalProtocol__Group__0 : rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 ;
    public final void rule__GlobalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:870:1: ( rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1 )
            // InternalMyDsl.g:871:2: rule__GlobalProtocol__Group__0__Impl rule__GlobalProtocol__Group__1
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
    // InternalMyDsl.g:878:1: rule__GlobalProtocol__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:1: ( ( 'global' ) )
            // InternalMyDsl.g:883:1: ( 'global' )
            {
            // InternalMyDsl.g:883:1: ( 'global' )
            // InternalMyDsl.g:884:2: 'global'
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
    // InternalMyDsl.g:893:1: rule__GlobalProtocol__Group__1 : rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 ;
    public final void rule__GlobalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:897:1: ( rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2 )
            // InternalMyDsl.g:898:2: rule__GlobalProtocol__Group__1__Impl rule__GlobalProtocol__Group__2
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
    // InternalMyDsl.g:905:1: rule__GlobalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__GlobalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:910:1: ( 'protocol' )
            {
            // InternalMyDsl.g:910:1: ( 'protocol' )
            // InternalMyDsl.g:911:2: 'protocol'
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
    // InternalMyDsl.g:920:1: rule__GlobalProtocol__Group__2 : rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 ;
    public final void rule__GlobalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:924:1: ( rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3 )
            // InternalMyDsl.g:925:2: rule__GlobalProtocol__Group__2__Impl rule__GlobalProtocol__Group__3
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
    // InternalMyDsl.g:932:1: rule__GlobalProtocol__Group__2__Impl : ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__GlobalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:936:1: ( ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:937:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:937:1: ( ( rule__GlobalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:938:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:939:2: ( rule__GlobalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:939:3: rule__GlobalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:947:1: rule__GlobalProtocol__Group__3 : rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 ;
    public final void rule__GlobalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4 )
            // InternalMyDsl.g:952:2: rule__GlobalProtocol__Group__3__Impl rule__GlobalProtocol__Group__4
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
    // InternalMyDsl.g:959:1: rule__GlobalProtocol__Group__3__Impl : ( '(' ) ;
    public final void rule__GlobalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:963:1: ( ( '(' ) )
            // InternalMyDsl.g:964:1: ( '(' )
            {
            // InternalMyDsl.g:964:1: ( '(' )
            // InternalMyDsl.g:965:2: '('
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
    // InternalMyDsl.g:974:1: rule__GlobalProtocol__Group__4 : rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 ;
    public final void rule__GlobalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:978:1: ( rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5 )
            // InternalMyDsl.g:979:2: rule__GlobalProtocol__Group__4__Impl rule__GlobalProtocol__Group__5
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
    // InternalMyDsl.g:986:1: rule__GlobalProtocol__Group__4__Impl : ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) ;
    public final void rule__GlobalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( ( ( rule__GlobalProtocol__RolesAssignment_4 ) ) )
            // InternalMyDsl.g:991:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            {
            // InternalMyDsl.g:991:1: ( ( rule__GlobalProtocol__RolesAssignment_4 ) )
            // InternalMyDsl.g:992:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getRolesAssignment_4()); 
            // InternalMyDsl.g:993:2: ( rule__GlobalProtocol__RolesAssignment_4 )
            // InternalMyDsl.g:993:3: rule__GlobalProtocol__RolesAssignment_4
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
    // InternalMyDsl.g:1001:1: rule__GlobalProtocol__Group__5 : rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 ;
    public final void rule__GlobalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1005:1: ( rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6 )
            // InternalMyDsl.g:1006:2: rule__GlobalProtocol__Group__5__Impl rule__GlobalProtocol__Group__6
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
    // InternalMyDsl.g:1013:1: rule__GlobalProtocol__Group__5__Impl : ( '){' ) ;
    public final void rule__GlobalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( ( '){' ) )
            // InternalMyDsl.g:1018:1: ( '){' )
            {
            // InternalMyDsl.g:1018:1: ( '){' )
            // InternalMyDsl.g:1019:2: '){'
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
    // InternalMyDsl.g:1028:1: rule__GlobalProtocol__Group__6 : rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 ;
    public final void rule__GlobalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1032:1: ( rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7 )
            // InternalMyDsl.g:1033:2: rule__GlobalProtocol__Group__6__Impl rule__GlobalProtocol__Group__7
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
    // InternalMyDsl.g:1040:1: rule__GlobalProtocol__Group__6__Impl : ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) ;
    public final void rule__GlobalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1044:1: ( ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) ) )
            // InternalMyDsl.g:1045:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            {
            // InternalMyDsl.g:1045:1: ( ( rule__GlobalProtocol__ProtocolAssignment_6 ) )
            // InternalMyDsl.g:1046:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            {
             before(grammarAccess.getGlobalProtocolAccess().getProtocolAssignment_6()); 
            // InternalMyDsl.g:1047:2: ( rule__GlobalProtocol__ProtocolAssignment_6 )
            // InternalMyDsl.g:1047:3: rule__GlobalProtocol__ProtocolAssignment_6
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
    // InternalMyDsl.g:1055:1: rule__GlobalProtocol__Group__7 : rule__GlobalProtocol__Group__7__Impl ;
    public final void rule__GlobalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1059:1: ( rule__GlobalProtocol__Group__7__Impl )
            // InternalMyDsl.g:1060:2: rule__GlobalProtocol__Group__7__Impl
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
    // InternalMyDsl.g:1066:1: rule__GlobalProtocol__Group__7__Impl : ( '}' ) ;
    public final void rule__GlobalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( '}' ) )
            // InternalMyDsl.g:1071:1: ( '}' )
            {
            // InternalMyDsl.g:1071:1: ( '}' )
            // InternalMyDsl.g:1072:2: '}'
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
    // InternalMyDsl.g:1082:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1086:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalMyDsl.g:1087:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
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
    // InternalMyDsl.g:1094:1: rule__Roles__Group__0__Impl : ( ( rule__Roles__RolesAssignment_0 ) ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1098:1: ( ( ( rule__Roles__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:1099:1: ( ( rule__Roles__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:1099:1: ( ( rule__Roles__RolesAssignment_0 ) )
            // InternalMyDsl.g:1100:2: ( rule__Roles__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:1101:2: ( rule__Roles__RolesAssignment_0 )
            // InternalMyDsl.g:1101:3: rule__Roles__RolesAssignment_0
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
    // InternalMyDsl.g:1109:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1113:1: ( rule__Roles__Group__1__Impl )
            // InternalMyDsl.g:1114:2: rule__Roles__Group__1__Impl
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
    // InternalMyDsl.g:1120:1: rule__Roles__Group__1__Impl : ( ( rule__Roles__Group_1__0 )* ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( ( rule__Roles__Group_1__0 )* ) )
            // InternalMyDsl.g:1125:1: ( ( rule__Roles__Group_1__0 )* )
            {
            // InternalMyDsl.g:1125:1: ( ( rule__Roles__Group_1__0 )* )
            // InternalMyDsl.g:1126:2: ( rule__Roles__Group_1__0 )*
            {
             before(grammarAccess.getRolesAccess().getGroup_1()); 
            // InternalMyDsl.g:1127:2: ( rule__Roles__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1127:3: rule__Roles__Group_1__0
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
    // InternalMyDsl.g:1136:1: rule__Roles__Group_1__0 : rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 ;
    public final void rule__Roles__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1140:1: ( rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 )
            // InternalMyDsl.g:1141:2: rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1
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
    // InternalMyDsl.g:1148:1: rule__Roles__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Roles__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( ( ',' ) )
            // InternalMyDsl.g:1153:1: ( ',' )
            {
            // InternalMyDsl.g:1153:1: ( ',' )
            // InternalMyDsl.g:1154:2: ','
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
    // InternalMyDsl.g:1163:1: rule__Roles__Group_1__1 : rule__Roles__Group_1__1__Impl ;
    public final void rule__Roles__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1167:1: ( rule__Roles__Group_1__1__Impl )
            // InternalMyDsl.g:1168:2: rule__Roles__Group_1__1__Impl
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
    // InternalMyDsl.g:1174:1: rule__Roles__Group_1__1__Impl : ( ( rule__Roles__RolesAssignment_1_1 ) ) ;
    public final void rule__Roles__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( ( rule__Roles__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:1179:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1179:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:1180:2: ( rule__Roles__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:1181:2: ( rule__Roles__RolesAssignment_1_1 )
            // InternalMyDsl.g:1181:3: rule__Roles__RolesAssignment_1_1
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
    // InternalMyDsl.g:1190:1: rule__RoleOne__Group__0 : rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 ;
    public final void rule__RoleOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1194:1: ( rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 )
            // InternalMyDsl.g:1195:2: rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1
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
    // InternalMyDsl.g:1202:1: rule__RoleOne__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( ( 'role' ) )
            // InternalMyDsl.g:1207:1: ( 'role' )
            {
            // InternalMyDsl.g:1207:1: ( 'role' )
            // InternalMyDsl.g:1208:2: 'role'
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
    // InternalMyDsl.g:1217:1: rule__RoleOne__Group__1 : rule__RoleOne__Group__1__Impl ;
    public final void rule__RoleOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1221:1: ( rule__RoleOne__Group__1__Impl )
            // InternalMyDsl.g:1222:2: rule__RoleOne__Group__1__Impl
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
    // InternalMyDsl.g:1228:1: rule__RoleOne__Group__1__Impl : ( ( rule__RoleOne__NameAssignment_1 ) ) ;
    public final void rule__RoleOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( ( rule__RoleOne__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1233:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1233:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            // InternalMyDsl.g:1234:2: ( rule__RoleOne__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1235:2: ( rule__RoleOne__NameAssignment_1 )
            // InternalMyDsl.g:1235:3: rule__RoleOne__NameAssignment_1
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
    // InternalMyDsl.g:1244:1: rule__RoleSet__Group__0 : rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 ;
    public final void rule__RoleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1248:1: ( rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1 )
            // InternalMyDsl.g:1249:2: rule__RoleSet__Group__0__Impl rule__RoleSet__Group__1
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
    // InternalMyDsl.g:1256:1: rule__RoleSet__Group__0__Impl : ( 'roleset' ) ;
    public final void rule__RoleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1260:1: ( ( 'roleset' ) )
            // InternalMyDsl.g:1261:1: ( 'roleset' )
            {
            // InternalMyDsl.g:1261:1: ( 'roleset' )
            // InternalMyDsl.g:1262:2: 'roleset'
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
    // InternalMyDsl.g:1271:1: rule__RoleSet__Group__1 : rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 ;
    public final void rule__RoleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1275:1: ( rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2 )
            // InternalMyDsl.g:1276:2: rule__RoleSet__Group__1__Impl rule__RoleSet__Group__2
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
    // InternalMyDsl.g:1283:1: rule__RoleSet__Group__1__Impl : ( ( rule__RoleSet__NameAssignment_1 ) ) ;
    public final void rule__RoleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( ( ( rule__RoleSet__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1288:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1288:1: ( ( rule__RoleSet__NameAssignment_1 ) )
            // InternalMyDsl.g:1289:2: ( rule__RoleSet__NameAssignment_1 )
            {
             before(grammarAccess.getRoleSetAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1290:2: ( rule__RoleSet__NameAssignment_1 )
            // InternalMyDsl.g:1290:3: rule__RoleSet__NameAssignment_1
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
    // InternalMyDsl.g:1298:1: rule__RoleSet__Group__2 : rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 ;
    public final void rule__RoleSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1302:1: ( rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3 )
            // InternalMyDsl.g:1303:2: rule__RoleSet__Group__2__Impl rule__RoleSet__Group__3
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
    // InternalMyDsl.g:1310:1: rule__RoleSet__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( ( ':' ) )
            // InternalMyDsl.g:1315:1: ( ':' )
            {
            // InternalMyDsl.g:1315:1: ( ':' )
            // InternalMyDsl.g:1316:2: ':'
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
    // InternalMyDsl.g:1325:1: rule__RoleSet__Group__3 : rule__RoleSet__Group__3__Impl ;
    public final void rule__RoleSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1329:1: ( rule__RoleSet__Group__3__Impl )
            // InternalMyDsl.g:1330:2: rule__RoleSet__Group__3__Impl
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
    // InternalMyDsl.g:1336:1: rule__RoleSet__Group__3__Impl : ( ( rule__RoleSet__RefAssignment_3 ) ) ;
    public final void rule__RoleSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( ( ( rule__RoleSet__RefAssignment_3 ) ) )
            // InternalMyDsl.g:1341:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:1341:1: ( ( rule__RoleSet__RefAssignment_3 ) )
            // InternalMyDsl.g:1342:2: ( rule__RoleSet__RefAssignment_3 )
            {
             before(grammarAccess.getRoleSetAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:1343:2: ( rule__RoleSet__RefAssignment_3 )
            // InternalMyDsl.g:1343:3: rule__RoleSet__RefAssignment_3
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
    // InternalMyDsl.g:1352:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1356:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalMyDsl.g:1357:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
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
    // InternalMyDsl.g:1364:1: rule__Protocol__Group__0__Impl : ( () ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( ( () ) )
            // InternalMyDsl.g:1369:1: ( () )
            {
            // InternalMyDsl.g:1369:1: ( () )
            // InternalMyDsl.g:1370:2: ()
            {
             before(grammarAccess.getProtocolAccess().getProtocolAction_0()); 
            // InternalMyDsl.g:1371:2: ()
            // InternalMyDsl.g:1371:3: 
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
    // InternalMyDsl.g:1379:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1383:1: ( rule__Protocol__Group__1__Impl )
            // InternalMyDsl.g:1384:2: rule__Protocol__Group__1__Impl
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
    // InternalMyDsl.g:1390:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__ActionsAssignment_1 )* ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( ( ( rule__Protocol__ActionsAssignment_1 )* ) )
            // InternalMyDsl.g:1395:1: ( ( rule__Protocol__ActionsAssignment_1 )* )
            {
            // InternalMyDsl.g:1395:1: ( ( rule__Protocol__ActionsAssignment_1 )* )
            // InternalMyDsl.g:1396:2: ( rule__Protocol__ActionsAssignment_1 )*
            {
             before(grammarAccess.getProtocolAccess().getActionsAssignment_1()); 
            // InternalMyDsl.g:1397:2: ( rule__Protocol__ActionsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=23 && LA9_0<=24)||LA9_0==26||LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1397:3: rule__Protocol__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Protocol__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyDsl.g:1406:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1410:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalMyDsl.g:1411:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
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
    // InternalMyDsl.g:1418:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1422:1: ( ( 'rec' ) )
            // InternalMyDsl.g:1423:1: ( 'rec' )
            {
            // InternalMyDsl.g:1423:1: ( 'rec' )
            // InternalMyDsl.g:1424:2: 'rec'
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
    // InternalMyDsl.g:1433:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1437:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // InternalMyDsl.g:1438:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
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
    // InternalMyDsl.g:1445:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__NameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( ( ( rule__Recursion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1450:1: ( ( rule__Recursion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1450:1: ( ( rule__Recursion__NameAssignment_1 ) )
            // InternalMyDsl.g:1451:2: ( rule__Recursion__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1452:2: ( rule__Recursion__NameAssignment_1 )
            // InternalMyDsl.g:1452:3: rule__Recursion__NameAssignment_1
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
    // InternalMyDsl.g:1460:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1464:1: ( rule__Recursion__Group__2__Impl )
            // InternalMyDsl.g:1465:2: rule__Recursion__Group__2__Impl
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
    // InternalMyDsl.g:1471:1: rule__Recursion__Group__2__Impl : ( ':' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( ( ':' ) )
            // InternalMyDsl.g:1476:1: ( ':' )
            {
            // InternalMyDsl.g:1476:1: ( ':' )
            // InternalMyDsl.g:1477:2: ':'
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
    // InternalMyDsl.g:1487:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1491:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalMyDsl.g:1492:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
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
    // InternalMyDsl.g:1499:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( ( 'loop' ) )
            // InternalMyDsl.g:1504:1: ( 'loop' )
            {
            // InternalMyDsl.g:1504:1: ( 'loop' )
            // InternalMyDsl.g:1505:2: 'loop'
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
    // InternalMyDsl.g:1514:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1518:1: ( rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 )
            // InternalMyDsl.g:1519:2: rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2
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
    // InternalMyDsl.g:1526:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1530:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:1531:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:1531:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:1532:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:1533:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:1533:3: rule__CloseRecursion__RecursionVariableAssignment_1
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
    // InternalMyDsl.g:1541:1: rule__CloseRecursion__Group__2 : rule__CloseRecursion__Group__2__Impl ;
    public final void rule__CloseRecursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1545:1: ( rule__CloseRecursion__Group__2__Impl )
            // InternalMyDsl.g:1546:2: rule__CloseRecursion__Group__2__Impl
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
    // InternalMyDsl.g:1552:1: rule__CloseRecursion__Group__2__Impl : ( ';' ) ;
    public final void rule__CloseRecursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( ( ';' ) )
            // InternalMyDsl.g:1557:1: ( ';' )
            {
            // InternalMyDsl.g:1557:1: ( ';' )
            // InternalMyDsl.g:1558:2: ';'
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
    // InternalMyDsl.g:1568:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1572:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalMyDsl.g:1573:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
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
    // InternalMyDsl.g:1580:1: rule__ForEach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:1585:1: ( 'foreach' )
            {
            // InternalMyDsl.g:1585:1: ( 'foreach' )
            // InternalMyDsl.g:1586:2: 'foreach'
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
    // InternalMyDsl.g:1595:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1599:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalMyDsl.g:1600:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
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
    // InternalMyDsl.g:1607:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1611:1: ( ( ( rule__ForEach__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:1612:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:1612:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:1613:2: ( rule__ForEach__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:1614:2: ( rule__ForEach__EachRoleAssignment_1 )
            // InternalMyDsl.g:1614:3: rule__ForEach__EachRoleAssignment_1
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
    // InternalMyDsl.g:1622:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1626:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalMyDsl.g:1627:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
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
    // InternalMyDsl.g:1634:1: rule__ForEach__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( ( ':' ) )
            // InternalMyDsl.g:1639:1: ( ':' )
            {
            // InternalMyDsl.g:1639:1: ( ':' )
            // InternalMyDsl.g:1640:2: ':'
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
    // InternalMyDsl.g:1649:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1653:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalMyDsl.g:1654:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
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
    // InternalMyDsl.g:1661:1: rule__ForEach__Group__3__Impl : ( ( rule__ForEach__RoleAssignment_3 ) ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( ( ( rule__ForEach__RoleAssignment_3 ) ) )
            // InternalMyDsl.g:1666:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            {
            // InternalMyDsl.g:1666:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            // InternalMyDsl.g:1667:2: ( rule__ForEach__RoleAssignment_3 )
            {
             before(grammarAccess.getForEachAccess().getRoleAssignment_3()); 
            // InternalMyDsl.g:1668:2: ( rule__ForEach__RoleAssignment_3 )
            // InternalMyDsl.g:1668:3: rule__ForEach__RoleAssignment_3
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
    // InternalMyDsl.g:1676:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1680:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalMyDsl.g:1681:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
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
    // InternalMyDsl.g:1688:1: rule__ForEach__Group__4__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( ( '{' ) )
            // InternalMyDsl.g:1693:1: ( '{' )
            {
            // InternalMyDsl.g:1693:1: ( '{' )
            // InternalMyDsl.g:1694:2: '{'
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
    // InternalMyDsl.g:1703:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1707:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalMyDsl.g:1708:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
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
    // InternalMyDsl.g:1715:1: rule__ForEach__Group__5__Impl : ( ( rule__ForEach__BranchAssignment_5 ) ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1719:1: ( ( ( rule__ForEach__BranchAssignment_5 ) ) )
            // InternalMyDsl.g:1720:1: ( ( rule__ForEach__BranchAssignment_5 ) )
            {
            // InternalMyDsl.g:1720:1: ( ( rule__ForEach__BranchAssignment_5 ) )
            // InternalMyDsl.g:1721:2: ( rule__ForEach__BranchAssignment_5 )
            {
             before(grammarAccess.getForEachAccess().getBranchAssignment_5()); 
            // InternalMyDsl.g:1722:2: ( rule__ForEach__BranchAssignment_5 )
            // InternalMyDsl.g:1722:3: rule__ForEach__BranchAssignment_5
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
    // InternalMyDsl.g:1730:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1734:1: ( rule__ForEach__Group__6__Impl )
            // InternalMyDsl.g:1735:2: rule__ForEach__Group__6__Impl
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
    // InternalMyDsl.g:1741:1: rule__ForEach__Group__6__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( '}' ) )
            // InternalMyDsl.g:1746:1: ( '}' )
            {
            // InternalMyDsl.g:1746:1: ( '}' )
            // InternalMyDsl.g:1747:2: '}'
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
    // InternalMyDsl.g:1757:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1761:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:1762:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
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
    // InternalMyDsl.g:1769:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( ( 'choice' ) )
            // InternalMyDsl.g:1774:1: ( 'choice' )
            {
            // InternalMyDsl.g:1774:1: ( 'choice' )
            // InternalMyDsl.g:1775:2: 'choice'
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
    // InternalMyDsl.g:1784:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1788:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:1789:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
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
    // InternalMyDsl.g:1796:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( ( 'at' ) )
            // InternalMyDsl.g:1801:1: ( 'at' )
            {
            // InternalMyDsl.g:1801:1: ( 'at' )
            // InternalMyDsl.g:1802:2: 'at'
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
    // InternalMyDsl.g:1811:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1815:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:1816:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
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
    // InternalMyDsl.g:1823:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1827:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:1828:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:1828:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalMyDsl.g:1829:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:1830:2: ( rule__Choice__RoleAssignment_2 )
            // InternalMyDsl.g:1830:3: rule__Choice__RoleAssignment_2
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
    // InternalMyDsl.g:1838:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1842:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:1843:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
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
    // InternalMyDsl.g:1850:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1854:1: ( ( '{' ) )
            // InternalMyDsl.g:1855:1: ( '{' )
            {
            // InternalMyDsl.g:1855:1: ( '{' )
            // InternalMyDsl.g:1856:2: '{'
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
    // InternalMyDsl.g:1865:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1869:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:1870:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
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
    // InternalMyDsl.g:1877:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__MessageAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( ( ( rule__Choice__MessageAssignment_4 ) ) )
            // InternalMyDsl.g:1882:1: ( ( rule__Choice__MessageAssignment_4 ) )
            {
            // InternalMyDsl.g:1882:1: ( ( rule__Choice__MessageAssignment_4 ) )
            // InternalMyDsl.g:1883:2: ( rule__Choice__MessageAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getMessageAssignment_4()); 
            // InternalMyDsl.g:1884:2: ( rule__Choice__MessageAssignment_4 )
            // InternalMyDsl.g:1884:3: rule__Choice__MessageAssignment_4
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
    // InternalMyDsl.g:1892:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1896:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:1897:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
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
    // InternalMyDsl.g:1904:1: rule__Choice__Group__5__Impl : ( ( rule__Choice__BranchesAssignment_5 ) ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1908:1: ( ( ( rule__Choice__BranchesAssignment_5 ) ) )
            // InternalMyDsl.g:1909:1: ( ( rule__Choice__BranchesAssignment_5 ) )
            {
            // InternalMyDsl.g:1909:1: ( ( rule__Choice__BranchesAssignment_5 ) )
            // InternalMyDsl.g:1910:2: ( rule__Choice__BranchesAssignment_5 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_5()); 
            // InternalMyDsl.g:1911:2: ( rule__Choice__BranchesAssignment_5 )
            // InternalMyDsl.g:1911:3: rule__Choice__BranchesAssignment_5
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
    // InternalMyDsl.g:1919:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl rule__Choice__Group__7 ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1923:1: ( rule__Choice__Group__6__Impl rule__Choice__Group__7 )
            // InternalMyDsl.g:1924:2: rule__Choice__Group__6__Impl rule__Choice__Group__7
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
    // InternalMyDsl.g:1931:1: rule__Choice__Group__6__Impl : ( '}' ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1935:1: ( ( '}' ) )
            // InternalMyDsl.g:1936:1: ( '}' )
            {
            // InternalMyDsl.g:1936:1: ( '}' )
            // InternalMyDsl.g:1937:2: '}'
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
    // InternalMyDsl.g:1946:1: rule__Choice__Group__7 : rule__Choice__Group__7__Impl ;
    public final void rule__Choice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1950:1: ( rule__Choice__Group__7__Impl )
            // InternalMyDsl.g:1951:2: rule__Choice__Group__7__Impl
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
    // InternalMyDsl.g:1957:1: rule__Choice__Group__7__Impl : ( ( rule__Choice__Group_7__0 )* ) ;
    public final void rule__Choice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( ( rule__Choice__Group_7__0 )* ) )
            // InternalMyDsl.g:1962:1: ( ( rule__Choice__Group_7__0 )* )
            {
            // InternalMyDsl.g:1962:1: ( ( rule__Choice__Group_7__0 )* )
            // InternalMyDsl.g:1963:2: ( rule__Choice__Group_7__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_7()); 
            // InternalMyDsl.g:1964:2: ( rule__Choice__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1964:3: rule__Choice__Group_7__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Choice__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:1973:1: rule__Choice__Group_7__0 : rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1 ;
    public final void rule__Choice__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1977:1: ( rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1 )
            // InternalMyDsl.g:1978:2: rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1
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
    // InternalMyDsl.g:1985:1: rule__Choice__Group_7__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( ( 'or' ) )
            // InternalMyDsl.g:1990:1: ( 'or' )
            {
            // InternalMyDsl.g:1990:1: ( 'or' )
            // InternalMyDsl.g:1991:2: 'or'
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
    // InternalMyDsl.g:2000:1: rule__Choice__Group_7__1 : rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2 ;
    public final void rule__Choice__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2004:1: ( rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2 )
            // InternalMyDsl.g:2005:2: rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2
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
    // InternalMyDsl.g:2012:1: rule__Choice__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2016:1: ( ( '{' ) )
            // InternalMyDsl.g:2017:1: ( '{' )
            {
            // InternalMyDsl.g:2017:1: ( '{' )
            // InternalMyDsl.g:2018:2: '{'
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
    // InternalMyDsl.g:2027:1: rule__Choice__Group_7__2 : rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3 ;
    public final void rule__Choice__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2031:1: ( rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3 )
            // InternalMyDsl.g:2032:2: rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3
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
    // InternalMyDsl.g:2039:1: rule__Choice__Group_7__2__Impl : ( ( rule__Choice__MessageAssignment_7_2 ) ) ;
    public final void rule__Choice__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( ( ( rule__Choice__MessageAssignment_7_2 ) ) )
            // InternalMyDsl.g:2044:1: ( ( rule__Choice__MessageAssignment_7_2 ) )
            {
            // InternalMyDsl.g:2044:1: ( ( rule__Choice__MessageAssignment_7_2 ) )
            // InternalMyDsl.g:2045:2: ( rule__Choice__MessageAssignment_7_2 )
            {
             before(grammarAccess.getChoiceAccess().getMessageAssignment_7_2()); 
            // InternalMyDsl.g:2046:2: ( rule__Choice__MessageAssignment_7_2 )
            // InternalMyDsl.g:2046:3: rule__Choice__MessageAssignment_7_2
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
    // InternalMyDsl.g:2054:1: rule__Choice__Group_7__3 : rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4 ;
    public final void rule__Choice__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2058:1: ( rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4 )
            // InternalMyDsl.g:2059:2: rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4
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
    // InternalMyDsl.g:2066:1: rule__Choice__Group_7__3__Impl : ( ( rule__Choice__BranchesAssignment_7_3 ) ) ;
    public final void rule__Choice__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2070:1: ( ( ( rule__Choice__BranchesAssignment_7_3 ) ) )
            // InternalMyDsl.g:2071:1: ( ( rule__Choice__BranchesAssignment_7_3 ) )
            {
            // InternalMyDsl.g:2071:1: ( ( rule__Choice__BranchesAssignment_7_3 ) )
            // InternalMyDsl.g:2072:2: ( rule__Choice__BranchesAssignment_7_3 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_7_3()); 
            // InternalMyDsl.g:2073:2: ( rule__Choice__BranchesAssignment_7_3 )
            // InternalMyDsl.g:2073:3: rule__Choice__BranchesAssignment_7_3
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
    // InternalMyDsl.g:2081:1: rule__Choice__Group_7__4 : rule__Choice__Group_7__4__Impl ;
    public final void rule__Choice__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2085:1: ( rule__Choice__Group_7__4__Impl )
            // InternalMyDsl.g:2086:2: rule__Choice__Group_7__4__Impl
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
    // InternalMyDsl.g:2092:1: rule__Choice__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Choice__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( ( '}' ) )
            // InternalMyDsl.g:2097:1: ( '}' )
            {
            // InternalMyDsl.g:2097:1: ( '}' )
            // InternalMyDsl.g:2098:2: '}'
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
    // InternalMyDsl.g:2108:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2112:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:2113:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalMyDsl.g:2120:1: rule__Message__Group__0__Impl : ( ( rule__Message__MessageTypeAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2124:1: ( ( ( rule__Message__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2125:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2125:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2126:2: ( rule__Message__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2127:2: ( rule__Message__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2127:3: rule__Message__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2135:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2139:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:2140:2: rule__Message__Group__1__Impl rule__Message__Group__2
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
    // InternalMyDsl.g:2147:1: rule__Message__Group__1__Impl : ( '(' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( ( '(' ) )
            // InternalMyDsl.g:2152:1: ( '(' )
            {
            // InternalMyDsl.g:2152:1: ( '(' )
            // InternalMyDsl.g:2153:2: '('
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
    // InternalMyDsl.g:2162:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2166:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:2167:2: rule__Message__Group__2__Impl rule__Message__Group__3
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
    // InternalMyDsl.g:2174:1: rule__Message__Group__2__Impl : ( ( rule__Message__PayloadAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2178:1: ( ( ( rule__Message__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:2179:1: ( ( rule__Message__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:2179:1: ( ( rule__Message__PayloadAssignment_2 )? )
            // InternalMyDsl.g:2180:2: ( rule__Message__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:2181:2: ( rule__Message__PayloadAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||(LA11_0>=11 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:2181:3: rule__Message__PayloadAssignment_2
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
    // InternalMyDsl.g:2189:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2193:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:2194:2: rule__Message__Group__3__Impl rule__Message__Group__4
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
    // InternalMyDsl.g:2201:1: rule__Message__Group__3__Impl : ( ')' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2205:1: ( ( ')' ) )
            // InternalMyDsl.g:2206:1: ( ')' )
            {
            // InternalMyDsl.g:2206:1: ( ')' )
            // InternalMyDsl.g:2207:2: ')'
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
    // InternalMyDsl.g:2216:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2220:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:2221:2: rule__Message__Group__4__Impl rule__Message__Group__5
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
    // InternalMyDsl.g:2228:1: rule__Message__Group__4__Impl : ( 'from' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2232:1: ( ( 'from' ) )
            // InternalMyDsl.g:2233:1: ( 'from' )
            {
            // InternalMyDsl.g:2233:1: ( 'from' )
            // InternalMyDsl.g:2234:2: 'from'
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
    // InternalMyDsl.g:2243:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2247:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:2248:2: rule__Message__Group__5__Impl rule__Message__Group__6
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
    // InternalMyDsl.g:2255:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2259:1: ( ( ( rule__Message__SenderAssignment_5 ) ) )
            // InternalMyDsl.g:2260:1: ( ( rule__Message__SenderAssignment_5 ) )
            {
            // InternalMyDsl.g:2260:1: ( ( rule__Message__SenderAssignment_5 ) )
            // InternalMyDsl.g:2261:2: ( rule__Message__SenderAssignment_5 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_5()); 
            // InternalMyDsl.g:2262:2: ( rule__Message__SenderAssignment_5 )
            // InternalMyDsl.g:2262:3: rule__Message__SenderAssignment_5
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
    // InternalMyDsl.g:2270:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2274:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:2275:2: rule__Message__Group__6__Impl rule__Message__Group__7
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
    // InternalMyDsl.g:2282:1: rule__Message__Group__6__Impl : ( 'to' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2286:1: ( ( 'to' ) )
            // InternalMyDsl.g:2287:1: ( 'to' )
            {
            // InternalMyDsl.g:2287:1: ( 'to' )
            // InternalMyDsl.g:2288:2: 'to'
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
    // InternalMyDsl.g:2297:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2301:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:2302:2: rule__Message__Group__7__Impl rule__Message__Group__8
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
    // InternalMyDsl.g:2309:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( ( ( rule__Message__ReceiverAssignment_7 ) ) )
            // InternalMyDsl.g:2314:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            {
            // InternalMyDsl.g:2314:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            // InternalMyDsl.g:2315:2: ( rule__Message__ReceiverAssignment_7 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 
            // InternalMyDsl.g:2316:2: ( rule__Message__ReceiverAssignment_7 )
            // InternalMyDsl.g:2316:3: rule__Message__ReceiverAssignment_7
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
    // InternalMyDsl.g:2324:1: rule__Message__Group__8 : rule__Message__Group__8__Impl ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2328:1: ( rule__Message__Group__8__Impl )
            // InternalMyDsl.g:2329:2: rule__Message__Group__8__Impl
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
    // InternalMyDsl.g:2335:1: rule__Message__Group__8__Impl : ( ';' ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( ( ';' ) )
            // InternalMyDsl.g:2340:1: ( ';' )
            {
            // InternalMyDsl.g:2340:1: ( ';' )
            // InternalMyDsl.g:2341:2: ';'
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
    // InternalMyDsl.g:2351:1: rule__Payload__Group_0__0 : rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1 ;
    public final void rule__Payload__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2355:1: ( rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1 )
            // InternalMyDsl.g:2356:2: rule__Payload__Group_0__0__Impl rule__Payload__Group_0__1
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
    // InternalMyDsl.g:2363:1: rule__Payload__Group_0__0__Impl : ( () ) ;
    public final void rule__Payload__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2367:1: ( ( () ) )
            // InternalMyDsl.g:2368:1: ( () )
            {
            // InternalMyDsl.g:2368:1: ( () )
            // InternalMyDsl.g:2369:2: ()
            {
             before(grammarAccess.getPayloadAccess().getPayloadAction_0_0()); 
            // InternalMyDsl.g:2370:2: ()
            // InternalMyDsl.g:2370:3: 
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
    // InternalMyDsl.g:2378:1: rule__Payload__Group_0__1 : rule__Payload__Group_0__1__Impl ;
    public final void rule__Payload__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2382:1: ( rule__Payload__Group_0__1__Impl )
            // InternalMyDsl.g:2383:2: rule__Payload__Group_0__1__Impl
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
    // InternalMyDsl.g:2389:1: rule__Payload__Group_0__1__Impl : ( ( rule__Payload__Group_0_1__0 ) ) ;
    public final void rule__Payload__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( ( ( rule__Payload__Group_0_1__0 ) ) )
            // InternalMyDsl.g:2394:1: ( ( rule__Payload__Group_0_1__0 ) )
            {
            // InternalMyDsl.g:2394:1: ( ( rule__Payload__Group_0_1__0 ) )
            // InternalMyDsl.g:2395:2: ( rule__Payload__Group_0_1__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup_0_1()); 
            // InternalMyDsl.g:2396:2: ( rule__Payload__Group_0_1__0 )
            // InternalMyDsl.g:2396:3: rule__Payload__Group_0_1__0
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
    // InternalMyDsl.g:2405:1: rule__Payload__Group_0_1__0 : rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1 ;
    public final void rule__Payload__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2409:1: ( rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1 )
            // InternalMyDsl.g:2410:2: rule__Payload__Group_0_1__0__Impl rule__Payload__Group_0_1__1
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
    // InternalMyDsl.g:2417:1: rule__Payload__Group_0_1__0__Impl : ( ( rule__Payload__TypesAssignment_0_1_0 ) ) ;
    public final void rule__Payload__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2421:1: ( ( ( rule__Payload__TypesAssignment_0_1_0 ) ) )
            // InternalMyDsl.g:2422:1: ( ( rule__Payload__TypesAssignment_0_1_0 ) )
            {
            // InternalMyDsl.g:2422:1: ( ( rule__Payload__TypesAssignment_0_1_0 ) )
            // InternalMyDsl.g:2423:2: ( rule__Payload__TypesAssignment_0_1_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0_1_0()); 
            // InternalMyDsl.g:2424:2: ( rule__Payload__TypesAssignment_0_1_0 )
            // InternalMyDsl.g:2424:3: rule__Payload__TypesAssignment_0_1_0
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
    // InternalMyDsl.g:2432:1: rule__Payload__Group_0_1__1 : rule__Payload__Group_0_1__1__Impl ;
    public final void rule__Payload__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2436:1: ( rule__Payload__Group_0_1__1__Impl )
            // InternalMyDsl.g:2437:2: rule__Payload__Group_0_1__1__Impl
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
    // InternalMyDsl.g:2443:1: rule__Payload__Group_0_1__1__Impl : ( ( rule__Payload__Group_0_1_1__0 )* ) ;
    public final void rule__Payload__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( ( ( rule__Payload__Group_0_1_1__0 )* ) )
            // InternalMyDsl.g:2448:1: ( ( rule__Payload__Group_0_1_1__0 )* )
            {
            // InternalMyDsl.g:2448:1: ( ( rule__Payload__Group_0_1_1__0 )* )
            // InternalMyDsl.g:2449:2: ( rule__Payload__Group_0_1_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_0_1_1()); 
            // InternalMyDsl.g:2450:2: ( rule__Payload__Group_0_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2450:3: rule__Payload__Group_0_1_1__0
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
    // InternalMyDsl.g:2459:1: rule__Payload__Group_0_1_1__0 : rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1 ;
    public final void rule__Payload__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2463:1: ( rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1 )
            // InternalMyDsl.g:2464:2: rule__Payload__Group_0_1_1__0__Impl rule__Payload__Group_0_1_1__1
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
    // InternalMyDsl.g:2471:1: rule__Payload__Group_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2475:1: ( ( ',' ) )
            // InternalMyDsl.g:2476:1: ( ',' )
            {
            // InternalMyDsl.g:2476:1: ( ',' )
            // InternalMyDsl.g:2477:2: ','
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
    // InternalMyDsl.g:2486:1: rule__Payload__Group_0_1_1__1 : rule__Payload__Group_0_1_1__1__Impl ;
    public final void rule__Payload__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2490:1: ( rule__Payload__Group_0_1_1__1__Impl )
            // InternalMyDsl.g:2491:2: rule__Payload__Group_0_1_1__1__Impl
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
    // InternalMyDsl.g:2497:1: rule__Payload__Group_0_1_1__1__Impl : ( ( rule__Payload__TypesAssignment_0_1_1_1 ) ) ;
    public final void rule__Payload__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( ( ( rule__Payload__TypesAssignment_0_1_1_1 ) ) )
            // InternalMyDsl.g:2502:1: ( ( rule__Payload__TypesAssignment_0_1_1_1 ) )
            {
            // InternalMyDsl.g:2502:1: ( ( rule__Payload__TypesAssignment_0_1_1_1 ) )
            // InternalMyDsl.g:2503:2: ( rule__Payload__TypesAssignment_0_1_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_0_1_1_1()); 
            // InternalMyDsl.g:2504:2: ( rule__Payload__TypesAssignment_0_1_1_1 )
            // InternalMyDsl.g:2504:3: rule__Payload__TypesAssignment_0_1_1_1
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
    // InternalMyDsl.g:2513:1: rule__LocalProtocol__Group__0 : rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 ;
    public final void rule__LocalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2517:1: ( rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 )
            // InternalMyDsl.g:2518:2: rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1
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
    // InternalMyDsl.g:2525:1: rule__LocalProtocol__Group__0__Impl : ( 'local' ) ;
    public final void rule__LocalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2529:1: ( ( 'local' ) )
            // InternalMyDsl.g:2530:1: ( 'local' )
            {
            // InternalMyDsl.g:2530:1: ( 'local' )
            // InternalMyDsl.g:2531:2: 'local'
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
    // InternalMyDsl.g:2540:1: rule__LocalProtocol__Group__1 : rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 ;
    public final void rule__LocalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2544:1: ( rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 )
            // InternalMyDsl.g:2545:2: rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2
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
    // InternalMyDsl.g:2552:1: rule__LocalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__LocalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2556:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:2557:1: ( 'protocol' )
            {
            // InternalMyDsl.g:2557:1: ( 'protocol' )
            // InternalMyDsl.g:2558:2: 'protocol'
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
    // InternalMyDsl.g:2567:1: rule__LocalProtocol__Group__2 : rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 ;
    public final void rule__LocalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2571:1: ( rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 )
            // InternalMyDsl.g:2572:2: rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3
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
    // InternalMyDsl.g:2579:1: rule__LocalProtocol__Group__2__Impl : ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__LocalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2583:1: ( ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:2584:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:2584:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:2585:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:2586:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:2586:3: rule__LocalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:2594:1: rule__LocalProtocol__Group__3 : rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 ;
    public final void rule__LocalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2598:1: ( rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 )
            // InternalMyDsl.g:2599:2: rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4
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
    // InternalMyDsl.g:2606:1: rule__LocalProtocol__Group__3__Impl : ( 'at' ) ;
    public final void rule__LocalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2610:1: ( ( 'at' ) )
            // InternalMyDsl.g:2611:1: ( 'at' )
            {
            // InternalMyDsl.g:2611:1: ( 'at' )
            // InternalMyDsl.g:2612:2: 'at'
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
    // InternalMyDsl.g:2621:1: rule__LocalProtocol__Group__4 : rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 ;
    public final void rule__LocalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2625:1: ( rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 )
            // InternalMyDsl.g:2626:2: rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5
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
    // InternalMyDsl.g:2633:1: rule__LocalProtocol__Group__4__Impl : ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) ;
    public final void rule__LocalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2637:1: ( ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) ) )
            // InternalMyDsl.g:2638:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            {
            // InternalMyDsl.g:2638:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_4 ) )
            // InternalMyDsl.g:2639:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_4()); 
            // InternalMyDsl.g:2640:2: ( rule__LocalProtocol__ProjectedRoleAssignment_4 )
            // InternalMyDsl.g:2640:3: rule__LocalProtocol__ProjectedRoleAssignment_4
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
    // InternalMyDsl.g:2648:1: rule__LocalProtocol__Group__5 : rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 ;
    public final void rule__LocalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2652:1: ( rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 )
            // InternalMyDsl.g:2653:2: rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6
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
    // InternalMyDsl.g:2660:1: rule__LocalProtocol__Group__5__Impl : ( '(' ) ;
    public final void rule__LocalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2664:1: ( ( '(' ) )
            // InternalMyDsl.g:2665:1: ( '(' )
            {
            // InternalMyDsl.g:2665:1: ( '(' )
            // InternalMyDsl.g:2666:2: '('
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
    // InternalMyDsl.g:2675:1: rule__LocalProtocol__Group__6 : rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 ;
    public final void rule__LocalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2679:1: ( rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 )
            // InternalMyDsl.g:2680:2: rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7
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
    // InternalMyDsl.g:2687:1: rule__LocalProtocol__Group__6__Impl : ( ( rule__LocalProtocol__RolesAssignment_6 ) ) ;
    public final void rule__LocalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2691:1: ( ( ( rule__LocalProtocol__RolesAssignment_6 ) ) )
            // InternalMyDsl.g:2692:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            {
            // InternalMyDsl.g:2692:1: ( ( rule__LocalProtocol__RolesAssignment_6 ) )
            // InternalMyDsl.g:2693:2: ( rule__LocalProtocol__RolesAssignment_6 )
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesAssignment_6()); 
            // InternalMyDsl.g:2694:2: ( rule__LocalProtocol__RolesAssignment_6 )
            // InternalMyDsl.g:2694:3: rule__LocalProtocol__RolesAssignment_6
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
    // InternalMyDsl.g:2702:1: rule__LocalProtocol__Group__7 : rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 ;
    public final void rule__LocalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2706:1: ( rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 )
            // InternalMyDsl.g:2707:2: rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8
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
    // InternalMyDsl.g:2714:1: rule__LocalProtocol__Group__7__Impl : ( ')' ) ;
    public final void rule__LocalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2718:1: ( ( ')' ) )
            // InternalMyDsl.g:2719:1: ( ')' )
            {
            // InternalMyDsl.g:2719:1: ( ')' )
            // InternalMyDsl.g:2720:2: ')'
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
    // InternalMyDsl.g:2729:1: rule__LocalProtocol__Group__8 : rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 ;
    public final void rule__LocalProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2733:1: ( rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 )
            // InternalMyDsl.g:2734:2: rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9
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
    // InternalMyDsl.g:2741:1: rule__LocalProtocol__Group__8__Impl : ( '{' ) ;
    public final void rule__LocalProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2745:1: ( ( '{' ) )
            // InternalMyDsl.g:2746:1: ( '{' )
            {
            // InternalMyDsl.g:2746:1: ( '{' )
            // InternalMyDsl.g:2747:2: '{'
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
    // InternalMyDsl.g:2756:1: rule__LocalProtocol__Group__9 : rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 ;
    public final void rule__LocalProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2760:1: ( rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 )
            // InternalMyDsl.g:2761:2: rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10
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
    // InternalMyDsl.g:2768:1: rule__LocalProtocol__Group__9__Impl : ( ( rule__LocalProtocol__ProtocolAssignment_9 ) ) ;
    public final void rule__LocalProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2772:1: ( ( ( rule__LocalProtocol__ProtocolAssignment_9 ) ) )
            // InternalMyDsl.g:2773:1: ( ( rule__LocalProtocol__ProtocolAssignment_9 ) )
            {
            // InternalMyDsl.g:2773:1: ( ( rule__LocalProtocol__ProtocolAssignment_9 ) )
            // InternalMyDsl.g:2774:2: ( rule__LocalProtocol__ProtocolAssignment_9 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_9()); 
            // InternalMyDsl.g:2775:2: ( rule__LocalProtocol__ProtocolAssignment_9 )
            // InternalMyDsl.g:2775:3: rule__LocalProtocol__ProtocolAssignment_9
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
    // InternalMyDsl.g:2783:1: rule__LocalProtocol__Group__10 : rule__LocalProtocol__Group__10__Impl ;
    public final void rule__LocalProtocol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2787:1: ( rule__LocalProtocol__Group__10__Impl )
            // InternalMyDsl.g:2788:2: rule__LocalProtocol__Group__10__Impl
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
    // InternalMyDsl.g:2794:1: rule__LocalProtocol__Group__10__Impl : ( '}' ) ;
    public final void rule__LocalProtocol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( ( '}' ) )
            // InternalMyDsl.g:2799:1: ( '}' )
            {
            // InternalMyDsl.g:2799:1: ( '}' )
            // InternalMyDsl.g:2800:2: '}'
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


    // $ANTLR start "rule__RolesL__Group__0"
    // InternalMyDsl.g:2810:1: rule__RolesL__Group__0 : rule__RolesL__Group__0__Impl rule__RolesL__Group__1 ;
    public final void rule__RolesL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2814:1: ( rule__RolesL__Group__0__Impl rule__RolesL__Group__1 )
            // InternalMyDsl.g:2815:2: rule__RolesL__Group__0__Impl rule__RolesL__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RolesL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RolesL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolesL__Group__0"


    // $ANTLR start "rule__RolesL__Group__0__Impl"
    // InternalMyDsl.g:2822:1: rule__RolesL__Group__0__Impl : ( ( rule__RolesL__RolesAssignment_0 ) ) ;
    public final void rule__RolesL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2826:1: ( ( ( rule__RolesL__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:2827:1: ( ( rule__RolesL__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:2827:1: ( ( rule__RolesL__RolesAssignment_0 ) )
            // InternalMyDsl.g:2828:2: ( rule__RolesL__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesLAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:2829:2: ( rule__RolesL__RolesAssignment_0 )
            // InternalMyDsl.g:2829:3: rule__RolesL__RolesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RolesL__RolesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRolesLAccess().getRolesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolesL__Group__0__Impl"


    // $ANTLR start "rule__RolesL__Group__1"
    // InternalMyDsl.g:2837:1: rule__RolesL__Group__1 : rule__RolesL__Group__1__Impl ;
    public final void rule__RolesL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2841:1: ( rule__RolesL__Group__1__Impl )
            // InternalMyDsl.g:2842:2: rule__RolesL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RolesL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolesL__Group__1"


    // $ANTLR start "rule__RolesL__Group__1__Impl"
    // InternalMyDsl.g:2848:1: rule__RolesL__Group__1__Impl : ( ( rule__RolesL__Group_1__0 )* ) ;
    public final void rule__RolesL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2852:1: ( ( ( rule__RolesL__Group_1__0 )* ) )
            // InternalMyDsl.g:2853:1: ( ( rule__RolesL__Group_1__0 )* )
            {
            // InternalMyDsl.g:2853:1: ( ( rule__RolesL__Group_1__0 )* )
            // InternalMyDsl.g:2854:2: ( rule__RolesL__Group_1__0 )*
            {
             before(grammarAccess.getRolesLAccess().getGroup_1()); 
            // InternalMyDsl.g:2855:2: ( rule__RolesL__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2855:3: rule__RolesL__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RolesL__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRolesLAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolesL__Group__1__Impl"


    // $ANTLR start "rule__RolesL__Group_1__0"
    // InternalMyDsl.g:2864:1: rule__RolesL__Group_1__0 : rule__RolesL__Group_1__0__Impl rule__RolesL__Group_1__1 ;
    public final void rule__RolesL__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2868:1: ( rule__RolesL__Group_1__0__Impl rule__RolesL__Group_1__1 )
            // InternalMyDsl.g:2869:2: rule__RolesL__Group_1__0__Impl rule__RolesL__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__RolesL__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RolesL__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolesL__Group_1__0"


    // $ANTLR start "rule__RolesL__Group_1__0__Impl"
    // InternalMyDsl.g:2876:1: rule__RolesL__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RolesL__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2880:1: ( ( ',' ) )
            // InternalMyDsl.g:2881:1: ( ',' )
            {
            // InternalMyDsl.g:2881:1: ( ',' )
            // InternalMyDsl.g:2882:2: ','
            {
             before(grammarAccess.getRolesLAccess().getCommaKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRolesLAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolesL__Group_1__0__Impl"


    // $ANTLR start "rule__RolesL__Group_1__1"
    // InternalMyDsl.g:2891:1: rule__RolesL__Group_1__1 : rule__RolesL__Group_1__1__Impl ;
    public final void rule__RolesL__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2895:1: ( rule__RolesL__Group_1__1__Impl )
            // InternalMyDsl.g:2896:2: rule__RolesL__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RolesL__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolesL__Group_1__1"


    // $ANTLR start "rule__RolesL__Group_1__1__Impl"
    // InternalMyDsl.g:2902:1: rule__RolesL__Group_1__1__Impl : ( ( rule__RolesL__RolesAssignment_1_1 ) ) ;
    public final void rule__RolesL__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2906:1: ( ( ( rule__RolesL__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:2907:1: ( ( rule__RolesL__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2907:1: ( ( rule__RolesL__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:2908:2: ( rule__RolesL__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesLAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:2909:2: ( rule__RolesL__RolesAssignment_1_1 )
            // InternalMyDsl.g:2909:3: rule__RolesL__RolesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RolesL__RolesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRolesLAccess().getRolesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolesL__Group_1__1__Impl"


    // $ANTLR start "rule__RoleOneL__Group__0"
    // InternalMyDsl.g:2918:1: rule__RoleOneL__Group__0 : rule__RoleOneL__Group__0__Impl rule__RoleOneL__Group__1 ;
    public final void rule__RoleOneL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2922:1: ( rule__RoleOneL__Group__0__Impl rule__RoleOneL__Group__1 )
            // InternalMyDsl.g:2923:2: rule__RoleOneL__Group__0__Impl rule__RoleOneL__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RoleOneL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleOneL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleOneL__Group__0"


    // $ANTLR start "rule__RoleOneL__Group__0__Impl"
    // InternalMyDsl.g:2930:1: rule__RoleOneL__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOneL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2934:1: ( ( 'role' ) )
            // InternalMyDsl.g:2935:1: ( 'role' )
            {
            // InternalMyDsl.g:2935:1: ( 'role' )
            // InternalMyDsl.g:2936:2: 'role'
            {
             before(grammarAccess.getRoleOneLAccess().getRoleKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRoleOneLAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleOneL__Group__0__Impl"


    // $ANTLR start "rule__RoleOneL__Group__1"
    // InternalMyDsl.g:2945:1: rule__RoleOneL__Group__1 : rule__RoleOneL__Group__1__Impl ;
    public final void rule__RoleOneL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2949:1: ( rule__RoleOneL__Group__1__Impl )
            // InternalMyDsl.g:2950:2: rule__RoleOneL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleOneL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleOneL__Group__1"


    // $ANTLR start "rule__RoleOneL__Group__1__Impl"
    // InternalMyDsl.g:2956:1: rule__RoleOneL__Group__1__Impl : ( ( rule__RoleOneL__NameAssignment_1 ) ) ;
    public final void rule__RoleOneL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2960:1: ( ( ( rule__RoleOneL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2961:1: ( ( rule__RoleOneL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2961:1: ( ( rule__RoleOneL__NameAssignment_1 ) )
            // InternalMyDsl.g:2962:2: ( rule__RoleOneL__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2963:2: ( rule__RoleOneL__NameAssignment_1 )
            // InternalMyDsl.g:2963:3: rule__RoleOneL__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoleOneL__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleOneLAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleOneL__Group__1__Impl"


    // $ANTLR start "rule__RoleSetL__Group__0"
    // InternalMyDsl.g:2972:1: rule__RoleSetL__Group__0 : rule__RoleSetL__Group__0__Impl rule__RoleSetL__Group__1 ;
    public final void rule__RoleSetL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2976:1: ( rule__RoleSetL__Group__0__Impl rule__RoleSetL__Group__1 )
            // InternalMyDsl.g:2977:2: rule__RoleSetL__Group__0__Impl rule__RoleSetL__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RoleSetL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleSetL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSetL__Group__0"


    // $ANTLR start "rule__RoleSetL__Group__0__Impl"
    // InternalMyDsl.g:2984:1: rule__RoleSetL__Group__0__Impl : ( 'roleset' ) ;
    public final void rule__RoleSetL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2988:1: ( ( 'roleset' ) )
            // InternalMyDsl.g:2989:1: ( 'roleset' )
            {
            // InternalMyDsl.g:2989:1: ( 'roleset' )
            // InternalMyDsl.g:2990:2: 'roleset'
            {
             before(grammarAccess.getRoleSetLAccess().getRolesetKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRoleSetLAccess().getRolesetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSetL__Group__0__Impl"


    // $ANTLR start "rule__RoleSetL__Group__1"
    // InternalMyDsl.g:2999:1: rule__RoleSetL__Group__1 : rule__RoleSetL__Group__1__Impl rule__RoleSetL__Group__2 ;
    public final void rule__RoleSetL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3003:1: ( rule__RoleSetL__Group__1__Impl rule__RoleSetL__Group__2 )
            // InternalMyDsl.g:3004:2: rule__RoleSetL__Group__1__Impl rule__RoleSetL__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RoleSetL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleSetL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSetL__Group__1"


    // $ANTLR start "rule__RoleSetL__Group__1__Impl"
    // InternalMyDsl.g:3011:1: rule__RoleSetL__Group__1__Impl : ( ( rule__RoleSetL__NameAssignment_1 ) ) ;
    public final void rule__RoleSetL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3015:1: ( ( ( rule__RoleSetL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3016:1: ( ( rule__RoleSetL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3016:1: ( ( rule__RoleSetL__NameAssignment_1 ) )
            // InternalMyDsl.g:3017:2: ( rule__RoleSetL__NameAssignment_1 )
            {
             before(grammarAccess.getRoleSetLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3018:2: ( rule__RoleSetL__NameAssignment_1 )
            // InternalMyDsl.g:3018:3: rule__RoleSetL__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoleSetL__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleSetLAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSetL__Group__1__Impl"


    // $ANTLR start "rule__RoleSetL__Group__2"
    // InternalMyDsl.g:3026:1: rule__RoleSetL__Group__2 : rule__RoleSetL__Group__2__Impl rule__RoleSetL__Group__3 ;
    public final void rule__RoleSetL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3030:1: ( rule__RoleSetL__Group__2__Impl rule__RoleSetL__Group__3 )
            // InternalMyDsl.g:3031:2: rule__RoleSetL__Group__2__Impl rule__RoleSetL__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__RoleSetL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleSetL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSetL__Group__2"


    // $ANTLR start "rule__RoleSetL__Group__2__Impl"
    // InternalMyDsl.g:3038:1: rule__RoleSetL__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleSetL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3042:1: ( ( ':' ) )
            // InternalMyDsl.g:3043:1: ( ':' )
            {
            // InternalMyDsl.g:3043:1: ( ':' )
            // InternalMyDsl.g:3044:2: ':'
            {
             before(grammarAccess.getRoleSetLAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRoleSetLAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSetL__Group__2__Impl"


    // $ANTLR start "rule__RoleSetL__Group__3"
    // InternalMyDsl.g:3053:1: rule__RoleSetL__Group__3 : rule__RoleSetL__Group__3__Impl ;
    public final void rule__RoleSetL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3057:1: ( rule__RoleSetL__Group__3__Impl )
            // InternalMyDsl.g:3058:2: rule__RoleSetL__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleSetL__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSetL__Group__3"


    // $ANTLR start "rule__RoleSetL__Group__3__Impl"
    // InternalMyDsl.g:3064:1: rule__RoleSetL__Group__3__Impl : ( ( rule__RoleSetL__RefAssignment_3 ) ) ;
    public final void rule__RoleSetL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3068:1: ( ( ( rule__RoleSetL__RefAssignment_3 ) ) )
            // InternalMyDsl.g:3069:1: ( ( rule__RoleSetL__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:3069:1: ( ( rule__RoleSetL__RefAssignment_3 ) )
            // InternalMyDsl.g:3070:2: ( rule__RoleSetL__RefAssignment_3 )
            {
             before(grammarAccess.getRoleSetLAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:3071:2: ( rule__RoleSetL__RefAssignment_3 )
            // InternalMyDsl.g:3071:3: rule__RoleSetL__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RoleSetL__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleSetLAccess().getRefAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSetL__Group__3__Impl"


    // $ANTLR start "rule__ProtocolL__Group__0"
    // InternalMyDsl.g:3080:1: rule__ProtocolL__Group__0 : rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1 ;
    public final void rule__ProtocolL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3084:1: ( rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1 )
            // InternalMyDsl.g:3085:2: rule__ProtocolL__Group__0__Impl rule__ProtocolL__Group__1
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
    // InternalMyDsl.g:3092:1: rule__ProtocolL__Group__0__Impl : ( () ) ;
    public final void rule__ProtocolL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3096:1: ( ( () ) )
            // InternalMyDsl.g:3097:1: ( () )
            {
            // InternalMyDsl.g:3097:1: ( () )
            // InternalMyDsl.g:3098:2: ()
            {
             before(grammarAccess.getProtocolLAccess().getProtocolLAction_0()); 
            // InternalMyDsl.g:3099:2: ()
            // InternalMyDsl.g:3099:3: 
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
    // InternalMyDsl.g:3107:1: rule__ProtocolL__Group__1 : rule__ProtocolL__Group__1__Impl ;
    public final void rule__ProtocolL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3111:1: ( rule__ProtocolL__Group__1__Impl )
            // InternalMyDsl.g:3112:2: rule__ProtocolL__Group__1__Impl
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
    // InternalMyDsl.g:3118:1: rule__ProtocolL__Group__1__Impl : ( ( rule__ProtocolL__ActionsAssignment_1 )* ) ;
    public final void rule__ProtocolL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3122:1: ( ( ( rule__ProtocolL__ActionsAssignment_1 )* ) )
            // InternalMyDsl.g:3123:1: ( ( rule__ProtocolL__ActionsAssignment_1 )* )
            {
            // InternalMyDsl.g:3123:1: ( ( rule__ProtocolL__ActionsAssignment_1 )* )
            // InternalMyDsl.g:3124:2: ( rule__ProtocolL__ActionsAssignment_1 )*
            {
             before(grammarAccess.getProtocolLAccess().getActionsAssignment_1()); 
            // InternalMyDsl.g:3125:2: ( rule__ProtocolL__ActionsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=23 && LA14_0<=24)||LA14_0==26||LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:3125:3: rule__ProtocolL__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
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


    // $ANTLR start "rule__MessageL__Group__0"
    // InternalMyDsl.g:3134:1: rule__MessageL__Group__0 : rule__MessageL__Group__0__Impl rule__MessageL__Group__1 ;
    public final void rule__MessageL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3138:1: ( rule__MessageL__Group__0__Impl rule__MessageL__Group__1 )
            // InternalMyDsl.g:3139:2: rule__MessageL__Group__0__Impl rule__MessageL__Group__1
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
    // InternalMyDsl.g:3146:1: rule__MessageL__Group__0__Impl : ( ( rule__MessageL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3150:1: ( ( ( rule__MessageL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3151:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3151:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:3152:2: ( rule__MessageL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:3153:2: ( rule__MessageL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:3153:3: rule__MessageL__MessageTypeAssignment_0
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
    // InternalMyDsl.g:3161:1: rule__MessageL__Group__1 : rule__MessageL__Group__1__Impl rule__MessageL__Group__2 ;
    public final void rule__MessageL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3165:1: ( rule__MessageL__Group__1__Impl rule__MessageL__Group__2 )
            // InternalMyDsl.g:3166:2: rule__MessageL__Group__1__Impl rule__MessageL__Group__2
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
    // InternalMyDsl.g:3173:1: rule__MessageL__Group__1__Impl : ( '(' ) ;
    public final void rule__MessageL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3177:1: ( ( '(' ) )
            // InternalMyDsl.g:3178:1: ( '(' )
            {
            // InternalMyDsl.g:3178:1: ( '(' )
            // InternalMyDsl.g:3179:2: '('
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
    // InternalMyDsl.g:3188:1: rule__MessageL__Group__2 : rule__MessageL__Group__2__Impl rule__MessageL__Group__3 ;
    public final void rule__MessageL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3192:1: ( rule__MessageL__Group__2__Impl rule__MessageL__Group__3 )
            // InternalMyDsl.g:3193:2: rule__MessageL__Group__2__Impl rule__MessageL__Group__3
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
    // InternalMyDsl.g:3200:1: rule__MessageL__Group__2__Impl : ( ( rule__MessageL__PayloadAssignment_2 )? ) ;
    public final void rule__MessageL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3204:1: ( ( ( rule__MessageL__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:3205:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:3205:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            // InternalMyDsl.g:3206:2: ( rule__MessageL__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageLAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:3207:2: ( rule__MessageL__PayloadAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||(LA15_0>=11 && LA15_0<=13)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:3207:3: rule__MessageL__PayloadAssignment_2
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
    // InternalMyDsl.g:3215:1: rule__MessageL__Group__3 : rule__MessageL__Group__3__Impl rule__MessageL__Group__4 ;
    public final void rule__MessageL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3219:1: ( rule__MessageL__Group__3__Impl rule__MessageL__Group__4 )
            // InternalMyDsl.g:3220:2: rule__MessageL__Group__3__Impl rule__MessageL__Group__4
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
    // InternalMyDsl.g:3227:1: rule__MessageL__Group__3__Impl : ( ')' ) ;
    public final void rule__MessageL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3231:1: ( ( ')' ) )
            // InternalMyDsl.g:3232:1: ( ')' )
            {
            // InternalMyDsl.g:3232:1: ( ')' )
            // InternalMyDsl.g:3233:2: ')'
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
    // InternalMyDsl.g:3242:1: rule__MessageL__Group__4 : rule__MessageL__Group__4__Impl rule__MessageL__Group__5 ;
    public final void rule__MessageL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3246:1: ( rule__MessageL__Group__4__Impl rule__MessageL__Group__5 )
            // InternalMyDsl.g:3247:2: rule__MessageL__Group__4__Impl rule__MessageL__Group__5
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
    // InternalMyDsl.g:3254:1: rule__MessageL__Group__4__Impl : ( ( rule__MessageL__TargetAssignment_4 )? ) ;
    public final void rule__MessageL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3258:1: ( ( ( rule__MessageL__TargetAssignment_4 )? ) )
            // InternalMyDsl.g:3259:1: ( ( rule__MessageL__TargetAssignment_4 )? )
            {
            // InternalMyDsl.g:3259:1: ( ( rule__MessageL__TargetAssignment_4 )? )
            // InternalMyDsl.g:3260:2: ( rule__MessageL__TargetAssignment_4 )?
            {
             before(grammarAccess.getMessageLAccess().getTargetAssignment_4()); 
            // InternalMyDsl.g:3261:2: ( rule__MessageL__TargetAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:3261:3: rule__MessageL__TargetAssignment_4
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
    // InternalMyDsl.g:3269:1: rule__MessageL__Group__5 : rule__MessageL__Group__5__Impl rule__MessageL__Group__6 ;
    public final void rule__MessageL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3273:1: ( rule__MessageL__Group__5__Impl rule__MessageL__Group__6 )
            // InternalMyDsl.g:3274:2: rule__MessageL__Group__5__Impl rule__MessageL__Group__6
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
    // InternalMyDsl.g:3281:1: rule__MessageL__Group__5__Impl : ( ( rule__MessageL__TargetAssignment_5 )? ) ;
    public final void rule__MessageL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3285:1: ( ( ( rule__MessageL__TargetAssignment_5 )? ) )
            // InternalMyDsl.g:3286:1: ( ( rule__MessageL__TargetAssignment_5 )? )
            {
            // InternalMyDsl.g:3286:1: ( ( rule__MessageL__TargetAssignment_5 )? )
            // InternalMyDsl.g:3287:2: ( rule__MessageL__TargetAssignment_5 )?
            {
             before(grammarAccess.getMessageLAccess().getTargetAssignment_5()); 
            // InternalMyDsl.g:3288:2: ( rule__MessageL__TargetAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:3288:3: rule__MessageL__TargetAssignment_5
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
    // InternalMyDsl.g:3296:1: rule__MessageL__Group__6 : rule__MessageL__Group__6__Impl ;
    public final void rule__MessageL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3300:1: ( rule__MessageL__Group__6__Impl )
            // InternalMyDsl.g:3301:2: rule__MessageL__Group__6__Impl
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
    // InternalMyDsl.g:3307:1: rule__MessageL__Group__6__Impl : ( ';' ) ;
    public final void rule__MessageL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3311:1: ( ( ';' ) )
            // InternalMyDsl.g:3312:1: ( ';' )
            {
            // InternalMyDsl.g:3312:1: ( ';' )
            // InternalMyDsl.g:3313:2: ';'
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
    // InternalMyDsl.g:3323:1: rule__SenderL__Group__0 : rule__SenderL__Group__0__Impl rule__SenderL__Group__1 ;
    public final void rule__SenderL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3327:1: ( rule__SenderL__Group__0__Impl rule__SenderL__Group__1 )
            // InternalMyDsl.g:3328:2: rule__SenderL__Group__0__Impl rule__SenderL__Group__1
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
    // InternalMyDsl.g:3335:1: rule__SenderL__Group__0__Impl : ( 'from' ) ;
    public final void rule__SenderL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3339:1: ( ( 'from' ) )
            // InternalMyDsl.g:3340:1: ( 'from' )
            {
            // InternalMyDsl.g:3340:1: ( 'from' )
            // InternalMyDsl.g:3341:2: 'from'
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
    // InternalMyDsl.g:3350:1: rule__SenderL__Group__1 : rule__SenderL__Group__1__Impl ;
    public final void rule__SenderL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3354:1: ( rule__SenderL__Group__1__Impl )
            // InternalMyDsl.g:3355:2: rule__SenderL__Group__1__Impl
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
    // InternalMyDsl.g:3361:1: rule__SenderL__Group__1__Impl : ( ( rule__SenderL__SenderAssignment_1 ) ) ;
    public final void rule__SenderL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3365:1: ( ( ( rule__SenderL__SenderAssignment_1 ) ) )
            // InternalMyDsl.g:3366:1: ( ( rule__SenderL__SenderAssignment_1 ) )
            {
            // InternalMyDsl.g:3366:1: ( ( rule__SenderL__SenderAssignment_1 ) )
            // InternalMyDsl.g:3367:2: ( rule__SenderL__SenderAssignment_1 )
            {
             before(grammarAccess.getSenderLAccess().getSenderAssignment_1()); 
            // InternalMyDsl.g:3368:2: ( rule__SenderL__SenderAssignment_1 )
            // InternalMyDsl.g:3368:3: rule__SenderL__SenderAssignment_1
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
    // InternalMyDsl.g:3377:1: rule__ReceiverL__Group__0 : rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 ;
    public final void rule__ReceiverL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3381:1: ( rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 )
            // InternalMyDsl.g:3382:2: rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1
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
    // InternalMyDsl.g:3389:1: rule__ReceiverL__Group__0__Impl : ( 'to' ) ;
    public final void rule__ReceiverL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3393:1: ( ( 'to' ) )
            // InternalMyDsl.g:3394:1: ( 'to' )
            {
            // InternalMyDsl.g:3394:1: ( 'to' )
            // InternalMyDsl.g:3395:2: 'to'
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
    // InternalMyDsl.g:3404:1: rule__ReceiverL__Group__1 : rule__ReceiverL__Group__1__Impl ;
    public final void rule__ReceiverL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3408:1: ( rule__ReceiverL__Group__1__Impl )
            // InternalMyDsl.g:3409:2: rule__ReceiverL__Group__1__Impl
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
    // InternalMyDsl.g:3415:1: rule__ReceiverL__Group__1__Impl : ( ( rule__ReceiverL__ToAssignment_1 ) ) ;
    public final void rule__ReceiverL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3419:1: ( ( ( rule__ReceiverL__ToAssignment_1 ) ) )
            // InternalMyDsl.g:3420:1: ( ( rule__ReceiverL__ToAssignment_1 ) )
            {
            // InternalMyDsl.g:3420:1: ( ( rule__ReceiverL__ToAssignment_1 ) )
            // InternalMyDsl.g:3421:2: ( rule__ReceiverL__ToAssignment_1 )
            {
             before(grammarAccess.getReceiverLAccess().getToAssignment_1()); 
            // InternalMyDsl.g:3422:2: ( rule__ReceiverL__ToAssignment_1 )
            // InternalMyDsl.g:3422:3: rule__ReceiverL__ToAssignment_1
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
    // InternalMyDsl.g:3431:1: rule__ChoiceL__Group__0 : rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 ;
    public final void rule__ChoiceL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3435:1: ( rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 )
            // InternalMyDsl.g:3436:2: rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1
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
    // InternalMyDsl.g:3443:1: rule__ChoiceL__Group__0__Impl : ( 'choice' ) ;
    public final void rule__ChoiceL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3447:1: ( ( 'choice' ) )
            // InternalMyDsl.g:3448:1: ( 'choice' )
            {
            // InternalMyDsl.g:3448:1: ( 'choice' )
            // InternalMyDsl.g:3449:2: 'choice'
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
    // InternalMyDsl.g:3458:1: rule__ChoiceL__Group__1 : rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 ;
    public final void rule__ChoiceL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3462:1: ( rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 )
            // InternalMyDsl.g:3463:2: rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2
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
    // InternalMyDsl.g:3470:1: rule__ChoiceL__Group__1__Impl : ( 'at' ) ;
    public final void rule__ChoiceL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3474:1: ( ( 'at' ) )
            // InternalMyDsl.g:3475:1: ( 'at' )
            {
            // InternalMyDsl.g:3475:1: ( 'at' )
            // InternalMyDsl.g:3476:2: 'at'
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
    // InternalMyDsl.g:3485:1: rule__ChoiceL__Group__2 : rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 ;
    public final void rule__ChoiceL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3489:1: ( rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 )
            // InternalMyDsl.g:3490:2: rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3
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
    // InternalMyDsl.g:3497:1: rule__ChoiceL__Group__2__Impl : ( ( rule__ChoiceL__RoleAssignment_2 ) ) ;
    public final void rule__ChoiceL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3501:1: ( ( ( rule__ChoiceL__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:3502:1: ( ( rule__ChoiceL__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:3502:1: ( ( rule__ChoiceL__RoleAssignment_2 ) )
            // InternalMyDsl.g:3503:2: ( rule__ChoiceL__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceLAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:3504:2: ( rule__ChoiceL__RoleAssignment_2 )
            // InternalMyDsl.g:3504:3: rule__ChoiceL__RoleAssignment_2
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
    // InternalMyDsl.g:3512:1: rule__ChoiceL__Group__3 : rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 ;
    public final void rule__ChoiceL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3516:1: ( rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 )
            // InternalMyDsl.g:3517:2: rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4
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
    // InternalMyDsl.g:3524:1: rule__ChoiceL__Group__3__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3528:1: ( ( '{' ) )
            // InternalMyDsl.g:3529:1: ( '{' )
            {
            // InternalMyDsl.g:3529:1: ( '{' )
            // InternalMyDsl.g:3530:2: '{'
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
    // InternalMyDsl.g:3539:1: rule__ChoiceL__Group__4 : rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 ;
    public final void rule__ChoiceL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3543:1: ( rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 )
            // InternalMyDsl.g:3544:2: rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5
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
    // InternalMyDsl.g:3551:1: rule__ChoiceL__Group__4__Impl : ( ( rule__ChoiceL__MessageAssignment_4 ) ) ;
    public final void rule__ChoiceL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3555:1: ( ( ( rule__ChoiceL__MessageAssignment_4 ) ) )
            // InternalMyDsl.g:3556:1: ( ( rule__ChoiceL__MessageAssignment_4 ) )
            {
            // InternalMyDsl.g:3556:1: ( ( rule__ChoiceL__MessageAssignment_4 ) )
            // InternalMyDsl.g:3557:2: ( rule__ChoiceL__MessageAssignment_4 )
            {
             before(grammarAccess.getChoiceLAccess().getMessageAssignment_4()); 
            // InternalMyDsl.g:3558:2: ( rule__ChoiceL__MessageAssignment_4 )
            // InternalMyDsl.g:3558:3: rule__ChoiceL__MessageAssignment_4
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
    // InternalMyDsl.g:3566:1: rule__ChoiceL__Group__5 : rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 ;
    public final void rule__ChoiceL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3570:1: ( rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 )
            // InternalMyDsl.g:3571:2: rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6
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
    // InternalMyDsl.g:3578:1: rule__ChoiceL__Group__5__Impl : ( ( rule__ChoiceL__BranchesAssignment_5 ) ) ;
    public final void rule__ChoiceL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3582:1: ( ( ( rule__ChoiceL__BranchesAssignment_5 ) ) )
            // InternalMyDsl.g:3583:1: ( ( rule__ChoiceL__BranchesAssignment_5 ) )
            {
            // InternalMyDsl.g:3583:1: ( ( rule__ChoiceL__BranchesAssignment_5 ) )
            // InternalMyDsl.g:3584:2: ( rule__ChoiceL__BranchesAssignment_5 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_5()); 
            // InternalMyDsl.g:3585:2: ( rule__ChoiceL__BranchesAssignment_5 )
            // InternalMyDsl.g:3585:3: rule__ChoiceL__BranchesAssignment_5
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
    // InternalMyDsl.g:3593:1: rule__ChoiceL__Group__6 : rule__ChoiceL__Group__6__Impl rule__ChoiceL__Group__7 ;
    public final void rule__ChoiceL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3597:1: ( rule__ChoiceL__Group__6__Impl rule__ChoiceL__Group__7 )
            // InternalMyDsl.g:3598:2: rule__ChoiceL__Group__6__Impl rule__ChoiceL__Group__7
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
    // InternalMyDsl.g:3605:1: rule__ChoiceL__Group__6__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3609:1: ( ( '}' ) )
            // InternalMyDsl.g:3610:1: ( '}' )
            {
            // InternalMyDsl.g:3610:1: ( '}' )
            // InternalMyDsl.g:3611:2: '}'
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
    // InternalMyDsl.g:3620:1: rule__ChoiceL__Group__7 : rule__ChoiceL__Group__7__Impl ;
    public final void rule__ChoiceL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3624:1: ( rule__ChoiceL__Group__7__Impl )
            // InternalMyDsl.g:3625:2: rule__ChoiceL__Group__7__Impl
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
    // InternalMyDsl.g:3631:1: rule__ChoiceL__Group__7__Impl : ( ( rule__ChoiceL__Group_7__0 )* ) ;
    public final void rule__ChoiceL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3635:1: ( ( ( rule__ChoiceL__Group_7__0 )* ) )
            // InternalMyDsl.g:3636:1: ( ( rule__ChoiceL__Group_7__0 )* )
            {
            // InternalMyDsl.g:3636:1: ( ( rule__ChoiceL__Group_7__0 )* )
            // InternalMyDsl.g:3637:2: ( rule__ChoiceL__Group_7__0 )*
            {
             before(grammarAccess.getChoiceLAccess().getGroup_7()); 
            // InternalMyDsl.g:3638:2: ( rule__ChoiceL__Group_7__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:3638:3: rule__ChoiceL__Group_7__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ChoiceL__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:3647:1: rule__ChoiceL__Group_7__0 : rule__ChoiceL__Group_7__0__Impl rule__ChoiceL__Group_7__1 ;
    public final void rule__ChoiceL__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3651:1: ( rule__ChoiceL__Group_7__0__Impl rule__ChoiceL__Group_7__1 )
            // InternalMyDsl.g:3652:2: rule__ChoiceL__Group_7__0__Impl rule__ChoiceL__Group_7__1
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
    // InternalMyDsl.g:3659:1: rule__ChoiceL__Group_7__0__Impl : ( 'or' ) ;
    public final void rule__ChoiceL__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3663:1: ( ( 'or' ) )
            // InternalMyDsl.g:3664:1: ( 'or' )
            {
            // InternalMyDsl.g:3664:1: ( 'or' )
            // InternalMyDsl.g:3665:2: 'or'
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
    // InternalMyDsl.g:3674:1: rule__ChoiceL__Group_7__1 : rule__ChoiceL__Group_7__1__Impl rule__ChoiceL__Group_7__2 ;
    public final void rule__ChoiceL__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3678:1: ( rule__ChoiceL__Group_7__1__Impl rule__ChoiceL__Group_7__2 )
            // InternalMyDsl.g:3679:2: rule__ChoiceL__Group_7__1__Impl rule__ChoiceL__Group_7__2
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
    // InternalMyDsl.g:3686:1: rule__ChoiceL__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3690:1: ( ( '{' ) )
            // InternalMyDsl.g:3691:1: ( '{' )
            {
            // InternalMyDsl.g:3691:1: ( '{' )
            // InternalMyDsl.g:3692:2: '{'
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
    // InternalMyDsl.g:3701:1: rule__ChoiceL__Group_7__2 : rule__ChoiceL__Group_7__2__Impl rule__ChoiceL__Group_7__3 ;
    public final void rule__ChoiceL__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3705:1: ( rule__ChoiceL__Group_7__2__Impl rule__ChoiceL__Group_7__3 )
            // InternalMyDsl.g:3706:2: rule__ChoiceL__Group_7__2__Impl rule__ChoiceL__Group_7__3
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
    // InternalMyDsl.g:3713:1: rule__ChoiceL__Group_7__2__Impl : ( ( rule__ChoiceL__MessageAssignment_7_2 ) ) ;
    public final void rule__ChoiceL__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3717:1: ( ( ( rule__ChoiceL__MessageAssignment_7_2 ) ) )
            // InternalMyDsl.g:3718:1: ( ( rule__ChoiceL__MessageAssignment_7_2 ) )
            {
            // InternalMyDsl.g:3718:1: ( ( rule__ChoiceL__MessageAssignment_7_2 ) )
            // InternalMyDsl.g:3719:2: ( rule__ChoiceL__MessageAssignment_7_2 )
            {
             before(grammarAccess.getChoiceLAccess().getMessageAssignment_7_2()); 
            // InternalMyDsl.g:3720:2: ( rule__ChoiceL__MessageAssignment_7_2 )
            // InternalMyDsl.g:3720:3: rule__ChoiceL__MessageAssignment_7_2
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
    // InternalMyDsl.g:3728:1: rule__ChoiceL__Group_7__3 : rule__ChoiceL__Group_7__3__Impl rule__ChoiceL__Group_7__4 ;
    public final void rule__ChoiceL__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3732:1: ( rule__ChoiceL__Group_7__3__Impl rule__ChoiceL__Group_7__4 )
            // InternalMyDsl.g:3733:2: rule__ChoiceL__Group_7__3__Impl rule__ChoiceL__Group_7__4
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
    // InternalMyDsl.g:3740:1: rule__ChoiceL__Group_7__3__Impl : ( ( rule__ChoiceL__BranchesAssignment_7_3 ) ) ;
    public final void rule__ChoiceL__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3744:1: ( ( ( rule__ChoiceL__BranchesAssignment_7_3 ) ) )
            // InternalMyDsl.g:3745:1: ( ( rule__ChoiceL__BranchesAssignment_7_3 ) )
            {
            // InternalMyDsl.g:3745:1: ( ( rule__ChoiceL__BranchesAssignment_7_3 ) )
            // InternalMyDsl.g:3746:2: ( rule__ChoiceL__BranchesAssignment_7_3 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_7_3()); 
            // InternalMyDsl.g:3747:2: ( rule__ChoiceL__BranchesAssignment_7_3 )
            // InternalMyDsl.g:3747:3: rule__ChoiceL__BranchesAssignment_7_3
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
    // InternalMyDsl.g:3755:1: rule__ChoiceL__Group_7__4 : rule__ChoiceL__Group_7__4__Impl ;
    public final void rule__ChoiceL__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3759:1: ( rule__ChoiceL__Group_7__4__Impl )
            // InternalMyDsl.g:3760:2: rule__ChoiceL__Group_7__4__Impl
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
    // InternalMyDsl.g:3766:1: rule__ChoiceL__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3770:1: ( ( '}' ) )
            // InternalMyDsl.g:3771:1: ( '}' )
            {
            // InternalMyDsl.g:3771:1: ( '}' )
            // InternalMyDsl.g:3772:2: '}'
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
    // InternalMyDsl.g:3782:1: rule__ForEachL__Group__0 : rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 ;
    public final void rule__ForEachL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3786:1: ( rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1 )
            // InternalMyDsl.g:3787:2: rule__ForEachL__Group__0__Impl rule__ForEachL__Group__1
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
    // InternalMyDsl.g:3794:1: rule__ForEachL__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEachL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3798:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:3799:1: ( 'foreach' )
            {
            // InternalMyDsl.g:3799:1: ( 'foreach' )
            // InternalMyDsl.g:3800:2: 'foreach'
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
    // InternalMyDsl.g:3809:1: rule__ForEachL__Group__1 : rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 ;
    public final void rule__ForEachL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3813:1: ( rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2 )
            // InternalMyDsl.g:3814:2: rule__ForEachL__Group__1__Impl rule__ForEachL__Group__2
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
    // InternalMyDsl.g:3821:1: rule__ForEachL__Group__1__Impl : ( ( rule__ForEachL__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEachL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3825:1: ( ( ( rule__ForEachL__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:3826:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:3826:1: ( ( rule__ForEachL__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:3827:2: ( rule__ForEachL__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachLAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:3828:2: ( rule__ForEachL__EachRoleAssignment_1 )
            // InternalMyDsl.g:3828:3: rule__ForEachL__EachRoleAssignment_1
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
    // InternalMyDsl.g:3836:1: rule__ForEachL__Group__2 : rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 ;
    public final void rule__ForEachL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3840:1: ( rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3 )
            // InternalMyDsl.g:3841:2: rule__ForEachL__Group__2__Impl rule__ForEachL__Group__3
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
    // InternalMyDsl.g:3848:1: rule__ForEachL__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEachL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3852:1: ( ( ':' ) )
            // InternalMyDsl.g:3853:1: ( ':' )
            {
            // InternalMyDsl.g:3853:1: ( ':' )
            // InternalMyDsl.g:3854:2: ':'
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
    // InternalMyDsl.g:3863:1: rule__ForEachL__Group__3 : rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 ;
    public final void rule__ForEachL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3867:1: ( rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4 )
            // InternalMyDsl.g:3868:2: rule__ForEachL__Group__3__Impl rule__ForEachL__Group__4
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
    // InternalMyDsl.g:3875:1: rule__ForEachL__Group__3__Impl : ( ( rule__ForEachL__RoleAssignment_3 ) ) ;
    public final void rule__ForEachL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3879:1: ( ( ( rule__ForEachL__RoleAssignment_3 ) ) )
            // InternalMyDsl.g:3880:1: ( ( rule__ForEachL__RoleAssignment_3 ) )
            {
            // InternalMyDsl.g:3880:1: ( ( rule__ForEachL__RoleAssignment_3 ) )
            // InternalMyDsl.g:3881:2: ( rule__ForEachL__RoleAssignment_3 )
            {
             before(grammarAccess.getForEachLAccess().getRoleAssignment_3()); 
            // InternalMyDsl.g:3882:2: ( rule__ForEachL__RoleAssignment_3 )
            // InternalMyDsl.g:3882:3: rule__ForEachL__RoleAssignment_3
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
    // InternalMyDsl.g:3890:1: rule__ForEachL__Group__4 : rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 ;
    public final void rule__ForEachL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3894:1: ( rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5 )
            // InternalMyDsl.g:3895:2: rule__ForEachL__Group__4__Impl rule__ForEachL__Group__5
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
    // InternalMyDsl.g:3902:1: rule__ForEachL__Group__4__Impl : ( '{' ) ;
    public final void rule__ForEachL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3906:1: ( ( '{' ) )
            // InternalMyDsl.g:3907:1: ( '{' )
            {
            // InternalMyDsl.g:3907:1: ( '{' )
            // InternalMyDsl.g:3908:2: '{'
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
    // InternalMyDsl.g:3917:1: rule__ForEachL__Group__5 : rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 ;
    public final void rule__ForEachL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3921:1: ( rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6 )
            // InternalMyDsl.g:3922:2: rule__ForEachL__Group__5__Impl rule__ForEachL__Group__6
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
    // InternalMyDsl.g:3929:1: rule__ForEachL__Group__5__Impl : ( ( rule__ForEachL__BranchAssignment_5 ) ) ;
    public final void rule__ForEachL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3933:1: ( ( ( rule__ForEachL__BranchAssignment_5 ) ) )
            // InternalMyDsl.g:3934:1: ( ( rule__ForEachL__BranchAssignment_5 ) )
            {
            // InternalMyDsl.g:3934:1: ( ( rule__ForEachL__BranchAssignment_5 ) )
            // InternalMyDsl.g:3935:2: ( rule__ForEachL__BranchAssignment_5 )
            {
             before(grammarAccess.getForEachLAccess().getBranchAssignment_5()); 
            // InternalMyDsl.g:3936:2: ( rule__ForEachL__BranchAssignment_5 )
            // InternalMyDsl.g:3936:3: rule__ForEachL__BranchAssignment_5
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
    // InternalMyDsl.g:3944:1: rule__ForEachL__Group__6 : rule__ForEachL__Group__6__Impl ;
    public final void rule__ForEachL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3948:1: ( rule__ForEachL__Group__6__Impl )
            // InternalMyDsl.g:3949:2: rule__ForEachL__Group__6__Impl
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
    // InternalMyDsl.g:3955:1: rule__ForEachL__Group__6__Impl : ( '}' ) ;
    public final void rule__ForEachL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3959:1: ( ( '}' ) )
            // InternalMyDsl.g:3960:1: ( '}' )
            {
            // InternalMyDsl.g:3960:1: ( '}' )
            // InternalMyDsl.g:3961:2: '}'
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
    // InternalMyDsl.g:3971:1: rule__Model__ProtocolAssignment_0 : ( ruleGlobalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3975:1: ( ( ruleGlobalProtocol ) )
            // InternalMyDsl.g:3976:2: ( ruleGlobalProtocol )
            {
            // InternalMyDsl.g:3976:2: ( ruleGlobalProtocol )
            // InternalMyDsl.g:3977:3: ruleGlobalProtocol
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
    // InternalMyDsl.g:3986:1: rule__Model__ProtocolAssignment_1 : ( ruleLocalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3990:1: ( ( ruleLocalProtocol ) )
            // InternalMyDsl.g:3991:2: ( ruleLocalProtocol )
            {
            // InternalMyDsl.g:3991:2: ( ruleLocalProtocol )
            // InternalMyDsl.g:3992:3: ruleLocalProtocol
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
    // InternalMyDsl.g:4001:1: rule__GlobalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4005:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4006:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4006:2: ( RULE_ID )
            // InternalMyDsl.g:4007:3: RULE_ID
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
    // InternalMyDsl.g:4016:1: rule__GlobalProtocol__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__GlobalProtocol__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4020:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:4021:2: ( ruleRoles )
            {
            // InternalMyDsl.g:4021:2: ( ruleRoles )
            // InternalMyDsl.g:4022:3: ruleRoles
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
    // InternalMyDsl.g:4031:1: rule__GlobalProtocol__ProtocolAssignment_6 : ( ruleProtocol ) ;
    public final void rule__GlobalProtocol__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4035:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4036:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4036:2: ( ruleProtocol )
            // InternalMyDsl.g:4037:3: ruleProtocol
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
    // InternalMyDsl.g:4046:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4050:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4051:2: ( ruleRole )
            {
            // InternalMyDsl.g:4051:2: ( ruleRole )
            // InternalMyDsl.g:4052:3: ruleRole
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
    // InternalMyDsl.g:4061:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4065:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4066:2: ( ruleRole )
            {
            // InternalMyDsl.g:4066:2: ( ruleRole )
            // InternalMyDsl.g:4067:3: ruleRole
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
    // InternalMyDsl.g:4076:1: rule__RoleOne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4080:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4081:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4081:2: ( RULE_ID )
            // InternalMyDsl.g:4082:3: RULE_ID
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
    // InternalMyDsl.g:4091:1: rule__RoleSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4095:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4096:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4096:2: ( RULE_ID )
            // InternalMyDsl.g:4097:3: RULE_ID
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
    // InternalMyDsl.g:4106:1: rule__RoleSet__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RoleSet__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4110:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4111:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4111:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4112:3: ( RULE_ID )
            {
             before(grammarAccess.getRoleSetAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4113:3: ( RULE_ID )
            // InternalMyDsl.g:4114:4: RULE_ID
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
    // InternalMyDsl.g:4125:1: rule__Protocol__ActionsAssignment_1 : ( ( rule__Protocol__ActionsAlternatives_1_0 ) ) ;
    public final void rule__Protocol__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4129:1: ( ( ( rule__Protocol__ActionsAlternatives_1_0 ) ) )
            // InternalMyDsl.g:4130:2: ( ( rule__Protocol__ActionsAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:4130:2: ( ( rule__Protocol__ActionsAlternatives_1_0 ) )
            // InternalMyDsl.g:4131:3: ( rule__Protocol__ActionsAlternatives_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getActionsAlternatives_1_0()); 
            // InternalMyDsl.g:4132:3: ( rule__Protocol__ActionsAlternatives_1_0 )
            // InternalMyDsl.g:4132:4: rule__Protocol__ActionsAlternatives_1_0
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
    // InternalMyDsl.g:4140:1: rule__Recursion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4144:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4145:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4145:2: ( RULE_ID )
            // InternalMyDsl.g:4146:3: RULE_ID
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
    // InternalMyDsl.g:4155:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4159:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4160:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4160:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4161:3: ( RULE_ID )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalMyDsl.g:4162:3: ( RULE_ID )
            // InternalMyDsl.g:4163:4: RULE_ID
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
    // InternalMyDsl.g:4174:1: rule__ForEach__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEach__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4178:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:4179:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:4179:2: ( ruleRoleOne )
            // InternalMyDsl.g:4180:3: ruleRoleOne
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
    // InternalMyDsl.g:4189:1: rule__ForEach__RoleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4193:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4194:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4194:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4195:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getRoleRoleSetCrossReference_3_0()); 
            // InternalMyDsl.g:4196:3: ( RULE_ID )
            // InternalMyDsl.g:4197:4: RULE_ID
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
    // InternalMyDsl.g:4208:1: rule__ForEach__BranchAssignment_5 : ( ruleProtocol ) ;
    public final void rule__ForEach__BranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4212:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4213:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4213:2: ( ruleProtocol )
            // InternalMyDsl.g:4214:3: ruleProtocol
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
    // InternalMyDsl.g:4223:1: rule__Choice__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4227:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4228:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4228:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4229:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 
            // InternalMyDsl.g:4230:3: ( RULE_ID )
            // InternalMyDsl.g:4231:4: RULE_ID
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
    // InternalMyDsl.g:4242:1: rule__Choice__MessageAssignment_4 : ( ruleMessage ) ;
    public final void rule__Choice__MessageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4246:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4247:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4247:2: ( ruleMessage )
            // InternalMyDsl.g:4248:3: ruleMessage
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
    // InternalMyDsl.g:4257:1: rule__Choice__BranchesAssignment_5 : ( ruleProtocol ) ;
    public final void rule__Choice__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4261:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4262:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4262:2: ( ruleProtocol )
            // InternalMyDsl.g:4263:3: ruleProtocol
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
    // InternalMyDsl.g:4272:1: rule__Choice__MessageAssignment_7_2 : ( ruleMessage ) ;
    public final void rule__Choice__MessageAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4276:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4277:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4277:2: ( ruleMessage )
            // InternalMyDsl.g:4278:3: ruleMessage
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
    // InternalMyDsl.g:4287:1: rule__Choice__BranchesAssignment_7_3 : ( ruleProtocol ) ;
    public final void rule__Choice__BranchesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4291:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4292:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4292:2: ( ruleProtocol )
            // InternalMyDsl.g:4293:3: ruleProtocol
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
    // InternalMyDsl.g:4302:1: rule__Message__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4306:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4307:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4307:2: ( RULE_ID )
            // InternalMyDsl.g:4308:3: RULE_ID
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
    // InternalMyDsl.g:4317:1: rule__Message__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__Message__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4321:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4322:2: ( rulePayload )
            {
            // InternalMyDsl.g:4322:2: ( rulePayload )
            // InternalMyDsl.g:4323:3: rulePayload
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
    // InternalMyDsl.g:4332:1: rule__Message__SenderAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4336:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4337:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4337:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4338:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0()); 
            // InternalMyDsl.g:4339:3: ( RULE_ID )
            // InternalMyDsl.g:4340:4: RULE_ID
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
    // InternalMyDsl.g:4351:1: rule__Message__ReceiverAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4355:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4356:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4356:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4357:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleOneCrossReference_7_0()); 
            // InternalMyDsl.g:4358:3: ( RULE_ID )
            // InternalMyDsl.g:4359:4: RULE_ID
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
    // InternalMyDsl.g:4370:1: rule__Payload__TypesAssignment_0_1_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4374:1: ( ( ruleType ) )
            // InternalMyDsl.g:4375:2: ( ruleType )
            {
            // InternalMyDsl.g:4375:2: ( ruleType )
            // InternalMyDsl.g:4376:3: ruleType
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
    // InternalMyDsl.g:4385:1: rule__Payload__TypesAssignment_0_1_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4389:1: ( ( ruleType ) )
            // InternalMyDsl.g:4390:2: ( ruleType )
            {
            // InternalMyDsl.g:4390:2: ( ruleType )
            // InternalMyDsl.g:4391:3: ruleType
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
    // InternalMyDsl.g:4400:1: rule__Payload__TypesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Payload__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4404:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4405:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4405:2: ( RULE_ID )
            // InternalMyDsl.g:4406:3: RULE_ID
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
    // InternalMyDsl.g:4415:1: rule__LocalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4419:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4420:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4420:2: ( RULE_ID )
            // InternalMyDsl.g:4421:3: RULE_ID
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
    // InternalMyDsl.g:4430:1: rule__LocalProtocol__ProjectedRoleAssignment_4 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProjectedRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4434:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4435:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4435:2: ( RULE_ID )
            // InternalMyDsl.g:4436:3: RULE_ID
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
    // InternalMyDsl.g:4445:1: rule__LocalProtocol__RolesAssignment_6 : ( ruleRolesL ) ;
    public final void rule__LocalProtocol__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4449:1: ( ( ruleRolesL ) )
            // InternalMyDsl.g:4450:2: ( ruleRolesL )
            {
            // InternalMyDsl.g:4450:2: ( ruleRolesL )
            // InternalMyDsl.g:4451:3: ruleRolesL
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesRolesLParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRolesL();

            state._fsp--;

             after(grammarAccess.getLocalProtocolAccess().getRolesRolesLParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4460:1: rule__LocalProtocol__ProtocolAssignment_9 : ( ruleProtocolL ) ;
    public final void rule__LocalProtocol__ProtocolAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4464:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4465:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4465:2: ( ruleProtocolL )
            // InternalMyDsl.g:4466:3: ruleProtocolL
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


    // $ANTLR start "rule__RolesL__RolesAssignment_0"
    // InternalMyDsl.g:4475:1: rule__RolesL__RolesAssignment_0 : ( ruleRoleL ) ;
    public final void rule__RolesL__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4479:1: ( ( ruleRoleL ) )
            // InternalMyDsl.g:4480:2: ( ruleRoleL )
            {
            // InternalMyDsl.g:4480:2: ( ruleRoleL )
            // InternalMyDsl.g:4481:3: ruleRoleL
            {
             before(grammarAccess.getRolesLAccess().getRolesRoleLParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleL();

            state._fsp--;

             after(grammarAccess.getRolesLAccess().getRolesRoleLParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolesL__RolesAssignment_0"


    // $ANTLR start "rule__RolesL__RolesAssignment_1_1"
    // InternalMyDsl.g:4490:1: rule__RolesL__RolesAssignment_1_1 : ( ruleRoleL ) ;
    public final void rule__RolesL__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4494:1: ( ( ruleRoleL ) )
            // InternalMyDsl.g:4495:2: ( ruleRoleL )
            {
            // InternalMyDsl.g:4495:2: ( ruleRoleL )
            // InternalMyDsl.g:4496:3: ruleRoleL
            {
             before(grammarAccess.getRolesLAccess().getRolesRoleLParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleL();

            state._fsp--;

             after(grammarAccess.getRolesLAccess().getRolesRoleLParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolesL__RolesAssignment_1_1"


    // $ANTLR start "rule__RoleOneL__NameAssignment_1"
    // InternalMyDsl.g:4505:1: rule__RoleOneL__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleOneL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4509:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4510:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4510:2: ( RULE_ID )
            // InternalMyDsl.g:4511:3: RULE_ID
            {
             before(grammarAccess.getRoleOneLAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleOneLAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleOneL__NameAssignment_1"


    // $ANTLR start "rule__RoleSetL__NameAssignment_1"
    // InternalMyDsl.g:4520:1: rule__RoleSetL__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoleSetL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4524:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4525:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4525:2: ( RULE_ID )
            // InternalMyDsl.g:4526:3: RULE_ID
            {
             before(grammarAccess.getRoleSetLAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleSetLAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSetL__NameAssignment_1"


    // $ANTLR start "rule__RoleSetL__RefAssignment_3"
    // InternalMyDsl.g:4535:1: rule__RoleSetL__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RoleSetL__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4539:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4540:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4540:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4541:3: ( RULE_ID )
            {
             before(grammarAccess.getRoleSetLAccess().getRefRoleOneLCrossReference_3_0()); 
            // InternalMyDsl.g:4542:3: ( RULE_ID )
            // InternalMyDsl.g:4543:4: RULE_ID
            {
             before(grammarAccess.getRoleSetLAccess().getRefRoleOneLIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleSetLAccess().getRefRoleOneLIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRoleSetLAccess().getRefRoleOneLCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleSetL__RefAssignment_3"


    // $ANTLR start "rule__ProtocolL__ActionsAssignment_1"
    // InternalMyDsl.g:4554:1: rule__ProtocolL__ActionsAssignment_1 : ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) ) ;
    public final void rule__ProtocolL__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4558:1: ( ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) ) )
            // InternalMyDsl.g:4559:2: ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:4559:2: ( ( rule__ProtocolL__ActionsAlternatives_1_0 ) )
            // InternalMyDsl.g:4560:3: ( rule__ProtocolL__ActionsAlternatives_1_0 )
            {
             before(grammarAccess.getProtocolLAccess().getActionsAlternatives_1_0()); 
            // InternalMyDsl.g:4561:3: ( rule__ProtocolL__ActionsAlternatives_1_0 )
            // InternalMyDsl.g:4561:4: rule__ProtocolL__ActionsAlternatives_1_0
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
    // InternalMyDsl.g:4569:1: rule__MessageL__MessageTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4573:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4574:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4574:2: ( RULE_ID )
            // InternalMyDsl.g:4575:3: RULE_ID
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
    // InternalMyDsl.g:4584:1: rule__MessageL__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__MessageL__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4588:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4589:2: ( rulePayload )
            {
            // InternalMyDsl.g:4589:2: ( rulePayload )
            // InternalMyDsl.g:4590:3: rulePayload
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
    // InternalMyDsl.g:4599:1: rule__MessageL__TargetAssignment_4 : ( ruleSenderL ) ;
    public final void rule__MessageL__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4603:1: ( ( ruleSenderL ) )
            // InternalMyDsl.g:4604:2: ( ruleSenderL )
            {
            // InternalMyDsl.g:4604:2: ( ruleSenderL )
            // InternalMyDsl.g:4605:3: ruleSenderL
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
    // InternalMyDsl.g:4614:1: rule__MessageL__TargetAssignment_5 : ( ruleReceiverL ) ;
    public final void rule__MessageL__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4618:1: ( ( ruleReceiverL ) )
            // InternalMyDsl.g:4619:2: ( ruleReceiverL )
            {
            // InternalMyDsl.g:4619:2: ( ruleReceiverL )
            // InternalMyDsl.g:4620:3: ruleReceiverL
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
    // InternalMyDsl.g:4629:1: rule__SenderL__SenderAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SenderL__SenderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4633:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4634:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4634:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4635:3: ( RULE_ID )
            {
             before(grammarAccess.getSenderLAccess().getSenderRoleLCrossReference_1_0()); 
            // InternalMyDsl.g:4636:3: ( RULE_ID )
            // InternalMyDsl.g:4637:4: RULE_ID
            {
             before(grammarAccess.getSenderLAccess().getSenderRoleLIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSenderLAccess().getSenderRoleLIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSenderLAccess().getSenderRoleLCrossReference_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4648:1: rule__ReceiverL__ToAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReceiverL__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4652:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4653:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4653:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4654:3: ( RULE_ID )
            {
             before(grammarAccess.getReceiverLAccess().getToRoleLCrossReference_1_0()); 
            // InternalMyDsl.g:4655:3: ( RULE_ID )
            // InternalMyDsl.g:4656:4: RULE_ID
            {
             before(grammarAccess.getReceiverLAccess().getToRoleLIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReceiverLAccess().getToRoleLIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReceiverLAccess().getToRoleLCrossReference_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4667:1: rule__ChoiceL__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChoiceL__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4671:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4672:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4672:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4673:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceLAccess().getRoleRoleLCrossReference_2_0()); 
            // InternalMyDsl.g:4674:3: ( RULE_ID )
            // InternalMyDsl.g:4675:4: RULE_ID
            {
             before(grammarAccess.getChoiceLAccess().getRoleRoleLIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getRoleRoleLIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getChoiceLAccess().getRoleRoleLCrossReference_2_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4686:1: rule__ChoiceL__MessageAssignment_4 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__MessageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4690:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:4691:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:4691:2: ( ruleMessageL )
            // InternalMyDsl.g:4692:3: ruleMessageL
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
    // InternalMyDsl.g:4701:1: rule__ChoiceL__BranchesAssignment_5 : ( ruleProtocolL ) ;
    public final void rule__ChoiceL__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4705:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4706:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4706:2: ( ruleProtocolL )
            // InternalMyDsl.g:4707:3: ruleProtocolL
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
    // InternalMyDsl.g:4716:1: rule__ChoiceL__MessageAssignment_7_2 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__MessageAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4720:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:4721:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:4721:2: ( ruleMessageL )
            // InternalMyDsl.g:4722:3: ruleMessageL
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
    // InternalMyDsl.g:4731:1: rule__ChoiceL__BranchesAssignment_7_3 : ( ruleProtocolL ) ;
    public final void rule__ChoiceL__BranchesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4735:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4736:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4736:2: ( ruleProtocolL )
            // InternalMyDsl.g:4737:3: ruleProtocolL
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
    // InternalMyDsl.g:4746:1: rule__ForEachL__EachRoleAssignment_1 : ( ruleRoleOneL ) ;
    public final void rule__ForEachL__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4750:1: ( ( ruleRoleOneL ) )
            // InternalMyDsl.g:4751:2: ( ruleRoleOneL )
            {
            // InternalMyDsl.g:4751:2: ( ruleRoleOneL )
            // InternalMyDsl.g:4752:3: ruleRoleOneL
            {
             before(grammarAccess.getForEachLAccess().getEachRoleRoleOneLParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleOneL();

            state._fsp--;

             after(grammarAccess.getForEachLAccess().getEachRoleRoleOneLParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4761:1: rule__ForEachL__RoleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachL__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4765:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4766:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4766:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4767:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachLAccess().getRoleRoleSetLCrossReference_3_0()); 
            // InternalMyDsl.g:4768:3: ( RULE_ID )
            // InternalMyDsl.g:4769:4: RULE_ID
            {
             before(grammarAccess.getForEachLAccess().getRoleRoleSetLIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachLAccess().getRoleRoleSetLIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getForEachLAccess().getRoleRoleSetLCrossReference_3_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4780:1: rule__ForEachL__BranchAssignment_5 : ( ruleProtocolL ) ;
    public final void rule__ForEachL__BranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4784:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4785:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4785:2: ( ruleProtocolL )
            // InternalMyDsl.g:4786:3: ruleProtocolL
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