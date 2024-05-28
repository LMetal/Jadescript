package org.xtext.globalTypes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_PROTOCOLNAME=4;
    public static final int RULE_ID=8;
    public static final int RULE_ROLENAME=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
    public static final int RULE_RECNAME=7;
    public static final int RULE_SL_COMMENT=12;
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
    public static final int RULE_WS=13;
    public static final int RULE_ROLESETNAME=6;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'global' )
            // InternalMyDsl.g:11:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'protocol' )
            // InternalMyDsl.g:12:9: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( '(' )
            // InternalMyDsl.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( '){' )
            // InternalMyDsl.g:14:9: '){'
            {
            match("){"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( '}' )
            // InternalMyDsl.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( ',' )
            // InternalMyDsl.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'role' )
            // InternalMyDsl.g:17:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'roleset' )
            // InternalMyDsl.g:18:9: 'roleset'
            {
            match("roleset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( ':' )
            // InternalMyDsl.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'rec' )
            // InternalMyDsl.g:20:9: 'rec'
            {
            match("rec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'loop' )
            // InternalMyDsl.g:21:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( ';' )
            // InternalMyDsl.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( 'foreach' )
            // InternalMyDsl.g:23:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( '{' )
            // InternalMyDsl.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'choice' )
            // InternalMyDsl.g:25:9: 'choice'
            {
            match("choice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'at' )
            // InternalMyDsl.g:26:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( 'or' )
            // InternalMyDsl.g:27:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( ')' )
            // InternalMyDsl.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'from' )
            // InternalMyDsl.g:29:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'to' )
            // InternalMyDsl.g:30:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'local' )
            // InternalMyDsl.g:31:9: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'projection' )
            // InternalMyDsl.g:32:9: 'projection'
            {
            match("projection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( 'on' )
            // InternalMyDsl.g:33:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'REQUEST' )
            // InternalMyDsl.g:34:9: 'REQUEST'
            {
            match("REQUEST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'INFORM' )
            // InternalMyDsl.g:35:9: 'INFORM'
            {
            match("INFORM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'AGREE' )
            // InternalMyDsl.g:36:9: 'AGREE'
            {
            match("AGREE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'REFUSE' )
            // InternalMyDsl.g:37:9: 'REFUSE'
            {
            match("REFUSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'CFP' )
            // InternalMyDsl.g:38:9: 'CFP'
            {
            match("CFP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'QUIT' )
            // InternalMyDsl.g:39:9: 'QUIT'
            {
            match("QUIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'int' )
            // InternalMyDsl.g:40:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( 'string' )
            // InternalMyDsl.g:41:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( 'action' )
            // InternalMyDsl.g:42:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_ROLENAME"
    public final void mRULE_ROLENAME() throws RecognitionException {
        try {
            int _type = RULE_ROLENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1997:15: ( ( 'a' .. 'z' )* )
            // InternalMyDsl.g:1997:17: ( 'a' .. 'z' )*
            {
            // InternalMyDsl.g:1997:17: ( 'a' .. 'z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:1997:18: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROLENAME"

    // $ANTLR start "RULE_ROLESETNAME"
    public final void mRULE_ROLESETNAME() throws RecognitionException {
        try {
            int _type = RULE_ROLESETNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1999:18: ( 'A' .. 'Z' ( 'a' .. 'z' )* )
            // InternalMyDsl.g:1999:20: 'A' .. 'Z' ( 'a' .. 'z' )*
            {
            matchRange('A','Z'); 
            // InternalMyDsl.g:1999:29: ( 'a' .. 'z' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:1999:30: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROLESETNAME"

    // $ANTLR start "RULE_RECNAME"
    public final void mRULE_RECNAME() throws RecognitionException {
        try {
            int _type = RULE_RECNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2001:14: ( ( 'A' .. 'Z' )+ )
            // InternalMyDsl.g:2001:16: ( 'A' .. 'Z' )+
            {
            // InternalMyDsl.g:2001:16: ( 'A' .. 'Z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:2001:17: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RECNAME"

    // $ANTLR start "RULE_PROTOCOLNAME"
    public final void mRULE_PROTOCOLNAME() throws RecognitionException {
        try {
            int _type = RULE_PROTOCOLNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2003:19: ( '_' ( 'a' .. 'z' )* )
            // InternalMyDsl.g:2003:21: '_' ( 'a' .. 'z' )*
            {
            match('_'); 
            // InternalMyDsl.g:2003:25: ( 'a' .. 'z' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:2003:26: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROTOCOLNAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2005:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:2005:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:2005:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:2005:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:2005:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2007:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:2007:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:2007:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:2007:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2009:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:2009:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:2009:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:2009:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:2009:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:2009:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2009:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2009:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:2009:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:2009:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2009:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2011:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:2011:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:2011:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2011:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2013:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:2013:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:2013:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2013:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalMyDsl.g:2013:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2013:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:2013:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:2013:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2015:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:2015:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:2015:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2017:16: ( . )
            // InternalMyDsl.g:2017:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_ROLENAME | RULE_ROLESETNAME | RULE_RECNAME | RULE_PROTOCOLNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=43;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalMyDsl.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: RULE_ROLENAME
                {
                mRULE_ROLENAME(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:216: RULE_ROLESETNAME
                {
                mRULE_ROLESETNAME(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:233: RULE_RECNAME
                {
                mRULE_RECNAME(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:246: RULE_PROTOCOLNAME
                {
                mRULE_PROTOCOLNAME(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:264: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:272: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:281: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:293: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:309: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:325: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:333: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\3\31\1\uffff\1\51\2\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\4\31\5\73\3\31\1\uffff\1\73\1\104\1\42\1\uffff\3\42\2\uffff\2\31\1\uffff\1\31\5\uffff\2\31\1\uffff\1\31\1\uffff\2\31\1\uffff\1\31\1\124\1\31\1\126\1\127\1\130\1\133\1\uffff\1\133\1\73\4\133\2\31\1\uffff\1\104\5\uffff\3\31\1\146\5\31\1\uffff\1\31\3\uffff\2\133\1\uffff\2\133\1\161\1\133\1\163\4\31\1\171\1\uffff\1\172\2\31\1\175\2\31\4\133\1\uffff\1\u0084\1\uffff\5\31\2\uffff\1\u008a\1\31\1\uffff\2\31\3\133\1\u0091\1\uffff\1\31\1\u0093\3\31\1\uffff\1\31\1\u0098\1\u0099\1\133\1\u009b\1\u009c\1\uffff\1\u009d\1\uffff\2\31\1\u00a0\1\u00a1\2\uffff\1\u00a2\3\uffff\1\u00a3\1\31\4\uffff\1\31\1\u00a6\1\uffff";
    static final String DFA16_eofS =
        "\u00a7\uffff";
    static final String DFA16_minS =
        "\1\0\2\60\1\uffff\1\173\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\14\60\1\uffff\2\60\1\101\1\uffff\2\0\1\52\2\uffff\2\60\1\uffff\1\60\5\uffff\2\60\1\uffff\1\60\1\uffff\2\60\1\uffff\7\60\1\uffff\10\60\1\uffff\1\60\5\uffff\11\60\1\uffff\1\60\3\uffff\2\60\1\uffff\12\60\1\uffff\12\60\1\uffff\1\60\1\uffff\5\60\2\uffff\2\60\1\uffff\6\60\1\uffff\5\60\1\uffff\6\60\1\uffff\1\60\1\uffff\4\60\2\uffff\1\60\3\uffff\2\60\4\uffff\2\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\2\172\1\uffff\1\173\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\14\172\1\uffff\3\172\1\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\5\uffff\2\172\1\uffff\1\172\1\uffff\2\172\1\uffff\7\172\1\uffff\10\172\1\uffff\1\172\5\uffff\11\172\1\uffff\1\172\3\uffff\2\172\1\uffff\12\172\1\uffff\12\172\1\uffff\1\172\1\uffff\5\172\2\uffff\2\172\1\uffff\6\172\1\uffff\5\172\1\uffff\6\172\1\uffff\1\172\1\uffff\4\172\2\uffff\1\172\3\uffff\2\172\4\uffff\2\172\1\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\6\1\uffff\1\11\1\uffff\1\14\1\uffff\1\16\14\uffff\1\41\3\uffff\1\46\3\uffff\1\52\1\53\2\uffff\1\45\1\uffff\1\3\1\4\1\22\1\5\1\6\2\uffff\1\11\1\uffff\1\14\2\uffff\1\16\7\uffff\1\42\10\uffff\1\44\1\uffff\1\46\1\47\1\50\1\51\1\52\11\uffff\1\20\1\uffff\1\21\1\27\1\24\2\uffff\1\43\12\uffff\1\12\12\uffff\1\34\1\uffff\1\36\5\uffff\1\7\1\13\2\uffff\1\23\6\uffff\1\35\5\uffff\1\25\6\uffff\1\32\1\uffff\1\1\4\uffff\1\17\1\40\1\uffff\1\33\1\31\1\37\2\uffff\1\10\1\15\1\30\1\2\2\uffff\1\26";
    static final String DFA16_specialS =
        "\1\0\35\uffff\1\2\1\1\u0087\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\36\4\42\1\37\1\3\1\4\2\42\1\6\2\42\1\40\12\35\1\10\1\12\5\42\1\23\1\32\1\24\5\32\1\22\7\32\1\25\1\21\10\32\3\42\1\34\1\33\1\42\1\16\1\30\1\15\2\30\1\13\1\1\1\30\1\26\2\30\1\11\2\30\1\17\1\2\1\30\1\7\1\27\1\20\6\30\1\14\1\42\1\5\uff82\42",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\44\1\43\16\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\44\1\46\10\44",
            "",
            "\1\50",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\44\1\55\11\44\1\54\13\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\57\13\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\61\2\44\1\62\10\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\7\44\1\64\22\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\44\1\66\20\44\1\65\6\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\44\1\70\3\44\1\67\10\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\71\13\44",
            "\12\45\7\uffff\4\74\1\72\25\74\4\uffff\1\45\1\uffff\32\75",
            "\12\45\7\uffff\15\74\1\76\14\74\4\uffff\1\45\1\uffff\32\75",
            "\12\45\7\uffff\6\74\1\77\23\74\4\uffff\1\45\1\uffff\32\75",
            "\12\45\7\uffff\5\74\1\100\24\74\4\uffff\1\45\1\uffff\32\75",
            "\12\45\7\uffff\24\74\1\101\5\74\4\uffff\1\45\1\uffff\32\75",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\44\1\102\14\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\44\1\103\6\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "",
            "\12\45\7\uffff\32\74\4\uffff\1\45\1\uffff\32\75",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\105",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\0\107",
            "\0\107",
            "\1\110\4\uffff\1\111",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\113\13\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\114\13\44",
            "",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\44\1\115\16\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\44\1\116\27\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\44\1\120\13\44\1\117\13\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\44\1\121\10\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\122\13\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\123\13\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\44\1\125\6\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\5\74\1\132\12\74\1\131\11\74\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\75",
            "\12\45\7\uffff\5\74\1\134\24\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\21\74\1\135\10\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\17\74\1\136\12\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\10\74\1\137\21\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\44\1\140\6\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\44\1\141\10\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\105",
            "",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\44\1\142\30\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\11\44\1\144\11\44\1\143\6\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\44\1\145\25\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\44\1\147\12\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\150\31\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\44\1\151\25\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\14\44\1\152\15\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\44\1\153\21\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\44\1\154\21\44",
            "",
            "",
            "",
            "\12\45\7\uffff\24\74\1\155\5\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\24\74\1\156\5\74\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\16\74\1\157\13\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\4\74\1\160\25\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\23\74\1\162\6\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\44\1\164\21\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\165\31\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\166\13\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\44\1\167\25\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\44\1\170\7\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\44\1\173\16\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\174\31\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\44\1\176\27\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\177\13\44",
            "\12\45\7\uffff\4\74\1\u0080\25\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\22\74\1\u0081\7\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\21\74\1\u0082\10\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\4\74\1\u0083\25\74\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\74\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\44\1\u0085\14\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\44\1\u0086\16\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\44\1\u0087\27\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\44\1\u0088\27\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\44\1\u0089\25\44",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\44\1\u008b\27\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\44\1\u008c\25\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\44\1\u008d\14\44",
            "\12\45\7\uffff\22\74\1\u008e\7\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\4\74\1\u008f\25\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\14\74\1\u0090\15\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\74\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\44\1\u0092\23\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\u0094\13\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\44\1\u0095\6\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\44\1\u0096\6\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\7\44\1\u0097\22\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\23\74\1\u009a\6\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\74\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\74\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\44\1\u009e\16\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\44\1\u009f\21\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "",
            "",
            "\12\45\7\uffff\32\74\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\44\1\u00a4\13\44",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\44\1\u00a5\14\44",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\44",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_ROLENAME | RULE_ROLESETNAME | RULE_RECNAME | RULE_PROTOCOLNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='g') ) {s = 1;}

                        else if ( (LA16_0=='p') ) {s = 2;}

                        else if ( (LA16_0=='(') ) {s = 3;}

                        else if ( (LA16_0==')') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0==',') ) {s = 6;}

                        else if ( (LA16_0=='r') ) {s = 7;}

                        else if ( (LA16_0==':') ) {s = 8;}

                        else if ( (LA16_0=='l') ) {s = 9;}

                        else if ( (LA16_0==';') ) {s = 10;}

                        else if ( (LA16_0=='f') ) {s = 11;}

                        else if ( (LA16_0=='{') ) {s = 12;}

                        else if ( (LA16_0=='c') ) {s = 13;}

                        else if ( (LA16_0=='a') ) {s = 14;}

                        else if ( (LA16_0=='o') ) {s = 15;}

                        else if ( (LA16_0=='t') ) {s = 16;}

                        else if ( (LA16_0=='R') ) {s = 17;}

                        else if ( (LA16_0=='I') ) {s = 18;}

                        else if ( (LA16_0=='A') ) {s = 19;}

                        else if ( (LA16_0=='C') ) {s = 20;}

                        else if ( (LA16_0=='Q') ) {s = 21;}

                        else if ( (LA16_0=='i') ) {s = 22;}

                        else if ( (LA16_0=='s') ) {s = 23;}

                        else if ( (LA16_0=='b'||(LA16_0>='d' && LA16_0<='e')||LA16_0=='h'||(LA16_0>='j' && LA16_0<='k')||(LA16_0>='m' && LA16_0<='n')||LA16_0=='q'||(LA16_0>='u' && LA16_0<='z')) ) {s = 24;}

                        else if ( (LA16_0=='B'||(LA16_0>='D' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='P')||(LA16_0>='S' && LA16_0<='Z')) ) {s = 26;}

                        else if ( (LA16_0=='_') ) {s = 27;}

                        else if ( (LA16_0=='^') ) {s = 28;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 29;}

                        else if ( (LA16_0=='\"') ) {s = 30;}

                        else if ( (LA16_0=='\'') ) {s = 31;}

                        else if ( (LA16_0=='/') ) {s = 32;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 33;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='*' && LA16_0<='+')||(LA16_0>='-' && LA16_0<='.')||(LA16_0>='<' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 34;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_31 = input.LA(1);

                        s = -1;
                        if ( ((LA16_31>='\u0000' && LA16_31<='\uFFFF')) ) {s = 71;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_30 = input.LA(1);

                        s = -1;
                        if ( ((LA16_30>='\u0000' && LA16_30<='\uFFFF')) ) {s = 71;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}