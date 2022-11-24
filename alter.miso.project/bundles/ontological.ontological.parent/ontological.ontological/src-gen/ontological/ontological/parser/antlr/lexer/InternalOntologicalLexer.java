package ontological.ontological.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologicalLexer extends Lexer {
    public static final int NoSCN=22;
    public static final int Attributes=5;
    public static final int True=29;
    public static final int False=28;
    public static final int IsKey=21;
    public static final int Name=23;
    public static final int IsParam=17;
    public static final int RightSquareBracket=33;
    public static final int Classes=15;
    public static final int Opposite=13;
    public static final int ReadOnly=14;
    public static final int RULE_ID=40;
    public static final int Min=27;
    public static final int RULE_INT=36;
    public static final int External=10;
    public static final int AutoID=19;
    public static final int RULE_ML_COMMENT=41;
    public static final int LeftSquareBracket=32;
    public static final int Bluetooth=7;
    public static final int Gameloop=12;
    public static final int Max=26;
    public static final int RULE_STRING=37;
    public static final int URI=25;
    public static final int RULE_SL_COMMENT=42;
    public static final int Comma=30;
    public static final int Target=20;
    public static final int Colon=31;
    public static final int RightCurlyBracket=35;
    public static final int RULE_E_DOUBLE=39;
    public static final int EOF=-1;
    public static final int Containtment=4;
    public static final int Firebase=11;
    public static final int OnlyCodes=8;
    public static final int RULE_WS=43;
    public static final int Abstract=9;
    public static final int LeftCurlyBracket=34;
    public static final int RULE_E_INT=38;
    public static final int RULE_ANY_OTHER=44;
    public static final int Default=16;
    public static final int Physics=18;
    public static final int Type=24;
    public static final int References=6;

    // delegates
    // delegators

    public InternalOntologicalLexer() {;} 
    public InternalOntologicalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOntologicalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOntologicalLexer.g"; }

    // $ANTLR start "Containtment"
    public final void mContaintment() throws RecognitionException {
        try {
            int _type = Containtment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:14:14: ( '\"containtment\"' )
            // InternalOntologicalLexer.g:14:16: '\"containtment\"'
            {
            match("\"containtment\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Containtment"

    // $ANTLR start "Attributes"
    public final void mAttributes() throws RecognitionException {
        try {
            int _type = Attributes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:16:12: ( '\"attributes\"' )
            // InternalOntologicalLexer.g:16:14: '\"attributes\"'
            {
            match("\"attributes\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Attributes"

    // $ANTLR start "References"
    public final void mReferences() throws RecognitionException {
        try {
            int _type = References;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:18:12: ( '\"references\"' )
            // InternalOntologicalLexer.g:18:14: '\"references\"'
            {
            match("\"references\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "References"

    // $ANTLR start "Bluetooth"
    public final void mBluetooth() throws RecognitionException {
        try {
            int _type = Bluetooth;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:20:11: ( '\"bluetooth\"' )
            // InternalOntologicalLexer.g:20:13: '\"bluetooth\"'
            {
            match("\"bluetooth\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bluetooth"

    // $ANTLR start "OnlyCodes"
    public final void mOnlyCodes() throws RecognitionException {
        try {
            int _type = OnlyCodes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:22:11: ( '\"onlyCodes\"' )
            // InternalOntologicalLexer.g:22:13: '\"onlyCodes\"'
            {
            match("\"onlyCodes\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OnlyCodes"

    // $ANTLR start "Abstract"
    public final void mAbstract() throws RecognitionException {
        try {
            int _type = Abstract;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:24:10: ( '\"abstract\"' )
            // InternalOntologicalLexer.g:24:12: '\"abstract\"'
            {
            match("\"abstract\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Abstract"

    // $ANTLR start "External"
    public final void mExternal() throws RecognitionException {
        try {
            int _type = External;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:26:10: ( '\"external\"' )
            // InternalOntologicalLexer.g:26:12: '\"external\"'
            {
            match("\"external\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "External"

    // $ANTLR start "Firebase"
    public final void mFirebase() throws RecognitionException {
        try {
            int _type = Firebase;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:28:10: ( '\"firebase\"' )
            // InternalOntologicalLexer.g:28:12: '\"firebase\"'
            {
            match("\"firebase\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Firebase"

    // $ANTLR start "Gameloop"
    public final void mGameloop() throws RecognitionException {
        try {
            int _type = Gameloop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:30:10: ( '\"gameloop\"' )
            // InternalOntologicalLexer.g:30:12: '\"gameloop\"'
            {
            match("\"gameloop\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Gameloop"

    // $ANTLR start "Opposite"
    public final void mOpposite() throws RecognitionException {
        try {
            int _type = Opposite;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:32:10: ( '\"opposite\"' )
            // InternalOntologicalLexer.g:32:12: '\"opposite\"'
            {
            match("\"opposite\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Opposite"

    // $ANTLR start "ReadOnly"
    public final void mReadOnly() throws RecognitionException {
        try {
            int _type = ReadOnly;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:34:10: ( '\"readOnly\"' )
            // InternalOntologicalLexer.g:34:12: '\"readOnly\"'
            {
            match("\"readOnly\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReadOnly"

    // $ANTLR start "Classes"
    public final void mClasses() throws RecognitionException {
        try {
            int _type = Classes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:36:9: ( '\"classes\"' )
            // InternalOntologicalLexer.g:36:11: '\"classes\"'
            {
            match("\"classes\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Classes"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:38:9: ( '\"default\"' )
            // InternalOntologicalLexer.g:38:11: '\"default\"'
            {
            match("\"default\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "IsParam"
    public final void mIsParam() throws RecognitionException {
        try {
            int _type = IsParam;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:40:9: ( '\"isParam\"' )
            // InternalOntologicalLexer.g:40:11: '\"isParam\"'
            {
            match("\"isParam\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IsParam"

    // $ANTLR start "Physics"
    public final void mPhysics() throws RecognitionException {
        try {
            int _type = Physics;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:42:9: ( '\"physics\"' )
            // InternalOntologicalLexer.g:42:11: '\"physics\"'
            {
            match("\"physics\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Physics"

    // $ANTLR start "AutoID"
    public final void mAutoID() throws RecognitionException {
        try {
            int _type = AutoID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:44:8: ( '\"autoID\"' )
            // InternalOntologicalLexer.g:44:10: '\"autoID\"'
            {
            match("\"autoID\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AutoID"

    // $ANTLR start "Target"
    public final void mTarget() throws RecognitionException {
        try {
            int _type = Target;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:46:8: ( '\"target\"' )
            // InternalOntologicalLexer.g:46:10: '\"target\"'
            {
            match("\"target\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Target"

    // $ANTLR start "IsKey"
    public final void mIsKey() throws RecognitionException {
        try {
            int _type = IsKey;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:48:7: ( '\"isKey\"' )
            // InternalOntologicalLexer.g:48:9: '\"isKey\"'
            {
            match("\"isKey\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IsKey"

    // $ANTLR start "NoSCN"
    public final void mNoSCN() throws RecognitionException {
        try {
            int _type = NoSCN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:50:7: ( '\"noSCN\"' )
            // InternalOntologicalLexer.g:50:9: '\"noSCN\"'
            {
            match("\"noSCN\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NoSCN"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:52:6: ( '\"name\"' )
            // InternalOntologicalLexer.g:52:8: '\"name\"'
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
            // InternalOntologicalLexer.g:54:6: ( '\"type\"' )
            // InternalOntologicalLexer.g:54:8: '\"type\"'
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

    // $ANTLR start "URI"
    public final void mURI() throws RecognitionException {
        try {
            int _type = URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:56:5: ( '\"URI\"' )
            // InternalOntologicalLexer.g:56:7: '\"URI\"'
            {
            match("\"URI\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "URI"

    // $ANTLR start "Max"
    public final void mMax() throws RecognitionException {
        try {
            int _type = Max;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:58:5: ( '\"max\"' )
            // InternalOntologicalLexer.g:58:7: '\"max\"'
            {
            match("\"max\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Max"

    // $ANTLR start "Min"
    public final void mMin() throws RecognitionException {
        try {
            int _type = Min;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:60:5: ( '\"min\"' )
            // InternalOntologicalLexer.g:60:7: '\"min\"'
            {
            match("\"min\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Min"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:62:7: ( 'false' )
            // InternalOntologicalLexer.g:62:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:64:6: ( 'true' )
            // InternalOntologicalLexer.g:64:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalLexer.g:66:7: ( ',' )
            // InternalOntologicalLexer.g:66:9: ','
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
            // InternalOntologicalLexer.g:68:7: ( ':' )
            // InternalOntologicalLexer.g:68:9: ':'
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
            // InternalOntologicalLexer.g:70:19: ( '[' )
            // InternalOntologicalLexer.g:70:21: '['
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
            // InternalOntologicalLexer.g:72:20: ( ']' )
            // InternalOntologicalLexer.g:72:22: ']'
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
            // InternalOntologicalLexer.g:74:18: ( '{' )
            // InternalOntologicalLexer.g:74:20: '{'
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
            // InternalOntologicalLexer.g:76:19: ( '}' )
            // InternalOntologicalLexer.g:76:21: '}'
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
            // InternalOntologicalLexer.g:78:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalOntologicalLexer.g:78:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalOntologicalLexer.g:78:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalOntologicalLexer.g:78:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalOntologicalLexer.g:78:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalOntologicalLexer.g:78:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalOntologicalLexer.g:78:36: '0' .. '9'
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
            // InternalOntologicalLexer.g:80:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalOntologicalLexer.g:80:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalOntologicalLexer.g:80:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalOntologicalLexer.g:80:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalOntologicalLexer.g:80:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalOntologicalLexer.g:82:12: ( ( '-' )? RULE_INT )
            // InternalOntologicalLexer.g:82:14: ( '-' )? RULE_INT
            {
            // InternalOntologicalLexer.g:82:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntologicalLexer.g:82:14: '-'
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
            // InternalOntologicalLexer.g:84:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalOntologicalLexer.g:84:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalOntologicalLexer.g:84:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntologicalLexer.g:84:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalOntologicalLexer.g:84:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntologicalLexer.g:84:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalOntologicalLexer.g:84:36: ( RULE_INT )+
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
                    	    // InternalOntologicalLexer.g:84:36: RULE_INT
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

            // InternalOntologicalLexer.g:84:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntologicalLexer.g:84:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalOntologicalLexer.g:84:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalOntologicalLexer.g:
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
            // InternalOntologicalLexer.g:86:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOntologicalLexer.g:86:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOntologicalLexer.g:86:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntologicalLexer.g:86:11: '^'
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

            // InternalOntologicalLexer.g:86:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOntologicalLexer.g:
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
            // InternalOntologicalLexer.g:88:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOntologicalLexer.g:88:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOntologicalLexer.g:88:24: ( options {greedy=false; } : . )*
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
            	    // InternalOntologicalLexer.g:88:52: .
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
            // InternalOntologicalLexer.g:90:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOntologicalLexer.g:90:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOntologicalLexer.g:90:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOntologicalLexer.g:90:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalOntologicalLexer.g:90:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntologicalLexer.g:90:41: ( '\\r' )? '\\n'
                    {
                    // InternalOntologicalLexer.g:90:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalOntologicalLexer.g:90:41: '\\r'
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
            // InternalOntologicalLexer.g:92:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOntologicalLexer.g:92:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOntologicalLexer.g:92:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalOntologicalLexer.g:
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
            // InternalOntologicalLexer.g:94:16: ( . )
            // InternalOntologicalLexer.g:94:18: .
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
        // InternalOntologicalLexer.g:1:8: ( Containtment | Attributes | References | Bluetooth | OnlyCodes | Abstract | External | Firebase | Gameloop | Opposite | ReadOnly | Classes | Default | IsParam | Physics | AutoID | Target | IsKey | NoSCN | Name | Type | URI | Max | Min | False | True | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=40;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalOntologicalLexer.g:1:10: Containtment
                {
                mContaintment(); 

                }
                break;
            case 2 :
                // InternalOntologicalLexer.g:1:23: Attributes
                {
                mAttributes(); 

                }
                break;
            case 3 :
                // InternalOntologicalLexer.g:1:34: References
                {
                mReferences(); 

                }
                break;
            case 4 :
                // InternalOntologicalLexer.g:1:45: Bluetooth
                {
                mBluetooth(); 

                }
                break;
            case 5 :
                // InternalOntologicalLexer.g:1:55: OnlyCodes
                {
                mOnlyCodes(); 

                }
                break;
            case 6 :
                // InternalOntologicalLexer.g:1:65: Abstract
                {
                mAbstract(); 

                }
                break;
            case 7 :
                // InternalOntologicalLexer.g:1:74: External
                {
                mExternal(); 

                }
                break;
            case 8 :
                // InternalOntologicalLexer.g:1:83: Firebase
                {
                mFirebase(); 

                }
                break;
            case 9 :
                // InternalOntologicalLexer.g:1:92: Gameloop
                {
                mGameloop(); 

                }
                break;
            case 10 :
                // InternalOntologicalLexer.g:1:101: Opposite
                {
                mOpposite(); 

                }
                break;
            case 11 :
                // InternalOntologicalLexer.g:1:110: ReadOnly
                {
                mReadOnly(); 

                }
                break;
            case 12 :
                // InternalOntologicalLexer.g:1:119: Classes
                {
                mClasses(); 

                }
                break;
            case 13 :
                // InternalOntologicalLexer.g:1:127: Default
                {
                mDefault(); 

                }
                break;
            case 14 :
                // InternalOntologicalLexer.g:1:135: IsParam
                {
                mIsParam(); 

                }
                break;
            case 15 :
                // InternalOntologicalLexer.g:1:143: Physics
                {
                mPhysics(); 

                }
                break;
            case 16 :
                // InternalOntologicalLexer.g:1:151: AutoID
                {
                mAutoID(); 

                }
                break;
            case 17 :
                // InternalOntologicalLexer.g:1:158: Target
                {
                mTarget(); 

                }
                break;
            case 18 :
                // InternalOntologicalLexer.g:1:165: IsKey
                {
                mIsKey(); 

                }
                break;
            case 19 :
                // InternalOntologicalLexer.g:1:171: NoSCN
                {
                mNoSCN(); 

                }
                break;
            case 20 :
                // InternalOntologicalLexer.g:1:177: Name
                {
                mName(); 

                }
                break;
            case 21 :
                // InternalOntologicalLexer.g:1:182: Type
                {
                mType(); 

                }
                break;
            case 22 :
                // InternalOntologicalLexer.g:1:187: URI
                {
                mURI(); 

                }
                break;
            case 23 :
                // InternalOntologicalLexer.g:1:191: Max
                {
                mMax(); 

                }
                break;
            case 24 :
                // InternalOntologicalLexer.g:1:195: Min
                {
                mMin(); 

                }
                break;
            case 25 :
                // InternalOntologicalLexer.g:1:199: False
                {
                mFalse(); 

                }
                break;
            case 26 :
                // InternalOntologicalLexer.g:1:205: True
                {
                mTrue(); 

                }
                break;
            case 27 :
                // InternalOntologicalLexer.g:1:210: Comma
                {
                mComma(); 

                }
                break;
            case 28 :
                // InternalOntologicalLexer.g:1:216: Colon
                {
                mColon(); 

                }
                break;
            case 29 :
                // InternalOntologicalLexer.g:1:222: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 30 :
                // InternalOntologicalLexer.g:1:240: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 31 :
                // InternalOntologicalLexer.g:1:259: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 32 :
                // InternalOntologicalLexer.g:1:276: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 33 :
                // InternalOntologicalLexer.g:1:294: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // InternalOntologicalLexer.g:1:306: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 35 :
                // InternalOntologicalLexer.g:1:317: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 36 :
                // InternalOntologicalLexer.g:1:331: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // InternalOntologicalLexer.g:1:339: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalOntologicalLexer.g:1:355: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalOntologicalLexer.g:1:371: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalOntologicalLexer.g:1:379: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\21\2\43\6\uffff\1\21\2\55\1\21\1\uffff\1\21\22\uffff\1\43\1\uffff\1\43\6\uffff\2\55\2\uffff\1\55\31\uffff\2\43\30\uffff\1\43\1\176\30\uffff\1\u0097\167\uffff";
    static final String DFA17_eofS =
        "\u00f5\uffff";
    static final String DFA17_minS =
        "\2\0\1\141\1\162\6\uffff\1\60\2\56\1\101\1\uffff\1\52\2\uffff\17\0\1\uffff\1\154\1\uffff\1\165\6\uffff\2\56\2\uffff\1\56\3\uffff\26\0\1\163\1\145\30\0\1\145\1\60\25\0\3\uffff\1\60\1\uffff\22\0\1\uffff\1\0\5\uffff\17\0\1\uffff\2\0\3\uffff\4\0\1\uffff\12\0\1\uffff\1\0\2\uffff\1\0\1\uffff\2\0\1\uffff\10\0\4\uffff\1\0\1\uffff\1\0\1\uffff\1\0\1\uffff\2\0\7\uffff\2\0\1\uffff\1\0\7\uffff\1\0\4\uffff\1\0\4\uffff";
    static final String DFA17_maxS =
        "\2\uffff\1\141\1\162\6\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\17\uffff\1\uffff\1\154\1\uffff\1\165\6\uffff\2\145\2\uffff\1\145\3\uffff\26\uffff\1\163\1\145\30\uffff\1\145\1\172\25\uffff\3\uffff\1\172\1\uffff\22\uffff\1\uffff\1\uffff\5\uffff\17\uffff\1\uffff\2\uffff\3\uffff\4\uffff\1\uffff\12\uffff\1\uffff\1\uffff\2\uffff\1\uffff\1\uffff\2\uffff\1\uffff\10\uffff\4\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff\7\uffff\2\uffff\1\uffff\1\uffff\7\uffff\1\uffff\4\uffff\1\uffff\4\uffff";
    static final String DFA17_acceptS =
        "\4\uffff\1\33\1\34\1\35\1\36\1\37\1\40\4\uffff\1\44\1\uffff\1\47\1\50\17\uffff\1\41\1\uffff\1\44\1\uffff\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\1\42\1\43\1\uffff\1\45\1\46\1\47\107\uffff\1\26\1\27\1\30\1\uffff\1\32\22\uffff\1\25\1\uffff\1\24\1\26\1\27\1\30\1\31\17\uffff\1\22\2\uffff\1\25\1\23\1\24\4\uffff\1\20\12\uffff\1\22\1\uffff\1\21\1\23\1\uffff\1\14\2\uffff\1\20\10\uffff\1\15\1\16\1\17\1\21\1\uffff\1\14\1\uffff\1\6\1\uffff\1\13\2\uffff\1\12\1\7\1\10\1\11\1\15\1\16\1\17\2\uffff\1\6\1\uffff\1\13\1\4\1\5\1\12\1\7\1\10\1\11\1\uffff\1\2\1\3\1\4\1\5\1\uffff\1\2\1\3\2\1";
    static final String DFA17_specialS =
        "\1\115\1\u009b\20\uffff\1\u008a\1\0\1\u0091\1\40\1\u0098\1\71\1\101\1\111\1\146\1\1\1\162\1\34\1\44\1\u0092\1\121\22\uffff\1\3\1\140\1\16\1\62\1\171\1\u0093\1\41\1\52\1\123\1\72\1\102\1\112\1\147\1\2\1\163\1\176\1\u008e\1\u0086\1\u008b\1\u0094\1\u0096\1\u0099\2\uffff\1\4\1\141\1\17\1\63\1\172\1\27\1\132\1\42\1\53\1\124\1\73\1\103\1\113\1\150\1\155\1\u0083\1\164\1\177\1\u008f\1\u0087\1\u008c\1\u0095\1\u0097\1\u009a\2\uffff\1\5\1\142\1\20\1\64\1\173\1\30\1\133\1\43\1\54\1\125\1\74\1\104\1\114\1\151\1\156\1\u0084\1\165\1\u0080\1\u0090\1\u0088\1\u008d\5\uffff\1\6\1\143\1\21\1\65\1\174\1\31\1\134\1\45\1\55\1\126\1\75\1\105\1\116\1\152\1\157\1\u0085\1\166\1\u0081\1\uffff\1\u0089\5\uffff\1\7\1\144\1\22\1\66\1\175\1\32\1\135\1\46\1\56\1\127\1\76\1\106\1\117\1\153\1\160\1\uffff\1\167\1\u0082\3\uffff\1\10\1\145\1\23\1\67\1\uffff\1\33\1\136\1\47\1\57\1\130\1\77\1\107\1\120\1\154\1\161\1\uffff\1\170\2\uffff\1\11\1\uffff\1\24\1\70\1\uffff\1\35\1\137\1\50\1\60\1\131\1\100\1\110\1\122\4\uffff\1\12\1\uffff\1\25\1\uffff\1\36\1\uffff\1\51\1\61\7\uffff\1\13\1\26\1\uffff\1\37\7\uffff\1\14\4\uffff\1\15\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\1\11\21\1\4\1\12\1\21\1\17\1\13\11\14\1\5\6\21\32\16\1\6\1\21\1\7\1\15\1\16\1\21\5\16\1\2\15\16\1\3\6\16\1\10\1\21\1\11\uff82\21",
            "\125\41\1\37\13\41\1\23\1\25\1\22\1\32\1\27\1\30\1\31\1\41\1\33\3\41\1\40\1\36\1\26\1\34\1\41\1\24\1\41\1\35\uff8b\41",
            "\1\42",
            "\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\11\54",
            "\1\56\26\uffff\1\56\37\uffff\1\56",
            "\1\56\1\uffff\12\57\13\uffff\1\56\37\uffff\1\56",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "\154\41\1\64\2\41\1\63\uff90\41",
            "\142\41\1\66\21\41\1\65\1\67\uff8a\41",
            "\145\41\1\70\uff9a\41",
            "\154\41\1\71\uff93\41",
            "\156\41\1\72\1\41\1\73\uff8f\41",
            "\170\41\1\74\uff87\41",
            "\151\41\1\75\uff96\41",
            "\141\41\1\76\uff9e\41",
            "\145\41\1\77\uff9a\41",
            "\163\41\1\100\uff8c\41",
            "\150\41\1\101\uff97\41",
            "\141\41\1\102\27\41\1\103\uff86\41",
            "\141\41\1\105\15\41\1\104\uff90\41",
            "\122\41\1\106\uffad\41",
            "\141\41\1\107\7\41\1\110\uff96\41",
            "",
            "\1\111",
            "",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56\26\uffff\1\56\37\uffff\1\56",
            "\1\56\1\uffff\12\57\13\uffff\1\56\37\uffff\1\56",
            "",
            "",
            "\1\56\1\uffff\12\57\13\uffff\1\56\37\uffff\1\56",
            "",
            "",
            "",
            "\156\41\1\113\uff91\41",
            "\141\41\1\114\uff9e\41",
            "\164\41\1\115\uff8b\41",
            "\163\41\1\116\uff8c\41",
            "\164\41\1\117\uff8b\41",
            "\141\41\1\121\4\41\1\120\uff99\41",
            "\165\41\1\122\uff8a\41",
            "\154\41\1\123\uff93\41",
            "\160\41\1\124\uff8f\41",
            "\164\41\1\125\uff8b\41",
            "\162\41\1\126\uff8d\41",
            "\155\41\1\127\uff92\41",
            "\146\41\1\130\uff99\41",
            "\113\41\1\132\4\41\1\131\uffaf\41",
            "\171\41\1\133\uff86\41",
            "\162\41\1\134\uff8d\41",
            "\160\41\1\135\uff8f\41",
            "\123\41\1\136\uffac\41",
            "\155\41\1\137\uff92\41",
            "\111\41\1\140\uffb6\41",
            "\170\41\1\141\uff87\41",
            "\156\41\1\142\uff91\41",
            "\1\143",
            "\1\144",
            "\164\41\1\145\uff8b\41",
            "\163\41\1\146\uff8c\41",
            "\162\41\1\147\uff8d\41",
            "\164\41\1\150\uff8b\41",
            "\157\41\1\151\uff90\41",
            "\145\41\1\152\uff9a\41",
            "\144\41\1\153\uff9b\41",
            "\145\41\1\154\uff9a\41",
            "\171\41\1\155\uff86\41",
            "\157\41\1\156\uff90\41",
            "\145\41\1\157\uff9a\41",
            "\145\41\1\160\uff9a\41",
            "\145\41\1\161\uff9a\41",
            "\141\41\1\162\uff9e\41",
            "\141\41\1\163\uff9e\41",
            "\145\41\1\164\uff9a\41",
            "\163\41\1\165\uff8c\41",
            "\147\41\1\166\uff98\41",
            "\145\41\1\167\uff9a\41",
            "\103\41\1\170\uffbc\41",
            "\145\41\1\171\uff9a\41",
            "\42\41\1\172\uffdd\41",
            "\42\41\1\173\uffdd\41",
            "\42\41\1\174\uffdd\41",
            "\1\175",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\141\41\1\177\uff9e\41",
            "\163\41\1\u0080\uff8c\41",
            "\151\41\1\u0081\uff96\41",
            "\162\41\1\u0082\uff8d\41",
            "\111\41\1\u0083\uffb6\41",
            "\162\41\1\u0084\uff8d\41",
            "\117\41\1\u0085\uffb0\41",
            "\164\41\1\u0086\uff8b\41",
            "\103\41\1\u0087\uffbc\41",
            "\163\41\1\u0088\uff8c\41",
            "\162\41\1\u0089\uff8d\41",
            "\142\41\1\u008a\uff9d\41",
            "\154\41\1\u008b\uff93\41",
            "\165\41\1\u008c\uff8a\41",
            "\162\41\1\u008d\uff8d\41",
            "\171\41\1\u008e\uff86\41",
            "\151\41\1\u008f\uff96\41",
            "\145\41\1\u0090\uff9a\41",
            "\42\41\1\u0091\uffdd\41",
            "\116\41\1\u0092\uffb1\41",
            "\42\41\1\u0093\uffdd\41",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\151\41\1\u0098\uff96\41",
            "\145\41\1\u0099\uff9a\41",
            "\142\41\1\u009a\uff9d\41",
            "\141\41\1\u009b\uff9e\41",
            "\104\41\1\u009c\uffbb\41",
            "\145\41\1\u009d\uff9a\41",
            "\156\41\1\u009e\uff91\41",
            "\157\41\1\u009f\uff90\41",
            "\157\41\1\u00a0\uff90\41",
            "\151\41\1\u00a1\uff96\41",
            "\156\41\1\u00a2\uff91\41",
            "\141\41\1\u00a3\uff9e\41",
            "\157\41\1\u00a4\uff90\41",
            "\154\41\1\u00a5\uff93\41",
            "\141\41\1\u00a6\uff9e\41",
            "\42\41\1\u00a7\uffdd\41",
            "\143\41\1\u00a8\uff9c\41",
            "\164\41\1\u00a9\uff8b\41",
            "",
            "\42\41\1\u00ab\uffdd\41",
            "",
            "",
            "",
            "",
            "",
            "\156\41\1\u00ad\uff91\41",
            "\163\41\1\u00ae\uff8c\41",
            "\165\41\1\u00af\uff8a\41",
            "\143\41\1\u00b0\uff9c\41",
            "\42\41\1\u00b1\uffdd\41",
            "\156\41\1\u00b2\uff91\41",
            "\154\41\1\u00b3\uff93\41",
            "\157\41\1\u00b4\uff90\41",
            "\144\41\1\u00b5\uff9b\41",
            "\164\41\1\u00b6\uff8b\41",
            "\141\41\1\u00b7\uff9e\41",
            "\163\41\1\u00b8\uff8c\41",
            "\157\41\1\u00b9\uff90\41",
            "\164\41\1\u00ba\uff8b\41",
            "\155\41\1\u00bb\uff92\41",
            "",
            "\163\41\1\u00bd\uff8c\41",
            "\42\41\1\u00be\uffdd\41",
            "",
            "",
            "",
            "\164\41\1\u00c0\uff8b\41",
            "\42\41\1\u00c1\uffdd\41",
            "\164\41\1\u00c2\uff8b\41",
            "\164\41\1\u00c3\uff8b\41",
            "",
            "\143\41\1\u00c5\uff9c\41",
            "\171\41\1\u00c6\uff86\41",
            "\164\41\1\u00c7\uff8b\41",
            "\145\41\1\u00c8\uff9a\41",
            "\145\41\1\u00c9\uff9a\41",
            "\154\41\1\u00ca\uff93\41",
            "\145\41\1\u00cb\uff9a\41",
            "\160\41\1\u00cc\uff8f\41",
            "\42\41\1\u00cd\uffdd\41",
            "\42\41\1\u00ce\uffdd\41",
            "",
            "\42\41\1\u00cf\uffdd\41",
            "",
            "",
            "\155\41\1\u00d1\uff92\41",
            "",
            "\145\41\1\u00d3\uff9a\41",
            "\42\41\1\u00d4\uffdd\41",
            "",
            "\145\41\1\u00d5\uff9a\41",
            "\42\41\1\u00d6\uffdd\41",
            "\150\41\1\u00d7\uff97\41",
            "\163\41\1\u00d8\uff8c\41",
            "\42\41\1\u00d9\uffdd\41",
            "\42\41\1\u00da\uffdd\41",
            "\42\41\1\u00db\uffdd\41",
            "\42\41\1\u00dc\uffdd\41",
            "",
            "",
            "",
            "",
            "\145\41\1\u00e0\uff9a\41",
            "",
            "\163\41\1\u00e1\uff8c\41",
            "",
            "\163\41\1\u00e3\uff8c\41",
            "",
            "\42\41\1\u00e5\uffdd\41",
            "\42\41\1\u00e6\uffdd\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\156\41\1\u00eb\uff91\41",
            "\42\41\1\u00ec\uffdd\41",
            "",
            "\42\41\1\u00ed\uffdd\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\164\41\1\u00f0\uff8b\41",
            "",
            "",
            "",
            "",
            "\42\41\1\u00f3\uffdd\41",
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
            return "1:1: Tokens : ( Containtment | Attributes | References | Bluetooth | OnlyCodes | Abstract | External | Firebase | Gameloop | Opposite | ReadOnly | Classes | Default | IsParam | Physics | AutoID | Target | IsKey | NoSCN | Name | Type | URI | Max | Min | False | True | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_19 = input.LA(1);

                        s = -1;
                        if ( (LA17_19=='t') ) {s = 53;}

                        else if ( (LA17_19=='b') ) {s = 54;}

                        else if ( (LA17_19=='u') ) {s = 55;}

                        else if ( ((LA17_19>='\u0000' && LA17_19<='a')||(LA17_19>='c' && LA17_19<='s')||(LA17_19>='v' && LA17_19<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_27 = input.LA(1);

                        s = -1;
                        if ( (LA17_27=='s') ) {s = 64;}

                        else if ( ((LA17_27>='\u0000' && LA17_27<='r')||(LA17_27>='t' && LA17_27<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_64 = input.LA(1);

                        s = -1;
                        if ( (LA17_64=='P') ) {s = 89;}

                        else if ( (LA17_64=='K') ) {s = 90;}

                        else if ( ((LA17_64>='\u0000' && LA17_64<='J')||(LA17_64>='L' && LA17_64<='O')||(LA17_64>='Q' && LA17_64<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_51 = input.LA(1);

                        s = -1;
                        if ( (LA17_51=='n') ) {s = 75;}

                        else if ( ((LA17_51>='\u0000' && LA17_51<='m')||(LA17_51>='o' && LA17_51<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_75 = input.LA(1);

                        s = -1;
                        if ( (LA17_75=='t') ) {s = 101;}

                        else if ( ((LA17_75>='\u0000' && LA17_75<='s')||(LA17_75>='u' && LA17_75<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_101 = input.LA(1);

                        s = -1;
                        if ( (LA17_101=='a') ) {s = 127;}

                        else if ( ((LA17_101>='\u0000' && LA17_101<='`')||(LA17_101>='b' && LA17_101<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_127 = input.LA(1);

                        s = -1;
                        if ( (LA17_127=='i') ) {s = 152;}

                        else if ( ((LA17_127>='\u0000' && LA17_127<='h')||(LA17_127>='j' && LA17_127<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_152 = input.LA(1);

                        s = -1;
                        if ( (LA17_152=='n') ) {s = 173;}

                        else if ( ((LA17_152>='\u0000' && LA17_152<='m')||(LA17_152>='o' && LA17_152<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_173 = input.LA(1);

                        s = -1;
                        if ( (LA17_173=='t') ) {s = 192;}

                        else if ( ((LA17_173>='\u0000' && LA17_173<='s')||(LA17_173>='u' && LA17_173<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_192 = input.LA(1);

                        s = -1;
                        if ( (LA17_192=='m') ) {s = 209;}

                        else if ( ((LA17_192>='\u0000' && LA17_192<='l')||(LA17_192>='n' && LA17_192<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_209 = input.LA(1);

                        s = -1;
                        if ( (LA17_209=='e') ) {s = 224;}

                        else if ( ((LA17_209>='\u0000' && LA17_209<='d')||(LA17_209>='f' && LA17_209<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_224 = input.LA(1);

                        s = -1;
                        if ( (LA17_224=='n') ) {s = 235;}

                        else if ( ((LA17_224>='\u0000' && LA17_224<='m')||(LA17_224>='o' && LA17_224<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_235 = input.LA(1);

                        s = -1;
                        if ( (LA17_235=='t') ) {s = 240;}

                        else if ( ((LA17_235>='\u0000' && LA17_235<='s')||(LA17_235>='u' && LA17_235<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_240 = input.LA(1);

                        s = -1;
                        if ( (LA17_240=='\"') ) {s = 243;}

                        else if ( ((LA17_240>='\u0000' && LA17_240<='!')||(LA17_240>='#' && LA17_240<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_53 = input.LA(1);

                        s = -1;
                        if ( (LA17_53=='t') ) {s = 77;}

                        else if ( ((LA17_53>='\u0000' && LA17_53<='s')||(LA17_53>='u' && LA17_53<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_77 = input.LA(1);

                        s = -1;
                        if ( (LA17_77=='r') ) {s = 103;}

                        else if ( ((LA17_77>='\u0000' && LA17_77<='q')||(LA17_77>='s' && LA17_77<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_103 = input.LA(1);

                        s = -1;
                        if ( (LA17_103=='i') ) {s = 129;}

                        else if ( ((LA17_103>='\u0000' && LA17_103<='h')||(LA17_103>='j' && LA17_103<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_129 = input.LA(1);

                        s = -1;
                        if ( (LA17_129=='b') ) {s = 154;}

                        else if ( ((LA17_129>='\u0000' && LA17_129<='a')||(LA17_129>='c' && LA17_129<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_154 = input.LA(1);

                        s = -1;
                        if ( (LA17_154=='u') ) {s = 175;}

                        else if ( ((LA17_154>='\u0000' && LA17_154<='t')||(LA17_154>='v' && LA17_154<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_175 = input.LA(1);

                        s = -1;
                        if ( (LA17_175=='t') ) {s = 194;}

                        else if ( ((LA17_175>='\u0000' && LA17_175<='s')||(LA17_175>='u' && LA17_175<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA17_194 = input.LA(1);

                        s = -1;
                        if ( (LA17_194=='e') ) {s = 211;}

                        else if ( ((LA17_194>='\u0000' && LA17_194<='d')||(LA17_194>='f' && LA17_194<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA17_211 = input.LA(1);

                        s = -1;
                        if ( (LA17_211=='s') ) {s = 225;}

                        else if ( ((LA17_211>='\u0000' && LA17_211<='r')||(LA17_211>='t' && LA17_211<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA17_225 = input.LA(1);

                        s = -1;
                        if ( (LA17_225=='\"') ) {s = 236;}

                        else if ( ((LA17_225>='\u0000' && LA17_225<='!')||(LA17_225>='#' && LA17_225<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA17_80 = input.LA(1);

                        s = -1;
                        if ( (LA17_80=='e') ) {s = 106;}

                        else if ( ((LA17_80>='\u0000' && LA17_80<='d')||(LA17_80>='f' && LA17_80<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA17_106 = input.LA(1);

                        s = -1;
                        if ( (LA17_106=='r') ) {s = 132;}

                        else if ( ((LA17_106>='\u0000' && LA17_106<='q')||(LA17_106>='s' && LA17_106<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA17_132 = input.LA(1);

                        s = -1;
                        if ( (LA17_132=='e') ) {s = 157;}

                        else if ( ((LA17_132>='\u0000' && LA17_132<='d')||(LA17_132>='f' && LA17_132<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA17_157 = input.LA(1);

                        s = -1;
                        if ( (LA17_157=='n') ) {s = 178;}

                        else if ( ((LA17_157>='\u0000' && LA17_157<='m')||(LA17_157>='o' && LA17_157<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA17_178 = input.LA(1);

                        s = -1;
                        if ( (LA17_178=='c') ) {s = 197;}

                        else if ( ((LA17_178>='\u0000' && LA17_178<='b')||(LA17_178>='d' && LA17_178<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA17_29 = input.LA(1);

                        s = -1;
                        if ( (LA17_29=='a') ) {s = 66;}

                        else if ( (LA17_29=='y') ) {s = 67;}

                        else if ( ((LA17_29>='\u0000' && LA17_29<='`')||(LA17_29>='b' && LA17_29<='x')||(LA17_29>='z' && LA17_29<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA17_197 = input.LA(1);

                        s = -1;
                        if ( (LA17_197=='e') ) {s = 213;}

                        else if ( ((LA17_197>='\u0000' && LA17_197<='d')||(LA17_197>='f' && LA17_197<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA17_213 = input.LA(1);

                        s = -1;
                        if ( (LA17_213=='s') ) {s = 227;}

                        else if ( ((LA17_213>='\u0000' && LA17_213<='r')||(LA17_213>='t' && LA17_213<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA17_227 = input.LA(1);

                        s = -1;
                        if ( (LA17_227=='\"') ) {s = 237;}

                        else if ( ((LA17_227>='\u0000' && LA17_227<='!')||(LA17_227>='#' && LA17_227<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA17_21 = input.LA(1);

                        s = -1;
                        if ( (LA17_21=='l') ) {s = 57;}

                        else if ( ((LA17_21>='\u0000' && LA17_21<='k')||(LA17_21>='m' && LA17_21<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA17_57 = input.LA(1);

                        s = -1;
                        if ( (LA17_57=='u') ) {s = 82;}

                        else if ( ((LA17_57>='\u0000' && LA17_57<='t')||(LA17_57>='v' && LA17_57<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA17_82 = input.LA(1);

                        s = -1;
                        if ( (LA17_82=='e') ) {s = 108;}

                        else if ( ((LA17_82>='\u0000' && LA17_82<='d')||(LA17_82>='f' && LA17_82<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA17_108 = input.LA(1);

                        s = -1;
                        if ( (LA17_108=='t') ) {s = 134;}

                        else if ( ((LA17_108>='\u0000' && LA17_108<='s')||(LA17_108>='u' && LA17_108<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA17_30 = input.LA(1);

                        s = -1;
                        if ( (LA17_30=='o') ) {s = 68;}

                        else if ( (LA17_30=='a') ) {s = 69;}

                        else if ( ((LA17_30>='\u0000' && LA17_30<='`')||(LA17_30>='b' && LA17_30<='n')||(LA17_30>='p' && LA17_30<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA17_134 = input.LA(1);

                        s = -1;
                        if ( (LA17_134=='o') ) {s = 159;}

                        else if ( ((LA17_134>='\u0000' && LA17_134<='n')||(LA17_134>='p' && LA17_134<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA17_159 = input.LA(1);

                        s = -1;
                        if ( (LA17_159=='o') ) {s = 180;}

                        else if ( ((LA17_159>='\u0000' && LA17_159<='n')||(LA17_159>='p' && LA17_159<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA17_180 = input.LA(1);

                        s = -1;
                        if ( (LA17_180=='t') ) {s = 199;}

                        else if ( ((LA17_180>='\u0000' && LA17_180<='s')||(LA17_180>='u' && LA17_180<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA17_199 = input.LA(1);

                        s = -1;
                        if ( (LA17_199=='h') ) {s = 215;}

                        else if ( ((LA17_199>='\u0000' && LA17_199<='g')||(LA17_199>='i' && LA17_199<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA17_215 = input.LA(1);

                        s = -1;
                        if ( (LA17_215=='\"') ) {s = 229;}

                        else if ( ((LA17_215>='\u0000' && LA17_215<='!')||(LA17_215>='#' && LA17_215<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA17_58 = input.LA(1);

                        s = -1;
                        if ( (LA17_58=='l') ) {s = 83;}

                        else if ( ((LA17_58>='\u0000' && LA17_58<='k')||(LA17_58>='m' && LA17_58<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA17_83 = input.LA(1);

                        s = -1;
                        if ( (LA17_83=='y') ) {s = 109;}

                        else if ( ((LA17_83>='\u0000' && LA17_83<='x')||(LA17_83>='z' && LA17_83<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA17_109 = input.LA(1);

                        s = -1;
                        if ( (LA17_109=='C') ) {s = 135;}

                        else if ( ((LA17_109>='\u0000' && LA17_109<='B')||(LA17_109>='D' && LA17_109<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA17_135 = input.LA(1);

                        s = -1;
                        if ( (LA17_135=='o') ) {s = 160;}

                        else if ( ((LA17_135>='\u0000' && LA17_135<='n')||(LA17_135>='p' && LA17_135<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA17_160 = input.LA(1);

                        s = -1;
                        if ( (LA17_160=='d') ) {s = 181;}

                        else if ( ((LA17_160>='\u0000' && LA17_160<='c')||(LA17_160>='e' && LA17_160<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA17_181 = input.LA(1);

                        s = -1;
                        if ( (LA17_181=='e') ) {s = 200;}

                        else if ( ((LA17_181>='\u0000' && LA17_181<='d')||(LA17_181>='f' && LA17_181<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA17_200 = input.LA(1);

                        s = -1;
                        if ( (LA17_200=='s') ) {s = 216;}

                        else if ( ((LA17_200>='\u0000' && LA17_200<='r')||(LA17_200>='t' && LA17_200<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA17_216 = input.LA(1);

                        s = -1;
                        if ( (LA17_216=='\"') ) {s = 230;}

                        else if ( ((LA17_216>='\u0000' && LA17_216<='!')||(LA17_216>='#' && LA17_216<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA17_54 = input.LA(1);

                        s = -1;
                        if ( (LA17_54=='s') ) {s = 78;}

                        else if ( ((LA17_54>='\u0000' && LA17_54<='r')||(LA17_54>='t' && LA17_54<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA17_78 = input.LA(1);

                        s = -1;
                        if ( (LA17_78=='t') ) {s = 104;}

                        else if ( ((LA17_78>='\u0000' && LA17_78<='s')||(LA17_78>='u' && LA17_78<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA17_104 = input.LA(1);

                        s = -1;
                        if ( (LA17_104=='r') ) {s = 130;}

                        else if ( ((LA17_104>='\u0000' && LA17_104<='q')||(LA17_104>='s' && LA17_104<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA17_130 = input.LA(1);

                        s = -1;
                        if ( (LA17_130=='a') ) {s = 155;}

                        else if ( ((LA17_130>='\u0000' && LA17_130<='`')||(LA17_130>='b' && LA17_130<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA17_155 = input.LA(1);

                        s = -1;
                        if ( (LA17_155=='c') ) {s = 176;}

                        else if ( ((LA17_155>='\u0000' && LA17_155<='b')||(LA17_155>='d' && LA17_155<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA17_176 = input.LA(1);

                        s = -1;
                        if ( (LA17_176=='t') ) {s = 195;}

                        else if ( ((LA17_176>='\u0000' && LA17_176<='s')||(LA17_176>='u' && LA17_176<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA17_195 = input.LA(1);

                        s = -1;
                        if ( (LA17_195=='\"') ) {s = 212;}

                        else if ( ((LA17_195>='\u0000' && LA17_195<='!')||(LA17_195>='#' && LA17_195<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA17_23 = input.LA(1);

                        s = -1;
                        if ( (LA17_23=='x') ) {s = 60;}

                        else if ( ((LA17_23>='\u0000' && LA17_23<='w')||(LA17_23>='y' && LA17_23<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA17_60 = input.LA(1);

                        s = -1;
                        if ( (LA17_60=='t') ) {s = 85;}

                        else if ( ((LA17_60>='\u0000' && LA17_60<='s')||(LA17_60>='u' && LA17_60<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA17_85 = input.LA(1);

                        s = -1;
                        if ( (LA17_85=='e') ) {s = 111;}

                        else if ( ((LA17_85>='\u0000' && LA17_85<='d')||(LA17_85>='f' && LA17_85<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA17_111 = input.LA(1);

                        s = -1;
                        if ( (LA17_111=='r') ) {s = 137;}

                        else if ( ((LA17_111>='\u0000' && LA17_111<='q')||(LA17_111>='s' && LA17_111<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA17_137 = input.LA(1);

                        s = -1;
                        if ( (LA17_137=='n') ) {s = 162;}

                        else if ( ((LA17_137>='\u0000' && LA17_137<='m')||(LA17_137>='o' && LA17_137<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA17_162 = input.LA(1);

                        s = -1;
                        if ( (LA17_162=='a') ) {s = 183;}

                        else if ( ((LA17_162>='\u0000' && LA17_162<='`')||(LA17_162>='b' && LA17_162<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA17_183 = input.LA(1);

                        s = -1;
                        if ( (LA17_183=='l') ) {s = 202;}

                        else if ( ((LA17_183>='\u0000' && LA17_183<='k')||(LA17_183>='m' && LA17_183<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA17_202 = input.LA(1);

                        s = -1;
                        if ( (LA17_202=='\"') ) {s = 218;}

                        else if ( ((LA17_202>='\u0000' && LA17_202<='!')||(LA17_202>='#' && LA17_202<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA17_24 = input.LA(1);

                        s = -1;
                        if ( (LA17_24=='i') ) {s = 61;}

                        else if ( ((LA17_24>='\u0000' && LA17_24<='h')||(LA17_24>='j' && LA17_24<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA17_61 = input.LA(1);

                        s = -1;
                        if ( (LA17_61=='r') ) {s = 86;}

                        else if ( ((LA17_61>='\u0000' && LA17_61<='q')||(LA17_61>='s' && LA17_61<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA17_86 = input.LA(1);

                        s = -1;
                        if ( (LA17_86=='e') ) {s = 112;}

                        else if ( ((LA17_86>='\u0000' && LA17_86<='d')||(LA17_86>='f' && LA17_86<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA17_112 = input.LA(1);

                        s = -1;
                        if ( (LA17_112=='b') ) {s = 138;}

                        else if ( ((LA17_112>='\u0000' && LA17_112<='a')||(LA17_112>='c' && LA17_112<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA17_138 = input.LA(1);

                        s = -1;
                        if ( (LA17_138=='a') ) {s = 163;}

                        else if ( ((LA17_138>='\u0000' && LA17_138<='`')||(LA17_138>='b' && LA17_138<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA17_163 = input.LA(1);

                        s = -1;
                        if ( (LA17_163=='s') ) {s = 184;}

                        else if ( ((LA17_163>='\u0000' && LA17_163<='r')||(LA17_163>='t' && LA17_163<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA17_184 = input.LA(1);

                        s = -1;
                        if ( (LA17_184=='e') ) {s = 203;}

                        else if ( ((LA17_184>='\u0000' && LA17_184<='d')||(LA17_184>='f' && LA17_184<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA17_203 = input.LA(1);

                        s = -1;
                        if ( (LA17_203=='\"') ) {s = 219;}

                        else if ( ((LA17_203>='\u0000' && LA17_203<='!')||(LA17_203>='#' && LA17_203<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA17_25 = input.LA(1);

                        s = -1;
                        if ( (LA17_25=='a') ) {s = 62;}

                        else if ( ((LA17_25>='\u0000' && LA17_25<='`')||(LA17_25>='b' && LA17_25<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA17_62 = input.LA(1);

                        s = -1;
                        if ( (LA17_62=='m') ) {s = 87;}

                        else if ( ((LA17_62>='\u0000' && LA17_62<='l')||(LA17_62>='n' && LA17_62<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA17_87 = input.LA(1);

                        s = -1;
                        if ( (LA17_87=='e') ) {s = 113;}

                        else if ( ((LA17_87>='\u0000' && LA17_87<='d')||(LA17_87>='f' && LA17_87<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA17_113 = input.LA(1);

                        s = -1;
                        if ( (LA17_113=='l') ) {s = 139;}

                        else if ( ((LA17_113>='\u0000' && LA17_113<='k')||(LA17_113>='m' && LA17_113<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='\"') ) {s = 1;}

                        else if ( (LA17_0=='f') ) {s = 2;}

                        else if ( (LA17_0=='t') ) {s = 3;}

                        else if ( (LA17_0==',') ) {s = 4;}

                        else if ( (LA17_0==':') ) {s = 5;}

                        else if ( (LA17_0=='[') ) {s = 6;}

                        else if ( (LA17_0==']') ) {s = 7;}

                        else if ( (LA17_0=='{') ) {s = 8;}

                        else if ( (LA17_0=='}') ) {s = 9;}

                        else if ( (LA17_0=='-') ) {s = 10;}

                        else if ( (LA17_0=='0') ) {s = 11;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 12;}

                        else if ( (LA17_0=='^') ) {s = 13;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='e')||(LA17_0>='g' && LA17_0<='s')||(LA17_0>='u' && LA17_0<='z')) ) {s = 14;}

                        else if ( (LA17_0=='/') ) {s = 15;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 16;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='+')||LA17_0=='.'||(LA17_0>=';' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA17_139 = input.LA(1);

                        s = -1;
                        if ( (LA17_139=='o') ) {s = 164;}

                        else if ( ((LA17_139>='\u0000' && LA17_139<='n')||(LA17_139>='p' && LA17_139<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA17_164 = input.LA(1);

                        s = -1;
                        if ( (LA17_164=='o') ) {s = 185;}

                        else if ( ((LA17_164>='\u0000' && LA17_164<='n')||(LA17_164>='p' && LA17_164<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA17_185 = input.LA(1);

                        s = -1;
                        if ( (LA17_185=='p') ) {s = 204;}

                        else if ( ((LA17_185>='\u0000' && LA17_185<='o')||(LA17_185>='q' && LA17_185<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA17_32 = input.LA(1);

                        s = -1;
                        if ( (LA17_32=='a') ) {s = 71;}

                        else if ( (LA17_32=='i') ) {s = 72;}

                        else if ( ((LA17_32>='\u0000' && LA17_32<='`')||(LA17_32>='b' && LA17_32<='h')||(LA17_32>='j' && LA17_32<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA17_204 = input.LA(1);

                        s = -1;
                        if ( (LA17_204=='\"') ) {s = 220;}

                        else if ( ((LA17_204>='\u0000' && LA17_204<='!')||(LA17_204>='#' && LA17_204<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA17_59 = input.LA(1);

                        s = -1;
                        if ( (LA17_59=='p') ) {s = 84;}

                        else if ( ((LA17_59>='\u0000' && LA17_59<='o')||(LA17_59>='q' && LA17_59<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA17_84 = input.LA(1);

                        s = -1;
                        if ( (LA17_84=='o') ) {s = 110;}

                        else if ( ((LA17_84>='\u0000' && LA17_84<='n')||(LA17_84>='p' && LA17_84<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA17_110 = input.LA(1);

                        s = -1;
                        if ( (LA17_110=='s') ) {s = 136;}

                        else if ( ((LA17_110>='\u0000' && LA17_110<='r')||(LA17_110>='t' && LA17_110<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA17_136 = input.LA(1);

                        s = -1;
                        if ( (LA17_136=='i') ) {s = 161;}

                        else if ( ((LA17_136>='\u0000' && LA17_136<='h')||(LA17_136>='j' && LA17_136<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA17_161 = input.LA(1);

                        s = -1;
                        if ( (LA17_161=='t') ) {s = 182;}

                        else if ( ((LA17_161>='\u0000' && LA17_161<='s')||(LA17_161>='u' && LA17_161<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA17_182 = input.LA(1);

                        s = -1;
                        if ( (LA17_182=='e') ) {s = 201;}

                        else if ( ((LA17_182>='\u0000' && LA17_182<='d')||(LA17_182>='f' && LA17_182<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA17_201 = input.LA(1);

                        s = -1;
                        if ( (LA17_201=='\"') ) {s = 217;}

                        else if ( ((LA17_201>='\u0000' && LA17_201<='!')||(LA17_201>='#' && LA17_201<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA17_81 = input.LA(1);

                        s = -1;
                        if ( (LA17_81=='d') ) {s = 107;}

                        else if ( ((LA17_81>='\u0000' && LA17_81<='c')||(LA17_81>='e' && LA17_81<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA17_107 = input.LA(1);

                        s = -1;
                        if ( (LA17_107=='O') ) {s = 133;}

                        else if ( ((LA17_107>='\u0000' && LA17_107<='N')||(LA17_107>='P' && LA17_107<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA17_133 = input.LA(1);

                        s = -1;
                        if ( (LA17_133=='n') ) {s = 158;}

                        else if ( ((LA17_133>='\u0000' && LA17_133<='m')||(LA17_133>='o' && LA17_133<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA17_158 = input.LA(1);

                        s = -1;
                        if ( (LA17_158=='l') ) {s = 179;}

                        else if ( ((LA17_158>='\u0000' && LA17_158<='k')||(LA17_158>='m' && LA17_158<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA17_179 = input.LA(1);

                        s = -1;
                        if ( (LA17_179=='y') ) {s = 198;}

                        else if ( ((LA17_179>='\u0000' && LA17_179<='x')||(LA17_179>='z' && LA17_179<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA17_198 = input.LA(1);

                        s = -1;
                        if ( (LA17_198=='\"') ) {s = 214;}

                        else if ( ((LA17_198>='\u0000' && LA17_198<='!')||(LA17_198>='#' && LA17_198<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA17_52 = input.LA(1);

                        s = -1;
                        if ( (LA17_52=='a') ) {s = 76;}

                        else if ( ((LA17_52>='\u0000' && LA17_52<='`')||(LA17_52>='b' && LA17_52<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA17_76 = input.LA(1);

                        s = -1;
                        if ( (LA17_76=='s') ) {s = 102;}

                        else if ( ((LA17_76>='\u0000' && LA17_76<='r')||(LA17_76>='t' && LA17_76<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA17_102 = input.LA(1);

                        s = -1;
                        if ( (LA17_102=='s') ) {s = 128;}

                        else if ( ((LA17_102>='\u0000' && LA17_102<='r')||(LA17_102>='t' && LA17_102<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA17_128 = input.LA(1);

                        s = -1;
                        if ( (LA17_128=='e') ) {s = 153;}

                        else if ( ((LA17_128>='\u0000' && LA17_128<='d')||(LA17_128>='f' && LA17_128<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA17_153 = input.LA(1);

                        s = -1;
                        if ( (LA17_153=='s') ) {s = 174;}

                        else if ( ((LA17_153>='\u0000' && LA17_153<='r')||(LA17_153>='t' && LA17_153<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA17_174 = input.LA(1);

                        s = -1;
                        if ( (LA17_174=='\"') ) {s = 193;}

                        else if ( ((LA17_174>='\u0000' && LA17_174<='!')||(LA17_174>='#' && LA17_174<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA17_26 = input.LA(1);

                        s = -1;
                        if ( (LA17_26=='e') ) {s = 63;}

                        else if ( ((LA17_26>='\u0000' && LA17_26<='d')||(LA17_26>='f' && LA17_26<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA17_63 = input.LA(1);

                        s = -1;
                        if ( (LA17_63=='f') ) {s = 88;}

                        else if ( ((LA17_63>='\u0000' && LA17_63<='e')||(LA17_63>='g' && LA17_63<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA17_88 = input.LA(1);

                        s = -1;
                        if ( (LA17_88=='a') ) {s = 114;}

                        else if ( ((LA17_88>='\u0000' && LA17_88<='`')||(LA17_88>='b' && LA17_88<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA17_114 = input.LA(1);

                        s = -1;
                        if ( (LA17_114=='u') ) {s = 140;}

                        else if ( ((LA17_114>='\u0000' && LA17_114<='t')||(LA17_114>='v' && LA17_114<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA17_140 = input.LA(1);

                        s = -1;
                        if ( (LA17_140=='l') ) {s = 165;}

                        else if ( ((LA17_140>='\u0000' && LA17_140<='k')||(LA17_140>='m' && LA17_140<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA17_165 = input.LA(1);

                        s = -1;
                        if ( (LA17_165=='t') ) {s = 186;}

                        else if ( ((LA17_165>='\u0000' && LA17_165<='s')||(LA17_165>='u' && LA17_165<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA17_186 = input.LA(1);

                        s = -1;
                        if ( (LA17_186=='\"') ) {s = 205;}

                        else if ( ((LA17_186>='\u0000' && LA17_186<='!')||(LA17_186>='#' && LA17_186<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA17_89 = input.LA(1);

                        s = -1;
                        if ( (LA17_89=='a') ) {s = 115;}

                        else if ( ((LA17_89>='\u0000' && LA17_89<='`')||(LA17_89>='b' && LA17_89<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA17_115 = input.LA(1);

                        s = -1;
                        if ( (LA17_115=='r') ) {s = 141;}

                        else if ( ((LA17_115>='\u0000' && LA17_115<='q')||(LA17_115>='s' && LA17_115<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA17_141 = input.LA(1);

                        s = -1;
                        if ( (LA17_141=='a') ) {s = 166;}

                        else if ( ((LA17_141>='\u0000' && LA17_141<='`')||(LA17_141>='b' && LA17_141<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA17_166 = input.LA(1);

                        s = -1;
                        if ( (LA17_166=='m') ) {s = 187;}

                        else if ( ((LA17_166>='\u0000' && LA17_166<='l')||(LA17_166>='n' && LA17_166<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA17_187 = input.LA(1);

                        s = -1;
                        if ( (LA17_187=='\"') ) {s = 206;}

                        else if ( ((LA17_187>='\u0000' && LA17_187<='!')||(LA17_187>='#' && LA17_187<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA17_28 = input.LA(1);

                        s = -1;
                        if ( (LA17_28=='h') ) {s = 65;}

                        else if ( ((LA17_28>='\u0000' && LA17_28<='g')||(LA17_28>='i' && LA17_28<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA17_65 = input.LA(1);

                        s = -1;
                        if ( (LA17_65=='y') ) {s = 91;}

                        else if ( ((LA17_65>='\u0000' && LA17_65<='x')||(LA17_65>='z' && LA17_65<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA17_91 = input.LA(1);

                        s = -1;
                        if ( (LA17_91=='s') ) {s = 117;}

                        else if ( ((LA17_91>='\u0000' && LA17_91<='r')||(LA17_91>='t' && LA17_91<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA17_117 = input.LA(1);

                        s = -1;
                        if ( (LA17_117=='i') ) {s = 143;}

                        else if ( ((LA17_117>='\u0000' && LA17_117<='h')||(LA17_117>='j' && LA17_117<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA17_143 = input.LA(1);

                        s = -1;
                        if ( (LA17_143=='c') ) {s = 168;}

                        else if ( ((LA17_143>='\u0000' && LA17_143<='b')||(LA17_143>='d' && LA17_143<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA17_168 = input.LA(1);

                        s = -1;
                        if ( (LA17_168=='s') ) {s = 189;}

                        else if ( ((LA17_168>='\u0000' && LA17_168<='r')||(LA17_168>='t' && LA17_168<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA17_189 = input.LA(1);

                        s = -1;
                        if ( (LA17_189=='\"') ) {s = 207;}

                        else if ( ((LA17_189>='\u0000' && LA17_189<='!')||(LA17_189>='#' && LA17_189<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA17_55 = input.LA(1);

                        s = -1;
                        if ( (LA17_55=='t') ) {s = 79;}

                        else if ( ((LA17_55>='\u0000' && LA17_55<='s')||(LA17_55>='u' && LA17_55<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA17_79 = input.LA(1);

                        s = -1;
                        if ( (LA17_79=='o') ) {s = 105;}

                        else if ( ((LA17_79>='\u0000' && LA17_79<='n')||(LA17_79>='p' && LA17_79<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA17_105 = input.LA(1);

                        s = -1;
                        if ( (LA17_105=='I') ) {s = 131;}

                        else if ( ((LA17_105>='\u0000' && LA17_105<='H')||(LA17_105>='J' && LA17_105<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA17_131 = input.LA(1);

                        s = -1;
                        if ( (LA17_131=='D') ) {s = 156;}

                        else if ( ((LA17_131>='\u0000' && LA17_131<='C')||(LA17_131>='E' && LA17_131<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA17_156 = input.LA(1);

                        s = -1;
                        if ( (LA17_156=='\"') ) {s = 177;}

                        else if ( ((LA17_156>='\u0000' && LA17_156<='!')||(LA17_156>='#' && LA17_156<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA17_66 = input.LA(1);

                        s = -1;
                        if ( (LA17_66=='r') ) {s = 92;}

                        else if ( ((LA17_66>='\u0000' && LA17_66<='q')||(LA17_66>='s' && LA17_66<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA17_92 = input.LA(1);

                        s = -1;
                        if ( (LA17_92=='g') ) {s = 118;}

                        else if ( ((LA17_92>='\u0000' && LA17_92<='f')||(LA17_92>='h' && LA17_92<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA17_118 = input.LA(1);

                        s = -1;
                        if ( (LA17_118=='e') ) {s = 144;}

                        else if ( ((LA17_118>='\u0000' && LA17_118<='d')||(LA17_118>='f' && LA17_118<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA17_144 = input.LA(1);

                        s = -1;
                        if ( (LA17_144=='t') ) {s = 169;}

                        else if ( ((LA17_144>='\u0000' && LA17_144<='s')||(LA17_144>='u' && LA17_144<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA17_169 = input.LA(1);

                        s = -1;
                        if ( (LA17_169=='\"') ) {s = 190;}

                        else if ( ((LA17_169>='\u0000' && LA17_169<='!')||(LA17_169>='#' && LA17_169<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA17_90 = input.LA(1);

                        s = -1;
                        if ( (LA17_90=='e') ) {s = 116;}

                        else if ( ((LA17_90>='\u0000' && LA17_90<='d')||(LA17_90>='f' && LA17_90<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA17_116 = input.LA(1);

                        s = -1;
                        if ( (LA17_116=='y') ) {s = 142;}

                        else if ( ((LA17_116>='\u0000' && LA17_116<='x')||(LA17_116>='z' && LA17_116<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA17_142 = input.LA(1);

                        s = -1;
                        if ( (LA17_142=='\"') ) {s = 167;}

                        else if ( ((LA17_142>='\u0000' && LA17_142<='!')||(LA17_142>='#' && LA17_142<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA17_68 = input.LA(1);

                        s = -1;
                        if ( (LA17_68=='S') ) {s = 94;}

                        else if ( ((LA17_68>='\u0000' && LA17_68<='R')||(LA17_68>='T' && LA17_68<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA17_94 = input.LA(1);

                        s = -1;
                        if ( (LA17_94=='C') ) {s = 120;}

                        else if ( ((LA17_94>='\u0000' && LA17_94<='B')||(LA17_94>='D' && LA17_94<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA17_120 = input.LA(1);

                        s = -1;
                        if ( (LA17_120=='N') ) {s = 146;}

                        else if ( ((LA17_120>='\u0000' && LA17_120<='M')||(LA17_120>='O' && LA17_120<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA17_146 = input.LA(1);

                        s = -1;
                        if ( (LA17_146=='\"') ) {s = 171;}

                        else if ( ((LA17_146>='\u0000' && LA17_146<='!')||(LA17_146>='#' && LA17_146<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA17_18 = input.LA(1);

                        s = -1;
                        if ( (LA17_18=='o') ) {s = 51;}

                        else if ( (LA17_18=='l') ) {s = 52;}

                        else if ( ((LA17_18>='\u0000' && LA17_18<='k')||(LA17_18>='m' && LA17_18<='n')||(LA17_18>='p' && LA17_18<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA17_69 = input.LA(1);

                        s = -1;
                        if ( (LA17_69=='m') ) {s = 95;}

                        else if ( ((LA17_69>='\u0000' && LA17_69<='l')||(LA17_69>='n' && LA17_69<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA17_95 = input.LA(1);

                        s = -1;
                        if ( (LA17_95=='e') ) {s = 121;}

                        else if ( ((LA17_95>='\u0000' && LA17_95<='d')||(LA17_95>='f' && LA17_95<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA17_121 = input.LA(1);

                        s = -1;
                        if ( (LA17_121=='\"') ) {s = 147;}

                        else if ( ((LA17_121>='\u0000' && LA17_121<='!')||(LA17_121>='#' && LA17_121<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA17_67 = input.LA(1);

                        s = -1;
                        if ( (LA17_67=='p') ) {s = 93;}

                        else if ( ((LA17_67>='\u0000' && LA17_67<='o')||(LA17_67>='q' && LA17_67<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA17_93 = input.LA(1);

                        s = -1;
                        if ( (LA17_93=='e') ) {s = 119;}

                        else if ( ((LA17_93>='\u0000' && LA17_93<='d')||(LA17_93>='f' && LA17_93<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA17_119 = input.LA(1);

                        s = -1;
                        if ( (LA17_119=='\"') ) {s = 145;}

                        else if ( ((LA17_119>='\u0000' && LA17_119<='!')||(LA17_119>='#' && LA17_119<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA17_20 = input.LA(1);

                        s = -1;
                        if ( (LA17_20=='e') ) {s = 56;}

                        else if ( ((LA17_20>='\u0000' && LA17_20<='d')||(LA17_20>='f' && LA17_20<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA17_31 = input.LA(1);

                        s = -1;
                        if ( (LA17_31=='R') ) {s = 70;}

                        else if ( ((LA17_31>='\u0000' && LA17_31<='Q')||(LA17_31>='S' && LA17_31<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA17_56 = input.LA(1);

                        s = -1;
                        if ( (LA17_56=='f') ) {s = 80;}

                        else if ( (LA17_56=='a') ) {s = 81;}

                        else if ( ((LA17_56>='\u0000' && LA17_56<='`')||(LA17_56>='b' && LA17_56<='e')||(LA17_56>='g' && LA17_56<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA17_70 = input.LA(1);

                        s = -1;
                        if ( (LA17_70=='I') ) {s = 96;}

                        else if ( ((LA17_70>='\u0000' && LA17_70<='H')||(LA17_70>='J' && LA17_70<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA17_96 = input.LA(1);

                        s = -1;
                        if ( (LA17_96=='\"') ) {s = 122;}

                        else if ( ((LA17_96>='\u0000' && LA17_96<='!')||(LA17_96>='#' && LA17_96<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA17_71 = input.LA(1);

                        s = -1;
                        if ( (LA17_71=='x') ) {s = 97;}

                        else if ( ((LA17_71>='\u0000' && LA17_71<='w')||(LA17_71>='y' && LA17_71<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA17_97 = input.LA(1);

                        s = -1;
                        if ( (LA17_97=='\"') ) {s = 123;}

                        else if ( ((LA17_97>='\u0000' && LA17_97<='!')||(LA17_97>='#' && LA17_97<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA17_22 = input.LA(1);

                        s = -1;
                        if ( (LA17_22=='n') ) {s = 58;}

                        else if ( (LA17_22=='p') ) {s = 59;}

                        else if ( ((LA17_22>='\u0000' && LA17_22<='m')||LA17_22=='o'||(LA17_22>='q' && LA17_22<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA17_72 = input.LA(1);

                        s = -1;
                        if ( (LA17_72=='n') ) {s = 98;}

                        else if ( ((LA17_72>='\u0000' && LA17_72<='m')||(LA17_72>='o' && LA17_72<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA17_98 = input.LA(1);

                        s = -1;
                        if ( (LA17_98=='\"') ) {s = 124;}

                        else if ( ((LA17_98>='\u0000' && LA17_98<='!')||(LA17_98>='#' && LA17_98<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA17_1 = input.LA(1);

                        s = -1;
                        if ( (LA17_1=='c') ) {s = 18;}

                        else if ( (LA17_1=='a') ) {s = 19;}

                        else if ( (LA17_1=='r') ) {s = 20;}

                        else if ( (LA17_1=='b') ) {s = 21;}

                        else if ( (LA17_1=='o') ) {s = 22;}

                        else if ( (LA17_1=='e') ) {s = 23;}

                        else if ( (LA17_1=='f') ) {s = 24;}

                        else if ( (LA17_1=='g') ) {s = 25;}

                        else if ( (LA17_1=='d') ) {s = 26;}

                        else if ( (LA17_1=='i') ) {s = 27;}

                        else if ( (LA17_1=='p') ) {s = 28;}

                        else if ( (LA17_1=='t') ) {s = 29;}

                        else if ( (LA17_1=='n') ) {s = 30;}

                        else if ( (LA17_1=='U') ) {s = 31;}

                        else if ( (LA17_1=='m') ) {s = 32;}

                        else if ( ((LA17_1>='\u0000' && LA17_1<='T')||(LA17_1>='V' && LA17_1<='`')||LA17_1=='h'||(LA17_1>='j' && LA17_1<='l')||LA17_1=='q'||LA17_1=='s'||(LA17_1>='u' && LA17_1<='\uFFFF')) ) {s = 33;}

                        else s = 17;

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