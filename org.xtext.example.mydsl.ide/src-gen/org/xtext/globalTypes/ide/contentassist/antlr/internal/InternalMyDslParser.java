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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ROLENAME", "RULE_RECNAME", "RULE_ROLENAME_L", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'REQUEST'", "'INFORM'", "'AGREE'", "'REFUSE'", "'int'", "'string'", "'action'", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'multrole'", "':'", "'rec'", "'loop'", "';'", "'foreach'", "'{'", "'choice'", "'at'", "'or'", "')'", "'from'", "'to'", "'local'", "'projection'", "'on'", "'end'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int RULE_ROLENAME=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_RECNAME=6;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_ROLENAME_L=7;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__44=44;
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


    // $ANTLR start "entryRuleRoleMultiple"
    // InternalMyDsl.g:178:1: entryRuleRoleMultiple : ruleRoleMultiple EOF ;
    public final void entryRuleRoleMultiple() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleRoleMultiple EOF )
            // InternalMyDsl.g:180:1: ruleRoleMultiple EOF
            {
             before(grammarAccess.getRoleMultipleRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleMultiple();

            state._fsp--;

             after(grammarAccess.getRoleMultipleRule()); 
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
    // $ANTLR end "entryRuleRoleMultiple"


    // $ANTLR start "ruleRoleMultiple"
    // InternalMyDsl.g:187:1: ruleRoleMultiple : ( ( rule__RoleMultiple__Group__0 ) ) ;
    public final void ruleRoleMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__RoleMultiple__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__RoleMultiple__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__RoleMultiple__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__RoleMultiple__Group__0 )
            {
             before(grammarAccess.getRoleMultipleAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__RoleMultiple__Group__0 )
            // InternalMyDsl.g:194:4: rule__RoleMultiple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoleMultiple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleMultipleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleMultiple"


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
    // InternalMyDsl.g:362:1: rulePayload : ( ( rule__Payload__Group__0 ) ) ;
    public final void rulePayload() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Payload__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Payload__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Payload__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Payload__Group__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Payload__Group__0 )
            // InternalMyDsl.g:369:4: rule__Payload__Group__0
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
    // InternalMyDsl.g:437:1: ruleRoleL : ( ( rule__RoleL__Group__0 ) ) ;
    public final void ruleRoleL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__RoleL__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__RoleL__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__RoleL__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__RoleL__Group__0 )
            {
             before(grammarAccess.getRoleLAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__RoleL__Group__0 )
            // InternalMyDsl.g:444:4: rule__RoleL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoleL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleLAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleProtocolL"
    // InternalMyDsl.g:453:1: entryRuleProtocolL : ruleProtocolL EOF ;
    public final void entryRuleProtocolL() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleProtocolL EOF )
            // InternalMyDsl.g:455:1: ruleProtocolL EOF
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
    // InternalMyDsl.g:462:1: ruleProtocolL : ( ( rule__ProtocolL__Alternatives ) ) ;
    public final void ruleProtocolL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__ProtocolL__Alternatives ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__ProtocolL__Alternatives ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__ProtocolL__Alternatives ) )
            // InternalMyDsl.g:468:3: ( rule__ProtocolL__Alternatives )
            {
             before(grammarAccess.getProtocolLAccess().getAlternatives()); 
            // InternalMyDsl.g:469:3: ( rule__ProtocolL__Alternatives )
            // InternalMyDsl.g:469:4: rule__ProtocolL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtocolLAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSenderL"
    // InternalMyDsl.g:503:1: entryRuleSenderL : ruleSenderL EOF ;
    public final void entryRuleSenderL() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleSenderL EOF )
            // InternalMyDsl.g:505:1: ruleSenderL EOF
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
    // InternalMyDsl.g:512:1: ruleSenderL : ( ( rule__SenderL__Group__0 ) ) ;
    public final void ruleSenderL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__SenderL__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__SenderL__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__SenderL__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__SenderL__Group__0 )
            {
             before(grammarAccess.getSenderLAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__SenderL__Group__0 )
            // InternalMyDsl.g:519:4: rule__SenderL__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleReceiverL : ruleReceiverL EOF ;
    public final void entryRuleReceiverL() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleReceiverL EOF )
            // InternalMyDsl.g:530:1: ruleReceiverL EOF
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
    // InternalMyDsl.g:537:1: ruleReceiverL : ( ( rule__ReceiverL__Group__0 ) ) ;
    public final void ruleReceiverL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__ReceiverL__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__ReceiverL__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__ReceiverL__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__ReceiverL__Group__0 )
            {
             before(grammarAccess.getReceiverLAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__ReceiverL__Group__0 )
            // InternalMyDsl.g:544:4: rule__ReceiverL__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleChoiceL : ruleChoiceL EOF ;
    public final void entryRuleChoiceL() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleChoiceL EOF )
            // InternalMyDsl.g:555:1: ruleChoiceL EOF
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
    // InternalMyDsl.g:562:1: ruleChoiceL : ( ( rule__ChoiceL__Group__0 ) ) ;
    public final void ruleChoiceL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__ChoiceL__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__ChoiceL__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__ChoiceL__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__ChoiceL__Group__0 )
            {
             before(grammarAccess.getChoiceLAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__ChoiceL__Group__0 )
            // InternalMyDsl.g:569:4: rule__ChoiceL__Group__0
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


    // $ANTLR start "entryRuleRecursionL"
    // InternalMyDsl.g:578:1: entryRuleRecursionL : ruleRecursionL EOF ;
    public final void entryRuleRecursionL() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleRecursionL EOF )
            // InternalMyDsl.g:580:1: ruleRecursionL EOF
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
    // InternalMyDsl.g:587:1: ruleRecursionL : ( ( rule__RecursionL__Group__0 ) ) ;
    public final void ruleRecursionL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__RecursionL__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__RecursionL__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__RecursionL__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__RecursionL__Group__0 )
            {
             before(grammarAccess.getRecursionLAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__RecursionL__Group__0 )
            // InternalMyDsl.g:594:4: rule__RecursionL__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleCloseRecursionL : ruleCloseRecursionL EOF ;
    public final void entryRuleCloseRecursionL() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleCloseRecursionL EOF )
            // InternalMyDsl.g:605:1: ruleCloseRecursionL EOF
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
    // InternalMyDsl.g:612:1: ruleCloseRecursionL : ( ( rule__CloseRecursionL__Group__0 ) ) ;
    public final void ruleCloseRecursionL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__CloseRecursionL__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__CloseRecursionL__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__CloseRecursionL__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__CloseRecursionL__Group__0 )
            {
             before(grammarAccess.getCloseRecursionLAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__CloseRecursionL__Group__0 )
            // InternalMyDsl.g:619:4: rule__CloseRecursionL__Group__0
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


    // $ANTLR start "entryRuleEndInteractionL"
    // InternalMyDsl.g:628:1: entryRuleEndInteractionL : ruleEndInteractionL EOF ;
    public final void entryRuleEndInteractionL() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleEndInteractionL EOF )
            // InternalMyDsl.g:630:1: ruleEndInteractionL EOF
            {
             before(grammarAccess.getEndInteractionLRule()); 
            pushFollow(FOLLOW_1);
            ruleEndInteractionL();

            state._fsp--;

             after(grammarAccess.getEndInteractionLRule()); 
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
    // $ANTLR end "entryRuleEndInteractionL"


    // $ANTLR start "ruleEndInteractionL"
    // InternalMyDsl.g:637:1: ruleEndInteractionL : ( ( rule__EndInteractionL__Group__0 ) ) ;
    public final void ruleEndInteractionL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__EndInteractionL__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__EndInteractionL__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__EndInteractionL__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__EndInteractionL__Group__0 )
            {
             before(grammarAccess.getEndInteractionLAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__EndInteractionL__Group__0 )
            // InternalMyDsl.g:644:4: rule__EndInteractionL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndInteractionL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndInteractionLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndInteractionL"


    // $ANTLR start "entryRuleEndInteraction"
    // InternalMyDsl.g:653:1: entryRuleEndInteraction : ruleEndInteraction EOF ;
    public final void entryRuleEndInteraction() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleEndInteraction EOF )
            // InternalMyDsl.g:655:1: ruleEndInteraction EOF
            {
             before(grammarAccess.getEndInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleEndInteraction();

            state._fsp--;

             after(grammarAccess.getEndInteractionRule()); 
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
    // $ANTLR end "entryRuleEndInteraction"


    // $ANTLR start "ruleEndInteraction"
    // InternalMyDsl.g:662:1: ruleEndInteraction : ( ( rule__EndInteraction__Group__0 ) ) ;
    public final void ruleEndInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__EndInteraction__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__EndInteraction__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__EndInteraction__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__EndInteraction__Group__0 )
            {
             before(grammarAccess.getEndInteractionAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__EndInteraction__Group__0 )
            // InternalMyDsl.g:669:4: rule__EndInteraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndInteraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndInteraction"


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

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==41) ) {
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
    // InternalMyDsl.g:748:1: rule__Role__Alternatives : ( ( ruleRoleOne ) | ( ruleRoleMultiple ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( ( ruleRoleOne ) | ( ruleRoleMultiple ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
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
                    // InternalMyDsl.g:759:2: ( ruleRoleMultiple )
                    {
                    // InternalMyDsl.g:759:2: ( ruleRoleMultiple )
                    // InternalMyDsl.g:760:3: ruleRoleMultiple
                    {
                     before(grammarAccess.getRoleAccess().getRoleMultipleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRoleMultiple();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getRoleMultipleParserRuleCall_1()); 

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
    // InternalMyDsl.g:769:1: rule__Protocol__Alternatives : ( ( ( rule__Protocol__Group_0__0 ) ) | ( ruleEndInteraction ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( ( ( rule__Protocol__Group_0__0 ) ) | ( ruleEndInteraction ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||(LA3_0>=14 && LA3_0<=17)||LA3_0==25||(LA3_0>=30 && LA3_0<=31)||LA3_0==33||LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==44) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:774:2: ( ( rule__Protocol__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:774:2: ( ( rule__Protocol__Group_0__0 ) )
                    // InternalMyDsl.g:775:3: ( rule__Protocol__Group_0__0 )
                    {
                     before(grammarAccess.getProtocolAccess().getGroup_0()); 
                    // InternalMyDsl.g:776:3: ( rule__Protocol__Group_0__0 )
                    // InternalMyDsl.g:776:4: rule__Protocol__Group_0__0
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
                    // InternalMyDsl.g:780:2: ( ruleEndInteraction )
                    {
                    // InternalMyDsl.g:780:2: ( ruleEndInteraction )
                    // InternalMyDsl.g:781:3: ruleEndInteraction
                    {
                     before(grammarAccess.getProtocolAccess().getEndInteractionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEndInteraction();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getEndInteractionParserRuleCall_1()); 

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
    // InternalMyDsl.g:790:1: rule__Protocol__ActionsAlternatives_0_1_0 : ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) );
    public final void rule__Protocol__ActionsAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 33:
                {
                alt4=4;
                }
                break;
            case 31:
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
                    // InternalMyDsl.g:795:2: ( ruleMessage )
                    {
                    // InternalMyDsl.g:795:2: ( ruleMessage )
                    // InternalMyDsl.g:796:3: ruleMessage
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
                    // InternalMyDsl.g:801:2: ( ruleChoice )
                    {
                    // InternalMyDsl.g:801:2: ( ruleChoice )
                    // InternalMyDsl.g:802:3: ruleChoice
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
                    // InternalMyDsl.g:807:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:807:2: ( ruleRecursion )
                    // InternalMyDsl.g:808:3: ruleRecursion
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
                    // InternalMyDsl.g:813:2: ( ruleForEach )
                    {
                    // InternalMyDsl.g:813:2: ( ruleForEach )
                    // InternalMyDsl.g:814:3: ruleForEach
                    {
                     before(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_0_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleForEach();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:819:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:819:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:820:3: ruleCloseRecursion
                    {
                     before(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_0_1_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCloseRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_0_1_0_4()); 

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


    // $ANTLR start "rule__ProtocolL__Alternatives"
    // InternalMyDsl.g:829:1: rule__ProtocolL__Alternatives : ( ( ( rule__ProtocolL__Group_0__0 ) ) | ( ruleEndInteractionL ) );
    public final void rule__ProtocolL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:833:1: ( ( ( rule__ProtocolL__Group_0__0 ) ) | ( ruleEndInteractionL ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||(LA5_0>=14 && LA5_0<=17)||LA5_0==25||(LA5_0>=30 && LA5_0<=31)||LA5_0==35) ) {
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
                    // InternalMyDsl.g:834:2: ( ( rule__ProtocolL__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:834:2: ( ( rule__ProtocolL__Group_0__0 ) )
                    // InternalMyDsl.g:835:3: ( rule__ProtocolL__Group_0__0 )
                    {
                     before(grammarAccess.getProtocolLAccess().getGroup_0()); 
                    // InternalMyDsl.g:836:3: ( rule__ProtocolL__Group_0__0 )
                    // InternalMyDsl.g:836:4: rule__ProtocolL__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProtocolL__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProtocolLAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:840:2: ( ruleEndInteractionL )
                    {
                    // InternalMyDsl.g:840:2: ( ruleEndInteractionL )
                    // InternalMyDsl.g:841:3: ruleEndInteractionL
                    {
                     before(grammarAccess.getProtocolLAccess().getEndInteractionLParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEndInteractionL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getEndInteractionLParserRuleCall_1()); 

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
    // $ANTLR end "rule__ProtocolL__Alternatives"


    // $ANTLR start "rule__ProtocolL__ActionsAlternatives_0_1_0"
    // InternalMyDsl.g:850:1: rule__ProtocolL__ActionsAlternatives_0_1_0 : ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleRecursionL ) | ( ruleCloseRecursionL ) );
    public final void rule__ProtocolL__ActionsAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( ruleMessageL ) | ( ruleChoiceL ) | ( ruleRecursionL ) | ( ruleCloseRecursionL ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:855:2: ( ruleMessageL )
                    {
                    // InternalMyDsl.g:855:2: ( ruleMessageL )
                    // InternalMyDsl.g:856:3: ruleMessageL
                    {
                     before(grammarAccess.getProtocolLAccess().getActionsMessageLParserRuleCall_0_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getActionsMessageLParserRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:861:2: ( ruleChoiceL )
                    {
                    // InternalMyDsl.g:861:2: ( ruleChoiceL )
                    // InternalMyDsl.g:862:3: ruleChoiceL
                    {
                     before(grammarAccess.getProtocolLAccess().getActionsChoiceLParserRuleCall_0_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChoiceL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getActionsChoiceLParserRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:867:2: ( ruleRecursionL )
                    {
                    // InternalMyDsl.g:867:2: ( ruleRecursionL )
                    // InternalMyDsl.g:868:3: ruleRecursionL
                    {
                     before(grammarAccess.getProtocolLAccess().getActionsRecursionLParserRuleCall_0_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRecursionL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getActionsRecursionLParserRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:873:2: ( ruleCloseRecursionL )
                    {
                    // InternalMyDsl.g:873:2: ( ruleCloseRecursionL )
                    // InternalMyDsl.g:874:3: ruleCloseRecursionL
                    {
                     before(grammarAccess.getProtocolLAccess().getActionsCloseRecursionLParserRuleCall_0_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCloseRecursionL();

                    state._fsp--;

                     after(grammarAccess.getProtocolLAccess().getActionsCloseRecursionLParserRuleCall_0_1_0_3()); 

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
    // $ANTLR end "rule__ProtocolL__ActionsAlternatives_0_1_0"


    // $ANTLR start "rule__MessageL__Alternatives_4"
    // InternalMyDsl.g:883:1: rule__MessageL__Alternatives_4 : ( ( ( rule__MessageL__TargetAssignment_4_0 ) ) | ( ( rule__MessageL__TargetAssignment_4_1 ) ) );
    public final void rule__MessageL__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( ( ( rule__MessageL__TargetAssignment_4_0 ) ) | ( ( rule__MessageL__TargetAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            else if ( (LA7_0==40) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:888:2: ( ( rule__MessageL__TargetAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:888:2: ( ( rule__MessageL__TargetAssignment_4_0 ) )
                    // InternalMyDsl.g:889:3: ( rule__MessageL__TargetAssignment_4_0 )
                    {
                     before(grammarAccess.getMessageLAccess().getTargetAssignment_4_0()); 
                    // InternalMyDsl.g:890:3: ( rule__MessageL__TargetAssignment_4_0 )
                    // InternalMyDsl.g:890:4: rule__MessageL__TargetAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageL__TargetAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageLAccess().getTargetAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:894:2: ( ( rule__MessageL__TargetAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:894:2: ( ( rule__MessageL__TargetAssignment_4_1 ) )
                    // InternalMyDsl.g:895:3: ( rule__MessageL__TargetAssignment_4_1 )
                    {
                     before(grammarAccess.getMessageLAccess().getTargetAssignment_4_1()); 
                    // InternalMyDsl.g:896:3: ( rule__MessageL__TargetAssignment_4_1 )
                    // InternalMyDsl.g:896:4: rule__MessageL__TargetAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageL__TargetAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageLAccess().getTargetAssignment_4_1()); 

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
    // $ANTLR end "rule__MessageL__Alternatives_4"


    // $ANTLR start "rule__MessageType__Alternatives"
    // InternalMyDsl.g:904:1: rule__MessageType__Alternatives : ( ( 'REQUEST' ) | ( 'INFORM' ) | ( 'AGREE' ) | ( 'REFUSE' ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( ( 'REQUEST' ) | ( 'INFORM' ) | ( 'AGREE' ) | ( 'REFUSE' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
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
                    // InternalMyDsl.g:909:2: ( 'REQUEST' )
                    {
                    // InternalMyDsl.g:909:2: ( 'REQUEST' )
                    // InternalMyDsl.g:910:3: 'REQUEST'
                    {
                     before(grammarAccess.getMessageTypeAccess().getREQUESTKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getREQUESTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:915:2: ( 'INFORM' )
                    {
                    // InternalMyDsl.g:915:2: ( 'INFORM' )
                    // InternalMyDsl.g:916:3: 'INFORM'
                    {
                     before(grammarAccess.getMessageTypeAccess().getINFORMKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getINFORMKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:921:2: ( 'AGREE' )
                    {
                    // InternalMyDsl.g:921:2: ( 'AGREE' )
                    // InternalMyDsl.g:922:3: 'AGREE'
                    {
                     before(grammarAccess.getMessageTypeAccess().getAGREEKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getAGREEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:927:2: ( 'REFUSE' )
                    {
                    // InternalMyDsl.g:927:2: ( 'REFUSE' )
                    // InternalMyDsl.g:928:3: 'REFUSE'
                    {
                     before(grammarAccess.getMessageTypeAccess().getREFUSEKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getREFUSEKeyword_3()); 

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
    // InternalMyDsl.g:937:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'action' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( ( 'int' ) | ( 'string' ) | ( 'action' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
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
                    match(input,18,FOLLOW_2); 
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
                    match(input,19,FOLLOW_2); 
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
                    match(input,20,FOLLOW_2); 
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
            match(input,21,FOLLOW_2); 
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
            match(input,22,FOLLOW_2); 
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
            match(input,23,FOLLOW_2); 
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
            match(input,24,FOLLOW_2); 
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
            match(input,25,FOLLOW_2); 
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

                if ( (LA10_0==26) ) {
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
            match(input,26,FOLLOW_2); 
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
            pushFollow(FOLLOW_12);
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
            match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__RoleMultiple__Group__0"
    // InternalMyDsl.g:1342:1: rule__RoleMultiple__Group__0 : rule__RoleMultiple__Group__0__Impl rule__RoleMultiple__Group__1 ;
    public final void rule__RoleMultiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( rule__RoleMultiple__Group__0__Impl rule__RoleMultiple__Group__1 )
            // InternalMyDsl.g:1347:2: rule__RoleMultiple__Group__0__Impl rule__RoleMultiple__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RoleMultiple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleMultiple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleMultiple__Group__0"


    // $ANTLR start "rule__RoleMultiple__Group__0__Impl"
    // InternalMyDsl.g:1354:1: rule__RoleMultiple__Group__0__Impl : ( 'multrole' ) ;
    public final void rule__RoleMultiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( ( 'multrole' ) )
            // InternalMyDsl.g:1359:1: ( 'multrole' )
            {
            // InternalMyDsl.g:1359:1: ( 'multrole' )
            // InternalMyDsl.g:1360:2: 'multrole'
            {
             before(grammarAccess.getRoleMultipleAccess().getMultroleKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoleMultipleAccess().getMultroleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleMultiple__Group__0__Impl"


    // $ANTLR start "rule__RoleMultiple__Group__1"
    // InternalMyDsl.g:1369:1: rule__RoleMultiple__Group__1 : rule__RoleMultiple__Group__1__Impl rule__RoleMultiple__Group__2 ;
    public final void rule__RoleMultiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( rule__RoleMultiple__Group__1__Impl rule__RoleMultiple__Group__2 )
            // InternalMyDsl.g:1374:2: rule__RoleMultiple__Group__1__Impl rule__RoleMultiple__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RoleMultiple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleMultiple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleMultiple__Group__1"


    // $ANTLR start "rule__RoleMultiple__Group__1__Impl"
    // InternalMyDsl.g:1381:1: rule__RoleMultiple__Group__1__Impl : ( ( rule__RoleMultiple__NameAssignment_1 ) ) ;
    public final void rule__RoleMultiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( ( ( rule__RoleMultiple__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1386:1: ( ( rule__RoleMultiple__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1386:1: ( ( rule__RoleMultiple__NameAssignment_1 ) )
            // InternalMyDsl.g:1387:2: ( rule__RoleMultiple__NameAssignment_1 )
            {
             before(grammarAccess.getRoleMultipleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1388:2: ( rule__RoleMultiple__NameAssignment_1 )
            // InternalMyDsl.g:1388:3: rule__RoleMultiple__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoleMultiple__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleMultipleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleMultiple__Group__1__Impl"


    // $ANTLR start "rule__RoleMultiple__Group__2"
    // InternalMyDsl.g:1396:1: rule__RoleMultiple__Group__2 : rule__RoleMultiple__Group__2__Impl rule__RoleMultiple__Group__3 ;
    public final void rule__RoleMultiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( rule__RoleMultiple__Group__2__Impl rule__RoleMultiple__Group__3 )
            // InternalMyDsl.g:1401:2: rule__RoleMultiple__Group__2__Impl rule__RoleMultiple__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RoleMultiple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleMultiple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleMultiple__Group__2"


    // $ANTLR start "rule__RoleMultiple__Group__2__Impl"
    // InternalMyDsl.g:1408:1: rule__RoleMultiple__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleMultiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( ( ':' ) )
            // InternalMyDsl.g:1413:1: ( ':' )
            {
            // InternalMyDsl.g:1413:1: ( ':' )
            // InternalMyDsl.g:1414:2: ':'
            {
             before(grammarAccess.getRoleMultipleAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRoleMultipleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleMultiple__Group__2__Impl"


    // $ANTLR start "rule__RoleMultiple__Group__3"
    // InternalMyDsl.g:1423:1: rule__RoleMultiple__Group__3 : rule__RoleMultiple__Group__3__Impl ;
    public final void rule__RoleMultiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( rule__RoleMultiple__Group__3__Impl )
            // InternalMyDsl.g:1428:2: rule__RoleMultiple__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleMultiple__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleMultiple__Group__3"


    // $ANTLR start "rule__RoleMultiple__Group__3__Impl"
    // InternalMyDsl.g:1434:1: rule__RoleMultiple__Group__3__Impl : ( ( rule__RoleMultiple__RefAssignment_3 ) ) ;
    public final void rule__RoleMultiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( ( ( rule__RoleMultiple__RefAssignment_3 ) ) )
            // InternalMyDsl.g:1439:1: ( ( rule__RoleMultiple__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:1439:1: ( ( rule__RoleMultiple__RefAssignment_3 ) )
            // InternalMyDsl.g:1440:2: ( rule__RoleMultiple__RefAssignment_3 )
            {
             before(grammarAccess.getRoleMultipleAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:1441:2: ( rule__RoleMultiple__RefAssignment_3 )
            // InternalMyDsl.g:1441:3: rule__RoleMultiple__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RoleMultiple__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleMultipleAccess().getRefAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleMultiple__Group__3__Impl"


    // $ANTLR start "rule__Protocol__Group_0__0"
    // InternalMyDsl.g:1450:1: rule__Protocol__Group_0__0 : rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 ;
    public final void rule__Protocol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 )
            // InternalMyDsl.g:1455:2: rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1462:1: rule__Protocol__Group_0__0__Impl : ( () ) ;
    public final void rule__Protocol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1466:1: ( ( () ) )
            // InternalMyDsl.g:1467:1: ( () )
            {
            // InternalMyDsl.g:1467:1: ( () )
            // InternalMyDsl.g:1468:2: ()
            {
             before(grammarAccess.getProtocolAccess().getProtocolAction_0_0()); 
            // InternalMyDsl.g:1469:2: ()
            // InternalMyDsl.g:1469:3: 
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
    // InternalMyDsl.g:1477:1: rule__Protocol__Group_0__1 : rule__Protocol__Group_0__1__Impl ;
    public final void rule__Protocol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( rule__Protocol__Group_0__1__Impl )
            // InternalMyDsl.g:1482:2: rule__Protocol__Group_0__1__Impl
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
    // InternalMyDsl.g:1488:1: rule__Protocol__Group_0__1__Impl : ( ( rule__Protocol__ActionsAssignment_0_1 )* ) ;
    public final void rule__Protocol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( ( ( rule__Protocol__ActionsAssignment_0_1 )* ) )
            // InternalMyDsl.g:1493:1: ( ( rule__Protocol__ActionsAssignment_0_1 )* )
            {
            // InternalMyDsl.g:1493:1: ( ( rule__Protocol__ActionsAssignment_0_1 )* )
            // InternalMyDsl.g:1494:2: ( rule__Protocol__ActionsAssignment_0_1 )*
            {
             before(grammarAccess.getProtocolAccess().getActionsAssignment_0_1()); 
            // InternalMyDsl.g:1495:2: ( rule__Protocol__ActionsAssignment_0_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=14 && LA11_0<=17)||(LA11_0>=30 && LA11_0<=31)||LA11_0==33||LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1495:3: rule__Protocol__ActionsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_15);
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


    // $ANTLR start "rule__Recursion__Group__0"
    // InternalMyDsl.g:1504:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalMyDsl.g:1509:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
            {
            pushFollow(FOLLOW_16);
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
            match(input,30,FOLLOW_2); 
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
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1558:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( rule__Recursion__Group__2__Impl )
            // InternalMyDsl.g:1563:2: rule__Recursion__Group__2__Impl
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
    // InternalMyDsl.g:1569:1: rule__Recursion__Group__2__Impl : ( ':' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( ( ':' ) )
            // InternalMyDsl.g:1574:1: ( ':' )
            {
            // InternalMyDsl.g:1574:1: ( ':' )
            // InternalMyDsl.g:1575:2: ':'
            {
             before(grammarAccess.getRecursionAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1585:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalMyDsl.g:1590:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1597:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( ( 'loop' ) )
            // InternalMyDsl.g:1602:1: ( 'loop' )
            {
            // InternalMyDsl.g:1602:1: ( 'loop' )
            // InternalMyDsl.g:1603:2: 'loop'
            {
             before(grammarAccess.getCloseRecursionAccess().getLoopKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:1612:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1616:1: ( rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 )
            // InternalMyDsl.g:1617:2: rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1624:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:1629:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:1629:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:1630:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:1631:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:1631:3: rule__CloseRecursion__RecursionVariableAssignment_1
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
    // InternalMyDsl.g:1639:1: rule__CloseRecursion__Group__2 : rule__CloseRecursion__Group__2__Impl ;
    public final void rule__CloseRecursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( rule__CloseRecursion__Group__2__Impl )
            // InternalMyDsl.g:1644:2: rule__CloseRecursion__Group__2__Impl
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
    // InternalMyDsl.g:1650:1: rule__CloseRecursion__Group__2__Impl : ( ';' ) ;
    public final void rule__CloseRecursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( ( ';' ) )
            // InternalMyDsl.g:1655:1: ( ';' )
            {
            // InternalMyDsl.g:1655:1: ( ';' )
            // InternalMyDsl.g:1656:2: ';'
            {
             before(grammarAccess.getCloseRecursionAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1666:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalMyDsl.g:1671:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1678:1: rule__ForEach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:1683:1: ( 'foreach' )
            {
            // InternalMyDsl.g:1683:1: ( 'foreach' )
            // InternalMyDsl.g:1684:2: 'foreach'
            {
             before(grammarAccess.getForEachAccess().getForeachKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1693:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalMyDsl.g:1698:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1705:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1709:1: ( ( ( rule__ForEach__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:1710:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:1710:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:1711:2: ( rule__ForEach__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:1712:2: ( rule__ForEach__EachRoleAssignment_1 )
            // InternalMyDsl.g:1712:3: rule__ForEach__EachRoleAssignment_1
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
    // InternalMyDsl.g:1720:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1724:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalMyDsl.g:1725:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1732:1: rule__ForEach__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( ( ':' ) )
            // InternalMyDsl.g:1737:1: ( ':' )
            {
            // InternalMyDsl.g:1737:1: ( ':' )
            // InternalMyDsl.g:1738:2: ':'
            {
             before(grammarAccess.getForEachAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1747:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalMyDsl.g:1752:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1759:1: rule__ForEach__Group__3__Impl : ( ( rule__ForEach__RoleAssignment_3 ) ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( ( ( rule__ForEach__RoleAssignment_3 ) ) )
            // InternalMyDsl.g:1764:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            {
            // InternalMyDsl.g:1764:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            // InternalMyDsl.g:1765:2: ( rule__ForEach__RoleAssignment_3 )
            {
             before(grammarAccess.getForEachAccess().getRoleAssignment_3()); 
            // InternalMyDsl.g:1766:2: ( rule__ForEach__RoleAssignment_3 )
            // InternalMyDsl.g:1766:3: rule__ForEach__RoleAssignment_3
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
    // InternalMyDsl.g:1774:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalMyDsl.g:1779:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
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
    // InternalMyDsl.g:1786:1: rule__ForEach__Group__4__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( ( '{' ) )
            // InternalMyDsl.g:1791:1: ( '{' )
            {
            // InternalMyDsl.g:1791:1: ( '{' )
            // InternalMyDsl.g:1792:2: '{'
            {
             before(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1801:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalMyDsl.g:1806:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
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
    // InternalMyDsl.g:1813:1: rule__ForEach__Group__5__Impl : ( ( rule__ForEach__BranchAssignment_5 ) ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1817:1: ( ( ( rule__ForEach__BranchAssignment_5 ) ) )
            // InternalMyDsl.g:1818:1: ( ( rule__ForEach__BranchAssignment_5 ) )
            {
            // InternalMyDsl.g:1818:1: ( ( rule__ForEach__BranchAssignment_5 ) )
            // InternalMyDsl.g:1819:2: ( rule__ForEach__BranchAssignment_5 )
            {
             before(grammarAccess.getForEachAccess().getBranchAssignment_5()); 
            // InternalMyDsl.g:1820:2: ( rule__ForEach__BranchAssignment_5 )
            // InternalMyDsl.g:1820:3: rule__ForEach__BranchAssignment_5
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
    // InternalMyDsl.g:1828:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( rule__ForEach__Group__6__Impl )
            // InternalMyDsl.g:1833:2: rule__ForEach__Group__6__Impl
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
    // InternalMyDsl.g:1839:1: rule__ForEach__Group__6__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( ( '}' ) )
            // InternalMyDsl.g:1844:1: ( '}' )
            {
            // InternalMyDsl.g:1844:1: ( '}' )
            // InternalMyDsl.g:1845:2: '}'
            {
             before(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1855:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:1860:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
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
    // InternalMyDsl.g:1867:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( ( 'choice' ) )
            // InternalMyDsl.g:1872:1: ( 'choice' )
            {
            // InternalMyDsl.g:1872:1: ( 'choice' )
            // InternalMyDsl.g:1873:2: 'choice'
            {
             before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:1882:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:1887:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1894:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1898:1: ( ( 'at' ) )
            // InternalMyDsl.g:1899:1: ( 'at' )
            {
            // InternalMyDsl.g:1899:1: ( 'at' )
            // InternalMyDsl.g:1900:2: 'at'
            {
             before(grammarAccess.getChoiceAccess().getAtKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1909:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:1914:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1921:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1925:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:1926:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:1926:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalMyDsl.g:1927:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:1928:2: ( rule__Choice__RoleAssignment_2 )
            // InternalMyDsl.g:1928:3: rule__Choice__RoleAssignment_2
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
    // InternalMyDsl.g:1936:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:1941:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1948:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1952:1: ( ( '{' ) )
            // InternalMyDsl.g:1953:1: ( '{' )
            {
            // InternalMyDsl.g:1953:1: ( '{' )
            // InternalMyDsl.g:1954:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1963:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:1968:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
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
    // InternalMyDsl.g:1975:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__MessageAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1979:1: ( ( ( rule__Choice__MessageAssignment_4 ) ) )
            // InternalMyDsl.g:1980:1: ( ( rule__Choice__MessageAssignment_4 ) )
            {
            // InternalMyDsl.g:1980:1: ( ( rule__Choice__MessageAssignment_4 ) )
            // InternalMyDsl.g:1981:2: ( rule__Choice__MessageAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getMessageAssignment_4()); 
            // InternalMyDsl.g:1982:2: ( rule__Choice__MessageAssignment_4 )
            // InternalMyDsl.g:1982:3: rule__Choice__MessageAssignment_4
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
    // InternalMyDsl.g:1990:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:1995:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
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
    // InternalMyDsl.g:2002:1: rule__Choice__Group__5__Impl : ( ( rule__Choice__BranchesAssignment_5 ) ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2006:1: ( ( ( rule__Choice__BranchesAssignment_5 ) ) )
            // InternalMyDsl.g:2007:1: ( ( rule__Choice__BranchesAssignment_5 ) )
            {
            // InternalMyDsl.g:2007:1: ( ( rule__Choice__BranchesAssignment_5 ) )
            // InternalMyDsl.g:2008:2: ( rule__Choice__BranchesAssignment_5 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_5()); 
            // InternalMyDsl.g:2009:2: ( rule__Choice__BranchesAssignment_5 )
            // InternalMyDsl.g:2009:3: rule__Choice__BranchesAssignment_5
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
    // InternalMyDsl.g:2017:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl rule__Choice__Group__7 ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( rule__Choice__Group__6__Impl rule__Choice__Group__7 )
            // InternalMyDsl.g:2022:2: rule__Choice__Group__6__Impl rule__Choice__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2029:1: rule__Choice__Group__6__Impl : ( '}' ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2033:1: ( ( '}' ) )
            // InternalMyDsl.g:2034:1: ( '}' )
            {
            // InternalMyDsl.g:2034:1: ( '}' )
            // InternalMyDsl.g:2035:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2044:1: rule__Choice__Group__7 : rule__Choice__Group__7__Impl ;
    public final void rule__Choice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( rule__Choice__Group__7__Impl )
            // InternalMyDsl.g:2049:2: rule__Choice__Group__7__Impl
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
    // InternalMyDsl.g:2055:1: rule__Choice__Group__7__Impl : ( ( rule__Choice__Group_7__0 )* ) ;
    public final void rule__Choice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2059:1: ( ( ( rule__Choice__Group_7__0 )* ) )
            // InternalMyDsl.g:2060:1: ( ( rule__Choice__Group_7__0 )* )
            {
            // InternalMyDsl.g:2060:1: ( ( rule__Choice__Group_7__0 )* )
            // InternalMyDsl.g:2061:2: ( rule__Choice__Group_7__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_7()); 
            // InternalMyDsl.g:2062:2: ( rule__Choice__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2062:3: rule__Choice__Group_7__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Choice__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:2071:1: rule__Choice__Group_7__0 : rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1 ;
    public final void rule__Choice__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1 )
            // InternalMyDsl.g:2076:2: rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2083:1: rule__Choice__Group_7__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2087:1: ( ( 'or' ) )
            // InternalMyDsl.g:2088:1: ( 'or' )
            {
            // InternalMyDsl.g:2088:1: ( 'or' )
            // InternalMyDsl.g:2089:2: 'or'
            {
             before(grammarAccess.getChoiceAccess().getOrKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2098:1: rule__Choice__Group_7__1 : rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2 ;
    public final void rule__Choice__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2102:1: ( rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2 )
            // InternalMyDsl.g:2103:2: rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2110:1: rule__Choice__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2114:1: ( ( '{' ) )
            // InternalMyDsl.g:2115:1: ( '{' )
            {
            // InternalMyDsl.g:2115:1: ( '{' )
            // InternalMyDsl.g:2116:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2125:1: rule__Choice__Group_7__2 : rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3 ;
    public final void rule__Choice__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3 )
            // InternalMyDsl.g:2130:2: rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3
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
    // InternalMyDsl.g:2137:1: rule__Choice__Group_7__2__Impl : ( ( rule__Choice__MessageAssignment_7_2 ) ) ;
    public final void rule__Choice__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2141:1: ( ( ( rule__Choice__MessageAssignment_7_2 ) ) )
            // InternalMyDsl.g:2142:1: ( ( rule__Choice__MessageAssignment_7_2 ) )
            {
            // InternalMyDsl.g:2142:1: ( ( rule__Choice__MessageAssignment_7_2 ) )
            // InternalMyDsl.g:2143:2: ( rule__Choice__MessageAssignment_7_2 )
            {
             before(grammarAccess.getChoiceAccess().getMessageAssignment_7_2()); 
            // InternalMyDsl.g:2144:2: ( rule__Choice__MessageAssignment_7_2 )
            // InternalMyDsl.g:2144:3: rule__Choice__MessageAssignment_7_2
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
    // InternalMyDsl.g:2152:1: rule__Choice__Group_7__3 : rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4 ;
    public final void rule__Choice__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4 )
            // InternalMyDsl.g:2157:2: rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4
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
    // InternalMyDsl.g:2164:1: rule__Choice__Group_7__3__Impl : ( ( rule__Choice__BranchesAssignment_7_3 ) ) ;
    public final void rule__Choice__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( ( ( rule__Choice__BranchesAssignment_7_3 ) ) )
            // InternalMyDsl.g:2169:1: ( ( rule__Choice__BranchesAssignment_7_3 ) )
            {
            // InternalMyDsl.g:2169:1: ( ( rule__Choice__BranchesAssignment_7_3 ) )
            // InternalMyDsl.g:2170:2: ( rule__Choice__BranchesAssignment_7_3 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_7_3()); 
            // InternalMyDsl.g:2171:2: ( rule__Choice__BranchesAssignment_7_3 )
            // InternalMyDsl.g:2171:3: rule__Choice__BranchesAssignment_7_3
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
    // InternalMyDsl.g:2179:1: rule__Choice__Group_7__4 : rule__Choice__Group_7__4__Impl ;
    public final void rule__Choice__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( rule__Choice__Group_7__4__Impl )
            // InternalMyDsl.g:2184:2: rule__Choice__Group_7__4__Impl
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
    // InternalMyDsl.g:2190:1: rule__Choice__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Choice__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2194:1: ( ( '}' ) )
            // InternalMyDsl.g:2195:1: ( '}' )
            {
            // InternalMyDsl.g:2195:1: ( '}' )
            // InternalMyDsl.g:2196:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2206:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:2211:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalMyDsl.g:2218:1: rule__Message__Group__0__Impl : ( ( rule__Message__MessageTypeAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2222:1: ( ( ( rule__Message__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:2223:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2223:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:2224:2: ( rule__Message__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:2225:2: ( rule__Message__MessageTypeAssignment_0 )
            // InternalMyDsl.g:2225:3: rule__Message__MessageTypeAssignment_0
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
    // InternalMyDsl.g:2233:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:2238:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2245:1: rule__Message__Group__1__Impl : ( '(' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2249:1: ( ( '(' ) )
            // InternalMyDsl.g:2250:1: ( '(' )
            {
            // InternalMyDsl.g:2250:1: ( '(' )
            // InternalMyDsl.g:2251:2: '('
            {
             before(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:2260:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:2265:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2272:1: rule__Message__Group__2__Impl : ( ( rule__Message__PayloadAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2276:1: ( ( ( rule__Message__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:2277:1: ( ( rule__Message__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:2277:1: ( ( rule__Message__PayloadAssignment_2 )? )
            // InternalMyDsl.g:2278:2: ( rule__Message__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:2279:2: ( rule__Message__PayloadAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=18 && LA13_0<=20)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2279:3: rule__Message__PayloadAssignment_2
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
    // InternalMyDsl.g:2287:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2291:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:2292:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2299:1: rule__Message__Group__3__Impl : ( ')' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2303:1: ( ( ')' ) )
            // InternalMyDsl.g:2304:1: ( ')' )
            {
            // InternalMyDsl.g:2304:1: ( ')' )
            // InternalMyDsl.g:2305:2: ')'
            {
             before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2314:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:2319:2: rule__Message__Group__4__Impl rule__Message__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2326:1: rule__Message__Group__4__Impl : ( 'from' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2330:1: ( ( 'from' ) )
            // InternalMyDsl.g:2331:1: ( 'from' )
            {
            // InternalMyDsl.g:2331:1: ( 'from' )
            // InternalMyDsl.g:2332:2: 'from'
            {
             before(grammarAccess.getMessageAccess().getFromKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2341:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:2346:2: rule__Message__Group__5__Impl rule__Message__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2353:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2357:1: ( ( ( rule__Message__SenderAssignment_5 ) ) )
            // InternalMyDsl.g:2358:1: ( ( rule__Message__SenderAssignment_5 ) )
            {
            // InternalMyDsl.g:2358:1: ( ( rule__Message__SenderAssignment_5 ) )
            // InternalMyDsl.g:2359:2: ( rule__Message__SenderAssignment_5 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_5()); 
            // InternalMyDsl.g:2360:2: ( rule__Message__SenderAssignment_5 )
            // InternalMyDsl.g:2360:3: rule__Message__SenderAssignment_5
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
    // InternalMyDsl.g:2368:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:2373:2: rule__Message__Group__6__Impl rule__Message__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2380:1: rule__Message__Group__6__Impl : ( 'to' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2384:1: ( ( 'to' ) )
            // InternalMyDsl.g:2385:1: ( 'to' )
            {
            // InternalMyDsl.g:2385:1: ( 'to' )
            // InternalMyDsl.g:2386:2: 'to'
            {
             before(grammarAccess.getMessageAccess().getToKeyword_6()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:2395:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:2400:2: rule__Message__Group__7__Impl rule__Message__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2407:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( ( rule__Message__ReceiverAssignment_7 ) ) )
            // InternalMyDsl.g:2412:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            {
            // InternalMyDsl.g:2412:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            // InternalMyDsl.g:2413:2: ( rule__Message__ReceiverAssignment_7 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 
            // InternalMyDsl.g:2414:2: ( rule__Message__ReceiverAssignment_7 )
            // InternalMyDsl.g:2414:3: rule__Message__ReceiverAssignment_7
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
    // InternalMyDsl.g:2422:1: rule__Message__Group__8 : rule__Message__Group__8__Impl ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( rule__Message__Group__8__Impl )
            // InternalMyDsl.g:2427:2: rule__Message__Group__8__Impl
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
    // InternalMyDsl.g:2433:1: rule__Message__Group__8__Impl : ( ';' ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2437:1: ( ( ';' ) )
            // InternalMyDsl.g:2438:1: ( ';' )
            {
            // InternalMyDsl.g:2438:1: ( ';' )
            // InternalMyDsl.g:2439:2: ';'
            {
             before(grammarAccess.getMessageAccess().getSemicolonKeyword_8()); 
            match(input,32,FOLLOW_2); 
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


    // $ANTLR start "rule__Payload__Group__0"
    // InternalMyDsl.g:2449:1: rule__Payload__Group__0 : rule__Payload__Group__0__Impl rule__Payload__Group__1 ;
    public final void rule__Payload__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( rule__Payload__Group__0__Impl rule__Payload__Group__1 )
            // InternalMyDsl.g:2454:2: rule__Payload__Group__0__Impl rule__Payload__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2461:1: rule__Payload__Group__0__Impl : ( () ) ;
    public final void rule__Payload__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2465:1: ( ( () ) )
            // InternalMyDsl.g:2466:1: ( () )
            {
            // InternalMyDsl.g:2466:1: ( () )
            // InternalMyDsl.g:2467:2: ()
            {
             before(grammarAccess.getPayloadAccess().getPayloadAction_0()); 
            // InternalMyDsl.g:2468:2: ()
            // InternalMyDsl.g:2468:3: 
            {
            }

             after(grammarAccess.getPayloadAccess().getPayloadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group__0__Impl"


    // $ANTLR start "rule__Payload__Group__1"
    // InternalMyDsl.g:2476:1: rule__Payload__Group__1 : rule__Payload__Group__1__Impl ;
    public final void rule__Payload__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( rule__Payload__Group__1__Impl )
            // InternalMyDsl.g:2481:2: rule__Payload__Group__1__Impl
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
    // InternalMyDsl.g:2487:1: rule__Payload__Group__1__Impl : ( ( rule__Payload__Group_1__0 ) ) ;
    public final void rule__Payload__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2491:1: ( ( ( rule__Payload__Group_1__0 ) ) )
            // InternalMyDsl.g:2492:1: ( ( rule__Payload__Group_1__0 ) )
            {
            // InternalMyDsl.g:2492:1: ( ( rule__Payload__Group_1__0 ) )
            // InternalMyDsl.g:2493:2: ( rule__Payload__Group_1__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup_1()); 
            // InternalMyDsl.g:2494:2: ( rule__Payload__Group_1__0 )
            // InternalMyDsl.g:2494:3: rule__Payload__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group_1__0();

            state._fsp--;


            }

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
    // InternalMyDsl.g:2503:1: rule__Payload__Group_1__0 : rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 ;
    public final void rule__Payload__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 )
            // InternalMyDsl.g:2508:2: rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2515:1: rule__Payload__Group_1__0__Impl : ( ( rule__Payload__TypesAssignment_1_0 ) ) ;
    public final void rule__Payload__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2519:1: ( ( ( rule__Payload__TypesAssignment_1_0 ) ) )
            // InternalMyDsl.g:2520:1: ( ( rule__Payload__TypesAssignment_1_0 ) )
            {
            // InternalMyDsl.g:2520:1: ( ( rule__Payload__TypesAssignment_1_0 ) )
            // InternalMyDsl.g:2521:2: ( rule__Payload__TypesAssignment_1_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_1_0()); 
            // InternalMyDsl.g:2522:2: ( rule__Payload__TypesAssignment_1_0 )
            // InternalMyDsl.g:2522:3: rule__Payload__TypesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Payload__TypesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getTypesAssignment_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2530:1: rule__Payload__Group_1__1 : rule__Payload__Group_1__1__Impl ;
    public final void rule__Payload__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( rule__Payload__Group_1__1__Impl )
            // InternalMyDsl.g:2535:2: rule__Payload__Group_1__1__Impl
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
    // InternalMyDsl.g:2541:1: rule__Payload__Group_1__1__Impl : ( ( rule__Payload__Group_1_1__0 )* ) ;
    public final void rule__Payload__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2545:1: ( ( ( rule__Payload__Group_1_1__0 )* ) )
            // InternalMyDsl.g:2546:1: ( ( rule__Payload__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:2546:1: ( ( rule__Payload__Group_1_1__0 )* )
            // InternalMyDsl.g:2547:2: ( rule__Payload__Group_1_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_1_1()); 
            // InternalMyDsl.g:2548:2: ( rule__Payload__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2548:3: rule__Payload__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Payload__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPayloadAccess().getGroup_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Payload__Group_1_1__0"
    // InternalMyDsl.g:2557:1: rule__Payload__Group_1_1__0 : rule__Payload__Group_1_1__0__Impl rule__Payload__Group_1_1__1 ;
    public final void rule__Payload__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( rule__Payload__Group_1_1__0__Impl rule__Payload__Group_1_1__1 )
            // InternalMyDsl.g:2562:2: rule__Payload__Group_1_1__0__Impl rule__Payload__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Payload__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Payload__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_1_1__0"


    // $ANTLR start "rule__Payload__Group_1_1__0__Impl"
    // InternalMyDsl.g:2569:1: rule__Payload__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2573:1: ( ( ',' ) )
            // InternalMyDsl.g:2574:1: ( ',' )
            {
            // InternalMyDsl.g:2574:1: ( ',' )
            // InternalMyDsl.g:2575:2: ','
            {
             before(grammarAccess.getPayloadAccess().getCommaKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPayloadAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_1_1__0__Impl"


    // $ANTLR start "rule__Payload__Group_1_1__1"
    // InternalMyDsl.g:2584:1: rule__Payload__Group_1_1__1 : rule__Payload__Group_1_1__1__Impl ;
    public final void rule__Payload__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( rule__Payload__Group_1_1__1__Impl )
            // InternalMyDsl.g:2589:2: rule__Payload__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_1_1__1"


    // $ANTLR start "rule__Payload__Group_1_1__1__Impl"
    // InternalMyDsl.g:2595:1: rule__Payload__Group_1_1__1__Impl : ( ( rule__Payload__TypesAssignment_1_1_1 ) ) ;
    public final void rule__Payload__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2599:1: ( ( ( rule__Payload__TypesAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:2600:1: ( ( rule__Payload__TypesAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:2600:1: ( ( rule__Payload__TypesAssignment_1_1_1 ) )
            // InternalMyDsl.g:2601:2: ( rule__Payload__TypesAssignment_1_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_1_1_1()); 
            // InternalMyDsl.g:2602:2: ( rule__Payload__TypesAssignment_1_1_1 )
            // InternalMyDsl.g:2602:3: rule__Payload__TypesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Payload__TypesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getTypesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group_1_1__1__Impl"


    // $ANTLR start "rule__LocalProtocol__Group__0"
    // InternalMyDsl.g:2611:1: rule__LocalProtocol__Group__0 : rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 ;
    public final void rule__LocalProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2615:1: ( rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1 )
            // InternalMyDsl.g:2616:2: rule__LocalProtocol__Group__0__Impl rule__LocalProtocol__Group__1
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
    // InternalMyDsl.g:2623:1: rule__LocalProtocol__Group__0__Impl : ( 'local' ) ;
    public final void rule__LocalProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2627:1: ( ( 'local' ) )
            // InternalMyDsl.g:2628:1: ( 'local' )
            {
            // InternalMyDsl.g:2628:1: ( 'local' )
            // InternalMyDsl.g:2629:2: 'local'
            {
             before(grammarAccess.getLocalProtocolAccess().getLocalKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2638:1: rule__LocalProtocol__Group__1 : rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 ;
    public final void rule__LocalProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2 )
            // InternalMyDsl.g:2643:2: rule__LocalProtocol__Group__1__Impl rule__LocalProtocol__Group__2
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
    // InternalMyDsl.g:2650:1: rule__LocalProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__LocalProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2654:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:2655:1: ( 'protocol' )
            {
            // InternalMyDsl.g:2655:1: ( 'protocol' )
            // InternalMyDsl.g:2656:2: 'protocol'
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:2665:1: rule__LocalProtocol__Group__2 : rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 ;
    public final void rule__LocalProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3 )
            // InternalMyDsl.g:2670:2: rule__LocalProtocol__Group__2__Impl rule__LocalProtocol__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2677:1: rule__LocalProtocol__Group__2__Impl : ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) ;
    public final void rule__LocalProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2681:1: ( ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:2682:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:2682:1: ( ( rule__LocalProtocol__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:2683:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:2684:2: ( rule__LocalProtocol__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:2684:3: rule__LocalProtocol__ProtocolNameAssignment_2
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
    // InternalMyDsl.g:2692:1: rule__LocalProtocol__Group__3 : rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 ;
    public final void rule__LocalProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4 )
            // InternalMyDsl.g:2697:2: rule__LocalProtocol__Group__3__Impl rule__LocalProtocol__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2704:1: rule__LocalProtocol__Group__3__Impl : ( 'projection' ) ;
    public final void rule__LocalProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2708:1: ( ( 'projection' ) )
            // InternalMyDsl.g:2709:1: ( 'projection' )
            {
            // InternalMyDsl.g:2709:1: ( 'projection' )
            // InternalMyDsl.g:2710:2: 'projection'
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectionKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getProjectionKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:2719:1: rule__LocalProtocol__Group__4 : rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 ;
    public final void rule__LocalProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5 )
            // InternalMyDsl.g:2724:2: rule__LocalProtocol__Group__4__Impl rule__LocalProtocol__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2731:1: rule__LocalProtocol__Group__4__Impl : ( 'on' ) ;
    public final void rule__LocalProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2735:1: ( ( 'on' ) )
            // InternalMyDsl.g:2736:1: ( 'on' )
            {
            // InternalMyDsl.g:2736:1: ( 'on' )
            // InternalMyDsl.g:2737:2: 'on'
            {
             before(grammarAccess.getLocalProtocolAccess().getOnKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getOnKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:2746:1: rule__LocalProtocol__Group__5 : rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 ;
    public final void rule__LocalProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6 )
            // InternalMyDsl.g:2751:2: rule__LocalProtocol__Group__5__Impl rule__LocalProtocol__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:2758:1: rule__LocalProtocol__Group__5__Impl : ( ( rule__LocalProtocol__ProjectedRoleAssignment_5 ) ) ;
    public final void rule__LocalProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2762:1: ( ( ( rule__LocalProtocol__ProjectedRoleAssignment_5 ) ) )
            // InternalMyDsl.g:2763:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_5 ) )
            {
            // InternalMyDsl.g:2763:1: ( ( rule__LocalProtocol__ProjectedRoleAssignment_5 ) )
            // InternalMyDsl.g:2764:2: ( rule__LocalProtocol__ProjectedRoleAssignment_5 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_5()); 
            // InternalMyDsl.g:2765:2: ( rule__LocalProtocol__ProjectedRoleAssignment_5 )
            // InternalMyDsl.g:2765:3: rule__LocalProtocol__ProjectedRoleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__ProjectedRoleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLocalProtocolAccess().getProjectedRoleAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:2773:1: rule__LocalProtocol__Group__6 : rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 ;
    public final void rule__LocalProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7 )
            // InternalMyDsl.g:2778:2: rule__LocalProtocol__Group__6__Impl rule__LocalProtocol__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2785:1: rule__LocalProtocol__Group__6__Impl : ( '(' ) ;
    public final void rule__LocalProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2789:1: ( ( '(' ) )
            // InternalMyDsl.g:2790:1: ( '(' )
            {
            // InternalMyDsl.g:2790:1: ( '(' )
            // InternalMyDsl.g:2791:2: '('
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:2800:1: rule__LocalProtocol__Group__7 : rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 ;
    public final void rule__LocalProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8 )
            // InternalMyDsl.g:2805:2: rule__LocalProtocol__Group__7__Impl rule__LocalProtocol__Group__8
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
    // InternalMyDsl.g:2812:1: rule__LocalProtocol__Group__7__Impl : ( ( rule__LocalProtocol__RolesAssignment_7 ) ) ;
    public final void rule__LocalProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2816:1: ( ( ( rule__LocalProtocol__RolesAssignment_7 ) ) )
            // InternalMyDsl.g:2817:1: ( ( rule__LocalProtocol__RolesAssignment_7 ) )
            {
            // InternalMyDsl.g:2817:1: ( ( rule__LocalProtocol__RolesAssignment_7 ) )
            // InternalMyDsl.g:2818:2: ( rule__LocalProtocol__RolesAssignment_7 )
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesAssignment_7()); 
            // InternalMyDsl.g:2819:2: ( rule__LocalProtocol__RolesAssignment_7 )
            // InternalMyDsl.g:2819:3: rule__LocalProtocol__RolesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__RolesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getLocalProtocolAccess().getRolesAssignment_7()); 

            }


            }

        }
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
    // InternalMyDsl.g:2827:1: rule__LocalProtocol__Group__8 : rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 ;
    public final void rule__LocalProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9 )
            // InternalMyDsl.g:2832:2: rule__LocalProtocol__Group__8__Impl rule__LocalProtocol__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2839:1: rule__LocalProtocol__Group__8__Impl : ( ')' ) ;
    public final void rule__LocalProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2843:1: ( ( ')' ) )
            // InternalMyDsl.g:2844:1: ( ')' )
            {
            // InternalMyDsl.g:2844:1: ( ')' )
            // InternalMyDsl.g:2845:2: ')'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
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
    // InternalMyDsl.g:2854:1: rule__LocalProtocol__Group__9 : rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 ;
    public final void rule__LocalProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10 )
            // InternalMyDsl.g:2859:2: rule__LocalProtocol__Group__9__Impl rule__LocalProtocol__Group__10
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:2866:1: rule__LocalProtocol__Group__9__Impl : ( '{' ) ;
    public final void rule__LocalProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2870:1: ( ( '{' ) )
            // InternalMyDsl.g:2871:1: ( '{' )
            {
            // InternalMyDsl.g:2871:1: ( '{' )
            // InternalMyDsl.g:2872:2: '{'
            {
             before(grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
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
    // InternalMyDsl.g:2881:1: rule__LocalProtocol__Group__10 : rule__LocalProtocol__Group__10__Impl rule__LocalProtocol__Group__11 ;
    public final void rule__LocalProtocol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2885:1: ( rule__LocalProtocol__Group__10__Impl rule__LocalProtocol__Group__11 )
            // InternalMyDsl.g:2886:2: rule__LocalProtocol__Group__10__Impl rule__LocalProtocol__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__LocalProtocol__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__11();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2893:1: rule__LocalProtocol__Group__10__Impl : ( ( rule__LocalProtocol__ProtocolAssignment_10 ) ) ;
    public final void rule__LocalProtocol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2897:1: ( ( ( rule__LocalProtocol__ProtocolAssignment_10 ) ) )
            // InternalMyDsl.g:2898:1: ( ( rule__LocalProtocol__ProtocolAssignment_10 ) )
            {
            // InternalMyDsl.g:2898:1: ( ( rule__LocalProtocol__ProtocolAssignment_10 ) )
            // InternalMyDsl.g:2899:2: ( rule__LocalProtocol__ProtocolAssignment_10 )
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_10()); 
            // InternalMyDsl.g:2900:2: ( rule__LocalProtocol__ProtocolAssignment_10 )
            // InternalMyDsl.g:2900:3: rule__LocalProtocol__ProtocolAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__ProtocolAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getLocalProtocolAccess().getProtocolAssignment_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__LocalProtocol__Group__11"
    // InternalMyDsl.g:2908:1: rule__LocalProtocol__Group__11 : rule__LocalProtocol__Group__11__Impl ;
    public final void rule__LocalProtocol__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( rule__LocalProtocol__Group__11__Impl )
            // InternalMyDsl.g:2913:2: rule__LocalProtocol__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalProtocol__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__11"


    // $ANTLR start "rule__LocalProtocol__Group__11__Impl"
    // InternalMyDsl.g:2919:1: rule__LocalProtocol__Group__11__Impl : ( '}' ) ;
    public final void rule__LocalProtocol__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2923:1: ( ( '}' ) )
            // InternalMyDsl.g:2924:1: ( '}' )
            {
            // InternalMyDsl.g:2924:1: ( '}' )
            // InternalMyDsl.g:2925:2: '}'
            {
             before(grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_11()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__Group__11__Impl"


    // $ANTLR start "rule__RolesL__Group__0"
    // InternalMyDsl.g:2935:1: rule__RolesL__Group__0 : rule__RolesL__Group__0__Impl rule__RolesL__Group__1 ;
    public final void rule__RolesL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2939:1: ( rule__RolesL__Group__0__Impl rule__RolesL__Group__1 )
            // InternalMyDsl.g:2940:2: rule__RolesL__Group__0__Impl rule__RolesL__Group__1
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
    // InternalMyDsl.g:2947:1: rule__RolesL__Group__0__Impl : ( ( rule__RolesL__RolesAssignment_0 ) ) ;
    public final void rule__RolesL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2951:1: ( ( ( rule__RolesL__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:2952:1: ( ( rule__RolesL__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:2952:1: ( ( rule__RolesL__RolesAssignment_0 ) )
            // InternalMyDsl.g:2953:2: ( rule__RolesL__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesLAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:2954:2: ( rule__RolesL__RolesAssignment_0 )
            // InternalMyDsl.g:2954:3: rule__RolesL__RolesAssignment_0
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
    // InternalMyDsl.g:2962:1: rule__RolesL__Group__1 : rule__RolesL__Group__1__Impl ;
    public final void rule__RolesL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( rule__RolesL__Group__1__Impl )
            // InternalMyDsl.g:2967:2: rule__RolesL__Group__1__Impl
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
    // InternalMyDsl.g:2973:1: rule__RolesL__Group__1__Impl : ( ( rule__RolesL__Group_1__0 )* ) ;
    public final void rule__RolesL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2977:1: ( ( ( rule__RolesL__Group_1__0 )* ) )
            // InternalMyDsl.g:2978:1: ( ( rule__RolesL__Group_1__0 )* )
            {
            // InternalMyDsl.g:2978:1: ( ( rule__RolesL__Group_1__0 )* )
            // InternalMyDsl.g:2979:2: ( rule__RolesL__Group_1__0 )*
            {
             before(grammarAccess.getRolesLAccess().getGroup_1()); 
            // InternalMyDsl.g:2980:2: ( rule__RolesL__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2980:3: rule__RolesL__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RolesL__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:2989:1: rule__RolesL__Group_1__0 : rule__RolesL__Group_1__0__Impl rule__RolesL__Group_1__1 ;
    public final void rule__RolesL__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( rule__RolesL__Group_1__0__Impl rule__RolesL__Group_1__1 )
            // InternalMyDsl.g:2994:2: rule__RolesL__Group_1__0__Impl rule__RolesL__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:3001:1: rule__RolesL__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RolesL__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3005:1: ( ( ',' ) )
            // InternalMyDsl.g:3006:1: ( ',' )
            {
            // InternalMyDsl.g:3006:1: ( ',' )
            // InternalMyDsl.g:3007:2: ','
            {
             before(grammarAccess.getRolesLAccess().getCommaKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:3016:1: rule__RolesL__Group_1__1 : rule__RolesL__Group_1__1__Impl ;
    public final void rule__RolesL__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3020:1: ( rule__RolesL__Group_1__1__Impl )
            // InternalMyDsl.g:3021:2: rule__RolesL__Group_1__1__Impl
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
    // InternalMyDsl.g:3027:1: rule__RolesL__Group_1__1__Impl : ( ( rule__RolesL__RolesAssignment_1_1 ) ) ;
    public final void rule__RolesL__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3031:1: ( ( ( rule__RolesL__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:3032:1: ( ( rule__RolesL__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:3032:1: ( ( rule__RolesL__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:3033:2: ( rule__RolesL__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesLAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:3034:2: ( rule__RolesL__RolesAssignment_1_1 )
            // InternalMyDsl.g:3034:3: rule__RolesL__RolesAssignment_1_1
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


    // $ANTLR start "rule__RoleL__Group__0"
    // InternalMyDsl.g:3043:1: rule__RoleL__Group__0 : rule__RoleL__Group__0__Impl rule__RoleL__Group__1 ;
    public final void rule__RoleL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( rule__RoleL__Group__0__Impl rule__RoleL__Group__1 )
            // InternalMyDsl.g:3048:2: rule__RoleL__Group__0__Impl rule__RoleL__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__RoleL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleL__Group__0"


    // $ANTLR start "rule__RoleL__Group__0__Impl"
    // InternalMyDsl.g:3055:1: rule__RoleL__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3059:1: ( ( 'role' ) )
            // InternalMyDsl.g:3060:1: ( 'role' )
            {
            // InternalMyDsl.g:3060:1: ( 'role' )
            // InternalMyDsl.g:3061:2: 'role'
            {
             before(grammarAccess.getRoleLAccess().getRoleKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoleLAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleL__Group__0__Impl"


    // $ANTLR start "rule__RoleL__Group__1"
    // InternalMyDsl.g:3070:1: rule__RoleL__Group__1 : rule__RoleL__Group__1__Impl ;
    public final void rule__RoleL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3074:1: ( rule__RoleL__Group__1__Impl )
            // InternalMyDsl.g:3075:2: rule__RoleL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleL__Group__1"


    // $ANTLR start "rule__RoleL__Group__1__Impl"
    // InternalMyDsl.g:3081:1: rule__RoleL__Group__1__Impl : ( ( rule__RoleL__NameAssignment_1 ) ) ;
    public final void rule__RoleL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3085:1: ( ( ( rule__RoleL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3086:1: ( ( rule__RoleL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3086:1: ( ( rule__RoleL__NameAssignment_1 ) )
            // InternalMyDsl.g:3087:2: ( rule__RoleL__NameAssignment_1 )
            {
             before(grammarAccess.getRoleLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3088:2: ( rule__RoleL__NameAssignment_1 )
            // InternalMyDsl.g:3088:3: rule__RoleL__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoleL__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleLAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleL__Group__1__Impl"


    // $ANTLR start "rule__ProtocolL__Group_0__0"
    // InternalMyDsl.g:3097:1: rule__ProtocolL__Group_0__0 : rule__ProtocolL__Group_0__0__Impl rule__ProtocolL__Group_0__1 ;
    public final void rule__ProtocolL__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( rule__ProtocolL__Group_0__0__Impl rule__ProtocolL__Group_0__1 )
            // InternalMyDsl.g:3102:2: rule__ProtocolL__Group_0__0__Impl rule__ProtocolL__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__ProtocolL__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtocolL__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__Group_0__0"


    // $ANTLR start "rule__ProtocolL__Group_0__0__Impl"
    // InternalMyDsl.g:3109:1: rule__ProtocolL__Group_0__0__Impl : ( () ) ;
    public final void rule__ProtocolL__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3113:1: ( ( () ) )
            // InternalMyDsl.g:3114:1: ( () )
            {
            // InternalMyDsl.g:3114:1: ( () )
            // InternalMyDsl.g:3115:2: ()
            {
             before(grammarAccess.getProtocolLAccess().getProtocolLAction_0_0()); 
            // InternalMyDsl.g:3116:2: ()
            // InternalMyDsl.g:3116:3: 
            {
            }

             after(grammarAccess.getProtocolLAccess().getProtocolLAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__Group_0__0__Impl"


    // $ANTLR start "rule__ProtocolL__Group_0__1"
    // InternalMyDsl.g:3124:1: rule__ProtocolL__Group_0__1 : rule__ProtocolL__Group_0__1__Impl ;
    public final void rule__ProtocolL__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3128:1: ( rule__ProtocolL__Group_0__1__Impl )
            // InternalMyDsl.g:3129:2: rule__ProtocolL__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolL__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__Group_0__1"


    // $ANTLR start "rule__ProtocolL__Group_0__1__Impl"
    // InternalMyDsl.g:3135:1: rule__ProtocolL__Group_0__1__Impl : ( ( rule__ProtocolL__ActionsAssignment_0_1 )* ) ;
    public final void rule__ProtocolL__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3139:1: ( ( ( rule__ProtocolL__ActionsAssignment_0_1 )* ) )
            // InternalMyDsl.g:3140:1: ( ( rule__ProtocolL__ActionsAssignment_0_1 )* )
            {
            // InternalMyDsl.g:3140:1: ( ( rule__ProtocolL__ActionsAssignment_0_1 )* )
            // InternalMyDsl.g:3141:2: ( rule__ProtocolL__ActionsAssignment_0_1 )*
            {
             before(grammarAccess.getProtocolLAccess().getActionsAssignment_0_1()); 
            // InternalMyDsl.g:3142:2: ( rule__ProtocolL__ActionsAssignment_0_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=14 && LA16_0<=17)||(LA16_0>=30 && LA16_0<=31)||LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:3142:3: rule__ProtocolL__ActionsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__ProtocolL__ActionsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getProtocolLAccess().getActionsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__Group_0__1__Impl"


    // $ANTLR start "rule__MessageL__Group__0"
    // InternalMyDsl.g:3151:1: rule__MessageL__Group__0 : rule__MessageL__Group__0__Impl rule__MessageL__Group__1 ;
    public final void rule__MessageL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3155:1: ( rule__MessageL__Group__0__Impl rule__MessageL__Group__1 )
            // InternalMyDsl.g:3156:2: rule__MessageL__Group__0__Impl rule__MessageL__Group__1
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
    // InternalMyDsl.g:3163:1: rule__MessageL__Group__0__Impl : ( ( rule__MessageL__MessageTypeAssignment_0 ) ) ;
    public final void rule__MessageL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3167:1: ( ( ( rule__MessageL__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:3168:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3168:1: ( ( rule__MessageL__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:3169:2: ( rule__MessageL__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageLAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:3170:2: ( rule__MessageL__MessageTypeAssignment_0 )
            // InternalMyDsl.g:3170:3: rule__MessageL__MessageTypeAssignment_0
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
    // InternalMyDsl.g:3178:1: rule__MessageL__Group__1 : rule__MessageL__Group__1__Impl rule__MessageL__Group__2 ;
    public final void rule__MessageL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( rule__MessageL__Group__1__Impl rule__MessageL__Group__2 )
            // InternalMyDsl.g:3183:2: rule__MessageL__Group__1__Impl rule__MessageL__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:3190:1: rule__MessageL__Group__1__Impl : ( '(' ) ;
    public final void rule__MessageL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3194:1: ( ( '(' ) )
            // InternalMyDsl.g:3195:1: ( '(' )
            {
            // InternalMyDsl.g:3195:1: ( '(' )
            // InternalMyDsl.g:3196:2: '('
            {
             before(grammarAccess.getMessageLAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:3205:1: rule__MessageL__Group__2 : rule__MessageL__Group__2__Impl rule__MessageL__Group__3 ;
    public final void rule__MessageL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( rule__MessageL__Group__2__Impl rule__MessageL__Group__3 )
            // InternalMyDsl.g:3210:2: rule__MessageL__Group__2__Impl rule__MessageL__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:3217:1: rule__MessageL__Group__2__Impl : ( ( rule__MessageL__PayloadAssignment_2 )? ) ;
    public final void rule__MessageL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3221:1: ( ( ( rule__MessageL__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:3222:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:3222:1: ( ( rule__MessageL__PayloadAssignment_2 )? )
            // InternalMyDsl.g:3223:2: ( rule__MessageL__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageLAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:3224:2: ( rule__MessageL__PayloadAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=18 && LA17_0<=20)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:3224:3: rule__MessageL__PayloadAssignment_2
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
    // InternalMyDsl.g:3232:1: rule__MessageL__Group__3 : rule__MessageL__Group__3__Impl rule__MessageL__Group__4 ;
    public final void rule__MessageL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( rule__MessageL__Group__3__Impl rule__MessageL__Group__4 )
            // InternalMyDsl.g:3237:2: rule__MessageL__Group__3__Impl rule__MessageL__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3244:1: rule__MessageL__Group__3__Impl : ( ')' ) ;
    public final void rule__MessageL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3248:1: ( ( ')' ) )
            // InternalMyDsl.g:3249:1: ( ')' )
            {
            // InternalMyDsl.g:3249:1: ( ')' )
            // InternalMyDsl.g:3250:2: ')'
            {
             before(grammarAccess.getMessageLAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:3259:1: rule__MessageL__Group__4 : rule__MessageL__Group__4__Impl rule__MessageL__Group__5 ;
    public final void rule__MessageL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3263:1: ( rule__MessageL__Group__4__Impl rule__MessageL__Group__5 )
            // InternalMyDsl.g:3264:2: rule__MessageL__Group__4__Impl rule__MessageL__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:3271:1: rule__MessageL__Group__4__Impl : ( ( rule__MessageL__Alternatives_4 ) ) ;
    public final void rule__MessageL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3275:1: ( ( ( rule__MessageL__Alternatives_4 ) ) )
            // InternalMyDsl.g:3276:1: ( ( rule__MessageL__Alternatives_4 ) )
            {
            // InternalMyDsl.g:3276:1: ( ( rule__MessageL__Alternatives_4 ) )
            // InternalMyDsl.g:3277:2: ( rule__MessageL__Alternatives_4 )
            {
             before(grammarAccess.getMessageLAccess().getAlternatives_4()); 
            // InternalMyDsl.g:3278:2: ( rule__MessageL__Alternatives_4 )
            // InternalMyDsl.g:3278:3: rule__MessageL__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__MessageL__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getMessageLAccess().getAlternatives_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:3286:1: rule__MessageL__Group__5 : rule__MessageL__Group__5__Impl ;
    public final void rule__MessageL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( rule__MessageL__Group__5__Impl )
            // InternalMyDsl.g:3291:2: rule__MessageL__Group__5__Impl
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
    // InternalMyDsl.g:3297:1: rule__MessageL__Group__5__Impl : ( ';' ) ;
    public final void rule__MessageL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3301:1: ( ( ';' ) )
            // InternalMyDsl.g:3302:1: ( ';' )
            {
            // InternalMyDsl.g:3302:1: ( ';' )
            // InternalMyDsl.g:3303:2: ';'
            {
             before(grammarAccess.getMessageLAccess().getSemicolonKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMessageLAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:3313:1: rule__SenderL__Group__0 : rule__SenderL__Group__0__Impl rule__SenderL__Group__1 ;
    public final void rule__SenderL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( rule__SenderL__Group__0__Impl rule__SenderL__Group__1 )
            // InternalMyDsl.g:3318:2: rule__SenderL__Group__0__Impl rule__SenderL__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3325:1: rule__SenderL__Group__0__Impl : ( 'from' ) ;
    public final void rule__SenderL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3329:1: ( ( 'from' ) )
            // InternalMyDsl.g:3330:1: ( 'from' )
            {
            // InternalMyDsl.g:3330:1: ( 'from' )
            // InternalMyDsl.g:3331:2: 'from'
            {
             before(grammarAccess.getSenderLAccess().getFromKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:3340:1: rule__SenderL__Group__1 : rule__SenderL__Group__1__Impl ;
    public final void rule__SenderL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( rule__SenderL__Group__1__Impl )
            // InternalMyDsl.g:3345:2: rule__SenderL__Group__1__Impl
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
    // InternalMyDsl.g:3351:1: rule__SenderL__Group__1__Impl : ( ( rule__SenderL__SenderAssignment_1 ) ) ;
    public final void rule__SenderL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3355:1: ( ( ( rule__SenderL__SenderAssignment_1 ) ) )
            // InternalMyDsl.g:3356:1: ( ( rule__SenderL__SenderAssignment_1 ) )
            {
            // InternalMyDsl.g:3356:1: ( ( rule__SenderL__SenderAssignment_1 ) )
            // InternalMyDsl.g:3357:2: ( rule__SenderL__SenderAssignment_1 )
            {
             before(grammarAccess.getSenderLAccess().getSenderAssignment_1()); 
            // InternalMyDsl.g:3358:2: ( rule__SenderL__SenderAssignment_1 )
            // InternalMyDsl.g:3358:3: rule__SenderL__SenderAssignment_1
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
    // InternalMyDsl.g:3367:1: rule__ReceiverL__Group__0 : rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 ;
    public final void rule__ReceiverL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3371:1: ( rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1 )
            // InternalMyDsl.g:3372:2: rule__ReceiverL__Group__0__Impl rule__ReceiverL__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3379:1: rule__ReceiverL__Group__0__Impl : ( 'to' ) ;
    public final void rule__ReceiverL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3383:1: ( ( 'to' ) )
            // InternalMyDsl.g:3384:1: ( 'to' )
            {
            // InternalMyDsl.g:3384:1: ( 'to' )
            // InternalMyDsl.g:3385:2: 'to'
            {
             before(grammarAccess.getReceiverLAccess().getToKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:3394:1: rule__ReceiverL__Group__1 : rule__ReceiverL__Group__1__Impl ;
    public final void rule__ReceiverL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3398:1: ( rule__ReceiverL__Group__1__Impl )
            // InternalMyDsl.g:3399:2: rule__ReceiverL__Group__1__Impl
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
    // InternalMyDsl.g:3405:1: rule__ReceiverL__Group__1__Impl : ( ( rule__ReceiverL__ToAssignment_1 ) ) ;
    public final void rule__ReceiverL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3409:1: ( ( ( rule__ReceiverL__ToAssignment_1 ) ) )
            // InternalMyDsl.g:3410:1: ( ( rule__ReceiverL__ToAssignment_1 ) )
            {
            // InternalMyDsl.g:3410:1: ( ( rule__ReceiverL__ToAssignment_1 ) )
            // InternalMyDsl.g:3411:2: ( rule__ReceiverL__ToAssignment_1 )
            {
             before(grammarAccess.getReceiverLAccess().getToAssignment_1()); 
            // InternalMyDsl.g:3412:2: ( rule__ReceiverL__ToAssignment_1 )
            // InternalMyDsl.g:3412:3: rule__ReceiverL__ToAssignment_1
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
    // InternalMyDsl.g:3421:1: rule__ChoiceL__Group__0 : rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 ;
    public final void rule__ChoiceL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1 )
            // InternalMyDsl.g:3426:2: rule__ChoiceL__Group__0__Impl rule__ChoiceL__Group__1
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
    // InternalMyDsl.g:3433:1: rule__ChoiceL__Group__0__Impl : ( 'choice' ) ;
    public final void rule__ChoiceL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3437:1: ( ( 'choice' ) )
            // InternalMyDsl.g:3438:1: ( 'choice' )
            {
            // InternalMyDsl.g:3438:1: ( 'choice' )
            // InternalMyDsl.g:3439:2: 'choice'
            {
             before(grammarAccess.getChoiceLAccess().getChoiceKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:3448:1: rule__ChoiceL__Group__1 : rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 ;
    public final void rule__ChoiceL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2 )
            // InternalMyDsl.g:3453:2: rule__ChoiceL__Group__1__Impl rule__ChoiceL__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3460:1: rule__ChoiceL__Group__1__Impl : ( 'at' ) ;
    public final void rule__ChoiceL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3464:1: ( ( 'at' ) )
            // InternalMyDsl.g:3465:1: ( 'at' )
            {
            // InternalMyDsl.g:3465:1: ( 'at' )
            // InternalMyDsl.g:3466:2: 'at'
            {
             before(grammarAccess.getChoiceLAccess().getAtKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:3475:1: rule__ChoiceL__Group__2 : rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 ;
    public final void rule__ChoiceL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3 )
            // InternalMyDsl.g:3480:2: rule__ChoiceL__Group__2__Impl rule__ChoiceL__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3487:1: rule__ChoiceL__Group__2__Impl : ( ( rule__ChoiceL__RoleAssignment_2 ) ) ;
    public final void rule__ChoiceL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3491:1: ( ( ( rule__ChoiceL__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:3492:1: ( ( rule__ChoiceL__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:3492:1: ( ( rule__ChoiceL__RoleAssignment_2 ) )
            // InternalMyDsl.g:3493:2: ( rule__ChoiceL__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceLAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:3494:2: ( rule__ChoiceL__RoleAssignment_2 )
            // InternalMyDsl.g:3494:3: rule__ChoiceL__RoleAssignment_2
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
    // InternalMyDsl.g:3502:1: rule__ChoiceL__Group__3 : rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 ;
    public final void rule__ChoiceL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4 )
            // InternalMyDsl.g:3507:2: rule__ChoiceL__Group__3__Impl rule__ChoiceL__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:3514:1: rule__ChoiceL__Group__3__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3518:1: ( ( '{' ) )
            // InternalMyDsl.g:3519:1: ( '{' )
            {
            // InternalMyDsl.g:3519:1: ( '{' )
            // InternalMyDsl.g:3520:2: '{'
            {
             before(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:3529:1: rule__ChoiceL__Group__4 : rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 ;
    public final void rule__ChoiceL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5 )
            // InternalMyDsl.g:3534:2: rule__ChoiceL__Group__4__Impl rule__ChoiceL__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3541:1: rule__ChoiceL__Group__4__Impl : ( ( rule__ChoiceL__MessageAssignment_4 ) ) ;
    public final void rule__ChoiceL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3545:1: ( ( ( rule__ChoiceL__MessageAssignment_4 ) ) )
            // InternalMyDsl.g:3546:1: ( ( rule__ChoiceL__MessageAssignment_4 ) )
            {
            // InternalMyDsl.g:3546:1: ( ( rule__ChoiceL__MessageAssignment_4 ) )
            // InternalMyDsl.g:3547:2: ( rule__ChoiceL__MessageAssignment_4 )
            {
             before(grammarAccess.getChoiceLAccess().getMessageAssignment_4()); 
            // InternalMyDsl.g:3548:2: ( rule__ChoiceL__MessageAssignment_4 )
            // InternalMyDsl.g:3548:3: rule__ChoiceL__MessageAssignment_4
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
    // InternalMyDsl.g:3556:1: rule__ChoiceL__Group__5 : rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 ;
    public final void rule__ChoiceL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6 )
            // InternalMyDsl.g:3561:2: rule__ChoiceL__Group__5__Impl rule__ChoiceL__Group__6
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
    // InternalMyDsl.g:3568:1: rule__ChoiceL__Group__5__Impl : ( ( rule__ChoiceL__BranchesAssignment_5 ) ) ;
    public final void rule__ChoiceL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3572:1: ( ( ( rule__ChoiceL__BranchesAssignment_5 ) ) )
            // InternalMyDsl.g:3573:1: ( ( rule__ChoiceL__BranchesAssignment_5 ) )
            {
            // InternalMyDsl.g:3573:1: ( ( rule__ChoiceL__BranchesAssignment_5 ) )
            // InternalMyDsl.g:3574:2: ( rule__ChoiceL__BranchesAssignment_5 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_5()); 
            // InternalMyDsl.g:3575:2: ( rule__ChoiceL__BranchesAssignment_5 )
            // InternalMyDsl.g:3575:3: rule__ChoiceL__BranchesAssignment_5
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
    // InternalMyDsl.g:3583:1: rule__ChoiceL__Group__6 : rule__ChoiceL__Group__6__Impl rule__ChoiceL__Group__7 ;
    public final void rule__ChoiceL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( rule__ChoiceL__Group__6__Impl rule__ChoiceL__Group__7 )
            // InternalMyDsl.g:3588:2: rule__ChoiceL__Group__6__Impl rule__ChoiceL__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:3595:1: rule__ChoiceL__Group__6__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3599:1: ( ( '}' ) )
            // InternalMyDsl.g:3600:1: ( '}' )
            {
            // InternalMyDsl.g:3600:1: ( '}' )
            // InternalMyDsl.g:3601:2: '}'
            {
             before(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:3610:1: rule__ChoiceL__Group__7 : rule__ChoiceL__Group__7__Impl ;
    public final void rule__ChoiceL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( rule__ChoiceL__Group__7__Impl )
            // InternalMyDsl.g:3615:2: rule__ChoiceL__Group__7__Impl
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
    // InternalMyDsl.g:3621:1: rule__ChoiceL__Group__7__Impl : ( ( rule__ChoiceL__Group_7__0 )* ) ;
    public final void rule__ChoiceL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3625:1: ( ( ( rule__ChoiceL__Group_7__0 )* ) )
            // InternalMyDsl.g:3626:1: ( ( rule__ChoiceL__Group_7__0 )* )
            {
            // InternalMyDsl.g:3626:1: ( ( rule__ChoiceL__Group_7__0 )* )
            // InternalMyDsl.g:3627:2: ( rule__ChoiceL__Group_7__0 )*
            {
             before(grammarAccess.getChoiceLAccess().getGroup_7()); 
            // InternalMyDsl.g:3628:2: ( rule__ChoiceL__Group_7__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:3628:3: rule__ChoiceL__Group_7__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3637:1: rule__ChoiceL__Group_7__0 : rule__ChoiceL__Group_7__0__Impl rule__ChoiceL__Group_7__1 ;
    public final void rule__ChoiceL__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( rule__ChoiceL__Group_7__0__Impl rule__ChoiceL__Group_7__1 )
            // InternalMyDsl.g:3642:2: rule__ChoiceL__Group_7__0__Impl rule__ChoiceL__Group_7__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3649:1: rule__ChoiceL__Group_7__0__Impl : ( 'or' ) ;
    public final void rule__ChoiceL__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3653:1: ( ( 'or' ) )
            // InternalMyDsl.g:3654:1: ( 'or' )
            {
            // InternalMyDsl.g:3654:1: ( 'or' )
            // InternalMyDsl.g:3655:2: 'or'
            {
             before(grammarAccess.getChoiceLAccess().getOrKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:3664:1: rule__ChoiceL__Group_7__1 : rule__ChoiceL__Group_7__1__Impl rule__ChoiceL__Group_7__2 ;
    public final void rule__ChoiceL__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3668:1: ( rule__ChoiceL__Group_7__1__Impl rule__ChoiceL__Group_7__2 )
            // InternalMyDsl.g:3669:2: rule__ChoiceL__Group_7__1__Impl rule__ChoiceL__Group_7__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:3676:1: rule__ChoiceL__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ChoiceL__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3680:1: ( ( '{' ) )
            // InternalMyDsl.g:3681:1: ( '{' )
            {
            // InternalMyDsl.g:3681:1: ( '{' )
            // InternalMyDsl.g:3682:2: '{'
            {
             before(grammarAccess.getChoiceLAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:3691:1: rule__ChoiceL__Group_7__2 : rule__ChoiceL__Group_7__2__Impl rule__ChoiceL__Group_7__3 ;
    public final void rule__ChoiceL__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( rule__ChoiceL__Group_7__2__Impl rule__ChoiceL__Group_7__3 )
            // InternalMyDsl.g:3696:2: rule__ChoiceL__Group_7__2__Impl rule__ChoiceL__Group_7__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3703:1: rule__ChoiceL__Group_7__2__Impl : ( ( rule__ChoiceL__MessageAssignment_7_2 ) ) ;
    public final void rule__ChoiceL__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3707:1: ( ( ( rule__ChoiceL__MessageAssignment_7_2 ) ) )
            // InternalMyDsl.g:3708:1: ( ( rule__ChoiceL__MessageAssignment_7_2 ) )
            {
            // InternalMyDsl.g:3708:1: ( ( rule__ChoiceL__MessageAssignment_7_2 ) )
            // InternalMyDsl.g:3709:2: ( rule__ChoiceL__MessageAssignment_7_2 )
            {
             before(grammarAccess.getChoiceLAccess().getMessageAssignment_7_2()); 
            // InternalMyDsl.g:3710:2: ( rule__ChoiceL__MessageAssignment_7_2 )
            // InternalMyDsl.g:3710:3: rule__ChoiceL__MessageAssignment_7_2
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
    // InternalMyDsl.g:3718:1: rule__ChoiceL__Group_7__3 : rule__ChoiceL__Group_7__3__Impl rule__ChoiceL__Group_7__4 ;
    public final void rule__ChoiceL__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3722:1: ( rule__ChoiceL__Group_7__3__Impl rule__ChoiceL__Group_7__4 )
            // InternalMyDsl.g:3723:2: rule__ChoiceL__Group_7__3__Impl rule__ChoiceL__Group_7__4
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
    // InternalMyDsl.g:3730:1: rule__ChoiceL__Group_7__3__Impl : ( ( rule__ChoiceL__BranchesAssignment_7_3 ) ) ;
    public final void rule__ChoiceL__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3734:1: ( ( ( rule__ChoiceL__BranchesAssignment_7_3 ) ) )
            // InternalMyDsl.g:3735:1: ( ( rule__ChoiceL__BranchesAssignment_7_3 ) )
            {
            // InternalMyDsl.g:3735:1: ( ( rule__ChoiceL__BranchesAssignment_7_3 ) )
            // InternalMyDsl.g:3736:2: ( rule__ChoiceL__BranchesAssignment_7_3 )
            {
             before(grammarAccess.getChoiceLAccess().getBranchesAssignment_7_3()); 
            // InternalMyDsl.g:3737:2: ( rule__ChoiceL__BranchesAssignment_7_3 )
            // InternalMyDsl.g:3737:3: rule__ChoiceL__BranchesAssignment_7_3
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
    // InternalMyDsl.g:3745:1: rule__ChoiceL__Group_7__4 : rule__ChoiceL__Group_7__4__Impl ;
    public final void rule__ChoiceL__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( rule__ChoiceL__Group_7__4__Impl )
            // InternalMyDsl.g:3750:2: rule__ChoiceL__Group_7__4__Impl
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
    // InternalMyDsl.g:3756:1: rule__ChoiceL__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ChoiceL__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3760:1: ( ( '}' ) )
            // InternalMyDsl.g:3761:1: ( '}' )
            {
            // InternalMyDsl.g:3761:1: ( '}' )
            // InternalMyDsl.g:3762:2: '}'
            {
             before(grammarAccess.getChoiceLAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__RecursionL__Group__0"
    // InternalMyDsl.g:3772:1: rule__RecursionL__Group__0 : rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 ;
    public final void rule__RecursionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1 )
            // InternalMyDsl.g:3777:2: rule__RecursionL__Group__0__Impl rule__RecursionL__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:3784:1: rule__RecursionL__Group__0__Impl : ( 'rec' ) ;
    public final void rule__RecursionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3788:1: ( ( 'rec' ) )
            // InternalMyDsl.g:3789:1: ( 'rec' )
            {
            // InternalMyDsl.g:3789:1: ( 'rec' )
            // InternalMyDsl.g:3790:2: 'rec'
            {
             before(grammarAccess.getRecursionLAccess().getRecKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:3799:1: rule__RecursionL__Group__1 : rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 ;
    public final void rule__RecursionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2 )
            // InternalMyDsl.g:3804:2: rule__RecursionL__Group__1__Impl rule__RecursionL__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:3811:1: rule__RecursionL__Group__1__Impl : ( ( rule__RecursionL__NameAssignment_1 ) ) ;
    public final void rule__RecursionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3815:1: ( ( ( rule__RecursionL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3816:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3816:1: ( ( rule__RecursionL__NameAssignment_1 ) )
            // InternalMyDsl.g:3817:2: ( rule__RecursionL__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3818:2: ( rule__RecursionL__NameAssignment_1 )
            // InternalMyDsl.g:3818:3: rule__RecursionL__NameAssignment_1
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
    // InternalMyDsl.g:3826:1: rule__RecursionL__Group__2 : rule__RecursionL__Group__2__Impl ;
    public final void rule__RecursionL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( rule__RecursionL__Group__2__Impl )
            // InternalMyDsl.g:3831:2: rule__RecursionL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecursionL__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3837:1: rule__RecursionL__Group__2__Impl : ( ':' ) ;
    public final void rule__RecursionL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3841:1: ( ( ':' ) )
            // InternalMyDsl.g:3842:1: ( ':' )
            {
            // InternalMyDsl.g:3842:1: ( ':' )
            // InternalMyDsl.g:3843:2: ':'
            {
             before(grammarAccess.getRecursionLAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__CloseRecursionL__Group__0"
    // InternalMyDsl.g:3853:1: rule__CloseRecursionL__Group__0 : rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1 ;
    public final void rule__CloseRecursionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1 )
            // InternalMyDsl.g:3858:2: rule__CloseRecursionL__Group__0__Impl rule__CloseRecursionL__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:3865:1: rule__CloseRecursionL__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3869:1: ( ( 'loop' ) )
            // InternalMyDsl.g:3870:1: ( 'loop' )
            {
            // InternalMyDsl.g:3870:1: ( 'loop' )
            // InternalMyDsl.g:3871:2: 'loop'
            {
             before(grammarAccess.getCloseRecursionLAccess().getLoopKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:3880:1: rule__CloseRecursionL__Group__1 : rule__CloseRecursionL__Group__1__Impl rule__CloseRecursionL__Group__2 ;
    public final void rule__CloseRecursionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3884:1: ( rule__CloseRecursionL__Group__1__Impl rule__CloseRecursionL__Group__2 )
            // InternalMyDsl.g:3885:2: rule__CloseRecursionL__Group__1__Impl rule__CloseRecursionL__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__CloseRecursionL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CloseRecursionL__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3892:1: rule__CloseRecursionL__Group__1__Impl : ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3896:1: ( ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:3897:1: ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:3897:1: ( ( rule__CloseRecursionL__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:3898:2: ( rule__CloseRecursionL__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionLAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:3899:2: ( rule__CloseRecursionL__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:3899:3: rule__CloseRecursionL__RecursionVariableAssignment_1
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


    // $ANTLR start "rule__CloseRecursionL__Group__2"
    // InternalMyDsl.g:3907:1: rule__CloseRecursionL__Group__2 : rule__CloseRecursionL__Group__2__Impl ;
    public final void rule__CloseRecursionL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( rule__CloseRecursionL__Group__2__Impl )
            // InternalMyDsl.g:3912:2: rule__CloseRecursionL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursionL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursionL__Group__2"


    // $ANTLR start "rule__CloseRecursionL__Group__2__Impl"
    // InternalMyDsl.g:3918:1: rule__CloseRecursionL__Group__2__Impl : ( ';' ) ;
    public final void rule__CloseRecursionL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3922:1: ( ( ';' ) )
            // InternalMyDsl.g:3923:1: ( ';' )
            {
            // InternalMyDsl.g:3923:1: ( ';' )
            // InternalMyDsl.g:3924:2: ';'
            {
             before(grammarAccess.getCloseRecursionLAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionLAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseRecursionL__Group__2__Impl"


    // $ANTLR start "rule__EndInteractionL__Group__0"
    // InternalMyDsl.g:3934:1: rule__EndInteractionL__Group__0 : rule__EndInteractionL__Group__0__Impl rule__EndInteractionL__Group__1 ;
    public final void rule__EndInteractionL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( rule__EndInteractionL__Group__0__Impl rule__EndInteractionL__Group__1 )
            // InternalMyDsl.g:3939:2: rule__EndInteractionL__Group__0__Impl rule__EndInteractionL__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EndInteractionL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndInteractionL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndInteractionL__Group__0"


    // $ANTLR start "rule__EndInteractionL__Group__0__Impl"
    // InternalMyDsl.g:3946:1: rule__EndInteractionL__Group__0__Impl : ( 'end' ) ;
    public final void rule__EndInteractionL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3950:1: ( ( 'end' ) )
            // InternalMyDsl.g:3951:1: ( 'end' )
            {
            // InternalMyDsl.g:3951:1: ( 'end' )
            // InternalMyDsl.g:3952:2: 'end'
            {
             before(grammarAccess.getEndInteractionLAccess().getEndKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEndInteractionLAccess().getEndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndInteractionL__Group__0__Impl"


    // $ANTLR start "rule__EndInteractionL__Group__1"
    // InternalMyDsl.g:3961:1: rule__EndInteractionL__Group__1 : rule__EndInteractionL__Group__1__Impl ;
    public final void rule__EndInteractionL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( rule__EndInteractionL__Group__1__Impl )
            // InternalMyDsl.g:3966:2: rule__EndInteractionL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndInteractionL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndInteractionL__Group__1"


    // $ANTLR start "rule__EndInteractionL__Group__1__Impl"
    // InternalMyDsl.g:3972:1: rule__EndInteractionL__Group__1__Impl : ( ';' ) ;
    public final void rule__EndInteractionL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3976:1: ( ( ';' ) )
            // InternalMyDsl.g:3977:1: ( ';' )
            {
            // InternalMyDsl.g:3977:1: ( ';' )
            // InternalMyDsl.g:3978:2: ';'
            {
             before(grammarAccess.getEndInteractionLAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEndInteractionLAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndInteractionL__Group__1__Impl"


    // $ANTLR start "rule__EndInteraction__Group__0"
    // InternalMyDsl.g:3988:1: rule__EndInteraction__Group__0 : rule__EndInteraction__Group__0__Impl rule__EndInteraction__Group__1 ;
    public final void rule__EndInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3992:1: ( rule__EndInteraction__Group__0__Impl rule__EndInteraction__Group__1 )
            // InternalMyDsl.g:3993:2: rule__EndInteraction__Group__0__Impl rule__EndInteraction__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EndInteraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndInteraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndInteraction__Group__0"


    // $ANTLR start "rule__EndInteraction__Group__0__Impl"
    // InternalMyDsl.g:4000:1: rule__EndInteraction__Group__0__Impl : ( 'end' ) ;
    public final void rule__EndInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4004:1: ( ( 'end' ) )
            // InternalMyDsl.g:4005:1: ( 'end' )
            {
            // InternalMyDsl.g:4005:1: ( 'end' )
            // InternalMyDsl.g:4006:2: 'end'
            {
             before(grammarAccess.getEndInteractionAccess().getEndKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEndInteractionAccess().getEndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndInteraction__Group__0__Impl"


    // $ANTLR start "rule__EndInteraction__Group__1"
    // InternalMyDsl.g:4015:1: rule__EndInteraction__Group__1 : rule__EndInteraction__Group__1__Impl ;
    public final void rule__EndInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( rule__EndInteraction__Group__1__Impl )
            // InternalMyDsl.g:4020:2: rule__EndInteraction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndInteraction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndInteraction__Group__1"


    // $ANTLR start "rule__EndInteraction__Group__1__Impl"
    // InternalMyDsl.g:4026:1: rule__EndInteraction__Group__1__Impl : ( ';' ) ;
    public final void rule__EndInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4030:1: ( ( ';' ) )
            // InternalMyDsl.g:4031:1: ( ';' )
            {
            // InternalMyDsl.g:4031:1: ( ';' )
            // InternalMyDsl.g:4032:2: ';'
            {
             before(grammarAccess.getEndInteractionAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEndInteractionAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndInteraction__Group__1__Impl"


    // $ANTLR start "rule__Model__ProtocolAssignment_0"
    // InternalMyDsl.g:4042:1: rule__Model__ProtocolAssignment_0 : ( ruleGlobalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4046:1: ( ( ruleGlobalProtocol ) )
            // InternalMyDsl.g:4047:2: ( ruleGlobalProtocol )
            {
            // InternalMyDsl.g:4047:2: ( ruleGlobalProtocol )
            // InternalMyDsl.g:4048:3: ruleGlobalProtocol
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
    // InternalMyDsl.g:4057:1: rule__Model__ProtocolAssignment_1 : ( ruleLocalProtocol ) ;
    public final void rule__Model__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4061:1: ( ( ruleLocalProtocol ) )
            // InternalMyDsl.g:4062:2: ( ruleLocalProtocol )
            {
            // InternalMyDsl.g:4062:2: ( ruleLocalProtocol )
            // InternalMyDsl.g:4063:3: ruleLocalProtocol
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
    // InternalMyDsl.g:4072:1: rule__GlobalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4076:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4077:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4077:2: ( RULE_ID )
            // InternalMyDsl.g:4078:3: RULE_ID
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
    // InternalMyDsl.g:4087:1: rule__GlobalProtocol__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__GlobalProtocol__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4091:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:4092:2: ( ruleRoles )
            {
            // InternalMyDsl.g:4092:2: ( ruleRoles )
            // InternalMyDsl.g:4093:3: ruleRoles
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
    // InternalMyDsl.g:4102:1: rule__GlobalProtocol__ProtocolAssignment_6 : ( ruleProtocol ) ;
    public final void rule__GlobalProtocol__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4106:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4107:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4107:2: ( ruleProtocol )
            // InternalMyDsl.g:4108:3: ruleProtocol
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
    // InternalMyDsl.g:4117:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4121:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4122:2: ( ruleRole )
            {
            // InternalMyDsl.g:4122:2: ( ruleRole )
            // InternalMyDsl.g:4123:3: ruleRole
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
    // InternalMyDsl.g:4132:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4136:1: ( ( ruleRole ) )
            // InternalMyDsl.g:4137:2: ( ruleRole )
            {
            // InternalMyDsl.g:4137:2: ( ruleRole )
            // InternalMyDsl.g:4138:3: ruleRole
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
    // InternalMyDsl.g:4147:1: rule__RoleOne__NameAssignment_1 : ( RULE_ROLENAME ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4151:1: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:4152:2: ( RULE_ROLENAME )
            {
            // InternalMyDsl.g:4152:2: ( RULE_ROLENAME )
            // InternalMyDsl.g:4153:3: RULE_ROLENAME
            {
             before(grammarAccess.getRoleOneAccess().getNameROLENAMETerminalRuleCall_1_0()); 
            match(input,RULE_ROLENAME,FOLLOW_2); 
             after(grammarAccess.getRoleOneAccess().getNameROLENAMETerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__RoleMultiple__NameAssignment_1"
    // InternalMyDsl.g:4162:1: rule__RoleMultiple__NameAssignment_1 : ( RULE_ROLENAME ) ;
    public final void rule__RoleMultiple__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4166:1: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:4167:2: ( RULE_ROLENAME )
            {
            // InternalMyDsl.g:4167:2: ( RULE_ROLENAME )
            // InternalMyDsl.g:4168:3: RULE_ROLENAME
            {
             before(grammarAccess.getRoleMultipleAccess().getNameROLENAMETerminalRuleCall_1_0()); 
            match(input,RULE_ROLENAME,FOLLOW_2); 
             after(grammarAccess.getRoleMultipleAccess().getNameROLENAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleMultiple__NameAssignment_1"


    // $ANTLR start "rule__RoleMultiple__RefAssignment_3"
    // InternalMyDsl.g:4177:1: rule__RoleMultiple__RefAssignment_3 : ( ( RULE_ROLENAME ) ) ;
    public final void rule__RoleMultiple__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( ( ( RULE_ROLENAME ) ) )
            // InternalMyDsl.g:4182:2: ( ( RULE_ROLENAME ) )
            {
            // InternalMyDsl.g:4182:2: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:4183:3: ( RULE_ROLENAME )
            {
             before(grammarAccess.getRoleMultipleAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:4184:3: ( RULE_ROLENAME )
            // InternalMyDsl.g:4185:4: RULE_ROLENAME
            {
             before(grammarAccess.getRoleMultipleAccess().getRefRoleOneROLENAMETerminalRuleCall_3_0_1()); 
            match(input,RULE_ROLENAME,FOLLOW_2); 
             after(grammarAccess.getRoleMultipleAccess().getRefRoleOneROLENAMETerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRoleMultipleAccess().getRefRoleOneCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleMultiple__RefAssignment_3"


    // $ANTLR start "rule__Protocol__ActionsAssignment_0_1"
    // InternalMyDsl.g:4196:1: rule__Protocol__ActionsAssignment_0_1 : ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) ) ;
    public final void rule__Protocol__ActionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4200:1: ( ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) ) )
            // InternalMyDsl.g:4201:2: ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) )
            {
            // InternalMyDsl.g:4201:2: ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) )
            // InternalMyDsl.g:4202:3: ( rule__Protocol__ActionsAlternatives_0_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getActionsAlternatives_0_1_0()); 
            // InternalMyDsl.g:4203:3: ( rule__Protocol__ActionsAlternatives_0_1_0 )
            // InternalMyDsl.g:4203:4: rule__Protocol__ActionsAlternatives_0_1_0
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


    // $ANTLR start "rule__Recursion__NameAssignment_1"
    // InternalMyDsl.g:4211:1: rule__Recursion__NameAssignment_1 : ( RULE_RECNAME ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4215:1: ( ( RULE_RECNAME ) )
            // InternalMyDsl.g:4216:2: ( RULE_RECNAME )
            {
            // InternalMyDsl.g:4216:2: ( RULE_RECNAME )
            // InternalMyDsl.g:4217:3: RULE_RECNAME
            {
             before(grammarAccess.getRecursionAccess().getNameRECNAMETerminalRuleCall_1_0()); 
            match(input,RULE_RECNAME,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getNameRECNAMETerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4226:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_RECNAME ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4230:1: ( ( ( RULE_RECNAME ) ) )
            // InternalMyDsl.g:4231:2: ( ( RULE_RECNAME ) )
            {
            // InternalMyDsl.g:4231:2: ( ( RULE_RECNAME ) )
            // InternalMyDsl.g:4232:3: ( RULE_RECNAME )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalMyDsl.g:4233:3: ( RULE_RECNAME )
            // InternalMyDsl.g:4234:4: RULE_RECNAME
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionRECNAMETerminalRuleCall_1_0_1()); 
            match(input,RULE_RECNAME,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionRECNAMETerminalRuleCall_1_0_1()); 

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
    // InternalMyDsl.g:4245:1: rule__ForEach__EachRoleAssignment_1 : ( ruleRoleOne ) ;
    public final void rule__ForEach__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4249:1: ( ( ruleRoleOne ) )
            // InternalMyDsl.g:4250:2: ( ruleRoleOne )
            {
            // InternalMyDsl.g:4250:2: ( ruleRoleOne )
            // InternalMyDsl.g:4251:3: ruleRoleOne
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
    // InternalMyDsl.g:4260:1: rule__ForEach__RoleAssignment_3 : ( ( RULE_ROLENAME ) ) ;
    public final void rule__ForEach__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4264:1: ( ( ( RULE_ROLENAME ) ) )
            // InternalMyDsl.g:4265:2: ( ( RULE_ROLENAME ) )
            {
            // InternalMyDsl.g:4265:2: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:4266:3: ( RULE_ROLENAME )
            {
             before(grammarAccess.getForEachAccess().getRoleRoleMultipleCrossReference_3_0()); 
            // InternalMyDsl.g:4267:3: ( RULE_ROLENAME )
            // InternalMyDsl.g:4268:4: RULE_ROLENAME
            {
             before(grammarAccess.getForEachAccess().getRoleRoleMultipleROLENAMETerminalRuleCall_3_0_1()); 
            match(input,RULE_ROLENAME,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRoleRoleMultipleROLENAMETerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getForEachAccess().getRoleRoleMultipleCrossReference_3_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4279:1: rule__ForEach__BranchAssignment_5 : ( ruleProtocol ) ;
    public final void rule__ForEach__BranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4283:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4284:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4284:2: ( ruleProtocol )
            // InternalMyDsl.g:4285:3: ruleProtocol
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
    // InternalMyDsl.g:4294:1: rule__Choice__RoleAssignment_2 : ( ( RULE_ROLENAME ) ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4298:1: ( ( ( RULE_ROLENAME ) ) )
            // InternalMyDsl.g:4299:2: ( ( RULE_ROLENAME ) )
            {
            // InternalMyDsl.g:4299:2: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:4300:3: ( RULE_ROLENAME )
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 
            // InternalMyDsl.g:4301:3: ( RULE_ROLENAME )
            // InternalMyDsl.g:4302:4: RULE_ROLENAME
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneROLENAMETerminalRuleCall_2_0_1()); 
            match(input,RULE_ROLENAME,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getRoleRoleOneROLENAMETerminalRuleCall_2_0_1()); 

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
    // InternalMyDsl.g:4313:1: rule__Choice__MessageAssignment_4 : ( ruleMessage ) ;
    public final void rule__Choice__MessageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4317:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4318:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4318:2: ( ruleMessage )
            // InternalMyDsl.g:4319:3: ruleMessage
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
    // InternalMyDsl.g:4328:1: rule__Choice__BranchesAssignment_5 : ( ruleProtocol ) ;
    public final void rule__Choice__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4332:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4333:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4333:2: ( ruleProtocol )
            // InternalMyDsl.g:4334:3: ruleProtocol
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
    // InternalMyDsl.g:4343:1: rule__Choice__MessageAssignment_7_2 : ( ruleMessage ) ;
    public final void rule__Choice__MessageAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4347:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4348:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4348:2: ( ruleMessage )
            // InternalMyDsl.g:4349:3: ruleMessage
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
    // InternalMyDsl.g:4358:1: rule__Choice__BranchesAssignment_7_3 : ( ruleProtocol ) ;
    public final void rule__Choice__BranchesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4362:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:4363:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:4363:2: ( ruleProtocol )
            // InternalMyDsl.g:4364:3: ruleProtocol
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
    // InternalMyDsl.g:4373:1: rule__Message__MessageTypeAssignment_0 : ( ruleMessageType ) ;
    public final void rule__Message__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4377:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:4378:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:4378:2: ( ruleMessageType )
            // InternalMyDsl.g:4379:3: ruleMessageType
            {
             before(grammarAccess.getMessageAccess().getMessageTypeMessageTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getMessageTypeMessageTypeParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4388:1: rule__Message__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__Message__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4392:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4393:2: ( rulePayload )
            {
            // InternalMyDsl.g:4393:2: ( rulePayload )
            // InternalMyDsl.g:4394:3: rulePayload
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
    // InternalMyDsl.g:4403:1: rule__Message__SenderAssignment_5 : ( ( RULE_ROLENAME ) ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4407:1: ( ( ( RULE_ROLENAME ) ) )
            // InternalMyDsl.g:4408:2: ( ( RULE_ROLENAME ) )
            {
            // InternalMyDsl.g:4408:2: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:4409:3: ( RULE_ROLENAME )
            {
             before(grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0()); 
            // InternalMyDsl.g:4410:3: ( RULE_ROLENAME )
            // InternalMyDsl.g:4411:4: RULE_ROLENAME
            {
             before(grammarAccess.getMessageAccess().getSenderRoleOneROLENAMETerminalRuleCall_5_0_1()); 
            match(input,RULE_ROLENAME,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getSenderRoleOneROLENAMETerminalRuleCall_5_0_1()); 

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
    // InternalMyDsl.g:4422:1: rule__Message__ReceiverAssignment_7 : ( ( RULE_ROLENAME ) ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4426:1: ( ( ( RULE_ROLENAME ) ) )
            // InternalMyDsl.g:4427:2: ( ( RULE_ROLENAME ) )
            {
            // InternalMyDsl.g:4427:2: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:4428:3: ( RULE_ROLENAME )
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleOneCrossReference_7_0()); 
            // InternalMyDsl.g:4429:3: ( RULE_ROLENAME )
            // InternalMyDsl.g:4430:4: RULE_ROLENAME
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleOneROLENAMETerminalRuleCall_7_0_1()); 
            match(input,RULE_ROLENAME,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getReceiverRoleOneROLENAMETerminalRuleCall_7_0_1()); 

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


    // $ANTLR start "rule__Payload__TypesAssignment_1_0"
    // InternalMyDsl.g:4441:1: rule__Payload__TypesAssignment_1_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4445:1: ( ( ruleType ) )
            // InternalMyDsl.g:4446:2: ( ruleType )
            {
            // InternalMyDsl.g:4446:2: ( ruleType )
            // InternalMyDsl.g:4447:3: ruleType
            {
             before(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__TypesAssignment_1_0"


    // $ANTLR start "rule__Payload__TypesAssignment_1_1_1"
    // InternalMyDsl.g:4456:1: rule__Payload__TypesAssignment_1_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4460:1: ( ( ruleType ) )
            // InternalMyDsl.g:4461:2: ( ruleType )
            {
            // InternalMyDsl.g:4461:2: ( ruleType )
            // InternalMyDsl.g:4462:3: ruleType
            {
             before(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__TypesAssignment_1_1_1"


    // $ANTLR start "rule__LocalProtocol__ProtocolNameAssignment_2"
    // InternalMyDsl.g:4471:1: rule__LocalProtocol__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalProtocol__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4475:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4476:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4476:2: ( RULE_ID )
            // InternalMyDsl.g:4477:3: RULE_ID
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


    // $ANTLR start "rule__LocalProtocol__ProjectedRoleAssignment_5"
    // InternalMyDsl.g:4486:1: rule__LocalProtocol__ProjectedRoleAssignment_5 : ( RULE_ROLENAME ) ;
    public final void rule__LocalProtocol__ProjectedRoleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4490:1: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:4491:2: ( RULE_ROLENAME )
            {
            // InternalMyDsl.g:4491:2: ( RULE_ROLENAME )
            // InternalMyDsl.g:4492:3: RULE_ROLENAME
            {
             before(grammarAccess.getLocalProtocolAccess().getProjectedRoleROLENAMETerminalRuleCall_5_0()); 
            match(input,RULE_ROLENAME,FOLLOW_2); 
             after(grammarAccess.getLocalProtocolAccess().getProjectedRoleROLENAMETerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__ProjectedRoleAssignment_5"


    // $ANTLR start "rule__LocalProtocol__RolesAssignment_7"
    // InternalMyDsl.g:4501:1: rule__LocalProtocol__RolesAssignment_7 : ( ruleRolesL ) ;
    public final void rule__LocalProtocol__RolesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4505:1: ( ( ruleRolesL ) )
            // InternalMyDsl.g:4506:2: ( ruleRolesL )
            {
            // InternalMyDsl.g:4506:2: ( ruleRolesL )
            // InternalMyDsl.g:4507:3: ruleRolesL
            {
             before(grammarAccess.getLocalProtocolAccess().getRolesRolesLParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRolesL();

            state._fsp--;

             after(grammarAccess.getLocalProtocolAccess().getRolesRolesLParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__RolesAssignment_7"


    // $ANTLR start "rule__LocalProtocol__ProtocolAssignment_10"
    // InternalMyDsl.g:4516:1: rule__LocalProtocol__ProtocolAssignment_10 : ( ruleProtocolL ) ;
    public final void rule__LocalProtocol__ProtocolAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4520:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4521:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4521:2: ( ruleProtocolL )
            // InternalMyDsl.g:4522:3: ruleProtocolL
            {
             before(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolL();

            state._fsp--;

             after(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalProtocol__ProtocolAssignment_10"


    // $ANTLR start "rule__RolesL__RolesAssignment_0"
    // InternalMyDsl.g:4531:1: rule__RolesL__RolesAssignment_0 : ( ruleRoleL ) ;
    public final void rule__RolesL__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4535:1: ( ( ruleRoleL ) )
            // InternalMyDsl.g:4536:2: ( ruleRoleL )
            {
            // InternalMyDsl.g:4536:2: ( ruleRoleL )
            // InternalMyDsl.g:4537:3: ruleRoleL
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
    // InternalMyDsl.g:4546:1: rule__RolesL__RolesAssignment_1_1 : ( ruleRoleL ) ;
    public final void rule__RolesL__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4550:1: ( ( ruleRoleL ) )
            // InternalMyDsl.g:4551:2: ( ruleRoleL )
            {
            // InternalMyDsl.g:4551:2: ( ruleRoleL )
            // InternalMyDsl.g:4552:3: ruleRoleL
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


    // $ANTLR start "rule__RoleL__NameAssignment_1"
    // InternalMyDsl.g:4561:1: rule__RoleL__NameAssignment_1 : ( RULE_ROLENAME_L ) ;
    public final void rule__RoleL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4565:1: ( ( RULE_ROLENAME_L ) )
            // InternalMyDsl.g:4566:2: ( RULE_ROLENAME_L )
            {
            // InternalMyDsl.g:4566:2: ( RULE_ROLENAME_L )
            // InternalMyDsl.g:4567:3: RULE_ROLENAME_L
            {
             before(grammarAccess.getRoleLAccess().getNameROLENAME_LTerminalRuleCall_1_0()); 
            match(input,RULE_ROLENAME_L,FOLLOW_2); 
             after(grammarAccess.getRoleLAccess().getNameROLENAME_LTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleL__NameAssignment_1"


    // $ANTLR start "rule__ProtocolL__ActionsAssignment_0_1"
    // InternalMyDsl.g:4576:1: rule__ProtocolL__ActionsAssignment_0_1 : ( ( rule__ProtocolL__ActionsAlternatives_0_1_0 ) ) ;
    public final void rule__ProtocolL__ActionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4580:1: ( ( ( rule__ProtocolL__ActionsAlternatives_0_1_0 ) ) )
            // InternalMyDsl.g:4581:2: ( ( rule__ProtocolL__ActionsAlternatives_0_1_0 ) )
            {
            // InternalMyDsl.g:4581:2: ( ( rule__ProtocolL__ActionsAlternatives_0_1_0 ) )
            // InternalMyDsl.g:4582:3: ( rule__ProtocolL__ActionsAlternatives_0_1_0 )
            {
             before(grammarAccess.getProtocolLAccess().getActionsAlternatives_0_1_0()); 
            // InternalMyDsl.g:4583:3: ( rule__ProtocolL__ActionsAlternatives_0_1_0 )
            // InternalMyDsl.g:4583:4: rule__ProtocolL__ActionsAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolL__ActionsAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolLAccess().getActionsAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolL__ActionsAssignment_0_1"


    // $ANTLR start "rule__MessageL__MessageTypeAssignment_0"
    // InternalMyDsl.g:4591:1: rule__MessageL__MessageTypeAssignment_0 : ( ruleMessageType ) ;
    public final void rule__MessageL__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4595:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:4596:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:4596:2: ( ruleMessageType )
            // InternalMyDsl.g:4597:3: ruleMessageType
            {
             before(grammarAccess.getMessageLAccess().getMessageTypeMessageTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageLAccess().getMessageTypeMessageTypeParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4606:1: rule__MessageL__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__MessageL__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4610:1: ( ( rulePayload ) )
            // InternalMyDsl.g:4611:2: ( rulePayload )
            {
            // InternalMyDsl.g:4611:2: ( rulePayload )
            // InternalMyDsl.g:4612:3: rulePayload
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


    // $ANTLR start "rule__MessageL__TargetAssignment_4_0"
    // InternalMyDsl.g:4621:1: rule__MessageL__TargetAssignment_4_0 : ( ruleSenderL ) ;
    public final void rule__MessageL__TargetAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4625:1: ( ( ruleSenderL ) )
            // InternalMyDsl.g:4626:2: ( ruleSenderL )
            {
            // InternalMyDsl.g:4626:2: ( ruleSenderL )
            // InternalMyDsl.g:4627:3: ruleSenderL
            {
             before(grammarAccess.getMessageLAccess().getTargetSenderLParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSenderL();

            state._fsp--;

             after(grammarAccess.getMessageLAccess().getTargetSenderLParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__TargetAssignment_4_0"


    // $ANTLR start "rule__MessageL__TargetAssignment_4_1"
    // InternalMyDsl.g:4636:1: rule__MessageL__TargetAssignment_4_1 : ( ruleReceiverL ) ;
    public final void rule__MessageL__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4640:1: ( ( ruleReceiverL ) )
            // InternalMyDsl.g:4641:2: ( ruleReceiverL )
            {
            // InternalMyDsl.g:4641:2: ( ruleReceiverL )
            // InternalMyDsl.g:4642:3: ruleReceiverL
            {
             before(grammarAccess.getMessageLAccess().getTargetReceiverLParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReceiverL();

            state._fsp--;

             after(grammarAccess.getMessageLAccess().getTargetReceiverLParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageL__TargetAssignment_4_1"


    // $ANTLR start "rule__SenderL__SenderAssignment_1"
    // InternalMyDsl.g:4651:1: rule__SenderL__SenderAssignment_1 : ( ( RULE_ROLENAME_L ) ) ;
    public final void rule__SenderL__SenderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4655:1: ( ( ( RULE_ROLENAME_L ) ) )
            // InternalMyDsl.g:4656:2: ( ( RULE_ROLENAME_L ) )
            {
            // InternalMyDsl.g:4656:2: ( ( RULE_ROLENAME_L ) )
            // InternalMyDsl.g:4657:3: ( RULE_ROLENAME_L )
            {
             before(grammarAccess.getSenderLAccess().getSenderRoleLCrossReference_1_0()); 
            // InternalMyDsl.g:4658:3: ( RULE_ROLENAME_L )
            // InternalMyDsl.g:4659:4: RULE_ROLENAME_L
            {
             before(grammarAccess.getSenderLAccess().getSenderRoleLROLENAME_LTerminalRuleCall_1_0_1()); 
            match(input,RULE_ROLENAME_L,FOLLOW_2); 
             after(grammarAccess.getSenderLAccess().getSenderRoleLROLENAME_LTerminalRuleCall_1_0_1()); 

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
    // InternalMyDsl.g:4670:1: rule__ReceiverL__ToAssignment_1 : ( ( RULE_ROLENAME_L ) ) ;
    public final void rule__ReceiverL__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4674:1: ( ( ( RULE_ROLENAME_L ) ) )
            // InternalMyDsl.g:4675:2: ( ( RULE_ROLENAME_L ) )
            {
            // InternalMyDsl.g:4675:2: ( ( RULE_ROLENAME_L ) )
            // InternalMyDsl.g:4676:3: ( RULE_ROLENAME_L )
            {
             before(grammarAccess.getReceiverLAccess().getToRoleLCrossReference_1_0()); 
            // InternalMyDsl.g:4677:3: ( RULE_ROLENAME_L )
            // InternalMyDsl.g:4678:4: RULE_ROLENAME_L
            {
             before(grammarAccess.getReceiverLAccess().getToRoleLROLENAME_LTerminalRuleCall_1_0_1()); 
            match(input,RULE_ROLENAME_L,FOLLOW_2); 
             after(grammarAccess.getReceiverLAccess().getToRoleLROLENAME_LTerminalRuleCall_1_0_1()); 

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
    // InternalMyDsl.g:4689:1: rule__ChoiceL__RoleAssignment_2 : ( ( RULE_ROLENAME_L ) ) ;
    public final void rule__ChoiceL__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4693:1: ( ( ( RULE_ROLENAME_L ) ) )
            // InternalMyDsl.g:4694:2: ( ( RULE_ROLENAME_L ) )
            {
            // InternalMyDsl.g:4694:2: ( ( RULE_ROLENAME_L ) )
            // InternalMyDsl.g:4695:3: ( RULE_ROLENAME_L )
            {
             before(grammarAccess.getChoiceLAccess().getRoleRoleLCrossReference_2_0()); 
            // InternalMyDsl.g:4696:3: ( RULE_ROLENAME_L )
            // InternalMyDsl.g:4697:4: RULE_ROLENAME_L
            {
             before(grammarAccess.getChoiceLAccess().getRoleRoleLROLENAME_LTerminalRuleCall_2_0_1()); 
            match(input,RULE_ROLENAME_L,FOLLOW_2); 
             after(grammarAccess.getChoiceLAccess().getRoleRoleLROLENAME_LTerminalRuleCall_2_0_1()); 

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
    // InternalMyDsl.g:4708:1: rule__ChoiceL__MessageAssignment_4 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__MessageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4712:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:4713:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:4713:2: ( ruleMessageL )
            // InternalMyDsl.g:4714:3: ruleMessageL
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
    // InternalMyDsl.g:4723:1: rule__ChoiceL__BranchesAssignment_5 : ( ruleProtocolL ) ;
    public final void rule__ChoiceL__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4727:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4728:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4728:2: ( ruleProtocolL )
            // InternalMyDsl.g:4729:3: ruleProtocolL
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
    // InternalMyDsl.g:4738:1: rule__ChoiceL__MessageAssignment_7_2 : ( ruleMessageL ) ;
    public final void rule__ChoiceL__MessageAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4742:1: ( ( ruleMessageL ) )
            // InternalMyDsl.g:4743:2: ( ruleMessageL )
            {
            // InternalMyDsl.g:4743:2: ( ruleMessageL )
            // InternalMyDsl.g:4744:3: ruleMessageL
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
    // InternalMyDsl.g:4753:1: rule__ChoiceL__BranchesAssignment_7_3 : ( ruleProtocolL ) ;
    public final void rule__ChoiceL__BranchesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4757:1: ( ( ruleProtocolL ) )
            // InternalMyDsl.g:4758:2: ( ruleProtocolL )
            {
            // InternalMyDsl.g:4758:2: ( ruleProtocolL )
            // InternalMyDsl.g:4759:3: ruleProtocolL
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


    // $ANTLR start "rule__RecursionL__NameAssignment_1"
    // InternalMyDsl.g:4768:1: rule__RecursionL__NameAssignment_1 : ( RULE_RECNAME ) ;
    public final void rule__RecursionL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4772:1: ( ( RULE_RECNAME ) )
            // InternalMyDsl.g:4773:2: ( RULE_RECNAME )
            {
            // InternalMyDsl.g:4773:2: ( RULE_RECNAME )
            // InternalMyDsl.g:4774:3: RULE_RECNAME
            {
             before(grammarAccess.getRecursionLAccess().getNameRECNAMETerminalRuleCall_1_0()); 
            match(input,RULE_RECNAME,FOLLOW_2); 
             after(grammarAccess.getRecursionLAccess().getNameRECNAMETerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__CloseRecursionL__RecursionVariableAssignment_1"
    // InternalMyDsl.g:4783:1: rule__CloseRecursionL__RecursionVariableAssignment_1 : ( ( RULE_RECNAME ) ) ;
    public final void rule__CloseRecursionL__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4787:1: ( ( ( RULE_RECNAME ) ) )
            // InternalMyDsl.g:4788:2: ( ( RULE_RECNAME ) )
            {
            // InternalMyDsl.g:4788:2: ( ( RULE_RECNAME ) )
            // InternalMyDsl.g:4789:3: ( RULE_RECNAME )
            {
             before(grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLCrossReference_1_0()); 
            // InternalMyDsl.g:4790:3: ( RULE_RECNAME )
            // InternalMyDsl.g:4791:4: RULE_RECNAME
            {
             before(grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLRECNAMETerminalRuleCall_1_0_1()); 
            match(input,RULE_RECNAME,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLRECNAMETerminalRuleCall_1_0_1()); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100AC003C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000AC003C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000AC003C002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000040001C0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00001008C003C000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000008C003C000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000008C003C002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000018000000000L});

}