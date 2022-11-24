package accesses.accesses.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import accesses.accesses.services.AccessesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAccessesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExternalAccess", "Ontological", "TimeTrigger", "APIOutput", "Classname", "APIInput", "OnAccess", "OnChange", "OnCreate", "OnDelete", "APIBody", "Trigger", "Method", "OnLoad", "OnMove", "Output", "Input", "Value", "Attr", "Auth", "Body", "Name", "Path", "Way", "False", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int OnLoad=17;
    public static final int True=29;
    public static final int Classname=8;
    public static final int False=28;
    public static final int Attr=22;
    public static final int Name=25;
    public static final int Input=20;
    public static final int Trigger=15;
    public static final int APIInput=9;
    public static final int RightSquareBracket=33;
    public static final int Ontological=5;
    public static final int APIBody=14;
    public static final int TimeTrigger=6;
    public static final int RULE_ID=40;
    public static final int ExternalAccess=4;
    public static final int OnChange=11;
    public static final int Method=16;
    public static final int OnAccess=10;
    public static final int RULE_INT=36;
    public static final int Value=21;
    public static final int RULE_ML_COMMENT=41;
    public static final int LeftSquareBracket=32;
    public static final int OnDelete=13;
    public static final int APIOutput=7;
    public static final int RULE_STRING=37;
    public static final int Way=27;
    public static final int RULE_SL_COMMENT=42;
    public static final int Comma=30;
    public static final int Output=19;
    public static final int Auth=23;
    public static final int Colon=31;
    public static final int RightCurlyBracket=35;
    public static final int RULE_E_DOUBLE=39;
    public static final int EOF=-1;
    public static final int Body=24;
    public static final int Path=26;
    public static final int RULE_WS=43;
    public static final int LeftCurlyBracket=34;
    public static final int RULE_E_INT=38;
    public static final int RULE_ANY_OTHER=44;
    public static final int OnCreate=12;
    public static final int OnMove=18;

    // delegates
    // delegators


        public InternalAccessesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAccessesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAccessesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAccessesParser.g"; }



     	private AccessesGrammarAccess grammarAccess;

        public InternalAccessesParser(TokenStream input, AccessesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AccessesRoot";
       	}

       	@Override
       	protected AccessesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAccessesRoot"
    // InternalAccessesParser.g:57:1: entryRuleAccessesRoot returns [EObject current=null] : iv_ruleAccessesRoot= ruleAccessesRoot EOF ;
    public final EObject entryRuleAccessesRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRoot = null;


        try {
            // InternalAccessesParser.g:57:53: (iv_ruleAccessesRoot= ruleAccessesRoot EOF )
            // InternalAccessesParser.g:58:2: iv_ruleAccessesRoot= ruleAccessesRoot EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRoot=ruleAccessesRoot();

            state._fsp--;

             current =iv_ruleAccessesRoot; 
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
    // $ANTLR end "entryRuleAccessesRoot"


    // $ANTLR start "ruleAccessesRoot"
    // InternalAccessesParser.g:64:1: ruleAccessesRoot returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleAccessesRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_accessesRoot_2_0 = null;

        EObject lv_accessesRoot_4_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:70:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalAccessesParser.g:71:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalAccessesParser.g:71:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalAccessesParser.g:72:3: () otherlv_1= LeftCurlyBracket ( ( (lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalAccessesParser.g:72:3: ()
            // InternalAccessesParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootAccess().getAccessesRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAccessesParser.g:83:3: ( ( (lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ExternalAccess) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAccessesParser.g:84:4: ( (lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract ) ) )*
                    {
                    // InternalAccessesParser.g:84:4: ( (lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract ) )
                    // InternalAccessesParser.g:85:5: (lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract )
                    {
                    // InternalAccessesParser.g:85:5: (lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract )
                    // InternalAccessesParser.g:86:6: lv_accessesRoot_2_0= ruleAccessesRootPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getAccessesRootAccess().getAccessesRootAccessesRootPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_accessesRoot_2_0=ruleAccessesRootPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccessesRootRule());
                    						}
                    						add(
                    							current,
                    							"accessesRoot",
                    							lv_accessesRoot_2_0,
                    							"accesses.accesses.Accesses.AccessesRootPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAccessesParser.g:103:4: (otherlv_3= Comma ( (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAccessesParser.g:104:5: otherlv_3= Comma ( (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAccessesRootAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAccessesParser.g:108:5: ( (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract ) )
                    	    // InternalAccessesParser.g:109:6: (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract )
                    	    {
                    	    // InternalAccessesParser.g:109:6: (lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract )
                    	    // InternalAccessesParser.g:110:7: lv_accessesRoot_4_0= ruleAccessesRootPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccessesRootAccess().getAccessesRootAccessesRootPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_accessesRoot_4_0=ruleAccessesRootPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccessesRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"accessesRoot",
                    	    								lv_accessesRoot_4_0,
                    	    								"accesses.accesses.Accesses.AccessesRootPropertiesAbstract");
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

            			newLeafNode(otherlv_5, grammarAccess.getAccessesRootAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAccessesRoot"


    // $ANTLR start "entryRuleAccessesRootPropertiesAbstract"
    // InternalAccessesParser.g:137:1: entryRuleAccessesRootPropertiesAbstract returns [EObject current=null] : iv_ruleAccessesRootPropertiesAbstract= ruleAccessesRootPropertiesAbstract EOF ;
    public final EObject entryRuleAccessesRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootPropertiesAbstract = null;


        try {
            // InternalAccessesParser.g:137:71: (iv_ruleAccessesRootPropertiesAbstract= ruleAccessesRootPropertiesAbstract EOF )
            // InternalAccessesParser.g:138:2: iv_ruleAccessesRootPropertiesAbstract= ruleAccessesRootPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootPropertiesAbstract=ruleAccessesRootPropertiesAbstract();

            state._fsp--;

             current =iv_ruleAccessesRootPropertiesAbstract; 
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
    // $ANTLR end "entryRuleAccessesRootPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootPropertiesAbstract"
    // InternalAccessesParser.g:144:1: ruleAccessesRootPropertiesAbstract returns [EObject current=null] : this_AccessesRootExternalAccess_0= ruleAccessesRootExternalAccess ;
    public final EObject ruleAccessesRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_AccessesRootExternalAccess_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:150:2: (this_AccessesRootExternalAccess_0= ruleAccessesRootExternalAccess )
            // InternalAccessesParser.g:151:2: this_AccessesRootExternalAccess_0= ruleAccessesRootExternalAccess
            {

            		newCompositeNode(grammarAccess.getAccessesRootPropertiesAbstractAccess().getAccessesRootExternalAccessParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AccessesRootExternalAccess_0=ruleAccessesRootExternalAccess();

            state._fsp--;


            		current = this_AccessesRootExternalAccess_0;
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
    // $ANTLR end "ruleAccessesRootPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsPropertiesAbstract"
    // InternalAccessesParser.g:162:1: entryRuleAccessesRootExternalAccessItemsPropertiesAbstract returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsPropertiesAbstract EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsPropertiesAbstract = null;


        try {
            // InternalAccessesParser.g:162:90: (iv_ruleAccessesRootExternalAccessItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsPropertiesAbstract EOF )
            // InternalAccessesParser.g:163:2: iv_ruleAccessesRootExternalAccessItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsPropertiesAbstract=ruleAccessesRootExternalAccessItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsPropertiesAbstract"
    // InternalAccessesParser.g:169:1: ruleAccessesRootExternalAccessItemsPropertiesAbstract returns [EObject current=null] : (this_AccessesRootExternalAccessItemsName_0= ruleAccessesRootExternalAccessItemsName | this_AccessesRootExternalAccessItemsPath_1= ruleAccessesRootExternalAccessItemsPath | this_AccessesRootExternalAccessItemsOntological_2= ruleAccessesRootExternalAccessItemsOntological | this_AccessesRootExternalAccessItemsClassname_3= ruleAccessesRootExternalAccessItemsClassname | this_AccessesRootExternalAccessItemsMethod_4= ruleAccessesRootExternalAccessItemsMethod | this_AccessesRootExternalAccessItemsAuth_5= ruleAccessesRootExternalAccessItemsAuth | this_AccessesRootExternalAccessItemsInput_6= ruleAccessesRootExternalAccessItemsInput | this_AccessesRootExternalAccessItemsOutput_7= ruleAccessesRootExternalAccessItemsOutput | this_AccessesRootExternalAccessItemsBody_8= ruleAccessesRootExternalAccessItemsBody | this_AccessesRootExternalAccessItemsTrigger_9= ruleAccessesRootExternalAccessItemsTrigger ) ;
    public final EObject ruleAccessesRootExternalAccessItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_AccessesRootExternalAccessItemsName_0 = null;

        EObject this_AccessesRootExternalAccessItemsPath_1 = null;

        EObject this_AccessesRootExternalAccessItemsOntological_2 = null;

        EObject this_AccessesRootExternalAccessItemsClassname_3 = null;

        EObject this_AccessesRootExternalAccessItemsMethod_4 = null;

        EObject this_AccessesRootExternalAccessItemsAuth_5 = null;

        EObject this_AccessesRootExternalAccessItemsInput_6 = null;

        EObject this_AccessesRootExternalAccessItemsOutput_7 = null;

        EObject this_AccessesRootExternalAccessItemsBody_8 = null;

        EObject this_AccessesRootExternalAccessItemsTrigger_9 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:175:2: ( (this_AccessesRootExternalAccessItemsName_0= ruleAccessesRootExternalAccessItemsName | this_AccessesRootExternalAccessItemsPath_1= ruleAccessesRootExternalAccessItemsPath | this_AccessesRootExternalAccessItemsOntological_2= ruleAccessesRootExternalAccessItemsOntological | this_AccessesRootExternalAccessItemsClassname_3= ruleAccessesRootExternalAccessItemsClassname | this_AccessesRootExternalAccessItemsMethod_4= ruleAccessesRootExternalAccessItemsMethod | this_AccessesRootExternalAccessItemsAuth_5= ruleAccessesRootExternalAccessItemsAuth | this_AccessesRootExternalAccessItemsInput_6= ruleAccessesRootExternalAccessItemsInput | this_AccessesRootExternalAccessItemsOutput_7= ruleAccessesRootExternalAccessItemsOutput | this_AccessesRootExternalAccessItemsBody_8= ruleAccessesRootExternalAccessItemsBody | this_AccessesRootExternalAccessItemsTrigger_9= ruleAccessesRootExternalAccessItemsTrigger ) )
            // InternalAccessesParser.g:176:2: (this_AccessesRootExternalAccessItemsName_0= ruleAccessesRootExternalAccessItemsName | this_AccessesRootExternalAccessItemsPath_1= ruleAccessesRootExternalAccessItemsPath | this_AccessesRootExternalAccessItemsOntological_2= ruleAccessesRootExternalAccessItemsOntological | this_AccessesRootExternalAccessItemsClassname_3= ruleAccessesRootExternalAccessItemsClassname | this_AccessesRootExternalAccessItemsMethod_4= ruleAccessesRootExternalAccessItemsMethod | this_AccessesRootExternalAccessItemsAuth_5= ruleAccessesRootExternalAccessItemsAuth | this_AccessesRootExternalAccessItemsInput_6= ruleAccessesRootExternalAccessItemsInput | this_AccessesRootExternalAccessItemsOutput_7= ruleAccessesRootExternalAccessItemsOutput | this_AccessesRootExternalAccessItemsBody_8= ruleAccessesRootExternalAccessItemsBody | this_AccessesRootExternalAccessItemsTrigger_9= ruleAccessesRootExternalAccessItemsTrigger )
            {
            // InternalAccessesParser.g:176:2: (this_AccessesRootExternalAccessItemsName_0= ruleAccessesRootExternalAccessItemsName | this_AccessesRootExternalAccessItemsPath_1= ruleAccessesRootExternalAccessItemsPath | this_AccessesRootExternalAccessItemsOntological_2= ruleAccessesRootExternalAccessItemsOntological | this_AccessesRootExternalAccessItemsClassname_3= ruleAccessesRootExternalAccessItemsClassname | this_AccessesRootExternalAccessItemsMethod_4= ruleAccessesRootExternalAccessItemsMethod | this_AccessesRootExternalAccessItemsAuth_5= ruleAccessesRootExternalAccessItemsAuth | this_AccessesRootExternalAccessItemsInput_6= ruleAccessesRootExternalAccessItemsInput | this_AccessesRootExternalAccessItemsOutput_7= ruleAccessesRootExternalAccessItemsOutput | this_AccessesRootExternalAccessItemsBody_8= ruleAccessesRootExternalAccessItemsBody | this_AccessesRootExternalAccessItemsTrigger_9= ruleAccessesRootExternalAccessItemsTrigger )
            int alt3=10;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt3=1;
                }
                break;
            case Path:
                {
                alt3=2;
                }
                break;
            case Ontological:
                {
                alt3=3;
                }
                break;
            case Classname:
                {
                alt3=4;
                }
                break;
            case Method:
                {
                alt3=5;
                }
                break;
            case Auth:
                {
                alt3=6;
                }
                break;
            case Input:
                {
                alt3=7;
                }
                break;
            case Output:
                {
                alt3=8;
                }
                break;
            case Body:
                {
                alt3=9;
                }
                break;
            case Trigger:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAccessesParser.g:177:3: this_AccessesRootExternalAccessItemsName_0= ruleAccessesRootExternalAccessItemsName
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsName_0=ruleAccessesRootExternalAccessItemsName();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:186:3: this_AccessesRootExternalAccessItemsPath_1= ruleAccessesRootExternalAccessItemsPath
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsPathParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsPath_1=ruleAccessesRootExternalAccessItemsPath();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsPath_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAccessesParser.g:195:3: this_AccessesRootExternalAccessItemsOntological_2= ruleAccessesRootExternalAccessItemsOntological
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOntologicalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsOntological_2=ruleAccessesRootExternalAccessItemsOntological();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsOntological_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAccessesParser.g:204:3: this_AccessesRootExternalAccessItemsClassname_3= ruleAccessesRootExternalAccessItemsClassname
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsClassnameParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsClassname_3=ruleAccessesRootExternalAccessItemsClassname();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsClassname_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAccessesParser.g:213:3: this_AccessesRootExternalAccessItemsMethod_4= ruleAccessesRootExternalAccessItemsMethod
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsMethodParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsMethod_4=ruleAccessesRootExternalAccessItemsMethod();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsMethod_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAccessesParser.g:222:3: this_AccessesRootExternalAccessItemsAuth_5= ruleAccessesRootExternalAccessItemsAuth
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsAuthParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsAuth_5=ruleAccessesRootExternalAccessItemsAuth();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsAuth_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAccessesParser.g:231:3: this_AccessesRootExternalAccessItemsInput_6= ruleAccessesRootExternalAccessItemsInput
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsInput_6=ruleAccessesRootExternalAccessItemsInput();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsInput_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAccessesParser.g:240:3: this_AccessesRootExternalAccessItemsOutput_7= ruleAccessesRootExternalAccessItemsOutput
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOutputParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsOutput_7=ruleAccessesRootExternalAccessItemsOutput();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsOutput_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAccessesParser.g:249:3: this_AccessesRootExternalAccessItemsBody_8= ruleAccessesRootExternalAccessItemsBody
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsBodyParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsBody_8=ruleAccessesRootExternalAccessItemsBody();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsBody_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAccessesParser.g:258:3: this_AccessesRootExternalAccessItemsTrigger_9= ruleAccessesRootExternalAccessItemsTrigger
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsTrigger_9=ruleAccessesRootExternalAccessItemsTrigger();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsTrigger_9;
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerPropertiesAbstract"
    // InternalAccessesParser.g:270:1: entryRuleAccessesRootExternalAccessItemsTriggerPropertiesAbstract returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsTriggerPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract = null;


        try {
            // InternalAccessesParser.g:270:97: (iv_ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract EOF )
            // InternalAccessesParser.g:271:2: iv_ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract=ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract"
    // InternalAccessesParser.g:277:1: ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract returns [EObject current=null] : (this_AccessesRootExternalAccessItemsTriggerOnChange_0= ruleAccessesRootExternalAccessItemsTriggerOnChange | this_AccessesRootExternalAccessItemsTriggerOnCreate_1= ruleAccessesRootExternalAccessItemsTriggerOnCreate | this_AccessesRootExternalAccessItemsTriggerOnMove_2= ruleAccessesRootExternalAccessItemsTriggerOnMove | this_AccessesRootExternalAccessItemsTriggerOnDelete_3= ruleAccessesRootExternalAccessItemsTriggerOnDelete | this_AccessesRootExternalAccessItemsTriggerOnAccess_4= ruleAccessesRootExternalAccessItemsTriggerOnAccess | this_AccessesRootExternalAccessItemsTriggerOnLoad_5= ruleAccessesRootExternalAccessItemsTriggerOnLoad | this_AccessesRootExternalAccessItemsTriggerTimeTrigger_6= ruleAccessesRootExternalAccessItemsTriggerTimeTrigger ) ;
    public final EObject ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_AccessesRootExternalAccessItemsTriggerOnChange_0 = null;

        EObject this_AccessesRootExternalAccessItemsTriggerOnCreate_1 = null;

        EObject this_AccessesRootExternalAccessItemsTriggerOnMove_2 = null;

        EObject this_AccessesRootExternalAccessItemsTriggerOnDelete_3 = null;

        EObject this_AccessesRootExternalAccessItemsTriggerOnAccess_4 = null;

        EObject this_AccessesRootExternalAccessItemsTriggerOnLoad_5 = null;

        EObject this_AccessesRootExternalAccessItemsTriggerTimeTrigger_6 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:283:2: ( (this_AccessesRootExternalAccessItemsTriggerOnChange_0= ruleAccessesRootExternalAccessItemsTriggerOnChange | this_AccessesRootExternalAccessItemsTriggerOnCreate_1= ruleAccessesRootExternalAccessItemsTriggerOnCreate | this_AccessesRootExternalAccessItemsTriggerOnMove_2= ruleAccessesRootExternalAccessItemsTriggerOnMove | this_AccessesRootExternalAccessItemsTriggerOnDelete_3= ruleAccessesRootExternalAccessItemsTriggerOnDelete | this_AccessesRootExternalAccessItemsTriggerOnAccess_4= ruleAccessesRootExternalAccessItemsTriggerOnAccess | this_AccessesRootExternalAccessItemsTriggerOnLoad_5= ruleAccessesRootExternalAccessItemsTriggerOnLoad | this_AccessesRootExternalAccessItemsTriggerTimeTrigger_6= ruleAccessesRootExternalAccessItemsTriggerTimeTrigger ) )
            // InternalAccessesParser.g:284:2: (this_AccessesRootExternalAccessItemsTriggerOnChange_0= ruleAccessesRootExternalAccessItemsTriggerOnChange | this_AccessesRootExternalAccessItemsTriggerOnCreate_1= ruleAccessesRootExternalAccessItemsTriggerOnCreate | this_AccessesRootExternalAccessItemsTriggerOnMove_2= ruleAccessesRootExternalAccessItemsTriggerOnMove | this_AccessesRootExternalAccessItemsTriggerOnDelete_3= ruleAccessesRootExternalAccessItemsTriggerOnDelete | this_AccessesRootExternalAccessItemsTriggerOnAccess_4= ruleAccessesRootExternalAccessItemsTriggerOnAccess | this_AccessesRootExternalAccessItemsTriggerOnLoad_5= ruleAccessesRootExternalAccessItemsTriggerOnLoad | this_AccessesRootExternalAccessItemsTriggerTimeTrigger_6= ruleAccessesRootExternalAccessItemsTriggerTimeTrigger )
            {
            // InternalAccessesParser.g:284:2: (this_AccessesRootExternalAccessItemsTriggerOnChange_0= ruleAccessesRootExternalAccessItemsTriggerOnChange | this_AccessesRootExternalAccessItemsTriggerOnCreate_1= ruleAccessesRootExternalAccessItemsTriggerOnCreate | this_AccessesRootExternalAccessItemsTriggerOnMove_2= ruleAccessesRootExternalAccessItemsTriggerOnMove | this_AccessesRootExternalAccessItemsTriggerOnDelete_3= ruleAccessesRootExternalAccessItemsTriggerOnDelete | this_AccessesRootExternalAccessItemsTriggerOnAccess_4= ruleAccessesRootExternalAccessItemsTriggerOnAccess | this_AccessesRootExternalAccessItemsTriggerOnLoad_5= ruleAccessesRootExternalAccessItemsTriggerOnLoad | this_AccessesRootExternalAccessItemsTriggerTimeTrigger_6= ruleAccessesRootExternalAccessItemsTriggerTimeTrigger )
            int alt4=7;
            switch ( input.LA(1) ) {
            case OnChange:
                {
                alt4=1;
                }
                break;
            case OnCreate:
                {
                alt4=2;
                }
                break;
            case OnMove:
                {
                alt4=3;
                }
                break;
            case OnDelete:
                {
                alt4=4;
                }
                break;
            case OnAccess:
                {
                alt4=5;
                }
                break;
            case OnLoad:
                {
                alt4=6;
                }
                break;
            case TimeTrigger:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAccessesParser.g:285:3: this_AccessesRootExternalAccessItemsTriggerOnChange_0= ruleAccessesRootExternalAccessItemsTriggerOnChange
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnChangeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsTriggerOnChange_0=ruleAccessesRootExternalAccessItemsTriggerOnChange();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsTriggerOnChange_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:294:3: this_AccessesRootExternalAccessItemsTriggerOnCreate_1= ruleAccessesRootExternalAccessItemsTriggerOnCreate
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnCreateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsTriggerOnCreate_1=ruleAccessesRootExternalAccessItemsTriggerOnCreate();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsTriggerOnCreate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAccessesParser.g:303:3: this_AccessesRootExternalAccessItemsTriggerOnMove_2= ruleAccessesRootExternalAccessItemsTriggerOnMove
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnMoveParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsTriggerOnMove_2=ruleAccessesRootExternalAccessItemsTriggerOnMove();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsTriggerOnMove_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAccessesParser.g:312:3: this_AccessesRootExternalAccessItemsTriggerOnDelete_3= ruleAccessesRootExternalAccessItemsTriggerOnDelete
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnDeleteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsTriggerOnDelete_3=ruleAccessesRootExternalAccessItemsTriggerOnDelete();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsTriggerOnDelete_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAccessesParser.g:321:3: this_AccessesRootExternalAccessItemsTriggerOnAccess_4= ruleAccessesRootExternalAccessItemsTriggerOnAccess
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnAccessParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsTriggerOnAccess_4=ruleAccessesRootExternalAccessItemsTriggerOnAccess();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsTriggerOnAccess_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAccessesParser.g:330:3: this_AccessesRootExternalAccessItemsTriggerOnLoad_5= ruleAccessesRootExternalAccessItemsTriggerOnLoad
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnLoadParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsTriggerOnLoad_5=ruleAccessesRootExternalAccessItemsTriggerOnLoad();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsTriggerOnLoad_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAccessesParser.g:339:3: this_AccessesRootExternalAccessItemsTriggerTimeTrigger_6= ruleAccessesRootExternalAccessItemsTriggerTimeTrigger
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerTimeTriggerParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsTriggerTimeTrigger_6=ruleAccessesRootExternalAccessItemsTriggerTimeTrigger();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsTriggerTimeTrigger_6;
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract"
    // InternalAccessesParser.g:351:1: entryRuleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract = null;


        try {
            // InternalAccessesParser.g:351:100: (iv_ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract EOF )
            // InternalAccessesParser.g:352:2: iv_ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract=ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract"
    // InternalAccessesParser.g:358:1: ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract returns [EObject current=null] : (this_AccessesRootExternalAccessItemsInputItemsAttr_0= ruleAccessesRootExternalAccessItemsInputItemsAttr | this_AccessesRootExternalAccessItemsInputItemsAPIInput_1= ruleAccessesRootExternalAccessItemsInputItemsAPIInput | this_AccessesRootExternalAccessItemsInputItemsWay_2= ruleAccessesRootExternalAccessItemsInputItemsWay | this_AccessesRootExternalAccessItemsInputItemsValue_3= ruleAccessesRootExternalAccessItemsInputItemsValue ) ;
    public final EObject ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_AccessesRootExternalAccessItemsInputItemsAttr_0 = null;

        EObject this_AccessesRootExternalAccessItemsInputItemsAPIInput_1 = null;

        EObject this_AccessesRootExternalAccessItemsInputItemsWay_2 = null;

        EObject this_AccessesRootExternalAccessItemsInputItemsValue_3 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:364:2: ( (this_AccessesRootExternalAccessItemsInputItemsAttr_0= ruleAccessesRootExternalAccessItemsInputItemsAttr | this_AccessesRootExternalAccessItemsInputItemsAPIInput_1= ruleAccessesRootExternalAccessItemsInputItemsAPIInput | this_AccessesRootExternalAccessItemsInputItemsWay_2= ruleAccessesRootExternalAccessItemsInputItemsWay | this_AccessesRootExternalAccessItemsInputItemsValue_3= ruleAccessesRootExternalAccessItemsInputItemsValue ) )
            // InternalAccessesParser.g:365:2: (this_AccessesRootExternalAccessItemsInputItemsAttr_0= ruleAccessesRootExternalAccessItemsInputItemsAttr | this_AccessesRootExternalAccessItemsInputItemsAPIInput_1= ruleAccessesRootExternalAccessItemsInputItemsAPIInput | this_AccessesRootExternalAccessItemsInputItemsWay_2= ruleAccessesRootExternalAccessItemsInputItemsWay | this_AccessesRootExternalAccessItemsInputItemsValue_3= ruleAccessesRootExternalAccessItemsInputItemsValue )
            {
            // InternalAccessesParser.g:365:2: (this_AccessesRootExternalAccessItemsInputItemsAttr_0= ruleAccessesRootExternalAccessItemsInputItemsAttr | this_AccessesRootExternalAccessItemsInputItemsAPIInput_1= ruleAccessesRootExternalAccessItemsInputItemsAPIInput | this_AccessesRootExternalAccessItemsInputItemsWay_2= ruleAccessesRootExternalAccessItemsInputItemsWay | this_AccessesRootExternalAccessItemsInputItemsValue_3= ruleAccessesRootExternalAccessItemsInputItemsValue )
            int alt5=4;
            switch ( input.LA(1) ) {
            case Attr:
                {
                alt5=1;
                }
                break;
            case APIInput:
                {
                alt5=2;
                }
                break;
            case Way:
                {
                alt5=3;
                }
                break;
            case Value:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAccessesParser.g:366:3: this_AccessesRootExternalAccessItemsInputItemsAttr_0= ruleAccessesRootExternalAccessItemsInputItemsAttr
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsAttrParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsInputItemsAttr_0=ruleAccessesRootExternalAccessItemsInputItemsAttr();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsInputItemsAttr_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:375:3: this_AccessesRootExternalAccessItemsInputItemsAPIInput_1= ruleAccessesRootExternalAccessItemsInputItemsAPIInput
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsAPIInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsInputItemsAPIInput_1=ruleAccessesRootExternalAccessItemsInputItemsAPIInput();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsInputItemsAPIInput_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAccessesParser.g:384:3: this_AccessesRootExternalAccessItemsInputItemsWay_2= ruleAccessesRootExternalAccessItemsInputItemsWay
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsWayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsInputItemsWay_2=ruleAccessesRootExternalAccessItemsInputItemsWay();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsInputItemsWay_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAccessesParser.g:393:3: this_AccessesRootExternalAccessItemsInputItemsValue_3= ruleAccessesRootExternalAccessItemsInputItemsValue
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsInputItemsValue_3=ruleAccessesRootExternalAccessItemsInputItemsValue();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsInputItemsValue_3;
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract"
    // InternalAccessesParser.g:405:1: entryRuleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract = null;


        try {
            // InternalAccessesParser.g:405:101: (iv_ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract EOF )
            // InternalAccessesParser.g:406:2: iv_ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract=ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract"
    // InternalAccessesParser.g:412:1: ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract returns [EObject current=null] : (this_AccessesRootExternalAccessItemsOutputItemsAttr_0= ruleAccessesRootExternalAccessItemsOutputItemsAttr | this_AccessesRootExternalAccessItemsOutputItemsAPIOutput_1= ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput ) ;
    public final EObject ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_AccessesRootExternalAccessItemsOutputItemsAttr_0 = null;

        EObject this_AccessesRootExternalAccessItemsOutputItemsAPIOutput_1 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:418:2: ( (this_AccessesRootExternalAccessItemsOutputItemsAttr_0= ruleAccessesRootExternalAccessItemsOutputItemsAttr | this_AccessesRootExternalAccessItemsOutputItemsAPIOutput_1= ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput ) )
            // InternalAccessesParser.g:419:2: (this_AccessesRootExternalAccessItemsOutputItemsAttr_0= ruleAccessesRootExternalAccessItemsOutputItemsAttr | this_AccessesRootExternalAccessItemsOutputItemsAPIOutput_1= ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput )
            {
            // InternalAccessesParser.g:419:2: (this_AccessesRootExternalAccessItemsOutputItemsAttr_0= ruleAccessesRootExternalAccessItemsOutputItemsAttr | this_AccessesRootExternalAccessItemsOutputItemsAPIOutput_1= ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Attr) ) {
                alt6=1;
            }
            else if ( (LA6_0==APIOutput) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAccessesParser.g:420:3: this_AccessesRootExternalAccessItemsOutputItemsAttr_0= ruleAccessesRootExternalAccessItemsOutputItemsAttr
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOutputItemsAttrParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsOutputItemsAttr_0=ruleAccessesRootExternalAccessItemsOutputItemsAttr();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsOutputItemsAttr_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:429:3: this_AccessesRootExternalAccessItemsOutputItemsAPIOutput_1= ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOutputItemsAPIOutputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsOutputItemsAPIOutput_1=ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsOutputItemsAPIOutput_1;
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract"
    // InternalAccessesParser.g:441:1: entryRuleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract = null;


        try {
            // InternalAccessesParser.g:441:99: (iv_ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract EOF )
            // InternalAccessesParser.g:442:2: iv_ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract=ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract"
    // InternalAccessesParser.g:448:1: ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract returns [EObject current=null] : (this_AccessesRootExternalAccessItemsBodyItemsAttr_0= ruleAccessesRootExternalAccessItemsBodyItemsAttr | this_AccessesRootExternalAccessItemsBodyItemsAPIBody_1= ruleAccessesRootExternalAccessItemsBodyItemsAPIBody ) ;
    public final EObject ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_AccessesRootExternalAccessItemsBodyItemsAttr_0 = null;

        EObject this_AccessesRootExternalAccessItemsBodyItemsAPIBody_1 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:454:2: ( (this_AccessesRootExternalAccessItemsBodyItemsAttr_0= ruleAccessesRootExternalAccessItemsBodyItemsAttr | this_AccessesRootExternalAccessItemsBodyItemsAPIBody_1= ruleAccessesRootExternalAccessItemsBodyItemsAPIBody ) )
            // InternalAccessesParser.g:455:2: (this_AccessesRootExternalAccessItemsBodyItemsAttr_0= ruleAccessesRootExternalAccessItemsBodyItemsAttr | this_AccessesRootExternalAccessItemsBodyItemsAPIBody_1= ruleAccessesRootExternalAccessItemsBodyItemsAPIBody )
            {
            // InternalAccessesParser.g:455:2: (this_AccessesRootExternalAccessItemsBodyItemsAttr_0= ruleAccessesRootExternalAccessItemsBodyItemsAttr | this_AccessesRootExternalAccessItemsBodyItemsAPIBody_1= ruleAccessesRootExternalAccessItemsBodyItemsAPIBody )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Attr) ) {
                alt7=1;
            }
            else if ( (LA7_0==APIBody) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAccessesParser.g:456:3: this_AccessesRootExternalAccessItemsBodyItemsAttr_0= ruleAccessesRootExternalAccessItemsBodyItemsAttr
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsBodyItemsAttrParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsBodyItemsAttr_0=ruleAccessesRootExternalAccessItemsBodyItemsAttr();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsBodyItemsAttr_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:465:3: this_AccessesRootExternalAccessItemsBodyItemsAPIBody_1= ruleAccessesRootExternalAccessItemsBodyItemsAPIBody
                    {

                    			newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsBodyItemsAPIBodyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccessesRootExternalAccessItemsBodyItemsAPIBody_1=ruleAccessesRootExternalAccessItemsBodyItemsAPIBody();

                    state._fsp--;


                    			current = this_AccessesRootExternalAccessItemsBodyItemsAPIBody_1;
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccess"
    // InternalAccessesParser.g:477:1: entryRuleAccessesRootExternalAccess returns [EObject current=null] : iv_ruleAccessesRootExternalAccess= ruleAccessesRootExternalAccess EOF ;
    public final EObject entryRuleAccessesRootExternalAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccess = null;


        try {
            // InternalAccessesParser.g:477:67: (iv_ruleAccessesRootExternalAccess= ruleAccessesRootExternalAccess EOF )
            // InternalAccessesParser.g:478:2: iv_ruleAccessesRootExternalAccess= ruleAccessesRootExternalAccess EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccess=ruleAccessesRootExternalAccess();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccess; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccess"


    // $ANTLR start "ruleAccessesRootExternalAccess"
    // InternalAccessesParser.g:484:1: ruleAccessesRootExternalAccess returns [EObject current=null] : ( () otherlv_1= ExternalAccess otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems ) ) (otherlv_5= Comma ( (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleAccessesRootExternalAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ExternalAccess_4_0 = null;

        EObject lv_ExternalAccess_6_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:490:2: ( ( () otherlv_1= ExternalAccess otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems ) ) (otherlv_5= Comma ( (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalAccessesParser.g:491:2: ( () otherlv_1= ExternalAccess otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems ) ) (otherlv_5= Comma ( (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalAccessesParser.g:491:2: ( () otherlv_1= ExternalAccess otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems ) ) (otherlv_5= Comma ( (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalAccessesParser.g:492:3: () otherlv_1= ExternalAccess otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems ) ) (otherlv_5= Comma ( (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalAccessesParser.g:492:3: ()
            // InternalAccessesParser.g:493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootExternalAccessAccess().getAccessesRootExternalAccessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ExternalAccess,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAccessesRootExternalAccessAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAccessesRootExternalAccessAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalAccessesParser.g:511:3: ( ( (lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems ) ) (otherlv_5= Comma ( (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LeftCurlyBracket) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAccessesParser.g:512:4: ( (lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems ) ) (otherlv_5= Comma ( (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems ) ) )*
                    {
                    // InternalAccessesParser.g:512:4: ( (lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems ) )
                    // InternalAccessesParser.g:513:5: (lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems )
                    {
                    // InternalAccessesParser.g:513:5: (lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems )
                    // InternalAccessesParser.g:514:6: lv_ExternalAccess_4_0= ruleAccessesRootExternalAccessItems
                    {

                    						newCompositeNode(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAccessesRootExternalAccessItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_ExternalAccess_4_0=ruleAccessesRootExternalAccessItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessRule());
                    						}
                    						add(
                    							current,
                    							"ExternalAccess",
                    							lv_ExternalAccess_4_0,
                    							"accesses.accesses.Accesses.AccessesRootExternalAccessItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAccessesParser.g:531:4: (otherlv_5= Comma ( (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAccessesParser.g:532:5: otherlv_5= Comma ( (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAccessesRootExternalAccessAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalAccessesParser.g:536:5: ( (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems ) )
                    	    // InternalAccessesParser.g:537:6: (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems )
                    	    {
                    	    // InternalAccessesParser.g:537:6: (lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems )
                    	    // InternalAccessesParser.g:538:7: lv_ExternalAccess_6_0= ruleAccessesRootExternalAccessItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAccessesRootExternalAccessItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_ExternalAccess_6_0=ruleAccessesRootExternalAccessItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ExternalAccess",
                    	    								lv_ExternalAccess_6_0,
                    	    								"accesses.accesses.Accesses.AccessesRootExternalAccessItems");
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

            			newLeafNode(otherlv_7, grammarAccess.getAccessesRootExternalAccessAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAccessesRootExternalAccess"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItems"
    // InternalAccessesParser.g:565:1: entryRuleAccessesRootExternalAccessItems returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItems= ruleAccessesRootExternalAccessItems EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItems = null;


        try {
            // InternalAccessesParser.g:565:72: (iv_ruleAccessesRootExternalAccessItems= ruleAccessesRootExternalAccessItems EOF )
            // InternalAccessesParser.g:566:2: iv_ruleAccessesRootExternalAccessItems= ruleAccessesRootExternalAccessItems EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItems=ruleAccessesRootExternalAccessItems();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItems; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItems"


    // $ANTLR start "ruleAccessesRootExternalAccessItems"
    // InternalAccessesParser.g:572:1: ruleAccessesRootExternalAccessItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleAccessesRootExternalAccessItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:578:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalAccessesParser.g:579:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalAccessesParser.g:579:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalAccessesParser.g:580:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalAccessesParser.g:580:3: ()
            // InternalAccessesParser.g:581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootExternalAccessItemsAccess().getAccessesRootExternalAccessItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAccessesParser.g:591:3: ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Ontological||LA11_0==Classname||(LA11_0>=Trigger && LA11_0<=Method)||(LA11_0>=Output && LA11_0<=Input)||(LA11_0>=Auth && LA11_0<=Path)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAccessesParser.g:592:4: ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) )*
                    {
                    // InternalAccessesParser.g:592:4: ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) )
                    // InternalAccessesParser.g:593:5: (lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract )
                    {
                    // InternalAccessesParser.g:593:5: (lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract )
                    // InternalAccessesParser.g:594:6: lv_items_2_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAccessesRootExternalAccessItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleAccessesRootExternalAccessItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"accesses.accesses.Accesses.AccessesRootExternalAccessItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAccessesParser.g:611:4: (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAccessesParser.g:612:5: otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_12); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAccessesRootExternalAccessItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAccessesParser.g:616:5: ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract ) )
                    	    // InternalAccessesParser.g:617:6: (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract )
                    	    {
                    	    // InternalAccessesParser.g:617:6: (lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract )
                    	    // InternalAccessesParser.g:618:7: lv_items_4_0= ruleAccessesRootExternalAccessItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAccessesRootExternalAccessItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleAccessesRootExternalAccessItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"accesses.accesses.Accesses.AccessesRootExternalAccessItemsPropertiesAbstract");
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

            			newLeafNode(otherlv_5, grammarAccess.getAccessesRootExternalAccessItemsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAccessesRootExternalAccessItems"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsName"
    // InternalAccessesParser.g:645:1: entryRuleAccessesRootExternalAccessItemsName returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsName= ruleAccessesRootExternalAccessItemsName EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsName = null;


        try {
            // InternalAccessesParser.g:645:76: (iv_ruleAccessesRootExternalAccessItemsName= ruleAccessesRootExternalAccessItemsName EOF )
            // InternalAccessesParser.g:646:2: iv_ruleAccessesRootExternalAccessItemsName= ruleAccessesRootExternalAccessItemsName EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsName=ruleAccessesRootExternalAccessItemsName();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsName; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsName"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsName"
    // InternalAccessesParser.g:652:1: ruleAccessesRootExternalAccessItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:658:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:659:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:659:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalAccessesParser.g:660:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalAccessesParser.g:660:3: ()
            // InternalAccessesParser.g:661:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getAccessesRootExternalAccessItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getColonKeyword_2());
            		
            // InternalAccessesParser.g:675:3: ( (lv_name_3_0= ruleEString ) )
            // InternalAccessesParser.g:676:4: (lv_name_3_0= ruleEString )
            {
            // InternalAccessesParser.g:676:4: (lv_name_3_0= ruleEString )
            // InternalAccessesParser.g:677:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsName"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsPath"
    // InternalAccessesParser.g:698:1: entryRuleAccessesRootExternalAccessItemsPath returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsPath= ruleAccessesRootExternalAccessItemsPath EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsPath = null;


        try {
            // InternalAccessesParser.g:698:76: (iv_ruleAccessesRootExternalAccessItemsPath= ruleAccessesRootExternalAccessItemsPath EOF )
            // InternalAccessesParser.g:699:2: iv_ruleAccessesRootExternalAccessItemsPath= ruleAccessesRootExternalAccessItemsPath EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsPath=ruleAccessesRootExternalAccessItemsPath();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsPath; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsPath"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsPath"
    // InternalAccessesParser.g:705:1: ruleAccessesRootExternalAccessItemsPath returns [EObject current=null] : (otherlv_0= Path otherlv_1= Colon ( (lv_path_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:711:2: ( (otherlv_0= Path otherlv_1= Colon ( (lv_path_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:712:2: (otherlv_0= Path otherlv_1= Colon ( (lv_path_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:712:2: (otherlv_0= Path otherlv_1= Colon ( (lv_path_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:713:3: otherlv_0= Path otherlv_1= Colon ( (lv_path_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Path,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getPathKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:721:3: ( (lv_path_2_0= ruleEString ) )
            // InternalAccessesParser.g:722:4: (lv_path_2_0= ruleEString )
            {
            // InternalAccessesParser.g:722:4: (lv_path_2_0= ruleEString )
            // InternalAccessesParser.g:723:5: lv_path_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getPathEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsPathRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsPath"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOntological"
    // InternalAccessesParser.g:744:1: entryRuleAccessesRootExternalAccessItemsOntological returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsOntological= ruleAccessesRootExternalAccessItemsOntological EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsOntological() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsOntological = null;


        try {
            // InternalAccessesParser.g:744:83: (iv_ruleAccessesRootExternalAccessItemsOntological= ruleAccessesRootExternalAccessItemsOntological EOF )
            // InternalAccessesParser.g:745:2: iv_ruleAccessesRootExternalAccessItemsOntological= ruleAccessesRootExternalAccessItemsOntological EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOntologicalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsOntological=ruleAccessesRootExternalAccessItemsOntological();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsOntological; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOntological"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOntological"
    // InternalAccessesParser.g:751:1: ruleAccessesRootExternalAccessItemsOntological returns [EObject current=null] : (otherlv_0= Ontological otherlv_1= Colon ( (lv_ontological_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsOntological() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ontological_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:757:2: ( (otherlv_0= Ontological otherlv_1= Colon ( (lv_ontological_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:758:2: (otherlv_0= Ontological otherlv_1= Colon ( (lv_ontological_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:758:2: (otherlv_0= Ontological otherlv_1= Colon ( (lv_ontological_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:759:3: otherlv_0= Ontological otherlv_1= Colon ( (lv_ontological_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Ontological,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getOntologicalKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:767:3: ( (lv_ontological_2_0= ruleEString ) )
            // InternalAccessesParser.g:768:4: (lv_ontological_2_0= ruleEString )
            {
            // InternalAccessesParser.g:768:4: (lv_ontological_2_0= ruleEString )
            // InternalAccessesParser.g:769:5: lv_ontological_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getOntologicalEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ontological_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsOntologicalRule());
            					}
            					set(
            						current,
            						"ontological",
            						lv_ontological_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOntological"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsClassname"
    // InternalAccessesParser.g:790:1: entryRuleAccessesRootExternalAccessItemsClassname returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsClassname= ruleAccessesRootExternalAccessItemsClassname EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsClassname() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsClassname = null;


        try {
            // InternalAccessesParser.g:790:81: (iv_ruleAccessesRootExternalAccessItemsClassname= ruleAccessesRootExternalAccessItemsClassname EOF )
            // InternalAccessesParser.g:791:2: iv_ruleAccessesRootExternalAccessItemsClassname= ruleAccessesRootExternalAccessItemsClassname EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsClassnameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsClassname=ruleAccessesRootExternalAccessItemsClassname();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsClassname; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsClassname"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsClassname"
    // InternalAccessesParser.g:797:1: ruleAccessesRootExternalAccessItemsClassname returns [EObject current=null] : (otherlv_0= Classname otherlv_1= Colon ( (lv_classname_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsClassname() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_classname_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:803:2: ( (otherlv_0= Classname otherlv_1= Colon ( (lv_classname_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:804:2: (otherlv_0= Classname otherlv_1= Colon ( (lv_classname_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:804:2: (otherlv_0= Classname otherlv_1= Colon ( (lv_classname_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:805:3: otherlv_0= Classname otherlv_1= Colon ( (lv_classname_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Classname,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getClassnameKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:813:3: ( (lv_classname_2_0= ruleEString ) )
            // InternalAccessesParser.g:814:4: (lv_classname_2_0= ruleEString )
            {
            // InternalAccessesParser.g:814:4: (lv_classname_2_0= ruleEString )
            // InternalAccessesParser.g:815:5: lv_classname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getClassnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_classname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsClassnameRule());
            					}
            					set(
            						current,
            						"classname",
            						lv_classname_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsClassname"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsMethod"
    // InternalAccessesParser.g:836:1: entryRuleAccessesRootExternalAccessItemsMethod returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsMethod= ruleAccessesRootExternalAccessItemsMethod EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsMethod = null;


        try {
            // InternalAccessesParser.g:836:78: (iv_ruleAccessesRootExternalAccessItemsMethod= ruleAccessesRootExternalAccessItemsMethod EOF )
            // InternalAccessesParser.g:837:2: iv_ruleAccessesRootExternalAccessItemsMethod= ruleAccessesRootExternalAccessItemsMethod EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsMethod=ruleAccessesRootExternalAccessItemsMethod();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsMethod; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsMethod"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsMethod"
    // InternalAccessesParser.g:843:1: ruleAccessesRootExternalAccessItemsMethod returns [EObject current=null] : (otherlv_0= Method otherlv_1= Colon ( (lv_method_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_method_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:849:2: ( (otherlv_0= Method otherlv_1= Colon ( (lv_method_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:850:2: (otherlv_0= Method otherlv_1= Colon ( (lv_method_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:850:2: (otherlv_0= Method otherlv_1= Colon ( (lv_method_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:851:3: otherlv_0= Method otherlv_1= Colon ( (lv_method_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Method,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getMethodKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:859:3: ( (lv_method_2_0= ruleEString ) )
            // InternalAccessesParser.g:860:4: (lv_method_2_0= ruleEString )
            {
            // InternalAccessesParser.g:860:4: (lv_method_2_0= ruleEString )
            // InternalAccessesParser.g:861:5: lv_method_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getMethodEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_method_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsMethodRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsMethod"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsAuth"
    // InternalAccessesParser.g:882:1: entryRuleAccessesRootExternalAccessItemsAuth returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsAuth= ruleAccessesRootExternalAccessItemsAuth EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsAuth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsAuth = null;


        try {
            // InternalAccessesParser.g:882:76: (iv_ruleAccessesRootExternalAccessItemsAuth= ruleAccessesRootExternalAccessItemsAuth EOF )
            // InternalAccessesParser.g:883:2: iv_ruleAccessesRootExternalAccessItemsAuth= ruleAccessesRootExternalAccessItemsAuth EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsAuthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsAuth=ruleAccessesRootExternalAccessItemsAuth();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsAuth; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsAuth"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsAuth"
    // InternalAccessesParser.g:889:1: ruleAccessesRootExternalAccessItemsAuth returns [EObject current=null] : (otherlv_0= Auth otherlv_1= Colon ( (lv_auth_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsAuth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_auth_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:895:2: ( (otherlv_0= Auth otherlv_1= Colon ( (lv_auth_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:896:2: (otherlv_0= Auth otherlv_1= Colon ( (lv_auth_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:896:2: (otherlv_0= Auth otherlv_1= Colon ( (lv_auth_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:897:3: otherlv_0= Auth otherlv_1= Colon ( (lv_auth_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Auth,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getAuthKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:905:3: ( (lv_auth_2_0= ruleEString ) )
            // InternalAccessesParser.g:906:4: (lv_auth_2_0= ruleEString )
            {
            // InternalAccessesParser.g:906:4: (lv_auth_2_0= ruleEString )
            // InternalAccessesParser.g:907:5: lv_auth_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getAuthEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_auth_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsAuthRule());
            					}
            					set(
            						current,
            						"auth",
            						lv_auth_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsAuth"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInput"
    // InternalAccessesParser.g:928:1: entryRuleAccessesRootExternalAccessItemsInput returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsInput= ruleAccessesRootExternalAccessItemsInput EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsInput = null;


        try {
            // InternalAccessesParser.g:928:77: (iv_ruleAccessesRootExternalAccessItemsInput= ruleAccessesRootExternalAccessItemsInput EOF )
            // InternalAccessesParser.g:929:2: iv_ruleAccessesRootExternalAccessItemsInput= ruleAccessesRootExternalAccessItemsInput EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsInput=ruleAccessesRootExternalAccessItemsInput();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsInput; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInput"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInput"
    // InternalAccessesParser.g:935:1: ruleAccessesRootExternalAccessItemsInput returns [EObject current=null] : ( () otherlv_1= Input otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems ) ) (otherlv_5= Comma ( (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleAccessesRootExternalAccessItemsInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_input_4_0 = null;

        EObject lv_input_6_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:941:2: ( ( () otherlv_1= Input otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems ) ) (otherlv_5= Comma ( (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalAccessesParser.g:942:2: ( () otherlv_1= Input otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems ) ) (otherlv_5= Comma ( (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalAccessesParser.g:942:2: ( () otherlv_1= Input otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems ) ) (otherlv_5= Comma ( (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalAccessesParser.g:943:3: () otherlv_1= Input otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems ) ) (otherlv_5= Comma ( (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalAccessesParser.g:943:3: ()
            // InternalAccessesParser.g:944:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getAccessesRootExternalAccessItemsInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Input,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalAccessesParser.g:962:3: ( ( (lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems ) ) (otherlv_5= Comma ( (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftCurlyBracket) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAccessesParser.g:963:4: ( (lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems ) ) (otherlv_5= Comma ( (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems ) ) )*
                    {
                    // InternalAccessesParser.g:963:4: ( (lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems ) )
                    // InternalAccessesParser.g:964:5: (lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems )
                    {
                    // InternalAccessesParser.g:964:5: (lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems )
                    // InternalAccessesParser.g:965:6: lv_input_4_0= ruleAccessesRootExternalAccessItemsInputItems
                    {

                    						newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAccessesRootExternalAccessItemsInputItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_input_4_0=ruleAccessesRootExternalAccessItemsInputItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsInputRule());
                    						}
                    						add(
                    							current,
                    							"input",
                    							lv_input_4_0,
                    							"accesses.accesses.Accesses.AccessesRootExternalAccessItemsInputItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAccessesParser.g:982:4: (otherlv_5= Comma ( (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalAccessesParser.g:983:5: otherlv_5= Comma ( (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalAccessesParser.g:987:5: ( (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems ) )
                    	    // InternalAccessesParser.g:988:6: (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems )
                    	    {
                    	    // InternalAccessesParser.g:988:6: (lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems )
                    	    // InternalAccessesParser.g:989:7: lv_input_6_0= ruleAccessesRootExternalAccessItemsInputItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAccessesRootExternalAccessItemsInputItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_input_6_0=ruleAccessesRootExternalAccessItemsInputItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsInputRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"input",
                    	    								lv_input_6_0,
                    	    								"accesses.accesses.Accesses.AccessesRootExternalAccessItemsInputItems");
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

            			newLeafNode(otherlv_7, grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInput"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOutput"
    // InternalAccessesParser.g:1016:1: entryRuleAccessesRootExternalAccessItemsOutput returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsOutput= ruleAccessesRootExternalAccessItemsOutput EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsOutput = null;


        try {
            // InternalAccessesParser.g:1016:78: (iv_ruleAccessesRootExternalAccessItemsOutput= ruleAccessesRootExternalAccessItemsOutput EOF )
            // InternalAccessesParser.g:1017:2: iv_ruleAccessesRootExternalAccessItemsOutput= ruleAccessesRootExternalAccessItemsOutput EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsOutput=ruleAccessesRootExternalAccessItemsOutput();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsOutput; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOutput"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOutput"
    // InternalAccessesParser.g:1023:1: ruleAccessesRootExternalAccessItemsOutput returns [EObject current=null] : ( () otherlv_1= Output otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) (otherlv_5= Comma ( (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleAccessesRootExternalAccessItemsOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_output_4_0 = null;

        EObject lv_output_6_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1029:2: ( ( () otherlv_1= Output otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) (otherlv_5= Comma ( (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalAccessesParser.g:1030:2: ( () otherlv_1= Output otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) (otherlv_5= Comma ( (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalAccessesParser.g:1030:2: ( () otherlv_1= Output otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) (otherlv_5= Comma ( (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalAccessesParser.g:1031:3: () otherlv_1= Output otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) (otherlv_5= Comma ( (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalAccessesParser.g:1031:3: ()
            // InternalAccessesParser.g:1032:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getAccessesRootExternalAccessItemsOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Output,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalAccessesParser.g:1050:3: ( ( (lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) (otherlv_5= Comma ( (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftCurlyBracket) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAccessesParser.g:1051:4: ( (lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) (otherlv_5= Comma ( (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) )*
                    {
                    // InternalAccessesParser.g:1051:4: ( (lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems ) )
                    // InternalAccessesParser.g:1052:5: (lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems )
                    {
                    // InternalAccessesParser.g:1052:5: (lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems )
                    // InternalAccessesParser.g:1053:6: lv_output_4_0= ruleAccessesRootExternalAccessItemsOutputItems
                    {

                    						newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAccessesRootExternalAccessItemsOutputItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_output_4_0=ruleAccessesRootExternalAccessItemsOutputItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsOutputRule());
                    						}
                    						add(
                    							current,
                    							"output",
                    							lv_output_4_0,
                    							"accesses.accesses.Accesses.AccessesRootExternalAccessItemsOutputItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAccessesParser.g:1070:4: (otherlv_5= Comma ( (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalAccessesParser.g:1071:5: otherlv_5= Comma ( (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalAccessesParser.g:1075:5: ( (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems ) )
                    	    // InternalAccessesParser.g:1076:6: (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems )
                    	    {
                    	    // InternalAccessesParser.g:1076:6: (lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems )
                    	    // InternalAccessesParser.g:1077:7: lv_output_6_0= ruleAccessesRootExternalAccessItemsOutputItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAccessesRootExternalAccessItemsOutputItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_output_6_0=ruleAccessesRootExternalAccessItemsOutputItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsOutputRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"output",
                    	    								lv_output_6_0,
                    	    								"accesses.accesses.Accesses.AccessesRootExternalAccessItemsOutputItems");
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

            			newLeafNode(otherlv_7, grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOutput"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsBody"
    // InternalAccessesParser.g:1104:1: entryRuleAccessesRootExternalAccessItemsBody returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsBody= ruleAccessesRootExternalAccessItemsBody EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsBody = null;


        try {
            // InternalAccessesParser.g:1104:76: (iv_ruleAccessesRootExternalAccessItemsBody= ruleAccessesRootExternalAccessItemsBody EOF )
            // InternalAccessesParser.g:1105:2: iv_ruleAccessesRootExternalAccessItemsBody= ruleAccessesRootExternalAccessItemsBody EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsBody=ruleAccessesRootExternalAccessItemsBody();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsBody; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsBody"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsBody"
    // InternalAccessesParser.g:1111:1: ruleAccessesRootExternalAccessItemsBody returns [EObject current=null] : ( () otherlv_1= Body otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) (otherlv_5= Comma ( (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleAccessesRootExternalAccessItemsBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_body_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1117:2: ( ( () otherlv_1= Body otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) (otherlv_5= Comma ( (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalAccessesParser.g:1118:2: ( () otherlv_1= Body otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) (otherlv_5= Comma ( (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalAccessesParser.g:1118:2: ( () otherlv_1= Body otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) (otherlv_5= Comma ( (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalAccessesParser.g:1119:3: () otherlv_1= Body otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) (otherlv_5= Comma ( (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalAccessesParser.g:1119:3: ()
            // InternalAccessesParser.g:1120:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getAccessesRootExternalAccessItemsBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Body,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalAccessesParser.g:1138:3: ( ( (lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) (otherlv_5= Comma ( (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LeftCurlyBracket) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAccessesParser.g:1139:4: ( (lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) (otherlv_5= Comma ( (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) )*
                    {
                    // InternalAccessesParser.g:1139:4: ( (lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems ) )
                    // InternalAccessesParser.g:1140:5: (lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems )
                    {
                    // InternalAccessesParser.g:1140:5: (lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems )
                    // InternalAccessesParser.g:1141:6: lv_body_4_0= ruleAccessesRootExternalAccessItemsBodyItems
                    {

                    						newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAccessesRootExternalAccessItemsBodyItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_body_4_0=ruleAccessesRootExternalAccessItemsBodyItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsBodyRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_4_0,
                    							"accesses.accesses.Accesses.AccessesRootExternalAccessItemsBodyItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAccessesParser.g:1158:4: (otherlv_5= Comma ( (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAccessesParser.g:1159:5: otherlv_5= Comma ( (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalAccessesParser.g:1163:5: ( (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems ) )
                    	    // InternalAccessesParser.g:1164:6: (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems )
                    	    {
                    	    // InternalAccessesParser.g:1164:6: (lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems )
                    	    // InternalAccessesParser.g:1165:7: lv_body_6_0= ruleAccessesRootExternalAccessItemsBodyItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAccessesRootExternalAccessItemsBodyItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_body_6_0=ruleAccessesRootExternalAccessItemsBodyItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_6_0,
                    	    								"accesses.accesses.Accesses.AccessesRootExternalAccessItemsBodyItems");
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

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsBody"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTrigger"
    // InternalAccessesParser.g:1192:1: entryRuleAccessesRootExternalAccessItemsTrigger returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsTrigger= ruleAccessesRootExternalAccessItemsTrigger EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsTrigger = null;


        try {
            // InternalAccessesParser.g:1192:79: (iv_ruleAccessesRootExternalAccessItemsTrigger= ruleAccessesRootExternalAccessItemsTrigger EOF )
            // InternalAccessesParser.g:1193:2: iv_ruleAccessesRootExternalAccessItemsTrigger= ruleAccessesRootExternalAccessItemsTrigger EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsTrigger=ruleAccessesRootExternalAccessItemsTrigger();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsTrigger; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTrigger"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTrigger"
    // InternalAccessesParser.g:1199:1: ruleAccessesRootExternalAccessItemsTrigger returns [EObject current=null] : ( () otherlv_1= Trigger otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleAccessesRootExternalAccessItemsTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_4_0 = null;

        EObject lv_trigger_6_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1205:2: ( ( () otherlv_1= Trigger otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalAccessesParser.g:1206:2: ( () otherlv_1= Trigger otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalAccessesParser.g:1206:2: ( () otherlv_1= Trigger otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalAccessesParser.g:1207:3: () otherlv_1= Trigger otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalAccessesParser.g:1207:3: ()
            // InternalAccessesParser.g:1208:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getAccessesRootExternalAccessItemsTriggerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Trigger,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAccessesParser.g:1226:3: ( ( (lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TimeTrigger||(LA19_0>=OnAccess && LA19_0<=OnDelete)||(LA19_0>=OnLoad && LA19_0<=OnMove)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAccessesParser.g:1227:4: ( (lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) )*
                    {
                    // InternalAccessesParser.g:1227:4: ( (lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) )
                    // InternalAccessesParser.g:1228:5: (lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract )
                    {
                    // InternalAccessesParser.g:1228:5: (lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract )
                    // InternalAccessesParser.g:1229:6: lv_trigger_4_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAccessesRootExternalAccessItemsTriggerPropertiesAbstractParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_trigger_4_0=ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsTriggerRule());
                    						}
                    						add(
                    							current,
                    							"trigger",
                    							lv_trigger_4_0,
                    							"accesses.accesses.Accesses.AccessesRootExternalAccessItemsTriggerPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAccessesParser.g:1246:4: (otherlv_5= Comma ( (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalAccessesParser.g:1247:5: otherlv_5= Comma ( (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalAccessesParser.g:1251:5: ( (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) )
                    	    // InternalAccessesParser.g:1252:6: (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract )
                    	    {
                    	    // InternalAccessesParser.g:1252:6: (lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract )
                    	    // InternalAccessesParser.g:1253:7: lv_trigger_6_0= ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAccessesRootExternalAccessItemsTriggerPropertiesAbstractParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_trigger_6_0=ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsTriggerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"trigger",
                    	    								lv_trigger_6_0,
                    	    								"accesses.accesses.Accesses.AccessesRootExternalAccessItemsTriggerPropertiesAbstract");
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

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTrigger"


    // $ANTLR start "entryRuleEString"
    // InternalAccessesParser.g:1280:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAccessesParser.g:1280:47: (iv_ruleEString= ruleEString EOF )
            // InternalAccessesParser.g:1281:2: iv_ruleEString= ruleEString EOF
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
    // InternalAccessesParser.g:1287:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1293:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalAccessesParser.g:1294:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItems"
    // InternalAccessesParser.g:1307:1: entryRuleAccessesRootExternalAccessItemsInputItems returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsInputItems= ruleAccessesRootExternalAccessItemsInputItems EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsInputItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsInputItems = null;


        try {
            // InternalAccessesParser.g:1307:82: (iv_ruleAccessesRootExternalAccessItemsInputItems= ruleAccessesRootExternalAccessItemsInputItems EOF )
            // InternalAccessesParser.g:1308:2: iv_ruleAccessesRootExternalAccessItemsInputItems= ruleAccessesRootExternalAccessItemsInputItems EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsInputItems=ruleAccessesRootExternalAccessItemsInputItems();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsInputItems; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItems"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItems"
    // InternalAccessesParser.g:1314:1: ruleAccessesRootExternalAccessItemsInputItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleAccessesRootExternalAccessItemsInputItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1320:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalAccessesParser.g:1321:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalAccessesParser.g:1321:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalAccessesParser.g:1322:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalAccessesParser.g:1322:3: ()
            // InternalAccessesParser.g:1323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getAccessesRootExternalAccessItemsInputItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAccessesParser.g:1333:3: ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==APIInput||(LA21_0>=Value && LA21_0<=Attr)||LA21_0==Way) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAccessesParser.g:1334:4: ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) )*
                    {
                    // InternalAccessesParser.g:1334:4: ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) )
                    // InternalAccessesParser.g:1335:5: (lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract )
                    {
                    // InternalAccessesParser.g:1335:5: (lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract )
                    // InternalAccessesParser.g:1336:6: lv_items_2_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAccessesRootExternalAccessItemsInputItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsInputItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"accesses.accesses.Accesses.AccessesRootExternalAccessItemsInputItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAccessesParser.g:1353:4: (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Comma) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalAccessesParser.g:1354:5: otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_17); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAccessesParser.g:1358:5: ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) )
                    	    // InternalAccessesParser.g:1359:6: (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract )
                    	    {
                    	    // InternalAccessesParser.g:1359:6: (lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract )
                    	    // InternalAccessesParser.g:1360:7: lv_items_4_0= ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAccessesRootExternalAccessItemsInputItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsInputItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"accesses.accesses.Accesses.AccessesRootExternalAccessItemsInputItemsPropertiesAbstract");
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

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItems"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItemsAttr"
    // InternalAccessesParser.g:1387:1: entryRuleAccessesRootExternalAccessItemsInputItemsAttr returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsInputItemsAttr= ruleAccessesRootExternalAccessItemsInputItemsAttr EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsInputItemsAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsInputItemsAttr = null;


        try {
            // InternalAccessesParser.g:1387:86: (iv_ruleAccessesRootExternalAccessItemsInputItemsAttr= ruleAccessesRootExternalAccessItemsInputItemsAttr EOF )
            // InternalAccessesParser.g:1388:2: iv_ruleAccessesRootExternalAccessItemsInputItemsAttr= ruleAccessesRootExternalAccessItemsInputItemsAttr EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsInputItemsAttr=ruleAccessesRootExternalAccessItemsInputItemsAttr();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsInputItemsAttr; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItemsAttr"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItemsAttr"
    // InternalAccessesParser.g:1394:1: ruleAccessesRootExternalAccessItemsInputItemsAttr returns [EObject current=null] : (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsInputItemsAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_attr_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1400:2: ( (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:1401:2: (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:1401:2: (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:1402:3: otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Attr,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getAttrKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:1410:3: ( (lv_attr_2_0= ruleEString ) )
            // InternalAccessesParser.g:1411:4: (lv_attr_2_0= ruleEString )
            {
            // InternalAccessesParser.g:1411:4: (lv_attr_2_0= ruleEString )
            // InternalAccessesParser.g:1412:5: lv_attr_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getAttrEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attr_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrRule());
            					}
            					set(
            						current,
            						"attr",
            						lv_attr_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItemsAttr"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItemsAPIInput"
    // InternalAccessesParser.g:1433:1: entryRuleAccessesRootExternalAccessItemsInputItemsAPIInput returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsInputItemsAPIInput= ruleAccessesRootExternalAccessItemsInputItemsAPIInput EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsInputItemsAPIInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsInputItemsAPIInput = null;


        try {
            // InternalAccessesParser.g:1433:90: (iv_ruleAccessesRootExternalAccessItemsInputItemsAPIInput= ruleAccessesRootExternalAccessItemsInputItemsAPIInput EOF )
            // InternalAccessesParser.g:1434:2: iv_ruleAccessesRootExternalAccessItemsInputItemsAPIInput= ruleAccessesRootExternalAccessItemsInputItemsAPIInput EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsInputItemsAPIInput=ruleAccessesRootExternalAccessItemsInputItemsAPIInput();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsInputItemsAPIInput; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItemsAPIInput"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItemsAPIInput"
    // InternalAccessesParser.g:1440:1: ruleAccessesRootExternalAccessItemsInputItemsAPIInput returns [EObject current=null] : (otherlv_0= APIInput otherlv_1= Colon ( (lv_APIInput_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsInputItemsAPIInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_APIInput_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1446:2: ( (otherlv_0= APIInput otherlv_1= Colon ( (lv_APIInput_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:1447:2: (otherlv_0= APIInput otherlv_1= Colon ( (lv_APIInput_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:1447:2: (otherlv_0= APIInput otherlv_1= Colon ( (lv_APIInput_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:1448:3: otherlv_0= APIInput otherlv_1= Colon ( (lv_APIInput_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,APIInput,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getAPIInputKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:1456:3: ( (lv_APIInput_2_0= ruleEString ) )
            // InternalAccessesParser.g:1457:4: (lv_APIInput_2_0= ruleEString )
            {
            // InternalAccessesParser.g:1457:4: (lv_APIInput_2_0= ruleEString )
            // InternalAccessesParser.g:1458:5: lv_APIInput_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getAPIInputEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_APIInput_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputRule());
            					}
            					set(
            						current,
            						"APIInput",
            						lv_APIInput_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItemsAPIInput"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItemsWay"
    // InternalAccessesParser.g:1479:1: entryRuleAccessesRootExternalAccessItemsInputItemsWay returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsInputItemsWay= ruleAccessesRootExternalAccessItemsInputItemsWay EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsInputItemsWay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsInputItemsWay = null;


        try {
            // InternalAccessesParser.g:1479:85: (iv_ruleAccessesRootExternalAccessItemsInputItemsWay= ruleAccessesRootExternalAccessItemsInputItemsWay EOF )
            // InternalAccessesParser.g:1480:2: iv_ruleAccessesRootExternalAccessItemsInputItemsWay= ruleAccessesRootExternalAccessItemsInputItemsWay EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsInputItemsWay=ruleAccessesRootExternalAccessItemsInputItemsWay();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsInputItemsWay; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItemsWay"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItemsWay"
    // InternalAccessesParser.g:1486:1: ruleAccessesRootExternalAccessItemsInputItemsWay returns [EObject current=null] : (otherlv_0= Way otherlv_1= Colon ( (lv_way_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsInputItemsWay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_way_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1492:2: ( (otherlv_0= Way otherlv_1= Colon ( (lv_way_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:1493:2: (otherlv_0= Way otherlv_1= Colon ( (lv_way_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:1493:2: (otherlv_0= Way otherlv_1= Colon ( (lv_way_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:1494:3: otherlv_0= Way otherlv_1= Colon ( (lv_way_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Way,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getWayKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:1502:3: ( (lv_way_2_0= ruleEString ) )
            // InternalAccessesParser.g:1503:4: (lv_way_2_0= ruleEString )
            {
            // InternalAccessesParser.g:1503:4: (lv_way_2_0= ruleEString )
            // InternalAccessesParser.g:1504:5: lv_way_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getWayEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_way_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayRule());
            					}
            					set(
            						current,
            						"way",
            						lv_way_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItemsWay"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItemsValue"
    // InternalAccessesParser.g:1525:1: entryRuleAccessesRootExternalAccessItemsInputItemsValue returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsInputItemsValue= ruleAccessesRootExternalAccessItemsInputItemsValue EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsInputItemsValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsInputItemsValue = null;


        try {
            // InternalAccessesParser.g:1525:87: (iv_ruleAccessesRootExternalAccessItemsInputItemsValue= ruleAccessesRootExternalAccessItemsInputItemsValue EOF )
            // InternalAccessesParser.g:1526:2: iv_ruleAccessesRootExternalAccessItemsInputItemsValue= ruleAccessesRootExternalAccessItemsInputItemsValue EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsInputItemsValue=ruleAccessesRootExternalAccessItemsInputItemsValue();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsInputItemsValue; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItemsValue"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItemsValue"
    // InternalAccessesParser.g:1532:1: ruleAccessesRootExternalAccessItemsInputItemsValue returns [EObject current=null] : (otherlv_0= Value otherlv_1= Colon ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsInputItemsValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1538:2: ( (otherlv_0= Value otherlv_1= Colon ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:1539:2: (otherlv_0= Value otherlv_1= Colon ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:1539:2: (otherlv_0= Value otherlv_1= Colon ( (lv_value_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:1540:3: otherlv_0= Value otherlv_1= Colon ( (lv_value_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Value,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getValueKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:1548:3: ( (lv_value_2_0= ruleEString ) )
            // InternalAccessesParser.g:1549:4: (lv_value_2_0= ruleEString )
            {
            // InternalAccessesParser.g:1549:4: (lv_value_2_0= ruleEString )
            // InternalAccessesParser.g:1550:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItemsValue"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOutputItems"
    // InternalAccessesParser.g:1571:1: entryRuleAccessesRootExternalAccessItemsOutputItems returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsOutputItems= ruleAccessesRootExternalAccessItemsOutputItems EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsOutputItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsOutputItems = null;


        try {
            // InternalAccessesParser.g:1571:83: (iv_ruleAccessesRootExternalAccessItemsOutputItems= ruleAccessesRootExternalAccessItemsOutputItems EOF )
            // InternalAccessesParser.g:1572:2: iv_ruleAccessesRootExternalAccessItemsOutputItems= ruleAccessesRootExternalAccessItemsOutputItems EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsOutputItems=ruleAccessesRootExternalAccessItemsOutputItems();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsOutputItems; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOutputItems"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOutputItems"
    // InternalAccessesParser.g:1578:1: ruleAccessesRootExternalAccessItemsOutputItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleAccessesRootExternalAccessItemsOutputItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1584:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalAccessesParser.g:1585:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalAccessesParser.g:1585:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalAccessesParser.g:1586:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalAccessesParser.g:1586:3: ()
            // InternalAccessesParser.g:1587:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getAccessesRootExternalAccessItemsOutputItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAccessesParser.g:1597:3: ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==APIOutput||LA23_0==Attr) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAccessesParser.g:1598:4: ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) )*
                    {
                    // InternalAccessesParser.g:1598:4: ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) )
                    // InternalAccessesParser.g:1599:5: (lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract )
                    {
                    // InternalAccessesParser.g:1599:5: (lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract )
                    // InternalAccessesParser.g:1600:6: lv_items_2_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"accesses.accesses.Accesses.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAccessesParser.g:1617:4: (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalAccessesParser.g:1618:5: otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_19); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAccessesParser.g:1622:5: ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) )
                    	    // InternalAccessesParser.g:1623:6: (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract )
                    	    {
                    	    // InternalAccessesParser.g:1623:6: (lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract )
                    	    // InternalAccessesParser.g:1624:7: lv_items_4_0= ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"accesses.accesses.Accesses.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract");
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

            			newLeafNode(otherlv_5, grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOutputItems"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOutputItemsAttr"
    // InternalAccessesParser.g:1651:1: entryRuleAccessesRootExternalAccessItemsOutputItemsAttr returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsOutputItemsAttr= ruleAccessesRootExternalAccessItemsOutputItemsAttr EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsOutputItemsAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsOutputItemsAttr = null;


        try {
            // InternalAccessesParser.g:1651:87: (iv_ruleAccessesRootExternalAccessItemsOutputItemsAttr= ruleAccessesRootExternalAccessItemsOutputItemsAttr EOF )
            // InternalAccessesParser.g:1652:2: iv_ruleAccessesRootExternalAccessItemsOutputItemsAttr= ruleAccessesRootExternalAccessItemsOutputItemsAttr EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsOutputItemsAttr=ruleAccessesRootExternalAccessItemsOutputItemsAttr();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsOutputItemsAttr; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOutputItemsAttr"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOutputItemsAttr"
    // InternalAccessesParser.g:1658:1: ruleAccessesRootExternalAccessItemsOutputItemsAttr returns [EObject current=null] : (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsOutputItemsAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_attr_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1664:2: ( (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:1665:2: (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:1665:2: (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:1666:3: otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Attr,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getAttrKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:1674:3: ( (lv_attr_2_0= ruleEString ) )
            // InternalAccessesParser.g:1675:4: (lv_attr_2_0= ruleEString )
            {
            // InternalAccessesParser.g:1675:4: (lv_attr_2_0= ruleEString )
            // InternalAccessesParser.g:1676:5: lv_attr_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getAttrEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attr_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrRule());
            					}
            					set(
            						current,
            						"attr",
            						lv_attr_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOutputItemsAttr"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOutputItemsAPIOutput"
    // InternalAccessesParser.g:1697:1: entryRuleAccessesRootExternalAccessItemsOutputItemsAPIOutput returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput= ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsOutputItemsAPIOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput = null;


        try {
            // InternalAccessesParser.g:1697:92: (iv_ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput= ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput EOF )
            // InternalAccessesParser.g:1698:2: iv_ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput= ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput=ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOutputItemsAPIOutput"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput"
    // InternalAccessesParser.g:1704:1: ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput returns [EObject current=null] : (otherlv_0= APIOutput otherlv_1= Colon ( (lv_APIOutput_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_APIOutput_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1710:2: ( (otherlv_0= APIOutput otherlv_1= Colon ( (lv_APIOutput_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:1711:2: (otherlv_0= APIOutput otherlv_1= Colon ( (lv_APIOutput_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:1711:2: (otherlv_0= APIOutput otherlv_1= Colon ( (lv_APIOutput_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:1712:3: otherlv_0= APIOutput otherlv_1= Colon ( (lv_APIOutput_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,APIOutput,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getAPIOutputKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:1720:3: ( (lv_APIOutput_2_0= ruleEString ) )
            // InternalAccessesParser.g:1721:4: (lv_APIOutput_2_0= ruleEString )
            {
            // InternalAccessesParser.g:1721:4: (lv_APIOutput_2_0= ruleEString )
            // InternalAccessesParser.g:1722:5: lv_APIOutput_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getAPIOutputEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_APIOutput_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputRule());
            					}
            					set(
            						current,
            						"APIOutput",
            						lv_APIOutput_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsBodyItems"
    // InternalAccessesParser.g:1743:1: entryRuleAccessesRootExternalAccessItemsBodyItems returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsBodyItems= ruleAccessesRootExternalAccessItemsBodyItems EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsBodyItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsBodyItems = null;


        try {
            // InternalAccessesParser.g:1743:81: (iv_ruleAccessesRootExternalAccessItemsBodyItems= ruleAccessesRootExternalAccessItemsBodyItems EOF )
            // InternalAccessesParser.g:1744:2: iv_ruleAccessesRootExternalAccessItemsBodyItems= ruleAccessesRootExternalAccessItemsBodyItems EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsBodyItems=ruleAccessesRootExternalAccessItemsBodyItems();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsBodyItems; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsBodyItems"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsBodyItems"
    // InternalAccessesParser.g:1750:1: ruleAccessesRootExternalAccessItemsBodyItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleAccessesRootExternalAccessItemsBodyItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1756:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalAccessesParser.g:1757:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalAccessesParser.g:1757:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalAccessesParser.g:1758:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalAccessesParser.g:1758:3: ()
            // InternalAccessesParser.g:1759:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getAccessesRootExternalAccessItemsBodyItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAccessesParser.g:1769:3: ( ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==APIBody||LA25_0==Attr) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAccessesParser.g:1770:4: ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) )*
                    {
                    // InternalAccessesParser.g:1770:4: ( (lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) )
                    // InternalAccessesParser.g:1771:5: (lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract )
                    {
                    // InternalAccessesParser.g:1771:5: (lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract )
                    // InternalAccessesParser.g:1772:6: lv_items_2_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"accesses.accesses.Accesses.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAccessesParser.g:1789:4: (otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalAccessesParser.g:1790:5: otherlv_3= Comma ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_21); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAccessesParser.g:1794:5: ( (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) )
                    	    // InternalAccessesParser.g:1795:6: (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract )
                    	    {
                    	    // InternalAccessesParser.g:1795:6: (lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract )
                    	    // InternalAccessesParser.g:1796:7: lv_items_4_0= ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"accesses.accesses.Accesses.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract");
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

            			newLeafNode(otherlv_5, grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsBodyItems"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsBodyItemsAttr"
    // InternalAccessesParser.g:1823:1: entryRuleAccessesRootExternalAccessItemsBodyItemsAttr returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsBodyItemsAttr= ruleAccessesRootExternalAccessItemsBodyItemsAttr EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsBodyItemsAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsBodyItemsAttr = null;


        try {
            // InternalAccessesParser.g:1823:85: (iv_ruleAccessesRootExternalAccessItemsBodyItemsAttr= ruleAccessesRootExternalAccessItemsBodyItemsAttr EOF )
            // InternalAccessesParser.g:1824:2: iv_ruleAccessesRootExternalAccessItemsBodyItemsAttr= ruleAccessesRootExternalAccessItemsBodyItemsAttr EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsBodyItemsAttr=ruleAccessesRootExternalAccessItemsBodyItemsAttr();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsBodyItemsAttr; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsBodyItemsAttr"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsBodyItemsAttr"
    // InternalAccessesParser.g:1830:1: ruleAccessesRootExternalAccessItemsBodyItemsAttr returns [EObject current=null] : (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsBodyItemsAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_attr_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1836:2: ( (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:1837:2: (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:1837:2: (otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:1838:3: otherlv_0= Attr otherlv_1= Colon ( (lv_attr_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Attr,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getAttrKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:1846:3: ( (lv_attr_2_0= ruleEString ) )
            // InternalAccessesParser.g:1847:4: (lv_attr_2_0= ruleEString )
            {
            // InternalAccessesParser.g:1847:4: (lv_attr_2_0= ruleEString )
            // InternalAccessesParser.g:1848:5: lv_attr_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getAttrEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attr_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrRule());
            					}
            					set(
            						current,
            						"attr",
            						lv_attr_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsBodyItemsAttr"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsBodyItemsAPIBody"
    // InternalAccessesParser.g:1869:1: entryRuleAccessesRootExternalAccessItemsBodyItemsAPIBody returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsBodyItemsAPIBody= ruleAccessesRootExternalAccessItemsBodyItemsAPIBody EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsBodyItemsAPIBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsBodyItemsAPIBody = null;


        try {
            // InternalAccessesParser.g:1869:88: (iv_ruleAccessesRootExternalAccessItemsBodyItemsAPIBody= ruleAccessesRootExternalAccessItemsBodyItemsAPIBody EOF )
            // InternalAccessesParser.g:1870:2: iv_ruleAccessesRootExternalAccessItemsBodyItemsAPIBody= ruleAccessesRootExternalAccessItemsBodyItemsAPIBody EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsBodyItemsAPIBody=ruleAccessesRootExternalAccessItemsBodyItemsAPIBody();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsBodyItemsAPIBody; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsBodyItemsAPIBody"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsBodyItemsAPIBody"
    // InternalAccessesParser.g:1876:1: ruleAccessesRootExternalAccessItemsBodyItemsAPIBody returns [EObject current=null] : (otherlv_0= APIBody otherlv_1= Colon ( (lv_APIBody_2_0= ruleEString ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsBodyItemsAPIBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_APIBody_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1882:2: ( (otherlv_0= APIBody otherlv_1= Colon ( (lv_APIBody_2_0= ruleEString ) ) ) )
            // InternalAccessesParser.g:1883:2: (otherlv_0= APIBody otherlv_1= Colon ( (lv_APIBody_2_0= ruleEString ) ) )
            {
            // InternalAccessesParser.g:1883:2: (otherlv_0= APIBody otherlv_1= Colon ( (lv_APIBody_2_0= ruleEString ) ) )
            // InternalAccessesParser.g:1884:3: otherlv_0= APIBody otherlv_1= Colon ( (lv_APIBody_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,APIBody,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getAPIBodyKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:1892:3: ( (lv_APIBody_2_0= ruleEString ) )
            // InternalAccessesParser.g:1893:4: (lv_APIBody_2_0= ruleEString )
            {
            // InternalAccessesParser.g:1893:4: (lv_APIBody_2_0= ruleEString )
            // InternalAccessesParser.g:1894:5: lv_APIBody_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getAPIBodyEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_APIBody_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyRule());
            					}
            					set(
            						current,
            						"APIBody",
            						lv_APIBody_2_0,
            						"accesses.accesses.Accesses.EString");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsBodyItemsAPIBody"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnChange"
    // InternalAccessesParser.g:1915:1: entryRuleAccessesRootExternalAccessItemsTriggerOnChange returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsTriggerOnChange= ruleAccessesRootExternalAccessItemsTriggerOnChange EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsTriggerOnChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsTriggerOnChange = null;


        try {
            // InternalAccessesParser.g:1915:87: (iv_ruleAccessesRootExternalAccessItemsTriggerOnChange= ruleAccessesRootExternalAccessItemsTriggerOnChange EOF )
            // InternalAccessesParser.g:1916:2: iv_ruleAccessesRootExternalAccessItemsTriggerOnChange= ruleAccessesRootExternalAccessItemsTriggerOnChange EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsTriggerOnChange=ruleAccessesRootExternalAccessItemsTriggerOnChange();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsTriggerOnChange; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnChange"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnChange"
    // InternalAccessesParser.g:1922:1: ruleAccessesRootExternalAccessItemsTriggerOnChange returns [EObject current=null] : (otherlv_0= OnChange otherlv_1= Colon ( (lv_onChange_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsTriggerOnChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_onChange_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1928:2: ( (otherlv_0= OnChange otherlv_1= Colon ( (lv_onChange_2_0= ruleEBooleanObject ) ) ) )
            // InternalAccessesParser.g:1929:2: (otherlv_0= OnChange otherlv_1= Colon ( (lv_onChange_2_0= ruleEBooleanObject ) ) )
            {
            // InternalAccessesParser.g:1929:2: (otherlv_0= OnChange otherlv_1= Colon ( (lv_onChange_2_0= ruleEBooleanObject ) ) )
            // InternalAccessesParser.g:1930:3: otherlv_0= OnChange otherlv_1= Colon ( (lv_onChange_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,OnChange,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getOnChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:1938:3: ( (lv_onChange_2_0= ruleEBooleanObject ) )
            // InternalAccessesParser.g:1939:4: (lv_onChange_2_0= ruleEBooleanObject )
            {
            // InternalAccessesParser.g:1939:4: (lv_onChange_2_0= ruleEBooleanObject )
            // InternalAccessesParser.g:1940:5: lv_onChange_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getOnChangeEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_onChange_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeRule());
            					}
            					set(
            						current,
            						"onChange",
            						lv_onChange_2_0,
            						"accesses.accesses.Accesses.EBooleanObject");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnChange"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnCreate"
    // InternalAccessesParser.g:1961:1: entryRuleAccessesRootExternalAccessItemsTriggerOnCreate returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsTriggerOnCreate= ruleAccessesRootExternalAccessItemsTriggerOnCreate EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsTriggerOnCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsTriggerOnCreate = null;


        try {
            // InternalAccessesParser.g:1961:87: (iv_ruleAccessesRootExternalAccessItemsTriggerOnCreate= ruleAccessesRootExternalAccessItemsTriggerOnCreate EOF )
            // InternalAccessesParser.g:1962:2: iv_ruleAccessesRootExternalAccessItemsTriggerOnCreate= ruleAccessesRootExternalAccessItemsTriggerOnCreate EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsTriggerOnCreate=ruleAccessesRootExternalAccessItemsTriggerOnCreate();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsTriggerOnCreate; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnCreate"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnCreate"
    // InternalAccessesParser.g:1968:1: ruleAccessesRootExternalAccessItemsTriggerOnCreate returns [EObject current=null] : (otherlv_0= OnCreate otherlv_1= Colon ( (lv_onCreate_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsTriggerOnCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_onCreate_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:1974:2: ( (otherlv_0= OnCreate otherlv_1= Colon ( (lv_onCreate_2_0= ruleEBooleanObject ) ) ) )
            // InternalAccessesParser.g:1975:2: (otherlv_0= OnCreate otherlv_1= Colon ( (lv_onCreate_2_0= ruleEBooleanObject ) ) )
            {
            // InternalAccessesParser.g:1975:2: (otherlv_0= OnCreate otherlv_1= Colon ( (lv_onCreate_2_0= ruleEBooleanObject ) ) )
            // InternalAccessesParser.g:1976:3: otherlv_0= OnCreate otherlv_1= Colon ( (lv_onCreate_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,OnCreate,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getOnCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:1984:3: ( (lv_onCreate_2_0= ruleEBooleanObject ) )
            // InternalAccessesParser.g:1985:4: (lv_onCreate_2_0= ruleEBooleanObject )
            {
            // InternalAccessesParser.g:1985:4: (lv_onCreate_2_0= ruleEBooleanObject )
            // InternalAccessesParser.g:1986:5: lv_onCreate_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getOnCreateEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_onCreate_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateRule());
            					}
            					set(
            						current,
            						"onCreate",
            						lv_onCreate_2_0,
            						"accesses.accesses.Accesses.EBooleanObject");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnCreate"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnMove"
    // InternalAccessesParser.g:2007:1: entryRuleAccessesRootExternalAccessItemsTriggerOnMove returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsTriggerOnMove= ruleAccessesRootExternalAccessItemsTriggerOnMove EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsTriggerOnMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsTriggerOnMove = null;


        try {
            // InternalAccessesParser.g:2007:85: (iv_ruleAccessesRootExternalAccessItemsTriggerOnMove= ruleAccessesRootExternalAccessItemsTriggerOnMove EOF )
            // InternalAccessesParser.g:2008:2: iv_ruleAccessesRootExternalAccessItemsTriggerOnMove= ruleAccessesRootExternalAccessItemsTriggerOnMove EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsTriggerOnMove=ruleAccessesRootExternalAccessItemsTriggerOnMove();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsTriggerOnMove; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnMove"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnMove"
    // InternalAccessesParser.g:2014:1: ruleAccessesRootExternalAccessItemsTriggerOnMove returns [EObject current=null] : (otherlv_0= OnMove otherlv_1= Colon ( (lv_onMove_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsTriggerOnMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_onMove_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:2020:2: ( (otherlv_0= OnMove otherlv_1= Colon ( (lv_onMove_2_0= ruleEBooleanObject ) ) ) )
            // InternalAccessesParser.g:2021:2: (otherlv_0= OnMove otherlv_1= Colon ( (lv_onMove_2_0= ruleEBooleanObject ) ) )
            {
            // InternalAccessesParser.g:2021:2: (otherlv_0= OnMove otherlv_1= Colon ( (lv_onMove_2_0= ruleEBooleanObject ) ) )
            // InternalAccessesParser.g:2022:3: otherlv_0= OnMove otherlv_1= Colon ( (lv_onMove_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,OnMove,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getOnMoveKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:2030:3: ( (lv_onMove_2_0= ruleEBooleanObject ) )
            // InternalAccessesParser.g:2031:4: (lv_onMove_2_0= ruleEBooleanObject )
            {
            // InternalAccessesParser.g:2031:4: (lv_onMove_2_0= ruleEBooleanObject )
            // InternalAccessesParser.g:2032:5: lv_onMove_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getOnMoveEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_onMove_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveRule());
            					}
            					set(
            						current,
            						"onMove",
            						lv_onMove_2_0,
            						"accesses.accesses.Accesses.EBooleanObject");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnMove"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnDelete"
    // InternalAccessesParser.g:2053:1: entryRuleAccessesRootExternalAccessItemsTriggerOnDelete returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsTriggerOnDelete= ruleAccessesRootExternalAccessItemsTriggerOnDelete EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsTriggerOnDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsTriggerOnDelete = null;


        try {
            // InternalAccessesParser.g:2053:87: (iv_ruleAccessesRootExternalAccessItemsTriggerOnDelete= ruleAccessesRootExternalAccessItemsTriggerOnDelete EOF )
            // InternalAccessesParser.g:2054:2: iv_ruleAccessesRootExternalAccessItemsTriggerOnDelete= ruleAccessesRootExternalAccessItemsTriggerOnDelete EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsTriggerOnDelete=ruleAccessesRootExternalAccessItemsTriggerOnDelete();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsTriggerOnDelete; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnDelete"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnDelete"
    // InternalAccessesParser.g:2060:1: ruleAccessesRootExternalAccessItemsTriggerOnDelete returns [EObject current=null] : (otherlv_0= OnDelete otherlv_1= Colon ( (lv_onDelete_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsTriggerOnDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_onDelete_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:2066:2: ( (otherlv_0= OnDelete otherlv_1= Colon ( (lv_onDelete_2_0= ruleEBooleanObject ) ) ) )
            // InternalAccessesParser.g:2067:2: (otherlv_0= OnDelete otherlv_1= Colon ( (lv_onDelete_2_0= ruleEBooleanObject ) ) )
            {
            // InternalAccessesParser.g:2067:2: (otherlv_0= OnDelete otherlv_1= Colon ( (lv_onDelete_2_0= ruleEBooleanObject ) ) )
            // InternalAccessesParser.g:2068:3: otherlv_0= OnDelete otherlv_1= Colon ( (lv_onDelete_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,OnDelete,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getOnDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:2076:3: ( (lv_onDelete_2_0= ruleEBooleanObject ) )
            // InternalAccessesParser.g:2077:4: (lv_onDelete_2_0= ruleEBooleanObject )
            {
            // InternalAccessesParser.g:2077:4: (lv_onDelete_2_0= ruleEBooleanObject )
            // InternalAccessesParser.g:2078:5: lv_onDelete_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getOnDeleteEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_onDelete_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteRule());
            					}
            					set(
            						current,
            						"onDelete",
            						lv_onDelete_2_0,
            						"accesses.accesses.Accesses.EBooleanObject");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnDelete"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnAccess"
    // InternalAccessesParser.g:2099:1: entryRuleAccessesRootExternalAccessItemsTriggerOnAccess returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsTriggerOnAccess= ruleAccessesRootExternalAccessItemsTriggerOnAccess EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsTriggerOnAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsTriggerOnAccess = null;


        try {
            // InternalAccessesParser.g:2099:87: (iv_ruleAccessesRootExternalAccessItemsTriggerOnAccess= ruleAccessesRootExternalAccessItemsTriggerOnAccess EOF )
            // InternalAccessesParser.g:2100:2: iv_ruleAccessesRootExternalAccessItemsTriggerOnAccess= ruleAccessesRootExternalAccessItemsTriggerOnAccess EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsTriggerOnAccess=ruleAccessesRootExternalAccessItemsTriggerOnAccess();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsTriggerOnAccess; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnAccess"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnAccess"
    // InternalAccessesParser.g:2106:1: ruleAccessesRootExternalAccessItemsTriggerOnAccess returns [EObject current=null] : (otherlv_0= OnAccess otherlv_1= Colon ( (lv_onAccess_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsTriggerOnAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_onAccess_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:2112:2: ( (otherlv_0= OnAccess otherlv_1= Colon ( (lv_onAccess_2_0= ruleEBooleanObject ) ) ) )
            // InternalAccessesParser.g:2113:2: (otherlv_0= OnAccess otherlv_1= Colon ( (lv_onAccess_2_0= ruleEBooleanObject ) ) )
            {
            // InternalAccessesParser.g:2113:2: (otherlv_0= OnAccess otherlv_1= Colon ( (lv_onAccess_2_0= ruleEBooleanObject ) ) )
            // InternalAccessesParser.g:2114:3: otherlv_0= OnAccess otherlv_1= Colon ( (lv_onAccess_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,OnAccess,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getOnAccessKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:2122:3: ( (lv_onAccess_2_0= ruleEBooleanObject ) )
            // InternalAccessesParser.g:2123:4: (lv_onAccess_2_0= ruleEBooleanObject )
            {
            // InternalAccessesParser.g:2123:4: (lv_onAccess_2_0= ruleEBooleanObject )
            // InternalAccessesParser.g:2124:5: lv_onAccess_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getOnAccessEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_onAccess_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessRule());
            					}
            					set(
            						current,
            						"onAccess",
            						lv_onAccess_2_0,
            						"accesses.accesses.Accesses.EBooleanObject");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnAccess"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnLoad"
    // InternalAccessesParser.g:2145:1: entryRuleAccessesRootExternalAccessItemsTriggerOnLoad returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsTriggerOnLoad= ruleAccessesRootExternalAccessItemsTriggerOnLoad EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsTriggerOnLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsTriggerOnLoad = null;


        try {
            // InternalAccessesParser.g:2145:85: (iv_ruleAccessesRootExternalAccessItemsTriggerOnLoad= ruleAccessesRootExternalAccessItemsTriggerOnLoad EOF )
            // InternalAccessesParser.g:2146:2: iv_ruleAccessesRootExternalAccessItemsTriggerOnLoad= ruleAccessesRootExternalAccessItemsTriggerOnLoad EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsTriggerOnLoad=ruleAccessesRootExternalAccessItemsTriggerOnLoad();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsTriggerOnLoad; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnLoad"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnLoad"
    // InternalAccessesParser.g:2152:1: ruleAccessesRootExternalAccessItemsTriggerOnLoad returns [EObject current=null] : (otherlv_0= OnLoad otherlv_1= Colon ( (lv_onLoad_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsTriggerOnLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_onLoad_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:2158:2: ( (otherlv_0= OnLoad otherlv_1= Colon ( (lv_onLoad_2_0= ruleEBooleanObject ) ) ) )
            // InternalAccessesParser.g:2159:2: (otherlv_0= OnLoad otherlv_1= Colon ( (lv_onLoad_2_0= ruleEBooleanObject ) ) )
            {
            // InternalAccessesParser.g:2159:2: (otherlv_0= OnLoad otherlv_1= Colon ( (lv_onLoad_2_0= ruleEBooleanObject ) ) )
            // InternalAccessesParser.g:2160:3: otherlv_0= OnLoad otherlv_1= Colon ( (lv_onLoad_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,OnLoad,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getOnLoadKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:2168:3: ( (lv_onLoad_2_0= ruleEBooleanObject ) )
            // InternalAccessesParser.g:2169:4: (lv_onLoad_2_0= ruleEBooleanObject )
            {
            // InternalAccessesParser.g:2169:4: (lv_onLoad_2_0= ruleEBooleanObject )
            // InternalAccessesParser.g:2170:5: lv_onLoad_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getOnLoadEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_onLoad_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadRule());
            					}
            					set(
            						current,
            						"onLoad",
            						lv_onLoad_2_0,
            						"accesses.accesses.Accesses.EBooleanObject");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnLoad"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerTimeTrigger"
    // InternalAccessesParser.g:2191:1: entryRuleAccessesRootExternalAccessItemsTriggerTimeTrigger returns [EObject current=null] : iv_ruleAccessesRootExternalAccessItemsTriggerTimeTrigger= ruleAccessesRootExternalAccessItemsTriggerTimeTrigger EOF ;
    public final EObject entryRuleAccessesRootExternalAccessItemsTriggerTimeTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessesRootExternalAccessItemsTriggerTimeTrigger = null;


        try {
            // InternalAccessesParser.g:2191:90: (iv_ruleAccessesRootExternalAccessItemsTriggerTimeTrigger= ruleAccessesRootExternalAccessItemsTriggerTimeTrigger EOF )
            // InternalAccessesParser.g:2192:2: iv_ruleAccessesRootExternalAccessItemsTriggerTimeTrigger= ruleAccessesRootExternalAccessItemsTriggerTimeTrigger EOF
            {
             newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessesRootExternalAccessItemsTriggerTimeTrigger=ruleAccessesRootExternalAccessItemsTriggerTimeTrigger();

            state._fsp--;

             current =iv_ruleAccessesRootExternalAccessItemsTriggerTimeTrigger; 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerTimeTrigger"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerTimeTrigger"
    // InternalAccessesParser.g:2198:1: ruleAccessesRootExternalAccessItemsTriggerTimeTrigger returns [EObject current=null] : (otherlv_0= TimeTrigger otherlv_1= Colon ( (lv_timeTrigger_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleAccessesRootExternalAccessItemsTriggerTimeTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_timeTrigger_2_0 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:2204:2: ( (otherlv_0= TimeTrigger otherlv_1= Colon ( (lv_timeTrigger_2_0= ruleEDoubleObject ) ) ) )
            // InternalAccessesParser.g:2205:2: (otherlv_0= TimeTrigger otherlv_1= Colon ( (lv_timeTrigger_2_0= ruleEDoubleObject ) ) )
            {
            // InternalAccessesParser.g:2205:2: (otherlv_0= TimeTrigger otherlv_1= Colon ( (lv_timeTrigger_2_0= ruleEDoubleObject ) ) )
            // InternalAccessesParser.g:2206:3: otherlv_0= TimeTrigger otherlv_1= Colon ( (lv_timeTrigger_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,TimeTrigger,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getTimeTriggerKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getColonKeyword_1());
            		
            // InternalAccessesParser.g:2214:3: ( (lv_timeTrigger_2_0= ruleEDoubleObject ) )
            // InternalAccessesParser.g:2215:4: (lv_timeTrigger_2_0= ruleEDoubleObject )
            {
            // InternalAccessesParser.g:2215:4: (lv_timeTrigger_2_0= ruleEDoubleObject )
            // InternalAccessesParser.g:2216:5: lv_timeTrigger_2_0= ruleEDoubleObject
            {

            					newCompositeNode(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getTimeTriggerEDoubleObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_timeTrigger_2_0=ruleEDoubleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerRule());
            					}
            					set(
            						current,
            						"timeTrigger",
            						lv_timeTrigger_2_0,
            						"accesses.accesses.Accesses.EDoubleObject");
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
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerTimeTrigger"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalAccessesParser.g:2237:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalAccessesParser.g:2237:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalAccessesParser.g:2238:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
            {
             newCompositeNode(grammarAccess.getEBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBooleanObject=ruleEBooleanObject();

            state._fsp--;

             current =iv_ruleEBooleanObject.getText(); 
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
    // $ANTLR end "entryRuleEBooleanObject"


    // $ANTLR start "ruleEBooleanObject"
    // InternalAccessesParser.g:2244:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAccessesParser.g:2250:2: ( (kw= True | kw= False ) )
            // InternalAccessesParser.g:2251:2: (kw= True | kw= False )
            {
            // InternalAccessesParser.g:2251:2: (kw= True | kw= False )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==True) ) {
                alt26=1;
            }
            else if ( (LA26_0==False) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalAccessesParser.g:2252:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:2258:3: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBooleanObject"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalAccessesParser.g:2267:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalAccessesParser.g:2267:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalAccessesParser.g:2268:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
            {
             newCompositeNode(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDoubleObject=ruleEDoubleObject();

            state._fsp--;

             current =iv_ruleEDoubleObject.getText(); 
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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalAccessesParser.g:2274:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalAccessesParser.g:2280:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalAccessesParser.g:2281:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalAccessesParser.g:2281:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_E_INT) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_E_DOUBLE) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAccessesParser.g:2282:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); 

                    			current.merge(this_E_INT_0);
                    		

                    			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:2290:3: this_E_DOUBLE_1= RULE_E_DOUBLE
                    {
                    this_E_DOUBLE_1=(Token)match(input,RULE_E_DOUBLE,FOLLOW_2); 

                    			current.merge(this_E_DOUBLE_1);
                    		

                    			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalAccessesParser.g:2301:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalAccessesParser.g:2301:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalAccessesParser.g:2302:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalAccessesParser.g:2308:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalAccessesParser.g:2314:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalAccessesParser.g:2315:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalAccessesParser.g:2315:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=ExternalAccess && LA28_0<=Way)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalAccessesParser.g:2316:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:2324:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalAccessesParser.g:2338:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalAccessesParser.g:2338:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalAccessesParser.g:2339:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalAccessesParser.g:2345:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= APIOutput | kw= APIBody | kw= OnCreate | kw= Method | kw= OnChange | kw= Auth | kw= ExternalAccess | kw= Ontological | kw= Trigger | kw= Body | kw= OnMove | kw= TimeTrigger | kw= Way | kw= Output | kw= Path | kw= Input | kw= OnDelete | kw= Classname | kw= Name | kw= APIInput | kw= OnLoad | kw= Attr | kw= Value | kw= OnAccess ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAccessesParser.g:2351:2: ( (kw= APIOutput | kw= APIBody | kw= OnCreate | kw= Method | kw= OnChange | kw= Auth | kw= ExternalAccess | kw= Ontological | kw= Trigger | kw= Body | kw= OnMove | kw= TimeTrigger | kw= Way | kw= Output | kw= Path | kw= Input | kw= OnDelete | kw= Classname | kw= Name | kw= APIInput | kw= OnLoad | kw= Attr | kw= Value | kw= OnAccess ) )
            // InternalAccessesParser.g:2352:2: (kw= APIOutput | kw= APIBody | kw= OnCreate | kw= Method | kw= OnChange | kw= Auth | kw= ExternalAccess | kw= Ontological | kw= Trigger | kw= Body | kw= OnMove | kw= TimeTrigger | kw= Way | kw= Output | kw= Path | kw= Input | kw= OnDelete | kw= Classname | kw= Name | kw= APIInput | kw= OnLoad | kw= Attr | kw= Value | kw= OnAccess )
            {
            // InternalAccessesParser.g:2352:2: (kw= APIOutput | kw= APIBody | kw= OnCreate | kw= Method | kw= OnChange | kw= Auth | kw= ExternalAccess | kw= Ontological | kw= Trigger | kw= Body | kw= OnMove | kw= TimeTrigger | kw= Way | kw= Output | kw= Path | kw= Input | kw= OnDelete | kw= Classname | kw= Name | kw= APIInput | kw= OnLoad | kw= Attr | kw= Value | kw= OnAccess )
            int alt29=24;
            switch ( input.LA(1) ) {
            case APIOutput:
                {
                alt29=1;
                }
                break;
            case APIBody:
                {
                alt29=2;
                }
                break;
            case OnCreate:
                {
                alt29=3;
                }
                break;
            case Method:
                {
                alt29=4;
                }
                break;
            case OnChange:
                {
                alt29=5;
                }
                break;
            case Auth:
                {
                alt29=6;
                }
                break;
            case ExternalAccess:
                {
                alt29=7;
                }
                break;
            case Ontological:
                {
                alt29=8;
                }
                break;
            case Trigger:
                {
                alt29=9;
                }
                break;
            case Body:
                {
                alt29=10;
                }
                break;
            case OnMove:
                {
                alt29=11;
                }
                break;
            case TimeTrigger:
                {
                alt29=12;
                }
                break;
            case Way:
                {
                alt29=13;
                }
                break;
            case Output:
                {
                alt29=14;
                }
                break;
            case Path:
                {
                alt29=15;
                }
                break;
            case Input:
                {
                alt29=16;
                }
                break;
            case OnDelete:
                {
                alt29=17;
                }
                break;
            case Classname:
                {
                alt29=18;
                }
                break;
            case Name:
                {
                alt29=19;
                }
                break;
            case APIInput:
                {
                alt29=20;
                }
                break;
            case OnLoad:
                {
                alt29=21;
                }
                break;
            case Attr:
                {
                alt29=22;
                }
                break;
            case Value:
                {
                alt29=23;
                }
                break;
            case OnAccess:
                {
                alt29=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalAccessesParser.g:2353:3: kw= APIOutput
                    {
                    kw=(Token)match(input,APIOutput,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAPIOutputKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:2359:3: kw= APIBody
                    {
                    kw=(Token)match(input,APIBody,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAPIBodyKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAccessesParser.g:2365:3: kw= OnCreate
                    {
                    kw=(Token)match(input,OnCreate,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOnCreateKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAccessesParser.g:2371:3: kw= Method
                    {
                    kw=(Token)match(input,Method,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMethodKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAccessesParser.g:2377:3: kw= OnChange
                    {
                    kw=(Token)match(input,OnChange,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOnChangeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAccessesParser.g:2383:3: kw= Auth
                    {
                    kw=(Token)match(input,Auth,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAuthKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAccessesParser.g:2389:3: kw= ExternalAccess
                    {
                    kw=(Token)match(input,ExternalAccess,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExternalAccessKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAccessesParser.g:2395:3: kw= Ontological
                    {
                    kw=(Token)match(input,Ontological,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOntologicalKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAccessesParser.g:2401:3: kw= Trigger
                    {
                    kw=(Token)match(input,Trigger,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTriggerKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalAccessesParser.g:2407:3: kw= Body
                    {
                    kw=(Token)match(input,Body,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBodyKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalAccessesParser.g:2413:3: kw= OnMove
                    {
                    kw=(Token)match(input,OnMove,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOnMoveKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalAccessesParser.g:2419:3: kw= TimeTrigger
                    {
                    kw=(Token)match(input,TimeTrigger,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTimeTriggerKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalAccessesParser.g:2425:3: kw= Way
                    {
                    kw=(Token)match(input,Way,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getWayKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalAccessesParser.g:2431:3: kw= Output
                    {
                    kw=(Token)match(input,Output,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOutputKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalAccessesParser.g:2437:3: kw= Path
                    {
                    kw=(Token)match(input,Path,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPathKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalAccessesParser.g:2443:3: kw= Input
                    {
                    kw=(Token)match(input,Input,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getInputKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalAccessesParser.g:2449:3: kw= OnDelete
                    {
                    kw=(Token)match(input,OnDelete,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOnDeleteKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalAccessesParser.g:2455:3: kw= Classname
                    {
                    kw=(Token)match(input,Classname,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getClassnameKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalAccessesParser.g:2461:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalAccessesParser.g:2467:3: kw= APIInput
                    {
                    kw=(Token)match(input,APIInput,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAPIInputKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalAccessesParser.g:2473:3: kw= OnLoad
                    {
                    kw=(Token)match(input,OnLoad,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOnLoadKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalAccessesParser.g:2479:3: kw= Attr
                    {
                    kw=(Token)match(input,Attr,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAttrKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalAccessesParser.g:2485:3: kw= Value
                    {
                    kw=(Token)match(input,Value,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalAccessesParser.g:2491:3: kw= OnAccess
                    {
                    kw=(Token)match(input,OnAccess,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOnAccessKeyword_23());
                    		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000807998120L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007998120L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000200FFFFFF0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800063C40L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000063C40L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000808600200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008600200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800400080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800404000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000C000000000L});

}
