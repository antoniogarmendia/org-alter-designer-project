package externals.externals.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import externals.externals.services.ExternalsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExternalsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "APIDescriptions", "Parameters", "JSONPath", "Protocol", "APIAuth", "Outputs", "Paths", "Route", "Name", "Type", "Key", "Url", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalExternalsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExternalsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExternalsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExternalsParser.g"; }



     	private ExternalsGrammarAccess grammarAccess;

        public InternalExternalsParser(TokenStream input, ExternalsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ExternalsRoot";
       	}

       	@Override
       	protected ExternalsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExternalsRoot"
    // InternalExternalsParser.g:57:1: entryRuleExternalsRoot returns [EObject current=null] : iv_ruleExternalsRoot= ruleExternalsRoot EOF ;
    public final EObject entryRuleExternalsRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRoot = null;


        try {
            // InternalExternalsParser.g:57:54: (iv_ruleExternalsRoot= ruleExternalsRoot EOF )
            // InternalExternalsParser.g:58:2: iv_ruleExternalsRoot= ruleExternalsRoot EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRoot=ruleExternalsRoot();

            state._fsp--;

             current =iv_ruleExternalsRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRoot"


    // $ANTLR start "ruleExternalsRoot"
    // InternalExternalsParser.g:64:1: ruleExternalsRoot returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleExternalsRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_externalsRoot_2_0 = null;

        EObject lv_externalsRoot_4_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:70:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalExternalsParser.g:71:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalExternalsParser.g:71:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalExternalsParser.g:72:3: () otherlv_1= LeftCurlyBracket ( ( (lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalExternalsParser.g:72:3: ()
            // InternalExternalsParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAccess().getExternalsRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalExternalsParser.g:83:3: ( ( (lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==APIDescriptions) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalExternalsParser.g:84:4: ( (lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract ) ) )*
                    {
                    // InternalExternalsParser.g:84:4: ( (lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract ) )
                    // InternalExternalsParser.g:85:5: (lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract )
                    {
                    // InternalExternalsParser.g:85:5: (lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract )
                    // InternalExternalsParser.g:86:6: lv_externalsRoot_2_0= ruleExternalsRootPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAccess().getExternalsRootExternalsRootPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_externalsRoot_2_0=ruleExternalsRootPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootRule());
                    						}
                    						add(
                    							current,
                    							"externalsRoot",
                    							lv_externalsRoot_2_0,
                    							"externals.externals.Externals.ExternalsRootPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:103:4: (otherlv_3= Comma ( (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalExternalsParser.g:104:5: otherlv_3= Comma ( (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalsRootAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalExternalsParser.g:108:5: ( (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract ) )
                    	    // InternalExternalsParser.g:109:6: (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract )
                    	    {
                    	    // InternalExternalsParser.g:109:6: (lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract )
                    	    // InternalExternalsParser.g:110:7: lv_externalsRoot_4_0= ruleExternalsRootPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAccess().getExternalsRootExternalsRootPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_externalsRoot_4_0=ruleExternalsRootPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"externalsRoot",
                    	    								lv_externalsRoot_4_0,
                    	    								"externals.externals.Externals.ExternalsRootPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalsRootAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRoot"


    // $ANTLR start "entryRuleExternalsRootPropertiesAbstract"
    // InternalExternalsParser.g:137:1: entryRuleExternalsRootPropertiesAbstract returns [EObject current=null] : iv_ruleExternalsRootPropertiesAbstract= ruleExternalsRootPropertiesAbstract EOF ;
    public final EObject entryRuleExternalsRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootPropertiesAbstract = null;


        try {
            // InternalExternalsParser.g:137:72: (iv_ruleExternalsRootPropertiesAbstract= ruleExternalsRootPropertiesAbstract EOF )
            // InternalExternalsParser.g:138:2: iv_ruleExternalsRootPropertiesAbstract= ruleExternalsRootPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootPropertiesAbstract=ruleExternalsRootPropertiesAbstract();

            state._fsp--;

             current =iv_ruleExternalsRootPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootPropertiesAbstract"
    // InternalExternalsParser.g:144:1: ruleExternalsRootPropertiesAbstract returns [EObject current=null] : this_ExternalsRootAPIDescriptions_0= ruleExternalsRootAPIDescriptions ;
    public final EObject ruleExternalsRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalsRootAPIDescriptions_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:150:2: (this_ExternalsRootAPIDescriptions_0= ruleExternalsRootAPIDescriptions )
            // InternalExternalsParser.g:151:2: this_ExternalsRootAPIDescriptions_0= ruleExternalsRootAPIDescriptions
            {

            		newCompositeNode(grammarAccess.getExternalsRootPropertiesAbstractAccess().getExternalsRootAPIDescriptionsParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ExternalsRootAPIDescriptions_0=ruleExternalsRootAPIDescriptions();

            state._fsp--;


            		current = this_ExternalsRootAPIDescriptions_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPropertiesAbstract"
    // InternalExternalsParser.g:162:1: entryRuleExternalsRootAPIDescriptionsItemsPropertiesAbstract returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract = null;


        try {
            // InternalExternalsParser.g:162:92: (iv_ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract EOF )
            // InternalExternalsParser.g:163:2: iv_ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract=ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract"
    // InternalExternalsParser.g:169:1: ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract returns [EObject current=null] : (this_ExternalsRootAPIDescriptionsItemsName_0= ruleExternalsRootAPIDescriptionsItemsName | this_ExternalsRootAPIDescriptionsItemsProtocol_1= ruleExternalsRootAPIDescriptionsItemsProtocol | this_ExternalsRootAPIDescriptionsItemsUrl_2= ruleExternalsRootAPIDescriptionsItemsUrl | this_ExternalsRootAPIDescriptionsItemsPaths_3= ruleExternalsRootAPIDescriptionsItemsPaths | this_ExternalsRootAPIDescriptionsItemsAPIAuth_4= ruleExternalsRootAPIDescriptionsItemsAPIAuth ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalsRootAPIDescriptionsItemsName_0 = null;

        EObject this_ExternalsRootAPIDescriptionsItemsProtocol_1 = null;

        EObject this_ExternalsRootAPIDescriptionsItemsUrl_2 = null;

        EObject this_ExternalsRootAPIDescriptionsItemsPaths_3 = null;

        EObject this_ExternalsRootAPIDescriptionsItemsAPIAuth_4 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:175:2: ( (this_ExternalsRootAPIDescriptionsItemsName_0= ruleExternalsRootAPIDescriptionsItemsName | this_ExternalsRootAPIDescriptionsItemsProtocol_1= ruleExternalsRootAPIDescriptionsItemsProtocol | this_ExternalsRootAPIDescriptionsItemsUrl_2= ruleExternalsRootAPIDescriptionsItemsUrl | this_ExternalsRootAPIDescriptionsItemsPaths_3= ruleExternalsRootAPIDescriptionsItemsPaths | this_ExternalsRootAPIDescriptionsItemsAPIAuth_4= ruleExternalsRootAPIDescriptionsItemsAPIAuth ) )
            // InternalExternalsParser.g:176:2: (this_ExternalsRootAPIDescriptionsItemsName_0= ruleExternalsRootAPIDescriptionsItemsName | this_ExternalsRootAPIDescriptionsItemsProtocol_1= ruleExternalsRootAPIDescriptionsItemsProtocol | this_ExternalsRootAPIDescriptionsItemsUrl_2= ruleExternalsRootAPIDescriptionsItemsUrl | this_ExternalsRootAPIDescriptionsItemsPaths_3= ruleExternalsRootAPIDescriptionsItemsPaths | this_ExternalsRootAPIDescriptionsItemsAPIAuth_4= ruleExternalsRootAPIDescriptionsItemsAPIAuth )
            {
            // InternalExternalsParser.g:176:2: (this_ExternalsRootAPIDescriptionsItemsName_0= ruleExternalsRootAPIDescriptionsItemsName | this_ExternalsRootAPIDescriptionsItemsProtocol_1= ruleExternalsRootAPIDescriptionsItemsProtocol | this_ExternalsRootAPIDescriptionsItemsUrl_2= ruleExternalsRootAPIDescriptionsItemsUrl | this_ExternalsRootAPIDescriptionsItemsPaths_3= ruleExternalsRootAPIDescriptionsItemsPaths | this_ExternalsRootAPIDescriptionsItemsAPIAuth_4= ruleExternalsRootAPIDescriptionsItemsAPIAuth )
            int alt3=5;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt3=1;
                }
                break;
            case Protocol:
                {
                alt3=2;
                }
                break;
            case Url:
                {
                alt3=3;
                }
                break;
            case Paths:
                {
                alt3=4;
                }
                break;
            case APIAuth:
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
                    // InternalExternalsParser.g:177:3: this_ExternalsRootAPIDescriptionsItemsName_0= ruleExternalsRootAPIDescriptionsItemsName
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsName_0=ruleExternalsRootAPIDescriptionsItemsName();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:186:3: this_ExternalsRootAPIDescriptionsItemsProtocol_1= ruleExternalsRootAPIDescriptionsItemsProtocol
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsProtocolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsProtocol_1=ruleExternalsRootAPIDescriptionsItemsProtocol();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsProtocol_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExternalsParser.g:195:3: this_ExternalsRootAPIDescriptionsItemsUrl_2= ruleExternalsRootAPIDescriptionsItemsUrl
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsUrlParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsUrl_2=ruleExternalsRootAPIDescriptionsItemsUrl();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsUrl_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalExternalsParser.g:204:3: this_ExternalsRootAPIDescriptionsItemsPaths_3= ruleExternalsRootAPIDescriptionsItemsPaths
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsPaths_3=ruleExternalsRootAPIDescriptionsItemsPaths();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsPaths_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalExternalsParser.g:213:3: this_ExternalsRootAPIDescriptionsItemsAPIAuth_4= ruleExternalsRootAPIDescriptionsItemsAPIAuth
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsAPIAuthParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsAPIAuth_4=ruleExternalsRootAPIDescriptionsItemsAPIAuth();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsAPIAuth_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract"
    // InternalExternalsParser.g:225:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract = null;


        try {
            // InternalExternalsParser.g:225:102: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract EOF )
            // InternalExternalsParser.g:226:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract=ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract"
    // InternalExternalsParser.g:232:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract returns [EObject current=null] : (this_ExternalsRootAPIDescriptionsItemsPathsItemsRoute_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute | this_ExternalsRootAPIDescriptionsItemsPathsItemsParameters_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputs_2= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalsRootAPIDescriptionsItemsPathsItemsRoute_0 = null;

        EObject this_ExternalsRootAPIDescriptionsItemsPathsItemsParameters_1 = null;

        EObject this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputs_2 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:238:2: ( (this_ExternalsRootAPIDescriptionsItemsPathsItemsRoute_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute | this_ExternalsRootAPIDescriptionsItemsPathsItemsParameters_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputs_2= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs ) )
            // InternalExternalsParser.g:239:2: (this_ExternalsRootAPIDescriptionsItemsPathsItemsRoute_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute | this_ExternalsRootAPIDescriptionsItemsPathsItemsParameters_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputs_2= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs )
            {
            // InternalExternalsParser.g:239:2: (this_ExternalsRootAPIDescriptionsItemsPathsItemsRoute_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute | this_ExternalsRootAPIDescriptionsItemsPathsItemsParameters_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputs_2= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs )
            int alt4=3;
            switch ( input.LA(1) ) {
            case Route:
                {
                alt4=1;
                }
                break;
            case Parameters:
                {
                alt4=2;
                }
                break;
            case Outputs:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalExternalsParser.g:240:3: this_ExternalsRootAPIDescriptionsItemsPathsItemsRoute_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsRouteParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsPathsItemsRoute_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsPathsItemsRoute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:249:3: this_ExternalsRootAPIDescriptionsItemsPathsItemsParameters_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsPathsItemsParameters_1=ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsPathsItemsParameters_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExternalsParser.g:258:3: this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputs_2= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputs_2=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputs_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract"
    // InternalExternalsParser.g:270:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract = null;


        try {
            // InternalExternalsParser.g:270:117: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract EOF )
            // InternalExternalsParser.g:271:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract=ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract"
    // InternalExternalsParser.g:277:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract returns [EObject current=null] : (this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName | this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_0 = null;

        EObject this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_1 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:283:2: ( (this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName | this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType ) )
            // InternalExternalsParser.g:284:2: (this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName | this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType )
            {
            // InternalExternalsParser.g:284:2: (this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName | this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Name) ) {
                alt5=1;
            }
            else if ( (LA5_0==Type) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalExternalsParser.g:285:3: this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:294:3: this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_1=ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract"
    // InternalExternalsParser.g:306:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract = null;


        try {
            // InternalExternalsParser.g:306:114: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract EOF )
            // InternalExternalsParser.g:307:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract"
    // InternalExternalsParser.g:313:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract returns [EObject current=null] : (this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_2= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_0 = null;

        EObject this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_1 = null;

        EObject this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_2 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:319:2: ( (this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_2= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath ) )
            // InternalExternalsParser.g:320:2: (this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_2= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath )
            {
            // InternalExternalsParser.g:320:2: (this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType | this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_2= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath )
            int alt6=3;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt6=1;
                }
                break;
            case Type:
                {
                alt6=2;
                }
                break;
            case JSONPath:
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
                    // InternalExternalsParser.g:321:3: this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:330:3: this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_1= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_1=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExternalsParser.g:339:3: this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_2= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_2=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract"
    // InternalExternalsParser.g:351:1: entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract = null;


        try {
            // InternalExternalsParser.g:351:104: (iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract EOF )
            // InternalExternalsParser.g:352:2: iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract=ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract"
    // InternalExternalsParser.g:358:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract returns [EObject current=null] : (this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsName_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName | this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_1= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsName_0 = null;

        EObject this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_1 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:364:2: ( (this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsName_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName | this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_1= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey ) )
            // InternalExternalsParser.g:365:2: (this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsName_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName | this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_1= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey )
            {
            // InternalExternalsParser.g:365:2: (this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsName_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName | this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_1= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Name) ) {
                alt7=1;
            }
            else if ( (LA7_0==Key) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalExternalsParser.g:366:3: this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsName_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsName_0=ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:375:3: this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_1= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey
                    {

                    			newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_1=ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey();

                    state._fsp--;


                    			current = this_ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptions"
    // InternalExternalsParser.g:387:1: entryRuleExternalsRootAPIDescriptions returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptions= ruleExternalsRootAPIDescriptions EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptions = null;


        try {
            // InternalExternalsParser.g:387:69: (iv_ruleExternalsRootAPIDescriptions= ruleExternalsRootAPIDescriptions EOF )
            // InternalExternalsParser.g:388:2: iv_ruleExternalsRootAPIDescriptions= ruleExternalsRootAPIDescriptions EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptions=ruleExternalsRootAPIDescriptions();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptions"


    // $ANTLR start "ruleExternalsRootAPIDescriptions"
    // InternalExternalsParser.g:394:1: ruleExternalsRootAPIDescriptions returns [EObject current=null] : ( () otherlv_1= APIDescriptions otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems ) ) (otherlv_5= Comma ( (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleExternalsRootAPIDescriptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_APIDescriptions_4_0 = null;

        EObject lv_APIDescriptions_6_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:400:2: ( ( () otherlv_1= APIDescriptions otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems ) ) (otherlv_5= Comma ( (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalExternalsParser.g:401:2: ( () otherlv_1= APIDescriptions otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems ) ) (otherlv_5= Comma ( (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalExternalsParser.g:401:2: ( () otherlv_1= APIDescriptions otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems ) ) (otherlv_5= Comma ( (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalExternalsParser.g:402:3: () otherlv_1= APIDescriptions otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems ) ) (otherlv_5= Comma ( (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalExternalsParser.g:402:3: ()
            // InternalExternalsParser.g:403:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsAccess().getExternalsRootAPIDescriptionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,APIDescriptions,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalsRootAPIDescriptionsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalsRootAPIDescriptionsAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalExternalsParser.g:421:3: ( ( (lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems ) ) (otherlv_5= Comma ( (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LeftCurlyBracket) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalExternalsParser.g:422:4: ( (lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems ) ) (otherlv_5= Comma ( (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems ) ) )*
                    {
                    // InternalExternalsParser.g:422:4: ( (lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems ) )
                    // InternalExternalsParser.g:423:5: (lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems )
                    {
                    // InternalExternalsParser.g:423:5: (lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems )
                    // InternalExternalsParser.g:424:6: lv_APIDescriptions_4_0= ruleExternalsRootAPIDescriptionsItems
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsExternalsRootAPIDescriptionsItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_APIDescriptions_4_0=ruleExternalsRootAPIDescriptionsItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsRule());
                    						}
                    						add(
                    							current,
                    							"APIDescriptions",
                    							lv_APIDescriptions_4_0,
                    							"externals.externals.Externals.ExternalsRootAPIDescriptionsItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:441:4: (otherlv_5= Comma ( (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalExternalsParser.g:442:5: otherlv_5= Comma ( (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExternalsRootAPIDescriptionsAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalExternalsParser.g:446:5: ( (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems ) )
                    	    // InternalExternalsParser.g:447:6: (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems )
                    	    {
                    	    // InternalExternalsParser.g:447:6: (lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems )
                    	    // InternalExternalsParser.g:448:7: lv_APIDescriptions_6_0= ruleExternalsRootAPIDescriptionsItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsExternalsRootAPIDescriptionsItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_APIDescriptions_6_0=ruleExternalsRootAPIDescriptionsItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"APIDescriptions",
                    	    								lv_APIDescriptions_6_0,
                    	    								"externals.externals.Externals.ExternalsRootAPIDescriptionsItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalsRootAPIDescriptionsAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptions"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItems"
    // InternalExternalsParser.g:475:1: entryRuleExternalsRootAPIDescriptionsItems returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItems= ruleExternalsRootAPIDescriptionsItems EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItems = null;


        try {
            // InternalExternalsParser.g:475:74: (iv_ruleExternalsRootAPIDescriptionsItems= ruleExternalsRootAPIDescriptionsItems EOF )
            // InternalExternalsParser.g:476:2: iv_ruleExternalsRootAPIDescriptionsItems= ruleExternalsRootAPIDescriptionsItems EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItems=ruleExternalsRootAPIDescriptionsItems();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItems; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItems"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItems"
    // InternalExternalsParser.g:482:1: ruleExternalsRootAPIDescriptionsItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:488:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalExternalsParser.g:489:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalExternalsParser.g:489:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalExternalsParser.g:490:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalExternalsParser.g:490:3: ()
            // InternalExternalsParser.g:491:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getExternalsRootAPIDescriptionsItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalExternalsParser.g:501:3: ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Protocol && LA11_0<=APIAuth)||LA11_0==Paths||LA11_0==Name||LA11_0==Url) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalExternalsParser.g:502:4: ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) )*
                    {
                    // InternalExternalsParser.g:502:4: ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) )
                    // InternalExternalsParser.g:503:5: (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract )
                    {
                    // InternalExternalsParser.g:503:5: (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract )
                    // InternalExternalsParser.g:504:6: lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:521:4: (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalExternalsParser.g:522:5: otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_12); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalExternalsParser.g:526:5: ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) )
                    	    // InternalExternalsParser.g:527:6: (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract )
                    	    {
                    	    // InternalExternalsParser.g:527:6: (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract )
                    	    // InternalExternalsParser.g:528:7: lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItems"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsName"
    // InternalExternalsParser.g:555:1: entryRuleExternalsRootAPIDescriptionsItemsName returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsName= ruleExternalsRootAPIDescriptionsItemsName EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsName = null;


        try {
            // InternalExternalsParser.g:555:78: (iv_ruleExternalsRootAPIDescriptionsItemsName= ruleExternalsRootAPIDescriptionsItemsName EOF )
            // InternalExternalsParser.g:556:2: iv_ruleExternalsRootAPIDescriptionsItemsName= ruleExternalsRootAPIDescriptionsItemsName EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsName=ruleExternalsRootAPIDescriptionsItemsName();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsName"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsName"
    // InternalExternalsParser.g:562:1: ruleExternalsRootAPIDescriptionsItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:568:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:569:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:569:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalExternalsParser.g:570:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalExternalsParser.g:570:3: ()
            // InternalExternalsParser.g:571:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getExternalsRootAPIDescriptionsItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getColonKeyword_2());
            		
            // InternalExternalsParser.g:585:3: ( (lv_name_3_0= ruleEString ) )
            // InternalExternalsParser.g:586:4: (lv_name_3_0= ruleEString )
            {
            // InternalExternalsParser.g:586:4: (lv_name_3_0= ruleEString )
            // InternalExternalsParser.g:587:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsName"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsProtocol"
    // InternalExternalsParser.g:608:1: entryRuleExternalsRootAPIDescriptionsItemsProtocol returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsProtocol= ruleExternalsRootAPIDescriptionsItemsProtocol EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsProtocol = null;


        try {
            // InternalExternalsParser.g:608:82: (iv_ruleExternalsRootAPIDescriptionsItemsProtocol= ruleExternalsRootAPIDescriptionsItemsProtocol EOF )
            // InternalExternalsParser.g:609:2: iv_ruleExternalsRootAPIDescriptionsItemsProtocol= ruleExternalsRootAPIDescriptionsItemsProtocol EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsProtocol=ruleExternalsRootAPIDescriptionsItemsProtocol();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsProtocol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsProtocol"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsProtocol"
    // InternalExternalsParser.g:615:1: ruleExternalsRootAPIDescriptionsItemsProtocol returns [EObject current=null] : (otherlv_0= Protocol otherlv_1= Colon ( (lv_protocol_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_protocol_2_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:621:2: ( (otherlv_0= Protocol otherlv_1= Colon ( (lv_protocol_2_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:622:2: (otherlv_0= Protocol otherlv_1= Colon ( (lv_protocol_2_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:622:2: (otherlv_0= Protocol otherlv_1= Colon ( (lv_protocol_2_0= ruleEString ) ) )
            // InternalExternalsParser.g:623:3: otherlv_0= Protocol otherlv_1= Colon ( (lv_protocol_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Protocol,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getProtocolKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getColonKeyword_1());
            		
            // InternalExternalsParser.g:631:3: ( (lv_protocol_2_0= ruleEString ) )
            // InternalExternalsParser.g:632:4: (lv_protocol_2_0= ruleEString )
            {
            // InternalExternalsParser.g:632:4: (lv_protocol_2_0= ruleEString )
            // InternalExternalsParser.g:633:5: lv_protocol_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getProtocolEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_protocol_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_2_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsProtocol"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsUrl"
    // InternalExternalsParser.g:654:1: entryRuleExternalsRootAPIDescriptionsItemsUrl returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsUrl= ruleExternalsRootAPIDescriptionsItemsUrl EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsUrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsUrl = null;


        try {
            // InternalExternalsParser.g:654:77: (iv_ruleExternalsRootAPIDescriptionsItemsUrl= ruleExternalsRootAPIDescriptionsItemsUrl EOF )
            // InternalExternalsParser.g:655:2: iv_ruleExternalsRootAPIDescriptionsItemsUrl= ruleExternalsRootAPIDescriptionsItemsUrl EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsUrl=ruleExternalsRootAPIDescriptionsItemsUrl();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsUrl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsUrl"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsUrl"
    // InternalExternalsParser.g:661:1: ruleExternalsRootAPIDescriptionsItemsUrl returns [EObject current=null] : (otherlv_0= Url otherlv_1= Colon ( (lv_url_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsUrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_url_2_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:667:2: ( (otherlv_0= Url otherlv_1= Colon ( (lv_url_2_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:668:2: (otherlv_0= Url otherlv_1= Colon ( (lv_url_2_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:668:2: (otherlv_0= Url otherlv_1= Colon ( (lv_url_2_0= ruleEString ) ) )
            // InternalExternalsParser.g:669:3: otherlv_0= Url otherlv_1= Colon ( (lv_url_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Url,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getUrlKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getColonKeyword_1());
            		
            // InternalExternalsParser.g:677:3: ( (lv_url_2_0= ruleEString ) )
            // InternalExternalsParser.g:678:4: (lv_url_2_0= ruleEString )
            {
            // InternalExternalsParser.g:678:4: (lv_url_2_0= ruleEString )
            // InternalExternalsParser.g:679:5: lv_url_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getUrlEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_url_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_2_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsUrl"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPaths"
    // InternalExternalsParser.g:700:1: entryRuleExternalsRootAPIDescriptionsItemsPaths returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPaths= ruleExternalsRootAPIDescriptionsItemsPaths EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPaths() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPaths = null;


        try {
            // InternalExternalsParser.g:700:79: (iv_ruleExternalsRootAPIDescriptionsItemsPaths= ruleExternalsRootAPIDescriptionsItemsPaths EOF )
            // InternalExternalsParser.g:701:2: iv_ruleExternalsRootAPIDescriptionsItemsPaths= ruleExternalsRootAPIDescriptionsItemsPaths EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPaths=ruleExternalsRootAPIDescriptionsItemsPaths();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPaths; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPaths"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPaths"
    // InternalExternalsParser.g:707:1: ruleExternalsRootAPIDescriptionsItemsPaths returns [EObject current=null] : ( () otherlv_1= Paths otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) (otherlv_5= Comma ( (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPaths() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_paths_4_0 = null;

        EObject lv_paths_6_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:713:2: ( ( () otherlv_1= Paths otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) (otherlv_5= Comma ( (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalExternalsParser.g:714:2: ( () otherlv_1= Paths otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) (otherlv_5= Comma ( (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalExternalsParser.g:714:2: ( () otherlv_1= Paths otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) (otherlv_5= Comma ( (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalExternalsParser.g:715:3: () otherlv_1= Paths otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) (otherlv_5= Comma ( (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalExternalsParser.g:715:3: ()
            // InternalExternalsParser.g:716:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getExternalsRootAPIDescriptionsItemsPathsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Paths,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalExternalsParser.g:734:3: ( ( (lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) (otherlv_5= Comma ( (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftCurlyBracket) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalExternalsParser.g:735:4: ( (lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) (otherlv_5= Comma ( (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) )*
                    {
                    // InternalExternalsParser.g:735:4: ( (lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) )
                    // InternalExternalsParser.g:736:5: (lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems )
                    {
                    // InternalExternalsParser.g:736:5: (lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems )
                    // InternalExternalsParser.g:737:6: lv_paths_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItems
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsExternalsRootAPIDescriptionsItemsPathsItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_paths_4_0=ruleExternalsRootAPIDescriptionsItemsPathsItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsRule());
                    						}
                    						add(
                    							current,
                    							"paths",
                    							lv_paths_4_0,
                    							"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:754:4: (otherlv_5= Comma ( (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalExternalsParser.g:755:5: otherlv_5= Comma ( (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalExternalsParser.g:759:5: ( (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems ) )
                    	    // InternalExternalsParser.g:760:6: (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems )
                    	    {
                    	    // InternalExternalsParser.g:760:6: (lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems )
                    	    // InternalExternalsParser.g:761:7: lv_paths_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsExternalsRootAPIDescriptionsItemsPathsItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_paths_6_0=ruleExternalsRootAPIDescriptionsItemsPathsItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"paths",
                    	    								lv_paths_6_0,
                    	    								"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPaths"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsAPIAuth"
    // InternalExternalsParser.g:788:1: entryRuleExternalsRootAPIDescriptionsItemsAPIAuth returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsAPIAuth= ruleExternalsRootAPIDescriptionsItemsAPIAuth EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsAPIAuth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsAPIAuth = null;


        try {
            // InternalExternalsParser.g:788:81: (iv_ruleExternalsRootAPIDescriptionsItemsAPIAuth= ruleExternalsRootAPIDescriptionsItemsAPIAuth EOF )
            // InternalExternalsParser.g:789:2: iv_ruleExternalsRootAPIDescriptionsItemsAPIAuth= ruleExternalsRootAPIDescriptionsItemsAPIAuth EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsAPIAuth=ruleExternalsRootAPIDescriptionsItemsAPIAuth();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsAPIAuth; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsAPIAuth"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsAPIAuth"
    // InternalExternalsParser.g:795:1: ruleExternalsRootAPIDescriptionsItemsAPIAuth returns [EObject current=null] : ( () otherlv_1= APIAuth otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) (otherlv_5= Comma ( (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsAPIAuth() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_APIAuth_4_0 = null;

        EObject lv_APIAuth_6_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:801:2: ( ( () otherlv_1= APIAuth otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) (otherlv_5= Comma ( (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalExternalsParser.g:802:2: ( () otherlv_1= APIAuth otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) (otherlv_5= Comma ( (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalExternalsParser.g:802:2: ( () otherlv_1= APIAuth otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) (otherlv_5= Comma ( (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalExternalsParser.g:803:3: () otherlv_1= APIAuth otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) (otherlv_5= Comma ( (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalExternalsParser.g:803:3: ()
            // InternalExternalsParser.g:804:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getExternalsRootAPIDescriptionsItemsAPIAuthAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,APIAuth,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalExternalsParser.g:822:3: ( ( (lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) (otherlv_5= Comma ( (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftCurlyBracket) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalExternalsParser.g:823:4: ( (lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) (otherlv_5= Comma ( (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) )*
                    {
                    // InternalExternalsParser.g:823:4: ( (lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) )
                    // InternalExternalsParser.g:824:5: (lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems )
                    {
                    // InternalExternalsParser.g:824:5: (lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems )
                    // InternalExternalsParser.g:825:6: lv_APIAuth_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthExternalsRootAPIDescriptionsItemsAPIAuthItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_APIAuth_4_0=ruleExternalsRootAPIDescriptionsItemsAPIAuthItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthRule());
                    						}
                    						add(
                    							current,
                    							"APIAuth",
                    							lv_APIAuth_4_0,
                    							"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:842:4: (otherlv_5= Comma ( (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalExternalsParser.g:843:5: otherlv_5= Comma ( (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalExternalsParser.g:847:5: ( (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) )
                    	    // InternalExternalsParser.g:848:6: (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems )
                    	    {
                    	    // InternalExternalsParser.g:848:6: (lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems )
                    	    // InternalExternalsParser.g:849:7: lv_APIAuth_6_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthExternalsRootAPIDescriptionsItemsAPIAuthItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_APIAuth_6_0=ruleExternalsRootAPIDescriptionsItemsAPIAuthItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"APIAuth",
                    	    								lv_APIAuth_6_0,
                    	    								"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsAPIAuth"


    // $ANTLR start "entryRuleEString"
    // InternalExternalsParser.g:876:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalExternalsParser.g:876:47: (iv_ruleEString= ruleEString EOF )
            // InternalExternalsParser.g:877:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalExternalsParser.g:883:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:889:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalExternalsParser.g:890:2: this_VALID_STRING_0= ruleVALID_STRING
            {

            		newCompositeNode(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_VALID_STRING_0=ruleVALID_STRING();

            state._fsp--;


            		current.merge(this_VALID_STRING_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItems"
    // InternalExternalsParser.g:903:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItems returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItems= ruleExternalsRootAPIDescriptionsItemsPathsItems EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItems = null;


        try {
            // InternalExternalsParser.g:903:84: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItems= ruleExternalsRootAPIDescriptionsItemsPathsItems EOF )
            // InternalExternalsParser.g:904:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItems= ruleExternalsRootAPIDescriptionsItemsPathsItems EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItems=ruleExternalsRootAPIDescriptionsItemsPathsItems();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItems; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItems"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItems"
    // InternalExternalsParser.g:910:1: ruleExternalsRootAPIDescriptionsItemsPathsItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:916:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalExternalsParser.g:917:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalExternalsParser.g:917:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalExternalsParser.g:918:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalExternalsParser.g:918:3: ()
            // InternalExternalsParser.g:919:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalExternalsParser.g:929:3: ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Parameters||LA17_0==Outputs||LA17_0==Route) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalExternalsParser.g:930:4: ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) )*
                    {
                    // InternalExternalsParser.g:930:4: ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) )
                    // InternalExternalsParser.g:931:5: (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract )
                    {
                    // InternalExternalsParser.g:931:5: (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract )
                    // InternalExternalsParser.g:932:6: lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:949:4: (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalExternalsParser.g:950:5: otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_15); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalExternalsParser.g:954:5: ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) )
                    	    // InternalExternalsParser.g:955:6: (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract )
                    	    {
                    	    // InternalExternalsParser.g:955:6: (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract )
                    	    // InternalExternalsParser.g:956:7: lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItems"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsRoute"
    // InternalExternalsParser.g:983:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsRoute returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute= ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute = null;


        try {
            // InternalExternalsParser.g:983:89: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute= ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute EOF )
            // InternalExternalsParser.g:984:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute= ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute=ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsRoute"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute"
    // InternalExternalsParser.g:990:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute returns [EObject current=null] : (otherlv_0= Route otherlv_1= Colon ( (lv_route_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_route_2_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:996:2: ( (otherlv_0= Route otherlv_1= Colon ( (lv_route_2_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:997:2: (otherlv_0= Route otherlv_1= Colon ( (lv_route_2_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:997:2: (otherlv_0= Route otherlv_1= Colon ( (lv_route_2_0= ruleEString ) ) )
            // InternalExternalsParser.g:998:3: otherlv_0= Route otherlv_1= Colon ( (lv_route_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Route,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getRouteKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getColonKeyword_1());
            		
            // InternalExternalsParser.g:1006:3: ( (lv_route_2_0= ruleEString ) )
            // InternalExternalsParser.g:1007:4: (lv_route_2_0= ruleEString )
            {
            // InternalExternalsParser.g:1007:4: (lv_route_2_0= ruleEString )
            // InternalExternalsParser.g:1008:5: lv_route_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getRouteEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_route_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_2_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParameters"
    // InternalExternalsParser.g:1029:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParameters returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters= ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters = null;


        try {
            // InternalExternalsParser.g:1029:94: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters= ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters EOF )
            // InternalExternalsParser.g:1030:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters= ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters=ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParameters"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters"
    // InternalExternalsParser.g:1036:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters returns [EObject current=null] : ( () otherlv_1= Parameters otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1042:2: ( ( () otherlv_1= Parameters otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalExternalsParser.g:1043:2: ( () otherlv_1= Parameters otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalExternalsParser.g:1043:2: ( () otherlv_1= Parameters otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalExternalsParser.g:1044:3: () otherlv_1= Parameters otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalExternalsParser.g:1044:3: ()
            // InternalExternalsParser.g:1045:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Parameters,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalExternalsParser.g:1063:3: ( ( (lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftCurlyBracket) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalExternalsParser.g:1064:4: ( (lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) )*
                    {
                    // InternalExternalsParser.g:1064:4: ( (lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) )
                    // InternalExternalsParser.g:1065:5: (lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems )
                    {
                    // InternalExternalsParser.g:1065:5: (lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems )
                    // InternalExternalsParser.g:1066:6: lv_parameters_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameters_4_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:1083:4: (otherlv_5= Comma ( (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalExternalsParser.g:1084:5: otherlv_5= Comma ( (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalExternalsParser.g:1088:5: ( (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) )
                    	    // InternalExternalsParser.g:1089:6: (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems )
                    	    {
                    	    // InternalExternalsParser.g:1089:6: (lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems )
                    	    // InternalExternalsParser.g:1090:7: lv_parameters_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_parameters_6_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputs"
    // InternalExternalsParser.g:1117:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputs returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs = null;


        try {
            // InternalExternalsParser.g:1117:91: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs EOF )
            // InternalExternalsParser.g:1118:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputs"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs"
    // InternalExternalsParser.g:1124:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs returns [EObject current=null] : ( () otherlv_1= Outputs otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) (otherlv_5= Comma ( (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_outputs_4_0 = null;

        EObject lv_outputs_6_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1130:2: ( ( () otherlv_1= Outputs otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) (otherlv_5= Comma ( (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalExternalsParser.g:1131:2: ( () otherlv_1= Outputs otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) (otherlv_5= Comma ( (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalExternalsParser.g:1131:2: ( () otherlv_1= Outputs otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) (otherlv_5= Comma ( (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalExternalsParser.g:1132:3: () otherlv_1= Outputs otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) (otherlv_5= Comma ( (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalExternalsParser.g:1132:3: ()
            // InternalExternalsParser.g:1133:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Outputs,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalExternalsParser.g:1151:3: ( ( (lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) (otherlv_5= Comma ( (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LeftCurlyBracket) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalExternalsParser.g:1152:4: ( (lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) (otherlv_5= Comma ( (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) )*
                    {
                    // InternalExternalsParser.g:1152:4: ( (lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) )
                    // InternalExternalsParser.g:1153:5: (lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems )
                    {
                    // InternalExternalsParser.g:1153:5: (lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems )
                    // InternalExternalsParser.g:1154:6: lv_outputs_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_outputs_4_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_4_0,
                    							"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:1171:4: (otherlv_5= Comma ( (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Comma) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalExternalsParser.g:1172:5: otherlv_5= Comma ( (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalExternalsParser.g:1176:5: ( (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) )
                    	    // InternalExternalsParser.g:1177:6: (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems )
                    	    {
                    	    // InternalExternalsParser.g:1177:6: (lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems )
                    	    // InternalExternalsParser.g:1178:7: lv_outputs_6_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_outputs_6_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_6_0,
                    	    								"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems"
    // InternalExternalsParser.g:1205:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems = null;


        try {
            // InternalExternalsParser.g:1205:99: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems EOF )
            // InternalExternalsParser.g:1206:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems=ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems"
    // InternalExternalsParser.g:1212:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1218:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalExternalsParser.g:1219:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalExternalsParser.g:1219:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalExternalsParser.g:1220:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalExternalsParser.g:1220:3: ()
            // InternalExternalsParser.g:1221:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalExternalsParser.g:1231:3: ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=Name && LA23_0<=Type)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalExternalsParser.g:1232:4: ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) )*
                    {
                    // InternalExternalsParser.g:1232:4: ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) )
                    // InternalExternalsParser.g:1233:5: (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract )
                    {
                    // InternalExternalsParser.g:1233:5: (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract )
                    // InternalExternalsParser.g:1234:6: lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:1251:4: (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalExternalsParser.g:1252:5: otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_17); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalExternalsParser.g:1256:5: ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) )
                    	    // InternalExternalsParser.g:1257:6: (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract )
                    	    {
                    	    // InternalExternalsParser.g:1257:6: (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract )
                    	    // InternalExternalsParser.g:1258:7: lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName"
    // InternalExternalsParser.g:1285:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName = null;


        try {
            // InternalExternalsParser.g:1285:103: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName EOF )
            // InternalExternalsParser.g:1286:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName=ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName"
    // InternalExternalsParser.g:1292:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1298:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:1299:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:1299:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalExternalsParser.g:1300:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalExternalsParser.g:1300:3: ()
            // InternalExternalsParser.g:1301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getColonKeyword_2());
            		
            // InternalExternalsParser.g:1315:3: ( (lv_name_3_0= ruleEString ) )
            // InternalExternalsParser.g:1316:4: (lv_name_3_0= ruleEString )
            {
            // InternalExternalsParser.g:1316:4: (lv_name_3_0= ruleEString )
            // InternalExternalsParser.g:1317:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType"
    // InternalExternalsParser.g:1338:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType = null;


        try {
            // InternalExternalsParser.g:1338:103: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType EOF )
            // InternalExternalsParser.g:1339:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType= ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType=ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType"
    // InternalExternalsParser.g:1345:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType returns [EObject current=null] : (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1351:2: ( (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:1352:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:1352:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) )
            // InternalExternalsParser.g:1353:3: otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getColonKeyword_1());
            		
            // InternalExternalsParser.g:1361:3: ( (lv_type_2_0= ruleEString ) )
            // InternalExternalsParser.g:1362:4: (lv_type_2_0= ruleEString )
            {
            // InternalExternalsParser.g:1362:4: (lv_type_2_0= ruleEString )
            // InternalExternalsParser.g:1363:5: lv_type_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getTypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems"
    // InternalExternalsParser.g:1384:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems = null;


        try {
            // InternalExternalsParser.g:1384:96: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems EOF )
            // InternalExternalsParser.g:1385:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems"
    // InternalExternalsParser.g:1391:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1397:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalExternalsParser.g:1398:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalExternalsParser.g:1398:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalExternalsParser.g:1399:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalExternalsParser.g:1399:3: ()
            // InternalExternalsParser.g:1400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalExternalsParser.g:1410:3: ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==JSONPath||(LA25_0>=Name && LA25_0<=Type)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalExternalsParser.g:1411:4: ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) )*
                    {
                    // InternalExternalsParser.g:1411:4: ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) )
                    // InternalExternalsParser.g:1412:5: (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract )
                    {
                    // InternalExternalsParser.g:1412:5: (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract )
                    // InternalExternalsParser.g:1413:6: lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:1430:4: (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalExternalsParser.g:1431:5: otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_19); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalExternalsParser.g:1435:5: ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) )
                    	    // InternalExternalsParser.g:1436:6: (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract )
                    	    {
                    	    // InternalExternalsParser.g:1436:6: (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract )
                    	    // InternalExternalsParser.g:1437:7: lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName"
    // InternalExternalsParser.g:1464:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName = null;


        try {
            // InternalExternalsParser.g:1464:100: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName EOF )
            // InternalExternalsParser.g:1465:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName"
    // InternalExternalsParser.g:1471:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1477:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:1478:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:1478:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalExternalsParser.g:1479:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalExternalsParser.g:1479:3: ()
            // InternalExternalsParser.g:1480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getColonKeyword_2());
            		
            // InternalExternalsParser.g:1494:3: ( (lv_name_3_0= ruleEString ) )
            // InternalExternalsParser.g:1495:4: (lv_name_3_0= ruleEString )
            {
            // InternalExternalsParser.g:1495:4: (lv_name_3_0= ruleEString )
            // InternalExternalsParser.g:1496:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType"
    // InternalExternalsParser.g:1517:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType = null;


        try {
            // InternalExternalsParser.g:1517:100: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType EOF )
            // InternalExternalsParser.g:1518:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType"
    // InternalExternalsParser.g:1524:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType returns [EObject current=null] : (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1530:2: ( (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:1531:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:1531:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) )
            // InternalExternalsParser.g:1532:3: otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getColonKeyword_1());
            		
            // InternalExternalsParser.g:1540:3: ( (lv_type_2_0= ruleEString ) )
            // InternalExternalsParser.g:1541:4: (lv_type_2_0= ruleEString )
            {
            // InternalExternalsParser.g:1541:4: (lv_type_2_0= ruleEString )
            // InternalExternalsParser.g:1542:5: lv_type_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getTypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath"
    // InternalExternalsParser.g:1563:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath = null;


        try {
            // InternalExternalsParser.g:1563:104: (iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath EOF )
            // InternalExternalsParser.g:1564:2: iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath= ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath=ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath"
    // InternalExternalsParser.g:1570:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath returns [EObject current=null] : (otherlv_0= JSONPath otherlv_1= Colon ( (lv_JSONPath_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_JSONPath_2_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1576:2: ( (otherlv_0= JSONPath otherlv_1= Colon ( (lv_JSONPath_2_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:1577:2: (otherlv_0= JSONPath otherlv_1= Colon ( (lv_JSONPath_2_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:1577:2: (otherlv_0= JSONPath otherlv_1= Colon ( (lv_JSONPath_2_0= ruleEString ) ) )
            // InternalExternalsParser.g:1578:3: otherlv_0= JSONPath otherlv_1= Colon ( (lv_JSONPath_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,JSONPath,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getJSONPathKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getColonKeyword_1());
            		
            // InternalExternalsParser.g:1586:3: ( (lv_JSONPath_2_0= ruleEString ) )
            // InternalExternalsParser.g:1587:4: (lv_JSONPath_2_0= ruleEString )
            {
            // InternalExternalsParser.g:1587:4: (lv_JSONPath_2_0= ruleEString )
            // InternalExternalsParser.g:1588:5: lv_JSONPath_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getJSONPathEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_JSONPath_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathRule());
            					}
            					set(
            						current,
            						"JSONPath",
            						lv_JSONPath_2_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItems"
    // InternalExternalsParser.g:1609:1: entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItems returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItems= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItems = null;


        try {
            // InternalExternalsParser.g:1609:86: (iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItems= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems EOF )
            // InternalExternalsParser.g:1610:2: iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItems= ruleExternalsRootAPIDescriptionsItemsAPIAuthItems EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItems=ruleExternalsRootAPIDescriptionsItemsAPIAuthItems();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItems; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItems"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsAPIAuthItems"
    // InternalExternalsParser.g:1616:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsAPIAuthItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1622:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalExternalsParser.g:1623:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalExternalsParser.g:1623:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalExternalsParser.g:1624:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalExternalsParser.g:1624:3: ()
            // InternalExternalsParser.g:1625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalExternalsParser.g:1635:3: ( ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Name||LA27_0==Key) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalExternalsParser.g:1636:4: ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) )*
                    {
                    // InternalExternalsParser.g:1636:4: ( (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) )
                    // InternalExternalsParser.g:1637:5: (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract )
                    {
                    // InternalExternalsParser.g:1637:5: (lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract )
                    // InternalExternalsParser.g:1638:6: lv_items_2_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExternalsParser.g:1655:4: (otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==Comma) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalExternalsParser.g:1656:5: otherlv_3= Comma ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_21); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalExternalsParser.g:1660:5: ( (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) )
                    	    // InternalExternalsParser.g:1661:6: (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract )
                    	    {
                    	    // InternalExternalsParser.g:1661:6: (lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract )
                    	    // InternalExternalsParser.g:1662:7: lv_items_4_0= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"externals.externals.Externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsAPIAuthItems"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsName"
    // InternalExternalsParser.g:1689:1: entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsName returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName = null;


        try {
            // InternalExternalsParser.g:1689:90: (iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName EOF )
            // InternalExternalsParser.g:1690:2: iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName=ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsName"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName"
    // InternalExternalsParser.g:1696:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1702:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:1703:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:1703:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalExternalsParser.g:1704:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalExternalsParser.g:1704:3: ()
            // InternalExternalsParser.g:1705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getColonKeyword_2());
            		
            // InternalExternalsParser.g:1719:3: ( (lv_name_3_0= ruleEString ) )
            // InternalExternalsParser.g:1720:4: (lv_name_3_0= ruleEString )
            {
            // InternalExternalsParser.g:1720:4: (lv_name_3_0= ruleEString )
            // InternalExternalsParser.g:1721:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey"
    // InternalExternalsParser.g:1742:1: entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey returns [EObject current=null] : iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey EOF ;
    public final EObject entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey = null;


        try {
            // InternalExternalsParser.g:1742:89: (iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey EOF )
            // InternalExternalsParser.g:1743:2: iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey= ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey EOF
            {
             newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey=ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey();

            state._fsp--;

             current =iv_ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey"
    // InternalExternalsParser.g:1749:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey returns [EObject current=null] : (otherlv_0= Key otherlv_1= Colon ( (lv_key_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_2_0 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1755:2: ( (otherlv_0= Key otherlv_1= Colon ( (lv_key_2_0= ruleEString ) ) ) )
            // InternalExternalsParser.g:1756:2: (otherlv_0= Key otherlv_1= Colon ( (lv_key_2_0= ruleEString ) ) )
            {
            // InternalExternalsParser.g:1756:2: (otherlv_0= Key otherlv_1= Colon ( (lv_key_2_0= ruleEString ) ) )
            // InternalExternalsParser.g:1757:3: otherlv_0= Key otherlv_1= Colon ( (lv_key_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Key,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getKeyKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getColonKeyword_1());
            		
            // InternalExternalsParser.g:1765:3: ( (lv_key_2_0= ruleEString ) )
            // InternalExternalsParser.g:1766:4: (lv_key_2_0= ruleEString )
            {
            // InternalExternalsParser.g:1766:4: (lv_key_2_0= ruleEString )
            // InternalExternalsParser.g:1767:5: lv_key_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getKeyEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_key_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_2_0,
            						"externals.externals.Externals.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalExternalsParser.g:1788:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalExternalsParser.g:1788:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalExternalsParser.g:1789:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
            {
             newCompositeNode(grammarAccess.getVALID_STRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALID_STRING=ruleVALID_STRING();

            state._fsp--;

             current =iv_ruleVALID_STRING.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVALID_STRING"


    // $ANTLR start "ruleVALID_STRING"
    // InternalExternalsParser.g:1795:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalExternalsParser.g:1801:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalExternalsParser.g:1802:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalExternalsParser.g:1802:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=APIDescriptions && LA28_0<=Url)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalExternalsParser.g:1803:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:1811:3: this_KEYWORD_1= ruleKEYWORD
                    {

                    			newCompositeNode(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_1=ruleKEYWORD();

                    state._fsp--;


                    			current.merge(this_KEYWORD_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVALID_STRING"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalExternalsParser.g:1825:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalExternalsParser.g:1825:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalExternalsParser.g:1826:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
             newCompositeNode(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;

             current =iv_ruleKEYWORD.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalExternalsParser.g:1832:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Outputs | kw= JSONPath | kw= Protocol | kw= Route | kw= Paths | kw= Name | kw= APIDescriptions | kw= Type | kw= Parameters | kw= Url | kw= APIAuth | kw= Key ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalExternalsParser.g:1838:2: ( (kw= Outputs | kw= JSONPath | kw= Protocol | kw= Route | kw= Paths | kw= Name | kw= APIDescriptions | kw= Type | kw= Parameters | kw= Url | kw= APIAuth | kw= Key ) )
            // InternalExternalsParser.g:1839:2: (kw= Outputs | kw= JSONPath | kw= Protocol | kw= Route | kw= Paths | kw= Name | kw= APIDescriptions | kw= Type | kw= Parameters | kw= Url | kw= APIAuth | kw= Key )
            {
            // InternalExternalsParser.g:1839:2: (kw= Outputs | kw= JSONPath | kw= Protocol | kw= Route | kw= Paths | kw= Name | kw= APIDescriptions | kw= Type | kw= Parameters | kw= Url | kw= APIAuth | kw= Key )
            int alt29=12;
            switch ( input.LA(1) ) {
            case Outputs:
                {
                alt29=1;
                }
                break;
            case JSONPath:
                {
                alt29=2;
                }
                break;
            case Protocol:
                {
                alt29=3;
                }
                break;
            case Route:
                {
                alt29=4;
                }
                break;
            case Paths:
                {
                alt29=5;
                }
                break;
            case Name:
                {
                alt29=6;
                }
                break;
            case APIDescriptions:
                {
                alt29=7;
                }
                break;
            case Type:
                {
                alt29=8;
                }
                break;
            case Parameters:
                {
                alt29=9;
                }
                break;
            case Url:
                {
                alt29=10;
                }
                break;
            case APIAuth:
                {
                alt29=11;
                }
                break;
            case Key:
                {
                alt29=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalExternalsParser.g:1840:3: kw= Outputs
                    {
                    kw=(Token)match(input,Outputs,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOutputsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:1846:3: kw= JSONPath
                    {
                    kw=(Token)match(input,JSONPath,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getJSONPathKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalExternalsParser.g:1852:3: kw= Protocol
                    {
                    kw=(Token)match(input,Protocol,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getProtocolKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalExternalsParser.g:1858:3: kw= Route
                    {
                    kw=(Token)match(input,Route,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRouteKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalExternalsParser.g:1864:3: kw= Paths
                    {
                    kw=(Token)match(input,Paths,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPathsKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalExternalsParser.g:1870:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalExternalsParser.g:1876:3: kw= APIDescriptions
                    {
                    kw=(Token)match(input,APIDescriptions,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAPIDescriptionsKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalExternalsParser.g:1882:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalExternalsParser.g:1888:3: kw= Parameters
                    {
                    kw=(Token)match(input,Parameters,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getParametersKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalExternalsParser.g:1894:3: kw= Url
                    {
                    kw=(Token)match(input,Url,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getUrlKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalExternalsParser.g:1900:3: kw= APIAuth
                    {
                    kw=(Token)match(input,APIAuth,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAPIAuthKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalExternalsParser.g:1906:3: kw= Key
                    {
                    kw=(Token)match(input,Key,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKeyKeyword_11());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKEYWORD"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000209580L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000009580L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000080FFF0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200A20L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000A20L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000203000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000203040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000205000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000005000L});

}
