package ishikawa.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIshikawaLexer extends Lexer {
    public static final int RULE_NEWLINE=7;
    public static final int RULE_TAB=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;

    // delegates
    // delegators

    public InternalIshikawaLexer() {;} 
    public InternalIshikawaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalIshikawaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalIshikawa.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIshikawa.g:11:7: ( 'Effect' )
            // InternalIshikawa.g:11:9: 'Effect'
            {
            match("Effect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIshikawa.g:12:7: ( 'description' )
            // InternalIshikawa.g:12:9: 'description'
            {
            match("description"); 


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
            // InternalIshikawa.g:13:7: ( 'Category' )
            // InternalIshikawa.g:13:9: 'Category'
            {
            match("Category"); 


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
            // InternalIshikawa.g:14:7: ( '->' )
            // InternalIshikawa.g:14:9: '->'
            {
            match("->"); 


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
            // InternalIshikawa.g:15:7: ( 'Cause' )
            // InternalIshikawa.g:15:9: 'Cause'
            {
            match("Cause"); 


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
            // InternalIshikawa.g:16:7: ( 'valueOfInterest' )
            // InternalIshikawa.g:16:9: 'valueOfInterest'
            {
            match("valueOfInterest"); 


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
            // InternalIshikawa.g:17:7: ( '{' )
            // InternalIshikawa.g:17:9: '{'
            {
            match('{'); 

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
            // InternalIshikawa.g:18:7: ( '}' )
            // InternalIshikawa.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "RULE_TAB"
    public final void mRULE_TAB() throws RecognitionException {
        try {
            int _type = RULE_TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIshikawa.g:482:10: ( ( '\\t' )+ )
            // InternalIshikawa.g:482:12: ( '\\t' )+
            {
            // InternalIshikawa.g:482:12: ( '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIshikawa.g:482:12: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAB"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIshikawa.g:484:14: ( ( ( '\\r' )? '\\n' )+ )
            // InternalIshikawa.g:484:16: ( ( '\\r' )? '\\n' )+
            {
            // InternalIshikawa.g:484:16: ( ( '\\r' )? '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIshikawa.g:484:17: ( '\\r' )? '\\n'
            	    {
            	    // InternalIshikawa.g:484:17: ( '\\r' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='\r') ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalIshikawa.g:484:17: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

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
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIshikawa.g:486:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIshikawa.g:486:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIshikawa.g:486:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIshikawa.g:486:11: '^'
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

            // InternalIshikawa.g:486:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIshikawa.g:
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
            	    break loop5;
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
            // InternalIshikawa.g:488:10: ( ( '0' .. '9' )+ )
            // InternalIshikawa.g:488:12: ( '0' .. '9' )+
            {
            // InternalIshikawa.g:488:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIshikawa.g:488:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIshikawa.g:490:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIshikawa.g:490:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIshikawa.g:490:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIshikawa.g:490:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIshikawa.g:490:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalIshikawa.g:490:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIshikawa.g:490:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalIshikawa.g:490:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIshikawa.g:490:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalIshikawa.g:490:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIshikawa.g:490:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalIshikawa.g:492:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalIshikawa.g:492:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalIshikawa.g:492:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIshikawa.g:492:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalIshikawa.g:494:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIshikawa.g:494:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalIshikawa.g:494:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIshikawa.g:494:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalIshikawa.g:494:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIshikawa.g:494:41: ( '\\r' )? '\\n'
                    {
                    // InternalIshikawa.g:494:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalIshikawa.g:494:41: '\\r'
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
            // InternalIshikawa.g:496:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIshikawa.g:496:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIshikawa.g:496:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIshikawa.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalIshikawa.g:498:16: ( . )
            // InternalIshikawa.g:498:18: .
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
        // InternalIshikawa.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_TAB | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=17;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalIshikawa.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalIshikawa.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalIshikawa.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalIshikawa.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalIshikawa.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalIshikawa.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalIshikawa.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalIshikawa.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalIshikawa.g:1:58: RULE_TAB
                {
                mRULE_TAB(); 

                }
                break;
            case 10 :
                // InternalIshikawa.g:1:67: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 11 :
                // InternalIshikawa.g:1:80: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // InternalIshikawa.g:1:88: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // InternalIshikawa.g:1:97: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // InternalIshikawa.g:1:109: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // InternalIshikawa.g:1:125: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // InternalIshikawa.g:1:141: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // InternalIshikawa.g:1:149: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\3\24\1\22\1\24\2\uffff\1\33\1\35\1\37\1\22\2\uffff\3\22\2\uffff\1\24\1\uffff\2\24\1\uffff\1\24\3\uffff\1\33\1\uffff\1\37\1\uffff\1\35\4\uffff\15\24\1\67\1\24\1\71\2\24\1\uffff\1\24\1\uffff\4\24\1\101\2\24\1\uffff\3\24\1\107\1\24\1\uffff\3\24\1\114\1\uffff";
    static final String DFA15_eofS =
        "\115\uffff";
    static final String DFA15_minS =
        "\1\0\1\146\1\145\1\141\1\76\1\141\2\uffff\1\11\1\12\1\11\1\101\2\uffff\2\0\1\52\2\uffff\1\146\1\uffff\1\163\1\164\1\uffff\1\154\3\uffff\1\11\1\uffff\1\11\1\uffff\1\12\4\uffff\1\145\1\143\1\145\1\163\1\165\1\143\1\162\1\147\2\145\1\164\1\151\1\157\1\60\1\117\1\60\1\160\1\162\1\uffff\1\146\1\uffff\1\164\1\171\1\111\1\151\1\60\1\156\1\157\1\uffff\1\164\1\156\1\145\1\60\1\162\1\uffff\1\145\1\163\1\164\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\146\1\145\1\141\1\76\1\141\2\uffff\1\40\1\12\1\40\1\172\2\uffff\2\uffff\1\57\2\uffff\1\146\1\uffff\1\163\1\165\1\uffff\1\154\3\uffff\1\40\1\uffff\1\40\1\uffff\1\12\4\uffff\1\145\1\143\1\145\1\163\1\165\1\143\1\162\1\147\2\145\1\164\1\151\1\157\1\172\1\117\1\172\1\160\1\162\1\uffff\1\146\1\uffff\1\164\1\171\1\111\1\151\1\172\1\156\1\157\1\uffff\1\164\1\156\1\145\1\172\1\162\1\uffff\1\145\1\163\1\164\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\7\1\10\4\uffff\1\13\1\14\3\uffff\1\20\1\21\1\uffff\1\13\2\uffff\1\4\1\uffff\1\7\1\10\1\11\1\uffff\1\20\1\uffff\1\12\1\uffff\1\14\1\15\1\16\1\17\22\uffff\1\5\1\uffff\1\1\7\uffff\1\3\5\uffff\1\2\4\uffff\1\6";
    static final String DFA15_specialS =
        "\1\1\15\uffff\1\0\1\2\75\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\22\1\10\1\12\2\22\1\11\22\22\1\21\1\22\1\16\4\22\1\17\5\22\1\4\1\22\1\20\12\15\7\22\2\14\1\3\1\14\1\1\25\14\3\22\1\13\1\14\1\22\3\14\1\2\21\14\1\5\4\14\1\6\1\22\1\7\uff82\22",
            "\1\23",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "",
            "",
            "\1\34\1\35\2\uffff\1\35\22\uffff\1\35",
            "\1\36",
            "\1\35\1\36\2\uffff\1\40\22\uffff\1\35",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\0\42",
            "\0\42",
            "\1\43\4\uffff\1\44",
            "",
            "",
            "\1\45",
            "",
            "\1\46",
            "\1\47\1\50",
            "",
            "\1\51",
            "",
            "",
            "",
            "\1\34\1\35\2\uffff\1\35\22\uffff\1\35",
            "",
            "\1\35\1\36\2\uffff\1\40\22\uffff\1\35",
            "",
            "\1\36",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\70",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_TAB | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_14 = input.LA(1);

                        s = -1;
                        if ( ((LA15_14>='\u0000' && LA15_14<='\uFFFF')) ) {s = 34;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='E') ) {s = 1;}

                        else if ( (LA15_0=='d') ) {s = 2;}

                        else if ( (LA15_0=='C') ) {s = 3;}

                        else if ( (LA15_0=='-') ) {s = 4;}

                        else if ( (LA15_0=='v') ) {s = 5;}

                        else if ( (LA15_0=='{') ) {s = 6;}

                        else if ( (LA15_0=='}') ) {s = 7;}

                        else if ( (LA15_0=='\t') ) {s = 8;}

                        else if ( (LA15_0=='\r') ) {s = 9;}

                        else if ( (LA15_0=='\n') ) {s = 10;}

                        else if ( (LA15_0=='^') ) {s = 11;}

                        else if ( ((LA15_0>='A' && LA15_0<='B')||LA15_0=='D'||(LA15_0>='F' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='c')||(LA15_0>='e' && LA15_0<='u')||(LA15_0>='w' && LA15_0<='z')) ) {s = 12;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 13;}

                        else if ( (LA15_0=='\"') ) {s = 14;}

                        else if ( (LA15_0=='\'') ) {s = 15;}

                        else if ( (LA15_0=='/') ) {s = 16;}

                        else if ( (LA15_0==' ') ) {s = 17;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<=',')||LA15_0=='.'||(LA15_0>=':' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_15 = input.LA(1);

                        s = -1;
                        if ( ((LA15_15>='\u0000' && LA15_15<='\uFFFF')) ) {s = 34;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}