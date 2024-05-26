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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'multrole' )
            // InternalMyDsl.g:18:9: 'multrole'
            {
            match("multrole"); 


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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'end' )
            // InternalMyDsl.g:34:9: 'end'
            {
            match("end"); 


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
            // InternalMyDsl.g:35:7: ( 'REQUEST' )
            // InternalMyDsl.g:35:9: 'REQUEST'
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
            // InternalMyDsl.g:36:7: ( 'INFORM' )
            // InternalMyDsl.g:36:9: 'INFORM'
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
            // InternalMyDsl.g:37:7: ( 'AGREE' )
            // InternalMyDsl.g:37:9: 'AGREE'
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
            // InternalMyDsl.g:38:7: ( 'REFUSE' )
            // InternalMyDsl.g:38:9: 'REFUSE'
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
            // InternalMyDsl.g:39:7: ( 'int' )
            // InternalMyDsl.g:39:9: 'int'
            {
            match("int"); 


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
            // InternalMyDsl.g:40:7: ( 'string' )
            // InternalMyDsl.g:40:9: 'string'
            {
            match("string"); 


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
            // InternalMyDsl.g:41:7: ( 'action' )
            // InternalMyDsl.g:41:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_ROLENAME"
    public final void mRULE_ROLENAME() throws RecognitionException {
        try {
            int _type = RULE_ROLENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1894:15: ( 'A' .. 'Z' ( ( 'A' .. 'Z' )? 'a' .. 'z' )* )
            // InternalMyDsl.g:1894:17: 'A' .. 'Z' ( ( 'A' .. 'Z' )? 'a' .. 'z' )*
            {
            matchRange('A','Z'); 
            // InternalMyDsl.g:1894:26: ( ( 'A' .. 'Z' )? 'a' .. 'z' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:1894:27: ( 'A' .. 'Z' )? 'a' .. 'z'
            	    {
            	    // InternalMyDsl.g:1894:27: ( 'A' .. 'Z' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( ((LA1_0>='A' && LA1_0<='Z')) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalMyDsl.g:1894:28: 'A' .. 'Z'
            	            {
            	            matchRange('A','Z'); 

            	            }
            	            break;

            	    }

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
    // $ANTLR end "RULE_ROLENAME"

    // $ANTLR start "RULE_ROLENAME_L"
    public final void mRULE_ROLENAME_L() throws RecognitionException {
        try {
            int _type = RULE_ROLENAME_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1896:17: ( ( 'A' .. 'Z' ( ( 'A' .. 'Z' )? 'a' .. 'z' )* )? 'self' )
            // InternalMyDsl.g:1896:19: ( 'A' .. 'Z' ( ( 'A' .. 'Z' )? 'a' .. 'z' )* )? 'self'
            {
            // InternalMyDsl.g:1896:19: ( 'A' .. 'Z' ( ( 'A' .. 'Z' )? 'a' .. 'z' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='A' && LA5_0<='Z')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1896:20: 'A' .. 'Z' ( ( 'A' .. 'Z' )? 'a' .. 'z' )*
                    {
                    matchRange('A','Z'); 
                    // InternalMyDsl.g:1896:29: ( ( 'A' .. 'Z' )? 'a' .. 'z' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='s') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1=='e') ) {
                                int LA4_3 = input.LA(3);

                                if ( (LA4_3=='l') ) {
                                    int LA4_4 = input.LA(4);

                                    if ( (LA4_4=='f') ) {
                                        int LA4_5 = input.LA(5);

                                        if ( ((LA4_5>='A' && LA4_5<='Z')||(LA4_5>='a' && LA4_5<='z')) ) {
                                            alt4=1;
                                        }


                                    }
                                    else if ( ((LA4_4>='A' && LA4_4<='Z')||(LA4_4>='a' && LA4_4<='e')||(LA4_4>='g' && LA4_4<='z')) ) {
                                        alt4=1;
                                    }


                                }
                                else if ( ((LA4_3>='A' && LA4_3<='Z')||(LA4_3>='a' && LA4_3<='k')||(LA4_3>='m' && LA4_3<='z')) ) {
                                    alt4=1;
                                }


                            }
                            else if ( ((LA4_1>='A' && LA4_1<='Z')||(LA4_1>='a' && LA4_1<='d')||(LA4_1>='f' && LA4_1<='z')) ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='r')||(LA4_0>='t' && LA4_0<='z')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:1896:30: ( 'A' .. 'Z' )? 'a' .. 'z'
                    	    {
                    	    // InternalMyDsl.g:1896:30: ( 'A' .. 'Z' )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( ((LA3_0>='A' && LA3_0<='Z')) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // InternalMyDsl.g:1896:31: 'A' .. 'Z'
                    	            {
                    	            matchRange('A','Z'); 

                    	            }
                    	            break;

                    	    }

                    	    matchRange('a','z'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROLENAME_L"

    // $ANTLR start "RULE_RECNAME"
    public final void mRULE_RECNAME() throws RecognitionException {
        try {
            int _type = RULE_RECNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1898:14: ( ( 'A' .. 'Z' )+ )
            // InternalMyDsl.g:1898:16: ( 'A' .. 'Z' )+
            {
            // InternalMyDsl.g:1898:16: ( 'A' .. 'Z' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='A' && LA6_0<='Z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1898:17: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RECNAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1900:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1900:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1900:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1900:11: '^'
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

            // InternalMyDsl.g:1900:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    break loop8;
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
            // InternalMyDsl.g:1902:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1902:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1902:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1902:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // InternalMyDsl.g:1904:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1904:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1904:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1904:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1904:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:1904:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1904:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1904:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1904:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:1904:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1904:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // InternalMyDsl.g:1906:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:1906:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:1906:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1906:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalMyDsl.g:1908:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1908:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:1908:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1908:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // InternalMyDsl.g:1908:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1908:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1908:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:1908:41: '\\r'
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
            // InternalMyDsl.g:1910:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1910:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1910:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalMyDsl.g:1912:16: ( . )
            // InternalMyDsl.g:1912:18: .
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
        // InternalMyDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_ROLENAME | RULE_ROLENAME_L | RULE_RECNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=41;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalMyDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: RULE_ROLENAME
                {
                mRULE_ROLENAME(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:210: RULE_ROLENAME_L
                {
                mRULE_ROLENAME_L(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:226: RULE_RECNAME
                {
                mRULE_RECNAME(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:239: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:247: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:256: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:268: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:284: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:300: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:308: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\2\42\1\uffff\1\46\2\uffff\2\42\1\uffff\1\42\1\uffff\1\42\1\uffff\5\42\3\74\2\42\1\74\1\40\2\uffff\3\40\2\uffff\1\42\1\uffff\1\42\5\uffff\3\42\1\uffff\1\42\1\uffff\2\42\1\uffff\1\42\1\122\1\42\1\124\1\125\1\126\1\42\2\132\1\74\1\uffff\1\74\2\132\3\42\5\uffff\3\42\1\147\6\42\1\uffff\1\42\3\uffff\1\157\2\132\1\uffff\1\132\1\74\1\42\2\132\1\165\5\42\1\173\1\uffff\1\42\1\175\2\42\1\u0080\2\42\1\uffff\2\132\1\74\2\132\1\uffff\1\42\1\u0089\3\42\1\uffff\1\42\1\uffff\1\u008e\1\42\1\uffff\2\42\2\132\1\74\1\132\1\u0095\1\42\1\uffff\1\u0097\3\42\1\uffff\1\42\1\u009c\1\u009d\1\132\1\u009f\1\u00a0\1\uffff\1\u00a1\1\uffff\3\42\1\u00a5\2\uffff\1\u00a6\3\uffff\1\u00a7\1\42\1\u00a9\3\uffff\1\42\1\uffff\1\u00ab\1\uffff";
    static final String DFA18_eofS =
        "\u00ac\uffff";
    static final String DFA18_minS =
        "\1\0\1\154\1\162\1\uffff\1\173\2\uffff\1\145\1\165\1\uffff\1\157\1\uffff\1\157\1\uffff\1\150\1\143\1\156\1\157\1\156\3\60\1\156\1\145\1\60\1\101\2\uffff\2\0\1\52\2\uffff\1\157\1\uffff\1\157\5\uffff\1\154\1\143\1\154\1\uffff\1\143\1\uffff\1\162\1\157\1\uffff\1\157\1\60\1\164\3\60\1\144\3\60\1\uffff\3\60\1\164\1\162\1\154\5\uffff\1\142\1\152\1\145\1\60\1\164\1\160\1\141\1\145\1\155\1\151\1\uffff\1\151\3\uffff\3\60\1\uffff\2\60\1\141\3\60\1\151\1\146\1\141\1\157\1\145\1\60\1\uffff\1\162\1\60\1\154\1\141\1\60\1\143\1\157\1\uffff\5\60\1\uffff\1\156\1\60\1\154\2\143\1\uffff\1\157\1\uffff\1\60\1\143\1\uffff\1\145\1\156\5\60\1\147\1\uffff\1\60\1\157\1\164\1\154\1\uffff\1\150\5\60\1\uffff\1\60\1\uffff\1\154\1\151\1\145\1\60\2\uffff\1\60\3\uffff\1\60\1\157\1\60\3\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\154\1\162\1\uffff\1\173\2\uffff\1\157\1\165\1\uffff\1\157\1\uffff\1\162\1\uffff\1\150\1\164\1\162\1\157\1\156\3\172\1\156\1\164\2\172\2\uffff\2\uffff\1\57\2\uffff\1\157\1\uffff\1\157\5\uffff\1\154\1\143\1\154\1\uffff\1\157\1\uffff\1\162\1\157\1\uffff\1\157\1\172\1\164\3\172\1\144\3\172\1\uffff\3\172\1\164\1\162\1\154\5\uffff\1\142\1\164\1\145\1\172\1\164\1\160\1\141\1\145\1\155\1\151\1\uffff\1\151\3\uffff\3\172\1\uffff\6\172\1\151\1\146\1\141\1\157\1\145\1\172\1\uffff\1\162\1\172\1\154\1\141\1\172\1\143\1\157\1\uffff\5\172\1\uffff\1\156\1\172\1\154\2\143\1\uffff\1\157\1\uffff\1\172\1\143\1\uffff\1\145\1\156\5\172\1\147\1\uffff\1\172\1\157\1\164\1\154\1\uffff\1\150\5\172\1\uffff\1\172\1\uffff\1\154\1\151\1\145\1\172\2\uffff\1\172\3\uffff\1\172\1\157\1\172\3\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\6\2\uffff\1\11\1\uffff\1\14\1\uffff\1\16\14\uffff\1\43\1\44\3\uffff\1\50\1\51\1\uffff\1\43\1\uffff\1\3\1\4\1\22\1\5\1\6\3\uffff\1\11\1\uffff\1\14\2\uffff\1\16\12\uffff\1\40\6\uffff\1\44\1\45\1\46\1\47\1\50\12\uffff\1\20\1\uffff\1\21\1\27\1\24\3\uffff\1\42\14\uffff\1\12\7\uffff\1\30\5\uffff\1\35\5\uffff\1\7\1\uffff\1\13\2\uffff\1\23\10\uffff\1\41\4\uffff\1\25\6\uffff\1\33\1\uffff\1\1\4\uffff\1\17\1\37\1\uffff\1\34\1\32\1\36\3\uffff\1\15\1\31\1\2\1\uffff\1\10\1\uffff\1\26";
    static final String DFA18_specialS =
        "\1\0\33\uffff\1\2\1\1\u008e\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\34\4\40\1\35\1\3\1\4\2\40\1\6\2\40\1\36\12\33\1\11\1\13\5\40\1\25\7\30\1\24\10\30\1\23\10\30\3\40\1\31\1\32\1\40\1\17\1\32\1\16\1\32\1\22\1\14\1\1\1\32\1\26\2\32\1\12\1\10\1\32\1\20\1\2\1\32\1\7\1\27\1\21\6\32\1\15\1\40\1\5\uff82\40",
            "\1\41",
            "\1\43",
            "",
            "\1\45",
            "",
            "",
            "\1\52\11\uffff\1\51",
            "\1\53",
            "",
            "\1\55",
            "",
            "\1\57\2\uffff\1\60",
            "",
            "\1\62",
            "\1\64\20\uffff\1\63",
            "\1\66\3\uffff\1\65",
            "\1\67",
            "\1\70",
            "\12\42\7\uffff\4\72\1\71\25\72\4\uffff\1\42\1\uffff\22\75\1\73\7\75",
            "\12\42\7\uffff\15\72\1\76\14\72\4\uffff\1\42\1\uffff\22\75\1\73\7\75",
            "\12\42\7\uffff\6\72\1\77\23\72\4\uffff\1\42\1\uffff\22\75\1\73\7\75",
            "\1\100",
            "\1\102\16\uffff\1\101",
            "\12\42\7\uffff\32\72\4\uffff\1\42\1\uffff\22\75\1\73\7\75",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\104",
            "\0\104",
            "\1\105\4\uffff\1\106",
            "",
            "",
            "\1\110",
            "",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\116\13\uffff\1\115",
            "",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\123",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\127",
            "\12\42\7\uffff\5\133\1\131\12\133\1\130\11\133\4\uffff\1\42\1\uffff\32\75",
            "\12\42\7\uffff\32\133\4\uffff\1\42\1\uffff\32\75",
            "\12\42\7\uffff\32\135\4\uffff\1\42\1\uffff\4\75\1\134\15\75\1\73\7\75",
            "",
            "\12\42\7\uffff\32\135\4\uffff\1\42\1\uffff\22\75\1\73\7\75",
            "\12\42\7\uffff\5\133\1\136\24\133\4\uffff\1\42\1\uffff\32\75",
            "\12\42\7\uffff\21\133\1\137\10\133\4\uffff\1\42\1\uffff\32\75",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "\1\145\11\uffff\1\144",
            "\1\146",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\24\133\1\160\5\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\24\133\1\161\5\133\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\135\4\uffff\1\42\1\uffff\13\75\1\162\6\75\1\73\7\75",
            "\32\75",
            "\12\42\7\uffff\16\133\1\163\13\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\4\133\1\164\25\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\174",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\176",
            "\1\177",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0081",
            "\1\u0082",
            "",
            "\12\42\7\uffff\4\133\1\u0083\25\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\22\133\1\u0084\7\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\135\4\uffff\1\42\1\uffff\5\75\1\u0085\14\75\1\73\7\75",
            "\12\42\7\uffff\21\133\1\u0086\10\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\4\133\1\u0087\25\133\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0088",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\12\42\7\uffff\22\133\1\u0092\7\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\4\133\1\u0093\25\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\135\4\uffff\1\42\1\uffff\22\75\1\73\7\75",
            "\12\42\7\uffff\14\133\1\u0094\15\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\133\4\uffff\1\42\1\uffff\32\42",
            "\1\u0096",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\23\133\1\u009e\6\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\133\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\133\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\133\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\u00aa",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_ROLENAME | RULE_ROLENAME_L | RULE_RECNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='g') ) {s = 1;}

                        else if ( (LA18_0=='p') ) {s = 2;}

                        else if ( (LA18_0=='(') ) {s = 3;}

                        else if ( (LA18_0==')') ) {s = 4;}

                        else if ( (LA18_0=='}') ) {s = 5;}

                        else if ( (LA18_0==',') ) {s = 6;}

                        else if ( (LA18_0=='r') ) {s = 7;}

                        else if ( (LA18_0=='m') ) {s = 8;}

                        else if ( (LA18_0==':') ) {s = 9;}

                        else if ( (LA18_0=='l') ) {s = 10;}

                        else if ( (LA18_0==';') ) {s = 11;}

                        else if ( (LA18_0=='f') ) {s = 12;}

                        else if ( (LA18_0=='{') ) {s = 13;}

                        else if ( (LA18_0=='c') ) {s = 14;}

                        else if ( (LA18_0=='a') ) {s = 15;}

                        else if ( (LA18_0=='o') ) {s = 16;}

                        else if ( (LA18_0=='t') ) {s = 17;}

                        else if ( (LA18_0=='e') ) {s = 18;}

                        else if ( (LA18_0=='R') ) {s = 19;}

                        else if ( (LA18_0=='I') ) {s = 20;}

                        else if ( (LA18_0=='A') ) {s = 21;}

                        else if ( (LA18_0=='i') ) {s = 22;}

                        else if ( (LA18_0=='s') ) {s = 23;}

                        else if ( ((LA18_0>='B' && LA18_0<='H')||(LA18_0>='J' && LA18_0<='Q')||(LA18_0>='S' && LA18_0<='Z')) ) {s = 24;}

                        else if ( (LA18_0=='^') ) {s = 25;}

                        else if ( (LA18_0=='_'||LA18_0=='b'||LA18_0=='d'||LA18_0=='h'||(LA18_0>='j' && LA18_0<='k')||LA18_0=='n'||LA18_0=='q'||(LA18_0>='u' && LA18_0<='z')) ) {s = 26;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 27;}

                        else if ( (LA18_0=='\"') ) {s = 28;}

                        else if ( (LA18_0=='\'') ) {s = 29;}

                        else if ( (LA18_0=='/') ) {s = 30;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 31;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='*' && LA18_0<='+')||(LA18_0>='-' && LA18_0<='.')||(LA18_0>='<' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_29 = input.LA(1);

                        s = -1;
                        if ( ((LA18_29>='\u0000' && LA18_29<='\uFFFF')) ) {s = 68;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_28 = input.LA(1);

                        s = -1;
                        if ( ((LA18_28>='\u0000' && LA18_28<='\uFFFF')) ) {s = 68;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}