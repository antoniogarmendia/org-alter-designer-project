package ontological.ontological.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ontological.ontological.services.OntologicalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologicalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Containtment", "Attributes", "References", "Bluetooth", "OnlyCodes", "Abstract", "External", "Firebase", "Gameloop", "Opposite", "ReadOnly", "Classes", "Default", "IsParam", "Physics", "AutoID", "Target", "IsKey", "NoSCN", "Name", "Type", "URI", "Max", "Min", "False", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalOntologicalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOntologicalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOntologicalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOntologicalParser.g"; }



     	private OntologicalGrammarAccess grammarAccess;

        public InternalOntologicalParser(TokenStream input, OntologicalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "OntologicalRoot";
       	}

       	@Override
       	protected OntologicalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOntologicalRoot"
    // InternalOntologicalParser.g:57:1: entryRuleOntologicalRoot returns [EObject current=null] : iv_ruleOntologicalRoot= ruleOntologicalRoot EOF ;
    public final EObject entryRuleOntologicalRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRoot = null;


        try {
            // InternalOntologicalParser.g:57:56: (iv_ruleOntologicalRoot= ruleOntologicalRoot EOF )
            // InternalOntologicalParser.g:58:2: iv_ruleOntologicalRoot= ruleOntologicalRoot EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRoot=ruleOntologicalRoot();

            state._fsp--;

             current =iv_ruleOntologicalRoot; 
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
    // $ANTLR end "entryRuleOntologicalRoot"


    // $ANTLR start "ruleOntologicalRoot"
    // InternalOntologicalParser.g:64:1: ruleOntologicalRoot returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleOntologicalRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ontologicalRoot_2_0 = null;

        EObject lv_ontologicalRoot_4_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:70:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalOntologicalParser.g:71:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalOntologicalParser.g:71:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalOntologicalParser.g:72:3: () otherlv_1= LeftCurlyBracket ( ( (lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalOntologicalParser.g:72:3: ()
            // InternalOntologicalParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootAccess().getOntologicalRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalOntologicalParser.g:83:3: ( ( (lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=Bluetooth && LA2_0<=OnlyCodes)||(LA2_0>=External && LA2_0<=Gameloop)||LA2_0==Classes||LA2_0==Physics||LA2_0==Name||LA2_0==URI) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOntologicalParser.g:84:4: ( (lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract ) ) )*
                    {
                    // InternalOntologicalParser.g:84:4: ( (lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract ) )
                    // InternalOntologicalParser.g:85:5: (lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract )
                    {
                    // InternalOntologicalParser.g:85:5: (lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract )
                    // InternalOntologicalParser.g:86:6: lv_ontologicalRoot_2_0= ruleOntologicalRootPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getOntologicalRootAccess().getOntologicalRootOntologicalRootPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_ontologicalRoot_2_0=ruleOntologicalRootPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologicalRootRule());
                    						}
                    						add(
                    							current,
                    							"ontologicalRoot",
                    							lv_ontologicalRoot_2_0,
                    							"ontological.ontological.Ontological.OntologicalRootPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntologicalParser.g:103:4: (otherlv_3= Comma ( (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalOntologicalParser.g:104:5: otherlv_3= Comma ( (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOntologicalRootAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalOntologicalParser.g:108:5: ( (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract ) )
                    	    // InternalOntologicalParser.g:109:6: (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract )
                    	    {
                    	    // InternalOntologicalParser.g:109:6: (lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract )
                    	    // InternalOntologicalParser.g:110:7: lv_ontologicalRoot_4_0= ruleOntologicalRootPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntologicalRootAccess().getOntologicalRootOntologicalRootPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_ontologicalRoot_4_0=ruleOntologicalRootPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntologicalRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ontologicalRoot",
                    	    								lv_ontologicalRoot_4_0,
                    	    								"ontological.ontological.Ontological.OntologicalRootPropertiesAbstract");
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

            			newLeafNode(otherlv_5, grammarAccess.getOntologicalRootAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOntologicalRoot"


    // $ANTLR start "entryRuleOntologicalRootPropertiesAbstract"
    // InternalOntologicalParser.g:137:1: entryRuleOntologicalRootPropertiesAbstract returns [EObject current=null] : iv_ruleOntologicalRootPropertiesAbstract= ruleOntologicalRootPropertiesAbstract EOF ;
    public final EObject entryRuleOntologicalRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootPropertiesAbstract = null;


        try {
            // InternalOntologicalParser.g:137:74: (iv_ruleOntologicalRootPropertiesAbstract= ruleOntologicalRootPropertiesAbstract EOF )
            // InternalOntologicalParser.g:138:2: iv_ruleOntologicalRootPropertiesAbstract= ruleOntologicalRootPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootPropertiesAbstract=ruleOntologicalRootPropertiesAbstract();

            state._fsp--;

             current =iv_ruleOntologicalRootPropertiesAbstract; 
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
    // $ANTLR end "entryRuleOntologicalRootPropertiesAbstract"


    // $ANTLR start "ruleOntologicalRootPropertiesAbstract"
    // InternalOntologicalParser.g:144:1: ruleOntologicalRootPropertiesAbstract returns [EObject current=null] : (this_OntologicalRootName_0= ruleOntologicalRootName | this_OntologicalRootURI_1= ruleOntologicalRootURI | this_OntologicalRootOnlyCodes_2= ruleOntologicalRootOnlyCodes | this_OntologicalRootBluetooth_3= ruleOntologicalRootBluetooth | this_OntologicalRootExternal_4= ruleOntologicalRootExternal | this_OntologicalRootFirebase_5= ruleOntologicalRootFirebase | this_OntologicalRootPhysics_6= ruleOntologicalRootPhysics | this_OntologicalRootGameloop_7= ruleOntologicalRootGameloop | this_OntologicalRootClasses_8= ruleOntologicalRootClasses ) ;
    public final EObject ruleOntologicalRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_OntologicalRootName_0 = null;

        EObject this_OntologicalRootURI_1 = null;

        EObject this_OntologicalRootOnlyCodes_2 = null;

        EObject this_OntologicalRootBluetooth_3 = null;

        EObject this_OntologicalRootExternal_4 = null;

        EObject this_OntologicalRootFirebase_5 = null;

        EObject this_OntologicalRootPhysics_6 = null;

        EObject this_OntologicalRootGameloop_7 = null;

        EObject this_OntologicalRootClasses_8 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:150:2: ( (this_OntologicalRootName_0= ruleOntologicalRootName | this_OntologicalRootURI_1= ruleOntologicalRootURI | this_OntologicalRootOnlyCodes_2= ruleOntologicalRootOnlyCodes | this_OntologicalRootBluetooth_3= ruleOntologicalRootBluetooth | this_OntologicalRootExternal_4= ruleOntologicalRootExternal | this_OntologicalRootFirebase_5= ruleOntologicalRootFirebase | this_OntologicalRootPhysics_6= ruleOntologicalRootPhysics | this_OntologicalRootGameloop_7= ruleOntologicalRootGameloop | this_OntologicalRootClasses_8= ruleOntologicalRootClasses ) )
            // InternalOntologicalParser.g:151:2: (this_OntologicalRootName_0= ruleOntologicalRootName | this_OntologicalRootURI_1= ruleOntologicalRootURI | this_OntologicalRootOnlyCodes_2= ruleOntologicalRootOnlyCodes | this_OntologicalRootBluetooth_3= ruleOntologicalRootBluetooth | this_OntologicalRootExternal_4= ruleOntologicalRootExternal | this_OntologicalRootFirebase_5= ruleOntologicalRootFirebase | this_OntologicalRootPhysics_6= ruleOntologicalRootPhysics | this_OntologicalRootGameloop_7= ruleOntologicalRootGameloop | this_OntologicalRootClasses_8= ruleOntologicalRootClasses )
            {
            // InternalOntologicalParser.g:151:2: (this_OntologicalRootName_0= ruleOntologicalRootName | this_OntologicalRootURI_1= ruleOntologicalRootURI | this_OntologicalRootOnlyCodes_2= ruleOntologicalRootOnlyCodes | this_OntologicalRootBluetooth_3= ruleOntologicalRootBluetooth | this_OntologicalRootExternal_4= ruleOntologicalRootExternal | this_OntologicalRootFirebase_5= ruleOntologicalRootFirebase | this_OntologicalRootPhysics_6= ruleOntologicalRootPhysics | this_OntologicalRootGameloop_7= ruleOntologicalRootGameloop | this_OntologicalRootClasses_8= ruleOntologicalRootClasses )
            int alt3=9;
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
            case OnlyCodes:
                {
                alt3=3;
                }
                break;
            case Bluetooth:
                {
                alt3=4;
                }
                break;
            case External:
                {
                alt3=5;
                }
                break;
            case Firebase:
                {
                alt3=6;
                }
                break;
            case Physics:
                {
                alt3=7;
                }
                break;
            case Gameloop:
                {
                alt3=8;
                }
                break;
            case Classes:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOntologicalParser.g:152:3: this_OntologicalRootName_0= ruleOntologicalRootName
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootName_0=ruleOntologicalRootName();

                    state._fsp--;


                    			current = this_OntologicalRootName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:161:3: this_OntologicalRootURI_1= ruleOntologicalRootURI
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootURIParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootURI_1=ruleOntologicalRootURI();

                    state._fsp--;


                    			current = this_OntologicalRootURI_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalParser.g:170:3: this_OntologicalRootOnlyCodes_2= ruleOntologicalRootOnlyCodes
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootOnlyCodesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootOnlyCodes_2=ruleOntologicalRootOnlyCodes();

                    state._fsp--;


                    			current = this_OntologicalRootOnlyCodes_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntologicalParser.g:179:3: this_OntologicalRootBluetooth_3= ruleOntologicalRootBluetooth
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootBluetoothParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootBluetooth_3=ruleOntologicalRootBluetooth();

                    state._fsp--;


                    			current = this_OntologicalRootBluetooth_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOntologicalParser.g:188:3: this_OntologicalRootExternal_4= ruleOntologicalRootExternal
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootExternalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootExternal_4=ruleOntologicalRootExternal();

                    state._fsp--;


                    			current = this_OntologicalRootExternal_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOntologicalParser.g:197:3: this_OntologicalRootFirebase_5= ruleOntologicalRootFirebase
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootFirebaseParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootFirebase_5=ruleOntologicalRootFirebase();

                    state._fsp--;


                    			current = this_OntologicalRootFirebase_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOntologicalParser.g:206:3: this_OntologicalRootPhysics_6= ruleOntologicalRootPhysics
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootPhysicsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootPhysics_6=ruleOntologicalRootPhysics();

                    state._fsp--;


                    			current = this_OntologicalRootPhysics_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOntologicalParser.g:215:3: this_OntologicalRootGameloop_7= ruleOntologicalRootGameloop
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootGameloopParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootGameloop_7=ruleOntologicalRootGameloop();

                    state._fsp--;


                    			current = this_OntologicalRootGameloop_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalOntologicalParser.g:224:3: this_OntologicalRootClasses_8= ruleOntologicalRootClasses
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootClassesParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClasses_8=ruleOntologicalRootClasses();

                    state._fsp--;


                    			current = this_OntologicalRootClasses_8;
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
    // $ANTLR end "ruleOntologicalRootPropertiesAbstract"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:236:1: entryRuleOntologicalRootClassesItemsPropertiesAbstract returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsPropertiesAbstract= ruleOntologicalRootClassesItemsPropertiesAbstract EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsPropertiesAbstract = null;


        try {
            // InternalOntologicalParser.g:236:86: (iv_ruleOntologicalRootClassesItemsPropertiesAbstract= ruleOntologicalRootClassesItemsPropertiesAbstract EOF )
            // InternalOntologicalParser.g:237:2: iv_ruleOntologicalRootClassesItemsPropertiesAbstract= ruleOntologicalRootClassesItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsPropertiesAbstract=ruleOntologicalRootClassesItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsPropertiesAbstract"


    // $ANTLR start "ruleOntologicalRootClassesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:243:1: ruleOntologicalRootClassesItemsPropertiesAbstract returns [EObject current=null] : (this_OntologicalRootClassesItemsName_0= ruleOntologicalRootClassesItemsName | this_OntologicalRootClassesItemsAbstract_1= ruleOntologicalRootClassesItemsAbstract | this_OntologicalRootClassesItemsAttributes_2= ruleOntologicalRootClassesItemsAttributes | this_OntologicalRootClassesItemsReferences_3= ruleOntologicalRootClassesItemsReferences | this_OntologicalRootClassesItemsAutoID_4= ruleOntologicalRootClassesItemsAutoID | this_OntologicalRootClassesItemsOnlyCodes_5= ruleOntologicalRootClassesItemsOnlyCodes | this_OntologicalRootClassesItemsBluetooth_6= ruleOntologicalRootClassesItemsBluetooth | this_OntologicalRootClassesItemsNoSCN_7= ruleOntologicalRootClassesItemsNoSCN ) ;
    public final EObject ruleOntologicalRootClassesItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_OntologicalRootClassesItemsName_0 = null;

        EObject this_OntologicalRootClassesItemsAbstract_1 = null;

        EObject this_OntologicalRootClassesItemsAttributes_2 = null;

        EObject this_OntologicalRootClassesItemsReferences_3 = null;

        EObject this_OntologicalRootClassesItemsAutoID_4 = null;

        EObject this_OntologicalRootClassesItemsOnlyCodes_5 = null;

        EObject this_OntologicalRootClassesItemsBluetooth_6 = null;

        EObject this_OntologicalRootClassesItemsNoSCN_7 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:249:2: ( (this_OntologicalRootClassesItemsName_0= ruleOntologicalRootClassesItemsName | this_OntologicalRootClassesItemsAbstract_1= ruleOntologicalRootClassesItemsAbstract | this_OntologicalRootClassesItemsAttributes_2= ruleOntologicalRootClassesItemsAttributes | this_OntologicalRootClassesItemsReferences_3= ruleOntologicalRootClassesItemsReferences | this_OntologicalRootClassesItemsAutoID_4= ruleOntologicalRootClassesItemsAutoID | this_OntologicalRootClassesItemsOnlyCodes_5= ruleOntologicalRootClassesItemsOnlyCodes | this_OntologicalRootClassesItemsBluetooth_6= ruleOntologicalRootClassesItemsBluetooth | this_OntologicalRootClassesItemsNoSCN_7= ruleOntologicalRootClassesItemsNoSCN ) )
            // InternalOntologicalParser.g:250:2: (this_OntologicalRootClassesItemsName_0= ruleOntologicalRootClassesItemsName | this_OntologicalRootClassesItemsAbstract_1= ruleOntologicalRootClassesItemsAbstract | this_OntologicalRootClassesItemsAttributes_2= ruleOntologicalRootClassesItemsAttributes | this_OntologicalRootClassesItemsReferences_3= ruleOntologicalRootClassesItemsReferences | this_OntologicalRootClassesItemsAutoID_4= ruleOntologicalRootClassesItemsAutoID | this_OntologicalRootClassesItemsOnlyCodes_5= ruleOntologicalRootClassesItemsOnlyCodes | this_OntologicalRootClassesItemsBluetooth_6= ruleOntologicalRootClassesItemsBluetooth | this_OntologicalRootClassesItemsNoSCN_7= ruleOntologicalRootClassesItemsNoSCN )
            {
            // InternalOntologicalParser.g:250:2: (this_OntologicalRootClassesItemsName_0= ruleOntologicalRootClassesItemsName | this_OntologicalRootClassesItemsAbstract_1= ruleOntologicalRootClassesItemsAbstract | this_OntologicalRootClassesItemsAttributes_2= ruleOntologicalRootClassesItemsAttributes | this_OntologicalRootClassesItemsReferences_3= ruleOntologicalRootClassesItemsReferences | this_OntologicalRootClassesItemsAutoID_4= ruleOntologicalRootClassesItemsAutoID | this_OntologicalRootClassesItemsOnlyCodes_5= ruleOntologicalRootClassesItemsOnlyCodes | this_OntologicalRootClassesItemsBluetooth_6= ruleOntologicalRootClassesItemsBluetooth | this_OntologicalRootClassesItemsNoSCN_7= ruleOntologicalRootClassesItemsNoSCN )
            int alt4=8;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt4=1;
                }
                break;
            case Abstract:
                {
                alt4=2;
                }
                break;
            case Attributes:
                {
                alt4=3;
                }
                break;
            case References:
                {
                alt4=4;
                }
                break;
            case AutoID:
                {
                alt4=5;
                }
                break;
            case OnlyCodes:
                {
                alt4=6;
                }
                break;
            case Bluetooth:
                {
                alt4=7;
                }
                break;
            case NoSCN:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOntologicalParser.g:251:3: this_OntologicalRootClassesItemsName_0= ruleOntologicalRootClassesItemsName
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsName_0=ruleOntologicalRootClassesItemsName();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:260:3: this_OntologicalRootClassesItemsAbstract_1= ruleOntologicalRootClassesItemsAbstract
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAbstractParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAbstract_1=ruleOntologicalRootClassesItemsAbstract();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAbstract_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalParser.g:269:3: this_OntologicalRootClassesItemsAttributes_2= ruleOntologicalRootClassesItemsAttributes
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAttributes_2=ruleOntologicalRootClassesItemsAttributes();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAttributes_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntologicalParser.g:278:3: this_OntologicalRootClassesItemsReferences_3= ruleOntologicalRootClassesItemsReferences
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsReferences_3=ruleOntologicalRootClassesItemsReferences();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsReferences_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOntologicalParser.g:287:3: this_OntologicalRootClassesItemsAutoID_4= ruleOntologicalRootClassesItemsAutoID
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAutoIDParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAutoID_4=ruleOntologicalRootClassesItemsAutoID();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAutoID_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOntologicalParser.g:296:3: this_OntologicalRootClassesItemsOnlyCodes_5= ruleOntologicalRootClassesItemsOnlyCodes
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsOnlyCodesParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsOnlyCodes_5=ruleOntologicalRootClassesItemsOnlyCodes();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsOnlyCodes_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOntologicalParser.g:305:3: this_OntologicalRootClassesItemsBluetooth_6= ruleOntologicalRootClassesItemsBluetooth
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsBluetoothParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsBluetooth_6=ruleOntologicalRootClassesItemsBluetooth();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsBluetooth_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOntologicalParser.g:314:3: this_OntologicalRootClassesItemsNoSCN_7= ruleOntologicalRootClassesItemsNoSCN
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsNoSCNParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsNoSCN_7=ruleOntologicalRootClassesItemsNoSCN();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsNoSCN_7;
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
    // $ANTLR end "ruleOntologicalRootClassesItemsPropertiesAbstract"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:326:1: entryRuleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract = null;


        try {
            // InternalOntologicalParser.g:326:101: (iv_ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract EOF )
            // InternalOntologicalParser.g:327:2: iv_ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract=ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:333:1: ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract returns [EObject current=null] : (this_OntologicalRootClassesItemsAttributesItemsName_0= ruleOntologicalRootClassesItemsAttributesItemsName | this_OntologicalRootClassesItemsAttributesItemsType_1= ruleOntologicalRootClassesItemsAttributesItemsType | this_OntologicalRootClassesItemsAttributesItemsMin_2= ruleOntologicalRootClassesItemsAttributesItemsMin | this_OntologicalRootClassesItemsAttributesItemsMax_3= ruleOntologicalRootClassesItemsAttributesItemsMax | this_OntologicalRootClassesItemsAttributesItemsDefault_4= ruleOntologicalRootClassesItemsAttributesItemsDefault | this_OntologicalRootClassesItemsAttributesItemsReadOnly_5= ruleOntologicalRootClassesItemsAttributesItemsReadOnly | this_OntologicalRootClassesItemsAttributesItemsIsParam_6= ruleOntologicalRootClassesItemsAttributesItemsIsParam | this_OntologicalRootClassesItemsAttributesItemsIsKey_7= ruleOntologicalRootClassesItemsAttributesItemsIsKey ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_OntologicalRootClassesItemsAttributesItemsName_0 = null;

        EObject this_OntologicalRootClassesItemsAttributesItemsType_1 = null;

        EObject this_OntologicalRootClassesItemsAttributesItemsMin_2 = null;

        EObject this_OntologicalRootClassesItemsAttributesItemsMax_3 = null;

        EObject this_OntologicalRootClassesItemsAttributesItemsDefault_4 = null;

        EObject this_OntologicalRootClassesItemsAttributesItemsReadOnly_5 = null;

        EObject this_OntologicalRootClassesItemsAttributesItemsIsParam_6 = null;

        EObject this_OntologicalRootClassesItemsAttributesItemsIsKey_7 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:339:2: ( (this_OntologicalRootClassesItemsAttributesItemsName_0= ruleOntologicalRootClassesItemsAttributesItemsName | this_OntologicalRootClassesItemsAttributesItemsType_1= ruleOntologicalRootClassesItemsAttributesItemsType | this_OntologicalRootClassesItemsAttributesItemsMin_2= ruleOntologicalRootClassesItemsAttributesItemsMin | this_OntologicalRootClassesItemsAttributesItemsMax_3= ruleOntologicalRootClassesItemsAttributesItemsMax | this_OntologicalRootClassesItemsAttributesItemsDefault_4= ruleOntologicalRootClassesItemsAttributesItemsDefault | this_OntologicalRootClassesItemsAttributesItemsReadOnly_5= ruleOntologicalRootClassesItemsAttributesItemsReadOnly | this_OntologicalRootClassesItemsAttributesItemsIsParam_6= ruleOntologicalRootClassesItemsAttributesItemsIsParam | this_OntologicalRootClassesItemsAttributesItemsIsKey_7= ruleOntologicalRootClassesItemsAttributesItemsIsKey ) )
            // InternalOntologicalParser.g:340:2: (this_OntologicalRootClassesItemsAttributesItemsName_0= ruleOntologicalRootClassesItemsAttributesItemsName | this_OntologicalRootClassesItemsAttributesItemsType_1= ruleOntologicalRootClassesItemsAttributesItemsType | this_OntologicalRootClassesItemsAttributesItemsMin_2= ruleOntologicalRootClassesItemsAttributesItemsMin | this_OntologicalRootClassesItemsAttributesItemsMax_3= ruleOntologicalRootClassesItemsAttributesItemsMax | this_OntologicalRootClassesItemsAttributesItemsDefault_4= ruleOntologicalRootClassesItemsAttributesItemsDefault | this_OntologicalRootClassesItemsAttributesItemsReadOnly_5= ruleOntologicalRootClassesItemsAttributesItemsReadOnly | this_OntologicalRootClassesItemsAttributesItemsIsParam_6= ruleOntologicalRootClassesItemsAttributesItemsIsParam | this_OntologicalRootClassesItemsAttributesItemsIsKey_7= ruleOntologicalRootClassesItemsAttributesItemsIsKey )
            {
            // InternalOntologicalParser.g:340:2: (this_OntologicalRootClassesItemsAttributesItemsName_0= ruleOntologicalRootClassesItemsAttributesItemsName | this_OntologicalRootClassesItemsAttributesItemsType_1= ruleOntologicalRootClassesItemsAttributesItemsType | this_OntologicalRootClassesItemsAttributesItemsMin_2= ruleOntologicalRootClassesItemsAttributesItemsMin | this_OntologicalRootClassesItemsAttributesItemsMax_3= ruleOntologicalRootClassesItemsAttributesItemsMax | this_OntologicalRootClassesItemsAttributesItemsDefault_4= ruleOntologicalRootClassesItemsAttributesItemsDefault | this_OntologicalRootClassesItemsAttributesItemsReadOnly_5= ruleOntologicalRootClassesItemsAttributesItemsReadOnly | this_OntologicalRootClassesItemsAttributesItemsIsParam_6= ruleOntologicalRootClassesItemsAttributesItemsIsParam | this_OntologicalRootClassesItemsAttributesItemsIsKey_7= ruleOntologicalRootClassesItemsAttributesItemsIsKey )
            int alt5=8;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt5=1;
                }
                break;
            case Type:
                {
                alt5=2;
                }
                break;
            case Min:
                {
                alt5=3;
                }
                break;
            case Max:
                {
                alt5=4;
                }
                break;
            case Default:
                {
                alt5=5;
                }
                break;
            case ReadOnly:
                {
                alt5=6;
                }
                break;
            case IsParam:
                {
                alt5=7;
                }
                break;
            case IsKey:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalOntologicalParser.g:341:3: this_OntologicalRootClassesItemsAttributesItemsName_0= ruleOntologicalRootClassesItemsAttributesItemsName
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAttributesItemsName_0=ruleOntologicalRootClassesItemsAttributesItemsName();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAttributesItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:350:3: this_OntologicalRootClassesItemsAttributesItemsType_1= ruleOntologicalRootClassesItemsAttributesItemsType
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAttributesItemsType_1=ruleOntologicalRootClassesItemsAttributesItemsType();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAttributesItemsType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalParser.g:359:3: this_OntologicalRootClassesItemsAttributesItemsMin_2= ruleOntologicalRootClassesItemsAttributesItemsMin
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsMinParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAttributesItemsMin_2=ruleOntologicalRootClassesItemsAttributesItemsMin();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAttributesItemsMin_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntologicalParser.g:368:3: this_OntologicalRootClassesItemsAttributesItemsMax_3= ruleOntologicalRootClassesItemsAttributesItemsMax
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsMaxParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAttributesItemsMax_3=ruleOntologicalRootClassesItemsAttributesItemsMax();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAttributesItemsMax_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOntologicalParser.g:377:3: this_OntologicalRootClassesItemsAttributesItemsDefault_4= ruleOntologicalRootClassesItemsAttributesItemsDefault
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsDefaultParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAttributesItemsDefault_4=ruleOntologicalRootClassesItemsAttributesItemsDefault();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAttributesItemsDefault_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOntologicalParser.g:386:3: this_OntologicalRootClassesItemsAttributesItemsReadOnly_5= ruleOntologicalRootClassesItemsAttributesItemsReadOnly
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsReadOnlyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAttributesItemsReadOnly_5=ruleOntologicalRootClassesItemsAttributesItemsReadOnly();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAttributesItemsReadOnly_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOntologicalParser.g:395:3: this_OntologicalRootClassesItemsAttributesItemsIsParam_6= ruleOntologicalRootClassesItemsAttributesItemsIsParam
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsIsParamParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAttributesItemsIsParam_6=ruleOntologicalRootClassesItemsAttributesItemsIsParam();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAttributesItemsIsParam_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOntologicalParser.g:404:3: this_OntologicalRootClassesItemsAttributesItemsIsKey_7= ruleOntologicalRootClassesItemsAttributesItemsIsKey
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsIsKeyParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsAttributesItemsIsKey_7=ruleOntologicalRootClassesItemsAttributesItemsIsKey();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsAttributesItemsIsKey_7;
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:416:1: entryRuleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract = null;


        try {
            // InternalOntologicalParser.g:416:101: (iv_ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract EOF )
            // InternalOntologicalParser.g:417:2: iv_ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract=ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:423:1: ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract returns [EObject current=null] : (this_OntologicalRootClassesItemsReferencesItemsName_0= ruleOntologicalRootClassesItemsReferencesItemsName | this_OntologicalRootClassesItemsReferencesItemsContaintment_1= ruleOntologicalRootClassesItemsReferencesItemsContaintment | this_OntologicalRootClassesItemsReferencesItemsMin_2= ruleOntologicalRootClassesItemsReferencesItemsMin | this_OntologicalRootClassesItemsReferencesItemsMax_3= ruleOntologicalRootClassesItemsReferencesItemsMax | this_OntologicalRootClassesItemsReferencesItemsTarget_4= ruleOntologicalRootClassesItemsReferencesItemsTarget | this_OntologicalRootClassesItemsReferencesItemsOpposite_5= ruleOntologicalRootClassesItemsReferencesItemsOpposite ) ;
    public final EObject ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_OntologicalRootClassesItemsReferencesItemsName_0 = null;

        EObject this_OntologicalRootClassesItemsReferencesItemsContaintment_1 = null;

        EObject this_OntologicalRootClassesItemsReferencesItemsMin_2 = null;

        EObject this_OntologicalRootClassesItemsReferencesItemsMax_3 = null;

        EObject this_OntologicalRootClassesItemsReferencesItemsTarget_4 = null;

        EObject this_OntologicalRootClassesItemsReferencesItemsOpposite_5 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:429:2: ( (this_OntologicalRootClassesItemsReferencesItemsName_0= ruleOntologicalRootClassesItemsReferencesItemsName | this_OntologicalRootClassesItemsReferencesItemsContaintment_1= ruleOntologicalRootClassesItemsReferencesItemsContaintment | this_OntologicalRootClassesItemsReferencesItemsMin_2= ruleOntologicalRootClassesItemsReferencesItemsMin | this_OntologicalRootClassesItemsReferencesItemsMax_3= ruleOntologicalRootClassesItemsReferencesItemsMax | this_OntologicalRootClassesItemsReferencesItemsTarget_4= ruleOntologicalRootClassesItemsReferencesItemsTarget | this_OntologicalRootClassesItemsReferencesItemsOpposite_5= ruleOntologicalRootClassesItemsReferencesItemsOpposite ) )
            // InternalOntologicalParser.g:430:2: (this_OntologicalRootClassesItemsReferencesItemsName_0= ruleOntologicalRootClassesItemsReferencesItemsName | this_OntologicalRootClassesItemsReferencesItemsContaintment_1= ruleOntologicalRootClassesItemsReferencesItemsContaintment | this_OntologicalRootClassesItemsReferencesItemsMin_2= ruleOntologicalRootClassesItemsReferencesItemsMin | this_OntologicalRootClassesItemsReferencesItemsMax_3= ruleOntologicalRootClassesItemsReferencesItemsMax | this_OntologicalRootClassesItemsReferencesItemsTarget_4= ruleOntologicalRootClassesItemsReferencesItemsTarget | this_OntologicalRootClassesItemsReferencesItemsOpposite_5= ruleOntologicalRootClassesItemsReferencesItemsOpposite )
            {
            // InternalOntologicalParser.g:430:2: (this_OntologicalRootClassesItemsReferencesItemsName_0= ruleOntologicalRootClassesItemsReferencesItemsName | this_OntologicalRootClassesItemsReferencesItemsContaintment_1= ruleOntologicalRootClassesItemsReferencesItemsContaintment | this_OntologicalRootClassesItemsReferencesItemsMin_2= ruleOntologicalRootClassesItemsReferencesItemsMin | this_OntologicalRootClassesItemsReferencesItemsMax_3= ruleOntologicalRootClassesItemsReferencesItemsMax | this_OntologicalRootClassesItemsReferencesItemsTarget_4= ruleOntologicalRootClassesItemsReferencesItemsTarget | this_OntologicalRootClassesItemsReferencesItemsOpposite_5= ruleOntologicalRootClassesItemsReferencesItemsOpposite )
            int alt6=6;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt6=1;
                }
                break;
            case Containtment:
                {
                alt6=2;
                }
                break;
            case Min:
                {
                alt6=3;
                }
                break;
            case Max:
                {
                alt6=4;
                }
                break;
            case Target:
                {
                alt6=5;
                }
                break;
            case Opposite:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalOntologicalParser.g:431:3: this_OntologicalRootClassesItemsReferencesItemsName_0= ruleOntologicalRootClassesItemsReferencesItemsName
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsReferencesItemsName_0=ruleOntologicalRootClassesItemsReferencesItemsName();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsReferencesItemsName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:440:3: this_OntologicalRootClassesItemsReferencesItemsContaintment_1= ruleOntologicalRootClassesItemsReferencesItemsContaintment
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsContaintmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsReferencesItemsContaintment_1=ruleOntologicalRootClassesItemsReferencesItemsContaintment();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsReferencesItemsContaintment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalParser.g:449:3: this_OntologicalRootClassesItemsReferencesItemsMin_2= ruleOntologicalRootClassesItemsReferencesItemsMin
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsMinParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsReferencesItemsMin_2=ruleOntologicalRootClassesItemsReferencesItemsMin();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsReferencesItemsMin_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntologicalParser.g:458:3: this_OntologicalRootClassesItemsReferencesItemsMax_3= ruleOntologicalRootClassesItemsReferencesItemsMax
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsMaxParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsReferencesItemsMax_3=ruleOntologicalRootClassesItemsReferencesItemsMax();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsReferencesItemsMax_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOntologicalParser.g:467:3: this_OntologicalRootClassesItemsReferencesItemsTarget_4= ruleOntologicalRootClassesItemsReferencesItemsTarget
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsTargetParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsReferencesItemsTarget_4=ruleOntologicalRootClassesItemsReferencesItemsTarget();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsReferencesItemsTarget_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOntologicalParser.g:476:3: this_OntologicalRootClassesItemsReferencesItemsOpposite_5= ruleOntologicalRootClassesItemsReferencesItemsOpposite
                    {

                    			newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsOppositeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntologicalRootClassesItemsReferencesItemsOpposite_5=ruleOntologicalRootClassesItemsReferencesItemsOpposite();

                    state._fsp--;


                    			current = this_OntologicalRootClassesItemsReferencesItemsOpposite_5;
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
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract"


    // $ANTLR start "entryRuleOntologicalRootName"
    // InternalOntologicalParser.g:488:1: entryRuleOntologicalRootName returns [EObject current=null] : iv_ruleOntologicalRootName= ruleOntologicalRootName EOF ;
    public final EObject entryRuleOntologicalRootName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootName = null;


        try {
            // InternalOntologicalParser.g:488:60: (iv_ruleOntologicalRootName= ruleOntologicalRootName EOF )
            // InternalOntologicalParser.g:489:2: iv_ruleOntologicalRootName= ruleOntologicalRootName EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootName=ruleOntologicalRootName();

            state._fsp--;

             current =iv_ruleOntologicalRootName; 
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
    // $ANTLR end "entryRuleOntologicalRootName"


    // $ANTLR start "ruleOntologicalRootName"
    // InternalOntologicalParser.g:495:1: ruleOntologicalRootName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:501:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:502:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:502:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalOntologicalParser.g:503:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalOntologicalParser.g:503:3: ()
            // InternalOntologicalParser.g:504:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootNameAccess().getOntologicalRootNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologicalRootNameAccess().getColonKeyword_2());
            		
            // InternalOntologicalParser.g:518:3: ( (lv_name_3_0= ruleEString ) )
            // InternalOntologicalParser.g:519:4: (lv_name_3_0= ruleEString )
            {
            // InternalOntologicalParser.g:519:4: (lv_name_3_0= ruleEString )
            // InternalOntologicalParser.g:520:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootName"


    // $ANTLR start "entryRuleOntologicalRootURI"
    // InternalOntologicalParser.g:541:1: entryRuleOntologicalRootURI returns [EObject current=null] : iv_ruleOntologicalRootURI= ruleOntologicalRootURI EOF ;
    public final EObject entryRuleOntologicalRootURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootURI = null;


        try {
            // InternalOntologicalParser.g:541:59: (iv_ruleOntologicalRootURI= ruleOntologicalRootURI EOF )
            // InternalOntologicalParser.g:542:2: iv_ruleOntologicalRootURI= ruleOntologicalRootURI EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootURIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootURI=ruleOntologicalRootURI();

            state._fsp--;

             current =iv_ruleOntologicalRootURI; 
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
    // $ANTLR end "entryRuleOntologicalRootURI"


    // $ANTLR start "ruleOntologicalRootURI"
    // InternalOntologicalParser.g:548:1: ruleOntologicalRootURI returns [EObject current=null] : (otherlv_0= URI otherlv_1= Colon ( (lv_URI_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootURI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_URI_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:554:2: ( (otherlv_0= URI otherlv_1= Colon ( (lv_URI_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:555:2: (otherlv_0= URI otherlv_1= Colon ( (lv_URI_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:555:2: (otherlv_0= URI otherlv_1= Colon ( (lv_URI_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:556:3: otherlv_0= URI otherlv_1= Colon ( (lv_URI_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,URI,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootURIAccess().getURIKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootURIAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:564:3: ( (lv_URI_2_0= ruleEString ) )
            // InternalOntologicalParser.g:565:4: (lv_URI_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:565:4: (lv_URI_2_0= ruleEString )
            // InternalOntologicalParser.g:566:5: lv_URI_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootURIAccess().getURIEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_URI_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootURIRule());
            					}
            					set(
            						current,
            						"URI",
            						lv_URI_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootURI"


    // $ANTLR start "entryRuleOntologicalRootOnlyCodes"
    // InternalOntologicalParser.g:587:1: entryRuleOntologicalRootOnlyCodes returns [EObject current=null] : iv_ruleOntologicalRootOnlyCodes= ruleOntologicalRootOnlyCodes EOF ;
    public final EObject entryRuleOntologicalRootOnlyCodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootOnlyCodes = null;


        try {
            // InternalOntologicalParser.g:587:65: (iv_ruleOntologicalRootOnlyCodes= ruleOntologicalRootOnlyCodes EOF )
            // InternalOntologicalParser.g:588:2: iv_ruleOntologicalRootOnlyCodes= ruleOntologicalRootOnlyCodes EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootOnlyCodesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootOnlyCodes=ruleOntologicalRootOnlyCodes();

            state._fsp--;

             current =iv_ruleOntologicalRootOnlyCodes; 
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
    // $ANTLR end "entryRuleOntologicalRootOnlyCodes"


    // $ANTLR start "ruleOntologicalRootOnlyCodes"
    // InternalOntologicalParser.g:594:1: ruleOntologicalRootOnlyCodes returns [EObject current=null] : (otherlv_0= OnlyCodes otherlv_1= Colon ( (lv_onlyCodes_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootOnlyCodes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_onlyCodes_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:600:2: ( (otherlv_0= OnlyCodes otherlv_1= Colon ( (lv_onlyCodes_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:601:2: (otherlv_0= OnlyCodes otherlv_1= Colon ( (lv_onlyCodes_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:601:2: (otherlv_0= OnlyCodes otherlv_1= Colon ( (lv_onlyCodes_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:602:3: otherlv_0= OnlyCodes otherlv_1= Colon ( (lv_onlyCodes_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,OnlyCodes,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootOnlyCodesAccess().getOnlyCodesKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootOnlyCodesAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:610:3: ( (lv_onlyCodes_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:611:4: (lv_onlyCodes_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:611:4: (lv_onlyCodes_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:612:5: lv_onlyCodes_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootOnlyCodesAccess().getOnlyCodesEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_onlyCodes_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootOnlyCodesRule());
            					}
            					set(
            						current,
            						"onlyCodes",
            						lv_onlyCodes_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootOnlyCodes"


    // $ANTLR start "entryRuleOntologicalRootBluetooth"
    // InternalOntologicalParser.g:633:1: entryRuleOntologicalRootBluetooth returns [EObject current=null] : iv_ruleOntologicalRootBluetooth= ruleOntologicalRootBluetooth EOF ;
    public final EObject entryRuleOntologicalRootBluetooth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootBluetooth = null;


        try {
            // InternalOntologicalParser.g:633:65: (iv_ruleOntologicalRootBluetooth= ruleOntologicalRootBluetooth EOF )
            // InternalOntologicalParser.g:634:2: iv_ruleOntologicalRootBluetooth= ruleOntologicalRootBluetooth EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootBluetoothRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootBluetooth=ruleOntologicalRootBluetooth();

            state._fsp--;

             current =iv_ruleOntologicalRootBluetooth; 
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
    // $ANTLR end "entryRuleOntologicalRootBluetooth"


    // $ANTLR start "ruleOntologicalRootBluetooth"
    // InternalOntologicalParser.g:640:1: ruleOntologicalRootBluetooth returns [EObject current=null] : (otherlv_0= Bluetooth otherlv_1= Colon ( (lv_bluetooth_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootBluetooth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_bluetooth_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:646:2: ( (otherlv_0= Bluetooth otherlv_1= Colon ( (lv_bluetooth_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:647:2: (otherlv_0= Bluetooth otherlv_1= Colon ( (lv_bluetooth_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:647:2: (otherlv_0= Bluetooth otherlv_1= Colon ( (lv_bluetooth_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:648:3: otherlv_0= Bluetooth otherlv_1= Colon ( (lv_bluetooth_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Bluetooth,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootBluetoothAccess().getBluetoothKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootBluetoothAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:656:3: ( (lv_bluetooth_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:657:4: (lv_bluetooth_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:657:4: (lv_bluetooth_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:658:5: lv_bluetooth_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootBluetoothAccess().getBluetoothEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_bluetooth_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootBluetoothRule());
            					}
            					set(
            						current,
            						"bluetooth",
            						lv_bluetooth_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootBluetooth"


    // $ANTLR start "entryRuleOntologicalRootExternal"
    // InternalOntologicalParser.g:679:1: entryRuleOntologicalRootExternal returns [EObject current=null] : iv_ruleOntologicalRootExternal= ruleOntologicalRootExternal EOF ;
    public final EObject entryRuleOntologicalRootExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootExternal = null;


        try {
            // InternalOntologicalParser.g:679:64: (iv_ruleOntologicalRootExternal= ruleOntologicalRootExternal EOF )
            // InternalOntologicalParser.g:680:2: iv_ruleOntologicalRootExternal= ruleOntologicalRootExternal EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootExternal=ruleOntologicalRootExternal();

            state._fsp--;

             current =iv_ruleOntologicalRootExternal; 
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
    // $ANTLR end "entryRuleOntologicalRootExternal"


    // $ANTLR start "ruleOntologicalRootExternal"
    // InternalOntologicalParser.g:686:1: ruleOntologicalRootExternal returns [EObject current=null] : (otherlv_0= External otherlv_1= Colon ( (lv_external_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_external_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:692:2: ( (otherlv_0= External otherlv_1= Colon ( (lv_external_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:693:2: (otherlv_0= External otherlv_1= Colon ( (lv_external_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:693:2: (otherlv_0= External otherlv_1= Colon ( (lv_external_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:694:3: otherlv_0= External otherlv_1= Colon ( (lv_external_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,External,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootExternalAccess().getExternalKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootExternalAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:702:3: ( (lv_external_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:703:4: (lv_external_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:703:4: (lv_external_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:704:5: lv_external_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootExternalAccess().getExternalEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_external_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootExternalRule());
            					}
            					set(
            						current,
            						"external",
            						lv_external_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootExternal"


    // $ANTLR start "entryRuleOntologicalRootFirebase"
    // InternalOntologicalParser.g:725:1: entryRuleOntologicalRootFirebase returns [EObject current=null] : iv_ruleOntologicalRootFirebase= ruleOntologicalRootFirebase EOF ;
    public final EObject entryRuleOntologicalRootFirebase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootFirebase = null;


        try {
            // InternalOntologicalParser.g:725:64: (iv_ruleOntologicalRootFirebase= ruleOntologicalRootFirebase EOF )
            // InternalOntologicalParser.g:726:2: iv_ruleOntologicalRootFirebase= ruleOntologicalRootFirebase EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootFirebaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootFirebase=ruleOntologicalRootFirebase();

            state._fsp--;

             current =iv_ruleOntologicalRootFirebase; 
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
    // $ANTLR end "entryRuleOntologicalRootFirebase"


    // $ANTLR start "ruleOntologicalRootFirebase"
    // InternalOntologicalParser.g:732:1: ruleOntologicalRootFirebase returns [EObject current=null] : (otherlv_0= Firebase otherlv_1= Colon ( (lv_firebase_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootFirebase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_firebase_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:738:2: ( (otherlv_0= Firebase otherlv_1= Colon ( (lv_firebase_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:739:2: (otherlv_0= Firebase otherlv_1= Colon ( (lv_firebase_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:739:2: (otherlv_0= Firebase otherlv_1= Colon ( (lv_firebase_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:740:3: otherlv_0= Firebase otherlv_1= Colon ( (lv_firebase_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Firebase,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootFirebaseAccess().getFirebaseKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootFirebaseAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:748:3: ( (lv_firebase_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:749:4: (lv_firebase_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:749:4: (lv_firebase_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:750:5: lv_firebase_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootFirebaseAccess().getFirebaseEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_firebase_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootFirebaseRule());
            					}
            					set(
            						current,
            						"firebase",
            						lv_firebase_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootFirebase"


    // $ANTLR start "entryRuleOntologicalRootPhysics"
    // InternalOntologicalParser.g:771:1: entryRuleOntologicalRootPhysics returns [EObject current=null] : iv_ruleOntologicalRootPhysics= ruleOntologicalRootPhysics EOF ;
    public final EObject entryRuleOntologicalRootPhysics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootPhysics = null;


        try {
            // InternalOntologicalParser.g:771:63: (iv_ruleOntologicalRootPhysics= ruleOntologicalRootPhysics EOF )
            // InternalOntologicalParser.g:772:2: iv_ruleOntologicalRootPhysics= ruleOntologicalRootPhysics EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootPhysicsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootPhysics=ruleOntologicalRootPhysics();

            state._fsp--;

             current =iv_ruleOntologicalRootPhysics; 
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
    // $ANTLR end "entryRuleOntologicalRootPhysics"


    // $ANTLR start "ruleOntologicalRootPhysics"
    // InternalOntologicalParser.g:778:1: ruleOntologicalRootPhysics returns [EObject current=null] : (otherlv_0= Physics otherlv_1= Colon ( (lv_physics_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootPhysics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_physics_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:784:2: ( (otherlv_0= Physics otherlv_1= Colon ( (lv_physics_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:785:2: (otherlv_0= Physics otherlv_1= Colon ( (lv_physics_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:785:2: (otherlv_0= Physics otherlv_1= Colon ( (lv_physics_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:786:3: otherlv_0= Physics otherlv_1= Colon ( (lv_physics_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Physics,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootPhysicsAccess().getPhysicsKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootPhysicsAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:794:3: ( (lv_physics_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:795:4: (lv_physics_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:795:4: (lv_physics_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:796:5: lv_physics_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootPhysicsAccess().getPhysicsEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_physics_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootPhysicsRule());
            					}
            					set(
            						current,
            						"physics",
            						lv_physics_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootPhysics"


    // $ANTLR start "entryRuleOntologicalRootGameloop"
    // InternalOntologicalParser.g:817:1: entryRuleOntologicalRootGameloop returns [EObject current=null] : iv_ruleOntologicalRootGameloop= ruleOntologicalRootGameloop EOF ;
    public final EObject entryRuleOntologicalRootGameloop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootGameloop = null;


        try {
            // InternalOntologicalParser.g:817:64: (iv_ruleOntologicalRootGameloop= ruleOntologicalRootGameloop EOF )
            // InternalOntologicalParser.g:818:2: iv_ruleOntologicalRootGameloop= ruleOntologicalRootGameloop EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootGameloopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootGameloop=ruleOntologicalRootGameloop();

            state._fsp--;

             current =iv_ruleOntologicalRootGameloop; 
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
    // $ANTLR end "entryRuleOntologicalRootGameloop"


    // $ANTLR start "ruleOntologicalRootGameloop"
    // InternalOntologicalParser.g:824:1: ruleOntologicalRootGameloop returns [EObject current=null] : (otherlv_0= Gameloop otherlv_1= Colon ( (lv_gameloop_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootGameloop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_gameloop_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:830:2: ( (otherlv_0= Gameloop otherlv_1= Colon ( (lv_gameloop_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:831:2: (otherlv_0= Gameloop otherlv_1= Colon ( (lv_gameloop_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:831:2: (otherlv_0= Gameloop otherlv_1= Colon ( (lv_gameloop_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:832:3: otherlv_0= Gameloop otherlv_1= Colon ( (lv_gameloop_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Gameloop,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootGameloopAccess().getGameloopKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootGameloopAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:840:3: ( (lv_gameloop_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:841:4: (lv_gameloop_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:841:4: (lv_gameloop_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:842:5: lv_gameloop_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootGameloopAccess().getGameloopEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_gameloop_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootGameloopRule());
            					}
            					set(
            						current,
            						"gameloop",
            						lv_gameloop_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootGameloop"


    // $ANTLR start "entryRuleOntologicalRootClasses"
    // InternalOntologicalParser.g:863:1: entryRuleOntologicalRootClasses returns [EObject current=null] : iv_ruleOntologicalRootClasses= ruleOntologicalRootClasses EOF ;
    public final EObject entryRuleOntologicalRootClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClasses = null;


        try {
            // InternalOntologicalParser.g:863:63: (iv_ruleOntologicalRootClasses= ruleOntologicalRootClasses EOF )
            // InternalOntologicalParser.g:864:2: iv_ruleOntologicalRootClasses= ruleOntologicalRootClasses EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClasses=ruleOntologicalRootClasses();

            state._fsp--;

             current =iv_ruleOntologicalRootClasses; 
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
    // $ANTLR end "entryRuleOntologicalRootClasses"


    // $ANTLR start "ruleOntologicalRootClasses"
    // InternalOntologicalParser.g:870:1: ruleOntologicalRootClasses returns [EObject current=null] : ( () otherlv_1= Classes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_classes_4_0= ruleOntologicalRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleOntologicalRootClassesItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleOntologicalRootClasses() throws RecognitionException {
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
            // InternalOntologicalParser.g:876:2: ( ( () otherlv_1= Classes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_classes_4_0= ruleOntologicalRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleOntologicalRootClassesItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalOntologicalParser.g:877:2: ( () otherlv_1= Classes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_classes_4_0= ruleOntologicalRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleOntologicalRootClassesItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalOntologicalParser.g:877:2: ( () otherlv_1= Classes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_classes_4_0= ruleOntologicalRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleOntologicalRootClassesItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalOntologicalParser.g:878:3: () otherlv_1= Classes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_classes_4_0= ruleOntologicalRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleOntologicalRootClassesItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalOntologicalParser.g:878:3: ()
            // InternalOntologicalParser.g:879:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootClassesAccess().getOntologicalRootClassesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Classes,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesAccess().getClassesKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologicalRootClassesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getOntologicalRootClassesAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalOntologicalParser.g:897:3: ( ( (lv_classes_4_0= ruleOntologicalRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleOntologicalRootClassesItems ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LeftCurlyBracket) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntologicalParser.g:898:4: ( (lv_classes_4_0= ruleOntologicalRootClassesItems ) ) (otherlv_5= Comma ( (lv_classes_6_0= ruleOntologicalRootClassesItems ) ) )*
                    {
                    // InternalOntologicalParser.g:898:4: ( (lv_classes_4_0= ruleOntologicalRootClassesItems ) )
                    // InternalOntologicalParser.g:899:5: (lv_classes_4_0= ruleOntologicalRootClassesItems )
                    {
                    // InternalOntologicalParser.g:899:5: (lv_classes_4_0= ruleOntologicalRootClassesItems )
                    // InternalOntologicalParser.g:900:6: lv_classes_4_0= ruleOntologicalRootClassesItems
                    {

                    						newCompositeNode(grammarAccess.getOntologicalRootClassesAccess().getClassesOntologicalRootClassesItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_classes_4_0=ruleOntologicalRootClassesItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologicalRootClassesRule());
                    						}
                    						add(
                    							current,
                    							"classes",
                    							lv_classes_4_0,
                    							"ontological.ontological.Ontological.OntologicalRootClassesItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntologicalParser.g:917:4: (otherlv_5= Comma ( (lv_classes_6_0= ruleOntologicalRootClassesItems ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Comma) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalOntologicalParser.g:918:5: otherlv_5= Comma ( (lv_classes_6_0= ruleOntologicalRootClassesItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOntologicalRootClassesAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalOntologicalParser.g:922:5: ( (lv_classes_6_0= ruleOntologicalRootClassesItems ) )
                    	    // InternalOntologicalParser.g:923:6: (lv_classes_6_0= ruleOntologicalRootClassesItems )
                    	    {
                    	    // InternalOntologicalParser.g:923:6: (lv_classes_6_0= ruleOntologicalRootClassesItems )
                    	    // InternalOntologicalParser.g:924:7: lv_classes_6_0= ruleOntologicalRootClassesItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntologicalRootClassesAccess().getClassesOntologicalRootClassesItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_classes_6_0=ruleOntologicalRootClassesItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntologicalRootClassesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"classes",
                    	    								lv_classes_6_0,
                    	    								"ontological.ontological.Ontological.OntologicalRootClassesItems");
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

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOntologicalRootClassesAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleOntologicalRootClasses"


    // $ANTLR start "entryRuleEString"
    // InternalOntologicalParser.g:951:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOntologicalParser.g:951:47: (iv_ruleEString= ruleEString EOF )
            // InternalOntologicalParser.g:952:2: iv_ruleEString= ruleEString EOF
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
    // InternalOntologicalParser.g:958:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:964:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalOntologicalParser.g:965:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalOntologicalParser.g:978:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalOntologicalParser.g:978:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalOntologicalParser.g:979:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalOntologicalParser.g:985:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOntologicalParser.g:991:2: ( (kw= True | kw= False ) )
            // InternalOntologicalParser.g:992:2: (kw= True | kw= False )
            {
            // InternalOntologicalParser.g:992:2: (kw= True | kw= False )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==True) ) {
                alt9=1;
            }
            else if ( (LA9_0==False) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntologicalParser.g:993:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:999:3: kw= False
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


    // $ANTLR start "entryRuleOntologicalRootClassesItems"
    // InternalOntologicalParser.g:1008:1: entryRuleOntologicalRootClassesItems returns [EObject current=null] : iv_ruleOntologicalRootClassesItems= ruleOntologicalRootClassesItems EOF ;
    public final EObject entryRuleOntologicalRootClassesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItems = null;


        try {
            // InternalOntologicalParser.g:1008:68: (iv_ruleOntologicalRootClassesItems= ruleOntologicalRootClassesItems EOF )
            // InternalOntologicalParser.g:1009:2: iv_ruleOntologicalRootClassesItems= ruleOntologicalRootClassesItems EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItems=ruleOntologicalRootClassesItems();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItems; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItems"


    // $ANTLR start "ruleOntologicalRootClassesItems"
    // InternalOntologicalParser.g:1015:1: ruleOntologicalRootClassesItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleOntologicalRootClassesItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1021:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalOntologicalParser.g:1022:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalOntologicalParser.g:1022:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalOntologicalParser.g:1023:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalOntologicalParser.g:1023:3: ()
            // InternalOntologicalParser.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootClassesItemsAccess().getOntologicalRootClassesItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalOntologicalParser.g:1034:3: ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Attributes && LA11_0<=Abstract)||LA11_0==AutoID||(LA11_0>=NoSCN && LA11_0<=Name)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntologicalParser.g:1035:4: ( (lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) )*
                    {
                    // InternalOntologicalParser.g:1035:4: ( (lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) )
                    // InternalOntologicalParser.g:1036:5: (lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract )
                    {
                    // InternalOntologicalParser.g:1036:5: (lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract )
                    // InternalOntologicalParser.g:1037:6: lv_items_2_0= ruleOntologicalRootClassesItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsOntologicalRootClassesItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleOntologicalRootClassesItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"ontological.ontological.Ontological.OntologicalRootClassesItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntologicalParser.g:1054:4: (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalOntologicalParser.g:1055:5: otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_14); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOntologicalRootClassesItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalOntologicalParser.g:1059:5: ( (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract ) )
                    	    // InternalOntologicalParser.g:1060:6: (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract )
                    	    {
                    	    // InternalOntologicalParser.g:1060:6: (lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract )
                    	    // InternalOntologicalParser.g:1061:7: lv_items_4_0= ruleOntologicalRootClassesItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsOntologicalRootClassesItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleOntologicalRootClassesItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"ontological.ontological.Ontological.OntologicalRootClassesItemsPropertiesAbstract");
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

            			newLeafNode(otherlv_5, grammarAccess.getOntologicalRootClassesItemsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOntologicalRootClassesItems"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsName"
    // InternalOntologicalParser.g:1088:1: entryRuleOntologicalRootClassesItemsName returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsName= ruleOntologicalRootClassesItemsName EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsName = null;


        try {
            // InternalOntologicalParser.g:1088:72: (iv_ruleOntologicalRootClassesItemsName= ruleOntologicalRootClassesItemsName EOF )
            // InternalOntologicalParser.g:1089:2: iv_ruleOntologicalRootClassesItemsName= ruleOntologicalRootClassesItemsName EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsName=ruleOntologicalRootClassesItemsName();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsName; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsName"


    // $ANTLR start "ruleOntologicalRootClassesItemsName"
    // InternalOntologicalParser.g:1095:1: ruleOntologicalRootClassesItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1101:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:1102:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:1102:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalOntologicalParser.g:1103:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalOntologicalParser.g:1103:3: ()
            // InternalOntologicalParser.g:1104:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootClassesItemsNameAccess().getOntologicalRootClassesItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologicalRootClassesItemsNameAccess().getColonKeyword_2());
            		
            // InternalOntologicalParser.g:1118:3: ( (lv_name_3_0= ruleEString ) )
            // InternalOntologicalParser.g:1119:4: (lv_name_3_0= ruleEString )
            {
            // InternalOntologicalParser.g:1119:4: (lv_name_3_0= ruleEString )
            // InternalOntologicalParser.g:1120:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsName"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAbstract"
    // InternalOntologicalParser.g:1141:1: entryRuleOntologicalRootClassesItemsAbstract returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAbstract= ruleOntologicalRootClassesItemsAbstract EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAbstract = null;


        try {
            // InternalOntologicalParser.g:1141:76: (iv_ruleOntologicalRootClassesItemsAbstract= ruleOntologicalRootClassesItemsAbstract EOF )
            // InternalOntologicalParser.g:1142:2: iv_ruleOntologicalRootClassesItemsAbstract= ruleOntologicalRootClassesItemsAbstract EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAbstract=ruleOntologicalRootClassesItemsAbstract();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAbstract; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAbstract"


    // $ANTLR start "ruleOntologicalRootClassesItemsAbstract"
    // InternalOntologicalParser.g:1148:1: ruleOntologicalRootClassesItemsAbstract returns [EObject current=null] : (otherlv_0= Abstract otherlv_1= Colon ( (lv_abstract_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsAbstract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_abstract_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1154:2: ( (otherlv_0= Abstract otherlv_1= Colon ( (lv_abstract_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:1155:2: (otherlv_0= Abstract otherlv_1= Colon ( (lv_abstract_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:1155:2: (otherlv_0= Abstract otherlv_1= Colon ( (lv_abstract_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:1156:3: otherlv_0= Abstract otherlv_1= Colon ( (lv_abstract_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Abstract,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1164:3: ( (lv_abstract_2_0= ruleEString ) )
            // InternalOntologicalParser.g:1165:4: (lv_abstract_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:1165:4: (lv_abstract_2_0= ruleEString )
            // InternalOntologicalParser.g:1166:5: lv_abstract_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getAbstractEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_abstract_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAbstractRule());
            					}
            					set(
            						current,
            						"abstract",
            						lv_abstract_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAbstract"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributes"
    // InternalOntologicalParser.g:1187:1: entryRuleOntologicalRootClassesItemsAttributes returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributes= ruleOntologicalRootClassesItemsAttributes EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributes = null;


        try {
            // InternalOntologicalParser.g:1187:78: (iv_ruleOntologicalRootClassesItemsAttributes= ruleOntologicalRootClassesItemsAttributes EOF )
            // InternalOntologicalParser.g:1188:2: iv_ruleOntologicalRootClassesItemsAttributes= ruleOntologicalRootClassesItemsAttributes EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributes=ruleOntologicalRootClassesItemsAttributes();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributes; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributes"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributes"
    // InternalOntologicalParser.g:1194:1: ruleOntologicalRootClassesItemsAttributes returns [EObject current=null] : ( () otherlv_1= Attributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems ) ) (otherlv_5= Comma ( (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1200:2: ( ( () otherlv_1= Attributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems ) ) (otherlv_5= Comma ( (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalOntologicalParser.g:1201:2: ( () otherlv_1= Attributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems ) ) (otherlv_5= Comma ( (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalOntologicalParser.g:1201:2: ( () otherlv_1= Attributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems ) ) (otherlv_5= Comma ( (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalOntologicalParser.g:1202:3: () otherlv_1= Attributes otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems ) ) (otherlv_5= Comma ( (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalOntologicalParser.g:1202:3: ()
            // InternalOntologicalParser.g:1203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getOntologicalRootClassesItemsAttributesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Attributes,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalOntologicalParser.g:1221:3: ( ( (lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems ) ) (otherlv_5= Comma ( (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftCurlyBracket) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntologicalParser.g:1222:4: ( (lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems ) ) (otherlv_5= Comma ( (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems ) ) )*
                    {
                    // InternalOntologicalParser.g:1222:4: ( (lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems ) )
                    // InternalOntologicalParser.g:1223:5: (lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems )
                    {
                    // InternalOntologicalParser.g:1223:5: (lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems )
                    // InternalOntologicalParser.g:1224:6: lv_attributes_4_0= ruleOntologicalRootClassesItemsAttributesItems
                    {

                    						newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesOntologicalRootClassesItemsAttributesItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_attributes_4_0=ruleOntologicalRootClassesItemsAttributesItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_4_0,
                    							"ontological.ontological.Ontological.OntologicalRootClassesItemsAttributesItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntologicalParser.g:1241:4: (otherlv_5= Comma ( (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalOntologicalParser.g:1242:5: otherlv_5= Comma ( (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalOntologicalParser.g:1246:5: ( (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems ) )
                    	    // InternalOntologicalParser.g:1247:6: (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems )
                    	    {
                    	    // InternalOntologicalParser.g:1247:6: (lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems )
                    	    // InternalOntologicalParser.g:1248:7: lv_attributes_6_0= ruleOntologicalRootClassesItemsAttributesItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesOntologicalRootClassesItemsAttributesItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_attributes_6_0=ruleOntologicalRootClassesItemsAttributesItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_6_0,
                    	    								"ontological.ontological.Ontological.OntologicalRootClassesItemsAttributesItems");
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

            			newLeafNode(otherlv_7, grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributes"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferences"
    // InternalOntologicalParser.g:1275:1: entryRuleOntologicalRootClassesItemsReferences returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsReferences= ruleOntologicalRootClassesItemsReferences EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsReferences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsReferences = null;


        try {
            // InternalOntologicalParser.g:1275:78: (iv_ruleOntologicalRootClassesItemsReferences= ruleOntologicalRootClassesItemsReferences EOF )
            // InternalOntologicalParser.g:1276:2: iv_ruleOntologicalRootClassesItemsReferences= ruleOntologicalRootClassesItemsReferences EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsReferences=ruleOntologicalRootClassesItemsReferences();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsReferences; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferences"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferences"
    // InternalOntologicalParser.g:1282:1: ruleOntologicalRootClassesItemsReferences returns [EObject current=null] : ( () otherlv_1= References otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems ) ) (otherlv_5= Comma ( (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleOntologicalRootClassesItemsReferences() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_references_4_0 = null;

        EObject lv_references_6_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1288:2: ( ( () otherlv_1= References otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems ) ) (otherlv_5= Comma ( (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalOntologicalParser.g:1289:2: ( () otherlv_1= References otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems ) ) (otherlv_5= Comma ( (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalOntologicalParser.g:1289:2: ( () otherlv_1= References otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems ) ) (otherlv_5= Comma ( (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalOntologicalParser.g:1290:3: () otherlv_1= References otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems ) ) (otherlv_5= Comma ( (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalOntologicalParser.g:1290:3: ()
            // InternalOntologicalParser.g:1291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getOntologicalRootClassesItemsReferencesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,References,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalOntologicalParser.g:1309:3: ( ( (lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems ) ) (otherlv_5= Comma ( (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftCurlyBracket) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntologicalParser.g:1310:4: ( (lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems ) ) (otherlv_5= Comma ( (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems ) ) )*
                    {
                    // InternalOntologicalParser.g:1310:4: ( (lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems ) )
                    // InternalOntologicalParser.g:1311:5: (lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems )
                    {
                    // InternalOntologicalParser.g:1311:5: (lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems )
                    // InternalOntologicalParser.g:1312:6: lv_references_4_0= ruleOntologicalRootClassesItemsReferencesItems
                    {

                    						newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesOntologicalRootClassesItemsReferencesItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_references_4_0=ruleOntologicalRootClassesItemsReferencesItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsReferencesRule());
                    						}
                    						add(
                    							current,
                    							"references",
                    							lv_references_4_0,
                    							"ontological.ontological.Ontological.OntologicalRootClassesItemsReferencesItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntologicalParser.g:1329:4: (otherlv_5= Comma ( (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalOntologicalParser.g:1330:5: otherlv_5= Comma ( (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalOntologicalParser.g:1334:5: ( (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems ) )
                    	    // InternalOntologicalParser.g:1335:6: (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems )
                    	    {
                    	    // InternalOntologicalParser.g:1335:6: (lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems )
                    	    // InternalOntologicalParser.g:1336:7: lv_references_6_0= ruleOntologicalRootClassesItemsReferencesItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesOntologicalRootClassesItemsReferencesItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_references_6_0=ruleOntologicalRootClassesItemsReferencesItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsReferencesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"references",
                    	    								lv_references_6_0,
                    	    								"ontological.ontological.Ontological.OntologicalRootClassesItemsReferencesItems");
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

            			newLeafNode(otherlv_7, grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleOntologicalRootClassesItemsReferences"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAutoID"
    // InternalOntologicalParser.g:1363:1: entryRuleOntologicalRootClassesItemsAutoID returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAutoID= ruleOntologicalRootClassesItemsAutoID EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAutoID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAutoID = null;


        try {
            // InternalOntologicalParser.g:1363:74: (iv_ruleOntologicalRootClassesItemsAutoID= ruleOntologicalRootClassesItemsAutoID EOF )
            // InternalOntologicalParser.g:1364:2: iv_ruleOntologicalRootClassesItemsAutoID= ruleOntologicalRootClassesItemsAutoID EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAutoIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAutoID=ruleOntologicalRootClassesItemsAutoID();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAutoID; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAutoID"


    // $ANTLR start "ruleOntologicalRootClassesItemsAutoID"
    // InternalOntologicalParser.g:1370:1: ruleOntologicalRootClassesItemsAutoID returns [EObject current=null] : (otherlv_0= AutoID otherlv_1= Colon ( (lv_autoID_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsAutoID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_autoID_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1376:2: ( (otherlv_0= AutoID otherlv_1= Colon ( (lv_autoID_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:1377:2: (otherlv_0= AutoID otherlv_1= Colon ( (lv_autoID_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:1377:2: (otherlv_0= AutoID otherlv_1= Colon ( (lv_autoID_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:1378:3: otherlv_0= AutoID otherlv_1= Colon ( (lv_autoID_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,AutoID,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getAutoIDKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1386:3: ( (lv_autoID_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:1387:4: (lv_autoID_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:1387:4: (lv_autoID_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:1388:5: lv_autoID_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getAutoIDEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_autoID_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAutoIDRule());
            					}
            					set(
            						current,
            						"autoID",
            						lv_autoID_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAutoID"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsOnlyCodes"
    // InternalOntologicalParser.g:1409:1: entryRuleOntologicalRootClassesItemsOnlyCodes returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsOnlyCodes= ruleOntologicalRootClassesItemsOnlyCodes EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsOnlyCodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsOnlyCodes = null;


        try {
            // InternalOntologicalParser.g:1409:77: (iv_ruleOntologicalRootClassesItemsOnlyCodes= ruleOntologicalRootClassesItemsOnlyCodes EOF )
            // InternalOntologicalParser.g:1410:2: iv_ruleOntologicalRootClassesItemsOnlyCodes= ruleOntologicalRootClassesItemsOnlyCodes EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsOnlyCodesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsOnlyCodes=ruleOntologicalRootClassesItemsOnlyCodes();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsOnlyCodes; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsOnlyCodes"


    // $ANTLR start "ruleOntologicalRootClassesItemsOnlyCodes"
    // InternalOntologicalParser.g:1416:1: ruleOntologicalRootClassesItemsOnlyCodes returns [EObject current=null] : (otherlv_0= OnlyCodes otherlv_1= Colon ( (lv_onlyCodes_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsOnlyCodes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_onlyCodes_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1422:2: ( (otherlv_0= OnlyCodes otherlv_1= Colon ( (lv_onlyCodes_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:1423:2: (otherlv_0= OnlyCodes otherlv_1= Colon ( (lv_onlyCodes_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:1423:2: (otherlv_0= OnlyCodes otherlv_1= Colon ( (lv_onlyCodes_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:1424:3: otherlv_0= OnlyCodes otherlv_1= Colon ( (lv_onlyCodes_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,OnlyCodes,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getOnlyCodesKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1432:3: ( (lv_onlyCodes_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:1433:4: (lv_onlyCodes_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:1433:4: (lv_onlyCodes_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:1434:5: lv_onlyCodes_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getOnlyCodesEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_onlyCodes_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsOnlyCodesRule());
            					}
            					set(
            						current,
            						"onlyCodes",
            						lv_onlyCodes_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsOnlyCodes"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsBluetooth"
    // InternalOntologicalParser.g:1455:1: entryRuleOntologicalRootClassesItemsBluetooth returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsBluetooth= ruleOntologicalRootClassesItemsBluetooth EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsBluetooth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsBluetooth = null;


        try {
            // InternalOntologicalParser.g:1455:77: (iv_ruleOntologicalRootClassesItemsBluetooth= ruleOntologicalRootClassesItemsBluetooth EOF )
            // InternalOntologicalParser.g:1456:2: iv_ruleOntologicalRootClassesItemsBluetooth= ruleOntologicalRootClassesItemsBluetooth EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsBluetoothRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsBluetooth=ruleOntologicalRootClassesItemsBluetooth();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsBluetooth; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsBluetooth"


    // $ANTLR start "ruleOntologicalRootClassesItemsBluetooth"
    // InternalOntologicalParser.g:1462:1: ruleOntologicalRootClassesItemsBluetooth returns [EObject current=null] : (otherlv_0= Bluetooth otherlv_1= Colon ( (lv_bluetooth_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsBluetooth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_bluetooth_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1468:2: ( (otherlv_0= Bluetooth otherlv_1= Colon ( (lv_bluetooth_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:1469:2: (otherlv_0= Bluetooth otherlv_1= Colon ( (lv_bluetooth_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:1469:2: (otherlv_0= Bluetooth otherlv_1= Colon ( (lv_bluetooth_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:1470:3: otherlv_0= Bluetooth otherlv_1= Colon ( (lv_bluetooth_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Bluetooth,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getBluetoothKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1478:3: ( (lv_bluetooth_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:1479:4: (lv_bluetooth_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:1479:4: (lv_bluetooth_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:1480:5: lv_bluetooth_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getBluetoothEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_bluetooth_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsBluetoothRule());
            					}
            					set(
            						current,
            						"bluetooth",
            						lv_bluetooth_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsBluetooth"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsNoSCN"
    // InternalOntologicalParser.g:1501:1: entryRuleOntologicalRootClassesItemsNoSCN returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsNoSCN= ruleOntologicalRootClassesItemsNoSCN EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsNoSCN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsNoSCN = null;


        try {
            // InternalOntologicalParser.g:1501:73: (iv_ruleOntologicalRootClassesItemsNoSCN= ruleOntologicalRootClassesItemsNoSCN EOF )
            // InternalOntologicalParser.g:1502:2: iv_ruleOntologicalRootClassesItemsNoSCN= ruleOntologicalRootClassesItemsNoSCN EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsNoSCNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsNoSCN=ruleOntologicalRootClassesItemsNoSCN();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsNoSCN; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsNoSCN"


    // $ANTLR start "ruleOntologicalRootClassesItemsNoSCN"
    // InternalOntologicalParser.g:1508:1: ruleOntologicalRootClassesItemsNoSCN returns [EObject current=null] : (otherlv_0= NoSCN otherlv_1= Colon ( (lv_noSCN_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsNoSCN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_noSCN_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1514:2: ( (otherlv_0= NoSCN otherlv_1= Colon ( (lv_noSCN_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:1515:2: (otherlv_0= NoSCN otherlv_1= Colon ( (lv_noSCN_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:1515:2: (otherlv_0= NoSCN otherlv_1= Colon ( (lv_noSCN_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:1516:3: otherlv_0= NoSCN otherlv_1= Colon ( (lv_noSCN_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,NoSCN,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getNoSCNKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1524:3: ( (lv_noSCN_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:1525:4: (lv_noSCN_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:1525:4: (lv_noSCN_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:1526:5: lv_noSCN_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getNoSCNEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_noSCN_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsNoSCNRule());
            					}
            					set(
            						current,
            						"noSCN",
            						lv_noSCN_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsNoSCN"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItems"
    // InternalOntologicalParser.g:1547:1: entryRuleOntologicalRootClassesItemsAttributesItems returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributesItems= ruleOntologicalRootClassesItemsAttributesItems EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributesItems = null;


        try {
            // InternalOntologicalParser.g:1547:83: (iv_ruleOntologicalRootClassesItemsAttributesItems= ruleOntologicalRootClassesItemsAttributesItems EOF )
            // InternalOntologicalParser.g:1548:2: iv_ruleOntologicalRootClassesItemsAttributesItems= ruleOntologicalRootClassesItemsAttributesItems EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributesItems=ruleOntologicalRootClassesItemsAttributesItems();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributesItems; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItems"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItems"
    // InternalOntologicalParser.g:1554:1: ruleOntologicalRootClassesItemsAttributesItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributesItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1560:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalOntologicalParser.g:1561:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalOntologicalParser.g:1561:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalOntologicalParser.g:1562:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalOntologicalParser.g:1562:3: ()
            // InternalOntologicalParser.g:1563:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getOntologicalRootClassesItemsAttributesItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalOntologicalParser.g:1573:3: ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ReadOnly||(LA17_0>=Default && LA17_0<=IsParam)||LA17_0==IsKey||(LA17_0>=Name && LA17_0<=Type)||(LA17_0>=Max && LA17_0<=Min)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOntologicalParser.g:1574:4: ( (lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) )*
                    {
                    // InternalOntologicalParser.g:1574:4: ( (lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) )
                    // InternalOntologicalParser.g:1575:5: (lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract )
                    {
                    // InternalOntologicalParser.g:1575:5: (lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract )
                    // InternalOntologicalParser.g:1576:6: lv_items_2_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsOntologicalRootClassesItemsAttributesItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"ontological.ontological.Ontological.OntologicalRootClassesItemsAttributesItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntologicalParser.g:1593:4: (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalOntologicalParser.g:1594:5: otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_16); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalOntologicalParser.g:1598:5: ( (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) )
                    	    // InternalOntologicalParser.g:1599:6: (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract )
                    	    {
                    	    // InternalOntologicalParser.g:1599:6: (lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract )
                    	    // InternalOntologicalParser.g:1600:7: lv_items_4_0= ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsOntologicalRootClassesItemsAttributesItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"ontological.ontological.Ontological.OntologicalRootClassesItemsAttributesItemsPropertiesAbstract");
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

            			newLeafNode(otherlv_5, grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItems"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsName"
    // InternalOntologicalParser.g:1627:1: entryRuleOntologicalRootClassesItemsAttributesItemsName returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributesItemsName= ruleOntologicalRootClassesItemsAttributesItemsName EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributesItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributesItemsName = null;


        try {
            // InternalOntologicalParser.g:1627:87: (iv_ruleOntologicalRootClassesItemsAttributesItemsName= ruleOntologicalRootClassesItemsAttributesItemsName EOF )
            // InternalOntologicalParser.g:1628:2: iv_ruleOntologicalRootClassesItemsAttributesItemsName= ruleOntologicalRootClassesItemsAttributesItemsName EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributesItemsName=ruleOntologicalRootClassesItemsAttributesItemsName();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributesItemsName; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsName"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsName"
    // InternalOntologicalParser.g:1634:1: ruleOntologicalRootClassesItemsAttributesItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributesItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1640:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:1641:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:1641:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalOntologicalParser.g:1642:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalOntologicalParser.g:1642:3: ()
            // InternalOntologicalParser.g:1643:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getOntologicalRootClassesItemsAttributesItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getColonKeyword_2());
            		
            // InternalOntologicalParser.g:1657:3: ( (lv_name_3_0= ruleEString ) )
            // InternalOntologicalParser.g:1658:4: (lv_name_3_0= ruleEString )
            {
            // InternalOntologicalParser.g:1658:4: (lv_name_3_0= ruleEString )
            // InternalOntologicalParser.g:1659:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsName"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsType"
    // InternalOntologicalParser.g:1680:1: entryRuleOntologicalRootClassesItemsAttributesItemsType returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributesItemsType= ruleOntologicalRootClassesItemsAttributesItemsType EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributesItemsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributesItemsType = null;


        try {
            // InternalOntologicalParser.g:1680:87: (iv_ruleOntologicalRootClassesItemsAttributesItemsType= ruleOntologicalRootClassesItemsAttributesItemsType EOF )
            // InternalOntologicalParser.g:1681:2: iv_ruleOntologicalRootClassesItemsAttributesItemsType= ruleOntologicalRootClassesItemsAttributesItemsType EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributesItemsType=ruleOntologicalRootClassesItemsAttributesItemsType();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributesItemsType; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsType"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsType"
    // InternalOntologicalParser.g:1687:1: ruleOntologicalRootClassesItemsAttributesItemsType returns [EObject current=null] : (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributesItemsType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1693:2: ( (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:1694:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:1694:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:1695:3: otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1703:3: ( (lv_type_2_0= ruleEString ) )
            // InternalOntologicalParser.g:1704:4: (lv_type_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:1704:4: (lv_type_2_0= ruleEString )
            // InternalOntologicalParser.g:1705:5: lv_type_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getTypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsType"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsMin"
    // InternalOntologicalParser.g:1726:1: entryRuleOntologicalRootClassesItemsAttributesItemsMin returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributesItemsMin= ruleOntologicalRootClassesItemsAttributesItemsMin EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributesItemsMin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributesItemsMin = null;


        try {
            // InternalOntologicalParser.g:1726:86: (iv_ruleOntologicalRootClassesItemsAttributesItemsMin= ruleOntologicalRootClassesItemsAttributesItemsMin EOF )
            // InternalOntologicalParser.g:1727:2: iv_ruleOntologicalRootClassesItemsAttributesItemsMin= ruleOntologicalRootClassesItemsAttributesItemsMin EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributesItemsMin=ruleOntologicalRootClassesItemsAttributesItemsMin();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributesItemsMin; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsMin"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsMin"
    // InternalOntologicalParser.g:1733:1: ruleOntologicalRootClassesItemsAttributesItemsMin returns [EObject current=null] : (otherlv_0= Min otherlv_1= Colon ( (lv_min_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributesItemsMin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_min_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1739:2: ( (otherlv_0= Min otherlv_1= Colon ( (lv_min_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:1740:2: (otherlv_0= Min otherlv_1= Colon ( (lv_min_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:1740:2: (otherlv_0= Min otherlv_1= Colon ( (lv_min_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:1741:3: otherlv_0= Min otherlv_1= Colon ( (lv_min_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Min,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getMinKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1749:3: ( (lv_min_2_0= ruleEString ) )
            // InternalOntologicalParser.g:1750:4: (lv_min_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:1750:4: (lv_min_2_0= ruleEString )
            // InternalOntologicalParser.g:1751:5: lv_min_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getMinEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_min_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinRule());
            					}
            					set(
            						current,
            						"min",
            						lv_min_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsMin"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsMax"
    // InternalOntologicalParser.g:1772:1: entryRuleOntologicalRootClassesItemsAttributesItemsMax returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributesItemsMax= ruleOntologicalRootClassesItemsAttributesItemsMax EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributesItemsMax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributesItemsMax = null;


        try {
            // InternalOntologicalParser.g:1772:86: (iv_ruleOntologicalRootClassesItemsAttributesItemsMax= ruleOntologicalRootClassesItemsAttributesItemsMax EOF )
            // InternalOntologicalParser.g:1773:2: iv_ruleOntologicalRootClassesItemsAttributesItemsMax= ruleOntologicalRootClassesItemsAttributesItemsMax EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributesItemsMax=ruleOntologicalRootClassesItemsAttributesItemsMax();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributesItemsMax; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsMax"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsMax"
    // InternalOntologicalParser.g:1779:1: ruleOntologicalRootClassesItemsAttributesItemsMax returns [EObject current=null] : (otherlv_0= Max otherlv_1= Colon ( (lv_max_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributesItemsMax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_max_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1785:2: ( (otherlv_0= Max otherlv_1= Colon ( (lv_max_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:1786:2: (otherlv_0= Max otherlv_1= Colon ( (lv_max_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:1786:2: (otherlv_0= Max otherlv_1= Colon ( (lv_max_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:1787:3: otherlv_0= Max otherlv_1= Colon ( (lv_max_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Max,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getMaxKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1795:3: ( (lv_max_2_0= ruleEString ) )
            // InternalOntologicalParser.g:1796:4: (lv_max_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:1796:4: (lv_max_2_0= ruleEString )
            // InternalOntologicalParser.g:1797:5: lv_max_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getMaxEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_max_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsMax"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsDefault"
    // InternalOntologicalParser.g:1818:1: entryRuleOntologicalRootClassesItemsAttributesItemsDefault returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributesItemsDefault= ruleOntologicalRootClassesItemsAttributesItemsDefault EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributesItemsDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributesItemsDefault = null;


        try {
            // InternalOntologicalParser.g:1818:90: (iv_ruleOntologicalRootClassesItemsAttributesItemsDefault= ruleOntologicalRootClassesItemsAttributesItemsDefault EOF )
            // InternalOntologicalParser.g:1819:2: iv_ruleOntologicalRootClassesItemsAttributesItemsDefault= ruleOntologicalRootClassesItemsAttributesItemsDefault EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributesItemsDefault=ruleOntologicalRootClassesItemsAttributesItemsDefault();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributesItemsDefault; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsDefault"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsDefault"
    // InternalOntologicalParser.g:1825:1: ruleOntologicalRootClassesItemsAttributesItemsDefault returns [EObject current=null] : (otherlv_0= Default otherlv_1= Colon ( (lv_default_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributesItemsDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_default_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1831:2: ( (otherlv_0= Default otherlv_1= Colon ( (lv_default_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:1832:2: (otherlv_0= Default otherlv_1= Colon ( (lv_default_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:1832:2: (otherlv_0= Default otherlv_1= Colon ( (lv_default_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:1833:3: otherlv_0= Default otherlv_1= Colon ( (lv_default_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Default,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getDefaultKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1841:3: ( (lv_default_2_0= ruleEString ) )
            // InternalOntologicalParser.g:1842:4: (lv_default_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:1842:4: (lv_default_2_0= ruleEString )
            // InternalOntologicalParser.g:1843:5: lv_default_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getDefaultEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_default_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultRule());
            					}
            					set(
            						current,
            						"default",
            						lv_default_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsDefault"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsReadOnly"
    // InternalOntologicalParser.g:1864:1: entryRuleOntologicalRootClassesItemsAttributesItemsReadOnly returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributesItemsReadOnly= ruleOntologicalRootClassesItemsAttributesItemsReadOnly EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributesItemsReadOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributesItemsReadOnly = null;


        try {
            // InternalOntologicalParser.g:1864:91: (iv_ruleOntologicalRootClassesItemsAttributesItemsReadOnly= ruleOntologicalRootClassesItemsAttributesItemsReadOnly EOF )
            // InternalOntologicalParser.g:1865:2: iv_ruleOntologicalRootClassesItemsAttributesItemsReadOnly= ruleOntologicalRootClassesItemsAttributesItemsReadOnly EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributesItemsReadOnly=ruleOntologicalRootClassesItemsAttributesItemsReadOnly();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributesItemsReadOnly; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsReadOnly"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsReadOnly"
    // InternalOntologicalParser.g:1871:1: ruleOntologicalRootClassesItemsAttributesItemsReadOnly returns [EObject current=null] : (otherlv_0= ReadOnly otherlv_1= Colon ( (lv_readOnly_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributesItemsReadOnly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_readOnly_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1877:2: ( (otherlv_0= ReadOnly otherlv_1= Colon ( (lv_readOnly_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:1878:2: (otherlv_0= ReadOnly otherlv_1= Colon ( (lv_readOnly_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:1878:2: (otherlv_0= ReadOnly otherlv_1= Colon ( (lv_readOnly_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:1879:3: otherlv_0= ReadOnly otherlv_1= Colon ( (lv_readOnly_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,ReadOnly,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getReadOnlyKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1887:3: ( (lv_readOnly_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:1888:4: (lv_readOnly_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:1888:4: (lv_readOnly_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:1889:5: lv_readOnly_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getReadOnlyEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_readOnly_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyRule());
            					}
            					set(
            						current,
            						"readOnly",
            						lv_readOnly_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsReadOnly"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsIsParam"
    // InternalOntologicalParser.g:1910:1: entryRuleOntologicalRootClassesItemsAttributesItemsIsParam returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributesItemsIsParam= ruleOntologicalRootClassesItemsAttributesItemsIsParam EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributesItemsIsParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributesItemsIsParam = null;


        try {
            // InternalOntologicalParser.g:1910:90: (iv_ruleOntologicalRootClassesItemsAttributesItemsIsParam= ruleOntologicalRootClassesItemsAttributesItemsIsParam EOF )
            // InternalOntologicalParser.g:1911:2: iv_ruleOntologicalRootClassesItemsAttributesItemsIsParam= ruleOntologicalRootClassesItemsAttributesItemsIsParam EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributesItemsIsParam=ruleOntologicalRootClassesItemsAttributesItemsIsParam();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributesItemsIsParam; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsIsParam"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsIsParam"
    // InternalOntologicalParser.g:1917:1: ruleOntologicalRootClassesItemsAttributesItemsIsParam returns [EObject current=null] : (otherlv_0= IsParam otherlv_1= Colon ( (lv_isParam_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributesItemsIsParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_isParam_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1923:2: ( (otherlv_0= IsParam otherlv_1= Colon ( (lv_isParam_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:1924:2: (otherlv_0= IsParam otherlv_1= Colon ( (lv_isParam_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:1924:2: (otherlv_0= IsParam otherlv_1= Colon ( (lv_isParam_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:1925:3: otherlv_0= IsParam otherlv_1= Colon ( (lv_isParam_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,IsParam,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getIsParamKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1933:3: ( (lv_isParam_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:1934:4: (lv_isParam_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:1934:4: (lv_isParam_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:1935:5: lv_isParam_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getIsParamEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_isParam_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamRule());
            					}
            					set(
            						current,
            						"isParam",
            						lv_isParam_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsIsParam"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsIsKey"
    // InternalOntologicalParser.g:1956:1: entryRuleOntologicalRootClassesItemsAttributesItemsIsKey returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsAttributesItemsIsKey= ruleOntologicalRootClassesItemsAttributesItemsIsKey EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsAttributesItemsIsKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsAttributesItemsIsKey = null;


        try {
            // InternalOntologicalParser.g:1956:88: (iv_ruleOntologicalRootClassesItemsAttributesItemsIsKey= ruleOntologicalRootClassesItemsAttributesItemsIsKey EOF )
            // InternalOntologicalParser.g:1957:2: iv_ruleOntologicalRootClassesItemsAttributesItemsIsKey= ruleOntologicalRootClassesItemsAttributesItemsIsKey EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsAttributesItemsIsKey=ruleOntologicalRootClassesItemsAttributesItemsIsKey();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsAttributesItemsIsKey; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsIsKey"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsIsKey"
    // InternalOntologicalParser.g:1963:1: ruleOntologicalRootClassesItemsAttributesItemsIsKey returns [EObject current=null] : (otherlv_0= IsKey otherlv_1= Colon ( (lv_isKey_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsAttributesItemsIsKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_isKey_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:1969:2: ( (otherlv_0= IsKey otherlv_1= Colon ( (lv_isKey_2_0= ruleEBooleanObject ) ) ) )
            // InternalOntologicalParser.g:1970:2: (otherlv_0= IsKey otherlv_1= Colon ( (lv_isKey_2_0= ruleEBooleanObject ) ) )
            {
            // InternalOntologicalParser.g:1970:2: (otherlv_0= IsKey otherlv_1= Colon ( (lv_isKey_2_0= ruleEBooleanObject ) ) )
            // InternalOntologicalParser.g:1971:3: otherlv_0= IsKey otherlv_1= Colon ( (lv_isKey_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,IsKey,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getIsKeyKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:1979:3: ( (lv_isKey_2_0= ruleEBooleanObject ) )
            // InternalOntologicalParser.g:1980:4: (lv_isKey_2_0= ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:1980:4: (lv_isKey_2_0= ruleEBooleanObject )
            // InternalOntologicalParser.g:1981:5: lv_isKey_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getIsKeyEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_isKey_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyRule());
            					}
            					set(
            						current,
            						"isKey",
            						lv_isKey_2_0,
            						"ontological.ontological.Ontological.EBooleanObject");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsIsKey"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItems"
    // InternalOntologicalParser.g:2002:1: entryRuleOntologicalRootClassesItemsReferencesItems returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsReferencesItems= ruleOntologicalRootClassesItemsReferencesItems EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsReferencesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsReferencesItems = null;


        try {
            // InternalOntologicalParser.g:2002:83: (iv_ruleOntologicalRootClassesItemsReferencesItems= ruleOntologicalRootClassesItemsReferencesItems EOF )
            // InternalOntologicalParser.g:2003:2: iv_ruleOntologicalRootClassesItemsReferencesItems= ruleOntologicalRootClassesItemsReferencesItems EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsReferencesItems=ruleOntologicalRootClassesItemsReferencesItems();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsReferencesItems; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItems"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItems"
    // InternalOntologicalParser.g:2009:1: ruleOntologicalRootClassesItemsReferencesItems returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleOntologicalRootClassesItemsReferencesItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:2015:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalOntologicalParser.g:2016:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalOntologicalParser.g:2016:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalOntologicalParser.g:2017:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalOntologicalParser.g:2017:3: ()
            // InternalOntologicalParser.g:2018:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getOntologicalRootClassesItemsReferencesItemsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalOntologicalParser.g:2028:3: ( ( (lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Containtment||LA19_0==Opposite||LA19_0==Target||LA19_0==Name||(LA19_0>=Max && LA19_0<=Min)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntologicalParser.g:2029:4: ( (lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) )*
                    {
                    // InternalOntologicalParser.g:2029:4: ( (lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) )
                    // InternalOntologicalParser.g:2030:5: (lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract )
                    {
                    // InternalOntologicalParser.g:2030:5: (lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract )
                    // InternalOntologicalParser.g:2031:6: lv_items_2_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsOntologicalRootClassesItemsReferencesItemsPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsReferencesItemsRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_2_0,
                    							"ontological.ontological.Ontological.OntologicalRootClassesItemsReferencesItemsPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntologicalParser.g:2048:4: (otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalOntologicalParser.g:2049:5: otherlv_3= Comma ( (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_18); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalOntologicalParser.g:2053:5: ( (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) )
                    	    // InternalOntologicalParser.g:2054:6: (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract )
                    	    {
                    	    // InternalOntologicalParser.g:2054:6: (lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract )
                    	    // InternalOntologicalParser.g:2055:7: lv_items_4_0= ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsOntologicalRootClassesItemsReferencesItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsReferencesItemsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"items",
                    	    								lv_items_4_0,
                    	    								"ontological.ontological.Ontological.OntologicalRootClassesItemsReferencesItemsPropertiesAbstract");
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

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItems"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsName"
    // InternalOntologicalParser.g:2082:1: entryRuleOntologicalRootClassesItemsReferencesItemsName returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsReferencesItemsName= ruleOntologicalRootClassesItemsReferencesItemsName EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsReferencesItemsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsReferencesItemsName = null;


        try {
            // InternalOntologicalParser.g:2082:87: (iv_ruleOntologicalRootClassesItemsReferencesItemsName= ruleOntologicalRootClassesItemsReferencesItemsName EOF )
            // InternalOntologicalParser.g:2083:2: iv_ruleOntologicalRootClassesItemsReferencesItemsName= ruleOntologicalRootClassesItemsReferencesItemsName EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsReferencesItemsName=ruleOntologicalRootClassesItemsReferencesItemsName();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsReferencesItemsName; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsName"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsName"
    // InternalOntologicalParser.g:2089:1: ruleOntologicalRootClassesItemsReferencesItemsName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsReferencesItemsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:2095:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:2096:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:2096:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalOntologicalParser.g:2097:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalOntologicalParser.g:2097:3: ()
            // InternalOntologicalParser.g:2098:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getOntologicalRootClassesItemsReferencesItemsNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getColonKeyword_2());
            		
            // InternalOntologicalParser.g:2112:3: ( (lv_name_3_0= ruleEString ) )
            // InternalOntologicalParser.g:2113:4: (lv_name_3_0= ruleEString )
            {
            // InternalOntologicalParser.g:2113:4: (lv_name_3_0= ruleEString )
            // InternalOntologicalParser.g:2114:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsName"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsContaintment"
    // InternalOntologicalParser.g:2135:1: entryRuleOntologicalRootClassesItemsReferencesItemsContaintment returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsReferencesItemsContaintment= ruleOntologicalRootClassesItemsReferencesItemsContaintment EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsReferencesItemsContaintment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsReferencesItemsContaintment = null;


        try {
            // InternalOntologicalParser.g:2135:95: (iv_ruleOntologicalRootClassesItemsReferencesItemsContaintment= ruleOntologicalRootClassesItemsReferencesItemsContaintment EOF )
            // InternalOntologicalParser.g:2136:2: iv_ruleOntologicalRootClassesItemsReferencesItemsContaintment= ruleOntologicalRootClassesItemsReferencesItemsContaintment EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsReferencesItemsContaintment=ruleOntologicalRootClassesItemsReferencesItemsContaintment();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsReferencesItemsContaintment; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsContaintment"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsContaintment"
    // InternalOntologicalParser.g:2142:1: ruleOntologicalRootClassesItemsReferencesItemsContaintment returns [EObject current=null] : (otherlv_0= Containtment otherlv_1= Colon ( (lv_containtment_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsReferencesItemsContaintment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_containtment_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:2148:2: ( (otherlv_0= Containtment otherlv_1= Colon ( (lv_containtment_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:2149:2: (otherlv_0= Containtment otherlv_1= Colon ( (lv_containtment_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:2149:2: (otherlv_0= Containtment otherlv_1= Colon ( (lv_containtment_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:2150:3: otherlv_0= Containtment otherlv_1= Colon ( (lv_containtment_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Containtment,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getContaintmentKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:2158:3: ( (lv_containtment_2_0= ruleEString ) )
            // InternalOntologicalParser.g:2159:4: (lv_containtment_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:2159:4: (lv_containtment_2_0= ruleEString )
            // InternalOntologicalParser.g:2160:5: lv_containtment_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getContaintmentEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_containtment_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentRule());
            					}
            					set(
            						current,
            						"containtment",
            						lv_containtment_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsContaintment"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsMin"
    // InternalOntologicalParser.g:2181:1: entryRuleOntologicalRootClassesItemsReferencesItemsMin returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsReferencesItemsMin= ruleOntologicalRootClassesItemsReferencesItemsMin EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsReferencesItemsMin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsReferencesItemsMin = null;


        try {
            // InternalOntologicalParser.g:2181:86: (iv_ruleOntologicalRootClassesItemsReferencesItemsMin= ruleOntologicalRootClassesItemsReferencesItemsMin EOF )
            // InternalOntologicalParser.g:2182:2: iv_ruleOntologicalRootClassesItemsReferencesItemsMin= ruleOntologicalRootClassesItemsReferencesItemsMin EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsReferencesItemsMin=ruleOntologicalRootClassesItemsReferencesItemsMin();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsReferencesItemsMin; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsMin"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsMin"
    // InternalOntologicalParser.g:2188:1: ruleOntologicalRootClassesItemsReferencesItemsMin returns [EObject current=null] : (otherlv_0= Min otherlv_1= Colon ( (lv_min_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsReferencesItemsMin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_min_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:2194:2: ( (otherlv_0= Min otherlv_1= Colon ( (lv_min_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:2195:2: (otherlv_0= Min otherlv_1= Colon ( (lv_min_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:2195:2: (otherlv_0= Min otherlv_1= Colon ( (lv_min_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:2196:3: otherlv_0= Min otherlv_1= Colon ( (lv_min_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Min,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getMinKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:2204:3: ( (lv_min_2_0= ruleEString ) )
            // InternalOntologicalParser.g:2205:4: (lv_min_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:2205:4: (lv_min_2_0= ruleEString )
            // InternalOntologicalParser.g:2206:5: lv_min_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getMinEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_min_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinRule());
            					}
            					set(
            						current,
            						"min",
            						lv_min_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsMin"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsMax"
    // InternalOntologicalParser.g:2227:1: entryRuleOntologicalRootClassesItemsReferencesItemsMax returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsReferencesItemsMax= ruleOntologicalRootClassesItemsReferencesItemsMax EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsReferencesItemsMax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsReferencesItemsMax = null;


        try {
            // InternalOntologicalParser.g:2227:86: (iv_ruleOntologicalRootClassesItemsReferencesItemsMax= ruleOntologicalRootClassesItemsReferencesItemsMax EOF )
            // InternalOntologicalParser.g:2228:2: iv_ruleOntologicalRootClassesItemsReferencesItemsMax= ruleOntologicalRootClassesItemsReferencesItemsMax EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsReferencesItemsMax=ruleOntologicalRootClassesItemsReferencesItemsMax();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsReferencesItemsMax; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsMax"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsMax"
    // InternalOntologicalParser.g:2234:1: ruleOntologicalRootClassesItemsReferencesItemsMax returns [EObject current=null] : (otherlv_0= Max otherlv_1= Colon ( (lv_max_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsReferencesItemsMax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_max_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:2240:2: ( (otherlv_0= Max otherlv_1= Colon ( (lv_max_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:2241:2: (otherlv_0= Max otherlv_1= Colon ( (lv_max_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:2241:2: (otherlv_0= Max otherlv_1= Colon ( (lv_max_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:2242:3: otherlv_0= Max otherlv_1= Colon ( (lv_max_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Max,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getMaxKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:2250:3: ( (lv_max_2_0= ruleEString ) )
            // InternalOntologicalParser.g:2251:4: (lv_max_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:2251:4: (lv_max_2_0= ruleEString )
            // InternalOntologicalParser.g:2252:5: lv_max_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getMaxEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_max_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsMax"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsTarget"
    // InternalOntologicalParser.g:2273:1: entryRuleOntologicalRootClassesItemsReferencesItemsTarget returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsReferencesItemsTarget= ruleOntologicalRootClassesItemsReferencesItemsTarget EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsReferencesItemsTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsReferencesItemsTarget = null;


        try {
            // InternalOntologicalParser.g:2273:89: (iv_ruleOntologicalRootClassesItemsReferencesItemsTarget= ruleOntologicalRootClassesItemsReferencesItemsTarget EOF )
            // InternalOntologicalParser.g:2274:2: iv_ruleOntologicalRootClassesItemsReferencesItemsTarget= ruleOntologicalRootClassesItemsReferencesItemsTarget EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsReferencesItemsTarget=ruleOntologicalRootClassesItemsReferencesItemsTarget();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsReferencesItemsTarget; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsTarget"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsTarget"
    // InternalOntologicalParser.g:2280:1: ruleOntologicalRootClassesItemsReferencesItemsTarget returns [EObject current=null] : (otherlv_0= Target otherlv_1= Colon ( (lv_target_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsReferencesItemsTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:2286:2: ( (otherlv_0= Target otherlv_1= Colon ( (lv_target_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:2287:2: (otherlv_0= Target otherlv_1= Colon ( (lv_target_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:2287:2: (otherlv_0= Target otherlv_1= Colon ( (lv_target_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:2288:3: otherlv_0= Target otherlv_1= Colon ( (lv_target_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Target,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getTargetKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:2296:3: ( (lv_target_2_0= ruleEString ) )
            // InternalOntologicalParser.g:2297:4: (lv_target_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:2297:4: (lv_target_2_0= ruleEString )
            // InternalOntologicalParser.g:2298:5: lv_target_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getTargetEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsTarget"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsOpposite"
    // InternalOntologicalParser.g:2319:1: entryRuleOntologicalRootClassesItemsReferencesItemsOpposite returns [EObject current=null] : iv_ruleOntologicalRootClassesItemsReferencesItemsOpposite= ruleOntologicalRootClassesItemsReferencesItemsOpposite EOF ;
    public final EObject entryRuleOntologicalRootClassesItemsReferencesItemsOpposite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologicalRootClassesItemsReferencesItemsOpposite = null;


        try {
            // InternalOntologicalParser.g:2319:91: (iv_ruleOntologicalRootClassesItemsReferencesItemsOpposite= ruleOntologicalRootClassesItemsReferencesItemsOpposite EOF )
            // InternalOntologicalParser.g:2320:2: iv_ruleOntologicalRootClassesItemsReferencesItemsOpposite= ruleOntologicalRootClassesItemsReferencesItemsOpposite EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologicalRootClassesItemsReferencesItemsOpposite=ruleOntologicalRootClassesItemsReferencesItemsOpposite();

            state._fsp--;

             current =iv_ruleOntologicalRootClassesItemsReferencesItemsOpposite; 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsOpposite"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsOpposite"
    // InternalOntologicalParser.g:2326:1: ruleOntologicalRootClassesItemsReferencesItemsOpposite returns [EObject current=null] : (otherlv_0= Opposite otherlv_1= Colon ( (lv_opposite_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntologicalRootClassesItemsReferencesItemsOpposite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_opposite_2_0 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:2332:2: ( (otherlv_0= Opposite otherlv_1= Colon ( (lv_opposite_2_0= ruleEString ) ) ) )
            // InternalOntologicalParser.g:2333:2: (otherlv_0= Opposite otherlv_1= Colon ( (lv_opposite_2_0= ruleEString ) ) )
            {
            // InternalOntologicalParser.g:2333:2: (otherlv_0= Opposite otherlv_1= Colon ( (lv_opposite_2_0= ruleEString ) ) )
            // InternalOntologicalParser.g:2334:3: otherlv_0= Opposite otherlv_1= Colon ( (lv_opposite_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Opposite,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getOppositeKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getColonKeyword_1());
            		
            // InternalOntologicalParser.g:2342:3: ( (lv_opposite_2_0= ruleEString ) )
            // InternalOntologicalParser.g:2343:4: (lv_opposite_2_0= ruleEString )
            {
            // InternalOntologicalParser.g:2343:4: (lv_opposite_2_0= ruleEString )
            // InternalOntologicalParser.g:2344:5: lv_opposite_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getOppositeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_opposite_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeRule());
            					}
            					set(
            						current,
            						"opposite",
            						lv_opposite_2_0,
            						"ontological.ontological.Ontological.EString");
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
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsOpposite"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalOntologicalParser.g:2365:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalOntologicalParser.g:2365:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalOntologicalParser.g:2366:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalOntologicalParser.g:2372:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalOntologicalParser.g:2378:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalOntologicalParser.g:2379:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalOntologicalParser.g:2379:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=Containtment && LA20_0<=Min)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntologicalParser.g:2380:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:2388:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalOntologicalParser.g:2402:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalOntologicalParser.g:2402:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalOntologicalParser.g:2403:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalOntologicalParser.g:2409:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Gameloop | kw= IsParam | kw= References | kw= Max | kw= Containtment | kw= Classes | kw= AutoID | kw= IsKey | kw= ReadOnly | kw= Opposite | kw= Abstract | kw= Firebase | kw= Type | kw= URI | kw= Target | kw= External | kw= Default | kw= Min | kw= Bluetooth | kw= OnlyCodes | kw= Physics | kw= Name | kw= Attributes | kw= NoSCN ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOntologicalParser.g:2415:2: ( (kw= Gameloop | kw= IsParam | kw= References | kw= Max | kw= Containtment | kw= Classes | kw= AutoID | kw= IsKey | kw= ReadOnly | kw= Opposite | kw= Abstract | kw= Firebase | kw= Type | kw= URI | kw= Target | kw= External | kw= Default | kw= Min | kw= Bluetooth | kw= OnlyCodes | kw= Physics | kw= Name | kw= Attributes | kw= NoSCN ) )
            // InternalOntologicalParser.g:2416:2: (kw= Gameloop | kw= IsParam | kw= References | kw= Max | kw= Containtment | kw= Classes | kw= AutoID | kw= IsKey | kw= ReadOnly | kw= Opposite | kw= Abstract | kw= Firebase | kw= Type | kw= URI | kw= Target | kw= External | kw= Default | kw= Min | kw= Bluetooth | kw= OnlyCodes | kw= Physics | kw= Name | kw= Attributes | kw= NoSCN )
            {
            // InternalOntologicalParser.g:2416:2: (kw= Gameloop | kw= IsParam | kw= References | kw= Max | kw= Containtment | kw= Classes | kw= AutoID | kw= IsKey | kw= ReadOnly | kw= Opposite | kw= Abstract | kw= Firebase | kw= Type | kw= URI | kw= Target | kw= External | kw= Default | kw= Min | kw= Bluetooth | kw= OnlyCodes | kw= Physics | kw= Name | kw= Attributes | kw= NoSCN )
            int alt21=24;
            switch ( input.LA(1) ) {
            case Gameloop:
                {
                alt21=1;
                }
                break;
            case IsParam:
                {
                alt21=2;
                }
                break;
            case References:
                {
                alt21=3;
                }
                break;
            case Max:
                {
                alt21=4;
                }
                break;
            case Containtment:
                {
                alt21=5;
                }
                break;
            case Classes:
                {
                alt21=6;
                }
                break;
            case AutoID:
                {
                alt21=7;
                }
                break;
            case IsKey:
                {
                alt21=8;
                }
                break;
            case ReadOnly:
                {
                alt21=9;
                }
                break;
            case Opposite:
                {
                alt21=10;
                }
                break;
            case Abstract:
                {
                alt21=11;
                }
                break;
            case Firebase:
                {
                alt21=12;
                }
                break;
            case Type:
                {
                alt21=13;
                }
                break;
            case URI:
                {
                alt21=14;
                }
                break;
            case Target:
                {
                alt21=15;
                }
                break;
            case External:
                {
                alt21=16;
                }
                break;
            case Default:
                {
                alt21=17;
                }
                break;
            case Min:
                {
                alt21=18;
                }
                break;
            case Bluetooth:
                {
                alt21=19;
                }
                break;
            case OnlyCodes:
                {
                alt21=20;
                }
                break;
            case Physics:
                {
                alt21=21;
                }
                break;
            case Name:
                {
                alt21=22;
                }
                break;
            case Attributes:
                {
                alt21=23;
                }
                break;
            case NoSCN:
                {
                alt21=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalOntologicalParser.g:2417:3: kw= Gameloop
                    {
                    kw=(Token)match(input,Gameloop,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGameloopKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:2423:3: kw= IsParam
                    {
                    kw=(Token)match(input,IsParam,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIsParamKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalParser.g:2429:3: kw= References
                    {
                    kw=(Token)match(input,References,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getReferencesKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOntologicalParser.g:2435:3: kw= Max
                    {
                    kw=(Token)match(input,Max,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOntologicalParser.g:2441:3: kw= Containtment
                    {
                    kw=(Token)match(input,Containtment,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getContaintmentKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOntologicalParser.g:2447:3: kw= Classes
                    {
                    kw=(Token)match(input,Classes,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getClassesKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalOntologicalParser.g:2453:3: kw= AutoID
                    {
                    kw=(Token)match(input,AutoID,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAutoIDKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalOntologicalParser.g:2459:3: kw= IsKey
                    {
                    kw=(Token)match(input,IsKey,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIsKeyKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalOntologicalParser.g:2465:3: kw= ReadOnly
                    {
                    kw=(Token)match(input,ReadOnly,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getReadOnlyKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalOntologicalParser.g:2471:3: kw= Opposite
                    {
                    kw=(Token)match(input,Opposite,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOppositeKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalOntologicalParser.g:2477:3: kw= Abstract
                    {
                    kw=(Token)match(input,Abstract,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAbstractKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalOntologicalParser.g:2483:3: kw= Firebase
                    {
                    kw=(Token)match(input,Firebase,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFirebaseKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalOntologicalParser.g:2489:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalOntologicalParser.g:2495:3: kw= URI
                    {
                    kw=(Token)match(input,URI,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getURIKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalOntologicalParser.g:2501:3: kw= Target
                    {
                    kw=(Token)match(input,Target,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTargetKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalOntologicalParser.g:2507:3: kw= External
                    {
                    kw=(Token)match(input,External,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExternalKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalOntologicalParser.g:2513:3: kw= Default
                    {
                    kw=(Token)match(input,Default,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDefaultKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalOntologicalParser.g:2519:3: kw= Min
                    {
                    kw=(Token)match(input,Min,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalOntologicalParser.g:2525:3: kw= Bluetooth
                    {
                    kw=(Token)match(input,Bluetooth,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBluetoothKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalOntologicalParser.g:2531:3: kw= OnlyCodes
                    {
                    kw=(Token)match(input,OnlyCodes,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOnlyCodesKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalOntologicalParser.g:2537:3: kw= Physics
                    {
                    kw=(Token)match(input,Physics,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPhysicsKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalOntologicalParser.g:2543:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalOntologicalParser.g:2549:3: kw= Attributes
                    {
                    kw=(Token)match(input,Attributes,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAttributesKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalOntologicalParser.g:2555:3: kw= NoSCN
                    {
                    kw=(Token)match(input,NoSCN,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNoSCNKeyword_23());
                    		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000802849D80L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002849D80L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000200FFFFFF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800C803E0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C803E0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000080DA34000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000DA34000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000080C902010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C902010L});

}
