package graphic.graphic.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import graphic.graphic.services.GraphicGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphicParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ContactTestBitMask", "MaterialAttributes", "CollisionBitMask", "CategoryBitMask", "DecoratorColor", "DecoratorWidth", "ShowAttributes", "DecoratorPos", "XToOriginPos", "YToOriginPos", "ZToOriginPos", "Connections", "Constraints", "Ilumination", "Overlapping", "Decorator", "TextColor", "Position", "Rotation", "SizeInit", "Versions", "Classes", "Pattern", "SizeMax", "SizeMin", "Planes", "Target", "Color", "Vname", "Width", "Name", "Text", "Trim", "Type", "URI", "False", "V1", "V2", "V3", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Connections=15;
    public static final int SizeInit=23;
    public static final int True=43;
    public static final int False=39;
    public static final int Vname=32;
    public static final int Name=34;
    public static final int DecoratorWidth=9;
    public static final int Planes=29;
    public static final int TextColor=20;
    public static final int V1=40;
    public static final int V2=41;
    public static final int V3=42;
    public static final int RightSquareBracket=47;
    public static final int XToOriginPos=12;
    public static final int Classes=25;
    public static final int Overlapping=18;
    public static final int RULE_ID=54;
    public static final int CategoryBitMask=7;
    public static final int Position=21;
    public static final int Color=31;
    public static final int ShowAttributes=10;
    public static final int Constraints=16;
    public static final int Versions=24;
    public static final int RULE_INT=50;
    public static final int RULE_ML_COMMENT=55;
    public static final int LeftSquareBracket=46;
    public static final int SizeMax=27;
    public static final int ZToOriginPos=14;
    public static final int SizeMin=28;
    public static final int RULE_STRING=51;
    public static final int MaterialAttributes=5;
    public static final int URI=38;
    public static final int YToOriginPos=13;
    public static final int RULE_SL_COMMENT=56;
    public static final int Comma=44;
    public static final int Target=30;
    public static final int Colon=45;
    public static final int RightCurlyBracket=49;
    public static final int RULE_E_DOUBLE=53;
    public static final int EOF=-1;
    public static final int Width=33;
    public static final int Pattern=26;
    public static final int Trim=36;
    public static final int RULE_WS=57;
    public static final int LeftCurlyBracket=48;
    public static final int RULE_E_INT=52;
    public static final int DecoratorColor=8;
    public static final int Text=35;
    public static final int RULE_ANY_OTHER=58;
    public static final int Rotation=22;
    public static final int Decorator=19;
    public static final int Type=37;
    public static final int CollisionBitMask=6;
    public static final int DecoratorPos=11;
    public static final int ContactTestBitMask=4;
    public static final int Ilumination=17;

    // delegates
    // delegators


        public InternalGraphicParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphicParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphicParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGraphicParser.g"; }



     	private GraphicGrammarAccess grammarAccess;

        public InternalGraphicParser(TokenStream input, GraphicGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GraphicRoot";
       	}

       	@Override
       	protected GraphicGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGraphicRoot"
    // InternalGraphicParser.g:57:1: entryRuleGraphicRoot returns [EObject current=null] : iv_ruleGraphicRoot= ruleGraphicRoot EOF ;
    public final EObject entryRuleGraphicRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRoot = null;


        try {
            // InternalGraphicParser.g:57:52: (iv_ruleGraphicRoot= ruleGraphicRoot EOF )
            // InternalGraphicParser.g:58:2: iv_ruleGraphicRoot= ruleGraphicRoot EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRoot=ruleGraphicRoot();

            state._fsp--;

             current =iv_ruleGraphicRoot; 
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
    // $ANTLR end "entryRuleGraphicRoot"


    // $ANTLR start "ruleGraphicRoot"
    // InternalGraphicParser.g:64:1: ruleGraphicRoot returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleGraphicRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_graphicRoot_2_0 = null;

        EObject lv_graphicRoot_4_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:70:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGraphicParser.g:71:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGraphicParser.g:71:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGraphicParser.g:72:3: () otherlv_1= LeftCurlyBracket ( ( (lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGraphicParser.g:72:3: ()
            // InternalGraphicParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootAccess().getGraphicRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphicParser.g:83:3: ( ( (lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Classes||LA2_0==Name||LA2_0==URI) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphicParser.g:84:4: ( (lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract ) ) )*
                    {
                    // InternalGraphicParser.g:84:4: ( (lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract ) )
                    // InternalGraphicParser.g:85:5: (lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract )
                    {
                    // InternalGraphicParser.g:85:5: (lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract )
                    // InternalGraphicParser.g:86:6: lv_graphicRoot_2_0= ruleGraphicRootPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getGraphicRootAccess().getGraphicRootGraphicRootPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_graphicRoot_2_0=ruleGraphicRootPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphicRootRule());
                    						}
                    						add(
                    							current,
                    							"graphicRoot",
                    							lv_graphicRoot_2_0,
                    							"graphic.graphic.Graphic.GraphicRootPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphicParser.g:103:4: (otherlv_3= Comma ( (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGraphicParser.g:104:5: otherlv_3= Comma ( (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getGraphicRootAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalGraphicParser.g:108:5: ( (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract ) )
                    	    // InternalGraphicParser.g:109:6: (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract )
                    	    {
                    	    // InternalGraphicParser.g:109:6: (lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract )
                    	    // InternalGraphicParser.g:110:7: lv_graphicRoot_4_0= ruleGraphicRootPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphicRootAccess().getGraphicRootGraphicRootPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_graphicRoot_4_0=ruleGraphicRootPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphicRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"graphicRoot",
                    	    								lv_graphicRoot_4_0,
                    	    								"graphic.graphic.Graphic.GraphicRootPropertiesAbstract");
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

            			newLeafNode(otherlv_5, grammarAccess.getGraphicRootAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleGraphicRoot"


    // $ANTLR start "entryRuleGraphicRootPropertiesAbstract"
    // InternalGraphicParser.g:137:1: entryRuleGraphicRootPropertiesAbstract returns [EObject current=null] : iv_ruleGraphicRootPropertiesAbstract= ruleGraphicRootPropertiesAbstract EOF ;
    public final EObject entryRuleGraphicRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootPropertiesAbstract = null;


        try {
            // InternalGraphicParser.g:137:70: (iv_ruleGraphicRootPropertiesAbstract= ruleGraphicRootPropertiesAbstract EOF )
            // InternalGraphicParser.g:138:2: iv_ruleGraphicRootPropertiesAbstract= ruleGraphicRootPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootPropertiesAbstract=ruleGraphicRootPropertiesAbstract();

            state._fsp--;

             current =iv_ruleGraphicRootPropertiesAbstract; 
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
    // $ANTLR end "entryRuleGraphicRootPropertiesAbstract"


    // $ANTLR start "ruleGraphicRootPropertiesAbstract"
    // InternalGraphicParser.g:144:1: ruleGraphicRootPropertiesAbstract returns [EObject current=null] : (this_GraphicRootName_0= ruleGraphicRootName | this_GraphicRootURI_1= ruleGraphicRootURI | this_GraphicRootClasses_2= ruleGraphicRootClasses ) ;
    public final EObject ruleGraphicRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GraphicRootName_0 = null;

        EObject this_GraphicRootURI_1 = null;

        EObject this_GraphicRootClasses_2 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:150:2: ( (this_GraphicRootName_0= ruleGraphicRootName | this_GraphicRootURI_1= ruleGraphicRootURI | this_GraphicRootClasses_2= ruleGraphicRootClasses ) )
            // InternalGraphicParser.g:151:2: (this_GraphicRootName_0= ruleGraphicRootName | this_GraphicRootURI_1= ruleGraphicRootURI | this_GraphicRootClasses_2= ruleGraphicRootClasses )
            {
            // InternalGraphicParser.g:151:2: (this_GraphicRootName_0= ruleGraphicRootName | this_GraphicRootURI_1= ruleGraphicRootURI | this_GraphicRootClasses_2= ruleGraphicRootClasses )
            int alt3=3;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt3=1;
                }
                break;
            case URI:
                {
                alt3=2;
                }
                break;
            case Classes:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGraphicParser.g:152:3: this_GraphicRootName_0= ruleGraphicRootName
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootPropertiesAbstractAccess().getGraphicRootNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootName_0=ruleGraphicRootName();

                    state._fsp--;


                    			current = this_GraphicRootName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:161:3: this_GraphicRootURI_1= ruleGraphicRootURI
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootPropertiesAbstractAccess().getGraphicRootURIParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootURI_1=ruleGraphicRootURI();

                    state._fsp--;


                    			current = this_GraphicRootURI_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:170:3: this_GraphicRootClasses_2= ruleGraphicRootClasses
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootPropertiesAbstractAccess().getGraphicRootClassesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClasses_2=ruleGraphicRootClasses();

                    state._fsp--;


                    			current = this_GraphicRootClasses_2;
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
    // $ANTLR end "ruleGraphicRootPropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootClassesItemsPropertiesAbstract"
    // InternalGraphicParser.g:182:1: entryRuleGraphicRootClassesItemsPropertiesAbstract returns [EObject current=null] : iv_ruleGraphicRootClassesItemsPropertiesAbstract= ruleGraphicRootClassesItemsPropertiesAbstract EOF ;
    public final EObject entryRuleGraphicRootClassesItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsPropertiesAbstract = null;


        try {
            // InternalGraphicParser.g:182:82: (iv_ruleGraphicRootClassesItemsPropertiesAbstract= ruleGraphicRootClassesItemsPropertiesAbstract EOF )
            // InternalGraphicParser.g:183:2: iv_ruleGraphicRootClassesItemsPropertiesAbstract= ruleGraphicRootClassesItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsPropertiesAbstract=ruleGraphicRootClassesItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsPropertiesAbstract"


    // $ANTLR start "ruleGraphicRootClassesItemsPropertiesAbstract"
    // InternalGraphicParser.g:189:1: ruleGraphicRootClassesItemsPropertiesAbstract returns [EObject current=null] : (this_GraphicRootClassesItemsName_0= ruleGraphicRootClassesItemsName | this_GraphicRootClassesItemsVersions_1= ruleGraphicRootClassesItemsVersions | this_GraphicRootClassesItemsVname_2= ruleGraphicRootClassesItemsVname | this_GraphicRootClassesItemsShowAttributes_3= ruleGraphicRootClassesItemsShowAttributes | this_GraphicRootClassesItemsMaterialAttributes_4= ruleGraphicRootClassesItemsMaterialAttributes | this_GraphicRootClassesItemsConstraints_5= ruleGraphicRootClassesItemsConstraints | this_GraphicRootClassesItemsConnections_6= ruleGraphicRootClassesItemsConnections ) ;
    public final EObject ruleGraphicRootClassesItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GraphicRootClassesItemsName_0 = null;

        EObject this_GraphicRootClassesItemsVersions_1 = null;

        EObject this_GraphicRootClassesItemsVname_2 = null;

        EObject this_GraphicRootClassesItemsShowAttributes_3 = null;

        EObject this_GraphicRootClassesItemsMaterialAttributes_4 = null;

        EObject this_GraphicRootClassesItemsConstraints_5 = null;

        EObject this_GraphicRootClassesItemsConnections_6 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:195:2: ( (this_GraphicRootClassesItemsName_0= ruleGraphicRootClassesItemsName | this_GraphicRootClassesItemsVersions_1= ruleGraphicRootClassesItemsVersions | this_GraphicRootClassesItemsVname_2= ruleGraphicRootClassesItemsVname | this_GraphicRootClassesItemsShowAttributes_3= ruleGraphicRootClassesItemsShowAttributes | this_GraphicRootClassesItemsMaterialAttributes_4= ruleGraphicRootClassesItemsMaterialAttributes | this_GraphicRootClassesItemsConstraints_5= ruleGraphicRootClassesItemsConstraints | this_GraphicRootClassesItemsConnections_6= ruleGraphicRootClassesItemsConnections ) )
            // InternalGraphicParser.g:196:2: (this_GraphicRootClassesItemsName_0= ruleGraphicRootClassesItemsName | this_GraphicRootClassesItemsVersions_1= ruleGraphicRootClassesItemsVersions | this_GraphicRootClassesItemsVname_2= ruleGraphicRootClassesItemsVname | this_GraphicRootClassesItemsShowAttributes_3= ruleGraphicRootClassesItemsShowAttributes | this_GraphicRootClassesItemsMaterialAttributes_4= ruleGraphicRootClassesItemsMaterialAttributes | this_GraphicRootClassesItemsConstraints_5= ruleGraphicRootClassesItemsConstraints | this_GraphicRootClassesItemsConnections_6= ruleGraphicRootClassesItemsConnections )
            {
            // InternalGraphicParser.g:196:2: (this_GraphicRootClassesItemsName_0= ruleGraphicRootClassesItemsName | this_GraphicRootClassesItemsVersions_1= ruleGraphicRootClassesItemsVersions | this_GraphicRootClassesItemsVname_2= ruleGraphicRootClassesItemsVname | this_GraphicRootClassesItemsShowAttributes_3= ruleGraphicRootClassesItemsShowAttributes | this_GraphicRootClassesItemsMaterialAttributes_4= ruleGraphicRootClassesItemsMaterialAttributes | this_GraphicRootClassesItemsConstraints_5= ruleGraphicRootClassesItemsConstraints | this_GraphicRootClassesItemsConnections_6= ruleGraphicRootClassesItemsConnections )
            int alt4=7;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt4=1;
                }
                break;
            case Versions:
                {
                alt4=2;
                }
                break;
            case Vname:
                {
                alt4=3;
                }
                break;
            case ShowAttributes:
                {
                alt4=4;
                }
                break;
            case MaterialAttributes:
                {
                alt4=5;
                }
                break;
            case Constraints:
                {
                alt4=6;
                }
                break;
            case Connections:
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
                    // InternalGraphicParser.g:197:3: this_GraphicRootClassesItemsName_0= ruleGraphicRootClassesItemsName
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsName_0=ruleGraphicRootClassesItemsName();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:206:3: this_GraphicRootClassesItemsVersions_1= ruleGraphicRootClassesItemsVersions
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsVersions_1=ruleGraphicRootClassesItemsVersions();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsVersions_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:215:3: this_GraphicRootClassesItemsVname_2= ruleGraphicRootClassesItemsVname
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsVnameParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsVname_2=ruleGraphicRootClassesItemsVname();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsVname_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGraphicParser.g:224:3: this_GraphicRootClassesItemsShowAttributes_3= ruleGraphicRootClassesItemsShowAttributes
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsShowAttributesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsShowAttributes_3=ruleGraphicRootClassesItemsShowAttributes();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsShowAttributes_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGraphicParser.g:233:3: this_GraphicRootClassesItemsMaterialAttributes_4= ruleGraphicRootClassesItemsMaterialAttributes
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsMaterialAttributesParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsMaterialAttributes_4=ruleGraphicRootClassesItemsMaterialAttributes();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsMaterialAttributes_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGraphicParser.g:242:3: this_GraphicRootClassesItemsConstraints_5= ruleGraphicRootClassesItemsConstraints
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraints_5=ruleGraphicRootClassesItemsConstraints();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraints_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGraphicParser.g:251:3: this_GraphicRootClassesItemsConnections_6= ruleGraphicRootClassesItemsConnections
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnections_6=ruleGraphicRootClassesItemsConnections();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnections_6;
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
    // $ANTLR end "ruleGraphicRootClassesItemsPropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVersionsPropertiesAbstract"
    // InternalGraphicParser.g:263:1: entryRuleGraphicRootClassesItemsVersionsPropertiesAbstract returns [EObject current=null] : iv_ruleGraphicRootClassesItemsVersionsPropertiesAbstract= ruleGraphicRootClassesItemsVersionsPropertiesAbstract EOF ;
    public final EObject entryRuleGraphicRootClassesItemsVersionsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsVersionsPropertiesAbstract = null;


        try {
            // InternalGraphicParser.g:263:90: (iv_ruleGraphicRootClassesItemsVersionsPropertiesAbstract= ruleGraphicRootClassesItemsVersionsPropertiesAbstract EOF )
            // InternalGraphicParser.g:264:2: iv_ruleGraphicRootClassesItemsVersionsPropertiesAbstract= ruleGraphicRootClassesItemsVersionsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsVersionsPropertiesAbstract=ruleGraphicRootClassesItemsVersionsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsVersionsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsVersionsPropertiesAbstract"


    // $ANTLR start "ruleGraphicRootClassesItemsVersionsPropertiesAbstract"
    // InternalGraphicParser.g:270:1: ruleGraphicRootClassesItemsVersionsPropertiesAbstract returns [EObject current=null] : (this_GraphicRootClassesItemsVersionsV1_0= ruleGraphicRootClassesItemsVersionsV1 | this_GraphicRootClassesItemsVersionsV2_1= ruleGraphicRootClassesItemsVersionsV2 | this_GraphicRootClassesItemsVersionsV3_2= ruleGraphicRootClassesItemsVersionsV3 ) ;
    public final EObject ruleGraphicRootClassesItemsVersionsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GraphicRootClassesItemsVersionsV1_0 = null;

        EObject this_GraphicRootClassesItemsVersionsV2_1 = null;

        EObject this_GraphicRootClassesItemsVersionsV3_2 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:276:2: ( (this_GraphicRootClassesItemsVersionsV1_0= ruleGraphicRootClassesItemsVersionsV1 | this_GraphicRootClassesItemsVersionsV2_1= ruleGraphicRootClassesItemsVersionsV2 | this_GraphicRootClassesItemsVersionsV3_2= ruleGraphicRootClassesItemsVersionsV3 ) )
            // InternalGraphicParser.g:277:2: (this_GraphicRootClassesItemsVersionsV1_0= ruleGraphicRootClassesItemsVersionsV1 | this_GraphicRootClassesItemsVersionsV2_1= ruleGraphicRootClassesItemsVersionsV2 | this_GraphicRootClassesItemsVersionsV3_2= ruleGraphicRootClassesItemsVersionsV3 )
            {
            // InternalGraphicParser.g:277:2: (this_GraphicRootClassesItemsVersionsV1_0= ruleGraphicRootClassesItemsVersionsV1 | this_GraphicRootClassesItemsVersionsV2_1= ruleGraphicRootClassesItemsVersionsV2 | this_GraphicRootClassesItemsVersionsV3_2= ruleGraphicRootClassesItemsVersionsV3 )
            int alt5=3;
            switch ( input.LA(1) ) {
            case V1:
                {
                alt5=1;
                }
                break;
            case V2:
                {
                alt5=2;
                }
                break;
            case V3:
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
                    // InternalGraphicParser.g:278:3: this_GraphicRootClassesItemsVersionsV1_0= ruleGraphicRootClassesItemsVersionsV1
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsV1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsVersionsV1_0=ruleGraphicRootClassesItemsVersionsV1();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsVersionsV1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:287:3: this_GraphicRootClassesItemsVersionsV2_1= ruleGraphicRootClassesItemsVersionsV2
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsV2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsVersionsV2_1=ruleGraphicRootClassesItemsVersionsV2();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsVersionsV2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:296:3: this_GraphicRootClassesItemsVersionsV3_2= ruleGraphicRootClassesItemsVersionsV3
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsV3ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsVersionsV3_2=ruleGraphicRootClassesItemsVersionsV3();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsVersionsV3_2;
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
    // $ANTLR end "ruleGraphicRootClassesItemsVersionsPropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVnamePropertiesAbstract"
    // InternalGraphicParser.g:308:1: entryRuleGraphicRootClassesItemsVnamePropertiesAbstract returns [EObject current=null] : iv_ruleGraphicRootClassesItemsVnamePropertiesAbstract= ruleGraphicRootClassesItemsVnamePropertiesAbstract EOF ;
    public final EObject entryRuleGraphicRootClassesItemsVnamePropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsVnamePropertiesAbstract = null;


        try {
            // InternalGraphicParser.g:308:87: (iv_ruleGraphicRootClassesItemsVnamePropertiesAbstract= ruleGraphicRootClassesItemsVnamePropertiesAbstract EOF )
            // InternalGraphicParser.g:309:2: iv_ruleGraphicRootClassesItemsVnamePropertiesAbstract= ruleGraphicRootClassesItemsVnamePropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsVnamePropertiesAbstract=ruleGraphicRootClassesItemsVnamePropertiesAbstract();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsVnamePropertiesAbstract; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsVnamePropertiesAbstract"


    // $ANTLR start "ruleGraphicRootClassesItemsVnamePropertiesAbstract"
    // InternalGraphicParser.g:315:1: ruleGraphicRootClassesItemsVnamePropertiesAbstract returns [EObject current=null] : (this_GraphicRootClassesItemsVnameV1_0= ruleGraphicRootClassesItemsVnameV1 | this_GraphicRootClassesItemsVnameV2_1= ruleGraphicRootClassesItemsVnameV2 | this_GraphicRootClassesItemsVnameV3_2= ruleGraphicRootClassesItemsVnameV3 ) ;
    public final EObject ruleGraphicRootClassesItemsVnamePropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GraphicRootClassesItemsVnameV1_0 = null;

        EObject this_GraphicRootClassesItemsVnameV2_1 = null;

        EObject this_GraphicRootClassesItemsVnameV3_2 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:321:2: ( (this_GraphicRootClassesItemsVnameV1_0= ruleGraphicRootClassesItemsVnameV1 | this_GraphicRootClassesItemsVnameV2_1= ruleGraphicRootClassesItemsVnameV2 | this_GraphicRootClassesItemsVnameV3_2= ruleGraphicRootClassesItemsVnameV3 ) )
            // InternalGraphicParser.g:322:2: (this_GraphicRootClassesItemsVnameV1_0= ruleGraphicRootClassesItemsVnameV1 | this_GraphicRootClassesItemsVnameV2_1= ruleGraphicRootClassesItemsVnameV2 | this_GraphicRootClassesItemsVnameV3_2= ruleGraphicRootClassesItemsVnameV3 )
            {
            // InternalGraphicParser.g:322:2: (this_GraphicRootClassesItemsVnameV1_0= ruleGraphicRootClassesItemsVnameV1 | this_GraphicRootClassesItemsVnameV2_1= ruleGraphicRootClassesItemsVnameV2 | this_GraphicRootClassesItemsVnameV3_2= ruleGraphicRootClassesItemsVnameV3 )
            int alt6=3;
            switch ( input.LA(1) ) {
            case V1:
                {
                alt6=1;
                }
                break;
            case V2:
                {
                alt6=2;
                }
                break;
            case V3:
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
                    // InternalGraphicParser.g:323:3: this_GraphicRootClassesItemsVnameV1_0= ruleGraphicRootClassesItemsVnameV1
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getGraphicRootClassesItemsVnameV1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsVnameV1_0=ruleGraphicRootClassesItemsVnameV1();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsVnameV1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:332:3: this_GraphicRootClassesItemsVnameV2_1= ruleGraphicRootClassesItemsVnameV2
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getGraphicRootClassesItemsVnameV2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsVnameV2_1=ruleGraphicRootClassesItemsVnameV2();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsVnameV2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:341:3: this_GraphicRootClassesItemsVnameV3_2= ruleGraphicRootClassesItemsVnameV3
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getGraphicRootClassesItemsVnameV3ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsVnameV3_2=ruleGraphicRootClassesItemsVnameV3();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsVnameV3_2;
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
    // $ANTLR end "ruleGraphicRootClassesItemsVnamePropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsPropertiesAbstract"
    // InternalGraphicParser.g:353:1: entryRuleGraphicRootClassesItemsConstraintsPropertiesAbstract returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsPropertiesAbstract= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsPropertiesAbstract = null;


        try {
            // InternalGraphicParser.g:353:93: (iv_ruleGraphicRootClassesItemsConstraintsPropertiesAbstract= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract EOF )
            // InternalGraphicParser.g:354:2: iv_ruleGraphicRootClassesItemsConstraintsPropertiesAbstract= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsPropertiesAbstract=ruleGraphicRootClassesItemsConstraintsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsPropertiesAbstract"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsPropertiesAbstract"
    // InternalGraphicParser.g:360:1: ruleGraphicRootClassesItemsConstraintsPropertiesAbstract returns [EObject current=null] : (this_GraphicRootClassesItemsConstraintsPlanes_0= ruleGraphicRootClassesItemsConstraintsPlanes | this_GraphicRootClassesItemsConstraintsIlumination_1= ruleGraphicRootClassesItemsConstraintsIlumination | this_GraphicRootClassesItemsConstraintsSizeMax_2= ruleGraphicRootClassesItemsConstraintsSizeMax | this_GraphicRootClassesItemsConstraintsSizeMin_3= ruleGraphicRootClassesItemsConstraintsSizeMin | this_GraphicRootClassesItemsConstraintsSizeInit_4= ruleGraphicRootClassesItemsConstraintsSizeInit | this_GraphicRootClassesItemsConstraintsOverlapping_5= ruleGraphicRootClassesItemsConstraintsOverlapping | this_GraphicRootClassesItemsConstraintsXToOriginPos_6= ruleGraphicRootClassesItemsConstraintsXToOriginPos | this_GraphicRootClassesItemsConstraintsYToOriginPos_7= ruleGraphicRootClassesItemsConstraintsYToOriginPos | this_GraphicRootClassesItemsConstraintsZToOriginPos_8= ruleGraphicRootClassesItemsConstraintsZToOriginPos | this_GraphicRootClassesItemsConstraintsRotation_9= ruleGraphicRootClassesItemsConstraintsRotation | this_GraphicRootClassesItemsConstraintsText_10= ruleGraphicRootClassesItemsConstraintsText | this_GraphicRootClassesItemsConstraintsTrim_11= ruleGraphicRootClassesItemsConstraintsTrim | this_GraphicRootClassesItemsConstraintsCategoryBitMask_12= ruleGraphicRootClassesItemsConstraintsCategoryBitMask | this_GraphicRootClassesItemsConstraintsCollisionBitMask_13= ruleGraphicRootClassesItemsConstraintsCollisionBitMask | this_GraphicRootClassesItemsConstraintsContactTestBitMask_14= ruleGraphicRootClassesItemsConstraintsContactTestBitMask ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GraphicRootClassesItemsConstraintsPlanes_0 = null;

        EObject this_GraphicRootClassesItemsConstraintsIlumination_1 = null;

        EObject this_GraphicRootClassesItemsConstraintsSizeMax_2 = null;

        EObject this_GraphicRootClassesItemsConstraintsSizeMin_3 = null;

        EObject this_GraphicRootClassesItemsConstraintsSizeInit_4 = null;

        EObject this_GraphicRootClassesItemsConstraintsOverlapping_5 = null;

        EObject this_GraphicRootClassesItemsConstraintsXToOriginPos_6 = null;

        EObject this_GraphicRootClassesItemsConstraintsYToOriginPos_7 = null;

        EObject this_GraphicRootClassesItemsConstraintsZToOriginPos_8 = null;

        EObject this_GraphicRootClassesItemsConstraintsRotation_9 = null;

        EObject this_GraphicRootClassesItemsConstraintsText_10 = null;

        EObject this_GraphicRootClassesItemsConstraintsTrim_11 = null;

        EObject this_GraphicRootClassesItemsConstraintsCategoryBitMask_12 = null;

        EObject this_GraphicRootClassesItemsConstraintsCollisionBitMask_13 = null;

        EObject this_GraphicRootClassesItemsConstraintsContactTestBitMask_14 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:366:2: ( (this_GraphicRootClassesItemsConstraintsPlanes_0= ruleGraphicRootClassesItemsConstraintsPlanes | this_GraphicRootClassesItemsConstraintsIlumination_1= ruleGraphicRootClassesItemsConstraintsIlumination | this_GraphicRootClassesItemsConstraintsSizeMax_2= ruleGraphicRootClassesItemsConstraintsSizeMax | this_GraphicRootClassesItemsConstraintsSizeMin_3= ruleGraphicRootClassesItemsConstraintsSizeMin | this_GraphicRootClassesItemsConstraintsSizeInit_4= ruleGraphicRootClassesItemsConstraintsSizeInit | this_GraphicRootClassesItemsConstraintsOverlapping_5= ruleGraphicRootClassesItemsConstraintsOverlapping | this_GraphicRootClassesItemsConstraintsXToOriginPos_6= ruleGraphicRootClassesItemsConstraintsXToOriginPos | this_GraphicRootClassesItemsConstraintsYToOriginPos_7= ruleGraphicRootClassesItemsConstraintsYToOriginPos | this_GraphicRootClassesItemsConstraintsZToOriginPos_8= ruleGraphicRootClassesItemsConstraintsZToOriginPos | this_GraphicRootClassesItemsConstraintsRotation_9= ruleGraphicRootClassesItemsConstraintsRotation | this_GraphicRootClassesItemsConstraintsText_10= ruleGraphicRootClassesItemsConstraintsText | this_GraphicRootClassesItemsConstraintsTrim_11= ruleGraphicRootClassesItemsConstraintsTrim | this_GraphicRootClassesItemsConstraintsCategoryBitMask_12= ruleGraphicRootClassesItemsConstraintsCategoryBitMask | this_GraphicRootClassesItemsConstraintsCollisionBitMask_13= ruleGraphicRootClassesItemsConstraintsCollisionBitMask | this_GraphicRootClassesItemsConstraintsContactTestBitMask_14= ruleGraphicRootClassesItemsConstraintsContactTestBitMask ) )
            // InternalGraphicParser.g:367:2: (this_GraphicRootClassesItemsConstraintsPlanes_0= ruleGraphicRootClassesItemsConstraintsPlanes | this_GraphicRootClassesItemsConstraintsIlumination_1= ruleGraphicRootClassesItemsConstraintsIlumination | this_GraphicRootClassesItemsConstraintsSizeMax_2= ruleGraphicRootClassesItemsConstraintsSizeMax | this_GraphicRootClassesItemsConstraintsSizeMin_3= ruleGraphicRootClassesItemsConstraintsSizeMin | this_GraphicRootClassesItemsConstraintsSizeInit_4= ruleGraphicRootClassesItemsConstraintsSizeInit | this_GraphicRootClassesItemsConstraintsOverlapping_5= ruleGraphicRootClassesItemsConstraintsOverlapping | this_GraphicRootClassesItemsConstraintsXToOriginPos_6= ruleGraphicRootClassesItemsConstraintsXToOriginPos | this_GraphicRootClassesItemsConstraintsYToOriginPos_7= ruleGraphicRootClassesItemsConstraintsYToOriginPos | this_GraphicRootClassesItemsConstraintsZToOriginPos_8= ruleGraphicRootClassesItemsConstraintsZToOriginPos | this_GraphicRootClassesItemsConstraintsRotation_9= ruleGraphicRootClassesItemsConstraintsRotation | this_GraphicRootClassesItemsConstraintsText_10= ruleGraphicRootClassesItemsConstraintsText | this_GraphicRootClassesItemsConstraintsTrim_11= ruleGraphicRootClassesItemsConstraintsTrim | this_GraphicRootClassesItemsConstraintsCategoryBitMask_12= ruleGraphicRootClassesItemsConstraintsCategoryBitMask | this_GraphicRootClassesItemsConstraintsCollisionBitMask_13= ruleGraphicRootClassesItemsConstraintsCollisionBitMask | this_GraphicRootClassesItemsConstraintsContactTestBitMask_14= ruleGraphicRootClassesItemsConstraintsContactTestBitMask )
            {
            // InternalGraphicParser.g:367:2: (this_GraphicRootClassesItemsConstraintsPlanes_0= ruleGraphicRootClassesItemsConstraintsPlanes | this_GraphicRootClassesItemsConstraintsIlumination_1= ruleGraphicRootClassesItemsConstraintsIlumination | this_GraphicRootClassesItemsConstraintsSizeMax_2= ruleGraphicRootClassesItemsConstraintsSizeMax | this_GraphicRootClassesItemsConstraintsSizeMin_3= ruleGraphicRootClassesItemsConstraintsSizeMin | this_GraphicRootClassesItemsConstraintsSizeInit_4= ruleGraphicRootClassesItemsConstraintsSizeInit | this_GraphicRootClassesItemsConstraintsOverlapping_5= ruleGraphicRootClassesItemsConstraintsOverlapping | this_GraphicRootClassesItemsConstraintsXToOriginPos_6= ruleGraphicRootClassesItemsConstraintsXToOriginPos | this_GraphicRootClassesItemsConstraintsYToOriginPos_7= ruleGraphicRootClassesItemsConstraintsYToOriginPos | this_GraphicRootClassesItemsConstraintsZToOriginPos_8= ruleGraphicRootClassesItemsConstraintsZToOriginPos | this_GraphicRootClassesItemsConstraintsRotation_9= ruleGraphicRootClassesItemsConstraintsRotation | this_GraphicRootClassesItemsConstraintsText_10= ruleGraphicRootClassesItemsConstraintsText | this_GraphicRootClassesItemsConstraintsTrim_11= ruleGraphicRootClassesItemsConstraintsTrim | this_GraphicRootClassesItemsConstraintsCategoryBitMask_12= ruleGraphicRootClassesItemsConstraintsCategoryBitMask | this_GraphicRootClassesItemsConstraintsCollisionBitMask_13= ruleGraphicRootClassesItemsConstraintsCollisionBitMask | this_GraphicRootClassesItemsConstraintsContactTestBitMask_14= ruleGraphicRootClassesItemsConstraintsContactTestBitMask )
            int alt7=15;
            switch ( input.LA(1) ) {
            case Planes:
                {
                alt7=1;
                }
                break;
            case Ilumination:
                {
                alt7=2;
                }
                break;
            case SizeMax:
                {
                alt7=3;
                }
                break;
            case SizeMin:
                {
                alt7=4;
                }
                break;
            case SizeInit:
                {
                alt7=5;
                }
                break;
            case Overlapping:
                {
                alt7=6;
                }
                break;
            case XToOriginPos:
                {
                alt7=7;
                }
                break;
            case YToOriginPos:
                {
                alt7=8;
                }
                break;
            case ZToOriginPos:
                {
                alt7=9;
                }
                break;
            case Rotation:
                {
                alt7=10;
                }
                break;
            case Text:
                {
                alt7=11;
                }
                break;
            case Trim:
                {
                alt7=12;
                }
                break;
            case CategoryBitMask:
                {
                alt7=13;
                }
                break;
            case CollisionBitMask:
                {
                alt7=14;
                }
                break;
            case ContactTestBitMask:
                {
                alt7=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGraphicParser.g:368:3: this_GraphicRootClassesItemsConstraintsPlanes_0= ruleGraphicRootClassesItemsConstraintsPlanes
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsPlanesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsPlanes_0=ruleGraphicRootClassesItemsConstraintsPlanes();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsPlanes_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:377:3: this_GraphicRootClassesItemsConstraintsIlumination_1= ruleGraphicRootClassesItemsConstraintsIlumination
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsIluminationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsIlumination_1=ruleGraphicRootClassesItemsConstraintsIlumination();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsIlumination_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:386:3: this_GraphicRootClassesItemsConstraintsSizeMax_2= ruleGraphicRootClassesItemsConstraintsSizeMax
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsSizeMaxParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsSizeMax_2=ruleGraphicRootClassesItemsConstraintsSizeMax();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsSizeMax_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGraphicParser.g:395:3: this_GraphicRootClassesItemsConstraintsSizeMin_3= ruleGraphicRootClassesItemsConstraintsSizeMin
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsSizeMinParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsSizeMin_3=ruleGraphicRootClassesItemsConstraintsSizeMin();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsSizeMin_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGraphicParser.g:404:3: this_GraphicRootClassesItemsConstraintsSizeInit_4= ruleGraphicRootClassesItemsConstraintsSizeInit
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsSizeInitParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsSizeInit_4=ruleGraphicRootClassesItemsConstraintsSizeInit();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsSizeInit_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGraphicParser.g:413:3: this_GraphicRootClassesItemsConstraintsOverlapping_5= ruleGraphicRootClassesItemsConstraintsOverlapping
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsOverlappingParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsOverlapping_5=ruleGraphicRootClassesItemsConstraintsOverlapping();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsOverlapping_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGraphicParser.g:422:3: this_GraphicRootClassesItemsConstraintsXToOriginPos_6= ruleGraphicRootClassesItemsConstraintsXToOriginPos
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsXToOriginPosParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsXToOriginPos_6=ruleGraphicRootClassesItemsConstraintsXToOriginPos();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsXToOriginPos_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGraphicParser.g:431:3: this_GraphicRootClassesItemsConstraintsYToOriginPos_7= ruleGraphicRootClassesItemsConstraintsYToOriginPos
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsYToOriginPosParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsYToOriginPos_7=ruleGraphicRootClassesItemsConstraintsYToOriginPos();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsYToOriginPos_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalGraphicParser.g:440:3: this_GraphicRootClassesItemsConstraintsZToOriginPos_8= ruleGraphicRootClassesItemsConstraintsZToOriginPos
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsZToOriginPosParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsZToOriginPos_8=ruleGraphicRootClassesItemsConstraintsZToOriginPos();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsZToOriginPos_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalGraphicParser.g:449:3: this_GraphicRootClassesItemsConstraintsRotation_9= ruleGraphicRootClassesItemsConstraintsRotation
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsRotationParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsRotation_9=ruleGraphicRootClassesItemsConstraintsRotation();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsRotation_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalGraphicParser.g:458:3: this_GraphicRootClassesItemsConstraintsText_10= ruleGraphicRootClassesItemsConstraintsText
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsTextParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsText_10=ruleGraphicRootClassesItemsConstraintsText();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsText_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalGraphicParser.g:467:3: this_GraphicRootClassesItemsConstraintsTrim_11= ruleGraphicRootClassesItemsConstraintsTrim
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsTrimParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsTrim_11=ruleGraphicRootClassesItemsConstraintsTrim();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsTrim_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalGraphicParser.g:476:3: this_GraphicRootClassesItemsConstraintsCategoryBitMask_12= ruleGraphicRootClassesItemsConstraintsCategoryBitMask
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsCategoryBitMaskParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsCategoryBitMask_12=ruleGraphicRootClassesItemsConstraintsCategoryBitMask();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsCategoryBitMask_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalGraphicParser.g:485:3: this_GraphicRootClassesItemsConstraintsCollisionBitMask_13= ruleGraphicRootClassesItemsConstraintsCollisionBitMask
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsCollisionBitMaskParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsCollisionBitMask_13=ruleGraphicRootClassesItemsConstraintsCollisionBitMask();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsCollisionBitMask_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalGraphicParser.g:494:3: this_GraphicRootClassesItemsConstraintsContactTestBitMask_14= ruleGraphicRootClassesItemsConstraintsContactTestBitMask
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsContactTestBitMaskParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConstraintsContactTestBitMask_14=ruleGraphicRootClassesItemsConstraintsContactTestBitMask();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConstraintsContactTestBitMask_14;
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsPropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract"
    // InternalGraphicParser.g:506:1: entryRuleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract = null;


        try {
            // InternalGraphicParser.g:506:98: (iv_ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract EOF )
            // InternalGraphicParser.g:507:2: iv_ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract=ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract"
    // InternalGraphicParser.g:513:1: ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract returns [EObject current=null] : (this_GraphicRootClassesItemsConnectionsItemsName_0= ruleGraphicRootClassesItemsConnectionsItemsName | this_GraphicRootClassesItemsConnectionsItemsType_1= ruleGraphicRootClassesItemsConnectionsItemsType | this_GraphicRootClassesItemsConnectionsItemsColor_2= ruleGraphicRootClassesItemsConnectionsItemsColor | this_GraphicRootClassesItemsConnectionsItemsTextColor_3= ruleGraphicRootClassesItemsConnectionsItemsTextColor | this_GraphicRootClassesItemsConnectionsItemsDecorator_4= ruleGraphicRootClassesItemsConnectionsItemsDecorator | this_GraphicRootClassesItemsConnectionsItemsDecoratorColor_5= ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor | this_GraphicRootClassesItemsConnectionsItemsDecoratorWidth_6= ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth | this_GraphicRootClassesItemsConnectionsItemsDecoratorPos_7= ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos | this_GraphicRootClassesItemsConnectionsItemsPattern_8= ruleGraphicRootClassesItemsConnectionsItemsPattern | this_GraphicRootClassesItemsConnectionsItemsWidth_9= ruleGraphicRootClassesItemsConnectionsItemsWidth | this_GraphicRootClassesItemsConnectionsItemsPosition_10= ruleGraphicRootClassesItemsConnectionsItemsPosition | this_GraphicRootClassesItemsConnectionsItemsTarget_11= ruleGraphicRootClassesItemsConnectionsItemsTarget ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsName_0 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsType_1 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsColor_2 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsTextColor_3 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsDecorator_4 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsDecoratorColor_5 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsDecoratorWidth_6 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsDecoratorPos_7 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsPattern_8 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsWidth_9 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsPosition_10 = null;

        EObject this_GraphicRootClassesItemsConnectionsItemsTarget_11 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:519:2: ( (this_GraphicRootClassesItemsConnectionsItemsName_0= ruleGraphicRootClassesItemsConnectionsItemsName | this_GraphicRootClassesItemsConnectionsItemsType_1= ruleGraphicRootClassesItemsConnectionsItemsType | this_GraphicRootClassesItemsConnectionsItemsColor_2= ruleGraphicRootClassesItemsConnectionsItemsColor | this_GraphicRootClassesItemsConnectionsItemsTextColor_3= ruleGraphicRootClassesItemsConnectionsItemsTextColor | this_GraphicRootClassesItemsConnectionsItemsDecorator_4= ruleGraphicRootClassesItemsConnectionsItemsDecorator | this_GraphicRootClassesItemsConnectionsItemsDecoratorColor_5= ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor | this_GraphicRootClassesItemsConnectionsItemsDecoratorWidth_6= ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth | this_GraphicRootClassesItemsConnectionsItemsDecoratorPos_7= ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos | this_GraphicRootClassesItemsConnectionsItemsPattern_8= ruleGraphicRootClassesItemsConnectionsItemsPattern | this_GraphicRootClassesItemsConnectionsItemsWidth_9= ruleGraphicRootClassesItemsConnectionsItemsWidth | this_GraphicRootClassesItemsConnectionsItemsPosition_10= ruleGraphicRootClassesItemsConnectionsItemsPosition | this_GraphicRootClassesItemsConnectionsItemsTarget_11= ruleGraphicRootClassesItemsConnectionsItemsTarget ) )
            // InternalGraphicParser.g:520:2: (this_GraphicRootClassesItemsConnectionsItemsName_0= ruleGraphicRootClassesItemsConnectionsItemsName | this_GraphicRootClassesItemsConnectionsItemsType_1= ruleGraphicRootClassesItemsConnectionsItemsType | this_GraphicRootClassesItemsConnectionsItemsColor_2= ruleGraphicRootClassesItemsConnectionsItemsColor | this_GraphicRootClassesItemsConnectionsItemsTextColor_3= ruleGraphicRootClassesItemsConnectionsItemsTextColor | this_GraphicRootClassesItemsConnectionsItemsDecorator_4= ruleGraphicRootClassesItemsConnectionsItemsDecorator | this_GraphicRootClassesItemsConnectionsItemsDecoratorColor_5= ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor | this_GraphicRootClassesItemsConnectionsItemsDecoratorWidth_6= ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth | this_GraphicRootClassesItemsConnectionsItemsDecoratorPos_7= ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos | this_GraphicRootClassesItemsConnectionsItemsPattern_8= ruleGraphicRootClassesItemsConnectionsItemsPattern | this_GraphicRootClassesItemsConnectionsItemsWidth_9= ruleGraphicRootClassesItemsConnectionsItemsWidth | this_GraphicRootClassesItemsConnectionsItemsPosition_10= ruleGraphicRootClassesItemsConnectionsItemsPosition | this_GraphicRootClassesItemsConnectionsItemsTarget_11= ruleGraphicRootClassesItemsConnectionsItemsTarget )
            {
            // InternalGraphicParser.g:520:2: (this_GraphicRootClassesItemsConnectionsItemsName_0= ruleGraphicRootClassesItemsConnectionsItemsName | this_GraphicRootClassesItemsConnectionsItemsType_1= ruleGraphicRootClassesItemsConnectionsItemsType | this_GraphicRootClassesItemsConnectionsItemsColor_2= ruleGraphicRootClassesItemsConnectionsItemsColor | this_GraphicRootClassesItemsConnectionsItemsTextColor_3= ruleGraphicRootClassesItemsConnectionsItemsTextColor | this_GraphicRootClassesItemsConnectionsItemsDecorator_4= ruleGraphicRootClassesItemsConnectionsItemsDecorator | this_GraphicRootClassesItemsConnectionsItemsDecoratorColor_5= ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor | this_GraphicRootClassesItemsConnectionsItemsDecoratorWidth_6= ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth | this_GraphicRootClassesItemsConnectionsItemsDecoratorPos_7= ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos | this_GraphicRootClassesItemsConnectionsItemsPattern_8= ruleGraphicRootClassesItemsConnectionsItemsPattern | this_GraphicRootClassesItemsConnectionsItemsWidth_9= ruleGraphicRootClassesItemsConnectionsItemsWidth | this_GraphicRootClassesItemsConnectionsItemsPosition_10= ruleGraphicRootClassesItemsConnectionsItemsPosition | this_GraphicRootClassesItemsConnectionsItemsTarget_11= ruleGraphicRootClassesItemsConnectionsItemsTarget )
            int alt8=12;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt8=1;
                }
                break;
            case Type:
                {
                alt8=2;
                }
                break;
            case Color:
                {
                alt8=3;
                }
                break;
            case TextColor:
                {
                alt8=4;
                }
                break;
            case Decorator:
                {
                alt8=5;
                }
                break;
            case DecoratorColor:
                {
                alt8=6;
                }
                break;
            case DecoratorWidth:
                {
                alt8=7;
                }
                break;
            case DecoratorPos:
                {
                alt8=8;
                }
                break;
            case Pattern:
                {
                alt8=9;
                }
                break;
            case Width:
                {
                alt8=10;
                }
                break;
            case Position:
                {
                alt8=11;
                }
                break;
            case Target:
                {
                alt8=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGraphicParser.g:521:3: this_GraphicRootClassesItemsConnectionsItemsName_0= ruleGraphicRootClassesItemsConnectionsItemsName
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsName_0=ruleGraphicRootClassesItemsConnectionsItemsName();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:530:3: this_GraphicRootClassesItemsConnectionsItemsType_1= ruleGraphicRootClassesItemsConnectionsItemsType
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsType_1=ruleGraphicRootClassesItemsConnectionsItemsType();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:539:3: this_GraphicRootClassesItemsConnectionsItemsColor_2= ruleGraphicRootClassesItemsConnectionsItemsColor
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsColorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsColor_2=ruleGraphicRootClassesItemsConnectionsItemsColor();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsColor_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGraphicParser.g:548:3: this_GraphicRootClassesItemsConnectionsItemsTextColor_3= ruleGraphicRootClassesItemsConnectionsItemsTextColor
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsTextColorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsTextColor_3=ruleGraphicRootClassesItemsConnectionsItemsTextColor();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsTextColor_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGraphicParser.g:557:3: this_GraphicRootClassesItemsConnectionsItemsDecorator_4= ruleGraphicRootClassesItemsConnectionsItemsDecorator
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsDecorator_4=ruleGraphicRootClassesItemsConnectionsItemsDecorator();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsDecorator_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGraphicParser.g:566:3: this_GraphicRootClassesItemsConnectionsItemsDecoratorColor_5= ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorColorParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsDecoratorColor_5=ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsDecoratorColor_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGraphicParser.g:575:3: this_GraphicRootClassesItemsConnectionsItemsDecoratorWidth_6= ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorWidthParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsDecoratorWidth_6=ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsDecoratorWidth_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGraphicParser.g:584:3: this_GraphicRootClassesItemsConnectionsItemsDecoratorPos_7= ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorPosParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsDecoratorPos_7=ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsDecoratorPos_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalGraphicParser.g:593:3: this_GraphicRootClassesItemsConnectionsItemsPattern_8= ruleGraphicRootClassesItemsConnectionsItemsPattern
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsPatternParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsPattern_8=ruleGraphicRootClassesItemsConnectionsItemsPattern();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsPattern_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalGraphicParser.g:602:3: this_GraphicRootClassesItemsConnectionsItemsWidth_9= ruleGraphicRootClassesItemsConnectionsItemsWidth
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsWidthParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsWidth_9=ruleGraphicRootClassesItemsConnectionsItemsWidth();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsWidth_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalGraphicParser.g:611:3: this_GraphicRootClassesItemsConnectionsItemsPosition_10= ruleGraphicRootClassesItemsConnectionsItemsPosition
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsPositionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsPosition_10=ruleGraphicRootClassesItemsConnectionsItemsPosition();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsPosition_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalGraphicParser.g:620:3: this_GraphicRootClassesItemsConnectionsItemsTarget_11= ruleGraphicRootClassesItemsConnectionsItemsTarget
                    {

                    			newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsTargetParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicRootClassesItemsConnectionsItemsTarget_11=ruleGraphicRootClassesItemsConnectionsItemsTarget();

                    state._fsp--;


                    			current = this_GraphicRootClassesItemsConnectionsItemsTarget_11;
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootName"
    // InternalGraphicParser.g:632:1: entryRuleGraphicRootName returns [EObject current=null] : iv_ruleGraphicRootName= ruleGraphicRootName EOF ;
    public final EObject entryRuleGraphicRootName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootName = null;


        try {
            // InternalGraphicParser.g:632:56: (iv_ruleGraphicRootName= ruleGraphicRootName EOF )
            // InternalGraphicParser.g:633:2: iv_ruleGraphicRootName= ruleGraphicRootName EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootName=ruleGraphicRootName();

            state._fsp--;

             current =iv_ruleGraphicRootName; 
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
    // $ANTLR end "entryRuleGraphicRootName"


    // $ANTLR start "ruleGraphicRootName"
    // InternalGraphicParser.g:639:1: ruleGraphicRootName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:645:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:646:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:646:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalGraphicParser.g:647:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalGraphicParser.g:647:3: ()
            // InternalGraphicParser.g:648:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootNameAccess().getGraphicRootNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicRootNameAccess().getColonKeyword_2());
            		
            // InternalGraphicParser.g:662:3: ( (lv_name_3_0= ruleEString ) )
            // InternalGraphicParser.g:663:4: (lv_name_3_0= ruleEString )
            {
            // InternalGraphicParser.g:663:4: (lv_name_3_0= ruleEString )
            // InternalGraphicParser.g:664:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootName"


    // $ANTLR start "entryRuleGraphicRootURI"
    // InternalGraphicParser.g:685:1: entryRuleGraphicRootURI returns [EObject current=null] : iv_ruleGraphicRootURI= ruleGraphicRootURI EOF ;
    public final EObject entryRuleGraphicRootURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootURI = null;


        try {
            // InternalGraphicParser.g:685:55: (iv_ruleGraphicRootURI= ruleGraphicRootURI EOF )
            // InternalGraphicParser.g:686:2: iv_ruleGraphicRootURI= ruleGraphicRootURI EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootURIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootURI=ruleGraphicRootURI();

            state._fsp--;

             current =iv_ruleGraphicRootURI; 
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
    // $ANTLR end "entryRuleGraphicRootURI"


    // $ANTLR start "ruleGraphicRootURI"
    // InternalGraphicParser.g:692:1: ruleGraphicRootURI returns [EObject current=null] : (otherlv_0= URI otherlv_1= Colon ( (lv_URI_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootURI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_URI_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:698:2: ( (otherlv_0= URI otherlv_1= Colon ( (lv_URI_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:699:2: (otherlv_0= URI otherlv_1= Colon ( (lv_URI_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:699:2: (otherlv_0= URI otherlv_1= Colon ( (lv_URI_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:700:3: otherlv_0= URI otherlv_1= Colon ( (lv_URI_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,URI,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootURIAccess().getURIKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootURIAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:708:3: ( (lv_URI_2_0= ruleEString ) )
            // InternalGraphicParser.g:709:4: (lv_URI_2_0= ruleEString )
            {
            // InternalGraphicParser.g:709:4: (lv_URI_2_0= ruleEString )
            // InternalGraphicParser.g:710:5: lv_URI_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootURIAccess().getURIEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_URI_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootURIRule());
            					}
            					set(
            						current,
            						"URI",
            						lv_URI_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootURI"


    // $ANTLR start "entryRuleGraphicRootClasses"
    // InternalGraphicParser.g:731:1: entryRuleGraphicRootClasses returns [EObject current=null] : iv_ruleGraphicRootClasses= ruleGraphicRootClasses EOF ;
    public final EObject entryRuleGraphicRootClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClasses = null;


        try {
            // InternalGraphicParser.g:731:59: (iv_ruleGraphicRootClasses= ruleGraphicRootClasses EOF )
            // InternalGraphicParser.g:732:2: iv_ruleGraphicRootClasses= ruleGraphicRootClasses EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClasses=ruleGraphicRootClasses();

            state._fsp--;

             current =iv_ruleGraphicRootClasses; 
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
    // $ANTLR end "entryRuleGraphicRootClasses"


    // $ANTLR start "ruleGraphicRootClasses"
    // InternalGraphicParser.g:738:1: ruleGraphicRootClasses returns [EObject current=null] : ( () otherlv_1= Classes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_classes_4_0= ruleGraphicRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleGraphicRootClassesItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleGraphicRootClasses() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_classes_4_0 = null;

        EObject lv_classes_6_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:744:2: ( ( () otherlv_1= Classes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_classes_4_0= ruleGraphicRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleGraphicRootClassesItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalGraphicParser.g:745:2: ( () otherlv_1= Classes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_classes_4_0= ruleGraphicRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleGraphicRootClassesItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalGraphicParser.g:745:2: ( () otherlv_1= Classes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_classes_4_0= ruleGraphicRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleGraphicRootClassesItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalGraphicParser.g:746:3: () otherlv_1= Classes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_classes_4_0= ruleGraphicRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleGraphicRootClassesItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalGraphicParser.g:746:3: ()
            // InternalGraphicParser.g:747:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesAccess().getGraphicRootClassesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Classes,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesAccess().getClassesKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicRootClassesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicRootClassesAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalGraphicParser.g:765:3: ( ( (lv_classes_4_0= ruleGraphicRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleGraphicRootClassesItems ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LeftCurlyBracket) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphicParser.g:766:4: ( (lv_classes_4_0= ruleGraphicRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleGraphicRootClassesItems ) ) )*
                    {
                    // InternalGraphicParser.g:766:4: ( (lv_classes_4_0= ruleGraphicRootClassesItems ) )
                    // InternalGraphicParser.g:767:5: (lv_classes_4_0= ruleGraphicRootClassesItems )
                    {
                    // InternalGraphicParser.g:767:5: (lv_classes_4_0= ruleGraphicRootClassesItems )
                    // InternalGraphicParser.g:768:6: lv_classes_4_0= ruleGraphicRootClassesItems
                    {

                    						newCompositeNode(grammarAccess.getGraphicRootClassesAccess().getClassesGraphicRootClassesItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_classes_4_0=ruleGraphicRootClassesItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphicRootClassesRule());
                    						}
                    						add(
                    							current,
                    							"classes",
                    							lv_classes_4_0,
                    							"graphic.graphic.Graphic.GraphicRootClassesItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphicParser.g:785:4: (otherlv_5= Comma ( (lv_classes_6_0= ruleGraphicRootClassesItems ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Comma) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGraphicParser.g:786:5: otherlv_5= Comma ( (lv_classes_6_0= ruleGraphicRootClassesItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getGraphicRootClassesAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGraphicParser.g:790:5: ( (lv_classes_6_0= ruleGraphicRootClassesItems ) )
                    	    // InternalGraphicParser.g:791:6: (lv_classes_6_0= ruleGraphicRootClassesItems )
                    	    {
                    	    // InternalGraphicParser.g:791:6: (lv_classes_6_0= ruleGraphicRootClassesItems )
                    	    // InternalGraphicParser.g:792:7: lv_classes_6_0= ruleGraphicRootClassesItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphicRootClassesAccess().getClassesGraphicRootClassesItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_classes_6_0=ruleGraphicRootClassesItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphicRootClassesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"classes",
                    	    								lv_classes_6_0,
                    	    								"graphic.graphic.Graphic.GraphicRootClassesItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphicRootClassesAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleGraphicRootClasses"


    // $ANTLR start "entryRuleEString"
    // InternalGraphicParser.g:819:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGraphicParser.g:819:47: (iv_ruleEString= ruleEString EOF )
            // InternalGraphicParser.g:820:2: iv_ruleEString= ruleEString EOF
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
    // InternalGraphicParser.g:826:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:832:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalGraphicParser.g:833:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleGraphicRootClassesItems"
    // InternalGraphicParser.g:846:1: entryRuleGraphicRootClassesItems returns [EObject current=null] : iv_ruleGraphicRootClassesItems= ruleGraphicRootClassesItems EOF ;
    public final EObject entryRuleGraphicRootClassesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItems = null;


        try {
            // InternalGraphicParser.g:846:64: (iv_ruleGraphicRootClassesItems= ruleGraphicRootClassesItems EOF )
            // InternalGraphicParser.g:847:2: iv_ruleGraphicRootClassesItems= ruleGraphicRootClassesItems EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItems=ruleGraphicRootClassesItems();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItems; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItems"


    // $ANTLR start "ruleGraphicRootClassesItems"
    // InternalGraphicParser.g:853:1: ruleGraphicRootClassesItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleGraphicRootClassesItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:859:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGraphicParser.g:860:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGraphicParser.g:860:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGraphicParser.g:861:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGraphicParser.g:861:3: ()
            // InternalGraphicParser.g:862:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesItemsAccess().getGraphicRootClassesItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphicParser.g:872:3: ( ( (lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==MaterialAttributes||LA12_0==ShowAttributes||(LA12_0>=Connections && LA12_0<=Constraints)||LA12_0==Versions||LA12_0==Vname||LA12_0==Name) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGraphicParser.g:873:4: ( (lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) )*
                    {
                    // InternalGraphicParser.g:873:4: ( (lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract ) )
                    // InternalGraphicParser.g:874:5: (lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract )
                    {
                    // InternalGraphicParser.g:874:5: (lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract )
                    // InternalGraphicParser.g:875:6: lv_items_2_0= ruleGraphicRootClassesItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getGraphicRootClassesItemsAccess().getItemsGraphicRootClassesItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleGraphicRootClassesItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"graphic.graphic.Graphic.GraphicRootClassesItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphicParser.g:892:4: (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Comma) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGraphicParser.g:893:5: otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_13); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getGraphicRootClassesItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalGraphicParser.g:897:5: ( (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract ) )
                    	    // InternalGraphicParser.g:898:6: (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract )
                    	    {
                    	    // InternalGraphicParser.g:898:6: (lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract )
                    	    // InternalGraphicParser.g:899:7: lv_items_4_0= ruleGraphicRootClassesItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphicRootClassesItemsAccess().getItemsGraphicRootClassesItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleGraphicRootClassesItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"graphic.graphic.Graphic.GraphicRootClassesItemsPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphicRootClassesItemsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleGraphicRootClassesItems"


    // $ANTLR start "entryRuleGraphicRootClassesItemsName"
    // InternalGraphicParser.g:926:1: entryRuleGraphicRootClassesItemsName returns [EObject current=null] : iv_ruleGraphicRootClassesItemsName= ruleGraphicRootClassesItemsName EOF ;
    public final EObject entryRuleGraphicRootClassesItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsName = null;


        try {
            // InternalGraphicParser.g:926:68: (iv_ruleGraphicRootClassesItemsName= ruleGraphicRootClassesItemsName EOF )
            // InternalGraphicParser.g:927:2: iv_ruleGraphicRootClassesItemsName= ruleGraphicRootClassesItemsName EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsName=ruleGraphicRootClassesItemsName();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsName; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsName"


    // $ANTLR start "ruleGraphicRootClassesItemsName"
    // InternalGraphicParser.g:933:1: ruleGraphicRootClassesItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:939:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:940:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:940:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalGraphicParser.g:941:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalGraphicParser.g:941:3: ()
            // InternalGraphicParser.g:942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesItemsNameAccess().getGraphicRootClassesItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicRootClassesItemsNameAccess().getColonKeyword_2());
            		
            // InternalGraphicParser.g:956:3: ( (lv_name_3_0= ruleEString ) )
            // InternalGraphicParser.g:957:4: (lv_name_3_0= ruleEString )
            {
            // InternalGraphicParser.g:957:4: (lv_name_3_0= ruleEString )
            // InternalGraphicParser.g:958:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsName"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVersions"
    // InternalGraphicParser.g:979:1: entryRuleGraphicRootClassesItemsVersions returns [EObject current=null] : iv_ruleGraphicRootClassesItemsVersions= ruleGraphicRootClassesItemsVersions EOF ;
    public final EObject entryRuleGraphicRootClassesItemsVersions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsVersions = null;


        try {
            // InternalGraphicParser.g:979:72: (iv_ruleGraphicRootClassesItemsVersions= ruleGraphicRootClassesItemsVersions EOF )
            // InternalGraphicParser.g:980:2: iv_ruleGraphicRootClassesItemsVersions= ruleGraphicRootClassesItemsVersions EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsVersions=ruleGraphicRootClassesItemsVersions();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsVersions; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsVersions"


    // $ANTLR start "ruleGraphicRootClassesItemsVersions"
    // InternalGraphicParser.g:986:1: ruleGraphicRootClassesItemsVersions returns [EObject current=null] : ( () otherlv_1= Versions otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleGraphicRootClassesItemsVersions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_versions_4_0 = null;

        EObject lv_versions_6_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:992:2: ( ( () otherlv_1= Versions otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalGraphicParser.g:993:2: ( () otherlv_1= Versions otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalGraphicParser.g:993:2: ( () otherlv_1= Versions otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalGraphicParser.g:994:3: () otherlv_1= Versions otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalGraphicParser.g:994:3: ()
            // InternalGraphicParser.g:995:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesItemsVersionsAccess().getGraphicRootClassesItemsVersionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Versions,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicRootClassesItemsVersionsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicRootClassesItemsVersionsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGraphicParser.g:1013:3: ( ( (lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=V1 && LA14_0<=V3)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphicParser.g:1014:4: ( (lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) )*
                    {
                    // InternalGraphicParser.g:1014:4: ( (lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) )
                    // InternalGraphicParser.g:1015:5: (lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract )
                    {
                    // InternalGraphicParser.g:1015:5: (lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract )
                    // InternalGraphicParser.g:1016:6: lv_versions_4_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsGraphicRootClassesItemsVersionsPropertiesAbstractParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_versions_4_0=ruleGraphicRootClassesItemsVersionsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsVersionsRule());
                    						}
                    						add(
                    							current,
                    							"versions",
                    							lv_versions_4_0,
                    							"graphic.graphic.Graphic.GraphicRootClassesItemsVersionsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphicParser.g:1033:4: (otherlv_5= Comma ( (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Comma) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGraphicParser.g:1034:5: otherlv_5= Comma ( (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getGraphicRootClassesItemsVersionsAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGraphicParser.g:1038:5: ( (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) )
                    	    // InternalGraphicParser.g:1039:6: (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract )
                    	    {
                    	    // InternalGraphicParser.g:1039:6: (lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract )
                    	    // InternalGraphicParser.g:1040:7: lv_versions_6_0= ruleGraphicRootClassesItemsVersionsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsGraphicRootClassesItemsVersionsPropertiesAbstractParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_versions_6_0=ruleGraphicRootClassesItemsVersionsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsVersionsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"versions",
                    	    								lv_versions_6_0,
                    	    								"graphic.graphic.Graphic.GraphicRootClassesItemsVersionsPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphicRootClassesItemsVersionsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleGraphicRootClassesItemsVersions"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVname"
    // InternalGraphicParser.g:1067:1: entryRuleGraphicRootClassesItemsVname returns [EObject current=null] : iv_ruleGraphicRootClassesItemsVname= ruleGraphicRootClassesItemsVname EOF ;
    public final EObject entryRuleGraphicRootClassesItemsVname() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsVname = null;


        try {
            // InternalGraphicParser.g:1067:69: (iv_ruleGraphicRootClassesItemsVname= ruleGraphicRootClassesItemsVname EOF )
            // InternalGraphicParser.g:1068:2: iv_ruleGraphicRootClassesItemsVname= ruleGraphicRootClassesItemsVname EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsVname=ruleGraphicRootClassesItemsVname();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsVname; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsVname"


    // $ANTLR start "ruleGraphicRootClassesItemsVname"
    // InternalGraphicParser.g:1074:1: ruleGraphicRootClassesItemsVname returns [EObject current=null] : ( () otherlv_1= Vname otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) (otherlv_5= Comma ( (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleGraphicRootClassesItemsVname() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_vname_4_0 = null;

        EObject lv_vname_6_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1080:2: ( ( () otherlv_1= Vname otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) (otherlv_5= Comma ( (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalGraphicParser.g:1081:2: ( () otherlv_1= Vname otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) (otherlv_5= Comma ( (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalGraphicParser.g:1081:2: ( () otherlv_1= Vname otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) (otherlv_5= Comma ( (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalGraphicParser.g:1082:3: () otherlv_1= Vname otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) (otherlv_5= Comma ( (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalGraphicParser.g:1082:3: ()
            // InternalGraphicParser.g:1083:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesItemsVnameAccess().getGraphicRootClassesItemsVnameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Vname,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicRootClassesItemsVnameAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicRootClassesItemsVnameAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGraphicParser.g:1101:3: ( ( (lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) (otherlv_5= Comma ( (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=V1 && LA16_0<=V3)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGraphicParser.g:1102:4: ( (lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) (otherlv_5= Comma ( (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) )*
                    {
                    // InternalGraphicParser.g:1102:4: ( (lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) )
                    // InternalGraphicParser.g:1103:5: (lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract )
                    {
                    // InternalGraphicParser.g:1103:5: (lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract )
                    // InternalGraphicParser.g:1104:6: lv_vname_4_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameGraphicRootClassesItemsVnamePropertiesAbstractParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_vname_4_0=ruleGraphicRootClassesItemsVnamePropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsVnameRule());
                    						}
                    						add(
                    							current,
                    							"vname",
                    							lv_vname_4_0,
                    							"graphic.graphic.Graphic.GraphicRootClassesItemsVnamePropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphicParser.g:1121:4: (otherlv_5= Comma ( (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==Comma) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalGraphicParser.g:1122:5: otherlv_5= Comma ( (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getGraphicRootClassesItemsVnameAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGraphicParser.g:1126:5: ( (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract ) )
                    	    // InternalGraphicParser.g:1127:6: (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract )
                    	    {
                    	    // InternalGraphicParser.g:1127:6: (lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract )
                    	    // InternalGraphicParser.g:1128:7: lv_vname_6_0= ruleGraphicRootClassesItemsVnamePropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameGraphicRootClassesItemsVnamePropertiesAbstractParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_vname_6_0=ruleGraphicRootClassesItemsVnamePropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsVnameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vname",
                    	    								lv_vname_6_0,
                    	    								"graphic.graphic.Graphic.GraphicRootClassesItemsVnamePropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphicRootClassesItemsVnameAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleGraphicRootClassesItemsVname"


    // $ANTLR start "entryRuleGraphicRootClassesItemsShowAttributes"
    // InternalGraphicParser.g:1155:1: entryRuleGraphicRootClassesItemsShowAttributes returns [EObject current=null] : iv_ruleGraphicRootClassesItemsShowAttributes= ruleGraphicRootClassesItemsShowAttributes EOF ;
    public final EObject entryRuleGraphicRootClassesItemsShowAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsShowAttributes = null;


        try {
            // InternalGraphicParser.g:1155:78: (iv_ruleGraphicRootClassesItemsShowAttributes= ruleGraphicRootClassesItemsShowAttributes EOF )
            // InternalGraphicParser.g:1156:2: iv_ruleGraphicRootClassesItemsShowAttributes= ruleGraphicRootClassesItemsShowAttributes EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsShowAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsShowAttributes=ruleGraphicRootClassesItemsShowAttributes();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsShowAttributes; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsShowAttributes"


    // $ANTLR start "ruleGraphicRootClassesItemsShowAttributes"
    // InternalGraphicParser.g:1162:1: ruleGraphicRootClassesItemsShowAttributes returns [EObject current=null] : ( () otherlv_1= ShowAttributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) (otherlv_5= Comma ( (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleGraphicRootClassesItemsShowAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_showAttributes_4_0 = null;

        EObject lv_showAttributes_6_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1168:2: ( ( () otherlv_1= ShowAttributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) (otherlv_5= Comma ( (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalGraphicParser.g:1169:2: ( () otherlv_1= ShowAttributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) (otherlv_5= Comma ( (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalGraphicParser.g:1169:2: ( () otherlv_1= ShowAttributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) (otherlv_5= Comma ( (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalGraphicParser.g:1170:3: () otherlv_1= ShowAttributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) (otherlv_5= Comma ( (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalGraphicParser.g:1170:3: ()
            // InternalGraphicParser.g:1171:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getGraphicRootClassesItemsShowAttributesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ShowAttributes,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalGraphicParser.g:1189:3: ( ( (lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) (otherlv_5= Comma ( (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=ContactTestBitMask && LA18_0<=URI)||(LA18_0>=V1 && LA18_0<=V3)||LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGraphicParser.g:1190:4: ( (lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) (otherlv_5= Comma ( (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) )*
                    {
                    // InternalGraphicParser.g:1190:4: ( (lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems ) )
                    // InternalGraphicParser.g:1191:5: (lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems )
                    {
                    // InternalGraphicParser.g:1191:5: (lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems )
                    // InternalGraphicParser.g:1192:6: lv_showAttributes_4_0= ruleGraphicRootClassesItemsShowAttributesItems
                    {

                    						newCompositeNode(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesGraphicRootClassesItemsShowAttributesItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_showAttributes_4_0=ruleGraphicRootClassesItemsShowAttributesItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsShowAttributesRule());
                    						}
                    						add(
                    							current,
                    							"showAttributes",
                    							lv_showAttributes_4_0,
                    							"graphic.graphic.Graphic.GraphicRootClassesItemsShowAttributesItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphicParser.g:1209:4: (otherlv_5= Comma ( (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==Comma) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalGraphicParser.g:1210:5: otherlv_5= Comma ( (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGraphicParser.g:1214:5: ( (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems ) )
                    	    // InternalGraphicParser.g:1215:6: (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems )
                    	    {
                    	    // InternalGraphicParser.g:1215:6: (lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems )
                    	    // InternalGraphicParser.g:1216:7: lv_showAttributes_6_0= ruleGraphicRootClassesItemsShowAttributesItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesGraphicRootClassesItemsShowAttributesItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_showAttributes_6_0=ruleGraphicRootClassesItemsShowAttributesItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsShowAttributesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"showAttributes",
                    	    								lv_showAttributes_6_0,
                    	    								"graphic.graphic.Graphic.GraphicRootClassesItemsShowAttributesItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleGraphicRootClassesItemsShowAttributes"


    // $ANTLR start "entryRuleGraphicRootClassesItemsMaterialAttributes"
    // InternalGraphicParser.g:1243:1: entryRuleGraphicRootClassesItemsMaterialAttributes returns [EObject current=null] : iv_ruleGraphicRootClassesItemsMaterialAttributes= ruleGraphicRootClassesItemsMaterialAttributes EOF ;
    public final EObject entryRuleGraphicRootClassesItemsMaterialAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsMaterialAttributes = null;


        try {
            // InternalGraphicParser.g:1243:82: (iv_ruleGraphicRootClassesItemsMaterialAttributes= ruleGraphicRootClassesItemsMaterialAttributes EOF )
            // InternalGraphicParser.g:1244:2: iv_ruleGraphicRootClassesItemsMaterialAttributes= ruleGraphicRootClassesItemsMaterialAttributes EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsMaterialAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsMaterialAttributes=ruleGraphicRootClassesItemsMaterialAttributes();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsMaterialAttributes; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsMaterialAttributes"


    // $ANTLR start "ruleGraphicRootClassesItemsMaterialAttributes"
    // InternalGraphicParser.g:1250:1: ruleGraphicRootClassesItemsMaterialAttributes returns [EObject current=null] : ( () otherlv_1= MaterialAttributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) (otherlv_5= Comma ( (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleGraphicRootClassesItemsMaterialAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_materialAttributes_4_0 = null;

        EObject lv_materialAttributes_6_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1256:2: ( ( () otherlv_1= MaterialAttributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) (otherlv_5= Comma ( (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalGraphicParser.g:1257:2: ( () otherlv_1= MaterialAttributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) (otherlv_5= Comma ( (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalGraphicParser.g:1257:2: ( () otherlv_1= MaterialAttributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) (otherlv_5= Comma ( (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalGraphicParser.g:1258:3: () otherlv_1= MaterialAttributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) (otherlv_5= Comma ( (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalGraphicParser.g:1258:3: ()
            // InternalGraphicParser.g:1259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getGraphicRootClassesItemsMaterialAttributesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,MaterialAttributes,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalGraphicParser.g:1277:3: ( ( (lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) (otherlv_5= Comma ( (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=ContactTestBitMask && LA20_0<=URI)||(LA20_0>=V1 && LA20_0<=V3)||LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGraphicParser.g:1278:4: ( (lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) (otherlv_5= Comma ( (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) )*
                    {
                    // InternalGraphicParser.g:1278:4: ( (lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) )
                    // InternalGraphicParser.g:1279:5: (lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems )
                    {
                    // InternalGraphicParser.g:1279:5: (lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems )
                    // InternalGraphicParser.g:1280:6: lv_materialAttributes_4_0= ruleGraphicRootClassesItemsMaterialAttributesItems
                    {

                    						newCompositeNode(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesGraphicRootClassesItemsMaterialAttributesItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_materialAttributes_4_0=ruleGraphicRootClassesItemsMaterialAttributesItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsMaterialAttributesRule());
                    						}
                    						add(
                    							current,
                    							"materialAttributes",
                    							lv_materialAttributes_4_0,
                    							"graphic.graphic.Graphic.GraphicRootClassesItemsMaterialAttributesItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphicParser.g:1297:4: (otherlv_5= Comma ( (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==Comma) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalGraphicParser.g:1298:5: otherlv_5= Comma ( (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGraphicParser.g:1302:5: ( (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems ) )
                    	    // InternalGraphicParser.g:1303:6: (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems )
                    	    {
                    	    // InternalGraphicParser.g:1303:6: (lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems )
                    	    // InternalGraphicParser.g:1304:7: lv_materialAttributes_6_0= ruleGraphicRootClassesItemsMaterialAttributesItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesGraphicRootClassesItemsMaterialAttributesItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_materialAttributes_6_0=ruleGraphicRootClassesItemsMaterialAttributesItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsMaterialAttributesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"materialAttributes",
                    	    								lv_materialAttributes_6_0,
                    	    								"graphic.graphic.Graphic.GraphicRootClassesItemsMaterialAttributesItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleGraphicRootClassesItemsMaterialAttributes"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraints"
    // InternalGraphicParser.g:1331:1: entryRuleGraphicRootClassesItemsConstraints returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraints= ruleGraphicRootClassesItemsConstraints EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraints = null;


        try {
            // InternalGraphicParser.g:1331:75: (iv_ruleGraphicRootClassesItemsConstraints= ruleGraphicRootClassesItemsConstraints EOF )
            // InternalGraphicParser.g:1332:2: iv_ruleGraphicRootClassesItemsConstraints= ruleGraphicRootClassesItemsConstraints EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraints=ruleGraphicRootClassesItemsConstraints();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraints; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraints"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraints"
    // InternalGraphicParser.g:1338:1: ruleGraphicRootClassesItemsConstraints returns [EObject current=null] : ( () otherlv_1= Constraints otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleGraphicRootClassesItemsConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_constraints_4_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1344:2: ( ( () otherlv_1= Constraints otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalGraphicParser.g:1345:2: ( () otherlv_1= Constraints otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalGraphicParser.g:1345:2: ( () otherlv_1= Constraints otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalGraphicParser.g:1346:3: () otherlv_1= Constraints otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalGraphicParser.g:1346:3: ()
            // InternalGraphicParser.g:1347:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getGraphicRootClassesItemsConstraintsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Constraints,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGraphicParser.g:1365:3: ( ( (lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ContactTestBitMask||(LA22_0>=CollisionBitMask && LA22_0<=CategoryBitMask)||(LA22_0>=XToOriginPos && LA22_0<=ZToOriginPos)||(LA22_0>=Ilumination && LA22_0<=Overlapping)||(LA22_0>=Rotation && LA22_0<=SizeInit)||(LA22_0>=SizeMax && LA22_0<=Planes)||(LA22_0>=Text && LA22_0<=Trim)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGraphicParser.g:1366:4: ( (lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) )*
                    {
                    // InternalGraphicParser.g:1366:4: ( (lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) )
                    // InternalGraphicParser.g:1367:5: (lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract )
                    {
                    // InternalGraphicParser.g:1367:5: (lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract )
                    // InternalGraphicParser.g:1368:6: lv_constraints_4_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsGraphicRootClassesItemsConstraintsPropertiesAbstractParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_constraints_4_0=ruleGraphicRootClassesItemsConstraintsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_4_0,
                    							"graphic.graphic.Graphic.GraphicRootClassesItemsConstraintsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphicParser.g:1385:4: (otherlv_5= Comma ( (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==Comma) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalGraphicParser.g:1386:5: otherlv_5= Comma ( (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_18); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGraphicParser.g:1390:5: ( (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) )
                    	    // InternalGraphicParser.g:1391:6: (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract )
                    	    {
                    	    // InternalGraphicParser.g:1391:6: (lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract )
                    	    // InternalGraphicParser.g:1392:7: lv_constraints_6_0= ruleGraphicRootClassesItemsConstraintsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsGraphicRootClassesItemsConstraintsPropertiesAbstractParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_constraints_6_0=ruleGraphicRootClassesItemsConstraintsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_6_0,
                    	    								"graphic.graphic.Graphic.GraphicRootClassesItemsConstraintsPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraints"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnections"
    // InternalGraphicParser.g:1419:1: entryRuleGraphicRootClassesItemsConnections returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnections= ruleGraphicRootClassesItemsConnections EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnections = null;


        try {
            // InternalGraphicParser.g:1419:75: (iv_ruleGraphicRootClassesItemsConnections= ruleGraphicRootClassesItemsConnections EOF )
            // InternalGraphicParser.g:1420:2: iv_ruleGraphicRootClassesItemsConnections= ruleGraphicRootClassesItemsConnections EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnections=ruleGraphicRootClassesItemsConnections();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnections; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnections"


    // $ANTLR start "ruleGraphicRootClassesItemsConnections"
    // InternalGraphicParser.g:1426:1: ruleGraphicRootClassesItemsConnections returns [EObject current=null] : ( () otherlv_1= Connections otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems ) ) (otherlv_5= Comma ( (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleGraphicRootClassesItemsConnections() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_connections_4_0 = null;

        EObject lv_connections_6_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1432:2: ( ( () otherlv_1= Connections otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems ) ) (otherlv_5= Comma ( (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalGraphicParser.g:1433:2: ( () otherlv_1= Connections otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems ) ) (otherlv_5= Comma ( (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalGraphicParser.g:1433:2: ( () otherlv_1= Connections otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems ) ) (otherlv_5= Comma ( (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalGraphicParser.g:1434:3: () otherlv_1= Connections otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems ) ) (otherlv_5= Comma ( (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalGraphicParser.g:1434:3: ()
            // InternalGraphicParser.g:1435:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getGraphicRootClassesItemsConnectionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Connections,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalGraphicParser.g:1453:3: ( ( (lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems ) ) (otherlv_5= Comma ( (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftCurlyBracket) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGraphicParser.g:1454:4: ( (lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems ) ) (otherlv_5= Comma ( (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems ) ) )*
                    {
                    // InternalGraphicParser.g:1454:4: ( (lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems ) )
                    // InternalGraphicParser.g:1455:5: (lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems )
                    {
                    // InternalGraphicParser.g:1455:5: (lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems )
                    // InternalGraphicParser.g:1456:6: lv_connections_4_0= ruleGraphicRootClassesItemsConnectionsItems
                    {

                    						newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsGraphicRootClassesItemsConnectionsItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_connections_4_0=ruleGraphicRootClassesItemsConnectionsItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsRule());
                    						}
                    						add(
                    							current,
                    							"connections",
                    							lv_connections_4_0,
                    							"graphic.graphic.Graphic.GraphicRootClassesItemsConnectionsItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphicParser.g:1473:4: (otherlv_5= Comma ( (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==Comma) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGraphicParser.g:1474:5: otherlv_5= Comma ( (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalGraphicParser.g:1478:5: ( (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems ) )
                    	    // InternalGraphicParser.g:1479:6: (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems )
                    	    {
                    	    // InternalGraphicParser.g:1479:6: (lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems )
                    	    // InternalGraphicParser.g:1480:7: lv_connections_6_0= ruleGraphicRootClassesItemsConnectionsItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsGraphicRootClassesItemsConnectionsItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_connections_6_0=ruleGraphicRootClassesItemsConnectionsItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"connections",
                    	    								lv_connections_6_0,
                    	    								"graphic.graphic.Graphic.GraphicRootClassesItemsConnectionsItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleGraphicRootClassesItemsConnections"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVersionsV1"
    // InternalGraphicParser.g:1507:1: entryRuleGraphicRootClassesItemsVersionsV1 returns [EObject current=null] : iv_ruleGraphicRootClassesItemsVersionsV1= ruleGraphicRootClassesItemsVersionsV1 EOF ;
    public final EObject entryRuleGraphicRootClassesItemsVersionsV1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsVersionsV1 = null;


        try {
            // InternalGraphicParser.g:1507:74: (iv_ruleGraphicRootClassesItemsVersionsV1= ruleGraphicRootClassesItemsVersionsV1 EOF )
            // InternalGraphicParser.g:1508:2: iv_ruleGraphicRootClassesItemsVersionsV1= ruleGraphicRootClassesItemsVersionsV1 EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsV1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsVersionsV1=ruleGraphicRootClassesItemsVersionsV1();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsVersionsV1; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsVersionsV1"


    // $ANTLR start "ruleGraphicRootClassesItemsVersionsV1"
    // InternalGraphicParser.g:1514:1: ruleGraphicRootClassesItemsVersionsV1 returns [EObject current=null] : (otherlv_0= V1 otherlv_1= Colon ( (lv_v1_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsVersionsV1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_v1_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1520:2: ( (otherlv_0= V1 otherlv_1= Colon ( (lv_v1_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:1521:2: (otherlv_0= V1 otherlv_1= Colon ( (lv_v1_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:1521:2: (otherlv_0= V1 otherlv_1= Colon ( (lv_v1_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:1522:3: otherlv_0= V1 otherlv_1= Colon ( (lv_v1_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,V1,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getV1Keyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getColonKeyword_1());
            		
            // InternalGraphicParser.g:1530:3: ( (lv_v1_2_0= ruleEString ) )
            // InternalGraphicParser.g:1531:4: (lv_v1_2_0= ruleEString )
            {
            // InternalGraphicParser.g:1531:4: (lv_v1_2_0= ruleEString )
            // InternalGraphicParser.g:1532:5: lv_v1_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getV1EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_v1_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsVersionsV1Rule());
            					}
            					set(
            						current,
            						"v1",
            						lv_v1_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsVersionsV1"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVersionsV2"
    // InternalGraphicParser.g:1553:1: entryRuleGraphicRootClassesItemsVersionsV2 returns [EObject current=null] : iv_ruleGraphicRootClassesItemsVersionsV2= ruleGraphicRootClassesItemsVersionsV2 EOF ;
    public final EObject entryRuleGraphicRootClassesItemsVersionsV2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsVersionsV2 = null;


        try {
            // InternalGraphicParser.g:1553:74: (iv_ruleGraphicRootClassesItemsVersionsV2= ruleGraphicRootClassesItemsVersionsV2 EOF )
            // InternalGraphicParser.g:1554:2: iv_ruleGraphicRootClassesItemsVersionsV2= ruleGraphicRootClassesItemsVersionsV2 EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsV2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsVersionsV2=ruleGraphicRootClassesItemsVersionsV2();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsVersionsV2; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsVersionsV2"


    // $ANTLR start "ruleGraphicRootClassesItemsVersionsV2"
    // InternalGraphicParser.g:1560:1: ruleGraphicRootClassesItemsVersionsV2 returns [EObject current=null] : (otherlv_0= V2 otherlv_1= Colon ( (lv_v2_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsVersionsV2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_v2_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1566:2: ( (otherlv_0= V2 otherlv_1= Colon ( (lv_v2_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:1567:2: (otherlv_0= V2 otherlv_1= Colon ( (lv_v2_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:1567:2: (otherlv_0= V2 otherlv_1= Colon ( (lv_v2_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:1568:3: otherlv_0= V2 otherlv_1= Colon ( (lv_v2_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,V2,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getV2Keyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getColonKeyword_1());
            		
            // InternalGraphicParser.g:1576:3: ( (lv_v2_2_0= ruleEString ) )
            // InternalGraphicParser.g:1577:4: (lv_v2_2_0= ruleEString )
            {
            // InternalGraphicParser.g:1577:4: (lv_v2_2_0= ruleEString )
            // InternalGraphicParser.g:1578:5: lv_v2_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getV2EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_v2_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsVersionsV2Rule());
            					}
            					set(
            						current,
            						"v2",
            						lv_v2_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsVersionsV2"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVersionsV3"
    // InternalGraphicParser.g:1599:1: entryRuleGraphicRootClassesItemsVersionsV3 returns [EObject current=null] : iv_ruleGraphicRootClassesItemsVersionsV3= ruleGraphicRootClassesItemsVersionsV3 EOF ;
    public final EObject entryRuleGraphicRootClassesItemsVersionsV3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsVersionsV3 = null;


        try {
            // InternalGraphicParser.g:1599:74: (iv_ruleGraphicRootClassesItemsVersionsV3= ruleGraphicRootClassesItemsVersionsV3 EOF )
            // InternalGraphicParser.g:1600:2: iv_ruleGraphicRootClassesItemsVersionsV3= ruleGraphicRootClassesItemsVersionsV3 EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsV3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsVersionsV3=ruleGraphicRootClassesItemsVersionsV3();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsVersionsV3; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsVersionsV3"


    // $ANTLR start "ruleGraphicRootClassesItemsVersionsV3"
    // InternalGraphicParser.g:1606:1: ruleGraphicRootClassesItemsVersionsV3 returns [EObject current=null] : (otherlv_0= V3 otherlv_1= Colon ( (lv_v3_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsVersionsV3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_v3_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1612:2: ( (otherlv_0= V3 otherlv_1= Colon ( (lv_v3_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:1613:2: (otherlv_0= V3 otherlv_1= Colon ( (lv_v3_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:1613:2: (otherlv_0= V3 otherlv_1= Colon ( (lv_v3_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:1614:3: otherlv_0= V3 otherlv_1= Colon ( (lv_v3_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,V3,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getV3Keyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getColonKeyword_1());
            		
            // InternalGraphicParser.g:1622:3: ( (lv_v3_2_0= ruleEString ) )
            // InternalGraphicParser.g:1623:4: (lv_v3_2_0= ruleEString )
            {
            // InternalGraphicParser.g:1623:4: (lv_v3_2_0= ruleEString )
            // InternalGraphicParser.g:1624:5: lv_v3_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getV3EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_v3_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsVersionsV3Rule());
            					}
            					set(
            						current,
            						"v3",
            						lv_v3_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsVersionsV3"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVnameV1"
    // InternalGraphicParser.g:1645:1: entryRuleGraphicRootClassesItemsVnameV1 returns [EObject current=null] : iv_ruleGraphicRootClassesItemsVnameV1= ruleGraphicRootClassesItemsVnameV1 EOF ;
    public final EObject entryRuleGraphicRootClassesItemsVnameV1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsVnameV1 = null;


        try {
            // InternalGraphicParser.g:1645:71: (iv_ruleGraphicRootClassesItemsVnameV1= ruleGraphicRootClassesItemsVnameV1 EOF )
            // InternalGraphicParser.g:1646:2: iv_ruleGraphicRootClassesItemsVnameV1= ruleGraphicRootClassesItemsVnameV1 EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnameV1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsVnameV1=ruleGraphicRootClassesItemsVnameV1();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsVnameV1; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsVnameV1"


    // $ANTLR start "ruleGraphicRootClassesItemsVnameV1"
    // InternalGraphicParser.g:1652:1: ruleGraphicRootClassesItemsVnameV1 returns [EObject current=null] : (otherlv_0= V1 otherlv_1= Colon ( (lv_v1_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsVnameV1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_v1_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1658:2: ( (otherlv_0= V1 otherlv_1= Colon ( (lv_v1_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:1659:2: (otherlv_0= V1 otherlv_1= Colon ( (lv_v1_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:1659:2: (otherlv_0= V1 otherlv_1= Colon ( (lv_v1_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:1660:3: otherlv_0= V1 otherlv_1= Colon ( (lv_v1_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,V1,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsVnameV1Access().getV1Keyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsVnameV1Access().getColonKeyword_1());
            		
            // InternalGraphicParser.g:1668:3: ( (lv_v1_2_0= ruleEString ) )
            // InternalGraphicParser.g:1669:4: (lv_v1_2_0= ruleEString )
            {
            // InternalGraphicParser.g:1669:4: (lv_v1_2_0= ruleEString )
            // InternalGraphicParser.g:1670:5: lv_v1_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getV1EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_v1_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsVnameV1Rule());
            					}
            					set(
            						current,
            						"v1",
            						lv_v1_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsVnameV1"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVnameV2"
    // InternalGraphicParser.g:1691:1: entryRuleGraphicRootClassesItemsVnameV2 returns [EObject current=null] : iv_ruleGraphicRootClassesItemsVnameV2= ruleGraphicRootClassesItemsVnameV2 EOF ;
    public final EObject entryRuleGraphicRootClassesItemsVnameV2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsVnameV2 = null;


        try {
            // InternalGraphicParser.g:1691:71: (iv_ruleGraphicRootClassesItemsVnameV2= ruleGraphicRootClassesItemsVnameV2 EOF )
            // InternalGraphicParser.g:1692:2: iv_ruleGraphicRootClassesItemsVnameV2= ruleGraphicRootClassesItemsVnameV2 EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnameV2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsVnameV2=ruleGraphicRootClassesItemsVnameV2();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsVnameV2; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsVnameV2"


    // $ANTLR start "ruleGraphicRootClassesItemsVnameV2"
    // InternalGraphicParser.g:1698:1: ruleGraphicRootClassesItemsVnameV2 returns [EObject current=null] : (otherlv_0= V2 otherlv_1= Colon ( (lv_v2_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsVnameV2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_v2_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1704:2: ( (otherlv_0= V2 otherlv_1= Colon ( (lv_v2_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:1705:2: (otherlv_0= V2 otherlv_1= Colon ( (lv_v2_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:1705:2: (otherlv_0= V2 otherlv_1= Colon ( (lv_v2_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:1706:3: otherlv_0= V2 otherlv_1= Colon ( (lv_v2_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,V2,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsVnameV2Access().getV2Keyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsVnameV2Access().getColonKeyword_1());
            		
            // InternalGraphicParser.g:1714:3: ( (lv_v2_2_0= ruleEString ) )
            // InternalGraphicParser.g:1715:4: (lv_v2_2_0= ruleEString )
            {
            // InternalGraphicParser.g:1715:4: (lv_v2_2_0= ruleEString )
            // InternalGraphicParser.g:1716:5: lv_v2_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getV2EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_v2_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsVnameV2Rule());
            					}
            					set(
            						current,
            						"v2",
            						lv_v2_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsVnameV2"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVnameV3"
    // InternalGraphicParser.g:1737:1: entryRuleGraphicRootClassesItemsVnameV3 returns [EObject current=null] : iv_ruleGraphicRootClassesItemsVnameV3= ruleGraphicRootClassesItemsVnameV3 EOF ;
    public final EObject entryRuleGraphicRootClassesItemsVnameV3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsVnameV3 = null;


        try {
            // InternalGraphicParser.g:1737:71: (iv_ruleGraphicRootClassesItemsVnameV3= ruleGraphicRootClassesItemsVnameV3 EOF )
            // InternalGraphicParser.g:1738:2: iv_ruleGraphicRootClassesItemsVnameV3= ruleGraphicRootClassesItemsVnameV3 EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnameV3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsVnameV3=ruleGraphicRootClassesItemsVnameV3();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsVnameV3; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsVnameV3"


    // $ANTLR start "ruleGraphicRootClassesItemsVnameV3"
    // InternalGraphicParser.g:1744:1: ruleGraphicRootClassesItemsVnameV3 returns [EObject current=null] : (otherlv_0= V3 otherlv_1= Colon ( (lv_v3_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsVnameV3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_v3_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1750:2: ( (otherlv_0= V3 otherlv_1= Colon ( (lv_v3_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:1751:2: (otherlv_0= V3 otherlv_1= Colon ( (lv_v3_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:1751:2: (otherlv_0= V3 otherlv_1= Colon ( (lv_v3_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:1752:3: otherlv_0= V3 otherlv_1= Colon ( (lv_v3_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,V3,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsVnameV3Access().getV3Keyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsVnameV3Access().getColonKeyword_1());
            		
            // InternalGraphicParser.g:1760:3: ( (lv_v3_2_0= ruleEString ) )
            // InternalGraphicParser.g:1761:4: (lv_v3_2_0= ruleEString )
            {
            // InternalGraphicParser.g:1761:4: (lv_v3_2_0= ruleEString )
            // InternalGraphicParser.g:1762:5: lv_v3_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getV3EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_v3_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsVnameV3Rule());
            					}
            					set(
            						current,
            						"v3",
            						lv_v3_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsVnameV3"


    // $ANTLR start "entryRuleGraphicRootClassesItemsShowAttributesItems"
    // InternalGraphicParser.g:1783:1: entryRuleGraphicRootClassesItemsShowAttributesItems returns [EObject current=null] : iv_ruleGraphicRootClassesItemsShowAttributesItems= ruleGraphicRootClassesItemsShowAttributesItems EOF ;
    public final EObject entryRuleGraphicRootClassesItemsShowAttributesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsShowAttributesItems = null;


        try {
            // InternalGraphicParser.g:1783:83: (iv_ruleGraphicRootClassesItemsShowAttributesItems= ruleGraphicRootClassesItemsShowAttributesItems EOF )
            // InternalGraphicParser.g:1784:2: iv_ruleGraphicRootClassesItemsShowAttributesItems= ruleGraphicRootClassesItemsShowAttributesItems EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsShowAttributesItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsShowAttributesItems=ruleGraphicRootClassesItemsShowAttributesItems();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsShowAttributesItems; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsShowAttributesItems"


    // $ANTLR start "ruleGraphicRootClassesItemsShowAttributesItems"
    // InternalGraphicParser.g:1790:1: ruleGraphicRootClassesItemsShowAttributesItems returns [EObject current=null] : ( (lv_items_0_0= ruleEString ) ) ;
    public final EObject ruleGraphicRootClassesItemsShowAttributesItems() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1796:2: ( ( (lv_items_0_0= ruleEString ) ) )
            // InternalGraphicParser.g:1797:2: ( (lv_items_0_0= ruleEString ) )
            {
            // InternalGraphicParser.g:1797:2: ( (lv_items_0_0= ruleEString ) )
            // InternalGraphicParser.g:1798:3: (lv_items_0_0= ruleEString )
            {
            // InternalGraphicParser.g:1798:3: (lv_items_0_0= ruleEString )
            // InternalGraphicParser.g:1799:4: lv_items_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getGraphicRootClassesItemsShowAttributesItemsAccess().getItemsEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsShowAttributesItemsRule());
            				}
            				set(
            					current,
            					"items",
            					lv_items_0_0,
            					"graphic.graphic.Graphic.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleGraphicRootClassesItemsShowAttributesItems"


    // $ANTLR start "entryRuleGraphicRootClassesItemsMaterialAttributesItems"
    // InternalGraphicParser.g:1819:1: entryRuleGraphicRootClassesItemsMaterialAttributesItems returns [EObject current=null] : iv_ruleGraphicRootClassesItemsMaterialAttributesItems= ruleGraphicRootClassesItemsMaterialAttributesItems EOF ;
    public final EObject entryRuleGraphicRootClassesItemsMaterialAttributesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsMaterialAttributesItems = null;


        try {
            // InternalGraphicParser.g:1819:87: (iv_ruleGraphicRootClassesItemsMaterialAttributesItems= ruleGraphicRootClassesItemsMaterialAttributesItems EOF )
            // InternalGraphicParser.g:1820:2: iv_ruleGraphicRootClassesItemsMaterialAttributesItems= ruleGraphicRootClassesItemsMaterialAttributesItems EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsMaterialAttributesItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsMaterialAttributesItems=ruleGraphicRootClassesItemsMaterialAttributesItems();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsMaterialAttributesItems; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsMaterialAttributesItems"


    // $ANTLR start "ruleGraphicRootClassesItemsMaterialAttributesItems"
    // InternalGraphicParser.g:1826:1: ruleGraphicRootClassesItemsMaterialAttributesItems returns [EObject current=null] : ( (lv_items_0_0= ruleEString ) ) ;
    public final EObject ruleGraphicRootClassesItemsMaterialAttributesItems() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1832:2: ( ( (lv_items_0_0= ruleEString ) ) )
            // InternalGraphicParser.g:1833:2: ( (lv_items_0_0= ruleEString ) )
            {
            // InternalGraphicParser.g:1833:2: ( (lv_items_0_0= ruleEString ) )
            // InternalGraphicParser.g:1834:3: (lv_items_0_0= ruleEString )
            {
            // InternalGraphicParser.g:1834:3: (lv_items_0_0= ruleEString )
            // InternalGraphicParser.g:1835:4: lv_items_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getGraphicRootClassesItemsMaterialAttributesItemsAccess().getItemsEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsMaterialAttributesItemsRule());
            				}
            				set(
            					current,
            					"items",
            					lv_items_0_0,
            					"graphic.graphic.Graphic.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleGraphicRootClassesItemsMaterialAttributesItems"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsPlanes"
    // InternalGraphicParser.g:1855:1: entryRuleGraphicRootClassesItemsConstraintsPlanes returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsPlanes= ruleGraphicRootClassesItemsConstraintsPlanes EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsPlanes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsPlanes = null;


        try {
            // InternalGraphicParser.g:1855:81: (iv_ruleGraphicRootClassesItemsConstraintsPlanes= ruleGraphicRootClassesItemsConstraintsPlanes EOF )
            // InternalGraphicParser.g:1856:2: iv_ruleGraphicRootClassesItemsConstraintsPlanes= ruleGraphicRootClassesItemsConstraintsPlanes EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsPlanes=ruleGraphicRootClassesItemsConstraintsPlanes();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsPlanes; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsPlanes"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsPlanes"
    // InternalGraphicParser.g:1862:1: ruleGraphicRootClassesItemsConstraintsPlanes returns [EObject current=null] : (otherlv_0= Planes otherlv_1= Colon ( (lv_planes_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsPlanes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_planes_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1868:2: ( (otherlv_0= Planes otherlv_1= Colon ( (lv_planes_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:1869:2: (otherlv_0= Planes otherlv_1= Colon ( (lv_planes_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:1869:2: (otherlv_0= Planes otherlv_1= Colon ( (lv_planes_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:1870:3: otherlv_0= Planes otherlv_1= Colon ( (lv_planes_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Planes,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getPlanesKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:1878:3: ( (lv_planes_2_0= ruleEString ) )
            // InternalGraphicParser.g:1879:4: (lv_planes_2_0= ruleEString )
            {
            // InternalGraphicParser.g:1879:4: (lv_planes_2_0= ruleEString )
            // InternalGraphicParser.g:1880:5: lv_planes_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getPlanesEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_planes_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesRule());
            					}
            					set(
            						current,
            						"planes",
            						lv_planes_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsPlanes"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsIlumination"
    // InternalGraphicParser.g:1901:1: entryRuleGraphicRootClassesItemsConstraintsIlumination returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsIlumination= ruleGraphicRootClassesItemsConstraintsIlumination EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsIlumination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsIlumination = null;


        try {
            // InternalGraphicParser.g:1901:86: (iv_ruleGraphicRootClassesItemsConstraintsIlumination= ruleGraphicRootClassesItemsConstraintsIlumination EOF )
            // InternalGraphicParser.g:1902:2: iv_ruleGraphicRootClassesItemsConstraintsIlumination= ruleGraphicRootClassesItemsConstraintsIlumination EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsIlumination=ruleGraphicRootClassesItemsConstraintsIlumination();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsIlumination; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsIlumination"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsIlumination"
    // InternalGraphicParser.g:1908:1: ruleGraphicRootClassesItemsConstraintsIlumination returns [EObject current=null] : (otherlv_0= Ilumination otherlv_1= Colon ( (lv_ilumination_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsIlumination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ilumination_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1914:2: ( (otherlv_0= Ilumination otherlv_1= Colon ( (lv_ilumination_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:1915:2: (otherlv_0= Ilumination otherlv_1= Colon ( (lv_ilumination_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:1915:2: (otherlv_0= Ilumination otherlv_1= Colon ( (lv_ilumination_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:1916:3: otherlv_0= Ilumination otherlv_1= Colon ( (lv_ilumination_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Ilumination,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getIluminationKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:1924:3: ( (lv_ilumination_2_0= ruleEString ) )
            // InternalGraphicParser.g:1925:4: (lv_ilumination_2_0= ruleEString )
            {
            // InternalGraphicParser.g:1925:4: (lv_ilumination_2_0= ruleEString )
            // InternalGraphicParser.g:1926:5: lv_ilumination_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getIluminationEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ilumination_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationRule());
            					}
            					set(
            						current,
            						"ilumination",
            						lv_ilumination_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsIlumination"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsSizeMax"
    // InternalGraphicParser.g:1947:1: entryRuleGraphicRootClassesItemsConstraintsSizeMax returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsSizeMax= ruleGraphicRootClassesItemsConstraintsSizeMax EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsSizeMax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsSizeMax = null;


        try {
            // InternalGraphicParser.g:1947:82: (iv_ruleGraphicRootClassesItemsConstraintsSizeMax= ruleGraphicRootClassesItemsConstraintsSizeMax EOF )
            // InternalGraphicParser.g:1948:2: iv_ruleGraphicRootClassesItemsConstraintsSizeMax= ruleGraphicRootClassesItemsConstraintsSizeMax EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsSizeMax=ruleGraphicRootClassesItemsConstraintsSizeMax();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsSizeMax; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsSizeMax"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsSizeMax"
    // InternalGraphicParser.g:1954:1: ruleGraphicRootClassesItemsConstraintsSizeMax returns [EObject current=null] : (otherlv_0= SizeMax otherlv_1= Colon ( (lv_sizeMax_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsSizeMax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sizeMax_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:1960:2: ( (otherlv_0= SizeMax otherlv_1= Colon ( (lv_sizeMax_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:1961:2: (otherlv_0= SizeMax otherlv_1= Colon ( (lv_sizeMax_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:1961:2: (otherlv_0= SizeMax otherlv_1= Colon ( (lv_sizeMax_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:1962:3: otherlv_0= SizeMax otherlv_1= Colon ( (lv_sizeMax_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,SizeMax,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getSizeMaxKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:1970:3: ( (lv_sizeMax_2_0= ruleEString ) )
            // InternalGraphicParser.g:1971:4: (lv_sizeMax_2_0= ruleEString )
            {
            // InternalGraphicParser.g:1971:4: (lv_sizeMax_2_0= ruleEString )
            // InternalGraphicParser.g:1972:5: lv_sizeMax_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getSizeMaxEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sizeMax_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxRule());
            					}
            					set(
            						current,
            						"sizeMax",
            						lv_sizeMax_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsSizeMax"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsSizeMin"
    // InternalGraphicParser.g:1993:1: entryRuleGraphicRootClassesItemsConstraintsSizeMin returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsSizeMin= ruleGraphicRootClassesItemsConstraintsSizeMin EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsSizeMin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsSizeMin = null;


        try {
            // InternalGraphicParser.g:1993:82: (iv_ruleGraphicRootClassesItemsConstraintsSizeMin= ruleGraphicRootClassesItemsConstraintsSizeMin EOF )
            // InternalGraphicParser.g:1994:2: iv_ruleGraphicRootClassesItemsConstraintsSizeMin= ruleGraphicRootClassesItemsConstraintsSizeMin EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsSizeMin=ruleGraphicRootClassesItemsConstraintsSizeMin();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsSizeMin; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsSizeMin"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsSizeMin"
    // InternalGraphicParser.g:2000:1: ruleGraphicRootClassesItemsConstraintsSizeMin returns [EObject current=null] : (otherlv_0= SizeMin otherlv_1= Colon ( (lv_sizeMin_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsSizeMin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sizeMin_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2006:2: ( (otherlv_0= SizeMin otherlv_1= Colon ( (lv_sizeMin_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2007:2: (otherlv_0= SizeMin otherlv_1= Colon ( (lv_sizeMin_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2007:2: (otherlv_0= SizeMin otherlv_1= Colon ( (lv_sizeMin_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2008:3: otherlv_0= SizeMin otherlv_1= Colon ( (lv_sizeMin_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,SizeMin,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getSizeMinKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2016:3: ( (lv_sizeMin_2_0= ruleEString ) )
            // InternalGraphicParser.g:2017:4: (lv_sizeMin_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2017:4: (lv_sizeMin_2_0= ruleEString )
            // InternalGraphicParser.g:2018:5: lv_sizeMin_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getSizeMinEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sizeMin_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinRule());
            					}
            					set(
            						current,
            						"sizeMin",
            						lv_sizeMin_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsSizeMin"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsSizeInit"
    // InternalGraphicParser.g:2039:1: entryRuleGraphicRootClassesItemsConstraintsSizeInit returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsSizeInit= ruleGraphicRootClassesItemsConstraintsSizeInit EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsSizeInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsSizeInit = null;


        try {
            // InternalGraphicParser.g:2039:83: (iv_ruleGraphicRootClassesItemsConstraintsSizeInit= ruleGraphicRootClassesItemsConstraintsSizeInit EOF )
            // InternalGraphicParser.g:2040:2: iv_ruleGraphicRootClassesItemsConstraintsSizeInit= ruleGraphicRootClassesItemsConstraintsSizeInit EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsSizeInit=ruleGraphicRootClassesItemsConstraintsSizeInit();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsSizeInit; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsSizeInit"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsSizeInit"
    // InternalGraphicParser.g:2046:1: ruleGraphicRootClassesItemsConstraintsSizeInit returns [EObject current=null] : (otherlv_0= SizeInit otherlv_1= Colon ( (lv_sizeInit_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsSizeInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sizeInit_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2052:2: ( (otherlv_0= SizeInit otherlv_1= Colon ( (lv_sizeInit_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2053:2: (otherlv_0= SizeInit otherlv_1= Colon ( (lv_sizeInit_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2053:2: (otherlv_0= SizeInit otherlv_1= Colon ( (lv_sizeInit_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2054:3: otherlv_0= SizeInit otherlv_1= Colon ( (lv_sizeInit_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,SizeInit,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getSizeInitKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2062:3: ( (lv_sizeInit_2_0= ruleEString ) )
            // InternalGraphicParser.g:2063:4: (lv_sizeInit_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2063:4: (lv_sizeInit_2_0= ruleEString )
            // InternalGraphicParser.g:2064:5: lv_sizeInit_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getSizeInitEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sizeInit_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitRule());
            					}
            					set(
            						current,
            						"sizeInit",
            						lv_sizeInit_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsSizeInit"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsOverlapping"
    // InternalGraphicParser.g:2085:1: entryRuleGraphicRootClassesItemsConstraintsOverlapping returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsOverlapping= ruleGraphicRootClassesItemsConstraintsOverlapping EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsOverlapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsOverlapping = null;


        try {
            // InternalGraphicParser.g:2085:86: (iv_ruleGraphicRootClassesItemsConstraintsOverlapping= ruleGraphicRootClassesItemsConstraintsOverlapping EOF )
            // InternalGraphicParser.g:2086:2: iv_ruleGraphicRootClassesItemsConstraintsOverlapping= ruleGraphicRootClassesItemsConstraintsOverlapping EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsOverlapping=ruleGraphicRootClassesItemsConstraintsOverlapping();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsOverlapping; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsOverlapping"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsOverlapping"
    // InternalGraphicParser.g:2092:1: ruleGraphicRootClassesItemsConstraintsOverlapping returns [EObject current=null] : (otherlv_0= Overlapping otherlv_1= Colon ( (lv_overlapping_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsOverlapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_overlapping_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2098:2: ( (otherlv_0= Overlapping otherlv_1= Colon ( (lv_overlapping_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2099:2: (otherlv_0= Overlapping otherlv_1= Colon ( (lv_overlapping_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2099:2: (otherlv_0= Overlapping otherlv_1= Colon ( (lv_overlapping_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2100:3: otherlv_0= Overlapping otherlv_1= Colon ( (lv_overlapping_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Overlapping,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getOverlappingKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2108:3: ( (lv_overlapping_2_0= ruleEString ) )
            // InternalGraphicParser.g:2109:4: (lv_overlapping_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2109:4: (lv_overlapping_2_0= ruleEString )
            // InternalGraphicParser.g:2110:5: lv_overlapping_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getOverlappingEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_overlapping_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingRule());
            					}
            					set(
            						current,
            						"overlapping",
            						lv_overlapping_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsOverlapping"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsXToOriginPos"
    // InternalGraphicParser.g:2131:1: entryRuleGraphicRootClassesItemsConstraintsXToOriginPos returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsXToOriginPos= ruleGraphicRootClassesItemsConstraintsXToOriginPos EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsXToOriginPos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsXToOriginPos = null;


        try {
            // InternalGraphicParser.g:2131:87: (iv_ruleGraphicRootClassesItemsConstraintsXToOriginPos= ruleGraphicRootClassesItemsConstraintsXToOriginPos EOF )
            // InternalGraphicParser.g:2132:2: iv_ruleGraphicRootClassesItemsConstraintsXToOriginPos= ruleGraphicRootClassesItemsConstraintsXToOriginPos EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsXToOriginPos=ruleGraphicRootClassesItemsConstraintsXToOriginPos();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsXToOriginPos; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsXToOriginPos"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsXToOriginPos"
    // InternalGraphicParser.g:2138:1: ruleGraphicRootClassesItemsConstraintsXToOriginPos returns [EObject current=null] : (otherlv_0= XToOriginPos otherlv_1= Colon ( (lv_xToOriginPos_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsXToOriginPos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_xToOriginPos_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2144:2: ( (otherlv_0= XToOriginPos otherlv_1= Colon ( (lv_xToOriginPos_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2145:2: (otherlv_0= XToOriginPos otherlv_1= Colon ( (lv_xToOriginPos_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2145:2: (otherlv_0= XToOriginPos otherlv_1= Colon ( (lv_xToOriginPos_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2146:3: otherlv_0= XToOriginPos otherlv_1= Colon ( (lv_xToOriginPos_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,XToOriginPos,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getXToOriginPosKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2154:3: ( (lv_xToOriginPos_2_0= ruleEString ) )
            // InternalGraphicParser.g:2155:4: (lv_xToOriginPos_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2155:4: (lv_xToOriginPos_2_0= ruleEString )
            // InternalGraphicParser.g:2156:5: lv_xToOriginPos_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getXToOriginPosEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_xToOriginPos_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosRule());
            					}
            					set(
            						current,
            						"xToOriginPos",
            						lv_xToOriginPos_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsXToOriginPos"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsYToOriginPos"
    // InternalGraphicParser.g:2177:1: entryRuleGraphicRootClassesItemsConstraintsYToOriginPos returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsYToOriginPos= ruleGraphicRootClassesItemsConstraintsYToOriginPos EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsYToOriginPos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsYToOriginPos = null;


        try {
            // InternalGraphicParser.g:2177:87: (iv_ruleGraphicRootClassesItemsConstraintsYToOriginPos= ruleGraphicRootClassesItemsConstraintsYToOriginPos EOF )
            // InternalGraphicParser.g:2178:2: iv_ruleGraphicRootClassesItemsConstraintsYToOriginPos= ruleGraphicRootClassesItemsConstraintsYToOriginPos EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsYToOriginPos=ruleGraphicRootClassesItemsConstraintsYToOriginPos();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsYToOriginPos; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsYToOriginPos"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsYToOriginPos"
    // InternalGraphicParser.g:2184:1: ruleGraphicRootClassesItemsConstraintsYToOriginPos returns [EObject current=null] : (otherlv_0= YToOriginPos otherlv_1= Colon ( (lv_yToOriginPos_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsYToOriginPos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_yToOriginPos_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2190:2: ( (otherlv_0= YToOriginPos otherlv_1= Colon ( (lv_yToOriginPos_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2191:2: (otherlv_0= YToOriginPos otherlv_1= Colon ( (lv_yToOriginPos_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2191:2: (otherlv_0= YToOriginPos otherlv_1= Colon ( (lv_yToOriginPos_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2192:3: otherlv_0= YToOriginPos otherlv_1= Colon ( (lv_yToOriginPos_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,YToOriginPos,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getYToOriginPosKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2200:3: ( (lv_yToOriginPos_2_0= ruleEString ) )
            // InternalGraphicParser.g:2201:4: (lv_yToOriginPos_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2201:4: (lv_yToOriginPos_2_0= ruleEString )
            // InternalGraphicParser.g:2202:5: lv_yToOriginPos_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getYToOriginPosEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_yToOriginPos_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosRule());
            					}
            					set(
            						current,
            						"yToOriginPos",
            						lv_yToOriginPos_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsYToOriginPos"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsZToOriginPos"
    // InternalGraphicParser.g:2223:1: entryRuleGraphicRootClassesItemsConstraintsZToOriginPos returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsZToOriginPos= ruleGraphicRootClassesItemsConstraintsZToOriginPos EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsZToOriginPos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsZToOriginPos = null;


        try {
            // InternalGraphicParser.g:2223:87: (iv_ruleGraphicRootClassesItemsConstraintsZToOriginPos= ruleGraphicRootClassesItemsConstraintsZToOriginPos EOF )
            // InternalGraphicParser.g:2224:2: iv_ruleGraphicRootClassesItemsConstraintsZToOriginPos= ruleGraphicRootClassesItemsConstraintsZToOriginPos EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsZToOriginPos=ruleGraphicRootClassesItemsConstraintsZToOriginPos();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsZToOriginPos; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsZToOriginPos"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsZToOriginPos"
    // InternalGraphicParser.g:2230:1: ruleGraphicRootClassesItemsConstraintsZToOriginPos returns [EObject current=null] : (otherlv_0= ZToOriginPos otherlv_1= Colon ( (lv_zToOriginPos_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsZToOriginPos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_zToOriginPos_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2236:2: ( (otherlv_0= ZToOriginPos otherlv_1= Colon ( (lv_zToOriginPos_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2237:2: (otherlv_0= ZToOriginPos otherlv_1= Colon ( (lv_zToOriginPos_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2237:2: (otherlv_0= ZToOriginPos otherlv_1= Colon ( (lv_zToOriginPos_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2238:3: otherlv_0= ZToOriginPos otherlv_1= Colon ( (lv_zToOriginPos_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,ZToOriginPos,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getZToOriginPosKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2246:3: ( (lv_zToOriginPos_2_0= ruleEString ) )
            // InternalGraphicParser.g:2247:4: (lv_zToOriginPos_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2247:4: (lv_zToOriginPos_2_0= ruleEString )
            // InternalGraphicParser.g:2248:5: lv_zToOriginPos_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getZToOriginPosEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_zToOriginPos_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosRule());
            					}
            					set(
            						current,
            						"zToOriginPos",
            						lv_zToOriginPos_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsZToOriginPos"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsRotation"
    // InternalGraphicParser.g:2269:1: entryRuleGraphicRootClassesItemsConstraintsRotation returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsRotation= ruleGraphicRootClassesItemsConstraintsRotation EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsRotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsRotation = null;


        try {
            // InternalGraphicParser.g:2269:83: (iv_ruleGraphicRootClassesItemsConstraintsRotation= ruleGraphicRootClassesItemsConstraintsRotation EOF )
            // InternalGraphicParser.g:2270:2: iv_ruleGraphicRootClassesItemsConstraintsRotation= ruleGraphicRootClassesItemsConstraintsRotation EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsRotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsRotation=ruleGraphicRootClassesItemsConstraintsRotation();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsRotation; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsRotation"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsRotation"
    // InternalGraphicParser.g:2276:1: ruleGraphicRootClassesItemsConstraintsRotation returns [EObject current=null] : (otherlv_0= Rotation otherlv_1= Colon ( (lv_rotation_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsRotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_rotation_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2282:2: ( (otherlv_0= Rotation otherlv_1= Colon ( (lv_rotation_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2283:2: (otherlv_0= Rotation otherlv_1= Colon ( (lv_rotation_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2283:2: (otherlv_0= Rotation otherlv_1= Colon ( (lv_rotation_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2284:3: otherlv_0= Rotation otherlv_1= Colon ( (lv_rotation_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Rotation,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getRotationKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2292:3: ( (lv_rotation_2_0= ruleEString ) )
            // InternalGraphicParser.g:2293:4: (lv_rotation_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2293:4: (lv_rotation_2_0= ruleEString )
            // InternalGraphicParser.g:2294:5: lv_rotation_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getRotationEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rotation_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsRotationRule());
            					}
            					set(
            						current,
            						"rotation",
            						lv_rotation_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsRotation"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsText"
    // InternalGraphicParser.g:2315:1: entryRuleGraphicRootClassesItemsConstraintsText returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsText= ruleGraphicRootClassesItemsConstraintsText EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsText = null;


        try {
            // InternalGraphicParser.g:2315:79: (iv_ruleGraphicRootClassesItemsConstraintsText= ruleGraphicRootClassesItemsConstraintsText EOF )
            // InternalGraphicParser.g:2316:2: iv_ruleGraphicRootClassesItemsConstraintsText= ruleGraphicRootClassesItemsConstraintsText EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsText=ruleGraphicRootClassesItemsConstraintsText();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsText; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsText"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsText"
    // InternalGraphicParser.g:2322:1: ruleGraphicRootClassesItemsConstraintsText returns [EObject current=null] : (otherlv_0= Text otherlv_1= Colon ( (lv_text_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2328:2: ( (otherlv_0= Text otherlv_1= Colon ( (lv_text_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2329:2: (otherlv_0= Text otherlv_1= Colon ( (lv_text_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2329:2: (otherlv_0= Text otherlv_1= Colon ( (lv_text_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2330:3: otherlv_0= Text otherlv_1= Colon ( (lv_text_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Text,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getTextKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2338:3: ( (lv_text_2_0= ruleEString ) )
            // InternalGraphicParser.g:2339:4: (lv_text_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2339:4: (lv_text_2_0= ruleEString )
            // InternalGraphicParser.g:2340:5: lv_text_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getTextEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsTextRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsText"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsTrim"
    // InternalGraphicParser.g:2361:1: entryRuleGraphicRootClassesItemsConstraintsTrim returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsTrim= ruleGraphicRootClassesItemsConstraintsTrim EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsTrim() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsTrim = null;


        try {
            // InternalGraphicParser.g:2361:79: (iv_ruleGraphicRootClassesItemsConstraintsTrim= ruleGraphicRootClassesItemsConstraintsTrim EOF )
            // InternalGraphicParser.g:2362:2: iv_ruleGraphicRootClassesItemsConstraintsTrim= ruleGraphicRootClassesItemsConstraintsTrim EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsTrimRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsTrim=ruleGraphicRootClassesItemsConstraintsTrim();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsTrim; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsTrim"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsTrim"
    // InternalGraphicParser.g:2368:1: ruleGraphicRootClassesItemsConstraintsTrim returns [EObject current=null] : (otherlv_0= Trim otherlv_1= Colon ( (lv_trim_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsTrim() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_trim_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2374:2: ( (otherlv_0= Trim otherlv_1= Colon ( (lv_trim_2_0= ruleEBooleanObject ) ) ) )
            // InternalGraphicParser.g:2375:2: (otherlv_0= Trim otherlv_1= Colon ( (lv_trim_2_0= ruleEBooleanObject ) ) )
            {
            // InternalGraphicParser.g:2375:2: (otherlv_0= Trim otherlv_1= Colon ( (lv_trim_2_0= ruleEBooleanObject ) ) )
            // InternalGraphicParser.g:2376:3: otherlv_0= Trim otherlv_1= Colon ( (lv_trim_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Trim,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getTrimKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2384:3: ( (lv_trim_2_0= ruleEBooleanObject ) )
            // InternalGraphicParser.g:2385:4: (lv_trim_2_0= ruleEBooleanObject )
            {
            // InternalGraphicParser.g:2385:4: (lv_trim_2_0= ruleEBooleanObject )
            // InternalGraphicParser.g:2386:5: lv_trim_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getTrimEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_trim_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsTrimRule());
            					}
            					set(
            						current,
            						"trim",
            						lv_trim_2_0,
            						"graphic.graphic.Graphic.EBooleanObject");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsTrim"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsCategoryBitMask"
    // InternalGraphicParser.g:2407:1: entryRuleGraphicRootClassesItemsConstraintsCategoryBitMask returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsCategoryBitMask= ruleGraphicRootClassesItemsConstraintsCategoryBitMask EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsCategoryBitMask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsCategoryBitMask = null;


        try {
            // InternalGraphicParser.g:2407:90: (iv_ruleGraphicRootClassesItemsConstraintsCategoryBitMask= ruleGraphicRootClassesItemsConstraintsCategoryBitMask EOF )
            // InternalGraphicParser.g:2408:2: iv_ruleGraphicRootClassesItemsConstraintsCategoryBitMask= ruleGraphicRootClassesItemsConstraintsCategoryBitMask EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsCategoryBitMask=ruleGraphicRootClassesItemsConstraintsCategoryBitMask();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsCategoryBitMask; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsCategoryBitMask"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsCategoryBitMask"
    // InternalGraphicParser.g:2414:1: ruleGraphicRootClassesItemsConstraintsCategoryBitMask returns [EObject current=null] : (otherlv_0= CategoryBitMask otherlv_1= Colon ( (lv_categoryBitMask_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsCategoryBitMask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_categoryBitMask_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2420:2: ( (otherlv_0= CategoryBitMask otherlv_1= Colon ( (lv_categoryBitMask_2_0= ruleEDoubleObject ) ) ) )
            // InternalGraphicParser.g:2421:2: (otherlv_0= CategoryBitMask otherlv_1= Colon ( (lv_categoryBitMask_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGraphicParser.g:2421:2: (otherlv_0= CategoryBitMask otherlv_1= Colon ( (lv_categoryBitMask_2_0= ruleEDoubleObject ) ) )
            // InternalGraphicParser.g:2422:3: otherlv_0= CategoryBitMask otherlv_1= Colon ( (lv_categoryBitMask_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,CategoryBitMask,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getCategoryBitMaskKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2430:3: ( (lv_categoryBitMask_2_0= ruleEDoubleObject ) )
            // InternalGraphicParser.g:2431:4: (lv_categoryBitMask_2_0= ruleEDoubleObject )
            {
            // InternalGraphicParser.g:2431:4: (lv_categoryBitMask_2_0= ruleEDoubleObject )
            // InternalGraphicParser.g:2432:5: lv_categoryBitMask_2_0= ruleEDoubleObject
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getCategoryBitMaskEDoubleObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_categoryBitMask_2_0=ruleEDoubleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskRule());
            					}
            					set(
            						current,
            						"categoryBitMask",
            						lv_categoryBitMask_2_0,
            						"graphic.graphic.Graphic.EDoubleObject");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsCategoryBitMask"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsCollisionBitMask"
    // InternalGraphicParser.g:2453:1: entryRuleGraphicRootClassesItemsConstraintsCollisionBitMask returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsCollisionBitMask= ruleGraphicRootClassesItemsConstraintsCollisionBitMask EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsCollisionBitMask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsCollisionBitMask = null;


        try {
            // InternalGraphicParser.g:2453:91: (iv_ruleGraphicRootClassesItemsConstraintsCollisionBitMask= ruleGraphicRootClassesItemsConstraintsCollisionBitMask EOF )
            // InternalGraphicParser.g:2454:2: iv_ruleGraphicRootClassesItemsConstraintsCollisionBitMask= ruleGraphicRootClassesItemsConstraintsCollisionBitMask EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsCollisionBitMask=ruleGraphicRootClassesItemsConstraintsCollisionBitMask();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsCollisionBitMask; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsCollisionBitMask"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsCollisionBitMask"
    // InternalGraphicParser.g:2460:1: ruleGraphicRootClassesItemsConstraintsCollisionBitMask returns [EObject current=null] : (otherlv_0= CollisionBitMask otherlv_1= Colon ( (lv_collisionBitMask_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsCollisionBitMask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_collisionBitMask_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2466:2: ( (otherlv_0= CollisionBitMask otherlv_1= Colon ( (lv_collisionBitMask_2_0= ruleEDoubleObject ) ) ) )
            // InternalGraphicParser.g:2467:2: (otherlv_0= CollisionBitMask otherlv_1= Colon ( (lv_collisionBitMask_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGraphicParser.g:2467:2: (otherlv_0= CollisionBitMask otherlv_1= Colon ( (lv_collisionBitMask_2_0= ruleEDoubleObject ) ) )
            // InternalGraphicParser.g:2468:3: otherlv_0= CollisionBitMask otherlv_1= Colon ( (lv_collisionBitMask_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,CollisionBitMask,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getCollisionBitMaskKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2476:3: ( (lv_collisionBitMask_2_0= ruleEDoubleObject ) )
            // InternalGraphicParser.g:2477:4: (lv_collisionBitMask_2_0= ruleEDoubleObject )
            {
            // InternalGraphicParser.g:2477:4: (lv_collisionBitMask_2_0= ruleEDoubleObject )
            // InternalGraphicParser.g:2478:5: lv_collisionBitMask_2_0= ruleEDoubleObject
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getCollisionBitMaskEDoubleObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_collisionBitMask_2_0=ruleEDoubleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskRule());
            					}
            					set(
            						current,
            						"collisionBitMask",
            						lv_collisionBitMask_2_0,
            						"graphic.graphic.Graphic.EDoubleObject");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsCollisionBitMask"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsContactTestBitMask"
    // InternalGraphicParser.g:2499:1: entryRuleGraphicRootClassesItemsConstraintsContactTestBitMask returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConstraintsContactTestBitMask= ruleGraphicRootClassesItemsConstraintsContactTestBitMask EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConstraintsContactTestBitMask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConstraintsContactTestBitMask = null;


        try {
            // InternalGraphicParser.g:2499:93: (iv_ruleGraphicRootClassesItemsConstraintsContactTestBitMask= ruleGraphicRootClassesItemsConstraintsContactTestBitMask EOF )
            // InternalGraphicParser.g:2500:2: iv_ruleGraphicRootClassesItemsConstraintsContactTestBitMask= ruleGraphicRootClassesItemsConstraintsContactTestBitMask EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConstraintsContactTestBitMask=ruleGraphicRootClassesItemsConstraintsContactTestBitMask();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConstraintsContactTestBitMask; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsContactTestBitMask"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsContactTestBitMask"
    // InternalGraphicParser.g:2506:1: ruleGraphicRootClassesItemsConstraintsContactTestBitMask returns [EObject current=null] : (otherlv_0= ContactTestBitMask otherlv_1= Colon ( (lv_contactTestBitMask_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConstraintsContactTestBitMask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_contactTestBitMask_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2512:2: ( (otherlv_0= ContactTestBitMask otherlv_1= Colon ( (lv_contactTestBitMask_2_0= ruleEDoubleObject ) ) ) )
            // InternalGraphicParser.g:2513:2: (otherlv_0= ContactTestBitMask otherlv_1= Colon ( (lv_contactTestBitMask_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGraphicParser.g:2513:2: (otherlv_0= ContactTestBitMask otherlv_1= Colon ( (lv_contactTestBitMask_2_0= ruleEDoubleObject ) ) )
            // InternalGraphicParser.g:2514:3: otherlv_0= ContactTestBitMask otherlv_1= Colon ( (lv_contactTestBitMask_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,ContactTestBitMask,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getContactTestBitMaskKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2522:3: ( (lv_contactTestBitMask_2_0= ruleEDoubleObject ) )
            // InternalGraphicParser.g:2523:4: (lv_contactTestBitMask_2_0= ruleEDoubleObject )
            {
            // InternalGraphicParser.g:2523:4: (lv_contactTestBitMask_2_0= ruleEDoubleObject )
            // InternalGraphicParser.g:2524:5: lv_contactTestBitMask_2_0= ruleEDoubleObject
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getContactTestBitMaskEDoubleObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_contactTestBitMask_2_0=ruleEDoubleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskRule());
            					}
            					set(
            						current,
            						"contactTestBitMask",
            						lv_contactTestBitMask_2_0,
            						"graphic.graphic.Graphic.EDoubleObject");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsContactTestBitMask"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalGraphicParser.g:2545:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalGraphicParser.g:2545:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalGraphicParser.g:2546:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalGraphicParser.g:2552:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGraphicParser.g:2558:2: ( (kw= True | kw= False ) )
            // InternalGraphicParser.g:2559:2: (kw= True | kw= False )
            {
            // InternalGraphicParser.g:2559:2: (kw= True | kw= False )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==True) ) {
                alt25=1;
            }
            else if ( (LA25_0==False) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGraphicParser.g:2560:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:2566:3: kw= False
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
    // InternalGraphicParser.g:2575:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalGraphicParser.g:2575:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalGraphicParser.g:2576:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalGraphicParser.g:2582:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalGraphicParser.g:2588:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalGraphicParser.g:2589:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalGraphicParser.g:2589:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_E_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_E_DOUBLE) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalGraphicParser.g:2590:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); 

                    			current.merge(this_E_INT_0);
                    		

                    			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:2598:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItems"
    // InternalGraphicParser.g:2609:1: entryRuleGraphicRootClassesItemsConnectionsItems returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItems= ruleGraphicRootClassesItemsConnectionsItems EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItems = null;


        try {
            // InternalGraphicParser.g:2609:80: (iv_ruleGraphicRootClassesItemsConnectionsItems= ruleGraphicRootClassesItemsConnectionsItems EOF )
            // InternalGraphicParser.g:2610:2: iv_ruleGraphicRootClassesItemsConnectionsItems= ruleGraphicRootClassesItemsConnectionsItems EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItems=ruleGraphicRootClassesItemsConnectionsItems();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItems; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItems"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItems"
    // InternalGraphicParser.g:2616:1: ruleGraphicRootClassesItemsConnectionsItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2622:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGraphicParser.g:2623:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGraphicParser.g:2623:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGraphicParser.g:2624:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGraphicParser.g:2624:3: ()
            // InternalGraphicParser.g:2625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getGraphicRootClassesItemsConnectionsItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphicParser.g:2635:3: ( ( (lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=DecoratorColor && LA28_0<=DecoratorWidth)||LA28_0==DecoratorPos||(LA28_0>=Decorator && LA28_0<=Position)||LA28_0==Pattern||(LA28_0>=Target && LA28_0<=Color)||(LA28_0>=Width && LA28_0<=Name)||LA28_0==Type) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGraphicParser.g:2636:4: ( (lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) )*
                    {
                    // InternalGraphicParser.g:2636:4: ( (lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) )
                    // InternalGraphicParser.g:2637:5: (lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract )
                    {
                    // InternalGraphicParser.g:2637:5: (lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract )
                    // InternalGraphicParser.g:2638:6: lv_items_2_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getItemsGraphicRootClassesItemsConnectionsItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"graphic.graphic.Graphic.GraphicRootClassesItemsConnectionsItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphicParser.g:2655:4: (otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGraphicParser.g:2656:5: otherlv_3= Comma ( (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_22); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalGraphicParser.g:2660:5: ( (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) )
                    	    // InternalGraphicParser.g:2661:6: (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract )
                    	    {
                    	    // InternalGraphicParser.g:2661:6: (lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract )
                    	    // InternalGraphicParser.g:2662:7: lv_items_4_0= ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getItemsGraphicRootClassesItemsConnectionsItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"graphic.graphic.Graphic.GraphicRootClassesItemsConnectionsItemsPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItems"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsName"
    // InternalGraphicParser.g:2689:1: entryRuleGraphicRootClassesItemsConnectionsItemsName returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsName= ruleGraphicRootClassesItemsConnectionsItemsName EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsName = null;


        try {
            // InternalGraphicParser.g:2689:84: (iv_ruleGraphicRootClassesItemsConnectionsItemsName= ruleGraphicRootClassesItemsConnectionsItemsName EOF )
            // InternalGraphicParser.g:2690:2: iv_ruleGraphicRootClassesItemsConnectionsItemsName= ruleGraphicRootClassesItemsConnectionsItemsName EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsName=ruleGraphicRootClassesItemsConnectionsItemsName();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsName; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsName"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsName"
    // InternalGraphicParser.g:2696:1: ruleGraphicRootClassesItemsConnectionsItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2702:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2703:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2703:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalGraphicParser.g:2704:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalGraphicParser.g:2704:3: ()
            // InternalGraphicParser.g:2705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getGraphicRootClassesItemsConnectionsItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getColonKeyword_2());
            		
            // InternalGraphicParser.g:2719:3: ( (lv_name_3_0= ruleEString ) )
            // InternalGraphicParser.g:2720:4: (lv_name_3_0= ruleEString )
            {
            // InternalGraphicParser.g:2720:4: (lv_name_3_0= ruleEString )
            // InternalGraphicParser.g:2721:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsName"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsType"
    // InternalGraphicParser.g:2742:1: entryRuleGraphicRootClassesItemsConnectionsItemsType returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsType= ruleGraphicRootClassesItemsConnectionsItemsType EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsType = null;


        try {
            // InternalGraphicParser.g:2742:84: (iv_ruleGraphicRootClassesItemsConnectionsItemsType= ruleGraphicRootClassesItemsConnectionsItemsType EOF )
            // InternalGraphicParser.g:2743:2: iv_ruleGraphicRootClassesItemsConnectionsItemsType= ruleGraphicRootClassesItemsConnectionsItemsType EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsType=ruleGraphicRootClassesItemsConnectionsItemsType();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsType; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsType"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsType"
    // InternalGraphicParser.g:2749:1: ruleGraphicRootClassesItemsConnectionsItemsType returns [EObject current=null] : (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2755:2: ( (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2756:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2756:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2757:3: otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2765:3: ( (lv_type_2_0= ruleEString ) )
            // InternalGraphicParser.g:2766:4: (lv_type_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2766:4: (lv_type_2_0= ruleEString )
            // InternalGraphicParser.g:2767:5: lv_type_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getTypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsType"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsColor"
    // InternalGraphicParser.g:2788:1: entryRuleGraphicRootClassesItemsConnectionsItemsColor returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsColor= ruleGraphicRootClassesItemsConnectionsItemsColor EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsColor = null;


        try {
            // InternalGraphicParser.g:2788:85: (iv_ruleGraphicRootClassesItemsConnectionsItemsColor= ruleGraphicRootClassesItemsConnectionsItemsColor EOF )
            // InternalGraphicParser.g:2789:2: iv_ruleGraphicRootClassesItemsConnectionsItemsColor= ruleGraphicRootClassesItemsConnectionsItemsColor EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsColor=ruleGraphicRootClassesItemsConnectionsItemsColor();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsColor; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsColor"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsColor"
    // InternalGraphicParser.g:2795:1: ruleGraphicRootClassesItemsConnectionsItemsColor returns [EObject current=null] : (otherlv_0= Color otherlv_1= Colon ( (lv_color_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_color_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2801:2: ( (otherlv_0= Color otherlv_1= Colon ( (lv_color_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2802:2: (otherlv_0= Color otherlv_1= Colon ( (lv_color_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2802:2: (otherlv_0= Color otherlv_1= Colon ( (lv_color_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2803:3: otherlv_0= Color otherlv_1= Colon ( (lv_color_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Color,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColorKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2811:3: ( (lv_color_2_0= ruleEString ) )
            // InternalGraphicParser.g:2812:4: (lv_color_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2812:4: (lv_color_2_0= ruleEString )
            // InternalGraphicParser.g:2813:5: lv_color_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColorEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsColor"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsTextColor"
    // InternalGraphicParser.g:2834:1: entryRuleGraphicRootClassesItemsConnectionsItemsTextColor returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsTextColor= ruleGraphicRootClassesItemsConnectionsItemsTextColor EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsTextColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsTextColor = null;


        try {
            // InternalGraphicParser.g:2834:89: (iv_ruleGraphicRootClassesItemsConnectionsItemsTextColor= ruleGraphicRootClassesItemsConnectionsItemsTextColor EOF )
            // InternalGraphicParser.g:2835:2: iv_ruleGraphicRootClassesItemsConnectionsItemsTextColor= ruleGraphicRootClassesItemsConnectionsItemsTextColor EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsTextColor=ruleGraphicRootClassesItemsConnectionsItemsTextColor();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsTextColor; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsTextColor"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsTextColor"
    // InternalGraphicParser.g:2841:1: ruleGraphicRootClassesItemsConnectionsItemsTextColor returns [EObject current=null] : (otherlv_0= TextColor otherlv_1= Colon ( (lv_textColor_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsTextColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_textColor_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2847:2: ( (otherlv_0= TextColor otherlv_1= Colon ( (lv_textColor_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2848:2: (otherlv_0= TextColor otherlv_1= Colon ( (lv_textColor_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2848:2: (otherlv_0= TextColor otherlv_1= Colon ( (lv_textColor_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2849:3: otherlv_0= TextColor otherlv_1= Colon ( (lv_textColor_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,TextColor,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getTextColorKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2857:3: ( (lv_textColor_2_0= ruleEString ) )
            // InternalGraphicParser.g:2858:4: (lv_textColor_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2858:4: (lv_textColor_2_0= ruleEString )
            // InternalGraphicParser.g:2859:5: lv_textColor_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getTextColorEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_textColor_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorRule());
            					}
            					set(
            						current,
            						"textColor",
            						lv_textColor_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsTextColor"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsDecorator"
    // InternalGraphicParser.g:2880:1: entryRuleGraphicRootClassesItemsConnectionsItemsDecorator returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsDecorator= ruleGraphicRootClassesItemsConnectionsItemsDecorator EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsDecorator = null;


        try {
            // InternalGraphicParser.g:2880:89: (iv_ruleGraphicRootClassesItemsConnectionsItemsDecorator= ruleGraphicRootClassesItemsConnectionsItemsDecorator EOF )
            // InternalGraphicParser.g:2881:2: iv_ruleGraphicRootClassesItemsConnectionsItemsDecorator= ruleGraphicRootClassesItemsConnectionsItemsDecorator EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsDecorator=ruleGraphicRootClassesItemsConnectionsItemsDecorator();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsDecorator; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsDecorator"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsDecorator"
    // InternalGraphicParser.g:2887:1: ruleGraphicRootClassesItemsConnectionsItemsDecorator returns [EObject current=null] : (otherlv_0= Decorator otherlv_1= Colon ( (lv_decorator_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsDecorator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_decorator_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2893:2: ( (otherlv_0= Decorator otherlv_1= Colon ( (lv_decorator_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2894:2: (otherlv_0= Decorator otherlv_1= Colon ( (lv_decorator_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2894:2: (otherlv_0= Decorator otherlv_1= Colon ( (lv_decorator_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2895:3: otherlv_0= Decorator otherlv_1= Colon ( (lv_decorator_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Decorator,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getDecoratorKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2903:3: ( (lv_decorator_2_0= ruleEString ) )
            // InternalGraphicParser.g:2904:4: (lv_decorator_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2904:4: (lv_decorator_2_0= ruleEString )
            // InternalGraphicParser.g:2905:5: lv_decorator_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getDecoratorEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_decorator_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorRule());
            					}
            					set(
            						current,
            						"decorator",
            						lv_decorator_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsDecorator"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorColor"
    // InternalGraphicParser.g:2926:1: entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorColor returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor= ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor = null;


        try {
            // InternalGraphicParser.g:2926:94: (iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor= ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor EOF )
            // InternalGraphicParser.g:2927:2: iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor= ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor=ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorColor"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor"
    // InternalGraphicParser.g:2933:1: ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor returns [EObject current=null] : (otherlv_0= DecoratorColor otherlv_1= Colon ( (lv_decoratorColor_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_decoratorColor_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2939:2: ( (otherlv_0= DecoratorColor otherlv_1= Colon ( (lv_decoratorColor_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2940:2: (otherlv_0= DecoratorColor otherlv_1= Colon ( (lv_decoratorColor_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2940:2: (otherlv_0= DecoratorColor otherlv_1= Colon ( (lv_decoratorColor_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2941:3: otherlv_0= DecoratorColor otherlv_1= Colon ( (lv_decoratorColor_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,DecoratorColor,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getDecoratorColorKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2949:3: ( (lv_decoratorColor_2_0= ruleEString ) )
            // InternalGraphicParser.g:2950:4: (lv_decoratorColor_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2950:4: (lv_decoratorColor_2_0= ruleEString )
            // InternalGraphicParser.g:2951:5: lv_decoratorColor_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getDecoratorColorEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_decoratorColor_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorRule());
            					}
            					set(
            						current,
            						"decoratorColor",
            						lv_decoratorColor_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorWidth"
    // InternalGraphicParser.g:2972:1: entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorWidth returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth= ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth = null;


        try {
            // InternalGraphicParser.g:2972:94: (iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth= ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth EOF )
            // InternalGraphicParser.g:2973:2: iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth= ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth=ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorWidth"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth"
    // InternalGraphicParser.g:2979:1: ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth returns [EObject current=null] : (otherlv_0= DecoratorWidth otherlv_1= Colon ( (lv_decoratorWidth_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_decoratorWidth_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:2985:2: ( (otherlv_0= DecoratorWidth otherlv_1= Colon ( (lv_decoratorWidth_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:2986:2: (otherlv_0= DecoratorWidth otherlv_1= Colon ( (lv_decoratorWidth_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:2986:2: (otherlv_0= DecoratorWidth otherlv_1= Colon ( (lv_decoratorWidth_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:2987:3: otherlv_0= DecoratorWidth otherlv_1= Colon ( (lv_decoratorWidth_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,DecoratorWidth,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getDecoratorWidthKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:2995:3: ( (lv_decoratorWidth_2_0= ruleEString ) )
            // InternalGraphicParser.g:2996:4: (lv_decoratorWidth_2_0= ruleEString )
            {
            // InternalGraphicParser.g:2996:4: (lv_decoratorWidth_2_0= ruleEString )
            // InternalGraphicParser.g:2997:5: lv_decoratorWidth_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getDecoratorWidthEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_decoratorWidth_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthRule());
            					}
            					set(
            						current,
            						"decoratorWidth",
            						lv_decoratorWidth_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorPos"
    // InternalGraphicParser.g:3018:1: entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorPos returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos= ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorPos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos = null;


        try {
            // InternalGraphicParser.g:3018:92: (iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos= ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos EOF )
            // InternalGraphicParser.g:3019:2: iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos= ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos=ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorPos"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos"
    // InternalGraphicParser.g:3025:1: ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos returns [EObject current=null] : (otherlv_0= DecoratorPos otherlv_1= Colon ( (lv_decoratorPos_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_decoratorPos_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:3031:2: ( (otherlv_0= DecoratorPos otherlv_1= Colon ( (lv_decoratorPos_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:3032:2: (otherlv_0= DecoratorPos otherlv_1= Colon ( (lv_decoratorPos_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:3032:2: (otherlv_0= DecoratorPos otherlv_1= Colon ( (lv_decoratorPos_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:3033:3: otherlv_0= DecoratorPos otherlv_1= Colon ( (lv_decoratorPos_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,DecoratorPos,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getDecoratorPosKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:3041:3: ( (lv_decoratorPos_2_0= ruleEString ) )
            // InternalGraphicParser.g:3042:4: (lv_decoratorPos_2_0= ruleEString )
            {
            // InternalGraphicParser.g:3042:4: (lv_decoratorPos_2_0= ruleEString )
            // InternalGraphicParser.g:3043:5: lv_decoratorPos_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getDecoratorPosEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_decoratorPos_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosRule());
            					}
            					set(
            						current,
            						"decoratorPos",
            						lv_decoratorPos_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsPattern"
    // InternalGraphicParser.g:3064:1: entryRuleGraphicRootClassesItemsConnectionsItemsPattern returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsPattern= ruleGraphicRootClassesItemsConnectionsItemsPattern EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsPattern = null;


        try {
            // InternalGraphicParser.g:3064:87: (iv_ruleGraphicRootClassesItemsConnectionsItemsPattern= ruleGraphicRootClassesItemsConnectionsItemsPattern EOF )
            // InternalGraphicParser.g:3065:2: iv_ruleGraphicRootClassesItemsConnectionsItemsPattern= ruleGraphicRootClassesItemsConnectionsItemsPattern EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsPattern=ruleGraphicRootClassesItemsConnectionsItemsPattern();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsPattern; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsPattern"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsPattern"
    // InternalGraphicParser.g:3071:1: ruleGraphicRootClassesItemsConnectionsItemsPattern returns [EObject current=null] : (otherlv_0= Pattern otherlv_1= Colon ( (lv_pattern_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_pattern_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:3077:2: ( (otherlv_0= Pattern otherlv_1= Colon ( (lv_pattern_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:3078:2: (otherlv_0= Pattern otherlv_1= Colon ( (lv_pattern_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:3078:2: (otherlv_0= Pattern otherlv_1= Colon ( (lv_pattern_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:3079:3: otherlv_0= Pattern otherlv_1= Colon ( (lv_pattern_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Pattern,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getPatternKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:3087:3: ( (lv_pattern_2_0= ruleEString ) )
            // InternalGraphicParser.g:3088:4: (lv_pattern_2_0= ruleEString )
            {
            // InternalGraphicParser.g:3088:4: (lv_pattern_2_0= ruleEString )
            // InternalGraphicParser.g:3089:5: lv_pattern_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getPatternEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pattern_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsPattern"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsWidth"
    // InternalGraphicParser.g:3110:1: entryRuleGraphicRootClassesItemsConnectionsItemsWidth returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsWidth= ruleGraphicRootClassesItemsConnectionsItemsWidth EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsWidth = null;


        try {
            // InternalGraphicParser.g:3110:85: (iv_ruleGraphicRootClassesItemsConnectionsItemsWidth= ruleGraphicRootClassesItemsConnectionsItemsWidth EOF )
            // InternalGraphicParser.g:3111:2: iv_ruleGraphicRootClassesItemsConnectionsItemsWidth= ruleGraphicRootClassesItemsConnectionsItemsWidth EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsWidth=ruleGraphicRootClassesItemsConnectionsItemsWidth();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsWidth; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsWidth"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsWidth"
    // InternalGraphicParser.g:3117:1: ruleGraphicRootClassesItemsConnectionsItemsWidth returns [EObject current=null] : (otherlv_0= Width otherlv_1= Colon ( (lv_width_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_width_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:3123:2: ( (otherlv_0= Width otherlv_1= Colon ( (lv_width_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:3124:2: (otherlv_0= Width otherlv_1= Colon ( (lv_width_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:3124:2: (otherlv_0= Width otherlv_1= Colon ( (lv_width_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:3125:3: otherlv_0= Width otherlv_1= Colon ( (lv_width_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Width,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getWidthKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:3133:3: ( (lv_width_2_0= ruleEString ) )
            // InternalGraphicParser.g:3134:4: (lv_width_2_0= ruleEString )
            {
            // InternalGraphicParser.g:3134:4: (lv_width_2_0= ruleEString )
            // InternalGraphicParser.g:3135:5: lv_width_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getWidthEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_width_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsWidth"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsPosition"
    // InternalGraphicParser.g:3156:1: entryRuleGraphicRootClassesItemsConnectionsItemsPosition returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsPosition= ruleGraphicRootClassesItemsConnectionsItemsPosition EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsPosition = null;


        try {
            // InternalGraphicParser.g:3156:88: (iv_ruleGraphicRootClassesItemsConnectionsItemsPosition= ruleGraphicRootClassesItemsConnectionsItemsPosition EOF )
            // InternalGraphicParser.g:3157:2: iv_ruleGraphicRootClassesItemsConnectionsItemsPosition= ruleGraphicRootClassesItemsConnectionsItemsPosition EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsPosition=ruleGraphicRootClassesItemsConnectionsItemsPosition();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsPosition; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsPosition"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsPosition"
    // InternalGraphicParser.g:3163:1: ruleGraphicRootClassesItemsConnectionsItemsPosition returns [EObject current=null] : (otherlv_0= Position otherlv_1= Colon ( (lv_position_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsPosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_position_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:3169:2: ( (otherlv_0= Position otherlv_1= Colon ( (lv_position_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:3170:2: (otherlv_0= Position otherlv_1= Colon ( (lv_position_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:3170:2: (otherlv_0= Position otherlv_1= Colon ( (lv_position_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:3171:3: otherlv_0= Position otherlv_1= Colon ( (lv_position_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Position,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getPositionKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:3179:3: ( (lv_position_2_0= ruleEString ) )
            // InternalGraphicParser.g:3180:4: (lv_position_2_0= ruleEString )
            {
            // InternalGraphicParser.g:3180:4: (lv_position_2_0= ruleEString )
            // InternalGraphicParser.g:3181:5: lv_position_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getPositionEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_position_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsPosition"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsTarget"
    // InternalGraphicParser.g:3202:1: entryRuleGraphicRootClassesItemsConnectionsItemsTarget returns [EObject current=null] : iv_ruleGraphicRootClassesItemsConnectionsItemsTarget= ruleGraphicRootClassesItemsConnectionsItemsTarget EOF ;
    public final EObject entryRuleGraphicRootClassesItemsConnectionsItemsTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicRootClassesItemsConnectionsItemsTarget = null;


        try {
            // InternalGraphicParser.g:3202:86: (iv_ruleGraphicRootClassesItemsConnectionsItemsTarget= ruleGraphicRootClassesItemsConnectionsItemsTarget EOF )
            // InternalGraphicParser.g:3203:2: iv_ruleGraphicRootClassesItemsConnectionsItemsTarget= ruleGraphicRootClassesItemsConnectionsItemsTarget EOF
            {
             newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicRootClassesItemsConnectionsItemsTarget=ruleGraphicRootClassesItemsConnectionsItemsTarget();

            state._fsp--;

             current =iv_ruleGraphicRootClassesItemsConnectionsItemsTarget; 
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
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsTarget"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsTarget"
    // InternalGraphicParser.g:3209:1: ruleGraphicRootClassesItemsConnectionsItemsTarget returns [EObject current=null] : (otherlv_0= Target otherlv_1= Colon ( (lv_target_2_0= ruleEString ) ) ) ;
    public final EObject ruleGraphicRootClassesItemsConnectionsItemsTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:3215:2: ( (otherlv_0= Target otherlv_1= Colon ( (lv_target_2_0= ruleEString ) ) ) )
            // InternalGraphicParser.g:3216:2: (otherlv_0= Target otherlv_1= Colon ( (lv_target_2_0= ruleEString ) ) )
            {
            // InternalGraphicParser.g:3216:2: (otherlv_0= Target otherlv_1= Colon ( (lv_target_2_0= ruleEString ) ) )
            // InternalGraphicParser.g:3217:3: otherlv_0= Target otherlv_1= Colon ( (lv_target_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Target,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getTargetKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getColonKeyword_1());
            		
            // InternalGraphicParser.g:3225:3: ( (lv_target_2_0= ruleEString ) )
            // InternalGraphicParser.g:3226:4: (lv_target_2_0= ruleEString )
            {
            // InternalGraphicParser.g:3226:4: (lv_target_2_0= ruleEString )
            // InternalGraphicParser.g:3227:5: lv_target_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getTargetEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_2_0,
            						"graphic.graphic.Graphic.EString");
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
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsTarget"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalGraphicParser.g:3248:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalGraphicParser.g:3248:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalGraphicParser.g:3249:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalGraphicParser.g:3255:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalGraphicParser.g:3261:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalGraphicParser.g:3262:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalGraphicParser.g:3262:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=ContactTestBitMask && LA29_0<=URI)||(LA29_0>=V1 && LA29_0<=V3)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGraphicParser.g:3263:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:3271:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalGraphicParser.g:3285:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalGraphicParser.g:3285:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalGraphicParser.g:3286:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalGraphicParser.g:3292:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Decorator | kw= XToOriginPos | kw= Color | kw= ShowAttributes | kw= Classes | kw= SizeInit | kw= Pattern | kw= Type | kw= URI | kw= Constraints | kw= CategoryBitMask | kw= Trim | kw= Text | kw= SizeMax | kw= Connections | kw= CollisionBitMask | kw= ContactTestBitMask | kw= ZToOriginPos | kw= Rotation | kw= Planes | kw= TextColor | kw= SizeMin | kw= DecoratorPos | kw= Target | kw= YToOriginPos | kw= MaterialAttributes | kw= Vname | kw= DecoratorColor | kw= Versions | kw= Ilumination | kw= Overlapping | kw= Name | kw= Width | kw= DecoratorWidth | kw= V1 | kw= Position | kw= V2 | kw= V3 ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGraphicParser.g:3298:2: ( (kw= Decorator | kw= XToOriginPos | kw= Color | kw= ShowAttributes | kw= Classes | kw= SizeInit | kw= Pattern | kw= Type | kw= URI | kw= Constraints | kw= CategoryBitMask | kw= Trim | kw= Text | kw= SizeMax | kw= Connections | kw= CollisionBitMask | kw= ContactTestBitMask | kw= ZToOriginPos | kw= Rotation | kw= Planes | kw= TextColor | kw= SizeMin | kw= DecoratorPos | kw= Target | kw= YToOriginPos | kw= MaterialAttributes | kw= Vname | kw= DecoratorColor | kw= Versions | kw= Ilumination | kw= Overlapping | kw= Name | kw= Width | kw= DecoratorWidth | kw= V1 | kw= Position | kw= V2 | kw= V3 ) )
            // InternalGraphicParser.g:3299:2: (kw= Decorator | kw= XToOriginPos | kw= Color | kw= ShowAttributes | kw= Classes | kw= SizeInit | kw= Pattern | kw= Type | kw= URI | kw= Constraints | kw= CategoryBitMask | kw= Trim | kw= Text | kw= SizeMax | kw= Connections | kw= CollisionBitMask | kw= ContactTestBitMask | kw= ZToOriginPos | kw= Rotation | kw= Planes | kw= TextColor | kw= SizeMin | kw= DecoratorPos | kw= Target | kw= YToOriginPos | kw= MaterialAttributes | kw= Vname | kw= DecoratorColor | kw= Versions | kw= Ilumination | kw= Overlapping | kw= Name | kw= Width | kw= DecoratorWidth | kw= V1 | kw= Position | kw= V2 | kw= V3 )
            {
            // InternalGraphicParser.g:3299:2: (kw= Decorator | kw= XToOriginPos | kw= Color | kw= ShowAttributes | kw= Classes | kw= SizeInit | kw= Pattern | kw= Type | kw= URI | kw= Constraints | kw= CategoryBitMask | kw= Trim | kw= Text | kw= SizeMax | kw= Connections | kw= CollisionBitMask | kw= ContactTestBitMask | kw= ZToOriginPos | kw= Rotation | kw= Planes | kw= TextColor | kw= SizeMin | kw= DecoratorPos | kw= Target | kw= YToOriginPos | kw= MaterialAttributes | kw= Vname | kw= DecoratorColor | kw= Versions | kw= Ilumination | kw= Overlapping | kw= Name | kw= Width | kw= DecoratorWidth | kw= V1 | kw= Position | kw= V2 | kw= V3 )
            int alt30=38;
            switch ( input.LA(1) ) {
            case Decorator:
                {
                alt30=1;
                }
                break;
            case XToOriginPos:
                {
                alt30=2;
                }
                break;
            case Color:
                {
                alt30=3;
                }
                break;
            case ShowAttributes:
                {
                alt30=4;
                }
                break;
            case Classes:
                {
                alt30=5;
                }
                break;
            case SizeInit:
                {
                alt30=6;
                }
                break;
            case Pattern:
                {
                alt30=7;
                }
                break;
            case Type:
                {
                alt30=8;
                }
                break;
            case URI:
                {
                alt30=9;
                }
                break;
            case Constraints:
                {
                alt30=10;
                }
                break;
            case CategoryBitMask:
                {
                alt30=11;
                }
                break;
            case Trim:
                {
                alt30=12;
                }
                break;
            case Text:
                {
                alt30=13;
                }
                break;
            case SizeMax:
                {
                alt30=14;
                }
                break;
            case Connections:
                {
                alt30=15;
                }
                break;
            case CollisionBitMask:
                {
                alt30=16;
                }
                break;
            case ContactTestBitMask:
                {
                alt30=17;
                }
                break;
            case ZToOriginPos:
                {
                alt30=18;
                }
                break;
            case Rotation:
                {
                alt30=19;
                }
                break;
            case Planes:
                {
                alt30=20;
                }
                break;
            case TextColor:
                {
                alt30=21;
                }
                break;
            case SizeMin:
                {
                alt30=22;
                }
                break;
            case DecoratorPos:
                {
                alt30=23;
                }
                break;
            case Target:
                {
                alt30=24;
                }
                break;
            case YToOriginPos:
                {
                alt30=25;
                }
                break;
            case MaterialAttributes:
                {
                alt30=26;
                }
                break;
            case Vname:
                {
                alt30=27;
                }
                break;
            case DecoratorColor:
                {
                alt30=28;
                }
                break;
            case Versions:
                {
                alt30=29;
                }
                break;
            case Ilumination:
                {
                alt30=30;
                }
                break;
            case Overlapping:
                {
                alt30=31;
                }
                break;
            case Name:
                {
                alt30=32;
                }
                break;
            case Width:
                {
                alt30=33;
                }
                break;
            case DecoratorWidth:
                {
                alt30=34;
                }
                break;
            case V1:
                {
                alt30=35;
                }
                break;
            case Position:
                {
                alt30=36;
                }
                break;
            case V2:
                {
                alt30=37;
                }
                break;
            case V3:
                {
                alt30=38;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalGraphicParser.g:3300:3: kw= Decorator
                    {
                    kw=(Token)match(input,Decorator,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDecoratorKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:3306:3: kw= XToOriginPos
                    {
                    kw=(Token)match(input,XToOriginPos,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getXToOriginPosKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:3312:3: kw= Color
                    {
                    kw=(Token)match(input,Color,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getColorKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGraphicParser.g:3318:3: kw= ShowAttributes
                    {
                    kw=(Token)match(input,ShowAttributes,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getShowAttributesKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGraphicParser.g:3324:3: kw= Classes
                    {
                    kw=(Token)match(input,Classes,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getClassesKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalGraphicParser.g:3330:3: kw= SizeInit
                    {
                    kw=(Token)match(input,SizeInit,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSizeInitKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalGraphicParser.g:3336:3: kw= Pattern
                    {
                    kw=(Token)match(input,Pattern,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPatternKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalGraphicParser.g:3342:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalGraphicParser.g:3348:3: kw= URI
                    {
                    kw=(Token)match(input,URI,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getURIKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalGraphicParser.g:3354:3: kw= Constraints
                    {
                    kw=(Token)match(input,Constraints,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConstraintsKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalGraphicParser.g:3360:3: kw= CategoryBitMask
                    {
                    kw=(Token)match(input,CategoryBitMask,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getCategoryBitMaskKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalGraphicParser.g:3366:3: kw= Trim
                    {
                    kw=(Token)match(input,Trim,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTrimKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalGraphicParser.g:3372:3: kw= Text
                    {
                    kw=(Token)match(input,Text,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTextKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalGraphicParser.g:3378:3: kw= SizeMax
                    {
                    kw=(Token)match(input,SizeMax,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSizeMaxKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalGraphicParser.g:3384:3: kw= Connections
                    {
                    kw=(Token)match(input,Connections,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConnectionsKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalGraphicParser.g:3390:3: kw= CollisionBitMask
                    {
                    kw=(Token)match(input,CollisionBitMask,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getCollisionBitMaskKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalGraphicParser.g:3396:3: kw= ContactTestBitMask
                    {
                    kw=(Token)match(input,ContactTestBitMask,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getContactTestBitMaskKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalGraphicParser.g:3402:3: kw= ZToOriginPos
                    {
                    kw=(Token)match(input,ZToOriginPos,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getZToOriginPosKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalGraphicParser.g:3408:3: kw= Rotation
                    {
                    kw=(Token)match(input,Rotation,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRotationKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalGraphicParser.g:3414:3: kw= Planes
                    {
                    kw=(Token)match(input,Planes,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPlanesKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalGraphicParser.g:3420:3: kw= TextColor
                    {
                    kw=(Token)match(input,TextColor,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTextColorKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalGraphicParser.g:3426:3: kw= SizeMin
                    {
                    kw=(Token)match(input,SizeMin,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSizeMinKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalGraphicParser.g:3432:3: kw= DecoratorPos
                    {
                    kw=(Token)match(input,DecoratorPos,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDecoratorPosKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalGraphicParser.g:3438:3: kw= Target
                    {
                    kw=(Token)match(input,Target,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTargetKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalGraphicParser.g:3444:3: kw= YToOriginPos
                    {
                    kw=(Token)match(input,YToOriginPos,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getYToOriginPosKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalGraphicParser.g:3450:3: kw= MaterialAttributes
                    {
                    kw=(Token)match(input,MaterialAttributes,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaterialAttributesKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalGraphicParser.g:3456:3: kw= Vname
                    {
                    kw=(Token)match(input,Vname,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getVnameKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalGraphicParser.g:3462:3: kw= DecoratorColor
                    {
                    kw=(Token)match(input,DecoratorColor,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDecoratorColorKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalGraphicParser.g:3468:3: kw= Versions
                    {
                    kw=(Token)match(input,Versions,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getVersionsKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalGraphicParser.g:3474:3: kw= Ilumination
                    {
                    kw=(Token)match(input,Ilumination,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIluminationKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalGraphicParser.g:3480:3: kw= Overlapping
                    {
                    kw=(Token)match(input,Overlapping,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOverlappingKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalGraphicParser.g:3486:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalGraphicParser.g:3492:3: kw= Width
                    {
                    kw=(Token)match(input,Width,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getWidthKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalGraphicParser.g:3498:3: kw= DecoratorWidth
                    {
                    kw=(Token)match(input,DecoratorWidth,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDecoratorWidthKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalGraphicParser.g:3504:3: kw= V1
                    {
                    kw=(Token)match(input,V1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getV1Keyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalGraphicParser.g:3510:3: kw= Position
                    {
                    kw=(Token)match(input,Position,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPositionKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalGraphicParser.g:3516:3: kw= V2
                    {
                    kw=(Token)match(input,V2,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getV2Keyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalGraphicParser.g:3522:3: kw= V3
                    {
                    kw=(Token)match(input,V3,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getV3Keyword_37());
                    		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0002004402000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0002100000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004402000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008077FFFFFFFF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0002000501018420L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000501018420L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002070000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0008877FFFFFFFF0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0002001838C670D0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001838C670D0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00020026C4380B00L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000026C4380B00L});

}
