package codesinfos.codesinfos.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import codesinfos.codesinfos.services.CodesinfosGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCodesinfosParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Classname", "Nodename", "Codes", "Name", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalCodesinfosParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCodesinfosParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCodesinfosParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCodesinfosParser.g"; }



     	private CodesinfosGrammarAccess grammarAccess;

        public InternalCodesinfosParser(TokenStream input, CodesinfosGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CodesinfosRoot";
       	}

       	@Override
       	protected CodesinfosGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCodesinfosRoot"
    // InternalCodesinfosParser.g:57:1: entryRuleCodesinfosRoot returns [EObject current=null] : iv_ruleCodesinfosRoot= ruleCodesinfosRoot EOF ;
    public final EObject entryRuleCodesinfosRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodesinfosRoot = null;


        try {
            // InternalCodesinfosParser.g:57:55: (iv_ruleCodesinfosRoot= ruleCodesinfosRoot EOF )
            // InternalCodesinfosParser.g:58:2: iv_ruleCodesinfosRoot= ruleCodesinfosRoot EOF
            {
             newCompositeNode(grammarAccess.getCodesinfosRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodesinfosRoot=ruleCodesinfosRoot();

            state._fsp--;

             current =iv_ruleCodesinfosRoot; 
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
    // $ANTLR end "entryRuleCodesinfosRoot"


    // $ANTLR start "ruleCodesinfosRoot"
    // InternalCodesinfosParser.g:64:1: ruleCodesinfosRoot returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleCodesinfosRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_codesinfosRoot_2_0 = null;

        EObject lv_codesinfosRoot_4_0 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:70:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalCodesinfosParser.g:71:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalCodesinfosParser.g:71:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalCodesinfosParser.g:72:3: () otherlv_1= LeftCurlyBracket ( ( (lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalCodesinfosParser.g:72:3: ()
            // InternalCodesinfosParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodesinfosRootAccess().getCodesinfosRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCodesinfosRootAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCodesinfosParser.g:83:3: ( ( (lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=Codes && LA2_0<=Name)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCodesinfosParser.g:84:4: ( (lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract ) ) )*
                    {
                    // InternalCodesinfosParser.g:84:4: ( (lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract ) )
                    // InternalCodesinfosParser.g:85:5: (lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract )
                    {
                    // InternalCodesinfosParser.g:85:5: (lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract )
                    // InternalCodesinfosParser.g:86:6: lv_codesinfosRoot_2_0= ruleCodesinfosRootPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootCodesinfosRootPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_codesinfosRoot_2_0=ruleCodesinfosRootPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCodesinfosRootRule());
                    						}
                    						add(
                    							current,
                    							"codesinfosRoot",
                    							lv_codesinfosRoot_2_0,
                    							"codesinfos.codesinfos.Codesinfos.CodesinfosRootPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCodesinfosParser.g:103:4: (otherlv_3= Comma ( (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCodesinfosParser.g:104:5: otherlv_3= Comma ( (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getCodesinfosRootAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalCodesinfosParser.g:108:5: ( (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract ) )
                    	    // InternalCodesinfosParser.g:109:6: (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract )
                    	    {
                    	    // InternalCodesinfosParser.g:109:6: (lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract )
                    	    // InternalCodesinfosParser.g:110:7: lv_codesinfosRoot_4_0= ruleCodesinfosRootPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootCodesinfosRootPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_codesinfosRoot_4_0=ruleCodesinfosRootPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCodesinfosRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"codesinfosRoot",
                    	    								lv_codesinfosRoot_4_0,
                    	    								"codesinfos.codesinfos.Codesinfos.CodesinfosRootPropertiesAbstract");
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

            			newLeafNode(otherlv_5, grammarAccess.getCodesinfosRootAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCodesinfosRoot"


    // $ANTLR start "entryRuleCodesinfosRootPropertiesAbstract"
    // InternalCodesinfosParser.g:137:1: entryRuleCodesinfosRootPropertiesAbstract returns [EObject current=null] : iv_ruleCodesinfosRootPropertiesAbstract= ruleCodesinfosRootPropertiesAbstract EOF ;
    public final EObject entryRuleCodesinfosRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodesinfosRootPropertiesAbstract = null;


        try {
            // InternalCodesinfosParser.g:137:73: (iv_ruleCodesinfosRootPropertiesAbstract= ruleCodesinfosRootPropertiesAbstract EOF )
            // InternalCodesinfosParser.g:138:2: iv_ruleCodesinfosRootPropertiesAbstract= ruleCodesinfosRootPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getCodesinfosRootPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodesinfosRootPropertiesAbstract=ruleCodesinfosRootPropertiesAbstract();

            state._fsp--;

             current =iv_ruleCodesinfosRootPropertiesAbstract; 
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
    // $ANTLR end "entryRuleCodesinfosRootPropertiesAbstract"


    // $ANTLR start "ruleCodesinfosRootPropertiesAbstract"
    // InternalCodesinfosParser.g:144:1: ruleCodesinfosRootPropertiesAbstract returns [EObject current=null] : (this_CodesinfosRootName_0= ruleCodesinfosRootName | this_CodesinfosRootCodes_1= ruleCodesinfosRootCodes ) ;
    public final EObject ruleCodesinfosRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_CodesinfosRootName_0 = null;

        EObject this_CodesinfosRootCodes_1 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:150:2: ( (this_CodesinfosRootName_0= ruleCodesinfosRootName | this_CodesinfosRootCodes_1= ruleCodesinfosRootCodes ) )
            // InternalCodesinfosParser.g:151:2: (this_CodesinfosRootName_0= ruleCodesinfosRootName | this_CodesinfosRootCodes_1= ruleCodesinfosRootCodes )
            {
            // InternalCodesinfosParser.g:151:2: (this_CodesinfosRootName_0= ruleCodesinfosRootName | this_CodesinfosRootCodes_1= ruleCodesinfosRootCodes )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Name) ) {
                alt3=1;
            }
            else if ( (LA3_0==Codes) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCodesinfosParser.g:152:3: this_CodesinfosRootName_0= ruleCodesinfosRootName
                    {

                    			newCompositeNode(grammarAccess.getCodesinfosRootPropertiesAbstractAccess().getCodesinfosRootNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodesinfosRootName_0=ruleCodesinfosRootName();

                    state._fsp--;


                    			current = this_CodesinfosRootName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCodesinfosParser.g:161:3: this_CodesinfosRootCodes_1= ruleCodesinfosRootCodes
                    {

                    			newCompositeNode(grammarAccess.getCodesinfosRootPropertiesAbstractAccess().getCodesinfosRootCodesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodesinfosRootCodes_1=ruleCodesinfosRootCodes();

                    state._fsp--;


                    			current = this_CodesinfosRootCodes_1;
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
    // $ANTLR end "ruleCodesinfosRootPropertiesAbstract"


    // $ANTLR start "entryRuleCodesinfosRootCodesItemsPropertiesAbstract"
    // InternalCodesinfosParser.g:173:1: entryRuleCodesinfosRootCodesItemsPropertiesAbstract returns [EObject current=null] : iv_ruleCodesinfosRootCodesItemsPropertiesAbstract= ruleCodesinfosRootCodesItemsPropertiesAbstract EOF ;
    public final EObject entryRuleCodesinfosRootCodesItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodesinfosRootCodesItemsPropertiesAbstract = null;


        try {
            // InternalCodesinfosParser.g:173:83: (iv_ruleCodesinfosRootCodesItemsPropertiesAbstract= ruleCodesinfosRootCodesItemsPropertiesAbstract EOF )
            // InternalCodesinfosParser.g:174:2: iv_ruleCodesinfosRootCodesItemsPropertiesAbstract= ruleCodesinfosRootCodesItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodesinfosRootCodesItemsPropertiesAbstract=ruleCodesinfosRootCodesItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleCodesinfosRootCodesItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleCodesinfosRootCodesItemsPropertiesAbstract"


    // $ANTLR start "ruleCodesinfosRootCodesItemsPropertiesAbstract"
    // InternalCodesinfosParser.g:180:1: ruleCodesinfosRootCodesItemsPropertiesAbstract returns [EObject current=null] : (this_CodesinfosRootCodesItemsName_0= ruleCodesinfosRootCodesItemsName | this_CodesinfosRootCodesItemsClassname_1= ruleCodesinfosRootCodesItemsClassname | this_CodesinfosRootCodesItemsNodename_2= ruleCodesinfosRootCodesItemsNodename ) ;
    public final EObject ruleCodesinfosRootCodesItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_CodesinfosRootCodesItemsName_0 = null;

        EObject this_CodesinfosRootCodesItemsClassname_1 = null;

        EObject this_CodesinfosRootCodesItemsNodename_2 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:186:2: ( (this_CodesinfosRootCodesItemsName_0= ruleCodesinfosRootCodesItemsName | this_CodesinfosRootCodesItemsClassname_1= ruleCodesinfosRootCodesItemsClassname | this_CodesinfosRootCodesItemsNodename_2= ruleCodesinfosRootCodesItemsNodename ) )
            // InternalCodesinfosParser.g:187:2: (this_CodesinfosRootCodesItemsName_0= ruleCodesinfosRootCodesItemsName | this_CodesinfosRootCodesItemsClassname_1= ruleCodesinfosRootCodesItemsClassname | this_CodesinfosRootCodesItemsNodename_2= ruleCodesinfosRootCodesItemsNodename )
            {
            // InternalCodesinfosParser.g:187:2: (this_CodesinfosRootCodesItemsName_0= ruleCodesinfosRootCodesItemsName | this_CodesinfosRootCodesItemsClassname_1= ruleCodesinfosRootCodesItemsClassname | this_CodesinfosRootCodesItemsNodename_2= ruleCodesinfosRootCodesItemsNodename )
            int alt4=3;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt4=1;
                }
                break;
            case Classname:
                {
                alt4=2;
                }
                break;
            case Nodename:
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
                    // InternalCodesinfosParser.g:188:3: this_CodesinfosRootCodesItemsName_0= ruleCodesinfosRootCodesItemsName
                    {

                    			newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getCodesinfosRootCodesItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodesinfosRootCodesItemsName_0=ruleCodesinfosRootCodesItemsName();

                    state._fsp--;


                    			current = this_CodesinfosRootCodesItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCodesinfosParser.g:197:3: this_CodesinfosRootCodesItemsClassname_1= ruleCodesinfosRootCodesItemsClassname
                    {

                    			newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getCodesinfosRootCodesItemsClassnameParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodesinfosRootCodesItemsClassname_1=ruleCodesinfosRootCodesItemsClassname();

                    state._fsp--;


                    			current = this_CodesinfosRootCodesItemsClassname_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCodesinfosParser.g:206:3: this_CodesinfosRootCodesItemsNodename_2= ruleCodesinfosRootCodesItemsNodename
                    {

                    			newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getCodesinfosRootCodesItemsNodenameParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodesinfosRootCodesItemsNodename_2=ruleCodesinfosRootCodesItemsNodename();

                    state._fsp--;


                    			current = this_CodesinfosRootCodesItemsNodename_2;
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
    // $ANTLR end "ruleCodesinfosRootCodesItemsPropertiesAbstract"


    // $ANTLR start "entryRuleCodesinfosRootName"
    // InternalCodesinfosParser.g:218:1: entryRuleCodesinfosRootName returns [EObject current=null] : iv_ruleCodesinfosRootName= ruleCodesinfosRootName EOF ;
    public final EObject entryRuleCodesinfosRootName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodesinfosRootName = null;


        try {
            // InternalCodesinfosParser.g:218:59: (iv_ruleCodesinfosRootName= ruleCodesinfosRootName EOF )
            // InternalCodesinfosParser.g:219:2: iv_ruleCodesinfosRootName= ruleCodesinfosRootName EOF
            {
             newCompositeNode(grammarAccess.getCodesinfosRootNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodesinfosRootName=ruleCodesinfosRootName();

            state._fsp--;

             current =iv_ruleCodesinfosRootName; 
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
    // $ANTLR end "entryRuleCodesinfosRootName"


    // $ANTLR start "ruleCodesinfosRootName"
    // InternalCodesinfosParser.g:225:1: ruleCodesinfosRootName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleCodesinfosRootName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:231:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalCodesinfosParser.g:232:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalCodesinfosParser.g:232:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalCodesinfosParser.g:233:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalCodesinfosParser.g:233:3: ()
            // InternalCodesinfosParser.g:234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodesinfosRootNameAccess().getCodesinfosRootNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCodesinfosRootNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCodesinfosRootNameAccess().getColonKeyword_2());
            		
            // InternalCodesinfosParser.g:248:3: ( (lv_name_3_0= ruleEString ) )
            // InternalCodesinfosParser.g:249:4: (lv_name_3_0= ruleEString )
            {
            // InternalCodesinfosParser.g:249:4: (lv_name_3_0= ruleEString )
            // InternalCodesinfosParser.g:250:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCodesinfosRootNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodesinfosRootNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"codesinfos.codesinfos.Codesinfos.EString");
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
    // $ANTLR end "ruleCodesinfosRootName"


    // $ANTLR start "entryRuleCodesinfosRootCodes"
    // InternalCodesinfosParser.g:271:1: entryRuleCodesinfosRootCodes returns [EObject current=null] : iv_ruleCodesinfosRootCodes= ruleCodesinfosRootCodes EOF ;
    public final EObject entryRuleCodesinfosRootCodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodesinfosRootCodes = null;


        try {
            // InternalCodesinfosParser.g:271:60: (iv_ruleCodesinfosRootCodes= ruleCodesinfosRootCodes EOF )
            // InternalCodesinfosParser.g:272:2: iv_ruleCodesinfosRootCodes= ruleCodesinfosRootCodes EOF
            {
             newCompositeNode(grammarAccess.getCodesinfosRootCodesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodesinfosRootCodes=ruleCodesinfosRootCodes();

            state._fsp--;

             current =iv_ruleCodesinfosRootCodes; 
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
    // $ANTLR end "entryRuleCodesinfosRootCodes"


    // $ANTLR start "ruleCodesinfosRootCodes"
    // InternalCodesinfosParser.g:278:1: ruleCodesinfosRootCodes returns [EObject current=null] : ( () otherlv_1= Codes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_codes_4_0= ruleCodesinfosRootCodesItems ) ) (otherlv_5= Comma ( (lv_codes_6_0= ruleCodesinfosRootCodesItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleCodesinfosRootCodes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_codes_4_0 = null;

        EObject lv_codes_6_0 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:284:2: ( ( () otherlv_1= Codes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_codes_4_0= ruleCodesinfosRootCodesItems ) ) (otherlv_5= Comma ( (lv_codes_6_0= ruleCodesinfosRootCodesItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalCodesinfosParser.g:285:2: ( () otherlv_1= Codes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_codes_4_0= ruleCodesinfosRootCodesItems ) ) (otherlv_5= Comma ( (lv_codes_6_0= ruleCodesinfosRootCodesItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalCodesinfosParser.g:285:2: ( () otherlv_1= Codes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_codes_4_0= ruleCodesinfosRootCodesItems ) ) (otherlv_5= Comma ( (lv_codes_6_0= ruleCodesinfosRootCodesItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalCodesinfosParser.g:286:3: () otherlv_1= Codes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_codes_4_0= ruleCodesinfosRootCodesItems ) ) (otherlv_5= Comma ( (lv_codes_6_0= ruleCodesinfosRootCodesItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalCodesinfosParser.g:286:3: ()
            // InternalCodesinfosParser.g:287:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodesinfosRootCodesAccess().getCodesinfosRootCodesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Codes,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCodesinfosRootCodesAccess().getCodesKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCodesinfosRootCodesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCodesinfosRootCodesAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalCodesinfosParser.g:305:3: ( ( (lv_codes_4_0= ruleCodesinfosRootCodesItems ) ) (otherlv_5= Comma ( (lv_codes_6_0= ruleCodesinfosRootCodesItems ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LeftCurlyBracket) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCodesinfosParser.g:306:4: ( (lv_codes_4_0= ruleCodesinfosRootCodesItems ) ) (otherlv_5= Comma ( (lv_codes_6_0= ruleCodesinfosRootCodesItems ) ) )*
                    {
                    // InternalCodesinfosParser.g:306:4: ( (lv_codes_4_0= ruleCodesinfosRootCodesItems ) )
                    // InternalCodesinfosParser.g:307:5: (lv_codes_4_0= ruleCodesinfosRootCodesItems )
                    {
                    // InternalCodesinfosParser.g:307:5: (lv_codes_4_0= ruleCodesinfosRootCodesItems )
                    // InternalCodesinfosParser.g:308:6: lv_codes_4_0= ruleCodesinfosRootCodesItems
                    {

                    						newCompositeNode(grammarAccess.getCodesinfosRootCodesAccess().getCodesCodesinfosRootCodesItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_codes_4_0=ruleCodesinfosRootCodesItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCodesinfosRootCodesRule());
                    						}
                    						add(
                    							current,
                    							"codes",
                    							lv_codes_4_0,
                    							"codesinfos.codesinfos.Codesinfos.CodesinfosRootCodesItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCodesinfosParser.g:325:4: (otherlv_5= Comma ( (lv_codes_6_0= ruleCodesinfosRootCodesItems ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCodesinfosParser.g:326:5: otherlv_5= Comma ( (lv_codes_6_0= ruleCodesinfosRootCodesItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getCodesinfosRootCodesAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCodesinfosParser.g:330:5: ( (lv_codes_6_0= ruleCodesinfosRootCodesItems ) )
                    	    // InternalCodesinfosParser.g:331:6: (lv_codes_6_0= ruleCodesinfosRootCodesItems )
                    	    {
                    	    // InternalCodesinfosParser.g:331:6: (lv_codes_6_0= ruleCodesinfosRootCodesItems )
                    	    // InternalCodesinfosParser.g:332:7: lv_codes_6_0= ruleCodesinfosRootCodesItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getCodesinfosRootCodesAccess().getCodesCodesinfosRootCodesItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_codes_6_0=ruleCodesinfosRootCodesItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCodesinfosRootCodesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"codes",
                    	    								lv_codes_6_0,
                    	    								"codesinfos.codesinfos.Codesinfos.CodesinfosRootCodesItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCodesinfosRootCodesAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCodesinfosRootCodes"


    // $ANTLR start "entryRuleEString"
    // InternalCodesinfosParser.g:359:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCodesinfosParser.g:359:47: (iv_ruleEString= ruleEString EOF )
            // InternalCodesinfosParser.g:360:2: iv_ruleEString= ruleEString EOF
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
    // InternalCodesinfosParser.g:366:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:372:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalCodesinfosParser.g:373:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleCodesinfosRootCodesItems"
    // InternalCodesinfosParser.g:386:1: entryRuleCodesinfosRootCodesItems returns [EObject current=null] : iv_ruleCodesinfosRootCodesItems= ruleCodesinfosRootCodesItems EOF ;
    public final EObject entryRuleCodesinfosRootCodesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodesinfosRootCodesItems = null;


        try {
            // InternalCodesinfosParser.g:386:65: (iv_ruleCodesinfosRootCodesItems= ruleCodesinfosRootCodesItems EOF )
            // InternalCodesinfosParser.g:387:2: iv_ruleCodesinfosRootCodesItems= ruleCodesinfosRootCodesItems EOF
            {
             newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodesinfosRootCodesItems=ruleCodesinfosRootCodesItems();

            state._fsp--;

             current =iv_ruleCodesinfosRootCodesItems; 
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
    // $ANTLR end "entryRuleCodesinfosRootCodesItems"


    // $ANTLR start "ruleCodesinfosRootCodesItems"
    // InternalCodesinfosParser.g:393:1: ruleCodesinfosRootCodesItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleCodesinfosRootCodesItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:399:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalCodesinfosParser.g:400:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalCodesinfosParser.g:400:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalCodesinfosParser.g:401:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalCodesinfosParser.g:401:3: ()
            // InternalCodesinfosParser.g:402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodesinfosRootCodesItemsAccess().getCodesinfosRootCodesItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCodesinfosRootCodesItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCodesinfosParser.g:412:3: ( ( (lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=Classname && LA8_0<=Nodename)||LA8_0==Name) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCodesinfosParser.g:413:4: ( (lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) )*
                    {
                    // InternalCodesinfosParser.g:413:4: ( (lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) )
                    // InternalCodesinfosParser.g:414:5: (lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract )
                    {
                    // InternalCodesinfosParser.g:414:5: (lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract )
                    // InternalCodesinfosParser.g:415:6: lv_items_2_0= ruleCodesinfosRootCodesItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsAccess().getItemsCodesinfosRootCodesItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleCodesinfosRootCodesItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCodesinfosRootCodesItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"codesinfos.codesinfos.Codesinfos.CodesinfosRootCodesItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCodesinfosParser.g:432:4: (otherlv_3= Comma ( (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Comma) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCodesinfosParser.g:433:5: otherlv_3= Comma ( (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_13); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getCodesinfosRootCodesItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalCodesinfosParser.g:437:5: ( (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract ) )
                    	    // InternalCodesinfosParser.g:438:6: (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract )
                    	    {
                    	    // InternalCodesinfosParser.g:438:6: (lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract )
                    	    // InternalCodesinfosParser.g:439:7: lv_items_4_0= ruleCodesinfosRootCodesItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsAccess().getItemsCodesinfosRootCodesItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleCodesinfosRootCodesItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCodesinfosRootCodesItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"codesinfos.codesinfos.Codesinfos.CodesinfosRootCodesItemsPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCodesinfosRootCodesItemsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCodesinfosRootCodesItems"


    // $ANTLR start "entryRuleCodesinfosRootCodesItemsName"
    // InternalCodesinfosParser.g:466:1: entryRuleCodesinfosRootCodesItemsName returns [EObject current=null] : iv_ruleCodesinfosRootCodesItemsName= ruleCodesinfosRootCodesItemsName EOF ;
    public final EObject entryRuleCodesinfosRootCodesItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodesinfosRootCodesItemsName = null;


        try {
            // InternalCodesinfosParser.g:466:69: (iv_ruleCodesinfosRootCodesItemsName= ruleCodesinfosRootCodesItemsName EOF )
            // InternalCodesinfosParser.g:467:2: iv_ruleCodesinfosRootCodesItemsName= ruleCodesinfosRootCodesItemsName EOF
            {
             newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodesinfosRootCodesItemsName=ruleCodesinfosRootCodesItemsName();

            state._fsp--;

             current =iv_ruleCodesinfosRootCodesItemsName; 
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
    // $ANTLR end "entryRuleCodesinfosRootCodesItemsName"


    // $ANTLR start "ruleCodesinfosRootCodesItemsName"
    // InternalCodesinfosParser.g:473:1: ruleCodesinfosRootCodesItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleCodesinfosRootCodesItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:479:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalCodesinfosParser.g:480:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalCodesinfosParser.g:480:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalCodesinfosParser.g:481:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalCodesinfosParser.g:481:3: ()
            // InternalCodesinfosParser.g:482:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodesinfosRootCodesItemsNameAccess().getCodesinfosRootCodesItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCodesinfosRootCodesItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCodesinfosRootCodesItemsNameAccess().getColonKeyword_2());
            		
            // InternalCodesinfosParser.g:496:3: ( (lv_name_3_0= ruleEString ) )
            // InternalCodesinfosParser.g:497:4: (lv_name_3_0= ruleEString )
            {
            // InternalCodesinfosParser.g:497:4: (lv_name_3_0= ruleEString )
            // InternalCodesinfosParser.g:498:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodesinfosRootCodesItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"codesinfos.codesinfos.Codesinfos.EString");
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
    // $ANTLR end "ruleCodesinfosRootCodesItemsName"


    // $ANTLR start "entryRuleCodesinfosRootCodesItemsClassname"
    // InternalCodesinfosParser.g:519:1: entryRuleCodesinfosRootCodesItemsClassname returns [EObject current=null] : iv_ruleCodesinfosRootCodesItemsClassname= ruleCodesinfosRootCodesItemsClassname EOF ;
    public final EObject entryRuleCodesinfosRootCodesItemsClassname() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodesinfosRootCodesItemsClassname = null;


        try {
            // InternalCodesinfosParser.g:519:74: (iv_ruleCodesinfosRootCodesItemsClassname= ruleCodesinfosRootCodesItemsClassname EOF )
            // InternalCodesinfosParser.g:520:2: iv_ruleCodesinfosRootCodesItemsClassname= ruleCodesinfosRootCodesItemsClassname EOF
            {
             newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsClassnameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodesinfosRootCodesItemsClassname=ruleCodesinfosRootCodesItemsClassname();

            state._fsp--;

             current =iv_ruleCodesinfosRootCodesItemsClassname; 
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
    // $ANTLR end "entryRuleCodesinfosRootCodesItemsClassname"


    // $ANTLR start "ruleCodesinfosRootCodesItemsClassname"
    // InternalCodesinfosParser.g:526:1: ruleCodesinfosRootCodesItemsClassname returns [EObject current=null] : (otherlv_0= Classname otherlv_1= Colon ( (lv_classname_2_0= ruleEString ) ) ) ;
    public final EObject ruleCodesinfosRootCodesItemsClassname() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_classname_2_0 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:532:2: ( (otherlv_0= Classname otherlv_1= Colon ( (lv_classname_2_0= ruleEString ) ) ) )
            // InternalCodesinfosParser.g:533:2: (otherlv_0= Classname otherlv_1= Colon ( (lv_classname_2_0= ruleEString ) ) )
            {
            // InternalCodesinfosParser.g:533:2: (otherlv_0= Classname otherlv_1= Colon ( (lv_classname_2_0= ruleEString ) ) )
            // InternalCodesinfosParser.g:534:3: otherlv_0= Classname otherlv_1= Colon ( (lv_classname_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Classname,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getClassnameKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getColonKeyword_1());
            		
            // InternalCodesinfosParser.g:542:3: ( (lv_classname_2_0= ruleEString ) )
            // InternalCodesinfosParser.g:543:4: (lv_classname_2_0= ruleEString )
            {
            // InternalCodesinfosParser.g:543:4: (lv_classname_2_0= ruleEString )
            // InternalCodesinfosParser.g:544:5: lv_classname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getClassnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_classname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodesinfosRootCodesItemsClassnameRule());
            					}
            					set(
            						current,
            						"classname",
            						lv_classname_2_0,
            						"codesinfos.codesinfos.Codesinfos.EString");
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
    // $ANTLR end "ruleCodesinfosRootCodesItemsClassname"


    // $ANTLR start "entryRuleCodesinfosRootCodesItemsNodename"
    // InternalCodesinfosParser.g:565:1: entryRuleCodesinfosRootCodesItemsNodename returns [EObject current=null] : iv_ruleCodesinfosRootCodesItemsNodename= ruleCodesinfosRootCodesItemsNodename EOF ;
    public final EObject entryRuleCodesinfosRootCodesItemsNodename() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodesinfosRootCodesItemsNodename = null;


        try {
            // InternalCodesinfosParser.g:565:73: (iv_ruleCodesinfosRootCodesItemsNodename= ruleCodesinfosRootCodesItemsNodename EOF )
            // InternalCodesinfosParser.g:566:2: iv_ruleCodesinfosRootCodesItemsNodename= ruleCodesinfosRootCodesItemsNodename EOF
            {
             newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsNodenameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodesinfosRootCodesItemsNodename=ruleCodesinfosRootCodesItemsNodename();

            state._fsp--;

             current =iv_ruleCodesinfosRootCodesItemsNodename; 
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
    // $ANTLR end "entryRuleCodesinfosRootCodesItemsNodename"


    // $ANTLR start "ruleCodesinfosRootCodesItemsNodename"
    // InternalCodesinfosParser.g:572:1: ruleCodesinfosRootCodesItemsNodename returns [EObject current=null] : (otherlv_0= Nodename otherlv_1= Colon ( (lv_nodename_2_0= ruleEString ) ) ) ;
    public final EObject ruleCodesinfosRootCodesItemsNodename() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_nodename_2_0 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:578:2: ( (otherlv_0= Nodename otherlv_1= Colon ( (lv_nodename_2_0= ruleEString ) ) ) )
            // InternalCodesinfosParser.g:579:2: (otherlv_0= Nodename otherlv_1= Colon ( (lv_nodename_2_0= ruleEString ) ) )
            {
            // InternalCodesinfosParser.g:579:2: (otherlv_0= Nodename otherlv_1= Colon ( (lv_nodename_2_0= ruleEString ) ) )
            // InternalCodesinfosParser.g:580:3: otherlv_0= Nodename otherlv_1= Colon ( (lv_nodename_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Nodename,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getNodenameKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getColonKeyword_1());
            		
            // InternalCodesinfosParser.g:588:3: ( (lv_nodename_2_0= ruleEString ) )
            // InternalCodesinfosParser.g:589:4: (lv_nodename_2_0= ruleEString )
            {
            // InternalCodesinfosParser.g:589:4: (lv_nodename_2_0= ruleEString )
            // InternalCodesinfosParser.g:590:5: lv_nodename_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getNodenameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_nodename_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodesinfosRootCodesItemsNodenameRule());
            					}
            					set(
            						current,
            						"nodename",
            						lv_nodename_2_0,
            						"codesinfos.codesinfos.Codesinfos.EString");
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
    // $ANTLR end "ruleCodesinfosRootCodesItemsNodename"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalCodesinfosParser.g:611:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalCodesinfosParser.g:611:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalCodesinfosParser.g:612:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalCodesinfosParser.g:618:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalCodesinfosParser.g:624:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalCodesinfosParser.g:625:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalCodesinfosParser.g:625:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=Classname && LA9_0<=Name)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCodesinfosParser.g:626:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCodesinfosParser.g:634:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalCodesinfosParser.g:648:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalCodesinfosParser.g:648:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalCodesinfosParser.g:649:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalCodesinfosParser.g:655:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Codes | kw= Nodename | kw= Classname | kw= Name ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCodesinfosParser.g:661:2: ( (kw= Codes | kw= Nodename | kw= Classname | kw= Name ) )
            // InternalCodesinfosParser.g:662:2: (kw= Codes | kw= Nodename | kw= Classname | kw= Name )
            {
            // InternalCodesinfosParser.g:662:2: (kw= Codes | kw= Nodename | kw= Classname | kw= Name )
            int alt10=4;
            switch ( input.LA(1) ) {
            case Codes:
                {
                alt10=1;
                }
                break;
            case Nodename:
                {
                alt10=2;
                }
                break;
            case Classname:
                {
                alt10=3;
                }
                break;
            case Name:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCodesinfosParser.g:663:3: kw= Codes
                    {
                    kw=(Token)match(input,Codes,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getCodesKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCodesinfosParser.g:669:3: kw= Nodename
                    {
                    kw=(Token)match(input,Nodename,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNodenameKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCodesinfosParser.g:675:3: kw= Classname
                    {
                    kw=(Token)match(input,Classname,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getClassnameKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCodesinfosParser.g:681:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_3());
                    		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000020C0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000080F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000000B0L});

}
