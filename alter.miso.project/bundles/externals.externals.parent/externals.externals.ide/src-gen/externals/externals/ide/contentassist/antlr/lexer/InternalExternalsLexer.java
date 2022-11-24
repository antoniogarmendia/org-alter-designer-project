package externals.externals.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExternalsLexer extends Lexer {
    public static final int RULE_STRING=23;
    public static final int Url=15;
    public static final int Name=12;
    public static final int RULE_SL_COMMENT=28;
    public static final int JSONPath=6;
    public static final int Comma=16;
    public static final int Paths=10;
    public static final int Colon=17;
    public static final int RightCurlyBracket=21;
    public static final int RULE_E_DOUBLE=25;
    public static final int Protocol=7;
    public static final int EOF=-1;
    public static final int APIAuth=8;
    public static final int Route=11;
    public static final int RightSquareBracket=19;
    public static final int Parameters=5;
    public static final int RULE_ID=26;
    public static final int RULE_WS=29;
    public static final int LeftCurlyBracket=20;
    public static final int RULE_E_INT=24;
    public static final int RULE_ANY_OTHER=30;
    public static final int Type=13;
    public static final int RULE_INT=22;
    public static final int Outputs=9;
    public static final int RULE_ML_COMMENT=27;
    public static final int APIDescriptions=4;
    public static final int LeftSquareBracket=18;
    public static final int Key=14;

    // delegates
    // delegators

    public InternalExternalsLexer() {;} 
    public InternalExternalsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalExternalsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalExternalsLexer.g"; }

    // $ANTLR start "APIDescriptions"
    public final void mAPIDescriptions() throws RecognitionException {
        try {
            int _type = APIDescriptions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:14:17: ( '\"APIDescriptions\"' )
            // InternalExternalsLexer.g:14:19: '\"APIDescriptions\"'
            {
            match("\"APIDescriptions\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APIDescriptions"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:16:12: ( '\"parameters\"' )
            // InternalExternalsLexer.g:16:14: '\"parameters\"'
            {
            match("\"parameters\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameters"

    // $ANTLR start "JSONPath"
    public final void mJSONPath() throws RecognitionException {
        try {
            int _type = JSONPath;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:18:10: ( '\"JSONPath\"' )
            // InternalExternalsLexer.g:18:12: '\"JSONPath\"'
            {
            match("\"JSONPath\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSONPath"

    // $ANTLR start "Protocol"
    public final void mProtocol() throws RecognitionException {
        try {
            int _type = Protocol;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:20:10: ( '\"protocol\"' )
            // InternalExternalsLexer.g:20:12: '\"protocol\"'
            {
            match("\"protocol\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Protocol"

    // $ANTLR start "APIAuth"
    public final void mAPIAuth() throws RecognitionException {
        try {
            int _type = APIAuth;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:22:9: ( '\"APIAuth\"' )
            // InternalExternalsLexer.g:22:11: '\"APIAuth\"'
            {
            match("\"APIAuth\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APIAuth"

    // $ANTLR start "Outputs"
    public final void mOutputs() throws RecognitionException {
        try {
            int _type = Outputs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:24:9: ( '\"outputs\"' )
            // InternalExternalsLexer.g:24:11: '\"outputs\"'
            {
            match("\"outputs\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Outputs"

    // $ANTLR start "Paths"
    public final void mPaths() throws RecognitionException {
        try {
            int _type = Paths;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:26:7: ( '\"paths\"' )
            // InternalExternalsLexer.g:26:9: '\"paths\"'
            {
            match("\"paths\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Paths"

    // $ANTLR start "Route"
    public final void mRoute() throws RecognitionException {
        try {
            int _type = Route;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:28:7: ( '\"route\"' )
            // InternalExternalsLexer.g:28:9: '\"route\"'
            {
            match("\"route\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Route"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:30:6: ( '\"name\"' )
            // InternalExternalsLexer.g:30:8: '\"name\"'
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

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:32:6: ( '\"type\"' )
            // InternalExternalsLexer.g:32:8: '\"type\"'
            {
            match("\"type\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Key"
    public final void mKey() throws RecognitionException {
        try {
            int _type = Key;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:34:5: ( '\"key\"' )
            // InternalExternalsLexer.g:34:7: '\"key\"'
            {
            match("\"key\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Key"

    // $ANTLR start "Url"
    public final void mUrl() throws RecognitionException {
        try {
            int _type = Url;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:36:5: ( '\"url\"' )
            // InternalExternalsLexer.g:36:7: '\"url\"'
            {
            match("\"url\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Url"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExternalsLexer.g:38:7: ( ',' )
            // InternalExternalsLexer.g:38:9: ','
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
            // InternalExternalsLexer.g:40:7: ( ':' )
            // InternalExternalsLexer.g:40:9: ':'
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
            // InternalExternalsLexer.g:42:19: ( '[' )
            // InternalExternalsLexer.g:42:21: '['
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
            // InternalExternalsLexer.g:44:20: ( ']' )
            // InternalExternalsLexer.g:44:22: ']'
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
            // InternalExternalsLexer.g:46:18: ( '{' )
            // InternalExternalsLexer.g:46:20: '{'
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
            // InternalExternalsLexer.g:48:19: ( '}' )
            // InternalExternalsLexer.g:48:21: '}'
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
            // InternalExternalsLexer.g:50:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalExternalsLexer.g:50:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalExternalsLexer.g:50:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalExternalsLexer.g:50:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalExternalsLexer.g:50:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalExternalsLexer.g:50:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalExternalsLexer.g:50:36: '0' .. '9'
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
            // InternalExternalsLexer.g:52:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalExternalsLexer.g:52:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalExternalsLexer.g:52:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalExternalsLexer.g:52:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalExternalsLexer.g:52:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalExternalsLexer.g:54:12: ( ( '-' )? RULE_INT )
            // InternalExternalsLexer.g:54:14: ( '-' )? RULE_INT
            {
            // InternalExternalsLexer.g:54:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalExternalsLexer.g:54:14: '-'
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
            // InternalExternalsLexer.g:56:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalExternalsLexer.g:56:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalExternalsLexer.g:56:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalExternalsLexer.g:56:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalExternalsLexer.g:56:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalExternalsLexer.g:56:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalExternalsLexer.g:56:36: ( RULE_INT )+
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
                    	    // InternalExternalsLexer.g:56:36: RULE_INT
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

            // InternalExternalsLexer.g:56:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalExternalsLexer.g:56:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalExternalsLexer.g:56:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalExternalsLexer.g:
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
            // InternalExternalsLexer.g:58:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalExternalsLexer.g:58:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalExternalsLexer.g:58:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalExternalsLexer.g:58:11: '^'
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

            // InternalExternalsLexer.g:58:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExternalsLexer.g:
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
            // InternalExternalsLexer.g:60:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalExternalsLexer.g:60:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalExternalsLexer.g:60:24: ( options {greedy=false; } : . )*
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
            	    // InternalExternalsLexer.g:60:52: .
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
            // InternalExternalsLexer.g:62:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalExternalsLexer.g:62:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalExternalsLexer.g:62:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExternalsLexer.g:62:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalExternalsLexer.g:62:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalExternalsLexer.g:62:41: ( '\\r' )? '\\n'
                    {
                    // InternalExternalsLexer.g:62:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalExternalsLexer.g:62:41: '\\r'
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
            // InternalExternalsLexer.g:64:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalExternalsLexer.g:64:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalExternalsLexer.g:64:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalExternalsLexer.g:
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
            // InternalExternalsLexer.g:66:16: ( . )
            // InternalExternalsLexer.g:66:18: .
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
        // InternalExternalsLexer.g:1:8: ( APIDescriptions | Parameters | JSONPath | Protocol | APIAuth | Outputs | Paths | Route | Name | Type | Key | Url | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=26;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalExternalsLexer.g:1:10: APIDescriptions
                {
                mAPIDescriptions(); 

                }
                break;
            case 2 :
                // InternalExternalsLexer.g:1:26: Parameters
                {
                mParameters(); 

                }
                break;
            case 3 :
                // InternalExternalsLexer.g:1:37: JSONPath
                {
                mJSONPath(); 

                }
                break;
            case 4 :
                // InternalExternalsLexer.g:1:46: Protocol
                {
                mProtocol(); 

                }
                break;
            case 5 :
                // InternalExternalsLexer.g:1:55: APIAuth
                {
                mAPIAuth(); 

                }
                break;
            case 6 :
                // InternalExternalsLexer.g:1:63: Outputs
                {
                mOutputs(); 

                }
                break;
            case 7 :
                // InternalExternalsLexer.g:1:71: Paths
                {
                mPaths(); 

                }
                break;
            case 8 :
                // InternalExternalsLexer.g:1:77: Route
                {
                mRoute(); 

                }
                break;
            case 9 :
                // InternalExternalsLexer.g:1:83: Name
                {
                mName(); 

                }
                break;
            case 10 :
                // InternalExternalsLexer.g:1:88: Type
                {
                mType(); 

                }
                break;
            case 11 :
                // InternalExternalsLexer.g:1:93: Key
                {
                mKey(); 

                }
                break;
            case 12 :
                // InternalExternalsLexer.g:1:97: Url
                {
                mUrl(); 

                }
                break;
            case 13 :
                // InternalExternalsLexer.g:1:101: Comma
                {
                mComma(); 

                }
                break;
            case 14 :
                // InternalExternalsLexer.g:1:107: Colon
                {
                mColon(); 

                }
                break;
            case 15 :
                // InternalExternalsLexer.g:1:113: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 16 :
                // InternalExternalsLexer.g:1:131: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 17 :
                // InternalExternalsLexer.g:1:150: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 18 :
                // InternalExternalsLexer.g:1:167: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 19 :
                // InternalExternalsLexer.g:1:185: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalExternalsLexer.g:1:197: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 21 :
                // InternalExternalsLexer.g:1:208: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 22 :
                // InternalExternalsLexer.g:1:222: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalExternalsLexer.g:1:230: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalExternalsLexer.g:1:246: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalExternalsLexer.g:1:262: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalExternalsLexer.g:1:270: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\17\6\uffff\1\17\2\42\1\17\1\uffff\1\17\22\uffff\2\42\2\uffff\1\42\134\uffff";
    static final String DFA17_eofS =
        "\u0081\uffff";
    static final String DFA17_minS =
        "\2\0\6\uffff\1\60\2\56\1\101\1\uffff\1\52\2\uffff\11\0\7\uffff\2\56\2\uffff\1\56\4\uffff\37\0\2\uffff\10\0\4\uffff\3\0\1\uffff\3\0\3\uffff\3\0\1\uffff\3\0\1\uffff\1\0\1\uffff\3\0\1\uffff\1\0\1\uffff\1\0\3\uffff\2\0\2\uffff\1\0\1\uffff\1\0\1\uffff\3\0\2\uffff";
    static final String DFA17_maxS =
        "\2\uffff\6\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\11\uffff\7\uffff\2\145\2\uffff\1\145\4\uffff\37\uffff\2\uffff\10\uffff\4\uffff\3\uffff\1\uffff\3\uffff\3\uffff\3\uffff\1\uffff\3\uffff\1\uffff\1\uffff\1\uffff\3\uffff\1\uffff\1\uffff\1\uffff\1\uffff\3\uffff\2\uffff\2\uffff\1\uffff\1\uffff\1\uffff\1\uffff\3\uffff\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\15\1\16\1\17\1\20\1\21\1\22\4\uffff\1\26\1\uffff\1\31\1\32\11\uffff\1\23\1\15\1\16\1\17\1\20\1\21\1\22\2\uffff\1\24\1\25\1\uffff\1\26\1\27\1\30\1\31\37\uffff\1\13\1\14\10\uffff\1\11\1\12\1\13\1\14\3\uffff\1\7\3\uffff\1\10\1\11\1\12\3\uffff\1\7\3\uffff\1\10\1\uffff\1\5\3\uffff\1\6\1\uffff\1\5\1\uffff\1\4\1\3\1\6\2\uffff\1\4\1\3\1\uffff\1\2\1\uffff\1\2\3\uffff\2\1";
    static final String DFA17_specialS =
        "\1\34\1\14\16\uffff\1\64\1\112\1\10\1\35\1\47\1\54\1\60\1\66\1\72\20\uffff\1\65\1\75\1\21\1\11\1\36\1\50\1\55\1\61\1\67\1\73\1\70\1\0\1\44\1\22\1\12\1\37\1\51\1\56\1\62\1\71\1\74\1\76\1\30\1\1\1\45\1\23\1\13\1\40\1\52\1\57\1\63\2\uffff\1\77\1\31\1\2\1\46\1\24\1\15\1\41\1\53\4\uffff\1\100\1\32\1\3\1\uffff\1\25\1\16\1\42\3\uffff\1\101\1\33\1\4\1\uffff\1\26\1\17\1\43\1\uffff\1\102\1\uffff\1\5\1\27\1\20\1\uffff\1\103\1\uffff\1\6\3\uffff\1\104\1\7\2\uffff\1\105\1\uffff\1\106\1\uffff\1\107\1\110\1\111\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\1\11\17\1\2\1\10\1\17\1\15\1\11\11\12\1\3\6\17\32\14\1\4\1\17\1\5\1\13\1\14\1\17\32\14\1\6\1\17\1\7\uff82\17",
            "\101\31\1\20\10\31\1\22\40\31\1\27\2\31\1\25\1\23\1\21\1\31\1\24\1\31\1\26\1\30\uff8a\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\11\41",
            "\1\43\26\uffff\1\43\37\uffff\1\43",
            "\1\43\1\uffff\12\44\13\uffff\1\43\37\uffff\1\43",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\46\4\uffff\1\47",
            "",
            "",
            "\120\31\1\51\uffaf\31",
            "\141\31\1\52\20\31\1\53\uff8d\31",
            "\123\31\1\54\uffac\31",
            "\165\31\1\55\uff8a\31",
            "\157\31\1\56\uff90\31",
            "\141\31\1\57\uff9e\31",
            "\171\31\1\60\uff86\31",
            "\145\31\1\61\uff9a\31",
            "\162\31\1\62\uff8d\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\26\uffff\1\43\37\uffff\1\43",
            "\1\43\1\uffff\12\44\13\uffff\1\43\37\uffff\1\43",
            "",
            "",
            "\1\43\1\uffff\12\44\13\uffff\1\43\37\uffff\1\43",
            "",
            "",
            "",
            "",
            "\111\31\1\63\uffb6\31",
            "\162\31\1\64\1\31\1\65\uff8b\31",
            "\157\31\1\66\uff90\31",
            "\117\31\1\67\uffb0\31",
            "\164\31\1\70\uff8b\31",
            "\165\31\1\71\uff8a\31",
            "\155\31\1\72\uff92\31",
            "\160\31\1\73\uff8f\31",
            "\171\31\1\74\uff86\31",
            "\154\31\1\75\uff93\31",
            "\101\31\1\77\2\31\1\76\uffbb\31",
            "\141\31\1\100\uff9e\31",
            "\150\31\1\101\uff97\31",
            "\164\31\1\102\uff8b\31",
            "\116\31\1\103\uffb1\31",
            "\160\31\1\104\uff8f\31",
            "\164\31\1\105\uff8b\31",
            "\145\31\1\106\uff9a\31",
            "\145\31\1\107\uff9a\31",
            "\42\31\1\110\uffdd\31",
            "\42\31\1\111\uffdd\31",
            "\145\31\1\112\uff9a\31",
            "\165\31\1\113\uff8a\31",
            "\155\31\1\114\uff92\31",
            "\163\31\1\115\uff8c\31",
            "\157\31\1\116\uff90\31",
            "\120\31\1\117\uffaf\31",
            "\165\31\1\120\uff8a\31",
            "\145\31\1\121\uff9a\31",
            "\42\31\1\122\uffdd\31",
            "\42\31\1\123\uffdd\31",
            "",
            "",
            "\163\31\1\126\uff8c\31",
            "\164\31\1\127\uff8b\31",
            "\145\31\1\130\uff9a\31",
            "\42\31\1\131\uffdd\31",
            "\143\31\1\132\uff9c\31",
            "\141\31\1\133\uff9e\31",
            "\164\31\1\134\uff8b\31",
            "\42\31\1\135\uffdd\31",
            "",
            "",
            "",
            "",
            "\143\31\1\140\uff9c\31",
            "\150\31\1\141\uff97\31",
            "\164\31\1\142\uff8b\31",
            "",
            "\157\31\1\144\uff90\31",
            "\164\31\1\145\uff8b\31",
            "\163\31\1\146\uff8c\31",
            "",
            "",
            "",
            "\162\31\1\150\uff8d\31",
            "\42\31\1\151\uffdd\31",
            "\145\31\1\152\uff9a\31",
            "",
            "\154\31\1\153\uff93\31",
            "\150\31\1\154\uff97\31",
            "\42\31\1\155\uffdd\31",
            "",
            "\151\31\1\156\uff96\31",
            "",
            "\162\31\1\160\uff8d\31",
            "\42\31\1\161\uffdd\31",
            "\42\31\1\162\uffdd\31",
            "",
            "\160\31\1\164\uff8f\31",
            "",
            "\163\31\1\165\uff8c\31",
            "",
            "",
            "",
            "\164\31\1\170\uff8b\31",
            "\42\31\1\171\uffdd\31",
            "",
            "",
            "\151\31\1\172\uff96\31",
            "",
            "\157\31\1\174\uff90\31",
            "",
            "\156\31\1\175\uff91\31",
            "\163\31\1\176\uff8c\31",
            "\42\31\1\177\uffdd\31",
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
            return "1:1: Tokens : ( APIDescriptions | Parameters | JSONPath | Protocol | APIAuth | Outputs | Paths | Route | Name | Type | Key | Url | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_52 = input.LA(1);

                        s = -1;
                        if ( (LA17_52=='a') ) {s = 64;}

                        else if ( ((LA17_52>='\u0000' && LA17_52<='`')||(LA17_52>='b' && LA17_52<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_64 = input.LA(1);

                        s = -1;
                        if ( (LA17_64=='m') ) {s = 76;}

                        else if ( ((LA17_64>='\u0000' && LA17_64<='l')||(LA17_64>='n' && LA17_64<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_76 = input.LA(1);

                        s = -1;
                        if ( (LA17_76=='e') ) {s = 88;}

                        else if ( ((LA17_76>='\u0000' && LA17_76<='d')||(LA17_76>='f' && LA17_76<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_88 = input.LA(1);

                        s = -1;
                        if ( (LA17_88=='t') ) {s = 98;}

                        else if ( ((LA17_88>='\u0000' && LA17_88<='s')||(LA17_88>='u' && LA17_88<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_98 = input.LA(1);

                        s = -1;
                        if ( (LA17_98=='e') ) {s = 106;}

                        else if ( ((LA17_98>='\u0000' && LA17_98<='d')||(LA17_98>='f' && LA17_98<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_106 = input.LA(1);

                        s = -1;
                        if ( (LA17_106=='r') ) {s = 112;}

                        else if ( ((LA17_106>='\u0000' && LA17_106<='q')||(LA17_106>='s' && LA17_106<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_112 = input.LA(1);

                        s = -1;
                        if ( (LA17_112=='s') ) {s = 117;}

                        else if ( ((LA17_112>='\u0000' && LA17_112<='r')||(LA17_112>='t' && LA17_112<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_117 = input.LA(1);

                        s = -1;
                        if ( (LA17_117=='\"') ) {s = 121;}

                        else if ( ((LA17_117>='\u0000' && LA17_117<='!')||(LA17_117>='#' && LA17_117<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_18 = input.LA(1);

                        s = -1;
                        if ( (LA17_18=='S') ) {s = 44;}

                        else if ( ((LA17_18>='\u0000' && LA17_18<='R')||(LA17_18>='T' && LA17_18<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_44 = input.LA(1);

                        s = -1;
                        if ( (LA17_44=='O') ) {s = 55;}

                        else if ( ((LA17_44>='\u0000' && LA17_44<='N')||(LA17_44>='P' && LA17_44<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_55 = input.LA(1);

                        s = -1;
                        if ( (LA17_55=='N') ) {s = 67;}

                        else if ( ((LA17_55>='\u0000' && LA17_55<='M')||(LA17_55>='O' && LA17_55<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_67 = input.LA(1);

                        s = -1;
                        if ( (LA17_67=='P') ) {s = 79;}

                        else if ( ((LA17_67>='\u0000' && LA17_67<='O')||(LA17_67>='Q' && LA17_67<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_1 = input.LA(1);

                        s = -1;
                        if ( (LA17_1=='A') ) {s = 16;}

                        else if ( (LA17_1=='p') ) {s = 17;}

                        else if ( (LA17_1=='J') ) {s = 18;}

                        else if ( (LA17_1=='o') ) {s = 19;}

                        else if ( (LA17_1=='r') ) {s = 20;}

                        else if ( (LA17_1=='n') ) {s = 21;}

                        else if ( (LA17_1=='t') ) {s = 22;}

                        else if ( (LA17_1=='k') ) {s = 23;}

                        else if ( (LA17_1=='u') ) {s = 24;}

                        else if ( ((LA17_1>='\u0000' && LA17_1<='@')||(LA17_1>='B' && LA17_1<='I')||(LA17_1>='K' && LA17_1<='j')||(LA17_1>='l' && LA17_1<='m')||LA17_1=='q'||LA17_1=='s'||(LA17_1>='v' && LA17_1<='\uFFFF')) ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_79 = input.LA(1);

                        s = -1;
                        if ( (LA17_79=='a') ) {s = 91;}

                        else if ( ((LA17_79>='\u0000' && LA17_79<='`')||(LA17_79>='b' && LA17_79<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_91 = input.LA(1);

                        s = -1;
                        if ( (LA17_91=='t') ) {s = 101;}

                        else if ( ((LA17_91>='\u0000' && LA17_91<='s')||(LA17_91>='u' && LA17_91<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_101 = input.LA(1);

                        s = -1;
                        if ( (LA17_101=='h') ) {s = 108;}

                        else if ( ((LA17_101>='\u0000' && LA17_101<='g')||(LA17_101>='i' && LA17_101<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_108 = input.LA(1);

                        s = -1;
                        if ( (LA17_108=='\"') ) {s = 114;}

                        else if ( ((LA17_108>='\u0000' && LA17_108<='!')||(LA17_108>='#' && LA17_108<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_43 = input.LA(1);

                        s = -1;
                        if ( (LA17_43=='o') ) {s = 54;}

                        else if ( ((LA17_43>='\u0000' && LA17_43<='n')||(LA17_43>='p' && LA17_43<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_54 = input.LA(1);

                        s = -1;
                        if ( (LA17_54=='t') ) {s = 66;}

                        else if ( ((LA17_54>='\u0000' && LA17_54<='s')||(LA17_54>='u' && LA17_54<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_66 = input.LA(1);

                        s = -1;
                        if ( (LA17_66=='o') ) {s = 78;}

                        else if ( ((LA17_66>='\u0000' && LA17_66<='n')||(LA17_66>='p' && LA17_66<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA17_78 = input.LA(1);

                        s = -1;
                        if ( (LA17_78=='c') ) {s = 90;}

                        else if ( ((LA17_78>='\u0000' && LA17_78<='b')||(LA17_78>='d' && LA17_78<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA17_90 = input.LA(1);

                        s = -1;
                        if ( (LA17_90=='o') ) {s = 100;}

                        else if ( ((LA17_90>='\u0000' && LA17_90<='n')||(LA17_90>='p' && LA17_90<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA17_100 = input.LA(1);

                        s = -1;
                        if ( (LA17_100=='l') ) {s = 107;}

                        else if ( ((LA17_100>='\u0000' && LA17_100<='k')||(LA17_100>='m' && LA17_100<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA17_107 = input.LA(1);

                        s = -1;
                        if ( (LA17_107=='\"') ) {s = 113;}

                        else if ( ((LA17_107>='\u0000' && LA17_107<='!')||(LA17_107>='#' && LA17_107<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA17_63 = input.LA(1);

                        s = -1;
                        if ( (LA17_63=='u') ) {s = 75;}

                        else if ( ((LA17_63>='\u0000' && LA17_63<='t')||(LA17_63>='v' && LA17_63<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA17_75 = input.LA(1);

                        s = -1;
                        if ( (LA17_75=='t') ) {s = 87;}

                        else if ( ((LA17_75>='\u0000' && LA17_75<='s')||(LA17_75>='u' && LA17_75<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA17_87 = input.LA(1);

                        s = -1;
                        if ( (LA17_87=='h') ) {s = 97;}

                        else if ( ((LA17_87>='\u0000' && LA17_87<='g')||(LA17_87>='i' && LA17_87<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA17_97 = input.LA(1);

                        s = -1;
                        if ( (LA17_97=='\"') ) {s = 105;}

                        else if ( ((LA17_97>='\u0000' && LA17_97<='!')||(LA17_97>='#' && LA17_97<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
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
                    case 29 : 
                        int LA17_19 = input.LA(1);

                        s = -1;
                        if ( (LA17_19=='u') ) {s = 45;}

                        else if ( ((LA17_19>='\u0000' && LA17_19<='t')||(LA17_19>='v' && LA17_19<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA17_45 = input.LA(1);

                        s = -1;
                        if ( (LA17_45=='t') ) {s = 56;}

                        else if ( ((LA17_45>='\u0000' && LA17_45<='s')||(LA17_45>='u' && LA17_45<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA17_56 = input.LA(1);

                        s = -1;
                        if ( (LA17_56=='p') ) {s = 68;}

                        else if ( ((LA17_56>='\u0000' && LA17_56<='o')||(LA17_56>='q' && LA17_56<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA17_68 = input.LA(1);

                        s = -1;
                        if ( (LA17_68=='u') ) {s = 80;}

                        else if ( ((LA17_68>='\u0000' && LA17_68<='t')||(LA17_68>='v' && LA17_68<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA17_80 = input.LA(1);

                        s = -1;
                        if ( (LA17_80=='t') ) {s = 92;}

                        else if ( ((LA17_80>='\u0000' && LA17_80<='s')||(LA17_80>='u' && LA17_80<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA17_92 = input.LA(1);

                        s = -1;
                        if ( (LA17_92=='s') ) {s = 102;}

                        else if ( ((LA17_92>='\u0000' && LA17_92<='r')||(LA17_92>='t' && LA17_92<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA17_102 = input.LA(1);

                        s = -1;
                        if ( (LA17_102=='\"') ) {s = 109;}

                        else if ( ((LA17_102>='\u0000' && LA17_102<='!')||(LA17_102>='#' && LA17_102<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA17_53 = input.LA(1);

                        s = -1;
                        if ( (LA17_53=='h') ) {s = 65;}

                        else if ( ((LA17_53>='\u0000' && LA17_53<='g')||(LA17_53>='i' && LA17_53<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA17_65 = input.LA(1);

                        s = -1;
                        if ( (LA17_65=='s') ) {s = 77;}

                        else if ( ((LA17_65>='\u0000' && LA17_65<='r')||(LA17_65>='t' && LA17_65<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA17_77 = input.LA(1);

                        s = -1;
                        if ( (LA17_77=='\"') ) {s = 89;}

                        else if ( ((LA17_77>='\u0000' && LA17_77<='!')||(LA17_77>='#' && LA17_77<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA17_20 = input.LA(1);

                        s = -1;
                        if ( (LA17_20=='o') ) {s = 46;}

                        else if ( ((LA17_20>='\u0000' && LA17_20<='n')||(LA17_20>='p' && LA17_20<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA17_46 = input.LA(1);

                        s = -1;
                        if ( (LA17_46=='u') ) {s = 57;}

                        else if ( ((LA17_46>='\u0000' && LA17_46<='t')||(LA17_46>='v' && LA17_46<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA17_57 = input.LA(1);

                        s = -1;
                        if ( (LA17_57=='t') ) {s = 69;}

                        else if ( ((LA17_57>='\u0000' && LA17_57<='s')||(LA17_57>='u' && LA17_57<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA17_69 = input.LA(1);

                        s = -1;
                        if ( (LA17_69=='e') ) {s = 81;}

                        else if ( ((LA17_69>='\u0000' && LA17_69<='d')||(LA17_69>='f' && LA17_69<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA17_81 = input.LA(1);

                        s = -1;
                        if ( (LA17_81=='\"') ) {s = 93;}

                        else if ( ((LA17_81>='\u0000' && LA17_81<='!')||(LA17_81>='#' && LA17_81<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA17_21 = input.LA(1);

                        s = -1;
                        if ( (LA17_21=='a') ) {s = 47;}

                        else if ( ((LA17_21>='\u0000' && LA17_21<='`')||(LA17_21>='b' && LA17_21<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA17_47 = input.LA(1);

                        s = -1;
                        if ( (LA17_47=='m') ) {s = 58;}

                        else if ( ((LA17_47>='\u0000' && LA17_47<='l')||(LA17_47>='n' && LA17_47<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA17_58 = input.LA(1);

                        s = -1;
                        if ( (LA17_58=='e') ) {s = 70;}

                        else if ( ((LA17_58>='\u0000' && LA17_58<='d')||(LA17_58>='f' && LA17_58<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA17_70 = input.LA(1);

                        s = -1;
                        if ( (LA17_70=='\"') ) {s = 82;}

                        else if ( ((LA17_70>='\u0000' && LA17_70<='!')||(LA17_70>='#' && LA17_70<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA17_22 = input.LA(1);

                        s = -1;
                        if ( (LA17_22=='y') ) {s = 48;}

                        else if ( ((LA17_22>='\u0000' && LA17_22<='x')||(LA17_22>='z' && LA17_22<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA17_48 = input.LA(1);

                        s = -1;
                        if ( (LA17_48=='p') ) {s = 59;}

                        else if ( ((LA17_48>='\u0000' && LA17_48<='o')||(LA17_48>='q' && LA17_48<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA17_59 = input.LA(1);

                        s = -1;
                        if ( (LA17_59=='e') ) {s = 71;}

                        else if ( ((LA17_59>='\u0000' && LA17_59<='d')||(LA17_59>='f' && LA17_59<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA17_71 = input.LA(1);

                        s = -1;
                        if ( (LA17_71=='\"') ) {s = 83;}

                        else if ( ((LA17_71>='\u0000' && LA17_71<='!')||(LA17_71>='#' && LA17_71<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA17_16 = input.LA(1);

                        s = -1;
                        if ( (LA17_16=='P') ) {s = 41;}

                        else if ( ((LA17_16>='\u0000' && LA17_16<='O')||(LA17_16>='Q' && LA17_16<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA17_41 = input.LA(1);

                        s = -1;
                        if ( (LA17_41=='I') ) {s = 51;}

                        else if ( ((LA17_41>='\u0000' && LA17_41<='H')||(LA17_41>='J' && LA17_41<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA17_23 = input.LA(1);

                        s = -1;
                        if ( (LA17_23=='e') ) {s = 49;}

                        else if ( ((LA17_23>='\u0000' && LA17_23<='d')||(LA17_23>='f' && LA17_23<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA17_49 = input.LA(1);

                        s = -1;
                        if ( (LA17_49=='y') ) {s = 60;}

                        else if ( ((LA17_49>='\u0000' && LA17_49<='x')||(LA17_49>='z' && LA17_49<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA17_51 = input.LA(1);

                        s = -1;
                        if ( (LA17_51=='D') ) {s = 62;}

                        else if ( (LA17_51=='A') ) {s = 63;}

                        else if ( ((LA17_51>='\u0000' && LA17_51<='@')||(LA17_51>='B' && LA17_51<='C')||(LA17_51>='E' && LA17_51<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA17_60 = input.LA(1);

                        s = -1;
                        if ( (LA17_60=='\"') ) {s = 72;}

                        else if ( ((LA17_60>='\u0000' && LA17_60<='!')||(LA17_60>='#' && LA17_60<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA17_24 = input.LA(1);

                        s = -1;
                        if ( (LA17_24=='r') ) {s = 50;}

                        else if ( ((LA17_24>='\u0000' && LA17_24<='q')||(LA17_24>='s' && LA17_24<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA17_50 = input.LA(1);

                        s = -1;
                        if ( (LA17_50=='l') ) {s = 61;}

                        else if ( ((LA17_50>='\u0000' && LA17_50<='k')||(LA17_50>='m' && LA17_50<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA17_61 = input.LA(1);

                        s = -1;
                        if ( (LA17_61=='\"') ) {s = 73;}

                        else if ( ((LA17_61>='\u0000' && LA17_61<='!')||(LA17_61>='#' && LA17_61<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA17_42 = input.LA(1);

                        s = -1;
                        if ( (LA17_42=='r') ) {s = 52;}

                        else if ( (LA17_42=='t') ) {s = 53;}

                        else if ( ((LA17_42>='\u0000' && LA17_42<='q')||LA17_42=='s'||(LA17_42>='u' && LA17_42<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA17_62 = input.LA(1);

                        s = -1;
                        if ( (LA17_62=='e') ) {s = 74;}

                        else if ( ((LA17_62>='\u0000' && LA17_62<='d')||(LA17_62>='f' && LA17_62<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA17_74 = input.LA(1);

                        s = -1;
                        if ( (LA17_74=='s') ) {s = 86;}

                        else if ( ((LA17_74>='\u0000' && LA17_74<='r')||(LA17_74>='t' && LA17_74<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA17_86 = input.LA(1);

                        s = -1;
                        if ( (LA17_86=='c') ) {s = 96;}

                        else if ( ((LA17_86>='\u0000' && LA17_86<='b')||(LA17_86>='d' && LA17_86<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA17_96 = input.LA(1);

                        s = -1;
                        if ( (LA17_96=='r') ) {s = 104;}

                        else if ( ((LA17_96>='\u0000' && LA17_96<='q')||(LA17_96>='s' && LA17_96<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA17_104 = input.LA(1);

                        s = -1;
                        if ( (LA17_104=='i') ) {s = 110;}

                        else if ( ((LA17_104>='\u0000' && LA17_104<='h')||(LA17_104>='j' && LA17_104<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA17_110 = input.LA(1);

                        s = -1;
                        if ( (LA17_110=='p') ) {s = 116;}

                        else if ( ((LA17_110>='\u0000' && LA17_110<='o')||(LA17_110>='q' && LA17_110<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA17_116 = input.LA(1);

                        s = -1;
                        if ( (LA17_116=='t') ) {s = 120;}

                        else if ( ((LA17_116>='\u0000' && LA17_116<='s')||(LA17_116>='u' && LA17_116<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA17_120 = input.LA(1);

                        s = -1;
                        if ( (LA17_120=='i') ) {s = 122;}

                        else if ( ((LA17_120>='\u0000' && LA17_120<='h')||(LA17_120>='j' && LA17_120<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA17_122 = input.LA(1);

                        s = -1;
                        if ( (LA17_122=='o') ) {s = 124;}

                        else if ( ((LA17_122>='\u0000' && LA17_122<='n')||(LA17_122>='p' && LA17_122<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA17_124 = input.LA(1);

                        s = -1;
                        if ( (LA17_124=='n') ) {s = 125;}

                        else if ( ((LA17_124>='\u0000' && LA17_124<='m')||(LA17_124>='o' && LA17_124<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA17_125 = input.LA(1);

                        s = -1;
                        if ( (LA17_125=='s') ) {s = 126;}

                        else if ( ((LA17_125>='\u0000' && LA17_125<='r')||(LA17_125>='t' && LA17_125<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA17_126 = input.LA(1);

                        s = -1;
                        if ( (LA17_126=='\"') ) {s = 127;}

                        else if ( ((LA17_126>='\u0000' && LA17_126<='!')||(LA17_126>='#' && LA17_126<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA17_17 = input.LA(1);

                        s = -1;
                        if ( (LA17_17=='a') ) {s = 42;}

                        else if ( (LA17_17=='r') ) {s = 43;}

                        else if ( ((LA17_17>='\u0000' && LA17_17<='`')||(LA17_17>='b' && LA17_17<='q')||(LA17_17>='s' && LA17_17<='\uFFFF')) ) {s = 25;}

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