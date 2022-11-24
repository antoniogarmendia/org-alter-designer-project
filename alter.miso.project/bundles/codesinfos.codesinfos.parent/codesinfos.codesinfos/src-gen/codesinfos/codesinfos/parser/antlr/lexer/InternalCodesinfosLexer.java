package codesinfos.codesinfos.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCodesinfosLexer extends Lexer {
    public static final int Classname=4;
    public static final int RULE_STRING=15;
    public static final int Name=7;
    public static final int RULE_SL_COMMENT=20;
    public static final int Comma=8;
    public static final int Colon=9;
    public static final int RightCurlyBracket=13;
    public static final int RULE_E_DOUBLE=17;
    public static final int EOF=-1;
    public static final int RightSquareBracket=11;
    public static final int Codes=6;
    public static final int RULE_ID=18;
    public static final int RULE_WS=21;
    public static final int LeftCurlyBracket=12;
    public static final int RULE_E_INT=16;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;
    public static final int Nodename=5;

    // delegates
    // delegators

    public InternalCodesinfosLexer() {;} 
    public InternalCodesinfosLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCodesinfosLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCodesinfosLexer.g"; }

    // $ANTLR start "Classname"
    public final void mClassname() throws RecognitionException {
        try {
            int _type = Classname;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:14:11: ( '\"classname\"' )
            // InternalCodesinfosLexer.g:14:13: '\"classname\"'
            {
            match("\"classname\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Classname"

    // $ANTLR start "Nodename"
    public final void mNodename() throws RecognitionException {
        try {
            int _type = Nodename;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:16:10: ( '\"nodename\"' )
            // InternalCodesinfosLexer.g:16:12: '\"nodename\"'
            {
            match("\"nodename\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nodename"

    // $ANTLR start "Codes"
    public final void mCodes() throws RecognitionException {
        try {
            int _type = Codes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:18:7: ( '\"codes\"' )
            // InternalCodesinfosLexer.g:18:9: '\"codes\"'
            {
            match("\"codes\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Codes"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:20:6: ( '\"name\"' )
            // InternalCodesinfosLexer.g:20:8: '\"name\"'
            {
            match("\"name\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:22:7: ( ',' )
            // InternalCodesinfosLexer.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:24:7: ( ':' )
            // InternalCodesinfosLexer.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:26:19: ( '[' )
            // InternalCodesinfosLexer.g:26:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:28:20: ( ']' )
            // InternalCodesinfosLexer.g:28:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:30:18: ( '{' )
            // InternalCodesinfosLexer.g:30:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:32:19: ( '}' )
            // InternalCodesinfosLexer.g:32:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalCodesinfosLexer.g:34:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalCodesinfosLexer.g:34:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalCodesinfosLexer.g:34:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCodesinfosLexer.g:34:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalCodesinfosLexer.g:34:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalCodesinfosLexer.g:34:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCodesinfosLexer.g:34:36: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

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
            // InternalCodesinfosLexer.g:36:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalCodesinfosLexer.g:36:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalCodesinfosLexer.g:36:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCodesinfosLexer.g:36:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalCodesinfosLexer.g:36:27: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_E_INT"
    public final void mRULE_E_INT() throws RecognitionException {
        try {
            int _type = RULE_E_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:38:12: ( ( '-' )? RULE_INT )
            // InternalCodesinfosLexer.g:38:14: ( '-' )? RULE_INT
            {
            // InternalCodesinfosLexer.g:38:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCodesinfosLexer.g:38:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_E_INT"

    // $ANTLR start "RULE_E_DOUBLE"
    public final void mRULE_E_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_E_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:40:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalCodesinfosLexer.g:40:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalCodesinfosLexer.g:40:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCodesinfosLexer.g:40:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalCodesinfosLexer.g:40:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCodesinfosLexer.g:40:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalCodesinfosLexer.g:40:36: ( RULE_INT )+
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
                    	    // InternalCodesinfosLexer.g:40:36: RULE_INT
                    	    {
                    	    mRULE_INT(); 

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
                    break;

            }

            // InternalCodesinfosLexer.g:40:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCodesinfosLexer.g:40:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalCodesinfosLexer.g:40:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalCodesinfosLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

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
    // $ANTLR end "RULE_E_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:42:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCodesinfosLexer.g:42:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCodesinfosLexer.g:42:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCodesinfosLexer.g:42:11: '^'
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

            // InternalCodesinfosLexer.g:42:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCodesinfosLexer.g:
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
            	    break loop11;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCodesinfosLexer.g:44:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCodesinfosLexer.g:44:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCodesinfosLexer.g:44:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCodesinfosLexer.g:44:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalCodesinfosLexer.g:46:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCodesinfosLexer.g:46:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCodesinfosLexer.g:46:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCodesinfosLexer.g:46:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalCodesinfosLexer.g:46:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCodesinfosLexer.g:46:41: ( '\\r' )? '\\n'
                    {
                    // InternalCodesinfosLexer.g:46:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalCodesinfosLexer.g:46:41: '\\r'
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
            // InternalCodesinfosLexer.g:48:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCodesinfosLexer.g:48:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCodesinfosLexer.g:48:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCodesinfosLexer.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalCodesinfosLexer.g:50:16: ( . )
            // InternalCodesinfosLexer.g:50:18: .
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
        // InternalCodesinfosLexer.g:1:8: ( Classname | Nodename | Codes | Name | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=18;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalCodesinfosLexer.g:1:10: Classname
                {
                mClassname(); 

                }
                break;
            case 2 :
                // InternalCodesinfosLexer.g:1:20: Nodename
                {
                mNodename(); 

                }
                break;
            case 3 :
                // InternalCodesinfosLexer.g:1:29: Codes
                {
                mCodes(); 

                }
                break;
            case 4 :
                // InternalCodesinfosLexer.g:1:35: Name
                {
                mName(); 

                }
                break;
            case 5 :
                // InternalCodesinfosLexer.g:1:40: Comma
                {
                mComma(); 

                }
                break;
            case 6 :
                // InternalCodesinfosLexer.g:1:46: Colon
                {
                mColon(); 

                }
                break;
            case 7 :
                // InternalCodesinfosLexer.g:1:52: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 8 :
                // InternalCodesinfosLexer.g:1:70: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 9 :
                // InternalCodesinfosLexer.g:1:89: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 10 :
                // InternalCodesinfosLexer.g:1:106: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 11 :
                // InternalCodesinfosLexer.g:1:124: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // InternalCodesinfosLexer.g:1:136: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 13 :
                // InternalCodesinfosLexer.g:1:147: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 14 :
                // InternalCodesinfosLexer.g:1:161: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalCodesinfosLexer.g:1:169: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalCodesinfosLexer.g:1:185: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalCodesinfosLexer.g:1:201: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalCodesinfosLexer.g:1:209: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\17\6\uffff\1\17\2\33\1\17\1\uffff\1\17\13\uffff\2\33\2\uffff\1\33\42\uffff";
    static final String DFA17_eofS =
        "\100\uffff";
    static final String DFA17_minS =
        "\2\0\6\uffff\1\60\2\56\1\101\1\uffff\1\52\2\uffff\2\0\7\uffff\2\56\2\uffff\1\56\4\uffff\17\0\1\uffff\1\0\1\uffff\1\0\1\uffff\1\0\1\uffff\4\0\4\uffff";
    static final String DFA17_maxS =
        "\2\uffff\6\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\2\uffff\7\uffff\2\145\2\uffff\1\145\4\uffff\17\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\4\uffff\4\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\4\uffff\1\16\1\uffff\1\21\1\22\2\uffff\1\13\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\14\1\15\1\uffff\1\16\1\17\1\20\1\21\17\uffff\1\4\1\uffff\1\3\1\uffff\1\4\1\uffff\1\3\4\uffff\1\2\1\1\1\2\1\1";
    static final String DFA17_specialS =
        "\1\11\1\12\16\uffff\1\7\1\10\20\uffff\1\13\1\0\1\23\1\4\1\14\1\1\1\24\1\5\1\15\1\2\1\25\1\6\1\16\1\3\1\26\1\uffff\1\17\1\uffff\1\27\1\uffff\1\20\1\uffff\1\30\1\21\1\31\1\22\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\1\11\17\1\2\1\10\1\17\1\15\1\11\11\12\1\3\6\17\32\14\1\4\1\17\1\5\1\13\1\14\1\17\32\14\1\6\1\17\1\7\uff82\17",
            "\143\22\1\20\12\22\1\21\uff91\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\11\32",
            "\1\34\26\uffff\1\34\37\uffff\1\34",
            "\1\34\1\uffff\12\35\13\uffff\1\34\37\uffff\1\34",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\4\uffff\1\40",
            "",
            "",
            "\154\22\1\42\2\22\1\43\uff90\22",
            "\141\22\1\45\15\22\1\44\uff90\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\26\uffff\1\34\37\uffff\1\34",
            "\1\34\1\uffff\12\35\13\uffff\1\34\37\uffff\1\34",
            "",
            "",
            "\1\34\1\uffff\12\35\13\uffff\1\34\37\uffff\1\34",
            "",
            "",
            "",
            "",
            "\141\22\1\46\uff9e\22",
            "\144\22\1\47\uff9b\22",
            "\144\22\1\50\uff9b\22",
            "\155\22\1\51\uff92\22",
            "\163\22\1\52\uff8c\22",
            "\145\22\1\53\uff9a\22",
            "\145\22\1\54\uff9a\22",
            "\145\22\1\55\uff9a\22",
            "\163\22\1\56\uff8c\22",
            "\163\22\1\57\uff8c\22",
            "\156\22\1\60\uff91\22",
            "\42\22\1\61\uffdd\22",
            "\156\22\1\62\uff91\22",
            "\42\22\1\63\uffdd\22",
            "\141\22\1\64\uff9e\22",
            "",
            "\141\22\1\66\uff9e\22",
            "",
            "\155\22\1\70\uff92\22",
            "",
            "\155\22\1\71\uff92\22",
            "",
            "\145\22\1\72\uff9a\22",
            "\145\22\1\73\uff9a\22",
            "\42\22\1\74\uffdd\22",
            "\42\22\1\75\uffdd\22",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Classname | Nodename | Codes | Name | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_35 = input.LA(1);

                        s = -1;
                        if ( (LA17_35=='d') ) {s = 39;}

                        else if ( ((LA17_35>='\u0000' && LA17_35<='c')||(LA17_35>='e' && LA17_35<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_39 = input.LA(1);

                        s = -1;
                        if ( (LA17_39=='e') ) {s = 43;}

                        else if ( ((LA17_39>='\u0000' && LA17_39<='d')||(LA17_39>='f' && LA17_39<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_43 = input.LA(1);

                        s = -1;
                        if ( (LA17_43=='s') ) {s = 47;}

                        else if ( ((LA17_43>='\u0000' && LA17_43<='r')||(LA17_43>='t' && LA17_43<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_47 = input.LA(1);

                        s = -1;
                        if ( (LA17_47=='\"') ) {s = 51;}

                        else if ( ((LA17_47>='\u0000' && LA17_47<='!')||(LA17_47>='#' && LA17_47<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_37 = input.LA(1);

                        s = -1;
                        if ( (LA17_37=='m') ) {s = 41;}

                        else if ( ((LA17_37>='\u0000' && LA17_37<='l')||(LA17_37>='n' && LA17_37<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_41 = input.LA(1);

                        s = -1;
                        if ( (LA17_41=='e') ) {s = 45;}

                        else if ( ((LA17_41>='\u0000' && LA17_41<='d')||(LA17_41>='f' && LA17_41<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_45 = input.LA(1);

                        s = -1;
                        if ( (LA17_45=='\"') ) {s = 49;}

                        else if ( ((LA17_45>='\u0000' && LA17_45<='!')||(LA17_45>='#' && LA17_45<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_16 = input.LA(1);

                        s = -1;
                        if ( (LA17_16=='l') ) {s = 34;}

                        else if ( (LA17_16=='o') ) {s = 35;}

                        else if ( ((LA17_16>='\u0000' && LA17_16<='k')||(LA17_16>='m' && LA17_16<='n')||(LA17_16>='p' && LA17_16<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_17 = input.LA(1);

                        s = -1;
                        if ( (LA17_17=='o') ) {s = 36;}

                        else if ( (LA17_17=='a') ) {s = 37;}

                        else if ( ((LA17_17>='\u0000' && LA17_17<='`')||(LA17_17>='b' && LA17_17<='n')||(LA17_17>='p' && LA17_17<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='\"') ) {s = 1;}

                        else if ( (LA17_0==',') ) {s = 2;}

                        else if ( (LA17_0==':') ) {s = 3;}

                        else if ( (LA17_0=='[') ) {s = 4;}

                        else if ( (LA17_0==']') ) {s = 5;}

                        else if ( (LA17_0=='{') ) {s = 6;}

                        else if ( (LA17_0=='}') ) {s = 7;}

                        else if ( (LA17_0=='-') ) {s = 8;}

                        else if ( (LA17_0=='0') ) {s = 9;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 10;}

                        else if ( (LA17_0=='^') ) {s = 11;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {s = 12;}

                        else if ( (LA17_0=='/') ) {s = 13;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 14;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='+')||LA17_0=='.'||(LA17_0>=';' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_1 = input.LA(1);

                        s = -1;
                        if ( (LA17_1=='c') ) {s = 16;}

                        else if ( (LA17_1=='n') ) {s = 17;}

                        else if ( ((LA17_1>='\u0000' && LA17_1<='b')||(LA17_1>='d' && LA17_1<='m')||(LA17_1>='o' && LA17_1<='\uFFFF')) ) {s = 18;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_34 = input.LA(1);

                        s = -1;
                        if ( (LA17_34=='a') ) {s = 38;}

                        else if ( ((LA17_34>='\u0000' && LA17_34<='`')||(LA17_34>='b' && LA17_34<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_38 = input.LA(1);

                        s = -1;
                        if ( (LA17_38=='s') ) {s = 42;}

                        else if ( ((LA17_38>='\u0000' && LA17_38<='r')||(LA17_38>='t' && LA17_38<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_42 = input.LA(1);

                        s = -1;
                        if ( (LA17_42=='s') ) {s = 46;}

                        else if ( ((LA17_42>='\u0000' && LA17_42<='r')||(LA17_42>='t' && LA17_42<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_46 = input.LA(1);

                        s = -1;
                        if ( (LA17_46=='n') ) {s = 50;}

                        else if ( ((LA17_46>='\u0000' && LA17_46<='m')||(LA17_46>='o' && LA17_46<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_50 = input.LA(1);

                        s = -1;
                        if ( (LA17_50=='a') ) {s = 54;}

                        else if ( ((LA17_50>='\u0000' && LA17_50<='`')||(LA17_50>='b' && LA17_50<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_54 = input.LA(1);

                        s = -1;
                        if ( (LA17_54=='m') ) {s = 57;}

                        else if ( ((LA17_54>='\u0000' && LA17_54<='l')||(LA17_54>='n' && LA17_54<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_57 = input.LA(1);

                        s = -1;
                        if ( (LA17_57=='e') ) {s = 59;}

                        else if ( ((LA17_57>='\u0000' && LA17_57<='d')||(LA17_57>='f' && LA17_57<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_59 = input.LA(1);

                        s = -1;
                        if ( (LA17_59=='\"') ) {s = 61;}

                        else if ( ((LA17_59>='\u0000' && LA17_59<='!')||(LA17_59>='#' && LA17_59<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_36 = input.LA(1);

                        s = -1;
                        if ( (LA17_36=='d') ) {s = 40;}

                        else if ( ((LA17_36>='\u0000' && LA17_36<='c')||(LA17_36>='e' && LA17_36<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA17_40 = input.LA(1);

                        s = -1;
                        if ( (LA17_40=='e') ) {s = 44;}

                        else if ( ((LA17_40>='\u0000' && LA17_40<='d')||(LA17_40>='f' && LA17_40<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA17_44 = input.LA(1);

                        s = -1;
                        if ( (LA17_44=='n') ) {s = 48;}

                        else if ( ((LA17_44>='\u0000' && LA17_44<='m')||(LA17_44>='o' && LA17_44<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA17_48 = input.LA(1);

                        s = -1;
                        if ( (LA17_48=='a') ) {s = 52;}

                        else if ( ((LA17_48>='\u0000' && LA17_48<='`')||(LA17_48>='b' && LA17_48<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA17_52 = input.LA(1);

                        s = -1;
                        if ( (LA17_52=='m') ) {s = 56;}

                        else if ( ((LA17_52>='\u0000' && LA17_52<='l')||(LA17_52>='n' && LA17_52<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA17_56 = input.LA(1);

                        s = -1;
                        if ( (LA17_56=='e') ) {s = 58;}

                        else if ( ((LA17_56>='\u0000' && LA17_56<='d')||(LA17_56>='f' && LA17_56<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA17_58 = input.LA(1);

                        s = -1;
                        if ( (LA17_58=='\"') ) {s = 60;}

                        else if ( ((LA17_58>='\u0000' && LA17_58<='!')||(LA17_58>='#' && LA17_58<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}