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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ROLENAME", "RULE_RECNAME", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'REQUEST'", "'INFORM'", "'AGREE'", "'REFUSE'", "'int'", "'string'", "'action'", "'global'", "'protocol'", "'('", "'){'", "'}'", "','", "'role'", "'multrole'", "':'", "'rec'", "'loop'", "';'", "'foreach'", "'{'", "'choice'", "'at'", "'or'", "')'", "'from'", "'to'", "'end'"
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


    // $ANTLR start "entryRuleRoles"
    // InternalMyDsl.g:78:1: entryRuleRoles : ruleRoles EOF ;
    public final void entryRuleRoles() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleRoles EOF )
            // InternalMyDsl.g:80:1: ruleRoles EOF
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
    // InternalMyDsl.g:87:1: ruleRoles : ( ( rule__Roles__Group__0 ) ) ;
    public final void ruleRoles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Roles__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Roles__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Roles__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Roles__Group__0 )
            {
             before(grammarAccess.getRolesAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Roles__Group__0 )
            // InternalMyDsl.g:94:4: rule__Roles__Group__0
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
    // InternalMyDsl.g:103:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleRole EOF )
            // InternalMyDsl.g:105:1: ruleRole EOF
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
    // InternalMyDsl.g:112:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Role__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Role__Alternatives )
            // InternalMyDsl.g:119:4: rule__Role__Alternatives
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
    // InternalMyDsl.g:128:1: entryRuleRoleOne : ruleRoleOne EOF ;
    public final void entryRuleRoleOne() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRoleOne EOF )
            // InternalMyDsl.g:130:1: ruleRoleOne EOF
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
    // InternalMyDsl.g:137:1: ruleRoleOne : ( ( rule__RoleOne__Group__0 ) ) ;
    public final void ruleRoleOne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__RoleOne__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__RoleOne__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__RoleOne__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__RoleOne__Group__0 )
            {
             before(grammarAccess.getRoleOneAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__RoleOne__Group__0 )
            // InternalMyDsl.g:144:4: rule__RoleOne__Group__0
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
    // InternalMyDsl.g:153:1: entryRuleRoleMultiple : ruleRoleMultiple EOF ;
    public final void entryRuleRoleMultiple() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleRoleMultiple EOF )
            // InternalMyDsl.g:155:1: ruleRoleMultiple EOF
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
    // InternalMyDsl.g:162:1: ruleRoleMultiple : ( ( rule__RoleMultiple__Group__0 ) ) ;
    public final void ruleRoleMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__RoleMultiple__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__RoleMultiple__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__RoleMultiple__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__RoleMultiple__Group__0 )
            {
             before(grammarAccess.getRoleMultipleAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__RoleMultiple__Group__0 )
            // InternalMyDsl.g:169:4: rule__RoleMultiple__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleProtocol EOF )
            // InternalMyDsl.g:180:1: ruleProtocol EOF
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
    // InternalMyDsl.g:187:1: ruleProtocol : ( ( rule__Protocol__Alternatives ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Protocol__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Protocol__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Protocol__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Protocol__Alternatives )
            {
             before(grammarAccess.getProtocolAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Protocol__Alternatives )
            // InternalMyDsl.g:194:4: rule__Protocol__Alternatives
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
    // InternalMyDsl.g:203:1: entryRuleRecursion : ruleRecursion EOF ;
    public final void entryRuleRecursion() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleRecursion EOF )
            // InternalMyDsl.g:205:1: ruleRecursion EOF
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
    // InternalMyDsl.g:212:1: ruleRecursion : ( ( rule__Recursion__Group__0 ) ) ;
    public final void ruleRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Recursion__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Recursion__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Recursion__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Recursion__Group__0 )
            {
             before(grammarAccess.getRecursionAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Recursion__Group__0 )
            // InternalMyDsl.g:219:4: rule__Recursion__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleCloseRecursion : ruleCloseRecursion EOF ;
    public final void entryRuleCloseRecursion() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleCloseRecursion EOF )
            // InternalMyDsl.g:230:1: ruleCloseRecursion EOF
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
    // InternalMyDsl.g:237:1: ruleCloseRecursion : ( ( rule__CloseRecursion__Group__0 ) ) ;
    public final void ruleCloseRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__CloseRecursion__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__CloseRecursion__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__CloseRecursion__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__CloseRecursion__Group__0 )
            {
             before(grammarAccess.getCloseRecursionAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__CloseRecursion__Group__0 )
            // InternalMyDsl.g:244:4: rule__CloseRecursion__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleForEach : ruleForEach EOF ;
    public final void entryRuleForEach() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleForEach EOF )
            // InternalMyDsl.g:255:1: ruleForEach EOF
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
    // InternalMyDsl.g:262:1: ruleForEach : ( ( rule__ForEach__Group__0 ) ) ;
    public final void ruleForEach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__ForEach__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__ForEach__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__ForEach__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__ForEach__Group__0 )
            {
             before(grammarAccess.getForEachAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__ForEach__Group__0 )
            // InternalMyDsl.g:269:4: rule__ForEach__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleChoice EOF )
            // InternalMyDsl.g:280:1: ruleChoice EOF
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
    // InternalMyDsl.g:287:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Choice__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Choice__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Choice__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Choice__Group__0 )
            // InternalMyDsl.g:294:4: rule__Choice__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMessage EOF )
            // InternalMyDsl.g:305:1: ruleMessage EOF
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
    // InternalMyDsl.g:312:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Message__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Message__Group__0 )
            // InternalMyDsl.g:319:4: rule__Message__Group__0
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


    // $ANTLR start "entryRuleEndInteraction"
    // InternalMyDsl.g:328:1: entryRuleEndInteraction : ruleEndInteraction EOF ;
    public final void entryRuleEndInteraction() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleEndInteraction EOF )
            // InternalMyDsl.g:330:1: ruleEndInteraction EOF
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
    // InternalMyDsl.g:337:1: ruleEndInteraction : ( ( rule__EndInteraction__Group__0 ) ) ;
    public final void ruleEndInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__EndInteraction__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__EndInteraction__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__EndInteraction__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__EndInteraction__Group__0 )
            {
             before(grammarAccess.getEndInteractionAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__EndInteraction__Group__0 )
            // InternalMyDsl.g:344:4: rule__EndInteraction__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleMessageType : ruleMessageType EOF ;
    public final void entryRuleMessageType() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleMessageType EOF )
            // InternalMyDsl.g:355:1: ruleMessageType EOF
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
    // InternalMyDsl.g:362:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__MessageType__Alternatives ) )
            // InternalMyDsl.g:368:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:369:3: ( rule__MessageType__Alternatives )
            // InternalMyDsl.g:369:4: rule__MessageType__Alternatives
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
    // InternalMyDsl.g:387:1: rulePayload : ( ( rule__Payload__Group__0 ) ) ;
    public final void rulePayload() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Payload__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Payload__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Payload__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Payload__Group__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Payload__Group__0 )
            // InternalMyDsl.g:394:4: rule__Payload__Group__0
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


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:403:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleType EOF )
            // InternalMyDsl.g:405:1: ruleType EOF
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
    // InternalMyDsl.g:412:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:419:4: rule__Type__Alternatives
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


    // $ANTLR start "rule__Role__Alternatives"
    // InternalMyDsl.g:427:1: rule__Role__Alternatives : ( ( ruleRoleOne ) | ( ruleRoleMultiple ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( ruleRoleOne ) | ( ruleRoleMultiple ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:432:2: ( ruleRoleOne )
                    {
                    // InternalMyDsl.g:432:2: ( ruleRoleOne )
                    // InternalMyDsl.g:433:3: ruleRoleOne
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
                    // InternalMyDsl.g:438:2: ( ruleRoleMultiple )
                    {
                    // InternalMyDsl.g:438:2: ( ruleRoleMultiple )
                    // InternalMyDsl.g:439:3: ruleRoleMultiple
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
    // InternalMyDsl.g:448:1: rule__Protocol__Alternatives : ( ( ( rule__Protocol__Group_0__0 ) ) | ( ruleEndInteraction ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:452:1: ( ( ( rule__Protocol__Group_0__0 ) ) | ( ruleEndInteraction ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||(LA2_0>=13 && LA2_0<=16)||LA2_0==24||(LA2_0>=29 && LA2_0<=30)||LA2_0==32||LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==40) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:453:2: ( ( rule__Protocol__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:453:2: ( ( rule__Protocol__Group_0__0 ) )
                    // InternalMyDsl.g:454:3: ( rule__Protocol__Group_0__0 )
                    {
                     before(grammarAccess.getProtocolAccess().getGroup_0()); 
                    // InternalMyDsl.g:455:3: ( rule__Protocol__Group_0__0 )
                    // InternalMyDsl.g:455:4: rule__Protocol__Group_0__0
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
                    // InternalMyDsl.g:459:2: ( ruleEndInteraction )
                    {
                    // InternalMyDsl.g:459:2: ( ruleEndInteraction )
                    // InternalMyDsl.g:460:3: ruleEndInteraction
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
    // InternalMyDsl.g:469:1: rule__Protocol__ActionsAlternatives_0_1_0 : ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) );
    public final void rule__Protocol__ActionsAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ruleMessage ) | ( ruleChoice ) | ( ruleRecursion ) | ( ruleForEach ) | ( ruleCloseRecursion ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            case 30:
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
                    // InternalMyDsl.g:474:2: ( ruleMessage )
                    {
                    // InternalMyDsl.g:474:2: ( ruleMessage )
                    // InternalMyDsl.g:475:3: ruleMessage
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
                    // InternalMyDsl.g:480:2: ( ruleChoice )
                    {
                    // InternalMyDsl.g:480:2: ( ruleChoice )
                    // InternalMyDsl.g:481:3: ruleChoice
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
                    // InternalMyDsl.g:486:2: ( ruleRecursion )
                    {
                    // InternalMyDsl.g:486:2: ( ruleRecursion )
                    // InternalMyDsl.g:487:3: ruleRecursion
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
                    // InternalMyDsl.g:492:2: ( ruleForEach )
                    {
                    // InternalMyDsl.g:492:2: ( ruleForEach )
                    // InternalMyDsl.g:493:3: ruleForEach
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
                    // InternalMyDsl.g:498:2: ( ruleCloseRecursion )
                    {
                    // InternalMyDsl.g:498:2: ( ruleCloseRecursion )
                    // InternalMyDsl.g:499:3: ruleCloseRecursion
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


    // $ANTLR start "rule__MessageType__Alternatives"
    // InternalMyDsl.g:508:1: rule__MessageType__Alternatives : ( ( 'REQUEST' ) | ( 'INFORM' ) | ( 'AGREE' ) | ( 'REFUSE' ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( ( 'REQUEST' ) | ( 'INFORM' ) | ( 'AGREE' ) | ( 'REFUSE' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
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
                    // InternalMyDsl.g:513:2: ( 'REQUEST' )
                    {
                    // InternalMyDsl.g:513:2: ( 'REQUEST' )
                    // InternalMyDsl.g:514:3: 'REQUEST'
                    {
                     before(grammarAccess.getMessageTypeAccess().getREQUESTKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getREQUESTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:519:2: ( 'INFORM' )
                    {
                    // InternalMyDsl.g:519:2: ( 'INFORM' )
                    // InternalMyDsl.g:520:3: 'INFORM'
                    {
                     before(grammarAccess.getMessageTypeAccess().getINFORMKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getINFORMKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:525:2: ( 'AGREE' )
                    {
                    // InternalMyDsl.g:525:2: ( 'AGREE' )
                    // InternalMyDsl.g:526:3: 'AGREE'
                    {
                     before(grammarAccess.getMessageTypeAccess().getAGREEKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getAGREEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:531:2: ( 'REFUSE' )
                    {
                    // InternalMyDsl.g:531:2: ( 'REFUSE' )
                    // InternalMyDsl.g:532:3: 'REFUSE'
                    {
                     before(grammarAccess.getMessageTypeAccess().getREFUSEKeyword_3()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:541:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'action' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( ( 'int' ) | ( 'string' ) | ( 'action' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:546:2: ( 'int' )
                    {
                    // InternalMyDsl.g:546:2: ( 'int' )
                    // InternalMyDsl.g:547:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:552:2: ( 'string' )
                    {
                    // InternalMyDsl.g:552:2: ( 'string' )
                    // InternalMyDsl.g:553:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:558:2: ( 'action' )
                    {
                    // InternalMyDsl.g:558:2: ( 'action' )
                    // InternalMyDsl.g:559:3: 'action'
                    {
                     before(grammarAccess.getTypeAccess().getActionKeyword_2()); 
                    match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:568:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:573:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMyDsl.g:580:1: rule__Model__Group__0__Impl : ( 'global' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( ( 'global' ) )
            // InternalMyDsl.g:585:1: ( 'global' )
            {
            // InternalMyDsl.g:585:1: ( 'global' )
            // InternalMyDsl.g:586:2: 'global'
            {
             before(grammarAccess.getModelAccess().getGlobalKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getGlobalKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:595:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:600:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:607:1: rule__Model__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:612:1: ( 'protocol' )
            {
            // InternalMyDsl.g:612:1: ( 'protocol' )
            // InternalMyDsl.g:613:2: 'protocol'
            {
             before(grammarAccess.getModelAccess().getProtocolKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getProtocolKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:622:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyDsl.g:627:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:634:1: rule__Model__Group__2__Impl : ( ( rule__Model__ProtocolNameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( ( ( rule__Model__ProtocolNameAssignment_2 ) ) )
            // InternalMyDsl.g:639:1: ( ( rule__Model__ProtocolNameAssignment_2 ) )
            {
            // InternalMyDsl.g:639:1: ( ( rule__Model__ProtocolNameAssignment_2 ) )
            // InternalMyDsl.g:640:2: ( rule__Model__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getProtocolNameAssignment_2()); 
            // InternalMyDsl.g:641:2: ( rule__Model__ProtocolNameAssignment_2 )
            // InternalMyDsl.g:641:3: rule__Model__ProtocolNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__ProtocolNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProtocolNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__3"
    // InternalMyDsl.g:649:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyDsl.g:654:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMyDsl.g:661:1: rule__Model__Group__3__Impl : ( '(' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( ( '(' ) )
            // InternalMyDsl.g:666:1: ( '(' )
            {
            // InternalMyDsl.g:666:1: ( '(' )
            // InternalMyDsl.g:667:2: '('
            {
             before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMyDsl.g:676:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMyDsl.g:681:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMyDsl.g:688:1: rule__Model__Group__4__Impl : ( ( rule__Model__RolesAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( ( ( rule__Model__RolesAssignment_4 ) ) )
            // InternalMyDsl.g:693:1: ( ( rule__Model__RolesAssignment_4 ) )
            {
            // InternalMyDsl.g:693:1: ( ( rule__Model__RolesAssignment_4 ) )
            // InternalMyDsl.g:694:2: ( rule__Model__RolesAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getRolesAssignment_4()); 
            // InternalMyDsl.g:695:2: ( rule__Model__RolesAssignment_4 )
            // InternalMyDsl.g:695:3: rule__Model__RolesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRolesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalMyDsl.g:703:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalMyDsl.g:708:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalMyDsl.g:715:1: rule__Model__Group__5__Impl : ( '){' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( '){' ) )
            // InternalMyDsl.g:720:1: ( '){' )
            {
            // InternalMyDsl.g:720:1: ( '){' )
            // InternalMyDsl.g:721:2: '){'
            {
             before(grammarAccess.getModelAccess().getRightParenthesisLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightParenthesisLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalMyDsl.g:730:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalMyDsl.g:735:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalMyDsl.g:742:1: rule__Model__Group__6__Impl : ( ( rule__Model__ProtocolAssignment_6 ) ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( ( ( rule__Model__ProtocolAssignment_6 ) ) )
            // InternalMyDsl.g:747:1: ( ( rule__Model__ProtocolAssignment_6 ) )
            {
            // InternalMyDsl.g:747:1: ( ( rule__Model__ProtocolAssignment_6 ) )
            // InternalMyDsl.g:748:2: ( rule__Model__ProtocolAssignment_6 )
            {
             before(grammarAccess.getModelAccess().getProtocolAssignment_6()); 
            // InternalMyDsl.g:749:2: ( rule__Model__ProtocolAssignment_6 )
            // InternalMyDsl.g:749:3: rule__Model__ProtocolAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Model__ProtocolAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProtocolAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalMyDsl.g:757:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( rule__Model__Group__7__Impl )
            // InternalMyDsl.g:762:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalMyDsl.g:768:1: rule__Model__Group__7__Impl : ( '}' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( ( '}' ) )
            // InternalMyDsl.g:773:1: ( '}' )
            {
            // InternalMyDsl.g:773:1: ( '}' )
            // InternalMyDsl.g:774:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Roles__Group__0"
    // InternalMyDsl.g:784:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalMyDsl.g:789:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
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
    // InternalMyDsl.g:796:1: rule__Roles__Group__0__Impl : ( ( rule__Roles__RolesAssignment_0 ) ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( ( ( rule__Roles__RolesAssignment_0 ) ) )
            // InternalMyDsl.g:801:1: ( ( rule__Roles__RolesAssignment_0 ) )
            {
            // InternalMyDsl.g:801:1: ( ( rule__Roles__RolesAssignment_0 ) )
            // InternalMyDsl.g:802:2: ( rule__Roles__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_0()); 
            // InternalMyDsl.g:803:2: ( rule__Roles__RolesAssignment_0 )
            // InternalMyDsl.g:803:3: rule__Roles__RolesAssignment_0
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
    // InternalMyDsl.g:811:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( rule__Roles__Group__1__Impl )
            // InternalMyDsl.g:816:2: rule__Roles__Group__1__Impl
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
    // InternalMyDsl.g:822:1: rule__Roles__Group__1__Impl : ( ( rule__Roles__Group_1__0 )* ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( ( ( rule__Roles__Group_1__0 )* ) )
            // InternalMyDsl.g:827:1: ( ( rule__Roles__Group_1__0 )* )
            {
            // InternalMyDsl.g:827:1: ( ( rule__Roles__Group_1__0 )* )
            // InternalMyDsl.g:828:2: ( rule__Roles__Group_1__0 )*
            {
             before(grammarAccess.getRolesAccess().getGroup_1()); 
            // InternalMyDsl.g:829:2: ( rule__Roles__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:829:3: rule__Roles__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Roles__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:838:1: rule__Roles__Group_1__0 : rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 ;
    public final void rule__Roles__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 )
            // InternalMyDsl.g:843:2: rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1
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
    // InternalMyDsl.g:850:1: rule__Roles__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Roles__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( ',' ) )
            // InternalMyDsl.g:855:1: ( ',' )
            {
            // InternalMyDsl.g:855:1: ( ',' )
            // InternalMyDsl.g:856:2: ','
            {
             before(grammarAccess.getRolesAccess().getCommaKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:865:1: rule__Roles__Group_1__1 : rule__Roles__Group_1__1__Impl ;
    public final void rule__Roles__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( rule__Roles__Group_1__1__Impl )
            // InternalMyDsl.g:870:2: rule__Roles__Group_1__1__Impl
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
    // InternalMyDsl.g:876:1: rule__Roles__Group_1__1__Impl : ( ( rule__Roles__RolesAssignment_1_1 ) ) ;
    public final void rule__Roles__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( ( ( rule__Roles__RolesAssignment_1_1 ) ) )
            // InternalMyDsl.g:881:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:881:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            // InternalMyDsl.g:882:2: ( rule__Roles__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 
            // InternalMyDsl.g:883:2: ( rule__Roles__RolesAssignment_1_1 )
            // InternalMyDsl.g:883:3: rule__Roles__RolesAssignment_1_1
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
    // InternalMyDsl.g:892:1: rule__RoleOne__Group__0 : rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 ;
    public final void rule__RoleOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:896:1: ( rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 )
            // InternalMyDsl.g:897:2: rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1
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
    // InternalMyDsl.g:904:1: rule__RoleOne__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( ( 'role' ) )
            // InternalMyDsl.g:909:1: ( 'role' )
            {
            // InternalMyDsl.g:909:1: ( 'role' )
            // InternalMyDsl.g:910:2: 'role'
            {
             before(grammarAccess.getRoleOneAccess().getRoleKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:919:1: rule__RoleOne__Group__1 : rule__RoleOne__Group__1__Impl ;
    public final void rule__RoleOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( rule__RoleOne__Group__1__Impl )
            // InternalMyDsl.g:924:2: rule__RoleOne__Group__1__Impl
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
    // InternalMyDsl.g:930:1: rule__RoleOne__Group__1__Impl : ( ( rule__RoleOne__NameAssignment_1 ) ) ;
    public final void rule__RoleOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( ( ( rule__RoleOne__NameAssignment_1 ) ) )
            // InternalMyDsl.g:935:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:935:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            // InternalMyDsl.g:936:2: ( rule__RoleOne__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:937:2: ( rule__RoleOne__NameAssignment_1 )
            // InternalMyDsl.g:937:3: rule__RoleOne__NameAssignment_1
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
    // InternalMyDsl.g:946:1: rule__RoleMultiple__Group__0 : rule__RoleMultiple__Group__0__Impl rule__RoleMultiple__Group__1 ;
    public final void rule__RoleMultiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( rule__RoleMultiple__Group__0__Impl rule__RoleMultiple__Group__1 )
            // InternalMyDsl.g:951:2: rule__RoleMultiple__Group__0__Impl rule__RoleMultiple__Group__1
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
    // InternalMyDsl.g:958:1: rule__RoleMultiple__Group__0__Impl : ( 'multrole' ) ;
    public final void rule__RoleMultiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( ( 'multrole' ) )
            // InternalMyDsl.g:963:1: ( 'multrole' )
            {
            // InternalMyDsl.g:963:1: ( 'multrole' )
            // InternalMyDsl.g:964:2: 'multrole'
            {
             before(grammarAccess.getRoleMultipleAccess().getMultroleKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:973:1: rule__RoleMultiple__Group__1 : rule__RoleMultiple__Group__1__Impl rule__RoleMultiple__Group__2 ;
    public final void rule__RoleMultiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( rule__RoleMultiple__Group__1__Impl rule__RoleMultiple__Group__2 )
            // InternalMyDsl.g:978:2: rule__RoleMultiple__Group__1__Impl rule__RoleMultiple__Group__2
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
    // InternalMyDsl.g:985:1: rule__RoleMultiple__Group__1__Impl : ( ( rule__RoleMultiple__NameAssignment_1 ) ) ;
    public final void rule__RoleMultiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( ( ( rule__RoleMultiple__NameAssignment_1 ) ) )
            // InternalMyDsl.g:990:1: ( ( rule__RoleMultiple__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:990:1: ( ( rule__RoleMultiple__NameAssignment_1 ) )
            // InternalMyDsl.g:991:2: ( rule__RoleMultiple__NameAssignment_1 )
            {
             before(grammarAccess.getRoleMultipleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:992:2: ( rule__RoleMultiple__NameAssignment_1 )
            // InternalMyDsl.g:992:3: rule__RoleMultiple__NameAssignment_1
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
    // InternalMyDsl.g:1000:1: rule__RoleMultiple__Group__2 : rule__RoleMultiple__Group__2__Impl rule__RoleMultiple__Group__3 ;
    public final void rule__RoleMultiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( rule__RoleMultiple__Group__2__Impl rule__RoleMultiple__Group__3 )
            // InternalMyDsl.g:1005:2: rule__RoleMultiple__Group__2__Impl rule__RoleMultiple__Group__3
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
    // InternalMyDsl.g:1012:1: rule__RoleMultiple__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleMultiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( ( ':' ) )
            // InternalMyDsl.g:1017:1: ( ':' )
            {
            // InternalMyDsl.g:1017:1: ( ':' )
            // InternalMyDsl.g:1018:2: ':'
            {
             before(grammarAccess.getRoleMultipleAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1027:1: rule__RoleMultiple__Group__3 : rule__RoleMultiple__Group__3__Impl ;
    public final void rule__RoleMultiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( rule__RoleMultiple__Group__3__Impl )
            // InternalMyDsl.g:1032:2: rule__RoleMultiple__Group__3__Impl
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
    // InternalMyDsl.g:1038:1: rule__RoleMultiple__Group__3__Impl : ( ( rule__RoleMultiple__RefAssignment_3 ) ) ;
    public final void rule__RoleMultiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( ( ( rule__RoleMultiple__RefAssignment_3 ) ) )
            // InternalMyDsl.g:1043:1: ( ( rule__RoleMultiple__RefAssignment_3 ) )
            {
            // InternalMyDsl.g:1043:1: ( ( rule__RoleMultiple__RefAssignment_3 ) )
            // InternalMyDsl.g:1044:2: ( rule__RoleMultiple__RefAssignment_3 )
            {
             before(grammarAccess.getRoleMultipleAccess().getRefAssignment_3()); 
            // InternalMyDsl.g:1045:2: ( rule__RoleMultiple__RefAssignment_3 )
            // InternalMyDsl.g:1045:3: rule__RoleMultiple__RefAssignment_3
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
    // InternalMyDsl.g:1054:1: rule__Protocol__Group_0__0 : rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 ;
    public final void rule__Protocol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 )
            // InternalMyDsl.g:1059:2: rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1
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
    // InternalMyDsl.g:1066:1: rule__Protocol__Group_0__0__Impl : ( () ) ;
    public final void rule__Protocol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( () ) )
            // InternalMyDsl.g:1071:1: ( () )
            {
            // InternalMyDsl.g:1071:1: ( () )
            // InternalMyDsl.g:1072:2: ()
            {
             before(grammarAccess.getProtocolAccess().getProtocolAction_0_0()); 
            // InternalMyDsl.g:1073:2: ()
            // InternalMyDsl.g:1073:3: 
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
    // InternalMyDsl.g:1081:1: rule__Protocol__Group_0__1 : rule__Protocol__Group_0__1__Impl ;
    public final void rule__Protocol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( rule__Protocol__Group_0__1__Impl )
            // InternalMyDsl.g:1086:2: rule__Protocol__Group_0__1__Impl
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
    // InternalMyDsl.g:1092:1: rule__Protocol__Group_0__1__Impl : ( ( rule__Protocol__ActionsAssignment_0_1 )* ) ;
    public final void rule__Protocol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( ( ( rule__Protocol__ActionsAssignment_0_1 )* ) )
            // InternalMyDsl.g:1097:1: ( ( rule__Protocol__ActionsAssignment_0_1 )* )
            {
            // InternalMyDsl.g:1097:1: ( ( rule__Protocol__ActionsAssignment_0_1 )* )
            // InternalMyDsl.g:1098:2: ( rule__Protocol__ActionsAssignment_0_1 )*
            {
             before(grammarAccess.getProtocolAccess().getActionsAssignment_0_1()); 
            // InternalMyDsl.g:1099:2: ( rule__Protocol__ActionsAssignment_0_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=13 && LA7_0<=16)||(LA7_0>=29 && LA7_0<=30)||LA7_0==32||LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1099:3: rule__Protocol__ActionsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Protocol__ActionsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyDsl.g:1108:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalMyDsl.g:1113:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
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
    // InternalMyDsl.g:1120:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( 'rec' ) )
            // InternalMyDsl.g:1125:1: ( 'rec' )
            {
            // InternalMyDsl.g:1125:1: ( 'rec' )
            // InternalMyDsl.g:1126:2: 'rec'
            {
             before(grammarAccess.getRecursionAccess().getRecKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1135:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // InternalMyDsl.g:1140:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
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
    // InternalMyDsl.g:1147:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__NameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( ( ( rule__Recursion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1152:1: ( ( rule__Recursion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1152:1: ( ( rule__Recursion__NameAssignment_1 ) )
            // InternalMyDsl.g:1153:2: ( rule__Recursion__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1154:2: ( rule__Recursion__NameAssignment_1 )
            // InternalMyDsl.g:1154:3: rule__Recursion__NameAssignment_1
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
    // InternalMyDsl.g:1162:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__Recursion__Group__2__Impl )
            // InternalMyDsl.g:1167:2: rule__Recursion__Group__2__Impl
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
    // InternalMyDsl.g:1173:1: rule__Recursion__Group__2__Impl : ( ':' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( ( ':' ) )
            // InternalMyDsl.g:1178:1: ( ':' )
            {
            // InternalMyDsl.g:1178:1: ( ':' )
            // InternalMyDsl.g:1179:2: ':'
            {
             before(grammarAccess.getRecursionAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1189:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalMyDsl.g:1194:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
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
    // InternalMyDsl.g:1201:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( ( 'loop' ) )
            // InternalMyDsl.g:1206:1: ( 'loop' )
            {
            // InternalMyDsl.g:1206:1: ( 'loop' )
            // InternalMyDsl.g:1207:2: 'loop'
            {
             before(grammarAccess.getCloseRecursionAccess().getLoopKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:1216:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 )
            // InternalMyDsl.g:1221:2: rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2
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
    // InternalMyDsl.g:1228:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalMyDsl.g:1233:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalMyDsl.g:1233:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalMyDsl.g:1234:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalMyDsl.g:1235:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalMyDsl.g:1235:3: rule__CloseRecursion__RecursionVariableAssignment_1
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
    // InternalMyDsl.g:1243:1: rule__CloseRecursion__Group__2 : rule__CloseRecursion__Group__2__Impl ;
    public final void rule__CloseRecursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( rule__CloseRecursion__Group__2__Impl )
            // InternalMyDsl.g:1248:2: rule__CloseRecursion__Group__2__Impl
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
    // InternalMyDsl.g:1254:1: rule__CloseRecursion__Group__2__Impl : ( ';' ) ;
    public final void rule__CloseRecursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( ';' ) )
            // InternalMyDsl.g:1259:1: ( ';' )
            {
            // InternalMyDsl.g:1259:1: ( ';' )
            // InternalMyDsl.g:1260:2: ';'
            {
             before(grammarAccess.getCloseRecursionAccess().getSemicolonKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:1270:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalMyDsl.g:1275:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1282:1: rule__ForEach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( ( 'foreach' ) )
            // InternalMyDsl.g:1287:1: ( 'foreach' )
            {
            // InternalMyDsl.g:1287:1: ( 'foreach' )
            // InternalMyDsl.g:1288:2: 'foreach'
            {
             before(grammarAccess.getForEachAccess().getForeachKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1297:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalMyDsl.g:1302:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
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
    // InternalMyDsl.g:1309:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( ( rule__ForEach__EachRoleAssignment_1 ) ) )
            // InternalMyDsl.g:1314:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            {
            // InternalMyDsl.g:1314:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            // InternalMyDsl.g:1315:2: ( rule__ForEach__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getEachRoleAssignment_1()); 
            // InternalMyDsl.g:1316:2: ( rule__ForEach__EachRoleAssignment_1 )
            // InternalMyDsl.g:1316:3: rule__ForEach__EachRoleAssignment_1
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
    // InternalMyDsl.g:1324:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalMyDsl.g:1329:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
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
    // InternalMyDsl.g:1336:1: rule__ForEach__Group__2__Impl : ( ':' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( ( ':' ) )
            // InternalMyDsl.g:1341:1: ( ':' )
            {
            // InternalMyDsl.g:1341:1: ( ':' )
            // InternalMyDsl.g:1342:2: ':'
            {
             before(grammarAccess.getForEachAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1351:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalMyDsl.g:1356:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
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
    // InternalMyDsl.g:1363:1: rule__ForEach__Group__3__Impl : ( ( rule__ForEach__RoleAssignment_3 ) ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( ( rule__ForEach__RoleAssignment_3 ) ) )
            // InternalMyDsl.g:1368:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            {
            // InternalMyDsl.g:1368:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            // InternalMyDsl.g:1369:2: ( rule__ForEach__RoleAssignment_3 )
            {
             before(grammarAccess.getForEachAccess().getRoleAssignment_3()); 
            // InternalMyDsl.g:1370:2: ( rule__ForEach__RoleAssignment_3 )
            // InternalMyDsl.g:1370:3: rule__ForEach__RoleAssignment_3
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
    // InternalMyDsl.g:1378:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalMyDsl.g:1383:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
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
    // InternalMyDsl.g:1390:1: rule__ForEach__Group__4__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( ( '{' ) )
            // InternalMyDsl.g:1395:1: ( '{' )
            {
            // InternalMyDsl.g:1395:1: ( '{' )
            // InternalMyDsl.g:1396:2: '{'
            {
             before(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1405:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalMyDsl.g:1410:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
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
    // InternalMyDsl.g:1417:1: rule__ForEach__Group__5__Impl : ( ( rule__ForEach__BranchAssignment_5 ) ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( ( ( rule__ForEach__BranchAssignment_5 ) ) )
            // InternalMyDsl.g:1422:1: ( ( rule__ForEach__BranchAssignment_5 ) )
            {
            // InternalMyDsl.g:1422:1: ( ( rule__ForEach__BranchAssignment_5 ) )
            // InternalMyDsl.g:1423:2: ( rule__ForEach__BranchAssignment_5 )
            {
             before(grammarAccess.getForEachAccess().getBranchAssignment_5()); 
            // InternalMyDsl.g:1424:2: ( rule__ForEach__BranchAssignment_5 )
            // InternalMyDsl.g:1424:3: rule__ForEach__BranchAssignment_5
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
    // InternalMyDsl.g:1432:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( rule__ForEach__Group__6__Impl )
            // InternalMyDsl.g:1437:2: rule__ForEach__Group__6__Impl
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
    // InternalMyDsl.g:1443:1: rule__ForEach__Group__6__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( ( '}' ) )
            // InternalMyDsl.g:1448:1: ( '}' )
            {
            // InternalMyDsl.g:1448:1: ( '}' )
            // InternalMyDsl.g:1449:2: '}'
            {
             before(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1459:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:1464:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1471:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( ( 'choice' ) )
            // InternalMyDsl.g:1476:1: ( 'choice' )
            {
            // InternalMyDsl.g:1476:1: ( 'choice' )
            // InternalMyDsl.g:1477:2: 'choice'
            {
             before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1486:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:1491:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
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
    // InternalMyDsl.g:1498:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( ( 'at' ) )
            // InternalMyDsl.g:1503:1: ( 'at' )
            {
            // InternalMyDsl.g:1503:1: ( 'at' )
            // InternalMyDsl.g:1504:2: 'at'
            {
             before(grammarAccess.getChoiceAccess().getAtKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:1513:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:1518:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
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
    // InternalMyDsl.g:1525:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalMyDsl.g:1530:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalMyDsl.g:1530:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalMyDsl.g:1531:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalMyDsl.g:1532:2: ( rule__Choice__RoleAssignment_2 )
            // InternalMyDsl.g:1532:3: rule__Choice__RoleAssignment_2
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
    // InternalMyDsl.g:1540:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:1545:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1552:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( ( '{' ) )
            // InternalMyDsl.g:1557:1: ( '{' )
            {
            // InternalMyDsl.g:1557:1: ( '{' )
            // InternalMyDsl.g:1558:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1567:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:1572:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
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
    // InternalMyDsl.g:1579:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__MessageAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( ( ( rule__Choice__MessageAssignment_4 ) ) )
            // InternalMyDsl.g:1584:1: ( ( rule__Choice__MessageAssignment_4 ) )
            {
            // InternalMyDsl.g:1584:1: ( ( rule__Choice__MessageAssignment_4 ) )
            // InternalMyDsl.g:1585:2: ( rule__Choice__MessageAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getMessageAssignment_4()); 
            // InternalMyDsl.g:1586:2: ( rule__Choice__MessageAssignment_4 )
            // InternalMyDsl.g:1586:3: rule__Choice__MessageAssignment_4
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
    // InternalMyDsl.g:1594:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:1599:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
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
    // InternalMyDsl.g:1606:1: rule__Choice__Group__5__Impl : ( ( rule__Choice__BranchAssignment_5 ) ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( ( ( rule__Choice__BranchAssignment_5 ) ) )
            // InternalMyDsl.g:1611:1: ( ( rule__Choice__BranchAssignment_5 ) )
            {
            // InternalMyDsl.g:1611:1: ( ( rule__Choice__BranchAssignment_5 ) )
            // InternalMyDsl.g:1612:2: ( rule__Choice__BranchAssignment_5 )
            {
             before(grammarAccess.getChoiceAccess().getBranchAssignment_5()); 
            // InternalMyDsl.g:1613:2: ( rule__Choice__BranchAssignment_5 )
            // InternalMyDsl.g:1613:3: rule__Choice__BranchAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Choice__BranchAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBranchAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:1621:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl rule__Choice__Group__7 ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( rule__Choice__Group__6__Impl rule__Choice__Group__7 )
            // InternalMyDsl.g:1626:2: rule__Choice__Group__6__Impl rule__Choice__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1633:1: rule__Choice__Group__6__Impl : ( '}' ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( ( '}' ) )
            // InternalMyDsl.g:1638:1: ( '}' )
            {
            // InternalMyDsl.g:1638:1: ( '}' )
            // InternalMyDsl.g:1639:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1648:1: rule__Choice__Group__7 : rule__Choice__Group__7__Impl ;
    public final void rule__Choice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__Choice__Group__7__Impl )
            // InternalMyDsl.g:1653:2: rule__Choice__Group__7__Impl
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
    // InternalMyDsl.g:1659:1: rule__Choice__Group__7__Impl : ( ( rule__Choice__Group_7__0 )* ) ;
    public final void rule__Choice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( ( ( rule__Choice__Group_7__0 )* ) )
            // InternalMyDsl.g:1664:1: ( ( rule__Choice__Group_7__0 )* )
            {
            // InternalMyDsl.g:1664:1: ( ( rule__Choice__Group_7__0 )* )
            // InternalMyDsl.g:1665:2: ( rule__Choice__Group_7__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_7()); 
            // InternalMyDsl.g:1666:2: ( rule__Choice__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1666:3: rule__Choice__Group_7__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Choice__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:1675:1: rule__Choice__Group_7__0 : rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1 ;
    public final void rule__Choice__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1 )
            // InternalMyDsl.g:1680:2: rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1687:1: rule__Choice__Group_7__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( ( 'or' ) )
            // InternalMyDsl.g:1692:1: ( 'or' )
            {
            // InternalMyDsl.g:1692:1: ( 'or' )
            // InternalMyDsl.g:1693:2: 'or'
            {
             before(grammarAccess.getChoiceAccess().getOrKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1702:1: rule__Choice__Group_7__1 : rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2 ;
    public final void rule__Choice__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2 )
            // InternalMyDsl.g:1707:2: rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1714:1: rule__Choice__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( '{' ) )
            // InternalMyDsl.g:1719:1: ( '{' )
            {
            // InternalMyDsl.g:1719:1: ( '{' )
            // InternalMyDsl.g:1720:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1729:1: rule__Choice__Group_7__2 : rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3 ;
    public final void rule__Choice__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3 )
            // InternalMyDsl.g:1734:2: rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3
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
    // InternalMyDsl.g:1741:1: rule__Choice__Group_7__2__Impl : ( ( rule__Choice__MessageAssignment_7_2 ) ) ;
    public final void rule__Choice__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( ( rule__Choice__MessageAssignment_7_2 ) ) )
            // InternalMyDsl.g:1746:1: ( ( rule__Choice__MessageAssignment_7_2 ) )
            {
            // InternalMyDsl.g:1746:1: ( ( rule__Choice__MessageAssignment_7_2 ) )
            // InternalMyDsl.g:1747:2: ( rule__Choice__MessageAssignment_7_2 )
            {
             before(grammarAccess.getChoiceAccess().getMessageAssignment_7_2()); 
            // InternalMyDsl.g:1748:2: ( rule__Choice__MessageAssignment_7_2 )
            // InternalMyDsl.g:1748:3: rule__Choice__MessageAssignment_7_2
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
    // InternalMyDsl.g:1756:1: rule__Choice__Group_7__3 : rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4 ;
    public final void rule__Choice__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4 )
            // InternalMyDsl.g:1761:2: rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4
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
    // InternalMyDsl.g:1768:1: rule__Choice__Group_7__3__Impl : ( ( rule__Choice__BranchAssignment_7_3 ) ) ;
    public final void rule__Choice__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( ( ( rule__Choice__BranchAssignment_7_3 ) ) )
            // InternalMyDsl.g:1773:1: ( ( rule__Choice__BranchAssignment_7_3 ) )
            {
            // InternalMyDsl.g:1773:1: ( ( rule__Choice__BranchAssignment_7_3 ) )
            // InternalMyDsl.g:1774:2: ( rule__Choice__BranchAssignment_7_3 )
            {
             before(grammarAccess.getChoiceAccess().getBranchAssignment_7_3()); 
            // InternalMyDsl.g:1775:2: ( rule__Choice__BranchAssignment_7_3 )
            // InternalMyDsl.g:1775:3: rule__Choice__BranchAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Choice__BranchAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBranchAssignment_7_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:1783:1: rule__Choice__Group_7__4 : rule__Choice__Group_7__4__Impl ;
    public final void rule__Choice__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__Choice__Group_7__4__Impl )
            // InternalMyDsl.g:1788:2: rule__Choice__Group_7__4__Impl
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
    // InternalMyDsl.g:1794:1: rule__Choice__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Choice__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( '}' ) )
            // InternalMyDsl.g:1799:1: ( '}' )
            {
            // InternalMyDsl.g:1799:1: ( '}' )
            // InternalMyDsl.g:1800:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1810:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:1815:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalMyDsl.g:1822:1: rule__Message__Group__0__Impl : ( ( rule__Message__MessageTypeAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( ( rule__Message__MessageTypeAssignment_0 ) ) )
            // InternalMyDsl.g:1827:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:1827:1: ( ( rule__Message__MessageTypeAssignment_0 ) )
            // InternalMyDsl.g:1828:2: ( rule__Message__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getMessageTypeAssignment_0()); 
            // InternalMyDsl.g:1829:2: ( rule__Message__MessageTypeAssignment_0 )
            // InternalMyDsl.g:1829:3: rule__Message__MessageTypeAssignment_0
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
    // InternalMyDsl.g:1837:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:1842:2: rule__Message__Group__1__Impl rule__Message__Group__2
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
    // InternalMyDsl.g:1849:1: rule__Message__Group__1__Impl : ( '(' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( ( '(' ) )
            // InternalMyDsl.g:1854:1: ( '(' )
            {
            // InternalMyDsl.g:1854:1: ( '(' )
            // InternalMyDsl.g:1855:2: '('
            {
             before(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1864:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:1869:2: rule__Message__Group__2__Impl rule__Message__Group__3
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
    // InternalMyDsl.g:1876:1: rule__Message__Group__2__Impl : ( ( rule__Message__PayloadAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( ( ( rule__Message__PayloadAssignment_2 )? ) )
            // InternalMyDsl.g:1881:1: ( ( rule__Message__PayloadAssignment_2 )? )
            {
            // InternalMyDsl.g:1881:1: ( ( rule__Message__PayloadAssignment_2 )? )
            // InternalMyDsl.g:1882:2: ( rule__Message__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getPayloadAssignment_2()); 
            // InternalMyDsl.g:1883:2: ( rule__Message__PayloadAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=17 && LA9_0<=19)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1883:3: rule__Message__PayloadAssignment_2
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
    // InternalMyDsl.g:1891:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:1896:2: rule__Message__Group__3__Impl rule__Message__Group__4
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
    // InternalMyDsl.g:1903:1: rule__Message__Group__3__Impl : ( ')' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( ')' ) )
            // InternalMyDsl.g:1908:1: ( ')' )
            {
            // InternalMyDsl.g:1908:1: ( ')' )
            // InternalMyDsl.g:1909:2: ')'
            {
             before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:1918:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:1923:2: rule__Message__Group__4__Impl rule__Message__Group__5
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
    // InternalMyDsl.g:1930:1: rule__Message__Group__4__Impl : ( 'from' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( ( 'from' ) )
            // InternalMyDsl.g:1935:1: ( 'from' )
            {
            // InternalMyDsl.g:1935:1: ( 'from' )
            // InternalMyDsl.g:1936:2: 'from'
            {
             before(grammarAccess.getMessageAccess().getFromKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:1945:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:1950:2: rule__Message__Group__5__Impl rule__Message__Group__6
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
    // InternalMyDsl.g:1957:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( ( rule__Message__SenderAssignment_5 ) ) )
            // InternalMyDsl.g:1962:1: ( ( rule__Message__SenderAssignment_5 ) )
            {
            // InternalMyDsl.g:1962:1: ( ( rule__Message__SenderAssignment_5 ) )
            // InternalMyDsl.g:1963:2: ( rule__Message__SenderAssignment_5 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_5()); 
            // InternalMyDsl.g:1964:2: ( rule__Message__SenderAssignment_5 )
            // InternalMyDsl.g:1964:3: rule__Message__SenderAssignment_5
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
    // InternalMyDsl.g:1972:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:1977:2: rule__Message__Group__6__Impl rule__Message__Group__7
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
    // InternalMyDsl.g:1984:1: rule__Message__Group__6__Impl : ( 'to' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( 'to' ) )
            // InternalMyDsl.g:1989:1: ( 'to' )
            {
            // InternalMyDsl.g:1989:1: ( 'to' )
            // InternalMyDsl.g:1990:2: 'to'
            {
             before(grammarAccess.getMessageAccess().getToKeyword_6()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:1999:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:2004:2: rule__Message__Group__7__Impl rule__Message__Group__8
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
    // InternalMyDsl.g:2011:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( ( ( rule__Message__ReceiverAssignment_7 ) ) )
            // InternalMyDsl.g:2016:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            {
            // InternalMyDsl.g:2016:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            // InternalMyDsl.g:2017:2: ( rule__Message__ReceiverAssignment_7 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 
            // InternalMyDsl.g:2018:2: ( rule__Message__ReceiverAssignment_7 )
            // InternalMyDsl.g:2018:3: rule__Message__ReceiverAssignment_7
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
    // InternalMyDsl.g:2026:1: rule__Message__Group__8 : rule__Message__Group__8__Impl ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( rule__Message__Group__8__Impl )
            // InternalMyDsl.g:2031:2: rule__Message__Group__8__Impl
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
    // InternalMyDsl.g:2037:1: rule__Message__Group__8__Impl : ( ';' ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( ( ';' ) )
            // InternalMyDsl.g:2042:1: ( ';' )
            {
            // InternalMyDsl.g:2042:1: ( ';' )
            // InternalMyDsl.g:2043:2: ';'
            {
             before(grammarAccess.getMessageAccess().getSemicolonKeyword_8()); 
            match(input,31,FOLLOW_2); 
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


    // $ANTLR start "rule__EndInteraction__Group__0"
    // InternalMyDsl.g:2053:1: rule__EndInteraction__Group__0 : rule__EndInteraction__Group__0__Impl rule__EndInteraction__Group__1 ;
    public final void rule__EndInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( rule__EndInteraction__Group__0__Impl rule__EndInteraction__Group__1 )
            // InternalMyDsl.g:2058:2: rule__EndInteraction__Group__0__Impl rule__EndInteraction__Group__1
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
    // InternalMyDsl.g:2065:1: rule__EndInteraction__Group__0__Impl : ( 'end' ) ;
    public final void rule__EndInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2069:1: ( ( 'end' ) )
            // InternalMyDsl.g:2070:1: ( 'end' )
            {
            // InternalMyDsl.g:2070:1: ( 'end' )
            // InternalMyDsl.g:2071:2: 'end'
            {
             before(grammarAccess.getEndInteractionAccess().getEndKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:2080:1: rule__EndInteraction__Group__1 : rule__EndInteraction__Group__1__Impl ;
    public final void rule__EndInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( rule__EndInteraction__Group__1__Impl )
            // InternalMyDsl.g:2085:2: rule__EndInteraction__Group__1__Impl
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
    // InternalMyDsl.g:2091:1: rule__EndInteraction__Group__1__Impl : ( ';' ) ;
    public final void rule__EndInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( ( ';' ) )
            // InternalMyDsl.g:2096:1: ( ';' )
            {
            // InternalMyDsl.g:2096:1: ( ';' )
            // InternalMyDsl.g:2097:2: ';'
            {
             before(grammarAccess.getEndInteractionAccess().getSemicolonKeyword_1()); 
            match(input,31,FOLLOW_2); 
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


    // $ANTLR start "rule__Payload__Group__0"
    // InternalMyDsl.g:2107:1: rule__Payload__Group__0 : rule__Payload__Group__0__Impl rule__Payload__Group__1 ;
    public final void rule__Payload__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( rule__Payload__Group__0__Impl rule__Payload__Group__1 )
            // InternalMyDsl.g:2112:2: rule__Payload__Group__0__Impl rule__Payload__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2119:1: rule__Payload__Group__0__Impl : ( () ) ;
    public final void rule__Payload__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( ( () ) )
            // InternalMyDsl.g:2124:1: ( () )
            {
            // InternalMyDsl.g:2124:1: ( () )
            // InternalMyDsl.g:2125:2: ()
            {
             before(grammarAccess.getPayloadAccess().getPayloadAction_0()); 
            // InternalMyDsl.g:2126:2: ()
            // InternalMyDsl.g:2126:3: 
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
    // InternalMyDsl.g:2134:1: rule__Payload__Group__1 : rule__Payload__Group__1__Impl ;
    public final void rule__Payload__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( rule__Payload__Group__1__Impl )
            // InternalMyDsl.g:2139:2: rule__Payload__Group__1__Impl
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
    // InternalMyDsl.g:2145:1: rule__Payload__Group__1__Impl : ( ( rule__Payload__Group_1__0 ) ) ;
    public final void rule__Payload__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( ( ( rule__Payload__Group_1__0 ) ) )
            // InternalMyDsl.g:2150:1: ( ( rule__Payload__Group_1__0 ) )
            {
            // InternalMyDsl.g:2150:1: ( ( rule__Payload__Group_1__0 ) )
            // InternalMyDsl.g:2151:2: ( rule__Payload__Group_1__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup_1()); 
            // InternalMyDsl.g:2152:2: ( rule__Payload__Group_1__0 )
            // InternalMyDsl.g:2152:3: rule__Payload__Group_1__0
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
    // InternalMyDsl.g:2161:1: rule__Payload__Group_1__0 : rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 ;
    public final void rule__Payload__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 )
            // InternalMyDsl.g:2166:2: rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1
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
    // InternalMyDsl.g:2173:1: rule__Payload__Group_1__0__Impl : ( ( rule__Payload__TypesAssignment_1_0 ) ) ;
    public final void rule__Payload__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( ( ( rule__Payload__TypesAssignment_1_0 ) ) )
            // InternalMyDsl.g:2178:1: ( ( rule__Payload__TypesAssignment_1_0 ) )
            {
            // InternalMyDsl.g:2178:1: ( ( rule__Payload__TypesAssignment_1_0 ) )
            // InternalMyDsl.g:2179:2: ( rule__Payload__TypesAssignment_1_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_1_0()); 
            // InternalMyDsl.g:2180:2: ( rule__Payload__TypesAssignment_1_0 )
            // InternalMyDsl.g:2180:3: rule__Payload__TypesAssignment_1_0
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
    // InternalMyDsl.g:2188:1: rule__Payload__Group_1__1 : rule__Payload__Group_1__1__Impl ;
    public final void rule__Payload__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( rule__Payload__Group_1__1__Impl )
            // InternalMyDsl.g:2193:2: rule__Payload__Group_1__1__Impl
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
    // InternalMyDsl.g:2199:1: rule__Payload__Group_1__1__Impl : ( ( rule__Payload__Group_1_1__0 )* ) ;
    public final void rule__Payload__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( ( ( rule__Payload__Group_1_1__0 )* ) )
            // InternalMyDsl.g:2204:1: ( ( rule__Payload__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:2204:1: ( ( rule__Payload__Group_1_1__0 )* )
            // InternalMyDsl.g:2205:2: ( rule__Payload__Group_1_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_1_1()); 
            // InternalMyDsl.g:2206:2: ( rule__Payload__Group_1_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:2206:3: rule__Payload__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Payload__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:2215:1: rule__Payload__Group_1_1__0 : rule__Payload__Group_1_1__0__Impl rule__Payload__Group_1_1__1 ;
    public final void rule__Payload__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( rule__Payload__Group_1_1__0__Impl rule__Payload__Group_1_1__1 )
            // InternalMyDsl.g:2220:2: rule__Payload__Group_1_1__0__Impl rule__Payload__Group_1_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2227:1: rule__Payload__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( ( ',' ) )
            // InternalMyDsl.g:2232:1: ( ',' )
            {
            // InternalMyDsl.g:2232:1: ( ',' )
            // InternalMyDsl.g:2233:2: ','
            {
             before(grammarAccess.getPayloadAccess().getCommaKeyword_1_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2242:1: rule__Payload__Group_1_1__1 : rule__Payload__Group_1_1__1__Impl ;
    public final void rule__Payload__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( rule__Payload__Group_1_1__1__Impl )
            // InternalMyDsl.g:2247:2: rule__Payload__Group_1_1__1__Impl
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
    // InternalMyDsl.g:2253:1: rule__Payload__Group_1_1__1__Impl : ( ( rule__Payload__TypesAssignment_1_1_1 ) ) ;
    public final void rule__Payload__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( ( rule__Payload__TypesAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:2258:1: ( ( rule__Payload__TypesAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:2258:1: ( ( rule__Payload__TypesAssignment_1_1_1 ) )
            // InternalMyDsl.g:2259:2: ( rule__Payload__TypesAssignment_1_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_1_1_1()); 
            // InternalMyDsl.g:2260:2: ( rule__Payload__TypesAssignment_1_1_1 )
            // InternalMyDsl.g:2260:3: rule__Payload__TypesAssignment_1_1_1
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


    // $ANTLR start "rule__Model__ProtocolNameAssignment_2"
    // InternalMyDsl.g:2269:1: rule__Model__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Model__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2274:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2274:2: ( RULE_ID )
            // InternalMyDsl.g:2275:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getProtocolNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getProtocolNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProtocolNameAssignment_2"


    // $ANTLR start "rule__Model__RolesAssignment_4"
    // InternalMyDsl.g:2284:1: rule__Model__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__Model__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2288:1: ( ( ruleRoles ) )
            // InternalMyDsl.g:2289:2: ( ruleRoles )
            {
            // InternalMyDsl.g:2289:2: ( ruleRoles )
            // InternalMyDsl.g:2290:3: ruleRoles
            {
             before(grammarAccess.getModelAccess().getRolesRolesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRoles();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRolesRolesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RolesAssignment_4"


    // $ANTLR start "rule__Model__ProtocolAssignment_6"
    // InternalMyDsl.g:2299:1: rule__Model__ProtocolAssignment_6 : ( ruleProtocol ) ;
    public final void rule__Model__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2303:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:2304:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:2304:2: ( ruleProtocol )
            // InternalMyDsl.g:2305:3: ruleProtocol
            {
             before(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProtocolAssignment_6"


    // $ANTLR start "rule__Roles__RolesAssignment_0"
    // InternalMyDsl.g:2314:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( ( ruleRole ) )
            // InternalMyDsl.g:2319:2: ( ruleRole )
            {
            // InternalMyDsl.g:2319:2: ( ruleRole )
            // InternalMyDsl.g:2320:3: ruleRole
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
    // InternalMyDsl.g:2329:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2333:1: ( ( ruleRole ) )
            // InternalMyDsl.g:2334:2: ( ruleRole )
            {
            // InternalMyDsl.g:2334:2: ( ruleRole )
            // InternalMyDsl.g:2335:3: ruleRole
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
    // InternalMyDsl.g:2344:1: rule__RoleOne__NameAssignment_1 : ( RULE_ROLENAME ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2348:1: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:2349:2: ( RULE_ROLENAME )
            {
            // InternalMyDsl.g:2349:2: ( RULE_ROLENAME )
            // InternalMyDsl.g:2350:3: RULE_ROLENAME
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
    // InternalMyDsl.g:2359:1: rule__RoleMultiple__NameAssignment_1 : ( RULE_ROLENAME ) ;
    public final void rule__RoleMultiple__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2363:1: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:2364:2: ( RULE_ROLENAME )
            {
            // InternalMyDsl.g:2364:2: ( RULE_ROLENAME )
            // InternalMyDsl.g:2365:3: RULE_ROLENAME
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
    // InternalMyDsl.g:2374:1: rule__RoleMultiple__RefAssignment_3 : ( ( RULE_ROLENAME ) ) ;
    public final void rule__RoleMultiple__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( ( ( RULE_ROLENAME ) ) )
            // InternalMyDsl.g:2379:2: ( ( RULE_ROLENAME ) )
            {
            // InternalMyDsl.g:2379:2: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:2380:3: ( RULE_ROLENAME )
            {
             before(grammarAccess.getRoleMultipleAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalMyDsl.g:2381:3: ( RULE_ROLENAME )
            // InternalMyDsl.g:2382:4: RULE_ROLENAME
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
    // InternalMyDsl.g:2393:1: rule__Protocol__ActionsAssignment_0_1 : ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) ) ;
    public final void rule__Protocol__ActionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2397:1: ( ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) ) )
            // InternalMyDsl.g:2398:2: ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) )
            {
            // InternalMyDsl.g:2398:2: ( ( rule__Protocol__ActionsAlternatives_0_1_0 ) )
            // InternalMyDsl.g:2399:3: ( rule__Protocol__ActionsAlternatives_0_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getActionsAlternatives_0_1_0()); 
            // InternalMyDsl.g:2400:3: ( rule__Protocol__ActionsAlternatives_0_1_0 )
            // InternalMyDsl.g:2400:4: rule__Protocol__ActionsAlternatives_0_1_0
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
    // InternalMyDsl.g:2408:1: rule__Recursion__NameAssignment_1 : ( RULE_RECNAME ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2412:1: ( ( RULE_RECNAME ) )
            // InternalMyDsl.g:2413:2: ( RULE_RECNAME )
            {
            // InternalMyDsl.g:2413:2: ( RULE_RECNAME )
            // InternalMyDsl.g:2414:3: RULE_RECNAME
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
    // InternalMyDsl.g:2423:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_RECNAME ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2427:1: ( ( ( RULE_RECNAME ) ) )
            // InternalMyDsl.g:2428:2: ( ( RULE_RECNAME ) )
            {
            // InternalMyDsl.g:2428:2: ( ( RULE_RECNAME ) )
            // InternalMyDsl.g:2429:3: ( RULE_RECNAME )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalMyDsl.g:2430:3: ( RULE_RECNAME )
            // InternalMyDsl.g:2431:4: RULE_RECNAME
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
    // InternalMyDsl.g:2442:1: rule__ForEach__EachRoleAssignment_1 : ( ruleRole ) ;
    public final void rule__ForEach__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( ruleRole ) )
            // InternalMyDsl.g:2447:2: ( ruleRole )
            {
            // InternalMyDsl.g:2447:2: ( ruleRole )
            // InternalMyDsl.g:2448:3: ruleRole
            {
             before(grammarAccess.getForEachAccess().getEachRoleRoleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getForEachAccess().getEachRoleRoleParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2457:1: rule__ForEach__RoleAssignment_3 : ( ( RULE_ROLENAME ) ) ;
    public final void rule__ForEach__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( ( ( RULE_ROLENAME ) ) )
            // InternalMyDsl.g:2462:2: ( ( RULE_ROLENAME ) )
            {
            // InternalMyDsl.g:2462:2: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:2463:3: ( RULE_ROLENAME )
            {
             before(grammarAccess.getForEachAccess().getRoleRoleMultipleCrossReference_3_0()); 
            // InternalMyDsl.g:2464:3: ( RULE_ROLENAME )
            // InternalMyDsl.g:2465:4: RULE_ROLENAME
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
    // InternalMyDsl.g:2476:1: rule__ForEach__BranchAssignment_5 : ( ruleProtocol ) ;
    public final void rule__ForEach__BranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:2481:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:2481:2: ( ruleProtocol )
            // InternalMyDsl.g:2482:3: ruleProtocol
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
    // InternalMyDsl.g:2491:1: rule__Choice__RoleAssignment_2 : ( ( RULE_ROLENAME ) ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2495:1: ( ( ( RULE_ROLENAME ) ) )
            // InternalMyDsl.g:2496:2: ( ( RULE_ROLENAME ) )
            {
            // InternalMyDsl.g:2496:2: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:2497:3: ( RULE_ROLENAME )
            {
             before(grammarAccess.getChoiceAccess().getRoleRoleOneCrossReference_2_0()); 
            // InternalMyDsl.g:2498:3: ( RULE_ROLENAME )
            // InternalMyDsl.g:2499:4: RULE_ROLENAME
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
    // InternalMyDsl.g:2510:1: rule__Choice__MessageAssignment_4 : ( ruleMessage ) ;
    public final void rule__Choice__MessageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2514:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:2515:2: ( ruleMessage )
            {
            // InternalMyDsl.g:2515:2: ( ruleMessage )
            // InternalMyDsl.g:2516:3: ruleMessage
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


    // $ANTLR start "rule__Choice__BranchAssignment_5"
    // InternalMyDsl.g:2525:1: rule__Choice__BranchAssignment_5 : ( ruleProtocol ) ;
    public final void rule__Choice__BranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2529:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:2530:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:2530:2: ( ruleProtocol )
            // InternalMyDsl.g:2531:3: ruleProtocol
            {
             before(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__BranchAssignment_5"


    // $ANTLR start "rule__Choice__MessageAssignment_7_2"
    // InternalMyDsl.g:2540:1: rule__Choice__MessageAssignment_7_2 : ( ruleMessage ) ;
    public final void rule__Choice__MessageAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2544:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:2545:2: ( ruleMessage )
            {
            // InternalMyDsl.g:2545:2: ( ruleMessage )
            // InternalMyDsl.g:2546:3: ruleMessage
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


    // $ANTLR start "rule__Choice__BranchAssignment_7_3"
    // InternalMyDsl.g:2555:1: rule__Choice__BranchAssignment_7_3 : ( ruleProtocol ) ;
    public final void rule__Choice__BranchAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2559:1: ( ( ruleProtocol ) )
            // InternalMyDsl.g:2560:2: ( ruleProtocol )
            {
            // InternalMyDsl.g:2560:2: ( ruleProtocol )
            // InternalMyDsl.g:2561:3: ruleProtocol
            {
             before(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__BranchAssignment_7_3"


    // $ANTLR start "rule__Message__MessageTypeAssignment_0"
    // InternalMyDsl.g:2570:1: rule__Message__MessageTypeAssignment_0 : ( ruleMessageType ) ;
    public final void rule__Message__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2574:1: ( ( ruleMessageType ) )
            // InternalMyDsl.g:2575:2: ( ruleMessageType )
            {
            // InternalMyDsl.g:2575:2: ( ruleMessageType )
            // InternalMyDsl.g:2576:3: ruleMessageType
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
    // InternalMyDsl.g:2585:1: rule__Message__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__Message__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2589:1: ( ( rulePayload ) )
            // InternalMyDsl.g:2590:2: ( rulePayload )
            {
            // InternalMyDsl.g:2590:2: ( rulePayload )
            // InternalMyDsl.g:2591:3: rulePayload
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
    // InternalMyDsl.g:2600:1: rule__Message__SenderAssignment_5 : ( ( RULE_ROLENAME ) ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2604:1: ( ( ( RULE_ROLENAME ) ) )
            // InternalMyDsl.g:2605:2: ( ( RULE_ROLENAME ) )
            {
            // InternalMyDsl.g:2605:2: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:2606:3: ( RULE_ROLENAME )
            {
             before(grammarAccess.getMessageAccess().getSenderRoleOneCrossReference_5_0()); 
            // InternalMyDsl.g:2607:3: ( RULE_ROLENAME )
            // InternalMyDsl.g:2608:4: RULE_ROLENAME
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
    // InternalMyDsl.g:2619:1: rule__Message__ReceiverAssignment_7 : ( ( RULE_ROLENAME ) ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( ( ( RULE_ROLENAME ) ) )
            // InternalMyDsl.g:2624:2: ( ( RULE_ROLENAME ) )
            {
            // InternalMyDsl.g:2624:2: ( ( RULE_ROLENAME ) )
            // InternalMyDsl.g:2625:3: ( RULE_ROLENAME )
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleCrossReference_7_0()); 
            // InternalMyDsl.g:2626:3: ( RULE_ROLENAME )
            // InternalMyDsl.g:2627:4: RULE_ROLENAME
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleROLENAMETerminalRuleCall_7_0_1()); 
            match(input,RULE_ROLENAME,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getReceiverRoleROLENAMETerminalRuleCall_7_0_1()); 

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


    // $ANTLR start "rule__Payload__TypesAssignment_1_0"
    // InternalMyDsl.g:2638:1: rule__Payload__TypesAssignment_1_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( ( ruleType ) )
            // InternalMyDsl.g:2643:2: ( ruleType )
            {
            // InternalMyDsl.g:2643:2: ( ruleType )
            // InternalMyDsl.g:2644:3: ruleType
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
    // InternalMyDsl.g:2653:1: rule__Payload__TypesAssignment_1_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2657:1: ( ( ruleType ) )
            // InternalMyDsl.g:2658:2: ( ruleType )
            {
            // InternalMyDsl.g:2658:2: ( ruleType )
            // InternalMyDsl.g:2659:3: ruleType
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000001056001E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000056001E000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000056001E002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000020000E0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000E0000L});

}